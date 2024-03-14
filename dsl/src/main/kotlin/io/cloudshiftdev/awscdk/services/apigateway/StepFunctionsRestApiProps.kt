package io.cloudshiftdev.awscdk.services.apigateway

import io.cloudshiftdev.awscdk.CdkObject
import io.cloudshiftdev.awscdk.RemovalPolicy
import io.cloudshiftdev.awscdk.Size
import io.cloudshiftdev.awscdk.common.CdkDslMarker
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

public interface StepFunctionsRestApiProps : RestApiProps {
  /**
   * If the whole authorizer object, including custom context values should be in the execution
   * input.
   *
   * The execution input will include a new key `authorizer`:
   *
   * {
   * "body": {},
   * "authorizer": {
   * "key": "value"
   * }
   * }
   *
   * Default: false
   */
  public fun authorizer(): Boolean? = unwrap(this).getAuthorizer()

  /**
   * Check if header is to be included inside the execution input.
   *
   * The execution input will include a new key `headers`:
   *
   * {
   * "body": {},
   * "headers": {
   * "header1": "value",
   * "header2": "value"
   * }
   * }
   *
   * Default: false
   */
  public fun headers(): Boolean? = unwrap(this).getHeaders()

  /**
   * Check if path is to be included inside the execution input.
   *
   * The execution input will include a new key `path`:
   *
   * {
   * "body": {},
   * "path": {
   * "resourceName": "resourceValue"
   * }
   * }
   *
   * Default: true
   */
  public fun path(): Boolean? = unwrap(this).getPath()

  /**
   * Check if querystring is to be included inside the execution input.
   *
   * The execution input will include a new key `queryString`:
   *
   * {
   * "body": {},
   * "querystring": {
   * "key": "value"
   * }
   * }
   *
   * Default: true
   */
  public fun querystring(): Boolean? = unwrap(this).getQuerystring()

  /**
   * Which details of the incoming request must be passed onto the underlying state machine, such
   * as, account id, user identity, request id, etc.
   *
   * The execution input will include a new key `requestContext`:
   *
   * {
   * "body": {},
   * "requestContext": {
   * "key": "value"
   * }
   * }
   *
   * Default: - all parameters within request context will be set as false
   */
  public fun requestContext(): RequestContext? =
      unwrap(this).getRequestContext()?.let(RequestContext::wrap)

  /**
   * An IAM role that API Gateway will assume to start the execution of the state machine.
   *
   * Default: - a new role is created
   */
  public fun role(): IRole? = unwrap(this).getRole()?.let(IRole::wrap)

  /**
   * The default State Machine that handles all requests from this API.
   *
   * This stateMachine will be used as a the default integration for all methods in
   * this API, unless specified otherwise in `addMethod`.
   */
  public fun stateMachine(): IStateMachine

  /**
   * Whether to add default response models with 200, 400, and 500 status codes to the method.
   *
   * Default: true
   */
  public fun useDefaultMethodResponses(): Boolean? = unwrap(this).getUseDefaultMethodResponses()

  /**
   * A builder for [StepFunctionsRestApiProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param apiKeySourceType The source of the API key for metering requests according to a usage
     * plan.
     */
    public fun apiKeySourceType(apiKeySourceType: ApiKeySourceType)

    /**
     * @param authorizer If the whole authorizer object, including custom context values should be
     * in the execution input.
     * The execution input will include a new key `authorizer`:
     *
     * {
     * "body": {},
     * "authorizer": {
     * "key": "value"
     * }
     * }
     */
    public fun authorizer(authorizer: Boolean)

    /**
     * @param binaryMediaTypes The list of binary media mime-types that are supported by the RestApi
     * resource, such as "image/png" or "application/octet-stream".
     */
    public fun binaryMediaTypes(binaryMediaTypes: List<String>)

    /**
     * @param binaryMediaTypes The list of binary media mime-types that are supported by the RestApi
     * resource, such as "image/png" or "application/octet-stream".
     */
    public fun binaryMediaTypes(vararg binaryMediaTypes: String)

    /**
     * @param cloneFrom The ID of the API Gateway RestApi resource that you want to clone.
     */
    public fun cloneFrom(cloneFrom: IRestApi)

    /**
     * @param cloudWatchRole Automatically configure an AWS CloudWatch role for API Gateway.
     */
    public fun cloudWatchRole(cloudWatchRole: Boolean)

    /**
     * @param cloudWatchRoleRemovalPolicy The removal policy applied to the AWS CloudWatch role when
     * this resource is removed from the application.
     * Requires `cloudWatchRole` to be enabled.
     */
    public fun cloudWatchRoleRemovalPolicy(cloudWatchRoleRemovalPolicy: RemovalPolicy)

    /**
     * @param defaultCorsPreflightOptions Adds a CORS preflight OPTIONS method to this resource and
     * all child resources.
     * You can add CORS at the resource-level using `addCorsPreflight`.
     */
    public fun defaultCorsPreflightOptions(defaultCorsPreflightOptions: CorsOptions)

