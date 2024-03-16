@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ec2

import io.cloudshiftdev.awscdk.CfnTag
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
 * Properties for defining a `CfnInstanceConnectEndpoint`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.ec2.*;
 * CfnInstanceConnectEndpointProps cfnInstanceConnectEndpointProps =
 * CfnInstanceConnectEndpointProps.builder()
 * .subnetId("subnetId")
 * // the properties below are optional
 * .clientToken("clientToken")
 * .preserveClientIp(false)
 * .securityGroupIds(List.of("securityGroupIds"))
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-instanceconnectendpoint.html)
 */
public interface CfnInstanceConnectEndpointProps {
  /**
   * Unique, case-sensitive identifier that you provide to ensure the idempotency of the request.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-instanceconnectendpoint.html#cfn-ec2-instanceconnectendpoint-clienttoken)
   */
  public fun clientToken(): String? = unwrap(this).getClientToken()

  /**
   * Indicates whether your client's IP address is preserved as the source. The value is `true` or
   * `false` .
   *
   * * If `true` , your client's IP address is used when you connect to a resource.
   * * If `false` , the elastic network interface IP address is used when you connect to a resource.
   *
   * Default: `true`
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-instanceconnectendpoint.html#cfn-ec2-instanceconnectendpoint-preserveclientip)
   */
  public fun preserveClientIp(): Any? = unwrap(this).getPreserveClientIp()

  /**
   * One or more security groups to associate with the endpoint.
   *
   * If you don't specify a security group, the default security group for your VPC will be
   * associated with the endpoint.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-instanceconnectendpoint.html#cfn-ec2-instanceconnectendpoint-securitygroupids)
   */
  public fun securityGroupIds(): List<String> = unwrap(this).getSecurityGroupIds() ?: emptyList()

  /**
   * The ID of the subnet in which to create the EC2 Instance Connect Endpoint.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-instanceconnectendpoint.html#cfn-ec2-instanceconnectendpoint-subnetid)
   */
  public fun subnetId(): String

