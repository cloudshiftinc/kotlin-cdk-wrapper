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
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.services.iam.IGroup
import software.amazon.awscdk.services.iam.IRole
import software.amazon.awscdk.services.iam.IUser
import software.amazon.awscdk.services.iam.ManagedPolicy
import software.amazon.awscdk.services.iam.PolicyDocument
import software.amazon.awscdk.services.iam.PolicyStatement
import software.constructs.Construct

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
@CdkDslMarker
public class ManagedPolicyDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: ManagedPolicy.Builder = ManagedPolicy.Builder.create(scope, id)

    private val _groups: MutableList<IGroup> = mutableListOf()

    private val _roles: MutableList<IRole> = mutableListOf()

    private val _statements: MutableList<PolicyStatement> = mutableListOf()

    private val _users: MutableList<IUser> = mutableListOf()

    /**
     * A description of the managed policy.
     *
     * Typically used to store information about the permissions defined in the policy. For example,
     * "Grants access to production DynamoDB tables." The policy description is immutable. After a
     * value is assigned, it cannot be changed.
     *
     * Default: - empty
     *
     * @param description A description of the managed policy.
     */
    public fun description(description: String) {
        cdkBuilder.description(description)
    }

    /**
     * Initial PolicyDocument to use for this ManagedPolicy.
     *
     * If omited, any `PolicyStatement` provided in the `statements` property will be applied
     * against the empty default `PolicyDocument`.
     *
     * Default: - An empty policy.
     *
     * @param document Initial PolicyDocument to use for this ManagedPolicy.
     */
    public fun document(document: PolicyDocumentDsl.() -> Unit = {}) {
        val builder = PolicyDocumentDsl()
        builder.apply(document)
        cdkBuilder.document(builder.build())
    }

    /**
     * Initial PolicyDocument to use for this ManagedPolicy.
     *
     * If omited, any `PolicyStatement` provided in the `statements` property will be applied
     * against the empty default `PolicyDocument`.
     *
     * Default: - An empty policy.
     *
     * @param document Initial PolicyDocument to use for this ManagedPolicy.
     */
    public fun document(document: PolicyDocument) {
        cdkBuilder.document(document)
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
    public fun groups(vararg groups: IGroup) {
        _groups.addAll(listOf(*groups))
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
    public fun groups(groups: Collection<IGroup>) {
        _groups.addAll(groups)
    }

    /**
     * The name of the managed policy.
     *
     * If you specify multiple policies for an entity, specify unique names. For example, if you
     * specify a list of policies for an IAM role, each policy must have a unique name.
     *
     * Default: - A name is automatically generated.
     *
     * @param managedPolicyName The name of the managed policy.
     */
    public fun managedPolicyName(managedPolicyName: String) {
        cdkBuilder.managedPolicyName(managedPolicyName)
    }

    /**
     * The path for the policy.
     *
     * This parameter allows (through its regex pattern) a string of characters consisting of either
     * a forward slash (/) by itself or a string that must begin and end with forward slashes. In
     * addition, it can contain any ASCII character from the ! (\u0021) through the DEL character
     * (\u007F), including most punctuation characters, digits, and upper and lowercased letters.
     *
     * For more information about paths, see IAM Identifiers in the IAM User Guide.
     *
     * Default: - "/"
     *
     * @param path The path for the policy.
     */
    public fun path(path: String) {
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
    public fun roles(vararg roles: IRole) {
        _roles.addAll(listOf(*roles))
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
    public fun roles(roles: Collection<IRole>) {
        _roles.addAll(roles)
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
    public fun statements(statements: PolicyStatementDsl.() -> Unit) {
        _statements.add(PolicyStatementDsl().apply(statements).build())
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
    public fun statements(statements: Collection<PolicyStatement>) {
        _statements.addAll(statements)
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
    public fun users(vararg users: IUser) {
        _users.addAll(listOf(*users))
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
    public fun users(users: Collection<IUser>) {
        _users.addAll(users)
    }

    public fun build(): ManagedPolicy {
        if (_groups.isNotEmpty()) cdkBuilder.groups(_groups)
        if (_roles.isNotEmpty()) cdkBuilder.roles(_roles)
        if (_statements.isNotEmpty()) cdkBuilder.statements(_statements)
        if (_users.isNotEmpty()) cdkBuilder.users(_users)
        return cdkBuilder.build()
    }
}
