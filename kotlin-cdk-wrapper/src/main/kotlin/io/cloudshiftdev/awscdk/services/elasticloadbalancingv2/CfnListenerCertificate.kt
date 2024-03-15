@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.elasticloadbalancingv2

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnListenerCertificate internal constructor(
  internal override val cdkObject:
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

  public open fun certificates(vararg __idx_ac66f0: Any): Unit = certificates(__idx_ac66f0.toList())

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun listenerArn(): String = unwrap(this).getListenerArn()

  public open fun listenerArn(`value`: String) {
    unwrap(this).setListenerArn(`value`)
  }

  @CdkDslMarker
  public interface Builder {
    public fun certificates(certificates: IResolvable)

    public fun certificates(certificates: List<Any>)

    public fun certificates(vararg certificates: Any)

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

    override fun certificates(vararg certificates: Any): Unit = certificates(certificates.toList())

    override fun listenerArn(listenerArn: String) {
      cdkBuilder.listenerArn(listenerArn)
    }

    public fun build():
        software.amazon.awscdk.services.elasticloadbalancingv2.CfnListenerCertificate =
        cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.elasticloadbalancingv2.CfnListenerCertificate.CFN_RESOURCE_TYPE_NAME

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

    @CdkDslMarker
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

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.elasticloadbalancingv2.CfnListenerCertificate.CertificateProperty,
    ) : CdkObject(cdkObject), CertificateProperty {
      override fun certificateArn(): String? = unwrap(this).getCertificateArn()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): CertificateProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.elasticloadbalancingv2.CfnListenerCertificate.CertificateProperty):
          CertificateProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: CertificateProperty):
          software.amazon.awscdk.services.elasticloadbalancingv2.CfnListenerCertificate.CertificateProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.elasticloadbalancingv2.CfnListenerCertificate.CertificateProperty
    }
  }
}
