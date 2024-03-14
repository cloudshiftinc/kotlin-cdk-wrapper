package io.cloudshiftdev.awscdk.services.eks

import io.cloudshiftdev.awscdk.CdkObject
import io.cloudshiftdev.awscdk.services.iam.IRole
import io.cloudshiftdev.constructs.IConstruct
import io.cloudshiftdev.constructs.Node
import kotlin.String

public interface IKubectlProvider : IConstruct {
  /**
   * The IAM execution role of the handler.
   */
  public fun handlerRole(): IRole

  /**
   * The IAM role to assume in order to perform kubectl operations against this cluster.
   */
  public fun roleArn(): String

  /**
   * The custom resource provider's service token.
   */
  public fun serviceToken(): String

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.eks.IKubectlProvider,
  ) : CdkObject(cdkObject), IKubectlProvider {
    /**
     * The IAM execution role of the handler.
     */
    override fun handlerRole(): IRole = unwrap(this).getHandlerRole().let(IRole::wrap)

    override fun node(): Node = unwrap(this).getNode().let(Node::wrap)

    /**
     * The IAM role to assume in order to perform kubectl operations against this cluster.
     */
    override fun roleArn(): String = unwrap(this).getRoleArn()

    /**
     * The custom resource provider's service token.
     */
    override fun serviceToken(): String = unwrap(this).getServiceToken()
  }

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.eks.IKubectlProvider):
        IKubectlProvider = Wrapper(cdkObject)

    internal fun unwrap(wrapped: IKubectlProvider):
        software.amazon.awscdk.services.eks.IKubectlProvider = (wrapped as CdkObject).cdkObject as
        software.amazon.awscdk.services.eks.IKubectlProvider
  }
}
