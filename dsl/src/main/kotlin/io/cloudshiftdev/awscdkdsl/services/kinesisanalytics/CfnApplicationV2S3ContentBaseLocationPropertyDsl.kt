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

package io.cloudshiftdev.awscdkdsl.services.kinesisanalytics

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2

/**
 * The base location of the Amazon Data Analytics application.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.kinesisanalytics.*;
 * S3ContentBaseLocationProperty s3ContentBaseLocationProperty =
 * S3ContentBaseLocationProperty.builder()
 * .bucketArn("bucketArn")
 * // the properties below are optional
 * .basePath("basePath")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-application-s3contentbaselocation.html)
 */
@CdkDslMarker
public class CfnApplicationV2S3ContentBaseLocationPropertyDsl {
    private val cdkBuilder: CfnApplicationV2.S3ContentBaseLocationProperty.Builder =
        CfnApplicationV2.S3ContentBaseLocationProperty.builder()

    /** @param basePath The base path for the S3 bucket. */
    public fun basePath(basePath: String) {
        cdkBuilder.basePath(basePath)
    }

    /** @param bucketArn The Amazon Resource Name (ARN) of the S3 bucket. */
    public fun bucketArn(bucketArn: String) {
        cdkBuilder.bucketArn(bucketArn)
    }

    public fun build(): CfnApplicationV2.S3ContentBaseLocationProperty = cdkBuilder.build()
}
