package io.cloudshiftdev.awscdk.services.codecommit

import io.cloudshiftdev.awscdk.services.codestarnotifications.DetailType
import io.cloudshiftdev.awscdk.services.codestarnotifications.NotificationRuleOptions
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

public interface RepositoryNotifyOnOptions : NotificationRuleOptions {
  public fun events(): List<RepositoryNotificationEvents>

  public interface Builder {
    public fun detailType(detailType: DetailType)

    public fun enabled(enabled: Boolean)

    public fun events(events: List<RepositoryNotificationEvents>)

    public fun notificationRuleName(notificationRuleName: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.codecommit.RepositoryNotifyOnOptions.Builder =
        software.amazon.awscdk.services.codecommit.RepositoryNotifyOnOptions.builder()

    override fun detailType(detailType: DetailType) {
      cdkBuilder.detailType(detailType.let(DetailType::unwrap))
    }

    override fun enabled(enabled: Boolean) {
      cdkBuilder.enabled(enabled)
    }

    override fun events(events: List<RepositoryNotificationEvents>) {
      cdkBuilder.events(events.map(RepositoryNotificationEvents::unwrap))
    }

    override fun notificationRuleName(notificationRuleName: String) {
      cdkBuilder.notificationRuleName(notificationRuleName)
    }

    public fun build(): software.amazon.awscdk.services.codecommit.RepositoryNotifyOnOptions =
        cdkBuilder.build()
  }

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.codecommit.RepositoryNotifyOnOptions,
  ) : RepositoryNotifyOnOptions {
    override fun detailType(): DetailType? = unwrap(this).getDetailType()?.let(DetailType::wrap)

    override fun enabled(): Boolean? = unwrap(this).getEnabled()

    override fun events(): List<RepositoryNotificationEvents> =
        unwrap(this).getEvents().map(RepositoryNotificationEvents::wrap)

    override fun notificationRuleName(): String? = unwrap(this).getNotificationRuleName()
  }

  public companion object {
    init {

    }

    public operator fun invoke(block: Builder.() -> Unit = {}): RepositoryNotifyOnOptions {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.codecommit.RepositoryNotifyOnOptions):
        RepositoryNotifyOnOptions = Wrapper(cdkObject)

    internal fun unwrap(wrapped: RepositoryNotifyOnOptions):
        software.amazon.awscdk.services.codecommit.RepositoryNotifyOnOptions = (wrapped as
        Wrapper).cdkObject
  }
}
