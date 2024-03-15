@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.apigatewayv2

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.Map

/**
 * Properties for defining a `CfnVpcLink`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.apigatewayv2.*;
 * CfnVpcLinkProps cfnVpcLinkProps = CfnVpcLinkProps.builder()
 * .name("name")
 * .subnetIds(List.of("subnetIds"))
 * // the properties below are optional
 * .securityGroupIds(List.of("securityGroupIds"))
 * .tags(Map.of(
 * "tagsKey", "tags"))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-vpclink.html)
 */
public interface CfnVpcLinkProps {
  /**
   * The name of the VPC link.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-vpclink.html#cfn-apigatewayv2-vpclink-name)
   */
  public fun name(): String

  /**
   * A list of security group IDs for the VPC link.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-vpclink.html#cfn-apigatewayv2-vpclink-securitygroupids)
   */
  public fun securityGroupIds(): List<String> = unwrap(this).getSecurityGroupIds() ?: emptyList()

  /**
   * A list of subnet IDs to include in the VPC link.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-vpclink.html#cfn-apigatewayv2-vpclink-subnetids)
   */
  public fun subnetIds(): List<String>

  /**
   * The collection of tags.
   *
   * Each tag element is associated with a given resource.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-vpclink.html#cfn-apigatewayv2-vpclink-tags)
   */
  public fun tags(): Map<String, String> = unwrap(this).getTags() ?: emptyMap()

  /**
   * A builder for [CfnVpcLinkProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param name The name of the VPC link. 
     */
    public fun name(name: String)

    /**
     * @param securityGroupIds A list of security group IDs for the VPC link.
     */
    public fun securityGroupIds(securityGroupIds: List<String>)

    /**
     * @param securityGroupIds A list of security group IDs for the VPC link.
     */
    public fun securityGroupIds(vararg securityGroupIds: String)

    /**
     * @param subnetIds A list of subnet IDs to include in the VPC link. 
     */
    public fun subnetIds(subnetIds: List<String>)

    /**
     * @param subnetIds A list of subnet IDs to include in the VPC link. 
     */
    public fun subnetIds(vararg subnetIds: String)

    /**
     * @param tags The collection of tags.
     * Each tag element is associated with a given resource.
     */
    public fun tags(tags: Map<String, String>)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.apigatewayv2.CfnVpcLinkProps.Builder =
        software.amazon.awscdk.services.apigatewayv2.CfnVpcLinkProps.builder()

    /**
     * @param name The name of the VPC link. 
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * @param securityGroupIds A list of security group IDs for the VPC link.
     */
    override fun securityGroupIds(securityGroupIds: List<String>) {
      cdkBuilder.securityGroupIds(securityGroupIds)
    }

    /**
     * @param securityGroupIds A list of security group IDs for the VPC link.
     */
    override fun securityGroupIds(vararg securityGroupIds: String): Unit =
        securityGroupIds(securityGroupIds.toList())

    /**
     * @param subnetIds A list of subnet IDs to include in the VPC link. 
     */
    override fun subnetIds(subnetIds: List<String>) {
      cdkBuilder.subnetIds(subnetIds)
    }

    /**
     * @param subnetIds A list of subnet IDs to include in the VPC link. 
     */
    override fun subnetIds(vararg subnetIds: String): Unit = subnetIds(subnetIds.toList())

    /**
     * @param tags The collection of tags.
     * Each tag element is associated with a given resource.
     */
    override fun tags(tags: Map<String, String>) {
      cdkBuilder.tags(tags)
    }

    public fun build(): software.amazon.awscdk.services.apigatewayv2.CfnVpcLinkProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.apigatewayv2.CfnVpcLinkProps,
  ) : CdkObject(cdkObject), CfnVpcLinkProps {
    /**
     * The name of the VPC link.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-vpclink.html#cfn-apigatewayv2-vpclink-name)
     */
    override fun name(): String = unwrap(this).getName()

    /**
     * A list of security group IDs for the VPC link.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-vpclink.html#cfn-apigatewayv2-vpclink-securitygroupids)
     */
    override fun securityGroupIds(): List<String> = unwrap(this).getSecurityGroupIds() ?:
        emptyList()

    /**
     * A list of subnet IDs to include in the VPC link.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-vpclink.html#cfn-apigatewayv2-vpclink-subnetids)
     */
    override fun subnetIds(): List<String> = unwrap(this).getSubnetIds()

    /**
     * The collection of tags.
     *
     * Each tag element is associated with a given resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-vpclink.html#cfn-apigatewayv2-vpclink-tags)
     */
    override fun tags(): Map<String, String> = unwrap(this).getTags() ?: emptyMap()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnVpcLinkProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.apigatewayv2.CfnVpcLinkProps):
        CfnVpcLinkProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnVpcLinkProps):
        software.amazon.awscdk.services.apigatewayv2.CfnVpcLinkProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.apigatewayv2.CfnVpcLinkProps
  }
}
