@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.msk

import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.Map
import kotlin.jvm.JvmName

/**
 * Properties for defining a `CfnServerlessCluster`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.msk.*;
 * CfnServerlessClusterProps cfnServerlessClusterProps = CfnServerlessClusterProps.builder()
 * .clientAuthentication(ClientAuthenticationProperty.builder()
 * .sasl(SaslProperty.builder()
 * .iam(IamProperty.builder()
 * .enabled(false)
 * .build())
 * .build())
 * .build())
 * .clusterName("clusterName")
 * .vpcConfigs(List.of(VpcConfigProperty.builder()
 * .subnetIds(List.of("subnetIds"))
 * // the properties below are optional
 * .securityGroups(List.of("securityGroups"))
 * .build()))
 * // the properties below are optional
 * .tags(Map.of(
 * "tagsKey", "tags"))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-msk-serverlesscluster.html)
 */
public interface CfnServerlessClusterProps {
  /**
   * Includes all client authentication related information.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-msk-serverlesscluster.html#cfn-msk-serverlesscluster-clientauthentication)
   */
  public fun clientAuthentication(): Any

  /**
   * The name of the cluster.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-msk-serverlesscluster.html#cfn-msk-serverlesscluster-clustername)
   */
  public fun clusterName(): String

  /**
   * An arbitrary set of tags (key-value pairs) for the cluster.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-msk-serverlesscluster.html#cfn-msk-serverlesscluster-tags)
   */
  public fun tags(): Map<String, String> = unwrap(this).getTags() ?: emptyMap()

  /**
   * VPC configuration information for the serverless cluster.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-msk-serverlesscluster.html#cfn-msk-serverlesscluster-vpcconfigs)
   */
  public fun vpcConfigs(): Any

  /**
   * A builder for [CfnServerlessClusterProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param clientAuthentication Includes all client authentication related information. 
     */
    public fun clientAuthentication(clientAuthentication: IResolvable)

    /**
     * @param clientAuthentication Includes all client authentication related information. 
     */
    public
        fun clientAuthentication(clientAuthentication: CfnServerlessCluster.ClientAuthenticationProperty)

    /**
     * @param clientAuthentication Includes all client authentication related information. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("e82de3d16091b92d09d367f5e6706fe07c07c4e8f35d5be42249cd82ee85e3a6")
    public
        fun clientAuthentication(clientAuthentication: CfnServerlessCluster.ClientAuthenticationProperty.Builder.() -> Unit)

    /**
     * @param clusterName The name of the cluster. 
     */
    public fun clusterName(clusterName: String)

    /**
     * @param tags An arbitrary set of tags (key-value pairs) for the cluster.
     */
    public fun tags(tags: Map<String, String>)

    /**
     * @param vpcConfigs VPC configuration information for the serverless cluster. 
     */
    public fun vpcConfigs(vpcConfigs: IResolvable)

    /**
     * @param vpcConfigs VPC configuration information for the serverless cluster. 
     */
    public fun vpcConfigs(vpcConfigs: List<Any>)

    /**
     * @param vpcConfigs VPC configuration information for the serverless cluster. 
     */
    public fun vpcConfigs(vararg vpcConfigs: Any)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.msk.CfnServerlessClusterProps.Builder =
        software.amazon.awscdk.services.msk.CfnServerlessClusterProps.builder()

    /**
     * @param clientAuthentication Includes all client authentication related information. 
     */
    override fun clientAuthentication(clientAuthentication: IResolvable) {
      cdkBuilder.clientAuthentication(clientAuthentication.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param clientAuthentication Includes all client authentication related information. 
     */
    override
        fun clientAuthentication(clientAuthentication: CfnServerlessCluster.ClientAuthenticationProperty) {
      cdkBuilder.clientAuthentication(clientAuthentication.let(CfnServerlessCluster.ClientAuthenticationProperty.Companion::unwrap))
    }

    /**
     * @param clientAuthentication Includes all client authentication related information. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("e82de3d16091b92d09d367f5e6706fe07c07c4e8f35d5be42249cd82ee85e3a6")
    override
        fun clientAuthentication(clientAuthentication: CfnServerlessCluster.ClientAuthenticationProperty.Builder.() -> Unit):
        Unit =
        clientAuthentication(CfnServerlessCluster.ClientAuthenticationProperty(clientAuthentication))

    /**
     * @param clusterName The name of the cluster. 
     */
    override fun clusterName(clusterName: String) {
      cdkBuilder.clusterName(clusterName)
    }

    /**
     * @param tags An arbitrary set of tags (key-value pairs) for the cluster.
     */
    override fun tags(tags: Map<String, String>) {
      cdkBuilder.tags(tags)
    }

    /**
     * @param vpcConfigs VPC configuration information for the serverless cluster. 
     */
    override fun vpcConfigs(vpcConfigs: IResolvable) {
      cdkBuilder.vpcConfigs(vpcConfigs.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param vpcConfigs VPC configuration information for the serverless cluster. 
     */
    override fun vpcConfigs(vpcConfigs: List<Any>) {
      cdkBuilder.vpcConfigs(vpcConfigs.map{CdkObjectWrappers.unwrap(it)})
    }

    /**
     * @param vpcConfigs VPC configuration information for the serverless cluster. 
     */
    override fun vpcConfigs(vararg vpcConfigs: Any): Unit = vpcConfigs(vpcConfigs.toList())

    public fun build(): software.amazon.awscdk.services.msk.CfnServerlessClusterProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.msk.CfnServerlessClusterProps,
  ) : CdkObject(cdkObject),
      CfnServerlessClusterProps {
    /**
     * Includes all client authentication related information.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-msk-serverlesscluster.html#cfn-msk-serverlesscluster-clientauthentication)
     */
    override fun clientAuthentication(): Any = unwrap(this).getClientAuthentication()

    /**
     * The name of the cluster.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-msk-serverlesscluster.html#cfn-msk-serverlesscluster-clustername)
     */
    override fun clusterName(): String = unwrap(this).getClusterName()

    /**
     * An arbitrary set of tags (key-value pairs) for the cluster.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-msk-serverlesscluster.html#cfn-msk-serverlesscluster-tags)
     */
    override fun tags(): Map<String, String> = unwrap(this).getTags() ?: emptyMap()

    /**
     * VPC configuration information for the serverless cluster.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-msk-serverlesscluster.html#cfn-msk-serverlesscluster-vpcconfigs)
     */
    override fun vpcConfigs(): Any = unwrap(this).getVpcConfigs()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnServerlessClusterProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.msk.CfnServerlessClusterProps):
        CfnServerlessClusterProps = CdkObjectWrappers.wrap(cdkObject) as? CfnServerlessClusterProps
        ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnServerlessClusterProps):
        software.amazon.awscdk.services.msk.CfnServerlessClusterProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.msk.CfnServerlessClusterProps
  }
}
