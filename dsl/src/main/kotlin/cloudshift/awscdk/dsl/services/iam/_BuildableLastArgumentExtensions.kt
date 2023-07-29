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

import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.iam.AddToPrincipalPolicyResult
import software.amazon.awscdk.services.iam.AddToResourcePolicyResult
import software.amazon.awscdk.services.iam.CfnUser
import software.amazon.awscdk.services.iam.CompositePrincipal
import software.amazon.awscdk.services.iam.Group
import software.amazon.awscdk.services.iam.IAssumeRolePrincipal
import software.amazon.awscdk.services.iam.IPrincipal
import software.amazon.awscdk.services.iam.IResourceWithPolicy
import software.amazon.awscdk.services.iam.IRole
import software.amazon.awscdk.services.iam.LazyRole
import software.amazon.awscdk.services.iam.ManagedPolicy
import software.amazon.awscdk.services.iam.Policy
import software.amazon.awscdk.services.iam.PolicyDocument
import software.amazon.awscdk.services.iam.PolicyStatement
import software.amazon.awscdk.services.iam.PrincipalBase
import software.amazon.awscdk.services.iam.PrincipalWithConditions
import software.amazon.awscdk.services.iam.Role
import software.amazon.awscdk.services.iam.SessionTagsPrincipal
import software.amazon.awscdk.services.iam.UnknownPrincipal
import software.amazon.awscdk.services.iam.User

/** Creates a password for the specified IAM user. */
public inline fun CfnUser.setLoginProfile(block: CfnUserLoginProfilePropertyDsl.() -> Unit = {}) {
    val builder = CfnUserLoginProfilePropertyDsl()
    builder.apply(block)
    return setLoginProfile(builder.build())
}

/**
 * Add the principal to the AssumeRolePolicyDocument.
 *
 * Add the statements to the AssumeRolePolicyDocument necessary to give this principal permissions
 * to assume the given role.
 *
 * @param doc
 */
public inline fun CompositePrincipal.addToAssumeRolePolicy(
    block: PolicyDocumentDsl.() -> Unit = {}
) {
    val builder = PolicyDocumentDsl()
    builder.apply(block)
    return addToAssumeRolePolicy(builder.build())
}

/**
 * Add to the policy of this principal.
 *
 * @param statement
 */
public inline fun Role.addToPolicy(block: PolicyStatementDsl.() -> Unit = {}): Boolean {
    val builder = PolicyStatementDsl()
    builder.apply(block)
    return addToPolicy(builder.build())
}

/**
 * Adds a permission to the role's default policy document.
 *
 * If there is no default policy attached to this role, it will be created.
 *
 * @param statement The permission statement to add to the policy document.
 */
public inline fun Role.addToPrincipalPolicy(
    block: PolicyStatementDsl.() -> Unit = {}
): AddToPrincipalPolicyResult {
    val builder = PolicyStatementDsl()
    builder.apply(block)
    return addToPrincipalPolicy(builder.build())
}

/**
 * Return a copy of this Role object whose Policies will not be updated.
 *
 * Use the object returned by this method if you want this Role to be used by a construct without it
 * automatically updating the Role's Policies.
 *
 * If you do, you are responsible for adding the correct statements to the Role's policies yourself.
 *
 * @param options
 */
public inline fun Role.withoutPolicyUpdates(
    block: WithoutPolicyUpdatesOptionsDsl.() -> Unit = {}
): IRole {
    val builder = WithoutPolicyUpdatesOptionsDsl()
    builder.apply(block)
    return withoutPolicyUpdates(builder.build())
}

/**
 * Add to the policy of this principal.
 *
 * @param statement
 */
public inline fun UnknownPrincipal.addToPolicy(block: PolicyStatementDsl.() -> Unit = {}): Boolean {
    val builder = PolicyStatementDsl()
    builder.apply(block)
    return addToPolicy(builder.build())
}

/**
 * Add to the policy of this principal.
 *
 * @param statement
 */
public inline fun UnknownPrincipal.addToPrincipalPolicy(
    block: PolicyStatementDsl.() -> Unit = {}
): AddToPrincipalPolicyResult {
    val builder = PolicyStatementDsl()
    builder.apply(block)
    return addToPrincipalPolicy(builder.build())
}

