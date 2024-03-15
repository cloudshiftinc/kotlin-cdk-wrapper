@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.servicediscovery

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String
import kotlin.Unit

/**
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.servicediscovery.*;
 * PublicDnsNamespaceAttributes publicDnsNamespaceAttributes =
 * PublicDnsNamespaceAttributes.builder()
 * .namespaceArn("namespaceArn")
 * .namespaceId("namespaceId")
 * .namespaceName("namespaceName")
 * .build();
 * ```
 */
public interface PublicDnsNamespaceAttributes {
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
   * A builder for [PublicDnsNamespaceAttributes]
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
        software.amazon.awscdk.services.servicediscovery.PublicDnsNamespaceAttributes.Builder =
        software.amazon.awscdk.services.servicediscovery.PublicDnsNamespaceAttributes.builder()

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

    public fun build():
        software.amazon.awscdk.services.servicediscovery.PublicDnsNamespaceAttributes =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject:
        software.amazon.awscdk.services.servicediscovery.PublicDnsNamespaceAttributes,
  ) : CdkObject(cdkObject), PublicDnsNamespaceAttributes {
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
    public operator fun invoke(block: Builder.() -> Unit = {}): PublicDnsNamespaceAttributes {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.servicediscovery.PublicDnsNamespaceAttributes):
        PublicDnsNamespaceAttributes = Wrapper(cdkObject)

    internal fun unwrap(wrapped: PublicDnsNamespaceAttributes):
        software.amazon.awscdk.services.servicediscovery.PublicDnsNamespaceAttributes = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.servicediscovery.PublicDnsNamespaceAttributes
  }
}
