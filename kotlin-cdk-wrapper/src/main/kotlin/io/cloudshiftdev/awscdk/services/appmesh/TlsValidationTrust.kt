@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.appmesh

import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.services.acmpca.ICertificateAuthority
import io.cloudshiftdev.constructs.Construct
import kotlin.String
import kotlin.collections.List

public abstract class TlsValidationTrust internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.appmesh.TlsValidationTrust,
) : CdkObject(cdkObject) {
  public open fun bind(arg0: Construct): TlsValidationTrustConfig =
      unwrap(this).bind(arg0.let(Construct::unwrap)).let(TlsValidationTrustConfig::wrap)

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.appmesh.TlsValidationTrust,
  ) : TlsValidationTrust(cdkObject)

  public companion object {
    public fun acm(certificateAuthorities: List<ICertificateAuthority>): TlsValidationTrust =
        software.amazon.awscdk.services.appmesh.TlsValidationTrust.acm(certificateAuthorities.map(ICertificateAuthority::unwrap)).let(TlsValidationTrust::wrap)

    public fun acm(vararg certificateAuthorities: ICertificateAuthority): TlsValidationTrust =
        acm(certificateAuthorities.toList())

    public fun `file`(certificateChain: String): MutualTlsValidationTrust =
        software.amazon.awscdk.services.appmesh.TlsValidationTrust.`file`(certificateChain).let(MutualTlsValidationTrust::wrap)

    public fun sds(secretName: String): MutualTlsValidationTrust =
        software.amazon.awscdk.services.appmesh.TlsValidationTrust.sds(secretName).let(MutualTlsValidationTrust::wrap)

    internal fun wrap(cdkObject: software.amazon.awscdk.services.appmesh.TlsValidationTrust):
        TlsValidationTrust = Wrapper(cdkObject)

    internal fun unwrap(wrapped: TlsValidationTrust):
        software.amazon.awscdk.services.appmesh.TlsValidationTrust = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.appmesh.TlsValidationTrust
  }
}
