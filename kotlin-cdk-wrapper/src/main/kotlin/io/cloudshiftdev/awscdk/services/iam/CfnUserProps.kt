@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.iam

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

/**
 * Properties for defining a `CfnUser`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.iam.*;
 * Object policyDocument;
 * CfnUserProps cfnUserProps = CfnUserProps.builder()
 * .groups(List.of("groups"))
 * .loginProfile(LoginProfileProperty.builder()
 * .password("password")
 * // the properties below are optional
 * .passwordResetRequired(false)
 * .build())
 * .managedPolicyArns(List.of("managedPolicyArns"))
 * .path("path")
 * .permissionsBoundary("permissionsBoundary")
 * .policies(List.of(PolicyProperty.builder()
 * .policyDocument(policyDocument)
 * .policyName("policyName")
 * .build()))
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .userName("userName")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iam-user.html)
 */
public interface CfnUserProps {
  /**
   * A list of group names to which you want to add the user.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iam-user.html#cfn-iam-user-groups)
   */
  public fun groups(): List<String> = unwrap(this).getGroups() ?: emptyList()

  /**
   * Creates a password for the specified IAM user.
   *
   * A password allows an IAM user to access AWS services through the AWS Management Console .
   *
   * You can use the AWS CLI , the AWS API, or the *Users* page in the IAM console to create a
   * password for any IAM user. Use
   * [ChangePassword](https://docs.aws.amazon.com/IAM/latest/APIReference/API_ChangePassword.html) to
   * update your own existing password in the *My Security Credentials* page in the AWS Management
   * Console .
   *
   * For more information about managing passwords, see [Managing
   * passwords](https://docs.aws.amazon.com/IAM/latest/UserGuide/Using_ManagingLogins.html) in the *IAM
   * User Guide* .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iam-user.html#cfn-iam-user-loginprofile)
   */
  public fun loginProfile(): Any? = unwrap(this).getLoginProfile()

  /**
   * A list of Amazon Resource Names (ARNs) of the IAM managed policies that you want to attach to
   * the user.
   *
   * For more information about ARNs, see [Amazon Resource Names (ARNs) and AWS Service
   * Namespaces](https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html) in the
   * *AWS General Reference* .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iam-user.html#cfn-iam-user-managedpolicyarns)
   */
  public fun managedPolicyArns(): List<String> = unwrap(this).getManagedPolicyArns() ?: emptyList()

  /**
   * The path for the user name.
   *
   * For more information about paths, see [IAM
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
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iam-user.html#cfn-iam-user-path)
   */
  public fun path(): String? = unwrap(this).getPath()

  /**
   * The ARN of the managed policy that is used to set the permissions boundary for the user.
   *
   * A permissions boundary policy defines the maximum permissions that identity-based policies can
   * grant to an entity, but does not grant permissions. Permissions boundaries do not define the
   * maximum permissions that a resource-based policy can grant to an entity. To learn more, see
   * [Permissions boundaries for IAM
   * entities](https://docs.aws.amazon.com/IAM/latest/UserGuide/access_policies_boundaries.html) in the
   * *IAM User Guide* .
   *
   * For more information about policy types, see [Policy
   * types](https://docs.aws.amazon.com/IAM/latest/UserGuide/access_policies.html#access_policy-types)
   * in the *IAM User Guide* .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iam-user.html#cfn-iam-user-permissionsboundary)
   */
  public fun permissionsBoundary(): String? = unwrap(this).getPermissionsBoundary()

  /**
   * Adds or updates an inline policy document that is embedded in the specified IAM user.
   *
   * To view AWS::IAM::User snippets, see [Declaring an IAM User
   * Resource](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/quickref-iam.html#scenario-iam-user)
   * .
   *
   *
   * The name of each policy for a role, user, or group must be unique. If you don't choose unique
   * names, updates to the IAM identity will fail.
   *
   *
   * For information about limits on the number of inline policies that you can embed in a user, see
   * [Limitations on IAM
   * Entities](https://docs.aws.amazon.com/IAM/latest/UserGuide/LimitationsOnEntities.html) in the *IAM
   * User Guide* .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iam-user.html#cfn-iam-user-policies)
   */
  public fun policies(): Any? = unwrap(this).getPolicies()

