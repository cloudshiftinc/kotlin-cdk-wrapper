package io.cloudshiftdev.awscdk.services.apigateway

import io.cloudshiftdev.awscdk.RemovalPolicy
import io.cloudshiftdev.awscdk.Size
import io.cloudshiftdev.awscdk.services.iam.PolicyDocument
import io.cloudshiftdev.awscdk.services.lambda.IFunction
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

public open class LambdaRestApi internal constructor(
  private val cdkObject: software.amazon.awscdk.services.apigateway.LambdaRestApi,
) : RestApi(cdkObject) {
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
    @JvmName("a27be96cd76c9b2cc809dca0b5e9ccd2e04b6eb584eb2fe800866576d0d509ae")
    public
        fun defaultCorsPreflightOptions(defaultCorsPreflightOptions: CorsOptions.Builder.() -> Unit) {
    }

    public fun defaultIntegration(defaultIntegration: Integration) {
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("c386ea4a429a59cad5724e236a27e696281bfd607b021cf29e5e34114b05b510")
    public fun defaultIntegration(defaultIntegration: Integration.Builder.() -> Unit) {
    }

    public fun defaultMethodOptions(defaultMethodOptions: MethodOptions) {
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("c3e9595dd5c08c6566ac36f480f97013b7ece186ddee4d9e3a97e97b33379a38")
    public fun defaultMethodOptions(defaultMethodOptions: MethodOptions.Builder.() -> Unit) {
    }

    public fun deploy(deploy: Boolean) {
    }

    public fun deployOptions(deployOptions: StageOptions) {
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("53eea0ddcf94cf7fc38b52e3b3df9851d68448098a9e500171a896ae42c7bd26")
    public fun deployOptions(deployOptions: StageOptions.Builder.() -> Unit) {
    }

    public fun description(description: String) {
    }

    public fun disableExecuteApiEndpoint(disableExecuteApiEndpoint: Boolean) {
    }

    public fun domainName(domainName: DomainNameOptions) {
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("ecf95157037f9e294833f394ebf4c6de82df3e4720d7090874364729db822bb2")
    public fun domainName(domainName: DomainNameOptions.Builder.() -> Unit) {
    }

    public fun endpointConfiguration(endpointConfiguration: EndpointConfiguration) {
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("ab11b4da9ac36e3c776a5d2e0e4ae98070206bdd6b44ec2f93567cf1145ee821")
    public
        fun endpointConfiguration(endpointConfiguration: EndpointConfiguration.Builder.() -> Unit) {
    }

    public fun endpointExportName(endpointExportName: String) {
    }

    public fun endpointTypes(endpointTypes: List<EndpointType>) {
    }

    public fun failOnWarnings(failOnWarnings: Boolean) {
    }

    public fun handler(handler: IFunction) {
    }

    public fun integrationOptions(integrationOptions: LambdaIntegrationOptions) {
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("b5d005eee577d04fb09645063da611f6916e9ccda71b6a2b253ca75188890de3")
    public fun integrationOptions(integrationOptions: LambdaIntegrationOptions.Builder.() -> Unit) {
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
    @JvmName("23bbf781aa777cf6e16e96907341ab6b217585c03e9d275f7d7202644cb9b01c")
    public fun policy(policy: PolicyDocument.Builder.() -> Unit) {
    }

    public fun proxy(proxy: Boolean) {
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
    private val cdkBuilder: software.amazon.awscdk.services.apigateway.LambdaRestApi.Builder =
        software.amazon.awscdk.services.apigateway.LambdaRestApi.Builder.create(scope, id)

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
    @JvmName("a27be96cd76c9b2cc809dca0b5e9ccd2e04b6eb584eb2fe800866576d0d509ae")
    public override
        fun defaultCorsPreflightOptions(defaultCorsPreflightOptions: CorsOptions.Builder.() -> Unit):
        Unit = defaultCorsPreflightOptions(CorsOptions(defaultCorsPreflightOptions))

    public override fun defaultIntegration(defaultIntegration: Integration) {
      cdkBuilder.defaultIntegration(defaultIntegration.let(Integration::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("c386ea4a429a59cad5724e236a27e696281bfd607b021cf29e5e34114b05b510")
    public override fun defaultIntegration(defaultIntegration: Integration.Builder.() -> Unit): Unit
        = defaultIntegration(Integration(defaultIntegration))

    public override fun defaultMethodOptions(defaultMethodOptions: MethodOptions) {
      cdkBuilder.defaultMethodOptions(defaultMethodOptions.let(MethodOptions::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("c3e9595dd5c08c6566ac36f480f97013b7ece186ddee4d9e3a97e97b33379a38")
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
    @JvmName("53eea0ddcf94cf7fc38b52e3b3df9851d68448098a9e500171a896ae42c7bd26")
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
    @JvmName("ecf95157037f9e294833f394ebf4c6de82df3e4720d7090874364729db822bb2")
    public override fun domainName(domainName: DomainNameOptions.Builder.() -> Unit): Unit =
        domainName(DomainNameOptions(domainName))

    public override fun endpointConfiguration(endpointConfiguration: EndpointConfiguration) {
      cdkBuilder.endpointConfiguration(endpointConfiguration.let(EndpointConfiguration::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("ab11b4da9ac36e3c776a5d2e0e4ae98070206bdd6b44ec2f93567cf1145ee821")
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

    public override fun handler(handler: IFunction) {
      cdkBuilder.handler(handler.let(IFunction::unwrap))
    }

    public override fun integrationOptions(integrationOptions: LambdaIntegrationOptions) {
      cdkBuilder.integrationOptions(integrationOptions.let(LambdaIntegrationOptions::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("b5d005eee577d04fb09645063da611f6916e9ccda71b6a2b253ca75188890de3")
    public override
        fun integrationOptions(integrationOptions: LambdaIntegrationOptions.Builder.() -> Unit):
        Unit = integrationOptions(LambdaIntegrationOptions(integrationOptions))

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
    @JvmName("23bbf781aa777cf6e16e96907341ab6b217585c03e9d275f7d7202644cb9b01c")
    public override fun policy(policy: PolicyDocument.Builder.() -> Unit): Unit =
        policy(PolicyDocument(policy))

    public override fun proxy(proxy: Boolean) {
      cdkBuilder.proxy(proxy)
    }

    public override fun restApiName(restApiName: String) {
      cdkBuilder.restApiName(restApiName)
    }

    public override fun retainDeployments(retainDeployments: Boolean) {
      cdkBuilder.retainDeployments(retainDeployments)
    }

    public fun build(): software.amazon.awscdk.services.apigateway.LambdaRestApi =
        cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): LambdaRestApi {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return LambdaRestApi(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.apigateway.LambdaRestApi):
        LambdaRestApi = LambdaRestApi(cdkObject)

    internal fun unwrap(wrapped: LambdaRestApi):
        software.amazon.awscdk.services.apigateway.LambdaRestApi = wrapped.cdkObject
  }
}