    /**
     * @param defaultCorsPreflightOptions Adds a CORS preflight OPTIONS method to this resource and
     * all child resources.
     * You can add CORS at the resource-level using `addCorsPreflight`.
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("5c6767383fd7822efbbc9d4035faf3b8a350830adb3f9b12fd71cba703c26897")
    public
        fun defaultCorsPreflightOptions(defaultCorsPreflightOptions: CorsOptions.Builder.() -> Unit)

    /**
     * @param defaultIntegration An integration to use as a default for all methods created within
     * this API unless an integration is specified.
     */
    public fun defaultIntegration(defaultIntegration: Integration)

    /**
     * @param defaultIntegration An integration to use as a default for all methods created within
     * this API unless an integration is specified.
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("76529d5521e4ad2734913cf282c769b5a9af3273f8a03f170e3f246beab5c665")
    public fun defaultIntegration(defaultIntegration: Integration.Builder.() -> Unit)

    /**
     * @param defaultMethodOptions Method options to use as a default for all methods created within
     * this API unless custom options are specified.
     */
    public fun defaultMethodOptions(defaultMethodOptions: MethodOptions)

    /**
     * @param defaultMethodOptions Method options to use as a default for all methods created within
     * this API unless custom options are specified.
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("30e96d77a1d6a860222d7fc5cdea422b30a98ccc7a3959af2c912b889e6c797c")
    public fun defaultMethodOptions(defaultMethodOptions: MethodOptions.Builder.() -> Unit)

    /**
     * @param deploy Indicates if a Deployment should be automatically created for this API, and
     * recreated when the API model (resources, methods) changes.
     * Since API Gateway deployments are immutable, When this option is enabled
     * (by default), an AWS::ApiGateway::Deployment resource will automatically
     * created with a logical ID that hashes the API model (methods, resources
     * and options). This means that when the model changes, the logical ID of
     * this CloudFormation resource will change, and a new deployment will be
     * created.
     *
     * If this is set, `latestDeployment` will refer to the `Deployment` object
     * and `deploymentStage` will refer to a `Stage` that points to this
     * deployment. To customize the stage options, use the `deployOptions`
     * property.
     *
     * A CloudFormation Output will also be defined with the root URL endpoint
     * of this REST API.
     */
    public fun deploy(deploy: Boolean)

    /**
     * @param deployOptions Options for the API Gateway stage that will always point to the latest
     * deployment when `deploy` is enabled.
     * If `deploy` is disabled,
     * this value cannot be set.
     */
    public fun deployOptions(deployOptions: StageOptions)

    /**
     * @param deployOptions Options for the API Gateway stage that will always point to the latest
     * deployment when `deploy` is enabled.
     * If `deploy` is disabled,
     * this value cannot be set.
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("4084918fa4b4898392472aa6b5cad83d35524f7d6c7ae585d33e3d6f1f4cc4df")
    public fun deployOptions(deployOptions: StageOptions.Builder.() -> Unit)

    /**
     * @param description A description of the RestApi construct.
     */
    public fun description(description: String)

    /**
     * @param disableExecuteApiEndpoint Specifies whether clients can invoke the API using the
     * default execute-api endpoint.
     * To require that clients use a custom domain name to invoke the
     * API, disable the default endpoint.
     */
    public fun disableExecuteApiEndpoint(disableExecuteApiEndpoint: Boolean)

    /**
     * @param domainName Configure a custom domain name and map it to this API.
     */
    public fun domainName(domainName: DomainNameOptions)

    /**
     * @param domainName Configure a custom domain name and map it to this API.
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("d8e2bec93d4c9693ff7ea25a9cb3976d10e019fc4ec116c79861afbf4b929e9e")
    public fun domainName(domainName: DomainNameOptions.Builder.() -> Unit)

    /**
     * @param endpointConfiguration The EndpointConfiguration property type specifies the endpoint
     * types of a REST API.
     */
    public fun endpointConfiguration(endpointConfiguration: EndpointConfiguration)

    /**
     * @param endpointConfiguration The EndpointConfiguration property type specifies the endpoint
     * types of a REST API.
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("68ffc21e564b11ae20628f10c5cdcf77e3b458a1ae3f90f4d711ac76f8f6d072")
    public
        fun endpointConfiguration(endpointConfiguration: EndpointConfiguration.Builder.() -> Unit)

    /**
     * @param endpointExportName Export name for the CfnOutput containing the API endpoint.
     */
    public fun endpointExportName(endpointExportName: String)

    /**
     * @param endpointTypes A list of the endpoint types of the API.
     * Use this property when creating
     * an API.
     */
    public fun endpointTypes(endpointTypes: List<EndpointType>)

    /**
     * @param endpointTypes A list of the endpoint types of the API.
     * Use this property when creating
     * an API.
     */
    public fun endpointTypes(vararg endpointTypes: EndpointType)

