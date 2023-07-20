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

package cloudshift.awscdk.dsl.services.robomaker

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.robomaker.CfnSimulationApplication
import kotlin.String

@CdkDslMarker
public class CfnSimulationApplicationSourceConfigPropertyDsl {
    private val cdkBuilder: CfnSimulationApplication.SourceConfigProperty.Builder =
        CfnSimulationApplication.SourceConfigProperty.builder()

    public fun architecture(architecture: String) {
        cdkBuilder.architecture(architecture)
    }

    public fun s3Bucket(s3Bucket: String) {
        cdkBuilder.s3Bucket(s3Bucket)
    }

    public fun s3Key(s3Key: String) {
        cdkBuilder.s3Key(s3Key)
    }

    public fun build(): CfnSimulationApplication.SourceConfigProperty = cdkBuilder.build()
}
