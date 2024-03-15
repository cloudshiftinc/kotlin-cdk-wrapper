@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.apigateway

import io.cloudshiftdev.awscdk.RemovalPolicy
import io.cloudshiftdev.awscdk.Size
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.services.iam.IRole
import io.cloudshiftdev.awscdk.services.iam.PolicyDocument
import io.cloudshiftdev.awscdk.services.stepfunctions.IStateMachine
import kotlin.Boolean
import kotlin.Deprecated
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.Map
import kotlin.jvm.JvmName

public interface StepFunctionsRestApiProps : RestApiProps {
  public fun authorizer(): Boolean? = unwrap(this).getAuthorizer()

  public fun headers(): Boolean? = unwrap(this).getHeaders()

  public fun path(): Boolean? = unwrap(this).getPath()

  public fun querystring(): Boolean? = unwrap(this).getQuerystring()

  public fun requestContext(): RequestContext? =
      unwrap(this).getRequestContext()?.let(RequestContext::wrap)

  public fun role(): IRole? = unwrap(this).getRole()?.let(IRole::wrap)

  public fun stateMachine(): IStateMachine

  public fun useDefaultMethodResponses(): Boolean? = unwrap(this).getUseDefaultMethodResponses()

  @CdkDslMarker
  public interface Builder {
    public fun apiKeySourceType(apiKeySourceType: ApiKeySourceType)

    public fun authorizer(authorizer: Boolean)

    public fun binaryMediaTypes(binaryMediaTypes: List<String>)

    public fun binaryMediaTypes(vararg binaryMediaTypes: String)

    public fun cloneFrom(cloneFrom: IRestApi)

    public fun cloudWatchRole(cloudWatchRole: Boolean)

    public fun cloudWatchRoleRemovalPolicy(cloudWatchRoleRemovalPolicy: RemovalPolicy)

    public fun defaultCorsPreflightOptions(defaultCorsPreflightOptions: CorsOptions)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("5c6767383fd7822efbbc9d4035faf3b8a350830adb3f9b12fd71cba703c26897")
    public
        fun defaultCorsPreflightOptions(defaultCorsPreflightOptions: CorsOptions.Builder.() -> Unit)

    public fun defaultIntegration(defaultIntegration: Integration)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("76529d5521e4ad2734913cf282c769b5a9af3273f8a03f170e3f246beab5c665")
    public fun defaultIntegration(defaultIntegration: Integration.Builder.() -> Unit)

    public fun defaultMethodOptions(defaultMethodOptions: MethodOptions)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("30e96d77a1d6a860222d7fc5cdea422b30a98ccc7a3959af2c912b889e6c797c")
    public fun defaultMethodOptions(defaultMethodOptions: MethodOptions.Builder.() -> Unit)

    public fun deploy(deploy: Boolean)

    public fun deployOptions(deployOptions: StageOptions)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("4084918fa4b4898392472aa6b5cad83d35524f7d6c7ae585d33e3d6f1f4cc4df")
    public fun deployOptions(deployOptions: StageOptions.Builder.() -> Unit)

    public fun description(description: String)

    public fun disableExecuteApiEndpoint(disableExecuteApiEndpoint: Boolean)

    public fun domainName(domainName: DomainNameOptions)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("d8e2bec93d4c9693ff7ea25a9cb3976d10e019fc4ec116c79861afbf4b929e9e")
    public fun domainName(domainName: DomainNameOptions.Builder.() -> Unit)

    public fun endpointConfiguration(endpointConfiguration: EndpointConfiguration)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("68ffc21e564b11ae20628f10c5cdcf77e3b458a1ae3f90f4d711ac76f8f6d072")
    public
        fun endpointConfiguration(endpointConfiguration: EndpointConfiguration.Builder.() -> Unit)

    public fun endpointExportName(endpointExportName: String)

    public fun endpointTypes(endpointTypes: List<EndpointType>)

    public fun endpointTypes(vararg endpointTypes: EndpointType)

    public fun failOnWarnings(failOnWarnings: Boolean)

    public fun headers(headers: Boolean)

    public fun minCompressionSize(minCompressionSize: Size)

    @Deprecated(message = "deprecated in CDK")
    public fun minimumCompressionSize(minimumCompressionSize: Number)

    public fun parameters(parameters: Map<String, String>)

    public fun path(path: Boolean)

    public fun policy(policy: PolicyDocument)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("4128dddb29cc86321368c67eade7ef36f9e992ebf2192c37cdf538417ecc0c18")
    public fun policy(policy: PolicyDocument.Builder.() -> Unit)

    public fun querystring(querystring: Boolean)

    public fun requestContext(requestContext: RequestContext)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("160966ae644376f216e3aa1938a4f69d16fe594e4b7244269abad4446f33ace2")
    public fun requestContext(requestContext: RequestContext.Builder.() -> Unit)

    public fun restApiName(restApiName: String)

    public fun retainDeployments(retainDeployments: Boolean)

    public fun role(role: IRole)

    public fun stateMachine(stateMachine: IStateMachine)

    public fun useDefaultMethodResponses(useDefaultMethodResponses: Boolean)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.apigateway.StepFunctionsRestApiProps.Builder =
        software.amazon.awscdk.services.apigateway.StepFunctionsRestApiProps.builder()

    override fun apiKeySourceType(apiKeySourceType: ApiKeySourceType) {
      cdkBuilder.apiKeySourceType(apiKeySourceType.let(ApiKeySourceType::unwrap))
    }

