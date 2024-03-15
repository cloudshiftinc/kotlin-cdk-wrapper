@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.apigateway

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String
import kotlin.Unit

public interface AddApiKeyOptions {
  public fun overrideLogicalId(): String? = unwrap(this).getOverrideLogicalId()

  @CdkDslMarker
  public interface Builder {
    public fun overrideLogicalId(overrideLogicalId: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.apigateway.AddApiKeyOptions.Builder =
        software.amazon.awscdk.services.apigateway.AddApiKeyOptions.builder()

    override fun overrideLogicalId(overrideLogicalId: String) {
      cdkBuilder.overrideLogicalId(overrideLogicalId)
    }

    public fun build(): software.amazon.awscdk.services.apigateway.AddApiKeyOptions =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.apigateway.AddApiKeyOptions,
  ) : CdkObject(cdkObject), AddApiKeyOptions {
    override fun overrideLogicalId(): String? = unwrap(this).getOverrideLogicalId()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): AddApiKeyOptions {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.apigateway.AddApiKeyOptions):
        AddApiKeyOptions = Wrapper(cdkObject)

    internal fun unwrap(wrapped: AddApiKeyOptions):
        software.amazon.awscdk.services.apigateway.AddApiKeyOptions = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.apigateway.AddApiKeyOptions
  }
}
