package io.cloudshiftdev.awscdk.services.servicediscovery

import io.cloudshiftdev.awscdk.CdkObject
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.Unit

public interface PublicDnsNamespaceProps : BaseNamespaceProps {
  /**
   * A builder for [PublicDnsNamespaceProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param description A description of the Namespace.
     */
    public fun description(description: String)

    /**
     * @param name A name for the Namespace. 
     */
    public fun name(name: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.servicediscovery.PublicDnsNamespaceProps.Builder =
        software.amazon.awscdk.services.servicediscovery.PublicDnsNamespaceProps.builder()

    /**
     * @param description A description of the Namespace.
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * @param name A name for the Namespace. 
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    public fun build(): software.amazon.awscdk.services.servicediscovery.PublicDnsNamespaceProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject:
        software.amazon.awscdk.services.servicediscovery.PublicDnsNamespaceProps,
  ) : CdkObject(cdkObject), PublicDnsNamespaceProps {
    /**
     * A description of the Namespace.
     *
     * Default: none
     */
    override fun description(): String? = unwrap(this).getDescription()

    /**
     * A name for the Namespace.
     */
    override fun name(): String = unwrap(this).getName()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): PublicDnsNamespaceProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.servicediscovery.PublicDnsNamespaceProps):
        PublicDnsNamespaceProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: PublicDnsNamespaceProps):
        software.amazon.awscdk.services.servicediscovery.PublicDnsNamespaceProps = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.servicediscovery.PublicDnsNamespaceProps
  }
}
