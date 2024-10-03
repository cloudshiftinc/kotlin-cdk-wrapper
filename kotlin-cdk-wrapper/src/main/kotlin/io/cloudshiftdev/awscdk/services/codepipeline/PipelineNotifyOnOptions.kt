@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.codepipeline

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import io.cloudshiftdev.awscdk.services.codestarnotifications.DetailType
import io.cloudshiftdev.awscdk.services.codestarnotifications.NotificationRuleOptions
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

/**
 * Additional options to pass to the notification rule.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.codepipeline.*;
 * import io.cloudshiftdev.awscdk.services.codestarnotifications.*;
 * PipelineNotifyOnOptions pipelineNotifyOnOptions = PipelineNotifyOnOptions.builder()
 * .events(List.of(PipelineNotificationEvents.PIPELINE_EXECUTION_FAILED))
 * // the properties below are optional
 * .createdBy("createdBy")
 * .detailType(DetailType.BASIC)
 * .enabled(false)
 * .notificationRuleName("notificationRuleName")
 * .build();
 * ```
 */
public interface PipelineNotifyOnOptions : NotificationRuleOptions {
  /**
   * A list of event types associated with this notification rule for CodePipeline Pipeline.
   *
   * For a complete list of event types and IDs, see Notification concepts in the Developer Tools
   * Console User Guide.
   *
   * [Documentation](https://docs.aws.amazon.com/dtconsole/latest/userguide/concepts.html#concepts-api)
   */
  public fun events(): List<PipelineNotificationEvents>

  /**
   * A builder for [PipelineNotifyOnOptions]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param createdBy The name or email alias of the person who created the notification rule.
     * If not specified, it means that the creator's alias is not provided.
     */
    public fun createdBy(createdBy: String)

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
     * @param events A list of event types associated with this notification rule for CodePipeline
     * Pipeline. 
     * For a complete list of event types and IDs, see Notification concepts in the Developer Tools
     * Console User Guide.
     */
    public fun events(events: List<PipelineNotificationEvents>)

    /**
     * @param events A list of event types associated with this notification rule for CodePipeline
     * Pipeline. 
     * For a complete list of event types and IDs, see Notification concepts in the Developer Tools
     * Console User Guide.
     */
    public fun events(vararg events: PipelineNotificationEvents)

    /**
     * @param notificationRuleName The name for the notification rule.
     * Notification rule names must be unique in your AWS account.
     */
    public fun notificationRuleName(notificationRuleName: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.codepipeline.PipelineNotifyOnOptions.Builder =
        software.amazon.awscdk.services.codepipeline.PipelineNotifyOnOptions.builder()

    /**
     * @param createdBy The name or email alias of the person who created the notification rule.
     * If not specified, it means that the creator's alias is not provided.
     */
    override fun createdBy(createdBy: String) {
      cdkBuilder.createdBy(createdBy)
    }

    /**
     * @param detailType The level of detail to include in the notifications for this resource.
     * BASIC will include only the contents of the event as it would appear in AWS CloudWatch.
     * FULL will include any supplemental information provided by AWS CodeStar Notifications and/or
     * the service for the resource for which the notification is created.
     */
    override fun detailType(detailType: DetailType) {
      cdkBuilder.detailType(detailType.let(DetailType.Companion::unwrap))
    }

    /**
     * @param enabled The status of the notification rule.
     * If the enabled is set to DISABLED, notifications aren't sent for the notification rule.
     */
    override fun enabled(enabled: Boolean) {
      cdkBuilder.enabled(enabled)
    }

    /**
     * @param events A list of event types associated with this notification rule for CodePipeline
     * Pipeline. 
     * For a complete list of event types and IDs, see Notification concepts in the Developer Tools
     * Console User Guide.
     */
    override fun events(events: List<PipelineNotificationEvents>) {
      cdkBuilder.events(events.map(PipelineNotificationEvents.Companion::unwrap))
    }

    /**
     * @param events A list of event types associated with this notification rule for CodePipeline
     * Pipeline. 
     * For a complete list of event types and IDs, see Notification concepts in the Developer Tools
     * Console User Guide.
     */
    override fun events(vararg events: PipelineNotificationEvents): Unit = events(events.toList())

    /**
     * @param notificationRuleName The name for the notification rule.
     * Notification rule names must be unique in your AWS account.
     */
    override fun notificationRuleName(notificationRuleName: String) {
      cdkBuilder.notificationRuleName(notificationRuleName)
    }

    public fun build(): software.amazon.awscdk.services.codepipeline.PipelineNotifyOnOptions =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.codepipeline.PipelineNotifyOnOptions,
  ) : CdkObject(cdkObject),
      PipelineNotifyOnOptions {
    /**
     * The name or email alias of the person who created the notification rule.
     *
     * If not specified, it means that the creator's alias is not provided.
     *
     * Default: - No alias provided
     */
    override fun createdBy(): String? = unwrap(this).getCreatedBy()

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
     * A list of event types associated with this notification rule for CodePipeline Pipeline.
     *
     * For a complete list of event types and IDs, see Notification concepts in the Developer Tools
     * Console User Guide.
     *
     * [Documentation](https://docs.aws.amazon.com/dtconsole/latest/userguide/concepts.html#concepts-api)
     */
    override fun events(): List<PipelineNotificationEvents> =
        unwrap(this).getEvents().map(PipelineNotificationEvents::wrap)

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
    public operator fun invoke(block: Builder.() -> Unit = {}): PipelineNotifyOnOptions {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.codepipeline.PipelineNotifyOnOptions):
        PipelineNotifyOnOptions = CdkObjectWrappers.wrap(cdkObject) as? PipelineNotifyOnOptions ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: PipelineNotifyOnOptions):
        software.amazon.awscdk.services.codepipeline.PipelineNotifyOnOptions = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.codepipeline.PipelineNotifyOnOptions
  }
}
