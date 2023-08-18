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

package io.cloudshiftdev.awscdkdsl.services.xray

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import kotlin.collections.Map
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.xray.CfnSamplingRule

/**
 * A sampling rule that services use to decide whether to instrument a request.
 *
 * Rule fields can match properties of the service, or properties of a request. The service can
 * ignore rules that don't match its properties.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.xray.*;
 * SamplingRuleProperty samplingRuleProperty = SamplingRuleProperty.builder()
 * .fixedRate(123)
 * .host("host")
 * .httpMethod("httpMethod")
 * .priority(123)
 * .reservoirSize(123)
 * .resourceArn("resourceArn")
 * .serviceName("serviceName")
 * .serviceType("serviceType")
 * .urlPath("urlPath")
 * // the properties below are optional
 * .attributes(Map.of(
 * "attributesKey", "attributes"))
 * .ruleArn("ruleArn")
 * .ruleName("ruleName")
 * .version(123)
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-xray-samplingrule-samplingrule.html)
 */
@CdkDslMarker
public class CfnSamplingRuleSamplingRulePropertyDsl {
    private val cdkBuilder: CfnSamplingRule.SamplingRuleProperty.Builder =
        CfnSamplingRule.SamplingRuleProperty.builder()

    /**
     * @param attributes Matches attributes derived from the request. *Map Entries:* Maximum number
     *   of 5 items.
     *
     * *Key Length Constraints:* Minimum length of 1. Maximum length of 32.
     *
     * *Value Length Constraints:* Minimum length of 1. Maximum length of 32.
     */
    public fun attributes(attributes: Map<String, String>) {
        cdkBuilder.attributes(attributes)
    }

    /**
     * @param attributes Matches attributes derived from the request. *Map Entries:* Maximum number
     *   of 5 items.
     *
     * *Key Length Constraints:* Minimum length of 1. Maximum length of 32.
     *
     * *Value Length Constraints:* Minimum length of 1. Maximum length of 32.
     */
    public fun attributes(attributes: IResolvable) {
        cdkBuilder.attributes(attributes)
    }

    /**
     * @param fixedRate The percentage of matching requests to instrument, after the reservoir is
     *   exhausted.
     */
    public fun fixedRate(fixedRate: Number) {
        cdkBuilder.fixedRate(fixedRate)
    }

    /** @param host Matches the hostname from a request URL. */
    public fun host(host: String) {
        cdkBuilder.host(host)
    }

    /** @param httpMethod Matches the HTTP method of a request. */
    public fun httpMethod(httpMethod: String) {
        cdkBuilder.httpMethod(httpMethod)
    }

    /** @param priority The priority of the sampling rule. */
    public fun priority(priority: Number) {
        cdkBuilder.priority(priority)
    }

    /**
     * @param reservoirSize A fixed number of matching requests to instrument per second, prior to
     *   applying the fixed rate. The reservoir is not used directly by services, but applies to all
     *   services using the rule collectively.
     */
    public fun reservoirSize(reservoirSize: Number) {
        cdkBuilder.reservoirSize(reservoirSize)
    }

    /** @param resourceArn Matches the ARN of the AWS resource on which the service runs. */
    public fun resourceArn(resourceArn: String) {
        cdkBuilder.resourceArn(resourceArn)
    }

    /**
     * @param ruleArn The ARN of the sampling rule. Specify a rule by either name or ARN, but not
     *   both.
     *
     * Specifying a sampling rule by name is recommended, as specifying by ARN will be deprecated in
     * future.
     */
    public fun ruleArn(ruleArn: String) {
        cdkBuilder.ruleArn(ruleArn)
    }

    /**
     * @param ruleName The name of the sampling rule. Specify a rule by either name or ARN, but not
     *   both.
     */
    public fun ruleName(ruleName: String) {
        cdkBuilder.ruleName(ruleName)
    }

    /**
     * @param serviceName Matches the `name` that the service uses to identify itself in segments.
     */
    public fun serviceName(serviceName: String) {
        cdkBuilder.serviceName(serviceName)
    }

    /**
     * @param serviceType Matches the `origin` that the service uses to identify its type in
     *   segments.
     */
    public fun serviceType(serviceType: String) {
        cdkBuilder.serviceType(serviceType)
    }

    /** @param urlPath Matches the path from a request URL. */
    public fun urlPath(urlPath: String) {
        cdkBuilder.urlPath(urlPath)
    }

    /**
     * @param version The version of the sampling rule. `Version` can only be set when creating a
     *   new sampling rule.
     */
    public fun version(version: Number) {
        cdkBuilder.version(version)
    }

    public fun build(): CfnSamplingRule.SamplingRuleProperty = cdkBuilder.build()
}
