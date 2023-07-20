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

package cloudshift.awscdk.dsl

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.FileAssetLocation
import kotlin.String

@CdkDslMarker
public class FileAssetLocationDsl {
    private val cdkBuilder: FileAssetLocation.Builder = FileAssetLocation.builder()

    public fun bucketName(bucketName: String) {
        cdkBuilder.bucketName(bucketName)
    }

    public fun httpUrl(httpUrl: String) {
        cdkBuilder.httpUrl(httpUrl)
    }

    public fun kmsKeyArn(kmsKeyArn: String) {
        cdkBuilder.kmsKeyArn(kmsKeyArn)
    }

    public fun objectKey(objectKey: String) {
        cdkBuilder.objectKey(objectKey)
    }

    public fun s3ObjectUrl(s3ObjectUrl: String) {
        cdkBuilder.s3ObjectUrl(s3ObjectUrl)
    }

    public fun s3ObjectUrlWithPlaceholders(s3ObjectUrlWithPlaceholders: String) {
        cdkBuilder.s3ObjectUrlWithPlaceholders(s3ObjectUrlWithPlaceholders)
    }

    public fun build(): FileAssetLocation = cdkBuilder.build()
}
