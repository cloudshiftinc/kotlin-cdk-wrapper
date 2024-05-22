@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.apigateway

import io.cloudshiftdev.awscdk.RemovalPolicy
import io.cloudshiftdev.awscdk.Size
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import io.cloudshiftdev.awscdk.services.iam.PolicyDocument
import kotlin.Boolean
import kotlin.Deprecated
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.Map
import kotlin.jvm.JvmName

/**
 * Props to create a new instance of RestApi.
 *
 * Example:
 *
 * ```
 * Bucket destinationBucket = new Bucket(this, "Bucket");
 * Role deliveryStreamRole = Role.Builder.create(this, "Role")
 * .assumedBy(new ServicePrincipal("firehose.amazonaws.com"))
 * .build();
 * CfnDeliveryStream stream = CfnDeliveryStream.Builder.create(this, "MyStream")
 * .deliveryStreamName("amazon-apigateway-delivery-stream")
 * .s3DestinationConfiguration(S3DestinationConfigurationProperty.builder()
 * .bucketArn(destinationBucket.getBucketArn())
 * .roleArn(deliveryStreamRole.getRoleArn())
 * .build())
 * .build();
 * RestApi api = RestApi.Builder.create(this, "books")
 * .deployOptions(StageOptions.builder()
 * .accessLogDestination(new FirehoseLogDestination(stream))
 * .accessLogFormat(AccessLogFormat.jsonWithStandardFields())
 * .build())
 * .build();
 * ```
 */
public interface RestApiProps : ResourceOptions, RestApiBaseProps {
  /**
   * The source of the API key for metering requests according to a usage plan.
   *
   * Default: - Metering is disabled.
   */
  public fun apiKeySourceType(): ApiKeySourceType? =
      unwrap(this).getApiKeySourceType()?.let(ApiKeySourceType::wrap)

  /**
   * The list of binary media mime-types that are supported by the RestApi resource, such as
   * "image/png" or "application/octet-stream".
   *
   * Default: - RestApi supports only UTF-8-encoded text payloads.
   */
  public fun binaryMediaTypes(): List<String> = unwrap(this).getBinaryMediaTypes() ?: emptyList()

  /**
   * The ID of the API Gateway RestApi resource that you want to clone.
   *
   * Default: - None.
   */
  public fun cloneFrom(): IRestApi? = unwrap(this).getCloneFrom()?.let(IRestApi::wrap)

  /**
   * The EndpointConfiguration property type specifies the endpoint types of a REST API.
   *
   * Default: EndpointType.EDGE
   *
   * [Documentation](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-restapi-endpointconfiguration.html)
   */
  public fun endpointConfiguration(): EndpointConfiguration? =
      unwrap(this).getEndpointConfiguration()?.let(EndpointConfiguration::wrap)

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
  public fun minCompressionSize(): Size? = unwrap(this).getMinCompressionSize()?.let(Size::wrap)

  /**
   * (deprecated) A nullable integer that is used to enable compression (with non-negative between 0
   * and 10485760 (10M) bytes, inclusive) or disable compression (when undefined) on an API.
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
  public fun minimumCompressionSize(): Number? = unwrap(this).getMinimumCompressionSize()

  /**
   * A builder for [RestApiProps]
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
    @JvmName("03f9e27bf74605e728127e86d79e339787a76892cc44a528c726c5b7faa37b0b")
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
    @JvmName("257b2f68f707783e0f3e8e4d8817383b5c6f0269473f2681f46d456f33d105a2")
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
    @JvmName("2e88da5966f774fe6640de67a21669bc788349fbf7ccbfcc395b452902dd8175")
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
    @JvmName("5fa61f032dede72171708da9916000be8d1fc004705781467a92a123b77416db")
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
    @JvmName("cce40bf3ef5b7435af09ec56e53e4f37754de258231a2c68f4d737326681cb7e")
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
    @JvmName("f0f85887be69a0c8ae2cbdabf8f5a12ec16de87eece75fa8c0e7ebfd4af6ffc6")
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
    @JvmName("ace609761a21385d5e7ce952b975a4054cddf189c5dcb27864d25961bb29077b")
    public fun policy(policy: PolicyDocument.Builder.() -> Unit)

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
    private val cdkBuilder: software.amazon.awscdk.services.apigateway.RestApiProps.Builder =
        software.amazon.awscdk.services.apigateway.RestApiProps.builder()

    /**
     * @param apiKeySourceType The source of the API key for metering requests according to a usage
     * plan.
     */
    override fun apiKeySourceType(apiKeySourceType: ApiKeySourceType) {
      cdkBuilder.apiKeySourceType(apiKeySourceType.let(ApiKeySourceType.Companion::unwrap))
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
      cdkBuilder.cloneFrom(cloneFrom.let(IRestApi.Companion::unwrap))
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
      cdkBuilder.cloudWatchRoleRemovalPolicy(cloudWatchRoleRemovalPolicy.let(RemovalPolicy.Companion::unwrap))
    }

