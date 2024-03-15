@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.elasticloadbalancingv2

import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

public interface CfnListenerProps {
  public fun alpnPolicy(): List<String> = unwrap(this).getAlpnPolicy() ?: emptyList()

  public fun certificates(): Any? = unwrap(this).getCertificates()

  public fun defaultActions(): Any

  public fun loadBalancerArn(): String

  public fun mutualAuthentication(): Any? = unwrap(this).getMutualAuthentication()

  public fun port(): Number? = unwrap(this).getPort()

  public fun protocol(): String? = unwrap(this).getProtocol()

  public fun sslPolicy(): String? = unwrap(this).getSslPolicy()

  @CdkDslMarker
  public interface Builder {
    public fun alpnPolicy(alpnPolicy: List<String>)

    public fun alpnPolicy(vararg alpnPolicy: String)

    public fun certificates(certificates: IResolvable)

    public fun certificates(certificates: List<Any>)

    public fun certificates(vararg certificates: Any)

    public fun defaultActions(defaultActions: IResolvable)

    public fun defaultActions(defaultActions: List<Any>)

    public fun defaultActions(vararg defaultActions: Any)

    public fun loadBalancerArn(loadBalancerArn: String)

    public fun mutualAuthentication(mutualAuthentication: IResolvable)

    public fun mutualAuthentication(mutualAuthentication: CfnListener.MutualAuthenticationProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("6be8cc113af5bb7f2afd743200f6101fb564f42ee98951a3619b055f0fc659f3")
    public
        fun mutualAuthentication(mutualAuthentication: CfnListener.MutualAuthenticationProperty.Builder.() -> Unit)

    public fun port(port: Number)

    public fun protocol(protocol: String)

    public fun sslPolicy(sslPolicy: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.elasticloadbalancingv2.CfnListenerProps.Builder =
        software.amazon.awscdk.services.elasticloadbalancingv2.CfnListenerProps.builder()

    override fun alpnPolicy(alpnPolicy: List<String>) {
      cdkBuilder.alpnPolicy(alpnPolicy)
    }

    override fun alpnPolicy(vararg alpnPolicy: String): Unit = alpnPolicy(alpnPolicy.toList())

    override fun certificates(certificates: IResolvable) {
      cdkBuilder.certificates(certificates.let(IResolvable::unwrap))
    }

    override fun certificates(certificates: List<Any>) {
      cdkBuilder.certificates(certificates)
    }

    override fun certificates(vararg certificates: Any): Unit = certificates(certificates.toList())

    override fun defaultActions(defaultActions: IResolvable) {
      cdkBuilder.defaultActions(defaultActions.let(IResolvable::unwrap))
    }

    override fun defaultActions(defaultActions: List<Any>) {
      cdkBuilder.defaultActions(defaultActions)
    }

    override fun defaultActions(vararg defaultActions: Any): Unit =
        defaultActions(defaultActions.toList())

    override fun loadBalancerArn(loadBalancerArn: String) {
      cdkBuilder.loadBalancerArn(loadBalancerArn)
    }

    override fun mutualAuthentication(mutualAuthentication: IResolvable) {
      cdkBuilder.mutualAuthentication(mutualAuthentication.let(IResolvable::unwrap))
    }

    override
        fun mutualAuthentication(mutualAuthentication: CfnListener.MutualAuthenticationProperty) {
      cdkBuilder.mutualAuthentication(mutualAuthentication.let(CfnListener.MutualAuthenticationProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("6be8cc113af5bb7f2afd743200f6101fb564f42ee98951a3619b055f0fc659f3")
    override
        fun mutualAuthentication(mutualAuthentication: CfnListener.MutualAuthenticationProperty.Builder.() -> Unit):
        Unit = mutualAuthentication(CfnListener.MutualAuthenticationProperty(mutualAuthentication))

    override fun port(port: Number) {
      cdkBuilder.port(port)
    }

    override fun protocol(protocol: String) {
      cdkBuilder.protocol(protocol)
    }

    override fun sslPolicy(sslPolicy: String) {
      cdkBuilder.sslPolicy(sslPolicy)
    }

    public fun build(): software.amazon.awscdk.services.elasticloadbalancingv2.CfnListenerProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.elasticloadbalancingv2.CfnListenerProps,
  ) : CdkObject(cdkObject), CfnListenerProps {
    override fun alpnPolicy(): List<String> = unwrap(this).getAlpnPolicy() ?: emptyList()

    override fun certificates(): Any? = unwrap(this).getCertificates()

    override fun defaultActions(): Any = unwrap(this).getDefaultActions()

    override fun loadBalancerArn(): String = unwrap(this).getLoadBalancerArn()

    override fun mutualAuthentication(): Any? = unwrap(this).getMutualAuthentication()

    override fun port(): Number? = unwrap(this).getPort()

    override fun protocol(): String? = unwrap(this).getProtocol()

    override fun sslPolicy(): String? = unwrap(this).getSslPolicy()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnListenerProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.elasticloadbalancingv2.CfnListenerProps):
        CfnListenerProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnListenerProps):
        software.amazon.awscdk.services.elasticloadbalancingv2.CfnListenerProps = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.elasticloadbalancingv2.CfnListenerProps
  }
}
