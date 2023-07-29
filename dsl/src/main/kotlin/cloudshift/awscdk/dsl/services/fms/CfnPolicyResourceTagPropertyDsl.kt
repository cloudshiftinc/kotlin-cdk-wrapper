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
 * The resource tags that AWS Firewall Manager uses to determine if a particular resource should be
 * included or excluded from the AWS Firewall Manager policy.
 *
 * Tags enable you to categorize your AWS resources in different ways, for example, by purpose,
 * owner, or environment. Each tag consists of a key and an optional value. Firewall Manager
 * combines the tags with "AND" so that, if you add more than one tag to a policy scope, a resource
 * must have all the specified tags to be included or excluded. For more information, see
 * [Working with Tag Editor](https://docs.aws.amazon.com/awsconsolehelpdocs/latest/gsg/tag-editor.html)
 * .
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.fms.*;
 * ResourceTagProperty resourceTagProperty = ResourceTagProperty.builder()
 * .key("key")
 * // the properties below are optional
 * .value("value")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-fms-policy-resourcetag.html)
 */
@CdkDslMarker
public class CfnPolicyResourceTagPropertyDsl {
    private val cdkBuilder: CfnPolicy.ResourceTagProperty.Builder =
        CfnPolicy.ResourceTagProperty.builder()

    /** @param key The resource tag key. */
    public fun key(key: String) {
        cdkBuilder.key(key)
    }

    /** @param value The resource tag value. */
    public fun `value`(`value`: String) {
        cdkBuilder.`value`(`value`)
    }

    public fun build(): CfnPolicy.ResourceTagProperty = cdkBuilder.build()
}
