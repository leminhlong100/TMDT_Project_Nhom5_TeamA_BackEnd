package site.sugarnest.backend.service.order;

import site.sugarnest.backend.dto.request.OrderRequest;
import site.sugarnest.backend.dto.response.OrderResponse;

import java.util.List;
import java.util.Map;

public interface IOrderService {
    public Double getPoint();
    public void setPoint();
    OrderResponse saveOrder(OrderRequest orderRequest);
    List<OrderResponse> getOrders();
    List<OrderResponse> getOrdersByAdmin();
    OrderResponse getOrderById(Integer orderId);
    void updateOrderStatus(Integer orderId, String status);
    void cancelOrder(Integer orderId);
    Long getTotalOrders();
    Double getTotalAmount();
    Map<String, Double> getMonthlyRevenue(int startMonth, int startYear, int endMonth, int endYear);
    Map<String, Double> getRevenueByCategoryForMonth(int month, int year);
}
