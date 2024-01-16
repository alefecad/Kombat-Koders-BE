package com.petsupermarket.app.entity.compositeKey;

import java.io.Serializable;

import com.petsupermarket.app.entity.compositeKey.BolsaHasProductosKey;
import org.springframework.stereotype.*;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.*;


@Component
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@EqualsAndHashCode
@Embeddable
public class BolsaHasProductosKey implements Serializable {
	

	private static final long serialVersionUID = 1L;
	
	@Column( name = "bolsa_id" )
	Long orderId;
	@Column( name = "producto_id" )
	Long productId;
}