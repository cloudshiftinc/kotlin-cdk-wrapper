@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.redshift

import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

/**
 * Properties for defining a `CfnEndpointAuthorization`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.redshift.*;
 * CfnEndpointAuthorizationProps cfnEndpointAuthorizationProps =
 * CfnEndpointAuthorizationProps.builder()
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
public interface CfnEndpointAuthorizationProps {
  /**
   * The AWS account ID of either the cluster owner (grantor) or grantee.
   *
   * If `Grantee` parameter is true, then the `Account` value is of the grantor.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-endpointauthorization.html#cfn-redshift-endpointauthorization-account)
   */
  public fun account(): String

  /**
   * The cluster identifier.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-endpointauthorization.html#cfn-redshift-endpointauthorization-clusteridentifier)
   */
  public fun clusterIdentifier(): String

  /**
   * Indicates whether to force the revoke action.
   *
   * If true, the Redshift-managed VPC endpoints associated with the endpoint authorization are also
   * deleted.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-endpointauthorization.html#cfn-redshift-endpointauthorization-force)
   */
  public fun force(): Any? = unwrap(this).getForce()

  /**
   * The virtual private cloud (VPC) identifiers to grant access to.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-endpointauthorization.html#cfn-redshift-endpointauthorization-vpcids)
   */
  public fun vpcIds(): List<String> = unwrap(this).getVpcIds() ?: emptyList()

  /**
   * A builder for [CfnEndpointAuthorizationProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param account The AWS account ID of either the cluster owner (grantor) or grantee. 
     * If `Grantee` parameter is true, then the `Account` value is of the grantor.
     */
    public fun account(account: String)

    /**
     * @param clusterIdentifier The cluster identifier. 
     */
    public fun clusterIdentifier(clusterIdentifier: String)

    /**
     * @param force Indicates whether to force the revoke action.
     * If true, the Redshift-managed VPC endpoints associated with the endpoint authorization are
     * also deleted.
     */
    public fun force(force: Boolean)

    /**
     * @param force Indicates whether to force the revoke action.
     * If true, the Redshift-managed VPC endpoints associated with the endpoint authorization are
     * also deleted.
     */
    public fun force(force: IResolvable)

    /**
     * @param vpcIds The virtual private cloud (VPC) identifiers to grant access to.
     */
    public fun vpcIds(vpcIds: List<String>)

    /**
     * @param vpcIds The virtual private cloud (VPC) identifiers to grant access to.
     */
    public fun vpcIds(vararg vpcIds: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.redshift.CfnEndpointAuthorizationProps.Builder =
        software.amazon.awscdk.services.redshift.CfnEndpointAuthorizationProps.builder()

    /**
     * @param account The AWS account ID of either the cluster owner (grantor) or grantee. 
     * If `Grantee` parameter is true, then the `Account` value is of the grantor.
     */
    override fun account(account: String) {
      cdkBuilder.account(account)
    }

    /**
     * @param clusterIdentifier The cluster identifier. 
     */
    override fun clusterIdentifier(clusterIdentifier: String) {
      cdkBuilder.clusterIdentifier(clusterIdentifier)
    }

    /**
     * @param force Indicates whether to force the revoke action.
     * If true, the Redshift-managed VPC endpoints associated with the endpoint authorization are
     * also deleted.
     */
    override fun force(force: Boolean) {
      cdkBuilder.force(force)
    }

    /**
     * @param force Indicates whether to force the revoke action.
     * If true, the Redshift-managed VPC endpoints associated with the endpoint authorization are
     * also deleted.
     */
    override fun force(force: IResolvable) {
      cdkBuilder.force(force.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param vpcIds The virtual private cloud (VPC) identifiers to grant access to.
     */
    override fun vpcIds(vpcIds: List<String>) {
      cdkBuilder.vpcIds(vpcIds)
    }

    /**
     * @param vpcIds The virtual private cloud (VPC) identifiers to grant access to.
     */
    override fun vpcIds(vararg vpcIds: String): Unit = vpcIds(vpcIds.toList())

    public fun build(): software.amazon.awscdk.services.redshift.CfnEndpointAuthorizationProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.redshift.CfnEndpointAuthorizationProps,
  ) : CdkObject(cdkObject), CfnEndpointAuthorizationProps {
    /**
     * The AWS account ID of either the cluster owner (grantor) or grantee.
     *
     * If `Grantee` parameter is true, then the `Account` value is of the grantor.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-endpointauthorization.html#cfn-redshift-endpointauthorization-account)
     */
    override fun account(): String = unwrap(this).getAccount()

    /**
     * The cluster identifier.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-endpointauthorization.html#cfn-redshift-endpointauthorization-clusteridentifier)
     */
    override fun clusterIdentifier(): String = unwrap(this).getClusterIdentifier()

    /**
     * Indicates whether to force the revoke action.
     *
     * If true, the Redshift-managed VPC endpoints associated with the endpoint authorization are
     * also deleted.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-endpointauthorization.html#cfn-redshift-endpointauthorization-force)
     */
    override fun force(): Any? = unwrap(this).getForce()

    /**
     * The virtual private cloud (VPC) identifiers to grant access to.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-endpointauthorization.html#cfn-redshift-endpointauthorization-vpcids)
     */
    override fun vpcIds(): List<String> = unwrap(this).getVpcIds() ?: emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnEndpointAuthorizationProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.redshift.CfnEndpointAuthorizationProps):
        CfnEndpointAuthorizationProps = CdkObjectWrappers.wrap(cdkObject) as?
        CfnEndpointAuthorizationProps ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnEndpointAuthorizationProps):
        software.amazon.awscdk.services.redshift.CfnEndpointAuthorizationProps = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.redshift.CfnEndpointAuthorizationProps
  }
}
