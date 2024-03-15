@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.apigatewayv2

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String
import kotlin.Unit

public interface ApiMappingProps {
  public fun api(): IApi

  public fun apiMappingKey(): String? = unwrap(this).getApiMappingKey()

  public fun domainName(): IDomainName

  public fun stage(): IStage? = unwrap(this).getStage()?.let(IStage::wrap)

  @CdkDslMarker
  public interface Builder {
    public fun api(api: IApi)

    public fun apiMappingKey(apiMappingKey: String)

    public fun domainName(domainName: IDomainName)

    public fun stage(stage: IStage)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.apigatewayv2.ApiMappingProps.Builder =
        software.amazon.awscdk.services.apigatewayv2.ApiMappingProps.builder()

    override fun api(api: IApi) {
      cdkBuilder.api(api.let(IApi::unwrap))
    }

    override fun apiMappingKey(apiMappingKey: String) {
      cdkBuilder.apiMappingKey(apiMappingKey)
    }

    override fun domainName(domainName: IDomainName) {
      cdkBuilder.domainName(domainName.let(IDomainName::unwrap))
    }

    override fun stage(stage: IStage) {
      cdkBuilder.stage(stage.let(IStage::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.apigatewayv2.ApiMappingProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.apigatewayv2.ApiMappingProps,
  ) : CdkObject(cdkObject), ApiMappingProps {
    override fun api(): IApi = unwrap(this).getApi().let(IApi::wrap)

    override fun apiMappingKey(): String? = unwrap(this).getApiMappingKey()

    override fun domainName(): IDomainName = unwrap(this).getDomainName().let(IDomainName::wrap)

    override fun stage(): IStage? = unwrap(this).getStage()?.let(IStage::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): ApiMappingProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.apigatewayv2.ApiMappingProps):
        ApiMappingProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: ApiMappingProps):
        software.amazon.awscdk.services.apigatewayv2.ApiMappingProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.apigatewayv2.ApiMappingProps
  }
}
