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

package cloudshift.awscdk.dsl.services.wafv2

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.wafv2.CfnWebACL

/**
 * Details for your use of the account takeover prevention managed rule group,
 * `AWSManagedRulesATPRuleSet` .
 *
 * This configuration is used in `ManagedRuleGroupConfig` .
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.wafv2.*;
 * AWSManagedRulesATPRuleSetProperty aWSManagedRulesATPRuleSetProperty =
 * AWSManagedRulesATPRuleSetProperty.builder()
 * .loginPath("loginPath")
 * // the properties below are optional
 * .enableRegexInPath(false)
 * .requestInspection(RequestInspectionProperty.builder()
 * .passwordField(FieldIdentifierProperty.builder()
 * .identifier("identifier")
 * .build())
 * .payloadType("payloadType")
 * .usernameField(FieldIdentifierProperty.builder()
 * .identifier("identifier")
 * .build())
 * .build())
 * .responseInspection(ResponseInspectionProperty.builder()
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
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-webacl-awsmanagedrulesatpruleset.html)
 */
@CdkDslMarker
public class CfnWebACLAWSManagedRulesATPRuleSetPropertyDsl {
    private val cdkBuilder: CfnWebACL.AWSManagedRulesATPRuleSetProperty.Builder =
        CfnWebACL.AWSManagedRulesATPRuleSetProperty.builder()

    /** @param enableRegexInPath the value to be set. */
    public fun enableRegexInPath(enableRegexInPath: Boolean) {
        cdkBuilder.enableRegexInPath(enableRegexInPath)
    }

    /** @param enableRegexInPath the value to be set. */
    public fun enableRegexInPath(enableRegexInPath: IResolvable) {
        cdkBuilder.enableRegexInPath(enableRegexInPath)
    }

    /**
     * @param loginPath The path of the login endpoint for your application. For example, for the
     *   URL `https://example.com/web/login` , you would provide the path `/web/login` .
     *
     * The rule group inspects only HTTP `POST` requests to your specified login endpoint.
     */
    public fun loginPath(loginPath: String) {
        cdkBuilder.loginPath(loginPath)
    }

    /**
     * @param requestInspection The criteria for inspecting login requests, used by the ATP rule
     *   group to validate credentials usage.
     */
    public fun requestInspection(requestInspection: IResolvable) {
        cdkBuilder.requestInspection(requestInspection)
    }

    /**
     * @param requestInspection The criteria for inspecting login requests, used by the ATP rule
     *   group to validate credentials usage.
     */
    public fun requestInspection(requestInspection: CfnWebACL.RequestInspectionProperty) {
        cdkBuilder.requestInspection(requestInspection)
    }

    /**
     * @param responseInspection The criteria for inspecting responses to login requests, used by
     *   the ATP rule group to track login failure rates. The ATP rule group evaluates the responses
     *   that your protected resources send back to client login attempts, keeping count of
     *   successful and failed attempts from each IP address and client session. Using this
     *   information, the rule group labels and mitigates requests from client sessions and IP
     *   addresses that submit too many failed login attempts in a short amount of time.
     *
     * Response inspection is available only in web ACLs that protect Amazon CloudFront
     * distributions.
     */
    public fun responseInspection(responseInspection: IResolvable) {
        cdkBuilder.responseInspection(responseInspection)
    }

    /**
     * @param responseInspection The criteria for inspecting responses to login requests, used by
     *   the ATP rule group to track login failure rates. The ATP rule group evaluates the responses
     *   that your protected resources send back to client login attempts, keeping count of
     *   successful and failed attempts from each IP address and client session. Using this
     *   information, the rule group labels and mitigates requests from client sessions and IP
     *   addresses that submit too many failed login attempts in a short amount of time.
     *
     * Response inspection is available only in web ACLs that protect Amazon CloudFront
     * distributions.
     */
    public fun responseInspection(responseInspection: CfnWebACL.ResponseInspectionProperty) {
        cdkBuilder.responseInspection(responseInspection)
    }

    public fun build(): CfnWebACL.AWSManagedRulesATPRuleSetProperty = cdkBuilder.build()
}
