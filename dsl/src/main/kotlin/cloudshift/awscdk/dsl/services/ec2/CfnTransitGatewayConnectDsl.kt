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
import software.constructs.Construct

@CdkDslMarker
public class CfnTransitGatewayConnectDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: CfnTransitGatewayConnect.Builder =
      CfnTransitGatewayConnect.Builder.create(scope, id)

  private val _tags: MutableList<CfnTag> = mutableListOf()

  /**
   * The Connect attachment options.
   *
   * * protocol (gre)
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-transitgatewayconnect.html#cfn-ec2-transitgatewayconnect-options)
   * @param options The Connect attachment options. 
   */
  public fun options(options: IResolvable) {
    cdkBuilder.options(options)
  }

  /**
   * The Connect attachment options.
   *
   * * protocol (gre)
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-transitgatewayconnect.html#cfn-ec2-transitgatewayconnect-options)
   * @param options The Connect attachment options. 
   */
  public fun options(options: CfnTransitGatewayConnect.TransitGatewayConnectOptionsProperty) {
    cdkBuilder.options(options)
  }

  /**
   * The tags for the attachment.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-transitgatewayconnect.html#cfn-ec2-transitgatewayconnect-tags)
   * @param tags The tags for the attachment. 
   */
  public fun tags(tags: CfnTagDsl.() -> Unit) {
    _tags.add(CfnTagDsl().apply(tags).build())
  }

  /**
   * The tags for the attachment.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-transitgatewayconnect.html#cfn-ec2-transitgatewayconnect-tags)
   * @param tags The tags for the attachment. 
   */
  public fun tags(tags: Collection<CfnTag>) {
    _tags.addAll(tags)
  }

  /**
   * The ID of the attachment from which the Connect attachment was created.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-transitgatewayconnect.html#cfn-ec2-transitgatewayconnect-transporttransitgatewayattachmentid)
   * @param transportTransitGatewayAttachmentId The ID of the attachment from which the Connect
   * attachment was created. 
   */
  public fun transportTransitGatewayAttachmentId(transportTransitGatewayAttachmentId: String) {
    cdkBuilder.transportTransitGatewayAttachmentId(transportTransitGatewayAttachmentId)
  }

  public fun build(): CfnTransitGatewayConnect {
    if(_tags.isNotEmpty()) cdkBuilder.tags(_tags)
    return cdkBuilder.build()
  }
}
