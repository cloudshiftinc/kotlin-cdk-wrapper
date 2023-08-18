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
 * Configures inspection of the response JSON.
 *
 * AWS WAF can inspect the first 65,536 bytes (64 KB) of the response JSON. This is part of the
 * `ResponseInspection` configuration for `AWSManagedRulesATPRuleSet` .
 *
 * Response inspection is available only in web ACLs that protect Amazon CloudFront distributions.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.wafv2.*;
 * ResponseInspectionJsonProperty responseInspectionJsonProperty =
 * ResponseInspectionJsonProperty.builder()
 * .failureValues(List.of("failureValues"))
 * .identifier("identifier")
 * .successValues(List.of("successValues"))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-webacl-responseinspectionjson.html)
 */
@CdkDslMarker
public class CfnWebACLResponseInspectionJsonPropertyDsl {
    private val cdkBuilder: CfnWebACL.ResponseInspectionJsonProperty.Builder =
        CfnWebACL.ResponseInspectionJsonProperty.builder()

    private val _failureValues: MutableList<String> = mutableListOf()

    private val _successValues: MutableList<String> = mutableListOf()

    /**
     * @param failureValues Values for the specified identifier in the response JSON that indicate a
     *   failed login attempt. To be counted as a failure, the value must be an exact match,
     *   including case. Each value must be unique among the success and failure values.
     *
     * JSON example: `"FailureValues": [ "False", "Failed" ]`
     */
    public fun failureValues(vararg failureValues: String) {
        _failureValues.addAll(listOf(*failureValues))
    }

    /**
     * @param failureValues Values for the specified identifier in the response JSON that indicate a
     *   failed login attempt. To be counted as a failure, the value must be an exact match,
     *   including case. Each value must be unique among the success and failure values.
     *
     * JSON example: `"FailureValues": [ "False", "Failed" ]`
     */
    public fun failureValues(failureValues: Collection<String>) {
        _failureValues.addAll(failureValues)
    }

    /**
     * @param identifier The identifier for the value to match against in the JSON. The identifier
     *   must be an exact match, including case.
     *
     * JSON example: `"Identifier": [ "/login/success" ]`
     */
    public fun identifier(identifier: String) {
        cdkBuilder.identifier(identifier)
    }

    /**
     * @param successValues Values for the specified identifier in the response JSON that indicate a
     *   successful login attempt. To be counted as a success, the value must be an exact match,
     *   including case. Each value must be unique among the success and failure values.
     *
     * JSON example: `"SuccessValues": [ "True", "Succeeded" ]`
     */
    public fun successValues(vararg successValues: String) {
        _successValues.addAll(listOf(*successValues))
    }

    /**
     * @param successValues Values for the specified identifier in the response JSON that indicate a
     *   successful login attempt. To be counted as a success, the value must be an exact match,
     *   including case. Each value must be unique among the success and failure values.
     *
     * JSON example: `"SuccessValues": [ "True", "Succeeded" ]`
     */
    public fun successValues(successValues: Collection<String>) {
        _successValues.addAll(successValues)
    }

    public fun build(): CfnWebACL.ResponseInspectionJsonProperty {
        if (_failureValues.isNotEmpty()) cdkBuilder.failureValues(_failureValues)
        if (_successValues.isNotEmpty()) cdkBuilder.successValues(_successValues)
        return cdkBuilder.build()
    }
}
