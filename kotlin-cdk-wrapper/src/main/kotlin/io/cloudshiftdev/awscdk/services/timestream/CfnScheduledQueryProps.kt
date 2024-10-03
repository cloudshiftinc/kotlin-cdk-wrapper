@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.timestream

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

/**
 * Properties for defining a `CfnScheduledQuery`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.timestream.*;
 * CfnScheduledQueryProps cfnScheduledQueryProps = CfnScheduledQueryProps.builder()
 * .errorReportConfiguration(ErrorReportConfigurationProperty.builder()
 * .s3Configuration(S3ConfigurationProperty.builder()
 * .bucketName("bucketName")
 * // the properties below are optional
 * .encryptionOption("encryptionOption")
 * .objectKeyPrefix("objectKeyPrefix")
 * .build())
 * .build())
 * .notificationConfiguration(NotificationConfigurationProperty.builder()
 * .snsConfiguration(SnsConfigurationProperty.builder()
 * .topicArn("topicArn")
 * .build())
 * .build())
 * .queryString("queryString")
 * .scheduleConfiguration(ScheduleConfigurationProperty.builder()
 * .scheduleExpression("scheduleExpression")
 * .build())
 * .scheduledQueryExecutionRoleArn("scheduledQueryExecutionRoleArn")
 * // the properties below are optional
 * .clientToken("clientToken")
 * .kmsKeyId("kmsKeyId")
 * .scheduledQueryName("scheduledQueryName")
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .targetConfiguration(TargetConfigurationProperty.builder()
 * .timestreamConfiguration(TimestreamConfigurationProperty.builder()
 * .databaseName("databaseName")
 * .dimensionMappings(List.of(DimensionMappingProperty.builder()
 * .dimensionValueType("dimensionValueType")
 * .name("name")
 * .build()))
 * .tableName("tableName")
 * .timeColumn("timeColumn")
 * // the properties below are optional
 * .measureNameColumn("measureNameColumn")
 * .mixedMeasureMappings(List.of(MixedMeasureMappingProperty.builder()
 * .measureValueType("measureValueType")
 * // the properties below are optional
 * .measureName("measureName")
 * .multiMeasureAttributeMappings(List.of(MultiMeasureAttributeMappingProperty.builder()
 * .measureValueType("measureValueType")
 * .sourceColumn("sourceColumn")
 * // the properties below are optional
 * .targetMultiMeasureAttributeName("targetMultiMeasureAttributeName")
 * .build()))
 * .sourceColumn("sourceColumn")
 * .targetMeasureName("targetMeasureName")
 * .build()))
 * .multiMeasureMappings(MultiMeasureMappingsProperty.builder()
 * .multiMeasureAttributeMappings(List.of(MultiMeasureAttributeMappingProperty.builder()
 * .measureValueType("measureValueType")
 * .sourceColumn("sourceColumn")
 * // the properties below are optional
 * .targetMultiMeasureAttributeName("targetMultiMeasureAttributeName")
 * .build()))
 * // the properties below are optional
 * .targetMultiMeasureName("targetMultiMeasureName")
 * .build())
 * .build())
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-timestream-scheduledquery.html)
 */
public interface CfnScheduledQueryProps {
  /**
   * Using a ClientToken makes the call to CreateScheduledQuery idempotent, in other words, making
   * the same request repeatedly will produce the same result.
   *
   * Making multiple identical CreateScheduledQuery requests has the same effect as making a single
   * request.
   *
   * * If CreateScheduledQuery is called without a `ClientToken` , the Query SDK generates a
   * `ClientToken` on your behalf.
   * * After 8 hours, any request with the same `ClientToken` is treated as a new request.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-timestream-scheduledquery.html#cfn-timestream-scheduledquery-clienttoken)
   */
  public fun clientToken(): String? = unwrap(this).getClientToken()

  /**
   * Configuration for error reporting.
   *
   * Error reports will be generated when a problem is encountered when writing the query results.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-timestream-scheduledquery.html#cfn-timestream-scheduledquery-errorreportconfiguration)
   */
  public fun errorReportConfiguration(): Any

