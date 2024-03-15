@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.apigateway

import io.cloudshiftdev.awscdk.RemovalPolicy
import io.cloudshiftdev.awscdk.Size
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.services.iam.PolicyDocument
import kotlin.Boolean
import kotlin.Deprecated
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.Map
import kotlin.jvm.JvmName

public interface RestApiProps : ResourceOptions, RestApiBaseProps {
  public fun apiKeySourceType(): ApiKeySourceType? =
      unwrap(this).getApiKeySourceType()?.let(ApiKeySourceType::wrap)

  public fun binaryMediaTypes(): List<String> = unwrap(this).getBinaryMediaTypes() ?: emptyList()

  public fun cloneFrom(): IRestApi? = unwrap(this).getCloneFrom()?.let(IRestApi::wrap)

  public fun endpointConfiguration(): EndpointConfiguration? =
      unwrap(this).getEndpointConfiguration()?.let(EndpointConfiguration::wrap)

  public fun minCompressionSize(): Size? = unwrap(this).getMinCompressionSize()?.let(Size::wrap)

  @Deprecated(message = "deprecated in CDK")
  public fun minimumCompressionSize(): Number? = unwrap(this).getMinimumCompressionSize()

  @CdkDslMarker
  public interface Builder {
    public fun apiKeySourceType(apiKeySourceType: ApiKeySourceType)

    public fun binaryMediaTypes(binaryMediaTypes: List<String>)

    public fun binaryMediaTypes(vararg binaryMediaTypes: String)

    public fun cloneFrom(cloneFrom: IRestApi)

    public fun cloudWatchRole(cloudWatchRole: Boolean)

    public fun cloudWatchRoleRemovalPolicy(cloudWatchRoleRemovalPolicy: RemovalPolicy)

    public fun defaultCorsPreflightOptions(defaultCorsPreflightOptions: CorsOptions)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("03f9e27bf74605e728127e86d79e339787a76892cc44a528c726c5b7faa37b0b")
    public
        fun defaultCorsPreflightOptions(defaultCorsPreflightOptions: CorsOptions.Builder.() -> Unit)

    public fun defaultIntegration(defaultIntegration: Integration)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("257b2f68f707783e0f3e8e4d8817383b5c6f0269473f2681f46d456f33d105a2")
    public fun defaultIntegration(defaultIntegration: Integration.Builder.() -> Unit)

    public fun defaultMethodOptions(defaultMethodOptions: MethodOptions)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("2e88da5966f774fe6640de67a21669bc788349fbf7ccbfcc395b452902dd8175")
    public fun defaultMethodOptions(defaultMethodOptions: MethodOptions.Builder.() -> Unit)

    public fun deploy(deploy: Boolean)

    public fun deployOptions(deployOptions: StageOptions)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("5fa61f032dede72171708da9916000be8d1fc004705781467a92a123b77416db")
    public fun deployOptions(deployOptions: StageOptions.Builder.() -> Unit)

    public fun description(description: String)

    public fun disableExecuteApiEndpoint(disableExecuteApiEndpoint: Boolean)

    public fun domainName(domainName: DomainNameOptions)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("cce40bf3ef5b7435af09ec56e53e4f37754de258231a2c68f4d737326681cb7e")
    public fun domainName(domainName: DomainNameOptions.Builder.() -> Unit)

    public fun endpointConfiguration(endpointConfiguration: EndpointConfiguration)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("f0f85887be69a0c8ae2cbdabf8f5a12ec16de87eece75fa8c0e7ebfd4af6ffc6")
    public
        fun endpointConfiguration(endpointConfiguration: EndpointConfiguration.Builder.() -> Unit)

    public fun endpointExportName(endpointExportName: String)

    public fun endpointTypes(endpointTypes: List<EndpointType>)

    public fun endpointTypes(vararg endpointTypes: EndpointType)

    public fun failOnWarnings(failOnWarnings: Boolean)

    public fun minCompressionSize(minCompressionSize: Size)

    @Deprecated(message = "deprecated in CDK")
    public fun minimumCompressionSize(minimumCompressionSize: Number)

    public fun parameters(parameters: Map<String, String>)

    public fun policy(policy: PolicyDocument)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("ace609761a21385d5e7ce952b975a4054cddf189c5dcb27864d25961bb29077b")
    public fun policy(policy: PolicyDocument.Builder.() -> Unit)

    public fun restApiName(restApiName: String)

    public fun retainDeployments(retainDeployments: Boolean)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.apigateway.RestApiProps.Builder =
        software.amazon.awscdk.services.apigateway.RestApiProps.builder()

