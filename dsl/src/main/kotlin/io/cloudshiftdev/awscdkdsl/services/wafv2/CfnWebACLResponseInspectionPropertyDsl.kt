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
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.wafv2.CfnWebACL

/**
 * The criteria for inspecting responses to login requests, used by the ATP rule group to track
 * login success and failure rates.
 *
 * Response inspection is available only in web ACLs that protect Amazon CloudFront distributions.
 *
 * The rule group evaluates the responses that your protected resources send back to client login
 * attempts, keeping count of successful and failed attempts from each IP address and client
 * session. Using this information, the rule group labels and mitigates requests from client
 * sessions and IP addresses with too much suspicious activity in a short amount of time.
 *
 * This is part of the `AWSManagedRulesATPRuleSet` configuration in `ManagedRuleGroupConfig` .
 *
 * Enable response inspection by configuring exactly one component of the response to inspect, for
 * example, `Header` or `StatusCode` . You can't configure more than one component for inspection.
 * If you don't configure any of the response inspection options, response inspection is disabled.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.wafv2.*;
 * ResponseInspectionProperty responseInspectionProperty = ResponseInspectionProperty.builder()
 * .bodyContains(ResponseInspectionBodyContainsProperty.builder()
 * .failureStrings(List.of("failureStrings"))
 * .successStrings(List.of("successStrings"))
 * .build())
 * .header(ResponseInspectionHeaderProperty.builder()
 * .failureValues(List.of("failureValues"))
 * .name("name")
 * .successValues(List.of("successValues"))
 * .build())
 * .json(ResponseInspectionJsonProperty.builder()
 * .failureValues(List.of("failureValues"))
 * .identifier("identifier")
 * .successValues(List.of("successValues"))
 * .build())
 * .statusCode(ResponseInspectionStatusCodeProperty.builder()
 * .failureCodes(List.of(123))
 * .successCodes(List.of(123))
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-webacl-responseinspection.html)
 */
@CdkDslMarker
public class CfnWebACLResponseInspectionPropertyDsl {
    private val cdkBuilder: CfnWebACL.ResponseInspectionProperty.Builder =
        CfnWebACL.ResponseInspectionProperty.builder()

    /**
     * @param bodyContains Configures inspection of the response body for success and failure
     *   indicators. AWS WAF can inspect the first 65,536 bytes (64 KB) of the response body.
     */
    public fun bodyContains(bodyContains: IResolvable) {
        cdkBuilder.bodyContains(bodyContains)
    }

    /**
     * @param bodyContains Configures inspection of the response body for success and failure
     *   indicators. AWS WAF can inspect the first 65,536 bytes (64 KB) of the response body.
     */
    public fun bodyContains(bodyContains: CfnWebACL.ResponseInspectionBodyContainsProperty) {
        cdkBuilder.bodyContains(bodyContains)
    }

    /**
     * @param header Configures inspection of the response header for success and failure
     *   indicators.
     */
    public fun `header`(`header`: IResolvable) {
        cdkBuilder.`header`(`header`)
    }

    /**
     * @param header Configures inspection of the response header for success and failure
     *   indicators.
     */
    public fun `header`(`header`: CfnWebACL.ResponseInspectionHeaderProperty) {
        cdkBuilder.`header`(`header`)
    }

    /**
     * @param json Configures inspection of the response JSON for success and failure indicators.
     *   AWS WAF can inspect the first 65,536 bytes (64 KB) of the response JSON.
     */
    public fun json(json: IResolvable) {
        cdkBuilder.json(json)
    }

    /**
     * @param json Configures inspection of the response JSON for success and failure indicators.
     *   AWS WAF can inspect the first 65,536 bytes (64 KB) of the response JSON.
     */
    public fun json(json: CfnWebACL.ResponseInspectionJsonProperty) {
        cdkBuilder.json(json)
    }

    /**
     * @param statusCode Configures inspection of the response status code for success and failure
     *   indicators.
     */
    public fun statusCode(statusCode: IResolvable) {
        cdkBuilder.statusCode(statusCode)
    }

    /**
     * @param statusCode Configures inspection of the response status code for success and failure
     *   indicators.
     */
    public fun statusCode(statusCode: CfnWebACL.ResponseInspectionStatusCodeProperty) {
        cdkBuilder.statusCode(statusCode)
    }

    public fun build(): CfnWebACL.ResponseInspectionProperty = cdkBuilder.build()
}
