@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.servicediscovery

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String
import kotlin.Unit

public interface PublicDnsNamespaceProps : BaseNamespaceProps {
  @CdkDslMarker
  public interface Builder {
    public fun description(description: String)

    public fun name(name: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.servicediscovery.PublicDnsNamespaceProps.Builder =
        software.amazon.awscdk.services.servicediscovery.PublicDnsNamespaceProps.builder()

    override fun description(description: String) {
      cdkBuilder.description(description)
    }

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
    override fun description(): String? = unwrap(this).getDescription()

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