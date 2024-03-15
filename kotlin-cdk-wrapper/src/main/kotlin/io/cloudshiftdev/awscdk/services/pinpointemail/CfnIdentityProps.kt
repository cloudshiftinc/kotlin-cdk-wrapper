@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.pinpointemail

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

public interface CfnIdentityProps {
  public fun dkimSigningEnabled(): Any? = unwrap(this).getDkimSigningEnabled()

  public fun feedbackForwardingEnabled(): Any? = unwrap(this).getFeedbackForwardingEnabled()

  public fun mailFromAttributes(): Any? = unwrap(this).getMailFromAttributes()

  public fun name(): String

  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  @CdkDslMarker
  public interface Builder {
    public fun dkimSigningEnabled(dkimSigningEnabled: Boolean)

    public fun dkimSigningEnabled(dkimSigningEnabled: IResolvable)

    public fun feedbackForwardingEnabled(feedbackForwardingEnabled: Boolean)

    public fun feedbackForwardingEnabled(feedbackForwardingEnabled: IResolvable)

    public fun mailFromAttributes(mailFromAttributes: IResolvable)

    public fun mailFromAttributes(mailFromAttributes: CfnIdentity.MailFromAttributesProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("1890e2b08a51359d1c8dc4d99e46280a38fa9ea2bb48060d87c2352fb6fe4206")
    public
        fun mailFromAttributes(mailFromAttributes: CfnIdentity.MailFromAttributesProperty.Builder.() -> Unit)

    public fun name(name: String)

    public fun tags(tags: List<CfnTag>)

    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.pinpointemail.CfnIdentityProps.Builder =
        software.amazon.awscdk.services.pinpointemail.CfnIdentityProps.builder()

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

    override fun mailFromAttributes(mailFromAttributes: CfnIdentity.MailFromAttributesProperty) {
      cdkBuilder.mailFromAttributes(mailFromAttributes.let(CfnIdentity.MailFromAttributesProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("1890e2b08a51359d1c8dc4d99e46280a38fa9ea2bb48060d87c2352fb6fe4206")
    override
        fun mailFromAttributes(mailFromAttributes: CfnIdentity.MailFromAttributesProperty.Builder.() -> Unit):
        Unit = mailFromAttributes(CfnIdentity.MailFromAttributesProperty(mailFromAttributes))

    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.pinpointemail.CfnIdentityProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.pinpointemail.CfnIdentityProps,
  ) : CdkObject(cdkObject), CfnIdentityProps {
    override fun dkimSigningEnabled(): Any? = unwrap(this).getDkimSigningEnabled()

    override fun feedbackForwardingEnabled(): Any? = unwrap(this).getFeedbackForwardingEnabled()

    override fun mailFromAttributes(): Any? = unwrap(this).getMailFromAttributes()

    override fun name(): String = unwrap(this).getName()

    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnIdentityProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.pinpointemail.CfnIdentityProps):
        CfnIdentityProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnIdentityProps):
        software.amazon.awscdk.services.pinpointemail.CfnIdentityProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.pinpointemail.CfnIdentityProps
  }
}
