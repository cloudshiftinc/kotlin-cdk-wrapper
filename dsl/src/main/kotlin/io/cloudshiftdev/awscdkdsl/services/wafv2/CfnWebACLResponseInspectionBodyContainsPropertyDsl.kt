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
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.services.wafv2.CfnWebACL

/**
 * Configures inspection of the response body.
 *
 * AWS WAF can inspect the first 65,536 bytes (64 KB) of the response body. This is part of the
 * `ResponseInspection` configuration for `AWSManagedRulesATPRuleSet` .
 *
 * Response inspection is available only in web ACLs that protect Amazon CloudFront distributions.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.wafv2.*;
 * ResponseInspectionBodyContainsProperty responseInspectionBodyContainsProperty =
 * ResponseInspectionBodyContainsProperty.builder()
 * .failureStrings(List.of("failureStrings"))
 * .successStrings(List.of("successStrings"))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-webacl-responseinspectionbodycontains.html)
 */
@CdkDslMarker
public class CfnWebACLResponseInspectionBodyContainsPropertyDsl {
    private val cdkBuilder: CfnWebACL.ResponseInspectionBodyContainsProperty.Builder =
        CfnWebACL.ResponseInspectionBodyContainsProperty.builder()

    private val _failureStrings: MutableList<String> = mutableListOf()

    private val _successStrings: MutableList<String> = mutableListOf()

    /**
     * @param failureStrings Strings in the body of the response that indicate a failed login
     *   attempt.
     *
     * To be counted as a failure, the string can be anywhere in the body and must be an exact
     * match, including case. Each string must be unique among the success and failure strings.
     *
     * JSON example: `"FailureStrings": [ "Request failed" ]`
     */
    public fun failureStrings(vararg failureStrings: String) {
        _failureStrings.addAll(listOf(*failureStrings))
    }

    /**
     * @param failureStrings Strings in the body of the response that indicate a failed login
     *   attempt.
     *
     * To be counted as a failure, the string can be anywhere in the body and must be an exact
     * match, including case. Each string must be unique among the success and failure strings.
     *
     * JSON example: `"FailureStrings": [ "Request failed" ]`
     */
    public fun failureStrings(failureStrings: Collection<String>) {
        _failureStrings.addAll(failureStrings)
    }

    /**
     * @param successStrings Strings in the body of the response that indicate a successful login
     *   attempt. To be counted as a success, the string can be anywhere in the body and must be an
     *   exact match, including case. Each string must be unique among the success and failure
     *   strings.
     *
     * JSON example: `"SuccessStrings": [ "Login successful" ]`
     */
    public fun successStrings(vararg successStrings: String) {
        _successStrings.addAll(listOf(*successStrings))
    }

    /**
     * @param successStrings Strings in the body of the response that indicate a successful login
     *   attempt. To be counted as a success, the string can be anywhere in the body and must be an
     *   exact match, including case. Each string must be unique among the success and failure
     *   strings.
     *
     * JSON example: `"SuccessStrings": [ "Login successful" ]`
     */
    public fun successStrings(successStrings: Collection<String>) {
        _successStrings.addAll(successStrings)
    }

    public fun build(): CfnWebACL.ResponseInspectionBodyContainsProperty {
        if (_failureStrings.isNotEmpty()) cdkBuilder.failureStrings(_failureStrings)
        if (_successStrings.isNotEmpty()) cdkBuilder.successStrings(_successStrings)
        return cdkBuilder.build()
    }
}
