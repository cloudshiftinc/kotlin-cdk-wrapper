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
import kotlin.Any
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.Map
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.robomaker.CfnSimulationApplication
import software.amazon.awscdk.services.robomaker.CfnSimulationApplicationProps

/**
 * Properties for defining a `CfnSimulationApplication`.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.robomaker.*;
 * CfnSimulationApplicationProps cfnSimulationApplicationProps =
 * CfnSimulationApplicationProps.builder()
 * .robotSoftwareSuite(RobotSoftwareSuiteProperty.builder()
 * .name("name")
 * // the properties below are optional
 * .version("version")
 * .build())
 * .simulationSoftwareSuite(SimulationSoftwareSuiteProperty.builder()
 * .name("name")
 * // the properties below are optional
 * .version("version")
 * .build())
 * // the properties below are optional
 * .currentRevisionId("currentRevisionId")
 * .environment("environment")
 * .name("name")
 * .renderingEngine(RenderingEngineProperty.builder()
 * .name("name")
 * .version("version")
 * .build())
 * .sources(List.of(SourceConfigProperty.builder()
 * .architecture("architecture")
 * .s3Bucket("s3Bucket")
 * .s3Key("s3Key")
 * .build()))
 * .tags(Map.of(
 * "tagsKey", "tags"))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-robomaker-simulationapplication.html)
 */
@CdkDslMarker
public class CfnSimulationApplicationPropsDsl {
    private val cdkBuilder: CfnSimulationApplicationProps.Builder =
        CfnSimulationApplicationProps.builder()

    private val _sources: MutableList<Any> = mutableListOf()

    /** @param currentRevisionId The current revision id. */
    public fun currentRevisionId(currentRevisionId: String) {
        cdkBuilder.currentRevisionId(currentRevisionId)
    }

    /** @param environment The environment of the simulation application. */
    public fun environment(environment: String) {
        cdkBuilder.environment(environment)
    }

    /** @param name The name of the simulation application. */
    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    /** @param renderingEngine The rendering engine for the simulation application. */
    public fun renderingEngine(renderingEngine: IResolvable) {
        cdkBuilder.renderingEngine(renderingEngine)
    }

    /** @param renderingEngine The rendering engine for the simulation application. */
    public fun renderingEngine(renderingEngine: CfnSimulationApplication.RenderingEngineProperty) {
        cdkBuilder.renderingEngine(renderingEngine)
    }

    /** @param robotSoftwareSuite The robot software suite used by the simulation application. */
    public fun robotSoftwareSuite(robotSoftwareSuite: IResolvable) {
        cdkBuilder.robotSoftwareSuite(robotSoftwareSuite)
    }

    /** @param robotSoftwareSuite The robot software suite used by the simulation application. */
    public fun robotSoftwareSuite(
        robotSoftwareSuite: CfnSimulationApplication.RobotSoftwareSuiteProperty
    ) {
        cdkBuilder.robotSoftwareSuite(robotSoftwareSuite)
    }

    /**
     * @param simulationSoftwareSuite The simulation software suite used by the simulation
     *   application.
     */
    public fun simulationSoftwareSuite(simulationSoftwareSuite: IResolvable) {
        cdkBuilder.simulationSoftwareSuite(simulationSoftwareSuite)
    }

    /**
     * @param simulationSoftwareSuite The simulation software suite used by the simulation
     *   application.
     */
    public fun simulationSoftwareSuite(
        simulationSoftwareSuite: CfnSimulationApplication.SimulationSoftwareSuiteProperty
    ) {
        cdkBuilder.simulationSoftwareSuite(simulationSoftwareSuite)
    }

    /** @param sources The sources of the simulation application. */
    public fun sources(vararg sources: Any) {
        _sources.addAll(listOf(*sources))
    }

    /** @param sources The sources of the simulation application. */
    public fun sources(sources: Collection<Any>) {
        _sources.addAll(sources)
    }

    /** @param sources The sources of the simulation application. */
    public fun sources(sources: IResolvable) {
        cdkBuilder.sources(sources)
    }

    /**
     * @param tags A map that contains tag keys and tag values that are attached to the simulation
     *   application.
     */
    public fun tags(tags: Map<String, String>) {
        cdkBuilder.tags(tags)
    }

    public fun build(): CfnSimulationApplicationProps {
        if (_sources.isNotEmpty()) cdkBuilder.sources(_sources)
        return cdkBuilder.build()
    }
}
