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
import software.amazon.awscdk.services.appstream.CfnAppBlock
import kotlin.String

@CdkDslMarker
public class CfnAppBlockS3LocationPropertyDsl {
    private val cdkBuilder: CfnAppBlock.S3LocationProperty.Builder =
        CfnAppBlock.S3LocationProperty.builder()

    public fun s3Bucket(s3Bucket: String) {
        cdkBuilder.s3Bucket(s3Bucket)
    }

    public fun s3Key(s3Key: String) {
        cdkBuilder.s3Key(s3Key)
    }

    public fun build(): CfnAppBlock.S3LocationProperty = cdkBuilder.build()
}
