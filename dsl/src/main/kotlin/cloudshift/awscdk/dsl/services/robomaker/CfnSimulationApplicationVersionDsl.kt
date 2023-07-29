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

package cloudshift.awscdk.dsl.services.robomaker

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.robomaker.CfnSimulationApplicationVersion
import software.constructs.Construct

/**
 * The `AWS::RoboMaker::SimulationApplicationVersion` resource creates a version of an AWS RoboMaker
 * simulation application.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.robomaker.*;
 * CfnSimulationApplicationVersion cfnSimulationApplicationVersion =
 * CfnSimulationApplicationVersion.Builder.create(this, "MyCfnSimulationApplicationVersion")
 * .application("application")
 * // the properties below are optional
 * .currentRevisionId("currentRevisionId")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-robomaker-simulationapplicationversion.html)
 */
@CdkDslMarker
public class CfnSimulationApplicationVersionDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnSimulationApplicationVersion.Builder =
        CfnSimulationApplicationVersion.Builder.create(scope, id)

    /**
     * The application information for the simulation application.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-robomaker-simulationapplicationversion.html#cfn-robomaker-simulationapplicationversion-application)
     *
     * @param application The application information for the simulation application.
     */
    public fun application(application: String) {
        cdkBuilder.application(application)
    }

    /**
     * The current revision id for the simulation application.
     *
     * If you provide a value and it matches the latest revision ID, a new version will be created.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-robomaker-simulationapplicationversion.html#cfn-robomaker-simulationapplicationversion-currentrevisionid)
     *
     * @param currentRevisionId The current revision id for the simulation application.
     */
    public fun currentRevisionId(currentRevisionId: String) {
        cdkBuilder.currentRevisionId(currentRevisionId)
    }

    public fun build(): CfnSimulationApplicationVersion = cdkBuilder.build()
}
