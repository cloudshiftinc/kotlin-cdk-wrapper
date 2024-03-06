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

package io.cloudshiftdev.awscdkdsl.services.datasync

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.datasync.CfnTask

/**
 * Specifies where DataSync uploads your
 * [task report](https://docs.aws.amazon.com/datasync/latest/userguide/task-reports.html) .
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.datasync.*;
 * DestinationProperty destinationProperty = DestinationProperty.builder()
 * .s3(S3Property.builder()
 * .bucketAccessRoleArn("bucketAccessRoleArn")
 * .s3BucketArn("s3BucketArn")
 * .subdirectory("subdirectory")
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-datasync-task-destination.html)
 */
@CdkDslMarker
public class CfnTaskDestinationPropertyDsl {
    private val cdkBuilder: CfnTask.DestinationProperty.Builder =
        CfnTask.DestinationProperty.builder()

    /** @param s3 Specifies the Amazon S3 bucket where DataSync uploads your task report. */
    public fun s3(s3: IResolvable) {
        cdkBuilder.s3(s3)
    }

    /** @param s3 Specifies the Amazon S3 bucket where DataSync uploads your task report. */
    public fun s3(s3: CfnTask.S3Property) {
        cdkBuilder.s3(s3)
    }

    public fun build(): CfnTask.DestinationProperty = cdkBuilder.build()
}
