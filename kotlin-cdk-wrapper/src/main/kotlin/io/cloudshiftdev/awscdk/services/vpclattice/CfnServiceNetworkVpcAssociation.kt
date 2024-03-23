@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.vpclattice

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.ITaggable
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * Associates a VPC with a service network.
 *
 * When you associate a VPC with the service network, it enables all the resources within that VPC
 * to be clients and communicate with other services in the service network. For more information, see
 * [Manage VPC
 * associations](https://docs.aws.amazon.com/vpc-lattice/latest/ug/service-network-associations.html#service-network-vpc-associations)
 * in the *Amazon VPC Lattice User Guide* .
 *
 * You can't use this operation if there is a disassociation in progress. If the association fails,
 * retry by deleting the association and recreating it.
 *
 * As a result of this operation, the association gets created in the service network account and
 * the VPC owner account.
 *
 * If you add a security group to the service network and VPC association, the association must
 * continue to always have at least one security group. You can add or edit security groups at any
 * time. However, to remove all security groups, you must first delete the association and recreate it
 * without security groups.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.vpclattice.*;
 * CfnServiceNetworkVpcAssociation cfnServiceNetworkVpcAssociation =
 * CfnServiceNetworkVpcAssociation.Builder.create(this, "MyCfnServiceNetworkVpcAssociation")
 * .securityGroupIds(List.of("securityGroupIds"))
 * .serviceNetworkIdentifier("serviceNetworkIdentifier")
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .vpcIdentifier("vpcIdentifier")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-vpclattice-servicenetworkvpcassociation.html)
 */