    /**
     * @param failOnWarnings Indicates whether to roll back the resource if a warning occurs while
     * API Gateway is creating the RestApi resource.
     */
    public fun failOnWarnings(failOnWarnings: Boolean)

    /**
     * @param headers Check if header is to be included inside the execution input.
     * The execution input will include a new key `headers`:
     *
     * {
     * "body": {},
     * "headers": {
     * "header1": "value",
     * "header2": "value"
     * }
     * }
     */
    public fun headers(headers: Boolean)

    /**
     * @param minCompressionSize A Size(in bytes, kibibytes, mebibytes etc) that is used to enable
     * compression (with non-negative between 0 and 10485760 (10M) bytes, inclusive) or disable
     * compression (when undefined) on an API.
     * When compression is enabled, compression or
     * decompression is not applied on the payload if the payload size is
     * smaller than this value. Setting it to zero allows compression for any
     * payload size.
     */
    public fun minCompressionSize(minCompressionSize: Size)

    /**
     * @param minimumCompressionSize A nullable integer that is used to enable compression (with
     * non-negative between 0 and 10485760 (10M) bytes, inclusive) or disable compression (when
     * undefined) on an API.
     * When compression is enabled, compression or
     * decompression is not applied on the payload if the payload size is
     * smaller than this value. Setting it to zero allows compression for any
     * payload size.
     * @deprecated - superseded by `minCompressionSize`
     */
    @Deprecated(message = "deprecated in CDK")
    public fun minimumCompressionSize(minimumCompressionSize: Number)

    /**
     * @param parameters Custom header parameters for the request.
     */
    public fun parameters(parameters: Map<String, String>)

    /**
     * @param path Check if path is to be included inside the execution input.
     * The execution input will include a new key `path`:
     *
     * {
     * "body": {},
     * "path": {
     * "resourceName": "resourceValue"
     * }
     * }
     */
    public fun path(path: Boolean)

    /**
     * @param policy A policy document that contains the permissions for this RestApi.
     */
    public fun policy(policy: PolicyDocument)

    /**
     * @param policy A policy document that contains the permissions for this RestApi.
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("4128dddb29cc86321368c67eade7ef36f9e992ebf2192c37cdf538417ecc0c18")
    public fun policy(policy: PolicyDocument.Builder.() -> Unit)

    /**
     * @param querystring Check if querystring is to be included inside the execution input.
     * The execution input will include a new key `queryString`:
     *
     * {
     * "body": {},
     * "querystring": {
     * "key": "value"
     * }
     * }
     */
    public fun querystring(querystring: Boolean)

    /**
     * @param requestContext Which details of the incoming request must be passed onto the
     * underlying state machine, such as, account id, user identity, request id, etc.
     * The execution input will include a new key `requestContext`:
     *
     * {
     * "body": {},
     * "requestContext": {
     * "key": "value"
     * }
     * }
     */
    public fun requestContext(requestContext: RequestContext)

    /**
     * @param requestContext Which details of the incoming request must be passed onto the
     * underlying state machine, such as, account id, user identity, request id, etc.
     * The execution input will include a new key `requestContext`:
     *
     * {
     * "body": {},
     * "requestContext": {
     * "key": "value"
     * }
     * }
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("160966ae644376f216e3aa1938a4f69d16fe594e4b7244269abad4446f33ace2")
    public fun requestContext(requestContext: RequestContext.Builder.() -> Unit)

    /**
     * @param restApiName A name for the API Gateway RestApi resource.
     */
    public fun restApiName(restApiName: String)

    /**
     * @param retainDeployments Retains old deployment resources when the API changes.
     * This allows
     * manually reverting stages to point to old deployments via the AWS
     * Console.
     */
    public fun retainDeployments(retainDeployments: Boolean)

    /**
     * @param role An IAM role that API Gateway will assume to start the execution of the state
     * machine.
     */
    public fun role(role: IRole)

    /**
     * @param stateMachine The default State Machine that handles all requests from this API. 
     * This stateMachine will be used as a the default integration for all methods in
     * this API, unless specified otherwise in `addMethod`.
     */
    public fun stateMachine(stateMachine: IStateMachine)

    /**
     * @param useDefaultMethodResponses Whether to add default response models with 200, 400, and
     * 500 status codes to the method.
     */
    public fun useDefaultMethodResponses(useDefaultMethodResponses: Boolean)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.apigateway.StepFunctionsRestApiProps.Builder =
        software.amazon.awscdk.services.apigateway.StepFunctionsRestApiProps.builder()

    /**
     * @param apiKeySourceType The source of the API key for metering requests according to a usage
     * plan.
     */
    override fun apiKeySourceType(apiKeySourceType: ApiKeySourceType) {
      cdkBuilder.apiKeySourceType(apiKeySourceType.let(ApiKeySourceType::unwrap))
    }

