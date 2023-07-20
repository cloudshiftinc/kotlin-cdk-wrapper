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
import software.amazon.awscdk.services.sagemaker.CfnDeviceFleet
import kotlin.String

@CdkDslMarker
public class CfnDeviceFleetEdgeOutputConfigPropertyDsl {
    private val cdkBuilder: CfnDeviceFleet.EdgeOutputConfigProperty.Builder =
        CfnDeviceFleet.EdgeOutputConfigProperty.builder()

    public fun kmsKeyId(kmsKeyId: String) {
        cdkBuilder.kmsKeyId(kmsKeyId)
    }

    public fun s3OutputLocation(s3OutputLocation: String) {
        cdkBuilder.s3OutputLocation(s3OutputLocation)
    }

    public fun build(): CfnDeviceFleet.EdgeOutputConfigProperty = cdkBuilder.build()
}
