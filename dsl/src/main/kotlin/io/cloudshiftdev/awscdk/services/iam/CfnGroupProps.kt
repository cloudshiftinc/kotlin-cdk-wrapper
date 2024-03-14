package io.cloudshiftdev.awscdk.services.iam

import io.cloudshiftdev.awscdk.CdkObject
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

public interface CfnGroupProps {
  /**
   * The name of the group to create. Do not include the path in this value.
   *
   * The group name must be unique within the account. Group names are not distinguished by case.
   * For example, you cannot create groups named both "ADMINS" and "admins". If you don't specify a
   * name, AWS CloudFormation generates a unique physical ID and uses that ID for the group name.
   *
   *
   * If you specify a name, you cannot perform updates that require replacement of this resource.
   * You can perform updates that require no or some interruption. If you must replace the resource,
   * specify a new name.
   *
   *
   * If you specify a name, you must specify the `CAPABILITY_NAMED_IAM` value to acknowledge your
   * template's capabilities. For more information, see [Acknowledging IAM Resources in AWS
   * CloudFormation
   * Templates](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/using-iam-template.html#using-iam-capabilities)
   * .
   *
   *
   * Naming an IAM resource can cause an unrecoverable error if you reuse the same template in
   * multiple Regions. To prevent this, we recommend using `Fn::Join` and `AWS::Region` to create a
   * Region-specific name, as in the following example: `{"Fn::Join": ["", [{"Ref": "AWS::Region"},
   * {"Ref": "MyResourceName"}]]}` .
   *
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iam-group.html#cfn-iam-group-groupname)
   */
  public fun groupName(): String? = unwrap(this).getGroupName()

  /**
   * The Amazon Resource Name (ARN) of the IAM policy you want to attach.
   *
   * For more information about ARNs, see [Amazon Resource Names
   * (ARNs)](https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html) in the *AWS
   * General Reference* .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iam-group.html#cfn-iam-group-managedpolicyarns)
   */
  public fun managedPolicyArns(): List<String> = unwrap(this).getManagedPolicyArns() ?: emptyList()

  /**
   * The path to the group. For more information about paths, see [IAM
   * identifiers](https://docs.aws.amazon.com/IAM/latest/UserGuide/Using_Identifiers.html) in the *IAM
   * User Guide* .
   *
   * This parameter is optional. If it is not included, it defaults to a slash (/).
   *
   * This parameter allows (through its [regex
   * pattern](https://docs.aws.amazon.com/http://wikipedia.org/wiki/regex) ) a string of characters
   * consisting of either a forward slash (/) by itself or a string that must begin and end with
   * forward slashes. In addition, it can contain any ASCII character from the ! ( `\u0021` ) through
   * the DEL character ( `\u007F` ), including most punctuation characters, digits, and upper and
   * lowercased letters.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iam-group.html#cfn-iam-group-path)
   */
  public fun path(): String? = unwrap(this).getPath()

  /**
   * Adds or updates an inline policy document that is embedded in the specified IAM group.
   *
   * To view AWS::IAM::Group snippets, see [Declaring an IAM Group
   * Resource](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/quickref-iam.html#scenario-iam-group)
   * .
   *
   *
   * The name of each inline policy for a role, user, or group must be unique. If you don't choose
   * unique names, updates to the IAM identity will fail.
   *
   *
   * For information about limits on the number of inline policies that you can embed in a group,
   * see [Limitations on IAM
   * Entities](https://docs.aws.amazon.com/IAM/latest/UserGuide/LimitationsOnEntities.html) in the *IAM
   * User Guide* .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iam-group.html#cfn-iam-group-policies)
   */
  public fun policies(): Any? = unwrap(this).getPolicies()

  /**
   * A builder for [CfnGroupProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param groupName The name of the group to create. Do not include the path in this value.
     * The group name must be unique within the account. Group names are not distinguished by case.
     * For example, you cannot create groups named both "ADMINS" and "admins". If you don't specify a
     * name, AWS CloudFormation generates a unique physical ID and uses that ID for the group name.
     *
     *
     * If you specify a name, you cannot perform updates that require replacement of this resource.
     * You can perform updates that require no or some interruption. If you must replace the resource,
     * specify a new name.
     *
     *
     * If you specify a name, you must specify the `CAPABILITY_NAMED_IAM` value to acknowledge your
     * template's capabilities. For more information, see [Acknowledging IAM Resources in AWS
     * CloudFormation
     * Templates](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/using-iam-template.html#using-iam-capabilities)
     * .
     *
     *
     * Naming an IAM resource can cause an unrecoverable error if you reuse the same template in
     * multiple Regions. To prevent this, we recommend using `Fn::Join` and `AWS::Region` to create a
     * Region-specific name, as in the following example: `{"Fn::Join": ["", [{"Ref": "AWS::Region"},
     * {"Ref": "MyResourceName"}]]}` .
     */
    public fun groupName(groupName: String)

