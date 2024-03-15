@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ses

import io.cloudshiftdev.awscdk.Resource
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.services.iam.Grant
import io.cloudshiftdev.awscdk.services.iam.IGrantable
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class EmailIdentity internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.ses.EmailIdentity,
) : Resource(cdkObject), IEmailIdentity {
  public open fun dkimDnsTokenName1(): String = unwrap(this).getDkimDnsTokenName1()

  public open fun dkimDnsTokenName2(): String = unwrap(this).getDkimDnsTokenName2()

  public open fun dkimDnsTokenName3(): String = unwrap(this).getDkimDnsTokenName3()

  public open fun dkimDnsTokenValue1(): String = unwrap(this).getDkimDnsTokenValue1()

  public open fun dkimDnsTokenValue2(): String = unwrap(this).getDkimDnsTokenValue2()

  public open fun dkimDnsTokenValue3(): String = unwrap(this).getDkimDnsTokenValue3()

  public open fun dkimRecords(): List<DkimRecord> =
      unwrap(this).getDkimRecords().map(DkimRecord::wrap)

  public override fun emailIdentityArn(): String = unwrap(this).getEmailIdentityArn()

  public override fun emailIdentityName(): String = unwrap(this).getEmailIdentityName()

  public override fun grant(grantee: IGrantable, actions: String): Grant =
      unwrap(this).grant(grantee.let(IGrantable::unwrap), actions).let(Grant::wrap)

  public override fun grantSendEmail(grantee: IGrantable): Grant =
      unwrap(this).grantSendEmail(grantee.let(IGrantable::unwrap)).let(Grant::wrap)

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

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ses.EmailIdentity.Builder =
        software.amazon.awscdk.services.ses.EmailIdentity.Builder.create(scope, id)

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

    public fun build(): software.amazon.awscdk.services.ses.EmailIdentity = cdkBuilder.build()
  }

  public companion object {
    public fun fromEmailIdentityName(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      emailIdentityName: String,
    ): IEmailIdentity =
        software.amazon.awscdk.services.ses.EmailIdentity.fromEmailIdentityName(scope.let(CloudshiftdevConstructsConstruct::unwrap),
        id, emailIdentityName).let(IEmailIdentity::wrap)

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): EmailIdentity {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return EmailIdentity(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ses.EmailIdentity): EmailIdentity =
        EmailIdentity(cdkObject)

    internal fun unwrap(wrapped: EmailIdentity): software.amazon.awscdk.services.ses.EmailIdentity =
        wrapped.cdkObject
  }
}
