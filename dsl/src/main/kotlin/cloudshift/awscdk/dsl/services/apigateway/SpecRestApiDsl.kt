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
import software.amazon.awscdk.services.apigateway.ApiDefinition
import software.amazon.awscdk.services.apigateway.DomainNameOptions
import software.amazon.awscdk.services.apigateway.EndpointType
import software.amazon.awscdk.services.apigateway.SpecRestApi
import software.amazon.awscdk.services.apigateway.StageOptions
import software.amazon.awscdk.services.iam.PolicyDocument
import software.constructs.Construct
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.Map
import kotlin.collections.MutableList

@CdkDslMarker
public class SpecRestApiDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: SpecRestApi.Builder = SpecRestApi.Builder.create(scope, id)

    private val _endpointTypes: MutableList<EndpointType> = mutableListOf()

    public fun apiDefinition(apiDefinition: ApiDefinition) {
        cdkBuilder.apiDefinition(apiDefinition)
    }

    public fun cloudWatchRole(cloudWatchRole: Boolean) {
        cdkBuilder.cloudWatchRole(cloudWatchRole)
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

    public fun build(): SpecRestApi {
        if (_endpointTypes.isNotEmpty()) cdkBuilder.endpointTypes(_endpointTypes)
        return cdkBuilder.build()
    }
}
