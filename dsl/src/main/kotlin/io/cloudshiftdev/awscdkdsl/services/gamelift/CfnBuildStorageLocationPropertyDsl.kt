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

package io.cloudshiftdev.awscdkdsl.services.gamelift

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.gamelift.CfnBuild

/**
 * The location in Amazon S3 where build or script files are stored for access by Amazon GameLift.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.gamelift.*;
 * StorageLocationProperty storageLocationProperty = StorageLocationProperty.builder()
 * .bucket("bucket")
 * .key("key")
 * .roleArn("roleArn")
 * // the properties below are optional
 * .objectVersion("objectVersion")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-gamelift-build-storagelocation.html)
 */
@CdkDslMarker
public class CfnBuildStorageLocationPropertyDsl {
    private val cdkBuilder: CfnBuild.StorageLocationProperty.Builder =
        CfnBuild.StorageLocationProperty.builder()

    /**
     * @param bucket An Amazon S3 bucket identifier. The name of the S3 bucket.
     *
     * Amazon GameLift doesn't support uploading from Amazon S3 buckets with names that contain a
     * dot (.).
     */
    public fun bucket(bucket: String) {
        cdkBuilder.bucket(bucket)
    }

    /** @param key The name of the zip file that contains the build files or script files. */
    public fun key(key: String) {
        cdkBuilder.key(key)
    }

    /**
     * @param objectVersion A version of a stored file to retrieve, if the object versioning feature
     *   is turned on for the S3 bucket. Use this parameter to specify a specific version. If this
     *   parameter isn't set, Amazon GameLift retrieves the latest version of the file.
     */
    public fun objectVersion(objectVersion: String) {
        cdkBuilder.objectVersion(objectVersion)
    }

    /**
     * @param roleArn The ARNfor an IAM role that allows Amazon GameLift to access the S3 bucket.
     */
    public fun roleArn(roleArn: String) {
        cdkBuilder.roleArn(roleArn)
    }

    public fun build(): CfnBuild.StorageLocationProperty = cdkBuilder.build()
}
