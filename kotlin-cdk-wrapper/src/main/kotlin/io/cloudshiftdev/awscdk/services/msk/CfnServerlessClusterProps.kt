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
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-msk-serverlesscluster.html#cfn-msk-serverlesscluster-clientauthentication)
   */
  public fun clientAuthentication(): Any

  /**
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-msk-serverlesscluster.html#cfn-msk-serverlesscluster-clustername)
   */
  public fun clusterName(): String

  /**
   * A key-value pair to associate with a resource.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-msk-serverlesscluster.html#cfn-msk-serverlesscluster-tags)
   */
  public fun tags(): Map<String, String> = unwrap(this).getTags() ?: emptyMap()

  /**
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-msk-serverlesscluster.html#cfn-msk-serverlesscluster-vpcconfigs)
   */
  public fun vpcConfigs(): Any

  /**
   * A builder for [CfnServerlessClusterProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param clientAuthentication the value to be set. 
     */
    public fun clientAuthentication(clientAuthentication: IResolvable)

    /**
     * @param clientAuthentication the value to be set. 
     */
    public
        fun clientAuthentication(clientAuthentication: CfnServerlessCluster.ClientAuthenticationProperty)

    /**
     * @param clientAuthentication the value to be set. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("e82de3d16091b92d09d367f5e6706fe07c07c4e8f35d5be42249cd82ee85e3a6")
    public
        fun clientAuthentication(clientAuthentication: CfnServerlessCluster.ClientAuthenticationProperty.Builder.() -> Unit)

    /**
     * @param clusterName the value to be set. 
     */
    public fun clusterName(clusterName: String)

    /**
     * @param tags A key-value pair to associate with a resource.
     */
    public fun tags(tags: Map<String, String>)

    /**
     * @param vpcConfigs the value to be set. 
     */
    public fun vpcConfigs(vpcConfigs: IResolvable)

    /**
     * @param vpcConfigs the value to be set. 
     */
    public fun vpcConfigs(vpcConfigs: List<Any>)

    /**
     * @param vpcConfigs the value to be set. 
     */
    public fun vpcConfigs(vararg vpcConfigs: Any)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.msk.CfnServerlessClusterProps.Builder =
        software.amazon.awscdk.services.msk.CfnServerlessClusterProps.builder()

    /**
     * @param clientAuthentication the value to be set. 
     */
    override fun clientAuthentication(clientAuthentication: IResolvable) {
      cdkBuilder.clientAuthentication(clientAuthentication.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param clientAuthentication the value to be set. 
     */
    override
        fun clientAuthentication(clientAuthentication: CfnServerlessCluster.ClientAuthenticationProperty) {
      cdkBuilder.clientAuthentication(clientAuthentication.let(CfnServerlessCluster.ClientAuthenticationProperty.Companion::unwrap))
    }

    /**
     * @param clientAuthentication the value to be set. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("e82de3d16091b92d09d367f5e6706fe07c07c4e8f35d5be42249cd82ee85e3a6")
    override
        fun clientAuthentication(clientAuthentication: CfnServerlessCluster.ClientAuthenticationProperty.Builder.() -> Unit):
        Unit =
        clientAuthentication(CfnServerlessCluster.ClientAuthenticationProperty(clientAuthentication))

    /**
     * @param clusterName the value to be set. 
     */
    override fun clusterName(clusterName: String) {
      cdkBuilder.clusterName(clusterName)
    }

    /**
     * @param tags A key-value pair to associate with a resource.
     */
    override fun tags(tags: Map<String, String>) {
      cdkBuilder.tags(tags)
    }

    /**
     * @param vpcConfigs the value to be set. 
     */
    override fun vpcConfigs(vpcConfigs: IResolvable) {
      cdkBuilder.vpcConfigs(vpcConfigs.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param vpcConfigs the value to be set. 
     */
    override fun vpcConfigs(vpcConfigs: List<Any>) {
      cdkBuilder.vpcConfigs(vpcConfigs.map{CdkObjectWrappers.unwrap(it)})
    }

    /**
     * @param vpcConfigs the value to be set. 
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
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-msk-serverlesscluster.html#cfn-msk-serverlesscluster-clientauthentication)
     */
    override fun clientAuthentication(): Any = unwrap(this).getClientAuthentication()

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-msk-serverlesscluster.html#cfn-msk-serverlesscluster-clustername)
     */
    override fun clusterName(): String = unwrap(this).getClusterName()

    /**
     * A key-value pair to associate with a resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-msk-serverlesscluster.html#cfn-msk-serverlesscluster-tags)
     */
    override fun tags(): Map<String, String> = unwrap(this).getTags() ?: emptyMap()

    /**
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
