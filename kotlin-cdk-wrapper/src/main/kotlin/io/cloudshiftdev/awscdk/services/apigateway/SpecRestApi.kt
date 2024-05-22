@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.apigateway

import io.cloudshiftdev.awscdk.RemovalPolicy
import io.cloudshiftdev.awscdk.Size
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.services.iam.PolicyDocument
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.Map
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * Represents a REST API in Amazon API Gateway, created with an OpenAPI specification.
 *
 * Some properties normally accessible on
 *
 * Example:
 *
 * ```
 * Integration integration;
 * SpecRestApi api = SpecRestApi.Builder.create(this, "books-api")
 * .apiDefinition(ApiDefinition.fromAsset("path-to-file.json"))
 * .build();
 * Resource booksResource = api.root.addResource("books");
 * booksResource.addMethod("GET", integration);
 * ```
 *
 * @see <a href=" `RestApi` - such as the description -
 * must be declared in the specification. All Resources and Methods need to be defined as
 * part of the OpenAPI specification file, and cannot be added via the CDK.
 * By default, the API will automatically be deployed and accessible from a
 * public endpoint."> `RestApi` - such as the description -
 * must be declared in the specification. All Resources and Methods need to be defined as
 * part of the OpenAPI specification file, and cannot be added via the CDK.
 * By default, the API will automatically be deployed and accessible from a
 * public endpoint.</a>
 */
public open class SpecRestApi(
  cdkObject: software.amazon.awscdk.services.apigateway.SpecRestApi,
) : RestApiBase(cdkObject) {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: SpecRestApiProps,
  ) :
      this(software.amazon.awscdk.services.apigateway.SpecRestApi(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id, props.let(SpecRestApiProps.Companion::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: SpecRestApiProps.Builder.() -> Unit,
  ) : this(scope, id, SpecRestApiProps(props)
  )

  /**
   * The ID of this API Gateway RestApi.
   */
  public override fun restApiId(): String = unwrap(this).getRestApiId()

  /**
   * The resource ID of the root resource.
   */
  public override fun restApiRootResourceId(): String = unwrap(this).getRestApiRootResourceId()

  /**
   * Represents the root resource of this API endpoint ('/').
   *
   * Resources and Methods are added to this resource.
   */
  public override fun root(): IResource = unwrap(this).getRoot().let(IResource::wrap)

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.apigateway.SpecRestApi].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * An OpenAPI definition compatible with API Gateway.
     *
     * [Documentation](https://docs.aws.amazon.com/apigateway/latest/developerguide/api-gateway-import-api.html)
     * @param apiDefinition An OpenAPI definition compatible with API Gateway. 
     */
    public fun apiDefinition(apiDefinition: ApiDefinition)

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
    @JvmName("758dc6f81ac3ea1bb90e059b8b088a10d0f4c3d7b156b649604d5e6112cd50bd")
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
    @JvmName("b80c8a9c718f329563b24d3ba2819bfe2c6791a922296beffa47a707d25665db")
    public fun domainName(domainName: DomainNameOptions.Builder.() -> Unit)

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
    @JvmName("ae5a1977bcc2f7f39aed8bf4f99f237f97db6602689710c9620d5d6cfc9bad5f")
    public fun policy(policy: PolicyDocument.Builder.() -> Unit)

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
    private val cdkBuilder: software.amazon.awscdk.services.apigateway.SpecRestApi.Builder =
        software.amazon.awscdk.services.apigateway.SpecRestApi.Builder.create(scope, id)

    /**
     * An OpenAPI definition compatible with API Gateway.
     *
     * [Documentation](https://docs.aws.amazon.com/apigateway/latest/developerguide/api-gateway-import-api.html)
     * @param apiDefinition An OpenAPI definition compatible with API Gateway. 
     */
    override fun apiDefinition(apiDefinition: ApiDefinition) {
      cdkBuilder.apiDefinition(apiDefinition.let(ApiDefinition.Companion::unwrap))
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
    @JvmName("758dc6f81ac3ea1bb90e059b8b088a10d0f4c3d7b156b649604d5e6112cd50bd")
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
    @JvmName("b80c8a9c718f329563b24d3ba2819bfe2c6791a922296beffa47a707d25665db")
    override fun domainName(domainName: DomainNameOptions.Builder.() -> Unit): Unit =
        domainName(DomainNameOptions(domainName))

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
    @JvmName("ae5a1977bcc2f7f39aed8bf4f99f237f97db6602689710c9620d5d6cfc9bad5f")
    override fun policy(policy: PolicyDocument.Builder.() -> Unit): Unit =
        policy(PolicyDocument(policy))

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

    public fun build(): software.amazon.awscdk.services.apigateway.SpecRestApi = cdkBuilder.build()
  }

  public companion object {
    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): SpecRestApi {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return SpecRestApi(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.apigateway.SpecRestApi):
        SpecRestApi = SpecRestApi(cdkObject)

    internal fun unwrap(wrapped: SpecRestApi):
        software.amazon.awscdk.services.apigateway.SpecRestApi = wrapped.cdkObject as
        software.amazon.awscdk.services.apigateway.SpecRestApi
  }
}
