@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.msk

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
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
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-msk-vpcconnection.html#cfn-msk-vpcconnection-clientsubnets)
   */
  public fun clientSubnets(): List<String>

  /**
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-msk-vpcconnection.html#cfn-msk-vpcconnection-securitygroups)
   */
  public fun securityGroups(): List<String>

  /**
   * A key-value pair to associate with a resource.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-msk-vpcconnection.html#cfn-msk-vpcconnection-tags)
   */
  public fun tags(): Map<String, String> = unwrap(this).getTags() ?: emptyMap()

  /**
   * The Amazon Resource Name (ARN) of the target cluster.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-msk-vpcconnection.html#cfn-msk-vpcconnection-targetclusterarn)
   */
  public fun targetClusterArn(): String

  /**
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
     * @param clientSubnets the value to be set. 
     */
    public fun clientSubnets(clientSubnets: List<String>)

    /**
     * @param clientSubnets the value to be set. 
     */
    public fun clientSubnets(vararg clientSubnets: String)

    /**
     * @param securityGroups the value to be set. 
     */
    public fun securityGroups(securityGroups: List<String>)

    /**
     * @param securityGroups the value to be set. 
     */
    public fun securityGroups(vararg securityGroups: String)

    /**
     * @param tags A key-value pair to associate with a resource.
     */
    public fun tags(tags: Map<String, String>)

    /**
     * @param targetClusterArn The Amazon Resource Name (ARN) of the target cluster. 
     */
    public fun targetClusterArn(targetClusterArn: String)

    /**
     * @param vpcId the value to be set. 
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
     * @param clientSubnets the value to be set. 
     */
    override fun clientSubnets(clientSubnets: List<String>) {
      cdkBuilder.clientSubnets(clientSubnets)
    }

    /**
     * @param clientSubnets the value to be set. 
     */
    override fun clientSubnets(vararg clientSubnets: String): Unit =
        clientSubnets(clientSubnets.toList())

    /**
     * @param securityGroups the value to be set. 
     */
    override fun securityGroups(securityGroups: List<String>) {
      cdkBuilder.securityGroups(securityGroups)
    }

    /**
     * @param securityGroups the value to be set. 
     */
    override fun securityGroups(vararg securityGroups: String): Unit =
        securityGroups(securityGroups.toList())

    /**
     * @param tags A key-value pair to associate with a resource.
     */
    override fun tags(tags: Map<String, String>) {
      cdkBuilder.tags(tags)
    }

    /**
     * @param targetClusterArn The Amazon Resource Name (ARN) of the target cluster. 
     */
    override fun targetClusterArn(targetClusterArn: String) {
      cdkBuilder.targetClusterArn(targetClusterArn)
    }

    /**
     * @param vpcId the value to be set. 
     */
    override fun vpcId(vpcId: String) {
      cdkBuilder.vpcId(vpcId)
    }

    public fun build(): software.amazon.awscdk.services.msk.CfnVpcConnectionProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.msk.CfnVpcConnectionProps,
  ) : CdkObject(cdkObject),
      CfnVpcConnectionProps {
    /**
     * The type of private link authentication.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-msk-vpcconnection.html#cfn-msk-vpcconnection-authentication)
     */
    override fun authentication(): String = unwrap(this).getAuthentication()

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-msk-vpcconnection.html#cfn-msk-vpcconnection-clientsubnets)
     */
    override fun clientSubnets(): List<String> = unwrap(this).getClientSubnets()

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-msk-vpcconnection.html#cfn-msk-vpcconnection-securitygroups)
     */
    override fun securityGroups(): List<String> = unwrap(this).getSecurityGroups()

    /**
     * A key-value pair to associate with a resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-msk-vpcconnection.html#cfn-msk-vpcconnection-tags)
     */
    override fun tags(): Map<String, String> = unwrap(this).getTags() ?: emptyMap()

    /**
     * The Amazon Resource Name (ARN) of the target cluster.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-msk-vpcconnection.html#cfn-msk-vpcconnection-targetclusterarn)
     */
    override fun targetClusterArn(): String = unwrap(this).getTargetClusterArn()

    /**
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
        CfnVpcConnectionProps = CdkObjectWrappers.wrap(cdkObject) as? CfnVpcConnectionProps ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnVpcConnectionProps):
        software.amazon.awscdk.services.msk.CfnVpcConnectionProps = (wrapped as CdkObject).cdkObject
        as software.amazon.awscdk.services.msk.CfnVpcConnectionProps
  }
}