    /**
     * @param managedPolicyArns The Amazon Resource Name (ARN) of the IAM policy you want to attach.
     * For more information about ARNs, see [Amazon Resource Names
     * (ARNs)](https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html) in the *AWS
     * General Reference* .
     */
    public fun managedPolicyArns(managedPolicyArns: List<String>)

    /**
     * @param managedPolicyArns The Amazon Resource Name (ARN) of the IAM policy you want to attach.
     * For more information about ARNs, see [Amazon Resource Names
     * (ARNs)](https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html) in the *AWS
     * General Reference* .
     */
    public fun managedPolicyArns(vararg managedPolicyArns: String)

    /**
     * @param path The path to the group. For more information about paths, see [IAM
     * identifiers](https://docs.aws.amazon.com/IAM/latest/UserGuide/Using_Identifiers.html) in the
     * *IAM User Guide* .
     * This parameter is optional. If it is not included, it defaults to a slash (/).
     *
     * This parameter allows (through its [regex
     * pattern](https://docs.aws.amazon.com/http://wikipedia.org/wiki/regex) ) a string of characters
     * consisting of either a forward slash (/) by itself or a string that must begin and end with
     * forward slashes. In addition, it can contain any ASCII character from the ! ( `\u0021` ) through
     * the DEL character ( `\u007F` ), including most punctuation characters, digits, and upper and
     * lowercased letters.
     */
    public fun path(path: String)

    /**
     * @param policies Adds or updates an inline policy document that is embedded in the specified
     * IAM group.
     * To view AWS::IAM::Group snippets, see [Declaring an IAM Group
     * Resource](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/quickref-iam.html#scenario-iam-group)
     * .
     *
     *
     * The name of each inline policy for a role, user, or group must be unique. If you don't choose
     * unique names, updates to the IAM identity will fail.
     *
     *
     * For information about limits on the number of inline policies that you can embed in a group,
     * see [Limitations on IAM
     * Entities](https://docs.aws.amazon.com/IAM/latest/UserGuide/LimitationsOnEntities.html) in the
     * *IAM User Guide* .
     */
    public fun policies(policies: IResolvable)

    /**
     * @param policies Adds or updates an inline policy document that is embedded in the specified
     * IAM group.
     * To view AWS::IAM::Group snippets, see [Declaring an IAM Group
     * Resource](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/quickref-iam.html#scenario-iam-group)
     * .
     *
     *
     * The name of each inline policy for a role, user, or group must be unique. If you don't choose
     * unique names, updates to the IAM identity will fail.
     *
     *
     * For information about limits on the number of inline policies that you can embed in a group,
     * see [Limitations on IAM
     * Entities](https://docs.aws.amazon.com/IAM/latest/UserGuide/LimitationsOnEntities.html) in the
     * *IAM User Guide* .
     */
    public fun policies(policies: List<Any>)

    /**
     * @param policies Adds or updates an inline policy document that is embedded in the specified
     * IAM group.
     * To view AWS::IAM::Group snippets, see [Declaring an IAM Group
     * Resource](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/quickref-iam.html#scenario-iam-group)
     * .
     *
     *
     * The name of each inline policy for a role, user, or group must be unique. If you don't choose
     * unique names, updates to the IAM identity will fail.
     *
     *
     * For information about limits on the number of inline policies that you can embed in a group,
     * see [Limitations on IAM
     * Entities](https://docs.aws.amazon.com/IAM/latest/UserGuide/LimitationsOnEntities.html) in the
     * *IAM User Guide* .
     */
    public fun policies(vararg policies: Any)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.iam.CfnGroupProps.Builder =
        software.amazon.awscdk.services.iam.CfnGroupProps.builder()

