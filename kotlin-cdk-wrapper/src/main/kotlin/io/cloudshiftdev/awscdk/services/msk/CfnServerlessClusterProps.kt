@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.msk

import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.Map
import kotlin.jvm.JvmName

public interface CfnServerlessClusterProps {
  public fun clientAuthentication(): Any

  public fun clusterName(): String

  public fun tags(): Map<String, String> = unwrap(this).getTags() ?: emptyMap()

  public fun vpcConfigs(): Any

  @CdkDslMarker
  public interface Builder {
    public fun clientAuthentication(clientAuthentication: IResolvable)

    public
        fun clientAuthentication(clientAuthentication: CfnServerlessCluster.ClientAuthenticationProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("e82de3d16091b92d09d367f5e6706fe07c07c4e8f35d5be42249cd82ee85e3a6")
    public
        fun clientAuthentication(clientAuthentication: CfnServerlessCluster.ClientAuthenticationProperty.Builder.() -> Unit)

    public fun clusterName(clusterName: String)

    public fun tags(tags: Map<String, String>)

    public fun vpcConfigs(vpcConfigs: IResolvable)

    public fun vpcConfigs(vpcConfigs: List<Any>)

    public fun vpcConfigs(vararg vpcConfigs: Any)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.msk.CfnServerlessClusterProps.Builder =
        software.amazon.awscdk.services.msk.CfnServerlessClusterProps.builder()

    override fun clientAuthentication(clientAuthentication: IResolvable) {
      cdkBuilder.clientAuthentication(clientAuthentication.let(IResolvable::unwrap))
    }

    override
        fun clientAuthentication(clientAuthentication: CfnServerlessCluster.ClientAuthenticationProperty) {
      cdkBuilder.clientAuthentication(clientAuthentication.let(CfnServerlessCluster.ClientAuthenticationProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("e82de3d16091b92d09d367f5e6706fe07c07c4e8f35d5be42249cd82ee85e3a6")
    override
        fun clientAuthentication(clientAuthentication: CfnServerlessCluster.ClientAuthenticationProperty.Builder.() -> Unit):
        Unit =
        clientAuthentication(CfnServerlessCluster.ClientAuthenticationProperty(clientAuthentication))

    override fun clusterName(clusterName: String) {
      cdkBuilder.clusterName(clusterName)
    }

    override fun tags(tags: Map<String, String>) {
      cdkBuilder.tags(tags)
    }

    override fun vpcConfigs(vpcConfigs: IResolvable) {
      cdkBuilder.vpcConfigs(vpcConfigs.let(IResolvable::unwrap))
    }

    override fun vpcConfigs(vpcConfigs: List<Any>) {
      cdkBuilder.vpcConfigs(vpcConfigs)
    }

    override fun vpcConfigs(vararg vpcConfigs: Any): Unit = vpcConfigs(vpcConfigs.toList())

    public fun build(): software.amazon.awscdk.services.msk.CfnServerlessClusterProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.msk.CfnServerlessClusterProps,
  ) : CdkObject(cdkObject), CfnServerlessClusterProps {
    override fun clientAuthentication(): Any = unwrap(this).getClientAuthentication()

    override fun clusterName(): String = unwrap(this).getClusterName()

    override fun tags(): Map<String, String> = unwrap(this).getTags() ?: emptyMap()

    override fun vpcConfigs(): Any = unwrap(this).getVpcConfigs()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnServerlessClusterProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.msk.CfnServerlessClusterProps):
        CfnServerlessClusterProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnServerlessClusterProps):
        software.amazon.awscdk.services.msk.CfnServerlessClusterProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.msk.CfnServerlessClusterProps
  }
}
