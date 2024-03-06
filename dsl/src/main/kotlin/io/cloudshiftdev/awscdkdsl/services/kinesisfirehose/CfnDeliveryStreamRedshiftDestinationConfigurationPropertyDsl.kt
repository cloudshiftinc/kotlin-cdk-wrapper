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

package io.cloudshiftdev.awscdkdsl.services.kinesisfirehose

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream

/**
 * The `RedshiftDestinationConfiguration` property type specifies an Amazon Redshift cluster to
 * which Amazon Kinesis Data Firehose (Kinesis Data Firehose) delivers data.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.kinesisfirehose.*;
 * RedshiftDestinationConfigurationProperty redshiftDestinationConfigurationProperty =
 * RedshiftDestinationConfigurationProperty.builder()
 * .clusterJdbcurl("clusterJdbcurl")
 * .copyCommand(CopyCommandProperty.builder()
 * .dataTableName("dataTableName")
 * // the properties below are optional
 * .copyOptions("copyOptions")
 * .dataTableColumns("dataTableColumns")
 * .build())
 * .password("password")
 * .roleArn("roleArn")
 * .s3Configuration(S3DestinationConfigurationProperty.builder()
 * .bucketArn("bucketArn")
 * .roleArn("roleArn")
 * // the properties below are optional
 * .bufferingHints(BufferingHintsProperty.builder()
 * .intervalInSeconds(123)
 * .sizeInMBs(123)
 * .build())
 * .cloudWatchLoggingOptions(CloudWatchLoggingOptionsProperty.builder()
 * .enabled(false)
 * .logGroupName("logGroupName")
 * .logStreamName("logStreamName")
 * .build())
 * .compressionFormat("compressionFormat")
 * .encryptionConfiguration(EncryptionConfigurationProperty.builder()
 * .kmsEncryptionConfig(KMSEncryptionConfigProperty.builder()
 * .awskmsKeyArn("awskmsKeyArn")
 * .build())
 * .noEncryptionConfig("noEncryptionConfig")
 * .build())
 * .errorOutputPrefix("errorOutputPrefix")
 * .prefix("prefix")
 * .build())
 * .username("username")
 * // the properties below are optional
 * .cloudWatchLoggingOptions(CloudWatchLoggingOptionsProperty.builder()
 * .enabled(false)
 * .logGroupName("logGroupName")
 * .logStreamName("logStreamName")
 * .build())
 * .processingConfiguration(ProcessingConfigurationProperty.builder()
 * .enabled(false)
 * .processors(List.of(ProcessorProperty.builder()
 * .type("type")
 * // the properties below are optional
 * .parameters(List.of(ProcessorParameterProperty.builder()
 * .parameterName("parameterName")
 * .parameterValue("parameterValue")
 * .build()))
 * .build()))
 * .build())
 * .retryOptions(RedshiftRetryOptionsProperty.builder()
 * .durationInSeconds(123)
 * .build())
 * .s3BackupConfiguration(S3DestinationConfigurationProperty.builder()
 * .bucketArn("bucketArn")
 * .roleArn("roleArn")
 * // the properties below are optional
 * .bufferingHints(BufferingHintsProperty.builder()
 * .intervalInSeconds(123)
 * .sizeInMBs(123)
 * .build())
 * .cloudWatchLoggingOptions(CloudWatchLoggingOptionsProperty.builder()
 * .enabled(false)
 * .logGroupName("logGroupName")
 * .logStreamName("logStreamName")
 * .build())
 * .compressionFormat("compressionFormat")
 * .encryptionConfiguration(EncryptionConfigurationProperty.builder()
 * .kmsEncryptionConfig(KMSEncryptionConfigProperty.builder()
 * .awskmsKeyArn("awskmsKeyArn")
 * .build())
 * .noEncryptionConfig("noEncryptionConfig")
 * .build())
 * .errorOutputPrefix("errorOutputPrefix")
 * .prefix("prefix")
 * .build())
 * .s3BackupMode("s3BackupMode")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-redshiftdestinationconfiguration.html)
 */
@CdkDslMarker
public class CfnDeliveryStreamRedshiftDestinationConfigurationPropertyDsl {
    private val cdkBuilder: CfnDeliveryStream.RedshiftDestinationConfigurationProperty.Builder =
        CfnDeliveryStream.RedshiftDestinationConfigurationProperty.builder()

    /** @param cloudWatchLoggingOptions The CloudWatch logging options for your delivery stream. */
    public fun cloudWatchLoggingOptions(cloudWatchLoggingOptions: IResolvable) {
        cdkBuilder.cloudWatchLoggingOptions(cloudWatchLoggingOptions)
    }

    /** @param cloudWatchLoggingOptions The CloudWatch logging options for your delivery stream. */
    public fun cloudWatchLoggingOptions(
        cloudWatchLoggingOptions: CfnDeliveryStream.CloudWatchLoggingOptionsProperty
    ) {
        cdkBuilder.cloudWatchLoggingOptions(cloudWatchLoggingOptions)
    }

    /**
     * @param clusterJdbcurl The connection string that Kinesis Data Firehose uses to connect to the
     *   Amazon Redshift cluster.
     */
    public fun clusterJdbcurl(clusterJdbcurl: String) {
        cdkBuilder.clusterJdbcurl(clusterJdbcurl)
    }

