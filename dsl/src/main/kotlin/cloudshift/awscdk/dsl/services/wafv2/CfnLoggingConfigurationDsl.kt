@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.wafv2

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.common.MapBuilder
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.wafv2.CfnLoggingConfiguration
import software.constructs.Construct

/**
 * Defines an association between logging destinations and a web ACL resource, for logging from AWS
 * WAF .
 *
 * As part of the association, you can specify parts of the standard logging fields to keep out of
 * the logs and you can specify filters so that you log only a subset of the logging records.
 *
 *
 * You can define one logging destination per web ACL.
 *
 *
 * You can access information about the traffic that AWS WAF inspects using the following steps:
 *
 * * Create your logging destination. You can use an Amazon CloudWatch Logs log group, an Amazon
 * Simple Storage Service (Amazon S3) bucket, or an Amazon Kinesis Data Firehose.
 *
 * The name that you give the destination must start with `aws-waf-logs-` . Depending on the type of
 * destination, you might need to configure additional settings or permissions.
 *
 * For configuration requirements and pricing information for each destination type, see [Logging
 * web ACL traffic](https://docs.aws.amazon.com/waf/latest/developerguide/logging.html) in the *AWS WAF
 * Developer Guide* .
 *
 * * Associate your logging destination to your web ACL using a `PutLoggingConfiguration` request.
 *
 * When you successfully enable logging using a `PutLoggingConfiguration` request, AWS WAF creates
 * an additional role or policy that is required to write logs to the logging destination. For an
 * Amazon CloudWatch Logs log group, AWS WAF creates a resource policy on the log group. For an Amazon
 * S3 bucket, AWS WAF creates a bucket policy. For an Amazon Kinesis Data Firehose, AWS WAF creates a
 * service-linked role.
 *
 * For additional information about web ACL logging, see [Logging web ACL traffic
 * information](https://docs.aws.amazon.com/waf/latest/developerguide/logging.html) in the *AWS WAF
 * Developer Guide* .
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.wafv2.*;
 * Object jsonBody;
 * Object loggingFilter;
 * Object method;
 * Object queryString;
 * Object singleHeader;
 * Object uriPath;
 * CfnLoggingConfiguration cfnLoggingConfiguration = CfnLoggingConfiguration.Builder.create(this,
 * "MyCfnLoggingConfiguration")
 * .logDestinationConfigs(List.of("logDestinationConfigs"))
 * .resourceArn("resourceArn")
 * // the properties below are optional
 * .loggingFilter(loggingFilter)
 * .redactedFields(List.of(FieldToMatchProperty.builder()
 * .jsonBody(jsonBody)
 * .method(method)
 * .queryString(queryString)
 * .singleHeader(singleHeader)
 * .uriPath(uriPath)
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wafv2-loggingconfiguration.html)
 */
