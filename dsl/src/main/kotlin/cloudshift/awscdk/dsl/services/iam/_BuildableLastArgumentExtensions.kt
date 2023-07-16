@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.iam

import cloudshift.awscdk.dsl.RemovalPolicyOptionsDsl
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.RemovalPolicy
import software.amazon.awscdk.services.iam.AccountPrincipal
import software.amazon.awscdk.services.iam.AccountRootPrincipal
import software.amazon.awscdk.services.iam.AddToPrincipalPolicyResult
import software.amazon.awscdk.services.iam.AnyPrincipal
import software.amazon.awscdk.services.iam.ArnPrincipal
import software.amazon.awscdk.services.iam.CanonicalUserPrincipal
import software.amazon.awscdk.services.iam.CfnAccessKey
import software.amazon.awscdk.services.iam.CfnGroup
import software.amazon.awscdk.services.iam.CfnInstanceProfile
import software.amazon.awscdk.services.iam.CfnManagedPolicy
import software.amazon.awscdk.services.iam.CfnOIDCProvider
import software.amazon.awscdk.services.iam.CfnPolicy
import software.amazon.awscdk.services.iam.CfnRole
import software.amazon.awscdk.services.iam.CfnSAMLProvider
import software.amazon.awscdk.services.iam.CfnServerCertificate
import software.amazon.awscdk.services.iam.CfnServiceLinkedRole
import software.amazon.awscdk.services.iam.CfnUser
import software.amazon.awscdk.services.iam.CfnUserToGroupAddition
import software.amazon.awscdk.services.iam.CfnVirtualMFADevice
import software.amazon.awscdk.services.iam.CompositePrincipal
import software.amazon.awscdk.services.iam.FederatedPrincipal
import software.amazon.awscdk.services.iam.Group
import software.amazon.awscdk.services.iam.IRole
import software.amazon.awscdk.services.iam.LazyRole
import software.amazon.awscdk.services.iam.OpenIdConnectPrincipal
import software.amazon.awscdk.services.iam.OrganizationPrincipal
import software.amazon.awscdk.services.iam.PolicyStatement
import software.amazon.awscdk.services.iam.PrincipalWithConditions
import software.amazon.awscdk.services.iam.Role
import software.amazon.awscdk.services.iam.SamlConsolePrincipal
import software.amazon.awscdk.services.iam.SamlPrincipal
import software.amazon.awscdk.services.iam.ServicePrincipal
import software.amazon.awscdk.services.iam.SessionTagsPrincipal
import software.amazon.awscdk.services.iam.StarPrincipal
import software.amazon.awscdk.services.iam.UnknownPrincipal
import software.amazon.awscdk.services.iam.User
import software.amazon.awscdk.services.iam.WebIdentityPrincipal

public inline fun AccountPrincipal.addToAssumeRolePolicy(block: PolicyDocumentDsl.() -> Unit = {}) {
  val builder = PolicyDocumentDsl()
  builder.apply(block)
  return addToAssumeRolePolicy(builder.build())
}

public inline fun AccountPrincipal.addToPolicy(block: PolicyStatementDsl.() -> Unit = {}): Boolean {
  val builder = PolicyStatementDsl()
  builder.apply(block)
  return addToPolicy(builder.build())
}

public inline fun AccountPrincipal.addToPrincipalPolicy(block: PolicyStatementDsl.() -> Unit = {}):
    AddToPrincipalPolicyResult {
  val builder = PolicyStatementDsl()
  builder.apply(block)
  return addToPrincipalPolicy(builder.build())
}

public inline fun AccountRootPrincipal.addToAssumeRolePolicy(block: PolicyDocumentDsl.() -> Unit =
    {}) {
  val builder = PolicyDocumentDsl()
  builder.apply(block)
  return addToAssumeRolePolicy(builder.build())
}

public inline fun AccountRootPrincipal.addToPolicy(block: PolicyStatementDsl.() -> Unit = {}):
    Boolean {
  val builder = PolicyStatementDsl()
  builder.apply(block)
  return addToPolicy(builder.build())
}

public inline fun AccountRootPrincipal.addToPrincipalPolicy(block: PolicyStatementDsl.() -> Unit =
    {}): AddToPrincipalPolicyResult {
  val builder = PolicyStatementDsl()
  builder.apply(block)
  return addToPrincipalPolicy(builder.build())
}

public inline fun AnyPrincipal.addToAssumeRolePolicy(block: PolicyDocumentDsl.() -> Unit = {}) {
  val builder = PolicyDocumentDsl()
  builder.apply(block)
  return addToAssumeRolePolicy(builder.build())
}

public inline fun AnyPrincipal.addToPolicy(block: PolicyStatementDsl.() -> Unit = {}): Boolean {
  val builder = PolicyStatementDsl()
  builder.apply(block)
  return addToPolicy(builder.build())
}

