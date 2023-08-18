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

package io.cloudshiftdev.awscdkdsl.services.wafv2

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import io.cloudshiftdev.awscdkdsl.common.MapBuilder
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.wafv2.CfnLoggingConfigurationProps

/**
 * Properties for defining a `CfnLoggingConfiguration`.
 *
 * Example:
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
 * CfnLoggingConfigurationProps cfnLoggingConfigurationProps =
 * CfnLoggingConfigurationProps.builder()
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
public class CfnLoggingConfigurationPropsDsl {
    private val cdkBuilder: CfnLoggingConfigurationProps.Builder =
        CfnLoggingConfigurationProps.builder()

    private val _logDestinationConfigs: MutableList<String> = mutableListOf()

    private val _redactedFields: MutableList<Any> = mutableListOf()

    /**
     * @param logDestinationConfigs The logging destination configuration that you want to associate
     *   with the web ACL.
     *
     * You can associate one logging destination to a web ACL.
     */
    public fun logDestinationConfigs(vararg logDestinationConfigs: String) {
        _logDestinationConfigs.addAll(listOf(*logDestinationConfigs))
    }

    /**
     * @param logDestinationConfigs The logging destination configuration that you want to associate
     *   with the web ACL.
     *
     * You can associate one logging destination to a web ACL.
     */
    public fun logDestinationConfigs(logDestinationConfigs: Collection<String>) {
        _logDestinationConfigs.addAll(logDestinationConfigs)
    }

    /**
     * @param loggingFilter Filtering that specifies which web requests are kept in the logs and
     *   which are dropped. You can filter on the rule action and on the web request labels that
     *   were applied by matching rules during web ACL evaluation.
     */
    public fun loggingFilter(loggingFilter: MapBuilder.() -> Unit = {}) {
        val builder = MapBuilder()
        builder.apply(loggingFilter)
        cdkBuilder.loggingFilter(builder.map)
    }

    /**
     * @param loggingFilter Filtering that specifies which web requests are kept in the logs and
     *   which are dropped. You can filter on the rule action and on the web request labels that
     *   were applied by matching rules during web ACL evaluation.
     */
    public fun loggingFilter(loggingFilter: Any) {
        cdkBuilder.loggingFilter(loggingFilter)
    }

    /**
     * @param redactedFields The parts of the request that you want to keep out of the logs. For
     *   example, if you redact the `SingleHeader` field, the `HEADER` field in the logs will be
     *   `REDACTED` for all rules that use the `SingleHeader` `FieldToMatch` setting.
     *
     * Redaction applies only to the component that's specified in the rule's `FieldToMatch`
     * setting, so the `SingleHeader` redaction doesn't apply to rules that use the `Headers`
     * `FieldToMatch` .
     *
     * You can specify only the following fields for redaction: `UriPath` , `QueryString` ,
     * `SingleHeader` , and `Method` .
     */
    public fun redactedFields(vararg redactedFields: Any) {
        _redactedFields.addAll(listOf(*redactedFields))
    }

    /**
     * @param redactedFields The parts of the request that you want to keep out of the logs. For
     *   example, if you redact the `SingleHeader` field, the `HEADER` field in the logs will be
     *   `REDACTED` for all rules that use the `SingleHeader` `FieldToMatch` setting.
     *
     * Redaction applies only to the component that's specified in the rule's `FieldToMatch`
     * setting, so the `SingleHeader` redaction doesn't apply to rules that use the `Headers`
     * `FieldToMatch` .
     *
     * You can specify only the following fields for redaction: `UriPath` , `QueryString` ,
     * `SingleHeader` , and `Method` .
     */
    public fun redactedFields(redactedFields: Collection<Any>) {
        _redactedFields.addAll(redactedFields)
    }

    /**
     * @param redactedFields The parts of the request that you want to keep out of the logs. For
     *   example, if you redact the `SingleHeader` field, the `HEADER` field in the logs will be
     *   `REDACTED` for all rules that use the `SingleHeader` `FieldToMatch` setting.
     *
     * Redaction applies only to the component that's specified in the rule's `FieldToMatch`
     * setting, so the `SingleHeader` redaction doesn't apply to rules that use the `Headers`
     * `FieldToMatch` .
     *
     * You can specify only the following fields for redaction: `UriPath` , `QueryString` ,
     * `SingleHeader` , and `Method` .
     */
    public fun redactedFields(redactedFields: IResolvable) {
        cdkBuilder.redactedFields(redactedFields)
    }

    /**
     * @param resourceArn The Amazon Resource Name (ARN) of the web ACL that you want to associate
     *   with `LogDestinationConfigs` .
     */
    public fun resourceArn(resourceArn: String) {
        cdkBuilder.resourceArn(resourceArn)
    }

    public fun build(): CfnLoggingConfigurationProps {
        if (_logDestinationConfigs.isNotEmpty())
            cdkBuilder.logDestinationConfigs(_logDestinationConfigs)
        if (_redactedFields.isNotEmpty()) cdkBuilder.redactedFields(_redactedFields)
        return cdkBuilder.build()
    }
}
