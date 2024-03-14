package io.cloudshiftdev.awscdk.services.iam

import io.cloudshiftdev.awscdk.Duration
import io.cloudshiftdev.awscdk.Resource
import kotlin.Boolean
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.Map
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class LazyRole internal constructor(
  private val cdkObject: software.amazon.awscdk.services.iam.LazyRole,
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

  public override fun attachInlinePolicy(policy: Policy) {
    unwrap(this).attachInlinePolicy(policy.let(Policy::unwrap))
  }

  public override fun grant(identity: IPrincipal, actions: String): Grant =
      unwrap(this).grant(identity.let(IPrincipal::unwrap), actions).let(Grant::wrap)

  public override fun grantAssumeRole(identity: IPrincipal): Grant =
      unwrap(this).grantAssumeRole(identity.let(IPrincipal::unwrap)).let(Grant::wrap)

  public override fun grantPassRole(identity: IPrincipal): Grant =
      unwrap(this).grantPassRole(identity.let(IPrincipal::unwrap)).let(Grant::wrap)

  public override fun grantPrincipal(): IPrincipal =
      unwrap(this).getGrantPrincipal().let(IPrincipal::wrap)

  public override fun policyFragment(): PrincipalPolicyFragment =
      unwrap(this).getPolicyFragment().let(PrincipalPolicyFragment::wrap)

  public override fun principalAccount(): String? = unwrap(this).getPrincipalAccount()

  public override fun roleArn(): String = unwrap(this).getRoleArn()

  public open fun roleId(): String = unwrap(this).getRoleId()

  public override fun roleName(): String = unwrap(this).getRoleName()

  public interface Builder {
    public fun assumedBy(assumedBy: IPrincipal) {
    }

    public fun description(description: String) {
    }

    public fun externalIds(externalIds: List<String>) {
    }

    public fun inlinePolicies(inlinePolicies: Map<String, PolicyDocument>) {
    }

    public fun managedPolicies(managedPolicies: List<IManagedPolicy>) {
    }

    public fun maxSessionDuration(maxSessionDuration: Duration) {
    }

    public fun path(path: String) {
    }

    public fun permissionsBoundary(permissionsBoundary: IManagedPolicy) {
    }

    public fun roleName(roleName: String) {
    }
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.iam.LazyRole.Builder =
        software.amazon.awscdk.services.iam.LazyRole.Builder.create(scope, id)

    public override fun assumedBy(assumedBy: IPrincipal) {
      cdkBuilder.assumedBy(assumedBy.let(IPrincipal::unwrap))
    }

    public override fun description(description: String) {
      cdkBuilder.description(description)
    }

    public override fun externalIds(externalIds: List<String>) {
      cdkBuilder.externalIds(externalIds)
    }

    public override fun inlinePolicies(inlinePolicies: Map<String, PolicyDocument>) {
      cdkBuilder.inlinePolicies(inlinePolicies.mapValues { PolicyDocument.unwrap(it.value)})
    }

    public override fun managedPolicies(managedPolicies: List<IManagedPolicy>) {
      cdkBuilder.managedPolicies(managedPolicies.map(IManagedPolicy::unwrap))
    }

    public override fun maxSessionDuration(maxSessionDuration: Duration) {
      cdkBuilder.maxSessionDuration(maxSessionDuration.let(Duration::unwrap))
    }

    public override fun path(path: String) {
      cdkBuilder.path(path)
    }

    public override fun permissionsBoundary(permissionsBoundary: IManagedPolicy) {
      cdkBuilder.permissionsBoundary(permissionsBoundary.let(IManagedPolicy::unwrap))
    }

    public override fun roleName(roleName: String) {
      cdkBuilder.roleName(roleName)
    }

    public fun build(): software.amazon.awscdk.services.iam.LazyRole = cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): LazyRole {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return LazyRole(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.iam.LazyRole): LazyRole =
        LazyRole(cdkObject)

    internal fun unwrap(wrapped: LazyRole): software.amazon.awscdk.services.iam.LazyRole =
        wrapped.cdkObject
  }
}
