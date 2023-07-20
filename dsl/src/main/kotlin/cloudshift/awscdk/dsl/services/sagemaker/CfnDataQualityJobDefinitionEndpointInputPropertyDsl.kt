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
import software.amazon.awscdk.services.sagemaker.CfnDataQualityJobDefinition
import kotlin.String

@CdkDslMarker
public class CfnDataQualityJobDefinitionEndpointInputPropertyDsl {
    private val cdkBuilder: CfnDataQualityJobDefinition.EndpointInputProperty.Builder =
        CfnDataQualityJobDefinition.EndpointInputProperty.builder()

    public fun endpointName(endpointName: String) {
        cdkBuilder.endpointName(endpointName)
    }

    public fun localPath(localPath: String) {
        cdkBuilder.localPath(localPath)
    }

    public fun s3DataDistributionType(s3DataDistributionType: String) {
        cdkBuilder.s3DataDistributionType(s3DataDistributionType)
    }

    public fun s3InputMode(s3InputMode: String) {
        cdkBuilder.s3InputMode(s3InputMode)
    }

    public fun build(): CfnDataQualityJobDefinition.EndpointInputProperty = cdkBuilder.build()
}
