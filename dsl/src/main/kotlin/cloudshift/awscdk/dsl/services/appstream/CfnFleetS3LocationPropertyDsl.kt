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

package cloudshift.awscdk.dsl.services.appstream

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.appstream.CfnFleet
import kotlin.String

@CdkDslMarker
public class CfnFleetS3LocationPropertyDsl {
    private val cdkBuilder: CfnFleet.S3LocationProperty.Builder =
        CfnFleet.S3LocationProperty.builder()

    public fun s3Bucket(s3Bucket: String) {
        cdkBuilder.s3Bucket(s3Bucket)
    }

    public fun s3Key(s3Key: String) {
        cdkBuilder.s3Key(s3Key)
    }

    public fun build(): CfnFleet.S3LocationProperty = cdkBuilder.build()
}
