@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ses

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Boolean
import kotlin.String
import kotlin.Unit

public interface EmailIdentityProps {
  public fun configurationSet(): IConfigurationSet? =
      unwrap(this).getConfigurationSet()?.let(IConfigurationSet::wrap)

  public fun dkimIdentity(): DkimIdentity? = unwrap(this).getDkimIdentity()?.let(DkimIdentity::wrap)

  public fun dkimSigning(): Boolean? = unwrap(this).getDkimSigning()

  public fun feedbackForwarding(): Boolean? = unwrap(this).getFeedbackForwarding()

  public fun identity(): Identity

  public fun mailFromBehaviorOnMxFailure(): MailFromBehaviorOnMxFailure? =
      unwrap(this).getMailFromBehaviorOnMxFailure()?.let(MailFromBehaviorOnMxFailure::wrap)

  public fun mailFromDomain(): String? = unwrap(this).getMailFromDomain()

  @CdkDslMarker
  public interface Builder {
    public fun configurationSet(configurationSet: IConfigurationSet)

    public fun dkimIdentity(dkimIdentity: DkimIdentity)

    public fun dkimSigning(dkimSigning: Boolean)

    public fun feedbackForwarding(feedbackForwarding: Boolean)

    public fun identity(identity: Identity)

    public fun mailFromBehaviorOnMxFailure(mailFromBehaviorOnMxFailure: MailFromBehaviorOnMxFailure)

    public fun mailFromDomain(mailFromDomain: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ses.EmailIdentityProps.Builder =
        software.amazon.awscdk.services.ses.EmailIdentityProps.builder()

    override fun configurationSet(configurationSet: IConfigurationSet) {
      cdkBuilder.configurationSet(configurationSet.let(IConfigurationSet::unwrap))
    }

    override fun dkimIdentity(dkimIdentity: DkimIdentity) {
      cdkBuilder.dkimIdentity(dkimIdentity.let(DkimIdentity::unwrap))
    }

    override fun dkimSigning(dkimSigning: Boolean) {
      cdkBuilder.dkimSigning(dkimSigning)
    }

    override fun feedbackForwarding(feedbackForwarding: Boolean) {
      cdkBuilder.feedbackForwarding(feedbackForwarding)
    }

    override fun identity(identity: Identity) {
      cdkBuilder.identity(identity.let(Identity::unwrap))
    }

    override
        fun mailFromBehaviorOnMxFailure(mailFromBehaviorOnMxFailure: MailFromBehaviorOnMxFailure) {
      cdkBuilder.mailFromBehaviorOnMxFailure(mailFromBehaviorOnMxFailure.let(MailFromBehaviorOnMxFailure::unwrap))
    }

    override fun mailFromDomain(mailFromDomain: String) {
      cdkBuilder.mailFromDomain(mailFromDomain)
    }

    public fun build(): software.amazon.awscdk.services.ses.EmailIdentityProps = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.ses.EmailIdentityProps,
  ) : CdkObject(cdkObject), EmailIdentityProps {
    override fun configurationSet(): IConfigurationSet? =
        unwrap(this).getConfigurationSet()?.let(IConfigurationSet::wrap)

    override fun dkimIdentity(): DkimIdentity? =
        unwrap(this).getDkimIdentity()?.let(DkimIdentity::wrap)

    override fun dkimSigning(): Boolean? = unwrap(this).getDkimSigning()

    override fun feedbackForwarding(): Boolean? = unwrap(this).getFeedbackForwarding()

    override fun identity(): Identity = unwrap(this).getIdentity().let(Identity::wrap)

    override fun mailFromBehaviorOnMxFailure(): MailFromBehaviorOnMxFailure? =
        unwrap(this).getMailFromBehaviorOnMxFailure()?.let(MailFromBehaviorOnMxFailure::wrap)

    override fun mailFromDomain(): String? = unwrap(this).getMailFromDomain()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): EmailIdentityProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ses.EmailIdentityProps):
        EmailIdentityProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: EmailIdentityProps):
        software.amazon.awscdk.services.ses.EmailIdentityProps = (wrapped as CdkObject).cdkObject as
        software.amazon.awscdk.services.ses.EmailIdentityProps
  }
}
