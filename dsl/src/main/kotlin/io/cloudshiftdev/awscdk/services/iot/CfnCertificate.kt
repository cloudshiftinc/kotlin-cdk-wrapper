package io.cloudshiftdev.awscdk.services.iot

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.TreeInspector
import kotlin.String
import kotlin.Unit
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnCertificate internal constructor(
  private val cdkObject: software.amazon.awscdk.services.iot.CfnCertificate,
) : CfnResource(cdkObject), IInspectable {
  public open fun attrArn(): String = unwrap(this).getAttrArn()

  public open fun attrId(): String = unwrap(this).getAttrId()

  public open fun caCertificatePem(): String? = unwrap(this).getCaCertificatePem()

  public open fun caCertificatePem(`value`: String) {
    unwrap(this).setCaCertificatePem(`value`)
  }

  public open fun certificateMode(): String? = unwrap(this).getCertificateMode()

  public open fun certificateMode(`value`: String) {
    unwrap(this).setCertificateMode(`value`)
  }

  public open fun certificatePem(): String? = unwrap(this).getCertificatePem()

  public open fun certificatePem(`value`: String) {
    unwrap(this).setCertificatePem(`value`)
  }

  public open fun certificateSigningRequest(): String? = unwrap(this).getCertificateSigningRequest()

  public open fun certificateSigningRequest(`value`: String) {
    unwrap(this).setCertificateSigningRequest(`value`)
  }

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun status(): String = unwrap(this).getStatus()

  public open fun status(`value`: String) {
    unwrap(this).setStatus(`value`)
  }

  public interface Builder {
    public fun caCertificatePem(caCertificatePem: String) {
    }

    public fun certificateMode(certificateMode: String) {
    }

    public fun certificatePem(certificatePem: String) {
    }

    public fun certificateSigningRequest(certificateSigningRequest: String) {
    }

    public fun status(status: String) {
    }
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.iot.CfnCertificate.Builder =
        software.amazon.awscdk.services.iot.CfnCertificate.Builder.create(scope, id)

    public override fun caCertificatePem(caCertificatePem: String) {
      cdkBuilder.caCertificatePem(caCertificatePem)
    }

    public override fun certificateMode(certificateMode: String) {
      cdkBuilder.certificateMode(certificateMode)
    }

    public override fun certificatePem(certificatePem: String) {
      cdkBuilder.certificatePem(certificatePem)
    }

    public override fun certificateSigningRequest(certificateSigningRequest: String) {
      cdkBuilder.certificateSigningRequest(certificateSigningRequest)
    }

    public override fun status(status: String) {
      cdkBuilder.status(status)
    }

    public fun build(): software.amazon.awscdk.services.iot.CfnCertificate = cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnCertificate {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnCertificate(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.iot.CfnCertificate): CfnCertificate
        = CfnCertificate(cdkObject)

    internal fun unwrap(wrapped: CfnCertificate): software.amazon.awscdk.services.iot.CfnCertificate
        = wrapped.cdkObject
  }
}