    /**
     * @param authorizer If the whole authorizer object, including custom context values should be
     * in the execution input.
     * The execution input will include a new key `authorizer`:
     *
     * {
     * "body": {},
     * "authorizer": {
     * "key": "value"
     * }
     * }
     */
    override fun authorizer(authorizer: Boolean) {
      cdkBuilder.authorizer(authorizer)
    }

    /**
     * @param binaryMediaTypes The list of binary media mime-types that are supported by the RestApi
     * resource, such as "image/png" or "application/octet-stream".
     */
    override fun binaryMediaTypes(binaryMediaTypes: List<String>) {
      cdkBuilder.binaryMediaTypes(binaryMediaTypes)
    }

    /**
     * @param binaryMediaTypes The list of binary media mime-types that are supported by the RestApi
     * resource, such as "image/png" or "application/octet-stream".
     */
    override fun binaryMediaTypes(vararg binaryMediaTypes: String): Unit =
        binaryMediaTypes(binaryMediaTypes.toList())

    /**
     * @param cloneFrom The ID of the API Gateway RestApi resource that you want to clone.
     */
    override fun cloneFrom(cloneFrom: IRestApi) {
      cdkBuilder.cloneFrom(cloneFrom.let(IRestApi::unwrap))
    }

    /**
     * @param cloudWatchRole Automatically configure an AWS CloudWatch role for API Gateway.
     */
    override fun cloudWatchRole(cloudWatchRole: Boolean) {
      cdkBuilder.cloudWatchRole(cloudWatchRole)
    }

    /**
     * @param cloudWatchRoleRemovalPolicy The removal policy applied to the AWS CloudWatch role when
     * this resource is removed from the application.
     * Requires `cloudWatchRole` to be enabled.
     */
    override fun cloudWatchRoleRemovalPolicy(cloudWatchRoleRemovalPolicy: RemovalPolicy) {
      cdkBuilder.cloudWatchRoleRemovalPolicy(cloudWatchRoleRemovalPolicy.let(RemovalPolicy::unwrap))
    }

    /**
     * @param defaultCorsPreflightOptions Adds a CORS preflight OPTIONS method to this resource and
     * all child resources.
     * You can add CORS at the resource-level using `addCorsPreflight`.
     */
    override fun defaultCorsPreflightOptions(defaultCorsPreflightOptions: CorsOptions) {
      cdkBuilder.defaultCorsPreflightOptions(defaultCorsPreflightOptions.let(CorsOptions::unwrap))
    }

    /**
     * @param defaultCorsPreflightOptions Adds a CORS preflight OPTIONS method to this resource and
     * all child resources.
     * You can add CORS at the resource-level using `addCorsPreflight`.
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("5c6767383fd7822efbbc9d4035faf3b8a350830adb3f9b12fd71cba703c26897")
    override
        fun defaultCorsPreflightOptions(defaultCorsPreflightOptions: CorsOptions.Builder.() -> Unit):
        Unit = defaultCorsPreflightOptions(CorsOptions(defaultCorsPreflightOptions))

    /**
     * @param defaultIntegration An integration to use as a default for all methods created within
     * this API unless an integration is specified.
     */
    override fun defaultIntegration(defaultIntegration: Integration) {
      cdkBuilder.defaultIntegration(defaultIntegration.let(Integration::unwrap))
    }

    /**
     * @param defaultIntegration An integration to use as a default for all methods created within
     * this API unless an integration is specified.
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("76529d5521e4ad2734913cf282c769b5a9af3273f8a03f170e3f246beab5c665")
    override fun defaultIntegration(defaultIntegration: Integration.Builder.() -> Unit): Unit =
        defaultIntegration(Integration(defaultIntegration))

    /**
     * @param defaultMethodOptions Method options to use as a default for all methods created within
     * this API unless custom options are specified.
     */
    override fun defaultMethodOptions(defaultMethodOptions: MethodOptions) {
      cdkBuilder.defaultMethodOptions(defaultMethodOptions.let(MethodOptions::unwrap))
    }

    /**
     * @param defaultMethodOptions Method options to use as a default for all methods created within
     * this API unless custom options are specified.
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("30e96d77a1d6a860222d7fc5cdea422b30a98ccc7a3959af2c912b889e6c797c")
    override fun defaultMethodOptions(defaultMethodOptions: MethodOptions.Builder.() -> Unit): Unit
        = defaultMethodOptions(MethodOptions(defaultMethodOptions))

    /**
     * @param deploy Indicates if a Deployment should be automatically created for this API, and
     * recreated when the API model (resources, methods) changes.
     * Since API Gateway deployments are immutable, When this option is enabled
     * (by default), an AWS::ApiGateway::Deployment resource will automatically
     * created with a logical ID that hashes the API model (methods, resources
     * and options). This means that when the model changes, the logical ID of
     * this CloudFormation resource will change, and a new deployment will be
     * created.
     *
     * If this is set, `latestDeployment` will refer to the `Deployment` object
     * and `deploymentStage` will refer to a `Stage` that points to this
     * deployment. To customize the stage options, use the `deployOptions`
     * property.
     *
     * A CloudFormation Output will also be defined with the root URL endpoint
     * of this REST API.
     */
    override fun deploy(deploy: Boolean) {
      cdkBuilder.deploy(deploy)
    }

