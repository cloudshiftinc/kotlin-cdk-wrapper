@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.customerprofiles

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.customerprofiles.CfnCalculatedAttributeDefinition

@CdkDslMarker
public class CfnCalculatedAttributeDefinitionThresholdPropertyDsl {
  private val cdkBuilder: CfnCalculatedAttributeDefinition.ThresholdProperty.Builder =
      CfnCalculatedAttributeDefinition.ThresholdProperty.builder()

  /**
   * @param operator The operator of the threshold. 
   */
  public fun `operator`(`operator`: String) {
    cdkBuilder.`operator`(`operator`)
  }

  /**
   * @param value The value of the threshold. 
   */
  public fun `value`(`value`: String) {
    cdkBuilder.`value`(`value`)
  }

  public fun build(): CfnCalculatedAttributeDefinition.ThresholdProperty = cdkBuilder.build()
}
