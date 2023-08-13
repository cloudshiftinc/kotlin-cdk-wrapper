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

    /** @param creationPath the value to be set. */
    public fun creationPath(creationPath: String) {
        cdkBuilder.creationPath(creationPath)
    }

    /** @param enableRegexInPath the value to be set. */
    public fun enableRegexInPath(enableRegexInPath: Boolean) {
        cdkBuilder.enableRegexInPath(enableRegexInPath)
    }

    /** @param enableRegexInPath the value to be set. */
    public fun enableRegexInPath(enableRegexInPath: IResolvable) {
        cdkBuilder.enableRegexInPath(enableRegexInPath)
    }

    /** @param registrationPagePath the value to be set. */
    public fun registrationPagePath(registrationPagePath: String) {
        cdkBuilder.registrationPagePath(registrationPagePath)
    }

    /** @param requestInspection the value to be set. */
    public fun requestInspection(requestInspection: IResolvable) {
        cdkBuilder.requestInspection(requestInspection)
    }

    /** @param requestInspection the value to be set. */
    public fun requestInspection(requestInspection: CfnWebACL.RequestInspectionACFPProperty) {
        cdkBuilder.requestInspection(requestInspection)
    }

    /** @param responseInspection the value to be set. */
    public fun responseInspection(responseInspection: IResolvable) {
        cdkBuilder.responseInspection(responseInspection)
    }

    /** @param responseInspection the value to be set. */
    public fun responseInspection(responseInspection: CfnWebACL.ResponseInspectionProperty) {
        cdkBuilder.responseInspection(responseInspection)
    }

    public fun build(): CfnWebACL.AWSManagedRulesACFPRuleSetProperty = cdkBuilder.build()
}
