@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION"
)

package cloudshift.awscdk.dsl.services.kendra

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.kendra.CfnDataSource

/**
 * Information required to find a specific file in an Amazon S3 bucket.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.kendra.*;
 * S3PathProperty s3PathProperty = S3PathProperty.builder()
 * .bucket("bucket")
 * .key("key")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kendra-datasource-s3path.html)
 */
@CdkDslMarker
public class CfnDataSourceS3PathPropertyDsl {
    private val cdkBuilder: CfnDataSource.S3PathProperty.Builder =
        CfnDataSource.S3PathProperty.builder()

    /** @param bucket The name of the S3 bucket that contains the file. */
    public fun bucket(bucket: String) {
        cdkBuilder.bucket(bucket)
    }

    /** @param key The name of the file. */
    public fun key(key: String) {
        cdkBuilder.key(key)
    }

    public fun build(): CfnDataSource.S3PathProperty = cdkBuilder.build()
}
