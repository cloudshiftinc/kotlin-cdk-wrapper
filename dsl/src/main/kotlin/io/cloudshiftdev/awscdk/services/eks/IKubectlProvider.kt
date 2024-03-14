package io.cloudshiftdev.awscdk.services.eks

import io.cloudshiftdev.awscdk.services.iam.IRole
import io.cloudshiftdev.constructs.IConstruct
import io.cloudshiftdev.constructs.Node
import kotlin.String

public interface IKubectlProvider : IConstruct {
  public fun handlerRole(): IRole

  public fun roleArn(): String

  public fun serviceToken(): String

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.eks.IKubectlProvider,
  ) : IKubectlProvider {
    override fun handlerRole(): IRole = unwrap(this).getHandlerRole().let(IRole::wrap)

    override fun node(): Node = unwrap(this).getNode().let(Node::wrap)

    override fun roleArn(): String = unwrap(this).getRoleArn()

    override fun serviceToken(): String = unwrap(this).getServiceToken()
  }

  public companion object {
    init {

    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.eks.IKubectlProvider):
        IKubectlProvider = Wrapper(cdkObject)

    internal fun unwrap(wrapped: IKubectlProvider):
        software.amazon.awscdk.services.eks.IKubectlProvider = (wrapped as Wrapper).cdkObject
  }
}
