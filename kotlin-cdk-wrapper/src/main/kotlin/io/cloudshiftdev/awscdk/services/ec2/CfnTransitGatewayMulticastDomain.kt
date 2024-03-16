@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ec2

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.ITaggable
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * Creates a multicast domain using the specified transit gateway.
 *
 * The transit gateway must be in the available state before you create a domain.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.ec2.*;
 * Object options;
 * CfnTransitGatewayMulticastDomain cfnTransitGatewayMulticastDomain =
 * CfnTransitGatewayMulticastDomain.Builder.create(this, "MyCfnTransitGatewayMulticastDomain")
 * .transitGatewayId("transitGatewayId")
 * // the properties below are optional
 * .options(options)
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-transitgatewaymulticastdomain.html)
 */
public open class CfnTransitGatewayMulticastDomain internal constructor(
  internal override val cdkObject:
      software.amazon.awscdk.services.ec2.CfnTransitGatewayMulticastDomain,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  /**
   * The time the multicast domain was created.
   */
  public open fun attrCreationTime(): String = unwrap(this).getAttrCreationTime()

  /**
   * The state of the multicast domain.
   */
  public open fun attrState(): String = unwrap(this).getAttrState()

  /**
   * The Amazon Resource Name (ARN) of the multicast domain.
   */
  public open fun attrTransitGatewayMulticastDomainArn(): String =
      unwrap(this).getAttrTransitGatewayMulticastDomainArn()

  /**
   * The ID of the multicast domain.
   */
  public open fun attrTransitGatewayMulticastDomainId(): String =
      unwrap(this).getAttrTransitGatewayMulticastDomainId()

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  /**
   * The options for the transit gateway multicast domain.
   */
  public open fun options(): Any? = unwrap(this).getOptions()

  /**
   * The options for the transit gateway multicast domain.
   */
  public open fun options(`value`: Any) {
    unwrap(this).setOptions(`value`)
  }

  /**
   * Tag Manager which manages the tags for this resource.
   */
  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  /**
   * The tags for the transit gateway multicast domain.
   */
  public open fun tagsRaw(): List<CfnTag> = unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?:
      emptyList()

  /**
   * The tags for the transit gateway multicast domain.
   */
  public open fun tagsRaw(`value`: List<CfnTag>) {
    unwrap(this).setTagsRaw(`value`.map(CfnTag::unwrap))
  }

  /**
   * The tags for the transit gateway multicast domain.
   */
  public open fun tagsRaw(vararg `value`: CfnTag): Unit = tagsRaw(`value`.toList())

  /**
   * The ID of the transit gateway.
   */
  public open fun transitGatewayId(): String = unwrap(this).getTransitGatewayId()

  /**
   * The ID of the transit gateway.
   */
  public open fun transitGatewayId(`value`: String) {
    unwrap(this).setTransitGatewayId(`value`)
  }

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.ec2.CfnTransitGatewayMulticastDomain].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The options for the transit gateway multicast domain.
     *
     * * AutoAcceptSharedAssociations (enable | disable)
     * * Igmpv2Support (enable | disable)
     * * StaticSourcesSupport (enable | disable)
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-transitgatewaymulticastdomain.html#cfn-ec2-transitgatewaymulticastdomain-options)
     * @param options The options for the transit gateway multicast domain. 
     */
    public fun options(options: Any)

    /**
     * The tags for the transit gateway multicast domain.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-transitgatewaymulticastdomain.html#cfn-ec2-transitgatewaymulticastdomain-tags)
     * @param tags The tags for the transit gateway multicast domain. 
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * The tags for the transit gateway multicast domain.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-transitgatewaymulticastdomain.html#cfn-ec2-transitgatewaymulticastdomain-tags)
     * @param tags The tags for the transit gateway multicast domain. 
     */
    public fun tags(vararg tags: CfnTag)

    /**
     * The ID of the transit gateway.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-transitgatewaymulticastdomain.html#cfn-ec2-transitgatewaymulticastdomain-transitgatewayid)
     * @param transitGatewayId The ID of the transit gateway. 
     */
    public fun transitGatewayId(transitGatewayId: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.ec2.CfnTransitGatewayMulticastDomain.Builder =
        software.amazon.awscdk.services.ec2.CfnTransitGatewayMulticastDomain.Builder.create(scope,
        id)

    /**
     * The options for the transit gateway multicast domain.
     *
     * * AutoAcceptSharedAssociations (enable | disable)
     * * Igmpv2Support (enable | disable)
     * * StaticSourcesSupport (enable | disable)
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-transitgatewaymulticastdomain.html#cfn-ec2-transitgatewaymulticastdomain-options)
     * @param options The options for the transit gateway multicast domain. 
     */
    override fun options(options: Any) {
      cdkBuilder.options(options)
    }

    /**
     * The tags for the transit gateway multicast domain.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-transitgatewaymulticastdomain.html#cfn-ec2-transitgatewaymulticastdomain-tags)
     * @param tags The tags for the transit gateway multicast domain. 
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    /**
     * The tags for the transit gateway multicast domain.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-transitgatewaymulticastdomain.html#cfn-ec2-transitgatewaymulticastdomain-tags)
     * @param tags The tags for the transit gateway multicast domain. 
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    /**
     * The ID of the transit gateway.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-transitgatewaymulticastdomain.html#cfn-ec2-transitgatewaymulticastdomain-transitgatewayid)
     * @param transitGatewayId The ID of the transit gateway. 
     */
    override fun transitGatewayId(transitGatewayId: String) {
      cdkBuilder.transitGatewayId(transitGatewayId)
    }

    public fun build(): software.amazon.awscdk.services.ec2.CfnTransitGatewayMulticastDomain =
        cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.ec2.CfnTransitGatewayMulticastDomain.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnTransitGatewayMulticastDomain {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnTransitGatewayMulticastDomain(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.ec2.CfnTransitGatewayMulticastDomain):
        CfnTransitGatewayMulticastDomain = CfnTransitGatewayMulticastDomain(cdkObject)

    internal fun unwrap(wrapped: CfnTransitGatewayMulticastDomain):
        software.amazon.awscdk.services.ec2.CfnTransitGatewayMulticastDomain = wrapped.cdkObject
  }

  /**
   * The options for the transit gateway multicast domain.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.ec2.*;
   * OptionsProperty optionsProperty = OptionsProperty.builder()
   * .autoAcceptSharedAssociations("autoAcceptSharedAssociations")
   * .igmpv2Support("igmpv2Support")
   * .staticSourcesSupport("staticSourcesSupport")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-transitgatewaymulticastdomain-options.html)
   */
  public interface OptionsProperty {
    /**
     * Indicates whether to automatically accept cross-account subnet associations that are
     * associated with the transit gateway multicast domain.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-transitgatewaymulticastdomain-options.html#cfn-ec2-transitgatewaymulticastdomain-options-autoacceptsharedassociations)
     */
    public fun autoAcceptSharedAssociations(): String? =
        unwrap(this).getAutoAcceptSharedAssociations()

    /**
     * Specify whether to enable Internet Group Management Protocol (IGMP) version 2 for the transit
     * gateway multicast domain.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-transitgatewaymulticastdomain-options.html#cfn-ec2-transitgatewaymulticastdomain-options-igmpv2support)
     */
    public fun igmpv2Support(): String? = unwrap(this).getIgmpv2Support()

    /**
     * Specify whether to enable support for statically configuring multicast group sources for a
     * domain.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-transitgatewaymulticastdomain-options.html#cfn-ec2-transitgatewaymulticastdomain-options-staticsourcessupport)
     */
    public fun staticSourcesSupport(): String? = unwrap(this).getStaticSourcesSupport()

    /**
     * A builder for [OptionsProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param autoAcceptSharedAssociations Indicates whether to automatically accept cross-account
       * subnet associations that are associated with the transit gateway multicast domain.
       */
      public fun autoAcceptSharedAssociations(autoAcceptSharedAssociations: String)

      /**
       * @param igmpv2Support Specify whether to enable Internet Group Management Protocol (IGMP)
       * version 2 for the transit gateway multicast domain.
       */
      public fun igmpv2Support(igmpv2Support: String)

      /**
       * @param staticSourcesSupport Specify whether to enable support for statically configuring
       * multicast group sources for a domain.
       */
      public fun staticSourcesSupport(staticSourcesSupport: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.ec2.CfnTransitGatewayMulticastDomain.OptionsProperty.Builder
          =
          software.amazon.awscdk.services.ec2.CfnTransitGatewayMulticastDomain.OptionsProperty.builder()

      /**
       * @param autoAcceptSharedAssociations Indicates whether to automatically accept cross-account
       * subnet associations that are associated with the transit gateway multicast domain.
       */
      override fun autoAcceptSharedAssociations(autoAcceptSharedAssociations: String) {
        cdkBuilder.autoAcceptSharedAssociations(autoAcceptSharedAssociations)
      }

      /**
       * @param igmpv2Support Specify whether to enable Internet Group Management Protocol (IGMP)
       * version 2 for the transit gateway multicast domain.
       */
      override fun igmpv2Support(igmpv2Support: String) {
        cdkBuilder.igmpv2Support(igmpv2Support)
      }

      /**
       * @param staticSourcesSupport Specify whether to enable support for statically configuring
       * multicast group sources for a domain.
       */
      override fun staticSourcesSupport(staticSourcesSupport: String) {
        cdkBuilder.staticSourcesSupport(staticSourcesSupport)
      }

      public fun build():
          software.amazon.awscdk.services.ec2.CfnTransitGatewayMulticastDomain.OptionsProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.ec2.CfnTransitGatewayMulticastDomain.OptionsProperty,
    ) : CdkObject(cdkObject), OptionsProperty {
      /**
       * Indicates whether to automatically accept cross-account subnet associations that are
       * associated with the transit gateway multicast domain.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-transitgatewaymulticastdomain-options.html#cfn-ec2-transitgatewaymulticastdomain-options-autoacceptsharedassociations)
       */
      override fun autoAcceptSharedAssociations(): String? =
          unwrap(this).getAutoAcceptSharedAssociations()

      /**
       * Specify whether to enable Internet Group Management Protocol (IGMP) version 2 for the
       * transit gateway multicast domain.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-transitgatewaymulticastdomain-options.html#cfn-ec2-transitgatewaymulticastdomain-options-igmpv2support)
       */
      override fun igmpv2Support(): String? = unwrap(this).getIgmpv2Support()

      /**
       * Specify whether to enable support for statically configuring multicast group sources for a
       * domain.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-transitgatewaymulticastdomain-options.html#cfn-ec2-transitgatewaymulticastdomain-options-staticsourcessupport)
       */
      override fun staticSourcesSupport(): String? = unwrap(this).getStaticSourcesSupport()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): OptionsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.ec2.CfnTransitGatewayMulticastDomain.OptionsProperty):
          OptionsProperty = CdkObjectWrappers.wrap(cdkObject) as OptionsProperty

      internal fun unwrap(wrapped: OptionsProperty):
          software.amazon.awscdk.services.ec2.CfnTransitGatewayMulticastDomain.OptionsProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.ec2.CfnTransitGatewayMulticastDomain.OptionsProperty
    }
  }
}
