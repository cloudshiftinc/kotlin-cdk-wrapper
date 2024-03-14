package io.cloudshiftdev.awscdk.services.pinpointemail

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.ITaggableV2
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnIdentity internal constructor(
  private val cdkObject: software.amazon.awscdk.services.pinpointemail.CfnIdentity,
) : CfnResource(cdkObject), IInspectable, ITaggableV2 {
  public open fun attrId(): String = unwrap(this).getAttrId()

  public open fun attrIdentityDnsRecordName1(): String =
      unwrap(this).getAttrIdentityDnsRecordName1()

  public open fun attrIdentityDnsRecordName2(): String =
      unwrap(this).getAttrIdentityDnsRecordName2()

  public open fun attrIdentityDnsRecordName3(): String =
      unwrap(this).getAttrIdentityDnsRecordName3()

  public open fun attrIdentityDnsRecordValue1(): String =
      unwrap(this).getAttrIdentityDnsRecordValue1()

  public open fun attrIdentityDnsRecordValue2(): String =
      unwrap(this).getAttrIdentityDnsRecordValue2()

  public open fun attrIdentityDnsRecordValue3(): String =
      unwrap(this).getAttrIdentityDnsRecordValue3()

  public override fun cdkTagManager(): TagManager =
      unwrap(this).getCdkTagManager().let(TagManager::wrap)

  public open fun dkimSigningEnabled(): Any? = unwrap(this).getDkimSigningEnabled()

  public open fun dkimSigningEnabled(`value`: Boolean) {
    unwrap(this).setDkimSigningEnabled(`value`)
  }

  public open fun dkimSigningEnabled(`value`: IResolvable) {
    unwrap(this).setDkimSigningEnabled(`value`.let(IResolvable::unwrap))
  }

  public open fun feedbackForwardingEnabled(): Any? = unwrap(this).getFeedbackForwardingEnabled()

  public open fun feedbackForwardingEnabled(`value`: Boolean) {
    unwrap(this).setFeedbackForwardingEnabled(`value`)
  }

  public open fun feedbackForwardingEnabled(`value`: IResolvable) {
    unwrap(this).setFeedbackForwardingEnabled(`value`.let(IResolvable::unwrap))
  }

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun mailFromAttributes(): Any? = unwrap(this).getMailFromAttributes()

  public open fun mailFromAttributes(`value`: IResolvable) {
    unwrap(this).setMailFromAttributes(`value`.let(IResolvable::unwrap))
  }

  public open fun mailFromAttributes(`value`: MailFromAttributesProperty) {
    unwrap(this).setMailFromAttributes(`value`.let(MailFromAttributesProperty::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("96c1f78a63f373bd65a481250d583f24595a2524adec80d56afeae4373a6ad36")
  public open fun mailFromAttributes(`value`: MailFromAttributesProperty.Builder.() -> Unit): Unit =
      mailFromAttributes(MailFromAttributesProperty(`value`))

  public open fun name(): String = unwrap(this).getName()

  public open fun name(`value`: String) {
    unwrap(this).setName(`value`)
  }

  public open fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  public open fun tags(`value`: List<CfnTag>) {
    unwrap(this).setTags(`value`.map(CfnTag::unwrap))
  }

  public open fun tags(vararg `value`: CfnTag): Unit = tags(`value`.toList())

  public interface Builder {
    public fun dkimSigningEnabled(dkimSigningEnabled: Boolean)

    public fun dkimSigningEnabled(dkimSigningEnabled: IResolvable)

    public fun feedbackForwardingEnabled(feedbackForwardingEnabled: Boolean)

    public fun feedbackForwardingEnabled(feedbackForwardingEnabled: IResolvable)

    public fun mailFromAttributes(mailFromAttributes: IResolvable)

    public fun mailFromAttributes(mailFromAttributes: MailFromAttributesProperty)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("8453518f907ad724d13149546a0012a7042eed12ce92092d934e6c47399c20ed")
    public fun mailFromAttributes(mailFromAttributes: MailFromAttributesProperty.Builder.() -> Unit)

    public fun name(name: String)

    public fun tags(tags: List<CfnTag>)

    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.pinpointemail.CfnIdentity.Builder =
        software.amazon.awscdk.services.pinpointemail.CfnIdentity.Builder.create(scope, id)

    override fun dkimSigningEnabled(dkimSigningEnabled: Boolean) {
      cdkBuilder.dkimSigningEnabled(dkimSigningEnabled)
    }

    override fun dkimSigningEnabled(dkimSigningEnabled: IResolvable) {
      cdkBuilder.dkimSigningEnabled(dkimSigningEnabled.let(IResolvable::unwrap))
    }

    override fun feedbackForwardingEnabled(feedbackForwardingEnabled: Boolean) {
      cdkBuilder.feedbackForwardingEnabled(feedbackForwardingEnabled)
    }

    override fun feedbackForwardingEnabled(feedbackForwardingEnabled: IResolvable) {
      cdkBuilder.feedbackForwardingEnabled(feedbackForwardingEnabled.let(IResolvable::unwrap))
    }

    override fun mailFromAttributes(mailFromAttributes: IResolvable) {
      cdkBuilder.mailFromAttributes(mailFromAttributes.let(IResolvable::unwrap))
    }

    override fun mailFromAttributes(mailFromAttributes: MailFromAttributesProperty) {
      cdkBuilder.mailFromAttributes(mailFromAttributes.let(MailFromAttributesProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("8453518f907ad724d13149546a0012a7042eed12ce92092d934e6c47399c20ed")
    override
        fun mailFromAttributes(mailFromAttributes: MailFromAttributesProperty.Builder.() -> Unit):
        Unit = mailFromAttributes(MailFromAttributesProperty(mailFromAttributes))

    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.pinpointemail.CfnIdentity =
        cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnIdentity {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnIdentity(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.pinpointemail.CfnIdentity):
        CfnIdentity = CfnIdentity(cdkObject)

    internal fun unwrap(wrapped: CfnIdentity):
        software.amazon.awscdk.services.pinpointemail.CfnIdentity = wrapped.cdkObject
  }

  public interface MailFromAttributesProperty {
    public fun behaviorOnMxFailure(): String? = unwrap(this).getBehaviorOnMxFailure()

    public fun mailFromDomain(): String? = unwrap(this).getMailFromDomain()

    public interface Builder {
      public fun behaviorOnMxFailure(behaviorOnMxFailure: String)

      public fun mailFromDomain(mailFromDomain: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.pinpointemail.CfnIdentity.MailFromAttributesProperty.Builder
          =
          software.amazon.awscdk.services.pinpointemail.CfnIdentity.MailFromAttributesProperty.builder()

      override fun behaviorOnMxFailure(behaviorOnMxFailure: String) {
        cdkBuilder.behaviorOnMxFailure(behaviorOnMxFailure)
      }

      override fun mailFromDomain(mailFromDomain: String) {
        cdkBuilder.mailFromDomain(mailFromDomain)
      }

      public fun build():
          software.amazon.awscdk.services.pinpointemail.CfnIdentity.MailFromAttributesProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.pinpointemail.CfnIdentity.MailFromAttributesProperty,
    ) : MailFromAttributesProperty {
      override fun behaviorOnMxFailure(): String? = unwrap(this).getBehaviorOnMxFailure()

      override fun mailFromDomain(): String? = unwrap(this).getMailFromDomain()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): MailFromAttributesProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.pinpointemail.CfnIdentity.MailFromAttributesProperty):
          MailFromAttributesProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: MailFromAttributesProperty):
          software.amazon.awscdk.services.pinpointemail.CfnIdentity.MailFromAttributesProperty =
          (wrapped as Wrapper).cdkObject
    }
  }
}
