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
import software.amazon.awscdk.services.sagemaker.CfnDataQualityJobDefinition

@CdkDslMarker
public class CfnDataQualityJobDefinitionDataQualityJobInputPropertyDsl {
    private val cdkBuilder: CfnDataQualityJobDefinition.DataQualityJobInputProperty.Builder =
        CfnDataQualityJobDefinition.DataQualityJobInputProperty.builder()

    public fun batchTransformInput(batchTransformInput: IResolvable) {
        cdkBuilder.batchTransformInput(batchTransformInput)
    }

    public fun batchTransformInput(batchTransformInput: CfnDataQualityJobDefinition.BatchTransformInputProperty) {
        cdkBuilder.batchTransformInput(batchTransformInput)
    }

    public fun endpointInput(endpointInput: IResolvable) {
        cdkBuilder.endpointInput(endpointInput)
    }

    public fun endpointInput(endpointInput: CfnDataQualityJobDefinition.EndpointInputProperty) {
        cdkBuilder.endpointInput(endpointInput)
    }

    public fun build(): CfnDataQualityJobDefinition.DataQualityJobInputProperty = cdkBuilder.build()
}
