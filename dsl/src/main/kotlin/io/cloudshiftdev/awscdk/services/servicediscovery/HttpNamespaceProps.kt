package io.cloudshiftdev.awscdk.services.servicediscovery

import io.cloudshiftdev.awscdk.CdkObject
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.Unit

public interface HttpNamespaceProps : BaseNamespaceProps {
  /**
   * A builder for [HttpNamespaceProps]
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
        software.amazon.awscdk.services.servicediscovery.HttpNamespaceProps.Builder =
        software.amazon.awscdk.services.servicediscovery.HttpNamespaceProps.builder()

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

    public fun build(): software.amazon.awscdk.services.servicediscovery.HttpNamespaceProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.servicediscovery.HttpNamespaceProps,
  ) : CdkObject(cdkObject), HttpNamespaceProps {
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
    public operator fun invoke(block: Builder.() -> Unit = {}): HttpNamespaceProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.servicediscovery.HttpNamespaceProps):
        HttpNamespaceProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: HttpNamespaceProps):
        software.amazon.awscdk.services.servicediscovery.HttpNamespaceProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.servicediscovery.HttpNamespaceProps
  }
}