/**
 * Adds a statement to the policy document.
 *
 * @param statement the statement to add.
 */
public inline fun PolicyDocument.addStatements(block: PolicyStatementDsl.() -> Unit = {}) {
    val builder = PolicyStatementDsl()
    builder.apply(block)
    return addStatements(builder.build())
}

/**
 * Add the principal to the AssumeRolePolicyDocument.
 *
 * Add the statements to the AssumeRolePolicyDocument necessary to give this principal permissions
 * to assume the given role.
 *
 * @param document
 */
public inline fun IAssumeRolePrincipal.addToAssumeRolePolicy(
    block: PolicyDocumentDsl.() -> Unit = {}
) {
    val builder = PolicyDocumentDsl()
    builder.apply(block)
    return addToAssumeRolePolicy(builder.build())
}

/**
 * Add a statement to the resource's resource policy.
 *
 * @param statement
 */
public inline fun IResourceWithPolicy.addToResourcePolicy(
    block: PolicyStatementDsl.() -> Unit = {}
): AddToResourcePolicyResult {
    val builder = PolicyStatementDsl()
    builder.apply(block)
    return addToResourcePolicy(builder.build())
}

/**
 * Adds a statement to the policy document.
 *
 * @param statement
 */
public inline fun Policy.addStatements(block: PolicyStatementDsl.() -> Unit = {}) {
    val builder = PolicyStatementDsl()
    builder.apply(block)
    return addStatements(builder.build())
}

/**
 * Add to the policy of this principal.
 *
 * @param statement
 */
public inline fun LazyRole.addToPolicy(block: PolicyStatementDsl.() -> Unit = {}): Boolean {
    val builder = PolicyStatementDsl()
    builder.apply(block)
    return addToPolicy(builder.build())
}

/**
 * Adds a permission to the role's default policy document.
 *
 * If there is no default policy attached to this role, it will be created.
 *
 * @param statement The permission statement to add to the policy document.
 */
public inline fun LazyRole.addToPrincipalPolicy(
    block: PolicyStatementDsl.() -> Unit = {}
): AddToPrincipalPolicyResult {
    val builder = PolicyStatementDsl()
    builder.apply(block)
    return addToPrincipalPolicy(builder.build())
}

/**
 * Add the principal to the AssumeRolePolicyDocument.
 *
 * Add the statements to the AssumeRolePolicyDocument necessary to give this principal permissions
 * to assume the given role.
 *
 * @param doc
 */
public inline fun SessionTagsPrincipal.addToAssumeRolePolicy(
    block: PolicyDocumentDsl.() -> Unit = {}
) {
    val builder = PolicyDocumentDsl()
    builder.apply(block)
    return addToAssumeRolePolicy(builder.build())
}

/**
 * Add to the policy of this principal.
 *
 * @param statement
 */
public inline fun SessionTagsPrincipal.addToPolicy(
    block: PolicyStatementDsl.() -> Unit = {}
): Boolean {
    val builder = PolicyStatementDsl()
    builder.apply(block)
    return addToPolicy(builder.build())
}

/**
 * Add to the policy of this principal.
 *
 * @param statement
 */
public inline fun SessionTagsPrincipal.addToPrincipalPolicy(
    block: PolicyStatementDsl.() -> Unit = {}
): AddToPrincipalPolicyResult {
    val builder = PolicyStatementDsl()
    builder.apply(block)
    return addToPrincipalPolicy(builder.build())
}

/**
 * Adds a service principal to this policy statement.
 *
 * @param service the service name for which a service principal is requested (e.g:
 *   `s3.amazonaws.com`).
 * @param opts options for adding the service principal (such as specifying a principal in a
 *   different region).
 */
public inline fun PolicyStatement.addServicePrincipal(
    service: String,
    block: ServicePrincipalOptsDsl.() -> Unit = {}
) {
    val builder = ServicePrincipalOptsDsl()
    builder.apply(block)
    return addServicePrincipal(service, builder.build())
}

/**
 * Create a new `PolicyStatement` with the same exact properties as this one, except for the
 * overrides.
 *
 * @param overrides
 */
