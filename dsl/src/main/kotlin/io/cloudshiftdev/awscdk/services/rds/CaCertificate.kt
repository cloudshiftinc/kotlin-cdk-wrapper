package io.cloudshiftdev.awscdk.services.rds

import io.cloudshiftdev.awscdk.CdkObject
import kotlin.String

public open class CaCertificate internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.rds.CaCertificate,
) : CdkObject(cdkObject) {
  public companion object {
    public fun of(identifier: String): CaCertificate =
        software.amazon.awscdk.services.rds.CaCertificate.of(identifier).let(CaCertificate::wrap)

    internal fun wrap(cdkObject: software.amazon.awscdk.services.rds.CaCertificate): CaCertificate =
        CaCertificate(cdkObject)

    internal fun unwrap(wrapped: CaCertificate): software.amazon.awscdk.services.rds.CaCertificate =
        wrapped.cdkObject
  }
}
