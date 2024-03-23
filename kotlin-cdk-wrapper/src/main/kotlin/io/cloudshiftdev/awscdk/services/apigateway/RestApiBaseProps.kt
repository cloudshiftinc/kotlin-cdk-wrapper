@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.apigateway

import io.cloudshiftdev.awscdk.RemovalPolicy
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import io.cloudshiftdev.awscdk.services.iam.PolicyDocument
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.Map
import kotlin.jvm.JvmName

/**
 * Represents the props that all Rest APIs share.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.*;
 * import io.cloudshiftdev.awscdk.services.apigateway.*;
 * import io.cloudshiftdev.awscdk.services.certificatemanager.*;
 * import io.cloudshiftdev.awscdk.services.iam.*;
 * import io.cloudshiftdev.awscdk.services.s3.*;
 * IAccessLogDestination accessLogDestination;
 * AccessLogFormat accessLogFormat;
 * Bucket bucket;
 * Certificate certificate;
 * PolicyDocument policyDocument;
 * RestApiBaseProps restApiBaseProps = RestApiBaseProps.builder()
 * .cloudWatchRole(false)
 * .cloudWatchRoleRemovalPolicy(RemovalPolicy.DESTROY)
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
public interface RestApiBaseProps {
  /**
   * Automatically configure an AWS CloudWatch role for API Gateway.
   *
   * Default: - false if `@aws-cdk/aws-apigateway:disableCloudWatchRole` is enabled, true otherwise
   */
  public fun cloudWatchRole(): Boolean? = unwrap(this).getCloudWatchRole()

  /**
   * The removal policy applied to the AWS CloudWatch role when this resource is removed from the
   * application.
   *
   * Requires `cloudWatchRole` to be enabled.
   *
   * Default: - RemovalPolicy.RETAIN
   */
  public fun cloudWatchRoleRemovalPolicy(): RemovalPolicy? =
      unwrap(this).getCloudWatchRoleRemovalPolicy()?.let(RemovalPolicy::wrap)

  /**
   * Indicates if a Deployment should be automatically created for this API, and recreated when the
   * API model (resources, methods) changes.
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
  public fun deploy(): Boolean? = unwrap(this).getDeploy()

  /**
   * Options for the API Gateway stage that will always point to the latest deployment when `deploy`
   * is enabled.
   *
   * If `deploy` is disabled,
   * this value cannot be set.
   *
   * Default: - Based on defaults of `StageOptions`.
   */
  public fun deployOptions(): StageOptions? =
      unwrap(this).getDeployOptions()?.let(StageOptions::wrap)

  /**
   * A description of the RestApi construct.
   *
   * Default: - 'Automatically created by the RestApi construct'
   */
  public fun description(): String? = unwrap(this).getDescription()

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
  public fun disableExecuteApiEndpoint(): Boolean? = unwrap(this).getDisableExecuteApiEndpoint()

  /**
   * Configure a custom domain name and map it to this API.
   *
   * Default: - no domain name is defined, use `addDomainName` or directly define a `DomainName`.
   */
  public fun domainName(): DomainNameOptions? =
      unwrap(this).getDomainName()?.let(DomainNameOptions::wrap)

  /**
   * Export name for the CfnOutput containing the API endpoint.
   *
   * Default: - when no export name is given, output will be created without export
   */
  public fun endpointExportName(): String? = unwrap(this).getEndpointExportName()

  /**
   * A list of the endpoint types of the API.
   *
   * Use this property when creating
   * an API.
   *
   * Default: EndpointType.EDGE
   */
  public fun endpointTypes(): List<EndpointType> =
      unwrap(this).getEndpointTypes()?.map(EndpointType::wrap) ?: emptyList()

  /**
   * Indicates whether to roll back the resource if a warning occurs while API Gateway is creating
   * the RestApi resource.
   *
   * Default: false
   */
  public fun failOnWarnings(): Boolean? = unwrap(this).getFailOnWarnings()

  /**
   * Custom header parameters for the request.
   *
   * Default: - No parameters.
   *
   * [Documentation](https://docs.aws.amazon.com/cli/latest/reference/apigateway/import-rest-api.html)
   */
  public fun parameters(): Map<String, String> = unwrap(this).getParameters() ?: emptyMap()

  /**
   * A policy document that contains the permissions for this RestApi.
   *
   * Default: - No policy.
   */
  public fun policy(): PolicyDocument? = unwrap(this).getPolicy()?.let(PolicyDocument::wrap)

  /**
   * A name for the API Gateway RestApi resource.
   *
   * Default: - ID of the RestApi construct.
   */
  public fun restApiName(): String? = unwrap(this).getRestApiName()

  /**
   * Retains old deployment resources when the API changes.
   *
   * This allows
   * manually reverting stages to point to old deployments via the AWS
   * Console.
   *
   * Default: false
   */
  public fun retainDeployments(): Boolean? = unwrap(this).getRetainDeployments()

  /**
   * A builder for [RestApiBaseProps]
   */
  @CdkDslMarker
  public interface Builder {
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
    @JvmName("b8cc4a21277284909ec803ce2275769760bdaea1408a5add84fcf4c25bda48bc")
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
    @JvmName("b005a8e64494593376c5797cb7dd1cc0fb207fe86138fa9a0f2790f898ba9f1c")
    public fun domainName(domainName: DomainNameOptions.Builder.() -> Unit)

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
    @JvmName("d3f98602187c01121701f90e707637d68f8c24da15e7901228283fc1349da8c5")
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
    private val cdkBuilder: software.amazon.awscdk.services.apigateway.RestApiBaseProps.Builder =
        software.amazon.awscdk.services.apigateway.RestApiBaseProps.builder()

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
    @JvmName("b8cc4a21277284909ec803ce2275769760bdaea1408a5add84fcf4c25bda48bc")
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
    @JvmName("b005a8e64494593376c5797cb7dd1cc0fb207fe86138fa9a0f2790f898ba9f1c")
    override fun domainName(domainName: DomainNameOptions.Builder.() -> Unit): Unit =
        domainName(DomainNameOptions(domainName))

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
    @JvmName("d3f98602187c01121701f90e707637d68f8c24da15e7901228283fc1349da8c5")
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

    public fun build(): software.amazon.awscdk.services.apigateway.RestApiBaseProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.apigateway.RestApiBaseProps,
  ) : CdkObject(cdkObject), RestApiBaseProps {
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
    public operator fun invoke(block: Builder.() -> Unit = {}): RestApiBaseProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.apigateway.RestApiBaseProps):
        RestApiBaseProps = CdkObjectWrappers.wrap(cdkObject) as? RestApiBaseProps ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: RestApiBaseProps):
        software.amazon.awscdk.services.apigateway.RestApiBaseProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.apigateway.RestApiBaseProps
  }
}
