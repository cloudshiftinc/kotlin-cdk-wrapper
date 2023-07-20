@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.servicecatalog

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.servicecatalog.CfnResourceUpdateConstraint
import software.constructs.Construct

@CdkDslMarker
public class CfnResourceUpdateConstraintDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: CfnResourceUpdateConstraint.Builder =
      CfnResourceUpdateConstraint.Builder.create(scope, id)

  public fun acceptLanguage(acceptLanguage: String) {
    cdkBuilder.acceptLanguage(acceptLanguage)
  }

  public fun description(description: String) {
    cdkBuilder.description(description)
  }

  public fun portfolioId(portfolioId: String) {
    cdkBuilder.portfolioId(portfolioId)
  }

  public fun productId(productId: String) {
    cdkBuilder.productId(productId)
  }

  public fun tagUpdateOnProvisionedProduct(tagUpdateOnProvisionedProduct: String) {
    cdkBuilder.tagUpdateOnProvisionedProduct(tagUpdateOnProvisionedProduct)
  }

  public fun build(): CfnResourceUpdateConstraint = cdkBuilder.build()
}
