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

package cloudshift.awscdk.dsl.services.dms

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.dms.CfnEndpoint

/**
 * Provides information that defines an Amazon Redshift endpoint.
 *
 * This information includes the output format of records applied to the endpoint and details of
 * transaction and control table data information. For more information about other available
 * settings, see
 * [Extra connection attributes when using Amazon Redshift as a target for AWS DMS](https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Target.Redshift.html#CHAP_Target.Redshift.ConnectionAttrib)
 * in the *AWS Database Migration Service User Guide* .
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.dms.*;
 * RedshiftSettingsProperty redshiftSettingsProperty = RedshiftSettingsProperty.builder()
 * .acceptAnyDate(false)
 * .afterConnectScript("afterConnectScript")
 * .bucketFolder("bucketFolder")
 * .bucketName("bucketName")
 * .caseSensitiveNames(false)
 * .compUpdate(false)
 * .connectionTimeout(123)
 * .dateFormat("dateFormat")
 * .emptyAsNull(false)
 * .encryptionMode("encryptionMode")
 * .explicitIds(false)
 * .fileTransferUploadStreams(123)
 * .loadTimeout(123)
 * .mapBooleanAsBoolean(false)
 * .maxFileSize(123)
 * .removeQuotes(false)
 * .replaceChars("replaceChars")
 * .replaceInvalidChars("replaceInvalidChars")
 * .secretsManagerAccessRoleArn("secretsManagerAccessRoleArn")
 * .secretsManagerSecretId("secretsManagerSecretId")
 * .serverSideEncryptionKmsKeyId("serverSideEncryptionKmsKeyId")
 * .serviceAccessRoleArn("serviceAccessRoleArn")
 * .timeFormat("timeFormat")
 * .trimBlanks(false)
 * .truncateColumns(false)
 * .writeBufferSize(123)
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-endpoint-redshiftsettings.html)
 */
@CdkDslMarker
public class CfnEndpointRedshiftSettingsPropertyDsl {
    private val cdkBuilder: CfnEndpoint.RedshiftSettingsProperty.Builder =
        CfnEndpoint.RedshiftSettingsProperty.builder()

    /**
     * @param acceptAnyDate A value that indicates to allow any date format, including invalid
     *   formats such as 00/00/00 00:00:00, to be loaded without generating an error. You can choose
     *   `true` or `false` (the default).
     *
     * This parameter applies only to TIMESTAMP and DATE columns. Always use ACCEPTANYDATE with the
     * DATEFORMAT parameter. If the date format for the data doesn't match the DATEFORMAT
     * specification, Amazon Redshift inserts a NULL value into that field.
     */
    public fun acceptAnyDate(acceptAnyDate: Boolean) {
        cdkBuilder.acceptAnyDate(acceptAnyDate)
    }

    /**
     * @param acceptAnyDate A value that indicates to allow any date format, including invalid
     *   formats such as 00/00/00 00:00:00, to be loaded without generating an error. You can choose
     *   `true` or `false` (the default).
     *
     * This parameter applies only to TIMESTAMP and DATE columns. Always use ACCEPTANYDATE with the
     * DATEFORMAT parameter. If the date format for the data doesn't match the DATEFORMAT
     * specification, Amazon Redshift inserts a NULL value into that field.
     */
    public fun acceptAnyDate(acceptAnyDate: IResolvable) {
        cdkBuilder.acceptAnyDate(acceptAnyDate)
    }

    /**
     * @param afterConnectScript Code to run after connecting. This parameter should contain the
     *   code itself, not the name of a file containing the code.
     */
    public fun afterConnectScript(afterConnectScript: String) {
        cdkBuilder.afterConnectScript(afterConnectScript)
    }

    /**
     * @param bucketFolder An S3 folder where the comma-separated-value (.csv) files are stored
     *   before being uploaded to the target Redshift cluster. For full load mode, AWS DMS converts
     *   source records into .csv files and loads them to the *BucketFolder/TableID* path. AWS DMS
     *   uses the Redshift `COPY` command to upload the .csv files to the target table. The files
     *   are deleted once the `COPY` operation has finished. For more information, see
     *   [COPY](https://docs.aws.amazon.com/redshift/latest/dg/r_COPY.html) in the *Amazon Redshift
     *   Database Developer Guide* .
     *
     * For change-data-capture (CDC) mode, AWS DMS creates a *NetChanges* table, and loads the .csv
     * files to this *BucketFolder/NetChangesTableID* path.
     */
    public fun bucketFolder(bucketFolder: String) {
        cdkBuilder.bucketFolder(bucketFolder)
    }

