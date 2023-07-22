@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.vpclattice

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.dsl.CfnTagDsl
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.services.vpclattice.CfnServiceNetworkVpcAssociation
import software.constructs.Construct

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
 * import software.amazon.awscdk.services.vpclattice.*;
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
@CdkDslMarker
public class CfnServiceNetworkVpcAssociationDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: CfnServiceNetworkVpcAssociation.Builder =
      CfnServiceNetworkVpcAssociation.Builder.create(scope, id)

  private val _securityGroupIds: MutableList<String> = mutableListOf()

  private val _tags: MutableList<CfnTag> = mutableListOf()

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
   * @param securityGroupIds The IDs of the security groups. 
   */
  public fun securityGroupIds(vararg securityGroupIds: String) {
    _securityGroupIds.addAll(listOf(*securityGroupIds))
  }

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
   * @param securityGroupIds The IDs of the security groups. 
   */
  public fun securityGroupIds(securityGroupIds: Collection<String>) {
    _securityGroupIds.addAll(securityGroupIds)
  }

  /**
   * The ID or Amazon Resource Name (ARN) of the service network.
   *
   * You must use the ARN when the resources specified in the operation are in different accounts.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-vpclattice-servicenetworkvpcassociation.html#cfn-vpclattice-servicenetworkvpcassociation-servicenetworkidentifier)
   * @param serviceNetworkIdentifier The ID or Amazon Resource Name (ARN) of the service network. 
   */
  public fun serviceNetworkIdentifier(serviceNetworkIdentifier: String) {
    cdkBuilder.serviceNetworkIdentifier(serviceNetworkIdentifier)
  }

  /**
   * The tags for the association.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-vpclattice-servicenetworkvpcassociation.html#cfn-vpclattice-servicenetworkvpcassociation-tags)
   * @param tags The tags for the association. 
   */
  public fun tags(tags: CfnTagDsl.() -> Unit) {
    _tags.add(CfnTagDsl().apply(tags).build())
  }

  /**
   * The tags for the association.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-vpclattice-servicenetworkvpcassociation.html#cfn-vpclattice-servicenetworkvpcassociation-tags)
   * @param tags The tags for the association. 
   */
  public fun tags(tags: Collection<CfnTag>) {
    _tags.addAll(tags)
  }

  /**
   * The ID of the VPC.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-vpclattice-servicenetworkvpcassociation.html#cfn-vpclattice-servicenetworkvpcassociation-vpcidentifier)
   * @param vpcIdentifier The ID of the VPC. 
   */
  public fun vpcIdentifier(vpcIdentifier: String) {
    cdkBuilder.vpcIdentifier(vpcIdentifier)
  }

  public fun build(): CfnServiceNetworkVpcAssociation {
    if(_securityGroupIds.isNotEmpty()) cdkBuilder.securityGroupIds(_securityGroupIds)
    if(_tags.isNotEmpty()) cdkBuilder.tags(_tags)
    return cdkBuilder.build()
  }
}
