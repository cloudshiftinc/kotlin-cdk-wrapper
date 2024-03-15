@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.wafv2

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

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
 * import io.cloudshiftdev.awscdk.services.wafv2.*;
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
public open class CfnLoggingConfiguration internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.wafv2.CfnLoggingConfiguration,
) : CfnResource(cdkObject), IInspectable {
  /**
   * Indicates whether the logging configuration was created by AWS Firewall Manager , as part of an
   * AWS WAF policy configuration.
   *
   * If true, only Firewall Manager can modify or delete the configuration.
   */
  public open fun attrManagedByFirewallManager(): IResolvable =
      unwrap(this).getAttrManagedByFirewallManager().let(IResolvable::wrap)

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  /**
   * The logging destination configuration that you want to associate with the web ACL.
   */
  public open fun logDestinationConfigs(): List<String> = unwrap(this).getLogDestinationConfigs()

  /**
   * The logging destination configuration that you want to associate with the web ACL.
   */
  public open fun logDestinationConfigs(`value`: List<String>) {
    unwrap(this).setLogDestinationConfigs(`value`)
  }

  /**
   * The logging destination configuration that you want to associate with the web ACL.
   */
  public open fun logDestinationConfigs(vararg `value`: String): Unit =
      logDestinationConfigs(`value`.toList())

  /**
   * Filtering that specifies which web requests are kept in the logs and which are dropped.
   */
  public open fun loggingFilter(): Any? = unwrap(this).getLoggingFilter()

  /**
   * Filtering that specifies which web requests are kept in the logs and which are dropped.
   */
  public open fun loggingFilter(`value`: Any) {
    unwrap(this).setLoggingFilter(`value`)
  }

  /**
   * The parts of the request that you want to keep out of the logs.
   */
  public open fun redactedFields(): Any? = unwrap(this).getRedactedFields()

  /**
   * The parts of the request that you want to keep out of the logs.
   */
  public open fun redactedFields(`value`: IResolvable) {
    unwrap(this).setRedactedFields(`value`.let(IResolvable::unwrap))
  }

  /**
   * The parts of the request that you want to keep out of the logs.
   */
  public open fun redactedFields(_idx_ac66f0: List<Any>) {
    unwrap(this).setRedactedFields(_idx_ac66f0)
  }

  /**
   * The parts of the request that you want to keep out of the logs.
   */
  public open fun redactedFields(vararg _idx_ac66f0: Any): Unit =
      redactedFields(_idx_ac66f0.toList())

  /**
   * The Amazon Resource Name (ARN) of the web ACL that you want to associate with
   * `LogDestinationConfigs` .
   */
  public open fun resourceArn(): String = unwrap(this).getResourceArn()

  /**
   * The Amazon Resource Name (ARN) of the web ACL that you want to associate with
   * `LogDestinationConfigs` .
   */
  public open fun resourceArn(`value`: String) {
    unwrap(this).setResourceArn(`value`)
  }

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.wafv2.CfnLoggingConfiguration].
   */
  @CdkDslMarker
  public interface Builder {
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
    public fun logDestinationConfigs(logDestinationConfigs: List<String>)

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
    public fun logDestinationConfigs(vararg logDestinationConfigs: String)

    /**
     * Filtering that specifies which web requests are kept in the logs and which are dropped.
     *
     * You can filter on the rule action and on the web request labels that were applied by matching
     * rules during web ACL evaluation.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wafv2-loggingconfiguration.html#cfn-wafv2-loggingconfiguration-loggingfilter)
     * @param loggingFilter Filtering that specifies which web requests are kept in the logs and
     * which are dropped. 
     */
    public fun loggingFilter(loggingFilter: Any)

    /**
     * The parts of the request that you want to keep out of the logs.
     *
     * For example, if you redact the `SingleHeader` field, the `HEADER` field in the logs will be
     * `REDACTED` for all rules that use the `SingleHeader` `FieldToMatch` setting.
     *
     * Redaction applies only to the component that's specified in the rule's `FieldToMatch`
     * setting, so the `SingleHeader` redaction doesn't apply to rules that use the `Headers`
     * `FieldToMatch` .
     *
     *
     * You can specify only the following fields for redaction: `UriPath` , `QueryString` ,
     * `SingleHeader` , and `Method` .
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wafv2-loggingconfiguration.html#cfn-wafv2-loggingconfiguration-redactedfields)
     * @param redactedFields The parts of the request that you want to keep out of the logs. 
     */
    public fun redactedFields(redactedFields: IResolvable)

    /**
     * The parts of the request that you want to keep out of the logs.
     *
     * For example, if you redact the `SingleHeader` field, the `HEADER` field in the logs will be
     * `REDACTED` for all rules that use the `SingleHeader` `FieldToMatch` setting.
     *
     * Redaction applies only to the component that's specified in the rule's `FieldToMatch`
     * setting, so the `SingleHeader` redaction doesn't apply to rules that use the `Headers`
     * `FieldToMatch` .
     *
     *
     * You can specify only the following fields for redaction: `UriPath` , `QueryString` ,
     * `SingleHeader` , and `Method` .
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wafv2-loggingconfiguration.html#cfn-wafv2-loggingconfiguration-redactedfields)
     * @param redactedFields The parts of the request that you want to keep out of the logs. 
     */
    public fun redactedFields(redactedFields: List<Any>)

    /**
     * The parts of the request that you want to keep out of the logs.
     *
     * For example, if you redact the `SingleHeader` field, the `HEADER` field in the logs will be
     * `REDACTED` for all rules that use the `SingleHeader` `FieldToMatch` setting.
     *
     * Redaction applies only to the component that's specified in the rule's `FieldToMatch`
     * setting, so the `SingleHeader` redaction doesn't apply to rules that use the `Headers`
     * `FieldToMatch` .
     *
     *
     * You can specify only the following fields for redaction: `UriPath` , `QueryString` ,
     * `SingleHeader` , and `Method` .
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wafv2-loggingconfiguration.html#cfn-wafv2-loggingconfiguration-redactedfields)
     * @param redactedFields The parts of the request that you want to keep out of the logs. 
     */
    public fun redactedFields(vararg redactedFields: Any)

    /**
     * The Amazon Resource Name (ARN) of the web ACL that you want to associate with
     * `LogDestinationConfigs` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wafv2-loggingconfiguration.html#cfn-wafv2-loggingconfiguration-resourcearn)
     * @param resourceArn The Amazon Resource Name (ARN) of the web ACL that you want to associate
     * with `LogDestinationConfigs` . 
     */
    public fun resourceArn(resourceArn: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.wafv2.CfnLoggingConfiguration.Builder =
        software.amazon.awscdk.services.wafv2.CfnLoggingConfiguration.Builder.create(scope, id)

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
    override fun logDestinationConfigs(logDestinationConfigs: List<String>) {
      cdkBuilder.logDestinationConfigs(logDestinationConfigs)
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
    override fun logDestinationConfigs(vararg logDestinationConfigs: String): Unit =
        logDestinationConfigs(logDestinationConfigs.toList())

    /**
     * Filtering that specifies which web requests are kept in the logs and which are dropped.
     *
     * You can filter on the rule action and on the web request labels that were applied by matching
     * rules during web ACL evaluation.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wafv2-loggingconfiguration.html#cfn-wafv2-loggingconfiguration-loggingfilter)
     * @param loggingFilter Filtering that specifies which web requests are kept in the logs and
     * which are dropped. 
     */
    override fun loggingFilter(loggingFilter: Any) {
      cdkBuilder.loggingFilter(loggingFilter)
    }

    /**
     * The parts of the request that you want to keep out of the logs.
     *
     * For example, if you redact the `SingleHeader` field, the `HEADER` field in the logs will be
     * `REDACTED` for all rules that use the `SingleHeader` `FieldToMatch` setting.
     *
     * Redaction applies only to the component that's specified in the rule's `FieldToMatch`
     * setting, so the `SingleHeader` redaction doesn't apply to rules that use the `Headers`
     * `FieldToMatch` .
     *
     *
     * You can specify only the following fields for redaction: `UriPath` , `QueryString` ,
     * `SingleHeader` , and `Method` .
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wafv2-loggingconfiguration.html#cfn-wafv2-loggingconfiguration-redactedfields)
     * @param redactedFields The parts of the request that you want to keep out of the logs. 
     */
    override fun redactedFields(redactedFields: IResolvable) {
      cdkBuilder.redactedFields(redactedFields.let(IResolvable::unwrap))
    }

    /**
     * The parts of the request that you want to keep out of the logs.
     *
     * For example, if you redact the `SingleHeader` field, the `HEADER` field in the logs will be
     * `REDACTED` for all rules that use the `SingleHeader` `FieldToMatch` setting.
     *
     * Redaction applies only to the component that's specified in the rule's `FieldToMatch`
     * setting, so the `SingleHeader` redaction doesn't apply to rules that use the `Headers`
     * `FieldToMatch` .
     *
     *
     * You can specify only the following fields for redaction: `UriPath` , `QueryString` ,
     * `SingleHeader` , and `Method` .
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wafv2-loggingconfiguration.html#cfn-wafv2-loggingconfiguration-redactedfields)
     * @param redactedFields The parts of the request that you want to keep out of the logs. 
     */
    override fun redactedFields(redactedFields: List<Any>) {
      cdkBuilder.redactedFields(redactedFields)
    }

    /**
     * The parts of the request that you want to keep out of the logs.
     *
     * For example, if you redact the `SingleHeader` field, the `HEADER` field in the logs will be
     * `REDACTED` for all rules that use the `SingleHeader` `FieldToMatch` setting.
     *
     * Redaction applies only to the component that's specified in the rule's `FieldToMatch`
     * setting, so the `SingleHeader` redaction doesn't apply to rules that use the `Headers`
     * `FieldToMatch` .
     *
     *
     * You can specify only the following fields for redaction: `UriPath` , `QueryString` ,
     * `SingleHeader` , and `Method` .
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wafv2-loggingconfiguration.html#cfn-wafv2-loggingconfiguration-redactedfields)
     * @param redactedFields The parts of the request that you want to keep out of the logs. 
     */
    override fun redactedFields(vararg redactedFields: Any): Unit =
        redactedFields(redactedFields.toList())

    /**
     * The Amazon Resource Name (ARN) of the web ACL that you want to associate with
     * `LogDestinationConfigs` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wafv2-loggingconfiguration.html#cfn-wafv2-loggingconfiguration-resourcearn)
     * @param resourceArn The Amazon Resource Name (ARN) of the web ACL that you want to associate
     * with `LogDestinationConfigs` . 
     */
    override fun resourceArn(resourceArn: String) {
      cdkBuilder.resourceArn(resourceArn)
    }

    public fun build(): software.amazon.awscdk.services.wafv2.CfnLoggingConfiguration =
        cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.wafv2.CfnLoggingConfiguration.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnLoggingConfiguration {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnLoggingConfiguration(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.wafv2.CfnLoggingConfiguration):
        CfnLoggingConfiguration = CfnLoggingConfiguration(cdkObject)

    internal fun unwrap(wrapped: CfnLoggingConfiguration):
        software.amazon.awscdk.services.wafv2.CfnLoggingConfiguration = wrapped.cdkObject
  }

  /**
   * A single label name condition for a condition in a logging filter.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.wafv2.*;
   * LabelNameConditionProperty labelNameConditionProperty = LabelNameConditionProperty.builder()
   * .labelName("labelName")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-loggingconfiguration-labelnamecondition.html)
   */
  public interface LabelNameConditionProperty {
    /**
     * The label name that a log record must contain in order to meet the condition.
     *
     * This must be a fully qualified label name. Fully qualified labels have a prefix, optional
     * namespaces, and label name. The prefix identifies the rule group or web ACL context of the rule
     * that added the label.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-loggingconfiguration-labelnamecondition.html#cfn-wafv2-loggingconfiguration-labelnamecondition-labelname)
     */
    public fun labelName(): String

    /**
     * A builder for [LabelNameConditionProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param labelName The label name that a log record must contain in order to meet the
       * condition. 
       * This must be a fully qualified label name. Fully qualified labels have a prefix, optional
       * namespaces, and label name. The prefix identifies the rule group or web ACL context of the
       * rule that added the label.
       */
      public fun labelName(labelName: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.wafv2.CfnLoggingConfiguration.LabelNameConditionProperty.Builder
          =
          software.amazon.awscdk.services.wafv2.CfnLoggingConfiguration.LabelNameConditionProperty.builder()

      /**
       * @param labelName The label name that a log record must contain in order to meet the
       * condition. 
       * This must be a fully qualified label name. Fully qualified labels have a prefix, optional
       * namespaces, and label name. The prefix identifies the rule group or web ACL context of the
       * rule that added the label.
       */
      override fun labelName(labelName: String) {
        cdkBuilder.labelName(labelName)
      }

      public fun build():
          software.amazon.awscdk.services.wafv2.CfnLoggingConfiguration.LabelNameConditionProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.wafv2.CfnLoggingConfiguration.LabelNameConditionProperty,
    ) : CdkObject(cdkObject), LabelNameConditionProperty {
      /**
       * The label name that a log record must contain in order to meet the condition.
       *
       * This must be a fully qualified label name. Fully qualified labels have a prefix, optional
       * namespaces, and label name. The prefix identifies the rule group or web ACL context of the
       * rule that added the label.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-loggingconfiguration-labelnamecondition.html#cfn-wafv2-loggingconfiguration-labelnamecondition-labelname)
       */
      override fun labelName(): String = unwrap(this).getLabelName()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): LabelNameConditionProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.wafv2.CfnLoggingConfiguration.LabelNameConditionProperty):
          LabelNameConditionProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: LabelNameConditionProperty):
          software.amazon.awscdk.services.wafv2.CfnLoggingConfiguration.LabelNameConditionProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.wafv2.CfnLoggingConfiguration.LabelNameConditionProperty
    }
  }

  /**
   * A single logging filter, used in `LoggingFilter` .
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.wafv2.*;
   * FilterProperty filterProperty = FilterProperty.builder()
   * .behavior("behavior")
   * .conditions(List.of(ConditionProperty.builder()
   * .actionCondition(ActionConditionProperty.builder()
   * .action("action")
   * .build())
   * .labelNameCondition(LabelNameConditionProperty.builder()
   * .labelName("labelName")
   * .build())
   * .build()))
   * .requirement("requirement")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-loggingconfiguration-filter.html)
   */
  public interface FilterProperty {
    /**
     * How to handle logs that satisfy the filter's conditions and requirement.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-loggingconfiguration-filter.html#cfn-wafv2-loggingconfiguration-filter-behavior)
     */
    public fun behavior(): String

    /**
     * Match conditions for the filter.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-loggingconfiguration-filter.html#cfn-wafv2-loggingconfiguration-filter-conditions)
     */
    public fun conditions(): Any

    /**
     * Logic to apply to the filtering conditions.
     *
     * You can specify that, in order to satisfy the filter, a log must match all conditions or must
     * match at least one condition.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-loggingconfiguration-filter.html#cfn-wafv2-loggingconfiguration-filter-requirement)
     */
    public fun requirement(): String

    /**
     * A builder for [FilterProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param behavior How to handle logs that satisfy the filter's conditions and requirement. 
       */
      public fun behavior(behavior: String)

      /**
       * @param conditions Match conditions for the filter. 
       */
      public fun conditions(conditions: IResolvable)

      /**
       * @param conditions Match conditions for the filter. 
       */
      public fun conditions(conditions: List<Any>)

      /**
       * @param conditions Match conditions for the filter. 
       */
      public fun conditions(vararg conditions: Any)

      /**
       * @param requirement Logic to apply to the filtering conditions. 
       * You can specify that, in order to satisfy the filter, a log must match all conditions or
       * must match at least one condition.
       */
      public fun requirement(requirement: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.wafv2.CfnLoggingConfiguration.FilterProperty.Builder =
          software.amazon.awscdk.services.wafv2.CfnLoggingConfiguration.FilterProperty.builder()

      /**
       * @param behavior How to handle logs that satisfy the filter's conditions and requirement. 
       */
      override fun behavior(behavior: String) {
        cdkBuilder.behavior(behavior)
      }

      /**
       * @param conditions Match conditions for the filter. 
       */
      override fun conditions(conditions: IResolvable) {
        cdkBuilder.conditions(conditions.let(IResolvable::unwrap))
      }

      /**
       * @param conditions Match conditions for the filter. 
       */
      override fun conditions(conditions: List<Any>) {
        cdkBuilder.conditions(conditions)
      }

      /**
       * @param conditions Match conditions for the filter. 
       */
      override fun conditions(vararg conditions: Any): Unit = conditions(conditions.toList())

      /**
       * @param requirement Logic to apply to the filtering conditions. 
       * You can specify that, in order to satisfy the filter, a log must match all conditions or
       * must match at least one condition.
       */
      override fun requirement(requirement: String) {
        cdkBuilder.requirement(requirement)
      }

      public fun build():
          software.amazon.awscdk.services.wafv2.CfnLoggingConfiguration.FilterProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.wafv2.CfnLoggingConfiguration.FilterProperty,
    ) : CdkObject(cdkObject), FilterProperty {
      /**
       * How to handle logs that satisfy the filter's conditions and requirement.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-loggingconfiguration-filter.html#cfn-wafv2-loggingconfiguration-filter-behavior)
       */
      override fun behavior(): String = unwrap(this).getBehavior()

      /**
       * Match conditions for the filter.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-loggingconfiguration-filter.html#cfn-wafv2-loggingconfiguration-filter-conditions)
       */
      override fun conditions(): Any = unwrap(this).getConditions()

      /**
       * Logic to apply to the filtering conditions.
       *
       * You can specify that, in order to satisfy the filter, a log must match all conditions or
       * must match at least one condition.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-loggingconfiguration-filter.html#cfn-wafv2-loggingconfiguration-filter-requirement)
       */
      override fun requirement(): String = unwrap(this).getRequirement()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): FilterProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.wafv2.CfnLoggingConfiguration.FilterProperty):
          FilterProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: FilterProperty):
          software.amazon.awscdk.services.wafv2.CfnLoggingConfiguration.FilterProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.wafv2.CfnLoggingConfiguration.FilterProperty
    }
  }

  /**
   * Filtering that specifies which web requests are kept in the logs and which are dropped, defined
   * for a web ACL's `LoggingConfiguration` .
   *
   * You can filter on the rule action and on the web request labels that were applied by matching
   * rules during web ACL evaluation.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.wafv2.*;
   * LoggingFilterProperty loggingFilterProperty = LoggingFilterProperty.builder()
   * .defaultBehavior("defaultBehavior")
   * .filters(List.of(FilterProperty.builder()
   * .behavior("behavior")
   * .conditions(List.of(ConditionProperty.builder()
   * .actionCondition(ActionConditionProperty.builder()
   * .action("action")
   * .build())
   * .labelNameCondition(LabelNameConditionProperty.builder()
   * .labelName("labelName")
   * .build())
   * .build()))
   * .requirement("requirement")
   * .build()))
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-loggingconfiguration-loggingfilter.html)
   */
  public interface LoggingFilterProperty {
    /**
     * Default handling for logs that don't match any of the specified filtering conditions.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-loggingconfiguration-loggingfilter.html#cfn-wafv2-loggingconfiguration-loggingfilter-defaultbehavior)
     */
    public fun defaultBehavior(): String

    /**
     * The filters that you want to apply to the logs.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-loggingconfiguration-loggingfilter.html#cfn-wafv2-loggingconfiguration-loggingfilter-filters)
     */
    public fun filters(): Any

    /**
     * A builder for [LoggingFilterProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param defaultBehavior Default handling for logs that don't match any of the specified
       * filtering conditions. 
       */
      public fun defaultBehavior(defaultBehavior: String)

      /**
       * @param filters The filters that you want to apply to the logs. 
       */
      public fun filters(filters: IResolvable)

      /**
       * @param filters The filters that you want to apply to the logs. 
       */
      public fun filters(filters: List<Any>)

      /**
       * @param filters The filters that you want to apply to the logs. 
       */
      public fun filters(vararg filters: Any)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.wafv2.CfnLoggingConfiguration.LoggingFilterProperty.Builder
          =
          software.amazon.awscdk.services.wafv2.CfnLoggingConfiguration.LoggingFilterProperty.builder()

      /**
       * @param defaultBehavior Default handling for logs that don't match any of the specified
       * filtering conditions. 
       */
      override fun defaultBehavior(defaultBehavior: String) {
        cdkBuilder.defaultBehavior(defaultBehavior)
      }

      /**
       * @param filters The filters that you want to apply to the logs. 
       */
      override fun filters(filters: IResolvable) {
        cdkBuilder.filters(filters.let(IResolvable::unwrap))
      }

      /**
       * @param filters The filters that you want to apply to the logs. 
       */
      override fun filters(filters: List<Any>) {
        cdkBuilder.filters(filters)
      }

      /**
       * @param filters The filters that you want to apply to the logs. 
       */
      override fun filters(vararg filters: Any): Unit = filters(filters.toList())

      public fun build():
          software.amazon.awscdk.services.wafv2.CfnLoggingConfiguration.LoggingFilterProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.wafv2.CfnLoggingConfiguration.LoggingFilterProperty,
    ) : CdkObject(cdkObject), LoggingFilterProperty {
      /**
       * Default handling for logs that don't match any of the specified filtering conditions.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-loggingconfiguration-loggingfilter.html#cfn-wafv2-loggingconfiguration-loggingfilter-defaultbehavior)
       */
      override fun defaultBehavior(): String = unwrap(this).getDefaultBehavior()

      /**
       * The filters that you want to apply to the logs.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-loggingconfiguration-loggingfilter.html#cfn-wafv2-loggingconfiguration-loggingfilter-filters)
       */
      override fun filters(): Any = unwrap(this).getFilters()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): LoggingFilterProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.wafv2.CfnLoggingConfiguration.LoggingFilterProperty):
          LoggingFilterProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: LoggingFilterProperty):
          software.amazon.awscdk.services.wafv2.CfnLoggingConfiguration.LoggingFilterProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.wafv2.CfnLoggingConfiguration.LoggingFilterProperty
    }
  }

  /**
   * Inspect one of the headers in the web request, identified by name, for example, `User-Agent` or
   * `Referer` .
   *
   * The name isn't case sensitive.
   *
   * You can filter and inspect all headers with the `FieldToMatch` setting `Headers` .
   *
   * This is used to indicate the web request component to inspect, in the `FieldToMatch`
   * specification.
   *
   * Example JSON: `"SingleHeader": { "Name": "haystack" }`
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.wafv2.*;
   * SingleHeaderProperty singleHeaderProperty = SingleHeaderProperty.builder()
   * .name("name")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-loggingconfiguration-singleheader.html)
   */
  public interface SingleHeaderProperty {
    /**
     * The name of the query header to inspect.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-loggingconfiguration-singleheader.html#cfn-wafv2-loggingconfiguration-singleheader-name)
     */
    public fun name(): String

    /**
     * A builder for [SingleHeaderProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param name The name of the query header to inspect. 
       */
      public fun name(name: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.wafv2.CfnLoggingConfiguration.SingleHeaderProperty.Builder
          =
          software.amazon.awscdk.services.wafv2.CfnLoggingConfiguration.SingleHeaderProperty.builder()

      /**
       * @param name The name of the query header to inspect. 
       */
      override fun name(name: String) {
        cdkBuilder.name(name)
      }

      public fun build():
          software.amazon.awscdk.services.wafv2.CfnLoggingConfiguration.SingleHeaderProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.wafv2.CfnLoggingConfiguration.SingleHeaderProperty,
    ) : CdkObject(cdkObject), SingleHeaderProperty {
      /**
       * The name of the query header to inspect.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-loggingconfiguration-singleheader.html#cfn-wafv2-loggingconfiguration-singleheader-name)
       */
      override fun name(): String = unwrap(this).getName()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): SingleHeaderProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.wafv2.CfnLoggingConfiguration.SingleHeaderProperty):
          SingleHeaderProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: SingleHeaderProperty):
          software.amazon.awscdk.services.wafv2.CfnLoggingConfiguration.SingleHeaderProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.wafv2.CfnLoggingConfiguration.SingleHeaderProperty
    }
  }

  /**
   * A single match condition for a log filter.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.wafv2.*;
   * ConditionProperty conditionProperty = ConditionProperty.builder()
   * .actionCondition(ActionConditionProperty.builder()
   * .action("action")
   * .build())
   * .labelNameCondition(LabelNameConditionProperty.builder()
   * .labelName("labelName")
   * .build())
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-loggingconfiguration-condition.html)
   */
  public interface ConditionProperty {
    /**
     * A single action condition.
     *
     * This is the action setting that a log record must contain in order to meet the condition.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-loggingconfiguration-condition.html#cfn-wafv2-loggingconfiguration-condition-actioncondition)
     */
    public fun actionCondition(): Any? = unwrap(this).getActionCondition()

    /**
     * A single label name condition.
     *
     * This is the fully qualified label name that a log record must contain in order to meet the
     * condition. Fully qualified labels have a prefix, optional namespaces, and label name. The prefix
     * identifies the rule group or web ACL context of the rule that added the label.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-loggingconfiguration-condition.html#cfn-wafv2-loggingconfiguration-condition-labelnamecondition)
     */
    public fun labelNameCondition(): Any? = unwrap(this).getLabelNameCondition()

    /**
     * A builder for [ConditionProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param actionCondition A single action condition.
       * This is the action setting that a log record must contain in order to meet the condition.
       */
      public fun actionCondition(actionCondition: IResolvable)

      /**
       * @param actionCondition A single action condition.
       * This is the action setting that a log record must contain in order to meet the condition.
       */
      public fun actionCondition(actionCondition: ActionConditionProperty)

      /**
       * @param actionCondition A single action condition.
       * This is the action setting that a log record must contain in order to meet the condition.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("3b3cd5e6627685433dd5fb1edd61d760fdeaaf76940ac0b738602063754b5759")
      public fun actionCondition(actionCondition: ActionConditionProperty.Builder.() -> Unit)

      /**
       * @param labelNameCondition A single label name condition.
       * This is the fully qualified label name that a log record must contain in order to meet the
       * condition. Fully qualified labels have a prefix, optional namespaces, and label name. The
       * prefix identifies the rule group or web ACL context of the rule that added the label.
       */
      public fun labelNameCondition(labelNameCondition: IResolvable)

      /**
       * @param labelNameCondition A single label name condition.
       * This is the fully qualified label name that a log record must contain in order to meet the
       * condition. Fully qualified labels have a prefix, optional namespaces, and label name. The
       * prefix identifies the rule group or web ACL context of the rule that added the label.
       */
      public fun labelNameCondition(labelNameCondition: LabelNameConditionProperty)

      /**
       * @param labelNameCondition A single label name condition.
       * This is the fully qualified label name that a log record must contain in order to meet the
       * condition. Fully qualified labels have a prefix, optional namespaces, and label name. The
       * prefix identifies the rule group or web ACL context of the rule that added the label.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("5c2ef676ac8836bd83691849c0052441a394f30aa7e8af8a052f1c99f452d30c")
      public
          fun labelNameCondition(labelNameCondition: LabelNameConditionProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.wafv2.CfnLoggingConfiguration.ConditionProperty.Builder =
          software.amazon.awscdk.services.wafv2.CfnLoggingConfiguration.ConditionProperty.builder()

      /**
       * @param actionCondition A single action condition.
       * This is the action setting that a log record must contain in order to meet the condition.
       */
      override fun actionCondition(actionCondition: IResolvable) {
        cdkBuilder.actionCondition(actionCondition.let(IResolvable::unwrap))
      }

      /**
       * @param actionCondition A single action condition.
       * This is the action setting that a log record must contain in order to meet the condition.
       */
      override fun actionCondition(actionCondition: ActionConditionProperty) {
        cdkBuilder.actionCondition(actionCondition.let(ActionConditionProperty::unwrap))
      }

      /**
       * @param actionCondition A single action condition.
       * This is the action setting that a log record must contain in order to meet the condition.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("3b3cd5e6627685433dd5fb1edd61d760fdeaaf76940ac0b738602063754b5759")
      override fun actionCondition(actionCondition: ActionConditionProperty.Builder.() -> Unit):
          Unit = actionCondition(ActionConditionProperty(actionCondition))

      /**
       * @param labelNameCondition A single label name condition.
       * This is the fully qualified label name that a log record must contain in order to meet the
       * condition. Fully qualified labels have a prefix, optional namespaces, and label name. The
       * prefix identifies the rule group or web ACL context of the rule that added the label.
       */
      override fun labelNameCondition(labelNameCondition: IResolvable) {
        cdkBuilder.labelNameCondition(labelNameCondition.let(IResolvable::unwrap))
      }

      /**
       * @param labelNameCondition A single label name condition.
       * This is the fully qualified label name that a log record must contain in order to meet the
       * condition. Fully qualified labels have a prefix, optional namespaces, and label name. The
       * prefix identifies the rule group or web ACL context of the rule that added the label.
       */
      override fun labelNameCondition(labelNameCondition: LabelNameConditionProperty) {
        cdkBuilder.labelNameCondition(labelNameCondition.let(LabelNameConditionProperty::unwrap))
      }

      /**
       * @param labelNameCondition A single label name condition.
       * This is the fully qualified label name that a log record must contain in order to meet the
       * condition. Fully qualified labels have a prefix, optional namespaces, and label name. The
       * prefix identifies the rule group or web ACL context of the rule that added the label.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("5c2ef676ac8836bd83691849c0052441a394f30aa7e8af8a052f1c99f452d30c")
      override
          fun labelNameCondition(labelNameCondition: LabelNameConditionProperty.Builder.() -> Unit):
          Unit = labelNameCondition(LabelNameConditionProperty(labelNameCondition))

      public fun build():
          software.amazon.awscdk.services.wafv2.CfnLoggingConfiguration.ConditionProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.wafv2.CfnLoggingConfiguration.ConditionProperty,
    ) : CdkObject(cdkObject), ConditionProperty {
      /**
       * A single action condition.
       *
       * This is the action setting that a log record must contain in order to meet the condition.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-loggingconfiguration-condition.html#cfn-wafv2-loggingconfiguration-condition-actioncondition)
       */
      override fun actionCondition(): Any? = unwrap(this).getActionCondition()

      /**
       * A single label name condition.
       *
       * This is the fully qualified label name that a log record must contain in order to meet the
       * condition. Fully qualified labels have a prefix, optional namespaces, and label name. The
       * prefix identifies the rule group or web ACL context of the rule that added the label.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-loggingconfiguration-condition.html#cfn-wafv2-loggingconfiguration-condition-labelnamecondition)
       */
      override fun labelNameCondition(): Any? = unwrap(this).getLabelNameCondition()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): ConditionProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.wafv2.CfnLoggingConfiguration.ConditionProperty):
          ConditionProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ConditionProperty):
          software.amazon.awscdk.services.wafv2.CfnLoggingConfiguration.ConditionProperty = (wrapped
          as CdkObject).cdkObject as
          software.amazon.awscdk.services.wafv2.CfnLoggingConfiguration.ConditionProperty
    }
  }

  /**
   * A single action condition for a condition in a logging filter.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.wafv2.*;
   * ActionConditionProperty actionConditionProperty = ActionConditionProperty.builder()
   * .action("action")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-loggingconfiguration-actioncondition.html)
   */
  public interface ActionConditionProperty {
    /**
     * The action setting that a log record must contain in order to meet the condition.
     *
     * This is the action that AWS WAF applied to the web request.
     *
     * For rule groups, this is either the configured rule action setting, or if you've applied a
     * rule action override to the rule, it's the override action. The value `EXCLUDED_AS_COUNT`
     * matches on excluded rules and also on rules that have a rule action override of Count.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-loggingconfiguration-actioncondition.html#cfn-wafv2-loggingconfiguration-actioncondition-action)
     */
    public fun action(): String

    /**
     * A builder for [ActionConditionProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param action The action setting that a log record must contain in order to meet the
       * condition. 
       * This is the action that AWS WAF applied to the web request.
       *
       * For rule groups, this is either the configured rule action setting, or if you've applied a
       * rule action override to the rule, it's the override action. The value `EXCLUDED_AS_COUNT`
       * matches on excluded rules and also on rules that have a rule action override of Count.
       */
      public fun action(action: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.wafv2.CfnLoggingConfiguration.ActionConditionProperty.Builder
          =
          software.amazon.awscdk.services.wafv2.CfnLoggingConfiguration.ActionConditionProperty.builder()

      /**
       * @param action The action setting that a log record must contain in order to meet the
       * condition. 
       * This is the action that AWS WAF applied to the web request.
       *
       * For rule groups, this is either the configured rule action setting, or if you've applied a
       * rule action override to the rule, it's the override action. The value `EXCLUDED_AS_COUNT`
       * matches on excluded rules and also on rules that have a rule action override of Count.
       */
      override fun action(action: String) {
        cdkBuilder.action(action)
      }

      public fun build():
          software.amazon.awscdk.services.wafv2.CfnLoggingConfiguration.ActionConditionProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.wafv2.CfnLoggingConfiguration.ActionConditionProperty,
    ) : CdkObject(cdkObject), ActionConditionProperty {
      /**
       * The action setting that a log record must contain in order to meet the condition.
       *
       * This is the action that AWS WAF applied to the web request.
       *
       * For rule groups, this is either the configured rule action setting, or if you've applied a
       * rule action override to the rule, it's the override action. The value `EXCLUDED_AS_COUNT`
       * matches on excluded rules and also on rules that have a rule action override of Count.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-loggingconfiguration-actioncondition.html#cfn-wafv2-loggingconfiguration-actioncondition-action)
       */
      override fun action(): String = unwrap(this).getAction()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): ActionConditionProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.wafv2.CfnLoggingConfiguration.ActionConditionProperty):
          ActionConditionProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ActionConditionProperty):
          software.amazon.awscdk.services.wafv2.CfnLoggingConfiguration.ActionConditionProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.wafv2.CfnLoggingConfiguration.ActionConditionProperty
    }
  }

  /**
   * The parts of the request that you want to keep out of the logs.
   *
   * This is used in the logging configuration `RedactedFields` specification.
   *
   * Example JSON for a `QueryString` field to match:
   *
   * `"FieldToMatch": { "QueryString": {} }`
   *
   * Example JSON for a `Method` field to match specification:
   *
   * `"FieldToMatch": { "Method": { "Name": "DELETE" } }`
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.wafv2.*;
   * Object jsonBody;
   * Object method;
   * Object queryString;
   * Object singleHeader;
   * Object uriPath;
   * FieldToMatchProperty fieldToMatchProperty = FieldToMatchProperty.builder()
   * .jsonBody(jsonBody)
   * .method(method)
   * .queryString(queryString)
   * .singleHeader(singleHeader)
   * .uriPath(uriPath)
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-loggingconfiguration-fieldtomatch.html)
   */
  public interface FieldToMatchProperty {
    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-loggingconfiguration-fieldtomatch.html#cfn-wafv2-loggingconfiguration-fieldtomatch-jsonbody)
     */
    public fun jsonBody(): Any? = unwrap(this).getJsonBody()

    /**
     * Redact the indicated HTTP method.
     *
     * The method indicates the type of operation that the request is asking the origin to perform.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-loggingconfiguration-fieldtomatch.html#cfn-wafv2-loggingconfiguration-fieldtomatch-method)
     */
    public fun method(): Any? = unwrap(this).getMethod()

    /**
     * Redact the query string.
     *
     * This is the part of a URL that appears after a `?` character, if any.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-loggingconfiguration-fieldtomatch.html#cfn-wafv2-loggingconfiguration-fieldtomatch-querystring)
     */
    public fun queryString(): Any? = unwrap(this).getQueryString()

    /**
     * Redact a single header.
     *
     * Provide the name of the header to inspect, for example, `User-Agent` or `Referer` . This
     * setting isn't case sensitive.
     *
     * Example JSON: `"SingleHeader": { "Name": "haystack" }`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-loggingconfiguration-fieldtomatch.html#cfn-wafv2-loggingconfiguration-fieldtomatch-singleheader)
     */
    public fun singleHeader(): Any? = unwrap(this).getSingleHeader()

    /**
     * Redact the request URI path.
     *
     * This is the part of the web request that identifies a resource, for example,
     * `/images/daily-ad.jpg` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-loggingconfiguration-fieldtomatch.html#cfn-wafv2-loggingconfiguration-fieldtomatch-uripath)
     */
    public fun uriPath(): Any? = unwrap(this).getUriPath()

    /**
     * A builder for [FieldToMatchProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param jsonBody the value to be set.
       */
      public fun jsonBody(jsonBody: Any)

      /**
       * @param method Redact the indicated HTTP method.
       * The method indicates the type of operation that the request is asking the origin to
       * perform.
       */
      public fun method(method: Any)

      /**
       * @param queryString Redact the query string.
       * This is the part of a URL that appears after a `?` character, if any.
       */
      public fun queryString(queryString: Any)

      /**
       * @param singleHeader Redact a single header.
       * Provide the name of the header to inspect, for example, `User-Agent` or `Referer` . This
       * setting isn't case sensitive.
       *
       * Example JSON: `"SingleHeader": { "Name": "haystack" }`
       */
      public fun singleHeader(singleHeader: Any)

      /**
       * @param uriPath Redact the request URI path.
       * This is the part of the web request that identifies a resource, for example,
       * `/images/daily-ad.jpg` .
       */
      public fun uriPath(uriPath: Any)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.wafv2.CfnLoggingConfiguration.FieldToMatchProperty.Builder
          =
          software.amazon.awscdk.services.wafv2.CfnLoggingConfiguration.FieldToMatchProperty.builder()

      /**
       * @param jsonBody the value to be set.
       */
      override fun jsonBody(jsonBody: Any) {
        cdkBuilder.jsonBody(jsonBody)
      }

      /**
       * @param method Redact the indicated HTTP method.
       * The method indicates the type of operation that the request is asking the origin to
       * perform.
       */
      override fun method(method: Any) {
        cdkBuilder.method(method)
      }

      /**
       * @param queryString Redact the query string.
       * This is the part of a URL that appears after a `?` character, if any.
       */
      override fun queryString(queryString: Any) {
        cdkBuilder.queryString(queryString)
      }

      /**
       * @param singleHeader Redact a single header.
       * Provide the name of the header to inspect, for example, `User-Agent` or `Referer` . This
       * setting isn't case sensitive.
       *
       * Example JSON: `"SingleHeader": { "Name": "haystack" }`
       */
      override fun singleHeader(singleHeader: Any) {
        cdkBuilder.singleHeader(singleHeader)
      }

      /**
       * @param uriPath Redact the request URI path.
       * This is the part of the web request that identifies a resource, for example,
       * `/images/daily-ad.jpg` .
       */
      override fun uriPath(uriPath: Any) {
        cdkBuilder.uriPath(uriPath)
      }

      public fun build():
          software.amazon.awscdk.services.wafv2.CfnLoggingConfiguration.FieldToMatchProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.wafv2.CfnLoggingConfiguration.FieldToMatchProperty,
    ) : CdkObject(cdkObject), FieldToMatchProperty {
      /**
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-loggingconfiguration-fieldtomatch.html#cfn-wafv2-loggingconfiguration-fieldtomatch-jsonbody)
       */
      override fun jsonBody(): Any? = unwrap(this).getJsonBody()

      /**
       * Redact the indicated HTTP method.
       *
       * The method indicates the type of operation that the request is asking the origin to
       * perform.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-loggingconfiguration-fieldtomatch.html#cfn-wafv2-loggingconfiguration-fieldtomatch-method)
       */
      override fun method(): Any? = unwrap(this).getMethod()

      /**
       * Redact the query string.
       *
       * This is the part of a URL that appears after a `?` character, if any.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-loggingconfiguration-fieldtomatch.html#cfn-wafv2-loggingconfiguration-fieldtomatch-querystring)
       */
      override fun queryString(): Any? = unwrap(this).getQueryString()

      /**
       * Redact a single header.
       *
       * Provide the name of the header to inspect, for example, `User-Agent` or `Referer` . This
       * setting isn't case sensitive.
       *
       * Example JSON: `"SingleHeader": { "Name": "haystack" }`
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-loggingconfiguration-fieldtomatch.html#cfn-wafv2-loggingconfiguration-fieldtomatch-singleheader)
       */
      override fun singleHeader(): Any? = unwrap(this).getSingleHeader()

      /**
       * Redact the request URI path.
       *
       * This is the part of the web request that identifies a resource, for example,
       * `/images/daily-ad.jpg` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-loggingconfiguration-fieldtomatch.html#cfn-wafv2-loggingconfiguration-fieldtomatch-uripath)
       */
      override fun uriPath(): Any? = unwrap(this).getUriPath()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): FieldToMatchProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.wafv2.CfnLoggingConfiguration.FieldToMatchProperty):
          FieldToMatchProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: FieldToMatchProperty):
          software.amazon.awscdk.services.wafv2.CfnLoggingConfiguration.FieldToMatchProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.wafv2.CfnLoggingConfiguration.FieldToMatchProperty
    }
  }

  /**
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.wafv2.*;
   * Object all;
   * MatchPatternProperty matchPatternProperty = MatchPatternProperty.builder()
   * .all(all)
   * .includedPaths(List.of("includedPaths"))
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-loggingconfiguration-matchpattern.html)
   */
  public interface MatchPatternProperty {
    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-loggingconfiguration-matchpattern.html#cfn-wafv2-loggingconfiguration-matchpattern-all)
     */
    public fun all(): Any? = unwrap(this).getAll()

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-loggingconfiguration-matchpattern.html#cfn-wafv2-loggingconfiguration-matchpattern-includedpaths)
     */
    public fun includedPaths(): List<String> = unwrap(this).getIncludedPaths() ?: emptyList()

    /**
     * A builder for [MatchPatternProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param all the value to be set.
       */
      public fun all(all: Any)

      /**
       * @param includedPaths the value to be set.
       */
      public fun includedPaths(includedPaths: List<String>)

      /**
       * @param includedPaths the value to be set.
       */
      public fun includedPaths(vararg includedPaths: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.wafv2.CfnLoggingConfiguration.MatchPatternProperty.Builder
          =
          software.amazon.awscdk.services.wafv2.CfnLoggingConfiguration.MatchPatternProperty.builder()

      /**
       * @param all the value to be set.
       */
      override fun all(all: Any) {
        cdkBuilder.all(all)
      }

      /**
       * @param includedPaths the value to be set.
       */
      override fun includedPaths(includedPaths: List<String>) {
        cdkBuilder.includedPaths(includedPaths)
      }

      /**
       * @param includedPaths the value to be set.
       */
      override fun includedPaths(vararg includedPaths: String): Unit =
          includedPaths(includedPaths.toList())

      public fun build():
          software.amazon.awscdk.services.wafv2.CfnLoggingConfiguration.MatchPatternProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.wafv2.CfnLoggingConfiguration.MatchPatternProperty,
    ) : CdkObject(cdkObject), MatchPatternProperty {
      /**
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-loggingconfiguration-matchpattern.html#cfn-wafv2-loggingconfiguration-matchpattern-all)
       */
      override fun all(): Any? = unwrap(this).getAll()

      /**
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-loggingconfiguration-matchpattern.html#cfn-wafv2-loggingconfiguration-matchpattern-includedpaths)
       */
      override fun includedPaths(): List<String> = unwrap(this).getIncludedPaths() ?: emptyList()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): MatchPatternProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.wafv2.CfnLoggingConfiguration.MatchPatternProperty):
          MatchPatternProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: MatchPatternProperty):
          software.amazon.awscdk.services.wafv2.CfnLoggingConfiguration.MatchPatternProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.wafv2.CfnLoggingConfiguration.MatchPatternProperty
    }
  }

  /**
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.wafv2.*;
   * Object all;
   * JsonBodyProperty jsonBodyProperty = JsonBodyProperty.builder()
   * .matchPattern(MatchPatternProperty.builder()
   * .all(all)
   * .includedPaths(List.of("includedPaths"))
   * .build())
   * .matchScope("matchScope")
   * // the properties below are optional
   * .invalidFallbackBehavior("invalidFallbackBehavior")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-loggingconfiguration-jsonbody.html)
   */
  public interface JsonBodyProperty {
    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-loggingconfiguration-jsonbody.html#cfn-wafv2-loggingconfiguration-jsonbody-invalidfallbackbehavior)
     */
    public fun invalidFallbackBehavior(): String? = unwrap(this).getInvalidFallbackBehavior()

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-loggingconfiguration-jsonbody.html#cfn-wafv2-loggingconfiguration-jsonbody-matchpattern)
     */
    public fun matchPattern(): Any

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-loggingconfiguration-jsonbody.html#cfn-wafv2-loggingconfiguration-jsonbody-matchscope)
     */
    public fun matchScope(): String

    /**
     * A builder for [JsonBodyProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param invalidFallbackBehavior the value to be set.
       */
      public fun invalidFallbackBehavior(invalidFallbackBehavior: String)

      /**
       * @param matchPattern the value to be set. 
       */
      public fun matchPattern(matchPattern: IResolvable)

      /**
       * @param matchPattern the value to be set. 
       */
      public fun matchPattern(matchPattern: MatchPatternProperty)

      /**
       * @param matchPattern the value to be set. 
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("47b476afe276952959a64bd7d77e5444c8c854c6ae0d48aed8f259844a9e3648")
      public fun matchPattern(matchPattern: MatchPatternProperty.Builder.() -> Unit)

      /**
       * @param matchScope the value to be set. 
       */
      public fun matchScope(matchScope: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.wafv2.CfnLoggingConfiguration.JsonBodyProperty.Builder =
          software.amazon.awscdk.services.wafv2.CfnLoggingConfiguration.JsonBodyProperty.builder()

      /**
       * @param invalidFallbackBehavior the value to be set.
       */
      override fun invalidFallbackBehavior(invalidFallbackBehavior: String) {
        cdkBuilder.invalidFallbackBehavior(invalidFallbackBehavior)
      }

      /**
       * @param matchPattern the value to be set. 
       */
      override fun matchPattern(matchPattern: IResolvable) {
        cdkBuilder.matchPattern(matchPattern.let(IResolvable::unwrap))
      }

      /**
       * @param matchPattern the value to be set. 
       */
      override fun matchPattern(matchPattern: MatchPatternProperty) {
        cdkBuilder.matchPattern(matchPattern.let(MatchPatternProperty::unwrap))
      }

      /**
       * @param matchPattern the value to be set. 
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("47b476afe276952959a64bd7d77e5444c8c854c6ae0d48aed8f259844a9e3648")
      override fun matchPattern(matchPattern: MatchPatternProperty.Builder.() -> Unit): Unit =
          matchPattern(MatchPatternProperty(matchPattern))

      /**
       * @param matchScope the value to be set. 
       */
      override fun matchScope(matchScope: String) {
        cdkBuilder.matchScope(matchScope)
      }

      public fun build():
          software.amazon.awscdk.services.wafv2.CfnLoggingConfiguration.JsonBodyProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.wafv2.CfnLoggingConfiguration.JsonBodyProperty,
    ) : CdkObject(cdkObject), JsonBodyProperty {
      /**
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-loggingconfiguration-jsonbody.html#cfn-wafv2-loggingconfiguration-jsonbody-invalidfallbackbehavior)
       */
      override fun invalidFallbackBehavior(): String? = unwrap(this).getInvalidFallbackBehavior()

      /**
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-loggingconfiguration-jsonbody.html#cfn-wafv2-loggingconfiguration-jsonbody-matchpattern)
       */
      override fun matchPattern(): Any = unwrap(this).getMatchPattern()

      /**
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-loggingconfiguration-jsonbody.html#cfn-wafv2-loggingconfiguration-jsonbody-matchscope)
       */
      override fun matchScope(): String = unwrap(this).getMatchScope()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): JsonBodyProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.wafv2.CfnLoggingConfiguration.JsonBodyProperty):
          JsonBodyProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: JsonBodyProperty):
          software.amazon.awscdk.services.wafv2.CfnLoggingConfiguration.JsonBodyProperty = (wrapped
          as CdkObject).cdkObject as
          software.amazon.awscdk.services.wafv2.CfnLoggingConfiguration.JsonBodyProperty
    }
  }
}
