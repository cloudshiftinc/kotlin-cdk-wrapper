package io.cloudshiftdev.awscdk.services.appmesh

import io.cloudshiftdev.awscdk.services.certificatemanager.ICertificate
import io.cloudshiftdev.constructs.Construct
import kotlin.String

public abstract class TlsCertificate internal constructor(
  private val cdkObject: software.amazon.awscdk.services.appmesh.TlsCertificate,
) {
  public open fun bind(arg0: Construct): TlsCertificateConfig =
      unwrap(this).bind(arg0.let(Construct::unwrap)).let(TlsCertificateConfig::wrap)

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.appmesh.TlsCertificate,
  ) : TlsCertificate(cdkObject)

  public companion object {
    public open fun acm(certificate: ICertificate): TlsCertificate =
        software.amazon.awscdk.services.appmesh.TlsCertificate.acm(certificate.let(ICertificate::unwrap)).let(TlsCertificate::wrap)

    public open fun `file`(certificateChainPath: String, privateKeyPath: String):
        MutualTlsCertificate =
        software.amazon.awscdk.services.appmesh.TlsCertificate.`file`(certificateChainPath,
        privateKeyPath).let(MutualTlsCertificate::wrap)

    public open fun sds(secretName: String): MutualTlsCertificate =
        software.amazon.awscdk.services.appmesh.TlsCertificate.sds(secretName).let(MutualTlsCertificate::wrap)

    internal fun wrap(cdkObject: software.amazon.awscdk.services.appmesh.TlsCertificate):
        TlsCertificate = Wrapper(cdkObject)

    internal fun unwrap(wrapped: TlsCertificate):
        software.amazon.awscdk.services.appmesh.TlsCertificate = (wrapped as Wrapper).cdkObject
  }
}
