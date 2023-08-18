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
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.wafv2.CfnWebACL

/**
 * Additional information that's used by a managed rule group. Many managed rule groups don't
 * require this.
 *
 * The rule groups used for intelligent threat mitigation require additional configuration:
 * * Use the `AWSManagedRulesATPRuleSet` configuration object to configure the account takeover
 *   prevention managed rule group. The configuration includes the sign-in page of your application
 *   and the locations in the login request payload of data such as the username and password.
 * * Use the `AWSManagedRulesBotControlRuleSet` configuration object to configure the protection
 *   level that you want the Bot Control rule group to use.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.wafv2.*;
 * ManagedRuleGroupConfigProperty managedRuleGroupConfigProperty =
 * ManagedRuleGroupConfigProperty.builder()
 * .awsManagedRulesAcfpRuleSet(AWSManagedRulesACFPRuleSetProperty.builder()
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
 * .build())
 * .awsManagedRulesAtpRuleSet(AWSManagedRulesATPRuleSetProperty.builder()
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
 * .build())
 * .awsManagedRulesBotControlRuleSet(AWSManagedRulesBotControlRuleSetProperty.builder()
 * .inspectionLevel("inspectionLevel")
 * .build())
 * .loginPath("loginPath")
 * .passwordField(FieldIdentifierProperty.builder()
 * .identifier("identifier")
 * .build())
 * .payloadType("payloadType")
 * .usernameField(FieldIdentifierProperty.builder()
 * .identifier("identifier")
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-webacl-managedrulegroupconfig.html)
 */
@CdkDslMarker
public class CfnWebACLManagedRuleGroupConfigPropertyDsl {
    private val cdkBuilder: CfnWebACL.ManagedRuleGroupConfigProperty.Builder =
        CfnWebACL.ManagedRuleGroupConfigProperty.builder()

    /** @param awsManagedRulesAcfpRuleSet Not currently supported by AWS CloudFormation . */
    public fun awsManagedRulesAcfpRuleSet(awsManagedRulesAcfpRuleSet: IResolvable) {
        cdkBuilder.awsManagedRulesAcfpRuleSet(awsManagedRulesAcfpRuleSet)
    }

    /** @param awsManagedRulesAcfpRuleSet Not currently supported by AWS CloudFormation . */
    public fun awsManagedRulesAcfpRuleSet(
        awsManagedRulesAcfpRuleSet: CfnWebACL.AWSManagedRulesACFPRuleSetProperty
    ) {
        cdkBuilder.awsManagedRulesAcfpRuleSet(awsManagedRulesAcfpRuleSet)
    }

    /**
     * @param awsManagedRulesAtpRuleSet Additional configuration for using the account takeover
     *   prevention (ATP) managed rule group, `AWSManagedRulesATPRuleSet` . Use this to provide
     *   login request information to the rule group. For web ACLs that protect CloudFront
     *   distributions, use this to also provide the information about how your distribution
     *   responds to login requests.
     *
     * This configuration replaces the individual configuration fields in `ManagedRuleGroupConfig`
     * and provides additional feature configuration.
     *
     * For information about using the ATP managed rule group, see
     * [AWS WAF Fraud Control account takeover prevention (ATP) rule group](https://docs.aws.amazon.com/waf/latest/developerguide/aws-managed-rule-groups-atp.html)
     * and
     * [AWS WAF Fraud Control account takeover prevention (ATP)](https://docs.aws.amazon.com/waf/latest/developerguide/waf-atp.html)
     * in the *AWS WAF Developer Guide* .
     */
    public fun awsManagedRulesAtpRuleSet(awsManagedRulesAtpRuleSet: IResolvable) {
        cdkBuilder.awsManagedRulesAtpRuleSet(awsManagedRulesAtpRuleSet)
    }

