@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.iot

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String
import kotlin.Unit

public interface CfnCertificateProps {
  public fun caCertificatePem(): String? = unwrap(this).getCaCertificatePem()

  public fun certificateMode(): String? = unwrap(this).getCertificateMode()

  public fun certificatePem(): String? = unwrap(this).getCertificatePem()

  public fun certificateSigningRequest(): String? = unwrap(this).getCertificateSigningRequest()

  public fun status(): String

  @CdkDslMarker
  public interface Builder {
    public fun caCertificatePem(caCertificatePem: String)

    public fun certificateMode(certificateMode: String)

    public fun certificatePem(certificatePem: String)

    public fun certificateSigningRequest(certificateSigningRequest: String)

    public fun status(status: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.iot.CfnCertificateProps.Builder =
        software.amazon.awscdk.services.iot.CfnCertificateProps.builder()

    override fun caCertificatePem(caCertificatePem: String) {
      cdkBuilder.caCertificatePem(caCertificatePem)
    }

    override fun certificateMode(certificateMode: String) {
      cdkBuilder.certificateMode(certificateMode)
    }

    override fun certificatePem(certificatePem: String) {
      cdkBuilder.certificatePem(certificatePem)
    }

    override fun certificateSigningRequest(certificateSigningRequest: String) {
      cdkBuilder.certificateSigningRequest(certificateSigningRequest)
    }

    override fun status(status: String) {
      cdkBuilder.status(status)
    }

    public fun build(): software.amazon.awscdk.services.iot.CfnCertificateProps = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.iot.CfnCertificateProps,
  ) : CdkObject(cdkObject), CfnCertificateProps {
    override fun caCertificatePem(): String? = unwrap(this).getCaCertificatePem()

    override fun certificateMode(): String? = unwrap(this).getCertificateMode()

    override fun certificatePem(): String? = unwrap(this).getCertificatePem()

    override fun certificateSigningRequest(): String? = unwrap(this).getCertificateSigningRequest()

    override fun status(): String = unwrap(this).getStatus()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnCertificateProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.iot.CfnCertificateProps):
        CfnCertificateProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnCertificateProps):
        software.amazon.awscdk.services.iot.CfnCertificateProps = (wrapped as CdkObject).cdkObject
        as software.amazon.awscdk.services.iot.CfnCertificateProps
  }
}