  /**
   * The Amazon KMS key used to encrypt the scheduled query resource, at-rest.
   *
   * If the Amazon KMS key is not specified, the scheduled query resource will be encrypted with a
   * Timestream owned Amazon KMS key. To specify a KMS key, use the key ID, key ARN, alias name, or
   * alias ARN. When using an alias name, prefix the name with *alias/ *
   *
   * If ErrorReportConfiguration uses `SSE_KMS` as encryption type, the same KmsKeyId is used to
   * encrypt the error report at rest.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-timestream-scheduledquery.html#cfn-timestream-scheduledquery-kmskeyid)
   */
  public fun kmsKeyId(): String? = unwrap(this).getKmsKeyId()

  /**
   * Notification configuration for the scheduled query.
   *
   * A notification is sent by Timestream when a query run finishes, when the state is updated or
   * when you delete it.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-timestream-scheduledquery.html#cfn-timestream-scheduledquery-notificationconfiguration)
   */
  public fun notificationConfiguration(): Any

  /**
   * The query string to run.
   *
   * Parameter names can be specified in the query string `&#64;` character followed by an
   * identifier. The named Parameter `&#64;scheduled_runtime` is reserved and can be used in the query
   * to get the time at which the query is scheduled to run.
   *
   * The timestamp calculated according to the ScheduleConfiguration parameter, will be the value of
   * `&#64;scheduled_runtime` paramater for each query run. For example, consider an instance of a
   * scheduled query executing on 2021-12-01 00:00:00. For this instance, the `&#64;scheduled_runtime`
   * parameter is initialized to the timestamp 2021-12-01 00:00:00 when invoking the query.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-timestream-scheduledquery.html#cfn-timestream-scheduledquery-querystring)
   */
  public fun queryString(): String

  /**
   * Schedule configuration.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-timestream-scheduledquery.html#cfn-timestream-scheduledquery-scheduleconfiguration)
   */
  public fun scheduleConfiguration(): Any

  /**
   * The ARN for the IAM role that Timestream will assume when running the scheduled query.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-timestream-scheduledquery.html#cfn-timestream-scheduledquery-scheduledqueryexecutionrolearn)
   */
  public fun scheduledQueryExecutionRoleArn(): String

  /**
   * A name for the query.
   *
   * Scheduled query names must be unique within each Region.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-timestream-scheduledquery.html#cfn-timestream-scheduledquery-scheduledqueryname)
   */
  public fun scheduledQueryName(): String? = unwrap(this).getScheduledQueryName()

  /**
   * A list of key-value pairs to label the scheduled query.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-timestream-scheduledquery.html#cfn-timestream-scheduledquery-tags)
   */
  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * Scheduled query target store configuration.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-timestream-scheduledquery.html#cfn-timestream-scheduledquery-targetconfiguration)
   */
  public fun targetConfiguration(): Any? = unwrap(this).getTargetConfiguration()

  /**
   * A builder for [CfnScheduledQueryProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param clientToken Using a ClientToken makes the call to CreateScheduledQuery idempotent, in
     * other words, making the same request repeatedly will produce the same result.
     * Making multiple identical CreateScheduledQuery requests has the same effect as making a
     * single request.
     *
     * * If CreateScheduledQuery is called without a `ClientToken` , the Query SDK generates a
     * `ClientToken` on your behalf.
     * * After 8 hours, any request with the same `ClientToken` is treated as a new request.
     */
    public fun clientToken(clientToken: String)

    /**
     * @param errorReportConfiguration Configuration for error reporting. 
     * Error reports will be generated when a problem is encountered when writing the query results.
     */
    public fun errorReportConfiguration(errorReportConfiguration: IResolvable)

    /**
     * @param errorReportConfiguration Configuration for error reporting. 
     * Error reports will be generated when a problem is encountered when writing the query results.
     */
    public
        fun errorReportConfiguration(errorReportConfiguration: CfnScheduledQuery.ErrorReportConfigurationProperty)