public inline fun AnyPrincipal.addToPrincipalPolicy(block: PolicyStatementDsl.() -> Unit = {}):
    AddToPrincipalPolicyResult {
  val builder = PolicyStatementDsl()
  builder.apply(block)
  return addToPrincipalPolicy(builder.build())
}

public inline fun ArnPrincipal.addToAssumeRolePolicy(block: PolicyDocumentDsl.() -> Unit = {}) {
  val builder = PolicyDocumentDsl()
  builder.apply(block)
  return addToAssumeRolePolicy(builder.build())
}

public inline fun ArnPrincipal.addToPolicy(block: PolicyStatementDsl.() -> Unit = {}): Boolean {
  val builder = PolicyStatementDsl()
  builder.apply(block)
  return addToPolicy(builder.build())
}

public inline fun ArnPrincipal.addToPrincipalPolicy(block: PolicyStatementDsl.() -> Unit = {}):
    AddToPrincipalPolicyResult {
  val builder = PolicyStatementDsl()
  builder.apply(block)
  return addToPrincipalPolicy(builder.build())
}

public inline fun CanonicalUserPrincipal.addToAssumeRolePolicy(block: PolicyDocumentDsl.() -> Unit =
    {}) {
  val builder = PolicyDocumentDsl()
  builder.apply(block)
  return addToAssumeRolePolicy(builder.build())
}

public inline fun CanonicalUserPrincipal.addToPolicy(block: PolicyStatementDsl.() -> Unit = {}):
    Boolean {
  val builder = PolicyStatementDsl()
  builder.apply(block)
  return addToPolicy(builder.build())
}

public inline fun CanonicalUserPrincipal.addToPrincipalPolicy(block: PolicyStatementDsl.() -> Unit =
    {}): AddToPrincipalPolicyResult {
  val builder = PolicyStatementDsl()
  builder.apply(block)
  return addToPrincipalPolicy(builder.build())
}

public inline fun CfnAccessKey.applyRemovalPolicy(arg0: RemovalPolicy,
    block: RemovalPolicyOptionsDsl.() -> Unit = {}) {
  val builder = RemovalPolicyOptionsDsl()
  builder.apply(block)
  return applyRemovalPolicy(arg0,builder.build())
}

public inline fun CfnGroup.applyRemovalPolicy(arg0: RemovalPolicy,
    block: RemovalPolicyOptionsDsl.() -> Unit = {}) {
  val builder = RemovalPolicyOptionsDsl()
  builder.apply(block)
  return applyRemovalPolicy(arg0,builder.build())
}

public inline fun CfnInstanceProfile.applyRemovalPolicy(arg0: RemovalPolicy,
    block: RemovalPolicyOptionsDsl.() -> Unit = {}) {
  val builder = RemovalPolicyOptionsDsl()
  builder.apply(block)
  return applyRemovalPolicy(arg0,builder.build())
}

public inline fun CfnManagedPolicy.applyRemovalPolicy(arg0: RemovalPolicy,
    block: RemovalPolicyOptionsDsl.() -> Unit = {}) {
  val builder = RemovalPolicyOptionsDsl()
  builder.apply(block)
  return applyRemovalPolicy(arg0,builder.build())
}

public inline fun CfnOIDCProvider.applyRemovalPolicy(arg0: RemovalPolicy,
    block: RemovalPolicyOptionsDsl.() -> Unit = {}) {
  val builder = RemovalPolicyOptionsDsl()
  builder.apply(block)
  return applyRemovalPolicy(arg0,builder.build())
}

public inline fun CfnPolicy.applyRemovalPolicy(arg0: RemovalPolicy,
    block: RemovalPolicyOptionsDsl.() -> Unit = {}) {
  val builder = RemovalPolicyOptionsDsl()
  builder.apply(block)
  return applyRemovalPolicy(arg0,builder.build())
}

public inline fun CfnRole.applyRemovalPolicy(arg0: RemovalPolicy,
    block: RemovalPolicyOptionsDsl.() -> Unit = {}) {
  val builder = RemovalPolicyOptionsDsl()
  builder.apply(block)
  return applyRemovalPolicy(arg0,builder.build())
}

public inline fun CfnSAMLProvider.applyRemovalPolicy(arg0: RemovalPolicy,
    block: RemovalPolicyOptionsDsl.() -> Unit = {}) {
  val builder = RemovalPolicyOptionsDsl()
  builder.apply(block)
  return applyRemovalPolicy(arg0,builder.build())
}

public inline fun CfnServerCertificate.applyRemovalPolicy(arg0: RemovalPolicy,
    block: RemovalPolicyOptionsDsl.() -> Unit = {}) {
  val builder = RemovalPolicyOptionsDsl()
  builder.apply(block)
  return applyRemovalPolicy(arg0,builder.build())
}

