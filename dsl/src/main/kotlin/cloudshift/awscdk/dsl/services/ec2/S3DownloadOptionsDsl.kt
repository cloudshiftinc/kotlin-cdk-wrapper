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

package cloudshift.awscdk.dsl.services.ec2

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.ec2.S3DownloadOptions
import software.amazon.awscdk.services.s3.IBucket
import kotlin.String

@CdkDslMarker
public class S3DownloadOptionsDsl {
    private val cdkBuilder: S3DownloadOptions.Builder = S3DownloadOptions.builder()

    public fun bucket(bucket: IBucket) {
        cdkBuilder.bucket(bucket)
    }

    public fun bucketKey(bucketKey: String) {
        cdkBuilder.bucketKey(bucketKey)
    }

    public fun localFile(localFile: String) {
        cdkBuilder.localFile(localFile)
    }

    public fun region(region: String) {
        cdkBuilder.region(region)
    }

    public fun build(): S3DownloadOptions = cdkBuilder.build()
}
