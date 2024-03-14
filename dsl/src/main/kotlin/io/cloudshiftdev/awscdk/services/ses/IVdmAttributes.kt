package io.cloudshiftdev.awscdk.services.ses

import io.cloudshiftdev.awscdk.IResource
import io.cloudshiftdev.awscdk.RemovalPolicy
import io.cloudshiftdev.awscdk.ResourceEnvironment
import io.cloudshiftdev.awscdk.Stack
import io.cloudshiftdev.constructs.Node
import kotlin.String

public interface IVdmAttributes : IResource {
  public fun vdmAttributesName(): String

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.ses.IVdmAttributes,
  ) : IVdmAttributes {
    override fun applyRemovalPolicy(arg0: RemovalPolicy) {
      unwrap(this).applyRemovalPolicy(arg0.let(RemovalPolicy::unwrap))
    }

    override fun env(): ResourceEnvironment = unwrap(this).getEnv().let(ResourceEnvironment::wrap)

    override fun node(): Node = unwrap(this).getNode().let(Node::wrap)

    override fun stack(): Stack = unwrap(this).getStack().let(Stack::wrap)

    override fun vdmAttributesName(): String = unwrap(this).getVdmAttributesName()
  }

  public companion object {
    init {

    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ses.IVdmAttributes): IVdmAttributes
        = Wrapper(cdkObject)

    internal fun unwrap(wrapped: IVdmAttributes): software.amazon.awscdk.services.ses.IVdmAttributes
        = (wrapped as Wrapper).cdkObject
  }
}
