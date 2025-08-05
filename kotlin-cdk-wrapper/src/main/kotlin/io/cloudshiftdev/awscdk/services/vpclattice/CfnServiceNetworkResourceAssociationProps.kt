@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.vpclattice

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

/**
 * Properties for defining a `CfnServiceNetworkResourceAssociation`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.vpclattice.*;
 * CfnServiceNetworkResourceAssociationProps cfnServiceNetworkResourceAssociationProps =
 * CfnServiceNetworkResourceAssociationProps.builder()
 * .resourceConfigurationId("resourceConfigurationId")
 * .serviceNetworkId("serviceNetworkId")
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-vpclattice-servicenetworkresourceassociation.html)
 */
public interface CfnServiceNetworkResourceAssociationProps {
  /**
   * The ID of the resource configuration associated with the service network.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-vpclattice-servicenetworkresourceassociation.html#cfn-vpclattice-servicenetworkresourceassociation-resourceconfigurationid)
   */
  public fun resourceConfigurationId(): String? = unwrap(this).getResourceConfigurationId()

  /**
   * The ID of the service network associated with the resource configuration.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-vpclattice-servicenetworkresourceassociation.html#cfn-vpclattice-servicenetworkresourceassociation-servicenetworkid)
   */
  public fun serviceNetworkId(): String? = unwrap(this).getServiceNetworkId()

  /**
   * A key-value pair to associate with a resource.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-vpclattice-servicenetworkresourceassociation.html#cfn-vpclattice-servicenetworkresourceassociation-tags)
   */
  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * A builder for [CfnServiceNetworkResourceAssociationProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param resourceConfigurationId The ID of the resource configuration associated with the
     * service network.
     */
    public fun resourceConfigurationId(resourceConfigurationId: String)

    /**
     * @param serviceNetworkId The ID of the service network associated with the resource
     * configuration.
     */
    public fun serviceNetworkId(serviceNetworkId: String)

    /**
     * @param tags A key-value pair to associate with a resource.
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * @param tags A key-value pair to associate with a resource.
     */
    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.vpclattice.CfnServiceNetworkResourceAssociationProps.Builder
        =
        software.amazon.awscdk.services.vpclattice.CfnServiceNetworkResourceAssociationProps.builder()

    /**
     * @param resourceConfigurationId The ID of the resource configuration associated with the
     * service network.
     */
    override fun resourceConfigurationId(resourceConfigurationId: String) {
      cdkBuilder.resourceConfigurationId(resourceConfigurationId)
    }

    /**
     * @param serviceNetworkId The ID of the service network associated with the resource
     * configuration.
     */
    override fun serviceNetworkId(serviceNetworkId: String) {
      cdkBuilder.serviceNetworkId(serviceNetworkId)
    }

    /**
     * @param tags A key-value pair to associate with a resource.
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag.Companion::unwrap))
    }

    /**
     * @param tags A key-value pair to associate with a resource.
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build():
        software.amazon.awscdk.services.vpclattice.CfnServiceNetworkResourceAssociationProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.vpclattice.CfnServiceNetworkResourceAssociationProps,
  ) : CdkObject(cdkObject),
      CfnServiceNetworkResourceAssociationProps {
    /**
     * The ID of the resource configuration associated with the service network.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-vpclattice-servicenetworkresourceassociation.html#cfn-vpclattice-servicenetworkresourceassociation-resourceconfigurationid)
     */
    override fun resourceConfigurationId(): String? = unwrap(this).getResourceConfigurationId()

    /**
     * The ID of the service network associated with the resource configuration.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-vpclattice-servicenetworkresourceassociation.html#cfn-vpclattice-servicenetworkresourceassociation-servicenetworkid)
     */
    override fun serviceNetworkId(): String? = unwrap(this).getServiceNetworkId()

    /**
     * A key-value pair to associate with a resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-vpclattice-servicenetworkresourceassociation.html#cfn-vpclattice-servicenetworkresourceassociation-tags)
     */
    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}):
        CfnServiceNetworkResourceAssociationProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.vpclattice.CfnServiceNetworkResourceAssociationProps):
        CfnServiceNetworkResourceAssociationProps = CdkObjectWrappers.wrap(cdkObject) as?
        CfnServiceNetworkResourceAssociationProps ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnServiceNetworkResourceAssociationProps):
        software.amazon.awscdk.services.vpclattice.CfnServiceNetworkResourceAssociationProps =
        (wrapped as CdkObject).cdkObject as
        software.amazon.awscdk.services.vpclattice.CfnServiceNetworkResourceAssociationProps
  }
}
