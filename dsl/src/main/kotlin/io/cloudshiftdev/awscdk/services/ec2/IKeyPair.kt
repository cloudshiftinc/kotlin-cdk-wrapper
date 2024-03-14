package io.cloudshiftdev.awscdk.services.ec2

import io.cloudshiftdev.awscdk.IResource
import io.cloudshiftdev.awscdk.RemovalPolicy
import io.cloudshiftdev.awscdk.ResourceEnvironment
import io.cloudshiftdev.awscdk.Stack
import io.cloudshiftdev.constructs.Node
import kotlin.String

public interface IKeyPair : IResource {
  public fun keyPairName(): String

  public fun type(): KeyPairType? = unwrap(this).getType()?.let(KeyPairType::wrap)

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.ec2.IKeyPair,
  ) : IKeyPair {
    override fun applyRemovalPolicy(arg0: RemovalPolicy) {
      unwrap(this).applyRemovalPolicy(arg0.let(RemovalPolicy::unwrap))
    }

    override fun env(): ResourceEnvironment = unwrap(this).getEnv().let(ResourceEnvironment::wrap)

    override fun keyPairName(): String = unwrap(this).getKeyPairName()

    override fun node(): Node = unwrap(this).getNode().let(Node::wrap)

    override fun stack(): Stack = unwrap(this).getStack().let(Stack::wrap)

    override fun type(): KeyPairType? = unwrap(this).getType()?.let(KeyPairType::wrap)
  }

  public companion object {
    init {

    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ec2.IKeyPair): IKeyPair =
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: IKeyPair): software.amazon.awscdk.services.ec2.IKeyPair = (wrapped
        as Wrapper).cdkObject
  }
}
