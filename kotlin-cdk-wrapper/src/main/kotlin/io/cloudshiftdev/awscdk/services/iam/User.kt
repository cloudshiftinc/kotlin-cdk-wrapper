@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.iam

import io.cloudshiftdev.awscdk.Resource
import io.cloudshiftdev.awscdk.SecretValue
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * Define a new IAM user.
 *
 * Example:
 *
 * ```
 * IChainable definition;
 * User user = new User(this, "MyUser");
 * StateMachine stateMachine = StateMachine.Builder.create(this, "StateMachine")
 * .definitionBody(DefinitionBody.fromChainable(definition))
 * .build();
 * //give user permission to send task success to the state machine
 * stateMachine.grant(user, "states:SendTaskSuccess");
 * ```
 */
public open class User(
  cdkObject: software.amazon.awscdk.services.iam.User,
) : Resource(cdkObject), IIdentity, IUser {
  public constructor(scope: CloudshiftdevConstructsConstruct, id: String) :
      this(software.amazon.awscdk.services.iam.User(scope.let(CloudshiftdevConstructsConstruct::unwrap),
      id)
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: UserProps,
  ) :
      this(software.amazon.awscdk.services.iam.User(scope.let(CloudshiftdevConstructsConstruct::unwrap),
      id, props.let(UserProps::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: UserProps.Builder.() -> Unit,
  ) : this(scope, id, UserProps(props)
  )

  /**
   * Attaches a managed policy to the user.
   *
   * @param policy The managed policy to attach. 
   */
  public override fun addManagedPolicy(policy: IManagedPolicy) {
    unwrap(this).addManagedPolicy(policy.let(IManagedPolicy::unwrap))
  }

  /**
   * Adds this user to a group.
   *
   * @param group 
   */
  public override fun addToGroup(group: IGroup) {
    unwrap(this).addToGroup(group.let(IGroup::unwrap))
  }

  /**
   * Add to the policy of this principal.
   *
   * @param statement 
   */
  public open fun addToPolicy(statement: PolicyStatement): Boolean =
      unwrap(this).addToPolicy(statement.let(PolicyStatement::unwrap))

  /**
   * Add to the policy of this principal.
   *
   * @param statement 
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("6148e52b961e7728ba57cdabfd202385d97a77f6d5da33adb746c32e8c75340f")
  public open fun addToPolicy(statement: PolicyStatement.Builder.() -> Unit): Boolean =
      addToPolicy(PolicyStatement(statement))

  /**
   * Adds an IAM statement to the default policy.
   *
   * @return true
   * @param statement 
   */
  public override fun addToPrincipalPolicy(statement: PolicyStatement): AddToPrincipalPolicyResult =
      unwrap(this).addToPrincipalPolicy(statement.let(PolicyStatement::unwrap)).let(AddToPrincipalPolicyResult::wrap)

  /**
   * Adds an IAM statement to the default policy.
   *
   * @return true
   * @param statement 
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("e5a2b0fec5c17722d0dc719c3fd27344bee07d931f9f715b331523f4aadc0661")
  public override fun addToPrincipalPolicy(statement: PolicyStatement.Builder.() -> Unit):
      AddToPrincipalPolicyResult = addToPrincipalPolicy(PolicyStatement(statement))

  /**
   * When this Principal is used in an AssumeRole policy, the action to use.
   */
  public override fun assumeRoleAction(): String = unwrap(this).getAssumeRoleAction()

  /**
   * Attaches a policy to this user.
   *
   * @param policy 
   */
  public override fun attachInlinePolicy(policy: Policy) {
    unwrap(this).attachInlinePolicy(policy.let(Policy::unwrap))
  }

  /**
   * The principal to grant permissions to.
   */
  public override fun grantPrincipal(): IPrincipal =
      unwrap(this).getGrantPrincipal().let(IPrincipal::wrap)

  /**
   * Returns the permissions boundary attached  to this user.
   */
  public open fun permissionsBoundary(): IManagedPolicy? =
      unwrap(this).getPermissionsBoundary()?.let(IManagedPolicy::wrap)

  /**
   * Return the policy fragment that identifies this principal in a Policy.
   */
  public override fun policyFragment(): PrincipalPolicyFragment =
      unwrap(this).getPolicyFragment().let(PrincipalPolicyFragment::wrap)

  /**
   * The AWS account ID of this principal.
   *
   * Can be undefined when the account is not known
   * (for example, for service principals).
   * Can be a Token - in that case,
   * it's assumed to be AWS::AccountId.
   */
  public override fun principalAccount(): String? = unwrap(this).getPrincipalAccount()

  /**
   * An attribute that represents the user's ARN.
   */
  public override fun userArn(): String = unwrap(this).getUserArn()

  /**
   * An attribute that represents the user name.
   */
  public override fun userName(): String = unwrap(this).getUserName()

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.iam.User].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * Groups to add this user to.
     *
     * You can also use `addToGroup` to add this
     * user to a group.
     *
     * Default: - No groups.
     *
     * @param groups Groups to add this user to. 
     */
    public fun groups(groups: List<IGroup>)

    /**
     * Groups to add this user to.
     *
     * You can also use `addToGroup` to add this
     * user to a group.
     *
     * Default: - No groups.
     *
     * @param groups Groups to add this user to. 
     */
    public fun groups(vararg groups: IGroup)

    /**
     * A list of managed policies associated with this role.
     *
     * You can add managed policies later using
     * `addManagedPolicy(ManagedPolicy.fromAwsManagedPolicyName(policyName))`.
     *
     * Default: - No managed policies.
     *
     * @param managedPolicies A list of managed policies associated with this role. 
     */
    public fun managedPolicies(managedPolicies: List<IManagedPolicy>)

    /**
     * A list of managed policies associated with this role.
     *
     * You can add managed policies later using
     * `addManagedPolicy(ManagedPolicy.fromAwsManagedPolicyName(policyName))`.
     *
     * Default: - No managed policies.
     *
     * @param managedPolicies A list of managed policies associated with this role. 
     */
    public fun managedPolicies(vararg managedPolicies: IManagedPolicy)

    /**
     * The password for the user. This is required so the user can access the AWS Management
     * Console.
     *
     * You can use `SecretValue.unsafePlainText` to specify a password in plain text or
     * use `secretsmanager.Secret.fromSecretAttributes` to reference a secret in
     * Secrets Manager.
     *
     * Default: - User won't be able to access the management console without a password.
     *
     * @param password The password for the user. This is required so the user can access the AWS
     * Management Console. 
     */
    public fun password(password: SecretValue)

    /**
     * Specifies whether the user is required to set a new password the next time the user logs in
     * to the AWS Management Console.
     *
     * If this is set to 'true', you must also specify "initialPassword".
     *
     * Default: false
     *
     * @param passwordResetRequired Specifies whether the user is required to set a new password the
     * next time the user logs in to the AWS Management Console. 
     */
    public fun passwordResetRequired(passwordResetRequired: Boolean)

    /**
     * The path for the user name.
     *
     * For more information about paths, see IAM
     * Identifiers in the IAM User Guide.
     *
     * Default: /
     *
     * @param path The path for the user name. 
     */
    public fun path(path: String)

    /**
     * AWS supports permissions boundaries for IAM entities (users or roles).
     *
     * A permissions boundary is an advanced feature for using a managed policy
     * to set the maximum permissions that an identity-based policy can grant to
     * an IAM entity. An entity's permissions boundary allows it to perform only
     * the actions that are allowed by both its identity-based policies and its
     * permissions boundaries.
     *
     * Default: - No permissions boundary.
     *
     * @param permissionsBoundary AWS supports permissions boundaries for IAM entities (users or
     * roles). 
     */
    public fun permissionsBoundary(permissionsBoundary: IManagedPolicy)

    /**
     * A name for the IAM user.
     *
     * For valid values, see the UserName parameter for
     * the CreateUser action in the IAM API Reference. If you don't specify a
     * name, AWS CloudFormation generates a unique physical ID and uses that ID
     * for the user name.
     *
     * If you specify a name, you cannot perform updates that require
     * replacement of this resource. You can perform updates that require no or
     * some interruption. If you must replace the resource, specify a new name.
     *
     * If you specify a name, you must specify the CAPABILITY_NAMED_IAM value to
     * acknowledge your template's capabilities. For more information, see
     * Acknowledging IAM Resources in AWS CloudFormation Templates.
     *
     * Default: - Generated by CloudFormation (recommended)
     *
     * @param userName A name for the IAM user. 
     */
    public fun userName(userName: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.iam.User.Builder =
        software.amazon.awscdk.services.iam.User.Builder.create(scope, id)

    /**
     * Groups to add this user to.
     *
     * You can also use `addToGroup` to add this
     * user to a group.
     *
     * Default: - No groups.
     *
     * @param groups Groups to add this user to. 
     */
    override fun groups(groups: List<IGroup>) {
      cdkBuilder.groups(groups.map(IGroup::unwrap))
    }

    /**
     * Groups to add this user to.
     *
     * You can also use `addToGroup` to add this
     * user to a group.
     *
     * Default: - No groups.
     *
     * @param groups Groups to add this user to. 
     */
    override fun groups(vararg groups: IGroup): Unit = groups(groups.toList())

    /**
     * A list of managed policies associated with this role.
     *
     * You can add managed policies later using
     * `addManagedPolicy(ManagedPolicy.fromAwsManagedPolicyName(policyName))`.
     *
     * Default: - No managed policies.
     *
     * @param managedPolicies A list of managed policies associated with this role. 
     */
    override fun managedPolicies(managedPolicies: List<IManagedPolicy>) {
      cdkBuilder.managedPolicies(managedPolicies.map(IManagedPolicy::unwrap))
    }

    /**
     * A list of managed policies associated with this role.
     *
     * You can add managed policies later using
     * `addManagedPolicy(ManagedPolicy.fromAwsManagedPolicyName(policyName))`.
     *
     * Default: - No managed policies.
     *
     * @param managedPolicies A list of managed policies associated with this role. 
     */
    override fun managedPolicies(vararg managedPolicies: IManagedPolicy): Unit =
        managedPolicies(managedPolicies.toList())

    /**
     * The password for the user. This is required so the user can access the AWS Management
     * Console.
     *
     * You can use `SecretValue.unsafePlainText` to specify a password in plain text or
     * use `secretsmanager.Secret.fromSecretAttributes` to reference a secret in
     * Secrets Manager.
     *
     * Default: - User won't be able to access the management console without a password.
     *
     * @param password The password for the user. This is required so the user can access the AWS
     * Management Console. 
     */
    override fun password(password: SecretValue) {
      cdkBuilder.password(password.let(SecretValue::unwrap))
    }

    /**
     * Specifies whether the user is required to set a new password the next time the user logs in
     * to the AWS Management Console.
     *
     * If this is set to 'true', you must also specify "initialPassword".
     *
     * Default: false
     *
     * @param passwordResetRequired Specifies whether the user is required to set a new password the
     * next time the user logs in to the AWS Management Console. 
     */
    override fun passwordResetRequired(passwordResetRequired: Boolean) {
      cdkBuilder.passwordResetRequired(passwordResetRequired)
    }

    /**
     * The path for the user name.
     *
     * For more information about paths, see IAM
     * Identifiers in the IAM User Guide.
     *
     * Default: /
     *
     * @param path The path for the user name. 
     */
    override fun path(path: String) {
      cdkBuilder.path(path)
    }

    /**
     * AWS supports permissions boundaries for IAM entities (users or roles).
     *
     * A permissions boundary is an advanced feature for using a managed policy
     * to set the maximum permissions that an identity-based policy can grant to
     * an IAM entity. An entity's permissions boundary allows it to perform only
     * the actions that are allowed by both its identity-based policies and its
     * permissions boundaries.
     *
     * Default: - No permissions boundary.
     *
     * @param permissionsBoundary AWS supports permissions boundaries for IAM entities (users or
     * roles). 
     */
    override fun permissionsBoundary(permissionsBoundary: IManagedPolicy) {
      cdkBuilder.permissionsBoundary(permissionsBoundary.let(IManagedPolicy::unwrap))
    }

    /**
     * A name for the IAM user.
     *
     * For valid values, see the UserName parameter for
     * the CreateUser action in the IAM API Reference. If you don't specify a
     * name, AWS CloudFormation generates a unique physical ID and uses that ID
     * for the user name.
     *
     * If you specify a name, you cannot perform updates that require
     * replacement of this resource. You can perform updates that require no or
     * some interruption. If you must replace the resource, specify a new name.
     *
     * If you specify a name, you must specify the CAPABILITY_NAMED_IAM value to
     * acknowledge your template's capabilities. For more information, see
     * Acknowledging IAM Resources in AWS CloudFormation Templates.
     *
     * Default: - Generated by CloudFormation (recommended)
     *
     * @param userName A name for the IAM user. 
     */
    override fun userName(userName: String) {
      cdkBuilder.userName(userName)
    }

    public fun build(): software.amazon.awscdk.services.iam.User = cdkBuilder.build()
  }

  public companion object {
    public fun fromUserArn(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      userArn: String,
    ): IUser =
        software.amazon.awscdk.services.iam.User.fromUserArn(scope.let(CloudshiftdevConstructsConstruct::unwrap),
        id, userArn).let(IUser::wrap)

    public fun fromUserAttributes(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      attrs: UserAttributes,
    ): IUser =
        software.amazon.awscdk.services.iam.User.fromUserAttributes(scope.let(CloudshiftdevConstructsConstruct::unwrap),
        id, attrs.let(UserAttributes::unwrap)).let(IUser::wrap)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("321ebf0b48716f7490762a7ac1e1728ff5e7fb51d9ed53e20e99d0c80a46bc9d")
    public fun fromUserAttributes(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      attrs: UserAttributes.Builder.() -> Unit,
    ): IUser = fromUserAttributes(scope, id, UserAttributes(attrs))

    public fun fromUserName(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      userName: String,
    ): IUser =
        software.amazon.awscdk.services.iam.User.fromUserName(scope.let(CloudshiftdevConstructsConstruct::unwrap),
        id, userName).let(IUser::wrap)

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): User {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return User(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.iam.User): User = User(cdkObject)

    internal fun unwrap(wrapped: User): software.amazon.awscdk.services.iam.User = wrapped.cdkObject
        as software.amazon.awscdk.services.iam.User
  }
}
