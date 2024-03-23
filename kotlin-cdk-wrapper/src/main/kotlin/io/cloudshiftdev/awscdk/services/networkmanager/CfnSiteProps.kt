@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.networkmanager

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

/**
 * Properties for defining a `CfnSite`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.networkmanager.*;
 * CfnSiteProps cfnSiteProps = CfnSiteProps.builder()
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
public interface CfnSiteProps {
  /**
   * A description of your site.
   *
   * Constraints: Maximum length of 256 characters.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-networkmanager-site.html#cfn-networkmanager-site-description)
   */
  public fun description(): String? = unwrap(this).getDescription()

  /**
   * The ID of the global network.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-networkmanager-site.html#cfn-networkmanager-site-globalnetworkid)
   */
  public fun globalNetworkId(): String

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
   */
  public fun location(): Any? = unwrap(this).getLocation()

  /**
   * The tags for the site.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-networkmanager-site.html#cfn-networkmanager-site-tags)
   */
  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * A builder for [CfnSiteProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param description A description of your site.
     * Constraints: Maximum length of 256 characters.
     */
    public fun description(description: String)

    /**
     * @param globalNetworkId The ID of the global network. 
     */
    public fun globalNetworkId(globalNetworkId: String)

    /**
     * @param location The site location.
     * This information is used for visualization in the Network Manager console. If you specify the
     * address, the latitude and longitude are automatically calculated.
     *
     * * `Address` : The physical address of the site.
     * * `Latitude` : The latitude of the site.
     * * `Longitude` : The longitude of the site.
     */
    public fun location(location: IResolvable)

    /**
     * @param location The site location.
     * This information is used for visualization in the Network Manager console. If you specify the
     * address, the latitude and longitude are automatically calculated.
     *
     * * `Address` : The physical address of the site.
     * * `Latitude` : The latitude of the site.
     * * `Longitude` : The longitude of the site.
     */
    public fun location(location: CfnSite.LocationProperty)

    /**
     * @param location The site location.
     * This information is used for visualization in the Network Manager console. If you specify the
     * address, the latitude and longitude are automatically calculated.
     *
     * * `Address` : The physical address of the site.
     * * `Latitude` : The latitude of the site.
     * * `Longitude` : The longitude of the site.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("c2ccfb2f60e9706745dd85be53d5fcb60851d0cddce22db7fe1554718af547be")
    public fun location(location: CfnSite.LocationProperty.Builder.() -> Unit)

    /**
     * @param tags The tags for the site.
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * @param tags The tags for the site.
     */
    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.networkmanager.CfnSiteProps.Builder =
        software.amazon.awscdk.services.networkmanager.CfnSiteProps.builder()

    /**
     * @param description A description of your site.
     * Constraints: Maximum length of 256 characters.
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * @param globalNetworkId The ID of the global network. 
     */
    override fun globalNetworkId(globalNetworkId: String) {
      cdkBuilder.globalNetworkId(globalNetworkId)
    }

    /**
     * @param location The site location.
     * This information is used for visualization in the Network Manager console. If you specify the
     * address, the latitude and longitude are automatically calculated.
     *
     * * `Address` : The physical address of the site.
     * * `Latitude` : The latitude of the site.
     * * `Longitude` : The longitude of the site.
     */
    override fun location(location: IResolvable) {
      cdkBuilder.location(location.let(IResolvable::unwrap))
    }

    /**
     * @param location The site location.
     * This information is used for visualization in the Network Manager console. If you specify the
     * address, the latitude and longitude are automatically calculated.
     *
     * * `Address` : The physical address of the site.
     * * `Latitude` : The latitude of the site.
     * * `Longitude` : The longitude of the site.
     */
    override fun location(location: CfnSite.LocationProperty) {
      cdkBuilder.location(location.let(CfnSite.LocationProperty::unwrap))
    }

    /**
     * @param location The site location.
     * This information is used for visualization in the Network Manager console. If you specify the
     * address, the latitude and longitude are automatically calculated.
     *
     * * `Address` : The physical address of the site.
     * * `Latitude` : The latitude of the site.
     * * `Longitude` : The longitude of the site.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("c2ccfb2f60e9706745dd85be53d5fcb60851d0cddce22db7fe1554718af547be")
    override fun location(location: CfnSite.LocationProperty.Builder.() -> Unit): Unit =
        location(CfnSite.LocationProperty(location))

    /**
     * @param tags The tags for the site.
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    /**
     * @param tags The tags for the site.
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.networkmanager.CfnSiteProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.networkmanager.CfnSiteProps,
  ) : CdkObject(cdkObject), CfnSiteProps {
    /**
     * A description of your site.
     *
     * Constraints: Maximum length of 256 characters.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-networkmanager-site.html#cfn-networkmanager-site-description)
     */
    override fun description(): String? = unwrap(this).getDescription()

    /**
     * The ID of the global network.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-networkmanager-site.html#cfn-networkmanager-site-globalnetworkid)
     */
    override fun globalNetworkId(): String = unwrap(this).getGlobalNetworkId()

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
     */
    override fun location(): Any? = unwrap(this).getLocation()

    /**
     * The tags for the site.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-networkmanager-site.html#cfn-networkmanager-site-tags)
     */
    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnSiteProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.networkmanager.CfnSiteProps):
        CfnSiteProps = CdkObjectWrappers.wrap(cdkObject) as? CfnSiteProps ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnSiteProps):
        software.amazon.awscdk.services.networkmanager.CfnSiteProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.networkmanager.CfnSiteProps
  }
}