    /**
     * @param deployOptions Options for the API Gateway stage that will always point to the latest
     * deployment when `deploy` is enabled.
     * If `deploy` is disabled,
     * this value cannot be set.
     */
    override fun deployOptions(deployOptions: StageOptions) {
      cdkBuilder.deployOptions(deployOptions.let(StageOptions::unwrap))
    }

    /**
     * @param deployOptions Options for the API Gateway stage that will always point to the latest
     * deployment when `deploy` is enabled.
     * If `deploy` is disabled,
     * this value cannot be set.
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("4084918fa4b4898392472aa6b5cad83d35524f7d6c7ae585d33e3d6f1f4cc4df")
    override fun deployOptions(deployOptions: StageOptions.Builder.() -> Unit): Unit =
        deployOptions(StageOptions(deployOptions))

    /**
     * @param description A description of the RestApi construct.
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * @param disableExecuteApiEndpoint Specifies whether clients can invoke the API using the
     * default execute-api endpoint.
     * To require that clients use a custom domain name to invoke the
     * API, disable the default endpoint.
     */
    override fun disableExecuteApiEndpoint(disableExecuteApiEndpoint: Boolean) {
      cdkBuilder.disableExecuteApiEndpoint(disableExecuteApiEndpoint)
    }

    /**
     * @param domainName Configure a custom domain name and map it to this API.
     */
    override fun domainName(domainName: DomainNameOptions) {
      cdkBuilder.domainName(domainName.let(DomainNameOptions::unwrap))
    }

    /**
     * @param domainName Configure a custom domain name and map it to this API.
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("d8e2bec93d4c9693ff7ea25a9cb3976d10e019fc4ec116c79861afbf4b929e9e")
    override fun domainName(domainName: DomainNameOptions.Builder.() -> Unit): Unit =
        domainName(DomainNameOptions(domainName))

    /**
     * @param endpointConfiguration The EndpointConfiguration property type specifies the endpoint
     * types of a REST API.
     */
    override fun endpointConfiguration(endpointConfiguration: EndpointConfiguration) {
      cdkBuilder.endpointConfiguration(endpointConfiguration.let(EndpointConfiguration::unwrap))
    }

    /**
     * @param endpointConfiguration The EndpointConfiguration property type specifies the endpoint
     * types of a REST API.
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("68ffc21e564b11ae20628f10c5cdcf77e3b458a1ae3f90f4d711ac76f8f6d072")
    override
        fun endpointConfiguration(endpointConfiguration: EndpointConfiguration.Builder.() -> Unit):
        Unit = endpointConfiguration(EndpointConfiguration(endpointConfiguration))

    /**
     * @param endpointExportName Export name for the CfnOutput containing the API endpoint.
     */
    override fun endpointExportName(endpointExportName: String) {
      cdkBuilder.endpointExportName(endpointExportName)
    }

    /**
     * @param endpointTypes A list of the endpoint types of the API.
     * Use this property when creating
     * an API.
     */
    override fun endpointTypes(endpointTypes: List<EndpointType>) {
      cdkBuilder.endpointTypes(endpointTypes.map(EndpointType::unwrap))
    }

    /**
     * @param endpointTypes A list of the endpoint types of the API.
     * Use this property when creating
     * an API.
     */
    override fun endpointTypes(vararg endpointTypes: EndpointType): Unit =
        endpointTypes(endpointTypes.toList())

    /**
     * @param failOnWarnings Indicates whether to roll back the resource if a warning occurs while
     * API Gateway is creating the RestApi resource.
     */
    override fun failOnWarnings(failOnWarnings: Boolean) {
      cdkBuilder.failOnWarnings(failOnWarnings)
    }

    /**
     * @param headers Check if header is to be included inside the execution input.
     * The execution input will include a new key `headers`:
     *
     * {
     * "body": {},
     * "headers": {
     * "header1": "value",
     * "header2": "value"
     * }
     * }
     */
    override fun headers(headers: Boolean) {
      cdkBuilder.headers(headers)
    }

    /**
     * @param minCompressionSize A Size(in bytes, kibibytes, mebibytes etc) that is used to enable
     * compression (with non-negative between 0 and 10485760 (10M) bytes, inclusive) or disable
     * compression (when undefined) on an API.
     * When compression is enabled, compression or
     * decompression is not applied on the payload if the payload size is
     * smaller than this value. Setting it to zero allows compression for any
     * payload size.
     */
    override fun minCompressionSize(minCompressionSize: Size) {
      cdkBuilder.minCompressionSize(minCompressionSize.let(Size::unwrap))
    }

