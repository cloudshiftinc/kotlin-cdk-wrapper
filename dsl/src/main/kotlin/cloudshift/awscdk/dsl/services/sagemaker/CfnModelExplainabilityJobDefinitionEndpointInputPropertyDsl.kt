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
import software.amazon.awscdk.services.sagemaker.CfnModelExplainabilityJobDefinition
import kotlin.String

@CdkDslMarker
public class CfnModelExplainabilityJobDefinitionEndpointInputPropertyDsl {
    private val cdkBuilder: CfnModelExplainabilityJobDefinition.EndpointInputProperty.Builder =
        CfnModelExplainabilityJobDefinition.EndpointInputProperty.builder()

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

    public fun s3DataDistributionType(s3DataDistributionType: String) {
        cdkBuilder.s3DataDistributionType(s3DataDistributionType)
    }

    public fun s3InputMode(s3InputMode: String) {
        cdkBuilder.s3InputMode(s3InputMode)
    }

    public fun build(): CfnModelExplainabilityJobDefinition.EndpointInputProperty = cdkBuilder.build()
}
