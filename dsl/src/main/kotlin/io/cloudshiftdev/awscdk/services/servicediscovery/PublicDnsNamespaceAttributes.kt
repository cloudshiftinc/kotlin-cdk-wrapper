package io.cloudshiftdev.awscdk.services.servicediscovery

import kotlin.String
import kotlin.Unit

public interface PublicDnsNamespaceAttributes {
  public fun namespaceArn(): String

  public fun namespaceId(): String

  public fun namespaceName(): String

  public interface Builder {
    public fun namespaceArn(namespaceArn: String)

    public fun namespaceId(namespaceId: String)

    public fun namespaceName(namespaceName: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.servicediscovery.PublicDnsNamespaceAttributes.Builder =
        software.amazon.awscdk.services.servicediscovery.PublicDnsNamespaceAttributes.builder()

    override fun namespaceArn(namespaceArn: String) {
      cdkBuilder.namespaceArn(namespaceArn)
    }

    override fun namespaceId(namespaceId: String) {
      cdkBuilder.namespaceId(namespaceId)
    }

    override fun namespaceName(namespaceName: String) {
      cdkBuilder.namespaceName(namespaceName)
    }

    public fun build():
        software.amazon.awscdk.services.servicediscovery.PublicDnsNamespaceAttributes =
        cdkBuilder.build()
  }

  private class Wrapper internal constructor(
    internal val cdkObject:
        software.amazon.awscdk.services.servicediscovery.PublicDnsNamespaceAttributes,
  ) : PublicDnsNamespaceAttributes {
    override fun namespaceArn(): String = unwrap(this).getNamespaceArn()

    override fun namespaceId(): String = unwrap(this).getNamespaceId()

    override fun namespaceName(): String = unwrap(this).getNamespaceName()
  }

  public companion object {
    init {

    }

    public operator fun invoke(block: Builder.() -> Unit = {}): PublicDnsNamespaceAttributes {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.servicediscovery.PublicDnsNamespaceAttributes):
        PublicDnsNamespaceAttributes = Wrapper(cdkObject)

    internal fun unwrap(wrapped: PublicDnsNamespaceAttributes):
        software.amazon.awscdk.services.servicediscovery.PublicDnsNamespaceAttributes = (wrapped as
        Wrapper).cdkObject
  }
}