    /**
     * @param minimumCompressionSize A nullable integer that is used to enable compression (with
     * non-negative between 0 and 10485760 (10M) bytes, inclusive) or disable compression (when
     * undefined) on an API.
     * When compression is enabled, compression or
     * decompression is not applied on the payload if the payload size is
     * smaller than this value. Setting it to zero allows compression for any
     * payload size.
     * @deprecated - superseded by `minCompressionSize`
     */
    @Deprecated(message = "deprecated in CDK")
    override fun minimumCompressionSize(minimumCompressionSize: Number) {
      cdkBuilder.minimumCompressionSize(minimumCompressionSize)
    }

    /**
     * @param parameters Custom header parameters for the request.
     */
    override fun parameters(parameters: Map<String, String>) {
      cdkBuilder.parameters(parameters)
    }

    /**
     * @param path Check if path is to be included inside the execution input.
     * The execution input will include a new key `path`:
     *
     * {
     * "body": {},
     * "path": {
     * "resourceName": "resourceValue"
     * }
     * }
     */
    override fun path(path: Boolean) {
      cdkBuilder.path(path)
    }

    /**
     * @param policy A policy document that contains the permissions for this RestApi.
     */
    override fun policy(policy: PolicyDocument) {
      cdkBuilder.policy(policy.let(PolicyDocument::unwrap))
    }

    /**
     * @param policy A policy document that contains the permissions for this RestApi.
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("4128dddb29cc86321368c67eade7ef36f9e992ebf2192c37cdf538417ecc0c18")
    override fun policy(policy: PolicyDocument.Builder.() -> Unit): Unit =
        policy(PolicyDocument(policy))

    /**
     * @param querystring Check if querystring is to be included inside the execution input.
     * The execution input will include a new key `queryString`:
     *
     * {
     * "body": {},
     * "querystring": {
     * "key": "value"
     * }
     * }
     */
    override fun querystring(querystring: Boolean) {
      cdkBuilder.querystring(querystring)
    }

    /**
     * @param requestContext Which details of the incoming request must be passed onto the
     * underlying state machine, such as, account id, user identity, request id, etc.
     * The execution input will include a new key `requestContext`:
     *
     * {
     * "body": {},
     * "requestContext": {
     * "key": "value"
     * }
     * }
     */
    override fun requestContext(requestContext: RequestContext) {
      cdkBuilder.requestContext(requestContext.let(RequestContext::unwrap))
    }

    /**
     * @param requestContext Which details of the incoming request must be passed onto the
     * underlying state machine, such as, account id, user identity, request id, etc.
     * The execution input will include a new key `requestContext`:
     *
     * {
     * "body": {},
     * "requestContext": {
     * "key": "value"
     * }
     * }
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("160966ae644376f216e3aa1938a4f69d16fe594e4b7244269abad4446f33ace2")
    override fun requestContext(requestContext: RequestContext.Builder.() -> Unit): Unit =
        requestContext(RequestContext(requestContext))

    /**
     * @param restApiName A name for the API Gateway RestApi resource.
     */
    override fun restApiName(restApiName: String) {
      cdkBuilder.restApiName(restApiName)
    }

    /**
     * @param retainDeployments Retains old deployment resources when the API changes.
     * This allows
     * manually reverting stages to point to old deployments via the AWS
     * Console.
     */
    override fun retainDeployments(retainDeployments: Boolean) {
      cdkBuilder.retainDeployments(retainDeployments)
    }

    /**
     * @param role An IAM role that API Gateway will assume to start the execution of the state
     * machine.
     */
    override fun role(role: IRole) {
      cdkBuilder.role(role.let(IRole::unwrap))
    }

    /**
     * @param stateMachine The default State Machine that handles all requests from this API. 
     * This stateMachine will be used as a the default integration for all methods in
     * this API, unless specified otherwise in `addMethod`.
     */
    override fun stateMachine(stateMachine: IStateMachine) {
      cdkBuilder.stateMachine(stateMachine.let(IStateMachine::unwrap))
    }

    /**
     * @param useDefaultMethodResponses Whether to add default response models with 200, 400, and
     * 500 status codes to the method.
     */
    override fun useDefaultMethodResponses(useDefaultMethodResponses: Boolean) {
      cdkBuilder.useDefaultMethodResponses(useDefaultMethodResponses)
    }