    /**
     * @param errorReportConfiguration Configuration for error reporting. 
     * Error reports will be generated when a problem is encountered when writing the query results.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("66613b4494fcb0944e056033083d7e6098621e6d5595b2c6807bd68774b83481")
    public
        fun errorReportConfiguration(errorReportConfiguration: CfnScheduledQuery.ErrorReportConfigurationProperty.Builder.() -> Unit)

    /**
     * @param kmsKeyId The Amazon KMS key used to encrypt the scheduled query resource, at-rest.
     * If the Amazon KMS key is not specified, the scheduled query resource will be encrypted with a
     * Timestream owned Amazon KMS key. To specify a KMS key, use the key ID, key ARN, alias name, or
     * alias ARN. When using an alias name, prefix the name with *alias/ *
     *
     * If ErrorReportConfiguration uses `SSE_KMS` as encryption type, the same KmsKeyId is used to
     * encrypt the error report at rest.
     */
    public fun kmsKeyId(kmsKeyId: String)

    /**
     * @param notificationConfiguration Notification configuration for the scheduled query. 
     * A notification is sent by Timestream when a query run finishes, when the state is updated or
     * when you delete it.
     */
    public fun notificationConfiguration(notificationConfiguration: IResolvable)

    /**
     * @param notificationConfiguration Notification configuration for the scheduled query. 
     * A notification is sent by Timestream when a query run finishes, when the state is updated or
     * when you delete it.
     */
    public
        fun notificationConfiguration(notificationConfiguration: CfnScheduledQuery.NotificationConfigurationProperty)

    /**
     * @param notificationConfiguration Notification configuration for the scheduled query. 
     * A notification is sent by Timestream when a query run finishes, when the state is updated or
     * when you delete it.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("32e9ddb76512f6f65e2b921bf96913d2ba2e86b2f9a575bd7f1c043ac7fc3104")
    public
        fun notificationConfiguration(notificationConfiguration: CfnScheduledQuery.NotificationConfigurationProperty.Builder.() -> Unit)

    /**
     * @param queryString The query string to run. 
     * Parameter names can be specified in the query string `&#64;` character followed by an
     * identifier. The named Parameter `&#64;scheduled_runtime` is reserved and can be used in the
     * query to get the time at which the query is scheduled to run.
     *
     * The timestamp calculated according to the ScheduleConfiguration parameter, will be the value
     * of `&#64;scheduled_runtime` paramater for each query run. For example, consider an instance of a
     * scheduled query executing on 2021-12-01 00:00:00. For this instance, the
     * `&#64;scheduled_runtime` parameter is initialized to the timestamp 2021-12-01 00:00:00 when
     * invoking the query.
     */
    public fun queryString(queryString: String)

    /**
     * @param scheduleConfiguration Schedule configuration. 
     */
    public fun scheduleConfiguration(scheduleConfiguration: IResolvable)

    /**
     * @param scheduleConfiguration Schedule configuration. 
     */
    public
        fun scheduleConfiguration(scheduleConfiguration: CfnScheduledQuery.ScheduleConfigurationProperty)

    /**
     * @param scheduleConfiguration Schedule configuration. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("98b9af623bbfed6921fddc7f8ba59d52063675b5ad9f37e8d3f8df7cea11d4ba")
    public
        fun scheduleConfiguration(scheduleConfiguration: CfnScheduledQuery.ScheduleConfigurationProperty.Builder.() -> Unit)

    /**
     * @param scheduledQueryExecutionRoleArn The ARN for the IAM role that Timestream will assume
     * when running the scheduled query. 
     */
    public fun scheduledQueryExecutionRoleArn(scheduledQueryExecutionRoleArn: String)

    /**
     * @param scheduledQueryName A name for the query.
     * Scheduled query names must be unique within each Region.
     */
    public fun scheduledQueryName(scheduledQueryName: String)

    /**
     * @param tags A list of key-value pairs to label the scheduled query.
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * @param tags A list of key-value pairs to label the scheduled query.
     */
    public fun tags(vararg tags: CfnTag)

    /**
     * @param targetConfiguration Scheduled query target store configuration.
     */
    public fun targetConfiguration(targetConfiguration: IResolvable)

    /**
     * @param targetConfiguration Scheduled query target store configuration.
     */
    public
        fun targetConfiguration(targetConfiguration: CfnScheduledQuery.TargetConfigurationProperty)

