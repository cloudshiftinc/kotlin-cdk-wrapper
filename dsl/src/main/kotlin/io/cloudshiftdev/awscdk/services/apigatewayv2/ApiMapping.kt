package io.cloudshiftdev.awscdk.services.apigatewayv2

import io.cloudshiftdev.awscdk.Resource
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class ApiMapping internal constructor(
  private val cdkObject: software.amazon.awscdk.services.apigatewayv2.ApiMapping,
) : Resource(cdkObject), IApiMapping {
  public override fun apiMappingId(): String = unwrap(this).getApiMappingId()

  public open fun domainName(): IDomainName = unwrap(this).getDomainName().let(IDomainName::wrap)

  public open fun mappingKey(): String? = unwrap(this).getMappingKey()

  public interface Builder {
    public fun api(api: IApi) {
    }

    public fun apiMappingKey(apiMappingKey: String) {
    }

    public fun domainName(domainName: IDomainName) {
    }

    public fun stage(stage: IStage) {
    }
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.apigatewayv2.ApiMapping.Builder =
        software.amazon.awscdk.services.apigatewayv2.ApiMapping.Builder.create(scope, id)

    public override fun api(api: IApi) {
      cdkBuilder.api(api.let(IApi::unwrap))
    }

    public override fun apiMappingKey(apiMappingKey: String) {
      cdkBuilder.apiMappingKey(apiMappingKey)
    }

    public override fun domainName(domainName: IDomainName) {
      cdkBuilder.domainName(domainName.let(IDomainName::unwrap))
    }

    public override fun stage(stage: IStage) {
      cdkBuilder.stage(stage.let(IStage::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.apigatewayv2.ApiMapping = cdkBuilder.build()
  }

  public companion object {
    public open fun fromApiMappingAttributes(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      attrs: ApiMappingAttributes,
    ): IApiMapping =
        software.amazon.awscdk.services.apigatewayv2.ApiMapping.fromApiMappingAttributes(scope.let(CloudshiftdevConstructsConstruct::unwrap),
        id, attrs.let(ApiMappingAttributes::unwrap)).let(IApiMapping::wrap)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("1e1c3b60e3420232e95ceb8ceace088a2b1d3dd92bc0ca138bdaccdfa392dd6e")
    public open fun fromApiMappingAttributes(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      attrs: ApiMappingAttributes.Builder.() -> Unit,
    ): IApiMapping = fromApiMappingAttributes(scope, id, ApiMappingAttributes(attrs))

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): ApiMapping {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return ApiMapping(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.apigatewayv2.ApiMapping):
        ApiMapping = ApiMapping(cdkObject)

    internal fun unwrap(wrapped: ApiMapping):
        software.amazon.awscdk.services.apigatewayv2.ApiMapping = wrapped.cdkObject
  }
}