public inline fun CfnServiceLinkedRole.applyRemovalPolicy(arg0: RemovalPolicy,
    block: RemovalPolicyOptionsDsl.() -> Unit = {}) {
  val builder = RemovalPolicyOptionsDsl()
  builder.apply(block)
  return applyRemovalPolicy(arg0,builder.build())
}

public inline fun CfnUser.applyRemovalPolicy(arg0: RemovalPolicy,
    block: RemovalPolicyOptionsDsl.() -> Unit = {}) {
  val builder = RemovalPolicyOptionsDsl()
  builder.apply(block)
  return applyRemovalPolicy(arg0,builder.build())
}

public inline fun CfnUser.setLoginProfile(block: CfnUserLoginProfilePropertyDsl.() -> Unit = {}) {
  val builder = CfnUserLoginProfilePropertyDsl()
  builder.apply(block)
  return setLoginProfile(builder.build())
}

public inline fun CfnUserToGroupAddition.applyRemovalPolicy(arg0: RemovalPolicy,
    block: RemovalPolicyOptionsDsl.() -> Unit = {}) {
  val builder = RemovalPolicyOptionsDsl()
  builder.apply(block)
  return applyRemovalPolicy(arg0,builder.build())
}

public inline fun CfnVirtualMFADevice.applyRemovalPolicy(arg0: RemovalPolicy,
    block: RemovalPolicyOptionsDsl.() -> Unit = {}) {
  val builder = RemovalPolicyOptionsDsl()
  builder.apply(block)
  return applyRemovalPolicy(arg0,builder.build())
}

public inline fun CompositePrincipal.addToAssumeRolePolicy(block: PolicyDocumentDsl.() -> Unit =
    {}) {
  val builder = PolicyDocumentDsl()
  builder.apply(block)
  return addToAssumeRolePolicy(builder.build())
}

public inline fun CompositePrincipal.addToPolicy(block: PolicyStatementDsl.() -> Unit = {}):
    Boolean {
  val builder = PolicyStatementDsl()
  builder.apply(block)
  return addToPolicy(builder.build())
}

public inline fun CompositePrincipal.addToPrincipalPolicy(block: PolicyStatementDsl.() -> Unit =
    {}): AddToPrincipalPolicyResult {
  val builder = PolicyStatementDsl()
  builder.apply(block)
  return addToPrincipalPolicy(builder.build())
}

public inline fun FederatedPrincipal.addToAssumeRolePolicy(block: PolicyDocumentDsl.() -> Unit =
    {}) {
  val builder = PolicyDocumentDsl()
  builder.apply(block)
  return addToAssumeRolePolicy(builder.build())
}

public inline fun FederatedPrincipal.addToPolicy(block: PolicyStatementDsl.() -> Unit = {}):
    Boolean {
  val builder = PolicyStatementDsl()
  builder.apply(block)
  return addToPolicy(builder.build())
}

