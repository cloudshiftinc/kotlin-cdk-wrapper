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
import kotlin.collections.MutableList

@CdkDslMarker
public class CfnModelCardTrainingJobDetailsPropertyDsl {
    private val cdkBuilder: CfnModelCard.TrainingJobDetailsProperty.Builder =
        CfnModelCard.TrainingJobDetailsProperty.builder()

    private val _hyperParameters: MutableList<Any> = mutableListOf()

    private val _trainingDatasets: MutableList<String> = mutableListOf()

    private val _trainingMetrics: MutableList<Any> = mutableListOf()

    private val _userProvidedHyperParameters: MutableList<Any> = mutableListOf()

    private val _userProvidedTrainingMetrics: MutableList<Any> = mutableListOf()

    public fun hyperParameters(vararg hyperParameters: Any) {
        _hyperParameters.addAll(listOf(*hyperParameters))
    }

    public fun hyperParameters(hyperParameters: Collection<Any>) {
        _hyperParameters.addAll(hyperParameters)
    }

    public fun hyperParameters(hyperParameters: IResolvable) {
        cdkBuilder.hyperParameters(hyperParameters)
    }

    public fun trainingArn(trainingArn: String) {
        cdkBuilder.trainingArn(trainingArn)
    }

    public fun trainingDatasets(vararg trainingDatasets: String) {
        _trainingDatasets.addAll(listOf(*trainingDatasets))
    }

    public fun trainingDatasets(trainingDatasets: Collection<String>) {
        _trainingDatasets.addAll(trainingDatasets)
    }

    public fun trainingEnvironment(trainingEnvironment: IResolvable) {
        cdkBuilder.trainingEnvironment(trainingEnvironment)
    }

    public fun trainingEnvironment(trainingEnvironment: CfnModelCard.TrainingEnvironmentProperty) {
        cdkBuilder.trainingEnvironment(trainingEnvironment)
    }

    public fun trainingMetrics(vararg trainingMetrics: Any) {
        _trainingMetrics.addAll(listOf(*trainingMetrics))
    }

    public fun trainingMetrics(trainingMetrics: Collection<Any>) {
        _trainingMetrics.addAll(trainingMetrics)
    }

    public fun trainingMetrics(trainingMetrics: IResolvable) {
        cdkBuilder.trainingMetrics(trainingMetrics)
    }

    public fun userProvidedHyperParameters(vararg userProvidedHyperParameters: Any) {
        _userProvidedHyperParameters.addAll(listOf(*userProvidedHyperParameters))
    }

    public fun userProvidedHyperParameters(userProvidedHyperParameters: Collection<Any>) {
        _userProvidedHyperParameters.addAll(userProvidedHyperParameters)
    }

    public fun userProvidedHyperParameters(userProvidedHyperParameters: IResolvable) {
        cdkBuilder.userProvidedHyperParameters(userProvidedHyperParameters)
    }

    public fun userProvidedTrainingMetrics(vararg userProvidedTrainingMetrics: Any) {
        _userProvidedTrainingMetrics.addAll(listOf(*userProvidedTrainingMetrics))
    }

    public fun userProvidedTrainingMetrics(userProvidedTrainingMetrics: Collection<Any>) {
        _userProvidedTrainingMetrics.addAll(userProvidedTrainingMetrics)
    }

    public fun userProvidedTrainingMetrics(userProvidedTrainingMetrics: IResolvable) {
        cdkBuilder.userProvidedTrainingMetrics(userProvidedTrainingMetrics)
    }

    public fun build(): CfnModelCard.TrainingJobDetailsProperty {
        if (_hyperParameters.isNotEmpty()) cdkBuilder.hyperParameters(_hyperParameters)
        if (_trainingDatasets.isNotEmpty()) cdkBuilder.trainingDatasets(_trainingDatasets)
        if (_trainingMetrics.isNotEmpty()) cdkBuilder.trainingMetrics(_trainingMetrics)
        if (_userProvidedHyperParameters.isNotEmpty()) {
            cdkBuilder.userProvidedHyperParameters(_userProvidedHyperParameters)
        }
        if (_userProvidedTrainingMetrics.isNotEmpty()) {
            cdkBuilder.userProvidedTrainingMetrics(_userProvidedTrainingMetrics)
        }
        return cdkBuilder.build()
    }
}
