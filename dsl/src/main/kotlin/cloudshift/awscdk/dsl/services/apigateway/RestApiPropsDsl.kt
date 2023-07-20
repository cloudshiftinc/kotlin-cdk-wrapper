@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION",
)

package cloudshift.awscdk.dsl.services.apigateway

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.dsl.services.iam.PolicyDocumentDsl
import software.amazon.awscdk.Size
import software.amazon.awscdk.services.apigateway.ApiKeySourceType
import software.amazon.awscdk.services.apigateway.CorsOptions
import software.amazon.awscdk.services.apigateway.DomainNameOptions
import software.amazon.awscdk.services.apigateway.EndpointConfiguration
import software.amazon.awscdk.services.apigateway.EndpointType
import software.amazon.awscdk.services.apigateway.IRestApi
import software.amazon.awscdk.services.apigateway.Integration
import software.amazon.awscdk.services.apigateway.MethodOptions
import software.amazon.awscdk.services.apigateway.RestApiProps
import software.amazon.awscdk.services.apigateway.StageOptions
import software.amazon.awscdk.services.iam.PolicyDocument
import kotlin.Boolean
import kotlin.Deprecated
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.Map
import kotlin.collections.MutableList

@CdkDslMarker
public class RestApiPropsDsl {
    private val cdkBuilder: RestApiProps.Builder = RestApiProps.builder()

    private val _binaryMediaTypes: MutableList<String> = mutableListOf()

    private val _endpointTypes: MutableList<EndpointType> = mutableListOf()

    public fun apiKeySourceType(apiKeySourceType: ApiKeySourceType) {
        cdkBuilder.apiKeySourceType(apiKeySourceType)
    }

    public fun binaryMediaTypes(vararg binaryMediaTypes: String) {
        _binaryMediaTypes.addAll(listOf(*binaryMediaTypes))
    }

    public fun binaryMediaTypes(binaryMediaTypes: Collection<String>) {
        _binaryMediaTypes.addAll(binaryMediaTypes)
    }

    public fun cloneFrom(cloneFrom: IRestApi) {
        cdkBuilder.cloneFrom(cloneFrom)
    }

    public fun cloudWatchRole(cloudWatchRole: Boolean) {
        cdkBuilder.cloudWatchRole(cloudWatchRole)
    }

    public fun defaultCorsPreflightOptions(block: CorsOptionsDsl.() -> Unit = {}) {
        val builder = CorsOptionsDsl()
        builder.apply(block)
        cdkBuilder.defaultCorsPreflightOptions(builder.build())
    }

    public fun defaultCorsPreflightOptions(defaultCorsPreflightOptions: CorsOptions) {
        cdkBuilder.defaultCorsPreflightOptions(defaultCorsPreflightOptions)
    }

    public fun defaultIntegration(block: IntegrationDsl.() -> Unit = {}) {
        val builder = IntegrationDsl()
        builder.apply(block)
        cdkBuilder.defaultIntegration(builder.build())
    }

    public fun defaultIntegration(defaultIntegration: Integration) {
        cdkBuilder.defaultIntegration(defaultIntegration)
    }

    public fun defaultMethodOptions(block: MethodOptionsDsl.() -> Unit = {}) {
        val builder = MethodOptionsDsl()
        builder.apply(block)
        cdkBuilder.defaultMethodOptions(builder.build())
    }

    public fun defaultMethodOptions(defaultMethodOptions: MethodOptions) {
        cdkBuilder.defaultMethodOptions(defaultMethodOptions)
    }

    public fun deploy(deploy: Boolean) {
        cdkBuilder.deploy(deploy)
    }

    public fun deployOptions(block: StageOptionsDsl.() -> Unit = {}) {
        val builder = StageOptionsDsl()
        builder.apply(block)
        cdkBuilder.deployOptions(builder.build())
    }

    public fun deployOptions(deployOptions: StageOptions) {
        cdkBuilder.deployOptions(deployOptions)
    }

    public fun description(description: String) {
        cdkBuilder.description(description)
    }

    public fun disableExecuteApiEndpoint(disableExecuteApiEndpoint: Boolean) {
        cdkBuilder.disableExecuteApiEndpoint(disableExecuteApiEndpoint)
    }

    public fun domainName(block: DomainNameOptionsDsl.() -> Unit = {}) {
        val builder = DomainNameOptionsDsl()
        builder.apply(block)
        cdkBuilder.domainName(builder.build())
    }

    public fun domainName(domainName: DomainNameOptions) {
        cdkBuilder.domainName(domainName)
    }

    public fun endpointConfiguration(block: EndpointConfigurationDsl.() -> Unit = {}) {
        val builder = EndpointConfigurationDsl()
        builder.apply(block)
        cdkBuilder.endpointConfiguration(builder.build())
    }

    public fun endpointConfiguration(endpointConfiguration: EndpointConfiguration) {
        cdkBuilder.endpointConfiguration(endpointConfiguration)
    }

    public fun endpointExportName(endpointExportName: String) {
        cdkBuilder.endpointExportName(endpointExportName)
    }

    public fun endpointTypes(vararg endpointTypes: EndpointType) {
        _endpointTypes.addAll(listOf(*endpointTypes))
    }

    public fun endpointTypes(endpointTypes: Collection<EndpointType>) {
        _endpointTypes.addAll(endpointTypes)
    }

    public fun failOnWarnings(failOnWarnings: Boolean) {
        cdkBuilder.failOnWarnings(failOnWarnings)
    }

    public fun minCompressionSize(minCompressionSize: Size) {
        cdkBuilder.minCompressionSize(minCompressionSize)
    }

    @Deprecated(message = "deprecated in CDK")
    public fun minimumCompressionSize(minimumCompressionSize: Number) {
        cdkBuilder.minimumCompressionSize(minimumCompressionSize)
    }

    public fun parameters(parameters: Map<String, String>) {
        cdkBuilder.parameters(parameters)
    }

    public fun policy(block: PolicyDocumentDsl.() -> Unit = {}) {
        val builder = PolicyDocumentDsl()
        builder.apply(block)
        cdkBuilder.policy(builder.build())
    }

    public fun policy(policy: PolicyDocument) {
        cdkBuilder.policy(policy)
    }

    public fun restApiName(restApiName: String) {
        cdkBuilder.restApiName(restApiName)
    }

    public fun retainDeployments(retainDeployments: Boolean) {
        cdkBuilder.retainDeployments(retainDeployments)
    }

    public fun build(): RestApiProps {
        if (_binaryMediaTypes.isNotEmpty()) cdkBuilder.binaryMediaTypes(_binaryMediaTypes)
        if (_endpointTypes.isNotEmpty()) cdkBuilder.endpointTypes(_endpointTypes)
        return cdkBuilder.build()
    }
}
