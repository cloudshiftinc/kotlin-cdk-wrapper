package io.cloudshiftdev.awscdk.services.elasticloadbalancingv2

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.TreeInspector
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnListenerCertificate internal constructor(
  private val cdkObject:
      software.amazon.awscdk.services.elasticloadbalancingv2.CfnListenerCertificate,
) : CfnResource(cdkObject), IInspectable {
  public open fun attrId(): String = unwrap(this).getAttrId()

  public open fun certificates(): Any = unwrap(this).getCertificates()

  public open fun certificates(`value`: IResolvable) {
    unwrap(this).setCertificates(`value`.let(IResolvable::unwrap))
  }

  public open fun certificates(__idx_ac66f0: List<Any>) {
    unwrap(this).setCertificates(__idx_ac66f0)
  }

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun listenerArn(): String = unwrap(this).getListenerArn()

  public open fun listenerArn(`value`: String) {
    unwrap(this).setListenerArn(`value`)
  }

  public interface Builder {
    public fun certificates(certificates: IResolvable)

    public fun certificates(certificates: List<Any>)

    public fun listenerArn(listenerArn: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.elasticloadbalancingv2.CfnListenerCertificate.Builder =
        software.amazon.awscdk.services.elasticloadbalancingv2.CfnListenerCertificate.Builder.create(scope,
        id)

    override fun certificates(certificates: IResolvable) {
      cdkBuilder.certificates(certificates.let(IResolvable::unwrap))
    }

    override fun certificates(certificates: List<Any>) {
      cdkBuilder.certificates(certificates)
    }

    override fun listenerArn(listenerArn: String) {
      cdkBuilder.listenerArn(listenerArn)
    }

    public fun build():
        software.amazon.awscdk.services.elasticloadbalancingv2.CfnListenerCertificate =
        cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnListenerCertificate {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnListenerCertificate(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.elasticloadbalancingv2.CfnListenerCertificate):
        CfnListenerCertificate = CfnListenerCertificate(cdkObject)

    internal fun unwrap(wrapped: CfnListenerCertificate):
        software.amazon.awscdk.services.elasticloadbalancingv2.CfnListenerCertificate =
        wrapped.cdkObject
  }

  public interface CertificateProperty {
    public fun certificateArn(): String? = unwrap(this).getCertificateArn()

    public interface Builder {
      public fun certificateArn(certificateArn: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.elasticloadbalancingv2.CfnListenerCertificate.CertificateProperty.Builder
          =
          software.amazon.awscdk.services.elasticloadbalancingv2.CfnListenerCertificate.CertificateProperty.builder()

      override fun certificateArn(certificateArn: String) {
        cdkBuilder.certificateArn(certificateArn)
      }

      public fun build():
          software.amazon.awscdk.services.elasticloadbalancingv2.CfnListenerCertificate.CertificateProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.elasticloadbalancingv2.CfnListenerCertificate.CertificateProperty,
    ) : CertificateProperty {
      override fun certificateArn(): String? = unwrap(this).getCertificateArn()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): CertificateProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.elasticloadbalancingv2.CfnListenerCertificate.CertificateProperty):
          CertificateProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: CertificateProperty):
          software.amazon.awscdk.services.elasticloadbalancingv2.CfnListenerCertificate.CertificateProperty
          = (wrapped as Wrapper).cdkObject
    }
  }
}
