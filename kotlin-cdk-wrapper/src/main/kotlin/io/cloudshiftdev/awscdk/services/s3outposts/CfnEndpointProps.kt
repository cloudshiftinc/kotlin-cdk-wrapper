@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.s3outposts

import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmName

/**
 * Properties for defining a `CfnEndpoint`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.s3outposts.*;
 * CfnEndpointProps cfnEndpointProps = CfnEndpointProps.builder()
 * .outpostId("outpostId")
 * .securityGroupId("securityGroupId")
 * .subnetId("subnetId")
 * // the properties below are optional
 * .accessType("accessType")
 * .customerOwnedIpv4Pool("customerOwnedIpv4Pool")
 * .failedReason(FailedReasonProperty.builder()
 * .errorCode("errorCode")
 * .message("message")
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-s3outposts-endpoint.html)
 */
public interface CfnEndpointProps {
  /**
   * The container for the type of connectivity used to access the Amazon S3 on Outposts endpoint.
   *
   * To use the Amazon VPC , choose `Private` . To use the endpoint with an on-premises network,
   * choose `CustomerOwnedIp` . If you choose `CustomerOwnedIp` , you must also provide the
   * customer-owned IP address pool (CoIP pool).
   *
   *
   * `Private` is the default access type value.
   *
   *
   * Default: - "Private"
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-s3outposts-endpoint.html#cfn-s3outposts-endpoint-accesstype)
   */
  public fun accessType(): String? = unwrap(this).getAccessType()

  /**
   * The ID of the customer-owned IPv4 address pool (CoIP pool) for the endpoint.
   *
   * IP addresses are allocated from this pool for the endpoint.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-s3outposts-endpoint.html#cfn-s3outposts-endpoint-customerownedipv4pool)
   */
  public fun customerOwnedIpv4Pool(): String? = unwrap(this).getCustomerOwnedIpv4Pool()

  /**
   * The failure reason, if any, for a create or delete endpoint operation.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-s3outposts-endpoint.html#cfn-s3outposts-endpoint-failedreason)
   */
  public fun failedReason(): Any? = unwrap(this).getFailedReason()

  /**
   * The ID of the Outpost.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-s3outposts-endpoint.html#cfn-s3outposts-endpoint-outpostid)
   */
  public fun outpostId(): String

  /**
   * The ID of the security group used for the endpoint.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-s3outposts-endpoint.html#cfn-s3outposts-endpoint-securitygroupid)
   */
  public fun securityGroupId(): String

  /**
   * The ID of the subnet used for the endpoint.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-s3outposts-endpoint.html#cfn-s3outposts-endpoint-subnetid)
   */
  public fun subnetId(): String

  /**
   * A builder for [CfnEndpointProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param accessType The container for the type of connectivity used to access the Amazon S3 on
     * Outposts endpoint.
     * To use the Amazon VPC , choose `Private` . To use the endpoint with an on-premises network,
     * choose `CustomerOwnedIp` . If you choose `CustomerOwnedIp` , you must also provide the
     * customer-owned IP address pool (CoIP pool).
     *
     *
     * `Private` is the default access type value.
     */
    public fun accessType(accessType: String)

    /**
     * @param customerOwnedIpv4Pool The ID of the customer-owned IPv4 address pool (CoIP pool) for
     * the endpoint.
     * IP addresses are allocated from this pool for the endpoint.
     */
    public fun customerOwnedIpv4Pool(customerOwnedIpv4Pool: String)

    /**
     * @param failedReason The failure reason, if any, for a create or delete endpoint operation.
     */
    public fun failedReason(failedReason: IResolvable)

    /**
     * @param failedReason The failure reason, if any, for a create or delete endpoint operation.
     */
    public fun failedReason(failedReason: CfnEndpoint.FailedReasonProperty)

    /**
     * @param failedReason The failure reason, if any, for a create or delete endpoint operation.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("9c3d089c3e8c476b9e0b8ed9c67237d0b84df83caf99db01bf3d9f2b32b5082d")
    public fun failedReason(failedReason: CfnEndpoint.FailedReasonProperty.Builder.() -> Unit)

    /**
     * @param outpostId The ID of the Outpost. 
     */
    public fun outpostId(outpostId: String)

    /**
     * @param securityGroupId The ID of the security group used for the endpoint. 
     */
    public fun securityGroupId(securityGroupId: String)

