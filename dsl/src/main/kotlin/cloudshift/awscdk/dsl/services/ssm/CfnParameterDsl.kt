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

package cloudshift.awscdk.dsl.services.ssm

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.common.MapBuilder
import kotlin.Any
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.ssm.CfnParameter
import software.constructs.Construct

/**
 * The `AWS::SSM::Parameter` resource creates an SSM parameter in AWS Systems Manager Parameter
 * Store.
 *
 * To create an SSM parameter, you must have the AWS Identity and Access Management ( IAM )
 * permissions `ssm:PutParameter` and `ssm:AddTagsToResource` . On stack creation, AWS
 * CloudFormation adds the following three tags to the parameter: `aws:cloudformation:stack-name` ,
 * `aws:cloudformation:logical-id` , and `aws:cloudformation:stack-id` , in addition to any custom
 * tags you specify.
 *
 * To add, update, or remove tags during stack update, you must have IAM permissions for both
 * `ssm:AddTagsToResource` and `ssm:RemoveTagsFromResource` . For more information, see
 * [Managing Access Using Policies](https://docs.aws.amazon.com/systems-manager/latest/userguide/security-iam.html#security_iam_access-manage)
 * in the *AWS Systems Manager User Guide* .
 *
 * For information about valid values for parameters, see
 * [Requirements and Constraints for Parameter Names](https://docs.aws.amazon.com/systems-manager/latest/userguide/sysman-paramstore-su-create.html#sysman-parameter-name-constraints)
 * in the *AWS Systems Manager User Guide* and
 * [PutParameter](https://docs.aws.amazon.com/systems-manager/latest/APIReference/API_PutParameter.html)
 * in the *AWS Systems Manager API Reference* .
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.ssm.*;
 * Object tags;
 * CfnParameter cfnParameter = CfnParameter.Builder.create(this, "MyCfnParameter")
 * .type("type")
 * .value("value")
 * // the properties below are optional
 * .allowedPattern("allowedPattern")
 * .dataType("dataType")
 * .description("description")
 * .name("name")
 * .policies("policies")
 * .tags(tags)
 * .tier("tier")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-parameter.html)
 */
@CdkDslMarker
public class CfnParameterDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnParameter.Builder = CfnParameter.Builder.create(scope, id)

    /**
     * A regular expression used to validate the parameter value.
     *
     * For example, for String types with values restricted to numbers, you can specify the
     * following: `AllowedPattern=^\d+$`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-parameter.html#cfn-ssm-parameter-allowedpattern)
     *
     * @param allowedPattern A regular expression used to validate the parameter value.
     */
    public fun allowedPattern(allowedPattern: String) {
        cdkBuilder.allowedPattern(allowedPattern)
    }

    /**
     * The data type of the parameter, such as `text` or `aws:ec2:image` .
     *
     * The default is `text` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-parameter.html#cfn-ssm-parameter-datatype)
     *
     * @param dataType The data type of the parameter, such as `text` or `aws:ec2:image` .
     */
    public fun dataType(dataType: String) {
        cdkBuilder.dataType(dataType)
    }

    /**
     * Information about the parameter.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-parameter.html#cfn-ssm-parameter-description)
     *
     * @param description Information about the parameter.
     */
    public fun description(description: String) {
        cdkBuilder.description(description)
    }

    /**
     * The name of the parameter.
     *
     * The maximum length constraint listed below includes capacity for additional system attributes
     * that aren't part of the name. The maximum length for a parameter name, including the full
     * length of the parameter ARN, is 1011 characters. For example, the length of the following
     * parameter name is 65 characters, not 20 characters:
     * `arn:aws:ssm:us-east-2:111222333444:parameter/ExampleParameterName`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-parameter.html#cfn-ssm-parameter-name)
     *
     * @param name The name of the parameter.
     */
    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    /**
     * Information about the policies assigned to a parameter.
     *
     * [Assigning parameter
     * policies](https://docs.aws.amazon.com/systems-manager/latest/userguide/parameter-store-policies.html)
     * in the *AWS Systems Manager User Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-parameter.html#cfn-ssm-parameter-policies)
     *
     * @param policies Information about the policies assigned to a parameter.
     */
    public fun policies(policies: String) {
        cdkBuilder.policies(policies)
    }

    /**
     * Optional metadata that you assign to a resource in the form of an arbitrary set of tags
     * (key-value pairs).
     *
     * Tags enable you to categorize a resource in different ways, such as by purpose, owner, or
     * environment. For example, you might want to tag a Systems Manager parameter to identify the
     * type of resource to which it applies, the environment, or the type of configuration data
     * referenced by the parameter.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-parameter.html#cfn-ssm-parameter-tags)
     *
     * @param tags Optional metadata that you assign to a resource in the form of an arbitrary set
     *   of tags (key-value pairs).
     */
    public fun tags(tags: MapBuilder.() -> Unit = {}) {
        val builder = MapBuilder()
        builder.apply(tags)
        cdkBuilder.tags(builder.map)
    }

    /**
     * Optional metadata that you assign to a resource in the form of an arbitrary set of tags
     * (key-value pairs).
     *
     * Tags enable you to categorize a resource in different ways, such as by purpose, owner, or
     * environment. For example, you might want to tag a Systems Manager parameter to identify the
     * type of resource to which it applies, the environment, or the type of configuration data
     * referenced by the parameter.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-parameter.html#cfn-ssm-parameter-tags)
     *
     * @param tags Optional metadata that you assign to a resource in the form of an arbitrary set
     *   of tags (key-value pairs).
     */
    public fun tags(tags: Any) {
        cdkBuilder.tags(tags)
    }

    /**
     * The parameter tier.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-parameter.html#cfn-ssm-parameter-tier)
     *
     * @param tier The parameter tier.
     */
    public fun tier(tier: String) {
        cdkBuilder.tier(tier)
    }

    /**
     * The type of parameter.
     *
     * AWS CloudFormation doesn't support creating a `SecureString` parameter type.
     *
     * *Allowed Values* : String | StringList
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-parameter.html#cfn-ssm-parameter-type)
     *
     * @param type The type of parameter.
     */
    public fun type(type: String) {
        cdkBuilder.type(type)
    }

    /**
     * The parameter value.
     *
     * If type is `StringList` , the system returns a comma-separated string with no spaces between
     * commas in the `Value` field.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-parameter.html#cfn-ssm-parameter-value)
     *
     * @param value The parameter value.
     */
    public fun `value`(`value`: String) {
        cdkBuilder.`value`(`value`)
    }

    public fun build(): CfnParameter = cdkBuilder.build()
}
