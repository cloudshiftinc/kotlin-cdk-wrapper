package io.cloudshiftdev.awscdk.services.acmpca

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.TreeInspector
import kotlin.String
import kotlin.Unit
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnCertificateAuthorityActivation internal constructor(
  private val cdkObject: software.amazon.awscdk.services.acmpca.CfnCertificateAuthorityActivation,
) : CfnResource(cdkObject), IInspectable {
  public open fun attrCompleteCertificateChain(): String =
      unwrap(this).getAttrCompleteCertificateChain()

  public open fun certificate(): String = unwrap(this).getCertificate()

  public open fun certificate(`value`: String) {
    unwrap(this).setCertificate(`value`)
  }

  public open fun certificateAuthorityArn(): String = unwrap(this).getCertificateAuthorityArn()

  public open fun certificateAuthorityArn(`value`: String) {
    unwrap(this).setCertificateAuthorityArn(`value`)
  }

  public open fun certificateChain(): String? = unwrap(this).getCertificateChain()

  public open fun certificateChain(`value`: String) {
    unwrap(this).setCertificateChain(`value`)
  }

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun status(): String? = unwrap(this).getStatus()

  public open fun status(`value`: String) {
    unwrap(this).setStatus(`value`)
  }

  public interface Builder {
    public fun certificate(certificate: String)

    public fun certificateAuthorityArn(certificateAuthorityArn: String)

    public fun certificateChain(certificateChain: String)

    public fun status(status: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.acmpca.CfnCertificateAuthorityActivation.Builder =
        software.amazon.awscdk.services.acmpca.CfnCertificateAuthorityActivation.Builder.create(scope,
        id)

    override fun certificate(certificate: String) {
      cdkBuilder.certificate(certificate)
    }

    override fun certificateAuthorityArn(certificateAuthorityArn: String) {
      cdkBuilder.certificateAuthorityArn(certificateAuthorityArn)
    }

    override fun certificateChain(certificateChain: String) {
      cdkBuilder.certificateChain(certificateChain)
    }

    override fun status(status: String) {
      cdkBuilder.status(status)
    }

    public fun build(): software.amazon.awscdk.services.acmpca.CfnCertificateAuthorityActivation =
        cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnCertificateAuthorityActivation {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnCertificateAuthorityActivation(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.acmpca.CfnCertificateAuthorityActivation):
        CfnCertificateAuthorityActivation = CfnCertificateAuthorityActivation(cdkObject)

    internal fun unwrap(wrapped: CfnCertificateAuthorityActivation):
        software.amazon.awscdk.services.acmpca.CfnCertificateAuthorityActivation = wrapped.cdkObject
  }
}
