package io.cloudshiftdev.awscdk.services.appmesh

import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName

public interface BackendConfig {
  public fun virtualServiceBackend(): CfnVirtualNode.BackendProperty

  public interface Builder {
    public fun virtualServiceBackend(virtualServiceBackend: CfnVirtualNode.BackendProperty) {
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("f8a48ba3a11c5eea70902c736f67e3953db62e8cf30892e96e2975c4eec673f8")
    public
        fun virtualServiceBackend(virtualServiceBackend: CfnVirtualNode.BackendProperty.Builder.() -> Unit) {
    }
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.appmesh.BackendConfig.Builder =
        software.amazon.awscdk.services.appmesh.BackendConfig.builder()

    public override
        fun virtualServiceBackend(virtualServiceBackend: CfnVirtualNode.BackendProperty) {
      cdkBuilder.virtualServiceBackend(virtualServiceBackend.let(CfnVirtualNode.BackendProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("f8a48ba3a11c5eea70902c736f67e3953db62e8cf30892e96e2975c4eec673f8")
    public override
        fun virtualServiceBackend(virtualServiceBackend: CfnVirtualNode.BackendProperty.Builder.() -> Unit):
        Unit = virtualServiceBackend(CfnVirtualNode.BackendProperty(virtualServiceBackend))

    public fun build(): software.amazon.awscdk.services.appmesh.BackendConfig = cdkBuilder.build()
  }

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.appmesh.BackendConfig,
  ) : BackendConfig {
    public override fun virtualServiceBackend(): CfnVirtualNode.BackendProperty =
        unwrap(this).getVirtualServiceBackend().let(CfnVirtualNode.BackendProperty::wrap)
  }

  public companion object {
    init {

    }

    public operator fun invoke(block: Builder.() -> Unit = {}): BackendConfig {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.appmesh.BackendConfig):
        BackendConfig = Wrapper(cdkObject)

    internal fun unwrap(wrapped: BackendConfig):
        software.amazon.awscdk.services.appmesh.BackendConfig = (wrapped as Wrapper).cdkObject
  }
}
