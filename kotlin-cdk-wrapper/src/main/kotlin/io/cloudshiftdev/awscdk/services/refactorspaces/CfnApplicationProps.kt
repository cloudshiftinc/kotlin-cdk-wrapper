@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.refactorspaces

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

public interface CfnApplicationProps {
  public fun apiGatewayProxy(): Any? = unwrap(this).getApiGatewayProxy()

  public fun environmentIdentifier(): String

  public fun name(): String

  public fun proxyType(): String

  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  public fun vpcId(): String

  @CdkDslMarker
  public interface Builder {
    public fun apiGatewayProxy(apiGatewayProxy: IResolvable)

    public fun apiGatewayProxy(apiGatewayProxy: CfnApplication.ApiGatewayProxyInputProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("24ab2d87ba722594bc608bca8b492170a176475dde75c1973cbde387d90d28fe")
    public
        fun apiGatewayProxy(apiGatewayProxy: CfnApplication.ApiGatewayProxyInputProperty.Builder.() -> Unit)

    public fun environmentIdentifier(environmentIdentifier: String)

    public fun name(name: String)

    public fun proxyType(proxyType: String)

    public fun tags(tags: List<CfnTag>)

    public fun tags(vararg tags: CfnTag)

    public fun vpcId(vpcId: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.refactorspaces.CfnApplicationProps.Builder =
        software.amazon.awscdk.services.refactorspaces.CfnApplicationProps.builder()

    override fun apiGatewayProxy(apiGatewayProxy: IResolvable) {
      cdkBuilder.apiGatewayProxy(apiGatewayProxy.let(IResolvable::unwrap))
    }

    override fun apiGatewayProxy(apiGatewayProxy: CfnApplication.ApiGatewayProxyInputProperty) {
      cdkBuilder.apiGatewayProxy(apiGatewayProxy.let(CfnApplication.ApiGatewayProxyInputProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("24ab2d87ba722594bc608bca8b492170a176475dde75c1973cbde387d90d28fe")
    override
        fun apiGatewayProxy(apiGatewayProxy: CfnApplication.ApiGatewayProxyInputProperty.Builder.() -> Unit):
        Unit = apiGatewayProxy(CfnApplication.ApiGatewayProxyInputProperty(apiGatewayProxy))

    override fun environmentIdentifier(environmentIdentifier: String) {
      cdkBuilder.environmentIdentifier(environmentIdentifier)
    }

    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    override fun proxyType(proxyType: String) {
      cdkBuilder.proxyType(proxyType)
    }

    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    override fun vpcId(vpcId: String) {
      cdkBuilder.vpcId(vpcId)
    }

    public fun build(): software.amazon.awscdk.services.refactorspaces.CfnApplicationProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.refactorspaces.CfnApplicationProps,
  ) : CdkObject(cdkObject), CfnApplicationProps {
    override fun apiGatewayProxy(): Any? = unwrap(this).getApiGatewayProxy()

    override fun environmentIdentifier(): String = unwrap(this).getEnvironmentIdentifier()

    override fun name(): String = unwrap(this).getName()

    override fun proxyType(): String = unwrap(this).getProxyType()

    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

    override fun vpcId(): String = unwrap(this).getVpcId()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnApplicationProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.refactorspaces.CfnApplicationProps):
        CfnApplicationProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnApplicationProps):
        software.amazon.awscdk.services.refactorspaces.CfnApplicationProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.refactorspaces.CfnApplicationProps
  }
}
