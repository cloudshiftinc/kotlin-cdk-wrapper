@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.dms

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

public interface CfnEventSubscriptionProps {
  public fun enabled(): Any? = unwrap(this).getEnabled()

  public fun eventCategories(): List<String> = unwrap(this).getEventCategories() ?: emptyList()

  public fun snsTopicArn(): String

  public fun sourceIds(): List<String> = unwrap(this).getSourceIds() ?: emptyList()

  public fun sourceType(): String? = unwrap(this).getSourceType()

  public fun subscriptionName(): String? = unwrap(this).getSubscriptionName()

  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  @CdkDslMarker
  public interface Builder {
    public fun enabled(enabled: Boolean)

    public fun enabled(enabled: IResolvable)

    public fun eventCategories(eventCategories: List<String>)

    public fun eventCategories(vararg eventCategories: String)

    public fun snsTopicArn(snsTopicArn: String)

    public fun sourceIds(sourceIds: List<String>)

    public fun sourceIds(vararg sourceIds: String)

    public fun sourceType(sourceType: String)

    public fun subscriptionName(subscriptionName: String)

    public fun tags(tags: List<CfnTag>)

    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.dms.CfnEventSubscriptionProps.Builder =
        software.amazon.awscdk.services.dms.CfnEventSubscriptionProps.builder()

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

    public fun build(): software.amazon.awscdk.services.dms.CfnEventSubscriptionProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.dms.CfnEventSubscriptionProps,
  ) : CdkObject(cdkObject), CfnEventSubscriptionProps {
    override fun enabled(): Any? = unwrap(this).getEnabled()

    override fun eventCategories(): List<String> = unwrap(this).getEventCategories() ?: emptyList()

    override fun snsTopicArn(): String = unwrap(this).getSnsTopicArn()

    override fun sourceIds(): List<String> = unwrap(this).getSourceIds() ?: emptyList()

    override fun sourceType(): String? = unwrap(this).getSourceType()

    override fun subscriptionName(): String? = unwrap(this).getSubscriptionName()

    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnEventSubscriptionProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.dms.CfnEventSubscriptionProps):
        CfnEventSubscriptionProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnEventSubscriptionProps):
        software.amazon.awscdk.services.dms.CfnEventSubscriptionProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.dms.CfnEventSubscriptionProps
  }
}
