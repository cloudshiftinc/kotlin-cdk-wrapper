@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.cloudassembly.schema

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.Map

/**
 * Query input for looking up a VPC.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.cloudassembly.schema.*;
 * VpcContextQuery vpcContextQuery = VpcContextQuery.builder()
 * .account("account")
 * .filter(Map.of(
 * "filterKey", "filter"))
 * .region("region")
 * // the properties below are optional
 * .lookupRoleArn("lookupRoleArn")
 * .returnAsymmetricSubnets(false)
 * .returnVpnGateways(false)
 * .subnetGroupNameTag("subnetGroupNameTag")
 * .build();
 * ```
 */
public interface VpcContextQuery {
  /**
   * Query account.
   */
  public fun account(): String

  /**
   * Filters to apply to the VPC.
   *
   * Filter parameters are the same as passed to DescribeVpcs.
   *
   * [Documentation](https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_DescribeVpcs.html)
   */
  public fun filter(): Map<String, String>

  /**
   * The ARN of the role that should be used to look up the missing values.
   *
   * Default: - None
   */
  public fun lookupRoleArn(): String? = unwrap(this).getLookupRoleArn()

  /**
   * Query region.
   */
  public fun region(): String

  /**
   * Whether to populate the subnetGroups field of the `VpcContextResponse`, which contains
   * potentially asymmetric subnet groups.
   *
   * Default: false
   */
  public fun returnAsymmetricSubnets(): Boolean? = unwrap(this).getReturnAsymmetricSubnets()

  /**
   * Whether to populate the `vpnGatewayId` field of the `VpcContextResponse`, which contains the
   * VPN Gateway ID, if one exists.
   *
   * You can explicitly
   * disable this in order to avoid the lookup if you know the VPC does not have
   * a VPN Gatway attached.
   *
   * Default: true
   */
  public fun returnVpnGateways(): Boolean? = unwrap(this).getReturnVpnGateways()

  /**
   * Optional tag for subnet group name.
   *
   * If not provided, we'll look at the aws-cdk:subnet-name tag.
   * If the subnet does not have the specified tag,
   * we'll use its type as the name.
   *
   * Default: 'aws-cdk:subnet-name'
   */
  public fun subnetGroupNameTag(): String? = unwrap(this).getSubnetGroupNameTag()

  /**
   * A builder for [VpcContextQuery]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param account Query account. 
     */
    public fun account(account: String)

    /**
     * @param filter Filters to apply to the VPC. 
     * Filter parameters are the same as passed to DescribeVpcs.
     */
    public fun filter(filter: Map<String, String>)

    /**
     * @param lookupRoleArn The ARN of the role that should be used to look up the missing values.
     */
    public fun lookupRoleArn(lookupRoleArn: String)

    /**
     * @param region Query region. 
     */
    public fun region(region: String)

    /**
     * @param returnAsymmetricSubnets Whether to populate the subnetGroups field of the
     * `VpcContextResponse`, which contains potentially asymmetric subnet groups.
     */
    public fun returnAsymmetricSubnets(returnAsymmetricSubnets: Boolean)

    /**
     * @param returnVpnGateways Whether to populate the `vpnGatewayId` field of the
     * `VpcContextResponse`, which contains the VPN Gateway ID, if one exists.
     * You can explicitly
     * disable this in order to avoid the lookup if you know the VPC does not have
     * a VPN Gatway attached.
     */
    public fun returnVpnGateways(returnVpnGateways: Boolean)

