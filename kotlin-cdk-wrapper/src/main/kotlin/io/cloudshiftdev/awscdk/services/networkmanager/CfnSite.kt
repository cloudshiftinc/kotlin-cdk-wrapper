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
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * Creates a new site in a global network.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.networkmanager.*;
 * CfnSite cfnSite = CfnSite.Builder.create(this, "MyCfnSite")
 * .globalNetworkId("globalNetworkId")
 * // the properties below are optional
 * .description("description")
 * .location(LocationProperty.builder()
 * .address("address")
 * .latitude("latitude")
 * .longitude("longitude")
 * .build())
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-networkmanager-site.html)
 */
public open class CfnSite internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.networkmanager.CfnSite,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnSiteProps,
  ) :
      this(software.amazon.awscdk.services.networkmanager.CfnSite(scope.let(CloudshiftdevConstructsConstruct::unwrap),
      id, props.let(CfnSiteProps::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnSiteProps.Builder.() -> Unit,
  ) : this(scope, id, CfnSiteProps(props)
  )

  /**
   * The time that the site was created.
   */
  public open fun attrCreatedAt(): String = unwrap(this).getAttrCreatedAt()

  /**
   * The ARN of the site.
   *
   * For example,
   * `arn:aws:networkmanager::123456789012:site/global-network-01231231231231231/site-444555aaabbb11223`
   * .
   */
  public open fun attrSiteArn(): String = unwrap(this).getAttrSiteArn()

  /**
   * The ID of the site.
   *
   * For example, `site-444555aaabbb11223` .
   */
  public open fun attrSiteId(): String = unwrap(this).getAttrSiteId()

  /**
   * The current state of the site.
   */
  public open fun attrState(): String = unwrap(this).getAttrState()

  /**
   * A description of your site.
   */
  public open fun description(): String? = unwrap(this).getDescription()

  /**
   * A description of your site.
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
   * The site location.
   */
  public open fun location(): Any? = unwrap(this).getLocation()

  /**
   * The site location.
   */
  public open fun location(`value`: IResolvable) {
    unwrap(this).setLocation(`value`.let(IResolvable::unwrap))
  }

  /**
   * The site location.
   */
  public open fun location(`value`: LocationProperty) {
    unwrap(this).setLocation(`value`.let(LocationProperty::unwrap))
  }

  /**
   * The site location.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("9e7c32235714b5ec1221088a74ca97e391ed26ab8bf4eda63b175f27f41ee0ef")
  public open fun location(`value`: LocationProperty.Builder.() -> Unit): Unit =
      location(LocationProperty(`value`))

  /**
   * Tag Manager which manages the tags for this resource.
   */
  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  /**
   * The tags for the site.
   */
  public open fun tagsRaw(): List<CfnTag> = unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?:
      emptyList()

  /**
   * The tags for the site.
   */
  public open fun tagsRaw(`value`: List<CfnTag>) {
    unwrap(this).setTagsRaw(`value`.map(CfnTag::unwrap))
  }

  /**
   * The tags for the site.
   */
  public open fun tagsRaw(vararg `value`: CfnTag): Unit = tagsRaw(`value`.toList())

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.networkmanager.CfnSite].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * A description of your site.
     *
     * Constraints: Maximum length of 256 characters.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-networkmanager-site.html#cfn-networkmanager-site-description)
     * @param description A description of your site. 
     */
    public fun description(description: String)

    /**
     * The ID of the global network.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-networkmanager-site.html#cfn-networkmanager-site-globalnetworkid)
     * @param globalNetworkId The ID of the global network. 
     */
    public fun globalNetworkId(globalNetworkId: String)

    /**
     * The site location.
     *
     * This information is used for visualization in the Network Manager console. If you specify the
     * address, the latitude and longitude are automatically calculated.
     *
     * * `Address` : The physical address of the site.
     * * `Latitude` : The latitude of the site.
     * * `Longitude` : The longitude of the site.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-networkmanager-site.html#cfn-networkmanager-site-location)
     * @param location The site location. 
     */
    public fun location(location: IResolvable)

    /**
     * The site location.
     *
     * This information is used for visualization in the Network Manager console. If you specify the
     * address, the latitude and longitude are automatically calculated.
     *
     * * `Address` : The physical address of the site.
     * * `Latitude` : The latitude of the site.
     * * `Longitude` : The longitude of the site.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-networkmanager-site.html#cfn-networkmanager-site-location)
     * @param location The site location. 
     */
    public fun location(location: LocationProperty)

    /**
     * The site location.
     *
     * This information is used for visualization in the Network Manager console. If you specify the
     * address, the latitude and longitude are automatically calculated.
     *
     * * `Address` : The physical address of the site.
     * * `Latitude` : The latitude of the site.
     * * `Longitude` : The longitude of the site.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-networkmanager-site.html#cfn-networkmanager-site-location)
     * @param location The site location. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("5bfa01d646df37bd2c197504cf756b0316d72477463a0eab7da00a546fb82910")
    public fun location(location: LocationProperty.Builder.() -> Unit)

    /**
     * The tags for the site.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-networkmanager-site.html#cfn-networkmanager-site-tags)
     * @param tags The tags for the site. 
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * The tags for the site.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-networkmanager-site.html#cfn-networkmanager-site-tags)
     * @param tags The tags for the site. 
     */
    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.networkmanager.CfnSite.Builder =
        software.amazon.awscdk.services.networkmanager.CfnSite.Builder.create(scope, id)

    /**
     * A description of your site.
     *
     * Constraints: Maximum length of 256 characters.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-networkmanager-site.html#cfn-networkmanager-site-description)
     * @param description A description of your site. 
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * The ID of the global network.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-networkmanager-site.html#cfn-networkmanager-site-globalnetworkid)
     * @param globalNetworkId The ID of the global network. 
     */
    override fun globalNetworkId(globalNetworkId: String) {
      cdkBuilder.globalNetworkId(globalNetworkId)
    }

    /**
     * The site location.
     *
     * This information is used for visualization in the Network Manager console. If you specify the
     * address, the latitude and longitude are automatically calculated.
     *
     * * `Address` : The physical address of the site.
     * * `Latitude` : The latitude of the site.
     * * `Longitude` : The longitude of the site.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-networkmanager-site.html#cfn-networkmanager-site-location)
     * @param location The site location. 
     */
    override fun location(location: IResolvable) {
      cdkBuilder.location(location.let(IResolvable::unwrap))
    }

    /**
     * The site location.
     *
     * This information is used for visualization in the Network Manager console. If you specify the
     * address, the latitude and longitude are automatically calculated.
     *
     * * `Address` : The physical address of the site.
     * * `Latitude` : The latitude of the site.
     * * `Longitude` : The longitude of the site.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-networkmanager-site.html#cfn-networkmanager-site-location)
     * @param location The site location. 
     */
    override fun location(location: LocationProperty) {
      cdkBuilder.location(location.let(LocationProperty::unwrap))
    }

    /**
     * The site location.
     *
     * This information is used for visualization in the Network Manager console. If you specify the
     * address, the latitude and longitude are automatically calculated.
     *
     * * `Address` : The physical address of the site.
     * * `Latitude` : The latitude of the site.
     * * `Longitude` : The longitude of the site.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-networkmanager-site.html#cfn-networkmanager-site-location)
     * @param location The site location. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("5bfa01d646df37bd2c197504cf756b0316d72477463a0eab7da00a546fb82910")
    override fun location(location: LocationProperty.Builder.() -> Unit): Unit =
        location(LocationProperty(location))

    /**
     * The tags for the site.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-networkmanager-site.html#cfn-networkmanager-site-tags)
     * @param tags The tags for the site. 
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    /**
     * The tags for the site.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-networkmanager-site.html#cfn-networkmanager-site-tags)
     * @param tags The tags for the site. 
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.networkmanager.CfnSite = cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.networkmanager.CfnSite.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnSite {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnSite(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.networkmanager.CfnSite): CfnSite =
        CfnSite(cdkObject)

    internal fun unwrap(wrapped: CfnSite): software.amazon.awscdk.services.networkmanager.CfnSite =
        wrapped.cdkObject
  }

  /**
   * Describes a location.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.networkmanager.*;
   * LocationProperty locationProperty = LocationProperty.builder()
   * .address("address")
   * .latitude("latitude")
   * .longitude("longitude")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-networkmanager-site-location.html)
   */
  public interface LocationProperty {
    /**
     * The physical address.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-networkmanager-site-location.html#cfn-networkmanager-site-location-address)
     */
    public fun address(): String? = unwrap(this).getAddress()

    /**
     * The latitude.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-networkmanager-site-location.html#cfn-networkmanager-site-location-latitude)
     */
    public fun latitude(): String? = unwrap(this).getLatitude()

    /**
     * The longitude.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-networkmanager-site-location.html#cfn-networkmanager-site-location-longitude)
     */
    public fun longitude(): String? = unwrap(this).getLongitude()

    /**
     * A builder for [LocationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param address The physical address.
       */
      public fun address(address: String)

      /**
       * @param latitude The latitude.
       */
      public fun latitude(latitude: String)

      /**
       * @param longitude The longitude.
       */
      public fun longitude(longitude: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.networkmanager.CfnSite.LocationProperty.Builder =
          software.amazon.awscdk.services.networkmanager.CfnSite.LocationProperty.builder()

      /**
       * @param address The physical address.
       */
      override fun address(address: String) {
        cdkBuilder.address(address)
      }

      /**
       * @param latitude The latitude.
       */
      override fun latitude(latitude: String) {
        cdkBuilder.latitude(latitude)
      }

      /**
       * @param longitude The longitude.
       */
      override fun longitude(longitude: String) {
        cdkBuilder.longitude(longitude)
      }

      public fun build(): software.amazon.awscdk.services.networkmanager.CfnSite.LocationProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.networkmanager.CfnSite.LocationProperty,
    ) : CdkObject(cdkObject), LocationProperty {
      /**
       * The physical address.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-networkmanager-site-location.html#cfn-networkmanager-site-location-address)
       */
      override fun address(): String? = unwrap(this).getAddress()

      /**
       * The latitude.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-networkmanager-site-location.html#cfn-networkmanager-site-location-latitude)
       */
      override fun latitude(): String? = unwrap(this).getLatitude()

      /**
       * The longitude.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-networkmanager-site-location.html#cfn-networkmanager-site-location-longitude)
       */
      override fun longitude(): String? = unwrap(this).getLongitude()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): LocationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.networkmanager.CfnSite.LocationProperty):
          LocationProperty = CdkObjectWrappers.wrap(cdkObject) as? LocationProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: LocationProperty):
          software.amazon.awscdk.services.networkmanager.CfnSite.LocationProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.networkmanager.CfnSite.LocationProperty
    }
  }
}