    /**
     * @param groupName The name of the group to create. Do not include the path in this value.
     * The group name must be unique within the account. Group names are not distinguished by case.
     * For example, you cannot create groups named both "ADMINS" and "admins". If you don't specify a
     * name, AWS CloudFormation generates a unique physical ID and uses that ID for the group name.
     *
     *
     * If you specify a name, you cannot perform updates that require replacement of this resource.
     * You can perform updates that require no or some interruption. If you must replace the resource,
     * specify a new name.
     *
     *
     * If you specify a name, you must specify the `CAPABILITY_NAMED_IAM` value to acknowledge your
     * template's capabilities. For more information, see [Acknowledging IAM Resources in AWS
     * CloudFormation
     * Templates](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/using-iam-template.html#using-iam-capabilities)
     * .
     *
     *
     * Naming an IAM resource can cause an unrecoverable error if you reuse the same template in
     * multiple Regions. To prevent this, we recommend using `Fn::Join` and `AWS::Region` to create a
     * Region-specific name, as in the following example: `{"Fn::Join": ["", [{"Ref": "AWS::Region"},
     * {"Ref": "MyResourceName"}]]}` .
     */
    override fun groupName(groupName: String) {
      cdkBuilder.groupName(groupName)
    }

    /**
     * @param managedPolicyArns The Amazon Resource Name (ARN) of the IAM policy you want to attach.
     * For more information about ARNs, see [Amazon Resource Names
     * (ARNs)](https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html) in the *AWS
     * General Reference* .
     */
    override fun managedPolicyArns(managedPolicyArns: List<String>) {
      cdkBuilder.managedPolicyArns(managedPolicyArns)
    }

    /**
     * @param managedPolicyArns The Amazon Resource Name (ARN) of the IAM policy you want to attach.
     * For more information about ARNs, see [Amazon Resource Names
     * (ARNs)](https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html) in the *AWS
     * General Reference* .
     */
    override fun managedPolicyArns(vararg managedPolicyArns: String): Unit =
        managedPolicyArns(managedPolicyArns.toList())

    /**
     * @param path The path to the group. For more information about paths, see [IAM
     * identifiers](https://docs.aws.amazon.com/IAM/latest/UserGuide/Using_Identifiers.html) in the
     * *IAM User Guide* .
     * This parameter is optional. If it is not included, it defaults to a slash (/).
     *
     * This parameter allows (through its [regex
     * pattern](https://docs.aws.amazon.com/http://wikipedia.org/wiki/regex) ) a string of characters
     * consisting of either a forward slash (/) by itself or a string that must begin and end with
     * forward slashes. In addition, it can contain any ASCII character from the ! ( `\u0021` ) through
     * the DEL character ( `\u007F` ), including most punctuation characters, digits, and upper and
     * lowercased letters.
     */
    override fun path(path: String) {
      cdkBuilder.path(path)
    }

    /**
     * @param policies Adds or updates an inline policy document that is embedded in the specified
     * IAM group.
     * To view AWS::IAM::Group snippets, see [Declaring an IAM Group
     * Resource](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/quickref-iam.html#scenario-iam-group)
     * .
     *
     *
     * The name of each inline policy for a role, user, or group must be unique. If you don't choose
     * unique names, updates to the IAM identity will fail.
     *
     *
     * For information about limits on the number of inline policies that you can embed in a group,
     * see [Limitations on IAM
     * Entities](https://docs.aws.amazon.com/IAM/latest/UserGuide/LimitationsOnEntities.html) in the
     * *IAM User Guide* .
     */
    override fun policies(policies: IResolvable) {
      cdkBuilder.policies(policies.let(IResolvable::unwrap))
    }

    /**
     * @param policies Adds or updates an inline policy document that is embedded in the specified
     * IAM group.
     * To view AWS::IAM::Group snippets, see [Declaring an IAM Group
     * Resource](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/quickref-iam.html#scenario-iam-group)
     * .
     *
     *
     * The name of each inline policy for a role, user, or group must be unique. If you don't choose
     * unique names, updates to the IAM identity will fail.
     *
     *
     * For information about limits on the number of inline policies that you can embed in a group,
     * see [Limitations on IAM
     * Entities](https://docs.aws.amazon.com/IAM/latest/UserGuide/LimitationsOnEntities.html) in the
     * *IAM User Guide* .
     */
    override fun policies(policies: List<Any>) {
      cdkBuilder.policies(policies)
    }

