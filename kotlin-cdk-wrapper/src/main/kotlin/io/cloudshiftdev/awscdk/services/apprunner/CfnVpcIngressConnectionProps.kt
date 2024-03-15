@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.apprunner

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

public interface CfnVpcIngressConnectionProps {
  public fun ingressVpcConfiguration(): Any

  public fun serviceArn(): String

  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  public fun vpcIngressConnectionName(): String? = unwrap(this).getVpcIngressConnectionName()

  @CdkDslMarker
  public interface Builder {
    public fun ingressVpcConfiguration(ingressVpcConfiguration: IResolvable)

    public
        fun ingressVpcConfiguration(ingressVpcConfiguration: CfnVpcIngressConnection.IngressVpcConfigurationProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("d30c3f41d043623eb97c7b27cdf787eabd7c982858b01b502b236b261275ea55")
    public
        fun ingressVpcConfiguration(ingressVpcConfiguration: CfnVpcIngressConnection.IngressVpcConfigurationProperty.Builder.() -> Unit)

    public fun serviceArn(serviceArn: String)

    public fun tags(tags: List<CfnTag>)

    public fun tags(vararg tags: CfnTag)

    public fun vpcIngressConnectionName(vpcIngressConnectionName: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.apprunner.CfnVpcIngressConnectionProps.Builder =
        software.amazon.awscdk.services.apprunner.CfnVpcIngressConnectionProps.builder()

    override fun ingressVpcConfiguration(ingressVpcConfiguration: IResolvable) {
      cdkBuilder.ingressVpcConfiguration(ingressVpcConfiguration.let(IResolvable::unwrap))
    }

    override
        fun ingressVpcConfiguration(ingressVpcConfiguration: CfnVpcIngressConnection.IngressVpcConfigurationProperty) {
      cdkBuilder.ingressVpcConfiguration(ingressVpcConfiguration.let(CfnVpcIngressConnection.IngressVpcConfigurationProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("d30c3f41d043623eb97c7b27cdf787eabd7c982858b01b502b236b261275ea55")
    override
        fun ingressVpcConfiguration(ingressVpcConfiguration: CfnVpcIngressConnection.IngressVpcConfigurationProperty.Builder.() -> Unit):
        Unit =
        ingressVpcConfiguration(CfnVpcIngressConnection.IngressVpcConfigurationProperty(ingressVpcConfiguration))

    override fun serviceArn(serviceArn: String) {
      cdkBuilder.serviceArn(serviceArn)
    }

    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    override fun vpcIngressConnectionName(vpcIngressConnectionName: String) {
      cdkBuilder.vpcIngressConnectionName(vpcIngressConnectionName)
    }

    public fun build(): software.amazon.awscdk.services.apprunner.CfnVpcIngressConnectionProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.apprunner.CfnVpcIngressConnectionProps,
  ) : CdkObject(cdkObject), CfnVpcIngressConnectionProps {
    override fun ingressVpcConfiguration(): Any = unwrap(this).getIngressVpcConfiguration()

    override fun serviceArn(): String = unwrap(this).getServiceArn()

    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

    override fun vpcIngressConnectionName(): String? = unwrap(this).getVpcIngressConnectionName()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnVpcIngressConnectionProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.apprunner.CfnVpcIngressConnectionProps):
        CfnVpcIngressConnectionProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnVpcIngressConnectionProps):
        software.amazon.awscdk.services.apprunner.CfnVpcIngressConnectionProps = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.apprunner.CfnVpcIngressConnectionProps
  }
}