public open class CfnServiceNetworkVpcAssociation(
  cdkObject: software.amazon.awscdk.services.vpclattice.CfnServiceNetworkVpcAssociation,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  public constructor(scope: CloudshiftdevConstructsConstruct, id: String) :
      this(software.amazon.awscdk.services.vpclattice.CfnServiceNetworkVpcAssociation(scope.let(CloudshiftdevConstructsConstruct::unwrap),
      id)
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnServiceNetworkVpcAssociationProps,
  ) :
      this(software.amazon.awscdk.services.vpclattice.CfnServiceNetworkVpcAssociation(scope.let(CloudshiftdevConstructsConstruct::unwrap),
      id, props.let(CfnServiceNetworkVpcAssociationProps::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnServiceNetworkVpcAssociationProps.Builder.() -> Unit,
  ) : this(scope, id, CfnServiceNetworkVpcAssociationProps(props)
  )

  /**
   * The Amazon Resource Name (ARN) of the association between the service network and the VPC.
   */
  public open fun attrArn(): String = unwrap(this).getAttrArn()

  /**
   * The date and time that the association was created, specified in ISO-8601 format.
   */
  public open fun attrCreatedAt(): String = unwrap(this).getAttrCreatedAt()

  /**
   * The ID of the specified association between the service network and the VPC.
   */
  public open fun attrId(): String = unwrap(this).getAttrId()

  /**
   * The Amazon Resource Name (ARN) of the service network.
   */
  public open fun attrServiceNetworkArn(): String = unwrap(this).getAttrServiceNetworkArn()

  /**
   * The ID of the service network.
   */
  public open fun attrServiceNetworkId(): String = unwrap(this).getAttrServiceNetworkId()

  /**
   * The name of the service network.
   */
  public open fun attrServiceNetworkName(): String = unwrap(this).getAttrServiceNetworkName()

  /**
   * The status of the association.
   */
  public open fun attrStatus(): String = unwrap(this).getAttrStatus()

  /**
   * The ID of the VPC.
   */
  public open fun attrVpcId(): String = unwrap(this).getAttrVpcId()

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  /**
   * The IDs of the security groups.
   */
  public open fun securityGroupIds(): List<String> = unwrap(this).getSecurityGroupIds() ?:
      emptyList()

  /**
   * The IDs of the security groups.
   */
  public open fun securityGroupIds(`value`: List<String>) {
    unwrap(this).setSecurityGroupIds(`value`)
  }

  /**
   * The IDs of the security groups.
   */
  public open fun securityGroupIds(vararg `value`: String): Unit =
      securityGroupIds(`value`.toList())

  /**
   * The ID or Amazon Resource Name (ARN) of the service network.
   */
  public open fun serviceNetworkIdentifier(): String? = unwrap(this).getServiceNetworkIdentifier()

  /**
   * The ID or Amazon Resource Name (ARN) of the service network.
   */
  public open fun serviceNetworkIdentifier(`value`: String) {
    unwrap(this).setServiceNetworkIdentifier(`value`)
  }

  /**
   * Tag Manager which manages the tags for this resource.
   */
  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  /**
   * The tags for the association.
   */
  public open fun tagsRaw(): List<CfnTag> = unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?:
      emptyList()

  /**
   * The tags for the association.
   */
  public open fun tagsRaw(`value`: List<CfnTag>) {
    unwrap(this).setTagsRaw(`value`.map(CfnTag::unwrap))
  }

  /**
   * The tags for the association.
   */
  public open fun tagsRaw(vararg `value`: CfnTag): Unit = tagsRaw(`value`.toList())

  /**
   * The ID of the VPC.
   */
  public open fun vpcIdentifier(): String? = unwrap(this).getVpcIdentifier()

  /**
   * The ID of the VPC.
   */
  public open fun vpcIdentifier(`value`: String) {
    unwrap(this).setVpcIdentifier(`value`)
  }

  /**
   * A fluent builder for
   * [io.cloudshiftdev.awscdk.services.vpclattice.CfnServiceNetworkVpcAssociation].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The IDs of the security groups.
     *
     * Security groups aren't added by default. You can add a security group to apply network level
     * controls to control which resources in a VPC are allowed to access the service network and its
     * services. For more information, see [Control traffic to resources using security
     * groups](https://docs.aws.amazon.com//vpc/latest/userguide/VPC_SecurityGroups.html) in the
     * *Amazon VPC User Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-vpclattice-servicenetworkvpcassociation.html#cfn-vpclattice-servicenetworkvpcassociation-securitygroupids)
     * @param securityGroupIds The IDs of the security groups. 
     */
    public fun securityGroupIds(securityGroupIds: List<String>)

    /**
     * The IDs of the security groups.
     *
     * Security groups aren't added by default. You can add a security group to apply network level
     * controls to control which resources in a VPC are allowed to access the service network and its
     * services. For more information, see [Control traffic to resources using security
     * groups](https://docs.aws.amazon.com//vpc/latest/userguide/VPC_SecurityGroups.html) in the
     * *Amazon VPC User Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-vpclattice-servicenetworkvpcassociation.html#cfn-vpclattice-servicenetworkvpcassociation-securitygroupids)
     * @param securityGroupIds The IDs of the security groups. 
     */
    public fun securityGroupIds(vararg securityGroupIds: String)

    /**
     * The ID or Amazon Resource Name (ARN) of the service network.
     *
     * You must use the ARN when the resources specified in the operation are in different accounts.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-vpclattice-servicenetworkvpcassociation.html#cfn-vpclattice-servicenetworkvpcassociation-servicenetworkidentifier)
     * @param serviceNetworkIdentifier The ID or Amazon Resource Name (ARN) of the service network. 
     */
    public fun serviceNetworkIdentifier(serviceNetworkIdentifier: String)

    /**
     * The tags for the association.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-vpclattice-servicenetworkvpcassociation.html#cfn-vpclattice-servicenetworkvpcassociation-tags)
     * @param tags The tags for the association. 
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * The tags for the association.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-vpclattice-servicenetworkvpcassociation.html#cfn-vpclattice-servicenetworkvpcassociation-tags)
     * @param tags The tags for the association. 
     */
    public fun tags(vararg tags: CfnTag)

    /**
     * The ID of the VPC.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-vpclattice-servicenetworkvpcassociation.html#cfn-vpclattice-servicenetworkvpcassociation-vpcidentifier)
     * @param vpcIdentifier The ID of the VPC. 
     */
    public fun vpcIdentifier(vpcIdentifier: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.vpclattice.CfnServiceNetworkVpcAssociation.Builder =
        software.amazon.awscdk.services.vpclattice.CfnServiceNetworkVpcAssociation.Builder.create(scope,
        id)

    /**
     * The IDs of the security groups.
     *
     * Security groups aren't added by default. You can add a security group to apply network level
     * controls to control which resources in a VPC are allowed to access the service network and its
     * services. For more information, see [Control traffic to resources using security
     * groups](https://docs.aws.amazon.com//vpc/latest/userguide/VPC_SecurityGroups.html) in the
     * *Amazon VPC User Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-vpclattice-servicenetworkvpcassociation.html#cfn-vpclattice-servicenetworkvpcassociation-securitygroupids)
     * @param securityGroupIds The IDs of the security groups. 
     */
    override fun securityGroupIds(securityGroupIds: List<String>) {
      cdkBuilder.securityGroupIds(securityGroupIds)
    }

    /**
     * The IDs of the security groups.
     *
     * Security groups aren't added by default. You can add a security group to apply network level
     * controls to control which resources in a VPC are allowed to access the service network and its
     * services. For more information, see [Control traffic to resources using security
     * groups](https://docs.aws.amazon.com//vpc/latest/userguide/VPC_SecurityGroups.html) in the
     * *Amazon VPC User Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-vpclattice-servicenetworkvpcassociation.html#cfn-vpclattice-servicenetworkvpcassociation-securitygroupids)
     * @param securityGroupIds The IDs of the security groups. 
     */
    override fun securityGroupIds(vararg securityGroupIds: String): Unit =
        securityGroupIds(securityGroupIds.toList())

    /**
     * The ID or Amazon Resource Name (ARN) of the service network.
     *
     * You must use the ARN when the resources specified in the operation are in different accounts.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-vpclattice-servicenetworkvpcassociation.html#cfn-vpclattice-servicenetworkvpcassociation-servicenetworkidentifier)
     * @param serviceNetworkIdentifier The ID or Amazon Resource Name (ARN) of the service network. 
     */
    override fun serviceNetworkIdentifier(serviceNetworkIdentifier: String) {
      cdkBuilder.serviceNetworkIdentifier(serviceNetworkIdentifier)
    }

    /**
     * The tags for the association.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-vpclattice-servicenetworkvpcassociation.html#cfn-vpclattice-servicenetworkvpcassociation-tags)
     * @param tags The tags for the association. 
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    /**
     * The tags for the association.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-vpclattice-servicenetworkvpcassociation.html#cfn-vpclattice-servicenetworkvpcassociation-tags)
     * @param tags The tags for the association. 
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    /**
     * The ID of the VPC.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-vpclattice-servicenetworkvpcassociation.html#cfn-vpclattice-servicenetworkvpcassociation-vpcidentifier)
     * @param vpcIdentifier The ID of the VPC. 
     */
    override fun vpcIdentifier(vpcIdentifier: String) {
      cdkBuilder.vpcIdentifier(vpcIdentifier)
    }

    public fun build(): software.amazon.awscdk.services.vpclattice.CfnServiceNetworkVpcAssociation =
        cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.vpclattice.CfnServiceNetworkVpcAssociation.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnServiceNetworkVpcAssociation {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnServiceNetworkVpcAssociation(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.vpclattice.CfnServiceNetworkVpcAssociation):
        CfnServiceNetworkVpcAssociation = CfnServiceNetworkVpcAssociation(cdkObject)

    internal fun unwrap(wrapped: CfnServiceNetworkVpcAssociation):
        software.amazon.awscdk.services.vpclattice.CfnServiceNetworkVpcAssociation =
        wrapped.cdkObject as
        software.amazon.awscdk.services.vpclattice.CfnServiceNetworkVpcAssociation
  }
}
