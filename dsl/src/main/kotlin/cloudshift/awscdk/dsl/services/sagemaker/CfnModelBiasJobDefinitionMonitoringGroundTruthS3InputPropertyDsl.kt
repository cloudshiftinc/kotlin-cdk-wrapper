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
import kotlin.String

@CdkDslMarker
public class CfnModelBiasJobDefinitionMonitoringGroundTruthS3InputPropertyDsl {
    private val cdkBuilder: CfnModelBiasJobDefinition.MonitoringGroundTruthS3InputProperty.Builder =
        CfnModelBiasJobDefinition.MonitoringGroundTruthS3InputProperty.builder()

    public fun s3Uri(s3Uri: String) {
        cdkBuilder.s3Uri(s3Uri)
    }

    public fun build(): CfnModelBiasJobDefinition.MonitoringGroundTruthS3InputProperty =
        cdkBuilder.build()
}