@CdkDslMarker
public class CfnLoggingConfigurationDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: CfnLoggingConfiguration.Builder =
      CfnLoggingConfiguration.Builder.create(scope, id)

  private val _logDestinationConfigs: MutableList<String> = mutableListOf()

  private val _redactedFields: MutableList<Any> = mutableListOf()

  /**
   * The logging destination configuration that you want to associate with the web ACL.
   *
   *
   * You can associate one logging destination to a web ACL.
   *
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wafv2-loggingconfiguration.html#cfn-wafv2-loggingconfiguration-logdestinationconfigs)
   * @param logDestinationConfigs The logging destination configuration that you want to associate
   * with the web ACL. 
   */
  public fun logDestinationConfigs(vararg logDestinationConfigs: String) {
    _logDestinationConfigs.addAll(listOf(*logDestinationConfigs))
  }

  /**
   * The logging destination configuration that you want to associate with the web ACL.
   *
   *
   * You can associate one logging destination to a web ACL.
   *
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wafv2-loggingconfiguration.html#cfn-wafv2-loggingconfiguration-logdestinationconfigs)
   * @param logDestinationConfigs The logging destination configuration that you want to associate
   * with the web ACL. 
   */
  public fun logDestinationConfigs(logDestinationConfigs: Collection<String>) {
    _logDestinationConfigs.addAll(logDestinationConfigs)
  }

  /**
   * Filtering that specifies which web requests are kept in the logs and which are dropped.
   *
   * You can filter on the rule action and on the web request labels that were applied by matching
   * rules during web ACL evaluation.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wafv2-loggingconfiguration.html#cfn-wafv2-loggingconfiguration-loggingfilter)
   * @param loggingFilter Filtering that specifies which web requests are kept in the logs and which
   * are dropped. 
   */
  public fun loggingFilter(loggingFilter: MapBuilder.() -> Unit = {}) {
    val builder = MapBuilder()
    builder.apply(loggingFilter)
    cdkBuilder.loggingFilter(builder.map)
  }

  /**
   * Filtering that specifies which web requests are kept in the logs and which are dropped.
   *
   * You can filter on the rule action and on the web request labels that were applied by matching
   * rules during web ACL evaluation.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wafv2-loggingconfiguration.html#cfn-wafv2-loggingconfiguration-loggingfilter)
   * @param loggingFilter Filtering that specifies which web requests are kept in the logs and which
   * are dropped. 
   */
  public fun loggingFilter(loggingFilter: Any) {
    cdkBuilder.loggingFilter(loggingFilter)
  }

  /**
   * The parts of the request that you want to keep out of the logs.
   *
   * For example, if you redact the `SingleHeader` field, the `HEADER` field in the logs will be
   * `REDACTED` for all rules that use the `SingleHeader` `FieldToMatch` setting.
   *
   * Redaction applies only to the component that's specified in the rule's `FieldToMatch` setting,
   * so the `SingleHeader` redaction doesn't apply to rules that use the `Headers` `FieldToMatch` .
   *
   *
   * You can specify only the following fields for redaction: `UriPath` , `QueryString` ,
   * `SingleHeader` , and `Method` .
   *
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wafv2-loggingconfiguration.html#cfn-wafv2-loggingconfiguration-redactedfields)
   * @param redactedFields The parts of the request that you want to keep out of the logs. 
   */
  public fun redactedFields(vararg redactedFields: Any) {
    _redactedFields.addAll(listOf(*redactedFields))
  }

  /**
   * The parts of the request that you want to keep out of the logs.
   *
   * For example, if you redact the `SingleHeader` field, the `HEADER` field in the logs will be
   * `REDACTED` for all rules that use the `SingleHeader` `FieldToMatch` setting.
   *
   * Redaction applies only to the component that's specified in the rule's `FieldToMatch` setting,
   * so the `SingleHeader` redaction doesn't apply to rules that use the `Headers` `FieldToMatch` .
   *
   *
   * You can specify only the following fields for redaction: `UriPath` , `QueryString` ,
   * `SingleHeader` , and `Method` .
   *
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wafv2-loggingconfiguration.html#cfn-wafv2-loggingconfiguration-redactedfields)
   * @param redactedFields The parts of the request that you want to keep out of the logs. 
   */
  public fun redactedFields(redactedFields: Collection<Any>) {
    _redactedFields.addAll(redactedFields)
  }

  /**
   * The parts of the request that you want to keep out of the logs.
   *
   * For example, if you redact the `SingleHeader` field, the `HEADER` field in the logs will be
   * `REDACTED` for all rules that use the `SingleHeader` `FieldToMatch` setting.
   *
   * Redaction applies only to the component that's specified in the rule's `FieldToMatch` setting,
   * so the `SingleHeader` redaction doesn't apply to rules that use the `Headers` `FieldToMatch` .
   *
   *
   * You can specify only the following fields for redaction: `UriPath` , `QueryString` ,
   * `SingleHeader` , and `Method` .
   *
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wafv2-loggingconfiguration.html#cfn-wafv2-loggingconfiguration-redactedfields)
   * @param redactedFields The parts of the request that you want to keep out of the logs. 
   */
  public fun redactedFields(redactedFields: IResolvable) {
    cdkBuilder.redactedFields(redactedFields)
  }

  /**
   * The Amazon Resource Name (ARN) of the web ACL that you want to associate with
   * `LogDestinationConfigs` .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wafv2-loggingconfiguration.html#cfn-wafv2-loggingconfiguration-resourcearn)
   * @param resourceArn The Amazon Resource Name (ARN) of the web ACL that you want to associate
   * with `LogDestinationConfigs` . 
   */
  public fun resourceArn(resourceArn: String) {
    cdkBuilder.resourceArn(resourceArn)
  }

  public fun build(): CfnLoggingConfiguration {
    if(_logDestinationConfigs.isNotEmpty()) cdkBuilder.logDestinationConfigs(_logDestinationConfigs)
    if(_redactedFields.isNotEmpty()) cdkBuilder.redactedFields(_redactedFields)
    return cdkBuilder.build()
  }
}
