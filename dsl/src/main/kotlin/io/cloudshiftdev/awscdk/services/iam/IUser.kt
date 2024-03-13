package io.cloudshiftdev.awscdk.services.iam

import io.cloudshiftdev.awscdk.RemovalPolicy
import io.cloudshiftdev.awscdk.ResourceEnvironment
import io.cloudshiftdev.awscdk.Stack
import io.cloudshiftdev.constructs.Node
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName

public interface IUser : IIdentity {
  public fun addToGroup(arg0: IGroup)

  public fun userArn(): String

  public fun userName(): String

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.iam.IUser,
  ) : IUser {
    public override fun addManagedPolicy(arg0: IManagedPolicy) {
      unwrap(this).addManagedPolicy(arg0.let(IManagedPolicy::unwrap))
    }

    public override fun addToGroup(arg0: IGroup) {
      unwrap(this).addToGroup(arg0.let(IGroup::unwrap))
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

    public override fun grantPrincipal(): IPrincipal =
        unwrap(this).getGrantPrincipal().let(IPrincipal::wrap)

    public override fun node(): Node = unwrap(this).getNode().let(Node::wrap)

    public override fun policyFragment(): PrincipalPolicyFragment =
        unwrap(this).getPolicyFragment().let(PrincipalPolicyFragment::wrap)

    public override fun principalAccount(): String? = unwrap(this).getPrincipalAccount()

    public override fun stack(): Stack = unwrap(this).getStack().let(Stack::wrap)

    public override fun userArn(): String = unwrap(this).getUserArn()

    public override fun userName(): String = unwrap(this).getUserName()
  }

  public companion object {
    init {

    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.iam.IUser): IUser =
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: IUser): software.amazon.awscdk.services.iam.IUser = (wrapped as
        Wrapper).cdkObject
  }
}
