@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.codestarnotifications

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

public interface NotificationRuleProps : NotificationRuleOptions {
  public fun events(): List<String>

  public fun source(): INotificationRuleSource

  public fun targets(): List<INotificationRuleTarget> =
      unwrap(this).getTargets()?.map(INotificationRuleTarget::wrap) ?: emptyList()

  @CdkDslMarker
  public interface Builder {
    public fun detailType(detailType: DetailType)

    public fun enabled(enabled: Boolean)

    public fun events(events: List<String>)

    public fun events(vararg events: String)

    public fun notificationRuleName(notificationRuleName: String)

    public fun source(source: INotificationRuleSource)

    public fun targets(targets: List<INotificationRuleTarget>)

    public fun targets(vararg targets: INotificationRuleTarget)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.codestarnotifications.NotificationRuleProps.Builder =
        software.amazon.awscdk.services.codestarnotifications.NotificationRuleProps.builder()

    override fun detailType(detailType: DetailType) {
      cdkBuilder.detailType(detailType.let(DetailType::unwrap))
    }

    override fun enabled(enabled: Boolean) {
      cdkBuilder.enabled(enabled)
    }

    override fun events(events: List<String>) {
      cdkBuilder.events(events)
    }

    override fun events(vararg events: String): Unit = events(events.toList())

    override fun notificationRuleName(notificationRuleName: String) {
      cdkBuilder.notificationRuleName(notificationRuleName)
    }

    override fun source(source: INotificationRuleSource) {
      cdkBuilder.source(source.let(INotificationRuleSource::unwrap))
    }

    override fun targets(targets: List<INotificationRuleTarget>) {
      cdkBuilder.targets(targets.map(INotificationRuleTarget::unwrap))
    }

    override fun targets(vararg targets: INotificationRuleTarget): Unit = targets(targets.toList())

    public fun build(): software.amazon.awscdk.services.codestarnotifications.NotificationRuleProps
        = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject:
        software.amazon.awscdk.services.codestarnotifications.NotificationRuleProps,
  ) : CdkObject(cdkObject), NotificationRuleProps {
    override fun detailType(): DetailType? = unwrap(this).getDetailType()?.let(DetailType::wrap)

    override fun enabled(): Boolean? = unwrap(this).getEnabled()

    override fun events(): List<String> = unwrap(this).getEvents()

    override fun notificationRuleName(): String? = unwrap(this).getNotificationRuleName()

    override fun source(): INotificationRuleSource =
        unwrap(this).getSource().let(INotificationRuleSource::wrap)

    override fun targets(): List<INotificationRuleTarget> =
        unwrap(this).getTargets()?.map(INotificationRuleTarget::wrap) ?: emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): NotificationRuleProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.codestarnotifications.NotificationRuleProps):
        NotificationRuleProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: NotificationRuleProps):
        software.amazon.awscdk.services.codestarnotifications.NotificationRuleProps = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.codestarnotifications.NotificationRuleProps
  }
}
