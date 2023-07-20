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

package cloudshift.awscdk.dsl.services.dynamodb

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.dynamodb.CfnTable
import kotlin.String

@CdkDslMarker
public class CfnTableS3BucketSourcePropertyDsl {
    private val cdkBuilder: CfnTable.S3BucketSourceProperty.Builder =
        CfnTable.S3BucketSourceProperty.builder()

    public fun s3Bucket(s3Bucket: String) {
        cdkBuilder.s3Bucket(s3Bucket)
    }

    public fun s3BucketOwner(s3BucketOwner: String) {
        cdkBuilder.s3BucketOwner(s3BucketOwner)
    }

    public fun s3KeyPrefix(s3KeyPrefix: String) {
        cdkBuilder.s3KeyPrefix(s3KeyPrefix)
    }

    public fun build(): CfnTable.S3BucketSourceProperty = cdkBuilder.build()
}