public inline fun PolicyStatement.copy(
    block: PolicyStatementPropsDsl.() -> Unit = {}
): PolicyStatement {
    val builder = PolicyStatementPropsDsl()
    builder.apply(block)
    return copy(builder.build())
}

/**
 * Add to the policy of this principal.
 *
 * @param statement
 */
public inline fun Group.addToPolicy(block: PolicyStatementDsl.() -> Unit = {}): Boolean {
    val builder = PolicyStatementDsl()
    builder.apply(block)
    return addToPolicy(builder.build())
}

/**
 * Adds an IAM statement to the default policy.
 *
 * @param statement
 */
public inline fun Group.addToPrincipalPolicy(
    block: PolicyStatementDsl.() -> Unit = {}
): AddToPrincipalPolicyResult {
    val builder = PolicyStatementDsl()
    builder.apply(block)
    return addToPrincipalPolicy(builder.build())
}

/**
 * Add the principal to the AssumeRolePolicyDocument.
 *
 * Add the statements to the AssumeRolePolicyDocument necessary to give this principal permissions
 * to assume the given role.
 *
 * @param document
 */
public inline fun PrincipalBase.addToAssumeRolePolicy(block: PolicyDocumentDsl.() -> Unit = {}) {
    val builder = PolicyDocumentDsl()
    builder.apply(block)
    return addToAssumeRolePolicy(builder.build())
}

/**
 * Add to the policy of this principal.
 *
 * @param statement
 */
public inline fun PrincipalBase.addToPolicy(block: PolicyStatementDsl.() -> Unit = {}): Boolean {
    val builder = PolicyStatementDsl()
    builder.apply(block)
    return addToPolicy(builder.build())
}

/**
 * Add to the policy of this principal.
 *
 * @param _statement
 */
public inline fun PrincipalBase.addToPrincipalPolicy(
    block: PolicyStatementDsl.() -> Unit = {}
): AddToPrincipalPolicyResult {
    val builder = PolicyStatementDsl()
    builder.apply(block)
    return addToPrincipalPolicy(builder.build())
}

/**
 * Add to the policy of this principal.
 *
 * @param statement
 */
public inline fun IPrincipal.addToPrincipalPolicy(
    block: PolicyStatementDsl.() -> Unit = {}
): AddToPrincipalPolicyResult {
    val builder = PolicyStatementDsl()
    builder.apply(block)
    return addToPrincipalPolicy(builder.build())
}

/**
 * Adds a statement to the policy document.
 *
 * @param statement
 */
public inline fun ManagedPolicy.addStatements(block: PolicyStatementDsl.() -> Unit = {}) {
    val builder = PolicyStatementDsl()
    builder.apply(block)
    return addStatements(builder.build())
}

/**
 * Add to the policy of this principal.
 *
 * @param statement
 */
public inline fun User.addToPolicy(block: PolicyStatementDsl.() -> Unit = {}): Boolean {
    val builder = PolicyStatementDsl()
    builder.apply(block)
    return addToPolicy(builder.build())
}

/**
 * Adds an IAM statement to the default policy.
 *
 * @param statement
 * @return true
 */
public inline fun User.addToPrincipalPolicy(
    block: PolicyStatementDsl.() -> Unit = {}
): AddToPrincipalPolicyResult {
    val builder = PolicyStatementDsl()
    builder.apply(block)
    return addToPrincipalPolicy(builder.build())
}

/**
 * Add to the policy of this principal.
 *
 * @param statement
 */
public inline fun PrincipalWithConditions.addToPolicy(
    block: PolicyStatementDsl.() -> Unit = {}
): Boolean {
    val builder = PolicyStatementDsl()
    builder.apply(block)
    return addToPolicy(builder.build())
}

/**
 * Add to the policy of this principal.
 *
 * @param statement
 */
public inline fun PrincipalWithConditions.addToPrincipalPolicy(
    block: PolicyStatementDsl.() -> Unit = {}
): AddToPrincipalPolicyResult {
    val builder = PolicyStatementDsl()
    builder.apply(block)
    return addToPrincipalPolicy(builder.build())
}
