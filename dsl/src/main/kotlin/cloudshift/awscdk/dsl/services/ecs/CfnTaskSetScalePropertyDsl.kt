@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.ecs

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import software.amazon.awscdk.services.ecs.CfnTaskSet

/**
 * A floating-point percentage of the desired number of tasks to place and keep running in the task
 * set.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.ecs.*;
 * ScaleProperty scaleProperty = ScaleProperty.builder()
 * .unit("unit")
 * .value(123)
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskset-scale.html)
 */
@CdkDslMarker
public class CfnTaskSetScalePropertyDsl {
  private val cdkBuilder: CfnTaskSet.ScaleProperty.Builder = CfnTaskSet.ScaleProperty.builder()

  /**
   * @param unit The unit of measure for the scale value.
   */
  public fun unit(unit: String) {
    cdkBuilder.unit(unit)
  }

  /**
   * @param value The value, specified as a percent total of a service's `desiredCount` , to scale
   * the task set.
   * Accepted values are numbers between 0 and 100.
   */
  public fun `value`(`value`: Number) {
    cdkBuilder.`value`(`value`)
  }

  public fun build(): CfnTaskSet.ScaleProperty = cdkBuilder.build()
}
