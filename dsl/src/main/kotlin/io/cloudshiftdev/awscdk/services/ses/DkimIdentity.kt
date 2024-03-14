package io.cloudshiftdev.awscdk.services.ses

import io.cloudshiftdev.awscdk.CdkObject
import io.cloudshiftdev.awscdk.services.route53.IPublicHostedZone
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName

public abstract class DkimIdentity internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.ses.DkimIdentity,
) : CdkObject(cdkObject) {
  /**
   * Binds this DKIM identity to the email identity.
   *
   * @param emailIdentity 
   * @param hostedZone
   */
  public open fun bind(emailIdentity: EmailIdentity): DkimIdentityConfig? =
      unwrap(this).bind(emailIdentity.let(EmailIdentity::unwrap))?.let(DkimIdentityConfig::wrap)

  /**
   * Binds this DKIM identity to the email identity.
   *
   * @param emailIdentity 
   * @param hostedZone
   */
  public open fun bind(emailIdentity: EmailIdentity, hostedZone: IPublicHostedZone):
      DkimIdentityConfig? = unwrap(this).bind(emailIdentity.let(EmailIdentity::unwrap),
      hostedZone.let(IPublicHostedZone::unwrap))?.let(DkimIdentityConfig::wrap)

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.ses.DkimIdentity,
  ) : DkimIdentity(cdkObject)

  public companion object {
    public fun byoDkim(options: ByoDkimOptions): DkimIdentity =
        software.amazon.awscdk.services.ses.DkimIdentity.byoDkim(options.let(ByoDkimOptions::unwrap)).let(DkimIdentity::wrap)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("3bfff2fcb89d53bfb99ba06b7f9047a977afc3c905867e474890d4c288deeedd")
    public fun byoDkim(options: ByoDkimOptions.Builder.() -> Unit): DkimIdentity =
        byoDkim(ByoDkimOptions(options))

    public fun easyDkim(): DkimIdentity =
        software.amazon.awscdk.services.ses.DkimIdentity.easyDkim().let(DkimIdentity::wrap)

    public fun easyDkim(signingKeyLength: EasyDkimSigningKeyLength): DkimIdentity =
        software.amazon.awscdk.services.ses.DkimIdentity.easyDkim(signingKeyLength.let(EasyDkimSigningKeyLength::unwrap)).let(DkimIdentity::wrap)

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ses.DkimIdentity): DkimIdentity =
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: DkimIdentity): software.amazon.awscdk.services.ses.DkimIdentity =
        (wrapped as CdkObject).cdkObject as software.amazon.awscdk.services.ses.DkimIdentity
  }
}
