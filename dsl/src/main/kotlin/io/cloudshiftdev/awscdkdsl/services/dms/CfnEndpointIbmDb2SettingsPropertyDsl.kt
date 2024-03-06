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

package io.cloudshiftdev.awscdkdsl.services.dms

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.dms.CfnEndpoint

/**
 * Provides information that defines an IBMDB2 endpoint.
 *
 * This information includes the output format of records applied to the endpoint and details of
 * transaction and control table data information. For more information about other available
 * settings, see
 * [Extra connection attributes when using Db2 LUW as a source for AWS DMS](https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Source.DB2.html#CHAP_Source.DB2.ConnectionAttrib)
 * in the *AWS Database Migration Service User Guide* .
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.dms.*;
 * IbmDb2SettingsProperty ibmDb2SettingsProperty = IbmDb2SettingsProperty.builder()
 * .currentLsn("currentLsn")
 * .keepCsvFiles(false)
 * .loadTimeout(123)
 * .maxFileSize(123)
 * .maxKBytesPerRead(123)
 * .secretsManagerAccessRoleArn("secretsManagerAccessRoleArn")
 * .secretsManagerSecretId("secretsManagerSecretId")
 * .setDataCaptureChanges(false)
 * .writeBufferSize(123)
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-endpoint-ibmdb2settings.html)
 */
@CdkDslMarker
public class CfnEndpointIbmDb2SettingsPropertyDsl {
    private val cdkBuilder: CfnEndpoint.IbmDb2SettingsProperty.Builder =
        CfnEndpoint.IbmDb2SettingsProperty.builder()

    /**
     * @param currentLsn For ongoing replication (CDC), use CurrentLSN to specify a log sequence
     *   number (LSN) where you want the replication to start.
     */
    public fun currentLsn(currentLsn: String) {
        cdkBuilder.currentLsn(currentLsn)
    }

    /**
     * @param keepCsvFiles If true, AWS DMS saves any .csv files to the Db2 LUW target that were
     *   used to replicate data. DMS uses these files for analysis and troubleshooting. The default
     *   value is false.
     */
    public fun keepCsvFiles(keepCsvFiles: Boolean) {
        cdkBuilder.keepCsvFiles(keepCsvFiles)
    }

    /**
     * @param keepCsvFiles If true, AWS DMS saves any .csv files to the Db2 LUW target that were
     *   used to replicate data. DMS uses these files for analysis and troubleshooting. The default
     *   value is false.
     */
    public fun keepCsvFiles(keepCsvFiles: IResolvable) {
        cdkBuilder.keepCsvFiles(keepCsvFiles)
    }

    /**
     * @param loadTimeout The amount of time (in milliseconds) before AWS DMS times out operations
     *   performed by DMS on the Db2 target. The default value is 1200 (20 minutes).
     */
    public fun loadTimeout(loadTimeout: Number) {
        cdkBuilder.loadTimeout(loadTimeout)
    }

    /**
     * @param maxFileSize Specifies the maximum size (in KB) of .csv files used to transfer data to
     *   Db2 LUW.
     */
    public fun maxFileSize(maxFileSize: Number) {
        cdkBuilder.maxFileSize(maxFileSize)
    }

    /**
     * @param maxKBytesPerRead Maximum number of bytes per read, as a NUMBER value. The default is
     *   64 KB.
     */
    public fun maxKBytesPerRead(maxKBytesPerRead: Number) {
        cdkBuilder.maxKBytesPerRead(maxKBytesPerRead)
    }

    /**
     * @param secretsManagerAccessRoleArn The full Amazon Resource Name (ARN) of the IAM role that
     *   specifies AWS DMS as the trusted entity and grants the required permissions to access the
     *   value in `SecretsManagerSecret` . The role must allow the `iam:PassRole` action.
     *   `SecretsManagerSecret` has the value ofthe AWS Secrets Manager secret that allows access to
     *   the Db2 LUW endpoint.
     *
     * You can specify one of two sets of values for these permissions. You can specify the values
     * for this setting and `SecretsManagerSecretId` . Or you can specify clear-text values for
     * `UserName` , `Password` , `ServerName` , and `Port` . You can't specify both.
     *
     * For more information on creating this `SecretsManagerSecret` , the corresponding
     * `SecretsManagerAccessRoleArn` , and the `SecretsManagerSecretId` that is required to access
     * it, see
     * [Using secrets to access AWS Database Migration Service resources](https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Security.html#security-iam-secretsmanager)
     * in the *AWS Database Migration Service User Guide* .
     */
    public fun secretsManagerAccessRoleArn(secretsManagerAccessRoleArn: String) {
        cdkBuilder.secretsManagerAccessRoleArn(secretsManagerAccessRoleArn)
    }

    /**
     * @param secretsManagerSecretId The full ARN, partial ARN, or display name of the
     *   `SecretsManagerSecret` that contains the IBMDB2 endpoint connection details.
     */
    public fun secretsManagerSecretId(secretsManagerSecretId: String) {
        cdkBuilder.secretsManagerSecretId(secretsManagerSecretId)
    }

    /**
     * @param setDataCaptureChanges Enables ongoing replication (CDC) as a BOOLEAN value. The
     *   default is true.
     */
    public fun setDataCaptureChanges(setDataCaptureChanges: Boolean) {
        cdkBuilder.setDataCaptureChanges(setDataCaptureChanges)
    }

    /**
     * @param setDataCaptureChanges Enables ongoing replication (CDC) as a BOOLEAN value. The
     *   default is true.
     */
    public fun setDataCaptureChanges(setDataCaptureChanges: IResolvable) {
        cdkBuilder.setDataCaptureChanges(setDataCaptureChanges)
    }

    /**
     * @param writeBufferSize The size (in KB) of the in-memory file write buffer used when
     *   generating .csv files on the local disk on the DMS replication instance. The default value
     *   is 1024 (1 MB).
     */
    public fun writeBufferSize(writeBufferSize: Number) {
        cdkBuilder.writeBufferSize(writeBufferSize)
    }

    public fun build(): CfnEndpoint.IbmDb2SettingsProperty = cdkBuilder.build()
}
