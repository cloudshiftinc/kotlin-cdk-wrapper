@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.apigateway

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String
import kotlin.Unit

public interface ApiMappingOptions {
  public fun basePath(): String? = unwrap(this).getBasePath()

  @CdkDslMarker
  public interface Builder {
    public fun basePath(basePath: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.apigateway.ApiMappingOptions.Builder =
        software.amazon.awscdk.services.apigateway.ApiMappingOptions.builder()

    override fun basePath(basePath: String) {
      cdkBuilder.basePath(basePath)
    }

    public fun build(): software.amazon.awscdk.services.apigateway.ApiMappingOptions =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.apigateway.ApiMappingOptions,
  ) : CdkObject(cdkObject), ApiMappingOptions {
    override fun basePath(): String? = unwrap(this).getBasePath()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): ApiMappingOptions {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.apigateway.ApiMappingOptions):
        ApiMappingOptions = Wrapper(cdkObject)

    internal fun unwrap(wrapped: ApiMappingOptions):
        software.amazon.awscdk.services.apigateway.ApiMappingOptions = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.apigateway.ApiMappingOptions
  }
}
