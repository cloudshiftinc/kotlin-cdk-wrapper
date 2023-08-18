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

import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.iam.AccessKey
import software.amazon.awscdk.services.iam.AccessKeyProps
import software.amazon.awscdk.services.iam.AddToPrincipalPolicyResult
import software.amazon.awscdk.services.iam.AddToResourcePolicyResult
import software.amazon.awscdk.services.iam.CfnAccessKey
import software.amazon.awscdk.services.iam.CfnAccessKeyProps
import software.amazon.awscdk.services.iam.CfnGroup
import software.amazon.awscdk.services.iam.CfnGroupPolicy
import software.amazon.awscdk.services.iam.CfnGroupPolicyProps
import software.amazon.awscdk.services.iam.CfnGroupProps
import software.amazon.awscdk.services.iam.CfnInstanceProfile
import software.amazon.awscdk.services.iam.CfnInstanceProfileProps
import software.amazon.awscdk.services.iam.CfnManagedPolicy
import software.amazon.awscdk.services.iam.CfnManagedPolicyProps
import software.amazon.awscdk.services.iam.CfnOIDCProvider
import software.amazon.awscdk.services.iam.CfnOIDCProviderProps
import software.amazon.awscdk.services.iam.CfnPolicy
import software.amazon.awscdk.services.iam.CfnPolicyProps
import software.amazon.awscdk.services.iam.CfnRole
import software.amazon.awscdk.services.iam.CfnRolePolicy
import software.amazon.awscdk.services.iam.CfnRolePolicyProps
import software.amazon.awscdk.services.iam.CfnRoleProps
import software.amazon.awscdk.services.iam.CfnSAMLProvider
import software.amazon.awscdk.services.iam.CfnSAMLProviderProps
import software.amazon.awscdk.services.iam.CfnServerCertificate
import software.amazon.awscdk.services.iam.CfnServerCertificateProps
import software.amazon.awscdk.services.iam.CfnServiceLinkedRole
import software.amazon.awscdk.services.iam.CfnServiceLinkedRoleProps
import software.amazon.awscdk.services.iam.CfnUser
import software.amazon.awscdk.services.iam.CfnUserPolicy
import software.amazon.awscdk.services.iam.CfnUserPolicyProps
import software.amazon.awscdk.services.iam.CfnUserProps
import software.amazon.awscdk.services.iam.CfnUserToGroupAddition
import software.amazon.awscdk.services.iam.CfnUserToGroupAdditionProps
import software.amazon.awscdk.services.iam.CfnVirtualMFADevice
import software.amazon.awscdk.services.iam.CfnVirtualMFADeviceProps
import software.amazon.awscdk.services.iam.CommonGrantOptions
import software.amazon.awscdk.services.iam.CustomizeRolesOptions
import software.amazon.awscdk.services.iam.FromRoleArnOptions
import software.amazon.awscdk.services.iam.FromRoleNameOptions
import software.amazon.awscdk.services.iam.GrantOnPrincipalAndResourceOptions
import software.amazon.awscdk.services.iam.GrantOnPrincipalOptions
import software.amazon.awscdk.services.iam.GrantWithResourceOptions
import software.amazon.awscdk.services.iam.Group
import software.amazon.awscdk.services.iam.GroupProps
import software.amazon.awscdk.services.iam.InstanceProfile
import software.amazon.awscdk.services.iam.InstanceProfileAttributes
import software.amazon.awscdk.services.iam.InstanceProfileProps
import software.amazon.awscdk.services.iam.LazyRole
import software.amazon.awscdk.services.iam.LazyRoleProps
import software.amazon.awscdk.services.iam.ManagedPolicy
import software.amazon.awscdk.services.iam.ManagedPolicyProps
import software.amazon.awscdk.services.iam.OpenIdConnectProvider
import software.amazon.awscdk.services.iam.OpenIdConnectProviderProps
import software.amazon.awscdk.services.iam.Policy
import software.amazon.awscdk.services.iam.PolicyDocument
import software.amazon.awscdk.services.iam.PolicyDocumentProps
import software.amazon.awscdk.services.iam.PolicyProps
import software.amazon.awscdk.services.iam.PolicyStatement
import software.amazon.awscdk.services.iam.PolicyStatementProps
import software.amazon.awscdk.services.iam.Role
import software.amazon.awscdk.services.iam.RoleProps
import software.amazon.awscdk.services.iam.SamlProvider
import software.amazon.awscdk.services.iam.SamlProviderProps
import software.amazon.awscdk.services.iam.ServicePrincipal
import software.amazon.awscdk.services.iam.ServicePrincipalOpts
import software.amazon.awscdk.services.iam.UnknownPrincipal
import software.amazon.awscdk.services.iam.UnknownPrincipalProps
import software.amazon.awscdk.services.iam.User
import software.amazon.awscdk.services.iam.UserAttributes
import software.amazon.awscdk.services.iam.UserProps
import software.amazon.awscdk.services.iam.WithoutPolicyUpdatesOptions
import software.constructs.Construct

