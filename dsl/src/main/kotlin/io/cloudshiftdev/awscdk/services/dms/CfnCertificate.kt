package io.cloudshiftdev.awscdk.services.dms

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.TreeInspector
import kotlin.String
import kotlin.Unit
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnCertificate internal constructor(
  private val cdkObject: software.amazon.awscdk.services.dms.CfnCertificate,
) : CfnResource(cdkObject), IInspectable {
  public open fun attrId(): String = unwrap(this).getAttrId()

  public open fun certificateIdentifier(): String? = unwrap(this).getCertificateIdentifier()

  public open fun certificateIdentifier(`value`: String) {
    unwrap(this).setCertificateIdentifier(`value`)
  }

  public open fun certificatePem(): String? = unwrap(this).getCertificatePem()

  public open fun certificatePem(`value`: String) {
    unwrap(this).setCertificatePem(`value`)
  }

  public open fun certificateWallet(): String? = unwrap(this).getCertificateWallet()

  public open fun certificateWallet(`value`: String) {
    unwrap(this).setCertificateWallet(`value`)
  }

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public interface Builder {
    public fun certificateIdentifier(certificateIdentifier: String) {
    }

    public fun certificatePem(certificatePem: String) {
    }

    public fun certificateWallet(certificateWallet: String) {
    }
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.dms.CfnCertificate.Builder =
        software.amazon.awscdk.services.dms.CfnCertificate.Builder.create(scope, id)

    public override fun certificateIdentifier(certificateIdentifier: String) {
      cdkBuilder.certificateIdentifier(certificateIdentifier)
    }

    public override fun certificatePem(certificatePem: String) {
      cdkBuilder.certificatePem(certificatePem)
    }

    public override fun certificateWallet(certificateWallet: String) {
      cdkBuilder.certificateWallet(certificateWallet)
    }

    public fun build(): software.amazon.awscdk.services.dms.CfnCertificate = cdkBuilder.build()
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

    internal fun wrap(cdkObject: software.amazon.awscdk.services.dms.CfnCertificate): CfnCertificate
        = CfnCertificate(cdkObject)

    internal fun unwrap(wrapped: CfnCertificate): software.amazon.awscdk.services.dms.CfnCertificate
        = wrapped.cdkObject
  }
}
