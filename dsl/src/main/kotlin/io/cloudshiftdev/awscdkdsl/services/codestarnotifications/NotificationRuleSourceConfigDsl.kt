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

package io.cloudshiftdev.awscdkdsl.services.codestarnotifications

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.codestarnotifications.NotificationRuleSourceConfig

/**
 * Information about the Codebuild or CodePipeline associated with a notification source.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.codestarnotifications.*;
 * NotificationRuleSourceConfig notificationRuleSourceConfig =
 * NotificationRuleSourceConfig.builder()
 * .sourceArn("sourceArn")
 * .build();
 * ```
 */
@CdkDslMarker
public class NotificationRuleSourceConfigDsl {
    private val cdkBuilder: NotificationRuleSourceConfig.Builder =
        NotificationRuleSourceConfig.builder()

    /** @param sourceArn The Amazon Resource Name (ARN) of the notification source. */
    public fun sourceArn(sourceArn: String) {
        cdkBuilder.sourceArn(sourceArn)
    }

    public fun build(): NotificationRuleSourceConfig = cdkBuilder.build()
}
