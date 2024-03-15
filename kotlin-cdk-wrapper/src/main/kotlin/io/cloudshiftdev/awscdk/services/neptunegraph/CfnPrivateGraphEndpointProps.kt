@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.neptunegraph

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

/**
 * Properties for defining a `CfnPrivateGraphEndpoint`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.neptunegraph.*;
 * CfnPrivateGraphEndpointProps cfnPrivateGraphEndpointProps =
 * CfnPrivateGraphEndpointProps.builder()
 * .graphIdentifier("graphIdentifier")
 * .vpcId("vpcId")
 * // the properties below are optional
 * .securityGroupIds(List.of("securityGroupIds"))
 * .subnetIds(List.of("subnetIds"))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-neptunegraph-privategraphendpoint.html)
 */
public interface CfnPrivateGraphEndpointProps {
  /**
   * The unique identifier of the Neptune Analytics graph.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-neptunegraph-privategraphendpoint.html#cfn-neptunegraph-privategraphendpoint-graphidentifier)
   */
  public fun graphIdentifier(): String

  /**
   * Security groups to be attached to the private graph endpoint..
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-neptunegraph-privategraphendpoint.html#cfn-neptunegraph-privategraphendpoint-securitygroupids)
   */
  public fun securityGroupIds(): List<String> = unwrap(this).getSecurityGroupIds() ?: emptyList()

  /**
   * Subnets in which private graph endpoint ENIs are created.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-neptunegraph-privategraphendpoint.html#cfn-neptunegraph-privategraphendpoint-subnetids)
   */
  public fun subnetIds(): List<String> = unwrap(this).getSubnetIds() ?: emptyList()

  /**
   * The VPC in which the private graph endpoint needs to be created.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-neptunegraph-privategraphendpoint.html#cfn-neptunegraph-privategraphendpoint-vpcid)
   */
  public fun vpcId(): String

  /**
   * A builder for [CfnPrivateGraphEndpointProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param graphIdentifier The unique identifier of the Neptune Analytics graph. 
     */
    public fun graphIdentifier(graphIdentifier: String)

    /**
     * @param securityGroupIds Security groups to be attached to the private graph endpoint..
     */
    public fun securityGroupIds(securityGroupIds: List<String>)

    /**
     * @param securityGroupIds Security groups to be attached to the private graph endpoint..
     */
    public fun securityGroupIds(vararg securityGroupIds: String)

    /**
     * @param subnetIds Subnets in which private graph endpoint ENIs are created.
     */
    public fun subnetIds(subnetIds: List<String>)

    /**
     * @param subnetIds Subnets in which private graph endpoint ENIs are created.
     */
    public fun subnetIds(vararg subnetIds: String)

    /**
     * @param vpcId The VPC in which the private graph endpoint needs to be created. 
     */
    public fun vpcId(vpcId: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.neptunegraph.CfnPrivateGraphEndpointProps.Builder =
        software.amazon.awscdk.services.neptunegraph.CfnPrivateGraphEndpointProps.builder()

    /**
     * @param graphIdentifier The unique identifier of the Neptune Analytics graph. 
     */
    override fun graphIdentifier(graphIdentifier: String) {
      cdkBuilder.graphIdentifier(graphIdentifier)
    }

    /**
     * @param securityGroupIds Security groups to be attached to the private graph endpoint..
     */
    override fun securityGroupIds(securityGroupIds: List<String>) {
      cdkBuilder.securityGroupIds(securityGroupIds)
    }

    /**
     * @param securityGroupIds Security groups to be attached to the private graph endpoint..
     */
    override fun securityGroupIds(vararg securityGroupIds: String): Unit =
        securityGroupIds(securityGroupIds.toList())

    /**
     * @param subnetIds Subnets in which private graph endpoint ENIs are created.
     */
    override fun subnetIds(subnetIds: List<String>) {
      cdkBuilder.subnetIds(subnetIds)
    }

    /**
     * @param subnetIds Subnets in which private graph endpoint ENIs are created.
     */
    override fun subnetIds(vararg subnetIds: String): Unit = subnetIds(subnetIds.toList())

    /**
     * @param vpcId The VPC in which the private graph endpoint needs to be created. 
     */
    override fun vpcId(vpcId: String) {
      cdkBuilder.vpcId(vpcId)
    }

    public fun build(): software.amazon.awscdk.services.neptunegraph.CfnPrivateGraphEndpointProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject:
        software.amazon.awscdk.services.neptunegraph.CfnPrivateGraphEndpointProps,
  ) : CdkObject(cdkObject), CfnPrivateGraphEndpointProps {
    /**
     * The unique identifier of the Neptune Analytics graph.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-neptunegraph-privategraphendpoint.html#cfn-neptunegraph-privategraphendpoint-graphidentifier)
     */
    override fun graphIdentifier(): String = unwrap(this).getGraphIdentifier()

    /**
     * Security groups to be attached to the private graph endpoint..
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-neptunegraph-privategraphendpoint.html#cfn-neptunegraph-privategraphendpoint-securitygroupids)
     */
    override fun securityGroupIds(): List<String> = unwrap(this).getSecurityGroupIds() ?:
        emptyList()

    /**
     * Subnets in which private graph endpoint ENIs are created.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-neptunegraph-privategraphendpoint.html#cfn-neptunegraph-privategraphendpoint-subnetids)
     */
    override fun subnetIds(): List<String> = unwrap(this).getSubnetIds() ?: emptyList()

    /**
     * The VPC in which the private graph endpoint needs to be created.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-neptunegraph-privategraphendpoint.html#cfn-neptunegraph-privategraphendpoint-vpcid)
     */
    override fun vpcId(): String = unwrap(this).getVpcId()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnPrivateGraphEndpointProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.neptunegraph.CfnPrivateGraphEndpointProps):
        CfnPrivateGraphEndpointProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnPrivateGraphEndpointProps):
        software.amazon.awscdk.services.neptunegraph.CfnPrivateGraphEndpointProps = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.neptunegraph.CfnPrivateGraphEndpointProps
  }
}
