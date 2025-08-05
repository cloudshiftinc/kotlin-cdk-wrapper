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
 * Properties for defining a `CfnResourceGateway`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.vpclattice.*;
 * CfnResourceGatewayProps cfnResourceGatewayProps = CfnResourceGatewayProps.builder()
 * .name("name")
 * .subnetIds(List.of("subnetIds"))
 * .vpcIdentifier("vpcIdentifier")
 * // the properties below are optional
 * .ipAddressType("ipAddressType")
 * .securityGroupIds(List.of("securityGroupIds"))
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-vpclattice-resourcegateway.html)
 */
public interface CfnResourceGatewayProps {
  /**
   * The type of IP address used by the resource gateway.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-vpclattice-resourcegateway.html#cfn-vpclattice-resourcegateway-ipaddresstype)
   */
  public fun ipAddressType(): String? = unwrap(this).getIpAddressType()

  /**
   * The name of the resource gateway.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-vpclattice-resourcegateway.html#cfn-vpclattice-resourcegateway-name)
   */
  public fun name(): String

  /**
   * The IDs of the security groups applied to the resource gateway.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-vpclattice-resourcegateway.html#cfn-vpclattice-resourcegateway-securitygroupids)
   */
  public fun securityGroupIds(): List<String> = unwrap(this).getSecurityGroupIds() ?: emptyList()

  /**
   * The IDs of the VPC subnets for the resource gateway.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-vpclattice-resourcegateway.html#cfn-vpclattice-resourcegateway-subnetids)
   */
  public fun subnetIds(): List<String>

  /**
   * The tags for the resource gateway.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-vpclattice-resourcegateway.html#cfn-vpclattice-resourcegateway-tags)
   */
  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * The ID of the VPC for the resource gateway.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-vpclattice-resourcegateway.html#cfn-vpclattice-resourcegateway-vpcidentifier)
   */
  public fun vpcIdentifier(): String

  /**
   * A builder for [CfnResourceGatewayProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param ipAddressType The type of IP address used by the resource gateway.
     */
    public fun ipAddressType(ipAddressType: String)

    /**
     * @param name The name of the resource gateway. 
     */
    public fun name(name: String)

    /**
     * @param securityGroupIds The IDs of the security groups applied to the resource gateway.
     */
    public fun securityGroupIds(securityGroupIds: List<String>)

    /**
     * @param securityGroupIds The IDs of the security groups applied to the resource gateway.
     */
    public fun securityGroupIds(vararg securityGroupIds: String)

    /**
     * @param subnetIds The IDs of the VPC subnets for the resource gateway. 
     */
    public fun subnetIds(subnetIds: List<String>)

    /**
     * @param subnetIds The IDs of the VPC subnets for the resource gateway. 
     */
    public fun subnetIds(vararg subnetIds: String)

    /**
     * @param tags The tags for the resource gateway.
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * @param tags The tags for the resource gateway.
     */
    public fun tags(vararg tags: CfnTag)

    /**
     * @param vpcIdentifier The ID of the VPC for the resource gateway. 
     */
    public fun vpcIdentifier(vpcIdentifier: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.vpclattice.CfnResourceGatewayProps.Builder =
        software.amazon.awscdk.services.vpclattice.CfnResourceGatewayProps.builder()

    /**
     * @param ipAddressType The type of IP address used by the resource gateway.
     */
    override fun ipAddressType(ipAddressType: String) {
      cdkBuilder.ipAddressType(ipAddressType)
    }

    /**
     * @param name The name of the resource gateway. 
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * @param securityGroupIds The IDs of the security groups applied to the resource gateway.
     */
    override fun securityGroupIds(securityGroupIds: List<String>) {
      cdkBuilder.securityGroupIds(securityGroupIds)
    }

    /**
     * @param securityGroupIds The IDs of the security groups applied to the resource gateway.
     */
    override fun securityGroupIds(vararg securityGroupIds: String): Unit =
        securityGroupIds(securityGroupIds.toList())

    /**
     * @param subnetIds The IDs of the VPC subnets for the resource gateway. 
     */
    override fun subnetIds(subnetIds: List<String>) {
      cdkBuilder.subnetIds(subnetIds)
    }

    /**
     * @param subnetIds The IDs of the VPC subnets for the resource gateway. 
     */
    override fun subnetIds(vararg subnetIds: String): Unit = subnetIds(subnetIds.toList())

    /**
     * @param tags The tags for the resource gateway.
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag.Companion::unwrap))
    }

    /**
     * @param tags The tags for the resource gateway.
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    /**
     * @param vpcIdentifier The ID of the VPC for the resource gateway. 
     */
    override fun vpcIdentifier(vpcIdentifier: String) {
      cdkBuilder.vpcIdentifier(vpcIdentifier)
    }

    public fun build(): software.amazon.awscdk.services.vpclattice.CfnResourceGatewayProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.vpclattice.CfnResourceGatewayProps,
  ) : CdkObject(cdkObject),
      CfnResourceGatewayProps {
    /**
     * The type of IP address used by the resource gateway.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-vpclattice-resourcegateway.html#cfn-vpclattice-resourcegateway-ipaddresstype)
     */
    override fun ipAddressType(): String? = unwrap(this).getIpAddressType()

    /**
     * The name of the resource gateway.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-vpclattice-resourcegateway.html#cfn-vpclattice-resourcegateway-name)
     */
    override fun name(): String = unwrap(this).getName()

    /**
     * The IDs of the security groups applied to the resource gateway.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-vpclattice-resourcegateway.html#cfn-vpclattice-resourcegateway-securitygroupids)
     */
    override fun securityGroupIds(): List<String> = unwrap(this).getSecurityGroupIds() ?:
        emptyList()

    /**
     * The IDs of the VPC subnets for the resource gateway.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-vpclattice-resourcegateway.html#cfn-vpclattice-resourcegateway-subnetids)
     */
    override fun subnetIds(): List<String> = unwrap(this).getSubnetIds()

    /**
     * The tags for the resource gateway.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-vpclattice-resourcegateway.html#cfn-vpclattice-resourcegateway-tags)
     */
    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

    /**
     * The ID of the VPC for the resource gateway.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-vpclattice-resourcegateway.html#cfn-vpclattice-resourcegateway-vpcidentifier)
     */
    override fun vpcIdentifier(): String = unwrap(this).getVpcIdentifier()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnResourceGatewayProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.vpclattice.CfnResourceGatewayProps):
        CfnResourceGatewayProps = CdkObjectWrappers.wrap(cdkObject) as? CfnResourceGatewayProps ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnResourceGatewayProps):
        software.amazon.awscdk.services.vpclattice.CfnResourceGatewayProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.vpclattice.CfnResourceGatewayProps
  }
}
