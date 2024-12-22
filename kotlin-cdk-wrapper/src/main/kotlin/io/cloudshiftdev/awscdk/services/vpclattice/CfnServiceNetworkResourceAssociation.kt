@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.vpclattice

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.ITaggableV2
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * VpcLattice ServiceNetworkResourceAssociation CFN resource.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.vpclattice.*;
 * CfnServiceNetworkResourceAssociation cfnServiceNetworkResourceAssociation =
 * CfnServiceNetworkResourceAssociation.Builder.create(this, "MyCfnServiceNetworkResourceAssociation")
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
public open class CfnServiceNetworkResourceAssociation(
  cdkObject: software.amazon.awscdk.services.vpclattice.CfnServiceNetworkResourceAssociation,
) : CfnResource(cdkObject),
    IInspectable,
    ITaggableV2 {
  public constructor(scope: CloudshiftdevConstructsConstruct, id: String) :
      this(software.amazon.awscdk.services.vpclattice.CfnServiceNetworkResourceAssociation(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id)
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnServiceNetworkResourceAssociationProps,
  ) :
      this(software.amazon.awscdk.services.vpclattice.CfnServiceNetworkResourceAssociation(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id, props.let(CfnServiceNetworkResourceAssociationProps.Companion::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnServiceNetworkResourceAssociationProps.Builder.() -> Unit,
  ) : this(scope, id, CfnServiceNetworkResourceAssociationProps(props)
  )

  /**
   *
   */
  public open fun attrArn(): String = unwrap(this).getAttrArn()

  /**
   *
   */
  public open fun attrId(): String = unwrap(this).getAttrId()

  /**
   * Tag Manager which manages the tags for this resource.
   */
  public override fun cdkTagManager(): TagManager =
      unwrap(this).getCdkTagManager().let(TagManager::wrap)

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector.Companion::unwrap))
  }

  /**
   *
   */
  public open fun resourceConfigurationId(): String? = unwrap(this).getResourceConfigurationId()

  /**
   *
   */
  public open fun resourceConfigurationId(`value`: String) {
    unwrap(this).setResourceConfigurationId(`value`)
  }

  /**
   *
   */
  public open fun serviceNetworkId(): String? = unwrap(this).getServiceNetworkId()

  /**
   *
   */
  public open fun serviceNetworkId(`value`: String) {
    unwrap(this).setServiceNetworkId(`value`)
  }

  /**
   *
   */
  public open fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   *
   */
  public open fun tags(`value`: List<CfnTag>) {
    unwrap(this).setTags(`value`.map(CfnTag.Companion::unwrap))
  }

  /**
   *
   */
  public open fun tags(vararg `value`: CfnTag): Unit = tags(`value`.toList())

  /**
   * A fluent builder for
   * [io.cloudshiftdev.awscdk.services.vpclattice.CfnServiceNetworkResourceAssociation].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-vpclattice-servicenetworkresourceassociation.html#cfn-vpclattice-servicenetworkresourceassociation-resourceconfigurationid)
     * @param resourceConfigurationId 
     */
    public fun resourceConfigurationId(resourceConfigurationId: String)

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-vpclattice-servicenetworkresourceassociation.html#cfn-vpclattice-servicenetworkresourceassociation-servicenetworkid)
     * @param serviceNetworkId 
     */
    public fun serviceNetworkId(serviceNetworkId: String)

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-vpclattice-servicenetworkresourceassociation.html#cfn-vpclattice-servicenetworkresourceassociation-tags)
     * @param tags 
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-vpclattice-servicenetworkresourceassociation.html#cfn-vpclattice-servicenetworkresourceassociation-tags)
     * @param tags 
     */
    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.vpclattice.CfnServiceNetworkResourceAssociation.Builder =
        software.amazon.awscdk.services.vpclattice.CfnServiceNetworkResourceAssociation.Builder.create(scope,
        id)

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-vpclattice-servicenetworkresourceassociation.html#cfn-vpclattice-servicenetworkresourceassociation-resourceconfigurationid)
     * @param resourceConfigurationId 
     */
    override fun resourceConfigurationId(resourceConfigurationId: String) {
      cdkBuilder.resourceConfigurationId(resourceConfigurationId)
    }

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-vpclattice-servicenetworkresourceassociation.html#cfn-vpclattice-servicenetworkresourceassociation-servicenetworkid)
     * @param serviceNetworkId 
     */
    override fun serviceNetworkId(serviceNetworkId: String) {
      cdkBuilder.serviceNetworkId(serviceNetworkId)
    }

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-vpclattice-servicenetworkresourceassociation.html#cfn-vpclattice-servicenetworkresourceassociation-tags)
     * @param tags 
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag.Companion::unwrap))
    }

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-vpclattice-servicenetworkresourceassociation.html#cfn-vpclattice-servicenetworkresourceassociation-tags)
     * @param tags 
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build():
        software.amazon.awscdk.services.vpclattice.CfnServiceNetworkResourceAssociation =
        cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.vpclattice.CfnServiceNetworkResourceAssociation.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnServiceNetworkResourceAssociation {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnServiceNetworkResourceAssociation(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.vpclattice.CfnServiceNetworkResourceAssociation):
        CfnServiceNetworkResourceAssociation = CfnServiceNetworkResourceAssociation(cdkObject)

    internal fun unwrap(wrapped: CfnServiceNetworkResourceAssociation):
        software.amazon.awscdk.services.vpclattice.CfnServiceNetworkResourceAssociation =
        wrapped.cdkObject as
        software.amazon.awscdk.services.vpclattice.CfnServiceNetworkResourceAssociation
  }
}
