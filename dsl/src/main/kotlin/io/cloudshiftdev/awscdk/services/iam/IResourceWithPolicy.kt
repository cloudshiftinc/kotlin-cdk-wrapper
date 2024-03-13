package io.cloudshiftdev.awscdk.services.iam

import io.cloudshiftdev.awscdk.IResource
import io.cloudshiftdev.awscdk.RemovalPolicy
import io.cloudshiftdev.awscdk.ResourceEnvironment
import io.cloudshiftdev.awscdk.Stack
import io.cloudshiftdev.constructs.Node
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName

public interface IResourceWithPolicy : IResource {
  public fun addToResourcePolicy(arg0: PolicyStatement): AddToResourcePolicyResult

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("b93f8258425594b02debe63f0c120f198512d8431f5ae67b7fb7780e34fcbae2")
  public fun addToResourcePolicy(arg0: PolicyStatement.Builder.() -> Unit):
      AddToResourcePolicyResult

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.iam.IResourceWithPolicy,
  ) : IResourceWithPolicy {
    public override fun addToResourcePolicy(arg0: PolicyStatement): AddToResourcePolicyResult =
        unwrap(this).addToResourcePolicy(arg0.let(PolicyStatement::unwrap)).let(AddToResourcePolicyResult::wrap)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("b93f8258425594b02debe63f0c120f198512d8431f5ae67b7fb7780e34fcbae2")
    public override fun addToResourcePolicy(arg0: PolicyStatement.Builder.() -> Unit):
        AddToResourcePolicyResult = addToResourcePolicy(PolicyStatement(arg0))

    public override fun applyRemovalPolicy(arg0: RemovalPolicy) {
      unwrap(this).applyRemovalPolicy(arg0.let(RemovalPolicy::unwrap))
    }

    public override fun env(): ResourceEnvironment =
        unwrap(this).getEnv().let(ResourceEnvironment::wrap)

    public override fun node(): Node = unwrap(this).getNode().let(Node::wrap)

    public override fun stack(): Stack = unwrap(this).getStack().let(Stack::wrap)
  }

  public companion object {
    init {

    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.iam.IResourceWithPolicy):
        IResourceWithPolicy = Wrapper(cdkObject)

    internal fun unwrap(wrapped: IResourceWithPolicy):
        software.amazon.awscdk.services.iam.IResourceWithPolicy = (wrapped as Wrapper).cdkObject
  }
}
