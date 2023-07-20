@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.servicecatalog

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.servicecatalog.CfnLaunchTemplateConstraintProps

@CdkDslMarker
public class CfnLaunchTemplateConstraintPropsDsl {
  private val cdkBuilder: CfnLaunchTemplateConstraintProps.Builder =
      CfnLaunchTemplateConstraintProps.builder()

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

  public fun rules(rules: String) {
    cdkBuilder.rules(rules)
  }

  public fun build(): CfnLaunchTemplateConstraintProps = cdkBuilder.build()
}
