@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

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

public inline fun CfnUser.setLoginProfile(block: CfnUserLoginProfilePropertyDsl.() -> Unit = {}) {
  val builder = CfnUserLoginProfilePropertyDsl()
  builder.apply(block)
  return setLoginProfile(builder.build())
}

public inline fun CompositePrincipal.addToAssumeRolePolicy(block: PolicyDocumentDsl.() -> Unit =
    {}) {
  val builder = PolicyDocumentDsl()
  builder.apply(block)
  return addToAssumeRolePolicy(builder.build())
}

public inline fun Role.addToPolicy(block: PolicyStatementDsl.() -> Unit = {}): Boolean {
  val builder = PolicyStatementDsl()
  builder.apply(block)
  return addToPolicy(builder.build())
}

public inline fun Role.addToPrincipalPolicy(block: PolicyStatementDsl.() -> Unit = {}):
    AddToPrincipalPolicyResult {
  val builder = PolicyStatementDsl()
  builder.apply(block)
  return addToPrincipalPolicy(builder.build())
}

public inline fun Role.withoutPolicyUpdates(block: WithoutPolicyUpdatesOptionsDsl.() -> Unit = {}):
    IRole {
  val builder = WithoutPolicyUpdatesOptionsDsl()
  builder.apply(block)
  return withoutPolicyUpdates(builder.build())
}

public inline fun UnknownPrincipal.addToPolicy(block: PolicyStatementDsl.() -> Unit = {}): Boolean {
  val builder = PolicyStatementDsl()
  builder.apply(block)
  return addToPolicy(builder.build())
}

public inline fun UnknownPrincipal.addToPrincipalPolicy(block: PolicyStatementDsl.() -> Unit = {}):
    AddToPrincipalPolicyResult {
  val builder = PolicyStatementDsl()
  builder.apply(block)
  return addToPrincipalPolicy(builder.build())
}

public inline fun PolicyDocument.addStatements(block: PolicyStatementDsl.() -> Unit = {}) {
  val builder = PolicyStatementDsl()
  builder.apply(block)
  return addStatements(builder.build())
}

public inline fun IAssumeRolePrincipal.addToAssumeRolePolicy(block: PolicyDocumentDsl.() -> Unit =
    {}) {
  val builder = PolicyDocumentDsl()
  builder.apply(block)
  return addToAssumeRolePolicy(builder.build())
}

public inline fun IResourceWithPolicy.addToResourcePolicy(block: PolicyStatementDsl.() -> Unit =
    {}): AddToResourcePolicyResult {
  val builder = PolicyStatementDsl()
  builder.apply(block)
  return addToResourcePolicy(builder.build())
}

public inline fun Policy.addStatements(block: PolicyStatementDsl.() -> Unit = {}) {
  val builder = PolicyStatementDsl()
  builder.apply(block)
  return addStatements(builder.build())
}

public inline fun LazyRole.addToPolicy(block: PolicyStatementDsl.() -> Unit = {}): Boolean {
  val builder = PolicyStatementDsl()
  builder.apply(block)
  return addToPolicy(builder.build())
}

public inline fun LazyRole.addToPrincipalPolicy(block: PolicyStatementDsl.() -> Unit = {}):
    AddToPrincipalPolicyResult {
  val builder = PolicyStatementDsl()
  builder.apply(block)
  return addToPrincipalPolicy(builder.build())
}

public inline fun SessionTagsPrincipal.addToAssumeRolePolicy(block: PolicyDocumentDsl.() -> Unit =
    {}) {
  val builder = PolicyDocumentDsl()
  builder.apply(block)
  return addToAssumeRolePolicy(builder.build())
}

public inline fun SessionTagsPrincipal.addToPolicy(block: PolicyStatementDsl.() -> Unit = {}):
    Boolean {
  val builder = PolicyStatementDsl()
  builder.apply(block)
  return addToPolicy(builder.build())
}

public inline fun SessionTagsPrincipal.addToPrincipalPolicy(block: PolicyStatementDsl.() -> Unit =
    {}): AddToPrincipalPolicyResult {
  val builder = PolicyStatementDsl()
  builder.apply(block)
  return addToPrincipalPolicy(builder.build())
}

public inline fun PolicyStatement.addServicePrincipal(service: String,
    block: ServicePrincipalOptsDsl.() -> Unit = {}) {
  val builder = ServicePrincipalOptsDsl()
  builder.apply(block)
  return addServicePrincipal(service, builder.build())
}

public inline fun PolicyStatement.copy(block: PolicyStatementPropsDsl.() -> Unit = {}):
    PolicyStatement {
  val builder = PolicyStatementPropsDsl()
  builder.apply(block)
  return copy(builder.build())
}

public inline fun Group.addToPolicy(block: PolicyStatementDsl.() -> Unit = {}): Boolean {
  val builder = PolicyStatementDsl()
  builder.apply(block)
  return addToPolicy(builder.build())
}

public inline fun Group.addToPrincipalPolicy(block: PolicyStatementDsl.() -> Unit = {}):
    AddToPrincipalPolicyResult {
  val builder = PolicyStatementDsl()
  builder.apply(block)
  return addToPrincipalPolicy(builder.build())
}

public inline fun PrincipalBase.addToAssumeRolePolicy(block: PolicyDocumentDsl.() -> Unit = {}) {
  val builder = PolicyDocumentDsl()
  builder.apply(block)
  return addToAssumeRolePolicy(builder.build())
}

public inline fun PrincipalBase.addToPolicy(block: PolicyStatementDsl.() -> Unit = {}): Boolean {
  val builder = PolicyStatementDsl()
  builder.apply(block)
  return addToPolicy(builder.build())
}

public inline fun PrincipalBase.addToPrincipalPolicy(block: PolicyStatementDsl.() -> Unit = {}):
    AddToPrincipalPolicyResult {
  val builder = PolicyStatementDsl()
  builder.apply(block)
  return addToPrincipalPolicy(builder.build())
}

public inline fun IPrincipal.addToPrincipalPolicy(block: PolicyStatementDsl.() -> Unit = {}):
    AddToPrincipalPolicyResult {
  val builder = PolicyStatementDsl()
  builder.apply(block)
  return addToPrincipalPolicy(builder.build())
}

public inline fun ManagedPolicy.addStatements(block: PolicyStatementDsl.() -> Unit = {}) {
  val builder = PolicyStatementDsl()
  builder.apply(block)
  return addStatements(builder.build())
}

public inline fun User.addToPolicy(block: PolicyStatementDsl.() -> Unit = {}): Boolean {
  val builder = PolicyStatementDsl()
  builder.apply(block)
  return addToPolicy(builder.build())
}

public inline fun User.addToPrincipalPolicy(block: PolicyStatementDsl.() -> Unit = {}):
    AddToPrincipalPolicyResult {
  val builder = PolicyStatementDsl()
  builder.apply(block)
  return addToPrincipalPolicy(builder.build())
}

public inline fun PrincipalWithConditions.addToPolicy(block: PolicyStatementDsl.() -> Unit = {}):
    Boolean {
  val builder = PolicyStatementDsl()
  builder.apply(block)
  return addToPolicy(builder.build())
}

public inline fun PrincipalWithConditions.addToPrincipalPolicy(block: PolicyStatementDsl.() -> Unit
    = {}): AddToPrincipalPolicyResult {
  val builder = PolicyStatementDsl()
  builder.apply(block)
  return addToPrincipalPolicy(builder.build())
}
