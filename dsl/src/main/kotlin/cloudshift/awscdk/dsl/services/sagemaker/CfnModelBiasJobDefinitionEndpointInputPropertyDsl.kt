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
import software.amazon.awscdk.services.sagemaker.CfnModelBiasJobDefinition
import kotlin.Number
import kotlin.String

@CdkDslMarker
public class CfnModelBiasJobDefinitionEndpointInputPropertyDsl {
    private val cdkBuilder: CfnModelBiasJobDefinition.EndpointInputProperty.Builder =
        CfnModelBiasJobDefinition.EndpointInputProperty.builder()

    public fun endTimeOffset(endTimeOffset: String) {
        cdkBuilder.endTimeOffset(endTimeOffset)
    }

    public fun endpointName(endpointName: String) {
        cdkBuilder.endpointName(endpointName)
    }

    public fun featuresAttribute(featuresAttribute: String) {
        cdkBuilder.featuresAttribute(featuresAttribute)
    }

    public fun inferenceAttribute(inferenceAttribute: String) {
        cdkBuilder.inferenceAttribute(inferenceAttribute)
    }

    public fun localPath(localPath: String) {
        cdkBuilder.localPath(localPath)
    }

    public fun probabilityAttribute(probabilityAttribute: String) {
        cdkBuilder.probabilityAttribute(probabilityAttribute)
    }

    public fun probabilityThresholdAttribute(probabilityThresholdAttribute: Number) {
        cdkBuilder.probabilityThresholdAttribute(probabilityThresholdAttribute)
    }

    public fun s3DataDistributionType(s3DataDistributionType: String) {
        cdkBuilder.s3DataDistributionType(s3DataDistributionType)
    }

    public fun s3InputMode(s3InputMode: String) {
        cdkBuilder.s3InputMode(s3InputMode)
    }

    public fun startTimeOffset(startTimeOffset: String) {
        cdkBuilder.startTimeOffset(startTimeOffset)
    }

    public fun build(): CfnModelBiasJobDefinition.EndpointInputProperty = cdkBuilder.build()
}
