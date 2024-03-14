package io.cloudshiftdev.awscdk.services.iam

import io.cloudshiftdev.awscdk.IResource
import io.cloudshiftdev.awscdk.RemovalPolicy
import io.cloudshiftdev.awscdk.ResourceEnvironment
import io.cloudshiftdev.awscdk.Stack
import io.cloudshiftdev.constructs.Node
import kotlin.String

public interface IInstanceProfile : IResource {
  public fun instanceProfileArn(): String

  public fun instanceProfileName(): String

  public fun role(): IRole? = unwrap(this).getRole()?.let(IRole::wrap)

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.iam.IInstanceProfile,
  ) : IInstanceProfile {
    public override fun applyRemovalPolicy(arg0: RemovalPolicy) {
      unwrap(this).applyRemovalPolicy(arg0.let(RemovalPolicy::unwrap))
    }

    public override fun env(): ResourceEnvironment =
        unwrap(this).getEnv().let(ResourceEnvironment::wrap)

    public override fun instanceProfileArn(): String = unwrap(this).getInstanceProfileArn()

    public override fun instanceProfileName(): String = unwrap(this).getInstanceProfileName()

    public override fun node(): Node = unwrap(this).getNode().let(Node::wrap)

    public override fun role(): IRole? = unwrap(this).getRole()?.let(IRole::wrap)

    public override fun stack(): Stack = unwrap(this).getStack().let(Stack::wrap)
  }

  public companion object {
    init {

    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.iam.IInstanceProfile):
        IInstanceProfile = Wrapper(cdkObject)

    internal fun unwrap(wrapped: IInstanceProfile):
        software.amazon.awscdk.services.iam.IInstanceProfile = (wrapped as Wrapper).cdkObject
  }
}
