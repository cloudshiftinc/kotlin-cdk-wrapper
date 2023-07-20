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
import cloudshift.awscdk.common.MapBuilder
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.sagemaker.CfnModel
import kotlin.Any
import kotlin.String
import kotlin.Unit

@CdkDslMarker
public class CfnModelContainerDefinitionPropertyDsl {
    private val cdkBuilder: CfnModel.ContainerDefinitionProperty.Builder =
        CfnModel.ContainerDefinitionProperty.builder()

    public fun containerHostname(containerHostname: String) {
        cdkBuilder.containerHostname(containerHostname)
    }

    public fun environment(block: MapBuilder.() -> Unit = {}) {
        val builder = MapBuilder()
        builder.apply(block)
        cdkBuilder.environment(builder.map)
    }

    public fun environment(environment: Any) {
        cdkBuilder.environment(environment)
    }

    public fun image(image: String) {
        cdkBuilder.image(image)
    }

    public fun imageConfig(imageConfig: IResolvable) {
        cdkBuilder.imageConfig(imageConfig)
    }

    public fun imageConfig(imageConfig: CfnModel.ImageConfigProperty) {
        cdkBuilder.imageConfig(imageConfig)
    }

    public fun inferenceSpecificationName(inferenceSpecificationName: String) {
        cdkBuilder.inferenceSpecificationName(inferenceSpecificationName)
    }

    public fun mode(mode: String) {
        cdkBuilder.mode(mode)
    }

    public fun modelDataUrl(modelDataUrl: String) {
        cdkBuilder.modelDataUrl(modelDataUrl)
    }

    public fun modelPackageName(modelPackageName: String) {
        cdkBuilder.modelPackageName(modelPackageName)
    }

    public fun multiModelConfig(multiModelConfig: IResolvable) {
        cdkBuilder.multiModelConfig(multiModelConfig)
    }

    public fun multiModelConfig(multiModelConfig: CfnModel.MultiModelConfigProperty) {
        cdkBuilder.multiModelConfig(multiModelConfig)
    }

    public fun build(): CfnModel.ContainerDefinitionProperty = cdkBuilder.build()
}
