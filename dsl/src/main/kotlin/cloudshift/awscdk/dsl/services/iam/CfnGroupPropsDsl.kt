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
import kotlin.Any
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.iam.CfnGroupProps

/**
 * Properties for defining a `CfnGroup`.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.iam.*;
 * Object policyDocument;
 * CfnGroupProps cfnGroupProps = CfnGroupProps.builder()
 * .groupName("groupName")
 * .managedPolicyArns(List.of("managedPolicyArns"))
 * .path("path")
 * .policies(List.of(PolicyProperty.builder()
 * .policyDocument(policyDocument)
 * .policyName("policyName")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iam-group.html)
 */
@CdkDslMarker
public class CfnGroupPropsDsl {
    private val cdkBuilder: CfnGroupProps.Builder = CfnGroupProps.builder()

    private val _managedPolicyArns: MutableList<String> = mutableListOf()

    private val _policies: MutableList<Any> = mutableListOf()

    /**
     * @param groupName The name of the group to create. Do not include the path in this value. The
     *   group name must be unique within the account. Group names are not distinguished by case.
     *   For example, you cannot create groups named both "ADMINS" and "admins". If you don't
     *   specify a name, AWS CloudFormation generates a unique physical ID and uses that ID for the
     *   group name.
     *
     * If you specify a name, you cannot perform updates that require replacement of this resource.
     * You can perform updates that require no or some interruption. If you must replace the
     * resource, specify a new name.
     *
     * If you specify a name, you must specify the `CAPABILITY_NAMED_IAM` value to acknowledge your
     * template's capabilities. For more information, see
     * [Acknowledging IAM Resources in AWS CloudFormation Templates](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/using-iam-template.html#using-iam-capabilities)
     * .
     *
     * Naming an IAM resource can cause an unrecoverable error if you reuse the same template in
     * multiple Regions. To prevent this, we recommend using `Fn::Join` and `AWS::Region` to create
     * a Region-specific name, as in the following example: `{"Fn::Join":
     * ["", [{"Ref": "AWS::Region"}, {"Ref": "MyResourceName"}]]}` .
     */
    public fun groupName(groupName: String) {
        cdkBuilder.groupName(groupName)
    }

    /**
     * @param managedPolicyArns The Amazon Resource Name (ARN) of the IAM policy you want to attach.
     *   For more information about ARNs, see
     *   [Amazon Resource Names (ARNs)](https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html)
     *   in the *AWS General Reference* .
     */
    public fun managedPolicyArns(vararg managedPolicyArns: String) {
        _managedPolicyArns.addAll(listOf(*managedPolicyArns))
    }

    /**
     * @param managedPolicyArns The Amazon Resource Name (ARN) of the IAM policy you want to attach.
     *   For more information about ARNs, see
     *   [Amazon Resource Names (ARNs)](https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html)
     *   in the *AWS General Reference* .
     */
    public fun managedPolicyArns(managedPolicyArns: Collection<String>) {
        _managedPolicyArns.addAll(managedPolicyArns)
    }

    /**
     * @param path The path to the group. For more information about paths, see
     *   [IAM identifiers](https://docs.aws.amazon.com/IAM/latest/UserGuide/Using_Identifiers.html)
     *   in the *IAM User Guide* . This parameter is optional. If it is not included, it defaults to
     *   a slash (/).
     *
     * This parameter allows (through its
     * [regex pattern](https://docs.aws.amazon.com/http://wikipedia.org/wiki/regex) ) a string of
     * characters consisting of either a forward slash (/) by itself or a string that must begin and
     * end with forward slashes. In addition, it can contain any ASCII character from the ! (
     * `\u0021` ) through the DEL character ( `\u007F` ), including most punctuation characters,
     * digits, and upper and lowercased letters.
     */
    public fun path(path: String) {
        cdkBuilder.path(path)
    }

    /**
     * @param policies Adds or updates an inline policy document that is embedded in the specified
     *   IAM group. To view AWS::IAM::Group snippets, see
     *   [Declaring an IAM Group Resource](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/quickref-iam.html#scenario-iam-group)
     *   .
     *
     * The name of each inline policy for a role, user, or group must be unique. If you don't choose
     * unique names, updates to the IAM identity will fail.
     *
     * For information about limits on the number of inline policies that you can embed in a group,
     * see
     * [Limitations on IAM Entities](https://docs.aws.amazon.com/IAM/latest/UserGuide/LimitationsOnEntities.html)
     * in the *IAM User Guide* .
     */
    public fun policies(vararg policies: Any) {
        _policies.addAll(listOf(*policies))
    }

    /**
     * @param policies Adds or updates an inline policy document that is embedded in the specified
     *   IAM group. To view AWS::IAM::Group snippets, see
     *   [Declaring an IAM Group Resource](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/quickref-iam.html#scenario-iam-group)
     *   .
     *
     * The name of each inline policy for a role, user, or group must be unique. If you don't choose
     * unique names, updates to the IAM identity will fail.
     *
     * For information about limits on the number of inline policies that you can embed in a group,
     * see
     * [Limitations on IAM Entities](https://docs.aws.amazon.com/IAM/latest/UserGuide/LimitationsOnEntities.html)
     * in the *IAM User Guide* .
     */
    public fun policies(policies: Collection<Any>) {
        _policies.addAll(policies)
    }

    /**
     * @param policies Adds or updates an inline policy document that is embedded in the specified
     *   IAM group. To view AWS::IAM::Group snippets, see
     *   [Declaring an IAM Group Resource](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/quickref-iam.html#scenario-iam-group)
     *   .
     *
     * The name of each inline policy for a role, user, or group must be unique. If you don't choose
     * unique names, updates to the IAM identity will fail.
     *
     * For information about limits on the number of inline policies that you can embed in a group,
     * see
     * [Limitations on IAM Entities](https://docs.aws.amazon.com/IAM/latest/UserGuide/LimitationsOnEntities.html)
     * in the *IAM User Guide* .
     */
    public fun policies(policies: IResolvable) {
        cdkBuilder.policies(policies)
    }

    public fun build(): CfnGroupProps {
        if (_managedPolicyArns.isNotEmpty()) cdkBuilder.managedPolicyArns(_managedPolicyArns)
        if (_policies.isNotEmpty()) cdkBuilder.policies(_policies)
        return cdkBuilder.build()
    }
}
