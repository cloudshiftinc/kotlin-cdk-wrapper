package io.cloudshiftdev.awscdk.services.servicediscovery

import kotlin.String
import kotlin.Unit

public interface HttpNamespaceAttributes {
  public fun namespaceArn(): String

  public fun namespaceId(): String

  public fun namespaceName(): String

  public interface Builder {
    public fun namespaceArn(namespaceArn: String) {
    }

    public fun namespaceId(namespaceId: String) {
    }

    public fun namespaceName(namespaceName: String) {
    }
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.servicediscovery.HttpNamespaceAttributes.Builder =
        software.amazon.awscdk.services.servicediscovery.HttpNamespaceAttributes.builder()

    public override fun namespaceArn(namespaceArn: String) {
      cdkBuilder.namespaceArn(namespaceArn)
    }

    public override fun namespaceId(namespaceId: String) {
      cdkBuilder.namespaceId(namespaceId)
    }

    public override fun namespaceName(namespaceName: String) {
      cdkBuilder.namespaceName(namespaceName)
    }

    public fun build(): software.amazon.awscdk.services.servicediscovery.HttpNamespaceAttributes =
        cdkBuilder.build()
  }

  private class Wrapper internal constructor(
    internal val cdkObject:
        software.amazon.awscdk.services.servicediscovery.HttpNamespaceAttributes,
  ) : HttpNamespaceAttributes {
    public override fun namespaceArn(): String = unwrap(this).getNamespaceArn()

    public override fun namespaceId(): String = unwrap(this).getNamespaceId()

    public override fun namespaceName(): String = unwrap(this).getNamespaceName()
  }

  public companion object {
    init {

    }

    public operator fun invoke(block: Builder.() -> Unit = {}): HttpNamespaceAttributes {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.servicediscovery.HttpNamespaceAttributes):
        HttpNamespaceAttributes = Wrapper(cdkObject)

    internal fun unwrap(wrapped: HttpNamespaceAttributes):
        software.amazon.awscdk.services.servicediscovery.HttpNamespaceAttributes = (wrapped as
        Wrapper).cdkObject
  }
}
