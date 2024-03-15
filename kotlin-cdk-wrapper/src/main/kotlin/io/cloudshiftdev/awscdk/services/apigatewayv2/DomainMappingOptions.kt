@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.apigatewayv2

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String
import kotlin.Unit

public interface DomainMappingOptions {
  public fun domainName(): IDomainName

  public fun mappingKey(): String? = unwrap(this).getMappingKey()

  @CdkDslMarker
  public interface Builder {
    public fun domainName(domainName: IDomainName)

    public fun mappingKey(mappingKey: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.apigatewayv2.DomainMappingOptions.Builder =
        software.amazon.awscdk.services.apigatewayv2.DomainMappingOptions.builder()

    override fun domainName(domainName: IDomainName) {
      cdkBuilder.domainName(domainName.let(IDomainName::unwrap))
    }

    override fun mappingKey(mappingKey: String) {
      cdkBuilder.mappingKey(mappingKey)
    }

    public fun build(): software.amazon.awscdk.services.apigatewayv2.DomainMappingOptions =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.apigatewayv2.DomainMappingOptions,
  ) : CdkObject(cdkObject), DomainMappingOptions {
    override fun domainName(): IDomainName = unwrap(this).getDomainName().let(IDomainName::wrap)

    override fun mappingKey(): String? = unwrap(this).getMappingKey()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): DomainMappingOptions {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.apigatewayv2.DomainMappingOptions):
        DomainMappingOptions = Wrapper(cdkObject)

    internal fun unwrap(wrapped: DomainMappingOptions):
        software.amazon.awscdk.services.apigatewayv2.DomainMappingOptions = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.apigatewayv2.DomainMappingOptions
  }
}
