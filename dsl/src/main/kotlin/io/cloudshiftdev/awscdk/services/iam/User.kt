package io.cloudshiftdev.awscdk.services.iam

import io.cloudshiftdev.awscdk.Resource
import io.cloudshiftdev.awscdk.SecretValue
import kotlin.Boolean
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class User internal constructor(
  private val cdkObject: software.amazon.awscdk.services.iam.User,
) : Resource(cdkObject), IIdentity, IUser {
  public override fun addManagedPolicy(policy: IManagedPolicy) {
    unwrap(this).addManagedPolicy(policy.let(IManagedPolicy::unwrap))
  }

  public override fun addToGroup(group: IGroup) {
    unwrap(this).addToGroup(group.let(IGroup::unwrap))
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

  public override fun attachInlinePolicy(policy: Policy) {
    unwrap(this).attachInlinePolicy(policy.let(Policy::unwrap))
  }

  public override fun grantPrincipal(): IPrincipal =
      unwrap(this).getGrantPrincipal().let(IPrincipal::wrap)

  public open fun permissionsBoundary(): IManagedPolicy? =
      unwrap(this).getPermissionsBoundary()?.let(IManagedPolicy::wrap)

  public override fun policyFragment(): PrincipalPolicyFragment =
      unwrap(this).getPolicyFragment().let(PrincipalPolicyFragment::wrap)

  public override fun principalAccount(): String? = unwrap(this).getPrincipalAccount()

  public override fun userArn(): String = unwrap(this).getUserArn()

  public override fun userName(): String = unwrap(this).getUserName()

  public interface Builder {
    public fun groups(groups: List<IGroup>)

    public fun groups(vararg groups: IGroup)

    public fun managedPolicies(managedPolicies: List<IManagedPolicy>)

    public fun managedPolicies(vararg managedPolicies: IManagedPolicy)

    public fun password(password: SecretValue)

    public fun passwordResetRequired(passwordResetRequired: Boolean)

    public fun path(path: String)

    public fun permissionsBoundary(permissionsBoundary: IManagedPolicy)

    public fun userName(userName: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.iam.User.Builder =
        software.amazon.awscdk.services.iam.User.Builder.create(scope, id)

    override fun groups(groups: List<IGroup>) {
      cdkBuilder.groups(groups.map(IGroup::unwrap))
    }

    override fun groups(vararg groups: IGroup): Unit = groups(groups.toList())

    override fun managedPolicies(managedPolicies: List<IManagedPolicy>) {
      cdkBuilder.managedPolicies(managedPolicies.map(IManagedPolicy::unwrap))
    }

    override fun managedPolicies(vararg managedPolicies: IManagedPolicy): Unit =
        managedPolicies(managedPolicies.toList())

    override fun password(password: SecretValue) {
      cdkBuilder.password(password.let(SecretValue::unwrap))
    }

    override fun passwordResetRequired(passwordResetRequired: Boolean) {
      cdkBuilder.passwordResetRequired(passwordResetRequired)
    }

    override fun path(path: String) {
      cdkBuilder.path(path)
    }

    override fun permissionsBoundary(permissionsBoundary: IManagedPolicy) {
      cdkBuilder.permissionsBoundary(permissionsBoundary.let(IManagedPolicy::unwrap))
    }

    override fun userName(userName: String) {
      cdkBuilder.userName(userName)
    }

    public fun build(): software.amazon.awscdk.services.iam.User = cdkBuilder.build()
  }

  public companion object {
    public open fun fromUserArn(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      userArn: String,
    ): IUser =
        software.amazon.awscdk.services.iam.User.fromUserArn(scope.let(CloudshiftdevConstructsConstruct::unwrap),
        id, userArn).let(IUser::wrap)

    public open fun fromUserAttributes(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      attrs: UserAttributes,
    ): IUser =
        software.amazon.awscdk.services.iam.User.fromUserAttributes(scope.let(CloudshiftdevConstructsConstruct::unwrap),
        id, attrs.let(UserAttributes::unwrap)).let(IUser::wrap)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("321ebf0b48716f7490762a7ac1e1728ff5e7fb51d9ed53e20e99d0c80a46bc9d")
    public open fun fromUserAttributes(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      attrs: UserAttributes.Builder.() -> Unit,
    ): IUser = fromUserAttributes(scope, id, UserAttributes(attrs))

    public open fun fromUserName(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      userName: String,
    ): IUser =
        software.amazon.awscdk.services.iam.User.fromUserName(scope.let(CloudshiftdevConstructsConstruct::unwrap),
        id, userName).let(IUser::wrap)

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): User {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return User(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.iam.User): User = User(cdkObject)

    internal fun unwrap(wrapped: User): software.amazon.awscdk.services.iam.User = wrapped.cdkObject
  }
}
