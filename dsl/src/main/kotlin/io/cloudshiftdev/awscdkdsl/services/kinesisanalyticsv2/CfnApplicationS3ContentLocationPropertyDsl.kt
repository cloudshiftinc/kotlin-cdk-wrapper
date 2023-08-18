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

package io.cloudshiftdev.awscdkdsl.services.kinesisanalyticsv2

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.kinesisanalyticsv2.CfnApplication

/**
 * The location of an application or a custom artifact.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.kinesisanalyticsv2.*;
 * S3ContentLocationProperty s3ContentLocationProperty = S3ContentLocationProperty.builder()
 * .bucketArn("bucketArn")
 * .fileKey("fileKey")
 * // the properties below are optional
 * .objectVersion("objectVersion")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-application-s3contentlocation.html)
 */
@CdkDslMarker
public class CfnApplicationS3ContentLocationPropertyDsl {
    private val cdkBuilder: CfnApplication.S3ContentLocationProperty.Builder =
        CfnApplication.S3ContentLocationProperty.builder()

    /**
     * @param bucketArn The Amazon Resource Name (ARN) for the S3 bucket containing the application
     *   code.
     */
    public fun bucketArn(bucketArn: String) {
        cdkBuilder.bucketArn(bucketArn)
    }

    /** @param fileKey The file key for the object containing the application code. */
    public fun fileKey(fileKey: String) {
        cdkBuilder.fileKey(fileKey)
    }

    /** @param objectVersion The version of the object containing the application code. */
    public fun objectVersion(objectVersion: String) {
        cdkBuilder.objectVersion(objectVersion)
    }

    public fun build(): CfnApplication.S3ContentLocationProperty = cdkBuilder.build()
}