    /**
     * @param copyCommand Configures the Amazon Redshift `COPY` command that Kinesis Data Firehose
     *   uses to load data into the cluster from the Amazon S3 bucket.
     */
    public fun copyCommand(copyCommand: IResolvable) {
        cdkBuilder.copyCommand(copyCommand)
    }

    /**
     * @param copyCommand Configures the Amazon Redshift `COPY` command that Kinesis Data Firehose
     *   uses to load data into the cluster from the Amazon S3 bucket.
     */
    public fun copyCommand(copyCommand: CfnDeliveryStream.CopyCommandProperty) {
        cdkBuilder.copyCommand(copyCommand)
    }

    /**
     * @param password The password for the Amazon Redshift user that you specified in the
     *   `Username` property.
     */
    public fun password(password: String) {
        cdkBuilder.password(password)
    }

    /**
     * @param processingConfiguration The data processing configuration for the Kinesis Data
     *   Firehose delivery stream.
     */
    public fun processingConfiguration(processingConfiguration: IResolvable) {
        cdkBuilder.processingConfiguration(processingConfiguration)
    }

    /**
     * @param processingConfiguration The data processing configuration for the Kinesis Data
     *   Firehose delivery stream.
     */
    public fun processingConfiguration(
        processingConfiguration: CfnDeliveryStream.ProcessingConfigurationProperty
    ) {
        cdkBuilder.processingConfiguration(processingConfiguration)
    }

    /**
     * @param retryOptions The retry behavior in case Firehose is unable to deliver documents to
     *   Amazon Redshift. Default value is 3600 (60 minutes).
     */
    public fun retryOptions(retryOptions: IResolvable) {
        cdkBuilder.retryOptions(retryOptions)
    }

    /**
     * @param retryOptions The retry behavior in case Firehose is unable to deliver documents to
     *   Amazon Redshift. Default value is 3600 (60 minutes).
     */
    public fun retryOptions(retryOptions: CfnDeliveryStream.RedshiftRetryOptionsProperty) {
        cdkBuilder.retryOptions(retryOptions)
    }

    /**
     * @param roleArn The ARN of the AWS Identity and Access Management (IAM) role that grants
     *   Kinesis Data Firehose access to your Amazon S3 bucket and AWS KMS (if you enable data
     *   encryption). For more information, see
     *   [Grant Kinesis Data Firehose Access to an Amazon Redshift Destination](https://docs.aws.amazon.com/firehose/latest/dev/controlling-access.html#using-iam-rs)
     *   in the *Amazon Kinesis Data Firehose Developer Guide* .
     */
    public fun roleArn(roleArn: String) {
        cdkBuilder.roleArn(roleArn)
    }

    /** @param s3BackupConfiguration The configuration for backup in Amazon S3. */
    public fun s3BackupConfiguration(s3BackupConfiguration: IResolvable) {
        cdkBuilder.s3BackupConfiguration(s3BackupConfiguration)
    }

    /** @param s3BackupConfiguration The configuration for backup in Amazon S3. */
    public fun s3BackupConfiguration(
        s3BackupConfiguration: CfnDeliveryStream.S3DestinationConfigurationProperty
    ) {
        cdkBuilder.s3BackupConfiguration(s3BackupConfiguration)
    }

    /**
     * @param s3BackupMode The Amazon S3 backup mode. After you create a delivery stream, you can
     *   update it to enable Amazon S3 backup if it is disabled. If backup is enabled, you can't
     *   update the delivery stream to disable it.
     */
    public fun s3BackupMode(s3BackupMode: String) {
        cdkBuilder.s3BackupMode(s3BackupMode)
    }

    /**
     * @param s3Configuration The S3 bucket where Kinesis Data Firehose first delivers data. After
     *   the data is in the bucket, Kinesis Data Firehose uses the `COPY` command to load the data
     *   into the Amazon Redshift cluster. For the Amazon S3 bucket's compression format, don't
     *   specify `SNAPPY` or `ZIP` because the Amazon Redshift `COPY` command doesn't support them.
     */
    public fun s3Configuration(s3Configuration: IResolvable) {
        cdkBuilder.s3Configuration(s3Configuration)
    }

    /**
     * @param s3Configuration The S3 bucket where Kinesis Data Firehose first delivers data. After
     *   the data is in the bucket, Kinesis Data Firehose uses the `COPY` command to load the data
     *   into the Amazon Redshift cluster. For the Amazon S3 bucket's compression format, don't
     *   specify `SNAPPY` or `ZIP` because the Amazon Redshift `COPY` command doesn't support them.
     */
    public fun s3Configuration(
        s3Configuration: CfnDeliveryStream.S3DestinationConfigurationProperty
    ) {
        cdkBuilder.s3Configuration(s3Configuration)
    }

    /**
     * @param username The Amazon Redshift user that has permission to access the Amazon Redshift
     *   cluster. This user must have `INSERT` privileges for copying data from the Amazon S3 bucket
     *   to the cluster.
     */
    public fun username(username: String) {
        cdkBuilder.username(username)
    }

    public fun build(): CfnDeliveryStream.RedshiftDestinationConfigurationProperty =
        cdkBuilder.build()
}
