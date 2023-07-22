@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.customerprofiles

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import software.amazon.awscdk.services.customerprofiles.CfnCalculatedAttributeDefinition

@CdkDslMarker
public class CfnCalculatedAttributeDefinitionRangePropertyDsl {
  private val cdkBuilder: CfnCalculatedAttributeDefinition.RangeProperty.Builder =
      CfnCalculatedAttributeDefinition.RangeProperty.builder()

  /**
   * @param unit The unit of time. 
   */
  public fun unit(unit: String) {
    cdkBuilder.unit(unit)
  }

  /**
   * @param value The amount of time of the specified unit. 
   */
  public fun `value`(`value`: Number) {
    cdkBuilder.`value`(`value`)
  }

  public fun build(): CfnCalculatedAttributeDefinition.RangeProperty = cdkBuilder.build()
}
