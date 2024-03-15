@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.apigateway

import io.cloudshiftdev.awscdk.Resource
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class BasePathMapping internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.apigateway.BasePathMapping,
) : Resource(cdkObject) {
  @CdkDslMarker
  public interface Builder {
    public fun attachToStage(attachToStage: Boolean)

    public fun basePath(basePath: String)

    public fun domainName(domainName: IDomainName)

    public fun restApi(restApi: IRestApi)

    public fun stage(stage: Stage)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.apigateway.BasePathMapping.Builder =
        software.amazon.awscdk.services.apigateway.BasePathMapping.Builder.create(scope, id)

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

    public fun build(): software.amazon.awscdk.services.apigateway.BasePathMapping =
        cdkBuilder.build()
  }

  public companion object {
    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): BasePathMapping {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return BasePathMapping(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.apigateway.BasePathMapping):
        BasePathMapping = BasePathMapping(cdkObject)

    internal fun unwrap(wrapped: BasePathMapping):
        software.amazon.awscdk.services.apigateway.BasePathMapping = wrapped.cdkObject
  }
}
