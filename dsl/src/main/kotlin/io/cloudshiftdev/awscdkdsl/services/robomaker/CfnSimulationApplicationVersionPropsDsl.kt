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

package io.cloudshiftdev.awscdkdsl.services.robomaker

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.robomaker.CfnSimulationApplicationVersionProps

/**
 * Properties for defining a `CfnSimulationApplicationVersion`.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.robomaker.*;
 * CfnSimulationApplicationVersionProps cfnSimulationApplicationVersionProps =
 * CfnSimulationApplicationVersionProps.builder()
 * .application("application")
 * // the properties below are optional
 * .currentRevisionId("currentRevisionId")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-robomaker-simulationapplicationversion.html)
 */
@CdkDslMarker
public class CfnSimulationApplicationVersionPropsDsl {
    private val cdkBuilder: CfnSimulationApplicationVersionProps.Builder =
        CfnSimulationApplicationVersionProps.builder()

    /** @param application The application information for the simulation application. */
    public fun application(application: String) {
        cdkBuilder.application(application)
    }

    /**
     * @param currentRevisionId The current revision id for the simulation application. If you
     *   provide a value and it matches the latest revision ID, a new version will be created.
     */
    public fun currentRevisionId(currentRevisionId: String) {
        cdkBuilder.currentRevisionId(currentRevisionId)
    }

    public fun build(): CfnSimulationApplicationVersionProps = cdkBuilder.build()
}
