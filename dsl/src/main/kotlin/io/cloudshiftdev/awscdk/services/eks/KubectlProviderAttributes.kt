package io.cloudshiftdev.awscdk.services.eks

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.services.iam.IRole
import kotlin.String
import kotlin.Unit

public interface KubectlProviderAttributes {
  /**
   * The custom resource provider's service token.
   */
  public fun functionArn(): String

  /**
   * The IAM execution role of the handler.
   *
   * This role must be able to assume kubectlRoleArn
   */
  public fun handlerRole(): IRole

  /**
   * The IAM role to assume in order to perform kubectl operations against this cluster.
   */
  public fun kubectlRoleArn(): String

  /**
   * A builder for [KubectlProviderAttributes]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param functionArn The custom resource provider's service token. 
     */
    public fun functionArn(functionArn: String)

    /**
     * @param handlerRole The IAM execution role of the handler. 
     * This role must be able to assume kubectlRoleArn
     */
    public fun handlerRole(handlerRole: IRole)

    /**
     * @param kubectlRoleArn The IAM role to assume in order to perform kubectl operations against
     * this cluster. 
     */
    public fun kubectlRoleArn(kubectlRoleArn: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.eks.KubectlProviderAttributes.Builder =
        software.amazon.awscdk.services.eks.KubectlProviderAttributes.builder()

    /**
     * @param functionArn The custom resource provider's service token. 
     */
    override fun functionArn(functionArn: String) {
      cdkBuilder.functionArn(functionArn)
    }

    /**
     * @param handlerRole The IAM execution role of the handler. 
     * This role must be able to assume kubectlRoleArn
     */
    override fun handlerRole(handlerRole: IRole) {
      cdkBuilder.handlerRole(handlerRole.let(IRole::unwrap))
    }

    /**
     * @param kubectlRoleArn The IAM role to assume in order to perform kubectl operations against
     * this cluster. 
     */
    override fun kubectlRoleArn(kubectlRoleArn: String) {
      cdkBuilder.kubectlRoleArn(kubectlRoleArn)
    }

    public fun build(): software.amazon.awscdk.services.eks.KubectlProviderAttributes =
        cdkBuilder.build()
  }

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.eks.KubectlProviderAttributes,
  ) : KubectlProviderAttributes {
    /**
     * The custom resource provider's service token.
     */
    override fun functionArn(): String = unwrap(this).getFunctionArn()

    /**
     * The IAM execution role of the handler.
     *
     * This role must be able to assume kubectlRoleArn
     */
    override fun handlerRole(): IRole = unwrap(this).getHandlerRole().let(IRole::wrap)

    /**
     * The IAM role to assume in order to perform kubectl operations against this cluster.
     */
    override fun kubectlRoleArn(): String = unwrap(this).getKubectlRoleArn()
  }

  public companion object {
    init {

    }

    public operator fun invoke(block: Builder.() -> Unit = {}): KubectlProviderAttributes {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.eks.KubectlProviderAttributes):
        KubectlProviderAttributes = Wrapper(cdkObject)

    internal fun unwrap(wrapped: KubectlProviderAttributes):
        software.amazon.awscdk.services.eks.KubectlProviderAttributes = (wrapped as
        Wrapper).cdkObject
  }
}
