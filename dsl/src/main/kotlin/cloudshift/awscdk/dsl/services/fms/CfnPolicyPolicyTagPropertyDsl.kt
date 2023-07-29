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

package cloudshift.awscdk.dsl.services.fms

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.fms.CfnPolicy

/**
 * A collection of key:value pairs associated with an AWS resource.
 *
 * The key:value pair can be anything you define. Typically, the tag key represents a category (such
 * as "environment") and the tag value represents a specific value within that category (such as
 * "test," "development," or "production"). You can add up to 50 tags to each AWS resource.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.fms.*;
 * PolicyTagProperty policyTagProperty = PolicyTagProperty.builder()
 * .key("key")
 * .value("value")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-fms-policy-policytag.html)
 */
@CdkDslMarker
public class CfnPolicyPolicyTagPropertyDsl {
    private val cdkBuilder: CfnPolicy.PolicyTagProperty.Builder =
        CfnPolicy.PolicyTagProperty.builder()

    /**
     * @param key Part of the key:value pair that defines a tag. You can use a tag key to describe a
     *   category of information, such as "customer." Tag keys are case-sensitive.
     */
    public fun key(key: String) {
        cdkBuilder.key(key)
    }

    /**
     * @param value Part of the key:value pair that defines a tag. You can use a tag value to
     *   describe a specific value within a category, such as "companyA" or "companyB." Tag values
     *   are case-sensitive.
     */
    public fun `value`(`value`: String) {
        cdkBuilder.`value`(`value`)
    }

    public fun build(): CfnPolicy.PolicyTagProperty = cdkBuilder.build()
}
