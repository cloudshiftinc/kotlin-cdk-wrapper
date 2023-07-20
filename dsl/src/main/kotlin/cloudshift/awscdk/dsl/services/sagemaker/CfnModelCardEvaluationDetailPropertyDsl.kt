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

package cloudshift.awscdk.dsl.services.sagemaker

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.sagemaker.CfnModelCard
import kotlin.Any
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.Map
import kotlin.collections.MutableList

@CdkDslMarker
public class CfnModelCardEvaluationDetailPropertyDsl {
    private val cdkBuilder: CfnModelCard.EvaluationDetailProperty.Builder =
        CfnModelCard.EvaluationDetailProperty.builder()

    private val _datasets: MutableList<String> = mutableListOf()

    private val _metricGroups: MutableList<Any> = mutableListOf()

    public fun datasets(vararg datasets: String) {
        _datasets.addAll(listOf(*datasets))
    }

    public fun datasets(datasets: Collection<String>) {
        _datasets.addAll(datasets)
    }

    public fun evaluationJobArn(evaluationJobArn: String) {
        cdkBuilder.evaluationJobArn(evaluationJobArn)
    }

    public fun evaluationObservation(evaluationObservation: String) {
        cdkBuilder.evaluationObservation(evaluationObservation)
    }

    public fun metadata(metadata: Map<String, String>) {
        cdkBuilder.metadata(metadata)
    }

    public fun metadata(metadata: IResolvable) {
        cdkBuilder.metadata(metadata)
    }

    public fun metricGroups(vararg metricGroups: Any) {
        _metricGroups.addAll(listOf(*metricGroups))
    }

    public fun metricGroups(metricGroups: Collection<Any>) {
        _metricGroups.addAll(metricGroups)
    }

    public fun metricGroups(metricGroups: IResolvable) {
        cdkBuilder.metricGroups(metricGroups)
    }

    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    public fun build(): CfnModelCard.EvaluationDetailProperty {
        if (_datasets.isNotEmpty()) cdkBuilder.datasets(_datasets)
        if (_metricGroups.isNotEmpty()) cdkBuilder.metricGroups(_metricGroups)
        return cdkBuilder.build()
    }
}
