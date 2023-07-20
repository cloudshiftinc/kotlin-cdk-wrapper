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

package cloudshift.awscdk.dsl.services.kinesisanalytics

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2
import kotlin.String

@CdkDslMarker
public class CfnApplicationV2S3ContentLocationPropertyDsl {
    private val cdkBuilder: CfnApplicationV2.S3ContentLocationProperty.Builder =
        CfnApplicationV2.S3ContentLocationProperty.builder()

    public fun bucketArn(bucketArn: String) {
        cdkBuilder.bucketArn(bucketArn)
    }

    public fun fileKey(fileKey: String) {
        cdkBuilder.fileKey(fileKey)
    }

    public fun objectVersion(objectVersion: String) {
        cdkBuilder.objectVersion(objectVersion)
    }

    public fun build(): CfnApplicationV2.S3ContentLocationProperty = cdkBuilder.build()
}
