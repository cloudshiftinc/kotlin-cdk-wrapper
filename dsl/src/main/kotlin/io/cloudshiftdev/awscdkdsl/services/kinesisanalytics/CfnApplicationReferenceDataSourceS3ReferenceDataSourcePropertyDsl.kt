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
import software.amazon.awscdk.services.kinesisanalytics.CfnApplicationReferenceDataSource

/**
 * Identifies the S3 bucket and object that contains the reference data.
 *
 * Also identifies the IAM role Amazon Kinesis Analytics can assume to read this object on your
 * behalf.
 *
 * An Amazon Kinesis Analytics application loads reference data only once. If the data changes, you
 * call the
 * [UpdateApplication](https://docs.aws.amazon.com/kinesisanalytics/latest/dev/API_UpdateApplication.html)
 * operation to trigger reloading of data into your application.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.kinesisanalytics.*;
 * S3ReferenceDataSourceProperty s3ReferenceDataSourceProperty =
 * S3ReferenceDataSourceProperty.builder()
 * .bucketArn("bucketArn")
 * .fileKey("fileKey")
 * .referenceRoleArn("referenceRoleArn")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalytics-applicationreferencedatasource-s3referencedatasource.html)
 */
@CdkDslMarker
public class CfnApplicationReferenceDataSourceS3ReferenceDataSourcePropertyDsl {
    private val cdkBuilder:
        CfnApplicationReferenceDataSource.S3ReferenceDataSourceProperty.Builder =
        CfnApplicationReferenceDataSource.S3ReferenceDataSourceProperty.builder()

    /** @param bucketArn Amazon Resource Name (ARN) of the S3 bucket. */
    public fun bucketArn(bucketArn: String) {
        cdkBuilder.bucketArn(bucketArn)
    }

    /** @param fileKey Object key name containing reference data. */
    public fun fileKey(fileKey: String) {
        cdkBuilder.fileKey(fileKey)
    }

    /**
     * @param referenceRoleArn ARN of the IAM role that the service can assume to read data on your
     *   behalf. This role must have permission for the `s3:GetObject` action on the object and
     *   trust policy that allows Amazon Kinesis Analytics service principal to assume this role.
     */
    public fun referenceRoleArn(referenceRoleArn: String) {
        cdkBuilder.referenceRoleArn(referenceRoleArn)
    }

    public fun build(): CfnApplicationReferenceDataSource.S3ReferenceDataSourceProperty =
        cdkBuilder.build()
}
