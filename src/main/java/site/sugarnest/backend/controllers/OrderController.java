package site.sugarnest.backend.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;
import site.sugarnest.backend.dto.dto.OrderStatus;
import site.sugarnest.backend.dto.request.OrderRequest;
import site.sugarnest.backend.dto.response.ApiResponse;
import site.sugarnest.backend.dto.response.OrderResponse;
import site.sugarnest.backend.service.order.IOrderService;

import java.util.List;
import java.util.Map;

@CrossOrigin("*")
@RestController
@RequestMapping("/orders")
public class OrderController {

    @Autowired
    private IOrderService iorderService;

    @PostMapping
    public ApiResponse<OrderResponse> createOrder(@RequestBody OrderRequest orderRequest) {
        System.out.println("cc");
        OrderResponse orderResponse = iorderService.saveOrder(orderRequest);
        return ApiResponse.<OrderResponse>builder()
                .code(200)
                .result(orderResponse)
                .build();
    }

    @GetMapping("my-orders")
    public ApiResponse<List<OrderResponse>> getMyOrders() {
        List<OrderResponse> orderResponseList = iorderService.getOrders();
        return ApiResponse.<List<OrderResponse>>builder()
                .code(200)
                .result(orderResponseList)
                .build();
    }
    @GetMapping("point")
    public ApiResponse<Double> getPoint() {
       Double point = iorderService.getPoint();
        return ApiResponse.<Double>builder()
                .code(200)
                .result(point)
                .build();
    }
    @GetMapping("set-point")
    public ApiResponse<Double> setPoint() {
       iorderService.setPoint();
        return ApiResponse.<Double>builder()
                .code(200)
                .build();
    }

    @GetMapping("admin-orders")
    @PreAuthorize("hasAuthority('ORDERS_GET')")
    public ApiResponse<List<OrderResponse>> getAdminOrders() {
        List<OrderResponse> orderResponseList = iorderService.getOrdersByAdmin();
        return ApiResponse.<List<OrderResponse>>builder()
                .code(200)
                .result(orderResponseList)
                .build();
    }

    @GetMapping("/{orderId}")
    @PreAuthorize("hasAuthority('ORDERS_GET')")
    public ApiResponse<OrderResponse> getOrderById(@PathVariable Integer orderId) {
        OrderResponse orderResponse = iorderService.getOrderById(orderId);
        return ApiResponse.<OrderResponse>builder()
                .code(200)
                .result(orderResponse)
                .build();
    }

    @PutMapping("/update-status/{orderId}")
    @PreAuthorize("hasAuthority('ORDERS_PUT')")
    public ApiResponse<String> updateOrderStatus(@PathVariable Integer orderId, @RequestBody OrderStatus orderStatus) {
        iorderService.updateOrderStatus(orderId, orderStatus.getStatus());
        return ApiResponse.<String>builder()
                .code(200)
                .message("Success")
                .build();
    }

    @PutMapping("/cancel/{orderId}")
    public ApiResponse<String> cancelOrder(@PathVariable Integer orderId) {
        iorderService.cancelOrder(orderId);
        return ApiResponse.<String>builder()
                .code(200)
                .message("Success")
                .build();
    }


    @GetMapping("total")
    @PreAuthorize("hasAuthority('ORDERS_GET')")
    public ApiResponse<Long> getTotalOrders() {
        Long totalOrders = iorderService.getTotalOrders();
        return ApiResponse.<Long>builder()
                .code(200)
                .result(totalOrders)
                .build();
    }


    @GetMapping("total-amount")
    @PreAuthorize("hasAuthority('ORDERS_GET')")
    public ApiResponse<Double> getTotalAmount() {
        Double totalAmount = iorderService.getTotalAmount();
        return ApiResponse.<Double>builder()
                .code(200)
                .result(totalAmount)
                .build();
    }
    @GetMapping("/revenue")
    @PreAuthorize("hasAuthority('ORDERS_GET')")
    public ApiResponse<Map<String, Double>> getRevenue(@RequestParam("startMonth") int startMonth,
                                                       @RequestParam("startYear") int startYear,
                                                       @RequestParam("endMonth") int endMonth,
                                                       @RequestParam("endYear") int endYear,
                                                       @RequestParam(value = "viewBy", required = false, defaultValue = "month") String viewBy) {
        Map<String, Double> revenueData;
        if ("day".equalsIgnoreCase(viewBy)) {
            revenueData = iorderService.getDailyRevenue(startMonth, startYear, endMonth, endYear);
        } else {
            revenueData = iorderService.getMonthlyRevenue(startMonth, startYear, endMonth, endYear);
        }
        return ApiResponse.<Map<String, Double>>builder()
                .code(200)
                .result(revenueData)
                .build();
    }

    @GetMapping("/revenue-by-category")
    @PreAuthorize("hasAuthority('ORDERS_GET')")
    public ApiResponse<Map<String, Double>> getRevenueByCategoryForMonth(
            @RequestParam("month") int month,
            @RequestParam("year") int year) {
        return ApiResponse.<Map<String, Double>>builder()
                .code(200)
                .result(iorderService.getRevenueByCategoryForMonth(month, year))
                .build();
    }
}
