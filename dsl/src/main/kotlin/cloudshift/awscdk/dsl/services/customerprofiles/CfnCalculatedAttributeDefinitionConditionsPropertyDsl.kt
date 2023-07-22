@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.customerprofiles

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.customerprofiles.CfnCalculatedAttributeDefinition

@CdkDslMarker
public class CfnCalculatedAttributeDefinitionConditionsPropertyDsl {
  private val cdkBuilder: CfnCalculatedAttributeDefinition.ConditionsProperty.Builder =
      CfnCalculatedAttributeDefinition.ConditionsProperty.builder()

  /**
   * @param objectCount The number of profile objects used for the calculated attribute.
   */
  public fun objectCount(objectCount: Number) {
    cdkBuilder.objectCount(objectCount)
  }

  /**
   * @param range The relative time period over which data is included in the aggregation.
   */
  public fun range(range: IResolvable) {
    cdkBuilder.range(range)
  }

  /**
   * @param range The relative time period over which data is included in the aggregation.
   */
  public fun range(range: CfnCalculatedAttributeDefinition.RangeProperty) {
    cdkBuilder.range(range)
  }

  /**
   * @param threshold The threshold for the calculated attribute.
   */
  public fun threshold(threshold: IResolvable) {
    cdkBuilder.threshold(threshold)
  }

  /**
   * @param threshold The threshold for the calculated attribute.
   */
  public fun threshold(threshold: CfnCalculatedAttributeDefinition.ThresholdProperty) {
    cdkBuilder.threshold(threshold)
  }

  public fun build(): CfnCalculatedAttributeDefinition.ConditionsProperty = cdkBuilder.build()
}
