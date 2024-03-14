package io.cloudshiftdev.awscdk.services.iam

import io.cloudshiftdev.awscdk.IResource
import io.cloudshiftdev.awscdk.RemovalPolicy
import io.cloudshiftdev.awscdk.ResourceEnvironment
import io.cloudshiftdev.awscdk.SecretValue
import io.cloudshiftdev.awscdk.Stack
import io.cloudshiftdev.constructs.Node
import kotlin.String

public interface IAccessKey : IResource {
  public fun accessKeyId(): String

  public fun secretAccessKey(): SecretValue

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.iam.IAccessKey,
  ) : IAccessKey {
    public override fun accessKeyId(): String = unwrap(this).getAccessKeyId()

    public override fun applyRemovalPolicy(arg0: RemovalPolicy) {
      unwrap(this).applyRemovalPolicy(arg0.let(RemovalPolicy::unwrap))
    }

    public override fun env(): ResourceEnvironment =
        unwrap(this).getEnv().let(ResourceEnvironment::wrap)

    public override fun node(): Node = unwrap(this).getNode().let(Node::wrap)

    public override fun secretAccessKey(): SecretValue =
        unwrap(this).getSecretAccessKey().let(SecretValue::wrap)

    public override fun stack(): Stack = unwrap(this).getStack().let(Stack::wrap)
  }

  public companion object {
    init {

    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.iam.IAccessKey): IAccessKey =
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: IAccessKey): software.amazon.awscdk.services.iam.IAccessKey =
        (wrapped as Wrapper).cdkObject
  }
}
