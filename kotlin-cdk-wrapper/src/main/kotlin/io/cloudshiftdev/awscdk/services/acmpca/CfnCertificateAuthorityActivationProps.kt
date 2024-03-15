@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.acmpca

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String
import kotlin.Unit

public interface CfnCertificateAuthorityActivationProps {
  public fun certificate(): String

  public fun certificateAuthorityArn(): String

  public fun certificateChain(): String? = unwrap(this).getCertificateChain()

  public fun status(): String? = unwrap(this).getStatus()

  @CdkDslMarker
  public interface Builder {
    public fun certificate(certificate: String)

    public fun certificateAuthorityArn(certificateAuthorityArn: String)

    public fun certificateChain(certificateChain: String)

    public fun status(status: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.acmpca.CfnCertificateAuthorityActivationProps.Builder =
        software.amazon.awscdk.services.acmpca.CfnCertificateAuthorityActivationProps.builder()

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

    public fun build():
        software.amazon.awscdk.services.acmpca.CfnCertificateAuthorityActivationProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject:
        software.amazon.awscdk.services.acmpca.CfnCertificateAuthorityActivationProps,
  ) : CdkObject(cdkObject), CfnCertificateAuthorityActivationProps {
    override fun certificate(): String = unwrap(this).getCertificate()

    override fun certificateAuthorityArn(): String = unwrap(this).getCertificateAuthorityArn()

    override fun certificateChain(): String? = unwrap(this).getCertificateChain()

    override fun status(): String? = unwrap(this).getStatus()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}):
        CfnCertificateAuthorityActivationProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.acmpca.CfnCertificateAuthorityActivationProps):
        CfnCertificateAuthorityActivationProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnCertificateAuthorityActivationProps):
        software.amazon.awscdk.services.acmpca.CfnCertificateAuthorityActivationProps = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.acmpca.CfnCertificateAuthorityActivationProps
  }
}
