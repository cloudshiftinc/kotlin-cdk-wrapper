package io.cloudshiftdev.awscdk.services.ec2

import io.cloudshiftdev.awscdk.CdkObject
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

public interface CfnTransitGatewayMulticastDomainProps {
  /**
   * The options for the transit gateway multicast domain.
   *
   * * AutoAcceptSharedAssociations (enable | disable)
   * * Igmpv2Support (enable | disable)
   * * StaticSourcesSupport (enable | disable)
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-transitgatewaymulticastdomain.html#cfn-ec2-transitgatewaymulticastdomain-options)
   */
  public fun options(): Any? = unwrap(this).getOptions()

  /**
   * The tags for the transit gateway multicast domain.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-transitgatewaymulticastdomain.html#cfn-ec2-transitgatewaymulticastdomain-tags)
   */
  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * The ID of the transit gateway.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-transitgatewaymulticastdomain.html#cfn-ec2-transitgatewaymulticastdomain-transitgatewayid)
   */
  public fun transitGatewayId(): String

  /**
   * A builder for [CfnTransitGatewayMulticastDomainProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param options The options for the transit gateway multicast domain.
     * * AutoAcceptSharedAssociations (enable | disable)
     * * Igmpv2Support (enable | disable)
     * * StaticSourcesSupport (enable | disable)
     */
    public fun options(options: Any)

    /**
     * @param tags The tags for the transit gateway multicast domain.
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * @param tags The tags for the transit gateway multicast domain.
     */
    public fun tags(vararg tags: CfnTag)

    /**
     * @param transitGatewayId The ID of the transit gateway. 
     */
    public fun transitGatewayId(transitGatewayId: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.ec2.CfnTransitGatewayMulticastDomainProps.Builder =
        software.amazon.awscdk.services.ec2.CfnTransitGatewayMulticastDomainProps.builder()

    /**
     * @param options The options for the transit gateway multicast domain.
     * * AutoAcceptSharedAssociations (enable | disable)
     * * Igmpv2Support (enable | disable)
     * * StaticSourcesSupport (enable | disable)
     */
    override fun options(options: Any) {
      cdkBuilder.options(options)
    }

    /**
     * @param tags The tags for the transit gateway multicast domain.
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    /**
     * @param tags The tags for the transit gateway multicast domain.
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    /**
     * @param transitGatewayId The ID of the transit gateway. 
     */
    override fun transitGatewayId(transitGatewayId: String) {
      cdkBuilder.transitGatewayId(transitGatewayId)
    }

    public fun build(): software.amazon.awscdk.services.ec2.CfnTransitGatewayMulticastDomainProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject:
        software.amazon.awscdk.services.ec2.CfnTransitGatewayMulticastDomainProps,
  ) : CdkObject(cdkObject), CfnTransitGatewayMulticastDomainProps {
    /**
     * The options for the transit gateway multicast domain.
     *
     * * AutoAcceptSharedAssociations (enable | disable)
     * * Igmpv2Support (enable | disable)
     * * StaticSourcesSupport (enable | disable)
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-transitgatewaymulticastdomain.html#cfn-ec2-transitgatewaymulticastdomain-options)
     */
    override fun options(): Any? = unwrap(this).getOptions()

    /**
     * The tags for the transit gateway multicast domain.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-transitgatewaymulticastdomain.html#cfn-ec2-transitgatewaymulticastdomain-tags)
     */
    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

    /**
     * The ID of the transit gateway.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-transitgatewaymulticastdomain.html#cfn-ec2-transitgatewaymulticastdomain-transitgatewayid)
     */
    override fun transitGatewayId(): String = unwrap(this).getTransitGatewayId()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}):
        CfnTransitGatewayMulticastDomainProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.ec2.CfnTransitGatewayMulticastDomainProps):
        CfnTransitGatewayMulticastDomainProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnTransitGatewayMulticastDomainProps):
        software.amazon.awscdk.services.ec2.CfnTransitGatewayMulticastDomainProps = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.ec2.CfnTransitGatewayMulticastDomainProps
  }
}