    /**
     * @param awsManagedRulesAtpRuleSet Additional configuration for using the account takeover
     *   prevention (ATP) managed rule group, `AWSManagedRulesATPRuleSet` . Use this to provide
     *   login request information to the rule group. For web ACLs that protect CloudFront
     *   distributions, use this to also provide the information about how your distribution
     *   responds to login requests.
     *
     * This configuration replaces the individual configuration fields in `ManagedRuleGroupConfig`
     * and provides additional feature configuration.
     *
     * For information about using the ATP managed rule group, see
     * [AWS WAF Fraud Control account takeover prevention (ATP) rule group](https://docs.aws.amazon.com/waf/latest/developerguide/aws-managed-rule-groups-atp.html)
     * and
     * [AWS WAF Fraud Control account takeover prevention (ATP)](https://docs.aws.amazon.com/waf/latest/developerguide/waf-atp.html)
     * in the *AWS WAF Developer Guide* .
     */
    public fun awsManagedRulesAtpRuleSet(
        awsManagedRulesAtpRuleSet: CfnWebACL.AWSManagedRulesATPRuleSetProperty
    ) {
        cdkBuilder.awsManagedRulesAtpRuleSet(awsManagedRulesAtpRuleSet)
    }

    /**
     * @param awsManagedRulesBotControlRuleSet Additional configuration for using the Bot Control
     *   managed rule group. Use this to specify the inspection level that you want to use. For
     *   information about using the Bot Control managed rule group, see
     *   [AWS WAF Bot Control rule group](https://docs.aws.amazon.com/waf/latest/developerguide/aws-managed-rule-groups-bot.html)
     *   and
     *   [AWS WAF Bot Control](https://docs.aws.amazon.com/waf/latest/developerguide/waf-bot-control.html)
     *   in the *AWS WAF Developer Guide* .
     */
    public fun awsManagedRulesBotControlRuleSet(awsManagedRulesBotControlRuleSet: IResolvable) {
        cdkBuilder.awsManagedRulesBotControlRuleSet(awsManagedRulesBotControlRuleSet)
    }

    /**
     * @param awsManagedRulesBotControlRuleSet Additional configuration for using the Bot Control
     *   managed rule group. Use this to specify the inspection level that you want to use. For
     *   information about using the Bot Control managed rule group, see
     *   [AWS WAF Bot Control rule group](https://docs.aws.amazon.com/waf/latest/developerguide/aws-managed-rule-groups-bot.html)
     *   and
     *   [AWS WAF Bot Control](https://docs.aws.amazon.com/waf/latest/developerguide/waf-bot-control.html)
     *   in the *AWS WAF Developer Guide* .
     */
    public fun awsManagedRulesBotControlRuleSet(
        awsManagedRulesBotControlRuleSet: CfnWebACL.AWSManagedRulesBotControlRuleSetProperty
    ) {
        cdkBuilder.awsManagedRulesBotControlRuleSet(awsManagedRulesBotControlRuleSet)
    }

    /**
     * @param loginPath Instead of this setting, provide your configuration under
     *   `AWSManagedRulesATPRuleSet` .
     */
    public fun loginPath(loginPath: String) {
        cdkBuilder.loginPath(loginPath)
    }

    /**
     * @param passwordField Instead of this setting, provide your configuration under the request
     *   inspection configuration for `AWSManagedRulesATPRuleSet` .
     */
    public fun passwordField(passwordField: IResolvable) {
        cdkBuilder.passwordField(passwordField)
    }

    /**
     * @param passwordField Instead of this setting, provide your configuration under the request
     *   inspection configuration for `AWSManagedRulesATPRuleSet` .
     */
    public fun passwordField(passwordField: CfnWebACL.FieldIdentifierProperty) {
        cdkBuilder.passwordField(passwordField)
    }

    /**
     * @param payloadType Instead of this setting, provide your configuration under the request
     *   inspection configuration for `AWSManagedRulesATPRuleSet` .
     */
    public fun payloadType(payloadType: String) {
        cdkBuilder.payloadType(payloadType)
    }

    /**
     * @param usernameField Instead of this setting, provide your configuration under the request
     *   inspection configuration for `AWSManagedRulesATPRuleSet` .
     */
    public fun usernameField(usernameField: IResolvable) {
        cdkBuilder.usernameField(usernameField)
    }

    /**
     * @param usernameField Instead of this setting, provide your configuration under the request
     *   inspection configuration for `AWSManagedRulesATPRuleSet` .
     */
    public fun usernameField(usernameField: CfnWebACL.FieldIdentifierProperty) {
        cdkBuilder.usernameField(usernameField)
    }

    public fun build(): CfnWebACL.ManagedRuleGroupConfigProperty = cdkBuilder.build()
}
