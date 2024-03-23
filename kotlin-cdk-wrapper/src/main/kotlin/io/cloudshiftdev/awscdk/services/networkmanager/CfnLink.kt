@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.networkmanager

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.ITaggable
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * Specifies a link for a site.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.networkmanager.*;
 * CfnLink cfnLink = CfnLink.Builder.create(this, "MyCfnLink")
 * .bandwidth(BandwidthProperty.builder()
 * .downloadSpeed(123)
 * .uploadSpeed(123)
 * .build())
 * .globalNetworkId("globalNetworkId")
 * .siteId("siteId")
 * // the properties below are optional
 * .description("description")
 * .provider("provider")
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .type("type")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-networkmanager-link.html)
 */
public open class CfnLink(
  cdkObject: software.amazon.awscdk.services.networkmanager.CfnLink,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnLinkProps,
  ) :
      this(software.amazon.awscdk.services.networkmanager.CfnLink(scope.let(CloudshiftdevConstructsConstruct::unwrap),
      id, props.let(CfnLinkProps::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnLinkProps.Builder.() -> Unit,
  ) : this(scope, id, CfnLinkProps(props)
  )

  /**
   * The date and time that the link was created.
   */
  public open fun attrCreatedAt(): String = unwrap(this).getAttrCreatedAt()

  /**
   * The ARN of the link.
   *
   * For example,
   * `arn:aws:networkmanager::123456789012:link/global-network-01231231231231231/link-11112222aaaabbbb1`
   * .
   */
  public open fun attrLinkArn(): String = unwrap(this).getAttrLinkArn()

  /**
   * The ID of the link.
   *
   * For example, `link-11112222aaaabbbb1` .
   */
  public open fun attrLinkId(): String = unwrap(this).getAttrLinkId()

  /**
   * The state of the link.
   */
  public open fun attrState(): String = unwrap(this).getAttrState()

  /**
   * The bandwidth for the link.
   */
  public open fun bandwidth(): Any = unwrap(this).getBandwidth()

  /**
   * The bandwidth for the link.
   */
  public open fun bandwidth(`value`: IResolvable) {
    unwrap(this).setBandwidth(`value`.let(IResolvable::unwrap))
  }

  /**
   * The bandwidth for the link.
   */
  public open fun bandwidth(`value`: BandwidthProperty) {
    unwrap(this).setBandwidth(`value`.let(BandwidthProperty::unwrap))
  }

  /**
   * The bandwidth for the link.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("a44c8db638e441798bc507b144b7de9f51015256fd54644bf0b794e5aa0cfc15")
  public open fun bandwidth(`value`: BandwidthProperty.Builder.() -> Unit): Unit =
      bandwidth(BandwidthProperty(`value`))

  /**
   * A description of the link.
   */
  public open fun description(): String? = unwrap(this).getDescription()

  /**
   * A description of the link.
   */
  public open fun description(`value`: String) {
    unwrap(this).setDescription(`value`)
  }

  /**
   * The ID of the global network.
   */
  public open fun globalNetworkId(): String = unwrap(this).getGlobalNetworkId()

  /**
   * The ID of the global network.
   */
  public open fun globalNetworkId(`value`: String) {
    unwrap(this).setGlobalNetworkId(`value`)
  }

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  /**
   * The provider of the link.
   */
  public open fun provider(): String? = unwrap(this).getProvider()

  /**
   * The provider of the link.
   */
  public open fun provider(`value`: String) {
    unwrap(this).setProvider(`value`)
  }

  /**
   * The ID of the site.
   */
  public open fun siteId(): String = unwrap(this).getSiteId()

  /**
   * The ID of the site.
   */
  public open fun siteId(`value`: String) {
    unwrap(this).setSiteId(`value`)
  }

  /**
   * Tag Manager which manages the tags for this resource.
   */
  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  /**
   * The tags for the link.
   */
  public open fun tagsRaw(): List<CfnTag> = unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?:
      emptyList()

  /**
   * The tags for the link.
   */
  public open fun tagsRaw(`value`: List<CfnTag>) {
    unwrap(this).setTagsRaw(`value`.map(CfnTag::unwrap))
  }

  /**
   * The tags for the link.
   */
  public open fun tagsRaw(vararg `value`: CfnTag): Unit = tagsRaw(`value`.toList())

  /**
   * The type of the link.
   */
  public open fun type(): String? = unwrap(this).getType()

  /**
   * The type of the link.
   */
  public open fun type(`value`: String) {
    unwrap(this).setType(`value`)
  }

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.networkmanager.CfnLink].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The bandwidth for the link.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-networkmanager-link.html#cfn-networkmanager-link-bandwidth)
     * @param bandwidth The bandwidth for the link. 
     */
    public fun bandwidth(bandwidth: IResolvable)

    /**
     * The bandwidth for the link.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-networkmanager-link.html#cfn-networkmanager-link-bandwidth)
     * @param bandwidth The bandwidth for the link. 
     */
    public fun bandwidth(bandwidth: BandwidthProperty)

    /**
     * The bandwidth for the link.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-networkmanager-link.html#cfn-networkmanager-link-bandwidth)
     * @param bandwidth The bandwidth for the link. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("a49e9c4c1283b201998580fa4db416940d6c8c8bf89fd651530692bffdd36454")
    public fun bandwidth(bandwidth: BandwidthProperty.Builder.() -> Unit)

    /**
     * A description of the link.
     *
     * Constraints: Maximum length of 256 characters.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-networkmanager-link.html#cfn-networkmanager-link-description)
     * @param description A description of the link. 
     */
    public fun description(description: String)

    /**
     * The ID of the global network.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-networkmanager-link.html#cfn-networkmanager-link-globalnetworkid)
     * @param globalNetworkId The ID of the global network. 
     */
    public fun globalNetworkId(globalNetworkId: String)

    /**
     * The provider of the link.
     *
     * Constraints: Maximum length of 128 characters. Cannot include the following characters: | \ ^
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-networkmanager-link.html#cfn-networkmanager-link-provider)
     * @param provider The provider of the link. 
     */
    public fun provider(provider: String)

    /**
     * The ID of the site.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-networkmanager-link.html#cfn-networkmanager-link-siteid)
     * @param siteId The ID of the site. 
     */
    public fun siteId(siteId: String)

    /**
     * The tags for the link.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-networkmanager-link.html#cfn-networkmanager-link-tags)
     * @param tags The tags for the link. 
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * The tags for the link.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-networkmanager-link.html#cfn-networkmanager-link-tags)
     * @param tags The tags for the link. 
     */
    public fun tags(vararg tags: CfnTag)

    /**
     * The type of the link.
     *
     * Constraints: Maximum length of 128 characters. Cannot include the following characters: | \ ^
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-networkmanager-link.html#cfn-networkmanager-link-type)
     * @param type The type of the link. 
     */
    public fun type(type: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.networkmanager.CfnLink.Builder =
        software.amazon.awscdk.services.networkmanager.CfnLink.Builder.create(scope, id)

    /**
     * The bandwidth for the link.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-networkmanager-link.html#cfn-networkmanager-link-bandwidth)
     * @param bandwidth The bandwidth for the link. 
     */
    override fun bandwidth(bandwidth: IResolvable) {
      cdkBuilder.bandwidth(bandwidth.let(IResolvable::unwrap))
    }

    /**
     * The bandwidth for the link.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-networkmanager-link.html#cfn-networkmanager-link-bandwidth)
     * @param bandwidth The bandwidth for the link. 
     */
    override fun bandwidth(bandwidth: BandwidthProperty) {
      cdkBuilder.bandwidth(bandwidth.let(BandwidthProperty::unwrap))
    }

    /**
     * The bandwidth for the link.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-networkmanager-link.html#cfn-networkmanager-link-bandwidth)
     * @param bandwidth The bandwidth for the link. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("a49e9c4c1283b201998580fa4db416940d6c8c8bf89fd651530692bffdd36454")
    override fun bandwidth(bandwidth: BandwidthProperty.Builder.() -> Unit): Unit =
        bandwidth(BandwidthProperty(bandwidth))

    /**
     * A description of the link.
     *
     * Constraints: Maximum length of 256 characters.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-networkmanager-link.html#cfn-networkmanager-link-description)
     * @param description A description of the link. 
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * The ID of the global network.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-networkmanager-link.html#cfn-networkmanager-link-globalnetworkid)
     * @param globalNetworkId The ID of the global network. 
     */
    override fun globalNetworkId(globalNetworkId: String) {
      cdkBuilder.globalNetworkId(globalNetworkId)
    }

    /**
     * The provider of the link.
     *
     * Constraints: Maximum length of 128 characters. Cannot include the following characters: | \ ^
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-networkmanager-link.html#cfn-networkmanager-link-provider)
     * @param provider The provider of the link. 
     */
    override fun provider(provider: String) {
      cdkBuilder.provider(provider)
    }

    /**
     * The ID of the site.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-networkmanager-link.html#cfn-networkmanager-link-siteid)
     * @param siteId The ID of the site. 
     */
    override fun siteId(siteId: String) {
      cdkBuilder.siteId(siteId)
    }

    /**
     * The tags for the link.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-networkmanager-link.html#cfn-networkmanager-link-tags)
     * @param tags The tags for the link. 
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    /**
     * The tags for the link.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-networkmanager-link.html#cfn-networkmanager-link-tags)
     * @param tags The tags for the link. 
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    /**
     * The type of the link.
     *
     * Constraints: Maximum length of 128 characters. Cannot include the following characters: | \ ^
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-networkmanager-link.html#cfn-networkmanager-link-type)
     * @param type The type of the link. 
     */
    override fun type(type: String) {
      cdkBuilder.type(type)
    }

    public fun build(): software.amazon.awscdk.services.networkmanager.CfnLink = cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.networkmanager.CfnLink.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnLink {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnLink(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.networkmanager.CfnLink): CfnLink =
        CfnLink(cdkObject)

    internal fun unwrap(wrapped: CfnLink): software.amazon.awscdk.services.networkmanager.CfnLink =
        wrapped.cdkObject as software.amazon.awscdk.services.networkmanager.CfnLink
  }

  /**
   * Describes bandwidth information.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.networkmanager.*;
   * BandwidthProperty bandwidthProperty = BandwidthProperty.builder()
   * .downloadSpeed(123)
   * .uploadSpeed(123)
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-networkmanager-link-bandwidth.html)
   */
  public interface BandwidthProperty {
    /**
     * Download speed in Mbps.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-networkmanager-link-bandwidth.html#cfn-networkmanager-link-bandwidth-downloadspeed)
     */
    public fun downloadSpeed(): Number? = unwrap(this).getDownloadSpeed()

    /**
     * Upload speed in Mbps.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-networkmanager-link-bandwidth.html#cfn-networkmanager-link-bandwidth-uploadspeed)
     */
    public fun uploadSpeed(): Number? = unwrap(this).getUploadSpeed()

    /**
     * A builder for [BandwidthProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param downloadSpeed Download speed in Mbps.
       */
      public fun downloadSpeed(downloadSpeed: Number)

      /**
       * @param uploadSpeed Upload speed in Mbps.
       */
      public fun uploadSpeed(uploadSpeed: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.networkmanager.CfnLink.BandwidthProperty.Builder =
          software.amazon.awscdk.services.networkmanager.CfnLink.BandwidthProperty.builder()

      /**
       * @param downloadSpeed Download speed in Mbps.
       */
      override fun downloadSpeed(downloadSpeed: Number) {
        cdkBuilder.downloadSpeed(downloadSpeed)
      }

      /**
       * @param uploadSpeed Upload speed in Mbps.
       */
      override fun uploadSpeed(uploadSpeed: Number) {
        cdkBuilder.uploadSpeed(uploadSpeed)
      }

      public fun build(): software.amazon.awscdk.services.networkmanager.CfnLink.BandwidthProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.networkmanager.CfnLink.BandwidthProperty,
    ) : CdkObject(cdkObject), BandwidthProperty {
      /**
       * Download speed in Mbps.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-networkmanager-link-bandwidth.html#cfn-networkmanager-link-bandwidth-downloadspeed)
       */
      override fun downloadSpeed(): Number? = unwrap(this).getDownloadSpeed()

      /**
       * Upload speed in Mbps.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-networkmanager-link-bandwidth.html#cfn-networkmanager-link-bandwidth-uploadspeed)
       */
      override fun uploadSpeed(): Number? = unwrap(this).getUploadSpeed()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): BandwidthProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.networkmanager.CfnLink.BandwidthProperty):
          BandwidthProperty = CdkObjectWrappers.wrap(cdkObject) as? BandwidthProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: BandwidthProperty):
          software.amazon.awscdk.services.networkmanager.CfnLink.BandwidthProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.networkmanager.CfnLink.BandwidthProperty
    }
  }
}