    /**
     * @param bucketName The name of the intermediate S3 bucket used to store .csv files before
     *   uploading data to Redshift.
     */
    public fun bucketName(bucketName: String) {
        cdkBuilder.bucketName(bucketName)
    }

    /**
     * @param caseSensitiveNames If Amazon Redshift is configured to support case sensitive schema
     *   names, set `CaseSensitiveNames` to `true` . The default is `false` .
     */
    public fun caseSensitiveNames(caseSensitiveNames: Boolean) {
        cdkBuilder.caseSensitiveNames(caseSensitiveNames)
    }

    /**
     * @param caseSensitiveNames If Amazon Redshift is configured to support case sensitive schema
     *   names, set `CaseSensitiveNames` to `true` . The default is `false` .
     */
    public fun caseSensitiveNames(caseSensitiveNames: IResolvable) {
        cdkBuilder.caseSensitiveNames(caseSensitiveNames)
    }

    /**
     * @param compUpdate If you set `CompUpdate` to `true` Amazon Redshift applies automatic
     *   compression if the table is empty. This applies even if the table columns already have
     *   encodings other than `RAW` . If you set `CompUpdate` to `false` , automatic compression is
     *   disabled and existing column encodings aren't changed. The default is `true` .
     */
    public fun compUpdate(compUpdate: Boolean) {
        cdkBuilder.compUpdate(compUpdate)
    }

    /**
     * @param compUpdate If you set `CompUpdate` to `true` Amazon Redshift applies automatic
     *   compression if the table is empty. This applies even if the table columns already have
     *   encodings other than `RAW` . If you set `CompUpdate` to `false` , automatic compression is
     *   disabled and existing column encodings aren't changed. The default is `true` .
     */
    public fun compUpdate(compUpdate: IResolvable) {
        cdkBuilder.compUpdate(compUpdate)
    }

    /**
     * @param connectionTimeout A value that sets the amount of time to wait (in milliseconds)
     *   before timing out, beginning from when you initially establish a connection.
     */
    public fun connectionTimeout(connectionTimeout: Number) {
        cdkBuilder.connectionTimeout(connectionTimeout)
    }

    /**
     * @param dateFormat The date format that you are using. Valid values are `auto`
     *   (case-sensitive), your date format string enclosed in quotes, or NULL. If this parameter is
     *   left unset (NULL), it defaults to a format of 'YYYY-MM-DD'. Using `auto` recognizes most
     *   strings, even some that aren't supported when you use a date format string.
     *
     * If your date and time values use formats different from each other, set this to `auto` .
     */
    public fun dateFormat(dateFormat: String) {
        cdkBuilder.dateFormat(dateFormat)
    }

    /**
     * @param emptyAsNull A value that specifies whether AWS DMS should migrate empty CHAR and
     *   VARCHAR fields as NULL. A value of `true` sets empty CHAR and VARCHAR fields to null. The
     *   default is `false` .
     */
    public fun emptyAsNull(emptyAsNull: Boolean) {
        cdkBuilder.emptyAsNull(emptyAsNull)
    }

    /**
     * @param emptyAsNull A value that specifies whether AWS DMS should migrate empty CHAR and
     *   VARCHAR fields as NULL. A value of `true` sets empty CHAR and VARCHAR fields to null. The
     *   default is `false` .
     */
    public fun emptyAsNull(emptyAsNull: IResolvable) {
        cdkBuilder.emptyAsNull(emptyAsNull)
    }

    /**
     * @param encryptionMode The type of server-side encryption that you want to use for your data.
     *   This encryption type is part of the endpoint settings or the extra connections attributes
     *   for Amazon S3. You can choose either `SSE_S3` (the default) or `SSE_KMS` .
     *
     * For the `ModifyEndpoint` operation, you can change the existing value of the `EncryptionMode`
     * parameter from `SSE_KMS` to `SSE_S3` . But you can’t change the existing value from `SSE_S3`
     * to `SSE_KMS` .
     *
     * To use `SSE_S3` , create an AWS Identity and Access Management (IAM) role with a policy that
     * allows `"arn:aws:s3:::*"` to use the following actions: `"s3:PutObject", "s3:ListBucket"`
     */
    public fun encryptionMode(encryptionMode: String) {
        cdkBuilder.encryptionMode(encryptionMode)
    }

