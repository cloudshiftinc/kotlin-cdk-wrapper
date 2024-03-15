@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.iam

import io.cloudshiftdev.awscdk.Resource
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * Managed policy.
 *
 * Example:
 *
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
public open class ManagedPolicy internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.iam.ManagedPolicy,
) : Resource(cdkObject), IManagedPolicy, IGrantable {
  /**
   * Adds a statement to the policy document.
   *
   * @param statement 
   */
  public open fun addStatements(statement: PolicyStatement) {
    unwrap(this).addStatements(statement.let(PolicyStatement::unwrap))
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
   * The description of this policy.
   */
  public open fun description(): String = unwrap(this).getDescription()

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
   * Returns the ARN of this managed policy.
   */
  public override fun managedPolicyArn(): String = unwrap(this).getManagedPolicyArn()

  /**
   * The name of this policy.
   */
  public open fun managedPolicyName(): String = unwrap(this).getManagedPolicyName()

  /**
   * The path of this policy.
   */
  public open fun path(): String = unwrap(this).getPath()

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.iam.ManagedPolicy].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * A description of the managed policy.
     *
     * Typically used to store information about the
     * permissions defined in the policy. For example, "Grants access to production DynamoDB
     * tables."
     * The policy description is immutable. After a value is assigned, it cannot be changed.
     *
     * Default: - empty
     *
     * @param description A description of the managed policy. 
     */
    public fun description(description: String)

    /**
     * Initial PolicyDocument to use for this ManagedPolicy.
     *
     * If omited, any
     * `PolicyStatement` provided in the `statements` property will be applied
     * against the empty default `PolicyDocument`.
     *
     * Default: - An empty policy.
     *
     * @param document Initial PolicyDocument to use for this ManagedPolicy. 
     */
    public fun document(document: PolicyDocument)

    /**
     * Initial PolicyDocument to use for this ManagedPolicy.
     *
     * If omited, any
     * `PolicyStatement` provided in the `statements` property will be applied
     * against the empty default `PolicyDocument`.
     *
     * Default: - An empty policy.
     *
     * @param document Initial PolicyDocument to use for this ManagedPolicy. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("cf0415bb056af93e8ba2db8804e6c461983ea2f49e71a35facaee559f4a9c03e")
    public fun document(document: PolicyDocument.Builder.() -> Unit)

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
     * The name of the managed policy.
     *
     * If you specify multiple policies for an entity,
     * specify unique names. For example, if you specify a list of policies for
     * an IAM role, each policy must have a unique name.
     *
     * Default: - A name is automatically generated.
     *
     * @param managedPolicyName The name of the managed policy. 
     */
    public fun managedPolicyName(managedPolicyName: String)

    /**
     * The path for the policy.
     *
     * This parameter allows (through its regex pattern) a string of characters
     * consisting of either a forward slash (/) by itself or a string that must begin and end with
     * forward slashes.
     * In addition, it can contain any ASCII character from the ! (\u0021) through the DEL character
     * (\u007F),
     * including most punctuation characters, digits, and upper and lowercased letters.
     *
     * For more information about paths, see IAM Identifiers in the IAM User Guide.
     *
     * Default: - "/"
     *
     * @param path The path for the policy. 
     */
    public fun path(path: String)

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
     * You can also use `addPermission(statement)` to add permissions later.
     *
     * Default: - No statements.
     *
     * @param statements Initial set of permissions to add to this policy document. 
     */
    public fun statements(statements: List<PolicyStatement>)

    /**
     * Initial set of permissions to add to this policy document.
     *
     * You can also use `addPermission(statement)` to add permissions later.
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
    private val cdkBuilder: software.amazon.awscdk.services.iam.ManagedPolicy.Builder =
        software.amazon.awscdk.services.iam.ManagedPolicy.Builder.create(scope, id)

    /**
     * A description of the managed policy.
     *
     * Typically used to store information about the
     * permissions defined in the policy. For example, "Grants access to production DynamoDB
     * tables."
     * The policy description is immutable. After a value is assigned, it cannot be changed.
     *
     * Default: - empty
     *
     * @param description A description of the managed policy. 
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * Initial PolicyDocument to use for this ManagedPolicy.
     *
     * If omited, any
     * `PolicyStatement` provided in the `statements` property will be applied
     * against the empty default `PolicyDocument`.
     *
     * Default: - An empty policy.
     *
     * @param document Initial PolicyDocument to use for this ManagedPolicy. 
     */
    override fun document(document: PolicyDocument) {
      cdkBuilder.document(document.let(PolicyDocument::unwrap))
    }

    /**
     * Initial PolicyDocument to use for this ManagedPolicy.
     *
     * If omited, any
     * `PolicyStatement` provided in the `statements` property will be applied
     * against the empty default `PolicyDocument`.
     *
     * Default: - An empty policy.
     *
     * @param document Initial PolicyDocument to use for this ManagedPolicy. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("cf0415bb056af93e8ba2db8804e6c461983ea2f49e71a35facaee559f4a9c03e")
    override fun document(document: PolicyDocument.Builder.() -> Unit): Unit =
        document(PolicyDocument(document))

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
     * The name of the managed policy.
     *
     * If you specify multiple policies for an entity,
     * specify unique names. For example, if you specify a list of policies for
     * an IAM role, each policy must have a unique name.
     *
     * Default: - A name is automatically generated.
     *
     * @param managedPolicyName The name of the managed policy. 
     */
    override fun managedPolicyName(managedPolicyName: String) {
      cdkBuilder.managedPolicyName(managedPolicyName)
    }

    /**
     * The path for the policy.
     *
     * This parameter allows (through its regex pattern) a string of characters
     * consisting of either a forward slash (/) by itself or a string that must begin and end with
     * forward slashes.
     * In addition, it can contain any ASCII character from the ! (\u0021) through the DEL character
     * (\u007F),
     * including most punctuation characters, digits, and upper and lowercased letters.
     *
     * For more information about paths, see IAM Identifiers in the IAM User Guide.
     *
     * Default: - "/"
     *
     * @param path The path for the policy. 
     */
    override fun path(path: String) {
      cdkBuilder.path(path)
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
     * You can also use `addPermission(statement)` to add permissions later.
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
     * You can also use `addPermission(statement)` to add permissions later.
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

    public fun build(): software.amazon.awscdk.services.iam.ManagedPolicy = cdkBuilder.build()
  }

  public companion object {
    public fun fromAwsManagedPolicyName(managedPolicyName: String): IManagedPolicy =
        software.amazon.awscdk.services.iam.ManagedPolicy.fromAwsManagedPolicyName(managedPolicyName).let(IManagedPolicy::wrap)

    public fun fromManagedPolicyArn(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      managedPolicyArn: String,
    ): IManagedPolicy =
        software.amazon.awscdk.services.iam.ManagedPolicy.fromManagedPolicyArn(scope.let(CloudshiftdevConstructsConstruct::unwrap),
        id, managedPolicyArn).let(IManagedPolicy::wrap)

    public fun fromManagedPolicyName(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      managedPolicyName: String,
    ): IManagedPolicy =
        software.amazon.awscdk.services.iam.ManagedPolicy.fromManagedPolicyName(scope.let(CloudshiftdevConstructsConstruct::unwrap),
        id, managedPolicyName).let(IManagedPolicy::wrap)

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): ManagedPolicy {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return ManagedPolicy(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.iam.ManagedPolicy): ManagedPolicy =
        ManagedPolicy(cdkObject)

    internal fun unwrap(wrapped: ManagedPolicy): software.amazon.awscdk.services.iam.ManagedPolicy =
        wrapped.cdkObject
  }
}
