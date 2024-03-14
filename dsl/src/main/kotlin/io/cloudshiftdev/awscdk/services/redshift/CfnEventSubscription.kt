package io.cloudshiftdev.awscdk.services.redshift

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.ITaggable
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnEventSubscription internal constructor(
  private val cdkObject: software.amazon.awscdk.services.redshift.CfnEventSubscription,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  public open fun attrCustSubscriptionId(): String = unwrap(this).getAttrCustSubscriptionId()

  public open fun attrCustomerAwsId(): String = unwrap(this).getAttrCustomerAwsId()

  public open fun attrEventCategoriesList(): List<String> =
      unwrap(this).getAttrEventCategoriesList()

  public open fun attrSourceIdsList(): List<String> = unwrap(this).getAttrSourceIdsList()

  public open fun attrStatus(): String = unwrap(this).getAttrStatus()

  public open fun attrSubscriptionCreationTime(): String =
      unwrap(this).getAttrSubscriptionCreationTime()

  public open fun enabled(): Any? = unwrap(this).getEnabled()

  public open fun enabled(`value`: Boolean) {
    unwrap(this).setEnabled(`value`)
  }

  public open fun enabled(`value`: IResolvable) {
    unwrap(this).setEnabled(`value`.let(IResolvable::unwrap))
  }

  public open fun eventCategories(): List<String> = unwrap(this).getEventCategories() ?: emptyList()

  public open fun eventCategories(`value`: List<String>) {
    unwrap(this).setEventCategories(`value`)
  }

  public open fun eventCategories(vararg `value`: String): Unit = eventCategories(`value`.toList())

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun severity(): String? = unwrap(this).getSeverity()

  public open fun severity(`value`: String) {
    unwrap(this).setSeverity(`value`)
  }

  public open fun snsTopicArn(): String? = unwrap(this).getSnsTopicArn()

  public open fun snsTopicArn(`value`: String) {
    unwrap(this).setSnsTopicArn(`value`)
  }

  public open fun sourceIds(): List<String> = unwrap(this).getSourceIds() ?: emptyList()

  public open fun sourceIds(`value`: List<String>) {
    unwrap(this).setSourceIds(`value`)
  }

  public open fun sourceIds(vararg `value`: String): Unit = sourceIds(`value`.toList())

  public open fun sourceType(): String? = unwrap(this).getSourceType()

  public open fun sourceType(`value`: String) {
    unwrap(this).setSourceType(`value`)
  }

  public open fun subscriptionName(): String = unwrap(this).getSubscriptionName()

  public open fun subscriptionName(`value`: String) {
    unwrap(this).setSubscriptionName(`value`)
  }

  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  public open fun tagsRaw(): List<CfnTag> = unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?:
      emptyList()

  public open fun tagsRaw(`value`: List<CfnTag>) {
    unwrap(this).setTagsRaw(`value`.map(CfnTag::unwrap))
  }

  public open fun tagsRaw(vararg `value`: CfnTag): Unit = tagsRaw(`value`.toList())

  public interface Builder {
    public fun enabled(enabled: Boolean)

    public fun enabled(enabled: IResolvable)

    public fun eventCategories(eventCategories: List<String>)

    public fun eventCategories(vararg eventCategories: String)

    public fun severity(severity: String)

    public fun snsTopicArn(snsTopicArn: String)

    public fun sourceIds(sourceIds: List<String>)

    public fun sourceIds(vararg sourceIds: String)

    public fun sourceType(sourceType: String)

    public fun subscriptionName(subscriptionName: String)

    public fun tags(tags: List<CfnTag>)

    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.redshift.CfnEventSubscription.Builder =
        software.amazon.awscdk.services.redshift.CfnEventSubscription.Builder.create(scope, id)

    override fun enabled(enabled: Boolean) {
      cdkBuilder.enabled(enabled)
    }

    override fun enabled(enabled: IResolvable) {
      cdkBuilder.enabled(enabled.let(IResolvable::unwrap))
    }

    override fun eventCategories(eventCategories: List<String>) {
      cdkBuilder.eventCategories(eventCategories)
    }

    override fun eventCategories(vararg eventCategories: String): Unit =
        eventCategories(eventCategories.toList())

    override fun severity(severity: String) {
      cdkBuilder.severity(severity)
    }

    override fun snsTopicArn(snsTopicArn: String) {
      cdkBuilder.snsTopicArn(snsTopicArn)
    }

    override fun sourceIds(sourceIds: List<String>) {
      cdkBuilder.sourceIds(sourceIds)
    }

    override fun sourceIds(vararg sourceIds: String): Unit = sourceIds(sourceIds.toList())

    override fun sourceType(sourceType: String) {
      cdkBuilder.sourceType(sourceType)
    }

    override fun subscriptionName(subscriptionName: String) {
      cdkBuilder.subscriptionName(subscriptionName)
    }

    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.redshift.CfnEventSubscription =
        cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnEventSubscription {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnEventSubscription(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.redshift.CfnEventSubscription):
        CfnEventSubscription = CfnEventSubscription(cdkObject)

    internal fun unwrap(wrapped: CfnEventSubscription):
        software.amazon.awscdk.services.redshift.CfnEventSubscription = wrapped.cdkObject
  }
}