    /**
     * @param explicitIds This setting is only valid for a full-load migration task. Set
     *   `ExplicitIds` to `true` to have tables with `IDENTITY` columns override their
     *   auto-generated values with explicit values loaded from the source data files used to
     *   populate the tables. The default is `false` .
     */
    public fun explicitIds(explicitIds: Boolean) {
        cdkBuilder.explicitIds(explicitIds)
    }

    /**
     * @param explicitIds This setting is only valid for a full-load migration task. Set
     *   `ExplicitIds` to `true` to have tables with `IDENTITY` columns override their
     *   auto-generated values with explicit values loaded from the source data files used to
     *   populate the tables. The default is `false` .
     */
    public fun explicitIds(explicitIds: IResolvable) {
        cdkBuilder.explicitIds(explicitIds)
    }

    /**
     * @param fileTransferUploadStreams The number of threads used to upload a single file. This
     *   parameter accepts a value from 1 through 64. It defaults to 10.
     *
     * The number of parallel streams used to upload a single .csv file to an S3 bucket using S3
     * Multipart Upload. For more information, see
     * [Multipart upload overview](https://docs.aws.amazon.com/AmazonS3/latest/dev/mpuoverview.html)
     * .
     *
     * `FileTransferUploadStreams` accepts a value from 1 through 64. It defaults to 10.
     */
    public fun fileTransferUploadStreams(fileTransferUploadStreams: Number) {
        cdkBuilder.fileTransferUploadStreams(fileTransferUploadStreams)
    }

    /**
     * @param loadTimeout The amount of time to wait (in milliseconds) before timing out of
     *   operations performed by AWS DMS on a Redshift cluster, such as Redshift COPY, INSERT,
     *   DELETE, and UPDATE.
     */
    public fun loadTimeout(loadTimeout: Number) {
        cdkBuilder.loadTimeout(loadTimeout)
    }

    /**
     * @param mapBooleanAsBoolean When true, lets Redshift migrate the boolean type as boolean. By
     *   default, Redshift migrates booleans as `varchar(1)` . You must set this setting on both the
     *   source and target endpoints for it to take effect.
     */
    public fun mapBooleanAsBoolean(mapBooleanAsBoolean: Boolean) {
        cdkBuilder.mapBooleanAsBoolean(mapBooleanAsBoolean)
    }

    /**
     * @param mapBooleanAsBoolean When true, lets Redshift migrate the boolean type as boolean. By
     *   default, Redshift migrates booleans as `varchar(1)` . You must set this setting on both the
     *   source and target endpoints for it to take effect.
     */
    public fun mapBooleanAsBoolean(mapBooleanAsBoolean: IResolvable) {
        cdkBuilder.mapBooleanAsBoolean(mapBooleanAsBoolean)
    }

    /**
     * @param maxFileSize The maximum size (in KB) of any .csv file used to load data on an S3
     *   bucket and transfer data to Amazon Redshift. It defaults to 1048576KB (1 GB).
     */
    public fun maxFileSize(maxFileSize: Number) {
        cdkBuilder.maxFileSize(maxFileSize)
    }

    /**
     * @param removeQuotes A value that specifies to remove surrounding quotation marks from strings
     *   in the incoming data. All characters within the quotation marks, including delimiters, are
     *   retained. Choose `true` to remove quotation marks. The default is `false` .
     */
    public fun removeQuotes(removeQuotes: Boolean) {
        cdkBuilder.removeQuotes(removeQuotes)
    }

    /**
     * @param removeQuotes A value that specifies to remove surrounding quotation marks from strings
     *   in the incoming data. All characters within the quotation marks, including delimiters, are
     *   retained. Choose `true` to remove quotation marks. The default is `false` .
     */
    public fun removeQuotes(removeQuotes: IResolvable) {
        cdkBuilder.removeQuotes(removeQuotes)
    }

    /**
     * @param replaceChars A value that specifies to replaces the invalid characters specified in
     *   `ReplaceInvalidChars` , substituting the specified characters instead. The default is `"?"`
     *   .
     */
    public fun replaceChars(replaceChars: String) {
        cdkBuilder.replaceChars(replaceChars)
    }