    override fun authorizer(authorizer: Boolean) {
      cdkBuilder.authorizer(authorizer)
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
    @JvmName("5c6767383fd7822efbbc9d4035faf3b8a350830adb3f9b12fd71cba703c26897")
    override
        fun defaultCorsPreflightOptions(defaultCorsPreflightOptions: CorsOptions.Builder.() -> Unit):
        Unit = defaultCorsPreflightOptions(CorsOptions(defaultCorsPreflightOptions))

    override fun defaultIntegration(defaultIntegration: Integration) {
      cdkBuilder.defaultIntegration(defaultIntegration.let(Integration::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("76529d5521e4ad2734913cf282c769b5a9af3273f8a03f170e3f246beab5c665")
    override fun defaultIntegration(defaultIntegration: Integration.Builder.() -> Unit): Unit =
        defaultIntegration(Integration(defaultIntegration))

    override fun defaultMethodOptions(defaultMethodOptions: MethodOptions) {
      cdkBuilder.defaultMethodOptions(defaultMethodOptions.let(MethodOptions::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("30e96d77a1d6a860222d7fc5cdea422b30a98ccc7a3959af2c912b889e6c797c")
    override fun defaultMethodOptions(defaultMethodOptions: MethodOptions.Builder.() -> Unit): Unit
        = defaultMethodOptions(MethodOptions(defaultMethodOptions))

    override fun deploy(deploy: Boolean) {
      cdkBuilder.deploy(deploy)
    }

    override fun deployOptions(deployOptions: StageOptions) {
      cdkBuilder.deployOptions(deployOptions.let(StageOptions::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("4084918fa4b4898392472aa6b5cad83d35524f7d6c7ae585d33e3d6f1f4cc4df")
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
    @JvmName("d8e2bec93d4c9693ff7ea25a9cb3976d10e019fc4ec116c79861afbf4b929e9e")
    override fun domainName(domainName: DomainNameOptions.Builder.() -> Unit): Unit =
        domainName(DomainNameOptions(domainName))

    override fun endpointConfiguration(endpointConfiguration: EndpointConfiguration) {
      cdkBuilder.endpointConfiguration(endpointConfiguration.let(EndpointConfiguration::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("68ffc21e564b11ae20628f10c5cdcf77e3b458a1ae3f90f4d711ac76f8f6d072")
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

    override fun headers(headers: Boolean) {
      cdkBuilder.headers(headers)
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

    override fun path(path: Boolean) {
      cdkBuilder.path(path)
    }

    override fun policy(policy: PolicyDocument) {
      cdkBuilder.policy(policy.let(PolicyDocument::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("4128dddb29cc86321368c67eade7ef36f9e992ebf2192c37cdf538417ecc0c18")
    override fun policy(policy: PolicyDocument.Builder.() -> Unit): Unit =
        policy(PolicyDocument(policy))

    override fun querystring(querystring: Boolean) {
      cdkBuilder.querystring(querystring)
    }

    override fun requestContext(requestContext: RequestContext) {
      cdkBuilder.requestContext(requestContext.let(RequestContext::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("160966ae644376f216e3aa1938a4f69d16fe594e4b7244269abad4446f33ace2")
    override fun requestContext(requestContext: RequestContext.Builder.() -> Unit): Unit =
        requestContext(RequestContext(requestContext))

    override fun restApiName(restApiName: String) {
      cdkBuilder.restApiName(restApiName)
    }

    override fun retainDeployments(retainDeployments: Boolean) {
      cdkBuilder.retainDeployments(retainDeployments)
    }

    override fun role(role: IRole) {
      cdkBuilder.role(role.let(IRole::unwrap))
    }

    override fun stateMachine(stateMachine: IStateMachine) {
      cdkBuilder.stateMachine(stateMachine.let(IStateMachine::unwrap))
    }

    override fun useDefaultMethodResponses(useDefaultMethodResponses: Boolean) {
      cdkBuilder.useDefaultMethodResponses(useDefaultMethodResponses)
    }

    public fun build(): software.amazon.awscdk.services.apigateway.StepFunctionsRestApiProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.apigateway.StepFunctionsRestApiProps,
  ) : CdkObject(cdkObject), StepFunctionsRestApiProps {
    override fun apiKeySourceType(): ApiKeySourceType? =
        unwrap(this).getApiKeySourceType()?.let(ApiKeySourceType::wrap)

    override fun authorizer(): Boolean? = unwrap(this).getAuthorizer()

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

    override fun headers(): Boolean? = unwrap(this).getHeaders()

    override fun minCompressionSize(): Size? = unwrap(this).getMinCompressionSize()?.let(Size::wrap)

    @Deprecated(message = "deprecated in CDK")
    override fun minimumCompressionSize(): Number? = unwrap(this).getMinimumCompressionSize()

    override fun parameters(): Map<String, String> = unwrap(this).getParameters() ?: emptyMap()

    override fun path(): Boolean? = unwrap(this).getPath()

    override fun policy(): PolicyDocument? = unwrap(this).getPolicy()?.let(PolicyDocument::wrap)

    override fun querystring(): Boolean? = unwrap(this).getQuerystring()

    override fun requestContext(): RequestContext? =
        unwrap(this).getRequestContext()?.let(RequestContext::wrap)

    override fun restApiName(): String? = unwrap(this).getRestApiName()

    override fun retainDeployments(): Boolean? = unwrap(this).getRetainDeployments()

    override fun role(): IRole? = unwrap(this).getRole()?.let(IRole::wrap)

    override fun stateMachine(): IStateMachine =
        unwrap(this).getStateMachine().let(IStateMachine::wrap)

    override fun useDefaultMethodResponses(): Boolean? = unwrap(this).getUseDefaultMethodResponses()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): StepFunctionsRestApiProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.apigateway.StepFunctionsRestApiProps):
        StepFunctionsRestApiProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: StepFunctionsRestApiProps):
        software.amazon.awscdk.services.apigateway.StepFunctionsRestApiProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.apigateway.StepFunctionsRestApiProps
  }
}