public object iam {
    /**
     * Define a new IAM Access Key.
     *
     * Example:
     * ```
     * // Creates a new IAM user, access and secret keys, and stores the secret access key in a
     * Secret.
     * User user = new User(this, "User");
     * AccessKey accessKey = AccessKey.Builder.create(this, "AccessKey").user(user).build();
     * Secret secret = Secret.Builder.create(this, "Secret")
     * .secretStringValue(accessKey.getSecretAccessKey())
     * .build();
     * ```
     */
    public inline fun accessKey(
        scope: Construct,
        id: String,
        block: AccessKeyDsl.() -> Unit = {},
    ): AccessKey {
        val builder = AccessKeyDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining an IAM access key.
     *
     * Example:
     * ```
     * // Creates a new IAM user, access and secret keys, and stores the secret access key in a
     * Secret.
     * User user = new User(this, "User");
     * AccessKey accessKey = AccessKey.Builder.create(this, "AccessKey").user(user).build();
     * Secret secret = Secret.Builder.create(this, "Secret")
     * .secretStringValue(accessKey.getSecretAccessKey())
     * .build();
     * ```
     */
    public inline fun accessKeyProps(block: AccessKeyPropsDsl.() -> Unit = {}): AccessKeyProps {
        val builder = AccessKeyPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Result of calling `addToPrincipalPolicy`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.iam.*;
     * import software.constructs.*;
     * IDependable dependable;
     * AddToPrincipalPolicyResult addToPrincipalPolicyResult = AddToPrincipalPolicyResult.builder()
     * .statementAdded(false)
     * // the properties below are optional
     * .policyDependable(dependable)
     * .build();
     * ```
     */
    public inline fun addToPrincipalPolicyResult(
        block: AddToPrincipalPolicyResultDsl.() -> Unit = {}
    ): AddToPrincipalPolicyResult {
        val builder = AddToPrincipalPolicyResultDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Result of calling addToResourcePolicy.
     *
     * Example:
     * ```
     * IBucket bucket = Bucket.fromBucketName(this, "existingBucket", "bucket-name");
     * // No policy statement will be added to the resource
     * AddToResourcePolicyResult result = bucket.addToResourcePolicy(
     * PolicyStatement.Builder.create()
     * .actions(List.of("s3:GetObject"))
     * .resources(List.of(bucket.arnForObjects("file.txt")))
     * .principals(List.of(new AccountRootPrincipal()))
     * .build());
     * ```
     */
    public inline fun addToResourcePolicyResult(
        block: AddToResourcePolicyResultDsl.() -> Unit = {}
    ): AddToResourcePolicyResult {
        val builder = AddToResourcePolicyResultDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Creates a new AWS secret access key and corresponding AWS access key ID for the specified
     * user.
     *
     * The default status for new keys is `Active` .
     *
     * For information about quotas on the number of keys you can create, see
     * [IAM and AWS STS quotas](https://docs.aws.amazon.com/IAM/latest/UserGuide/reference_iam-quotas.html)
     * in the *IAM User Guide* .
     *
     * To ensure the security of your AWS account , the secret access key is accessible only during
     * key and user creation. You must save the key (for example, in a text file) if you want to be
     * able to access it again. If a secret key is lost, you can rotate access keys by increasing
     * the value of the `serial` property.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.iam.*;
     * CfnAccessKey cfnAccessKey = CfnAccessKey.Builder.create(this, "MyCfnAccessKey")
     * .userName("userName")
     * // the properties below are optional
     * .serial(123)
     * .status("status")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iam-accesskey.html)
     */
    public inline fun cfnAccessKey(
        scope: Construct,
        id: String,
        block: CfnAccessKeyDsl.() -> Unit = {},
    ): CfnAccessKey {
        val builder = CfnAccessKeyDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnAccessKey`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.iam.*;
     * CfnAccessKeyProps cfnAccessKeyProps = CfnAccessKeyProps.builder()
     * .userName("userName")
     * // the properties below are optional
     * .serial(123)
     * .status("status")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iam-accesskey.html)
     */
    public inline fun cfnAccessKeyProps(
        block: CfnAccessKeyPropsDsl.() -> Unit = {}
    ): CfnAccessKeyProps {
        val builder = CfnAccessKeyPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Creates a new group.
     *
     * For information about the number of groups you can create, see
     * [Limitations on IAM Entities](https://docs.aws.amazon.com/IAM/latest/UserGuide/LimitationsOnEntities.html)
     * in the *IAM User Guide* .
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.iam.*;
     * Object policyDocument;
     * CfnGroup cfnGroup = CfnGroup.Builder.create(this, "MyCfnGroup")
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
    public inline fun cfnGroup(
        scope: Construct,
        id: String,
        block: CfnGroupDsl.() -> Unit = {},
    ): CfnGroup {
        val builder = CfnGroupDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Adds or updates an inline policy document that is embedded in the specified IAM group.
     *
     * A group can also have managed policies attached to it. To attach a managed policy to a group,
     * use
     * [`AWS::IAM::Group`](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iam-group.html)
     * . To create a new managed policy, use
     * [`AWS::IAM::ManagedPolicy`](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iam-managedpolicy.html)
     * . For information about policies, see
     * [Managed policies and inline policies](https://docs.aws.amazon.com/IAM/latest/UserGuide/policies-managed-vs-inline.html)
     * in the *IAM User Guide* .
     *
     * For information about the maximum number of inline policies that you can embed in a group,
     * see
     * [IAM and AWS STS quotas](https://docs.aws.amazon.com/IAM/latest/UserGuide/reference_iam-quotas.html)
     * in the *IAM User Guide* .
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.iam.*;
     * Object policyDocument;
     * CfnGroupPolicy cfnGroupPolicy = CfnGroupPolicy.Builder.create(this, "MyCfnGroupPolicy")
     * .groupName("groupName")
     * .policyName("policyName")
     * // the properties below are optional
     * .policyDocument(policyDocument)
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iam-grouppolicy.html)
     */
    public inline fun cfnGroupPolicy(
        scope: Construct,
        id: String,
        block: CfnGroupPolicyDsl.() -> Unit = {},
    ): CfnGroupPolicy {
        val builder = CfnGroupPolicyDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Contains information about an attached policy.
     *
     * An attached policy is a managed policy that has been attached to a user, group, or role.
     *
     * For more information about managed policies, see
     * [Managed Policies and Inline Policies](https://docs.aws.amazon.com/IAM/latest/UserGuide/policies-managed-vs-inline.html)
     * in the *IAM User Guide* .
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.iam.*;
     * Object policyDocument;
     * PolicyProperty policyProperty = PolicyProperty.builder()
     * .policyDocument(policyDocument)
     * .policyName("policyName")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iam-group-policy.html)
     */
    public inline fun cfnGroupPolicyProperty(
        block: CfnGroupPolicyPropertyDsl.() -> Unit = {}
    ): CfnGroup.PolicyProperty {
        val builder = CfnGroupPolicyPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnGroupPolicy`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.iam.*;
     * Object policyDocument;
     * CfnGroupPolicyProps cfnGroupPolicyProps = CfnGroupPolicyProps.builder()
     * .groupName("groupName")
     * .policyName("policyName")
     * // the properties below are optional
     * .policyDocument(policyDocument)
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iam-grouppolicy.html)
     */
    public inline fun cfnGroupPolicyProps(
        block: CfnGroupPolicyPropsDsl.() -> Unit = {}
    ): CfnGroupPolicyProps {
        val builder = CfnGroupPolicyPropsDsl()
        builder.apply(block)
        return builder.build()
    }

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
    public inline fun cfnGroupProps(block: CfnGroupPropsDsl.() -> Unit = {}): CfnGroupProps {
        val builder = CfnGroupPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Creates a new instance profile. For information about instance profiles, see
     * [Using instance profiles](https://docs.aws.amazon.com/IAM/latest/UserGuide/id_roles_use_switch-role-ec2_instance-profiles.html)
     * .
     *
     * For information about the number of instance profiles you can create, see
     * [IAM object quotas](https://docs.aws.amazon.com/IAM/latest/UserGuide/reference_iam-quotas.html)
     * in the *IAM User Guide* .
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.iam.*;
     * CfnInstanceProfile cfnInstanceProfile = CfnInstanceProfile.Builder.create(this,
     * "MyCfnInstanceProfile")
     * .roles(List.of("roles"))
     * // the properties below are optional
     * .instanceProfileName("instanceProfileName")
     * .path("path")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iam-instanceprofile.html)
     */
    public inline fun cfnInstanceProfile(
        scope: Construct,
        id: String,
        block: CfnInstanceProfileDsl.() -> Unit = {},
    ): CfnInstanceProfile {
        val builder = CfnInstanceProfileDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnInstanceProfile`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.iam.*;
     * CfnInstanceProfileProps cfnInstanceProfileProps = CfnInstanceProfileProps.builder()
     * .roles(List.of("roles"))
     * // the properties below are optional
     * .instanceProfileName("instanceProfileName")
     * .path("path")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iam-instanceprofile.html)
     */
    public inline fun cfnInstanceProfileProps(
        block: CfnInstanceProfilePropsDsl.() -> Unit = {}
    ): CfnInstanceProfileProps {
        val builder = CfnInstanceProfilePropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Creates a new managed policy for your AWS account .
     *
     * This operation creates a policy version with a version identifier of `v1` and sets v1 as the
     * policy's default version. For more information about policy versions, see
     * [Versioning for managed policies](https://docs.aws.amazon.com/IAM/latest/UserGuide/policies-managed-versions.html)
     * in the *IAM User Guide* .
     *
     * As a best practice, you can validate your IAM policies. To learn more, see
     * [Validating IAM policies](https://docs.aws.amazon.com/IAM/latest/UserGuide/access_policies_policy-validator.html)
     * in the *IAM User Guide* .
     *
     * For more information about managed policies in general, see
     * [Managed policies and inline policies](https://docs.aws.amazon.com/IAM/latest/UserGuide/policies-managed-vs-inline.html)
     * in the *IAM User Guide* .
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.iam.*;
     * Object policyDocument;
     * CfnManagedPolicy cfnManagedPolicy = CfnManagedPolicy.Builder.create(this, "MyCfnManagedPolicy")
     * .policyDocument(policyDocument)
     * // the properties below are optional
     * .description("description")
     * .groups(List.of("groups"))
     * .managedPolicyName("managedPolicyName")
     * .path("path")
     * .roles(List.of("roles"))
     * .users(List.of("users"))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iam-managedpolicy.html)
     */
    public inline fun cfnManagedPolicy(
        scope: Construct,
        id: String,
        block: CfnManagedPolicyDsl.() -> Unit = {},
    ): CfnManagedPolicy {
        val builder = CfnManagedPolicyDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnManagedPolicy`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.iam.*;
     * Object policyDocument;
     * CfnManagedPolicyProps cfnManagedPolicyProps = CfnManagedPolicyProps.builder()
     * .policyDocument(policyDocument)
     * // the properties below are optional
     * .description("description")
     * .groups(List.of("groups"))
     * .managedPolicyName("managedPolicyName")
     * .path("path")
     * .roles(List.of("roles"))
     * .users(List.of("users"))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iam-managedpolicy.html)
     */
    public inline fun cfnManagedPolicyProps(
        block: CfnManagedPolicyPropsDsl.() -> Unit = {}
    ): CfnManagedPolicyProps {
        val builder = CfnManagedPolicyPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Creates or updates an IAM entity to describe an identity provider (IdP) that supports
     * [OpenID Connect (OIDC)](https://docs.aws.amazon.com/http://openid.net/connect/) .
     *
     * The OIDC provider that you create with this operation can be used as a principal in a role's
     * trust policy. Such a policy establishes a trust relationship between AWS and the OIDC
     * provider.
     *
     * When you create the IAM OIDC provider, you specify the following:
     * * The URL of the OIDC identity provider (IdP) to trust
     * * A list of client IDs (also known as audiences) that identify the application or
     *   applications that are allowed to authenticate using the OIDC provider
     * * A list of tags that are attached to the specified IAM OIDC provider
     * * A list of thumbprints of one or more server certificates that the IdP uses
     *
     * You get all of this information from the OIDC IdP that you want to use to access AWS .
     *
     * When you update the IAM OIDC provider, you specify the following:
     * * The URL of the OIDC identity provider (IdP) to trust
     * * A list of client IDs (also known as audiences) that replaces the existing list of client
     *   IDs associated with the OIDC IdP
     * * A list of tags that replaces the existing list of tags attached to the specified IAM OIDC
     *   provider
     * * A list of thumbprints that replaces the existing list of server certificates thumbprints
     *   that the IdP uses
     *
     * The trust for the OIDC provider is derived from the IAM provider that this operation creates.
     * Therefore, it is best to limit access to the
     * [CreateOpenIDConnectProvider](https://docs.aws.amazon.com/IAM/latest/APIReference/API_CreateOpenIDConnectProvider.html)
     * operation to highly privileged users.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.iam.*;
     * CfnOIDCProvider cfnOIDCProvider = CfnOIDCProvider.Builder.create(this, "MyCfnOIDCProvider")
     * .thumbprintList(List.of("thumbprintList"))
     * // the properties below are optional
     * .clientIdList(List.of("clientIdList"))
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .url("url")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iam-oidcprovider.html)
     */
    public inline fun cfnOIDCProvider(
        scope: Construct,
        id: String,
        block: CfnOIDCProviderDsl.() -> Unit = {},
    ): CfnOIDCProvider {
        val builder = CfnOIDCProviderDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnOIDCProvider`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.iam.*;
     * CfnOIDCProviderProps cfnOIDCProviderProps = CfnOIDCProviderProps.builder()
     * .thumbprintList(List.of("thumbprintList"))
     * // the properties below are optional
     * .clientIdList(List.of("clientIdList"))
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .url("url")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iam-oidcprovider.html)
     */
    public inline fun cfnOIDCProviderProps(
        block: CfnOIDCProviderPropsDsl.() -> Unit = {}
    ): CfnOIDCProviderProps {
        val builder = CfnOIDCProviderPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Adds or updates an inline policy document that is embedded in the specified IAM group, user
     * or role.
     *
     * An IAM user can also have a managed policy attached to it. For information about policies,
     * see
     * [Managed Policies and Inline Policies](https://docs.aws.amazon.com/IAM/latest/UserGuide/policies-managed-vs-inline.html)
     * in the *IAM User Guide* .
     *
     * The Groups, Roles, and Users properties are optional. However, you must specify at least one
     * of these properties.
     *
     * For information about policy documents see
     * [Creating IAM policies](https://docs.aws.amazon.com/IAM/latest/UserGuide/access_policies_create.html)
     * in the *IAM User Guide* .
     *
     * For information about limits on the number of inline policies that you can embed in an
     * identity, see
     * [Limitations on IAM Entities](https://docs.aws.amazon.com/IAM/latest/UserGuide/LimitationsOnEntities.html)
     * in the *IAM User Guide* .
     *
     * This resource does not support
     * [drift detection](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/using-cfn-stack-drift.html)
     * . The following inline policy resource types support drift detection:
     * *
     * [`AWS::IAM::GroupPolicy`](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iam-grouppolicy.html)
     * *
     * [`AWS::IAM::RolePolicy`](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iam-rolepolicy.html)
     * *
     * [`AWS::IAM::UserPolicy`](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iam-userpolicy.html)
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.iam.*;
     * Object policyDocument;
     * CfnPolicy cfnPolicy = CfnPolicy.Builder.create(this, "MyCfnPolicy")
     * .policyDocument(policyDocument)
     * .policyName("policyName")
     * // the properties below are optional
     * .groups(List.of("groups"))
     * .roles(List.of("roles"))
     * .users(List.of("users"))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iam-policy.html)
     */
    public inline fun cfnPolicy(
        scope: Construct,
        id: String,
        block: CfnPolicyDsl.() -> Unit = {},
    ): CfnPolicy {
        val builder = CfnPolicyDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnPolicy`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.iam.*;
     * Object policyDocument;
     * CfnPolicyProps cfnPolicyProps = CfnPolicyProps.builder()
     * .policyDocument(policyDocument)
     * .policyName("policyName")
     * // the properties below are optional
     * .groups(List.of("groups"))
     * .roles(List.of("roles"))
     * .users(List.of("users"))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iam-policy.html)
     */
    public inline fun cfnPolicyProps(block: CfnPolicyPropsDsl.() -> Unit = {}): CfnPolicyProps {
        val builder = CfnPolicyPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Creates a new role for your AWS account .
     *
     * For more information about roles, see
     * [IAM roles](https://docs.aws.amazon.com/IAM/latest/UserGuide/id_roles.html) in the *IAM User
     * Guide* . For information about quotas for role names and the number of roles you can create,
     * see
     * [IAM and AWS STS quotas](https://docs.aws.amazon.com/IAM/latest/UserGuide/reference_iam-quotas.html)
     * in the *IAM User Guide* .
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.iam.*;
     * Object assumeRolePolicyDocument;
     * Object policyDocument;
     * CfnRole cfnRole = CfnRole.Builder.create(this, "MyCfnRole")
     * .assumeRolePolicyDocument(assumeRolePolicyDocument)
     * // the properties below are optional
     * .description("description")
     * .managedPolicyArns(List.of("managedPolicyArns"))
     * .maxSessionDuration(123)
     * .path("path")
     * .permissionsBoundary("permissionsBoundary")
     * .policies(List.of(PolicyProperty.builder()
     * .policyDocument(policyDocument)
     * .policyName("policyName")
     * .build()))
     * .roleName("roleName")
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iam-role.html)
     */
    public inline fun cfnRole(
        scope: Construct,
        id: String,
        block: CfnRoleDsl.() -> Unit = {},
    ): CfnRole {
        val builder = CfnRoleDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Adds or updates an inline policy document that is embedded in the specified IAM role.
     *
     * When you embed an inline policy in a role, the inline policy is used as part of the role's
     * access (permissions) policy. The role's trust policy is created at the same time as the role,
     * using [`CreateRole`](https://docs.aws.amazon.com/IAM/latest/APIReference/API_CreateRole.html)
     * . You can update a role's trust policy using
     * [`UpdateAssumeRolePolicy`](https://docs.aws.amazon.com/IAM/latest/APIReference/API_UpdateAssumeRolePolicy.html)
     * . For information about roles, see
     * [IAM roles](https://docs.aws.amazon.com/IAM/latest/UserGuide/roles-toplevel.html) in the *IAM
     * User Guide* .
     *
     * A role can also have a managed policy attached to it. To attach a managed policy to a role,
     * use
     * [`AWS::IAM::Role`](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iam-role.html)
     * . To create a new managed policy, use
     * [`AWS::IAM::ManagedPolicy`](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iam-managedpolicy.html)
     * . For information about policies, see
     * [Managed policies and inline policies](https://docs.aws.amazon.com/IAM/latest/UserGuide/policies-managed-vs-inline.html)
     * in the *IAM User Guide* .
     *
     * For information about the maximum number of inline policies that you can embed with a role,
     * see
     * [IAM and AWS STS quotas](https://docs.aws.amazon.com/IAM/latest/UserGuide/reference_iam-quotas.html)
     * in the *IAM User Guide* .
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.iam.*;
     * Object policyDocument;
     * CfnRolePolicy cfnRolePolicy = CfnRolePolicy.Builder.create(this, "MyCfnRolePolicy")
     * .policyName("policyName")
     * .roleName("roleName")
     * // the properties below are optional
     * .policyDocument(policyDocument)
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iam-rolepolicy.html)
     */
    public inline fun cfnRolePolicy(
        scope: Construct,
        id: String,
        block: CfnRolePolicyDsl.() -> Unit = {},
    ): CfnRolePolicy {
        val builder = CfnRolePolicyDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Contains information about an attached policy.
     *
     * An attached policy is a managed policy that has been attached to a user, group, or role.
     *
     * For more information about managed policies, refer to
     * [Managed Policies and Inline Policies](https://docs.aws.amazon.com/IAM/latest/UserGuide/policies-managed-vs-inline.html)
     * in the *IAM User Guide* .
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.iam.*;
     * Object policyDocument;
     * PolicyProperty policyProperty = PolicyProperty.builder()
     * .policyDocument(policyDocument)
     * .policyName("policyName")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iam-role-policy.html)
     */
    public inline fun cfnRolePolicyProperty(
        block: CfnRolePolicyPropertyDsl.() -> Unit = {}
    ): CfnRole.PolicyProperty {
        val builder = CfnRolePolicyPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

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
    public inline fun cfnRolePolicyProps(
        block: CfnRolePolicyPropsDsl.() -> Unit = {}
    ): CfnRolePolicyProps {
        val builder = CfnRolePolicyPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnRole`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.iam.*;
     * Object assumeRolePolicyDocument;
     * Object policyDocument;
     * CfnRoleProps cfnRoleProps = CfnRoleProps.builder()
     * .assumeRolePolicyDocument(assumeRolePolicyDocument)
     * // the properties below are optional
     * .description("description")
     * .managedPolicyArns(List.of("managedPolicyArns"))
     * .maxSessionDuration(123)
     * .path("path")
     * .permissionsBoundary("permissionsBoundary")
     * .policies(List.of(PolicyProperty.builder()
     * .policyDocument(policyDocument)
     * .policyName("policyName")
     * .build()))
     * .roleName("roleName")
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iam-role.html)
     */
    public inline fun cfnRoleProps(block: CfnRolePropsDsl.() -> Unit = {}): CfnRoleProps {
        val builder = CfnRolePropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Creates an IAM resource that describes an identity provider (IdP) that supports SAML 2.0.
     *
     * The SAML provider resource that you create with this operation can be used as a principal in
     * an IAM role's trust policy. Such a policy can enable federated users who sign in using the
     * SAML IdP to assume the role. You can create an IAM role that supports Web-based single
     * sign-on (SSO) to the AWS Management Console or one that supports API access to AWS .
     *
     * When you create the SAML provider resource, you upload a SAML metadata document that you get
     * from your IdP. That document includes the issuer's name, expiration information, and keys
     * that can be used to validate the SAML authentication response (assertions) that the IdP
     * sends. You must generate the metadata document using the identity management software that is
     * used as your organization's IdP.
     *
     * This operation requires
     * [Signature Version 4](https://docs.aws.amazon.com/general/latest/gr/signature-version-4.html)
     * .
     *
     * For more information, see
     * [Enabling SAML 2.0 federated users to access the AWS Management Console](https://docs.aws.amazon.com/IAM/latest/UserGuide/id_roles_providers_enable-console-saml.html)
     * and
     * [About SAML 2.0-based federation](https://docs.aws.amazon.com/IAM/latest/UserGuide/id_roles_providers_saml.html)
     * in the *IAM User Guide* .
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.iam.*;
     * CfnSAMLProvider cfnSAMLProvider = CfnSAMLProvider.Builder.create(this, "MyCfnSAMLProvider")
     * .samlMetadataDocument("samlMetadataDocument")
     * // the properties below are optional
     * .name("name")
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iam-samlprovider.html)
     */
    public inline fun cfnSAMLProvider(
        scope: Construct,
        id: String,
        block: CfnSAMLProviderDsl.() -> Unit = {},
    ): CfnSAMLProvider {
        val builder = CfnSAMLProviderDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnSAMLProvider`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.iam.*;
     * CfnSAMLProviderProps cfnSAMLProviderProps = CfnSAMLProviderProps.builder()
     * .samlMetadataDocument("samlMetadataDocument")
     * // the properties below are optional
     * .name("name")
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iam-samlprovider.html)
     */
    public inline fun cfnSAMLProviderProps(
        block: CfnSAMLProviderPropsDsl.() -> Unit = {}
    ): CfnSAMLProviderProps {
        val builder = CfnSAMLProviderPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Uploads a server certificate entity for the AWS account .
     *
     * The server certificate entity includes a public key certificate, a private key, and an
     * optional certificate chain, which should all be PEM-encoded.
     *
     * We recommend that you use [AWS Certificate Manager](https://docs.aws.amazon.com/acm/) to
     * provision, manage, and deploy your server certificates. With ACM you can request a
     * certificate, deploy it to AWS resources, and let ACM handle certificate renewals for you.
     * Certificates provided by ACM are free. For more information about using ACM, see the
     * [AWS Certificate Manager User Guide](https://docs.aws.amazon.com/acm/latest/userguide/) .
     *
     * For more information about working with server certificates, see
     * [Working with server certificates](https://docs.aws.amazon.com/IAM/latest/UserGuide/id_credentials_server-certs.html)
     * in the *IAM User Guide* . This topic includes a list of AWS services that can use the server
     * certificates that you manage with IAM.
     *
     * For information about the number of server certificates you can upload, see
     * [IAM and AWS STS quotas](https://docs.aws.amazon.com/IAM/latest/UserGuide/reference_iam-quotas.html)
     * in the *IAM User Guide* .
     *
     * Because the body of the public key certificate, private key, and the certificate chain can be
     * large, you should use POST rather than GET when calling `UploadServerCertificate` . For
     * information about setting up signatures and authorization through the API, see
     * [Signing AWS API requests](https://docs.aws.amazon.com/general/latest/gr/signing_aws_api_requests.html)
     * in the *AWS General Reference* . For general information about using the Query API with IAM,
     * see
     * [Calling the API by making HTTP query requests](https://docs.aws.amazon.com/IAM/latest/UserGuide/programming.html)
     * in the *IAM User Guide* .
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.iam.*;
     * CfnServerCertificate cfnServerCertificate = CfnServerCertificate.Builder.create(this,
     * "MyCfnServerCertificate")
     * .certificateBody("certificateBody")
     * .certificateChain("certificateChain")
     * .path("path")
     * .privateKey("privateKey")
     * .serverCertificateName("serverCertificateName")
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iam-servercertificate.html)
     */
    public inline fun cfnServerCertificate(
        scope: Construct,
        id: String,
        block: CfnServerCertificateDsl.() -> Unit = {},
    ): CfnServerCertificate {
        val builder = CfnServerCertificateDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnServerCertificate`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.iam.*;
     * CfnServerCertificateProps cfnServerCertificateProps = CfnServerCertificateProps.builder()
     * .certificateBody("certificateBody")
     * .certificateChain("certificateChain")
     * .path("path")
     * .privateKey("privateKey")
     * .serverCertificateName("serverCertificateName")
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iam-servercertificate.html)
     */
    public inline fun cfnServerCertificateProps(
        block: CfnServerCertificatePropsDsl.() -> Unit = {}
    ): CfnServerCertificateProps {
        val builder = CfnServerCertificatePropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Creates an IAM role that is linked to a specific AWS service.
     *
     * The service controls the attached policies and when the role can be deleted. This helps
     * ensure that the service is not broken by an unexpectedly changed or deleted role, which could
     * put your AWS resources into an unknown state. Allowing the service to control the role helps
     * improve service stability and proper cleanup when a service and its role are no longer
     * needed. For more information, see
     * [Using service-linked roles](https://docs.aws.amazon.com/IAM/latest/UserGuide/using-service-linked-roles.html)
     * in the *IAM User Guide* .
     *
     * To attach a policy to this service-linked role, you must make the request using the AWS
     * service that depends on this role.
     *
     * Example:
     * ```
     * CfnServiceLinkedRole slr = CfnServiceLinkedRole.Builder.create(this, "ElasticSLR")
     * .awsServiceName("es.amazonaws.com")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iam-servicelinkedrole.html)
     */
    public inline fun cfnServiceLinkedRole(
        scope: Construct,
        id: String,
        block: CfnServiceLinkedRoleDsl.() -> Unit = {},
    ): CfnServiceLinkedRole {
        val builder = CfnServiceLinkedRoleDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnServiceLinkedRole`.
     *
     * Example:
     * ```
     * CfnServiceLinkedRole slr = CfnServiceLinkedRole.Builder.create(this, "ElasticSLR")
     * .awsServiceName("es.amazonaws.com")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iam-servicelinkedrole.html)
     */
    public inline fun cfnServiceLinkedRoleProps(
        block: CfnServiceLinkedRolePropsDsl.() -> Unit = {}
    ): CfnServiceLinkedRoleProps {
        val builder = CfnServiceLinkedRolePropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Creates a new IAM user for your AWS account .
     *
     * For information about quotas for the number of IAM users you can create, see
     * [IAM and AWS STS quotas](https://docs.aws.amazon.com/IAM/latest/UserGuide/reference_iam-quotas.html)
     * in the *IAM User Guide* .
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.iam.*;
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
    public inline fun cfnUser(
        scope: Construct,
        id: String,
        block: CfnUserDsl.() -> Unit = {},
    ): CfnUser {
        val builder = CfnUserDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Creates a password for the specified user, giving the user the ability to access AWS services
     * through the AWS Management Console .
     *
     * For more information about managing passwords, see
     * [Managing Passwords](https://docs.aws.amazon.com/IAM/latest/UserGuide/Using_ManagingLogins.html)
     * in the *IAM User Guide* .
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.iam.*;
     * LoginProfileProperty loginProfileProperty = LoginProfileProperty.builder()
     * .password("password")
     * // the properties below are optional
     * .passwordResetRequired(false)
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iam-user-loginprofile.html)
     */
    public inline fun cfnUserLoginProfileProperty(
        block: CfnUserLoginProfilePropertyDsl.() -> Unit = {}
    ): CfnUser.LoginProfileProperty {
        val builder = CfnUserLoginProfilePropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Adds or updates an inline policy document that is embedded in the specified IAM user.
     *
     * An IAM user can also have a managed policy attached to it. To attach a managed policy to a
     * user, use
     * [`AWS::IAM::User`](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iam-user.html)
     * . To create a new managed policy, use
     * [`AWS::IAM::ManagedPolicy`](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iam-managedpolicy.html)
     * . For information about policies, see
     * [Managed policies and inline policies](https://docs.aws.amazon.com/IAM/latest/UserGuide/policies-managed-vs-inline.html)
     * in the *IAM User Guide* .
     *
     * For information about the maximum number of inline policies that you can embed in a user, see
     * [IAM and AWS STS quotas](https://docs.aws.amazon.com/IAM/latest/UserGuide/reference_iam-quotas.html)
     * in the *IAM User Guide* .
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.iam.*;
     * Object policyDocument;
     * CfnUserPolicy cfnUserPolicy = CfnUserPolicy.Builder.create(this, "MyCfnUserPolicy")
     * .policyName("policyName")
     * .userName("userName")
     * // the properties below are optional
     * .policyDocument(policyDocument)
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iam-userpolicy.html)
     */
    public inline fun cfnUserPolicy(
        scope: Construct,
        id: String,
        block: CfnUserPolicyDsl.() -> Unit = {},
    ): CfnUserPolicy {
        val builder = CfnUserPolicyDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Contains information about an attached policy.
     *
     * An attached policy is a managed policy that has been attached to a user, group, or role.
     *
     * For more information about managed policies, refer to
     * [Managed Policies and Inline Policies](https://docs.aws.amazon.com/IAM/latest/UserGuide/policies-managed-vs-inline.html)
     * in the *IAM User Guide* .
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.iam.*;
     * Object policyDocument;
     * PolicyProperty policyProperty = PolicyProperty.builder()
     * .policyDocument(policyDocument)
     * .policyName("policyName")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iam-user-policy.html)
     */
    public inline fun cfnUserPolicyProperty(
        block: CfnUserPolicyPropertyDsl.() -> Unit = {}
    ): CfnUser.PolicyProperty {
        val builder = CfnUserPolicyPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnUserPolicy`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.iam.*;
     * Object policyDocument;
     * CfnUserPolicyProps cfnUserPolicyProps = CfnUserPolicyProps.builder()
     * .policyName("policyName")
     * .userName("userName")
     * // the properties below are optional
     * .policyDocument(policyDocument)
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iam-userpolicy.html)
     */
    public inline fun cfnUserPolicyProps(
        block: CfnUserPolicyPropsDsl.() -> Unit = {}
    ): CfnUserPolicyProps {
        val builder = CfnUserPolicyPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnUser`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.iam.*;
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
    public inline fun cfnUserProps(block: CfnUserPropsDsl.() -> Unit = {}): CfnUserProps {
        val builder = CfnUserPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Adds the specified user to the specified group.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.iam.*;
     * CfnUserToGroupAddition cfnUserToGroupAddition = CfnUserToGroupAddition.Builder.create(this,
     * "MyCfnUserToGroupAddition")
     * .groupName("groupName")
     * .users(List.of("users"))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iam-usertogroupaddition.html)
     */
    public inline fun cfnUserToGroupAddition(
        scope: Construct,
        id: String,
        block: CfnUserToGroupAdditionDsl.() -> Unit = {},
    ): CfnUserToGroupAddition {
        val builder = CfnUserToGroupAdditionDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnUserToGroupAddition`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.iam.*;
     * CfnUserToGroupAdditionProps cfnUserToGroupAdditionProps = CfnUserToGroupAdditionProps.builder()
     * .groupName("groupName")
     * .users(List.of("users"))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iam-usertogroupaddition.html)
     */
    public inline fun cfnUserToGroupAdditionProps(
        block: CfnUserToGroupAdditionPropsDsl.() -> Unit = {}
    ): CfnUserToGroupAdditionProps {
        val builder = CfnUserToGroupAdditionPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Creates a new virtual MFA device for the AWS account .
     *
     * After creating the virtual MFA, use
     * [EnableMFADevice](https://docs.aws.amazon.com/IAM/latest/APIReference/API_EnableMFADevice.html)
     * to attach the MFA device to an IAM user. For more information about creating and working with
     * virtual MFA devices, see
     * [Using a virtual MFA device](https://docs.aws.amazon.com/IAM/latest/UserGuide/Using_VirtualMFA.html)
     * in the *IAM User Guide* .
     *
     * For information about the maximum number of MFA devices you can create, see
     * [IAM and AWS STS quotas](https://docs.aws.amazon.com/IAM/latest/UserGuide/reference_iam-quotas.html)
     * in the *IAM User Guide* .
     *
     * The seed information contained in the QR code and the Base32 string should be treated like
     * any other secret access information. In other words, protect the seed information as you
     * would your AWS access keys or your passwords. After you provision your virtual device, you
     * should ensure that the information is destroyed following secure procedures.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.iam.*;
     * CfnVirtualMFADevice cfnVirtualMFADevice = CfnVirtualMFADevice.Builder.create(this,
     * "MyCfnVirtualMFADevice")
     * .users(List.of("users"))
     * // the properties below are optional
     * .path("path")
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .virtualMfaDeviceName("virtualMfaDeviceName")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iam-virtualmfadevice.html)
     */
    public inline fun cfnVirtualMFADevice(
        scope: Construct,
        id: String,
        block: CfnVirtualMFADeviceDsl.() -> Unit = {},
    ): CfnVirtualMFADevice {
        val builder = CfnVirtualMFADeviceDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnVirtualMFADevice`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.iam.*;
     * CfnVirtualMFADeviceProps cfnVirtualMFADeviceProps = CfnVirtualMFADeviceProps.builder()
     * .users(List.of("users"))
     * // the properties below are optional
     * .path("path")
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .virtualMfaDeviceName("virtualMfaDeviceName")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iam-virtualmfadevice.html)
     */
    public inline fun cfnVirtualMFADeviceProps(
        block: CfnVirtualMFADevicePropsDsl.() -> Unit = {}
    ): CfnVirtualMFADeviceProps {
        val builder = CfnVirtualMFADevicePropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Basic options for a grant operation.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.iam.*;
     * Object conditions;
     * IGrantable grantable;
     * CommonGrantOptions commonGrantOptions = CommonGrantOptions.builder()
     * .actions(List.of("actions"))
     * .grantee(grantable)
     * .resourceArns(List.of("resourceArns"))
     * // the properties below are optional
     * .conditions(Map.of(
     * "conditionsKey", Map.of(
     * "conditionsKey", conditions)))
     * .build();
     * ```
     */
    public inline fun commonGrantOptions(
        block: CommonGrantOptionsDsl.() -> Unit = {}
    ): CommonGrantOptions {
        val builder = CommonGrantOptionsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Options for customizing IAM role creation.
     *
     * Example:
     * ```
     * App app;
     * Stack stack = new Stack(app, "MyStack");
     * Role.customizeRoles(this, CustomizeRolesOptions.builder()
     * .usePrecreatedRoles(Map.of(
     * "MyStack/MyLambda/ServiceRole", "my-role-name"))
     * .build());
     * ```
     */
    public inline fun customizeRolesOptions(
        block: CustomizeRolesOptionsDsl.() -> Unit = {}
    ): CustomizeRolesOptions {
        val builder = CustomizeRolesOptionsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Options allowing customizing the behavior of `Role.fromRoleArn`.
     *
     * Example:
     * ```
     * IRole role = Role.fromRoleArn(this, "Role", "arn:aws:iam::123456789012:role/MyExistingRole",
     * FromRoleArnOptions.builder()
     * // Set 'mutable' to 'false' to use the role as-is and prevent adding new
     * // policies to it. The default is 'true', which means the role may be
     * // modified as part of the deployment.
     * .mutable(false)
     * .build());
     * ```
     */
    public inline fun fromRoleArnOptions(
        block: FromRoleArnOptionsDsl.() -> Unit = {}
    ): FromRoleArnOptions {
        val builder = FromRoleArnOptionsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Options allowing customizing the behavior of `Role.fromRoleName`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.iam.*;
     * FromRoleNameOptions fromRoleNameOptions = FromRoleNameOptions.builder()
     * .addGrantsToResources(false)
     * .defaultPolicyName("defaultPolicyName")
     * .mutable(false)
     * .build();
     * ```
     */
    public inline fun fromRoleNameOptions(
        block: FromRoleNameOptionsDsl.() -> Unit = {}
    ): FromRoleNameOptions {
        val builder = FromRoleNameOptionsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Options for a grant operation to both identity and resource.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.iam.*;
     * Object conditions;
     * IGrantable grantable;
     * IPrincipal principal;
     * IResourceWithPolicy resourceWithPolicy;
     * GrantOnPrincipalAndResourceOptions grantOnPrincipalAndResourceOptions =
     * GrantOnPrincipalAndResourceOptions.builder()
     * .actions(List.of("actions"))
     * .grantee(grantable)
     * .resource(resourceWithPolicy)
     * .resourceArns(List.of("resourceArns"))
     * // the properties below are optional
     * .conditions(Map.of(
     * "conditionsKey", Map.of(
     * "conditionsKey", conditions)))
     * .resourcePolicyPrincipal(principal)
     * .resourceSelfArns(List.of("resourceSelfArns"))
     * .build();
     * ```
     */
    public inline fun grantOnPrincipalAndResourceOptions(
        block: GrantOnPrincipalAndResourceOptionsDsl.() -> Unit = {}
    ): GrantOnPrincipalAndResourceOptions {
        val builder = GrantOnPrincipalAndResourceOptionsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Options for a grant operation that only applies to principals.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.iam.*;
     * import software.constructs.*;
     * Object conditions;
     * Construct construct;
     * IGrantable grantable;
     * GrantOnPrincipalOptions grantOnPrincipalOptions = GrantOnPrincipalOptions.builder()
     * .actions(List.of("actions"))
     * .grantee(grantable)
     * .resourceArns(List.of("resourceArns"))
     * // the properties below are optional
     * .conditions(Map.of(
     * "conditionsKey", Map.of(
     * "conditionsKey", conditions)))
     * .scope(construct)
     * .build();
     * ```
     */
    public inline fun grantOnPrincipalOptions(
        block: GrantOnPrincipalOptionsDsl.() -> Unit = {}
    ): GrantOnPrincipalOptions {
        val builder = GrantOnPrincipalOptionsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Options for a grant operation.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.iam.*;
     * Object conditions;
     * IGrantable grantable;
     * IResourceWithPolicy resourceWithPolicy;
     * GrantWithResourceOptions grantWithResourceOptions = GrantWithResourceOptions.builder()
     * .actions(List.of("actions"))
     * .grantee(grantable)
     * .resource(resourceWithPolicy)
     * .resourceArns(List.of("resourceArns"))
     * // the properties below are optional
     * .conditions(Map.of(
     * "conditionsKey", Map.of(
     * "conditionsKey", conditions)))
     * .resourceSelfArns(List.of("resourceSelfArns"))
     * .build();
     * ```
     */
    public inline fun grantWithResourceOptions(
        block: GrantWithResourceOptionsDsl.() -> Unit = {}
    ): GrantWithResourceOptions {
        val builder = GrantWithResourceOptionsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * An IAM Group (collection of IAM users) lets you specify permissions for multiple users, which
     * can make it easier to manage permissions for those users.
     *
     * Example:
     * ```
     * User user = new User(this, "MyUser"); // or User.fromUserName(this, 'User', 'johnsmith');
     * Group group = new Group(this, "MyGroup"); // or Group.fromGroupArn(this, 'Group',
     * 'arn:aws:iam::account-id:group/group-name');
     * user.addToGroup(group);
     * // or
     * group.addUser(user);
     * ```
     *
     * [Documentation](https://docs.aws.amazon.com/IAM/latest/UserGuide/id_groups.html)
     */
    public inline fun group(
        scope: Construct,
        id: String,
        block: GroupDsl.() -> Unit = {},
    ): Group {
        val builder = GroupDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining an IAM group.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.iam.*;
     * ManagedPolicy managedPolicy;
     * GroupProps groupProps = GroupProps.builder()
     * .groupName("groupName")
     * .managedPolicies(List.of(managedPolicy))
     * .path("path")
     * .build();
     * ```
     */
    public inline fun groupProps(block: GroupPropsDsl.() -> Unit = {}): GroupProps {
        val builder = GroupPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * IAM Instance Profile.
     *
     * Example:
     * ```
     * Role role = Role.Builder.create(this, "Role")
     * .assumedBy(new ServicePrincipal("ec2.amazonaws.com"))
     * .build();
     * IInstanceProfile instanceProfile = InstanceProfile.fromInstanceProfileAttributes(this,
     * "ImportedInstanceProfile", InstanceProfileAttributes.builder()
     * .instanceProfileArn("arn:aws:iam::account-id:instance-profile/MyInstanceProfile")
     * .role(role)
     * .build());
     * ```
     */
    public inline fun instanceProfile(
        scope: Construct,
        id: String,
        block: InstanceProfileDsl.() -> Unit = {},
    ): InstanceProfile {
        val builder = InstanceProfileDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Attributes of an Instance Profile.
     *
     * Example:
     * ```
     * Role role = Role.Builder.create(this, "Role")
     * .assumedBy(new ServicePrincipal("ec2.amazonaws.com"))
     * .build();
     * IInstanceProfile instanceProfile = InstanceProfile.fromInstanceProfileAttributes(this,
     * "ImportedInstanceProfile", InstanceProfileAttributes.builder()
     * .instanceProfileArn("arn:aws:iam::account-id:instance-profile/MyInstanceProfile")
     * .role(role)
     * .build());
     * ```
     */
    public inline fun instanceProfileAttributes(
        block: InstanceProfileAttributesDsl.() -> Unit = {}
    ): InstanceProfileAttributes {
        val builder = InstanceProfileAttributesDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties of an Instance Profile.
     *
     * Example:
     * ```
     * Role role = Role.Builder.create(this, "Role")
     * .assumedBy(new ServicePrincipal("ec2.amazonaws.com"))
     * .build();
     * InstanceProfile instanceProfile = InstanceProfile.Builder.create(this, "InstanceProfile")
     * .role(role)
     * .instanceProfileName("MyInstanceProfile")
     * .path("/sample/path/")
     * .build();
     * ```
     */
    public inline fun instanceProfileProps(
        block: InstanceProfilePropsDsl.() -> Unit = {}
    ): InstanceProfileProps {
        val builder = InstanceProfilePropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * An IAM role that only gets attached to the construct tree once it gets used, not before.
     *
     * This construct can be used to simplify logic in other constructs which need to create a role
     * but only if certain configurations occur (such as when AutoScaling is configured). The role
     * can be configured in one place, but if it never gets used it doesn't get instantiated and
     * will not be synthesized or deployed.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.*;
     * import software.amazon.awscdk.services.iam.*;
     * ManagedPolicy managedPolicy;
     * PolicyDocument policyDocument;
     * IPrincipal principal;
     * LazyRole lazyRole = LazyRole.Builder.create(this, "MyLazyRole")
     * .assumedBy(principal)
     * // the properties below are optional
     * .description("description")
     * .externalIds(List.of("externalIds"))
     * .inlinePolicies(Map.of(
     * "inlinePoliciesKey", policyDocument))
     * .managedPolicies(List.of(managedPolicy))
     * .maxSessionDuration(Duration.minutes(30))
     * .path("path")
     * .permissionsBoundary(managedPolicy)
     * .roleName("roleName")
     * .build();
     * ```
     */
    public inline fun lazyRole(
        scope: Construct,
        id: String,
        block: LazyRoleDsl.() -> Unit = {},
    ): LazyRole {
        val builder = LazyRoleDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a LazyRole.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.*;
     * import software.amazon.awscdk.services.iam.*;
     * ManagedPolicy managedPolicy;
     * PolicyDocument policyDocument;
     * IPrincipal principal;
     * LazyRoleProps lazyRoleProps = LazyRoleProps.builder()
     * .assumedBy(principal)
     * // the properties below are optional
     * .description("description")
     * .externalIds(List.of("externalIds"))
     * .inlinePolicies(Map.of(
     * "inlinePoliciesKey", policyDocument))
     * .managedPolicies(List.of(managedPolicy))
     * .maxSessionDuration(Duration.minutes(30))
     * .path("path")
     * .permissionsBoundary(managedPolicy)
     * .roleName("roleName")
     * .build();
     * ```
     */
    public inline fun lazyRoleProps(block: LazyRolePropsDsl.() -> Unit = {}): LazyRoleProps {
        val builder = LazyRolePropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Managed policy.
     *
     * Example:
     * ```
     * Build build;
     * Role role = Role.Builder.create(this, "Role")
     * .assumedBy(new CompositePrincipal(new ServicePrincipal("gamelift.amazonaws.com")))
     * .build();
     * role.addManagedPolicy(ManagedPolicy.fromAwsManagedPolicyName("CloudWatchAgentServerPolicy"));
     * BuildFleet fleet = BuildFleet.Builder.create(this, "Game server fleet")
     * .fleetName("test-fleet")
     * .content(build)
     * .instanceType(InstanceType.of(InstanceClass.C5, InstanceSize.LARGE))
     * .runtimeConfiguration(RuntimeConfiguration.builder()
     * .serverProcesses(List.of(ServerProcess.builder()
     * .launchPath("/local/game/GameLiftExampleServer.x86_64")
     * .build()))
     * .build())
     * .role(role)
     * .build();
     * // Actions can also be grantted through dedicated method
     * fleet.grant(role, "gamelift:ListFleets");
     * ```
     */
    public inline fun managedPolicy(
        scope: Construct,
        id: String,
        block: ManagedPolicyDsl.() -> Unit = {},
    ): ManagedPolicy {
        val builder = ManagedPolicyDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining an IAM managed policy.
     *
     * Example:
     * ```
     * Map&lt;String, Object&gt; policyDocument = Map.of(
     * "Version", "2012-10-17",
     * "Statement", List.of(Map.of(
     * "Sid", "FirstStatement",
     * "Effect", "Allow",
     * "Action", List.of("iam:ChangePassword"),
     * "Resource", List.of("*")), Map.of(
     * "Sid", "SecondStatement",
     * "Effect", "Allow",
     * "Action", List.of("s3:ListAllMyBuckets"),
     * "Resource", List.of("*")), Map.of(
     * "Sid", "ThirdStatement",
     * "Effect", "Allow",
     * "Action", List.of("s3:List*", "s3:Get*"),
     * "Resource", List.of("arn:aws:s3:::confidential-data", "arn:aws:s3:::confidential-data/ *"),
     * "Condition", Map.of("Bool", Map.of("aws:MultiFactorAuthPresent", "true")))));
     * PolicyDocument customPolicyDocument = PolicyDocument.fromJson(policyDocument);
     * // You can pass this document as an initial document to a ManagedPolicy
     * // or inline Policy.
     * ManagedPolicy newManagedPolicy = ManagedPolicy.Builder.create(this, "MyNewManagedPolicy")
     * .document(customPolicyDocument)
     * .build();
     * Policy newPolicy = Policy.Builder.create(this, "MyNewPolicy")
     * .document(customPolicyDocument)
     * .build();
     * ```
     */
    public inline fun managedPolicyProps(
        block: ManagedPolicyPropsDsl.() -> Unit = {}
    ): ManagedPolicyProps {
        val builder = ManagedPolicyPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * IAM OIDC identity providers are entities in IAM that describe an external identity provider
     * (IdP) service that supports the OpenID Connect (OIDC) standard, such as Google or Salesforce.
     *
     * You use an IAM OIDC identity provider when you want to establish trust between an
     * OIDC-compatible IdP and your AWS account. This is useful when creating a mobile app or web
     * application that requires access to AWS resources, but you don't want to create custom
     * sign-in code or manage your own user identities.
     *
     * Example:
     * ```
     * OpenIdConnectProvider provider = OpenIdConnectProvider.Builder.create(this, "MyProvider")
     * .url("https://openid/connect")
     * .clientIds(List.of("myclient1", "myclient2"))
     * .build();
     * ```
     *
     * [Documentation](https://docs.aws.amazon.com/IAM/latest/UserGuide/id_roles_providers_oidc.html)
     */
    public inline fun openIdConnectProvider(
        scope: Construct,
        id: String,
        block: OpenIdConnectProviderDsl.() -> Unit = {},
    ): OpenIdConnectProvider {
        val builder = OpenIdConnectProviderDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Initialization properties for `OpenIdConnectProvider`.
     *
     * Example:
     * ```
     * OpenIdConnectProvider provider = OpenIdConnectProvider.Builder.create(this, "MyProvider")
     * .url("https://openid/connect")
     * .clientIds(List.of("myclient1", "myclient2"))
     * .build();
     * ```
     */
    public inline fun openIdConnectProviderProps(
        block: OpenIdConnectProviderPropsDsl.() -> Unit = {}
    ): OpenIdConnectProviderProps {
        val builder = OpenIdConnectProviderPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The AWS::IAM::Policy resource associates an IAM policy with IAM users, roles, or groups.
     *
     * For more information about IAM policies, see <a
     * href="http://docs.aws.amazon.com/IAM/latest/UserGuide/policies_overview.html">Overview of IAM
     * Policies</a> in the IAM User Guide guide.
     *
     * Example:
     * ```
     * Function postAuthFn;
     * UserPool userpool = UserPool.Builder.create(this, "myuserpool")
     * .lambdaTriggers(UserPoolTriggers.builder()
     * .postAuthentication(postAuthFn)
     * .build())
     * .build();
     * // provide permissions to describe the user pool scoped to the ARN the user pool
     * postAuthFn.role.attachInlinePolicy(Policy.Builder.create(this, "userpool-policy")
     * .statements(List.of(PolicyStatement.Builder.create()
     * .actions(List.of("cognito-idp:DescribeUserPool"))
     * .resources(List.of(userpool.getUserPoolArn()))
     * .build()))
     * .build());
     * ```
     */
    public inline fun policy(
        scope: Construct,
        id: String,
        block: PolicyDsl.() -> Unit = {},
    ): Policy {
        val builder = PolicyDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * A PolicyDocument is a collection of statements.
     *
     * Example:
     * ```
     * import software.amazon.awscdk.services.iam.*;
     * PolicyDocument myFileSystemPolicy = PolicyDocument.Builder.create()
     * .statements(List.of(PolicyStatement.Builder.create()
     * .actions(List.of("elasticfilesystem:ClientWrite", "elasticfilesystem:ClientMount"))
     * .principals(List.of(new AccountRootPrincipal()))
     * .resources(List.of("*"))
     * .conditions(Map.of(
     * "Bool", Map.of(
     * "elasticfilesystem:AccessedViaMountTarget", "true")))
     * .build()))
     * .build();
     * FileSystem fileSystem = FileSystem.Builder.create(this, "MyEfsFileSystem")
     * .vpc(new Vpc(this, "VPC"))
     * .fileSystemPolicy(myFileSystemPolicy)
     * .build();
     * ```
     */
    public inline fun policyDocument(block: PolicyDocumentDsl.() -> Unit = {}): PolicyDocument {
        val builder = PolicyDocumentDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for a new PolicyDocument.
     *
     * Example:
     * ```
     * import software.amazon.awscdk.services.iam.*;
     * PolicyDocument myFileSystemPolicy = PolicyDocument.Builder.create()
     * .statements(List.of(PolicyStatement.Builder.create()
     * .actions(List.of("elasticfilesystem:ClientWrite", "elasticfilesystem:ClientMount"))
     * .principals(List.of(new AccountRootPrincipal()))
     * .resources(List.of("*"))
     * .conditions(Map.of(
     * "Bool", Map.of(
     * "elasticfilesystem:AccessedViaMountTarget", "true")))
     * .build()))
     * .build();
     * FileSystem fileSystem = FileSystem.Builder.create(this, "MyEfsFileSystem")
     * .vpc(new Vpc(this, "VPC"))
     * .fileSystemPolicy(myFileSystemPolicy)
     * .build();
     * ```
     */
    public inline fun policyDocumentProps(
        block: PolicyDocumentPropsDsl.() -> Unit = {}
    ): PolicyDocumentProps {
        val builder = PolicyDocumentPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining an IAM inline policy document.
     *
     * Example:
     * ```
     * Resource books;
     * User iamUser;
     * Method getBooks = books.addMethod("GET", new HttpIntegration("http://amazon.com"),
     * MethodOptions.builder()
     * .authorizationType(AuthorizationType.IAM)
     * .build());
     * iamUser.attachInlinePolicy(Policy.Builder.create(this, "AllowBooks")
     * .statements(List.of(
     * PolicyStatement.Builder.create()
     * .actions(List.of("execute-api:Invoke"))
     * .effect(Effect.ALLOW)
     * .resources(List.of(getBooks.getMethodArn()))
     * .build()))
     * .build());
     * ```
     */
    public inline fun policyProps(block: PolicyPropsDsl.() -> Unit = {}): PolicyProps {
        val builder = PolicyPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Represents a statement in an IAM policy document.
     *
     * Example:
     * ```
     * // Option 3: Create a new role that allows the account root principal to assume. Add this role
     * in the `system:masters` and witch to this role from the AWS console.
     * Cluster cluster;
     * Role consoleReadOnlyRole = Role.Builder.create(this, "ConsoleReadOnlyRole")
     * .assumedBy(new ArnPrincipal("arn_for_trusted_principal"))
     * .build();
     * consoleReadOnlyRole.addToPolicy(PolicyStatement.Builder.create()
     * .actions(List.of("eks:AccessKubernetesApi", "eks:Describe*", "eks:List*"))
     * .resources(List.of(cluster.getClusterArn()))
     * .build());
     * // Add this role to system:masters RBAC group
     * cluster.awsAuth.addMastersRole(consoleReadOnlyRole);
     * ```
     */
    public inline fun policyStatement(block: PolicyStatementDsl.() -> Unit = {}): PolicyStatement {
        val builder = PolicyStatementDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Interface for creating a policy statement.
     *
     * Example:
     * ```
     * // Add gateway endpoints when creating the VPC
     * Vpc vpc = Vpc.Builder.create(this, "MyVpc")
     * .gatewayEndpoints(Map.of(
     * "S3", GatewayVpcEndpointOptions.builder()
     * .service(GatewayVpcEndpointAwsService.S3)
     * .build()))
     * .build();
     * // Alternatively gateway endpoints can be added on the VPC
     * GatewayVpcEndpoint dynamoDbEndpoint = vpc.addGatewayEndpoint("DynamoDbEndpoint",
     * GatewayVpcEndpointOptions.builder()
     * .service(GatewayVpcEndpointAwsService.DYNAMODB)
     * .build());
     * // This allows to customize the endpoint policy
     * dynamoDbEndpoint.addToPolicy(
     * PolicyStatement.Builder.create() // Restrict to listing and describing tables
     * .principals(List.of(new AnyPrincipal()))
     * .actions(List.of("dynamodb:DescribeTable", "dynamodb:ListTables"))
     * .resources(List.of("*")).build());
     * // Add an interface endpoint
     * vpc.addInterfaceEndpoint("EcrDockerEndpoint", InterfaceVpcEndpointOptions.builder()
     * .service(InterfaceVpcEndpointAwsService.ECR_DOCKER)
     * .build());
     * ```
     */
    public inline fun policyStatementProps(
        block: PolicyStatementPropsDsl.() -> Unit = {}
    ): PolicyStatementProps {
        val builder = PolicyStatementPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * IAM Role.
     *
     * Defines an IAM role. The role is created with an assume policy document associated with the
     * specified AWS service principal defined in `serviceAssumeRole`.
     *
     * Example:
     * ```
     * Role lambdaRole = Role.Builder.create(this, "Role")
     * .assumedBy(new ServicePrincipal("lambda.amazonaws.com"))
     * .description("Example role...")
     * .build();
     * Stream stream = Stream.Builder.create(this, "MyEncryptedStream")
     * .encryption(StreamEncryption.KMS)
     * .build();
     * // give lambda permissions to read stream
     * stream.grantRead(lambdaRole);
     * ```
     */
    public inline fun role(
        scope: Construct,
        id: String,
        block: RoleDsl.() -> Unit = {},
    ): Role {
        val builder = RoleDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining an IAM Role.
     *
     * Example:
     * ```
     * Role lambdaRole = Role.Builder.create(this, "Role")
     * .assumedBy(new ServicePrincipal("lambda.amazonaws.com"))
     * .description("Example role...")
     * .build();
     * Stream stream = Stream.Builder.create(this, "MyEncryptedStream")
     * .encryption(StreamEncryption.KMS)
     * .build();
     * // give lambda permissions to read stream
     * stream.grantRead(lambdaRole);
     * ```
     */
    public inline fun roleProps(block: RolePropsDsl.() -> Unit = {}): RoleProps {
        val builder = RolePropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * A SAML provider.
     *
     * Example:
     * ```
     * SamlProvider provider = SamlProvider.Builder.create(this, "Provider")
     * .metadataDocument(SamlMetadataDocument.fromFile("/path/to/saml-metadata-document.xml"))
     * .build();
     * Role.Builder.create(this, "Role")
     * .assumedBy(new SamlConsolePrincipal(provider))
     * .build();
     * ```
     */
    public inline fun samlProvider(
        scope: Construct,
        id: String,
        block: SamlProviderDsl.() -> Unit = {},
    ): SamlProvider {
        val builder = SamlProviderDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for a SAML provider.
     *
     * Example:
     * ```
     * SamlProvider provider = SamlProvider.Builder.create(this, "Provider")
     * .metadataDocument(SamlMetadataDocument.fromFile("/path/to/saml-metadata-document.xml"))
     * .build();
     * Role.Builder.create(this, "Role")
     * .assumedBy(new SamlConsolePrincipal(provider))
     * .build();
     * ```
     */
    public inline fun samlProviderProps(
        block: SamlProviderPropsDsl.() -> Unit = {}
    ): SamlProviderProps {
        val builder = SamlProviderPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * An IAM principal that represents an AWS service (i.e. `sqs.amazonaws.com`).
     *
     * Example:
     * ```
     * Role lambdaRole = Role.Builder.create(this, "Role")
     * .assumedBy(new ServicePrincipal("lambda.amazonaws.com"))
     * .description("Example role...")
     * .build();
     * Stream stream = Stream.Builder.create(this, "MyEncryptedStream")
     * .encryption(StreamEncryption.KMS)
     * .build();
     * // give lambda permissions to read stream
     * stream.grantRead(lambdaRole);
     * ```
     */
    public inline fun servicePrincipal(
        service: String,
        block: ServicePrincipalDsl.() -> Unit = {}
    ): ServicePrincipal {
        val builder = ServicePrincipalDsl(service)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Options for a service principal.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.iam.*;
     * Object conditions;
     * ServicePrincipalOpts servicePrincipalOpts = ServicePrincipalOpts.builder()
     * .conditions(Map.of(
     * "conditionsKey", conditions))
     * .region("region")
     * .build();
     * ```
     */
    public inline fun servicePrincipalOpts(
        block: ServicePrincipalOptsDsl.() -> Unit = {}
    ): ServicePrincipalOpts {
        val builder = ServicePrincipalOptsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * A principal for use in resources that need to have a role but it's unknown.
     *
     * Some resources have roles associated with them which they assume, such as Lambda Functions,
     * CodeBuild projects, StepFunctions machines, etc.
     *
     * When those resources are imported, their actual roles are not always imported with them. When
     * that happens, we use an instance of this class instead, which will add user warnings when
     * statements are attempted to be added to it.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.iam.*;
     * import software.constructs.*;
     * Construct construct;
     * UnknownPrincipal unknownPrincipal = UnknownPrincipal.Builder.create()
     * .resource(construct)
     * .build();
     * ```
     */
    public inline fun unknownPrincipal(
        block: UnknownPrincipalDsl.() -> Unit = {}
    ): UnknownPrincipal {
        val builder = UnknownPrincipalDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for an UnknownPrincipal.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.iam.*;
     * import software.constructs.*;
     * Construct construct;
     * UnknownPrincipalProps unknownPrincipalProps = UnknownPrincipalProps.builder()
     * .resource(construct)
     * .build();
     * ```
     */
    public inline fun unknownPrincipalProps(
        block: UnknownPrincipalPropsDsl.() -> Unit = {}
    ): UnknownPrincipalProps {
        val builder = UnknownPrincipalPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Define a new IAM user.
     *
     * Example:
     * ```
     * User user = User.Builder.create(this,
     * "MyUser").password(SecretValue.plainText("1234")).build();
     * Group group = new Group(this, "MyGroup");
     * Policy policy = new Policy(this, "MyPolicy");
     * policy.attachToUser(user);
     * group.attachInlinePolicy(policy);
     * ```
     */
    public inline fun user(
        scope: Construct,
        id: String,
        block: UserDsl.() -> Unit = {},
    ): User {
        val builder = UserDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Represents a user defined outside of this stack.
     *
     * Example:
     * ```
     * IUser user = User.fromUserAttributes(this, "MyImportedUserByAttributes",
     * UserAttributes.builder()
     * .userArn("arn:aws:iam::123456789012:user/johnsmith")
     * .build());
     * ```
     */
    public inline fun userAttributes(block: UserAttributesDsl.() -> Unit = {}): UserAttributes {
        val builder = UserAttributesDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining an IAM user.
     *
     * Example:
     * ```
     * User user = User.Builder.create(this,
     * "MyUser").password(SecretValue.plainText("1234")).build();
     * Group group = new Group(this, "MyGroup");
     * Policy policy = new Policy(this, "MyPolicy");
     * policy.attachToUser(user);
     * group.attachInlinePolicy(policy);
     * ```
     */
    public inline fun userProps(block: UserPropsDsl.() -> Unit = {}): UserProps {
        val builder = UserPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Options for the `withoutPolicyUpdates()` modifier of a Role.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.iam.*;
     * WithoutPolicyUpdatesOptions withoutPolicyUpdatesOptions = WithoutPolicyUpdatesOptions.builder()
     * .addGrantsToResources(false)
     * .build();
     * ```
     */
    public inline fun withoutPolicyUpdatesOptions(
        block: WithoutPolicyUpdatesOptionsDsl.() -> Unit = {}
    ): WithoutPolicyUpdatesOptions {
        val builder = WithoutPolicyUpdatesOptionsDsl()
        builder.apply(block)
        return builder.build()
    }
}