public inline fun FederatedPrincipal.addToPrincipalPolicy(block: PolicyStatementDsl.() -> Unit =
    {}): AddToPrincipalPolicyResult {
  val builder = PolicyStatementDsl()
  builder.apply(block)
  return addToPrincipalPolicy(builder.build())
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

public inline fun OpenIdConnectPrincipal.addToAssumeRolePolicy(block: PolicyDocumentDsl.() -> Unit =
    {}) {
  val builder = PolicyDocumentDsl()
  builder.apply(block)
  return addToAssumeRolePolicy(builder.build())
}

public inline fun OpenIdConnectPrincipal.addToPolicy(block: PolicyStatementDsl.() -> Unit = {}):
    Boolean {
  val builder = PolicyStatementDsl()
  builder.apply(block)
  return addToPolicy(builder.build())
}

public inline fun OpenIdConnectPrincipal.addToPrincipalPolicy(block: PolicyStatementDsl.() -> Unit =
    {}): AddToPrincipalPolicyResult {
  val builder = PolicyStatementDsl()
  builder.apply(block)
  return addToPrincipalPolicy(builder.build())
}

public inline fun OrganizationPrincipal.addToAssumeRolePolicy(block: PolicyDocumentDsl.() -> Unit =
    {}) {
  val builder = PolicyDocumentDsl()
  builder.apply(block)
  return addToAssumeRolePolicy(builder.build())
}

public inline fun OrganizationPrincipal.addToPolicy(block: PolicyStatementDsl.() -> Unit = {}):
    Boolean {
  val builder = PolicyStatementDsl()
  builder.apply(block)
  return addToPolicy(builder.build())
}

public inline fun OrganizationPrincipal.addToPrincipalPolicy(block: PolicyStatementDsl.() -> Unit =
    {}): AddToPrincipalPolicyResult {
  val builder = PolicyStatementDsl()
  builder.apply(block)
  return addToPrincipalPolicy(builder.build())
}

public inline fun PolicyStatement.addServicePrincipal(arg0: String,
    block: ServicePrincipalOptsDsl.() -> Unit = {}) {
  val builder = ServicePrincipalOptsDsl()
  builder.apply(block)
  return addServicePrincipal(arg0,builder.build())
}

public inline fun PolicyStatement.copy(block: PolicyStatementPropsDsl.() -> Unit = {}):
    PolicyStatement {
  val builder = PolicyStatementPropsDsl()
  builder.apply(block)
  return copy(builder.build())
}

public inline fun PrincipalWithConditions.addToAssumeRolePolicy(block: PolicyDocumentDsl.() -> Unit
    = {}) {
  val builder = PolicyDocumentDsl()
  builder.apply(block)
  return addToAssumeRolePolicy(builder.build())
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

public inline fun SamlConsolePrincipal.addToAssumeRolePolicy(block: PolicyDocumentDsl.() -> Unit =
    {}) {
  val builder = PolicyDocumentDsl()
  builder.apply(block)
  return addToAssumeRolePolicy(builder.build())
}

public inline fun SamlConsolePrincipal.addToPolicy(block: PolicyStatementDsl.() -> Unit = {}):
    Boolean {
  val builder = PolicyStatementDsl()
  builder.apply(block)
  return addToPolicy(builder.build())
}

public inline fun SamlConsolePrincipal.addToPrincipalPolicy(block: PolicyStatementDsl.() -> Unit =
    {}): AddToPrincipalPolicyResult {
  val builder = PolicyStatementDsl()
  builder.apply(block)
  return addToPrincipalPolicy(builder.build())
}

public inline fun SamlPrincipal.addToAssumeRolePolicy(block: PolicyDocumentDsl.() -> Unit = {}) {
  val builder = PolicyDocumentDsl()
  builder.apply(block)
  return addToAssumeRolePolicy(builder.build())
}

public inline fun SamlPrincipal.addToPolicy(block: PolicyStatementDsl.() -> Unit = {}): Boolean {
  val builder = PolicyStatementDsl()
  builder.apply(block)
  return addToPolicy(builder.build())
}

public inline fun SamlPrincipal.addToPrincipalPolicy(block: PolicyStatementDsl.() -> Unit = {}):
    AddToPrincipalPolicyResult {
  val builder = PolicyStatementDsl()
  builder.apply(block)
  return addToPrincipalPolicy(builder.build())
}

public inline fun ServicePrincipal.addToAssumeRolePolicy(block: PolicyDocumentDsl.() -> Unit = {}) {
  val builder = PolicyDocumentDsl()
  builder.apply(block)
  return addToAssumeRolePolicy(builder.build())
}

public inline fun ServicePrincipal.addToPolicy(block: PolicyStatementDsl.() -> Unit = {}): Boolean {
  val builder = PolicyStatementDsl()
  builder.apply(block)
  return addToPolicy(builder.build())
}

public inline fun ServicePrincipal.addToPrincipalPolicy(block: PolicyStatementDsl.() -> Unit = {}):
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

public inline fun StarPrincipal.addToAssumeRolePolicy(block: PolicyDocumentDsl.() -> Unit = {}) {
  val builder = PolicyDocumentDsl()
  builder.apply(block)
  return addToAssumeRolePolicy(builder.build())
}

public inline fun StarPrincipal.addToPolicy(block: PolicyStatementDsl.() -> Unit = {}): Boolean {
  val builder = PolicyStatementDsl()
  builder.apply(block)
  return addToPolicy(builder.build())
}

public inline fun StarPrincipal.addToPrincipalPolicy(block: PolicyStatementDsl.() -> Unit = {}):
    AddToPrincipalPolicyResult {
  val builder = PolicyStatementDsl()
  builder.apply(block)
  return addToPrincipalPolicy(builder.build())
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

public inline fun WebIdentityPrincipal.addToAssumeRolePolicy(block: PolicyDocumentDsl.() -> Unit =
    {}) {
  val builder = PolicyDocumentDsl()
  builder.apply(block)
  return addToAssumeRolePolicy(builder.build())
}

public inline fun WebIdentityPrincipal.addToPolicy(block: PolicyStatementDsl.() -> Unit = {}):
    Boolean {
  val builder = PolicyStatementDsl()
  builder.apply(block)
  return addToPolicy(builder.build())
}

public inline fun WebIdentityPrincipal.addToPrincipalPolicy(block: PolicyStatementDsl.() -> Unit =
    {}): AddToPrincipalPolicyResult {
  val builder = PolicyStatementDsl()
  builder.apply(block)
  return addToPrincipalPolicy(builder.build())
}