    /**
     * @param policies Adds or updates an inline policy document that is embedded in the specified
     * IAM group.
     * To view AWS::IAM::Group snippets, see [Declaring an IAM Group
     * Resource](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/quickref-iam.html#scenario-iam-group)
     * .
     *
     *
     * The name of each inline policy for a role, user, or group must be unique. If you don't choose
     * unique names, updates to the IAM identity will fail.
     *
     *
     * For information about limits on the number of inline policies that you can embed in a group,
     * see [Limitations on IAM
     * Entities](https://docs.aws.amazon.com/IAM/latest/UserGuide/LimitationsOnEntities.html) in the
     * *IAM User Guide* .
     */
    override fun policies(vararg policies: Any): Unit = policies(policies.toList())

    public fun build(): software.amazon.awscdk.services.iam.CfnGroupProps = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.iam.CfnGroupProps,
  ) : CdkObject(cdkObject), CfnGroupProps {
    /**
     * The name of the group to create. Do not include the path in this value.
     *
     * The group name must be unique within the account. Group names are not distinguished by case.
     * For example, you cannot create groups named both "ADMINS" and "admins". If you don't specify a
     * name, AWS CloudFormation generates a unique physical ID and uses that ID for the group name.
     *
     *
     * If you specify a name, you cannot perform updates that require replacement of this resource.
     * You can perform updates that require no or some interruption. If you must replace the resource,
     * specify a new name.
     *
     *
     * If you specify a name, you must specify the `CAPABILITY_NAMED_IAM` value to acknowledge your
     * template's capabilities. For more information, see [Acknowledging IAM Resources in AWS
     * CloudFormation
     * Templates](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/using-iam-template.html#using-iam-capabilities)
     * .
     *
     *
     * Naming an IAM resource can cause an unrecoverable error if you reuse the same template in
     * multiple Regions. To prevent this, we recommend using `Fn::Join` and `AWS::Region` to create a
     * Region-specific name, as in the following example: `{"Fn::Join": ["", [{"Ref": "AWS::Region"},
     * {"Ref": "MyResourceName"}]]}` .
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iam-group.html#cfn-iam-group-groupname)
     */
    override fun groupName(): String? = unwrap(this).getGroupName()

    /**
     * The Amazon Resource Name (ARN) of the IAM policy you want to attach.
     *
     * For more information about ARNs, see [Amazon Resource Names
     * (ARNs)](https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html) in the *AWS
     * General Reference* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iam-group.html#cfn-iam-group-managedpolicyarns)
     */
    override fun managedPolicyArns(): List<String> = unwrap(this).getManagedPolicyArns() ?:
        emptyList()

    /**
     * The path to the group. For more information about paths, see [IAM
     * identifiers](https://docs.aws.amazon.com/IAM/latest/UserGuide/Using_Identifiers.html) in the
     * *IAM User Guide* .
     *
     * This parameter is optional. If it is not included, it defaults to a slash (/).
     *
     * This parameter allows (through its [regex
     * pattern](https://docs.aws.amazon.com/http://wikipedia.org/wiki/regex) ) a string of characters
     * consisting of either a forward slash (/) by itself or a string that must begin and end with
     * forward slashes. In addition, it can contain any ASCII character from the ! ( `\u0021` ) through
     * the DEL character ( `\u007F` ), including most punctuation characters, digits, and upper and
     * lowercased letters.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iam-group.html#cfn-iam-group-path)
     */
    override fun path(): String? = unwrap(this).getPath()

    /**
     * Adds or updates an inline policy document that is embedded in the specified IAM group.
     *
     * To view AWS::IAM::Group snippets, see [Declaring an IAM Group
     * Resource](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/quickref-iam.html#scenario-iam-group)
     * .
     *
     *
     * The name of each inline policy for a role, user, or group must be unique. If you don't choose
     * unique names, updates to the IAM identity will fail.
     *
     *
     * For information about limits on the number of inline policies that you can embed in a group,
     * see [Limitations on IAM
     * Entities](https://docs.aws.amazon.com/IAM/latest/UserGuide/LimitationsOnEntities.html) in the
     * *IAM User Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iam-group.html#cfn-iam-group-policies)
     */
    override fun policies(): Any? = unwrap(this).getPolicies()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnGroupProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.iam.CfnGroupProps): CfnGroupProps =
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnGroupProps): software.amazon.awscdk.services.iam.CfnGroupProps =
        (wrapped as CdkObject).cdkObject as software.amazon.awscdk.services.iam.CfnGroupProps
  }
}