    /**
     * @param targetConfiguration Scheduled query target store configuration.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("a333ec5f573b7b405ac9b85af819f1fdfbe303fe725d10bf4cb221fa20644ff1")
    public
        fun targetConfiguration(targetConfiguration: CfnScheduledQuery.TargetConfigurationProperty.Builder.() -> Unit)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.timestream.CfnScheduledQueryProps.Builder =
        software.amazon.awscdk.services.timestream.CfnScheduledQueryProps.builder()

    /**
     * @param clientToken Using a ClientToken makes the call to CreateScheduledQuery idempotent, in
     * other words, making the same request repeatedly will produce the same result.
     * Making multiple identical CreateScheduledQuery requests has the same effect as making a
     * single request.
     *
     * * If CreateScheduledQuery is called without a `ClientToken` , the Query SDK generates a
     * `ClientToken` on your behalf.
     * * After 8 hours, any request with the same `ClientToken` is treated as a new request.
     */
    override fun clientToken(clientToken: String) {
      cdkBuilder.clientToken(clientToken)
    }

    /**
     * @param errorReportConfiguration Configuration for error reporting. 
     * Error reports will be generated when a problem is encountered when writing the query results.
     */
    override fun errorReportConfiguration(errorReportConfiguration: IResolvable) {
      cdkBuilder.errorReportConfiguration(errorReportConfiguration.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param errorReportConfiguration Configuration for error reporting. 
     * Error reports will be generated when a problem is encountered when writing the query results.
     */
    override
        fun errorReportConfiguration(errorReportConfiguration: CfnScheduledQuery.ErrorReportConfigurationProperty) {
      cdkBuilder.errorReportConfiguration(errorReportConfiguration.let(CfnScheduledQuery.ErrorReportConfigurationProperty.Companion::unwrap))
    }

    /**
     * @param errorReportConfiguration Configuration for error reporting. 
     * Error reports will be generated when a problem is encountered when writing the query results.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("66613b4494fcb0944e056033083d7e6098621e6d5595b2c6807bd68774b83481")
    override
        fun errorReportConfiguration(errorReportConfiguration: CfnScheduledQuery.ErrorReportConfigurationProperty.Builder.() -> Unit):
        Unit =
        errorReportConfiguration(CfnScheduledQuery.ErrorReportConfigurationProperty(errorReportConfiguration))

    /**
     * @param kmsKeyId The Amazon KMS key used to encrypt the scheduled query resource, at-rest.
     * If the Amazon KMS key is not specified, the scheduled query resource will be encrypted with a
     * Timestream owned Amazon KMS key. To specify a KMS key, use the key ID, key ARN, alias name, or
     * alias ARN. When using an alias name, prefix the name with *alias/ *
     *
     * If ErrorReportConfiguration uses `SSE_KMS` as encryption type, the same KmsKeyId is used to
     * encrypt the error report at rest.
     */
    override fun kmsKeyId(kmsKeyId: String) {
      cdkBuilder.kmsKeyId(kmsKeyId)
    }

    /**
     * @param notificationConfiguration Notification configuration for the scheduled query. 
     * A notification is sent by Timestream when a query run finishes, when the state is updated or
     * when you delete it.
     */
    override fun notificationConfiguration(notificationConfiguration: IResolvable) {
      cdkBuilder.notificationConfiguration(notificationConfiguration.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param notificationConfiguration Notification configuration for the scheduled query. 
     * A notification is sent by Timestream when a query run finishes, when the state is updated or
     * when you delete it.
     */
    override
        fun notificationConfiguration(notificationConfiguration: CfnScheduledQuery.NotificationConfigurationProperty) {
      cdkBuilder.notificationConfiguration(notificationConfiguration.let(CfnScheduledQuery.NotificationConfigurationProperty.Companion::unwrap))
    }

    /**
     * @param notificationConfiguration Notification configuration for the scheduled query. 
     * A notification is sent by Timestream when a query run finishes, when the state is updated or
     * when you delete it.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("32e9ddb76512f6f65e2b921bf96913d2ba2e86b2f9a575bd7f1c043ac7fc3104")
    override
        fun notificationConfiguration(notificationConfiguration: CfnScheduledQuery.NotificationConfigurationProperty.Builder.() -> Unit):
        Unit =
        notificationConfiguration(CfnScheduledQuery.NotificationConfigurationProperty(notificationConfiguration))

    /**
     * @param queryString The query string to run. 
     * Parameter names can be specified in the query string `&#64;` character followed by an
     * identifier. The named Parameter `&#64;scheduled_runtime` is reserved and can be used in the
     * query to get the time at which the query is scheduled to run.
     *
     * The timestamp calculated according to the ScheduleConfiguration parameter, will be the value
     * of `&#64;scheduled_runtime` paramater for each query run. For example, consider an instance of a
     * scheduled query executing on 2021-12-01 00:00:00. For this instance, the
     * `&#64;scheduled_runtime` parameter is initialized to the timestamp 2021-12-01 00:00:00 when
     * invoking the query.
     */
    override fun queryString(queryString: String) {
      cdkBuilder.queryString(queryString)
    }

    /**
     * @param scheduleConfiguration Schedule configuration. 
     */
    override fun scheduleConfiguration(scheduleConfiguration: IResolvable) {
      cdkBuilder.scheduleConfiguration(scheduleConfiguration.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param scheduleConfiguration Schedule configuration. 
     */
    override
        fun scheduleConfiguration(scheduleConfiguration: CfnScheduledQuery.ScheduleConfigurationProperty) {
      cdkBuilder.scheduleConfiguration(scheduleConfiguration.let(CfnScheduledQuery.ScheduleConfigurationProperty.Companion::unwrap))
    }

    /**
     * @param scheduleConfiguration Schedule configuration. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("98b9af623bbfed6921fddc7f8ba59d52063675b5ad9f37e8d3f8df7cea11d4ba")
    override
        fun scheduleConfiguration(scheduleConfiguration: CfnScheduledQuery.ScheduleConfigurationProperty.Builder.() -> Unit):
        Unit =
        scheduleConfiguration(CfnScheduledQuery.ScheduleConfigurationProperty(scheduleConfiguration))

    /**
     * @param scheduledQueryExecutionRoleArn The ARN for the IAM role that Timestream will assume
     * when running the scheduled query. 
     */
    override fun scheduledQueryExecutionRoleArn(scheduledQueryExecutionRoleArn: String) {
      cdkBuilder.scheduledQueryExecutionRoleArn(scheduledQueryExecutionRoleArn)
    }

    /**
     * @param scheduledQueryName A name for the query.
     * Scheduled query names must be unique within each Region.
     */
    override fun scheduledQueryName(scheduledQueryName: String) {
      cdkBuilder.scheduledQueryName(scheduledQueryName)
    }

    /**
     * @param tags A list of key-value pairs to label the scheduled query.
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag.Companion::unwrap))
    }

    /**
     * @param tags A list of key-value pairs to label the scheduled query.
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    /**
     * @param targetConfiguration Scheduled query target store configuration.
     */
    override fun targetConfiguration(targetConfiguration: IResolvable) {
      cdkBuilder.targetConfiguration(targetConfiguration.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param targetConfiguration Scheduled query target store configuration.
     */
    override
        fun targetConfiguration(targetConfiguration: CfnScheduledQuery.TargetConfigurationProperty) {
      cdkBuilder.targetConfiguration(targetConfiguration.let(CfnScheduledQuery.TargetConfigurationProperty.Companion::unwrap))
    }

    /**
     * @param targetConfiguration Scheduled query target store configuration.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("a333ec5f573b7b405ac9b85af819f1fdfbe303fe725d10bf4cb221fa20644ff1")
    override
        fun targetConfiguration(targetConfiguration: CfnScheduledQuery.TargetConfigurationProperty.Builder.() -> Unit):
        Unit =
        targetConfiguration(CfnScheduledQuery.TargetConfigurationProperty(targetConfiguration))

    public fun build(): software.amazon.awscdk.services.timestream.CfnScheduledQueryProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.timestream.CfnScheduledQueryProps,
  ) : CdkObject(cdkObject),
      CfnScheduledQueryProps {
    /**
     * Using a ClientToken makes the call to CreateScheduledQuery idempotent, in other words, making
     * the same request repeatedly will produce the same result.
     *
     * Making multiple identical CreateScheduledQuery requests has the same effect as making a
     * single request.
     *
     * * If CreateScheduledQuery is called without a `ClientToken` , the Query SDK generates a
     * `ClientToken` on your behalf.
     * * After 8 hours, any request with the same `ClientToken` is treated as a new request.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-timestream-scheduledquery.html#cfn-timestream-scheduledquery-clienttoken)
     */
    override fun clientToken(): String? = unwrap(this).getClientToken()

    /**
     * Configuration for error reporting.
     *
     * Error reports will be generated when a problem is encountered when writing the query results.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-timestream-scheduledquery.html#cfn-timestream-scheduledquery-errorreportconfiguration)
     */
    override fun errorReportConfiguration(): Any = unwrap(this).getErrorReportConfiguration()

    /**
     * The Amazon KMS key used to encrypt the scheduled query resource, at-rest.
     *
     * If the Amazon KMS key is not specified, the scheduled query resource will be encrypted with a
     * Timestream owned Amazon KMS key. To specify a KMS key, use the key ID, key ARN, alias name, or
     * alias ARN. When using an alias name, prefix the name with *alias/ *
     *
     * If ErrorReportConfiguration uses `SSE_KMS` as encryption type, the same KmsKeyId is used to
     * encrypt the error report at rest.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-timestream-scheduledquery.html#cfn-timestream-scheduledquery-kmskeyid)
     */
    override fun kmsKeyId(): String? = unwrap(this).getKmsKeyId()

    /**
     * Notification configuration for the scheduled query.
     *
     * A notification is sent by Timestream when a query run finishes, when the state is updated or
     * when you delete it.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-timestream-scheduledquery.html#cfn-timestream-scheduledquery-notificationconfiguration)
     */
    override fun notificationConfiguration(): Any = unwrap(this).getNotificationConfiguration()

    /**
     * The query string to run.
     *
     * Parameter names can be specified in the query string `&#64;` character followed by an
     * identifier. The named Parameter `&#64;scheduled_runtime` is reserved and can be used in the
     * query to get the time at which the query is scheduled to run.
     *
     * The timestamp calculated according to the ScheduleConfiguration parameter, will be the value
     * of `&#64;scheduled_runtime` paramater for each query run. For example, consider an instance of a
     * scheduled query executing on 2021-12-01 00:00:00. For this instance, the
     * `&#64;scheduled_runtime` parameter is initialized to the timestamp 2021-12-01 00:00:00 when
     * invoking the query.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-timestream-scheduledquery.html#cfn-timestream-scheduledquery-querystring)
     */
    override fun queryString(): String = unwrap(this).getQueryString()

    /**
     * Schedule configuration.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-timestream-scheduledquery.html#cfn-timestream-scheduledquery-scheduleconfiguration)
     */
    override fun scheduleConfiguration(): Any = unwrap(this).getScheduleConfiguration()

    /**
     * The ARN for the IAM role that Timestream will assume when running the scheduled query.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-timestream-scheduledquery.html#cfn-timestream-scheduledquery-scheduledqueryexecutionrolearn)
     */
    override fun scheduledQueryExecutionRoleArn(): String =
        unwrap(this).getScheduledQueryExecutionRoleArn()

    /**
     * A name for the query.
     *
     * Scheduled query names must be unique within each Region.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-timestream-scheduledquery.html#cfn-timestream-scheduledquery-scheduledqueryname)
     */
    override fun scheduledQueryName(): String? = unwrap(this).getScheduledQueryName()

    /**
     * A list of key-value pairs to label the scheduled query.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-timestream-scheduledquery.html#cfn-timestream-scheduledquery-tags)
     */
    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

    /**
     * Scheduled query target store configuration.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-timestream-scheduledquery.html#cfn-timestream-scheduledquery-targetconfiguration)
     */
    override fun targetConfiguration(): Any? = unwrap(this).getTargetConfiguration()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnScheduledQueryProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.timestream.CfnScheduledQueryProps):
        CfnScheduledQueryProps = CdkObjectWrappers.wrap(cdkObject) as? CfnScheduledQueryProps ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnScheduledQueryProps):
        software.amazon.awscdk.services.timestream.CfnScheduledQueryProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.timestream.CfnScheduledQueryProps
  }
}
