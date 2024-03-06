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
 * Configure Snowflake destination.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.kinesisfirehose.*;
 * SnowflakeDestinationConfigurationProperty snowflakeDestinationConfigurationProperty =
 * SnowflakeDestinationConfigurationProperty.builder()
 * .accountUrl("accountUrl")
 * .database("database")
 * .privateKey("privateKey")
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
 * .schema("schema")
 * .table("table")
 * .user("user")
 * // the properties below are optional
 * .cloudWatchLoggingOptions(CloudWatchLoggingOptionsProperty.builder()
 * .enabled(false)
 * .logGroupName("logGroupName")
 * .logStreamName("logStreamName")
 * .build())
 * .contentColumnName("contentColumnName")
 * .dataLoadingOption("dataLoadingOption")
 * .keyPassphrase("keyPassphrase")
 * .metaDataColumnName("metaDataColumnName")
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
 * .retryOptions(SnowflakeRetryOptionsProperty.builder()
 * .durationInSeconds(123)
 * .build())
 * .s3BackupMode("s3BackupMode")
 * .snowflakeRoleConfiguration(SnowflakeRoleConfigurationProperty.builder()
 * .enabled(false)
 * .snowflakeRole("snowflakeRole")
 * .build())
 * .snowflakeVpcConfiguration(SnowflakeVpcConfigurationProperty.builder()
 * .privateLinkVpceId("privateLinkVpceId")
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-snowflakedestinationconfiguration.html)
 */
@CdkDslMarker
public class CfnDeliveryStreamSnowflakeDestinationConfigurationPropertyDsl {
    private val cdkBuilder: CfnDeliveryStream.SnowflakeDestinationConfigurationProperty.Builder =
        CfnDeliveryStream.SnowflakeDestinationConfigurationProperty.builder()

    /**
     * @param accountUrl URL for accessing your Snowflake account. This URL must include your
     *   [account identifier](https://docs.aws.amazon.com/https://docs.snowflake.com/en/user-guide/admin-account-identifier)
     *   . Note that the protocol (https://) and port number are optional.
     */
    public fun accountUrl(accountUrl: String) {
        cdkBuilder.accountUrl(accountUrl)
    }

    /** @param cloudWatchLoggingOptions the value to be set. */
    public fun cloudWatchLoggingOptions(cloudWatchLoggingOptions: IResolvable) {
        cdkBuilder.cloudWatchLoggingOptions(cloudWatchLoggingOptions)
    }

    /** @param cloudWatchLoggingOptions the value to be set. */
    public fun cloudWatchLoggingOptions(
        cloudWatchLoggingOptions: CfnDeliveryStream.CloudWatchLoggingOptionsProperty
    ) {
        cdkBuilder.cloudWatchLoggingOptions(cloudWatchLoggingOptions)
    }

    /** @param contentColumnName The name of the record content column. */
    public fun contentColumnName(contentColumnName: String) {
        cdkBuilder.contentColumnName(contentColumnName)
    }

    /**
     * @param dataLoadingOption Choose to load JSON keys mapped to table column names or choose to
     *   split the JSON payload where content is mapped to a record content column and source
     *   metadata is mapped to a record metadata column.
     */
    public fun dataLoadingOption(dataLoadingOption: String) {
        cdkBuilder.dataLoadingOption(dataLoadingOption)
    }

    /** @param database All data in Snowflake is maintained in databases. */
    public fun database(database: String) {
        cdkBuilder.database(database)
    }

    /**
     * @param keyPassphrase Passphrase to decrypt the private key when the key is encrypted. For
     *   information, see
     *   [Using Key Pair Authentication &amp; Key Rotation](https://docs.aws.amazon.com/https://docs.snowflake.com/en/user-guide/data-load-snowpipe-streaming-configuration#using-key-pair-authentication-key-rotation)
     *   .
     */
    public fun keyPassphrase(keyPassphrase: String) {
        cdkBuilder.keyPassphrase(keyPassphrase)
    }

    /** @param metaDataColumnName The name of the record metadata column. */
    public fun metaDataColumnName(metaDataColumnName: String) {
        cdkBuilder.metaDataColumnName(metaDataColumnName)
    }

    /**
     * @param privateKey The private key used to encrypt your Snowflake client. For information, see
     *   [Using Key Pair Authentication &amp; Key Rotation](https://docs.aws.amazon.com/https://docs.snowflake.com/en/user-guide/data-load-snowpipe-streaming-configuration#using-key-pair-authentication-key-rotation)
     *   .
     */
    public fun privateKey(privateKey: String) {
        cdkBuilder.privateKey(privateKey)
    }

