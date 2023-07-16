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

  public fun bgpAsn(bgpAsn: Number) {
    cdkBuilder.bgpAsn(bgpAsn)
  }

  public fun deviceName(deviceName: String) {
    cdkBuilder.deviceName(deviceName)
  }

  public fun ipAddress(ipAddress: String) {
    cdkBuilder.ipAddress(ipAddress)
  }

  public fun tags(tags: CfnTagDsl.() -> Unit) {
    _tags.add(CfnTagDsl().apply(tags).build())
  }

  public fun tags(tags: Collection<CfnTag>) {
    _tags.addAll(tags)
  }

  public fun type(type: String) {
    cdkBuilder.type(type)
  }

  public fun build(): CfnCustomerGatewayProps {
    if(_tags.isNotEmpty()) cdkBuilder.tags(_tags)
    return cdkBuilder.build()
  }
}
