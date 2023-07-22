@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.timestream

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.dsl.CfnTagDsl
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.timestream.CfnScheduledQuery
import software.constructs.Construct

/**
 * Create a scheduled query that will be run on your behalf at the configured schedule.
 *
 * Timestream assumes the execution role provided as part of the `ScheduledQueryExecutionRoleArn`
 * parameter to run the query. You can use the `NotificationConfiguration` parameter to configure
 * notification for your scheduled query operations.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.timestream.*;
 * CfnScheduledQuery cfnScheduledQuery = CfnScheduledQuery.Builder.create(this,
 * "MyCfnScheduledQuery")
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
@CdkDslMarker
public class CfnScheduledQueryDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: CfnScheduledQuery.Builder = CfnScheduledQuery.Builder.create(scope, id)

  private val _tags: MutableList<CfnTag> = mutableListOf()

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
   * @param clientToken Using a ClientToken makes the call to CreateScheduledQuery idempotent, in
   * other words, making the same request repeatedly will produce the same result. 
   */
  public fun clientToken(clientToken: String) {
    cdkBuilder.clientToken(clientToken)
  }

  /**
   * Configuration for error reporting.
   *
   * Error reports will be generated when a problem is encountered when writing the query results.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-timestream-scheduledquery.html#cfn-timestream-scheduledquery-errorreportconfiguration)
   * @param errorReportConfiguration Configuration for error reporting. 
   */
  public fun errorReportConfiguration(errorReportConfiguration: IResolvable) {
    cdkBuilder.errorReportConfiguration(errorReportConfiguration)
  }

  /**
   * Configuration for error reporting.
   *
   * Error reports will be generated when a problem is encountered when writing the query results.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-timestream-scheduledquery.html#cfn-timestream-scheduledquery-errorreportconfiguration)
   * @param errorReportConfiguration Configuration for error reporting. 
   */
  public
      fun errorReportConfiguration(errorReportConfiguration: CfnScheduledQuery.ErrorReportConfigurationProperty) {
    cdkBuilder.errorReportConfiguration(errorReportConfiguration)
  }

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
   * @param kmsKeyId The Amazon KMS key used to encrypt the scheduled query resource, at-rest. 
   */
  public fun kmsKeyId(kmsKeyId: String) {
    cdkBuilder.kmsKeyId(kmsKeyId)
  }

  /**
   * Notification configuration for the scheduled query.
   *
   * A notification is sent by Timestream when a query run finishes, when the state is updated or
   * when you delete it.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-timestream-scheduledquery.html#cfn-timestream-scheduledquery-notificationconfiguration)
   * @param notificationConfiguration Notification configuration for the scheduled query. 
   */
  public fun notificationConfiguration(notificationConfiguration: IResolvable) {
    cdkBuilder.notificationConfiguration(notificationConfiguration)
  }

  /**
   * Notification configuration for the scheduled query.
   *
   * A notification is sent by Timestream when a query run finishes, when the state is updated or
   * when you delete it.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-timestream-scheduledquery.html#cfn-timestream-scheduledquery-notificationconfiguration)
   * @param notificationConfiguration Notification configuration for the scheduled query. 
   */
  public
      fun notificationConfiguration(notificationConfiguration: CfnScheduledQuery.NotificationConfigurationProperty) {
    cdkBuilder.notificationConfiguration(notificationConfiguration)
  }

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
   * @param queryString The query string to run. 
   */
  public fun queryString(queryString: String) {
    cdkBuilder.queryString(queryString)
  }

  /**
   * Schedule configuration.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-timestream-scheduledquery.html#cfn-timestream-scheduledquery-scheduleconfiguration)
   * @param scheduleConfiguration Schedule configuration. 
   */
  public fun scheduleConfiguration(scheduleConfiguration: IResolvable) {
    cdkBuilder.scheduleConfiguration(scheduleConfiguration)
  }

  /**
   * Schedule configuration.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-timestream-scheduledquery.html#cfn-timestream-scheduledquery-scheduleconfiguration)
   * @param scheduleConfiguration Schedule configuration. 
   */
  public
      fun scheduleConfiguration(scheduleConfiguration: CfnScheduledQuery.ScheduleConfigurationProperty) {
    cdkBuilder.scheduleConfiguration(scheduleConfiguration)
  }

  /**
   * The ARN for the IAM role that Timestream will assume when running the scheduled query.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-timestream-scheduledquery.html#cfn-timestream-scheduledquery-scheduledqueryexecutionrolearn)
   * @param scheduledQueryExecutionRoleArn The ARN for the IAM role that Timestream will assume when
   * running the scheduled query. 
   */
  public fun scheduledQueryExecutionRoleArn(scheduledQueryExecutionRoleArn: String) {
    cdkBuilder.scheduledQueryExecutionRoleArn(scheduledQueryExecutionRoleArn)
  }

  /**
   * A name for the query.
   *
   * Scheduled query names must be unique within each Region.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-timestream-scheduledquery.html#cfn-timestream-scheduledquery-scheduledqueryname)
   * @param scheduledQueryName A name for the query. 
   */
  public fun scheduledQueryName(scheduledQueryName: String) {
    cdkBuilder.scheduledQueryName(scheduledQueryName)
  }

  /**
   * A list of key-value pairs to label the scheduled query.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-timestream-scheduledquery.html#cfn-timestream-scheduledquery-tags)
   * @param tags A list of key-value pairs to label the scheduled query. 
   */
  public fun tags(tags: CfnTagDsl.() -> Unit) {
    _tags.add(CfnTagDsl().apply(tags).build())
  }

  /**
   * A list of key-value pairs to label the scheduled query.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-timestream-scheduledquery.html#cfn-timestream-scheduledquery-tags)
   * @param tags A list of key-value pairs to label the scheduled query. 
   */
  public fun tags(tags: Collection<CfnTag>) {
    _tags.addAll(tags)
  }

  /**
   * Scheduled query target store configuration.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-timestream-scheduledquery.html#cfn-timestream-scheduledquery-targetconfiguration)
   * @param targetConfiguration Scheduled query target store configuration. 
   */
  public fun targetConfiguration(targetConfiguration: IResolvable) {
    cdkBuilder.targetConfiguration(targetConfiguration)
  }

  /**
   * Scheduled query target store configuration.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-timestream-scheduledquery.html#cfn-timestream-scheduledquery-targetconfiguration)
   * @param targetConfiguration Scheduled query target store configuration. 
   */
  public
      fun targetConfiguration(targetConfiguration: CfnScheduledQuery.TargetConfigurationProperty) {
    cdkBuilder.targetConfiguration(targetConfiguration)
  }

  public fun build(): CfnScheduledQuery {
    if(_tags.isNotEmpty()) cdkBuilder.tags(_tags)
    return cdkBuilder.build()
  }
}
