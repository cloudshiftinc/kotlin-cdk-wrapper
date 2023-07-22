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
import software.amazon.awscdk.services.ec2.CfnVPNGateway
import software.constructs.Construct

/**
 * Specifies a virtual private gateway.
 *
 * A virtual private gateway is the endpoint on the VPC side of your VPN connection. You can create
 * a virtual private gateway before creating the VPC itself.
 *
 * For more information, see [AWS Site-to-Site
 * VPN](https://docs.aws.amazon.com/vpn/latest/s2svpn/VPC_VPN.html) in the *AWS Site-to-Site VPN User
 * Guide* .
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.ec2.*;
 * CfnVPNGateway cfnVPNGateway = CfnVPNGateway.Builder.create(this, "MyCfnVPNGateway")
 * .type("type")
 * // the properties below are optional
 * .amazonSideAsn(123)
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpngateway.html)
 */
@CdkDslMarker
public class CfnVPNGatewayDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: CfnVPNGateway.Builder = CfnVPNGateway.Builder.create(scope, id)

  private val _tags: MutableList<CfnTag> = mutableListOf()

  /**
   * The private Autonomous System Number (ASN) for the Amazon side of a BGP session.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpngateway.html#cfn-ec2-vpngateway-amazonsideasn)
   * @param amazonSideAsn The private Autonomous System Number (ASN) for the Amazon side of a BGP
   * session. 
   */
  public fun amazonSideAsn(amazonSideAsn: Number) {
    cdkBuilder.amazonSideAsn(amazonSideAsn)
  }

  /**
   * Any tags assigned to the virtual private gateway.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpngateway.html#cfn-ec2-vpngateway-tags)
   * @param tags Any tags assigned to the virtual private gateway. 
   */
  public fun tags(tags: CfnTagDsl.() -> Unit) {
    _tags.add(CfnTagDsl().apply(tags).build())
  }

  /**
   * Any tags assigned to the virtual private gateway.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpngateway.html#cfn-ec2-vpngateway-tags)
   * @param tags Any tags assigned to the virtual private gateway. 
   */
  public fun tags(tags: Collection<CfnTag>) {
    _tags.addAll(tags)
  }

  /**
   * The type of VPN connection the virtual private gateway supports.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpngateway.html#cfn-ec2-vpngateway-type)
   * @param type The type of VPN connection the virtual private gateway supports. 
   */
  public fun type(type: String) {
    cdkBuilder.type(type)
  }

  public fun build(): CfnVPNGateway {
    if(_tags.isNotEmpty()) cdkBuilder.tags(_tags)
    return cdkBuilder.build()
  }
}
