@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.iam

import io.cloudshiftdev.awscdk.Resource
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * The AWS::IAM::Policy resource associates an
 * [inline](https://docs.aws.amazon.com/IAM/latest/UserGuide/access_policies.html#inline) IAM policy
 * with IAM users, roles, or groups. For more information about IAM policies, see [Overview of IAM
 * Policies](http://docs.aws.amazon.com/IAM/latest/UserGuide/policies_overview.html) in the IAM User
 * Guide guide.
 *
 * Example:
 *
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
public open class Policy(
  cdkObject: software.amazon.awscdk.services.iam.Policy,
) : Resource(cdkObject), IPolicy, IGrantable {
  public constructor(scope: CloudshiftdevConstructsConstruct, id: String) :
      this(software.amazon.awscdk.services.iam.Policy(scope.let(CloudshiftdevConstructsConstruct::unwrap),
      id)
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: PolicyProps,
  ) :
      this(software.amazon.awscdk.services.iam.Policy(scope.let(CloudshiftdevConstructsConstruct::unwrap),
      id, props.let(PolicyProps::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: PolicyProps.Builder.() -> Unit,
  ) : this(scope, id, PolicyProps(props)
  )

  /**
   * Adds a statement to the policy document.
   *
   * @param statement 
   */
  public open fun addStatements(vararg statement: PolicyStatement) {
    unwrap(this).addStatements(*statement.map{CdkObjectWrappers.unwrap(it) as
        software.amazon.awscdk.services.iam.PolicyStatement}.toTypedArray())
  }

  /**
   * Adds a statement to the policy document.
   *
   * @param statement 
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("98fe20c8550beea0e99a87c49e8839386e2715f38099686c4beb06cab4f71d9d")
  public open fun addStatements(statement: PolicyStatement.Builder.() -> Unit): Unit =
      addStatements(PolicyStatement(statement))

  /**
   * Attaches this policy to a group.
   *
   * @param group 
   */
  public open fun attachToGroup(group: IGroup) {
    unwrap(this).attachToGroup(group.let(IGroup::unwrap))
  }

  /**
   * Attaches this policy to a role.
   *
   * @param role 
   */
  public open fun attachToRole(role: IRole) {
    unwrap(this).attachToRole(role.let(IRole::unwrap))
  }

  /**
   * Attaches this policy to a user.
   *
   * @param user 
   */
  public open fun attachToUser(user: IUser) {
    unwrap(this).attachToUser(user.let(IUser::unwrap))
  }

  /**
   * The policy document.
   */
  public open fun document(): PolicyDocument = unwrap(this).getDocument().let(PolicyDocument::wrap)

  /**
   * The principal to grant permissions to.
   */
  public override fun grantPrincipal(): IPrincipal =
      unwrap(this).getGrantPrincipal().let(IPrincipal::wrap)

  /**
   * The name of this policy.
   */
  public override fun policyName(): String = unwrap(this).getPolicyName()

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.iam.Policy].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * Initial PolicyDocument to use for this Policy.
     *
     * If omited, any
     * `PolicyStatement` provided in the `statements` property will be applied
     * against the empty default `PolicyDocument`.
     *
     * Default: - An empty policy.
     *
     * @param document Initial PolicyDocument to use for this Policy. 
     */
    public fun document(document: PolicyDocument)

    /**
     * Initial PolicyDocument to use for this Policy.
     *
     * If omited, any
     * `PolicyStatement` provided in the `statements` property will be applied
     * against the empty default `PolicyDocument`.
     *
     * Default: - An empty policy.
     *
     * @param document Initial PolicyDocument to use for this Policy. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("b5f8c6030ff03cf2b0e6f84a0f4d897c709ef521a1ca98a4ce97147236626a0c")
    public fun document(document: PolicyDocument.Builder.() -> Unit)

    /**
     * Force creation of an `AWS::IAM::Policy`.
     *
     * Unless set to `true`, this `Policy` construct will not materialize to an
     * `AWS::IAM::Policy` CloudFormation resource in case it would have no effect
     * (for example, if it remains unattached to an IAM identity or if it has no
     * statements). This is generally desired behavior, since it prevents
     * creating invalid--and hence undeployable--CloudFormation templates.
     *
     * In cases where you know the policy must be created and it is actually
     * an error if no statements have been added to it or it remains unattached to
     * an IAM identity, you can set this to `true`.
     *
     * Default: false
     *
     * @param force Force creation of an `AWS::IAM::Policy`. 
     */
    public fun force(force: Boolean)

    /**
     * Groups to attach this policy to.
     *
     * You can also use `attachToGroup(group)` to attach this policy to a group.
     *
     * Default: - No groups.
     *
     * @param groups Groups to attach this policy to. 
     */
    public fun groups(groups: List<IGroup>)

    /**
     * Groups to attach this policy to.
     *
     * You can also use `attachToGroup(group)` to attach this policy to a group.
     *
     * Default: - No groups.
     *
     * @param groups Groups to attach this policy to. 
     */
    public fun groups(vararg groups: IGroup)

    /**
     * The name of the policy.
     *
     * If you specify multiple policies for an entity,
     * specify unique names. For example, if you specify a list of policies for
     * an IAM role, each policy must have a unique name.
     *
     * Default: - Uses the logical ID of the policy resource, which is ensured
     * to be unique within the stack.
     *
     * @param policyName The name of the policy. 
     */
    public fun policyName(policyName: String)

    /**
     * Roles to attach this policy to.
     *
     * You can also use `attachToRole(role)` to attach this policy to a role.
     *
     * Default: - No roles.
     *
     * @param roles Roles to attach this policy to. 
     */
    public fun roles(roles: List<IRole>)

    /**
     * Roles to attach this policy to.
     *
     * You can also use `attachToRole(role)` to attach this policy to a role.
     *
     * Default: - No roles.
     *
     * @param roles Roles to attach this policy to. 
     */
    public fun roles(vararg roles: IRole)

    /**
     * Initial set of permissions to add to this policy document.
     *
     * You can also use `addStatements(...statement)` to add permissions later.
     *
     * Default: - No statements.
     *
     * @param statements Initial set of permissions to add to this policy document. 
     */
    public fun statements(statements: List<PolicyStatement>)

    /**
     * Initial set of permissions to add to this policy document.
     *
     * You can also use `addStatements(...statement)` to add permissions later.
     *
     * Default: - No statements.
     *
     * @param statements Initial set of permissions to add to this policy document. 
     */
    public fun statements(vararg statements: PolicyStatement)

    /**
     * Users to attach this policy to.
     *
     * You can also use `attachToUser(user)` to attach this policy to a user.
     *
     * Default: - No users.
     *
     * @param users Users to attach this policy to. 
     */
    public fun users(users: List<IUser>)

    /**
     * Users to attach this policy to.
     *
     * You can also use `attachToUser(user)` to attach this policy to a user.
     *
     * Default: - No users.
     *
     * @param users Users to attach this policy to. 
     */
    public fun users(vararg users: IUser)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.iam.Policy.Builder =
        software.amazon.awscdk.services.iam.Policy.Builder.create(scope, id)

    /**
     * Initial PolicyDocument to use for this Policy.
     *
     * If omited, any
     * `PolicyStatement` provided in the `statements` property will be applied
     * against the empty default `PolicyDocument`.
     *
     * Default: - An empty policy.
     *
     * @param document Initial PolicyDocument to use for this Policy. 
     */
    override fun document(document: PolicyDocument) {
      cdkBuilder.document(document.let(PolicyDocument::unwrap))
    }

    /**
     * Initial PolicyDocument to use for this Policy.
     *
     * If omited, any
     * `PolicyStatement` provided in the `statements` property will be applied
     * against the empty default `PolicyDocument`.
     *
     * Default: - An empty policy.
     *
     * @param document Initial PolicyDocument to use for this Policy. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("b5f8c6030ff03cf2b0e6f84a0f4d897c709ef521a1ca98a4ce97147236626a0c")
    override fun document(document: PolicyDocument.Builder.() -> Unit): Unit =
        document(PolicyDocument(document))

    /**
     * Force creation of an `AWS::IAM::Policy`.
     *
     * Unless set to `true`, this `Policy` construct will not materialize to an
     * `AWS::IAM::Policy` CloudFormation resource in case it would have no effect
     * (for example, if it remains unattached to an IAM identity or if it has no
     * statements). This is generally desired behavior, since it prevents
     * creating invalid--and hence undeployable--CloudFormation templates.
     *
     * In cases where you know the policy must be created and it is actually
     * an error if no statements have been added to it or it remains unattached to
     * an IAM identity, you can set this to `true`.
     *
     * Default: false
     *
     * @param force Force creation of an `AWS::IAM::Policy`. 
     */
    override fun force(force: Boolean) {
      cdkBuilder.force(force)
    }

    /**
     * Groups to attach this policy to.
     *
     * You can also use `attachToGroup(group)` to attach this policy to a group.
     *
     * Default: - No groups.
     *
     * @param groups Groups to attach this policy to. 
     */
    override fun groups(groups: List<IGroup>) {
      cdkBuilder.groups(groups.map(IGroup::unwrap))
    }

    /**
     * Groups to attach this policy to.
     *
     * You can also use `attachToGroup(group)` to attach this policy to a group.
     *
     * Default: - No groups.
     *
     * @param groups Groups to attach this policy to. 
     */
    override fun groups(vararg groups: IGroup): Unit = groups(groups.toList())

    /**
     * The name of the policy.
     *
     * If you specify multiple policies for an entity,
     * specify unique names. For example, if you specify a list of policies for
     * an IAM role, each policy must have a unique name.
     *
     * Default: - Uses the logical ID of the policy resource, which is ensured
     * to be unique within the stack.
     *
     * @param policyName The name of the policy. 
     */
    override fun policyName(policyName: String) {
      cdkBuilder.policyName(policyName)
    }

    /**
     * Roles to attach this policy to.
     *
     * You can also use `attachToRole(role)` to attach this policy to a role.
     *
     * Default: - No roles.
     *
     * @param roles Roles to attach this policy to. 
     */
    override fun roles(roles: List<IRole>) {
      cdkBuilder.roles(roles.map(IRole::unwrap))
    }

    /**
     * Roles to attach this policy to.
     *
     * You can also use `attachToRole(role)` to attach this policy to a role.
     *
     * Default: - No roles.
     *
     * @param roles Roles to attach this policy to. 
     */
    override fun roles(vararg roles: IRole): Unit = roles(roles.toList())

    /**
     * Initial set of permissions to add to this policy document.
     *
     * You can also use `addStatements(...statement)` to add permissions later.
     *
     * Default: - No statements.
     *
     * @param statements Initial set of permissions to add to this policy document. 
     */
    override fun statements(statements: List<PolicyStatement>) {
      cdkBuilder.statements(statements.map(PolicyStatement::unwrap))
    }

    /**
     * Initial set of permissions to add to this policy document.
     *
     * You can also use `addStatements(...statement)` to add permissions later.
     *
     * Default: - No statements.
     *
     * @param statements Initial set of permissions to add to this policy document. 
     */
    override fun statements(vararg statements: PolicyStatement): Unit =
        statements(statements.toList())

    /**
     * Users to attach this policy to.
     *
     * You can also use `attachToUser(user)` to attach this policy to a user.
     *
     * Default: - No users.
     *
     * @param users Users to attach this policy to. 
     */
    override fun users(users: List<IUser>) {
      cdkBuilder.users(users.map(IUser::unwrap))
    }

    /**
     * Users to attach this policy to.
     *
     * You can also use `attachToUser(user)` to attach this policy to a user.
     *
     * Default: - No users.
     *
     * @param users Users to attach this policy to. 
     */
    override fun users(vararg users: IUser): Unit = users(users.toList())

    public fun build(): software.amazon.awscdk.services.iam.Policy = cdkBuilder.build()
  }

  public companion object {
    public fun fromPolicyName(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      policyName: String,
    ): IPolicy =
        software.amazon.awscdk.services.iam.Policy.fromPolicyName(scope.let(CloudshiftdevConstructsConstruct::unwrap),
        id, policyName).let(IPolicy::wrap)

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): Policy {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return Policy(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.iam.Policy): Policy =
        Policy(cdkObject)

    internal fun unwrap(wrapped: Policy): software.amazon.awscdk.services.iam.Policy =
        wrapped.cdkObject as software.amazon.awscdk.services.iam.Policy
  }
}
