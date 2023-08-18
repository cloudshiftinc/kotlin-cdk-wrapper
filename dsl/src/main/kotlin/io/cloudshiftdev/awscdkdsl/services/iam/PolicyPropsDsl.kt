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

package io.cloudshiftdev.awscdkdsl.services.iam

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.services.iam.IGroup
import software.amazon.awscdk.services.iam.IRole
import software.amazon.awscdk.services.iam.IUser
import software.amazon.awscdk.services.iam.PolicyDocument
import software.amazon.awscdk.services.iam.PolicyProps
import software.amazon.awscdk.services.iam.PolicyStatement

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
@CdkDslMarker
public class PolicyPropsDsl {
    private val cdkBuilder: PolicyProps.Builder = PolicyProps.builder()

    private val _groups: MutableList<IGroup> = mutableListOf()

    private val _roles: MutableList<IRole> = mutableListOf()

    private val _statements: MutableList<PolicyStatement> = mutableListOf()

    private val _users: MutableList<IUser> = mutableListOf()

    /**
     * @param document Initial PolicyDocument to use for this Policy. If omited, any
     *   `PolicyStatement` provided in the `statements` property will be applied against the empty
     *   default `PolicyDocument`.
     */
    public fun document(document: PolicyDocumentDsl.() -> Unit = {}) {
        val builder = PolicyDocumentDsl()
        builder.apply(document)
        cdkBuilder.document(builder.build())
    }

    /**
     * @param document Initial PolicyDocument to use for this Policy. If omited, any
     *   `PolicyStatement` provided in the `statements` property will be applied against the empty
     *   default `PolicyDocument`.
     */
    public fun document(document: PolicyDocument) {
        cdkBuilder.document(document)
    }

    /**
     * @param force Force creation of an `AWS::IAM::Policy`. Unless set to `true`, this `Policy`
     *   construct will not materialize to an `AWS::IAM::Policy` CloudFormation resource in case it
     *   would have no effect (for example, if it remains unattached to an IAM identity or if it has
     *   no statements). This is generally desired behavior, since it prevents creating invalid--and
     *   hence undeployable--CloudFormation templates.
     *
     * In cases where you know the policy must be created and it is actually an error if no
     * statements have been added to it, you can set this to `true`.
     */
    public fun force(force: Boolean) {
        cdkBuilder.force(force)
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
     * @param policyName The name of the policy. If you specify multiple policies for an entity,
     *   specify unique names. For example, if you specify a list of policies for an IAM role, each
     *   policy must have a unique name.
     */
    public fun policyName(policyName: String) {
        cdkBuilder.policyName(policyName)
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
     *   `addStatements(...statement)` to add permissions later.
     */
    public fun statements(statements: PolicyStatementDsl.() -> Unit) {
        _statements.add(PolicyStatementDsl().apply(statements).build())
    }

    /**
     * @param statements Initial set of permissions to add to this policy document. You can also use
     *   `addStatements(...statement)` to add permissions later.
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

    public fun build(): PolicyProps {
        if (_groups.isNotEmpty()) cdkBuilder.groups(_groups)
        if (_roles.isNotEmpty()) cdkBuilder.roles(_roles)
        if (_statements.isNotEmpty()) cdkBuilder.statements(_statements)
        if (_users.isNotEmpty()) cdkBuilder.users(_users)
        return cdkBuilder.build()
    }
}
