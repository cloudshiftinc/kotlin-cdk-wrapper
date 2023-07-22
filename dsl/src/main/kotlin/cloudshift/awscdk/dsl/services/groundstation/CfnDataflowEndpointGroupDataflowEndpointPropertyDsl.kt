@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.groundstation

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.groundstation.CfnDataflowEndpointGroup

/**
 * Contains information such as socket address and name that defines an endpoint.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.groundstation.*;
 * DataflowEndpointProperty dataflowEndpointProperty = DataflowEndpointProperty.builder()
 * .address(SocketAddressProperty.builder()
 * .name("name")
 * .port(123)
 * .build())
 * .mtu(123)
 * .name("name")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-groundstation-dataflowendpointgroup-dataflowendpoint.html)
 */
@CdkDslMarker
public class CfnDataflowEndpointGroupDataflowEndpointPropertyDsl {
  private val cdkBuilder: CfnDataflowEndpointGroup.DataflowEndpointProperty.Builder =
      CfnDataflowEndpointGroup.DataflowEndpointProperty.builder()

  /**
   * @param address The address and port of an endpoint.
   */
  public fun address(address: IResolvable) {
    cdkBuilder.address(address)
  }

  /**
   * @param address The address and port of an endpoint.
   */
  public fun address(address: CfnDataflowEndpointGroup.SocketAddressProperty) {
    cdkBuilder.address(address)
  }

  /**
   * @param mtu Maximum transmission unit (MTU) size in bytes of a dataflow endpoint.
   * Valid values are between 1400 and 1500. A default value of 1500 is used if not set.
   */
  public fun mtu(mtu: Number) {
    cdkBuilder.mtu(mtu)
  }

  /**
   * @param name The endpoint name.
   * When listing available contacts for a satellite, Ground Station searches for a dataflow
   * endpoint whose name matches the value specified by the dataflow endpoint config of the selected
   * mission profile. If no matching dataflow endpoints are found then Ground Station will not display
   * any available contacts for the satellite.
   */
  public fun name(name: String) {
    cdkBuilder.name(name)
  }

  public fun build(): CfnDataflowEndpointGroup.DataflowEndpointProperty = cdkBuilder.build()
}