    /**
     * @param subnetId The ID of the subnet used for the endpoint. 
     */
    public fun subnetId(subnetId: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.s3outposts.CfnEndpointProps.Builder =
        software.amazon.awscdk.services.s3outposts.CfnEndpointProps.builder()

    /**
     * @param accessType The container for the type of connectivity used to access the Amazon S3 on
     * Outposts endpoint.
     * To use the Amazon VPC , choose `Private` . To use the endpoint with an on-premises network,
     * choose `CustomerOwnedIp` . If you choose `CustomerOwnedIp` , you must also provide the
     * customer-owned IP address pool (CoIP pool).
     *
     *
     * `Private` is the default access type value.
     */
    override fun accessType(accessType: String) {
      cdkBuilder.accessType(accessType)
    }

    /**
     * @param customerOwnedIpv4Pool The ID of the customer-owned IPv4 address pool (CoIP pool) for
     * the endpoint.
     * IP addresses are allocated from this pool for the endpoint.
     */
    override fun customerOwnedIpv4Pool(customerOwnedIpv4Pool: String) {
      cdkBuilder.customerOwnedIpv4Pool(customerOwnedIpv4Pool)
    }

    /**
     * @param failedReason The failure reason, if any, for a create or delete endpoint operation.
     */
    override fun failedReason(failedReason: IResolvable) {
      cdkBuilder.failedReason(failedReason.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param failedReason The failure reason, if any, for a create or delete endpoint operation.
     */
    override fun failedReason(failedReason: CfnEndpoint.FailedReasonProperty) {
      cdkBuilder.failedReason(failedReason.let(CfnEndpoint.FailedReasonProperty.Companion::unwrap))
    }

    /**
     * @param failedReason The failure reason, if any, for a create or delete endpoint operation.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("9c3d089c3e8c476b9e0b8ed9c67237d0b84df83caf99db01bf3d9f2b32b5082d")
    override fun failedReason(failedReason: CfnEndpoint.FailedReasonProperty.Builder.() -> Unit):
        Unit = failedReason(CfnEndpoint.FailedReasonProperty(failedReason))

    /**
     * @param outpostId The ID of the Outpost. 
     */
    override fun outpostId(outpostId: String) {
      cdkBuilder.outpostId(outpostId)
    }

    /**
     * @param securityGroupId The ID of the security group used for the endpoint. 
     */
    override fun securityGroupId(securityGroupId: String) {
      cdkBuilder.securityGroupId(securityGroupId)
    }

    /**
     * @param subnetId The ID of the subnet used for the endpoint. 
     */
    override fun subnetId(subnetId: String) {
      cdkBuilder.subnetId(subnetId)
    }

    public fun build(): software.amazon.awscdk.services.s3outposts.CfnEndpointProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.s3outposts.CfnEndpointProps,
  ) : CdkObject(cdkObject),
      CfnEndpointProps {
    /**
     * The container for the type of connectivity used to access the Amazon S3 on Outposts endpoint.
     *
     * To use the Amazon VPC , choose `Private` . To use the endpoint with an on-premises network,
     * choose `CustomerOwnedIp` . If you choose `CustomerOwnedIp` , you must also provide the
     * customer-owned IP address pool (CoIP pool).
     *
     *
     * `Private` is the default access type value.
     *
     *
     * Default: - "Private"
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-s3outposts-endpoint.html#cfn-s3outposts-endpoint-accesstype)
     */
    override fun accessType(): String? = unwrap(this).getAccessType()

    /**
     * The ID of the customer-owned IPv4 address pool (CoIP pool) for the endpoint.
     *
     * IP addresses are allocated from this pool for the endpoint.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-s3outposts-endpoint.html#cfn-s3outposts-endpoint-customerownedipv4pool)
     */
    override fun customerOwnedIpv4Pool(): String? = unwrap(this).getCustomerOwnedIpv4Pool()

    /**
     * The failure reason, if any, for a create or delete endpoint operation.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-s3outposts-endpoint.html#cfn-s3outposts-endpoint-failedreason)
     */
    override fun failedReason(): Any? = unwrap(this).getFailedReason()

    /**
     * The ID of the Outpost.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-s3outposts-endpoint.html#cfn-s3outposts-endpoint-outpostid)
     */
    override fun outpostId(): String = unwrap(this).getOutpostId()

    /**
     * The ID of the security group used for the endpoint.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-s3outposts-endpoint.html#cfn-s3outposts-endpoint-securitygroupid)
     */
    override fun securityGroupId(): String = unwrap(this).getSecurityGroupId()

    /**
     * The ID of the subnet used for the endpoint.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-s3outposts-endpoint.html#cfn-s3outposts-endpoint-subnetid)
     */
    override fun subnetId(): String = unwrap(this).getSubnetId()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnEndpointProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.s3outposts.CfnEndpointProps):
        CfnEndpointProps = CdkObjectWrappers.wrap(cdkObject) as? CfnEndpointProps ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnEndpointProps):
        software.amazon.awscdk.services.s3outposts.CfnEndpointProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.s3outposts.CfnEndpointProps
  }
}
