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
import software.amazon.awscdk.services.iam.ManagedPolicyProps
import software.amazon.awscdk.services.iam.PolicyDocument
import software.amazon.awscdk.services.iam.PolicyStatement

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
@CdkDslMarker
public class ManagedPolicyPropsDsl {
    private val cdkBuilder: ManagedPolicyProps.Builder = ManagedPolicyProps.builder()

    private val _groups: MutableList<IGroup> = mutableListOf()

    private val _roles: MutableList<IRole> = mutableListOf()

    private val _statements: MutableList<PolicyStatement> = mutableListOf()

    private val _users: MutableList<IUser> = mutableListOf()

    /**
     * @param description A description of the managed policy. Typically used to store information
     *   about the permissions defined in the policy. For example, "Grants access to production
     *   DynamoDB tables." The policy description is immutable. After a value is assigned, it cannot
     *   be changed.
     */
    public fun description(description: String) {
        cdkBuilder.description(description)
    }

    /**
     * @param document Initial PolicyDocument to use for this ManagedPolicy. If omited, any
     *   `PolicyStatement` provided in the `statements` property will be applied against the empty
     *   default `PolicyDocument`.
     */
    public fun document(document: PolicyDocumentDsl.() -> Unit = {}) {
        val builder = PolicyDocumentDsl()
        builder.apply(document)
        cdkBuilder.document(builder.build())
    }

    /**
     * @param document Initial PolicyDocument to use for this ManagedPolicy. If omited, any
     *   `PolicyStatement` provided in the `statements` property will be applied against the empty
     *   default `PolicyDocument`.
     */
    public fun document(document: PolicyDocument) {
        cdkBuilder.document(document)
    }

    /**
     * @param groups Groups to attach this policy to. You can also use `attachToGroup(group)` to
     *   attach this policy to a group.
     */
    public fun groups(vararg groups: IGroup) {
        _groups.addAll(listOf(*groups))
    }

    /**
     * @param groups Groups to attach this policy to. You can also use `attachToGroup(group)` to
     *   attach this policy to a group.
     */
    public fun groups(groups: Collection<IGroup>) {
        _groups.addAll(groups)
    }

    /**
     * @param managedPolicyName The name of the managed policy. If you specify multiple policies for
     *   an entity, specify unique names. For example, if you specify a list of policies for an IAM
     *   role, each policy must have a unique name.
     */
    public fun managedPolicyName(managedPolicyName: String) {
        cdkBuilder.managedPolicyName(managedPolicyName)
    }

    /**
     * @param path The path for the policy. This parameter allows (through its regex pattern) a
     *   string of characters consisting of either a forward slash (/) by itself or a string that
     *   must begin and end with forward slashes. In addition, it can contain any ASCII character
     *   from the ! (\u0021) through the DEL character (\u007F), including most punctuation
     *   characters, digits, and upper and lowercased letters.
     *
     * For more information about paths, see IAM Identifiers in the IAM User Guide.
     */
    public fun path(path: String) {
        cdkBuilder.path(path)
    }

    /**
     * @param roles Roles to attach this policy to. You can also use `attachToRole(role)` to attach
     *   this policy to a role.
     */
    public fun roles(vararg roles: IRole) {
        _roles.addAll(listOf(*roles))
    }

    /**
     * @param roles Roles to attach this policy to. You can also use `attachToRole(role)` to attach
     *   this policy to a role.
     */
    public fun roles(roles: Collection<IRole>) {
        _roles.addAll(roles)
    }

    /**
     * @param statements Initial set of permissions to add to this policy document. You can also use
     *   `addPermission(statement)` to add permissions later.
     */
    public fun statements(statements: PolicyStatementDsl.() -> Unit) {
        _statements.add(PolicyStatementDsl().apply(statements).build())
    }

    /**
     * @param statements Initial set of permissions to add to this policy document. You can also use
     *   `addPermission(statement)` to add permissions later.
     */
    public fun statements(statements: Collection<PolicyStatement>) {
        _statements.addAll(statements)
    }

    /**
     * @param users Users to attach this policy to. You can also use `attachToUser(user)` to attach
     *   this policy to a user.
     */
    public fun users(vararg users: IUser) {
        _users.addAll(listOf(*users))
    }

    /**
     * @param users Users to attach this policy to. You can also use `attachToUser(user)` to attach
     *   this policy to a user.
     */
    public fun users(users: Collection<IUser>) {
        _users.addAll(users)
    }

    public fun build(): ManagedPolicyProps {
        if (_groups.isNotEmpty()) cdkBuilder.groups(_groups)
        if (_roles.isNotEmpty()) cdkBuilder.roles(_roles)
        if (_statements.isNotEmpty()) cdkBuilder.statements(_statements)
        if (_users.isNotEmpty()) cdkBuilder.users(_users)
        return cdkBuilder.build()
    }
}
