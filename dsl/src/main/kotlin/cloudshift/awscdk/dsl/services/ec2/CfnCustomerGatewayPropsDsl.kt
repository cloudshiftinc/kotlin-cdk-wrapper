@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.ec2

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.dsl.CfnTagDsl
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.services.ec2.CfnCustomerGatewayProps

@CdkDslMarker
public class CfnCustomerGatewayPropsDsl {
  private val cdkBuilder: CfnCustomerGatewayProps.Builder = CfnCustomerGatewayProps.builder()

  private val _tags: MutableList<CfnTag> = mutableListOf()

  /**
   * @param bgpAsn For devices that support BGP, the customer gateway's BGP ASN. 
   * Default: 65000
   */
  public fun bgpAsn(bgpAsn: Number) {
    cdkBuilder.bgpAsn(bgpAsn)
  }

  /**
   * @param deviceName The name of customer gateway device.
   */
  public fun deviceName(deviceName: String) {
    cdkBuilder.deviceName(deviceName)
  }

  /**
   * @param ipAddress IPv4 address for the customer gateway device's outside interface. 
   * The address must be static.
   */
  public fun ipAddress(ipAddress: String) {
    cdkBuilder.ipAddress(ipAddress)
  }

  /**
   * @param tags One or more tags for the customer gateway.
   */
  public fun tags(tags: CfnTagDsl.() -> Unit) {
    _tags.add(CfnTagDsl().apply(tags).build())
  }

  /**
   * @param tags One or more tags for the customer gateway.
   */
  public fun tags(tags: Collection<CfnTag>) {
    _tags.addAll(tags)
  }

  /**
   * @param type The type of VPN connection that this customer gateway supports ( `ipsec.1` ). 
   */
  public fun type(type: String) {
    cdkBuilder.type(type)
  }

  public fun build(): CfnCustomerGatewayProps {
    if(_tags.isNotEmpty()) cdkBuilder.tags(_tags)
    return cdkBuilder.build()
  }
}
