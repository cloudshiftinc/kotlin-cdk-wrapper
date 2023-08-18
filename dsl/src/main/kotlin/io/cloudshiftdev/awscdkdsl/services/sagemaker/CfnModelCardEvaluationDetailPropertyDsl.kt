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

package io.cloudshiftdev.awscdkdsl.services.sagemaker

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.Any
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.Map
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.sagemaker.CfnModelCard

/**
 * The evaluation details of the model.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.sagemaker.*;
 * Object value;
 * EvaluationDetailProperty evaluationDetailProperty = EvaluationDetailProperty.builder()
 * .name("name")
 * // the properties below are optional
 * .datasets(List.of("datasets"))
 * .evaluationJobArn("evaluationJobArn")
 * .evaluationObservation("evaluationObservation")
 * .metadata(Map.of(
 * "metadataKey", "metadata"))
 * .metricGroups(List.of(MetricGroupProperty.builder()
 * .metricData(List.of(MetricDataItemsProperty.builder()
 * .name("name")
 * .type("type")
 * .value(value)
 * // the properties below are optional
 * .notes("notes")
 * .xAxisName(List.of("xAxisName"))
 * .yAxisName(List.of("yAxisName"))
 * .build()))
 * .name("name")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelcard-evaluationdetail.html)
 */
@CdkDslMarker
public class CfnModelCardEvaluationDetailPropertyDsl {
    private val cdkBuilder: CfnModelCard.EvaluationDetailProperty.Builder =
        CfnModelCard.EvaluationDetailProperty.builder()

    private val _datasets: MutableList<String> = mutableListOf()

    private val _metricGroups: MutableList<Any> = mutableListOf()

    /** @param datasets The location of the datasets used to evaluate the model. */
    public fun datasets(vararg datasets: String) {
        _datasets.addAll(listOf(*datasets))
    }

    /** @param datasets The location of the datasets used to evaluate the model. */
    public fun datasets(datasets: Collection<String>) {
        _datasets.addAll(datasets)
    }

    /** @param evaluationJobArn The Amazon Resource Name (ARN) of the evaluation job. */
    public fun evaluationJobArn(evaluationJobArn: String) {
        cdkBuilder.evaluationJobArn(evaluationJobArn)
    }

    /** @param evaluationObservation Any observations made during the model evaluation. */
    public fun evaluationObservation(evaluationObservation: String) {
        cdkBuilder.evaluationObservation(evaluationObservation)
    }

    /** @param metadata Additional attributes associated with the evaluation results. */
    public fun metadata(metadata: Map<String, String>) {
        cdkBuilder.metadata(metadata)
    }

    /** @param metadata Additional attributes associated with the evaluation results. */
    public fun metadata(metadata: IResolvable) {
        cdkBuilder.metadata(metadata)
    }

    /** @param metricGroups An evaluation Metric Group object. */
    public fun metricGroups(vararg metricGroups: Any) {
        _metricGroups.addAll(listOf(*metricGroups))
    }

    /** @param metricGroups An evaluation Metric Group object. */
    public fun metricGroups(metricGroups: Collection<Any>) {
        _metricGroups.addAll(metricGroups)
    }

    /** @param metricGroups An evaluation Metric Group object. */
    public fun metricGroups(metricGroups: IResolvable) {
        cdkBuilder.metricGroups(metricGroups)
    }

    /** @param name The evaluation job name. */
    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    public fun build(): CfnModelCard.EvaluationDetailProperty {
        if (_datasets.isNotEmpty()) cdkBuilder.datasets(_datasets)
        if (_metricGroups.isNotEmpty()) cdkBuilder.metricGroups(_metricGroups)
        return cdkBuilder.build()
    }
}
