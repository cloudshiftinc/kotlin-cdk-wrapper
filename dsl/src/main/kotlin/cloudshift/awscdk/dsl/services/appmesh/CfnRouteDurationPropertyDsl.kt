@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.appmesh

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import software.amazon.awscdk.services.appmesh.CfnRoute

/**
 * An object that represents a duration of time.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.appmesh.*;
 * DurationProperty durationProperty = DurationProperty.builder()
 * .unit("unit")
 * .value(123)
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-route-duration.html)
 */
@CdkDslMarker
public class CfnRouteDurationPropertyDsl {
  private val cdkBuilder: CfnRoute.DurationProperty.Builder = CfnRoute.DurationProperty.builder()

  /**
   * @param unit A unit of time. 
   */
  public fun unit(unit: String) {
    cdkBuilder.unit(unit)
  }

  /**
   * @param value A number of time units. 
   */
  public fun `value`(`value`: Number) {
    cdkBuilder.`value`(`value`)
  }

  public fun build(): CfnRoute.DurationProperty = cdkBuilder.build()
}
