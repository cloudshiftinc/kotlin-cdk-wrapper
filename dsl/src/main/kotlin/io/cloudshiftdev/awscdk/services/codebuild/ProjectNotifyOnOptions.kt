package io.cloudshiftdev.awscdk.services.codebuild

import io.cloudshiftdev.awscdk.CdkObject
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.services.codestarnotifications.DetailType
import io.cloudshiftdev.awscdk.services.codestarnotifications.NotificationRuleOptions
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

public interface ProjectNotifyOnOptions : NotificationRuleOptions {
  /**
   * A list of event types associated with this notification rule for CodeBuild Project.
   *
   * For a complete list of event types and IDs, see Notification concepts in the Developer Tools
   * Console User Guide.
   *
   * [Documentation](https://docs.aws.amazon.com/dtconsole/latest/userguide/concepts.html#concepts-api)
   */
  public fun events(): List<ProjectNotificationEvents>

  /**
   * A builder for [ProjectNotifyOnOptions]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param detailType The level of detail to include in the notifications for this resource.
     * BASIC will include only the contents of the event as it would appear in AWS CloudWatch.
     * FULL will include any supplemental information provided by AWS CodeStar Notifications and/or
     * the service for the resource for which the notification is created.
     */
    public fun detailType(detailType: DetailType)

    /**
     * @param enabled The status of the notification rule.
     * If the enabled is set to DISABLED, notifications aren't sent for the notification rule.
     */
    public fun enabled(enabled: Boolean)

    /**
     * @param events A list of event types associated with this notification rule for CodeBuild
     * Project. 
     * For a complete list of event types and IDs, see Notification concepts in the Developer Tools
     * Console User Guide.
     */
    public fun events(events: List<ProjectNotificationEvents>)

    /**
     * @param events A list of event types associated with this notification rule for CodeBuild
     * Project. 
     * For a complete list of event types and IDs, see Notification concepts in the Developer Tools
     * Console User Guide.
     */
    public fun events(vararg events: ProjectNotificationEvents)

    /**
     * @param notificationRuleName The name for the notification rule.
     * Notification rule names must be unique in your AWS account.
     */
    public fun notificationRuleName(notificationRuleName: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.codebuild.ProjectNotifyOnOptions.Builder
        = software.amazon.awscdk.services.codebuild.ProjectNotifyOnOptions.builder()

    /**
     * @param detailType The level of detail to include in the notifications for this resource.
     * BASIC will include only the contents of the event as it would appear in AWS CloudWatch.
     * FULL will include any supplemental information provided by AWS CodeStar Notifications and/or
     * the service for the resource for which the notification is created.
     */
    override fun detailType(detailType: DetailType) {
      cdkBuilder.detailType(detailType.let(DetailType::unwrap))
    }

    /**
     * @param enabled The status of the notification rule.
     * If the enabled is set to DISABLED, notifications aren't sent for the notification rule.
     */
    override fun enabled(enabled: Boolean) {
      cdkBuilder.enabled(enabled)
    }

    /**
     * @param events A list of event types associated with this notification rule for CodeBuild
     * Project. 
     * For a complete list of event types and IDs, see Notification concepts in the Developer Tools
     * Console User Guide.
     */
    override fun events(events: List<ProjectNotificationEvents>) {
      cdkBuilder.events(events.map(ProjectNotificationEvents::unwrap))
    }

    /**
     * @param events A list of event types associated with this notification rule for CodeBuild
     * Project. 
     * For a complete list of event types and IDs, see Notification concepts in the Developer Tools
     * Console User Guide.
     */
    override fun events(vararg events: ProjectNotificationEvents): Unit = events(events.toList())

    /**
     * @param notificationRuleName The name for the notification rule.
     * Notification rule names must be unique in your AWS account.
     */
    override fun notificationRuleName(notificationRuleName: String) {
      cdkBuilder.notificationRuleName(notificationRuleName)
    }

    public fun build(): software.amazon.awscdk.services.codebuild.ProjectNotifyOnOptions =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.codebuild.ProjectNotifyOnOptions,
  ) : CdkObject(cdkObject), ProjectNotifyOnOptions {
    /**
     * The level of detail to include in the notifications for this resource.
     *
     * BASIC will include only the contents of the event as it would appear in AWS CloudWatch.
     * FULL will include any supplemental information provided by AWS CodeStar Notifications and/or
     * the service for the resource for which the notification is created.
     *
     * Default: DetailType.FULL
     */
    override fun detailType(): DetailType? = unwrap(this).getDetailType()?.let(DetailType::wrap)

    /**
     * The status of the notification rule.
     *
     * If the enabled is set to DISABLED, notifications aren't sent for the notification rule.
     *
     * Default: true
     */
    override fun enabled(): Boolean? = unwrap(this).getEnabled()

    /**
     * A list of event types associated with this notification rule for CodeBuild Project.
     *
     * For a complete list of event types and IDs, see Notification concepts in the Developer Tools
     * Console User Guide.
     *
     * [Documentation](https://docs.aws.amazon.com/dtconsole/latest/userguide/concepts.html#concepts-api)
     */
    override fun events(): List<ProjectNotificationEvents> =
        unwrap(this).getEvents().map(ProjectNotificationEvents::wrap)

    /**
     * The name for the notification rule.
     *
     * Notification rule names must be unique in your AWS account.
     *
     * Default: - generated from the `id`
     */
    override fun notificationRuleName(): String? = unwrap(this).getNotificationRuleName()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): ProjectNotifyOnOptions {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.codebuild.ProjectNotifyOnOptions):
        ProjectNotifyOnOptions = Wrapper(cdkObject)

    internal fun unwrap(wrapped: ProjectNotifyOnOptions):
        software.amazon.awscdk.services.codebuild.ProjectNotifyOnOptions = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.codebuild.ProjectNotifyOnOptions
  }
}
