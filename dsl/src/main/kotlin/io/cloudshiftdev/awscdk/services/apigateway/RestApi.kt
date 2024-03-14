package io.cloudshiftdev.awscdk.services.apigateway

import io.cloudshiftdev.awscdk.RemovalPolicy
import io.cloudshiftdev.awscdk.Size
import io.cloudshiftdev.awscdk.services.iam.PolicyDocument
import kotlin.Boolean
import kotlin.Deprecated
import kotlin.Number
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.Map
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class RestApi internal constructor(
  private val cdkObject: software.amazon.awscdk.services.apigateway.RestApi,
) : RestApiBase(cdkObject) {
  public open fun addModel(id: String, props: ModelOptions): Model = unwrap(this).addModel(id,
      props.let(ModelOptions::unwrap)).let(Model::wrap)

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("eff4d051b66631acf1d61cfb56e21ad785398ccd3b2641b9427d5d0cbbc04191")
  public open fun addModel(id: String, props: ModelOptions.Builder.() -> Unit): Model = addModel(id,
      ModelOptions(props))

  public open fun addRequestValidator(id: String, props: RequestValidatorOptions): RequestValidator
      = unwrap(this).addRequestValidator(id,
      props.let(RequestValidatorOptions::unwrap)).let(RequestValidator::wrap)

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("ce2f1e4eb3e8e7f12db38bbe3bac25ebcb4e89eedd643abc90f0a23f6687b0f0")
  public open fun addRequestValidator(id: String,
      props: RequestValidatorOptions.Builder.() -> Unit): RequestValidator = addRequestValidator(id,
      RequestValidatorOptions(props))

  public open fun methods(): List<Method> = unwrap(this).getMethods().map(Method::wrap)

  public override fun restApiId(): String = unwrap(this).getRestApiId()

  public override fun restApiRootResourceId(): String = unwrap(this).getRestApiRootResourceId()

  public override fun root(): IResource = unwrap(this).getRoot().let(IResource::wrap)

  public interface Builder {
    public fun apiKeySourceType(apiKeySourceType: ApiKeySourceType) {
    }

    public fun binaryMediaTypes(binaryMediaTypes: List<String>) {
    }

    public fun cloneFrom(cloneFrom: IRestApi) {
    }

    public fun cloudWatchRole(cloudWatchRole: Boolean) {
    }

    public fun cloudWatchRoleRemovalPolicy(cloudWatchRoleRemovalPolicy: RemovalPolicy) {
    }

    public fun defaultCorsPreflightOptions(defaultCorsPreflightOptions: CorsOptions) {
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("6e88b4f120655ddc2a5db201b9b3ca62817a48ac82a3a90e30b782e20b041366")
    public
        fun defaultCorsPreflightOptions(defaultCorsPreflightOptions: CorsOptions.Builder.() -> Unit) {
    }

    public fun defaultIntegration(defaultIntegration: Integration) {
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("d5c997ad14fd0c71129b652ab14a5ab82822fb6857fc0f69eb973f2d50106a4d")
    public fun defaultIntegration(defaultIntegration: Integration.Builder.() -> Unit) {
    }

    public fun defaultMethodOptions(defaultMethodOptions: MethodOptions) {
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("4cf482e5d6011a553d707114dbdf2daf508ad8ee4b371a21fb3ea70600b0755e")
    public fun defaultMethodOptions(defaultMethodOptions: MethodOptions.Builder.() -> Unit) {
    }

    public fun deploy(deploy: Boolean) {
    }

    public fun deployOptions(deployOptions: StageOptions) {
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("2e5a9374ecff524b5f253cf8988619066f0b619a7b913fd15eaa9b87de990f00")
    public fun deployOptions(deployOptions: StageOptions.Builder.() -> Unit) {
    }

    public fun description(description: String) {
    }

    public fun disableExecuteApiEndpoint(disableExecuteApiEndpoint: Boolean) {
    }

    public fun domainName(domainName: DomainNameOptions) {
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("22fddb3d13e3a75c1d122c19e64996063c633bbca1dd33c870303677c927f2c5")
    public fun domainName(domainName: DomainNameOptions.Builder.() -> Unit) {
    }

    public fun endpointConfiguration(endpointConfiguration: EndpointConfiguration) {
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("ff917eb8a2a3075cea4a993c83e151b41734e83f19db3c953ca04ff8b247e9d9")
    public
        fun endpointConfiguration(endpointConfiguration: EndpointConfiguration.Builder.() -> Unit) {
    }

    public fun endpointExportName(endpointExportName: String) {
    }

    public fun endpointTypes(endpointTypes: List<EndpointType>) {
    }

    public fun failOnWarnings(failOnWarnings: Boolean) {
    }

    public fun minCompressionSize(minCompressionSize: Size) {
    }

    @Deprecated(message = "deprecated in CDK")
    public fun minimumCompressionSize(minimumCompressionSize: Number) {
    }

    public fun parameters(parameters: Map<String, String>) {
    }

    public fun policy(policy: PolicyDocument) {
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("a98800dfb2d1c8d802ecb04e1a3fd4dde3cd10da4d43d0e7f2e95dd97a07d13b")
    public fun policy(policy: PolicyDocument.Builder.() -> Unit) {
    }

    public fun restApiName(restApiName: String) {
    }

    public fun retainDeployments(retainDeployments: Boolean) {
    }
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.apigateway.RestApi.Builder =
        software.amazon.awscdk.services.apigateway.RestApi.Builder.create(scope, id)

    public override fun apiKeySourceType(apiKeySourceType: ApiKeySourceType) {
      cdkBuilder.apiKeySourceType(apiKeySourceType.let(ApiKeySourceType::unwrap))
    }

    public override fun binaryMediaTypes(binaryMediaTypes: List<String>) {
      cdkBuilder.binaryMediaTypes(binaryMediaTypes)
    }

    public override fun cloneFrom(cloneFrom: IRestApi) {
      cdkBuilder.cloneFrom(cloneFrom.let(IRestApi::unwrap))
    }

    public override fun cloudWatchRole(cloudWatchRole: Boolean) {
      cdkBuilder.cloudWatchRole(cloudWatchRole)
    }

    public override fun cloudWatchRoleRemovalPolicy(cloudWatchRoleRemovalPolicy: RemovalPolicy) {
      cdkBuilder.cloudWatchRoleRemovalPolicy(cloudWatchRoleRemovalPolicy.let(RemovalPolicy::unwrap))
    }

    public override fun defaultCorsPreflightOptions(defaultCorsPreflightOptions: CorsOptions) {
      cdkBuilder.defaultCorsPreflightOptions(defaultCorsPreflightOptions.let(CorsOptions::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("6e88b4f120655ddc2a5db201b9b3ca62817a48ac82a3a90e30b782e20b041366")
    public override
        fun defaultCorsPreflightOptions(defaultCorsPreflightOptions: CorsOptions.Builder.() -> Unit):
        Unit = defaultCorsPreflightOptions(CorsOptions(defaultCorsPreflightOptions))

    public override fun defaultIntegration(defaultIntegration: Integration) {
      cdkBuilder.defaultIntegration(defaultIntegration.let(Integration::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("d5c997ad14fd0c71129b652ab14a5ab82822fb6857fc0f69eb973f2d50106a4d")
    public override fun defaultIntegration(defaultIntegration: Integration.Builder.() -> Unit): Unit
        = defaultIntegration(Integration(defaultIntegration))

    public override fun defaultMethodOptions(defaultMethodOptions: MethodOptions) {
      cdkBuilder.defaultMethodOptions(defaultMethodOptions.let(MethodOptions::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("4cf482e5d6011a553d707114dbdf2daf508ad8ee4b371a21fb3ea70600b0755e")
    public override
        fun defaultMethodOptions(defaultMethodOptions: MethodOptions.Builder.() -> Unit): Unit =
        defaultMethodOptions(MethodOptions(defaultMethodOptions))

    public override fun deploy(deploy: Boolean) {
      cdkBuilder.deploy(deploy)
    }

    public override fun deployOptions(deployOptions: StageOptions) {
      cdkBuilder.deployOptions(deployOptions.let(StageOptions::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("2e5a9374ecff524b5f253cf8988619066f0b619a7b913fd15eaa9b87de990f00")
    public override fun deployOptions(deployOptions: StageOptions.Builder.() -> Unit): Unit =
        deployOptions(StageOptions(deployOptions))

    public override fun description(description: String) {
      cdkBuilder.description(description)
    }

    public override fun disableExecuteApiEndpoint(disableExecuteApiEndpoint: Boolean) {
      cdkBuilder.disableExecuteApiEndpoint(disableExecuteApiEndpoint)
    }

    public override fun domainName(domainName: DomainNameOptions) {
      cdkBuilder.domainName(domainName.let(DomainNameOptions::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("22fddb3d13e3a75c1d122c19e64996063c633bbca1dd33c870303677c927f2c5")
    public override fun domainName(domainName: DomainNameOptions.Builder.() -> Unit): Unit =
        domainName(DomainNameOptions(domainName))

    public override fun endpointConfiguration(endpointConfiguration: EndpointConfiguration) {
      cdkBuilder.endpointConfiguration(endpointConfiguration.let(EndpointConfiguration::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("ff917eb8a2a3075cea4a993c83e151b41734e83f19db3c953ca04ff8b247e9d9")
    public override
        fun endpointConfiguration(endpointConfiguration: EndpointConfiguration.Builder.() -> Unit):
        Unit = endpointConfiguration(EndpointConfiguration(endpointConfiguration))

    public override fun endpointExportName(endpointExportName: String) {
      cdkBuilder.endpointExportName(endpointExportName)
    }

    public override fun endpointTypes(endpointTypes: List<EndpointType>) {
      cdkBuilder.endpointTypes(endpointTypes.map(EndpointType::unwrap))
    }

    public override fun failOnWarnings(failOnWarnings: Boolean) {
      cdkBuilder.failOnWarnings(failOnWarnings)
    }

    public override fun minCompressionSize(minCompressionSize: Size) {
      cdkBuilder.minCompressionSize(minCompressionSize.let(Size::unwrap))
    }

    @Deprecated(message = "deprecated in CDK")
    public override fun minimumCompressionSize(minimumCompressionSize: Number) {
      cdkBuilder.minimumCompressionSize(minimumCompressionSize)
    }

    public override fun parameters(parameters: Map<String, String>) {
      cdkBuilder.parameters(parameters)
    }

    public override fun policy(policy: PolicyDocument) {
      cdkBuilder.policy(policy.let(PolicyDocument::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("a98800dfb2d1c8d802ecb04e1a3fd4dde3cd10da4d43d0e7f2e95dd97a07d13b")
    public override fun policy(policy: PolicyDocument.Builder.() -> Unit): Unit =
        policy(PolicyDocument(policy))

    public override fun restApiName(restApiName: String) {
      cdkBuilder.restApiName(restApiName)
    }

    public override fun retainDeployments(retainDeployments: Boolean) {
      cdkBuilder.retainDeployments(retainDeployments)
    }

    public fun build(): software.amazon.awscdk.services.apigateway.RestApi = cdkBuilder.build()
  }

  public companion object {
    public open fun fromRestApiAttributes(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      attrs: RestApiAttributes,
    ): IRestApi =
        software.amazon.awscdk.services.apigateway.RestApi.fromRestApiAttributes(scope.let(CloudshiftdevConstructsConstruct::unwrap),
        id, attrs.let(RestApiAttributes::unwrap)).let(IRestApi::wrap)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("cb89db0f35408d8d66d6358e7a387ed7dc683f1c1676bfb2e8655d4fbc01224f")
    public open fun fromRestApiAttributes(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      attrs: RestApiAttributes.Builder.() -> Unit,
    ): IRestApi = fromRestApiAttributes(scope, id, RestApiAttributes(attrs))

    public open fun fromRestApiId(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      restApiId: String,
    ): IRestApi =
        software.amazon.awscdk.services.apigateway.RestApi.fromRestApiId(scope.let(CloudshiftdevConstructsConstruct::unwrap),
        id, restApiId).let(IRestApi::wrap)

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): RestApi {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return RestApi(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.apigateway.RestApi): RestApi =
        RestApi(cdkObject)

    internal fun unwrap(wrapped: RestApi): software.amazon.awscdk.services.apigateway.RestApi =
        wrapped.cdkObject
  }
}