    public fun build(): software.amazon.awscdk.services.apigateway.StepFunctionsRestApiProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.apigateway.StepFunctionsRestApiProps,
  ) : CdkObject(cdkObject), StepFunctionsRestApiProps {
    /**
     * The source of the API key for metering requests according to a usage plan.
     *
     * Default: - Metering is disabled.
     */
    override fun apiKeySourceType(): ApiKeySourceType? =
        unwrap(this).getApiKeySourceType()?.let(ApiKeySourceType::wrap)

    /**
     * If the whole authorizer object, including custom context values should be in the execution
     * input.
     *
     * The execution input will include a new key `authorizer`:
     *
     * {
     * "body": {},
     * "authorizer": {
     * "key": "value"
     * }
     * }
     *
     * Default: false
     */
    override fun authorizer(): Boolean? = unwrap(this).getAuthorizer()

    /**
     * The list of binary media mime-types that are supported by the RestApi resource, such as
     * "image/png" or "application/octet-stream".
     *
     * Default: - RestApi supports only UTF-8-encoded text payloads.
     */
    override fun binaryMediaTypes(): List<String> = unwrap(this).getBinaryMediaTypes() ?:
        emptyList()

    /**
     * The ID of the API Gateway RestApi resource that you want to clone.
     *
     * Default: - None.
     */
    override fun cloneFrom(): IRestApi? = unwrap(this).getCloneFrom()?.let(IRestApi::wrap)

    /**
     * Automatically configure an AWS CloudWatch role for API Gateway.
     *
     * Default: - false if `@aws-cdk/aws-apigateway:disableCloudWatchRole` is enabled, true
     * otherwise
     */
    override fun cloudWatchRole(): Boolean? = unwrap(this).getCloudWatchRole()

    /**
     * The removal policy applied to the AWS CloudWatch role when this resource is removed from the
     * application.
     *
     * Requires `cloudWatchRole` to be enabled.
     *
     * Default: - RemovalPolicy.RETAIN
     */
    override fun cloudWatchRoleRemovalPolicy(): RemovalPolicy? =
        unwrap(this).getCloudWatchRoleRemovalPolicy()?.let(RemovalPolicy::wrap)

    /**
     * Adds a CORS preflight OPTIONS method to this resource and all child resources.
     *
     * You can add CORS at the resource-level using `addCorsPreflight`.
     *
     * Default: - CORS is disabled
     */
    override fun defaultCorsPreflightOptions(): CorsOptions? =
        unwrap(this).getDefaultCorsPreflightOptions()?.let(CorsOptions::wrap)

    /**
     * An integration to use as a default for all methods created within this API unless an
     * integration is specified.
     *
     * Default: - Inherited from parent.
     */
    override fun defaultIntegration(): Integration? =
        unwrap(this).getDefaultIntegration()?.let(Integration::wrap)

    /**
     * Method options to use as a default for all methods created within this API unless custom
     * options are specified.
     *
     * Default: - Inherited from parent.
     */
    override fun defaultMethodOptions(): MethodOptions? =
        unwrap(this).getDefaultMethodOptions()?.let(MethodOptions::wrap)

    /**
     * Indicates if a Deployment should be automatically created for this API, and recreated when
     * the API model (resources, methods) changes.
     *
     * Since API Gateway deployments are immutable, When this option is enabled
     * (by default), an AWS::ApiGateway::Deployment resource will automatically
     * created with a logical ID that hashes the API model (methods, resources
     * and options). This means that when the model changes, the logical ID of
     * this CloudFormation resource will change, and a new deployment will be
     * created.
     *
     * If this is set, `latestDeployment` will refer to the `Deployment` object
     * and `deploymentStage` will refer to a `Stage` that points to this
     * deployment. To customize the stage options, use the `deployOptions`
     * property.
     *
     * A CloudFormation Output will also be defined with the root URL endpoint
     * of this REST API.
     *
     * Default: true
     */
    override fun deploy(): Boolean? = unwrap(this).getDeploy()

    /**
     * Options for the API Gateway stage that will always point to the latest deployment when
     * `deploy` is enabled.
     *
     * If `deploy` is disabled,
     * this value cannot be set.
     *
     * Default: - Based on defaults of `StageOptions`.
     */
    override fun deployOptions(): StageOptions? =
        unwrap(this).getDeployOptions()?.let(StageOptions::wrap)

    /**
     * A description of the RestApi construct.
     *
     * Default: - 'Automatically created by the RestApi construct'
     */
    override fun description(): String? = unwrap(this).getDescription()

    /**
     * Specifies whether clients can invoke the API using the default execute-api endpoint.
     *
     * To require that clients use a custom domain name to invoke the
     * API, disable the default endpoint.
     *
     * Default: false
     *
     * [Documentation](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-restapi.html)
     */
    override fun disableExecuteApiEndpoint(): Boolean? = unwrap(this).getDisableExecuteApiEndpoint()

    /**
     * Configure a custom domain name and map it to this API.
     *
     * Default: - no domain name is defined, use `addDomainName` or directly define a `DomainName`.
     */
    override fun domainName(): DomainNameOptions? =
        unwrap(this).getDomainName()?.let(DomainNameOptions::wrap)

    /**
     * The EndpointConfiguration property type specifies the endpoint types of a REST API.
     *
     * Default: EndpointType.EDGE
     *
     * [Documentation](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-restapi-endpointconfiguration.html)
     */
    override fun endpointConfiguration(): EndpointConfiguration? =
        unwrap(this).getEndpointConfiguration()?.let(EndpointConfiguration::wrap)

    /**
     * Export name for the CfnOutput containing the API endpoint.
     *
     * Default: - when no export name is given, output will be created without export
     */
    override fun endpointExportName(): String? = unwrap(this).getEndpointExportName()

    /**
     * A list of the endpoint types of the API.
     *
     * Use this property when creating
     * an API.
     *
     * Default: EndpointType.EDGE
     */
    override fun endpointTypes(): List<EndpointType> =
        unwrap(this).getEndpointTypes()?.map(EndpointType::wrap) ?: emptyList()

    /**
     * Indicates whether to roll back the resource if a warning occurs while API Gateway is creating
     * the RestApi resource.
     *
     * Default: false
     */
    override fun failOnWarnings(): Boolean? = unwrap(this).getFailOnWarnings()

    /**
     * Check if header is to be included inside the execution input.
     *
     * The execution input will include a new key `headers`:
     *
     * {
     * "body": {},
     * "headers": {
     * "header1": "value",
     * "header2": "value"
     * }
     * }
     *
     * Default: false
     */
    override fun headers(): Boolean? = unwrap(this).getHeaders()

    /**
     * A Size(in bytes, kibibytes, mebibytes etc) that is used to enable compression (with
     * non-negative between 0 and 10485760 (10M) bytes, inclusive) or disable compression (when
     * undefined) on an API.
     *
     * When compression is enabled, compression or
     * decompression is not applied on the payload if the payload size is
     * smaller than this value. Setting it to zero allows compression for any
     * payload size.
     *
     * Default: - Compression is disabled.
     */
    override fun minCompressionSize(): Size? = unwrap(this).getMinCompressionSize()?.let(Size::wrap)

    /**
     * (deprecated) A nullable integer that is used to enable compression (with non-negative between
     * 0 and 10485760 (10M) bytes, inclusive) or disable compression (when undefined) on an API.
     *
     * When compression is enabled, compression or
     * decompression is not applied on the payload if the payload size is
     * smaller than this value. Setting it to zero allows compression for any
     * payload size.
     *
     * Default: - Compression is disabled.
     *
     * * superseded by `minCompressionSize`
     */
    @Deprecated(message = "deprecated in CDK")
    override fun minimumCompressionSize(): Number? = unwrap(this).getMinimumCompressionSize()

    /**
     * Custom header parameters for the request.
     *
     * Default: - No parameters.
     *
     * [Documentation](https://docs.aws.amazon.com/cli/latest/reference/apigateway/import-rest-api.html)
     */
    override fun parameters(): Map<String, String> = unwrap(this).getParameters() ?: emptyMap()

    /**
     * Check if path is to be included inside the execution input.
     *
     * The execution input will include a new key `path`:
     *
     * {
     * "body": {},
     * "path": {
     * "resourceName": "resourceValue"
     * }
     * }
     *
     * Default: true
     */
    override fun path(): Boolean? = unwrap(this).getPath()

    /**
     * A policy document that contains the permissions for this RestApi.
     *
     * Default: - No policy.
     */
    override fun policy(): PolicyDocument? = unwrap(this).getPolicy()?.let(PolicyDocument::wrap)

    /**
     * Check if querystring is to be included inside the execution input.
     *
     * The execution input will include a new key `queryString`:
     *
     * {
     * "body": {},
     * "querystring": {
     * "key": "value"
     * }
     * }
     *
     * Default: true
     */
    override fun querystring(): Boolean? = unwrap(this).getQuerystring()

    /**
     * Which details of the incoming request must be passed onto the underlying state machine, such
     * as, account id, user identity, request id, etc.
     *
     * The execution input will include a new key `requestContext`:
     *
     * {
     * "body": {},
     * "requestContext": {
     * "key": "value"
     * }
     * }
     *
     * Default: - all parameters within request context will be set as false
     */
    override fun requestContext(): RequestContext? =
        unwrap(this).getRequestContext()?.let(RequestContext::wrap)

    /**
     * A name for the API Gateway RestApi resource.
     *
     * Default: - ID of the RestApi construct.
     */
    override fun restApiName(): String? = unwrap(this).getRestApiName()

    /**
     * Retains old deployment resources when the API changes.
     *
     * This allows
     * manually reverting stages to point to old deployments via the AWS
     * Console.
     *
     * Default: false
     */
    override fun retainDeployments(): Boolean? = unwrap(this).getRetainDeployments()

    /**
     * An IAM role that API Gateway will assume to start the execution of the state machine.
     *
     * Default: - a new role is created
     */
    override fun role(): IRole? = unwrap(this).getRole()?.let(IRole::wrap)

    /**
     * The default State Machine that handles all requests from this API.
     *
     * This stateMachine will be used as a the default integration for all methods in
     * this API, unless specified otherwise in `addMethod`.
     */
    override fun stateMachine(): IStateMachine =
        unwrap(this).getStateMachine().let(IStateMachine::wrap)

    /**
     * Whether to add default response models with 200, 400, and 500 status codes to the method.
     *
     * Default: true
     */
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
