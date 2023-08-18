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
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.xray.*;
 * SamplingRuleUpdateProperty samplingRuleUpdateProperty = SamplingRuleUpdateProperty.builder()
 * .attributes(Map.of(
 * "attributesKey", "attributes"))
 * .fixedRate(123)
 * .host("host")
 * .httpMethod("httpMethod")
 * .priority(123)
 * .reservoirSize(123)
 * .resourceArn("resourceArn")
 * .ruleArn("ruleArn")
 * .ruleName("ruleName")
 * .serviceName("serviceName")
 * .serviceType("serviceType")
 * .urlPath("urlPath")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-xray-samplingrule-samplingruleupdate.html)
 */
@CdkDslMarker
public class CfnSamplingRuleSamplingRuleUpdatePropertyDsl {
    private val cdkBuilder: CfnSamplingRule.SamplingRuleUpdateProperty.Builder =
        CfnSamplingRule.SamplingRuleUpdateProperty.builder()

    /** @param attributes Matches attributes derived from the request. */
    public fun attributes(attributes: Map<String, String>) {
        cdkBuilder.attributes(attributes)
    }

    /** @param attributes Matches attributes derived from the request. */
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

    /** @param httpMethod Matches the HTTP method from a request URL. */
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
     */
    public fun ruleArn(ruleArn: String) {
        cdkBuilder.ruleArn(ruleArn)
    }

    /**
     * @param ruleName The ARN of the sampling rule. Specify a rule by either name or ARN, but not
     *   both.
     */
    public fun ruleName(ruleName: String) {
        cdkBuilder.ruleName(ruleName)
    }

    /** @param serviceName Matches the name that the service uses to identify itself in segments. */
    public fun serviceName(serviceName: String) {
        cdkBuilder.serviceName(serviceName)
    }

    /**
     * @param serviceType Matches the origin that the service uses to identify its type in segments.
     */
    public fun serviceType(serviceType: String) {
        cdkBuilder.serviceType(serviceType)
    }

    /** @param urlPath Matches the path from a request URL. */
    public fun urlPath(urlPath: String) {
        cdkBuilder.urlPath(urlPath)
    }

    public fun build(): CfnSamplingRule.SamplingRuleUpdateProperty = cdkBuilder.build()
}
