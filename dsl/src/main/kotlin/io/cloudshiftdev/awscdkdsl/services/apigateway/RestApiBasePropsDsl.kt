@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION"
)

package io.cloudshiftdev.awscdkdsl.services.apigateway

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import io.cloudshiftdev.awscdkdsl.services.iam.PolicyDocumentDsl
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.Map
import kotlin.collections.MutableList
import software.amazon.awscdk.services.apigateway.DomainNameOptions
import software.amazon.awscdk.services.apigateway.EndpointType
import software.amazon.awscdk.services.apigateway.RestApiBaseProps
import software.amazon.awscdk.services.apigateway.StageOptions
import software.amazon.awscdk.services.iam.PolicyDocument

/**
 * Represents the props that all Rest APIs share.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.*;
 * import software.amazon.awscdk.services.apigateway.*;
 * import software.amazon.awscdk.services.certificatemanager.*;
 * import software.amazon.awscdk.services.iam.*;
 * import software.amazon.awscdk.services.s3.*;
 * IAccessLogDestination accessLogDestination;
 * AccessLogFormat accessLogFormat;
 * Bucket bucket;
 * Certificate certificate;
 * PolicyDocument policyDocument;
 * RestApiBaseProps restApiBaseProps = RestApiBaseProps.builder()
 * .cloudWatchRole(false)
 * .deploy(false)
 * .deployOptions(StageOptions.builder()
 * .accessLogDestination(accessLogDestination)
 * .accessLogFormat(accessLogFormat)
 * .cacheClusterEnabled(false)
 * .cacheClusterSize("cacheClusterSize")
 * .cacheDataEncrypted(false)
 * .cacheTtl(Duration.minutes(30))
 * .cachingEnabled(false)
 * .clientCertificateId("clientCertificateId")
 * .dataTraceEnabled(false)
 * .description("description")
 * .documentationVersion("documentationVersion")
 * .loggingLevel(MethodLoggingLevel.OFF)
 * .methodOptions(Map.of(
 * "methodOptionsKey", MethodDeploymentOptions.builder()
 * .cacheDataEncrypted(false)
 * .cacheTtl(Duration.minutes(30))
 * .cachingEnabled(false)
 * .dataTraceEnabled(false)
 * .loggingLevel(MethodLoggingLevel.OFF)
 * .metricsEnabled(false)
 * .throttlingBurstLimit(123)
 * .throttlingRateLimit(123)
 * .build()))
 * .metricsEnabled(false)
 * .stageName("stageName")
 * .throttlingBurstLimit(123)
 * .throttlingRateLimit(123)
 * .tracingEnabled(false)
 * .variables(Map.of(
 * "variablesKey", "variables"))
 * .build())
 * .description("description")
 * .disableExecuteApiEndpoint(false)
 * .domainName(DomainNameOptions.builder()
 * .certificate(certificate)
 * .domainName("domainName")
 * // the properties below are optional
 * .basePath("basePath")
 * .endpointType(EndpointType.EDGE)
 * .mtls(MTLSConfig.builder()
 * .bucket(bucket)
 * .key("key")
 * // the properties below are optional
 * .version("version")
 * .build())
 * .securityPolicy(SecurityPolicy.TLS_1_0)
 * .build())
 * .endpointExportName("endpointExportName")
 * .endpointTypes(List.of(EndpointType.EDGE))
 * .failOnWarnings(false)
 * .parameters(Map.of(
 * "parametersKey", "parameters"))
 * .policy(policyDocument)
 * .restApiName("restApiName")
 * .retainDeployments(false)
 * .build();
 * ```
 */
@CdkDslMarker
public class RestApiBasePropsDsl {
    private val cdkBuilder: RestApiBaseProps.Builder = RestApiBaseProps.builder()

    private val _endpointTypes: MutableList<EndpointType> = mutableListOf()

    /** @param cloudWatchRole Automatically configure an AWS CloudWatch role for API Gateway. */
    public fun cloudWatchRole(cloudWatchRole: Boolean) {
        cdkBuilder.cloudWatchRole(cloudWatchRole)
    }

