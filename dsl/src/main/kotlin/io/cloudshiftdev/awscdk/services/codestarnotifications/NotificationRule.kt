package io.cloudshiftdev.awscdk.services.codestarnotifications

import io.cloudshiftdev.awscdk.Resource
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class NotificationRule internal constructor(
  private val cdkObject: software.amazon.awscdk.services.codestarnotifications.NotificationRule,
) : Resource(cdkObject), INotificationRule {
  public override fun addTarget(target: INotificationRuleTarget): Boolean =
      unwrap(this).addTarget(target.let(INotificationRuleTarget::unwrap))

  public override fun notificationRuleArn(): String = unwrap(this).getNotificationRuleArn()

  public interface Builder {
    public fun detailType(detailType: DetailType) {
    }

    public fun enabled(enabled: Boolean) {
    }

    public fun events(events: List<String>) {
    }

    public fun notificationRuleName(notificationRuleName: String) {
    }

    public fun source(source: INotificationRuleSource) {
    }

    public fun targets(targets: List<INotificationRuleTarget>) {
    }
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.codestarnotifications.NotificationRule.Builder =
        software.amazon.awscdk.services.codestarnotifications.NotificationRule.Builder.create(scope,
        id)

    public override fun detailType(detailType: DetailType) {
      cdkBuilder.detailType(detailType.let(DetailType::unwrap))
    }

    public override fun enabled(enabled: Boolean) {
      cdkBuilder.enabled(enabled)
    }

    public override fun events(events: List<String>) {
      cdkBuilder.events(events)
    }

    public override fun notificationRuleName(notificationRuleName: String) {
      cdkBuilder.notificationRuleName(notificationRuleName)
    }

    public override fun source(source: INotificationRuleSource) {
      cdkBuilder.source(source.let(INotificationRuleSource::unwrap))
    }

    public override fun targets(targets: List<INotificationRuleTarget>) {
      cdkBuilder.targets(targets.map(INotificationRuleTarget::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.codestarnotifications.NotificationRule =
        cdkBuilder.build()
  }

  public companion object {
    public open fun fromNotificationRuleArn(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      notificationRuleArn: String,
    ): INotificationRule =
        software.amazon.awscdk.services.codestarnotifications.NotificationRule.fromNotificationRuleArn(scope.let(CloudshiftdevConstructsConstruct::unwrap),
        id, notificationRuleArn).let(INotificationRule::wrap)

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): NotificationRule {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return NotificationRule(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.codestarnotifications.NotificationRule):
        NotificationRule = NotificationRule(cdkObject)

    internal fun unwrap(wrapped: NotificationRule):
        software.amazon.awscdk.services.codestarnotifications.NotificationRule = wrapped.cdkObject
  }
}
