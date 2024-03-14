package io.cloudshiftdev.awscdk.services.ses

import io.cloudshiftdev.awscdk.services.route53.IPublicHostedZone
import kotlin.String

public abstract class Identity internal constructor(
  private val cdkObject: software.amazon.awscdk.services.ses.Identity,
) {
  public open fun hostedZone(): IPublicHostedZone? =
      unwrap(this).getHostedZone()?.let(IPublicHostedZone::wrap)

  public open fun `value`(): String = unwrap(this).getValue()

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.ses.Identity,
  ) : Identity(cdkObject)

  public companion object {
    public open fun domain(domain: String): Identity =
        software.amazon.awscdk.services.ses.Identity.domain(domain).let(Identity::wrap)

    public open fun email(email: String): Identity =
        software.amazon.awscdk.services.ses.Identity.email(email).let(Identity::wrap)

    public open fun publicHostedZone(hostedZone: IPublicHostedZone): Identity =
        software.amazon.awscdk.services.ses.Identity.publicHostedZone(hostedZone.let(IPublicHostedZone::unwrap)).let(Identity::wrap)

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ses.Identity): Identity =
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: Identity): software.amazon.awscdk.services.ses.Identity = (wrapped
        as Wrapper).cdkObject
  }
}
