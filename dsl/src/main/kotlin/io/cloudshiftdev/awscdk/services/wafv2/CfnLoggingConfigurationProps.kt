package io.cloudshiftdev.awscdk.services.wafv2

import io.cloudshiftdev.awscdk.CdkObject
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

public interface CfnLoggingConfigurationProps {
  /**
   * The logging destination configuration that you want to associate with the web ACL.
   *
   *
   * You can associate one logging destination to a web ACL.
   *
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wafv2-loggingconfiguration.html#cfn-wafv2-loggingconfiguration-logdestinationconfigs)
   */
  public fun logDestinationConfigs(): List<String>

  /**
   * Filtering that specifies which web requests are kept in the logs and which are dropped.
   *
   * You can filter on the rule action and on the web request labels that were applied by matching
   * rules during web ACL evaluation.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wafv2-loggingconfiguration.html#cfn-wafv2-loggingconfiguration-loggingfilter)
   */
  public fun loggingFilter(): Any? = unwrap(this).getLoggingFilter()

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
   */
  public fun redactedFields(): Any? = unwrap(this).getRedactedFields()

  /**
   * The Amazon Resource Name (ARN) of the web ACL that you want to associate with
   * `LogDestinationConfigs` .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wafv2-loggingconfiguration.html#cfn-wafv2-loggingconfiguration-resourcearn)
   */
  public fun resourceArn(): String

  /**
   * A builder for [CfnLoggingConfigurationProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param logDestinationConfigs The logging destination configuration that you want to associate
     * with the web ACL. 
     *
     * You can associate one logging destination to a web ACL.
     */
    public fun logDestinationConfigs(logDestinationConfigs: List<String>)

    /**
     * @param logDestinationConfigs The logging destination configuration that you want to associate
     * with the web ACL. 
     *
     * You can associate one logging destination to a web ACL.
     */
    public fun logDestinationConfigs(vararg logDestinationConfigs: String)

    /**
     * @param loggingFilter Filtering that specifies which web requests are kept in the logs and
     * which are dropped.
     * You can filter on the rule action and on the web request labels that were applied by matching
     * rules during web ACL evaluation.
     */
    public fun loggingFilter(loggingFilter: Any)

    /**
     * @param redactedFields The parts of the request that you want to keep out of the logs.
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
     */
    public fun redactedFields(redactedFields: IResolvable)

    /**
     * @param redactedFields The parts of the request that you want to keep out of the logs.
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
     */
    public fun redactedFields(redactedFields: List<Any>)

    /**
     * @param redactedFields The parts of the request that you want to keep out of the logs.
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
     */
    public fun redactedFields(vararg redactedFields: Any)

    /**
     * @param resourceArn The Amazon Resource Name (ARN) of the web ACL that you want to associate
     * with `LogDestinationConfigs` . 
     */
    public fun resourceArn(resourceArn: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.wafv2.CfnLoggingConfigurationProps.Builder =
        software.amazon.awscdk.services.wafv2.CfnLoggingConfigurationProps.builder()

    /**
     * @param logDestinationConfigs The logging destination configuration that you want to associate
     * with the web ACL. 
     *
     * You can associate one logging destination to a web ACL.
     */
    override fun logDestinationConfigs(logDestinationConfigs: List<String>) {
      cdkBuilder.logDestinationConfigs(logDestinationConfigs)
    }

    /**
     * @param logDestinationConfigs The logging destination configuration that you want to associate
     * with the web ACL. 
     *
     * You can associate one logging destination to a web ACL.
     */
    override fun logDestinationConfigs(vararg logDestinationConfigs: String): Unit =
        logDestinationConfigs(logDestinationConfigs.toList())

    /**
     * @param loggingFilter Filtering that specifies which web requests are kept in the logs and
     * which are dropped.
     * You can filter on the rule action and on the web request labels that were applied by matching
     * rules during web ACL evaluation.
     */
    override fun loggingFilter(loggingFilter: Any) {
      cdkBuilder.loggingFilter(loggingFilter)
    }

    /**
     * @param redactedFields The parts of the request that you want to keep out of the logs.
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
     */
    override fun redactedFields(redactedFields: IResolvable) {
      cdkBuilder.redactedFields(redactedFields.let(IResolvable::unwrap))
    }

    /**
     * @param redactedFields The parts of the request that you want to keep out of the logs.
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
     */
    override fun redactedFields(redactedFields: List<Any>) {
      cdkBuilder.redactedFields(redactedFields)
    }

    /**
     * @param redactedFields The parts of the request that you want to keep out of the logs.
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
     */
    override fun redactedFields(vararg redactedFields: Any): Unit =
        redactedFields(redactedFields.toList())

    /**
     * @param resourceArn The Amazon Resource Name (ARN) of the web ACL that you want to associate
     * with `LogDestinationConfigs` . 
     */
    override fun resourceArn(resourceArn: String) {
      cdkBuilder.resourceArn(resourceArn)
    }

    public fun build(): software.amazon.awscdk.services.wafv2.CfnLoggingConfigurationProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.wafv2.CfnLoggingConfigurationProps,
  ) : CdkObject(cdkObject), CfnLoggingConfigurationProps {
    /**
     * The logging destination configuration that you want to associate with the web ACL.
     *
     *
     * You can associate one logging destination to a web ACL.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wafv2-loggingconfiguration.html#cfn-wafv2-loggingconfiguration-logdestinationconfigs)
     */
    override fun logDestinationConfigs(): List<String> = unwrap(this).getLogDestinationConfigs()

    /**
     * Filtering that specifies which web requests are kept in the logs and which are dropped.
     *
     * You can filter on the rule action and on the web request labels that were applied by matching
     * rules during web ACL evaluation.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wafv2-loggingconfiguration.html#cfn-wafv2-loggingconfiguration-loggingfilter)
     */
    override fun loggingFilter(): Any? = unwrap(this).getLoggingFilter()

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
     */
    override fun redactedFields(): Any? = unwrap(this).getRedactedFields()

    /**
     * The Amazon Resource Name (ARN) of the web ACL that you want to associate with
     * `LogDestinationConfigs` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wafv2-loggingconfiguration.html#cfn-wafv2-loggingconfiguration-resourcearn)
     */
    override fun resourceArn(): String = unwrap(this).getResourceArn()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnLoggingConfigurationProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.wafv2.CfnLoggingConfigurationProps):
        CfnLoggingConfigurationProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnLoggingConfigurationProps):
        software.amazon.awscdk.services.wafv2.CfnLoggingConfigurationProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.wafv2.CfnLoggingConfigurationProps
  }
}
