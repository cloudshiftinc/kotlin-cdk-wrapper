@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.redshift

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.redshift.CfnEndpointAuthorization
import software.constructs.Construct

/**
 * Describes an endpoint authorization for authorizing Redshift-managed VPC endpoint access to a
 * cluster across AWS accounts .
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.redshift.*;
 * CfnEndpointAuthorization cfnEndpointAuthorization = CfnEndpointAuthorization.Builder.create(this,
 * "MyCfnEndpointAuthorization")
 * .account("account")
 * .clusterIdentifier("clusterIdentifier")
 * // the properties below are optional
 * .force(false)
 * .vpcIds(List.of("vpcIds"))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-endpointauthorization.html)
 */
@CdkDslMarker
public class CfnEndpointAuthorizationDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: CfnEndpointAuthorization.Builder =
      CfnEndpointAuthorization.Builder.create(scope, id)

  private val _vpcIds: MutableList<String> = mutableListOf()

  /**
   * The AWS account ID of either the cluster owner (grantor) or grantee.
   *
   * If `Grantee` parameter is true, then the `Account` value is of the grantor.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-endpointauthorization.html#cfn-redshift-endpointauthorization-account)
   * @param account The AWS account ID of either the cluster owner (grantor) or grantee. 
   */
  public fun account(account: String) {
    cdkBuilder.account(account)
  }

  /**
   * The cluster identifier.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-endpointauthorization.html#cfn-redshift-endpointauthorization-clusteridentifier)
   * @param clusterIdentifier The cluster identifier. 
   */
  public fun clusterIdentifier(clusterIdentifier: String) {
    cdkBuilder.clusterIdentifier(clusterIdentifier)
  }

  /**
   * Indicates whether to force the revoke action.
   *
   * If true, the Redshift-managed VPC endpoints associated with the endpoint authorization are also
   * deleted.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-endpointauthorization.html#cfn-redshift-endpointauthorization-force)
   * @param force Indicates whether to force the revoke action. 
   */
  public fun force(force: Boolean) {
    cdkBuilder.force(force)
  }

  /**
   * Indicates whether to force the revoke action.
   *
   * If true, the Redshift-managed VPC endpoints associated with the endpoint authorization are also
   * deleted.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-endpointauthorization.html#cfn-redshift-endpointauthorization-force)
   * @param force Indicates whether to force the revoke action. 
   */
  public fun force(force: IResolvable) {
    cdkBuilder.force(force)
  }

  /**
   * The virtual private cloud (VPC) identifiers to grant access to.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-endpointauthorization.html#cfn-redshift-endpointauthorization-vpcids)
   * @param vpcIds The virtual private cloud (VPC) identifiers to grant access to. 
   */
  public fun vpcIds(vararg vpcIds: String) {
    _vpcIds.addAll(listOf(*vpcIds))
  }

  /**
   * The virtual private cloud (VPC) identifiers to grant access to.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-endpointauthorization.html#cfn-redshift-endpointauthorization-vpcids)
   * @param vpcIds The virtual private cloud (VPC) identifiers to grant access to. 
   */
  public fun vpcIds(vpcIds: Collection<String>) {
    _vpcIds.addAll(vpcIds)
  }

  public fun build(): CfnEndpointAuthorization {
    if(_vpcIds.isNotEmpty()) cdkBuilder.vpcIds(_vpcIds)
    return cdkBuilder.build()
  }
}
