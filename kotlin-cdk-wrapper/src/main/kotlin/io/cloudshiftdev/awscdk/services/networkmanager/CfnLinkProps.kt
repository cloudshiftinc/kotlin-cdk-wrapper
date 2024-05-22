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
 * Properties for defining a `CfnLink`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.networkmanager.*;
 * CfnLinkProps cfnLinkProps = CfnLinkProps.builder()
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
public interface CfnLinkProps {
  /**
   * The bandwidth for the link.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-networkmanager-link.html#cfn-networkmanager-link-bandwidth)
   */
  public fun bandwidth(): Any

  /**
   * A description of the link.
   *
   * Constraints: Maximum length of 256 characters.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-networkmanager-link.html#cfn-networkmanager-link-description)
   */
  public fun description(): String? = unwrap(this).getDescription()

  /**
   * The ID of the global network.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-networkmanager-link.html#cfn-networkmanager-link-globalnetworkid)
   */
  public fun globalNetworkId(): String

  /**
   * The provider of the link.
   *
   * Constraints: Maximum length of 128 characters. Cannot include the following characters: | \ ^
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-networkmanager-link.html#cfn-networkmanager-link-provider)
   */
  public fun provider(): String? = unwrap(this).getProvider()

  /**
   * The ID of the site.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-networkmanager-link.html#cfn-networkmanager-link-siteid)
   */
  public fun siteId(): String

  /**
   * The tags for the link.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-networkmanager-link.html#cfn-networkmanager-link-tags)
   */
  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * The type of the link.
   *
   * Constraints: Maximum length of 128 characters. Cannot include the following characters: | \ ^
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-networkmanager-link.html#cfn-networkmanager-link-type)
   */
  public fun type(): String? = unwrap(this).getType()

  /**
   * A builder for [CfnLinkProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param bandwidth The bandwidth for the link. 
     */
    public fun bandwidth(bandwidth: IResolvable)

    /**
     * @param bandwidth The bandwidth for the link. 
     */
    public fun bandwidth(bandwidth: CfnLink.BandwidthProperty)

    /**
     * @param bandwidth The bandwidth for the link. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("742650b47859758aabdb6cf12e9ce92e9a6384de17aaaac816e7df04a32f34ca")
    public fun bandwidth(bandwidth: CfnLink.BandwidthProperty.Builder.() -> Unit)

    /**
     * @param description A description of the link.
     * Constraints: Maximum length of 256 characters.
     */
    public fun description(description: String)

    /**
     * @param globalNetworkId The ID of the global network. 
     */
    public fun globalNetworkId(globalNetworkId: String)

    /**
     * @param provider The provider of the link.
     * Constraints: Maximum length of 128 characters. Cannot include the following characters: | \ ^
     */
    public fun provider(provider: String)

    /**
     * @param siteId The ID of the site. 
     */
    public fun siteId(siteId: String)

    /**
     * @param tags The tags for the link.
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * @param tags The tags for the link.
     */
    public fun tags(vararg tags: CfnTag)

    /**
     * @param type The type of the link.
     * Constraints: Maximum length of 128 characters. Cannot include the following characters: | \ ^
     */
    public fun type(type: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.networkmanager.CfnLinkProps.Builder =
        software.amazon.awscdk.services.networkmanager.CfnLinkProps.builder()

    /**
     * @param bandwidth The bandwidth for the link. 
     */
    override fun bandwidth(bandwidth: IResolvable) {
      cdkBuilder.bandwidth(bandwidth.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param bandwidth The bandwidth for the link. 
     */
    override fun bandwidth(bandwidth: CfnLink.BandwidthProperty) {
      cdkBuilder.bandwidth(bandwidth.let(CfnLink.BandwidthProperty.Companion::unwrap))
    }

    /**
     * @param bandwidth The bandwidth for the link. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("742650b47859758aabdb6cf12e9ce92e9a6384de17aaaac816e7df04a32f34ca")
    override fun bandwidth(bandwidth: CfnLink.BandwidthProperty.Builder.() -> Unit): Unit =
        bandwidth(CfnLink.BandwidthProperty(bandwidth))

    /**
     * @param description A description of the link.
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
     * @param provider The provider of the link.
     * Constraints: Maximum length of 128 characters. Cannot include the following characters: | \ ^
     */
    override fun provider(provider: String) {
      cdkBuilder.provider(provider)
    }

    /**
     * @param siteId The ID of the site. 
     */
    override fun siteId(siteId: String) {
      cdkBuilder.siteId(siteId)
    }

    /**
     * @param tags The tags for the link.
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag.Companion::unwrap))
    }

    /**
     * @param tags The tags for the link.
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    /**
     * @param type The type of the link.
     * Constraints: Maximum length of 128 characters. Cannot include the following characters: | \ ^
     */
    override fun type(type: String) {
      cdkBuilder.type(type)
    }

    public fun build(): software.amazon.awscdk.services.networkmanager.CfnLinkProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.networkmanager.CfnLinkProps,
  ) : CdkObject(cdkObject), CfnLinkProps {
    /**
     * The bandwidth for the link.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-networkmanager-link.html#cfn-networkmanager-link-bandwidth)
     */
    override fun bandwidth(): Any = unwrap(this).getBandwidth()

    /**
     * A description of the link.
     *
     * Constraints: Maximum length of 256 characters.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-networkmanager-link.html#cfn-networkmanager-link-description)
     */
    override fun description(): String? = unwrap(this).getDescription()

    /**
     * The ID of the global network.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-networkmanager-link.html#cfn-networkmanager-link-globalnetworkid)
     */
    override fun globalNetworkId(): String = unwrap(this).getGlobalNetworkId()

    /**
     * The provider of the link.
     *
     * Constraints: Maximum length of 128 characters. Cannot include the following characters: | \ ^
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-networkmanager-link.html#cfn-networkmanager-link-provider)
     */
    override fun provider(): String? = unwrap(this).getProvider()

    /**
     * The ID of the site.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-networkmanager-link.html#cfn-networkmanager-link-siteid)
     */
    override fun siteId(): String = unwrap(this).getSiteId()

    /**
     * The tags for the link.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-networkmanager-link.html#cfn-networkmanager-link-tags)
     */
    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

    /**
     * The type of the link.
     *
     * Constraints: Maximum length of 128 characters. Cannot include the following characters: | \ ^
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-networkmanager-link.html#cfn-networkmanager-link-type)
     */
    override fun type(): String? = unwrap(this).getType()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnLinkProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.networkmanager.CfnLinkProps):
        CfnLinkProps = CdkObjectWrappers.wrap(cdkObject) as? CfnLinkProps ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnLinkProps):
        software.amazon.awscdk.services.networkmanager.CfnLinkProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.networkmanager.CfnLinkProps
  }
}
