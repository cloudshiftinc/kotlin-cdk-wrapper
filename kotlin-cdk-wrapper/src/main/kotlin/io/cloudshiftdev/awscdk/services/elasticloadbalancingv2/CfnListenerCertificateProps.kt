@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.elasticloadbalancingv2

import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

public interface CfnListenerCertificateProps {
  public fun certificates(): Any

  public fun listenerArn(): String

  @CdkDslMarker
  public interface Builder {
    public fun certificates(certificates: IResolvable)

    public fun certificates(certificates: List<Any>)

    public fun certificates(vararg certificates: Any)

    public fun listenerArn(listenerArn: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.elasticloadbalancingv2.CfnListenerCertificateProps.Builder =
        software.amazon.awscdk.services.elasticloadbalancingv2.CfnListenerCertificateProps.builder()

    override fun certificates(certificates: IResolvable) {
      cdkBuilder.certificates(certificates.let(IResolvable::unwrap))
    }

    override fun certificates(certificates: List<Any>) {
      cdkBuilder.certificates(certificates)
    }

    override fun certificates(vararg certificates: Any): Unit = certificates(certificates.toList())

    override fun listenerArn(listenerArn: String) {
      cdkBuilder.listenerArn(listenerArn)
    }

    public fun build():
        software.amazon.awscdk.services.elasticloadbalancingv2.CfnListenerCertificateProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject:
        software.amazon.awscdk.services.elasticloadbalancingv2.CfnListenerCertificateProps,
  ) : CdkObject(cdkObject), CfnListenerCertificateProps {
    override fun certificates(): Any = unwrap(this).getCertificates()

    override fun listenerArn(): String = unwrap(this).getListenerArn()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnListenerCertificateProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.elasticloadbalancingv2.CfnListenerCertificateProps):
        CfnListenerCertificateProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnListenerCertificateProps):
        software.amazon.awscdk.services.elasticloadbalancingv2.CfnListenerCertificateProps =
        (wrapped as CdkObject).cdkObject as
        software.amazon.awscdk.services.elasticloadbalancingv2.CfnListenerCertificateProps
  }
}
