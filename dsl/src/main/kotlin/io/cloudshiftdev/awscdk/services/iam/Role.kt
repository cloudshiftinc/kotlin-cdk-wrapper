package io.cloudshiftdev.awscdk.services.iam

import io.cloudshiftdev.awscdk.Duration
import io.cloudshiftdev.awscdk.Resource
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.Map
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class Role internal constructor(
  private val cdkObject: software.amazon.awscdk.services.iam.Role,
) : Resource(cdkObject), IRole {
  public override fun addManagedPolicy(policy: IManagedPolicy) {
    unwrap(this).addManagedPolicy(policy.let(IManagedPolicy::unwrap))
  }

  public open fun addToPolicy(statement: PolicyStatement): Boolean =
      unwrap(this).addToPolicy(statement.let(PolicyStatement::unwrap))

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("6148e52b961e7728ba57cdabfd202385d97a77f6d5da33adb746c32e8c75340f")
  public open fun addToPolicy(statement: PolicyStatement.Builder.() -> Unit): Boolean =
      addToPolicy(PolicyStatement(statement))

  public override fun addToPrincipalPolicy(statement: PolicyStatement): AddToPrincipalPolicyResult =
      unwrap(this).addToPrincipalPolicy(statement.let(PolicyStatement::unwrap)).let(AddToPrincipalPolicyResult::wrap)

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("e5a2b0fec5c17722d0dc719c3fd27344bee07d931f9f715b331523f4aadc0661")
  public override fun addToPrincipalPolicy(statement: PolicyStatement.Builder.() -> Unit):
      AddToPrincipalPolicyResult = addToPrincipalPolicy(PolicyStatement(statement))

  public override fun assumeRoleAction(): String = unwrap(this).getAssumeRoleAction()

  public open fun assumeRolePolicy(): PolicyDocument? =
      unwrap(this).getAssumeRolePolicy()?.let(PolicyDocument::wrap)

  public override fun attachInlinePolicy(policy: Policy) {
    unwrap(this).attachInlinePolicy(policy.let(Policy::unwrap))
  }

  public override fun grant(grantee: IPrincipal, actions: String): Grant =
      unwrap(this).grant(grantee.let(IPrincipal::unwrap), actions).let(Grant::wrap)

  public override fun grantAssumeRole(identity: IPrincipal): Grant =
      unwrap(this).grantAssumeRole(identity.let(IPrincipal::unwrap)).let(Grant::wrap)

  public override fun grantPassRole(identity: IPrincipal): Grant =
      unwrap(this).grantPassRole(identity.let(IPrincipal::unwrap)).let(Grant::wrap)

  public override fun grantPrincipal(): IPrincipal =
      unwrap(this).getGrantPrincipal().let(IPrincipal::wrap)

  public open fun permissionsBoundary(): IManagedPolicy? =
      unwrap(this).getPermissionsBoundary()?.let(IManagedPolicy::wrap)

  public override fun policyFragment(): PrincipalPolicyFragment =
      unwrap(this).getPolicyFragment().let(PrincipalPolicyFragment::wrap)

  public override fun principalAccount(): String? = unwrap(this).getPrincipalAccount()

  public override fun roleArn(): String = unwrap(this).getRoleArn()

  public open fun roleId(): String = unwrap(this).getRoleId()

  public override fun roleName(): String = unwrap(this).getRoleName()

  public open fun withoutPolicyUpdates(): IRole =
      unwrap(this).withoutPolicyUpdates().let(IRole::wrap)

  public open fun withoutPolicyUpdates(options: WithoutPolicyUpdatesOptions): IRole =
      unwrap(this).withoutPolicyUpdates(options.let(WithoutPolicyUpdatesOptions::unwrap)).let(IRole::wrap)

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("df44f126146b57b381f4b6b389c40bffee2f6d872ff81d636b47bab7a910fe1f")
  public open fun withoutPolicyUpdates(options: WithoutPolicyUpdatesOptions.Builder.() -> Unit):
      IRole = withoutPolicyUpdates(WithoutPolicyUpdatesOptions(options))

  public interface Builder {
    public fun assumedBy(assumedBy: IPrincipal)

    public fun description(description: String)

    public fun externalIds(externalIds: List<String>)

    public fun externalIds(vararg externalIds: String)

    public fun inlinePolicies(inlinePolicies: Map<String, PolicyDocument>)

    public fun managedPolicies(managedPolicies: List<IManagedPolicy>)

    public fun managedPolicies(vararg managedPolicies: IManagedPolicy)

    public fun maxSessionDuration(maxSessionDuration: Duration)

    public fun path(path: String)

    public fun permissionsBoundary(permissionsBoundary: IManagedPolicy)

    public fun roleName(roleName: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.iam.Role.Builder =
        software.amazon.awscdk.services.iam.Role.Builder.create(scope, id)

    override fun assumedBy(assumedBy: IPrincipal) {
      cdkBuilder.assumedBy(assumedBy.let(IPrincipal::unwrap))
    }

    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    override fun externalIds(externalIds: List<String>) {
      cdkBuilder.externalIds(externalIds)
    }

    override fun externalIds(vararg externalIds: String): Unit = externalIds(externalIds.toList())

    override fun inlinePolicies(inlinePolicies: Map<String, PolicyDocument>) {
      cdkBuilder.inlinePolicies(inlinePolicies.mapValues{PolicyDocument.unwrap(it.value)})
    }

    override fun managedPolicies(managedPolicies: List<IManagedPolicy>) {
      cdkBuilder.managedPolicies(managedPolicies.map(IManagedPolicy::unwrap))
    }

    override fun managedPolicies(vararg managedPolicies: IManagedPolicy): Unit =
        managedPolicies(managedPolicies.toList())

    override fun maxSessionDuration(maxSessionDuration: Duration) {
      cdkBuilder.maxSessionDuration(maxSessionDuration.let(Duration::unwrap))
    }

    override fun path(path: String) {
      cdkBuilder.path(path)
    }

    override fun permissionsBoundary(permissionsBoundary: IManagedPolicy) {
      cdkBuilder.permissionsBoundary(permissionsBoundary.let(IManagedPolicy::unwrap))
    }

    override fun roleName(roleName: String) {
      cdkBuilder.roleName(roleName)
    }

    public fun build(): software.amazon.awscdk.services.iam.Role = cdkBuilder.build()
  }

  public companion object {
    public open fun customizeRoles(scope: CloudshiftdevConstructsConstruct) {
      software.amazon.awscdk.services.iam.Role.customizeRoles(scope.let(CloudshiftdevConstructsConstruct::unwrap))
    }

    public open fun customizeRoles(scope: CloudshiftdevConstructsConstruct,
        options: CustomizeRolesOptions) {
      software.amazon.awscdk.services.iam.Role.customizeRoles(scope.let(CloudshiftdevConstructsConstruct::unwrap),
          options.let(CustomizeRolesOptions::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("375a651383dd6f9b4f2086269a6db40f6b1f740e25e369749b93877413fc682f")
    public open fun customizeRoles(scope: CloudshiftdevConstructsConstruct,
        options: CustomizeRolesOptions.Builder.() -> Unit): Unit = customizeRoles(scope,
        CustomizeRolesOptions(options))

    public open fun fromRoleArn(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      roleArn: String,
    ): IRole =
        software.amazon.awscdk.services.iam.Role.fromRoleArn(scope.let(CloudshiftdevConstructsConstruct::unwrap),
        id, roleArn).let(IRole::wrap)

    public open fun fromRoleArn(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      roleArn: String,
      options: FromRoleArnOptions,
    ): IRole =
        software.amazon.awscdk.services.iam.Role.fromRoleArn(scope.let(CloudshiftdevConstructsConstruct::unwrap),
        id, roleArn, options.let(FromRoleArnOptions::unwrap)).let(IRole::wrap)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("a4fb31fe9dd1e72e4b8ca587f24946f2fdf30b789ba5dd86492388cc8e4a5a11")
    public open fun fromRoleArn(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      roleArn: String,
      options: FromRoleArnOptions.Builder.() -> Unit,
    ): IRole = fromRoleArn(scope, id, roleArn, FromRoleArnOptions(options))

    public open fun fromRoleName(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      roleName: String,
    ): IRole =
        software.amazon.awscdk.services.iam.Role.fromRoleName(scope.let(CloudshiftdevConstructsConstruct::unwrap),
        id, roleName).let(IRole::wrap)

    public open fun fromRoleName(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      roleName: String,
      options: FromRoleNameOptions,
    ): IRole =
        software.amazon.awscdk.services.iam.Role.fromRoleName(scope.let(CloudshiftdevConstructsConstruct::unwrap),
        id, roleName, options.let(FromRoleNameOptions::unwrap)).let(IRole::wrap)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("75fdf9c6375dbd7430f3304bb8fd3be42333a5b7701b06ab210e40c20e6d1d3a")
    public open fun fromRoleName(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      roleName: String,
      options: FromRoleNameOptions.Builder.() -> Unit,
    ): IRole = fromRoleName(scope, id, roleName, FromRoleNameOptions(options))

    public open fun isRole(x: Any): Boolean = software.amazon.awscdk.services.iam.Role.isRole(x)

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): Role {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return Role(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.iam.Role): Role = Role(cdkObject)

    internal fun unwrap(wrapped: Role): software.amazon.awscdk.services.iam.Role = wrapped.cdkObject
  }
}
