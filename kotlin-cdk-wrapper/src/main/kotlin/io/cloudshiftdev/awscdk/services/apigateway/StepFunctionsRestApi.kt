@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.apigateway

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
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.Map
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * Defines an API Gateway REST API with a Synchrounous Express State Machine as a proxy integration.
 *
 * Example:
 *
 * ```
 * IStateMachine machine;
 * StepFunctionsRestApi.Builder.create(this, "StepFunctionsRestApi")
 * .stateMachine(machine)
 * .useDefaultMethodResponses(false)
 * .build();
 * ```
 */
public open class StepFunctionsRestApi(
  cdkObject: software.amazon.awscdk.services.apigateway.StepFunctionsRestApi,
) : RestApi(cdkObject) {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: StepFunctionsRestApiProps,
  ) :
      this(software.amazon.awscdk.services.apigateway.StepFunctionsRestApi(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id, props.let(StepFunctionsRestApiProps.Companion::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: StepFunctionsRestApiProps.Builder.() -> Unit,
  ) : this(scope, id, StepFunctionsRestApiProps(props)
  )

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.apigateway.StepFunctionsRestApi].
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
     *
     * @param authorizer If the whole authorizer object, including custom context values should be
     * in the execution input. 
     */
    public fun authorizer(authorizer: Boolean)

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
    @JvmName("4ecb87607adc34bea3f3e2c9011ec9b87c08d6e4c79212aabb6b94b7af2e8ab8")
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
    @JvmName("10c6af253203730e6d0aa3b2417ab2588d84608849db10ccd59dc2cb03d092f5")
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
    @JvmName("b6274c35aea9a95d95526e842dd5d2efcf0e02478d9fe24dc4c06eb4a9b30bc9")
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
    @JvmName("04097a60db2138be1b5a59a59910c303ca0aff45d67b57bfdfb6aab2269eb099")
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
    @JvmName("5f1dac6c44f7f6cb4220dc55adbc9a51039a801934953fb8d9dce58e3b56d0a0")
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
    @JvmName("f5f47d5dc1acc58ea54383c7446e5987691260dec52ebcc44e9051ad03a3850d")
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
     *
     * @param headers Check if header is to be included inside the execution input. 
     */
    public fun headers(headers: Boolean)

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
     *
     * @param path Check if path is to be included inside the execution input. 
     */
    public fun path(path: Boolean)

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
    @JvmName("5ced0913dfe696786f1d0cef947d868ae950f983da20e006786f8c74b67836c6")
    public fun policy(policy: PolicyDocument.Builder.() -> Unit)

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
     *
     * @param querystring Check if querystring is to be included inside the execution input. 
     */
    public fun querystring(querystring: Boolean)

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
     *
     * @param requestContext Which details of the incoming request must be passed onto the
     * underlying state machine, such as, account id, user identity, request id, etc. 
     */
    public fun requestContext(requestContext: RequestContext)

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
     *
     * @param requestContext Which details of the incoming request must be passed onto the
     * underlying state machine, such as, account id, user identity, request id, etc. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("9ccbd02434b9431bcb834dc59080c0719cefcd922f89d03aa4d3ec47de85389b")
    public fun requestContext(requestContext: RequestContext.Builder.() -> Unit)

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

    /**
     * An IAM role that API Gateway will assume to start the execution of the state machine.
     *
     * Default: - a new role is created
     *
     * @param role An IAM role that API Gateway will assume to start the execution of the state
     * machine. 
     */
    public fun role(role: IRole)

    /**
     * The default State Machine that handles all requests from this API.
     *
     * This stateMachine will be used as a the default integration for all methods in
     * this API, unless specified otherwise in `addMethod`.
     *
     * @param stateMachine The default State Machine that handles all requests from this API. 
     */
    public fun stateMachine(stateMachine: IStateMachine)

    /**
     * Whether to add default response models with 200, 400, and 500 status codes to the method.
     *
     * Default: true
     *
     * @param useDefaultMethodResponses Whether to add default response models with 200, 400, and
     * 500 status codes to the method. 
     */
    public fun useDefaultMethodResponses(useDefaultMethodResponses: Boolean)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.apigateway.StepFunctionsRestApi.Builder
        = software.amazon.awscdk.services.apigateway.StepFunctionsRestApi.Builder.create(scope, id)

    /**
     * The source of the API key for metering requests according to a usage plan.
     *
     * Default: - Metering is disabled.
     *
     * @param apiKeySourceType The source of the API key for metering requests according to a usage
     * plan. 
     */
    override fun apiKeySourceType(apiKeySourceType: ApiKeySourceType) {
      cdkBuilder.apiKeySourceType(apiKeySourceType.let(ApiKeySourceType.Companion::unwrap))
    }

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
     *
     * @param authorizer If the whole authorizer object, including custom context values should be
     * in the execution input. 
     */
    override fun authorizer(authorizer: Boolean) {
      cdkBuilder.authorizer(authorizer)
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
      cdkBuilder.cloneFrom(cloneFrom.let(IRestApi.Companion::unwrap))
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
      cdkBuilder.cloudWatchRoleRemovalPolicy(cloudWatchRoleRemovalPolicy.let(RemovalPolicy.Companion::unwrap))
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
      cdkBuilder.defaultCorsPreflightOptions(defaultCorsPreflightOptions.let(CorsOptions.Companion::unwrap))
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
    @JvmName("4ecb87607adc34bea3f3e2c9011ec9b87c08d6e4c79212aabb6b94b7af2e8ab8")
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
      cdkBuilder.defaultIntegration(defaultIntegration.let(Integration.Companion::unwrap))
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
    @JvmName("10c6af253203730e6d0aa3b2417ab2588d84608849db10ccd59dc2cb03d092f5")
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
      cdkBuilder.defaultMethodOptions(defaultMethodOptions.let(MethodOptions.Companion::unwrap))
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
    @JvmName("b6274c35aea9a95d95526e842dd5d2efcf0e02478d9fe24dc4c06eb4a9b30bc9")
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
      cdkBuilder.deployOptions(deployOptions.let(StageOptions.Companion::unwrap))
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
    @JvmName("04097a60db2138be1b5a59a59910c303ca0aff45d67b57bfdfb6aab2269eb099")
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
      cdkBuilder.domainName(domainName.let(DomainNameOptions.Companion::unwrap))
    }

    /**
     * Configure a custom domain name and map it to this API.
     *
     * Default: - no domain name is defined, use `addDomainName` or directly define a `DomainName`.
     *
     * @param domainName Configure a custom domain name and map it to this API. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("5f1dac6c44f7f6cb4220dc55adbc9a51039a801934953fb8d9dce58e3b56d0a0")
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
      cdkBuilder.endpointConfiguration(endpointConfiguration.let(EndpointConfiguration.Companion::unwrap))
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
    @JvmName("f5f47d5dc1acc58ea54383c7446e5987691260dec52ebcc44e9051ad03a3850d")
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
      cdkBuilder.endpointTypes(endpointTypes.map(EndpointType.Companion::unwrap))
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
     *
     * @param headers Check if header is to be included inside the execution input. 
     */
    override fun headers(headers: Boolean) {
      cdkBuilder.headers(headers)
    }

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
      cdkBuilder.minCompressionSize(minCompressionSize.let(Size.Companion::unwrap))
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
     *
     * @param path Check if path is to be included inside the execution input. 
     */
    override fun path(path: Boolean) {
      cdkBuilder.path(path)
    }

    /**
     * A policy document that contains the permissions for this RestApi.
     *
     * Default: - No policy.
     *
     * @param policy A policy document that contains the permissions for this RestApi. 
     */
    override fun policy(policy: PolicyDocument) {
      cdkBuilder.policy(policy.let(PolicyDocument.Companion::unwrap))
    }

    /**
     * A policy document that contains the permissions for this RestApi.
     *
     * Default: - No policy.
     *
     * @param policy A policy document that contains the permissions for this RestApi. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("5ced0913dfe696786f1d0cef947d868ae950f983da20e006786f8c74b67836c6")
    override fun policy(policy: PolicyDocument.Builder.() -> Unit): Unit =
        policy(PolicyDocument(policy))

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
     *
     * @param querystring Check if querystring is to be included inside the execution input. 
     */
    override fun querystring(querystring: Boolean) {
      cdkBuilder.querystring(querystring)
    }

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
     *
     * @param requestContext Which details of the incoming request must be passed onto the
     * underlying state machine, such as, account id, user identity, request id, etc. 
     */
    override fun requestContext(requestContext: RequestContext) {
      cdkBuilder.requestContext(requestContext.let(RequestContext.Companion::unwrap))
    }

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
     *
     * @param requestContext Which details of the incoming request must be passed onto the
     * underlying state machine, such as, account id, user identity, request id, etc. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("9ccbd02434b9431bcb834dc59080c0719cefcd922f89d03aa4d3ec47de85389b")
    override fun requestContext(requestContext: RequestContext.Builder.() -> Unit): Unit =
        requestContext(RequestContext(requestContext))

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

    /**
     * An IAM role that API Gateway will assume to start the execution of the state machine.
     *
     * Default: - a new role is created
     *
     * @param role An IAM role that API Gateway will assume to start the execution of the state
     * machine. 
     */
    override fun role(role: IRole) {
      cdkBuilder.role(role.let(IRole.Companion::unwrap))
    }

    /**
     * The default State Machine that handles all requests from this API.
     *
     * This stateMachine will be used as a the default integration for all methods in
     * this API, unless specified otherwise in `addMethod`.
     *
     * @param stateMachine The default State Machine that handles all requests from this API. 
     */
    override fun stateMachine(stateMachine: IStateMachine) {
      cdkBuilder.stateMachine(stateMachine.let(IStateMachine.Companion::unwrap))
    }

    /**
     * Whether to add default response models with 200, 400, and 500 status codes to the method.
     *
     * Default: true
     *
     * @param useDefaultMethodResponses Whether to add default response models with 200, 400, and
     * 500 status codes to the method. 
     */
    override fun useDefaultMethodResponses(useDefaultMethodResponses: Boolean) {
      cdkBuilder.useDefaultMethodResponses(useDefaultMethodResponses)
    }

    public fun build(): software.amazon.awscdk.services.apigateway.StepFunctionsRestApi =
        cdkBuilder.build()
  }

  public companion object {
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
        software.amazon.awscdk.services.apigateway.StepFunctionsRestApi = wrapped.cdkObject as
        software.amazon.awscdk.services.apigateway.StepFunctionsRestApi
  }
}
