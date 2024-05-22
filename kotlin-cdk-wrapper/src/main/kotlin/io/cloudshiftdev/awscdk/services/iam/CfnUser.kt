@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.iam

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.ITaggable
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * Creates a new IAM user for your AWS account .
 *
 * For information about quotas for the number of IAM users you can create, see [IAM and AWS STS
 * quotas](https://docs.aws.amazon.com/IAM/latest/UserGuide/reference_iam-quotas.html) in the *IAM User
 * Guide* .
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.iam.*;
 * Object policyDocument;
 * CfnUser cfnUser = CfnUser.Builder.create(this, "MyCfnUser")
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
public open class CfnUser(
  cdkObject: software.amazon.awscdk.services.iam.CfnUser,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  public constructor(scope: CloudshiftdevConstructsConstruct, id: String) :
      this(software.amazon.awscdk.services.iam.CfnUser(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id)
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnUserProps,
  ) :
      this(software.amazon.awscdk.services.iam.CfnUser(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id, props.let(CfnUserProps.Companion::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnUserProps.Builder.() -> Unit,
  ) : this(scope, id, CfnUserProps(props)
  )

  /**
   * Returns the Amazon Resource Name (ARN) for the specified `AWS::IAM::User` resource.
   *
   * For example: `arn:aws:iam::123456789012:user/mystack-myuser-1CCXAFG2H2U4D` .
   */
  public open fun attrArn(): String = unwrap(this).getAttrArn()

  /**
   * A list of group names to which you want to add the user.
   */
  public open fun groups(): List<String> = unwrap(this).getGroups() ?: emptyList()

  /**
   * A list of group names to which you want to add the user.
   */
  public open fun groups(`value`: List<String>) {
    unwrap(this).setGroups(`value`)
  }

  /**
   * A list of group names to which you want to add the user.
   */
  public open fun groups(vararg `value`: String): Unit = groups(`value`.toList())

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector.Companion::unwrap))
  }

  /**
   * Creates a password for the specified IAM user.
   */
  public open fun loginProfile(): Any? = unwrap(this).getLoginProfile()

  /**
   * Creates a password for the specified IAM user.
   */
  public open fun loginProfile(`value`: IResolvable) {
    unwrap(this).setLoginProfile(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * Creates a password for the specified IAM user.
   */
  public open fun loginProfile(`value`: LoginProfileProperty) {
    unwrap(this).setLoginProfile(`value`.let(LoginProfileProperty.Companion::unwrap))
  }

  /**
   * Creates a password for the specified IAM user.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("1d872147e167dfec255d786f88a067073906fa68b3bf09787f6d54f57e962c0f")
  public open fun loginProfile(`value`: LoginProfileProperty.Builder.() -> Unit): Unit =
      loginProfile(LoginProfileProperty(`value`))

  /**
   * A list of Amazon Resource Names (ARNs) of the IAM managed policies that you want to attach to
   * the user.
   */
  public open fun managedPolicyArns(): List<String> = unwrap(this).getManagedPolicyArns() ?:
      emptyList()

  /**
   * A list of Amazon Resource Names (ARNs) of the IAM managed policies that you want to attach to
   * the user.
   */
  public open fun managedPolicyArns(`value`: List<String>) {
    unwrap(this).setManagedPolicyArns(`value`)
  }

  /**
   * A list of Amazon Resource Names (ARNs) of the IAM managed policies that you want to attach to
   * the user.
   */
  public open fun managedPolicyArns(vararg `value`: String): Unit =
      managedPolicyArns(`value`.toList())

  /**
   * The path for the user name.
   */
  public open fun path(): String? = unwrap(this).getPath()

  /**
   * The path for the user name.
   */
  public open fun path(`value`: String) {
    unwrap(this).setPath(`value`)
  }

  /**
   * The ARN of the managed policy that is used to set the permissions boundary for the user.
   */
  public open fun permissionsBoundary(): String? = unwrap(this).getPermissionsBoundary()

  /**
   * The ARN of the managed policy that is used to set the permissions boundary for the user.
   */
  public open fun permissionsBoundary(`value`: String) {
    unwrap(this).setPermissionsBoundary(`value`)
  }

  /**
   * Adds or updates an inline policy document that is embedded in the specified IAM user.
   */
  public open fun policies(): Any? = unwrap(this).getPolicies()

  /**
   * Adds or updates an inline policy document that is embedded in the specified IAM user.
   */
  public open fun policies(`value`: IResolvable) {
    unwrap(this).setPolicies(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * Adds or updates an inline policy document that is embedded in the specified IAM user.
   */
  public open fun policies(`value`: List<Any>) {
    unwrap(this).setPolicies(`value`.map{CdkObjectWrappers.unwrap(it)})
  }

  /**
   * Adds or updates an inline policy document that is embedded in the specified IAM user.
   */
  public open fun policies(vararg `value`: Any): Unit = policies(`value`.toList())

  /**
   * Tag Manager which manages the tags for this resource.
   */
  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  /**
   * A list of tags that you want to attach to the new user.
   */
  public open fun tagsRaw(): List<CfnTag> = unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?:
      emptyList()

  /**
   * A list of tags that you want to attach to the new user.
   */
  public open fun tagsRaw(`value`: List<CfnTag>) {
    unwrap(this).setTagsRaw(`value`.map(CfnTag.Companion::unwrap))
  }

  /**
   * A list of tags that you want to attach to the new user.
   */
  public open fun tagsRaw(vararg `value`: CfnTag): Unit = tagsRaw(`value`.toList())

  /**
   * The name of the user to create.
   *
   * Do not include the path in this value.
   */
  public open fun userName(): String? = unwrap(this).getUserName()

  /**
   * The name of the user to create.
   *
   * Do not include the path in this value.
   */
  public open fun userName(`value`: String) {
    unwrap(this).setUserName(`value`)
  }

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.iam.CfnUser].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * A list of group names to which you want to add the user.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iam-user.html#cfn-iam-user-groups)
     * @param groups A list of group names to which you want to add the user. 
     */
    public fun groups(groups: List<String>)

    /**
     * A list of group names to which you want to add the user.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iam-user.html#cfn-iam-user-groups)
     * @param groups A list of group names to which you want to add the user. 
     */
    public fun groups(vararg groups: String)

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
     * @param loginProfile Creates a password for the specified IAM user. 
     */
    public fun loginProfile(loginProfile: IResolvable)

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
     * @param loginProfile Creates a password for the specified IAM user. 
     */
    public fun loginProfile(loginProfile: LoginProfileProperty)

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
     * @param loginProfile Creates a password for the specified IAM user. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("6e416b96c582056f728935e6aefb15f393a8ba15e7b3efc35a0017decd484631")
    public fun loginProfile(loginProfile: LoginProfileProperty.Builder.() -> Unit)

    /**
     * A list of Amazon Resource Names (ARNs) of the IAM managed policies that you want to attach to
     * the user.
     *
     * For more information about ARNs, see [Amazon Resource Names (ARNs) and AWS Service
     * Namespaces](https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html) in the
     * *AWS General Reference* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iam-user.html#cfn-iam-user-managedpolicyarns)
     * @param managedPolicyArns A list of Amazon Resource Names (ARNs) of the IAM managed policies
     * that you want to attach to the user. 
     */
    public fun managedPolicyArns(managedPolicyArns: List<String>)

    /**
     * A list of Amazon Resource Names (ARNs) of the IAM managed policies that you want to attach to
     * the user.
     *
     * For more information about ARNs, see [Amazon Resource Names (ARNs) and AWS Service
     * Namespaces](https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html) in the
     * *AWS General Reference* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iam-user.html#cfn-iam-user-managedpolicyarns)
     * @param managedPolicyArns A list of Amazon Resource Names (ARNs) of the IAM managed policies
     * that you want to attach to the user. 
     */
    public fun managedPolicyArns(vararg managedPolicyArns: String)

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
     * @param path The path for the user name. 
     */
    public fun path(path: String)

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
     * @param permissionsBoundary The ARN of the managed policy that is used to set the permissions
     * boundary for the user. 
     */
    public fun permissionsBoundary(permissionsBoundary: String)

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
     * @param policies Adds or updates an inline policy document that is embedded in the specified
     * IAM user. 
     */
    public fun policies(policies: IResolvable)

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
     * @param policies Adds or updates an inline policy document that is embedded in the specified
     * IAM user. 
     */
    public fun policies(policies: List<Any>)

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
     * @param policies Adds or updates an inline policy document that is embedded in the specified
     * IAM user. 
     */
    public fun policies(vararg policies: Any)

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
     * @param tags A list of tags that you want to attach to the new user. 
     */
    public fun tags(tags: List<CfnTag>)

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
     * @param tags A list of tags that you want to attach to the new user. 
     */
    public fun tags(vararg tags: CfnTag)

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
     * @param userName The name of the user to create. Do not include the path in this value. 
     */
    public fun userName(userName: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.iam.CfnUser.Builder =
        software.amazon.awscdk.services.iam.CfnUser.Builder.create(scope, id)

    /**
     * A list of group names to which you want to add the user.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iam-user.html#cfn-iam-user-groups)
     * @param groups A list of group names to which you want to add the user. 
     */
    override fun groups(groups: List<String>) {
      cdkBuilder.groups(groups)
    }

    /**
     * A list of group names to which you want to add the user.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iam-user.html#cfn-iam-user-groups)
     * @param groups A list of group names to which you want to add the user. 
     */
    override fun groups(vararg groups: String): Unit = groups(groups.toList())

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
     * @param loginProfile Creates a password for the specified IAM user. 
     */
    override fun loginProfile(loginProfile: IResolvable) {
      cdkBuilder.loginProfile(loginProfile.let(IResolvable.Companion::unwrap))
    }

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
     * @param loginProfile Creates a password for the specified IAM user. 
     */
    override fun loginProfile(loginProfile: LoginProfileProperty) {
      cdkBuilder.loginProfile(loginProfile.let(LoginProfileProperty.Companion::unwrap))
    }

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
     * @param loginProfile Creates a password for the specified IAM user. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("6e416b96c582056f728935e6aefb15f393a8ba15e7b3efc35a0017decd484631")
    override fun loginProfile(loginProfile: LoginProfileProperty.Builder.() -> Unit): Unit =
        loginProfile(LoginProfileProperty(loginProfile))

    /**
     * A list of Amazon Resource Names (ARNs) of the IAM managed policies that you want to attach to
     * the user.
     *
     * For more information about ARNs, see [Amazon Resource Names (ARNs) and AWS Service
     * Namespaces](https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html) in the
     * *AWS General Reference* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iam-user.html#cfn-iam-user-managedpolicyarns)
     * @param managedPolicyArns A list of Amazon Resource Names (ARNs) of the IAM managed policies
     * that you want to attach to the user. 
     */
    override fun managedPolicyArns(managedPolicyArns: List<String>) {
      cdkBuilder.managedPolicyArns(managedPolicyArns)
    }

    /**
     * A list of Amazon Resource Names (ARNs) of the IAM managed policies that you want to attach to
     * the user.
     *
     * For more information about ARNs, see [Amazon Resource Names (ARNs) and AWS Service
     * Namespaces](https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html) in the
     * *AWS General Reference* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iam-user.html#cfn-iam-user-managedpolicyarns)
     * @param managedPolicyArns A list of Amazon Resource Names (ARNs) of the IAM managed policies
     * that you want to attach to the user. 
     */
    override fun managedPolicyArns(vararg managedPolicyArns: String): Unit =
        managedPolicyArns(managedPolicyArns.toList())

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
     * @param path The path for the user name. 
     */
    override fun path(path: String) {
      cdkBuilder.path(path)
    }

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
     * @param permissionsBoundary The ARN of the managed policy that is used to set the permissions
     * boundary for the user. 
     */
    override fun permissionsBoundary(permissionsBoundary: String) {
      cdkBuilder.permissionsBoundary(permissionsBoundary)
    }

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
     * @param policies Adds or updates an inline policy document that is embedded in the specified
     * IAM user. 
     */
    override fun policies(policies: IResolvable) {
      cdkBuilder.policies(policies.let(IResolvable.Companion::unwrap))
    }

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
     * @param policies Adds or updates an inline policy document that is embedded in the specified
     * IAM user. 
     */
    override fun policies(policies: List<Any>) {
      cdkBuilder.policies(policies.map{CdkObjectWrappers.unwrap(it)})
    }

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
     * @param policies Adds or updates an inline policy document that is embedded in the specified
     * IAM user. 
     */
    override fun policies(vararg policies: Any): Unit = policies(policies.toList())

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
     * @param tags A list of tags that you want to attach to the new user. 
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag.Companion::unwrap))
    }

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
     * @param tags A list of tags that you want to attach to the new user. 
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

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
     * @param userName The name of the user to create. Do not include the path in this value. 
     */
    override fun userName(userName: String) {
      cdkBuilder.userName(userName)
    }

    public fun build(): software.amazon.awscdk.services.iam.CfnUser = cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.iam.CfnUser.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnUser {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnUser(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.iam.CfnUser): CfnUser =
        CfnUser(cdkObject)

    internal fun unwrap(wrapped: CfnUser): software.amazon.awscdk.services.iam.CfnUser =
        wrapped.cdkObject as software.amazon.awscdk.services.iam.CfnUser
  }

  /**
   * Creates a password for the specified user, giving the user the ability to access AWS services
   * through the AWS Management Console .
   *
   * For more information about managing passwords, see [Managing
   * Passwords](https://docs.aws.amazon.com/IAM/latest/UserGuide/Using_ManagingLogins.html) in the *IAM
   * User Guide* .
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.iam.*;
   * LoginProfileProperty loginProfileProperty = LoginProfileProperty.builder()
   * .password("password")
   * // the properties below are optional
   * .passwordResetRequired(false)
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iam-user-loginprofile.html)
   */
  public interface LoginProfileProperty {
    /**
     * The user's password.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iam-user-loginprofile.html#cfn-iam-user-loginprofile-password)
     */
    public fun password(): String

    /**
     * Specifies whether the user is required to set a new password on next sign-in.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iam-user-loginprofile.html#cfn-iam-user-loginprofile-passwordresetrequired)
     */
    public fun passwordResetRequired(): Any? = unwrap(this).getPasswordResetRequired()

    /**
     * A builder for [LoginProfileProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param password The user's password. 
       */
      public fun password(password: String)

      /**
       * @param passwordResetRequired Specifies whether the user is required to set a new password
       * on next sign-in.
       */
      public fun passwordResetRequired(passwordResetRequired: Boolean)

      /**
       * @param passwordResetRequired Specifies whether the user is required to set a new password
       * on next sign-in.
       */
      public fun passwordResetRequired(passwordResetRequired: IResolvable)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.iam.CfnUser.LoginProfileProperty.Builder =
          software.amazon.awscdk.services.iam.CfnUser.LoginProfileProperty.builder()

      /**
       * @param password The user's password. 
       */
      override fun password(password: String) {
        cdkBuilder.password(password)
      }

      /**
       * @param passwordResetRequired Specifies whether the user is required to set a new password
       * on next sign-in.
       */
      override fun passwordResetRequired(passwordResetRequired: Boolean) {
        cdkBuilder.passwordResetRequired(passwordResetRequired)
      }

      /**
       * @param passwordResetRequired Specifies whether the user is required to set a new password
       * on next sign-in.
       */
      override fun passwordResetRequired(passwordResetRequired: IResolvable) {
        cdkBuilder.passwordResetRequired(passwordResetRequired.let(IResolvable.Companion::unwrap))
      }

      public fun build(): software.amazon.awscdk.services.iam.CfnUser.LoginProfileProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.iam.CfnUser.LoginProfileProperty,
    ) : CdkObject(cdkObject), LoginProfileProperty {
      /**
       * The user's password.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iam-user-loginprofile.html#cfn-iam-user-loginprofile-password)
       */
      override fun password(): String = unwrap(this).getPassword()

      /**
       * Specifies whether the user is required to set a new password on next sign-in.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iam-user-loginprofile.html#cfn-iam-user-loginprofile-passwordresetrequired)
       */
      override fun passwordResetRequired(): Any? = unwrap(this).getPasswordResetRequired()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): LoginProfileProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.iam.CfnUser.LoginProfileProperty):
          LoginProfileProperty = CdkObjectWrappers.wrap(cdkObject) as? LoginProfileProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: LoginProfileProperty):
          software.amazon.awscdk.services.iam.CfnUser.LoginProfileProperty = (wrapped as
          CdkObject).cdkObject as software.amazon.awscdk.services.iam.CfnUser.LoginProfileProperty
    }
  }

  /**
   * Contains information about an attached policy.
   *
   * An attached policy is a managed policy that has been attached to a user, group, or role.
   *
   * For more information about managed policies, refer to [Managed Policies and Inline
   * Policies](https://docs.aws.amazon.com/IAM/latest/UserGuide/policies-managed-vs-inline.html) in the
   * *IAM User Guide* .
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.iam.*;
   * Object policyDocument;
   * PolicyProperty policyProperty = PolicyProperty.builder()
   * .policyDocument(policyDocument)
   * .policyName("policyName")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iam-user-policy.html)
   */
  public interface PolicyProperty {
    /**
     * The entire contents of the policy that defines permissions.
     *
     * For more information, see [Overview of JSON
     * policies](https://docs.aws.amazon.com/IAM/latest/UserGuide/access_policies.html#access_policies-json)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iam-user-policy.html#cfn-iam-user-policy-policydocument)
     */
    public fun policyDocument(): Any

    /**
     * The friendly name (not ARN) identifying the policy.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iam-user-policy.html#cfn-iam-user-policy-policyname)
     */
    public fun policyName(): String

    /**
     * A builder for [PolicyProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param policyDocument The entire contents of the policy that defines permissions. 
       * For more information, see [Overview of JSON
       * policies](https://docs.aws.amazon.com/IAM/latest/UserGuide/access_policies.html#access_policies-json)
       * .
       */
      public fun policyDocument(policyDocument: Any)

      /**
       * @param policyName The friendly name (not ARN) identifying the policy. 
       */
      public fun policyName(policyName: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder: software.amazon.awscdk.services.iam.CfnUser.PolicyProperty.Builder =
          software.amazon.awscdk.services.iam.CfnUser.PolicyProperty.builder()

      /**
       * @param policyDocument The entire contents of the policy that defines permissions. 
       * For more information, see [Overview of JSON
       * policies](https://docs.aws.amazon.com/IAM/latest/UserGuide/access_policies.html#access_policies-json)
       * .
       */
      override fun policyDocument(policyDocument: Any) {
        cdkBuilder.policyDocument(policyDocument)
      }

      /**
       * @param policyName The friendly name (not ARN) identifying the policy. 
       */
      override fun policyName(policyName: String) {
        cdkBuilder.policyName(policyName)
      }

      public fun build(): software.amazon.awscdk.services.iam.CfnUser.PolicyProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.iam.CfnUser.PolicyProperty,
    ) : CdkObject(cdkObject), PolicyProperty {
      /**
       * The entire contents of the policy that defines permissions.
       *
       * For more information, see [Overview of JSON
       * policies](https://docs.aws.amazon.com/IAM/latest/UserGuide/access_policies.html#access_policies-json)
       * .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iam-user-policy.html#cfn-iam-user-policy-policydocument)
       */
      override fun policyDocument(): Any = unwrap(this).getPolicyDocument()

      /**
       * The friendly name (not ARN) identifying the policy.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iam-user-policy.html#cfn-iam-user-policy-policyname)
       */
      override fun policyName(): String = unwrap(this).getPolicyName()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): PolicyProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal fun wrap(cdkObject: software.amazon.awscdk.services.iam.CfnUser.PolicyProperty):
          PolicyProperty = CdkObjectWrappers.wrap(cdkObject) as? PolicyProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: PolicyProperty):
          software.amazon.awscdk.services.iam.CfnUser.PolicyProperty = (wrapped as
          CdkObject).cdkObject as software.amazon.awscdk.services.iam.CfnUser.PolicyProperty
    }
  }
}
