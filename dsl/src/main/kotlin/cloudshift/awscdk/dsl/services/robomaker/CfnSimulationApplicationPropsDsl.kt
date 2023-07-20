@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION",
)

package cloudshift.awscdk.dsl.services.robomaker

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.robomaker.CfnSimulationApplication
import software.amazon.awscdk.services.robomaker.CfnSimulationApplicationProps
import kotlin.Any
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.Map
import kotlin.collections.MutableList

@CdkDslMarker
public class CfnSimulationApplicationPropsDsl {
    private val cdkBuilder: CfnSimulationApplicationProps.Builder =
        CfnSimulationApplicationProps.builder()

    private val _sources: MutableList<Any> = mutableListOf()

    public fun currentRevisionId(currentRevisionId: String) {
        cdkBuilder.currentRevisionId(currentRevisionId)
    }

    public fun environment(environment: String) {
        cdkBuilder.environment(environment)
    }

    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    public fun renderingEngine(renderingEngine: IResolvable) {
        cdkBuilder.renderingEngine(renderingEngine)
    }

    public fun renderingEngine(renderingEngine: CfnSimulationApplication.RenderingEngineProperty) {
        cdkBuilder.renderingEngine(renderingEngine)
    }

    public fun robotSoftwareSuite(robotSoftwareSuite: IResolvable) {
        cdkBuilder.robotSoftwareSuite(robotSoftwareSuite)
    }

    public fun robotSoftwareSuite(robotSoftwareSuite: CfnSimulationApplication.RobotSoftwareSuiteProperty) {
        cdkBuilder.robotSoftwareSuite(robotSoftwareSuite)
    }

    public fun simulationSoftwareSuite(simulationSoftwareSuite: IResolvable) {
        cdkBuilder.simulationSoftwareSuite(simulationSoftwareSuite)
    }

    public fun simulationSoftwareSuite(simulationSoftwareSuite: CfnSimulationApplication.SimulationSoftwareSuiteProperty) {
        cdkBuilder.simulationSoftwareSuite(simulationSoftwareSuite)
    }

    public fun sources(vararg sources: Any) {
        _sources.addAll(listOf(*sources))
    }

    public fun sources(sources: Collection<Any>) {
        _sources.addAll(sources)
    }

    public fun sources(sources: IResolvable) {
        cdkBuilder.sources(sources)
    }

    public fun tags(tags: Map<String, String>) {
        cdkBuilder.tags(tags)
    }

    public fun build(): CfnSimulationApplicationProps {
        if (_sources.isNotEmpty()) cdkBuilder.sources(_sources)
        return cdkBuilder.build()
    }
}
