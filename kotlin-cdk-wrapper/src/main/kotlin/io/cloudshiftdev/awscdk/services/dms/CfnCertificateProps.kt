@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.dms

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String
import kotlin.Unit

public interface CfnCertificateProps {
  public fun certificateIdentifier(): String? = unwrap(this).getCertificateIdentifier()

  public fun certificatePem(): String? = unwrap(this).getCertificatePem()

  public fun certificateWallet(): String? = unwrap(this).getCertificateWallet()

  @CdkDslMarker
  public interface Builder {
    public fun certificateIdentifier(certificateIdentifier: String)

    public fun certificatePem(certificatePem: String)

    public fun certificateWallet(certificateWallet: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.dms.CfnCertificateProps.Builder =
        software.amazon.awscdk.services.dms.CfnCertificateProps.builder()

    override fun certificateIdentifier(certificateIdentifier: String) {
      cdkBuilder.certificateIdentifier(certificateIdentifier)
    }

    override fun certificatePem(certificatePem: String) {
      cdkBuilder.certificatePem(certificatePem)
    }

    override fun certificateWallet(certificateWallet: String) {
      cdkBuilder.certificateWallet(certificateWallet)
    }

    public fun build(): software.amazon.awscdk.services.dms.CfnCertificateProps = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.dms.CfnCertificateProps,
  ) : CdkObject(cdkObject), CfnCertificateProps {
    override fun certificateIdentifier(): String? = unwrap(this).getCertificateIdentifier()

    override fun certificatePem(): String? = unwrap(this).getCertificatePem()

    override fun certificateWallet(): String? = unwrap(this).getCertificateWallet()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnCertificateProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.dms.CfnCertificateProps):
        CfnCertificateProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnCertificateProps):
        software.amazon.awscdk.services.dms.CfnCertificateProps = (wrapped as CdkObject).cdkObject
        as software.amazon.awscdk.services.dms.CfnCertificateProps
  }
}
