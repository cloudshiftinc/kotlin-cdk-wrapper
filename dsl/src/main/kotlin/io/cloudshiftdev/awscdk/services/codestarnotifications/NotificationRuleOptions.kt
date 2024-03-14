package io.cloudshiftdev.awscdk.services.codestarnotifications

import kotlin.Boolean
import kotlin.String
import kotlin.Unit

public interface NotificationRuleOptions {
  public fun detailType(): DetailType? = unwrap(this).getDetailType()?.let(DetailType::wrap)

  public fun enabled(): Boolean? = unwrap(this).getEnabled()

  public fun notificationRuleName(): String? = unwrap(this).getNotificationRuleName()

  public interface Builder {
    public fun detailType(detailType: DetailType)

    public fun enabled(enabled: Boolean)

    public fun notificationRuleName(notificationRuleName: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.codestarnotifications.NotificationRuleOptions.Builder =
        software.amazon.awscdk.services.codestarnotifications.NotificationRuleOptions.builder()

    override fun detailType(detailType: DetailType) {
      cdkBuilder.detailType(detailType.let(DetailType::unwrap))
    }

    override fun enabled(enabled: Boolean) {
      cdkBuilder.enabled(enabled)
    }

    override fun notificationRuleName(notificationRuleName: String) {
      cdkBuilder.notificationRuleName(notificationRuleName)
    }

    public fun build():
        software.amazon.awscdk.services.codestarnotifications.NotificationRuleOptions =
        cdkBuilder.build()
  }

  private class Wrapper internal constructor(
    internal val cdkObject:
        software.amazon.awscdk.services.codestarnotifications.NotificationRuleOptions,
  ) : NotificationRuleOptions {
    override fun detailType(): DetailType? = unwrap(this).getDetailType()?.let(DetailType::wrap)

    override fun enabled(): Boolean? = unwrap(this).getEnabled()

    override fun notificationRuleName(): String? = unwrap(this).getNotificationRuleName()
  }

  public companion object {
    init {

    }

    public operator fun invoke(block: Builder.() -> Unit = {}): NotificationRuleOptions {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.codestarnotifications.NotificationRuleOptions):
        NotificationRuleOptions = Wrapper(cdkObject)

    internal fun unwrap(wrapped: NotificationRuleOptions):
        software.amazon.awscdk.services.codestarnotifications.NotificationRuleOptions = (wrapped as
        Wrapper).cdkObject
  }
}
