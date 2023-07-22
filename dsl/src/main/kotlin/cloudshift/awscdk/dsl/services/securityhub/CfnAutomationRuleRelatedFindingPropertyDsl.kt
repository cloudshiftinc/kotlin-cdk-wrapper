@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.securityhub

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.common.MapBuilder
import kotlin.Any
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.securityhub.CfnAutomationRule

@CdkDslMarker
public class CfnAutomationRuleRelatedFindingPropertyDsl {
  private val cdkBuilder: CfnAutomationRule.RelatedFindingProperty.Builder =
      CfnAutomationRule.RelatedFindingProperty.builder()

  /**
   * @param id The product-generated identifier for a related finding. 
   */
  public fun id(id: MapBuilder.() -> Unit = {}) {
    val builder = MapBuilder()
    builder.apply(id)
    cdkBuilder.id(builder.map)
  }

  /**
   * @param id The product-generated identifier for a related finding. 
   */
  public fun id(id: Any) {
    cdkBuilder.id(id)
  }

  /**
   * @param productArn The Amazon Resource Name (ARN) for the product that generated a related
   * finding. 
   */
  public fun productArn(productArn: String) {
    cdkBuilder.productArn(productArn)
  }

  public fun build(): CfnAutomationRule.RelatedFindingProperty = cdkBuilder.build()
}
