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

package cloudshift.awscdk.dsl.services.iam

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.common.MapBuilder
import kotlin.Any
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.iam.CfnRolePolicyProps

/**
 * Properties for defining a `CfnRolePolicy`.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.iam.*;
 * Object policyDocument;
 * CfnRolePolicyProps cfnRolePolicyProps = CfnRolePolicyProps.builder()
 * .policyName("policyName")
 * .roleName("roleName")
 * // the properties below are optional
 * .policyDocument(policyDocument)
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iam-rolepolicy.html)
 */
@CdkDslMarker
public class CfnRolePolicyPropsDsl {
    private val cdkBuilder: CfnRolePolicyProps.Builder = CfnRolePolicyProps.builder()

    /**
     * @param policyDocument The policy document. You must provide policies in JSON format in IAM.
     *   However, for AWS CloudFormation templates formatted in YAML, you can provide the policy in
     *   JSON or YAML format. AWS CloudFormation always converts a YAML policy to JSON format before
     *   submitting it to IAM.
     *
     * The [regex pattern](https://docs.aws.amazon.com/http://wikipedia.org/wiki/regex) used to
     * validate this parameter is a string of characters consisting of the following:
     * * Any printable ASCII character ranging from the space character ( `\u0020` ) through the end
     *   of the ASCII character range
     * * The printable characters in the Basic Latin and Latin-1 Supplement character set (through
     *   `\u00FF` )
     * * The special characters tab ( `\u0009` ), line feed ( `\u000A` ), and carriage return (
     *   `\u000D` )
     */
    public fun policyDocument(policyDocument: MapBuilder.() -> Unit = {}) {
        val builder = MapBuilder()
        builder.apply(policyDocument)
        cdkBuilder.policyDocument(builder.map)
    }

    /**
     * @param policyDocument The policy document. You must provide policies in JSON format in IAM.
     *   However, for AWS CloudFormation templates formatted in YAML, you can provide the policy in
     *   JSON or YAML format. AWS CloudFormation always converts a YAML policy to JSON format before
     *   submitting it to IAM.
     *
     * The [regex pattern](https://docs.aws.amazon.com/http://wikipedia.org/wiki/regex) used to
     * validate this parameter is a string of characters consisting of the following:
     * * Any printable ASCII character ranging from the space character ( `\u0020` ) through the end
     *   of the ASCII character range
     * * The printable characters in the Basic Latin and Latin-1 Supplement character set (through
     *   `\u00FF` )
     * * The special characters tab ( `\u0009` ), line feed ( `\u000A` ), and carriage return (
     *   `\u000D` )
     */
    public fun policyDocument(policyDocument: Any) {
        cdkBuilder.policyDocument(policyDocument)
    }

    /**
     * @param policyName The name of the policy document. This parameter allows (through its
     *   [regex pattern](https://docs.aws.amazon.com/http://wikipedia.org/wiki/regex) ) a string of
     *   characters consisting of upper and lowercase alphanumeric characters with no spaces. You
     *   can also include any of the following characters: _+=,.&#64;-
     */
    public fun policyName(policyName: String) {
        cdkBuilder.policyName(policyName)
    }

    /**
     * @param roleName The name of the role to associate the policy with. This parameter allows
     *   (through its [regex pattern](https://docs.aws.amazon.com/http://wikipedia.org/wiki/regex) )
     *   a string of characters consisting of upper and lowercase alphanumeric characters with no
     *   spaces. You can also include any of the following characters: _+=,.&#64;-
     */
    public fun roleName(roleName: String) {
        cdkBuilder.roleName(roleName)
    }

    public fun build(): CfnRolePolicyProps = cdkBuilder.build()
}
