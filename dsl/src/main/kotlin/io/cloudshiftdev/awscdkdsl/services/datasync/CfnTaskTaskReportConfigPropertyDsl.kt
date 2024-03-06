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
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.datasync.CfnTask

/**
 * Specifies how you want to configure a task report, which provides detailed information about for
 * your AWS DataSync transfer.
 *
 * For more information, see
 * [Task reports](https://docs.aws.amazon.com/datasync/latest/userguide/task-reports.html) .
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.datasync.*;
 * TaskReportConfigProperty taskReportConfigProperty = TaskReportConfigProperty.builder()
 * .destination(DestinationProperty.builder()
 * .s3(S3Property.builder()
 * .bucketAccessRoleArn("bucketAccessRoleArn")
 * .s3BucketArn("s3BucketArn")
 * .subdirectory("subdirectory")
 * .build())
 * .build())
 * .outputType("outputType")
 * // the properties below are optional
 * .objectVersionIds("objectVersionIds")
 * .overrides(OverridesProperty.builder()
 * .deleted(DeletedProperty.builder()
 * .reportLevel("reportLevel")
 * .build())
 * .skipped(SkippedProperty.builder()
 * .reportLevel("reportLevel")
 * .build())
 * .transferred(TransferredProperty.builder()
 * .reportLevel("reportLevel")
 * .build())
 * .verified(VerifiedProperty.builder()
 * .reportLevel("reportLevel")
 * .build())
 * .build())
 * .reportLevel("reportLevel")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-datasync-task-taskreportconfig.html)
 */
@CdkDslMarker
public class CfnTaskTaskReportConfigPropertyDsl {
    private val cdkBuilder: CfnTask.TaskReportConfigProperty.Builder =
        CfnTask.TaskReportConfigProperty.builder()

    /**
     * @param destination Specifies the Amazon S3 bucket where DataSync uploads your task report.
     *   For more information, see
     *   [Task reports](https://docs.aws.amazon.com/datasync/latest/userguide/task-reports.html#task-report-access)
     *   .
     */
    public fun destination(destination: IResolvable) {
        cdkBuilder.destination(destination)
    }

    /**
     * @param destination Specifies the Amazon S3 bucket where DataSync uploads your task report.
     *   For more information, see
     *   [Task reports](https://docs.aws.amazon.com/datasync/latest/userguide/task-reports.html#task-report-access)
     *   .
     */
    public fun destination(destination: CfnTask.DestinationProperty) {
        cdkBuilder.destination(destination)
    }

    /**
     * @param objectVersionIds Specifies whether your task report includes the new version of each
     *   object transferred into an S3 bucket. This only applies if you
     *   [enable versioning on your bucket](https://docs.aws.amazon.com/AmazonS3/latest/userguide/manage-versioning-examples.html)
     *   . Keep in mind that setting this to `INCLUDE` can increase the duration of your task
     *   execution.
     */
    public fun objectVersionIds(objectVersionIds: String) {
        cdkBuilder.objectVersionIds(objectVersionIds)
    }

    /**
     * @param outputType Specifies the type of task report that you want:.
     * * `SUMMARY_ONLY` : Provides necessary details about your task, including the number of files,
     *   objects, and directories transferred and transfer duration.
     * * `STANDARD` : Provides complete details about your task, including a full list of files,
     *   objects, and directories that were transferred, skipped, verified, and more.
     */
    public fun outputType(outputType: String) {
        cdkBuilder.outputType(outputType)
    }

    /**
     * @param overrides Customizes the reporting level for aspects of your task report. For example,
     *   your report might generally only include errors, but you could specify that you want a list
     *   of successes and errors just for the files that DataSync attempted to delete in your
     *   destination location.
     */
    public fun overrides(overrides: IResolvable) {
        cdkBuilder.overrides(overrides)
    }

    /**
     * @param overrides Customizes the reporting level for aspects of your task report. For example,
     *   your report might generally only include errors, but you could specify that you want a list
     *   of successes and errors just for the files that DataSync attempted to delete in your
     *   destination location.
     */
    public fun overrides(overrides: CfnTask.OverridesProperty) {
        cdkBuilder.overrides(overrides)
    }

    /**
     * @param reportLevel Specifies whether you want your task report to include only what went
     *   wrong with your transfer or a list of what succeeded and didn't.
     * * `ERRORS_ONLY` : A report shows what DataSync was unable to transfer, skip, verify, and
     *   delete.
     * * `SUCCESSES_AND_ERRORS` : A report shows what DataSync was able and unable to transfer,
     *   skip, verify, and delete.
     */
    public fun reportLevel(reportLevel: String) {
        cdkBuilder.reportLevel(reportLevel)
    }

    public fun build(): CfnTask.TaskReportConfigProperty = cdkBuilder.build()
}
