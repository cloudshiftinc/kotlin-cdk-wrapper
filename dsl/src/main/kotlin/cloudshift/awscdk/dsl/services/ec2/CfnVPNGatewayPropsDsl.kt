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
import software.amazon.awscdk.services.ec2.CfnVPNGatewayProps

/**
 * Properties for defining a `CfnVPNGateway`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.ec2.*;
 * CfnVPNGatewayProps cfnVPNGatewayProps = CfnVPNGatewayProps.builder()
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
public class CfnVPNGatewayPropsDsl {
  private val cdkBuilder: CfnVPNGatewayProps.Builder = CfnVPNGatewayProps.builder()

  private val _tags: MutableList<CfnTag> = mutableListOf()

  /**
   * @param amazonSideAsn The private Autonomous System Number (ASN) for the Amazon side of a BGP
   * session.
   */
  public fun amazonSideAsn(amazonSideAsn: Number) {
    cdkBuilder.amazonSideAsn(amazonSideAsn)
  }

  /**
   * @param tags Any tags assigned to the virtual private gateway.
   */
  public fun tags(tags: CfnTagDsl.() -> Unit) {
    _tags.add(CfnTagDsl().apply(tags).build())
  }

  /**
   * @param tags Any tags assigned to the virtual private gateway.
   */
  public fun tags(tags: Collection<CfnTag>) {
    _tags.addAll(tags)
  }

  /**
   * @param type The type of VPN connection the virtual private gateway supports. 
   */
  public fun type(type: String) {
    cdkBuilder.type(type)
  }

  public fun build(): CfnVPNGatewayProps {
    if(_tags.isNotEmpty()) cdkBuilder.tags(_tags)
    return cdkBuilder.build()
  }
}