    /**
     * @param defaultCorsPreflightOptions Adds a CORS preflight OPTIONS method to this resource and
     * all child resources.
     * You can add CORS at the resource-level using `addCorsPreflight`.
     */
    override fun defaultCorsPreflightOptions(defaultCorsPreflightOptions: CorsOptions) {
      cdkBuilder.defaultCorsPreflightOptions(defaultCorsPreflightOptions.let(CorsOptions.Companion::unwrap))
    }

    /**
     * @param defaultCorsPreflightOptions Adds a CORS preflight OPTIONS method to this resource and
     * all child resources.
     * You can add CORS at the resource-level using `addCorsPreflight`.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("03f9e27bf74605e728127e86d79e339787a76892cc44a528c726c5b7faa37b0b")
    override
        fun defaultCorsPreflightOptions(defaultCorsPreflightOptions: CorsOptions.Builder.() -> Unit):
        Unit = defaultCorsPreflightOptions(CorsOptions(defaultCorsPreflightOptions))

    /**
     * @param defaultIntegration An integration to use as a default for all methods created within
     * this API unless an integration is specified.
     */
    override fun defaultIntegration(defaultIntegration: Integration) {
      cdkBuilder.defaultIntegration(defaultIntegration.let(Integration.Companion::unwrap))
    }

    /**
     * @param defaultIntegration An integration to use as a default for all methods created within
     * this API unless an integration is specified.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("257b2f68f707783e0f3e8e4d8817383b5c6f0269473f2681f46d456f33d105a2")
    override fun defaultIntegration(defaultIntegration: Integration.Builder.() -> Unit): Unit =
        defaultIntegration(Integration(defaultIntegration))

    /**
     * @param defaultMethodOptions Method options to use as a default for all methods created within
     * this API unless custom options are specified.
     */
    override fun defaultMethodOptions(defaultMethodOptions: MethodOptions) {
      cdkBuilder.defaultMethodOptions(defaultMethodOptions.let(MethodOptions.Companion::unwrap))
    }

    /**
     * @param defaultMethodOptions Method options to use as a default for all methods created within
     * this API unless custom options are specified.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("2e88da5966f774fe6640de67a21669bc788349fbf7ccbfcc395b452902dd8175")
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
      cdkBuilder.deployOptions(deployOptions.let(StageOptions.Companion::unwrap))
    }

    /**
     * @param deployOptions Options for the API Gateway stage that will always point to the latest
     * deployment when `deploy` is enabled.
     * If `deploy` is disabled,
     * this value cannot be set.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("5fa61f032dede72171708da9916000be8d1fc004705781467a92a123b77416db")
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
      cdkBuilder.domainName(domainName.let(DomainNameOptions.Companion::unwrap))
    }

    /**
     * @param domainName Configure a custom domain name and map it to this API.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("cce40bf3ef5b7435af09ec56e53e4f37754de258231a2c68f4d737326681cb7e")
    override fun domainName(domainName: DomainNameOptions.Builder.() -> Unit): Unit =
        domainName(DomainNameOptions(domainName))

    /**
     * @param endpointConfiguration The EndpointConfiguration property type specifies the endpoint
     * types of a REST API.
     */
    override fun endpointConfiguration(endpointConfiguration: EndpointConfiguration) {
      cdkBuilder.endpointConfiguration(endpointConfiguration.let(EndpointConfiguration.Companion::unwrap))
    }

    /**
     * @param endpointConfiguration The EndpointConfiguration property type specifies the endpoint
     * types of a REST API.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("f0f85887be69a0c8ae2cbdabf8f5a12ec16de87eece75fa8c0e7ebfd4af6ffc6")
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
      cdkBuilder.endpointTypes(endpointTypes.map(EndpointType.Companion::unwrap))
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
     * @param minCompressionSize A Size(in bytes, kibibytes, mebibytes etc) that is used to enable
     * compression (with non-negative between 0 and 10485760 (10M) bytes, inclusive) or disable
     * compression (when undefined) on an API.
     * When compression is enabled, compression or
     * decompression is not applied on the payload if the payload size is
     * smaller than this value. Setting it to zero allows compression for any
     * payload size.
     */
    override fun minCompressionSize(minCompressionSize: Size) {
      cdkBuilder.minCompressionSize(minCompressionSize.let(Size.Companion::unwrap))
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
      cdkBuilder.policy(policy.let(PolicyDocument.Companion::unwrap))
    }

    /**
     * @param policy A policy document that contains the permissions for this RestApi.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("ace609761a21385d5e7ce952b975a4054cddf189c5dcb27864d25961bb29077b")
    override fun policy(policy: PolicyDocument.Builder.() -> Unit): Unit =
        policy(PolicyDocument(policy))

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

    public fun build(): software.amazon.awscdk.services.apigateway.RestApiProps = cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.apigateway.RestApiProps,
  ) : CdkObject(cdkObject), RestApiProps {
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
    public operator fun invoke(block: Builder.() -> Unit = {}): RestApiProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.apigateway.RestApiProps):
        RestApiProps = CdkObjectWrappers.wrap(cdkObject) as? RestApiProps ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: RestApiProps):
        software.amazon.awscdk.services.apigateway.RestApiProps = (wrapped as CdkObject).cdkObject
        as software.amazon.awscdk.services.apigateway.RestApiProps
  }
}
