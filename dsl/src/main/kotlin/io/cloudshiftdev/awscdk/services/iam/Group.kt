package io.cloudshiftdev.awscdk.services.iam

import io.cloudshiftdev.awscdk.Resource
import kotlin.Boolean
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class Group internal constructor(
  private val cdkObject: software.amazon.awscdk.services.iam.Group,
) : Resource(cdkObject), IGroup {
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

  public open fun addUser(user: IUser) {
    unwrap(this).addUser(user.let(IUser::unwrap))
  }

  public override fun assumeRoleAction(): String = unwrap(this).getAssumeRoleAction()

  public override fun attachInlinePolicy(policy: Policy) {
    unwrap(this).attachInlinePolicy(policy.let(Policy::unwrap))
  }

  public override fun grantPrincipal(): IPrincipal =
      unwrap(this).getGrantPrincipal().let(IPrincipal::wrap)

  public override fun groupArn(): String = unwrap(this).getGroupArn()

  public override fun groupName(): String = unwrap(this).getGroupName()

  public override fun policyFragment(): PrincipalPolicyFragment =
      unwrap(this).getPolicyFragment().let(PrincipalPolicyFragment::wrap)

  public override fun principalAccount(): String? = unwrap(this).getPrincipalAccount()

  public interface Builder {
    public fun groupName(groupName: String)

    public fun managedPolicies(managedPolicies: List<IManagedPolicy>)

    public fun managedPolicies(vararg managedPolicies: IManagedPolicy)

    public fun path(path: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.iam.Group.Builder =
        software.amazon.awscdk.services.iam.Group.Builder.create(scope, id)

    override fun groupName(groupName: String) {
      cdkBuilder.groupName(groupName)
    }

    override fun managedPolicies(managedPolicies: List<IManagedPolicy>) {
      cdkBuilder.managedPolicies(managedPolicies.map(IManagedPolicy::unwrap))
    }

    override fun managedPolicies(vararg managedPolicies: IManagedPolicy): Unit =
        managedPolicies(managedPolicies.toList())

    override fun path(path: String) {
      cdkBuilder.path(path)
    }

    public fun build(): software.amazon.awscdk.services.iam.Group = cdkBuilder.build()
  }

  public companion object {
    public open fun fromGroupArn(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      groupArn: String,
    ): IGroup =
        software.amazon.awscdk.services.iam.Group.fromGroupArn(scope.let(CloudshiftdevConstructsConstruct::unwrap),
        id, groupArn).let(IGroup::wrap)

    public open fun fromGroupName(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      groupName: String,
    ): IGroup =
        software.amazon.awscdk.services.iam.Group.fromGroupName(scope.let(CloudshiftdevConstructsConstruct::unwrap),
        id, groupName).let(IGroup::wrap)

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): Group {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return Group(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.iam.Group): Group =
        Group(cdkObject)

    internal fun unwrap(wrapped: Group): software.amazon.awscdk.services.iam.Group =
        wrapped.cdkObject
  }
}
