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

package cloudshift.awscdk.dsl.services.stepfunctions.tasks

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.stepfunctions.tasks.AlgorithmSpecification
import software.amazon.awscdk.services.stepfunctions.tasks.DockerImage
import software.amazon.awscdk.services.stepfunctions.tasks.InputMode
import software.amazon.awscdk.services.stepfunctions.tasks.MetricDefinition
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList

@CdkDslMarker
public class AlgorithmSpecificationDsl {
    private val cdkBuilder: AlgorithmSpecification.Builder = AlgorithmSpecification.builder()

    private val _metricDefinitions: MutableList<MetricDefinition> = mutableListOf()

    public fun algorithmName(algorithmName: String) {
        cdkBuilder.algorithmName(algorithmName)
    }

    public fun metricDefinitions(metricDefinitions: MetricDefinitionDsl.() -> Unit) {
        _metricDefinitions.add(MetricDefinitionDsl().apply(metricDefinitions).build())
    }

    public fun metricDefinitions(metricDefinitions: Collection<MetricDefinition>) {
        _metricDefinitions.addAll(metricDefinitions)
    }

    public fun trainingImage(trainingImage: DockerImage) {
        cdkBuilder.trainingImage(trainingImage)
    }

    public fun trainingInputMode(trainingInputMode: InputMode) {
        cdkBuilder.trainingInputMode(trainingInputMode)
    }

    public fun build(): AlgorithmSpecification {
        if (_metricDefinitions.isNotEmpty()) cdkBuilder.metricDefinitions(_metricDefinitions)
        return cdkBuilder.build()
    }
}