    override fun apiKeySourceType(apiKeySourceType: ApiKeySourceType) {
      cdkBuilder.apiKeySourceType(apiKeySourceType.let(ApiKeySourceType::unwrap))
    }

    override fun binaryMediaTypes(binaryMediaTypes: List<String>) {
      cdkBuilder.binaryMediaTypes(binaryMediaTypes)
    }

    override fun binaryMediaTypes(vararg binaryMediaTypes: String): Unit =
        binaryMediaTypes(binaryMediaTypes.toList())

    override fun cloneFrom(cloneFrom: IRestApi) {
      cdkBuilder.cloneFrom(cloneFrom.let(IRestApi::unwrap))
    }

    override fun cloudWatchRole(cloudWatchRole: Boolean) {
      cdkBuilder.cloudWatchRole(cloudWatchRole)
    }

    override fun cloudWatchRoleRemovalPolicy(cloudWatchRoleRemovalPolicy: RemovalPolicy) {
      cdkBuilder.cloudWatchRoleRemovalPolicy(cloudWatchRoleRemovalPolicy.let(RemovalPolicy::unwrap))
    }

    override fun defaultCorsPreflightOptions(defaultCorsPreflightOptions: CorsOptions) {
      cdkBuilder.defaultCorsPreflightOptions(defaultCorsPreflightOptions.let(CorsOptions::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("03f9e27bf74605e728127e86d79e339787a76892cc44a528c726c5b7faa37b0b")
    override
        fun defaultCorsPreflightOptions(defaultCorsPreflightOptions: CorsOptions.Builder.() -> Unit):
        Unit = defaultCorsPreflightOptions(CorsOptions(defaultCorsPreflightOptions))

    override fun defaultIntegration(defaultIntegration: Integration) {
      cdkBuilder.defaultIntegration(defaultIntegration.let(Integration::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("257b2f68f707783e0f3e8e4d8817383b5c6f0269473f2681f46d456f33d105a2")
    override fun defaultIntegration(defaultIntegration: Integration.Builder.() -> Unit): Unit =
        defaultIntegration(Integration(defaultIntegration))

    override fun defaultMethodOptions(defaultMethodOptions: MethodOptions) {
      cdkBuilder.defaultMethodOptions(defaultMethodOptions.let(MethodOptions::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("2e88da5966f774fe6640de67a21669bc788349fbf7ccbfcc395b452902dd8175")
    override fun defaultMethodOptions(defaultMethodOptions: MethodOptions.Builder.() -> Unit): Unit
        = defaultMethodOptions(MethodOptions(defaultMethodOptions))

    override fun deploy(deploy: Boolean) {
      cdkBuilder.deploy(deploy)
    }

    override fun deployOptions(deployOptions: StageOptions) {
      cdkBuilder.deployOptions(deployOptions.let(StageOptions::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("5fa61f032dede72171708da9916000be8d1fc004705781467a92a123b77416db")
    override fun deployOptions(deployOptions: StageOptions.Builder.() -> Unit): Unit =
        deployOptions(StageOptions(deployOptions))

    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    override fun disableExecuteApiEndpoint(disableExecuteApiEndpoint: Boolean) {
      cdkBuilder.disableExecuteApiEndpoint(disableExecuteApiEndpoint)
    }

    override fun domainName(domainName: DomainNameOptions) {
      cdkBuilder.domainName(domainName.let(DomainNameOptions::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("cce40bf3ef5b7435af09ec56e53e4f37754de258231a2c68f4d737326681cb7e")
    override fun domainName(domainName: DomainNameOptions.Builder.() -> Unit): Unit =
        domainName(DomainNameOptions(domainName))

    override fun endpointConfiguration(endpointConfiguration: EndpointConfiguration) {
      cdkBuilder.endpointConfiguration(endpointConfiguration.let(EndpointConfiguration::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("f0f85887be69a0c8ae2cbdabf8f5a12ec16de87eece75fa8c0e7ebfd4af6ffc6")
    override
        fun endpointConfiguration(endpointConfiguration: EndpointConfiguration.Builder.() -> Unit):
        Unit = endpointConfiguration(EndpointConfiguration(endpointConfiguration))

    override fun endpointExportName(endpointExportName: String) {
      cdkBuilder.endpointExportName(endpointExportName)
    }

    override fun endpointTypes(endpointTypes: List<EndpointType>) {
      cdkBuilder.endpointTypes(endpointTypes.map(EndpointType::unwrap))
    }

    override fun endpointTypes(vararg endpointTypes: EndpointType): Unit =
        endpointTypes(endpointTypes.toList())

    override fun failOnWarnings(failOnWarnings: Boolean) {
      cdkBuilder.failOnWarnings(failOnWarnings)
    }

    override fun minCompressionSize(minCompressionSize: Size) {
      cdkBuilder.minCompressionSize(minCompressionSize.let(Size::unwrap))
    }

    @Deprecated(message = "deprecated in CDK")
    override fun minimumCompressionSize(minimumCompressionSize: Number) {
      cdkBuilder.minimumCompressionSize(minimumCompressionSize)
    }

    override fun parameters(parameters: Map<String, String>) {
      cdkBuilder.parameters(parameters)
    }

    override fun policy(policy: PolicyDocument) {
      cdkBuilder.policy(policy.let(PolicyDocument::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("ace609761a21385d5e7ce952b975a4054cddf189c5dcb27864d25961bb29077b")
    override fun policy(policy: PolicyDocument.Builder.() -> Unit): Unit =
        policy(PolicyDocument(policy))

    override fun restApiName(restApiName: String) {
      cdkBuilder.restApiName(restApiName)
    }

    override fun retainDeployments(retainDeployments: Boolean) {
      cdkBuilder.retainDeployments(retainDeployments)
    }

    public fun build(): software.amazon.awscdk.services.apigateway.RestApiProps = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.apigateway.RestApiProps,
  ) : CdkObject(cdkObject), RestApiProps {
    override fun apiKeySourceType(): ApiKeySourceType? =
        unwrap(this).getApiKeySourceType()?.let(ApiKeySourceType::wrap)

    override fun binaryMediaTypes(): List<String> = unwrap(this).getBinaryMediaTypes() ?:
        emptyList()

    override fun cloneFrom(): IRestApi? = unwrap(this).getCloneFrom()?.let(IRestApi::wrap)

    override fun cloudWatchRole(): Boolean? = unwrap(this).getCloudWatchRole()

    override fun cloudWatchRoleRemovalPolicy(): RemovalPolicy? =
        unwrap(this).getCloudWatchRoleRemovalPolicy()?.let(RemovalPolicy::wrap)

    override fun defaultCorsPreflightOptions(): CorsOptions? =
        unwrap(this).getDefaultCorsPreflightOptions()?.let(CorsOptions::wrap)

    override fun defaultIntegration(): Integration? =
        unwrap(this).getDefaultIntegration()?.let(Integration::wrap)

    override fun defaultMethodOptions(): MethodOptions? =
        unwrap(this).getDefaultMethodOptions()?.let(MethodOptions::wrap)

    override fun deploy(): Boolean? = unwrap(this).getDeploy()

    override fun deployOptions(): StageOptions? =
        unwrap(this).getDeployOptions()?.let(StageOptions::wrap)

    override fun description(): String? = unwrap(this).getDescription()

    override fun disableExecuteApiEndpoint(): Boolean? = unwrap(this).getDisableExecuteApiEndpoint()

    override fun domainName(): DomainNameOptions? =
        unwrap(this).getDomainName()?.let(DomainNameOptions::wrap)

    override fun endpointConfiguration(): EndpointConfiguration? =
        unwrap(this).getEndpointConfiguration()?.let(EndpointConfiguration::wrap)

    override fun endpointExportName(): String? = unwrap(this).getEndpointExportName()

    override fun endpointTypes(): List<EndpointType> =
        unwrap(this).getEndpointTypes()?.map(EndpointType::wrap) ?: emptyList()

    override fun failOnWarnings(): Boolean? = unwrap(this).getFailOnWarnings()

    override fun minCompressionSize(): Size? = unwrap(this).getMinCompressionSize()?.let(Size::wrap)

    @Deprecated(message = "deprecated in CDK")
    override fun minimumCompressionSize(): Number? = unwrap(this).getMinimumCompressionSize()

    override fun parameters(): Map<String, String> = unwrap(this).getParameters() ?: emptyMap()

    override fun policy(): PolicyDocument? = unwrap(this).getPolicy()?.let(PolicyDocument::wrap)

    override fun restApiName(): String? = unwrap(this).getRestApiName()

    override fun retainDeployments(): Boolean? = unwrap(this).getRetainDeployments()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): RestApiProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.apigateway.RestApiProps):
        RestApiProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: RestApiProps):
        software.amazon.awscdk.services.apigateway.RestApiProps = (wrapped as CdkObject).cdkObject
        as software.amazon.awscdk.services.apigateway.RestApiProps
  }
}
