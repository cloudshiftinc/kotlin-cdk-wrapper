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
