@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.iam

import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.iam.AccessKey
import software.amazon.awscdk.services.iam.AccessKeyProps
import software.amazon.awscdk.services.iam.AddToPrincipalPolicyResult
import software.amazon.awscdk.services.iam.AddToResourcePolicyResult
import software.amazon.awscdk.services.iam.CfnAccessKey
import software.amazon.awscdk.services.iam.CfnAccessKeyProps
import software.amazon.awscdk.services.iam.CfnGroup
import software.amazon.awscdk.services.iam.CfnGroupProps
import software.amazon.awscdk.services.iam.CfnInstanceProfile
import software.amazon.awscdk.services.iam.CfnInstanceProfileProps
import software.amazon.awscdk.services.iam.CfnManagedPolicy
import software.amazon.awscdk.services.iam.CfnManagedPolicyProps
import software.amazon.awscdk.services.iam.CfnOIDCProvider
import software.amazon.awscdk.services.iam.CfnOIDCProviderProps
import software.amazon.awscdk.services.iam.CfnPolicy
import software.amazon.awscdk.services.iam.CfnPolicyProps
import software.amazon.awscdk.services.iam.CfnRole
import software.amazon.awscdk.services.iam.CfnRoleProps
import software.amazon.awscdk.services.iam.CfnSAMLProvider
import software.amazon.awscdk.services.iam.CfnSAMLProviderProps
import software.amazon.awscdk.services.iam.CfnServerCertificate
import software.amazon.awscdk.services.iam.CfnServerCertificateProps
import software.amazon.awscdk.services.iam.CfnServiceLinkedRole
import software.amazon.awscdk.services.iam.CfnServiceLinkedRoleProps
import software.amazon.awscdk.services.iam.CfnUser
import software.amazon.awscdk.services.iam.CfnUserProps
import software.amazon.awscdk.services.iam.CfnUserToGroupAddition
import software.amazon.awscdk.services.iam.CfnUserToGroupAdditionProps
import software.amazon.awscdk.services.iam.CfnVirtualMFADevice
import software.amazon.awscdk.services.iam.CfnVirtualMFADeviceProps
import software.amazon.awscdk.services.iam.CommonGrantOptions
import software.amazon.awscdk.services.iam.CustomizeRolesOptions
import software.amazon.awscdk.services.iam.FromRoleArnOptions
import software.amazon.awscdk.services.iam.FromRoleNameOptions
import software.amazon.awscdk.services.iam.GrantOnPrincipalAndResourceOptions
import software.amazon.awscdk.services.iam.GrantOnPrincipalOptions
import software.amazon.awscdk.services.iam.GrantWithResourceOptions
import software.amazon.awscdk.services.iam.Group
import software.amazon.awscdk.services.iam.GroupProps
import software.amazon.awscdk.services.iam.LazyRole
import software.amazon.awscdk.services.iam.LazyRoleProps
import software.amazon.awscdk.services.iam.ManagedPolicy
import software.amazon.awscdk.services.iam.ManagedPolicyProps
import software.amazon.awscdk.services.iam.OpenIdConnectProvider
import software.amazon.awscdk.services.iam.OpenIdConnectProviderProps
import software.amazon.awscdk.services.iam.Policy
import software.amazon.awscdk.services.iam.PolicyDocument
import software.amazon.awscdk.services.iam.PolicyDocumentProps
import software.amazon.awscdk.services.iam.PolicyProps
import software.amazon.awscdk.services.iam.PolicyStatement
import software.amazon.awscdk.services.iam.PolicyStatementProps
import software.amazon.awscdk.services.iam.Role
import software.amazon.awscdk.services.iam.RoleProps
import software.amazon.awscdk.services.iam.SamlProvider
import software.amazon.awscdk.services.iam.SamlProviderProps
import software.amazon.awscdk.services.iam.ServicePrincipal
import software.amazon.awscdk.services.iam.ServicePrincipalOpts
import software.amazon.awscdk.services.iam.UnknownPrincipal
import software.amazon.awscdk.services.iam.UnknownPrincipalProps
import software.amazon.awscdk.services.iam.User
import software.amazon.awscdk.services.iam.UserAttributes
import software.amazon.awscdk.services.iam.UserProps
import software.amazon.awscdk.services.iam.WithoutPolicyUpdatesOptions
import software.constructs.Construct

