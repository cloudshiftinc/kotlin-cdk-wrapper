package io.cloudshiftdev.awscdk.services.apigateway

import io.cloudshiftdev.awscdk.RemovalPolicy
import io.cloudshiftdev.awscdk.Size
import io.cloudshiftdev.awscdk.services.iam.IRole
import io.cloudshiftdev.awscdk.services.iam.PolicyDocument
import io.cloudshiftdev.awscdk.services.stepfunctions.IStateMachine
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

public open class StepFunctionsRestApi internal constructor(
  private val cdkObject: software.amazon.awscdk.services.apigateway.StepFunctionsRestApi,
) : RestApi(cdkObject) {
  public interface Builder {
    public fun apiKeySourceType(apiKeySourceType: ApiKeySourceType)

    public fun authorizer(authorizer: Boolean)

    public fun binaryMediaTypes(binaryMediaTypes: List<String>)

    public fun cloneFrom(cloneFrom: IRestApi)

    public fun cloudWatchRole(cloudWatchRole: Boolean)

    public fun cloudWatchRoleRemovalPolicy(cloudWatchRoleRemovalPolicy: RemovalPolicy)

    public fun defaultCorsPreflightOptions(defaultCorsPreflightOptions: CorsOptions)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("4ecb87607adc34bea3f3e2c9011ec9b87c08d6e4c79212aabb6b94b7af2e8ab8")
    public
        fun defaultCorsPreflightOptions(defaultCorsPreflightOptions: CorsOptions.Builder.() -> Unit)

    public fun defaultIntegration(defaultIntegration: Integration)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("10c6af253203730e6d0aa3b2417ab2588d84608849db10ccd59dc2cb03d092f5")
    public fun defaultIntegration(defaultIntegration: Integration.Builder.() -> Unit)

    public fun defaultMethodOptions(defaultMethodOptions: MethodOptions)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("b6274c35aea9a95d95526e842dd5d2efcf0e02478d9fe24dc4c06eb4a9b30bc9")
    public fun defaultMethodOptions(defaultMethodOptions: MethodOptions.Builder.() -> Unit)

    public fun deploy(deploy: Boolean)

    public fun deployOptions(deployOptions: StageOptions)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("04097a60db2138be1b5a59a59910c303ca0aff45d67b57bfdfb6aab2269eb099")
    public fun deployOptions(deployOptions: StageOptions.Builder.() -> Unit)

    public fun description(description: String)

    public fun disableExecuteApiEndpoint(disableExecuteApiEndpoint: Boolean)

    public fun domainName(domainName: DomainNameOptions)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("5f1dac6c44f7f6cb4220dc55adbc9a51039a801934953fb8d9dce58e3b56d0a0")
    public fun domainName(domainName: DomainNameOptions.Builder.() -> Unit)

    public fun endpointConfiguration(endpointConfiguration: EndpointConfiguration)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("f5f47d5dc1acc58ea54383c7446e5987691260dec52ebcc44e9051ad03a3850d")
    public
        fun endpointConfiguration(endpointConfiguration: EndpointConfiguration.Builder.() -> Unit)

    public fun endpointExportName(endpointExportName: String)

    public fun endpointTypes(endpointTypes: List<EndpointType>)

    public fun failOnWarnings(failOnWarnings: Boolean)

    public fun headers(headers: Boolean)

    public fun minCompressionSize(minCompressionSize: Size)

    @Deprecated(message = "deprecated in CDK")
    public fun minimumCompressionSize(minimumCompressionSize: Number)

    public fun parameters(parameters: Map<String, String>)

    public fun path(path: Boolean)

    public fun policy(policy: PolicyDocument)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("5ced0913dfe696786f1d0cef947d868ae950f983da20e006786f8c74b67836c6")
    public fun policy(policy: PolicyDocument.Builder.() -> Unit)

    public fun querystring(querystring: Boolean)

    public fun requestContext(requestContext: RequestContext)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("9ccbd02434b9431bcb834dc59080c0719cefcd922f89d03aa4d3ec47de85389b")
    public fun requestContext(requestContext: RequestContext.Builder.() -> Unit)

    public fun restApiName(restApiName: String)

    public fun retainDeployments(retainDeployments: Boolean)

    public fun role(role: IRole)

    public fun stateMachine(stateMachine: IStateMachine)

    public fun useDefaultMethodResponses(useDefaultMethodResponses: Boolean)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.apigateway.StepFunctionsRestApi.Builder
        = software.amazon.awscdk.services.apigateway.StepFunctionsRestApi.Builder.create(scope, id)

    override fun apiKeySourceType(apiKeySourceType: ApiKeySourceType) {
      cdkBuilder.apiKeySourceType(apiKeySourceType.let(ApiKeySourceType::unwrap))
    }

    override fun authorizer(authorizer: Boolean) {
      cdkBuilder.authorizer(authorizer)
    }

    override fun binaryMediaTypes(binaryMediaTypes: List<String>) {
      cdkBuilder.binaryMediaTypes(binaryMediaTypes)
    }

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

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("4ecb87607adc34bea3f3e2c9011ec9b87c08d6e4c79212aabb6b94b7af2e8ab8")
    override
        fun defaultCorsPreflightOptions(defaultCorsPreflightOptions: CorsOptions.Builder.() -> Unit):
        Unit = defaultCorsPreflightOptions(CorsOptions(defaultCorsPreflightOptions))

    override fun defaultIntegration(defaultIntegration: Integration) {
      cdkBuilder.defaultIntegration(defaultIntegration.let(Integration::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("10c6af253203730e6d0aa3b2417ab2588d84608849db10ccd59dc2cb03d092f5")
    override fun defaultIntegration(defaultIntegration: Integration.Builder.() -> Unit): Unit =
        defaultIntegration(Integration(defaultIntegration))

    override fun defaultMethodOptions(defaultMethodOptions: MethodOptions) {
      cdkBuilder.defaultMethodOptions(defaultMethodOptions.let(MethodOptions::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("b6274c35aea9a95d95526e842dd5d2efcf0e02478d9fe24dc4c06eb4a9b30bc9")
    override fun defaultMethodOptions(defaultMethodOptions: MethodOptions.Builder.() -> Unit): Unit
        = defaultMethodOptions(MethodOptions(defaultMethodOptions))

    override fun deploy(deploy: Boolean) {
      cdkBuilder.deploy(deploy)
    }

    override fun deployOptions(deployOptions: StageOptions) {
      cdkBuilder.deployOptions(deployOptions.let(StageOptions::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("04097a60db2138be1b5a59a59910c303ca0aff45d67b57bfdfb6aab2269eb099")
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

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("5f1dac6c44f7f6cb4220dc55adbc9a51039a801934953fb8d9dce58e3b56d0a0")
    override fun domainName(domainName: DomainNameOptions.Builder.() -> Unit): Unit =
        domainName(DomainNameOptions(domainName))

    override fun endpointConfiguration(endpointConfiguration: EndpointConfiguration) {
      cdkBuilder.endpointConfiguration(endpointConfiguration.let(EndpointConfiguration::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("f5f47d5dc1acc58ea54383c7446e5987691260dec52ebcc44e9051ad03a3850d")
    override
        fun endpointConfiguration(endpointConfiguration: EndpointConfiguration.Builder.() -> Unit):
        Unit = endpointConfiguration(EndpointConfiguration(endpointConfiguration))

    override fun endpointExportName(endpointExportName: String) {
      cdkBuilder.endpointExportName(endpointExportName)
    }

    override fun endpointTypes(endpointTypes: List<EndpointType>) {
      cdkBuilder.endpointTypes(endpointTypes.map(EndpointType::unwrap))
    }

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

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("5ced0913dfe696786f1d0cef947d868ae950f983da20e006786f8c74b67836c6")
    override fun policy(policy: PolicyDocument.Builder.() -> Unit): Unit =
        policy(PolicyDocument(policy))

    override fun querystring(querystring: Boolean) {
      cdkBuilder.querystring(querystring)
    }

    override fun requestContext(requestContext: RequestContext) {
      cdkBuilder.requestContext(requestContext.let(RequestContext::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("9ccbd02434b9431bcb834dc59080c0719cefcd922f89d03aa4d3ec47de85389b")
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

    public fun build(): software.amazon.awscdk.services.apigateway.StepFunctionsRestApi =
        cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): StepFunctionsRestApi {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return StepFunctionsRestApi(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.apigateway.StepFunctionsRestApi):
        StepFunctionsRestApi = StepFunctionsRestApi(cdkObject)

    internal fun unwrap(wrapped: StepFunctionsRestApi):
        software.amazon.awscdk.services.apigateway.StepFunctionsRestApi = wrapped.cdkObject
  }
}
