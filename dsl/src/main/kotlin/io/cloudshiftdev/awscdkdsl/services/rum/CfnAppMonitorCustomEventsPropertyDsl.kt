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

package io.cloudshiftdev.awscdkdsl.services.rum

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.rum.CfnAppMonitor

/**
 * This structure specifies whether this app monitor allows the web client to define and send custom
 * events.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.rum.*;
 * CustomEventsProperty customEventsProperty = CustomEventsProperty.builder()
 * .status("status")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rum-appmonitor-customevents.html)
 */
@CdkDslMarker
public class CfnAppMonitorCustomEventsPropertyDsl {
    private val cdkBuilder: CfnAppMonitor.CustomEventsProperty.Builder =
        CfnAppMonitor.CustomEventsProperty.builder()

    /**
     * @param status Set this to `ENABLED` to allow the web client to send custom events for this
     *   app monitor. Valid values are `ENABLED` and `DISABLED` .
     */
    public fun status(status: String) {
        cdkBuilder.status(status)
    }

    public fun build(): CfnAppMonitor.CustomEventsProperty = cdkBuilder.build()
}
