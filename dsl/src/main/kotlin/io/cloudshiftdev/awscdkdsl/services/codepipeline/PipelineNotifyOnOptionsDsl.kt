@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION"
)

package io.cloudshiftdev.awscdkdsl.services.codepipeline

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.Boolean
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.services.codepipeline.PipelineNotificationEvents
import software.amazon.awscdk.services.codepipeline.PipelineNotifyOnOptions
import software.amazon.awscdk.services.codestarnotifications.DetailType

/**
 * Additional options to pass to the notification rule.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.codepipeline.*;
 * import software.amazon.awscdk.services.codestarnotifications.*;
 * PipelineNotifyOnOptions pipelineNotifyOnOptions = PipelineNotifyOnOptions.builder()
 * .events(List.of(PipelineNotificationEvents.PIPELINE_EXECUTION_FAILED))
 * // the properties below are optional
 * .detailType(DetailType.BASIC)
 * .enabled(false)
 * .notificationRuleName("notificationRuleName")
 * .build();
 * ```
 */
@CdkDslMarker
public class PipelineNotifyOnOptionsDsl {
    private val cdkBuilder: PipelineNotifyOnOptions.Builder = PipelineNotifyOnOptions.builder()

    private val _events: MutableList<PipelineNotificationEvents> = mutableListOf()

    /**
     * @param detailType The level of detail to include in the notifications for this resource.
     *   BASIC will include only the contents of the event as it would appear in AWS CloudWatch.
     *   FULL will include any supplemental information provided by AWS CodeStar Notifications
     *   and/or the service for the resource for which the notification is created.
     */
    public fun detailType(detailType: DetailType) {
        cdkBuilder.detailType(detailType)
    }

    /**
     * @param enabled The status of the notification rule. If the enabled is set to DISABLED,
     *   notifications aren't sent for the notification rule.
     */
    public fun enabled(enabled: Boolean) {
        cdkBuilder.enabled(enabled)
    }

    /**
     * @param events A list of event types associated with this notification rule for CodePipeline
     *   Pipeline. For a complete list of event types and IDs, see Notification concepts in the
     *   Developer Tools Console User Guide.
     */
    public fun events(vararg events: PipelineNotificationEvents) {
        _events.addAll(listOf(*events))
    }

    /**
     * @param events A list of event types associated with this notification rule for CodePipeline
     *   Pipeline. For a complete list of event types and IDs, see Notification concepts in the
     *   Developer Tools Console User Guide.
     */
    public fun events(events: Collection<PipelineNotificationEvents>) {
        _events.addAll(events)
    }

    /**
     * @param notificationRuleName The name for the notification rule. Notification rule names must
     *   be unique in your AWS account.
     */
    public fun notificationRuleName(notificationRuleName: String) {
        cdkBuilder.notificationRuleName(notificationRuleName)
    }

    public fun build(): PipelineNotifyOnOptions {
        if (_events.isNotEmpty()) cdkBuilder.events(_events)
        return cdkBuilder.build()
    }
}
