@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.apigateway

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.Map

public interface MethodResponse {
  public fun responseModels(): Map<String, IModel> =
      unwrap(this).getResponseModels()?.mapValues{IModel.wrap(it.value)} ?: emptyMap()

  public fun responseParameters(): Map<String, Boolean> = unwrap(this).getResponseParameters() ?:
      emptyMap()

  public fun statusCode(): String

  @CdkDslMarker
  public interface Builder {
    public fun responseModels(responseModels: Map<String, IModel>)

    public fun responseParameters(responseParameters: Map<String, Boolean>)

    public fun statusCode(statusCode: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.apigateway.MethodResponse.Builder =
        software.amazon.awscdk.services.apigateway.MethodResponse.builder()

    override fun responseModels(responseModels: Map<String, IModel>) {
      cdkBuilder.responseModels(responseModels.mapValues{IModel.unwrap(it.value)})
    }

    override fun responseParameters(responseParameters: Map<String, Boolean>) {
      cdkBuilder.responseParameters(responseParameters)
    }

    override fun statusCode(statusCode: String) {
      cdkBuilder.statusCode(statusCode)
    }

    public fun build(): software.amazon.awscdk.services.apigateway.MethodResponse =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.apigateway.MethodResponse,
  ) : CdkObject(cdkObject), MethodResponse {
    override fun responseModels(): Map<String, IModel> =
        unwrap(this).getResponseModels()?.mapValues{IModel.wrap(it.value)} ?: emptyMap()

    override fun responseParameters(): Map<String, Boolean> = unwrap(this).getResponseParameters()
        ?: emptyMap()

    override fun statusCode(): String = unwrap(this).getStatusCode()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): MethodResponse {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.apigateway.MethodResponse):
        MethodResponse = Wrapper(cdkObject)

    internal fun unwrap(wrapped: MethodResponse):
        software.amazon.awscdk.services.apigateway.MethodResponse = (wrapped as CdkObject).cdkObject
        as software.amazon.awscdk.services.apigateway.MethodResponse
  }
}