public object iam {
  public inline fun accessKey(
    scope: Construct,
    id: String,
    block: AccessKeyDsl.() -> Unit = {},
  ): AccessKey {
    val builder = AccessKeyDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  public inline fun accessKeyProps(block: AccessKeyPropsDsl.() -> Unit = {}): AccessKeyProps {
    val builder = AccessKeyPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun addToPrincipalPolicyResult(block: AddToPrincipalPolicyResultDsl.() -> Unit =
      {}): AddToPrincipalPolicyResult {
    val builder = AddToPrincipalPolicyResultDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun addToResourcePolicyResult(block: AddToResourcePolicyResultDsl.() -> Unit = {}):
      AddToResourcePolicyResult {
    val builder = AddToResourcePolicyResultDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnAccessKey(
    scope: Construct,
    id: String,
    block: CfnAccessKeyDsl.() -> Unit = {},
  ): CfnAccessKey {
    val builder = CfnAccessKeyDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnAccessKeyProps(block: CfnAccessKeyPropsDsl.() -> Unit = {}):
      CfnAccessKeyProps {
    val builder = CfnAccessKeyPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnGroup(
    scope: Construct,
    id: String,
    block: CfnGroupDsl.() -> Unit = {},
  ): CfnGroup {
    val builder = CfnGroupDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnGroupPolicyProperty(block: CfnGroupPolicyPropertyDsl.() -> Unit = {}):
      CfnGroup.PolicyProperty {
    val builder = CfnGroupPolicyPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnGroupProps(block: CfnGroupPropsDsl.() -> Unit = {}): CfnGroupProps {
    val builder = CfnGroupPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnInstanceProfile(
    scope: Construct,
    id: String,
    block: CfnInstanceProfileDsl.() -> Unit = {},
  ): CfnInstanceProfile {
    val builder = CfnInstanceProfileDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnInstanceProfileProps(block: CfnInstanceProfilePropsDsl.() -> Unit = {}):
      CfnInstanceProfileProps {
    val builder = CfnInstanceProfilePropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnManagedPolicy(
    scope: Construct,
    id: String,
    block: CfnManagedPolicyDsl.() -> Unit = {},
  ): CfnManagedPolicy {
    val builder = CfnManagedPolicyDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnManagedPolicyProps(block: CfnManagedPolicyPropsDsl.() -> Unit = {}):
      CfnManagedPolicyProps {
    val builder = CfnManagedPolicyPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnOIDCProvider(
    scope: Construct,
    id: String,
    block: CfnOIDCProviderDsl.() -> Unit = {},
  ): CfnOIDCProvider {
    val builder = CfnOIDCProviderDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnOIDCProviderProps(block: CfnOIDCProviderPropsDsl.() -> Unit = {}):
      CfnOIDCProviderProps {
    val builder = CfnOIDCProviderPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnPolicy(
    scope: Construct,
    id: String,
    block: CfnPolicyDsl.() -> Unit = {},
  ): CfnPolicy {
    val builder = CfnPolicyDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnPolicyProps(block: CfnPolicyPropsDsl.() -> Unit = {}): CfnPolicyProps {
    val builder = CfnPolicyPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnRole(
    scope: Construct,
    id: String,
    block: CfnRoleDsl.() -> Unit = {},
  ): CfnRole {
    val builder = CfnRoleDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnRolePolicyProperty(block: CfnRolePolicyPropertyDsl.() -> Unit = {}):
      CfnRole.PolicyProperty {
    val builder = CfnRolePolicyPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnRoleProps(block: CfnRolePropsDsl.() -> Unit = {}): CfnRoleProps {
    val builder = CfnRolePropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnSAMLProvider(
    scope: Construct,
    id: String,
    block: CfnSAMLProviderDsl.() -> Unit = {},
  ): CfnSAMLProvider {
    val builder = CfnSAMLProviderDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnSAMLProviderProps(block: CfnSAMLProviderPropsDsl.() -> Unit = {}):
      CfnSAMLProviderProps {
    val builder = CfnSAMLProviderPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnServerCertificate(
    scope: Construct,
    id: String,
    block: CfnServerCertificateDsl.() -> Unit = {},
  ): CfnServerCertificate {
    val builder = CfnServerCertificateDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnServerCertificateProps(block: CfnServerCertificatePropsDsl.() -> Unit = {}):
      CfnServerCertificateProps {
    val builder = CfnServerCertificatePropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnServiceLinkedRole(
    scope: Construct,
    id: String,
    block: CfnServiceLinkedRoleDsl.() -> Unit = {},
  ): CfnServiceLinkedRole {
    val builder = CfnServiceLinkedRoleDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnServiceLinkedRoleProps(block: CfnServiceLinkedRolePropsDsl.() -> Unit = {}):
      CfnServiceLinkedRoleProps {
    val builder = CfnServiceLinkedRolePropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnUser(
    scope: Construct,
    id: String,
    block: CfnUserDsl.() -> Unit = {},
  ): CfnUser {
    val builder = CfnUserDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnUserLoginProfileProperty(block: CfnUserLoginProfilePropertyDsl.() -> Unit =
      {}): CfnUser.LoginProfileProperty {
    val builder = CfnUserLoginProfilePropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnUserPolicyProperty(block: CfnUserPolicyPropertyDsl.() -> Unit = {}):
      CfnUser.PolicyProperty {
    val builder = CfnUserPolicyPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnUserProps(block: CfnUserPropsDsl.() -> Unit = {}): CfnUserProps {
    val builder = CfnUserPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnUserToGroupAddition(
    scope: Construct,
    id: String,
    block: CfnUserToGroupAdditionDsl.() -> Unit = {},
  ): CfnUserToGroupAddition {
    val builder = CfnUserToGroupAdditionDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnUserToGroupAdditionProps(block: CfnUserToGroupAdditionPropsDsl.() -> Unit =
      {}): CfnUserToGroupAdditionProps {
    val builder = CfnUserToGroupAdditionPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnVirtualMFADevice(
    scope: Construct,
    id: String,
    block: CfnVirtualMFADeviceDsl.() -> Unit = {},
  ): CfnVirtualMFADevice {
    val builder = CfnVirtualMFADeviceDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnVirtualMFADeviceProps(block: CfnVirtualMFADevicePropsDsl.() -> Unit = {}):
      CfnVirtualMFADeviceProps {
    val builder = CfnVirtualMFADevicePropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun commonGrantOptions(block: CommonGrantOptionsDsl.() -> Unit = {}):
      CommonGrantOptions {
    val builder = CommonGrantOptionsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun customizeRolesOptions(block: CustomizeRolesOptionsDsl.() -> Unit = {}):
      CustomizeRolesOptions {
    val builder = CustomizeRolesOptionsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun fromRoleArnOptions(block: FromRoleArnOptionsDsl.() -> Unit = {}):
      FromRoleArnOptions {
    val builder = FromRoleArnOptionsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun fromRoleNameOptions(block: FromRoleNameOptionsDsl.() -> Unit = {}):
      FromRoleNameOptions {
    val builder = FromRoleNameOptionsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun grantOnPrincipalAndResourceOptions(block: GrantOnPrincipalAndResourceOptionsDsl.() -> Unit
      = {}): GrantOnPrincipalAndResourceOptions {
    val builder = GrantOnPrincipalAndResourceOptionsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun grantOnPrincipalOptions(block: GrantOnPrincipalOptionsDsl.() -> Unit = {}):
      GrantOnPrincipalOptions {
    val builder = GrantOnPrincipalOptionsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun grantWithResourceOptions(block: GrantWithResourceOptionsDsl.() -> Unit = {}):
      GrantWithResourceOptions {
    val builder = GrantWithResourceOptionsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun group(
    scope: Construct,
    id: String,
    block: GroupDsl.() -> Unit = {},
  ): Group {
    val builder = GroupDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  public inline fun groupProps(block: GroupPropsDsl.() -> Unit = {}): GroupProps {
    val builder = GroupPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun lazyRole(
    scope: Construct,
    id: String,
    block: LazyRoleDsl.() -> Unit = {},
  ): LazyRole {
    val builder = LazyRoleDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  public inline fun lazyRoleProps(block: LazyRolePropsDsl.() -> Unit = {}): LazyRoleProps {
    val builder = LazyRolePropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun managedPolicy(
    scope: Construct,
    id: String,
    block: ManagedPolicyDsl.() -> Unit = {},
  ): ManagedPolicy {
    val builder = ManagedPolicyDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  public inline fun managedPolicyProps(block: ManagedPolicyPropsDsl.() -> Unit = {}):
      ManagedPolicyProps {
    val builder = ManagedPolicyPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun openIdConnectProvider(
    scope: Construct,
    id: String,
    block: OpenIdConnectProviderDsl.() -> Unit = {},
  ): OpenIdConnectProvider {
    val builder = OpenIdConnectProviderDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  public inline fun openIdConnectProviderProps(block: OpenIdConnectProviderPropsDsl.() -> Unit =
      {}): OpenIdConnectProviderProps {
    val builder = OpenIdConnectProviderPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun policy(
    scope: Construct,
    id: String,
    block: PolicyDsl.() -> Unit = {},
  ): Policy {
    val builder = PolicyDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  public inline fun policyDocument(block: PolicyDocumentDsl.() -> Unit = {}): PolicyDocument {
    val builder = PolicyDocumentDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun policyDocumentProps(block: PolicyDocumentPropsDsl.() -> Unit = {}):
      PolicyDocumentProps {
    val builder = PolicyDocumentPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun policyProps(block: PolicyPropsDsl.() -> Unit = {}): PolicyProps {
    val builder = PolicyPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun policyStatement(block: PolicyStatementDsl.() -> Unit = {}): PolicyStatement {
    val builder = PolicyStatementDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun policyStatementProps(block: PolicyStatementPropsDsl.() -> Unit = {}):
      PolicyStatementProps {
    val builder = PolicyStatementPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun role(
    scope: Construct,
    id: String,
    block: RoleDsl.() -> Unit = {},
  ): Role {
    val builder = RoleDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  public inline fun roleProps(block: RolePropsDsl.() -> Unit = {}): RoleProps {
    val builder = RolePropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun samlProvider(
    scope: Construct,
    id: String,
    block: SamlProviderDsl.() -> Unit = {},
  ): SamlProvider {
    val builder = SamlProviderDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  public inline fun samlProviderProps(block: SamlProviderPropsDsl.() -> Unit = {}):
      SamlProviderProps {
    val builder = SamlProviderPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun servicePrincipal(arg0: String, block: ServicePrincipalDsl.() -> Unit = {}):
      ServicePrincipal {
    val builder = ServicePrincipalDsl(arg0)
    builder.apply(block)
    return builder.build()
  }

  public inline fun servicePrincipalOpts(block: ServicePrincipalOptsDsl.() -> Unit = {}):
      ServicePrincipalOpts {
    val builder = ServicePrincipalOptsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun unknownPrincipal(block: UnknownPrincipalDsl.() -> Unit = {}): UnknownPrincipal {
    val builder = UnknownPrincipalDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun unknownPrincipalProps(block: UnknownPrincipalPropsDsl.() -> Unit = {}):
      UnknownPrincipalProps {
    val builder = UnknownPrincipalPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun user(
    scope: Construct,
    id: String,
    block: UserDsl.() -> Unit = {},
  ): User {
    val builder = UserDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  public inline fun userAttributes(block: UserAttributesDsl.() -> Unit = {}): UserAttributes {
    val builder = UserAttributesDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun userProps(block: UserPropsDsl.() -> Unit = {}): UserProps {
    val builder = UserPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun withoutPolicyUpdatesOptions(block: WithoutPolicyUpdatesOptionsDsl.() -> Unit =
      {}): WithoutPolicyUpdatesOptions {
    val builder = WithoutPolicyUpdatesOptionsDsl()
    builder.apply(block)
    return builder.build()
  }
}