    /**
     * @param subnetGroupNameTag Optional tag for subnet group name.
     * If not provided, we'll look at the aws-cdk:subnet-name tag.
     * If the subnet does not have the specified tag,
     * we'll use its type as the name.
     */
    public fun subnetGroupNameTag(subnetGroupNameTag: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.cloudassembly.schema.VpcContextQuery.Builder =
        software.amazon.awscdk.cloudassembly.schema.VpcContextQuery.builder()

    /**
     * @param account Query account. 
     */
    override fun account(account: String) {
      cdkBuilder.account(account)
    }

    /**
     * @param filter Filters to apply to the VPC. 
     * Filter parameters are the same as passed to DescribeVpcs.
     */
    override fun filter(filter: Map<String, String>) {
      cdkBuilder.filter(filter)
    }

    /**
     * @param lookupRoleArn The ARN of the role that should be used to look up the missing values.
     */
    override fun lookupRoleArn(lookupRoleArn: String) {
      cdkBuilder.lookupRoleArn(lookupRoleArn)
    }

    /**
     * @param region Query region. 
     */
    override fun region(region: String) {
      cdkBuilder.region(region)
    }

    /**
     * @param returnAsymmetricSubnets Whether to populate the subnetGroups field of the
     * `VpcContextResponse`, which contains potentially asymmetric subnet groups.
     */
    override fun returnAsymmetricSubnets(returnAsymmetricSubnets: Boolean) {
      cdkBuilder.returnAsymmetricSubnets(returnAsymmetricSubnets)
    }

    /**
     * @param returnVpnGateways Whether to populate the `vpnGatewayId` field of the
     * `VpcContextResponse`, which contains the VPN Gateway ID, if one exists.
     * You can explicitly
     * disable this in order to avoid the lookup if you know the VPC does not have
     * a VPN Gatway attached.
     */
    override fun returnVpnGateways(returnVpnGateways: Boolean) {
      cdkBuilder.returnVpnGateways(returnVpnGateways)
    }

    /**
     * @param subnetGroupNameTag Optional tag for subnet group name.
     * If not provided, we'll look at the aws-cdk:subnet-name tag.
     * If the subnet does not have the specified tag,
     * we'll use its type as the name.
     */
    override fun subnetGroupNameTag(subnetGroupNameTag: String) {
      cdkBuilder.subnetGroupNameTag(subnetGroupNameTag)
    }

    public fun build(): software.amazon.awscdk.cloudassembly.schema.VpcContextQuery =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.cloudassembly.schema.VpcContextQuery,
  ) : CdkObject(cdkObject), VpcContextQuery {
    /**
     * Query account.
     */
    override fun account(): String = unwrap(this).getAccount()

    /**
     * Filters to apply to the VPC.
     *
     * Filter parameters are the same as passed to DescribeVpcs.
     *
     * [Documentation](https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_DescribeVpcs.html)
     */
    override fun filter(): Map<String, String> = unwrap(this).getFilter() ?: emptyMap()

    /**
     * The ARN of the role that should be used to look up the missing values.
     *
     * Default: - None
     */
    override fun lookupRoleArn(): String? = unwrap(this).getLookupRoleArn()

    /**
     * Query region.
     */
    override fun region(): String = unwrap(this).getRegion()

    /**
     * Whether to populate the subnetGroups field of the `VpcContextResponse`, which contains
     * potentially asymmetric subnet groups.
     *
     * Default: false
     */
    override fun returnAsymmetricSubnets(): Boolean? = unwrap(this).getReturnAsymmetricSubnets()

    /**
     * Whether to populate the `vpnGatewayId` field of the `VpcContextResponse`, which contains the
     * VPN Gateway ID, if one exists.
     *
     * You can explicitly
     * disable this in order to avoid the lookup if you know the VPC does not have
     * a VPN Gatway attached.
     *
     * Default: true
     */
    override fun returnVpnGateways(): Boolean? = unwrap(this).getReturnVpnGateways()

    /**
     * Optional tag for subnet group name.
     *
     * If not provided, we'll look at the aws-cdk:subnet-name tag.
     * If the subnet does not have the specified tag,
     * we'll use its type as the name.
     *
     * Default: 'aws-cdk:subnet-name'
     */
    override fun subnetGroupNameTag(): String? = unwrap(this).getSubnetGroupNameTag()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): VpcContextQuery {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.cloudassembly.schema.VpcContextQuery):
        VpcContextQuery = CdkObjectWrappers.wrap(cdkObject) as? VpcContextQuery ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: VpcContextQuery):
        software.amazon.awscdk.cloudassembly.schema.VpcContextQuery = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.cloudassembly.schema.VpcContextQuery
  }
}
