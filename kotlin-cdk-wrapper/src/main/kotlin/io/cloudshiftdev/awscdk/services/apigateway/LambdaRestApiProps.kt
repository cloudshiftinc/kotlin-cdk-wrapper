@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.apigateway

import io.cloudshiftdev.awscdk.RemovalPolicy
import io.cloudshiftdev.awscdk.Size
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import io.cloudshiftdev.awscdk.services.iam.PolicyDocument
import io.cloudshiftdev.awscdk.services.lambda.IFunction
import kotlin.Boolean
import kotlin.Deprecated
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.Map
import kotlin.jvm.JvmName

/**
 * Example:
 *
 * ```
 * Function backend;
 * LambdaRestApi api = LambdaRestApi.Builder.create(this, "myapi")
 * .handler(backend)
 * .proxy(false)
 * .build();
 * Resource items = api.root.addResource("items");
 * items.addMethod("GET"); // GET /items
 * items.addMethod("POST"); // POST /items
 * Resource item = items.addResource("{item}");
 * item.addMethod("GET"); // GET /items/{item}
 * // the default integration for methods is "handler", but one can
 * // customize this behavior per method or even a sub path.
 * item.addMethod("DELETE", new HttpIntegration("http://amazon.com"));
 * ```
 */
public interface LambdaRestApiProps : RestApiProps {
  /**
   * The default Lambda function that handles all requests from this API.
   *
   * This handler will be used as a the default integration for all methods in
   * this API, unless specified otherwise in `addMethod`.
   */
  public fun handler(): IFunction

  /**
   * Specific Lambda integration options.
   *
   * Default: see defaults defined in `LambdaIntegrationOptions`.
   */
  public fun integrationOptions(): LambdaIntegrationOptions? =
      unwrap(this).getIntegrationOptions()?.let(LambdaIntegrationOptions::wrap)

  /**
   * If true, route all requests to the Lambda Function.
   *
   * If set to false, you will need to explicitly define the API model using
   * `addResource` and `addMethod` (or `addProxy`).
   *
   * Default: true
   */
  public fun proxy(): Boolean? = unwrap(this).getProxy()

  /**
   * A builder for [LambdaRestApiProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param apiKeySourceType The source of the API key for metering requests according to a usage
     * plan.
     */
    public fun apiKeySourceType(apiKeySourceType: ApiKeySourceType)

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
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("dbb45ad3af7cb53270633cd0601501729ddfc654f59a7e9ba7cd50e80d3fb0da")
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
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("130c6a78acc195a6d9061a0cf08d83ef6f3981a8e043cdd82fd77326087a38e0")
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
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("c645e7fac45bd4d4b5072af03d3a97a1422bc46f9688a23a5de3014bc85a8d0f")
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
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("7cb3c92e5846a5a4dfe5ce25588c10039015db06117c43e73799f0bc074dc826")
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
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("41c816506fd9faf043b28f76fda58037b5017f4ea0c309fcefd5277a7b811e0d")
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
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("cf11f7e44e8e0a9f572b6ace2775ed8c20e4f95cd04fa3e7a4de1279380d0cc5")
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
     * @param handler The default Lambda function that handles all requests from this API. 
     * This handler will be used as a the default integration for all methods in
     * this API, unless specified otherwise in `addMethod`.
     */
    public fun handler(handler: IFunction)

    /**
     * @param integrationOptions Specific Lambda integration options.
     */
    public fun integrationOptions(integrationOptions: LambdaIntegrationOptions)

    /**
     * @param integrationOptions Specific Lambda integration options.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("56903a28f16ddfe5b7c22b146e95eea7233e035ea029824aa8ab5023d8e50c81")
    public fun integrationOptions(integrationOptions: LambdaIntegrationOptions.Builder.() -> Unit)

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
     * @param policy A policy document that contains the permissions for this RestApi.
     */
    public fun policy(policy: PolicyDocument)

    /**
     * @param policy A policy document that contains the permissions for this RestApi.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("21b3c515bdd3aa09568b08a814b4d2a7b616e980e12b8c4073b6152d096c5c01")
    public fun policy(policy: PolicyDocument.Builder.() -> Unit)

    /**
     * @param proxy If true, route all requests to the Lambda Function.
     * If set to false, you will need to explicitly define the API model using
     * `addResource` and `addMethod` (or `addProxy`).
     */
    public fun proxy(proxy: Boolean)

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
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.apigateway.LambdaRestApiProps.Builder =
        software.amazon.awscdk.services.apigateway.LambdaRestApiProps.builder()

