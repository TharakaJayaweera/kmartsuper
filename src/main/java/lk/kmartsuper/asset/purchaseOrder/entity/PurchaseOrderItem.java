package lk.kmartsuper.asset.purchaseOrder.entity;

import com.fasterxml.jackson.annotation.JsonFilter;
import lk.kmartsuper.asset.item.entity.Item;
import lk.kmartsuper.util.audit.AuditEntity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import java.math.BigDecimal;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@JsonFilter("PurchaseOrderItem")
public class PurchaseOrderItem extends AuditEntity {
    @Column(nullable = false)
    private String quantity;

    private String receivedQuantity;

    @Column(unique = true, nullable = false)
    private String code;

    @Column(precision = 10, scale = 2)
    private BigDecimal price;

    @ManyToOne
    private PurchaseOrder purchaseOrder;

    @ManyToOne
    private Item item;

}
