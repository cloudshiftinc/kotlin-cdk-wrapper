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

/**
 * Creates a Connect attachment from a specified transit gateway attachment.
 *
 * A Connect attachment is a GRE-based tunnel attachment that you can use to establish a connection
 * between a transit gateway and an appliance.
 *
 * A Connect attachment uses an existing VPC or AWS Direct Connect attachment as the underlying
 * transport mechanism.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.ec2.*;
 * CfnTransitGatewayConnect cfnTransitGatewayConnect = CfnTransitGatewayConnect.Builder.create(this,
 * "MyCfnTransitGatewayConnect")
 * .options(TransitGatewayConnectOptionsProperty.builder()
 * .protocol("protocol")
 * .build())
 * .transportTransitGatewayAttachmentId("transportTransitGatewayAttachmentId")
 * // the properties below are optional
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-transitgatewayconnect.html)
 */
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
