@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.cloudwatch

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.cloudwatch.CfnAlarm

@CdkDslMarker
public class CfnAlarmDimensionPropertyDsl {
  private val cdkBuilder: CfnAlarm.DimensionProperty.Builder = CfnAlarm.DimensionProperty.builder()

  /**
   * @param name The name of the dimension, from 1–255 characters in length. 
   * This dimension name must have been included when the metric was published.
   */
  public fun name(name: String) {
    cdkBuilder.name(name)
  }

  /**
   * @param value The value for the dimension, from 1–255 characters in length. 
   */
  public fun `value`(`value`: String) {
    cdkBuilder.`value`(`value`)
  }

  public fun build(): CfnAlarm.DimensionProperty = cdkBuilder.build()
}
