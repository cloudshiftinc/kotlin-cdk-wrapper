@file:Suppress("RedundantVisibilityModifier", "RedundantUnitReturnType", "RemoveRedundantQualifierName", "unused", "UnusedImport", "ClassName", "REDUNDANT_PROJECTION", "DEPRECATION")

package cloudshift.awscdk.dsl.services.ssm

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.ssm.CfnMaintenanceWindowTask
import kotlin.String

/**
 * The `LoggingInfo` property type specifies information about the Amazon S3 bucket to write
 * instance-level logs to.
 *
 * `LoggingInfo` is a property of the
 * [AWS::SSM::MaintenanceWindowTask](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-maintenancewindowtask.html)
 * resource.
 *
 *
 * `LoggingInfo` has been deprecated. To specify an Amazon S3 bucket to contain logs, instead use
 * the `OutputS3BucketName` and `OutputS3KeyPrefix` options in the `TaskInvocationParameters`
 * structure. For information about how Systems Manager handles these options for the supported
 * maintenance window task types, see [AWS ::SSM::MaintenanceWindowTask
 * MaintenanceWindowRunCommandParameters](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssm-maintenancewindowtask-maintenancewindowruncommandparameters.html)
 * .
 *
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.ssm.*;
 * LoggingInfoProperty loggingInfoProperty = LoggingInfoProperty.builder()
 * .region("region")
 * .s3Bucket("s3Bucket")
 * // the properties below are optional
 * .s3Prefix("s3Prefix")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssm-maintenancewindowtask-logginginfo.html)
 */
@CdkDslMarker
public class CfnMaintenanceWindowTaskLoggingInfoPropertyDsl {
    private val cdkBuilder: CfnMaintenanceWindowTask.LoggingInfoProperty.Builder =
        CfnMaintenanceWindowTask.LoggingInfoProperty.builder()

    /**
     * @param region The AWS Region where the S3 bucket is located.
     */
    public fun region(region: String) {
        cdkBuilder.region(region)
    }

    /**
     * @param s3Bucket The name of an S3 bucket where execution logs are stored.
     */
    public fun s3Bucket(s3Bucket: String) {
        cdkBuilder.s3Bucket(s3Bucket)
    }

    /**
     * @param s3Prefix The Amazon S3 bucket subfolder.
     */
    public fun s3Prefix(s3Prefix: String) {
        cdkBuilder.s3Prefix(s3Prefix)
    }

    public fun build(): CfnMaintenanceWindowTask.LoggingInfoProperty = cdkBuilder.build()
}
