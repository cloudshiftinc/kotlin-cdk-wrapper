@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.servicecatalog

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.servicecatalog.CfnLaunchTemplateConstraintProps

@CdkDslMarker
public class CfnLaunchTemplateConstraintPropsDsl {
  private val cdkBuilder: CfnLaunchTemplateConstraintProps.Builder =
      CfnLaunchTemplateConstraintProps.builder()

  /**
   * @param acceptLanguage The language code.
   * * `jp` - Japanese
   * * `zh` - Chinese
   */
  public fun acceptLanguage(acceptLanguage: String) {
    cdkBuilder.acceptLanguage(acceptLanguage)
  }

  /**
   * @param description The description of the constraint.
   */
  public fun description(description: String) {
    cdkBuilder.description(description)
  }

  /**
   * @param portfolioId The portfolio identifier. 
   */
  public fun portfolioId(portfolioId: String) {
    cdkBuilder.portfolioId(portfolioId)
  }

  /**
   * @param productId The product identifier. 
   */
  public fun productId(productId: String) {
    cdkBuilder.productId(productId)
  }

  /**
   * @param rules The constraint rules. 
   */
  public fun rules(rules: String) {
    cdkBuilder.rules(rules)
  }

  public fun build(): CfnLaunchTemplateConstraintProps = cdkBuilder.build()
}
