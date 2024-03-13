package io.cloudshiftdev.awscdk.services.iam

import io.cloudshiftdev.awscdk.RemovalPolicy
import io.cloudshiftdev.awscdk.ResourceEnvironment
import io.cloudshiftdev.awscdk.Stack
import io.cloudshiftdev.constructs.Node
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName

public interface IRole : IIdentity {
  public fun grant(arg0: IPrincipal, arg1: String): Grant

  public fun grantAssumeRole(arg0: IPrincipal): Grant

  public fun grantPassRole(arg0: IPrincipal): Grant

  public fun roleArn(): String

  public fun roleName(): String

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.iam.IRole,
  ) : IRole {
    public override fun addManagedPolicy(arg0: IManagedPolicy) {
      unwrap(this).addManagedPolicy(arg0.let(IManagedPolicy::unwrap))
    }

    public override fun addToPrincipalPolicy(arg0: PolicyStatement): AddToPrincipalPolicyResult =
        unwrap(this).addToPrincipalPolicy(arg0.let(PolicyStatement::unwrap)).let(AddToPrincipalPolicyResult::wrap)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("e5a2b0fec5c17722d0dc719c3fd27344bee07d931f9f715b331523f4aadc0661")
    public override fun addToPrincipalPolicy(arg0: PolicyStatement.Builder.() -> Unit):
        AddToPrincipalPolicyResult = addToPrincipalPolicy(PolicyStatement(arg0))

    public override fun applyRemovalPolicy(arg0: RemovalPolicy) {
      unwrap(this).applyRemovalPolicy(arg0.let(RemovalPolicy::unwrap))
    }

    public override fun assumeRoleAction(): String = unwrap(this).getAssumeRoleAction()

    public override fun attachInlinePolicy(arg0: Policy) {
      unwrap(this).attachInlinePolicy(arg0.let(Policy::unwrap))
    }

    public override fun env(): ResourceEnvironment =
        unwrap(this).getEnv().let(ResourceEnvironment::wrap)

    public override fun grant(arg0: IPrincipal, arg1: String): Grant =
        unwrap(this).grant(arg0.let(IPrincipal::unwrap), arg1).let(Grant::wrap)

    public override fun grantAssumeRole(arg0: IPrincipal): Grant =
        unwrap(this).grantAssumeRole(arg0.let(IPrincipal::unwrap)).let(Grant::wrap)

    public override fun grantPassRole(arg0: IPrincipal): Grant =
        unwrap(this).grantPassRole(arg0.let(IPrincipal::unwrap)).let(Grant::wrap)

    public override fun grantPrincipal(): IPrincipal =
        unwrap(this).getGrantPrincipal().let(IPrincipal::wrap)

    public override fun node(): Node = unwrap(this).getNode().let(Node::wrap)

    public override fun policyFragment(): PrincipalPolicyFragment =
        unwrap(this).getPolicyFragment().let(PrincipalPolicyFragment::wrap)

    public override fun principalAccount(): String? = unwrap(this).getPrincipalAccount()

    public override fun roleArn(): String = unwrap(this).getRoleArn()

    public override fun roleName(): String = unwrap(this).getRoleName()

    public override fun stack(): Stack = unwrap(this).getStack().let(Stack::wrap)
  }

  public companion object {
    init {

    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.iam.IRole): IRole =
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: IRole): software.amazon.awscdk.services.iam.IRole = (wrapped as
        Wrapper).cdkObject
  }
}