    /** @param processingConfiguration the value to be set. */
    public fun processingConfiguration(processingConfiguration: IResolvable) {
        cdkBuilder.processingConfiguration(processingConfiguration)
    }

    /** @param processingConfiguration the value to be set. */
    public fun processingConfiguration(
        processingConfiguration: CfnDeliveryStream.ProcessingConfigurationProperty
    ) {
        cdkBuilder.processingConfiguration(processingConfiguration)
    }

    /**
     * @param retryOptions The time period where Firehose will retry sending data to the chosen HTTP
     *   endpoint.
     */
    public fun retryOptions(retryOptions: IResolvable) {
        cdkBuilder.retryOptions(retryOptions)
    }

    /**
     * @param retryOptions The time period where Firehose will retry sending data to the chosen HTTP
     *   endpoint.
     */
    public fun retryOptions(retryOptions: CfnDeliveryStream.SnowflakeRetryOptionsProperty) {
        cdkBuilder.retryOptions(retryOptions)
    }

    /** @param roleArn The Amazon Resource Name (ARN) of the Snowflake role. */
    public fun roleArn(roleArn: String) {
        cdkBuilder.roleArn(roleArn)
    }

    /** @param s3BackupMode Choose an S3 backup mode. */
    public fun s3BackupMode(s3BackupMode: String) {
        cdkBuilder.s3BackupMode(s3BackupMode)
    }

    /** @param s3Configuration the value to be set. */
    public fun s3Configuration(s3Configuration: IResolvable) {
        cdkBuilder.s3Configuration(s3Configuration)
    }

    /** @param s3Configuration the value to be set. */
    public fun s3Configuration(
        s3Configuration: CfnDeliveryStream.S3DestinationConfigurationProperty
    ) {
        cdkBuilder.s3Configuration(s3Configuration)
    }

    /**
     * @param schema Each database consists of one or more schemas, which are logical groupings of
     *   database objects, such as tables and views.
     */
    public fun schema(schema: String) {
        cdkBuilder.schema(schema)
    }

    /**
     * @param snowflakeRoleConfiguration Optionally configure a Snowflake role. Otherwise the
     *   default user role will be used.
     */
    public fun snowflakeRoleConfiguration(snowflakeRoleConfiguration: IResolvable) {
        cdkBuilder.snowflakeRoleConfiguration(snowflakeRoleConfiguration)
    }

    /**
     * @param snowflakeRoleConfiguration Optionally configure a Snowflake role. Otherwise the
     *   default user role will be used.
     */
    public fun snowflakeRoleConfiguration(
        snowflakeRoleConfiguration: CfnDeliveryStream.SnowflakeRoleConfigurationProperty
    ) {
        cdkBuilder.snowflakeRoleConfiguration(snowflakeRoleConfiguration)
    }

    /**
     * @param snowflakeVpcConfiguration The VPCE ID for Firehose to privately connect with
     *   Snowflake. The ID format is com.amazonaws.vpce.[region].vpce-svc-&lt;[id]&gt;. For more
     *   information, see
     *   [Amazon PrivateLink &amp; Snowflake](https://docs.aws.amazon.com/https://docs.snowflake.com/en/user-guide/admin-security-privatelink)
     */
    public fun snowflakeVpcConfiguration(snowflakeVpcConfiguration: IResolvable) {
        cdkBuilder.snowflakeVpcConfiguration(snowflakeVpcConfiguration)
    }

    /**
     * @param snowflakeVpcConfiguration The VPCE ID for Firehose to privately connect with
     *   Snowflake. The ID format is com.amazonaws.vpce.[region].vpce-svc-&lt;[id]&gt;. For more
     *   information, see
     *   [Amazon PrivateLink &amp; Snowflake](https://docs.aws.amazon.com/https://docs.snowflake.com/en/user-guide/admin-security-privatelink)
     */
    public fun snowflakeVpcConfiguration(
        snowflakeVpcConfiguration: CfnDeliveryStream.SnowflakeVpcConfigurationProperty
    ) {
        cdkBuilder.snowflakeVpcConfiguration(snowflakeVpcConfiguration)
    }

    /**
     * @param table All data in Snowflake is stored in database tables, logically structured as
     *   collections of columns and rows.
     */
    public fun table(table: String) {
        cdkBuilder.table(table)
    }

    /** @param user User login name for the Snowflake account. */
    public fun user(user: String) {
        cdkBuilder.user(user)
    }

    public fun build(): CfnDeliveryStream.SnowflakeDestinationConfigurationProperty =
        cdkBuilder.build()
}
