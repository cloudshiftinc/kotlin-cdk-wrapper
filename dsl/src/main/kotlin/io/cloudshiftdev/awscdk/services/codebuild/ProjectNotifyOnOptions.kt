package io.cloudshiftdev.awscdk.services.codebuild

import io.cloudshiftdev.awscdk.services.codestarnotifications.DetailType
import io.cloudshiftdev.awscdk.services.codestarnotifications.NotificationRuleOptions
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

public interface ProjectNotifyOnOptions : NotificationRuleOptions {
  public fun events(): List<ProjectNotificationEvents>

  public interface Builder {
    public fun detailType(detailType: DetailType)

    public fun enabled(enabled: Boolean)

    public fun events(events: List<ProjectNotificationEvents>)

    public fun events(vararg events: ProjectNotificationEvents)

    public fun notificationRuleName(notificationRuleName: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.codebuild.ProjectNotifyOnOptions.Builder
        = software.amazon.awscdk.services.codebuild.ProjectNotifyOnOptions.builder()

    override fun detailType(detailType: DetailType) {
      cdkBuilder.detailType(detailType.let(DetailType::unwrap))
    }

    override fun enabled(enabled: Boolean) {
      cdkBuilder.enabled(enabled)
    }

    override fun events(events: List<ProjectNotificationEvents>) {
      cdkBuilder.events(events.map(ProjectNotificationEvents::unwrap))
    }

    override fun events(vararg events: ProjectNotificationEvents): Unit = events(events.toList())

    override fun notificationRuleName(notificationRuleName: String) {
      cdkBuilder.notificationRuleName(notificationRuleName)
    }

    public fun build(): software.amazon.awscdk.services.codebuild.ProjectNotifyOnOptions =
        cdkBuilder.build()
  }

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.codebuild.ProjectNotifyOnOptions,
  ) : ProjectNotifyOnOptions {
    override fun detailType(): DetailType? = unwrap(this).getDetailType()?.let(DetailType::wrap)

    override fun enabled(): Boolean? = unwrap(this).getEnabled()

    override fun events(): List<ProjectNotificationEvents> =
        unwrap(this).getEvents().map(ProjectNotificationEvents::wrap)

    override fun notificationRuleName(): String? = unwrap(this).getNotificationRuleName()
  }

  public companion object {
    init {

    }

    public operator fun invoke(block: Builder.() -> Unit = {}): ProjectNotifyOnOptions {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.codebuild.ProjectNotifyOnOptions):
        ProjectNotifyOnOptions = Wrapper(cdkObject)

    internal fun unwrap(wrapped: ProjectNotifyOnOptions):
        software.amazon.awscdk.services.codebuild.ProjectNotifyOnOptions = (wrapped as
        Wrapper).cdkObject
  }
}
