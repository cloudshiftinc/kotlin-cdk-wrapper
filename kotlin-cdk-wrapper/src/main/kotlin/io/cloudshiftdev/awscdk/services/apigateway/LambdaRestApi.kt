@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.apigateway

import io.cloudshiftdev.awscdk.RemovalPolicy
import io.cloudshiftdev.awscdk.Size
import io.cloudshiftdev.awscdk.common.CdkDslMarker
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
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * Defines an API Gateway REST API with AWS Lambda proxy integration.
 *
 * Use the `proxy` property to define a greedy proxy ("{proxy+}") and "ANY"
 * method from the specified path. If not defined, you will need to explicity
 * add resources and methods to the API.
 *
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
public open class LambdaRestApi(
  cdkObject: software.amazon.awscdk.services.apigateway.LambdaRestApi,
) : RestApi(cdkObject) {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: LambdaRestApiProps,
  ) :
      this(software.amazon.awscdk.services.apigateway.LambdaRestApi(scope.let(CloudshiftdevConstructsConstruct::unwrap),
      id, props.let(LambdaRestApiProps::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: LambdaRestApiProps.Builder.() -> Unit,
  ) : this(scope, id, LambdaRestApiProps(props)
  )

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.apigateway.LambdaRestApi].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The source of the API key for metering requests according to a usage plan.
     *
     * Default: - Metering is disabled.
     *
     * @param apiKeySourceType The source of the API key for metering requests according to a usage
     * plan. 
     */
    public fun apiKeySourceType(apiKeySourceType: ApiKeySourceType)

    /**
     * The list of binary media mime-types that are supported by the RestApi resource, such as
     * "image/png" or "application/octet-stream".
     *
     * Default: - RestApi supports only UTF-8-encoded text payloads.
     *
     * @param binaryMediaTypes The list of binary media mime-types that are supported by the RestApi
     * resource, such as "image/png" or "application/octet-stream". 
     */
    public fun binaryMediaTypes(binaryMediaTypes: List<String>)

    /**
     * The list of binary media mime-types that are supported by the RestApi resource, such as
     * "image/png" or "application/octet-stream".
     *
     * Default: - RestApi supports only UTF-8-encoded text payloads.
     *
     * @param binaryMediaTypes The list of binary media mime-types that are supported by the RestApi
     * resource, such as "image/png" or "application/octet-stream". 
     */
    public fun binaryMediaTypes(vararg binaryMediaTypes: String)

    /**
     * The ID of the API Gateway RestApi resource that you want to clone.
     *
     * Default: - None.
     *
     * @param cloneFrom The ID of the API Gateway RestApi resource that you want to clone. 
     */
    public fun cloneFrom(cloneFrom: IRestApi)

    /**
     * Automatically configure an AWS CloudWatch role for API Gateway.
     *
     * Default: - false if `@aws-cdk/aws-apigateway:disableCloudWatchRole` is enabled, true
     * otherwise
     *
     * @param cloudWatchRole Automatically configure an AWS CloudWatch role for API Gateway. 
     */
    public fun cloudWatchRole(cloudWatchRole: Boolean)

    /**
     * The removal policy applied to the AWS CloudWatch role when this resource is removed from the
     * application.
     *
     * Requires `cloudWatchRole` to be enabled.
     *
     * Default: - RemovalPolicy.RETAIN
     *
     * @param cloudWatchRoleRemovalPolicy The removal policy applied to the AWS CloudWatch role when
     * this resource is removed from the application. 
     */
    public fun cloudWatchRoleRemovalPolicy(cloudWatchRoleRemovalPolicy: RemovalPolicy)

    /**
     * Adds a CORS preflight OPTIONS method to this resource and all child resources.
     *
     * You can add CORS at the resource-level using `addCorsPreflight`.
     *
     * Default: - CORS is disabled
     *
     * @param defaultCorsPreflightOptions Adds a CORS preflight OPTIONS method to this resource and
     * all child resources. 
     */
    public fun defaultCorsPreflightOptions(defaultCorsPreflightOptions: CorsOptions)

    /**
     * Adds a CORS preflight OPTIONS method to this resource and all child resources.
     *
     * You can add CORS at the resource-level using `addCorsPreflight`.
     *
     * Default: - CORS is disabled
     *
     * @param defaultCorsPreflightOptions Adds a CORS preflight OPTIONS method to this resource and
     * all child resources. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("a27be96cd76c9b2cc809dca0b5e9ccd2e04b6eb584eb2fe800866576d0d509ae")
    public
        fun defaultCorsPreflightOptions(defaultCorsPreflightOptions: CorsOptions.Builder.() -> Unit)

    /**
     * An integration to use as a default for all methods created within this API unless an
     * integration is specified.
     *
     * Default: - Inherited from parent.
     *
     * @param defaultIntegration An integration to use as a default for all methods created within
     * this API unless an integration is specified. 
     */
    public fun defaultIntegration(defaultIntegration: Integration)

    /**
     * An integration to use as a default for all methods created within this API unless an
     * integration is specified.
     *
     * Default: - Inherited from parent.
     *
     * @param defaultIntegration An integration to use as a default for all methods created within
     * this API unless an integration is specified. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("c386ea4a429a59cad5724e236a27e696281bfd607b021cf29e5e34114b05b510")
    public fun defaultIntegration(defaultIntegration: Integration.Builder.() -> Unit)

    /**
     * Method options to use as a default for all methods created within this API unless custom
     * options are specified.
     *
     * Default: - Inherited from parent.
     *
     * @param defaultMethodOptions Method options to use as a default for all methods created within
     * this API unless custom options are specified. 
     */
    public fun defaultMethodOptions(defaultMethodOptions: MethodOptions)

    /**
     * Method options to use as a default for all methods created within this API unless custom
     * options are specified.
     *
     * Default: - Inherited from parent.
     *
     * @param defaultMethodOptions Method options to use as a default for all methods created within
     * this API unless custom options are specified. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("c3e9595dd5c08c6566ac36f480f97013b7ece186ddee4d9e3a97e97b33379a38")
    public fun defaultMethodOptions(defaultMethodOptions: MethodOptions.Builder.() -> Unit)

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
     *
     * @param deploy Indicates if a Deployment should be automatically created for this API, and
     * recreated when the API model (resources, methods) changes. 
     */
    public fun deploy(deploy: Boolean)

    /**
     * Options for the API Gateway stage that will always point to the latest deployment when
     * `deploy` is enabled.
     *
     * If `deploy` is disabled,
     * this value cannot be set.
     *
     * Default: - Based on defaults of `StageOptions`.
     *
     * @param deployOptions Options for the API Gateway stage that will always point to the latest
     * deployment when `deploy` is enabled. 
     */
    public fun deployOptions(deployOptions: StageOptions)

    /**
     * Options for the API Gateway stage that will always point to the latest deployment when
     * `deploy` is enabled.
     *
     * If `deploy` is disabled,
     * this value cannot be set.
     *
     * Default: - Based on defaults of `StageOptions`.
     *
     * @param deployOptions Options for the API Gateway stage that will always point to the latest
     * deployment when `deploy` is enabled. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("53eea0ddcf94cf7fc38b52e3b3df9851d68448098a9e500171a896ae42c7bd26")
    public fun deployOptions(deployOptions: StageOptions.Builder.() -> Unit)

    /**
     * A description of the RestApi construct.
     *
     * Default: - 'Automatically created by the RestApi construct'
     *
     * @param description A description of the RestApi construct. 
     */
    public fun description(description: String)

    /**
     * Specifies whether clients can invoke the API using the default execute-api endpoint.
     *
     * To require that clients use a custom domain name to invoke the
     * API, disable the default endpoint.
     *
     * Default: false
     *
     * [Documentation](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-restapi.html)
     * @param disableExecuteApiEndpoint Specifies whether clients can invoke the API using the
     * default execute-api endpoint. 
     */
    public fun disableExecuteApiEndpoint(disableExecuteApiEndpoint: Boolean)

    /**
     * Configure a custom domain name and map it to this API.
     *
     * Default: - no domain name is defined, use `addDomainName` or directly define a `DomainName`.
     *
     * @param domainName Configure a custom domain name and map it to this API. 
     */
    public fun domainName(domainName: DomainNameOptions)

    /**
     * Configure a custom domain name and map it to this API.
     *
     * Default: - no domain name is defined, use `addDomainName` or directly define a `DomainName`.
     *
     * @param domainName Configure a custom domain name and map it to this API. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("ecf95157037f9e294833f394ebf4c6de82df3e4720d7090874364729db822bb2")
    public fun domainName(domainName: DomainNameOptions.Builder.() -> Unit)

    /**
     * The EndpointConfiguration property type specifies the endpoint types of a REST API.
     *
     * Default: EndpointType.EDGE
     *
     * [Documentation](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-restapi-endpointconfiguration.html)
     * @param endpointConfiguration The EndpointConfiguration property type specifies the endpoint
     * types of a REST API. 
     */
    public fun endpointConfiguration(endpointConfiguration: EndpointConfiguration)

    /**
     * The EndpointConfiguration property type specifies the endpoint types of a REST API.
     *
     * Default: EndpointType.EDGE
     *
     * [Documentation](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-restapi-endpointconfiguration.html)
     * @param endpointConfiguration The EndpointConfiguration property type specifies the endpoint
     * types of a REST API. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("ab11b4da9ac36e3c776a5d2e0e4ae98070206bdd6b44ec2f93567cf1145ee821")
    public
        fun endpointConfiguration(endpointConfiguration: EndpointConfiguration.Builder.() -> Unit)

    /**
     * Export name for the CfnOutput containing the API endpoint.
     *
     * Default: - when no export name is given, output will be created without export
     *
     * @param endpointExportName Export name for the CfnOutput containing the API endpoint. 
     */
    public fun endpointExportName(endpointExportName: String)

    /**
     * A list of the endpoint types of the API.
     *
     * Use this property when creating
     * an API.
     *
     * Default: EndpointType.EDGE
     *
     * @param endpointTypes A list of the endpoint types of the API. 
     */
    public fun endpointTypes(endpointTypes: List<EndpointType>)

    /**
     * A list of the endpoint types of the API.
     *
     * Use this property when creating
     * an API.
     *
     * Default: EndpointType.EDGE
     *
     * @param endpointTypes A list of the endpoint types of the API. 
     */
    public fun endpointTypes(vararg endpointTypes: EndpointType)

    /**
     * Indicates whether to roll back the resource if a warning occurs while API Gateway is creating
     * the RestApi resource.
     *
     * Default: false
     *
     * @param failOnWarnings Indicates whether to roll back the resource if a warning occurs while
     * API Gateway is creating the RestApi resource. 
     */
    public fun failOnWarnings(failOnWarnings: Boolean)

    /**
     * The default Lambda function that handles all requests from this API.
     *
     * This handler will be used as a the default integration for all methods in
     * this API, unless specified otherwise in `addMethod`.
     *
     * @param handler The default Lambda function that handles all requests from this API. 
     */
    public fun handler(handler: IFunction)

    /**
     * Specific Lambda integration options.
     *
     * Default: see defaults defined in `LambdaIntegrationOptions`.
     *
     * @param integrationOptions Specific Lambda integration options. 
     */
    public fun integrationOptions(integrationOptions: LambdaIntegrationOptions)

    /**
     * Specific Lambda integration options.
     *
     * Default: see defaults defined in `LambdaIntegrationOptions`.
     *
     * @param integrationOptions Specific Lambda integration options. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("b5d005eee577d04fb09645063da611f6916e9ccda71b6a2b253ca75188890de3")
    public fun integrationOptions(integrationOptions: LambdaIntegrationOptions.Builder.() -> Unit)

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
     *
     * @param minCompressionSize A Size(in bytes, kibibytes, mebibytes etc) that is used to enable
     * compression (with non-negative between 0 and 10485760 (10M) bytes, inclusive) or disable
     * compression (when undefined) on an API. 
     */
    public fun minCompressionSize(minCompressionSize: Size)

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
     * @param minimumCompressionSize A nullable integer that is used to enable compression (with
     * non-negative between 0 and 10485760 (10M) bytes, inclusive) or disable compression (when
     * undefined) on an API. 
     */
    @Deprecated(message = "deprecated in CDK")
    public fun minimumCompressionSize(minimumCompressionSize: Number)

    /**
     * Custom header parameters for the request.
     *
     * Default: - No parameters.
     *
     * [Documentation](https://docs.aws.amazon.com/cli/latest/reference/apigateway/import-rest-api.html)
     * @param parameters Custom header parameters for the request. 
     */
    public fun parameters(parameters: Map<String, String>)

    /**
     * A policy document that contains the permissions for this RestApi.
     *
     * Default: - No policy.
     *
     * @param policy A policy document that contains the permissions for this RestApi. 
     */
    public fun policy(policy: PolicyDocument)

    /**
     * A policy document that contains the permissions for this RestApi.
     *
     * Default: - No policy.
     *
     * @param policy A policy document that contains the permissions for this RestApi. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("23bbf781aa777cf6e16e96907341ab6b217585c03e9d275f7d7202644cb9b01c")
    public fun policy(policy: PolicyDocument.Builder.() -> Unit)

    /**
     * If true, route all requests to the Lambda Function.
     *
     * If set to false, you will need to explicitly define the API model using
     * `addResource` and `addMethod` (or `addProxy`).
     *
     * Default: true
     *
     * @param proxy If true, route all requests to the Lambda Function. 
     */
    public fun proxy(proxy: Boolean)

    /**
     * A name for the API Gateway RestApi resource.
     *
     * Default: - ID of the RestApi construct.
     *
     * @param restApiName A name for the API Gateway RestApi resource. 
     */
    public fun restApiName(restApiName: String)

    /**
     * Retains old deployment resources when the API changes.
     *
     * This allows
     * manually reverting stages to point to old deployments via the AWS
     * Console.
     *
     * Default: false
     *
     * @param retainDeployments Retains old deployment resources when the API changes. 
     */
    public fun retainDeployments(retainDeployments: Boolean)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.apigateway.LambdaRestApi.Builder =
        software.amazon.awscdk.services.apigateway.LambdaRestApi.Builder.create(scope, id)

    /**
     * The source of the API key for metering requests according to a usage plan.
     *
     * Default: - Metering is disabled.
     *
     * @param apiKeySourceType The source of the API key for metering requests according to a usage
     * plan. 
     */
    override fun apiKeySourceType(apiKeySourceType: ApiKeySourceType) {
      cdkBuilder.apiKeySourceType(apiKeySourceType.let(ApiKeySourceType::unwrap))
    }

    /**
     * The list of binary media mime-types that are supported by the RestApi resource, such as
     * "image/png" or "application/octet-stream".
     *
     * Default: - RestApi supports only UTF-8-encoded text payloads.
     *
     * @param binaryMediaTypes The list of binary media mime-types that are supported by the RestApi
     * resource, such as "image/png" or "application/octet-stream". 
     */
    override fun binaryMediaTypes(binaryMediaTypes: List<String>) {
      cdkBuilder.binaryMediaTypes(binaryMediaTypes)
    }

    /**
     * The list of binary media mime-types that are supported by the RestApi resource, such as
     * "image/png" or "application/octet-stream".
     *
     * Default: - RestApi supports only UTF-8-encoded text payloads.
     *
     * @param binaryMediaTypes The list of binary media mime-types that are supported by the RestApi
     * resource, such as "image/png" or "application/octet-stream". 
     */
    override fun binaryMediaTypes(vararg binaryMediaTypes: String): Unit =
        binaryMediaTypes(binaryMediaTypes.toList())

    /**
     * The ID of the API Gateway RestApi resource that you want to clone.
     *
     * Default: - None.
     *
     * @param cloneFrom The ID of the API Gateway RestApi resource that you want to clone. 
     */
    override fun cloneFrom(cloneFrom: IRestApi) {
      cdkBuilder.cloneFrom(cloneFrom.let(IRestApi::unwrap))
    }

    /**
     * Automatically configure an AWS CloudWatch role for API Gateway.
     *
     * Default: - false if `@aws-cdk/aws-apigateway:disableCloudWatchRole` is enabled, true
     * otherwise
     *
     * @param cloudWatchRole Automatically configure an AWS CloudWatch role for API Gateway. 
     */
    override fun cloudWatchRole(cloudWatchRole: Boolean) {
      cdkBuilder.cloudWatchRole(cloudWatchRole)
    }

    /**
     * The removal policy applied to the AWS CloudWatch role when this resource is removed from the
     * application.
     *
     * Requires `cloudWatchRole` to be enabled.
     *
     * Default: - RemovalPolicy.RETAIN
     *
     * @param cloudWatchRoleRemovalPolicy The removal policy applied to the AWS CloudWatch role when
     * this resource is removed from the application. 
     */
    override fun cloudWatchRoleRemovalPolicy(cloudWatchRoleRemovalPolicy: RemovalPolicy) {
      cdkBuilder.cloudWatchRoleRemovalPolicy(cloudWatchRoleRemovalPolicy.let(RemovalPolicy::unwrap))
    }

    /**
     * Adds a CORS preflight OPTIONS method to this resource and all child resources.
     *
     * You can add CORS at the resource-level using `addCorsPreflight`.
     *
     * Default: - CORS is disabled
     *
     * @param defaultCorsPreflightOptions Adds a CORS preflight OPTIONS method to this resource and
     * all child resources. 
     */
    override fun defaultCorsPreflightOptions(defaultCorsPreflightOptions: CorsOptions) {
      cdkBuilder.defaultCorsPreflightOptions(defaultCorsPreflightOptions.let(CorsOptions::unwrap))
    }

    /**
     * Adds a CORS preflight OPTIONS method to this resource and all child resources.
     *
     * You can add CORS at the resource-level using `addCorsPreflight`.
     *
     * Default: - CORS is disabled
     *
     * @param defaultCorsPreflightOptions Adds a CORS preflight OPTIONS method to this resource and
     * all child resources. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("a27be96cd76c9b2cc809dca0b5e9ccd2e04b6eb584eb2fe800866576d0d509ae")
    override
        fun defaultCorsPreflightOptions(defaultCorsPreflightOptions: CorsOptions.Builder.() -> Unit):
        Unit = defaultCorsPreflightOptions(CorsOptions(defaultCorsPreflightOptions))

    /**
     * An integration to use as a default for all methods created within this API unless an
     * integration is specified.
     *
     * Default: - Inherited from parent.
     *
     * @param defaultIntegration An integration to use as a default for all methods created within
     * this API unless an integration is specified. 
     */
    override fun defaultIntegration(defaultIntegration: Integration) {
      cdkBuilder.defaultIntegration(defaultIntegration.let(Integration::unwrap))
    }

    /**
     * An integration to use as a default for all methods created within this API unless an
     * integration is specified.
     *
     * Default: - Inherited from parent.
     *
     * @param defaultIntegration An integration to use as a default for all methods created within
     * this API unless an integration is specified. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("c386ea4a429a59cad5724e236a27e696281bfd607b021cf29e5e34114b05b510")
    override fun defaultIntegration(defaultIntegration: Integration.Builder.() -> Unit): Unit =
        defaultIntegration(Integration(defaultIntegration))

    /**
     * Method options to use as a default for all methods created within this API unless custom
     * options are specified.
     *
     * Default: - Inherited from parent.
     *
     * @param defaultMethodOptions Method options to use as a default for all methods created within
     * this API unless custom options are specified. 
     */
    override fun defaultMethodOptions(defaultMethodOptions: MethodOptions) {
      cdkBuilder.defaultMethodOptions(defaultMethodOptions.let(MethodOptions::unwrap))
    }

    /**
     * Method options to use as a default for all methods created within this API unless custom
     * options are specified.
     *
     * Default: - Inherited from parent.
     *
     * @param defaultMethodOptions Method options to use as a default for all methods created within
     * this API unless custom options are specified. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("c3e9595dd5c08c6566ac36f480f97013b7ece186ddee4d9e3a97e97b33379a38")
    override fun defaultMethodOptions(defaultMethodOptions: MethodOptions.Builder.() -> Unit): Unit
        = defaultMethodOptions(MethodOptions(defaultMethodOptions))

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
     *
     * @param deploy Indicates if a Deployment should be automatically created for this API, and
     * recreated when the API model (resources, methods) changes. 
     */
    override fun deploy(deploy: Boolean) {
      cdkBuilder.deploy(deploy)
    }

    /**
     * Options for the API Gateway stage that will always point to the latest deployment when
     * `deploy` is enabled.
     *
     * If `deploy` is disabled,
     * this value cannot be set.
     *
     * Default: - Based on defaults of `StageOptions`.
     *
     * @param deployOptions Options for the API Gateway stage that will always point to the latest
     * deployment when `deploy` is enabled. 
     */
    override fun deployOptions(deployOptions: StageOptions) {
      cdkBuilder.deployOptions(deployOptions.let(StageOptions::unwrap))
    }

    /**
     * Options for the API Gateway stage that will always point to the latest deployment when
     * `deploy` is enabled.
     *
     * If `deploy` is disabled,
     * this value cannot be set.
     *
     * Default: - Based on defaults of `StageOptions`.
     *
     * @param deployOptions Options for the API Gateway stage that will always point to the latest
     * deployment when `deploy` is enabled. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("53eea0ddcf94cf7fc38b52e3b3df9851d68448098a9e500171a896ae42c7bd26")
    override fun deployOptions(deployOptions: StageOptions.Builder.() -> Unit): Unit =
        deployOptions(StageOptions(deployOptions))

    /**
     * A description of the RestApi construct.
     *
     * Default: - 'Automatically created by the RestApi construct'
     *
     * @param description A description of the RestApi construct. 
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * Specifies whether clients can invoke the API using the default execute-api endpoint.
     *
     * To require that clients use a custom domain name to invoke the
     * API, disable the default endpoint.
     *
     * Default: false
     *
     * [Documentation](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-restapi.html)
     * @param disableExecuteApiEndpoint Specifies whether clients can invoke the API using the
     * default execute-api endpoint. 
     */
    override fun disableExecuteApiEndpoint(disableExecuteApiEndpoint: Boolean) {
      cdkBuilder.disableExecuteApiEndpoint(disableExecuteApiEndpoint)
    }

    /**
     * Configure a custom domain name and map it to this API.
     *
     * Default: - no domain name is defined, use `addDomainName` or directly define a `DomainName`.
     *
     * @param domainName Configure a custom domain name and map it to this API. 
     */
    override fun domainName(domainName: DomainNameOptions) {
      cdkBuilder.domainName(domainName.let(DomainNameOptions::unwrap))
    }

    /**
     * Configure a custom domain name and map it to this API.
     *
     * Default: - no domain name is defined, use `addDomainName` or directly define a `DomainName`.
     *
     * @param domainName Configure a custom domain name and map it to this API. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("ecf95157037f9e294833f394ebf4c6de82df3e4720d7090874364729db822bb2")
    override fun domainName(domainName: DomainNameOptions.Builder.() -> Unit): Unit =
        domainName(DomainNameOptions(domainName))

    /**
     * The EndpointConfiguration property type specifies the endpoint types of a REST API.
     *
     * Default: EndpointType.EDGE
     *
     * [Documentation](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-restapi-endpointconfiguration.html)
     * @param endpointConfiguration The EndpointConfiguration property type specifies the endpoint
     * types of a REST API. 
     */
    override fun endpointConfiguration(endpointConfiguration: EndpointConfiguration) {
      cdkBuilder.endpointConfiguration(endpointConfiguration.let(EndpointConfiguration::unwrap))
    }

    /**
     * The EndpointConfiguration property type specifies the endpoint types of a REST API.
     *
     * Default: EndpointType.EDGE
     *
     * [Documentation](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-restapi-endpointconfiguration.html)
     * @param endpointConfiguration The EndpointConfiguration property type specifies the endpoint
     * types of a REST API. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("ab11b4da9ac36e3c776a5d2e0e4ae98070206bdd6b44ec2f93567cf1145ee821")
    override
        fun endpointConfiguration(endpointConfiguration: EndpointConfiguration.Builder.() -> Unit):
        Unit = endpointConfiguration(EndpointConfiguration(endpointConfiguration))

    /**
     * Export name for the CfnOutput containing the API endpoint.
     *
     * Default: - when no export name is given, output will be created without export
     *
     * @param endpointExportName Export name for the CfnOutput containing the API endpoint. 
     */
    override fun endpointExportName(endpointExportName: String) {
      cdkBuilder.endpointExportName(endpointExportName)
    }

    /**
     * A list of the endpoint types of the API.
     *
     * Use this property when creating
     * an API.
     *
     * Default: EndpointType.EDGE
     *
     * @param endpointTypes A list of the endpoint types of the API. 
     */
    override fun endpointTypes(endpointTypes: List<EndpointType>) {
      cdkBuilder.endpointTypes(endpointTypes.map(EndpointType::unwrap))
    }

    /**
     * A list of the endpoint types of the API.
     *
     * Use this property when creating
     * an API.
     *
     * Default: EndpointType.EDGE
     *
     * @param endpointTypes A list of the endpoint types of the API. 
     */
    override fun endpointTypes(vararg endpointTypes: EndpointType): Unit =
        endpointTypes(endpointTypes.toList())

    /**
     * Indicates whether to roll back the resource if a warning occurs while API Gateway is creating
     * the RestApi resource.
     *
     * Default: false
     *
     * @param failOnWarnings Indicates whether to roll back the resource if a warning occurs while
     * API Gateway is creating the RestApi resource. 
     */
    override fun failOnWarnings(failOnWarnings: Boolean) {
      cdkBuilder.failOnWarnings(failOnWarnings)
    }

    /**
     * The default Lambda function that handles all requests from this API.
     *
     * This handler will be used as a the default integration for all methods in
     * this API, unless specified otherwise in `addMethod`.
     *
     * @param handler The default Lambda function that handles all requests from this API. 
     */
    override fun handler(handler: IFunction) {
      cdkBuilder.handler(handler.let(IFunction::unwrap))
    }

    /**
     * Specific Lambda integration options.
     *
     * Default: see defaults defined in `LambdaIntegrationOptions`.
     *
     * @param integrationOptions Specific Lambda integration options. 
     */
    override fun integrationOptions(integrationOptions: LambdaIntegrationOptions) {
      cdkBuilder.integrationOptions(integrationOptions.let(LambdaIntegrationOptions::unwrap))
    }

    /**
     * Specific Lambda integration options.
     *
     * Default: see defaults defined in `LambdaIntegrationOptions`.
     *
     * @param integrationOptions Specific Lambda integration options. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("b5d005eee577d04fb09645063da611f6916e9ccda71b6a2b253ca75188890de3")
    override
        fun integrationOptions(integrationOptions: LambdaIntegrationOptions.Builder.() -> Unit):
        Unit = integrationOptions(LambdaIntegrationOptions(integrationOptions))

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
     *
     * @param minCompressionSize A Size(in bytes, kibibytes, mebibytes etc) that is used to enable
     * compression (with non-negative between 0 and 10485760 (10M) bytes, inclusive) or disable
     * compression (when undefined) on an API. 
     */
    override fun minCompressionSize(minCompressionSize: Size) {
      cdkBuilder.minCompressionSize(minCompressionSize.let(Size::unwrap))
    }

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
     * @param minimumCompressionSize A nullable integer that is used to enable compression (with
     * non-negative between 0 and 10485760 (10M) bytes, inclusive) or disable compression (when
     * undefined) on an API. 
     */
    @Deprecated(message = "deprecated in CDK")
    override fun minimumCompressionSize(minimumCompressionSize: Number) {
      cdkBuilder.minimumCompressionSize(minimumCompressionSize)
    }

    /**
     * Custom header parameters for the request.
     *
     * Default: - No parameters.
     *
     * [Documentation](https://docs.aws.amazon.com/cli/latest/reference/apigateway/import-rest-api.html)
     * @param parameters Custom header parameters for the request. 
     */
    override fun parameters(parameters: Map<String, String>) {
      cdkBuilder.parameters(parameters)
    }

    /**
     * A policy document that contains the permissions for this RestApi.
     *
     * Default: - No policy.
     *
     * @param policy A policy document that contains the permissions for this RestApi. 
     */
    override fun policy(policy: PolicyDocument) {
      cdkBuilder.policy(policy.let(PolicyDocument::unwrap))
    }

    /**
     * A policy document that contains the permissions for this RestApi.
     *
     * Default: - No policy.
     *
     * @param policy A policy document that contains the permissions for this RestApi. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("23bbf781aa777cf6e16e96907341ab6b217585c03e9d275f7d7202644cb9b01c")
    override fun policy(policy: PolicyDocument.Builder.() -> Unit): Unit =
        policy(PolicyDocument(policy))

    /**
     * If true, route all requests to the Lambda Function.
     *
     * If set to false, you will need to explicitly define the API model using
     * `addResource` and `addMethod` (or `addProxy`).
     *
     * Default: true
     *
     * @param proxy If true, route all requests to the Lambda Function. 
     */
    override fun proxy(proxy: Boolean) {
      cdkBuilder.proxy(proxy)
    }

    /**
     * A name for the API Gateway RestApi resource.
     *
     * Default: - ID of the RestApi construct.
     *
     * @param restApiName A name for the API Gateway RestApi resource. 
     */
    override fun restApiName(restApiName: String) {
      cdkBuilder.restApiName(restApiName)
    }

    /**
     * Retains old deployment resources when the API changes.
     *
     * This allows
     * manually reverting stages to point to old deployments via the AWS
     * Console.
     *
     * Default: false
     *
     * @param retainDeployments Retains old deployment resources when the API changes. 
     */
    override fun retainDeployments(retainDeployments: Boolean) {
      cdkBuilder.retainDeployments(retainDeployments)
    }

    public fun build(): software.amazon.awscdk.services.apigateway.LambdaRestApi =
        cdkBuilder.build()
  }

  public companion object {
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
        software.amazon.awscdk.services.apigateway.LambdaRestApi = wrapped.cdkObject as
        software.amazon.awscdk.services.apigateway.LambdaRestApi
  }
}
