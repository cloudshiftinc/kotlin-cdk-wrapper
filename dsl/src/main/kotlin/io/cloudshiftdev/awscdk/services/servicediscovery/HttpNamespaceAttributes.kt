package io.cloudshiftdev.awscdk.services.servicediscovery

import io.cloudshiftdev.awscdk.CdkObject
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.Unit

public interface HttpNamespaceAttributes {
  /**
   * Namespace ARN for the Namespace.
   */
  public fun namespaceArn(): String

  /**
   * Namespace Id for the Namespace.
   */
  public fun namespaceId(): String

  /**
   * A name for the Namespace.
   */
  public fun namespaceName(): String

  /**
   * A builder for [HttpNamespaceAttributes]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param namespaceArn Namespace ARN for the Namespace. 
     */
    public fun namespaceArn(namespaceArn: String)

    /**
     * @param namespaceId Namespace Id for the Namespace. 
     */
    public fun namespaceId(namespaceId: String)

    /**
     * @param namespaceName A name for the Namespace. 
     */
    public fun namespaceName(namespaceName: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.servicediscovery.HttpNamespaceAttributes.Builder =
        software.amazon.awscdk.services.servicediscovery.HttpNamespaceAttributes.builder()

    /**
     * @param namespaceArn Namespace ARN for the Namespace. 
     */
    override fun namespaceArn(namespaceArn: String) {
      cdkBuilder.namespaceArn(namespaceArn)
    }

    /**
     * @param namespaceId Namespace Id for the Namespace. 
     */
    override fun namespaceId(namespaceId: String) {
      cdkBuilder.namespaceId(namespaceId)
    }

    /**
     * @param namespaceName A name for the Namespace. 
     */
    override fun namespaceName(namespaceName: String) {
      cdkBuilder.namespaceName(namespaceName)
    }

    public fun build(): software.amazon.awscdk.services.servicediscovery.HttpNamespaceAttributes =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject:
        software.amazon.awscdk.services.servicediscovery.HttpNamespaceAttributes,
  ) : CdkObject(cdkObject), HttpNamespaceAttributes {
    /**
     * Namespace ARN for the Namespace.
     */
    override fun namespaceArn(): String = unwrap(this).getNamespaceArn()

    /**
     * Namespace Id for the Namespace.
     */
    override fun namespaceId(): String = unwrap(this).getNamespaceId()

    /**
     * A name for the Namespace.
     */
    override fun namespaceName(): String = unwrap(this).getNamespaceName()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): HttpNamespaceAttributes {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.servicediscovery.HttpNamespaceAttributes):
        HttpNamespaceAttributes = Wrapper(cdkObject)

    internal fun unwrap(wrapped: HttpNamespaceAttributes):
        software.amazon.awscdk.services.servicediscovery.HttpNamespaceAttributes = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.servicediscovery.HttpNamespaceAttributes
  }
}
