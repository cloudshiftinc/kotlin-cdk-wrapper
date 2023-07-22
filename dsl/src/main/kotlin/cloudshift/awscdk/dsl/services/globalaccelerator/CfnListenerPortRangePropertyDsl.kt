@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.globalaccelerator

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import software.amazon.awscdk.services.globalaccelerator.CfnListener

/**
 * A complex type for a range of ports for a listener.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.globalaccelerator.*;
 * PortRangeProperty portRangeProperty = PortRangeProperty.builder()
 * .fromPort(123)
 * .toPort(123)
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-globalaccelerator-listener-portrange.html)
 */
@CdkDslMarker
public class CfnListenerPortRangePropertyDsl {
  private val cdkBuilder: CfnListener.PortRangeProperty.Builder =
      CfnListener.PortRangeProperty.builder()

  /**
   * @param fromPort The first port in the range of ports, inclusive. 
   */
  public fun fromPort(fromPort: Number) {
    cdkBuilder.fromPort(fromPort)
  }

  /**
   * @param toPort The last port in the range of ports, inclusive. 
   */
  public fun toPort(toPort: Number) {
    cdkBuilder.toPort(toPort)
  }

  public fun build(): CfnListener.PortRangeProperty = cdkBuilder.build()
}
