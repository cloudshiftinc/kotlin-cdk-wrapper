@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.ec2

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.dsl.CfnTagDsl
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.ec2.CfnTransitGatewayConnect
import software.amazon.awscdk.services.ec2.CfnTransitGatewayConnectProps

@CdkDslMarker
public class CfnTransitGatewayConnectPropsDsl {
  private val cdkBuilder: CfnTransitGatewayConnectProps.Builder =
      CfnTransitGatewayConnectProps.builder()

  private val _tags: MutableList<CfnTag> = mutableListOf()

  public fun options(options: IResolvable) {
    cdkBuilder.options(options)
  }

  public fun options(options: CfnTransitGatewayConnect.TransitGatewayConnectOptionsProperty) {
    cdkBuilder.options(options)
  }

  public fun tags(tags: CfnTagDsl.() -> Unit) {
    _tags.add(CfnTagDsl().apply(tags).build())
  }

  public fun tags(tags: Collection<CfnTag>) {
    _tags.addAll(tags)
  }

  public fun transportTransitGatewayAttachmentId(transportTransitGatewayAttachmentId: String) {
    cdkBuilder.transportTransitGatewayAttachmentId(transportTransitGatewayAttachmentId)
  }

  public fun build(): CfnTransitGatewayConnectProps {
    if(_tags.isNotEmpty()) cdkBuilder.tags(_tags)
    return cdkBuilder.build()
  }
}
