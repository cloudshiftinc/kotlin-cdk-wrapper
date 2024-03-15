@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.apigateway

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Boolean
import kotlin.String
import kotlin.Unit

public interface BasePathMappingProps : BasePathMappingOptions {
  public fun domainName(): IDomainName

  public fun restApi(): IRestApi

  @CdkDslMarker
  public interface Builder {
    public fun attachToStage(attachToStage: Boolean)

    public fun basePath(basePath: String)

    public fun domainName(domainName: IDomainName)

    public fun restApi(restApi: IRestApi)

    public fun stage(stage: Stage)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.apigateway.BasePathMappingProps.Builder
        = software.amazon.awscdk.services.apigateway.BasePathMappingProps.builder()

    override fun attachToStage(attachToStage: Boolean) {
      cdkBuilder.attachToStage(attachToStage)
    }

    override fun basePath(basePath: String) {
      cdkBuilder.basePath(basePath)
    }

    override fun domainName(domainName: IDomainName) {
      cdkBuilder.domainName(domainName.let(IDomainName::unwrap))
    }

    override fun restApi(restApi: IRestApi) {
      cdkBuilder.restApi(restApi.let(IRestApi::unwrap))
    }

    override fun stage(stage: Stage) {
      cdkBuilder.stage(stage.let(Stage::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.apigateway.BasePathMappingProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.apigateway.BasePathMappingProps,
  ) : CdkObject(cdkObject), BasePathMappingProps {
    override fun attachToStage(): Boolean? = unwrap(this).getAttachToStage()

    override fun basePath(): String? = unwrap(this).getBasePath()

    override fun domainName(): IDomainName = unwrap(this).getDomainName().let(IDomainName::wrap)

    override fun restApi(): IRestApi = unwrap(this).getRestApi().let(IRestApi::wrap)

    override fun stage(): Stage? = unwrap(this).getStage()?.let(Stage::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): BasePathMappingProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.apigateway.BasePathMappingProps):
        BasePathMappingProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: BasePathMappingProps):
        software.amazon.awscdk.services.apigateway.BasePathMappingProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.apigateway.BasePathMappingProps
  }
}