  /**
   * A list of tags that you want to attach to the new user.
   *
   * Each tag consists of a key name and an associated value. For more information about tagging,
   * see [Tagging IAM resources](https://docs.aws.amazon.com/IAM/latest/UserGuide/id_tags.html) in the
   * *IAM User Guide* .
   *
   *
   * If any one of the tags is invalid or if you exceed the allowed maximum number of tags, then the
   * entire request fails and the resource is not created.
   *
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iam-user.html#cfn-iam-user-tags)
   */
  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * The name of the user to create. Do not include the path in this value.
   *
   * This parameter allows (per its [regex
   * pattern](https://docs.aws.amazon.com/http://wikipedia.org/wiki/regex) ) a string of characters
   * consisting of upper and lowercase alphanumeric characters with no spaces. You can also include any
   * of the following characters: _+=,.&#64;-. The user name must be unique within the account. User
   * names are not distinguished by case. For example, you cannot create users named both "John" and
   * "john".
   *
   * If you don't specify a name, AWS CloudFormation generates a unique physical ID and uses that ID
   * for the user name.
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
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iam-user.html#cfn-iam-user-username)
   */
  public fun userName(): String? = unwrap(this).getUserName()

  /**
   * A builder for [CfnUserProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param groups A list of group names to which you want to add the user.
     */
    public fun groups(groups: List<String>)

    /**
     * @param groups A list of group names to which you want to add the user.
     */
    public fun groups(vararg groups: String)

    /**
     * @param loginProfile Creates a password for the specified IAM user.
     * A password allows an IAM user to access AWS services through the AWS Management Console .
     *
     * You can use the AWS CLI , the AWS API, or the *Users* page in the IAM console to create a
     * password for any IAM user. Use
     * [ChangePassword](https://docs.aws.amazon.com/IAM/latest/APIReference/API_ChangePassword.html) to
     * update your own existing password in the *My Security Credentials* page in the AWS Management
     * Console .
     *
     * For more information about managing passwords, see [Managing
     * passwords](https://docs.aws.amazon.com/IAM/latest/UserGuide/Using_ManagingLogins.html) in the
     * *IAM User Guide* .
     */
    public fun loginProfile(loginProfile: IResolvable)

    /**
     * @param loginProfile Creates a password for the specified IAM user.
     * A password allows an IAM user to access AWS services through the AWS Management Console .
     *
     * You can use the AWS CLI , the AWS API, or the *Users* page in the IAM console to create a
     * password for any IAM user. Use
     * [ChangePassword](https://docs.aws.amazon.com/IAM/latest/APIReference/API_ChangePassword.html) to
     * update your own existing password in the *My Security Credentials* page in the AWS Management
     * Console .
     *
     * For more information about managing passwords, see [Managing
     * passwords](https://docs.aws.amazon.com/IAM/latest/UserGuide/Using_ManagingLogins.html) in the
     * *IAM User Guide* .
     */
    public fun loginProfile(loginProfile: CfnUser.LoginProfileProperty)

    /**
     * @param loginProfile Creates a password for the specified IAM user.
     * A password allows an IAM user to access AWS services through the AWS Management Console .
     *
     * You can use the AWS CLI , the AWS API, or the *Users* page in the IAM console to create a
     * password for any IAM user. Use
     * [ChangePassword](https://docs.aws.amazon.com/IAM/latest/APIReference/API_ChangePassword.html) to
     * update your own existing password in the *My Security Credentials* page in the AWS Management
     * Console .
     *
     * For more information about managing passwords, see [Managing
     * passwords](https://docs.aws.amazon.com/IAM/latest/UserGuide/Using_ManagingLogins.html) in the
     * *IAM User Guide* .
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("7e6ac569c97cfc1b49f653310b27872b98cb41f557a0e69f65cc702379ee6463")
    public fun loginProfile(loginProfile: CfnUser.LoginProfileProperty.Builder.() -> Unit)

    /**
     * @param managedPolicyArns A list of Amazon Resource Names (ARNs) of the IAM managed policies
     * that you want to attach to the user.
     * For more information about ARNs, see [Amazon Resource Names (ARNs) and AWS Service
     * Namespaces](https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html) in the
     * *AWS General Reference* .
     */
    public fun managedPolicyArns(managedPolicyArns: List<String>)

    /**
     * @param managedPolicyArns A list of Amazon Resource Names (ARNs) of the IAM managed policies
     * that you want to attach to the user.
     * For more information about ARNs, see [Amazon Resource Names (ARNs) and AWS Service
     * Namespaces](https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html) in the
     * *AWS General Reference* .
     */
    public fun managedPolicyArns(vararg managedPolicyArns: String)

    /**
     * @param path The path for the user name.
     * For more information about paths, see [IAM
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
     */
    public fun path(path: String)

    /**
     * @param permissionsBoundary The ARN of the managed policy that is used to set the permissions
     * boundary for the user.
     * A permissions boundary policy defines the maximum permissions that identity-based policies
     * can grant to an entity, but does not grant permissions. Permissions boundaries do not define the
     * maximum permissions that a resource-based policy can grant to an entity. To learn more, see
     * [Permissions boundaries for IAM
     * entities](https://docs.aws.amazon.com/IAM/latest/UserGuide/access_policies_boundaries.html) in
     * the *IAM User Guide* .
     *
     * For more information about policy types, see [Policy
     * types](https://docs.aws.amazon.com/IAM/latest/UserGuide/access_policies.html#access_policy-types)
     * in the *IAM User Guide* .
     */
    public fun permissionsBoundary(permissionsBoundary: String)

    /**
     * @param policies Adds or updates an inline policy document that is embedded in the specified
     * IAM user.
     * To view AWS::IAM::User snippets, see [Declaring an IAM User
     * Resource](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/quickref-iam.html#scenario-iam-user)
     * .
     *
     *
     * The name of each policy for a role, user, or group must be unique. If you don't choose unique
     * names, updates to the IAM identity will fail.
     *
     *
     * For information about limits on the number of inline policies that you can embed in a user,
     * see [Limitations on IAM
     * Entities](https://docs.aws.amazon.com/IAM/latest/UserGuide/LimitationsOnEntities.html) in the
     * *IAM User Guide* .
     */
    public fun policies(policies: IResolvable)

    /**
     * @param policies Adds or updates an inline policy document that is embedded in the specified
     * IAM user.
     * To view AWS::IAM::User snippets, see [Declaring an IAM User
     * Resource](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/quickref-iam.html#scenario-iam-user)
     * .
     *
     *
     * The name of each policy for a role, user, or group must be unique. If you don't choose unique
     * names, updates to the IAM identity will fail.
     *
     *
     * For information about limits on the number of inline policies that you can embed in a user,
     * see [Limitations on IAM
     * Entities](https://docs.aws.amazon.com/IAM/latest/UserGuide/LimitationsOnEntities.html) in the
     * *IAM User Guide* .
     */
    public fun policies(policies: List<Any>)

    /**
     * @param policies Adds or updates an inline policy document that is embedded in the specified
     * IAM user.
     * To view AWS::IAM::User snippets, see [Declaring an IAM User
     * Resource](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/quickref-iam.html#scenario-iam-user)
     * .
     *
     *
     * The name of each policy for a role, user, or group must be unique. If you don't choose unique
     * names, updates to the IAM identity will fail.
     *
     *
     * For information about limits on the number of inline policies that you can embed in a user,
     * see [Limitations on IAM
     * Entities](https://docs.aws.amazon.com/IAM/latest/UserGuide/LimitationsOnEntities.html) in the
     * *IAM User Guide* .
     */
    public fun policies(vararg policies: Any)

    /**
     * @param tags A list of tags that you want to attach to the new user.
     * Each tag consists of a key name and an associated value. For more information about tagging,
     * see [Tagging IAM resources](https://docs.aws.amazon.com/IAM/latest/UserGuide/id_tags.html) in
     * the *IAM User Guide* .
     *
     *
     * If any one of the tags is invalid or if you exceed the allowed maximum number of tags, then
     * the entire request fails and the resource is not created.
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * @param tags A list of tags that you want to attach to the new user.
     * Each tag consists of a key name and an associated value. For more information about tagging,
     * see [Tagging IAM resources](https://docs.aws.amazon.com/IAM/latest/UserGuide/id_tags.html) in
     * the *IAM User Guide* .
     *
     *
     * If any one of the tags is invalid or if you exceed the allowed maximum number of tags, then
     * the entire request fails and the resource is not created.
     */
    public fun tags(vararg tags: CfnTag)

    /**
     * @param userName The name of the user to create. Do not include the path in this value.
     * This parameter allows (per its [regex
     * pattern](https://docs.aws.amazon.com/http://wikipedia.org/wiki/regex) ) a string of characters
     * consisting of upper and lowercase alphanumeric characters with no spaces. You can also include
     * any of the following characters: _+=,.&#64;-. The user name must be unique within the account.
     * User names are not distinguished by case. For example, you cannot create users named both "John"
     * and "john".
     *
     * If you don't specify a name, AWS CloudFormation generates a unique physical ID and uses that
     * ID for the user name.
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
    public fun userName(userName: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.iam.CfnUserProps.Builder =
        software.amazon.awscdk.services.iam.CfnUserProps.builder()

    /**
     * @param groups A list of group names to which you want to add the user.
     */
    override fun groups(groups: List<String>) {
      cdkBuilder.groups(groups)
    }

    /**
     * @param groups A list of group names to which you want to add the user.
     */
    override fun groups(vararg groups: String): Unit = groups(groups.toList())

    /**
     * @param loginProfile Creates a password for the specified IAM user.
     * A password allows an IAM user to access AWS services through the AWS Management Console .
     *
     * You can use the AWS CLI , the AWS API, or the *Users* page in the IAM console to create a
     * password for any IAM user. Use
     * [ChangePassword](https://docs.aws.amazon.com/IAM/latest/APIReference/API_ChangePassword.html) to
     * update your own existing password in the *My Security Credentials* page in the AWS Management
     * Console .
     *
     * For more information about managing passwords, see [Managing
     * passwords](https://docs.aws.amazon.com/IAM/latest/UserGuide/Using_ManagingLogins.html) in the
     * *IAM User Guide* .
     */
    override fun loginProfile(loginProfile: IResolvable) {
      cdkBuilder.loginProfile(loginProfile.let(IResolvable::unwrap))
    }

    /**
     * @param loginProfile Creates a password for the specified IAM user.
     * A password allows an IAM user to access AWS services through the AWS Management Console .
     *
     * You can use the AWS CLI , the AWS API, or the *Users* page in the IAM console to create a
     * password for any IAM user. Use
     * [ChangePassword](https://docs.aws.amazon.com/IAM/latest/APIReference/API_ChangePassword.html) to
     * update your own existing password in the *My Security Credentials* page in the AWS Management
     * Console .
     *
     * For more information about managing passwords, see [Managing
     * passwords](https://docs.aws.amazon.com/IAM/latest/UserGuide/Using_ManagingLogins.html) in the
     * *IAM User Guide* .
     */
    override fun loginProfile(loginProfile: CfnUser.LoginProfileProperty) {
      cdkBuilder.loginProfile(loginProfile.let(CfnUser.LoginProfileProperty::unwrap))
    }

    /**
     * @param loginProfile Creates a password for the specified IAM user.
     * A password allows an IAM user to access AWS services through the AWS Management Console .
     *
     * You can use the AWS CLI , the AWS API, or the *Users* page in the IAM console to create a
     * password for any IAM user. Use
     * [ChangePassword](https://docs.aws.amazon.com/IAM/latest/APIReference/API_ChangePassword.html) to
     * update your own existing password in the *My Security Credentials* page in the AWS Management
     * Console .
     *
     * For more information about managing passwords, see [Managing
     * passwords](https://docs.aws.amazon.com/IAM/latest/UserGuide/Using_ManagingLogins.html) in the
     * *IAM User Guide* .
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("7e6ac569c97cfc1b49f653310b27872b98cb41f557a0e69f65cc702379ee6463")
    override fun loginProfile(loginProfile: CfnUser.LoginProfileProperty.Builder.() -> Unit): Unit =
        loginProfile(CfnUser.LoginProfileProperty(loginProfile))

    /**
     * @param managedPolicyArns A list of Amazon Resource Names (ARNs) of the IAM managed policies
     * that you want to attach to the user.
     * For more information about ARNs, see [Amazon Resource Names (ARNs) and AWS Service
     * Namespaces](https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html) in the
     * *AWS General Reference* .
     */
    override fun managedPolicyArns(managedPolicyArns: List<String>) {
      cdkBuilder.managedPolicyArns(managedPolicyArns)
    }

    /**
     * @param managedPolicyArns A list of Amazon Resource Names (ARNs) of the IAM managed policies
     * that you want to attach to the user.
     * For more information about ARNs, see [Amazon Resource Names (ARNs) and AWS Service
     * Namespaces](https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html) in the
     * *AWS General Reference* .
     */
    override fun managedPolicyArns(vararg managedPolicyArns: String): Unit =
        managedPolicyArns(managedPolicyArns.toList())

    /**
     * @param path The path for the user name.
     * For more information about paths, see [IAM
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
     */
    override fun path(path: String) {
      cdkBuilder.path(path)
    }

    /**
     * @param permissionsBoundary The ARN of the managed policy that is used to set the permissions
     * boundary for the user.
     * A permissions boundary policy defines the maximum permissions that identity-based policies
     * can grant to an entity, but does not grant permissions. Permissions boundaries do not define the
     * maximum permissions that a resource-based policy can grant to an entity. To learn more, see
     * [Permissions boundaries for IAM
     * entities](https://docs.aws.amazon.com/IAM/latest/UserGuide/access_policies_boundaries.html) in
     * the *IAM User Guide* .
     *
     * For more information about policy types, see [Policy
     * types](https://docs.aws.amazon.com/IAM/latest/UserGuide/access_policies.html#access_policy-types)
     * in the *IAM User Guide* .
     */
    override fun permissionsBoundary(permissionsBoundary: String) {
      cdkBuilder.permissionsBoundary(permissionsBoundary)
    }

    /**
     * @param policies Adds or updates an inline policy document that is embedded in the specified
     * IAM user.
     * To view AWS::IAM::User snippets, see [Declaring an IAM User
     * Resource](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/quickref-iam.html#scenario-iam-user)
     * .
     *
     *
     * The name of each policy for a role, user, or group must be unique. If you don't choose unique
     * names, updates to the IAM identity will fail.
     *
     *
     * For information about limits on the number of inline policies that you can embed in a user,
     * see [Limitations on IAM
     * Entities](https://docs.aws.amazon.com/IAM/latest/UserGuide/LimitationsOnEntities.html) in the
     * *IAM User Guide* .
     */
    override fun policies(policies: IResolvable) {
      cdkBuilder.policies(policies.let(IResolvable::unwrap))
    }

    /**
     * @param policies Adds or updates an inline policy document that is embedded in the specified
     * IAM user.
     * To view AWS::IAM::User snippets, see [Declaring an IAM User
     * Resource](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/quickref-iam.html#scenario-iam-user)
     * .
     *
     *
     * The name of each policy for a role, user, or group must be unique. If you don't choose unique
     * names, updates to the IAM identity will fail.
     *
     *
     * For information about limits on the number of inline policies that you can embed in a user,
     * see [Limitations on IAM
     * Entities](https://docs.aws.amazon.com/IAM/latest/UserGuide/LimitationsOnEntities.html) in the
     * *IAM User Guide* .
     */
    override fun policies(policies: List<Any>) {
      cdkBuilder.policies(policies)
    }

    /**
     * @param policies Adds or updates an inline policy document that is embedded in the specified
     * IAM user.
     * To view AWS::IAM::User snippets, see [Declaring an IAM User
     * Resource](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/quickref-iam.html#scenario-iam-user)
     * .
     *
     *
     * The name of each policy for a role, user, or group must be unique. If you don't choose unique
     * names, updates to the IAM identity will fail.
     *
     *
     * For information about limits on the number of inline policies that you can embed in a user,
     * see [Limitations on IAM
     * Entities](https://docs.aws.amazon.com/IAM/latest/UserGuide/LimitationsOnEntities.html) in the
     * *IAM User Guide* .
     */
    override fun policies(vararg policies: Any): Unit = policies(policies.toList())

    /**
     * @param tags A list of tags that you want to attach to the new user.
     * Each tag consists of a key name and an associated value. For more information about tagging,
     * see [Tagging IAM resources](https://docs.aws.amazon.com/IAM/latest/UserGuide/id_tags.html) in
     * the *IAM User Guide* .
     *
     *
     * If any one of the tags is invalid or if you exceed the allowed maximum number of tags, then
     * the entire request fails and the resource is not created.
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    /**
     * @param tags A list of tags that you want to attach to the new user.
     * Each tag consists of a key name and an associated value. For more information about tagging,
     * see [Tagging IAM resources](https://docs.aws.amazon.com/IAM/latest/UserGuide/id_tags.html) in
     * the *IAM User Guide* .
     *
     *
     * If any one of the tags is invalid or if you exceed the allowed maximum number of tags, then
     * the entire request fails and the resource is not created.
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    /**
     * @param userName The name of the user to create. Do not include the path in this value.
     * This parameter allows (per its [regex
     * pattern](https://docs.aws.amazon.com/http://wikipedia.org/wiki/regex) ) a string of characters
     * consisting of upper and lowercase alphanumeric characters with no spaces. You can also include
     * any of the following characters: _+=,.&#64;-. The user name must be unique within the account.
     * User names are not distinguished by case. For example, you cannot create users named both "John"
     * and "john".
     *
     * If you don't specify a name, AWS CloudFormation generates a unique physical ID and uses that
     * ID for the user name.
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
    override fun userName(userName: String) {
      cdkBuilder.userName(userName)
    }

    public fun build(): software.amazon.awscdk.services.iam.CfnUserProps = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.iam.CfnUserProps,
  ) : CdkObject(cdkObject), CfnUserProps {
    /**
     * A list of group names to which you want to add the user.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iam-user.html#cfn-iam-user-groups)
     */
    override fun groups(): List<String> = unwrap(this).getGroups() ?: emptyList()

    /**
     * Creates a password for the specified IAM user.
     *
     * A password allows an IAM user to access AWS services through the AWS Management Console .
     *
     * You can use the AWS CLI , the AWS API, or the *Users* page in the IAM console to create a
     * password for any IAM user. Use
     * [ChangePassword](https://docs.aws.amazon.com/IAM/latest/APIReference/API_ChangePassword.html) to
     * update your own existing password in the *My Security Credentials* page in the AWS Management
     * Console .
     *
     * For more information about managing passwords, see [Managing
     * passwords](https://docs.aws.amazon.com/IAM/latest/UserGuide/Using_ManagingLogins.html) in the
     * *IAM User Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iam-user.html#cfn-iam-user-loginprofile)
     */
    override fun loginProfile(): Any? = unwrap(this).getLoginProfile()

    /**
     * A list of Amazon Resource Names (ARNs) of the IAM managed policies that you want to attach to
     * the user.
     *
     * For more information about ARNs, see [Amazon Resource Names (ARNs) and AWS Service
     * Namespaces](https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html) in the
     * *AWS General Reference* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iam-user.html#cfn-iam-user-managedpolicyarns)
     */
    override fun managedPolicyArns(): List<String> = unwrap(this).getManagedPolicyArns() ?:
        emptyList()

    /**
     * The path for the user name.
     *
     * For more information about paths, see [IAM
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
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iam-user.html#cfn-iam-user-path)
     */
    override fun path(): String? = unwrap(this).getPath()

    /**
     * The ARN of the managed policy that is used to set the permissions boundary for the user.
     *
     * A permissions boundary policy defines the maximum permissions that identity-based policies
     * can grant to an entity, but does not grant permissions. Permissions boundaries do not define the
     * maximum permissions that a resource-based policy can grant to an entity. To learn more, see
     * [Permissions boundaries for IAM
     * entities](https://docs.aws.amazon.com/IAM/latest/UserGuide/access_policies_boundaries.html) in
     * the *IAM User Guide* .
     *
     * For more information about policy types, see [Policy
     * types](https://docs.aws.amazon.com/IAM/latest/UserGuide/access_policies.html#access_policy-types)
     * in the *IAM User Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iam-user.html#cfn-iam-user-permissionsboundary)
     */
    override fun permissionsBoundary(): String? = unwrap(this).getPermissionsBoundary()

    /**
     * Adds or updates an inline policy document that is embedded in the specified IAM user.
     *
     * To view AWS::IAM::User snippets, see [Declaring an IAM User
     * Resource](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/quickref-iam.html#scenario-iam-user)
     * .
     *
     *
     * The name of each policy for a role, user, or group must be unique. If you don't choose unique
     * names, updates to the IAM identity will fail.
     *
     *
     * For information about limits on the number of inline policies that you can embed in a user,
     * see [Limitations on IAM
     * Entities](https://docs.aws.amazon.com/IAM/latest/UserGuide/LimitationsOnEntities.html) in the
     * *IAM User Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iam-user.html#cfn-iam-user-policies)
     */
    override fun policies(): Any? = unwrap(this).getPolicies()

    /**
     * A list of tags that you want to attach to the new user.
     *
     * Each tag consists of a key name and an associated value. For more information about tagging,
     * see [Tagging IAM resources](https://docs.aws.amazon.com/IAM/latest/UserGuide/id_tags.html) in
     * the *IAM User Guide* .
     *
     *
     * If any one of the tags is invalid or if you exceed the allowed maximum number of tags, then
     * the entire request fails and the resource is not created.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iam-user.html#cfn-iam-user-tags)
     */
    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

    /**
     * The name of the user to create. Do not include the path in this value.
     *
     * This parameter allows (per its [regex
     * pattern](https://docs.aws.amazon.com/http://wikipedia.org/wiki/regex) ) a string of characters
     * consisting of upper and lowercase alphanumeric characters with no spaces. You can also include
     * any of the following characters: _+=,.&#64;-. The user name must be unique within the account.
     * User names are not distinguished by case. For example, you cannot create users named both "John"
     * and "john".
     *
     * If you don't specify a name, AWS CloudFormation generates a unique physical ID and uses that
     * ID for the user name.
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
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iam-user.html#cfn-iam-user-username)
     */
    override fun userName(): String? = unwrap(this).getUserName()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnUserProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.iam.CfnUserProps): CfnUserProps =
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnUserProps): software.amazon.awscdk.services.iam.CfnUserProps =
        (wrapped as CdkObject).cdkObject as software.amazon.awscdk.services.iam.CfnUserProps
  }
}
