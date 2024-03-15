@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.msk

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.Map

/**
 * Properties for defining a `CfnVpcConnection`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.msk.*;
 * CfnVpcConnectionProps cfnVpcConnectionProps = CfnVpcConnectionProps.builder()
 * .authentication("authentication")
 * .clientSubnets(List.of("clientSubnets"))
 * .securityGroups(List.of("securityGroups"))
 * .targetClusterArn("targetClusterArn")
 * .vpcId("vpcId")
 * // the properties below are optional
 * .tags(Map.of(
 * "tagsKey", "tags"))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-msk-vpcconnection.html)
 */
public interface CfnVpcConnectionProps {
  /**
   * The type of private link authentication.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-msk-vpcconnection.html#cfn-msk-vpcconnection-authentication)
   */
  public fun authentication(): String

  /**
   * The list of subnets in the client VPC to connect to.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-msk-vpcconnection.html#cfn-msk-vpcconnection-clientsubnets)
   */
  public fun clientSubnets(): List<String>

  /**
   * The security groups to attach to the ENIs for the broker nodes.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-msk-vpcconnection.html#cfn-msk-vpcconnection-securitygroups)
   */
  public fun securityGroups(): List<String>

  /**
   * Create tags when creating the VPC connection.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-msk-vpcconnection.html#cfn-msk-vpcconnection-tags)
   */
  public fun tags(): Map<String, String> = unwrap(this).getTags() ?: emptyMap()

  /**
   * The Amazon Resource Name (ARN) of the cluster.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-msk-vpcconnection.html#cfn-msk-vpcconnection-targetclusterarn)
   */
  public fun targetClusterArn(): String

  /**
   * The VPC id of the remote client.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-msk-vpcconnection.html#cfn-msk-vpcconnection-vpcid)
   */
  public fun vpcId(): String

  /**
   * A builder for [CfnVpcConnectionProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param authentication The type of private link authentication. 
     */
    public fun authentication(authentication: String)

    /**
     * @param clientSubnets The list of subnets in the client VPC to connect to. 
     */
    public fun clientSubnets(clientSubnets: List<String>)

    /**
     * @param clientSubnets The list of subnets in the client VPC to connect to. 
     */
    public fun clientSubnets(vararg clientSubnets: String)

    /**
     * @param securityGroups The security groups to attach to the ENIs for the broker nodes. 
     */
    public fun securityGroups(securityGroups: List<String>)

    /**
     * @param securityGroups The security groups to attach to the ENIs for the broker nodes. 
     */
    public fun securityGroups(vararg securityGroups: String)

    /**
     * @param tags Create tags when creating the VPC connection.
     */
    public fun tags(tags: Map<String, String>)

    /**
     * @param targetClusterArn The Amazon Resource Name (ARN) of the cluster. 
     */
    public fun targetClusterArn(targetClusterArn: String)

    /**
     * @param vpcId The VPC id of the remote client. 
     */
    public fun vpcId(vpcId: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.msk.CfnVpcConnectionProps.Builder =
        software.amazon.awscdk.services.msk.CfnVpcConnectionProps.builder()

    /**
     * @param authentication The type of private link authentication. 
     */
    override fun authentication(authentication: String) {
      cdkBuilder.authentication(authentication)
    }

    /**
     * @param clientSubnets The list of subnets in the client VPC to connect to. 
     */
    override fun clientSubnets(clientSubnets: List<String>) {
      cdkBuilder.clientSubnets(clientSubnets)
    }

    /**
     * @param clientSubnets The list of subnets in the client VPC to connect to. 
     */
    override fun clientSubnets(vararg clientSubnets: String): Unit =
        clientSubnets(clientSubnets.toList())

    /**
     * @param securityGroups The security groups to attach to the ENIs for the broker nodes. 
     */
    override fun securityGroups(securityGroups: List<String>) {
      cdkBuilder.securityGroups(securityGroups)
    }

    /**
     * @param securityGroups The security groups to attach to the ENIs for the broker nodes. 
     */
    override fun securityGroups(vararg securityGroups: String): Unit =
        securityGroups(securityGroups.toList())

    /**
     * @param tags Create tags when creating the VPC connection.
     */
    override fun tags(tags: Map<String, String>) {
      cdkBuilder.tags(tags)
    }

    /**
     * @param targetClusterArn The Amazon Resource Name (ARN) of the cluster. 
     */
    override fun targetClusterArn(targetClusterArn: String) {
      cdkBuilder.targetClusterArn(targetClusterArn)
    }

    /**
     * @param vpcId The VPC id of the remote client. 
     */
    override fun vpcId(vpcId: String) {
      cdkBuilder.vpcId(vpcId)
    }

    public fun build(): software.amazon.awscdk.services.msk.CfnVpcConnectionProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.msk.CfnVpcConnectionProps,
  ) : CdkObject(cdkObject), CfnVpcConnectionProps {
    /**
     * The type of private link authentication.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-msk-vpcconnection.html#cfn-msk-vpcconnection-authentication)
     */
    override fun authentication(): String = unwrap(this).getAuthentication()

    /**
     * The list of subnets in the client VPC to connect to.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-msk-vpcconnection.html#cfn-msk-vpcconnection-clientsubnets)
     */
    override fun clientSubnets(): List<String> = unwrap(this).getClientSubnets()

    /**
     * The security groups to attach to the ENIs for the broker nodes.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-msk-vpcconnection.html#cfn-msk-vpcconnection-securitygroups)
     */
    override fun securityGroups(): List<String> = unwrap(this).getSecurityGroups()

    /**
     * Create tags when creating the VPC connection.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-msk-vpcconnection.html#cfn-msk-vpcconnection-tags)
     */
    override fun tags(): Map<String, String> = unwrap(this).getTags() ?: emptyMap()

    /**
     * The Amazon Resource Name (ARN) of the cluster.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-msk-vpcconnection.html#cfn-msk-vpcconnection-targetclusterarn)
     */
    override fun targetClusterArn(): String = unwrap(this).getTargetClusterArn()

    /**
     * The VPC id of the remote client.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-msk-vpcconnection.html#cfn-msk-vpcconnection-vpcid)
     */
    override fun vpcId(): String = unwrap(this).getVpcId()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnVpcConnectionProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.msk.CfnVpcConnectionProps):
        CfnVpcConnectionProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnVpcConnectionProps):
        software.amazon.awscdk.services.msk.CfnVpcConnectionProps = (wrapped as CdkObject).cdkObject
        as software.amazon.awscdk.services.msk.CfnVpcConnectionProps
  }
}
