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
import software.amazon.awscdk.services.robomaker.CfnSimulationApplication

/**
 * Information about a robot software suite.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.robomaker.*;
 * RobotSoftwareSuiteProperty robotSoftwareSuiteProperty = RobotSoftwareSuiteProperty.builder()
 * .name("name")
 * // the properties below are optional
 * .version("version")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-robomaker-simulationapplication-robotsoftwaresuite.html)
 */
@CdkDslMarker
public class CfnSimulationApplicationRobotSoftwareSuitePropertyDsl {
    private val cdkBuilder: CfnSimulationApplication.RobotSoftwareSuiteProperty.Builder =
        CfnSimulationApplication.RobotSoftwareSuiteProperty.builder()

    /** @param name The name of the robot software suite. `General` is the only supported value. */
    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    /**
     * @param version The version of the robot software suite. Not applicable for General software
     *   suite.
     */
    public fun version(version: String) {
        cdkBuilder.version(version)
    }

    public fun build(): CfnSimulationApplication.RobotSoftwareSuiteProperty = cdkBuilder.build()
}
