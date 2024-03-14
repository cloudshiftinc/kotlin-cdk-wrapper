package io.cloudshiftdev.awscdk.services.vpclattice

import io.cloudshiftdev.awscdk.CdkObject
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

public interface CfnServiceNetworkVpcAssociationProps {
  /**
   * The IDs of the security groups.
   *
   * Security groups aren't added by default. You can add a security group to apply network level
   * controls to control which resources in a VPC are allowed to access the service network and its
   * services. For more information, see [Control traffic to resources using security
   * groups](https://docs.aws.amazon.com//vpc/latest/userguide/VPC_SecurityGroups.html) in the *Amazon
   * VPC User Guide* .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-vpclattice-servicenetworkvpcassociation.html#cfn-vpclattice-servicenetworkvpcassociation-securitygroupids)
   */
  public fun securityGroupIds(): List<String> = unwrap(this).getSecurityGroupIds() ?: emptyList()

  /**
   * The ID or Amazon Resource Name (ARN) of the service network.
   *
   * You must use the ARN when the resources specified in the operation are in different accounts.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-vpclattice-servicenetworkvpcassociation.html#cfn-vpclattice-servicenetworkvpcassociation-servicenetworkidentifier)
   */
  public fun serviceNetworkIdentifier(): String? = unwrap(this).getServiceNetworkIdentifier()

  /**
   * The tags for the association.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-vpclattice-servicenetworkvpcassociation.html#cfn-vpclattice-servicenetworkvpcassociation-tags)
   */
  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * The ID of the VPC.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-vpclattice-servicenetworkvpcassociation.html#cfn-vpclattice-servicenetworkvpcassociation-vpcidentifier)
   */
  public fun vpcIdentifier(): String? = unwrap(this).getVpcIdentifier()

  /**
   * A builder for [CfnServiceNetworkVpcAssociationProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param securityGroupIds The IDs of the security groups.
     * Security groups aren't added by default. You can add a security group to apply network level
     * controls to control which resources in a VPC are allowed to access the service network and its
     * services. For more information, see [Control traffic to resources using security
     * groups](https://docs.aws.amazon.com//vpc/latest/userguide/VPC_SecurityGroups.html) in the
     * *Amazon VPC User Guide* .
     */
    public fun securityGroupIds(securityGroupIds: List<String>)

    /**
     * @param securityGroupIds The IDs of the security groups.
     * Security groups aren't added by default. You can add a security group to apply network level
     * controls to control which resources in a VPC are allowed to access the service network and its
     * services. For more information, see [Control traffic to resources using security
     * groups](https://docs.aws.amazon.com//vpc/latest/userguide/VPC_SecurityGroups.html) in the
     * *Amazon VPC User Guide* .
     */
    public fun securityGroupIds(vararg securityGroupIds: String)

    /**
     * @param serviceNetworkIdentifier The ID or Amazon Resource Name (ARN) of the service network.
     * You must use the ARN when the resources specified in the operation are in different accounts.
     */
    public fun serviceNetworkIdentifier(serviceNetworkIdentifier: String)

    /**
     * @param tags The tags for the association.
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * @param tags The tags for the association.
     */
    public fun tags(vararg tags: CfnTag)

    /**
     * @param vpcIdentifier The ID of the VPC.
     */
    public fun vpcIdentifier(vpcIdentifier: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.vpclattice.CfnServiceNetworkVpcAssociationProps.Builder =
        software.amazon.awscdk.services.vpclattice.CfnServiceNetworkVpcAssociationProps.builder()

    /**
     * @param securityGroupIds The IDs of the security groups.
     * Security groups aren't added by default. You can add a security group to apply network level
     * controls to control which resources in a VPC are allowed to access the service network and its
     * services. For more information, see [Control traffic to resources using security
     * groups](https://docs.aws.amazon.com//vpc/latest/userguide/VPC_SecurityGroups.html) in the
     * *Amazon VPC User Guide* .
     */
    override fun securityGroupIds(securityGroupIds: List<String>) {
      cdkBuilder.securityGroupIds(securityGroupIds)
    }

    /**
     * @param securityGroupIds The IDs of the security groups.
     * Security groups aren't added by default. You can add a security group to apply network level
     * controls to control which resources in a VPC are allowed to access the service network and its
     * services. For more information, see [Control traffic to resources using security
     * groups](https://docs.aws.amazon.com//vpc/latest/userguide/VPC_SecurityGroups.html) in the
     * *Amazon VPC User Guide* .
     */
    override fun securityGroupIds(vararg securityGroupIds: String): Unit =
        securityGroupIds(securityGroupIds.toList())

    /**
     * @param serviceNetworkIdentifier The ID or Amazon Resource Name (ARN) of the service network.
     * You must use the ARN when the resources specified in the operation are in different accounts.
     */
    override fun serviceNetworkIdentifier(serviceNetworkIdentifier: String) {
      cdkBuilder.serviceNetworkIdentifier(serviceNetworkIdentifier)
    }

    /**
     * @param tags The tags for the association.
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    /**
     * @param tags The tags for the association.
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    /**
     * @param vpcIdentifier The ID of the VPC.
     */
    override fun vpcIdentifier(vpcIdentifier: String) {
      cdkBuilder.vpcIdentifier(vpcIdentifier)
    }

    public fun build():
        software.amazon.awscdk.services.vpclattice.CfnServiceNetworkVpcAssociationProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject:
        software.amazon.awscdk.services.vpclattice.CfnServiceNetworkVpcAssociationProps,
  ) : CdkObject(cdkObject), CfnServiceNetworkVpcAssociationProps {
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
     */
    override fun securityGroupIds(): List<String> = unwrap(this).getSecurityGroupIds() ?:
        emptyList()

    /**
     * The ID or Amazon Resource Name (ARN) of the service network.
     *
     * You must use the ARN when the resources specified in the operation are in different accounts.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-vpclattice-servicenetworkvpcassociation.html#cfn-vpclattice-servicenetworkvpcassociation-servicenetworkidentifier)
     */
    override fun serviceNetworkIdentifier(): String? = unwrap(this).getServiceNetworkIdentifier()

    /**
     * The tags for the association.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-vpclattice-servicenetworkvpcassociation.html#cfn-vpclattice-servicenetworkvpcassociation-tags)
     */
    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

    /**
     * The ID of the VPC.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-vpclattice-servicenetworkvpcassociation.html#cfn-vpclattice-servicenetworkvpcassociation-vpcidentifier)
     */
    override fun vpcIdentifier(): String? = unwrap(this).getVpcIdentifier()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}):
        CfnServiceNetworkVpcAssociationProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.vpclattice.CfnServiceNetworkVpcAssociationProps):
        CfnServiceNetworkVpcAssociationProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnServiceNetworkVpcAssociationProps):
        software.amazon.awscdk.services.vpclattice.CfnServiceNetworkVpcAssociationProps = (wrapped
        as CdkObject).cdkObject as
        software.amazon.awscdk.services.vpclattice.CfnServiceNetworkVpcAssociationProps
  }
}