    /**
     * @param apiKeySourceType The source of the API key for metering requests according to a usage
     * plan.
     */
    override fun apiKeySourceType(apiKeySourceType: ApiKeySourceType) {
      cdkBuilder.apiKeySourceType(apiKeySourceType.let(ApiKeySourceType::unwrap))
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
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("dbb45ad3af7cb53270633cd0601501729ddfc654f59a7e9ba7cd50e80d3fb0da")
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
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("130c6a78acc195a6d9061a0cf08d83ef6f3981a8e043cdd82fd77326087a38e0")
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
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("c645e7fac45bd4d4b5072af03d3a97a1422bc46f9688a23a5de3014bc85a8d0f")
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
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("7cb3c92e5846a5a4dfe5ce25588c10039015db06117c43e73799f0bc074dc826")
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
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("41c816506fd9faf043b28f76fda58037b5017f4ea0c309fcefd5277a7b811e0d")
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
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("cf11f7e44e8e0a9f572b6ace2775ed8c20e4f95cd04fa3e7a4de1279380d0cc5")
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
     * @param handler The default Lambda function that handles all requests from this API. 
     * This handler will be used as a the default integration for all methods in
     * this API, unless specified otherwise in `addMethod`.
     */
    override fun handler(handler: IFunction) {
      cdkBuilder.handler(handler.let(IFunction::unwrap))
    }

    /**
     * @param integrationOptions Specific Lambda integration options.
     */
    override fun integrationOptions(integrationOptions: LambdaIntegrationOptions) {
      cdkBuilder.integrationOptions(integrationOptions.let(LambdaIntegrationOptions::unwrap))
    }

    /**
     * @param integrationOptions Specific Lambda integration options.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("56903a28f16ddfe5b7c22b146e95eea7233e035ea029824aa8ab5023d8e50c81")
    override
        fun integrationOptions(integrationOptions: LambdaIntegrationOptions.Builder.() -> Unit):
        Unit = integrationOptions(LambdaIntegrationOptions(integrationOptions))

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
     * @param policy A policy document that contains the permissions for this RestApi.
     */
    override fun policy(policy: PolicyDocument) {
      cdkBuilder.policy(policy.let(PolicyDocument::unwrap))
    }

    /**
     * @param policy A policy document that contains the permissions for this RestApi.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("21b3c515bdd3aa09568b08a814b4d2a7b616e980e12b8c4073b6152d096c5c01")
    override fun policy(policy: PolicyDocument.Builder.() -> Unit): Unit =
        policy(PolicyDocument(policy))

    /**
     * @param proxy If true, route all requests to the Lambda Function.
     * If set to false, you will need to explicitly define the API model using
     * `addResource` and `addMethod` (or `addProxy`).
     */
    override fun proxy(proxy: Boolean) {
      cdkBuilder.proxy(proxy)
    }

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

    public fun build(): software.amazon.awscdk.services.apigateway.LambdaRestApiProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.apigateway.LambdaRestApiProps,
  ) : CdkObject(cdkObject), LambdaRestApiProps {
    /**
     * The source of the API key for metering requests according to a usage plan.
     *
     * Default: - Metering is disabled.
     */
    override fun apiKeySourceType(): ApiKeySourceType? =
        unwrap(this).getApiKeySourceType()?.let(ApiKeySourceType::wrap)

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
     * The default Lambda function that handles all requests from this API.
     *
     * This handler will be used as a the default integration for all methods in
     * this API, unless specified otherwise in `addMethod`.
     */
    override fun handler(): IFunction = unwrap(this).getHandler().let(IFunction::wrap)

    /**
     * Specific Lambda integration options.
     *
     * Default: see defaults defined in `LambdaIntegrationOptions`.
     */
    override fun integrationOptions(): LambdaIntegrationOptions? =
        unwrap(this).getIntegrationOptions()?.let(LambdaIntegrationOptions::wrap)

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
     * A policy document that contains the permissions for this RestApi.
     *
     * Default: - No policy.
     */
    override fun policy(): PolicyDocument? = unwrap(this).getPolicy()?.let(PolicyDocument::wrap)

    /**
     * If true, route all requests to the Lambda Function.
     *
     * If set to false, you will need to explicitly define the API model using
     * `addResource` and `addMethod` (or `addProxy`).
     *
     * Default: true
     */
    override fun proxy(): Boolean? = unwrap(this).getProxy()

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
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): LambdaRestApiProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.apigateway.LambdaRestApiProps):
        LambdaRestApiProps = CdkObjectWrappers.wrap(cdkObject) as? LambdaRestApiProps ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: LambdaRestApiProps):
        software.amazon.awscdk.services.apigateway.LambdaRestApiProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.apigateway.LambdaRestApiProps
  }
}
