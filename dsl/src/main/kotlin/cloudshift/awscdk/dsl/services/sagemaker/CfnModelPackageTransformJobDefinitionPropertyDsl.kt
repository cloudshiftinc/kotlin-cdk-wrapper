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
import software.amazon.awscdk.services.sagemaker.CfnModelPackage
import kotlin.Number
import kotlin.String
import kotlin.collections.Map

@CdkDslMarker
public class CfnModelPackageTransformJobDefinitionPropertyDsl {
    private val cdkBuilder: CfnModelPackage.TransformJobDefinitionProperty.Builder =
        CfnModelPackage.TransformJobDefinitionProperty.builder()

    public fun batchStrategy(batchStrategy: String) {
        cdkBuilder.batchStrategy(batchStrategy)
    }

    public fun environment(environment: Map<String, String>) {
        cdkBuilder.environment(environment)
    }

    public fun environment(environment: IResolvable) {
        cdkBuilder.environment(environment)
    }

    public fun maxConcurrentTransforms(maxConcurrentTransforms: Number) {
        cdkBuilder.maxConcurrentTransforms(maxConcurrentTransforms)
    }

    public fun maxPayloadInMb(maxPayloadInMb: Number) {
        cdkBuilder.maxPayloadInMb(maxPayloadInMb)
    }

    public fun transformInput(transformInput: IResolvable) {
        cdkBuilder.transformInput(transformInput)
    }

    public fun transformInput(transformInput: CfnModelPackage.TransformInputProperty) {
        cdkBuilder.transformInput(transformInput)
    }

    public fun transformOutput(transformOutput: IResolvable) {
        cdkBuilder.transformOutput(transformOutput)
    }

    public fun transformOutput(transformOutput: CfnModelPackage.TransformOutputProperty) {
        cdkBuilder.transformOutput(transformOutput)
    }

    public fun transformResources(transformResources: IResolvable) {
        cdkBuilder.transformResources(transformResources)
    }

    public fun transformResources(transformResources: CfnModelPackage.TransformResourcesProperty) {
        cdkBuilder.transformResources(transformResources)
    }

    public fun build(): CfnModelPackage.TransformJobDefinitionProperty = cdkBuilder.build()
}
