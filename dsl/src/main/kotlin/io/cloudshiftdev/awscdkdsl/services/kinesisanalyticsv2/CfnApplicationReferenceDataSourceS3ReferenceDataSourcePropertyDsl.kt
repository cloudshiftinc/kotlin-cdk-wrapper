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
import software.amazon.awscdk.services.kinesisanalyticsv2.CfnApplicationReferenceDataSource

/**
 * For an SQL-based Amazon Kinesis Data Analytics application, identifies the Amazon S3 bucket and
 * object that contains the reference data.
 *
 * A Kinesis Data Analytics application loads reference data only once. If the data changes, you
 * call the
 * [UpdateApplication](https://docs.aws.amazon.com/managed-flink/latest/apiv2/API_UpdateApplication.html)
 * operation to trigger reloading of data into your application.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.kinesisanalyticsv2.*;
 * S3ReferenceDataSourceProperty s3ReferenceDataSourceProperty =
 * S3ReferenceDataSourceProperty.builder()
 * .bucketArn("bucketArn")
 * .fileKey("fileKey")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-applicationreferencedatasource-s3referencedatasource.html)
 */
@CdkDslMarker
public class CfnApplicationReferenceDataSourceS3ReferenceDataSourcePropertyDsl {
    private val cdkBuilder:
        CfnApplicationReferenceDataSource.S3ReferenceDataSourceProperty.Builder =
        CfnApplicationReferenceDataSource.S3ReferenceDataSourceProperty.builder()

    /** @param bucketArn The Amazon Resource Name (ARN) of the S3 bucket. */
    public fun bucketArn(bucketArn: String) {
        cdkBuilder.bucketArn(bucketArn)
    }

    /** @param fileKey The object key name containing the reference data. */
    public fun fileKey(fileKey: String) {
        cdkBuilder.fileKey(fileKey)
    }

    public fun build(): CfnApplicationReferenceDataSource.S3ReferenceDataSourceProperty =
        cdkBuilder.build()
}