    /**
     * @param replaceInvalidChars A list of characters that you want to replace. Use with
     *   `ReplaceChars` .
     */
    public fun replaceInvalidChars(replaceInvalidChars: String) {
        cdkBuilder.replaceInvalidChars(replaceInvalidChars)
    }

    /**
     * @param secretsManagerAccessRoleArn The full Amazon Resource Name (ARN) of the IAM role that
     *   specifies AWS DMS as the trusted entity and grants the required permissions to access the
     *   value in `SecretsManagerSecret` . The role must allow the `iam:PassRole` action.
     *   `SecretsManagerSecret` has the value of the AWS Secrets Manager secret that allows access
     *   to the Amazon Redshift endpoint.
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
     *   `SecretsManagerSecret` that contains the Amazon Redshift endpoint connection details.
     */
    public fun secretsManagerSecretId(secretsManagerSecretId: String) {
        cdkBuilder.secretsManagerSecretId(secretsManagerSecretId)
    }

    /**
     * @param serverSideEncryptionKmsKeyId The AWS KMS key ID. If you are using `SSE_KMS` for the
     *   `EncryptionMode` , provide this key ID. The key that you use needs an attached policy that
     *   enables IAM user permissions and allows use of the key.
     */
    public fun serverSideEncryptionKmsKeyId(serverSideEncryptionKmsKeyId: String) {
        cdkBuilder.serverSideEncryptionKmsKeyId(serverSideEncryptionKmsKeyId)
    }

    /**
     * @param serviceAccessRoleArn The Amazon Resource Name (ARN) of the IAM role that has access to
     *   the Amazon Redshift service. The role must allow the `iam:PassRole` action.
     */
    public fun serviceAccessRoleArn(serviceAccessRoleArn: String) {
        cdkBuilder.serviceAccessRoleArn(serviceAccessRoleArn)
    }

    /**
     * @param timeFormat The time format that you want to use. Valid values are `auto`
     *   (case-sensitive), `'timeformat_string'` , `'epochsecs'` , or `'epochmillisecs'` . It
     *   defaults to 10. Using `auto` recognizes most strings, even some that aren't supported when
     *   you use a time format string.
     *
     * If your date and time values use formats different from each other, set this parameter to
     * `auto` .
     */
    public fun timeFormat(timeFormat: String) {
        cdkBuilder.timeFormat(timeFormat)
    }

    /**
     * @param trimBlanks A value that specifies to remove the trailing white space characters from a
     *   VARCHAR string. This parameter applies only to columns with a VARCHAR data type. Choose
     *   `true` to remove unneeded white space. The default is `false` .
     */
    public fun trimBlanks(trimBlanks: Boolean) {
        cdkBuilder.trimBlanks(trimBlanks)
    }

    /**
     * @param trimBlanks A value that specifies to remove the trailing white space characters from a
     *   VARCHAR string. This parameter applies only to columns with a VARCHAR data type. Choose
     *   `true` to remove unneeded white space. The default is `false` .
     */
    public fun trimBlanks(trimBlanks: IResolvable) {
        cdkBuilder.trimBlanks(trimBlanks)
    }

    /**
     * @param truncateColumns A value that specifies to truncate data in columns to the appropriate
     *   number of characters, so that the data fits in the column. This parameter applies only to
     *   columns with a VARCHAR or CHAR data type, and rows with a size of 4 MB or less. Choose
     *   `true` to truncate data. The default is `false` .
     */
    public fun truncateColumns(truncateColumns: Boolean) {
        cdkBuilder.truncateColumns(truncateColumns)
    }

    /**
     * @param truncateColumns A value that specifies to truncate data in columns to the appropriate
     *   number of characters, so that the data fits in the column. This parameter applies only to
     *   columns with a VARCHAR or CHAR data type, and rows with a size of 4 MB or less. Choose
     *   `true` to truncate data. The default is `false` .
     */
    public fun truncateColumns(truncateColumns: IResolvable) {
        cdkBuilder.truncateColumns(truncateColumns)
    }

    /**
     * @param writeBufferSize The size (in KB) of the in-memory file write buffer used when
     *   generating .csv files on the local disk at the DMS replication instance. The default value
     *   is 1000 (buffer size is 1000KB).
     */
    public fun writeBufferSize(writeBufferSize: Number) {
        cdkBuilder.writeBufferSize(writeBufferSize)
    }

    public fun build(): CfnEndpoint.RedshiftSettingsProperty = cdkBuilder.build()
}
