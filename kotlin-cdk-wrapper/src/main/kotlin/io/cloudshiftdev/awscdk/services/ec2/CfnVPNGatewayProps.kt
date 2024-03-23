@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ec2

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

/**
 * Properties for defining a `CfnVPNGateway`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.ec2.*;
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
public interface CfnVPNGatewayProps {
  /**
   * The private Autonomous System Number (ASN) for the Amazon side of a BGP session.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpngateway.html#cfn-ec2-vpngateway-amazonsideasn)
   */
  public fun amazonSideAsn(): Number? = unwrap(this).getAmazonSideAsn()

  /**
   * Any tags assigned to the virtual private gateway.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpngateway.html#cfn-ec2-vpngateway-tags)
   */
  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * The type of VPN connection the virtual private gateway supports.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpngateway.html#cfn-ec2-vpngateway-type)
   */
  public fun type(): String

  /**
   * A builder for [CfnVPNGatewayProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param amazonSideAsn The private Autonomous System Number (ASN) for the Amazon side of a BGP
     * session.
     */
    public fun amazonSideAsn(amazonSideAsn: Number)

    /**
     * @param tags Any tags assigned to the virtual private gateway.
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * @param tags Any tags assigned to the virtual private gateway.
     */
    public fun tags(vararg tags: CfnTag)

    /**
     * @param type The type of VPN connection the virtual private gateway supports. 
     */
    public fun type(type: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ec2.CfnVPNGatewayProps.Builder =
        software.amazon.awscdk.services.ec2.CfnVPNGatewayProps.builder()

    /**
     * @param amazonSideAsn The private Autonomous System Number (ASN) for the Amazon side of a BGP
     * session.
     */
    override fun amazonSideAsn(amazonSideAsn: Number) {
      cdkBuilder.amazonSideAsn(amazonSideAsn)
    }

    /**
     * @param tags Any tags assigned to the virtual private gateway.
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    /**
     * @param tags Any tags assigned to the virtual private gateway.
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    /**
     * @param type The type of VPN connection the virtual private gateway supports. 
     */
    override fun type(type: String) {
      cdkBuilder.type(type)
    }

    public fun build(): software.amazon.awscdk.services.ec2.CfnVPNGatewayProps = cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.ec2.CfnVPNGatewayProps,
  ) : CdkObject(cdkObject), CfnVPNGatewayProps {
    /**
     * The private Autonomous System Number (ASN) for the Amazon side of a BGP session.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpngateway.html#cfn-ec2-vpngateway-amazonsideasn)
     */
    override fun amazonSideAsn(): Number? = unwrap(this).getAmazonSideAsn()

    /**
     * Any tags assigned to the virtual private gateway.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpngateway.html#cfn-ec2-vpngateway-tags)
     */
    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

    /**
     * The type of VPN connection the virtual private gateway supports.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpngateway.html#cfn-ec2-vpngateway-type)
     */
    override fun type(): String = unwrap(this).getType()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnVPNGatewayProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ec2.CfnVPNGatewayProps):
        CfnVPNGatewayProps = CdkObjectWrappers.wrap(cdkObject) as? CfnVPNGatewayProps ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnVPNGatewayProps):
        software.amazon.awscdk.services.ec2.CfnVPNGatewayProps = (wrapped as CdkObject).cdkObject as
        software.amazon.awscdk.services.ec2.CfnVPNGatewayProps
  }
}
