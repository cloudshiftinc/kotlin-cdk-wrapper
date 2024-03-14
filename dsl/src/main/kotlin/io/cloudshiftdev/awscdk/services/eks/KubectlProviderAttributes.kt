package io.cloudshiftdev.awscdk.services.eks

import io.cloudshiftdev.awscdk.services.iam.IRole
import kotlin.String
import kotlin.Unit

public interface KubectlProviderAttributes {
  public fun functionArn(): String

  public fun handlerRole(): IRole

  public fun kubectlRoleArn(): String

  public interface Builder {
    public fun functionArn(functionArn: String)

    public fun handlerRole(handlerRole: IRole)

    public fun kubectlRoleArn(kubectlRoleArn: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.eks.KubectlProviderAttributes.Builder =
        software.amazon.awscdk.services.eks.KubectlProviderAttributes.builder()

    override fun functionArn(functionArn: String) {
      cdkBuilder.functionArn(functionArn)
    }

    override fun handlerRole(handlerRole: IRole) {
      cdkBuilder.handlerRole(handlerRole.let(IRole::unwrap))
    }

    override fun kubectlRoleArn(kubectlRoleArn: String) {
      cdkBuilder.kubectlRoleArn(kubectlRoleArn)
    }

    public fun build(): software.amazon.awscdk.services.eks.KubectlProviderAttributes =
        cdkBuilder.build()
  }

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.eks.KubectlProviderAttributes,
  ) : KubectlProviderAttributes {
    override fun functionArn(): String = unwrap(this).getFunctionArn()

    override fun handlerRole(): IRole = unwrap(this).getHandlerRole().let(IRole::wrap)

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