  /**
   * The tags to apply to the EC2 Instance Connect Endpoint during creation.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-instanceconnectendpoint.html#cfn-ec2-instanceconnectendpoint-tags)
   */
  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * A builder for [CfnInstanceConnectEndpointProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param clientToken Unique, case-sensitive identifier that you provide to ensure the
     * idempotency of the request.
     */
    public fun clientToken(clientToken: String)

    /**
     * @param preserveClientIp Indicates whether your client's IP address is preserved as the
     * source. The value is `true` or `false` .
     * * If `true` , your client's IP address is used when you connect to a resource.
     * * If `false` , the elastic network interface IP address is used when you connect to a
     * resource.
     *
     * Default: `true`
     */
    public fun preserveClientIp(preserveClientIp: Boolean)

    /**
     * @param preserveClientIp Indicates whether your client's IP address is preserved as the
     * source. The value is `true` or `false` .
     * * If `true` , your client's IP address is used when you connect to a resource.
     * * If `false` , the elastic network interface IP address is used when you connect to a
     * resource.
     *
     * Default: `true`
     */
    public fun preserveClientIp(preserveClientIp: IResolvable)

    /**
     * @param securityGroupIds One or more security groups to associate with the endpoint.
     * If you don't specify a security group, the default security group for your VPC will be
     * associated with the endpoint.
     */
    public fun securityGroupIds(securityGroupIds: List<String>)

    /**
     * @param securityGroupIds One or more security groups to associate with the endpoint.
     * If you don't specify a security group, the default security group for your VPC will be
     * associated with the endpoint.
     */
    public fun securityGroupIds(vararg securityGroupIds: String)

    /**
     * @param subnetId The ID of the subnet in which to create the EC2 Instance Connect Endpoint. 
     */
    public fun subnetId(subnetId: String)

    /**
     * @param tags The tags to apply to the EC2 Instance Connect Endpoint during creation.
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * @param tags The tags to apply to the EC2 Instance Connect Endpoint during creation.
     */
    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.ec2.CfnInstanceConnectEndpointProps.Builder =
        software.amazon.awscdk.services.ec2.CfnInstanceConnectEndpointProps.builder()

    /**
     * @param clientToken Unique, case-sensitive identifier that you provide to ensure the
     * idempotency of the request.
     */
    override fun clientToken(clientToken: String) {
      cdkBuilder.clientToken(clientToken)
    }

    /**
     * @param preserveClientIp Indicates whether your client's IP address is preserved as the
     * source. The value is `true` or `false` .
     * * If `true` , your client's IP address is used when you connect to a resource.
     * * If `false` , the elastic network interface IP address is used when you connect to a
     * resource.
     *
     * Default: `true`
     */
    override fun preserveClientIp(preserveClientIp: Boolean) {
      cdkBuilder.preserveClientIp(preserveClientIp)
    }

    /**
     * @param preserveClientIp Indicates whether your client's IP address is preserved as the
     * source. The value is `true` or `false` .
     * * If `true` , your client's IP address is used when you connect to a resource.
     * * If `false` , the elastic network interface IP address is used when you connect to a
     * resource.
     *
     * Default: `true`
     */
    override fun preserveClientIp(preserveClientIp: IResolvable) {
      cdkBuilder.preserveClientIp(preserveClientIp.let(IResolvable::unwrap))
    }

    /**
     * @param securityGroupIds One or more security groups to associate with the endpoint.
     * If you don't specify a security group, the default security group for your VPC will be
     * associated with the endpoint.
     */
    override fun securityGroupIds(securityGroupIds: List<String>) {
      cdkBuilder.securityGroupIds(securityGroupIds)
    }

    /**
     * @param securityGroupIds One or more security groups to associate with the endpoint.
     * If you don't specify a security group, the default security group for your VPC will be
     * associated with the endpoint.
     */
    override fun securityGroupIds(vararg securityGroupIds: String): Unit =
        securityGroupIds(securityGroupIds.toList())

    /**
     * @param subnetId The ID of the subnet in which to create the EC2 Instance Connect Endpoint. 
     */
    override fun subnetId(subnetId: String) {
      cdkBuilder.subnetId(subnetId)
    }

    /**
     * @param tags The tags to apply to the EC2 Instance Connect Endpoint during creation.
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    /**
     * @param tags The tags to apply to the EC2 Instance Connect Endpoint during creation.
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.ec2.CfnInstanceConnectEndpointProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.ec2.CfnInstanceConnectEndpointProps,
  ) : CdkObject(cdkObject), CfnInstanceConnectEndpointProps {
    /**
     * Unique, case-sensitive identifier that you provide to ensure the idempotency of the request.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-instanceconnectendpoint.html#cfn-ec2-instanceconnectendpoint-clienttoken)
     */
    override fun clientToken(): String? = unwrap(this).getClientToken()

    /**
     * Indicates whether your client's IP address is preserved as the source. The value is `true` or
     * `false` .
     *
     * * If `true` , your client's IP address is used when you connect to a resource.
     * * If `false` , the elastic network interface IP address is used when you connect to a
     * resource.
     *
     * Default: `true`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-instanceconnectendpoint.html#cfn-ec2-instanceconnectendpoint-preserveclientip)
     */
    override fun preserveClientIp(): Any? = unwrap(this).getPreserveClientIp()

    /**
     * One or more security groups to associate with the endpoint.
     *
     * If you don't specify a security group, the default security group for your VPC will be
     * associated with the endpoint.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-instanceconnectendpoint.html#cfn-ec2-instanceconnectendpoint-securitygroupids)
     */
    override fun securityGroupIds(): List<String> = unwrap(this).getSecurityGroupIds() ?:
        emptyList()

    /**
     * The ID of the subnet in which to create the EC2 Instance Connect Endpoint.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-instanceconnectendpoint.html#cfn-ec2-instanceconnectendpoint-subnetid)
     */
    override fun subnetId(): String = unwrap(this).getSubnetId()

    /**
     * The tags to apply to the EC2 Instance Connect Endpoint during creation.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-instanceconnectendpoint.html#cfn-ec2-instanceconnectendpoint-tags)
     */
    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnInstanceConnectEndpointProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.ec2.CfnInstanceConnectEndpointProps):
        CfnInstanceConnectEndpointProps = CdkObjectWrappers.wrap(cdkObject) as
        CfnInstanceConnectEndpointProps

    internal fun unwrap(wrapped: CfnInstanceConnectEndpointProps):
        software.amazon.awscdk.services.ec2.CfnInstanceConnectEndpointProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.ec2.CfnInstanceConnectEndpointProps
  }
}
