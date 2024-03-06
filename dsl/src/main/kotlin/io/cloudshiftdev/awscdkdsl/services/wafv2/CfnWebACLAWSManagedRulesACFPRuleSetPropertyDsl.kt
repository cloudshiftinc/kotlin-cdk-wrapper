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
import kotlin.Boolean
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.wafv2.CfnWebACL

/**
 * Details for your use of the account creation fraud prevention managed rule group,
 * `AWSManagedRulesACFPRuleSet` .
 *
 * This configuration is used in `ManagedRuleGroupConfig` .
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.wafv2.*;
 * AWSManagedRulesACFPRuleSetProperty aWSManagedRulesACFPRuleSetProperty =
 * AWSManagedRulesACFPRuleSetProperty.builder()
 * .creationPath("creationPath")
 * .registrationPagePath("registrationPagePath")
 * .requestInspection(RequestInspectionACFPProperty.builder()
 * .payloadType("payloadType")
 * // the properties below are optional
 * .addressFields(List.of(FieldIdentifierProperty.builder()
 * .identifier("identifier")
 * .build()))
 * .emailField(FieldIdentifierProperty.builder()
 * .identifier("identifier")
 * .build())
 * .passwordField(FieldIdentifierProperty.builder()
 * .identifier("identifier")
 * .build())
 * .phoneNumberFields(List.of(FieldIdentifierProperty.builder()
 * .identifier("identifier")
 * .build()))
 * .usernameField(FieldIdentifierProperty.builder()
 * .identifier("identifier")
 * .build())
 * .build())
 * // the properties below are optional
 * .enableRegexInPath(false)
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
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-webacl-awsmanagedrulesacfpruleset.html)
 */
@CdkDslMarker
public class CfnWebACLAWSManagedRulesACFPRuleSetPropertyDsl {
    private val cdkBuilder: CfnWebACL.AWSManagedRulesACFPRuleSetProperty.Builder =
        CfnWebACL.AWSManagedRulesACFPRuleSetProperty.builder()

    /**
     * @param creationPath The path of the account creation endpoint for your application. This is
     *   the page on your website that accepts the completed registration form for a new user. This
     *   page must accept `POST` requests.
     *
     * For example, for the URL `https://example.com/web/newaccount` , you would provide the path
     * `/web/newaccount` . Account creation page paths that start with the path that you provide are
     * considered a match. For example `/web/newaccount` matches the account creation paths
     * `/web/newaccount` , `/web/newaccount/` , `/web/newaccountPage` , and
     * `/web/newaccount/thisPage` , but doesn't match the path `/home/web/newaccount` or
     * `/website/newaccount` .
     */
    public fun creationPath(creationPath: String) {
        cdkBuilder.creationPath(creationPath)
    }

    /**
     * @param enableRegexInPath Allow the use of regular expressions in the registration page path
     *   and the account creation path.
     */
    public fun enableRegexInPath(enableRegexInPath: Boolean) {
        cdkBuilder.enableRegexInPath(enableRegexInPath)
    }

    /**
     * @param enableRegexInPath Allow the use of regular expressions in the registration page path
     *   and the account creation path.
     */
    public fun enableRegexInPath(enableRegexInPath: IResolvable) {
        cdkBuilder.enableRegexInPath(enableRegexInPath)
    }

    /**
     * @param registrationPagePath The path of the account registration endpoint for your
     *   application.
     *
     * This is the page on your website that presents the registration form to new users.
     *
     * This page must accept `GET` text/html requests.
     *
     * For example, for the URL `https://example.com/web/registration` , you would provide the path
     * `/web/registration` . Registration page paths that start with the path that you provide are
     * considered a match. For example `/web/registration` matches the registration paths
     * `/web/registration` , `/web/registration/` , `/web/registrationPage` , and
     * `/web/registration/thisPage` , but doesn't match the path `/home/web/registration` or
     * `/website/registration` .
     */
    public fun registrationPagePath(registrationPagePath: String) {
        cdkBuilder.registrationPagePath(registrationPagePath)
    }

    /**
     * @param requestInspection The criteria for inspecting account creation requests, used by the
     *   ACFP rule group to validate and track account creation attempts.
     */
    public fun requestInspection(requestInspection: IResolvable) {
        cdkBuilder.requestInspection(requestInspection)
    }

    /**
     * @param requestInspection The criteria for inspecting account creation requests, used by the
     *   ACFP rule group to validate and track account creation attempts.
     */
    public fun requestInspection(requestInspection: CfnWebACL.RequestInspectionACFPProperty) {
        cdkBuilder.requestInspection(requestInspection)
    }

    /**
     * @param responseInspection The criteria for inspecting responses to account creation requests,
     *   used by the ACFP rule group to track account creation success rates.
     *
     * Response inspection is available only in web ACLs that protect Amazon CloudFront
     * distributions.
     *
     * The ACFP rule group evaluates the responses that your protected resources send back to client
     * account creation attempts, keeping count of successful and failed attempts from each IP
     * address and client session. Using this information, the rule group labels and mitigates
     * requests from client sessions and IP addresses that have had too many successful account
     * creation attempts in a short amount of time.
     */
    public fun responseInspection(responseInspection: IResolvable) {
        cdkBuilder.responseInspection(responseInspection)
    }

    /**
     * @param responseInspection The criteria for inspecting responses to account creation requests,
     *   used by the ACFP rule group to track account creation success rates.
     *
     * Response inspection is available only in web ACLs that protect Amazon CloudFront
     * distributions.
     *
     * The ACFP rule group evaluates the responses that your protected resources send back to client
     * account creation attempts, keeping count of successful and failed attempts from each IP
     * address and client session. Using this information, the rule group labels and mitigates
     * requests from client sessions and IP addresses that have had too many successful account
     * creation attempts in a short amount of time.
     */
    public fun responseInspection(responseInspection: CfnWebACL.ResponseInspectionProperty) {
        cdkBuilder.responseInspection(responseInspection)
    }

    public fun build(): CfnWebACL.AWSManagedRulesACFPRuleSetProperty = cdkBuilder.build()
}
