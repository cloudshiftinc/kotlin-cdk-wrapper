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
import software.amazon.awscdk.services.robomaker.CfnSimulationApplication

/**
 * Information about a simulation software suite.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.robomaker.*;
 * SimulationSoftwareSuiteProperty simulationSoftwareSuiteProperty =
 * SimulationSoftwareSuiteProperty.builder()
 * .name("name")
 * // the properties below are optional
 * .version("version")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-robomaker-simulationapplication-simulationsoftwaresuite.html)
 */
@CdkDslMarker
public class CfnSimulationApplicationSimulationSoftwareSuitePropertyDsl {
    private val cdkBuilder: CfnSimulationApplication.SimulationSoftwareSuiteProperty.Builder =
        CfnSimulationApplication.SimulationSoftwareSuiteProperty.builder()

    /**
     * @param name The name of the simulation software suite. `SimulationRuntime` is the only
     *   supported value.
     */
    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    /**
     * @param version The version of the simulation software suite. Not applicable for
     *   `SimulationRuntime` .
     */
    public fun version(version: String) {
        cdkBuilder.version(version)
    }

    public fun build(): CfnSimulationApplication.SimulationSoftwareSuiteProperty =
        cdkBuilder.build()
}
