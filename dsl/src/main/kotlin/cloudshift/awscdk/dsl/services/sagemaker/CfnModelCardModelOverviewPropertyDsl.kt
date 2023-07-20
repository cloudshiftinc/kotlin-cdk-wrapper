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
import kotlin.Number
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList

@CdkDslMarker
public class CfnModelCardModelOverviewPropertyDsl {
    private val cdkBuilder: CfnModelCard.ModelOverviewProperty.Builder =
        CfnModelCard.ModelOverviewProperty.builder()

    private val _modelArtifact: MutableList<String> = mutableListOf()

    public fun algorithmType(algorithmType: String) {
        cdkBuilder.algorithmType(algorithmType)
    }

    public fun inferenceEnvironment(inferenceEnvironment: IResolvable) {
        cdkBuilder.inferenceEnvironment(inferenceEnvironment)
    }

    public fun inferenceEnvironment(inferenceEnvironment: CfnModelCard.InferenceEnvironmentProperty) {
        cdkBuilder.inferenceEnvironment(inferenceEnvironment)
    }

    public fun modelArtifact(vararg modelArtifact: String) {
        _modelArtifact.addAll(listOf(*modelArtifact))
    }

    public fun modelArtifact(modelArtifact: Collection<String>) {
        _modelArtifact.addAll(modelArtifact)
    }

    public fun modelCreator(modelCreator: String) {
        cdkBuilder.modelCreator(modelCreator)
    }

    public fun modelDescription(modelDescription: String) {
        cdkBuilder.modelDescription(modelDescription)
    }

    public fun modelId(modelId: String) {
        cdkBuilder.modelId(modelId)
    }

    public fun modelName(modelName: String) {
        cdkBuilder.modelName(modelName)
    }

    public fun modelOwner(modelOwner: String) {
        cdkBuilder.modelOwner(modelOwner)
    }

    public fun modelVersion(modelVersion: Number) {
        cdkBuilder.modelVersion(modelVersion)
    }

    public fun problemType(problemType: String) {
        cdkBuilder.problemType(problemType)
    }

    public fun build(): CfnModelCard.ModelOverviewProperty {
        if (_modelArtifact.isNotEmpty()) cdkBuilder.modelArtifact(_modelArtifact)
        return cdkBuilder.build()
    }
}
