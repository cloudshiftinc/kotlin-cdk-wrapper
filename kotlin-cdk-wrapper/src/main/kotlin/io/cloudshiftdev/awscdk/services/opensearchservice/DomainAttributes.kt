@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.opensearchservice

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String
import kotlin.Unit

public interface DomainAttributes {
  public fun domainArn(): String

  public fun domainEndpoint(): String

  @CdkDslMarker
  public interface Builder {
    public fun domainArn(domainArn: String)

    public fun domainEndpoint(domainEndpoint: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.opensearchservice.DomainAttributes.Builder =
        software.amazon.awscdk.services.opensearchservice.DomainAttributes.builder()

    override fun domainArn(domainArn: String) {
      cdkBuilder.domainArn(domainArn)
    }

    override fun domainEndpoint(domainEndpoint: String) {
      cdkBuilder.domainEndpoint(domainEndpoint)
    }

    public fun build(): software.amazon.awscdk.services.opensearchservice.DomainAttributes =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.opensearchservice.DomainAttributes,
  ) : CdkObject(cdkObject), DomainAttributes {
    override fun domainArn(): String = unwrap(this).getDomainArn()

    override fun domainEndpoint(): String = unwrap(this).getDomainEndpoint()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): DomainAttributes {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.opensearchservice.DomainAttributes):
        DomainAttributes = Wrapper(cdkObject)

    internal fun unwrap(wrapped: DomainAttributes):
        software.amazon.awscdk.services.opensearchservice.DomainAttributes = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.opensearchservice.DomainAttributes
  }
}