    /**
     * @param deploy Indicates if a Deployment should be automatically created for this API, and
     *   recreated when the API model (resources, methods) changes. Since API Gateway deployments
     *   are immutable, When this option is enabled (by default), an AWS::ApiGateway::Deployment
     *   resource will automatically created with a logical ID that hashes the API model (methods,
     *   resources and options). This means that when the model changes, the logical ID of this
     *   CloudFormation resource will change, and a new deployment will be created.
     *
     * If this is set, `latestDeployment` will refer to the `Deployment` object and
     * `deploymentStage` will refer to a `Stage` that points to this deployment. To customize the
     * stage options, use the `deployOptions` property.
     *
     * A CloudFormation Output will also be defined with the root URL endpoint of this REST API.
     */
    public fun deploy(deploy: Boolean) {
        cdkBuilder.deploy(deploy)
    }

    /**
     * @param deployOptions Options for the API Gateway stage that will always point to the latest
     *   deployment when `deploy` is enabled. If `deploy` is disabled, this value cannot be set.
     */
    public fun deployOptions(deployOptions: StageOptionsDsl.() -> Unit = {}) {
        val builder = StageOptionsDsl()
        builder.apply(deployOptions)
        cdkBuilder.deployOptions(builder.build())
    }

    /**
     * @param deployOptions Options for the API Gateway stage that will always point to the latest
     *   deployment when `deploy` is enabled. If `deploy` is disabled, this value cannot be set.
     */
    public fun deployOptions(deployOptions: StageOptions) {
        cdkBuilder.deployOptions(deployOptions)
    }

    /** @param description A description of the RestApi construct. */
    public fun description(description: String) {
        cdkBuilder.description(description)
    }

    /**
     * @param disableExecuteApiEndpoint Specifies whether clients can invoke the API using the
     *   default execute-api endpoint. To require that clients use a custom domain name to invoke
     *   the API, disable the default endpoint.
     */
    public fun disableExecuteApiEndpoint(disableExecuteApiEndpoint: Boolean) {
        cdkBuilder.disableExecuteApiEndpoint(disableExecuteApiEndpoint)
    }

    /** @param domainName Configure a custom domain name and map it to this API. */
    public fun domainName(domainName: DomainNameOptionsDsl.() -> Unit = {}) {
        val builder = DomainNameOptionsDsl()
        builder.apply(domainName)
        cdkBuilder.domainName(builder.build())
    }

    /** @param domainName Configure a custom domain name and map it to this API. */
    public fun domainName(domainName: DomainNameOptions) {
        cdkBuilder.domainName(domainName)
    }

    /** @param endpointExportName Export name for the CfnOutput containing the API endpoint. */
    public fun endpointExportName(endpointExportName: String) {
        cdkBuilder.endpointExportName(endpointExportName)
    }

    /**
     * @param endpointTypes A list of the endpoint types of the API. Use this property when creating
     *   an API.
     */
    public fun endpointTypes(vararg endpointTypes: EndpointType) {
        _endpointTypes.addAll(listOf(*endpointTypes))
    }

    /**
     * @param endpointTypes A list of the endpoint types of the API. Use this property when creating
     *   an API.
     */
    public fun endpointTypes(endpointTypes: Collection<EndpointType>) {
        _endpointTypes.addAll(endpointTypes)
    }

    /**
     * @param failOnWarnings Indicates whether to roll back the resource if a warning occurs while
     *   API Gateway is creating the RestApi resource.
     */
    public fun failOnWarnings(failOnWarnings: Boolean) {
        cdkBuilder.failOnWarnings(failOnWarnings)
    }

    /** @param parameters Custom header parameters for the request. */
    public fun parameters(parameters: Map<String, String>) {
        cdkBuilder.parameters(parameters)
    }

    /** @param policy A policy document that contains the permissions for this RestApi. */
    public fun policy(policy: PolicyDocumentDsl.() -> Unit = {}) {
        val builder = PolicyDocumentDsl()
        builder.apply(policy)
        cdkBuilder.policy(builder.build())
    }

    /** @param policy A policy document that contains the permissions for this RestApi. */
    public fun policy(policy: PolicyDocument) {
        cdkBuilder.policy(policy)
    }

    /** @param restApiName A name for the API Gateway RestApi resource. */
    public fun restApiName(restApiName: String) {
        cdkBuilder.restApiName(restApiName)
    }

    /**
     * @param retainDeployments Retains old deployment resources when the API changes. This allows
     *   manually reverting stages to point to old deployments via the AWS Console.
     */
    public fun retainDeployments(retainDeployments: Boolean) {
        cdkBuilder.retainDeployments(retainDeployments)
    }

    public fun build(): RestApiBaseProps {
        if (_endpointTypes.isNotEmpty()) cdkBuilder.endpointTypes(_endpointTypes)
        return cdkBuilder.build()
    }
}
