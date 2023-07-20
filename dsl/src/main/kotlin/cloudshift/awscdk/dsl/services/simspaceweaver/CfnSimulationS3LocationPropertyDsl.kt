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

package cloudshift.awscdk.dsl.services.simspaceweaver

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.simspaceweaver.CfnSimulation
import kotlin.String

@CdkDslMarker
public class CfnSimulationS3LocationPropertyDsl {
    private val cdkBuilder: CfnSimulation.S3LocationProperty.Builder =
        CfnSimulation.S3LocationProperty.builder()

    public fun bucketName(bucketName: String) {
        cdkBuilder.bucketName(bucketName)
    }

    public fun objectKey(objectKey: String) {
        cdkBuilder.objectKey(objectKey)
    }

    public fun build(): CfnSimulation.S3LocationProperty = cdkBuilder.build()
}
