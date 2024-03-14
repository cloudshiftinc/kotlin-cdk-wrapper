package io.cloudshiftdev.awscdk.services.lambda

import io.cloudshiftdev.awscdk.IResource
import io.cloudshiftdev.awscdk.RemovalPolicy
import io.cloudshiftdev.awscdk.ResourceEnvironment
import io.cloudshiftdev.awscdk.Stack
import io.cloudshiftdev.constructs.Node
import kotlin.String

public interface ICodeSigningConfig : IResource {
  public fun codeSigningConfigArn(): String

  public fun codeSigningConfigId(): String

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.lambda.ICodeSigningConfig,
  ) : ICodeSigningConfig {
    override fun applyRemovalPolicy(arg0: RemovalPolicy) {
      unwrap(this).applyRemovalPolicy(arg0.let(RemovalPolicy::unwrap))
    }

    override fun codeSigningConfigArn(): String = unwrap(this).getCodeSigningConfigArn()

    override fun codeSigningConfigId(): String = unwrap(this).getCodeSigningConfigId()

    override fun env(): ResourceEnvironment = unwrap(this).getEnv().let(ResourceEnvironment::wrap)

    override fun node(): Node = unwrap(this).getNode().let(Node::wrap)

    override fun stack(): Stack = unwrap(this).getStack().let(Stack::wrap)
  }

  public companion object {
    init {

    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.lambda.ICodeSigningConfig):
        ICodeSigningConfig = Wrapper(cdkObject)

    internal fun unwrap(wrapped: ICodeSigningConfig):
        software.amazon.awscdk.services.lambda.ICodeSigningConfig = (wrapped as Wrapper).cdkObject
  }
}
