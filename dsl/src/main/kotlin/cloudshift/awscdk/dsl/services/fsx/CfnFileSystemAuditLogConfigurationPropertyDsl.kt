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

package cloudshift.awscdk.dsl.services.fsx

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.fsx.CfnFileSystem

/**
 * The configuration that Amazon FSx for Windows File Server uses to audit and log user accesses of
 * files, folders, and file shares on the Amazon FSx for Windows File Server file system.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.fsx.*;
 * AuditLogConfigurationProperty auditLogConfigurationProperty =
 * AuditLogConfigurationProperty.builder()
 * .fileAccessAuditLogLevel("fileAccessAuditLogLevel")
 * .fileShareAccessAuditLogLevel("fileShareAccessAuditLogLevel")
 * // the properties below are optional
 * .auditLogDestination("auditLogDestination")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-fsx-filesystem-auditlogconfiguration.html)
 */
@CdkDslMarker
public class CfnFileSystemAuditLogConfigurationPropertyDsl {
    private val cdkBuilder: CfnFileSystem.AuditLogConfigurationProperty.Builder =
        CfnFileSystem.AuditLogConfigurationProperty.builder()

    /**
     * @param auditLogDestination The Amazon Resource Name (ARN) for the destination of the audit
     *   logs. The destination can be any Amazon CloudWatch Logs log group ARN or Amazon Kinesis
     *   Data Firehose delivery stream ARN.
     *
     * The name of the Amazon CloudWatch Logs log group must begin with the `/aws/fsx` prefix. The
     * name of the Amazon Kinesis Data Firehose delivery stream must begin with the `aws-fsx`
     * prefix.
     *
     * The destination ARN (either CloudWatch Logs log group or Kinesis Data Firehose delivery
     * stream) must be in the same AWS partition, AWS Region , and AWS account as your Amazon FSx
     * file system.
     */
    public fun auditLogDestination(auditLogDestination: String) {
        cdkBuilder.auditLogDestination(auditLogDestination)
    }

    /**
     * @param fileAccessAuditLogLevel Sets which attempt type is logged by Amazon FSx for file and
     *   folder accesses.
     * * `SUCCESS_ONLY` - only successful attempts to access files or folders are logged.
     * * `FAILURE_ONLY` - only failed attempts to access files or folders are logged.
     * * `SUCCESS_AND_FAILURE` - both successful attempts and failed attempts to access files or
     *   folders are logged.
     * * `DISABLED` - access auditing of files and folders is turned off.
     */
    public fun fileAccessAuditLogLevel(fileAccessAuditLogLevel: String) {
        cdkBuilder.fileAccessAuditLogLevel(fileAccessAuditLogLevel)
    }

    /**
     * @param fileShareAccessAuditLogLevel Sets which attempt type is logged by Amazon FSx for file
     *   share accesses.
     * * `SUCCESS_ONLY` - only successful attempts to access file shares are logged.
     * * `FAILURE_ONLY` - only failed attempts to access file shares are logged.
     * * `SUCCESS_AND_FAILURE` - both successful attempts and failed attempts to access file shares
     *   are logged.
     * * `DISABLED` - access auditing of file shares is turned off.
     */
    public fun fileShareAccessAuditLogLevel(fileShareAccessAuditLogLevel: String) {
        cdkBuilder.fileShareAccessAuditLogLevel(fileShareAccessAuditLogLevel)
    }

    public fun build(): CfnFileSystem.AuditLogConfigurationProperty = cdkBuilder.build()
}
