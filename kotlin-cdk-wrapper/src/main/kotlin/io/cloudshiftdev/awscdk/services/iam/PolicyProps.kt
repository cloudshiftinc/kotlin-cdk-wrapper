@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.iam

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

/**
 * Properties for defining an IAM inline policy document.
 *
 * Example:
 *
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
public interface PolicyProps {
  /**
   * Initial PolicyDocument to use for this Policy.
   *
   * If omited, any
   * `PolicyStatement` provided in the `statements` property will be applied
   * against the empty default `PolicyDocument`.
   *
   * Default: - An empty policy.
   */
  public fun document(): PolicyDocument? = unwrap(this).getDocument()?.let(PolicyDocument::wrap)

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
   * an error if no statements have been added to it, you can set this to `true`.
   *
   * Default: false
   */
  public fun force(): Boolean? = unwrap(this).getForce()

  /**
   * Groups to attach this policy to.
   *
   * You can also use `attachToGroup(group)` to attach this policy to a group.
   *
   * Default: - No groups.
   */
  public fun groups(): List<IGroup> = unwrap(this).getGroups()?.map(IGroup::wrap) ?: emptyList()

  /**
   * The name of the policy.
   *
   * If you specify multiple policies for an entity,
   * specify unique names. For example, if you specify a list of policies for
   * an IAM role, each policy must have a unique name.
   *
   * Default: - Uses the logical ID of the policy resource, which is ensured
   * to be unique within the stack.
   */
  public fun policyName(): String? = unwrap(this).getPolicyName()

  /**
   * Roles to attach this policy to.
   *
   * You can also use `attachToRole(role)` to attach this policy to a role.
   *
   * Default: - No roles.
   */
  public fun roles(): List<IRole> = unwrap(this).getRoles()?.map(IRole::wrap) ?: emptyList()

  /**
   * Initial set of permissions to add to this policy document.
   *
   * You can also use `addStatements(...statement)` to add permissions later.
   *
   * Default: - No statements.
   */
  public fun statements(): List<PolicyStatement> =
      unwrap(this).getStatements()?.map(PolicyStatement::wrap) ?: emptyList()

  /**
   * Users to attach this policy to.
   *
   * You can also use `attachToUser(user)` to attach this policy to a user.
   *
   * Default: - No users.
   */
  public fun users(): List<IUser> = unwrap(this).getUsers()?.map(IUser::wrap) ?: emptyList()

  /**
   * A builder for [PolicyProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param document Initial PolicyDocument to use for this Policy.
     * If omited, any
     * `PolicyStatement` provided in the `statements` property will be applied
     * against the empty default `PolicyDocument`.
     */
    public fun document(document: PolicyDocument)

    /**
     * @param document Initial PolicyDocument to use for this Policy.
     * If omited, any
     * `PolicyStatement` provided in the `statements` property will be applied
     * against the empty default `PolicyDocument`.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("df8053a8bb4a61ef6bdfdfc961697e47e260c454293532b1fcfb8255ee8bbbb0")
    public fun document(document: PolicyDocument.Builder.() -> Unit)

    /**
     * @param force Force creation of an `AWS::IAM::Policy`.
     * Unless set to `true`, this `Policy` construct will not materialize to an
     * `AWS::IAM::Policy` CloudFormation resource in case it would have no effect
     * (for example, if it remains unattached to an IAM identity or if it has no
     * statements). This is generally desired behavior, since it prevents
     * creating invalid--and hence undeployable--CloudFormation templates.
     *
     * In cases where you know the policy must be created and it is actually
     * an error if no statements have been added to it, you can set this to `true`.
     */
    public fun force(force: Boolean)

    /**
     * @param groups Groups to attach this policy to.
     * You can also use `attachToGroup(group)` to attach this policy to a group.
     */
    public fun groups(groups: List<IGroup>)

    /**
     * @param groups Groups to attach this policy to.
     * You can also use `attachToGroup(group)` to attach this policy to a group.
     */
    public fun groups(vararg groups: IGroup)

    /**
     * @param policyName The name of the policy.
     * If you specify multiple policies for an entity,
     * specify unique names. For example, if you specify a list of policies for
     * an IAM role, each policy must have a unique name.
     */
    public fun policyName(policyName: String)

    /**
     * @param roles Roles to attach this policy to.
     * You can also use `attachToRole(role)` to attach this policy to a role.
     */
    public fun roles(roles: List<IRole>)

    /**
     * @param roles Roles to attach this policy to.
     * You can also use `attachToRole(role)` to attach this policy to a role.
     */
    public fun roles(vararg roles: IRole)

    /**
     * @param statements Initial set of permissions to add to this policy document.
     * You can also use `addStatements(...statement)` to add permissions later.
     */
    public fun statements(statements: List<PolicyStatement>)

    /**
     * @param statements Initial set of permissions to add to this policy document.
     * You can also use `addStatements(...statement)` to add permissions later.
     */
    public fun statements(vararg statements: PolicyStatement)

    /**
     * @param users Users to attach this policy to.
     * You can also use `attachToUser(user)` to attach this policy to a user.
     */
    public fun users(users: List<IUser>)

    /**
     * @param users Users to attach this policy to.
     * You can also use `attachToUser(user)` to attach this policy to a user.
     */
    public fun users(vararg users: IUser)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.iam.PolicyProps.Builder =
        software.amazon.awscdk.services.iam.PolicyProps.builder()

    /**
     * @param document Initial PolicyDocument to use for this Policy.
     * If omited, any
     * `PolicyStatement` provided in the `statements` property will be applied
     * against the empty default `PolicyDocument`.
     */
    override fun document(document: PolicyDocument) {
      cdkBuilder.document(document.let(PolicyDocument::unwrap))
    }

    /**
     * @param document Initial PolicyDocument to use for this Policy.
     * If omited, any
     * `PolicyStatement` provided in the `statements` property will be applied
     * against the empty default `PolicyDocument`.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("df8053a8bb4a61ef6bdfdfc961697e47e260c454293532b1fcfb8255ee8bbbb0")
    override fun document(document: PolicyDocument.Builder.() -> Unit): Unit =
        document(PolicyDocument(document))

    /**
     * @param force Force creation of an `AWS::IAM::Policy`.
     * Unless set to `true`, this `Policy` construct will not materialize to an
     * `AWS::IAM::Policy` CloudFormation resource in case it would have no effect
     * (for example, if it remains unattached to an IAM identity or if it has no
     * statements). This is generally desired behavior, since it prevents
     * creating invalid--and hence undeployable--CloudFormation templates.
     *
     * In cases where you know the policy must be created and it is actually
     * an error if no statements have been added to it, you can set this to `true`.
     */
    override fun force(force: Boolean) {
      cdkBuilder.force(force)
    }

    /**
     * @param groups Groups to attach this policy to.
     * You can also use `attachToGroup(group)` to attach this policy to a group.
     */
    override fun groups(groups: List<IGroup>) {
      cdkBuilder.groups(groups.map(IGroup::unwrap))
    }

    /**
     * @param groups Groups to attach this policy to.
     * You can also use `attachToGroup(group)` to attach this policy to a group.
     */
    override fun groups(vararg groups: IGroup): Unit = groups(groups.toList())

    /**
     * @param policyName The name of the policy.
     * If you specify multiple policies for an entity,
     * specify unique names. For example, if you specify a list of policies for
     * an IAM role, each policy must have a unique name.
     */
    override fun policyName(policyName: String) {
      cdkBuilder.policyName(policyName)
    }

    /**
     * @param roles Roles to attach this policy to.
     * You can also use `attachToRole(role)` to attach this policy to a role.
     */
    override fun roles(roles: List<IRole>) {
      cdkBuilder.roles(roles.map(IRole::unwrap))
    }

    /**
     * @param roles Roles to attach this policy to.
     * You can also use `attachToRole(role)` to attach this policy to a role.
     */
    override fun roles(vararg roles: IRole): Unit = roles(roles.toList())

    /**
     * @param statements Initial set of permissions to add to this policy document.
     * You can also use `addStatements(...statement)` to add permissions later.
     */
    override fun statements(statements: List<PolicyStatement>) {
      cdkBuilder.statements(statements.map(PolicyStatement::unwrap))
    }

    /**
     * @param statements Initial set of permissions to add to this policy document.
     * You can also use `addStatements(...statement)` to add permissions later.
     */
    override fun statements(vararg statements: PolicyStatement): Unit =
        statements(statements.toList())

    /**
     * @param users Users to attach this policy to.
     * You can also use `attachToUser(user)` to attach this policy to a user.
     */
    override fun users(users: List<IUser>) {
      cdkBuilder.users(users.map(IUser::unwrap))
    }

    /**
     * @param users Users to attach this policy to.
     * You can also use `attachToUser(user)` to attach this policy to a user.
     */
    override fun users(vararg users: IUser): Unit = users(users.toList())

    public fun build(): software.amazon.awscdk.services.iam.PolicyProps = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.iam.PolicyProps,
  ) : CdkObject(cdkObject), PolicyProps {
    /**
     * Initial PolicyDocument to use for this Policy.
     *
     * If omited, any
     * `PolicyStatement` provided in the `statements` property will be applied
     * against the empty default `PolicyDocument`.
     *
     * Default: - An empty policy.
     */
    override fun document(): PolicyDocument? = unwrap(this).getDocument()?.let(PolicyDocument::wrap)

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
     * an error if no statements have been added to it, you can set this to `true`.
     *
     * Default: false
     */
    override fun force(): Boolean? = unwrap(this).getForce()

    /**
     * Groups to attach this policy to.
     *
     * You can also use `attachToGroup(group)` to attach this policy to a group.
     *
     * Default: - No groups.
     */
    override fun groups(): List<IGroup> = unwrap(this).getGroups()?.map(IGroup::wrap) ?: emptyList()

    /**
     * The name of the policy.
     *
     * If you specify multiple policies for an entity,
     * specify unique names. For example, if you specify a list of policies for
     * an IAM role, each policy must have a unique name.
     *
     * Default: - Uses the logical ID of the policy resource, which is ensured
     * to be unique within the stack.
     */
    override fun policyName(): String? = unwrap(this).getPolicyName()

    /**
     * Roles to attach this policy to.
     *
     * You can also use `attachToRole(role)` to attach this policy to a role.
     *
     * Default: - No roles.
     */
    override fun roles(): List<IRole> = unwrap(this).getRoles()?.map(IRole::wrap) ?: emptyList()

    /**
     * Initial set of permissions to add to this policy document.
     *
     * You can also use `addStatements(...statement)` to add permissions later.
     *
     * Default: - No statements.
     */
    override fun statements(): List<PolicyStatement> =
        unwrap(this).getStatements()?.map(PolicyStatement::wrap) ?: emptyList()

    /**
     * Users to attach this policy to.
     *
     * You can also use `attachToUser(user)` to attach this policy to a user.
     *
     * Default: - No users.
     */
    override fun users(): List<IUser> = unwrap(this).getUsers()?.map(IUser::wrap) ?: emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): PolicyProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.iam.PolicyProps): PolicyProps =
        CdkObjectWrappers.wrap(cdkObject) as? PolicyProps ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: PolicyProps): software.amazon.awscdk.services.iam.PolicyProps =
        (wrapped as CdkObject).cdkObject as software.amazon.awscdk.services.iam.PolicyProps
  }
}
