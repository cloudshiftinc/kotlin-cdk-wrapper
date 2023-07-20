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
import software.amazon.awscdk.services.sagemaker.CfnModelPackage
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.Map

@CdkDslMarker
public class CfnModelPackageModelPackageContainerDefinitionPropertyDsl {
    private val cdkBuilder: CfnModelPackage.ModelPackageContainerDefinitionProperty.Builder =
        CfnModelPackage.ModelPackageContainerDefinitionProperty.builder()

    public fun containerHostname(containerHostname: String) {
        cdkBuilder.containerHostname(containerHostname)
    }

    public fun environment(environment: Map<String, String>) {
        cdkBuilder.environment(environment)
    }

    public fun environment(environment: IResolvable) {
        cdkBuilder.environment(environment)
    }

    public fun framework(framework: String) {
        cdkBuilder.framework(framework)
    }

    public fun frameworkVersion(frameworkVersion: String) {
        cdkBuilder.frameworkVersion(frameworkVersion)
    }

    public fun image(image: String) {
        cdkBuilder.image(image)
    }

    public fun imageDigest(imageDigest: String) {
        cdkBuilder.imageDigest(imageDigest)
    }

    public fun modelDataUrl(modelDataUrl: String) {
        cdkBuilder.modelDataUrl(modelDataUrl)
    }

    public fun modelInput(block: MapBuilder.() -> Unit = {}) {
        val builder = MapBuilder()
        builder.apply(block)
        cdkBuilder.modelInput(builder.map)
    }

    public fun modelInput(modelInput: Any) {
        cdkBuilder.modelInput(modelInput)
    }

    public fun nearestModelName(nearestModelName: String) {
        cdkBuilder.nearestModelName(nearestModelName)
    }

    public fun build(): CfnModelPackage.ModelPackageContainerDefinitionProperty = cdkBuilder.build()
}
