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

import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.apigateway.AccessLogDestinationConfig
import software.amazon.awscdk.services.apigateway.AddApiKeyOptions
import software.amazon.awscdk.services.apigateway.ApiDefinitionConfig
import software.amazon.awscdk.services.apigateway.ApiDefinitionS3Location
import software.amazon.awscdk.services.apigateway.ApiKey
import software.amazon.awscdk.services.apigateway.ApiKeyOptions
import software.amazon.awscdk.services.apigateway.ApiKeyProps
import software.amazon.awscdk.services.apigateway.ApiMappingOptions
import software.amazon.awscdk.services.apigateway.AssetApiDefinition
import software.amazon.awscdk.services.apigateway.AwsIntegration
import software.amazon.awscdk.services.apigateway.AwsIntegrationProps
import software.amazon.awscdk.services.apigateway.BasePathMapping
import software.amazon.awscdk.services.apigateway.BasePathMappingOptions
import software.amazon.awscdk.services.apigateway.BasePathMappingProps
import software.amazon.awscdk.services.apigateway.CfnAccount
import software.amazon.awscdk.services.apigateway.CfnAccountProps
import software.amazon.awscdk.services.apigateway.CfnApiKey
import software.amazon.awscdk.services.apigateway.CfnApiKeyProps
import software.amazon.awscdk.services.apigateway.CfnAuthorizer
import software.amazon.awscdk.services.apigateway.CfnAuthorizerProps
import software.amazon.awscdk.services.apigateway.CfnBasePathMapping
import software.amazon.awscdk.services.apigateway.CfnBasePathMappingProps
import software.amazon.awscdk.services.apigateway.CfnClientCertificate
import software.amazon.awscdk.services.apigateway.CfnClientCertificateProps
import software.amazon.awscdk.services.apigateway.CfnDeployment
import software.amazon.awscdk.services.apigateway.CfnDeploymentProps
import software.amazon.awscdk.services.apigateway.CfnDocumentationPart
import software.amazon.awscdk.services.apigateway.CfnDocumentationPartProps
import software.amazon.awscdk.services.apigateway.CfnDocumentationVersion
import software.amazon.awscdk.services.apigateway.CfnDocumentationVersionProps
import software.amazon.awscdk.services.apigateway.CfnDomainName
import software.amazon.awscdk.services.apigateway.CfnDomainNameProps
import software.amazon.awscdk.services.apigateway.CfnGatewayResponse
import software.amazon.awscdk.services.apigateway.CfnGatewayResponseProps
import software.amazon.awscdk.services.apigateway.CfnMethod
import software.amazon.awscdk.services.apigateway.CfnMethodProps
import software.amazon.awscdk.services.apigateway.CfnModel
import software.amazon.awscdk.services.apigateway.CfnModelProps
import software.amazon.awscdk.services.apigateway.CfnRequestValidator
import software.amazon.awscdk.services.apigateway.CfnRequestValidatorProps
import software.amazon.awscdk.services.apigateway.CfnResource
import software.amazon.awscdk.services.apigateway.CfnResourceProps
import software.amazon.awscdk.services.apigateway.CfnRestApi
import software.amazon.awscdk.services.apigateway.CfnRestApiProps
import software.amazon.awscdk.services.apigateway.CfnStage
import software.amazon.awscdk.services.apigateway.CfnStageProps
import software.amazon.awscdk.services.apigateway.CfnUsagePlan
import software.amazon.awscdk.services.apigateway.CfnUsagePlanKey
import software.amazon.awscdk.services.apigateway.CfnUsagePlanKeyProps
import software.amazon.awscdk.services.apigateway.CfnUsagePlanProps
import software.amazon.awscdk.services.apigateway.CfnVpcLink
import software.amazon.awscdk.services.apigateway.CfnVpcLinkProps
import software.amazon.awscdk.services.apigateway.CognitoUserPoolsAuthorizer
import software.amazon.awscdk.services.apigateway.CognitoUserPoolsAuthorizerProps
import software.amazon.awscdk.services.apigateway.CorsOptions
import software.amazon.awscdk.services.apigateway.Deployment
import software.amazon.awscdk.services.apigateway.DeploymentProps
import software.amazon.awscdk.services.apigateway.DomainName
import software.amazon.awscdk.services.apigateway.DomainNameAttributes
import software.amazon.awscdk.services.apigateway.DomainNameOptions
import software.amazon.awscdk.services.apigateway.DomainNameProps
import software.amazon.awscdk.services.apigateway.EndpointConfiguration
import software.amazon.awscdk.services.apigateway.GatewayResponse
import software.amazon.awscdk.services.apigateway.GatewayResponseOptions
import software.amazon.awscdk.services.apigateway.GatewayResponseProps
import software.amazon.awscdk.services.apigateway.HttpIntegration
import software.amazon.awscdk.services.apigateway.HttpIntegrationProps
import software.amazon.awscdk.services.apigateway.Integration
import software.amazon.awscdk.services.apigateway.IntegrationConfig
import software.amazon.awscdk.services.apigateway.IntegrationOptions
import software.amazon.awscdk.services.apigateway.IntegrationProps
import software.amazon.awscdk.services.apigateway.IntegrationResponse
import software.amazon.awscdk.services.apigateway.JsonSchema
import software.amazon.awscdk.services.apigateway.JsonWithStandardFieldProps
import software.amazon.awscdk.services.apigateway.LambdaAuthorizerProps
import software.amazon.awscdk.services.apigateway.LambdaIntegration
import software.amazon.awscdk.services.apigateway.LambdaIntegrationOptions
import software.amazon.awscdk.services.apigateway.LambdaRestApi
import software.amazon.awscdk.services.apigateway.LambdaRestApiProps
import software.amazon.awscdk.services.apigateway.MTLSConfig
import software.amazon.awscdk.services.apigateway.Method
import software.amazon.awscdk.services.apigateway.MethodDeploymentOptions
import software.amazon.awscdk.services.apigateway.MethodOptions
import software.amazon.awscdk.services.apigateway.MethodProps
import software.amazon.awscdk.services.apigateway.MethodResponse
import software.amazon.awscdk.services.apigateway.MockIntegration
import software.amazon.awscdk.services.apigateway.Model
import software.amazon.awscdk.services.apigateway.ModelOptions
import software.amazon.awscdk.services.apigateway.ModelProps
import software.amazon.awscdk.services.apigateway.ProxyResource
import software.amazon.awscdk.services.apigateway.ProxyResourceOptions
import software.amazon.awscdk.services.apigateway.ProxyResourceProps
import software.amazon.awscdk.services.apigateway.QuotaSettings
import software.amazon.awscdk.services.apigateway.RateLimitedApiKey
import software.amazon.awscdk.services.apigateway.RateLimitedApiKeyProps
import software.amazon.awscdk.services.apigateway.RequestAuthorizer
import software.amazon.awscdk.services.apigateway.RequestAuthorizerProps
import software.amazon.awscdk.services.apigateway.RequestContext
import software.amazon.awscdk.services.apigateway.RequestValidator
import software.amazon.awscdk.services.apigateway.RequestValidatorOptions
import software.amazon.awscdk.services.apigateway.RequestValidatorProps
import software.amazon.awscdk.services.apigateway.Resource
import software.amazon.awscdk.services.apigateway.ResourceAttributes
import software.amazon.awscdk.services.apigateway.ResourceOptions
import software.amazon.awscdk.services.apigateway.ResourceProps
import software.amazon.awscdk.services.apigateway.RestApi
import software.amazon.awscdk.services.apigateway.RestApiAttributes
import software.amazon.awscdk.services.apigateway.RestApiBaseProps
import software.amazon.awscdk.services.apigateway.RestApiProps
import software.amazon.awscdk.services.apigateway.SagemakerIntegration
import software.amazon.awscdk.services.apigateway.SagemakerIntegrationOptions
import software.amazon.awscdk.services.apigateway.SpecRestApi
import software.amazon.awscdk.services.apigateway.SpecRestApiProps
import software.amazon.awscdk.services.apigateway.Stage
import software.amazon.awscdk.services.apigateway.StageAttributes
import software.amazon.awscdk.services.apigateway.StageOptions
import software.amazon.awscdk.services.apigateway.StageProps
import software.amazon.awscdk.services.apigateway.StepFunctionsExecutionIntegrationOptions
import software.amazon.awscdk.services.apigateway.StepFunctionsRestApi
import software.amazon.awscdk.services.apigateway.StepFunctionsRestApiProps
import software.amazon.awscdk.services.apigateway.ThrottleSettings
import software.amazon.awscdk.services.apigateway.ThrottlingPerMethod
import software.amazon.awscdk.services.apigateway.TokenAuthorizer
import software.amazon.awscdk.services.apigateway.TokenAuthorizerProps
import software.amazon.awscdk.services.apigateway.UsagePlan
import software.amazon.awscdk.services.apigateway.UsagePlanPerApiStage
import software.amazon.awscdk.services.apigateway.UsagePlanProps
import software.amazon.awscdk.services.apigateway.VpcLink
import software.amazon.awscdk.services.apigateway.VpcLinkProps
import software.amazon.awscdk.services.lambda.IFunction
import software.amazon.awscdk.services.sagemaker.IEndpoint
import software.constructs.Construct

public object apigateway {
    /**
     * Options when binding a log destination to a RestApi Stage.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.apigateway.*;
     * AccessLogDestinationConfig accessLogDestinationConfig = AccessLogDestinationConfig.builder()
     * .destinationArn("destinationArn")
     * .build();
     * ```
     */
    public inline fun accessLogDestinationConfig(
        block: AccessLogDestinationConfigDsl.() -> Unit = {}
    ): AccessLogDestinationConfig {
        val builder = AccessLogDestinationConfigDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Options to the UsagePlan.addApiKey() method.
     *
     * Example:
     * ```
     * UsagePlan usageplan;
     * ApiKey apiKey;
     * usageplan.addApiKey(apiKey, AddApiKeyOptions.builder()
     * .overrideLogicalId("...")
     * .build());
     * ```
     */
    public inline fun addApiKeyOptions(
        block: AddApiKeyOptionsDsl.() -> Unit = {}
    ): AddApiKeyOptions {
        val builder = AddApiKeyOptionsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Post-Binding Configuration for a CDK construct.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.apigateway.*;
     * Object inlineDefinition;
     * ApiDefinitionConfig apiDefinitionConfig = ApiDefinitionConfig.builder()
     * .inlineDefinition(inlineDefinition)
     * .s3Location(ApiDefinitionS3Location.builder()
     * .bucket("bucket")
     * .key("key")
     * // the properties below are optional
     * .version("version")
     * .build())
     * .build();
     * ```
     */
    public inline fun apiDefinitionConfig(
        block: ApiDefinitionConfigDsl.() -> Unit = {}
    ): ApiDefinitionConfig {
        val builder = ApiDefinitionConfigDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * S3 location of the API definition file.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.apigateway.*;
     * ApiDefinitionS3Location apiDefinitionS3Location = ApiDefinitionS3Location.builder()
     * .bucket("bucket")
     * .key("key")
     * // the properties below are optional
     * .version("version")
     * .build();
     * ```
     */
    public inline fun apiDefinitionS3Location(
        block: ApiDefinitionS3LocationDsl.() -> Unit = {}
    ): ApiDefinitionS3Location {
        val builder = ApiDefinitionS3LocationDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * An API Gateway ApiKey.
     *
     * An ApiKey can be distributed to API clients that are executing requests for Method resources
     * that require an Api Key.
     *
     * Example:
     * ```
     * IApiKey importedKey = ApiKey.fromApiKeyId(this, "imported-key", "&lt;api-key-id&gt;");
     * ```
     */
    public inline fun apiKey(
        scope: Construct,
        id: String,
        block: ApiKeyDsl.() -> Unit = {},
    ): ApiKey {
        val builder = ApiKeyDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * The options for creating an API Key.
     *
     * Example:
     * ```
     * RestApi api;
     * IApiKey key = api.addApiKey("ApiKey", ApiKeyOptions.builder()
     * .apiKeyName("myApiKey1")
     * .value("MyApiKeyThatIsAtLeast20Characters")
     * .build());
     * ```
     */
    public inline fun apiKeyOptions(block: ApiKeyOptionsDsl.() -> Unit = {}): ApiKeyOptions {
        val builder = ApiKeyOptionsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * ApiKey Properties.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.*;
     * import software.amazon.awscdk.services.apigateway.*;
     * Authorizer authorizer;
     * Integration integration;
     * Model model;
     * RequestValidator requestValidator;
     * RestApi restApi;
     * Stage stage;
     * ApiKeyProps apiKeyProps = ApiKeyProps.builder()
     * .apiKeyName("apiKeyName")
     * .customerId("customerId")
     * .defaultCorsPreflightOptions(CorsOptions.builder()
     * .allowOrigins(List.of("allowOrigins"))
     * // the properties below are optional
     * .allowCredentials(false)
     * .allowHeaders(List.of("allowHeaders"))
     * .allowMethods(List.of("allowMethods"))
     * .disableCache(false)
     * .exposeHeaders(List.of("exposeHeaders"))
     * .maxAge(Duration.minutes(30))
     * .statusCode(123)
     * .build())
     * .defaultIntegration(integration)
     * .defaultMethodOptions(MethodOptions.builder()
     * .apiKeyRequired(false)
     * .authorizationScopes(List.of("authorizationScopes"))
     * .authorizationType(AuthorizationType.NONE)
     * .authorizer(authorizer)
     * .methodResponses(List.of(MethodResponse.builder()
     * .statusCode("statusCode")
     * // the properties below are optional
     * .responseModels(Map.of(
     * "responseModelsKey", model))
     * .responseParameters(Map.of(
     * "responseParametersKey", false))
     * .build()))
     * .operationName("operationName")
     * .requestModels(Map.of(
     * "requestModelsKey", model))
     * .requestParameters(Map.of(
     * "requestParametersKey", false))
     * .requestValidator(requestValidator)
     * .requestValidatorOptions(RequestValidatorOptions.builder()
     * .requestValidatorName("requestValidatorName")
     * .validateRequestBody(false)
     * .validateRequestParameters(false)
     * .build())
     * .build())
     * .description("description")
     * .enabled(false)
     * .generateDistinctId(false)
     * .resources(List.of(restApi))
     * .stages(List.of(stage))
     * .value("value")
     * .build();
     * ```
     */
    public inline fun apiKeyProps(block: ApiKeyPropsDsl.() -> Unit = {}): ApiKeyProps {
        val builder = ApiKeyPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Options for creating an api mapping.
     *
     * Example:
     * ```
     * Object acmCertificateForExampleCom;
     * RestApi restApi;
     * RestApi secondRestApi;
     * DomainName domain = DomainName.Builder.create(this, "custom-domain")
     * .domainName("example.com")
     * .certificate(acmCertificateForExampleCom)
     * .mapping(restApi)
     * .build();
     * domain.addApiMapping(secondRestApi.getDeploymentStage(), ApiMappingOptions.builder()
     * .basePath("orders/v2/api")
     * .build());
     * ```
     */
    public inline fun apiMappingOptions(
        block: ApiMappingOptionsDsl.() -> Unit = {}
    ): ApiMappingOptions {
        val builder = ApiMappingOptionsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * OpenAPI specification from a local file.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.*;
     * import software.amazon.awscdk.services.apigateway.*;
     * import software.amazon.awscdk.services.iam.*;
     * DockerImage dockerImage;
     * IGrantable grantable;
     * ILocalBundling localBundling;
     * AssetApiDefinition assetApiDefinition = AssetApiDefinition.Builder.create("path")
     * .assetHash("assetHash")
     * .assetHashType(AssetHashType.SOURCE)
     * .bundling(BundlingOptions.builder()
     * .image(dockerImage)
     * // the properties below are optional
     * .bundlingFileAccess(BundlingFileAccess.VOLUME_COPY)
     * .command(List.of("command"))
     * .entrypoint(List.of("entrypoint"))
     * .environment(Map.of(
     * "environmentKey", "environment"))
     * .local(localBundling)
     * .network("network")
     * .outputType(BundlingOutput.ARCHIVED)
     * .platform("platform")
     * .securityOpt("securityOpt")
     * .user("user")
     * .volumes(List.of(DockerVolume.builder()
     * .containerPath("containerPath")
     * .hostPath("hostPath")
     * // the properties below are optional
     * .consistency(DockerVolumeConsistency.CONSISTENT)
     * .build()))
     * .volumesFrom(List.of("volumesFrom"))
     * .workingDirectory("workingDirectory")
     * .build())
     * .deployTime(false)
     * .exclude(List.of("exclude"))
     * .followSymlinks(SymlinkFollowMode.NEVER)
     * .ignoreMode(IgnoreMode.GLOB)
     * .readers(List.of(grantable))
     * .build();
     * ```
     */
    public inline fun assetApiDefinition(
        path: String,
        block: AssetApiDefinitionDsl.() -> Unit = {}
    ): AssetApiDefinition {
        val builder = AssetApiDefinitionDsl(path)
        builder.apply(block)
        return builder.build()
    }

    /**
     * This type of integration lets an API expose AWS service actions.
     *
     * It is intended for calling all AWS service actions, but is not recommended for calling a
     * Lambda function, because the Lambda custom integration is a legacy technology.
     *
     * Example:
     * ```
     * AwsIntegration getMessageIntegration = AwsIntegration.Builder.create()
     * .service("sqs")
     * .path("queueName")
     * .region("eu-west-1")
     * .build();
     * ```
     */
    public inline fun awsIntegration(block: AwsIntegrationDsl.() -> Unit = {}): AwsIntegration {
        val builder = AwsIntegrationDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Example:
     * ```
     * AwsIntegration getMessageIntegration = AwsIntegration.Builder.create()
     * .service("sqs")
     * .path("queueName")
     * .region("eu-west-1")
     * .build();
     * ```
     */
    public inline fun awsIntegrationProps(
        block: AwsIntegrationPropsDsl.() -> Unit = {}
    ): AwsIntegrationProps {
        val builder = AwsIntegrationPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * This resource creates a base path that clients who call your API must use in the invocation
     * URL.
     *
     * Unless you're importing a domain with `DomainName.fromDomainNameAttributes()`, you can use
     * `DomainName.addBasePathMapping()` to define mappings.
     *
     * Example:
     * ```
     * RestApi api;
     * IDomainName domainName = DomainName.fromDomainNameAttributes(this, "DomainName",
     * DomainNameAttributes.builder()
     * .domainName("domainName")
     * .domainNameAliasHostedZoneId("domainNameAliasHostedZoneId")
     * .domainNameAliasTarget("domainNameAliasTarget")
     * .build());
     * BasePathMapping.Builder.create(this, "BasePathMapping")
     * .domainName(domainName)
     * .restApi(api)
     * .build();
     * ```
     */
    public inline fun basePathMapping(
        scope: Construct,
        id: String,
        block: BasePathMappingDsl.() -> Unit = {},
    ): BasePathMapping {
        val builder = BasePathMappingDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Example:
     * ```
     * DomainName domain;
     * RestApi api1;
     * RestApi api2;
     * domain.addBasePathMapping(api1,
     * BasePathMappingOptions.builder().basePath("go-to-api1").build());
     * domain.addBasePathMapping(api2, BasePathMappingOptions.builder().basePath("boom").build());
     * ```
     */
    public inline fun basePathMappingOptions(
        block: BasePathMappingOptionsDsl.() -> Unit = {}
    ): BasePathMappingOptions {
        val builder = BasePathMappingOptionsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Example:
     * ```
     * RestApi api;
     * IDomainName domainName = DomainName.fromDomainNameAttributes(this, "DomainName",
     * DomainNameAttributes.builder()
     * .domainName("domainName")
     * .domainNameAliasHostedZoneId("domainNameAliasHostedZoneId")
     * .domainNameAliasTarget("domainNameAliasTarget")
     * .build());
     * BasePathMapping.Builder.create(this, "BasePathMapping")
     * .domainName(domainName)
     * .restApi(api)
     * .build();
     * ```
     */
    public inline fun basePathMappingProps(
        block: BasePathMappingPropsDsl.() -> Unit = {}
    ): BasePathMappingProps {
        val builder = BasePathMappingPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The `AWS::ApiGateway::Account` resource specifies the IAM role that Amazon API Gateway uses
     * to write API logs to Amazon CloudWatch Logs.
     *
     * To avoid overwriting other roles, you should only have one `AWS::ApiGateway::Account`
     * resource per region per account.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.apigateway.*;
     * CfnAccount cfnAccount = CfnAccount.Builder.create(this, "MyCfnAccount")
     * .cloudWatchRoleArn("cloudWatchRoleArn")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-account.html)
     */
    public inline fun cfnAccount(
        scope: Construct,
        id: String,
        block: CfnAccountDsl.() -> Unit = {},
    ): CfnAccount {
        val builder = CfnAccountDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnAccount`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.apigateway.*;
     * CfnAccountProps cfnAccountProps = CfnAccountProps.builder()
     * .cloudWatchRoleArn("cloudWatchRoleArn")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-account.html)
     */
    public inline fun cfnAccountProps(block: CfnAccountPropsDsl.() -> Unit = {}): CfnAccountProps {
        val builder = CfnAccountPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The `AWS::ApiGateway::ApiKey` resource creates a unique key that you can distribute to
     * clients who are executing API Gateway `Method` resources that require an API key.
     *
     * To specify which API key clients must use, map the API key with the `RestApi` and `Stage`
     * resources that include the methods that require a key.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.apigateway.*;
     * CfnApiKey cfnApiKey = CfnApiKey.Builder.create(this, "MyCfnApiKey")
     * .customerId("customerId")
     * .description("description")
     * .enabled(false)
     * .generateDistinctId(false)
     * .name("name")
     * .stageKeys(List.of(StageKeyProperty.builder()
     * .restApiId("restApiId")
     * .stageName("stageName")
     * .build()))
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .value("value")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-apikey.html)
     */
    public inline fun cfnApiKey(
        scope: Construct,
        id: String,
        block: CfnApiKeyDsl.() -> Unit = {},
    ): CfnApiKey {
        val builder = CfnApiKeyDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnApiKey`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.apigateway.*;
     * CfnApiKeyProps cfnApiKeyProps = CfnApiKeyProps.builder()
     * .customerId("customerId")
     * .description("description")
     * .enabled(false)
     * .generateDistinctId(false)
     * .name("name")
     * .stageKeys(List.of(StageKeyProperty.builder()
     * .restApiId("restApiId")
     * .stageName("stageName")
     * .build()))
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .value("value")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-apikey.html)
     */
    public inline fun cfnApiKeyProps(block: CfnApiKeyPropsDsl.() -> Unit = {}): CfnApiKeyProps {
        val builder = CfnApiKeyPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * `StageKey` is a property of the
     * [AWS::ApiGateway::ApiKey](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-apikey.html)
     * resource that specifies the stage to associate with the API key. This association allows only
     * clients with the key to make requests to methods in that stage.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.apigateway.*;
     * StageKeyProperty stageKeyProperty = StageKeyProperty.builder()
     * .restApiId("restApiId")
     * .stageName("stageName")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-apikey-stagekey.html)
     */
    public inline fun cfnApiKeyStageKeyProperty(
        block: CfnApiKeyStageKeyPropertyDsl.() -> Unit = {}
    ): CfnApiKey.StageKeyProperty {
        val builder = CfnApiKeyStageKeyPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The `AWS::ApiGateway::Authorizer` resource creates an authorization layer that API Gateway
     * activates for methods that have authorization enabled.
     *
     * API Gateway activates the authorizer when a client calls those methods.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.apigateway.*;
     * CfnAuthorizer cfnAuthorizer = CfnAuthorizer.Builder.create(this, "MyCfnAuthorizer")
     * .name("name")
     * .restApiId("restApiId")
     * .type("type")
     * // the properties below are optional
     * .authorizerCredentials("authorizerCredentials")
     * .authorizerResultTtlInSeconds(123)
     * .authorizerUri("authorizerUri")
     * .authType("authType")
     * .identitySource("identitySource")
     * .identityValidationExpression("identityValidationExpression")
     * .providerArns(List.of("providerArns"))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-authorizer.html)
     */
    public inline fun cfnAuthorizer(
        scope: Construct,
        id: String,
        block: CfnAuthorizerDsl.() -> Unit = {},
    ): CfnAuthorizer {
        val builder = CfnAuthorizerDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnAuthorizer`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.apigateway.*;
     * CfnAuthorizerProps cfnAuthorizerProps = CfnAuthorizerProps.builder()
     * .name("name")
     * .restApiId("restApiId")
     * .type("type")
     * // the properties below are optional
     * .authorizerCredentials("authorizerCredentials")
     * .authorizerResultTtlInSeconds(123)
     * .authorizerUri("authorizerUri")
     * .authType("authType")
     * .identitySource("identitySource")
     * .identityValidationExpression("identityValidationExpression")
     * .providerArns(List.of("providerArns"))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-authorizer.html)
     */
    public inline fun cfnAuthorizerProps(
        block: CfnAuthorizerPropsDsl.() -> Unit = {}
    ): CfnAuthorizerProps {
        val builder = CfnAuthorizerPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The `AWS::ApiGateway::BasePathMapping` resource creates a base path that clients who call
     * your API must use in the invocation URL.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.apigateway.*;
     * CfnBasePathMapping cfnBasePathMapping = CfnBasePathMapping.Builder.create(this,
     * "MyCfnBasePathMapping")
     * .domainName("domainName")
     * // the properties below are optional
     * .basePath("basePath")
     * .id("id")
     * .restApiId("restApiId")
     * .stage("stage")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-basepathmapping.html)
     */
    public inline fun cfnBasePathMapping(
        scope: Construct,
        id: String,
        block: CfnBasePathMappingDsl.() -> Unit = {},
    ): CfnBasePathMapping {
        val builder = CfnBasePathMappingDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnBasePathMapping`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.apigateway.*;
     * CfnBasePathMappingProps cfnBasePathMappingProps = CfnBasePathMappingProps.builder()
     * .domainName("domainName")
     * // the properties below are optional
     * .basePath("basePath")
     * .id("id")
     * .restApiId("restApiId")
     * .stage("stage")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-basepathmapping.html)
     */
    public inline fun cfnBasePathMappingProps(
        block: CfnBasePathMappingPropsDsl.() -> Unit = {}
    ): CfnBasePathMappingProps {
        val builder = CfnBasePathMappingPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The `AWS::ApiGateway::ClientCertificate` resource creates a client certificate that API
     * Gateway uses to configure client-side SSL authentication for sending requests to the
     * integration endpoint.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.apigateway.*;
     * CfnClientCertificate cfnClientCertificate = CfnClientCertificate.Builder.create(this,
     * "MyCfnClientCertificate")
     * .description("description")
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-clientcertificate.html)
     */
    public inline fun cfnClientCertificate(
        scope: Construct,
        id: String,
        block: CfnClientCertificateDsl.() -> Unit = {},
    ): CfnClientCertificate {
        val builder = CfnClientCertificateDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnClientCertificate`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.apigateway.*;
     * CfnClientCertificateProps cfnClientCertificateProps = CfnClientCertificateProps.builder()
     * .description("description")
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-clientcertificate.html)
     */
    public inline fun cfnClientCertificateProps(
        block: CfnClientCertificatePropsDsl.() -> Unit = {}
    ): CfnClientCertificateProps {
        val builder = CfnClientCertificatePropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The `AWS::ApiGateway::Deployment` resource deploys an API Gateway `RestApi` resource to a
     * stage so that clients can call the API over the internet.
     *
     * The stage acts as an environment.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.apigateway.*;
     * CfnDeployment cfnDeployment = CfnDeployment.Builder.create(this, "MyCfnDeployment")
     * .restApiId("restApiId")
     * // the properties below are optional
     * .deploymentCanarySettings(DeploymentCanarySettingsProperty.builder()
     * .percentTraffic(123)
     * .stageVariableOverrides(Map.of(
     * "stageVariableOverridesKey", "stageVariableOverrides"))
     * .useStageCache(false)
     * .build())
     * .description("description")
     * .stageDescription(StageDescriptionProperty.builder()
     * .accessLogSetting(AccessLogSettingProperty.builder()
     * .destinationArn("destinationArn")
     * .format("format")
     * .build())
     * .cacheClusterEnabled(false)
     * .cacheClusterSize("cacheClusterSize")
     * .cacheDataEncrypted(false)
     * .cacheTtlInSeconds(123)
     * .cachingEnabled(false)
     * .canarySetting(CanarySettingProperty.builder()
     * .percentTraffic(123)
     * .stageVariableOverrides(Map.of(
     * "stageVariableOverridesKey", "stageVariableOverrides"))
     * .useStageCache(false)
     * .build())
     * .clientCertificateId("clientCertificateId")
     * .dataTraceEnabled(false)
     * .description("description")
     * .documentationVersion("documentationVersion")
     * .loggingLevel("loggingLevel")
     * .methodSettings(List.of(MethodSettingProperty.builder()
     * .cacheDataEncrypted(false)
     * .cacheTtlInSeconds(123)
     * .cachingEnabled(false)
     * .dataTraceEnabled(false)
     * .httpMethod("httpMethod")
     * .loggingLevel("loggingLevel")
     * .metricsEnabled(false)
     * .resourcePath("resourcePath")
     * .throttlingBurstLimit(123)
     * .throttlingRateLimit(123)
     * .build()))
     * .metricsEnabled(false)
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .throttlingBurstLimit(123)
     * .throttlingRateLimit(123)
     * .tracingEnabled(false)
     * .variables(Map.of(
     * "variablesKey", "variables"))
     * .build())
     * .stageName("stageName")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-deployment.html)
     */
    public inline fun cfnDeployment(
        scope: Construct,
        id: String,
        block: CfnDeploymentDsl.() -> Unit = {},
    ): CfnDeployment {
        val builder = CfnDeploymentDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * The `AccessLogSetting` property type specifies settings for logging access in this stage.
     *
     * `AccessLogSetting` is a property of the
     * [StageDescription](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-deployment-stagedescription.html)
     * property type.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.apigateway.*;
     * AccessLogSettingProperty accessLogSettingProperty = AccessLogSettingProperty.builder()
     * .destinationArn("destinationArn")
     * .format("format")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-deployment-accesslogsetting.html)
     */
    public inline fun cfnDeploymentAccessLogSettingProperty(
        block: CfnDeploymentAccessLogSettingPropertyDsl.() -> Unit = {}
    ): CfnDeployment.AccessLogSettingProperty {
        val builder = CfnDeploymentAccessLogSettingPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The `CanarySetting` property type specifies settings for the canary deployment in this stage.
     *
     * `CanarySetting` is a property of the
     * [StageDescription](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-deployment-stagedescription.html)
     * property type.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.apigateway.*;
     * CanarySettingProperty canarySettingProperty = CanarySettingProperty.builder()
     * .percentTraffic(123)
     * .stageVariableOverrides(Map.of(
     * "stageVariableOverridesKey", "stageVariableOverrides"))
     * .useStageCache(false)
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-deployment-canarysetting.html)
     */
    public inline fun cfnDeploymentCanarySettingProperty(
        block: CfnDeploymentCanarySettingPropertyDsl.() -> Unit = {}
    ): CfnDeployment.CanarySettingProperty {
        val builder = CfnDeploymentCanarySettingPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The `DeploymentCanarySettings` property type specifies settings for the canary deployment.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.apigateway.*;
     * DeploymentCanarySettingsProperty deploymentCanarySettingsProperty =
     * DeploymentCanarySettingsProperty.builder()
     * .percentTraffic(123)
     * .stageVariableOverrides(Map.of(
     * "stageVariableOverridesKey", "stageVariableOverrides"))
     * .useStageCache(false)
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-deployment-deploymentcanarysettings.html)
     */
    public inline fun cfnDeploymentDeploymentCanarySettingsProperty(
        block: CfnDeploymentDeploymentCanarySettingsPropertyDsl.() -> Unit = {}
    ): CfnDeployment.DeploymentCanarySettingsProperty {
        val builder = CfnDeploymentDeploymentCanarySettingsPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The `MethodSetting` property type configures settings for all methods in a stage.
     *
     * The `MethodSettings` property of the
     * [Amazon API Gateway Deployment StageDescription](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-deployment-stagedescription.html)
     * property type contains a list of `MethodSetting` property types.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.apigateway.*;
     * MethodSettingProperty methodSettingProperty = MethodSettingProperty.builder()
     * .cacheDataEncrypted(false)
     * .cacheTtlInSeconds(123)
     * .cachingEnabled(false)
     * .dataTraceEnabled(false)
     * .httpMethod("httpMethod")
     * .loggingLevel("loggingLevel")
     * .metricsEnabled(false)
     * .resourcePath("resourcePath")
     * .throttlingBurstLimit(123)
     * .throttlingRateLimit(123)
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-deployment-methodsetting.html)
     */
    public inline fun cfnDeploymentMethodSettingProperty(
        block: CfnDeploymentMethodSettingPropertyDsl.() -> Unit = {}
    ): CfnDeployment.MethodSettingProperty {
        val builder = CfnDeploymentMethodSettingPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnDeployment`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.apigateway.*;
     * CfnDeploymentProps cfnDeploymentProps = CfnDeploymentProps.builder()
     * .restApiId("restApiId")
     * // the properties below are optional
     * .deploymentCanarySettings(DeploymentCanarySettingsProperty.builder()
     * .percentTraffic(123)
     * .stageVariableOverrides(Map.of(
     * "stageVariableOverridesKey", "stageVariableOverrides"))
     * .useStageCache(false)
     * .build())
     * .description("description")
     * .stageDescription(StageDescriptionProperty.builder()
     * .accessLogSetting(AccessLogSettingProperty.builder()
     * .destinationArn("destinationArn")
     * .format("format")
     * .build())
     * .cacheClusterEnabled(false)
     * .cacheClusterSize("cacheClusterSize")
     * .cacheDataEncrypted(false)
     * .cacheTtlInSeconds(123)
     * .cachingEnabled(false)
     * .canarySetting(CanarySettingProperty.builder()
     * .percentTraffic(123)
     * .stageVariableOverrides(Map.of(
     * "stageVariableOverridesKey", "stageVariableOverrides"))
     * .useStageCache(false)
     * .build())
     * .clientCertificateId("clientCertificateId")
     * .dataTraceEnabled(false)
     * .description("description")
     * .documentationVersion("documentationVersion")
     * .loggingLevel("loggingLevel")
     * .methodSettings(List.of(MethodSettingProperty.builder()
     * .cacheDataEncrypted(false)
     * .cacheTtlInSeconds(123)
     * .cachingEnabled(false)
     * .dataTraceEnabled(false)
     * .httpMethod("httpMethod")
     * .loggingLevel("loggingLevel")
     * .metricsEnabled(false)
     * .resourcePath("resourcePath")
     * .throttlingBurstLimit(123)
     * .throttlingRateLimit(123)
     * .build()))
     * .metricsEnabled(false)
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .throttlingBurstLimit(123)
     * .throttlingRateLimit(123)
     * .tracingEnabled(false)
     * .variables(Map.of(
     * "variablesKey", "variables"))
     * .build())
     * .stageName("stageName")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-deployment.html)
     */
    public inline fun cfnDeploymentProps(
        block: CfnDeploymentPropsDsl.() -> Unit = {}
    ): CfnDeploymentProps {
        val builder = CfnDeploymentPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * `StageDescription` is a property of the
     * [AWS::ApiGateway::Deployment](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-deployment.html)
     * resource that configures a deployment stage.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.apigateway.*;
     * StageDescriptionProperty stageDescriptionProperty = StageDescriptionProperty.builder()
     * .accessLogSetting(AccessLogSettingProperty.builder()
     * .destinationArn("destinationArn")
     * .format("format")
     * .build())
     * .cacheClusterEnabled(false)
     * .cacheClusterSize("cacheClusterSize")
     * .cacheDataEncrypted(false)
     * .cacheTtlInSeconds(123)
     * .cachingEnabled(false)
     * .canarySetting(CanarySettingProperty.builder()
     * .percentTraffic(123)
     * .stageVariableOverrides(Map.of(
     * "stageVariableOverridesKey", "stageVariableOverrides"))
     * .useStageCache(false)
     * .build())
     * .clientCertificateId("clientCertificateId")
     * .dataTraceEnabled(false)
     * .description("description")
     * .documentationVersion("documentationVersion")
     * .loggingLevel("loggingLevel")
     * .methodSettings(List.of(MethodSettingProperty.builder()
     * .cacheDataEncrypted(false)
     * .cacheTtlInSeconds(123)
     * .cachingEnabled(false)
     * .dataTraceEnabled(false)
     * .httpMethod("httpMethod")
     * .loggingLevel("loggingLevel")
     * .metricsEnabled(false)
     * .resourcePath("resourcePath")
     * .throttlingBurstLimit(123)
     * .throttlingRateLimit(123)
     * .build()))
     * .metricsEnabled(false)
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .throttlingBurstLimit(123)
     * .throttlingRateLimit(123)
     * .tracingEnabled(false)
     * .variables(Map.of(
     * "variablesKey", "variables"))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-deployment-stagedescription.html)
     */
    public inline fun cfnDeploymentStageDescriptionProperty(
        block: CfnDeploymentStageDescriptionPropertyDsl.() -> Unit = {}
    ): CfnDeployment.StageDescriptionProperty {
        val builder = CfnDeploymentStageDescriptionPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The `AWS::ApiGateway::DocumentationPart` resource creates a documentation part for an API.
     *
     * For more information, see
     * [Representation of API Documentation in API Gateway](https://docs.aws.amazon.com/apigateway/latest/developerguide/api-gateway-documenting-api-content-representation.html)
     * in the *API Gateway Developer Guide* .
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.apigateway.*;
     * CfnDocumentationPart cfnDocumentationPart = CfnDocumentationPart.Builder.create(this,
     * "MyCfnDocumentationPart")
     * .location(LocationProperty.builder()
     * .method("method")
     * .name("name")
     * .path("path")
     * .statusCode("statusCode")
     * .type("type")
     * .build())
     * .properties("properties")
     * .restApiId("restApiId")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-documentationpart.html)
     */
    public inline fun cfnDocumentationPart(
        scope: Construct,
        id: String,
        block: CfnDocumentationPartDsl.() -> Unit = {},
    ): CfnDocumentationPart {
        val builder = CfnDocumentationPartDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * The `Location` property specifies the location of the Amazon API Gateway API entity that the
     * documentation applies to.
     *
     * `Location` is a property of the
     * [AWS::ApiGateway::DocumentationPart](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-documentationpart.html)
     * resource.
     *
     * For more information about each property, including constraints and valid values, see
     * [DocumentationPart](https://docs.aws.amazon.com/apigateway/latest/api/API_DocumentationPartLocation.html)
     * in the *Amazon API Gateway REST API Reference* .
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.apigateway.*;
     * LocationProperty locationProperty = LocationProperty.builder()
     * .method("method")
     * .name("name")
     * .path("path")
     * .statusCode("statusCode")
     * .type("type")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-documentationpart-location.html)
     */
    public inline fun cfnDocumentationPartLocationProperty(
        block: CfnDocumentationPartLocationPropertyDsl.() -> Unit = {}
    ): CfnDocumentationPart.LocationProperty {
        val builder = CfnDocumentationPartLocationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnDocumentationPart`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.apigateway.*;
     * CfnDocumentationPartProps cfnDocumentationPartProps = CfnDocumentationPartProps.builder()
     * .location(LocationProperty.builder()
     * .method("method")
     * .name("name")
     * .path("path")
     * .statusCode("statusCode")
     * .type("type")
     * .build())
     * .properties("properties")
     * .restApiId("restApiId")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-documentationpart.html)
     */
    public inline fun cfnDocumentationPartProps(
        block: CfnDocumentationPartPropsDsl.() -> Unit = {}
    ): CfnDocumentationPartProps {
        val builder = CfnDocumentationPartPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The `AWS::ApiGateway::DocumentationVersion` resource creates a snapshot of the documentation
     * for an API.
     *
     * For more information, see
     * [Representation of API Documentation in API Gateway](https://docs.aws.amazon.com/apigateway/latest/developerguide/api-gateway-documenting-api-content-representation.html)
     * in the *API Gateway Developer Guide* .
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.apigateway.*;
     * CfnDocumentationVersion cfnDocumentationVersion = CfnDocumentationVersion.Builder.create(this,
     * "MyCfnDocumentationVersion")
     * .documentationVersion("documentationVersion")
     * .restApiId("restApiId")
     * // the properties below are optional
     * .description("description")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-documentationversion.html)
     */
    public inline fun cfnDocumentationVersion(
        scope: Construct,
        id: String,
        block: CfnDocumentationVersionDsl.() -> Unit = {},
    ): CfnDocumentationVersion {
        val builder = CfnDocumentationVersionDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnDocumentationVersion`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.apigateway.*;
     * CfnDocumentationVersionProps cfnDocumentationVersionProps =
     * CfnDocumentationVersionProps.builder()
     * .documentationVersion("documentationVersion")
     * .restApiId("restApiId")
     * // the properties below are optional
     * .description("description")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-documentationversion.html)
     */
    public inline fun cfnDocumentationVersionProps(
        block: CfnDocumentationVersionPropsDsl.() -> Unit = {}
    ): CfnDocumentationVersionProps {
        val builder = CfnDocumentationVersionPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The `AWS::ApiGateway::DomainName` resource specifies a custom domain name for your API in API
     * Gateway.
     *
     * You can use a custom domain name to provide a URL that's more intuitive and easier to recall.
     * For more information about using custom domain names, see
     * [Set up Custom Domain Name for an API in API Gateway](https://docs.aws.amazon.com/apigateway/latest/developerguide/how-to-custom-domains.html)
     * in the *API Gateway Developer Guide* .
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.apigateway.*;
     * CfnDomainName cfnDomainName = CfnDomainName.Builder.create(this, "MyCfnDomainName")
     * .certificateArn("certificateArn")
     * .domainName("domainName")
     * .endpointConfiguration(EndpointConfigurationProperty.builder()
     * .types(List.of("types"))
     * .build())
     * .mutualTlsAuthentication(MutualTlsAuthenticationProperty.builder()
     * .truststoreUri("truststoreUri")
     * .truststoreVersion("truststoreVersion")
     * .build())
     * .ownershipVerificationCertificateArn("ownershipVerificationCertificateArn")
     * .regionalCertificateArn("regionalCertificateArn")
     * .securityPolicy("securityPolicy")
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-domainname.html)
     */
    public inline fun cfnDomainName(
        scope: Construct,
        id: String,
        block: CfnDomainNameDsl.() -> Unit = {},
    ): CfnDomainName {
        val builder = CfnDomainNameDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * The `EndpointConfiguration` property type specifies the endpoint types of an Amazon API
     * Gateway domain name.
     *
     * `EndpointConfiguration` is a property of the
     * [AWS::ApiGateway::DomainName](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-domainname.html)
     * resource.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.apigateway.*;
     * EndpointConfigurationProperty endpointConfigurationProperty =
     * EndpointConfigurationProperty.builder()
     * .types(List.of("types"))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-domainname-endpointconfiguration.html)
     */
    public inline fun cfnDomainNameEndpointConfigurationProperty(
        block: CfnDomainNameEndpointConfigurationPropertyDsl.() -> Unit = {}
    ): CfnDomainName.EndpointConfigurationProperty {
        val builder = CfnDomainNameEndpointConfigurationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The mutual TLS authentication configuration for a custom domain name.
     *
     * If specified, API Gateway performs two-way authentication between the client and the server.
     * Clients must present a trusted certificate to access your API.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.apigateway.*;
     * MutualTlsAuthenticationProperty mutualTlsAuthenticationProperty =
     * MutualTlsAuthenticationProperty.builder()
     * .truststoreUri("truststoreUri")
     * .truststoreVersion("truststoreVersion")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-domainname-mutualtlsauthentication.html)
     */
    public inline fun cfnDomainNameMutualTlsAuthenticationProperty(
        block: CfnDomainNameMutualTlsAuthenticationPropertyDsl.() -> Unit = {}
    ): CfnDomainName.MutualTlsAuthenticationProperty {
        val builder = CfnDomainNameMutualTlsAuthenticationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnDomainName`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.apigateway.*;
     * CfnDomainNameProps cfnDomainNameProps = CfnDomainNameProps.builder()
     * .certificateArn("certificateArn")
     * .domainName("domainName")
     * .endpointConfiguration(EndpointConfigurationProperty.builder()
     * .types(List.of("types"))
     * .build())
     * .mutualTlsAuthentication(MutualTlsAuthenticationProperty.builder()
     * .truststoreUri("truststoreUri")
     * .truststoreVersion("truststoreVersion")
     * .build())
     * .ownershipVerificationCertificateArn("ownershipVerificationCertificateArn")
     * .regionalCertificateArn("regionalCertificateArn")
     * .securityPolicy("securityPolicy")
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-domainname.html)
     */
    public inline fun cfnDomainNameProps(
        block: CfnDomainNamePropsDsl.() -> Unit = {}
    ): CfnDomainNameProps {
        val builder = CfnDomainNamePropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The `AWS::ApiGateway::GatewayResponse` resource creates a gateway response for your API.
     *
     * For more information, see
     * [API Gateway Responses](https://docs.aws.amazon.com/apigateway/latest/developerguide/customize-gateway-responses.html#api-gateway-gatewayResponse-definition)
     * in the *API Gateway Developer Guide* .
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.apigateway.*;
     * CfnGatewayResponse cfnGatewayResponse = CfnGatewayResponse.Builder.create(this,
     * "MyCfnGatewayResponse")
     * .responseType("responseType")
     * .restApiId("restApiId")
     * // the properties below are optional
     * .responseParameters(Map.of(
     * "responseParametersKey", "responseParameters"))
     * .responseTemplates(Map.of(
     * "responseTemplatesKey", "responseTemplates"))
     * .statusCode("statusCode")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-gatewayresponse.html)
     */
    public inline fun cfnGatewayResponse(
        scope: Construct,
        id: String,
        block: CfnGatewayResponseDsl.() -> Unit = {},
    ): CfnGatewayResponse {
        val builder = CfnGatewayResponseDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnGatewayResponse`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.apigateway.*;
     * CfnGatewayResponseProps cfnGatewayResponseProps = CfnGatewayResponseProps.builder()
     * .responseType("responseType")
     * .restApiId("restApiId")
     * // the properties below are optional
     * .responseParameters(Map.of(
     * "responseParametersKey", "responseParameters"))
     * .responseTemplates(Map.of(
     * "responseTemplatesKey", "responseTemplates"))
     * .statusCode("statusCode")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-gatewayresponse.html)
     */
    public inline fun cfnGatewayResponseProps(
        block: CfnGatewayResponsePropsDsl.() -> Unit = {}
    ): CfnGatewayResponseProps {
        val builder = CfnGatewayResponsePropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The `AWS::ApiGateway::Method` resource creates API Gateway methods that define the parameters
     * and body that clients must send in their requests.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.apigateway.*;
     * CfnMethod cfnMethod = CfnMethod.Builder.create(this, "MyCfnMethod")
     * .httpMethod("httpMethod")
     * .resourceId("resourceId")
     * .restApiId("restApiId")
     * // the properties below are optional
     * .apiKeyRequired(false)
     * .authorizationScopes(List.of("authorizationScopes"))
     * .authorizationType("authorizationType")
     * .authorizerId("authorizerId")
     * .integration(IntegrationProperty.builder()
     * .type("type")
     * // the properties below are optional
     * .cacheKeyParameters(List.of("cacheKeyParameters"))
     * .cacheNamespace("cacheNamespace")
     * .connectionId("connectionId")
     * .connectionType("connectionType")
     * .contentHandling("contentHandling")
     * .credentials("credentials")
     * .integrationHttpMethod("integrationHttpMethod")
     * .integrationResponses(List.of(IntegrationResponseProperty.builder()
     * .statusCode("statusCode")
     * // the properties below are optional
     * .contentHandling("contentHandling")
     * .responseParameters(Map.of(
     * "responseParametersKey", "responseParameters"))
     * .responseTemplates(Map.of(
     * "responseTemplatesKey", "responseTemplates"))
     * .selectionPattern("selectionPattern")
     * .build()))
     * .passthroughBehavior("passthroughBehavior")
     * .requestParameters(Map.of(
     * "requestParametersKey", "requestParameters"))
     * .requestTemplates(Map.of(
     * "requestTemplatesKey", "requestTemplates"))
     * .timeoutInMillis(123)
     * .uri("uri")
     * .build())
     * .methodResponses(List.of(MethodResponseProperty.builder()
     * .statusCode("statusCode")
     * // the properties below are optional
     * .responseModels(Map.of(
     * "responseModelsKey", "responseModels"))
     * .responseParameters(Map.of(
     * "responseParametersKey", false))
     * .build()))
     * .operationName("operationName")
     * .requestModels(Map.of(
     * "requestModelsKey", "requestModels"))
     * .requestParameters(Map.of(
     * "requestParametersKey", false))
     * .requestValidatorId("requestValidatorId")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-method.html)
     */
    public inline fun cfnMethod(
        scope: Construct,
        id: String,
        block: CfnMethodDsl.() -> Unit = {},
    ): CfnMethod {
        val builder = CfnMethodDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * `Integration` is a property of the
     * [AWS::ApiGateway::Method](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-method.html)
     * resource that specifies information about the target backend that a method calls.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.apigateway.*;
     * IntegrationProperty integrationProperty = IntegrationProperty.builder()
     * .type("type")
     * // the properties below are optional
     * .cacheKeyParameters(List.of("cacheKeyParameters"))
     * .cacheNamespace("cacheNamespace")
     * .connectionId("connectionId")
     * .connectionType("connectionType")
     * .contentHandling("contentHandling")
     * .credentials("credentials")
     * .integrationHttpMethod("integrationHttpMethod")
     * .integrationResponses(List.of(IntegrationResponseProperty.builder()
     * .statusCode("statusCode")
     * // the properties below are optional
     * .contentHandling("contentHandling")
     * .responseParameters(Map.of(
     * "responseParametersKey", "responseParameters"))
     * .responseTemplates(Map.of(
     * "responseTemplatesKey", "responseTemplates"))
     * .selectionPattern("selectionPattern")
     * .build()))
     * .passthroughBehavior("passthroughBehavior")
     * .requestParameters(Map.of(
     * "requestParametersKey", "requestParameters"))
     * .requestTemplates(Map.of(
     * "requestTemplatesKey", "requestTemplates"))
     * .timeoutInMillis(123)
     * .uri("uri")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-method-integration.html)
     */
    public inline fun cfnMethodIntegrationProperty(
        block: CfnMethodIntegrationPropertyDsl.() -> Unit = {}
    ): CfnMethod.IntegrationProperty {
        val builder = CfnMethodIntegrationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * `IntegrationResponse` is a property of the
     * [Amazon API Gateway Method Integration](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apitgateway-method-integration.html)
     * property type that specifies the response that API Gateway sends after a method's backend
     * finishes processing a request.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.apigateway.*;
     * IntegrationResponseProperty integrationResponseProperty = IntegrationResponseProperty.builder()
     * .statusCode("statusCode")
     * // the properties below are optional
     * .contentHandling("contentHandling")
     * .responseParameters(Map.of(
     * "responseParametersKey", "responseParameters"))
     * .responseTemplates(Map.of(
     * "responseTemplatesKey", "responseTemplates"))
     * .selectionPattern("selectionPattern")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-method-integrationresponse.html)
     */
    public inline fun cfnMethodIntegrationResponseProperty(
        block: CfnMethodIntegrationResponsePropertyDsl.() -> Unit = {}
    ): CfnMethod.IntegrationResponseProperty {
        val builder = CfnMethodIntegrationResponsePropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Represents a method response of a given HTTP status code returned to the client.
     *
     * The method response is passed from the back end through the associated integration response
     * that can be transformed using a mapping template.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.apigateway.*;
     * MethodResponseProperty methodResponseProperty = MethodResponseProperty.builder()
     * .statusCode("statusCode")
     * // the properties below are optional
     * .responseModels(Map.of(
     * "responseModelsKey", "responseModels"))
     * .responseParameters(Map.of(
     * "responseParametersKey", false))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-method-methodresponse.html)
     */
    public inline fun cfnMethodMethodResponseProperty(
        block: CfnMethodMethodResponsePropertyDsl.() -> Unit = {}
    ): CfnMethod.MethodResponseProperty {
        val builder = CfnMethodMethodResponsePropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnMethod`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.apigateway.*;
     * CfnMethodProps cfnMethodProps = CfnMethodProps.builder()
     * .httpMethod("httpMethod")
     * .resourceId("resourceId")
     * .restApiId("restApiId")
     * // the properties below are optional
     * .apiKeyRequired(false)
     * .authorizationScopes(List.of("authorizationScopes"))
     * .authorizationType("authorizationType")
     * .authorizerId("authorizerId")
     * .integration(IntegrationProperty.builder()
     * .type("type")
     * // the properties below are optional
     * .cacheKeyParameters(List.of("cacheKeyParameters"))
     * .cacheNamespace("cacheNamespace")
     * .connectionId("connectionId")
     * .connectionType("connectionType")
     * .contentHandling("contentHandling")
     * .credentials("credentials")
     * .integrationHttpMethod("integrationHttpMethod")
     * .integrationResponses(List.of(IntegrationResponseProperty.builder()
     * .statusCode("statusCode")
     * // the properties below are optional
     * .contentHandling("contentHandling")
     * .responseParameters(Map.of(
     * "responseParametersKey", "responseParameters"))
     * .responseTemplates(Map.of(
     * "responseTemplatesKey", "responseTemplates"))
     * .selectionPattern("selectionPattern")
     * .build()))
     * .passthroughBehavior("passthroughBehavior")
     * .requestParameters(Map.of(
     * "requestParametersKey", "requestParameters"))
     * .requestTemplates(Map.of(
     * "requestTemplatesKey", "requestTemplates"))
     * .timeoutInMillis(123)
     * .uri("uri")
     * .build())
     * .methodResponses(List.of(MethodResponseProperty.builder()
     * .statusCode("statusCode")
     * // the properties below are optional
     * .responseModels(Map.of(
     * "responseModelsKey", "responseModels"))
     * .responseParameters(Map.of(
     * "responseParametersKey", false))
     * .build()))
     * .operationName("operationName")
     * .requestModels(Map.of(
     * "requestModelsKey", "requestModels"))
     * .requestParameters(Map.of(
     * "requestParametersKey", false))
     * .requestValidatorId("requestValidatorId")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-method.html)
     */
    public inline fun cfnMethodProps(block: CfnMethodPropsDsl.() -> Unit = {}): CfnMethodProps {
        val builder = CfnMethodPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The `AWS::ApiGateway::Model` resource defines the structure of a request or response payload
     * for an API method.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.apigateway.*;
     * Object schema;
     * CfnModel cfnModel = CfnModel.Builder.create(this, "MyCfnModel")
     * .restApiId("restApiId")
     * // the properties below are optional
     * .contentType("contentType")
     * .description("description")
     * .name("name")
     * .schema(schema)
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-model.html)
     */
    public inline fun cfnModel(
        scope: Construct,
        id: String,
        block: CfnModelDsl.() -> Unit = {},
    ): CfnModel {
        val builder = CfnModelDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnModel`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.apigateway.*;
     * Object schema;
     * CfnModelProps cfnModelProps = CfnModelProps.builder()
     * .restApiId("restApiId")
     * // the properties below are optional
     * .contentType("contentType")
     * .description("description")
     * .name("name")
     * .schema(schema)
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-model.html)
     */
    public inline fun cfnModelProps(block: CfnModelPropsDsl.() -> Unit = {}): CfnModelProps {
        val builder = CfnModelPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The `AWS::ApiGateway::RequestValidator` resource sets up basic validation rules for incoming
     * requests to your API.
     *
     * For more information, see
     * [Enable Basic Request Validation for an API in API Gateway](https://docs.aws.amazon.com/apigateway/latest/developerguide/api-gateway-method-request-validation.html)
     * in the *API Gateway Developer Guide* .
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.apigateway.*;
     * CfnRequestValidator cfnRequestValidator = CfnRequestValidator.Builder.create(this,
     * "MyCfnRequestValidator")
     * .restApiId("restApiId")
     * // the properties below are optional
     * .name("name")
     * .validateRequestBody(false)
     * .validateRequestParameters(false)
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-requestvalidator.html)
     */
    public inline fun cfnRequestValidator(
        scope: Construct,
        id: String,
        block: CfnRequestValidatorDsl.() -> Unit = {},
    ): CfnRequestValidator {
        val builder = CfnRequestValidatorDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnRequestValidator`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.apigateway.*;
     * CfnRequestValidatorProps cfnRequestValidatorProps = CfnRequestValidatorProps.builder()
     * .restApiId("restApiId")
     * // the properties below are optional
     * .name("name")
     * .validateRequestBody(false)
     * .validateRequestParameters(false)
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-requestvalidator.html)
     */
    public inline fun cfnRequestValidatorProps(
        block: CfnRequestValidatorPropsDsl.() -> Unit = {}
    ): CfnRequestValidatorProps {
        val builder = CfnRequestValidatorPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The `AWS::ApiGateway::Resource` resource creates a resource in an API.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.apigateway.*;
     * CfnResource cfnResource = CfnResource.Builder.create(this, "MyCfnResource")
     * .parentId("parentId")
     * .pathPart("pathPart")
     * .restApiId("restApiId")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-resource.html)
     */
    public inline fun cfnResource(
        scope: Construct,
        id: String,
        block: CfnResourceDsl.() -> Unit = {},
    ): CfnResource {
        val builder = CfnResourceDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnResource`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.apigateway.*;
     * CfnResourceProps cfnResourceProps = CfnResourceProps.builder()
     * .parentId("parentId")
     * .pathPart("pathPart")
     * .restApiId("restApiId")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-resource.html)
     */
    public inline fun cfnResourceProps(
        block: CfnResourcePropsDsl.() -> Unit = {}
    ): CfnResourceProps {
        val builder = CfnResourcePropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The `AWS::ApiGateway::RestApi` resource creates a REST API.
     *
     * For more information, see
     * [restapi:create](https://docs.aws.amazon.com/apigateway/latest/api/API_CreateRestApi.html) in
     * the *Amazon API Gateway REST API Reference* .
     *
     * On January 1, 2016, the Swagger Specification was donated to the
     * [OpenAPI initiative](https://docs.aws.amazon.com/https://www.openapis.org/) , becoming the
     * foundation of the OpenAPI Specification.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.apigateway.*;
     * Object body;
     * Object policy;
     * CfnRestApi cfnRestApi = CfnRestApi.Builder.create(this, "MyCfnRestApi")
     * .apiKeySourceType("apiKeySourceType")
     * .binaryMediaTypes(List.of("binaryMediaTypes"))
     * .body(body)
     * .bodyS3Location(S3LocationProperty.builder()
     * .bucket("bucket")
     * .eTag("eTag")
     * .key("key")
     * .version("version")
     * .build())
     * .cloneFrom("cloneFrom")
     * .description("description")
     * .disableExecuteApiEndpoint(false)
     * .endpointConfiguration(EndpointConfigurationProperty.builder()
     * .types(List.of("types"))
     * .vpcEndpointIds(List.of("vpcEndpointIds"))
     * .build())
     * .failOnWarnings(false)
     * .minimumCompressionSize(123)
     * .mode("mode")
     * .name("name")
     * .parameters(Map.of(
     * "parametersKey", "parameters"))
     * .policy(policy)
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-restapi.html)
     */
    public inline fun cfnRestApi(
        scope: Construct,
        id: String,
        block: CfnRestApiDsl.() -> Unit = {},
    ): CfnRestApi {
        val builder = CfnRestApiDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * The `EndpointConfiguration` property type specifies the endpoint types of a REST API.
     *
     * `EndpointConfiguration` is a property of the
     * [AWS::ApiGateway::RestApi](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-restapi.html)
     * resource.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.apigateway.*;
     * EndpointConfigurationProperty endpointConfigurationProperty =
     * EndpointConfigurationProperty.builder()
     * .types(List.of("types"))
     * .vpcEndpointIds(List.of("vpcEndpointIds"))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-restapi-endpointconfiguration.html)
     */
    public inline fun cfnRestApiEndpointConfigurationProperty(
        block: CfnRestApiEndpointConfigurationPropertyDsl.() -> Unit = {}
    ): CfnRestApi.EndpointConfigurationProperty {
        val builder = CfnRestApiEndpointConfigurationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnRestApi`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.apigateway.*;
     * Object body;
     * Object policy;
     * CfnRestApiProps cfnRestApiProps = CfnRestApiProps.builder()
     * .apiKeySourceType("apiKeySourceType")
     * .binaryMediaTypes(List.of("binaryMediaTypes"))
     * .body(body)
     * .bodyS3Location(S3LocationProperty.builder()
     * .bucket("bucket")
     * .eTag("eTag")
     * .key("key")
     * .version("version")
     * .build())
     * .cloneFrom("cloneFrom")
     * .description("description")
     * .disableExecuteApiEndpoint(false)
     * .endpointConfiguration(EndpointConfigurationProperty.builder()
     * .types(List.of("types"))
     * .vpcEndpointIds(List.of("vpcEndpointIds"))
     * .build())
     * .failOnWarnings(false)
     * .minimumCompressionSize(123)
     * .mode("mode")
     * .name("name")
     * .parameters(Map.of(
     * "parametersKey", "parameters"))
     * .policy(policy)
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-restapi.html)
     */
    public inline fun cfnRestApiProps(block: CfnRestApiPropsDsl.() -> Unit = {}): CfnRestApiProps {
        val builder = CfnRestApiPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * `S3Location` is a property of the
     * [AWS::ApiGateway::RestApi](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-restapi.html)
     * resource that specifies the Amazon S3 location of a OpenAPI (formerly Swagger) file that
     * defines a set of RESTful APIs in JSON or YAML.
     *
     * On January 1, 2016, the Swagger Specification was donated to the
     * [OpenAPI initiative](https://docs.aws.amazon.com/https://www.openapis.org/) , becoming the
     * foundation of the OpenAPI Specification.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.apigateway.*;
     * S3LocationProperty s3LocationProperty = S3LocationProperty.builder()
     * .bucket("bucket")
     * .eTag("eTag")
     * .key("key")
     * .version("version")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-restapi-s3location.html)
     */
    public inline fun cfnRestApiS3LocationProperty(
        block: CfnRestApiS3LocationPropertyDsl.() -> Unit = {}
    ): CfnRestApi.S3LocationProperty {
        val builder = CfnRestApiS3LocationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The `AWS::ApiGateway::Stage` resource creates a stage for a deployment.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.apigateway.*;
     * CfnStage cfnStage = CfnStage.Builder.create(this, "MyCfnStage")
     * .restApiId("restApiId")
     * // the properties below are optional
     * .accessLogSetting(AccessLogSettingProperty.builder()
     * .destinationArn("destinationArn")
     * .format("format")
     * .build())
     * .cacheClusterEnabled(false)
     * .cacheClusterSize("cacheClusterSize")
     * .canarySetting(CanarySettingProperty.builder()
     * .deploymentId("deploymentId")
     * .percentTraffic(123)
     * .stageVariableOverrides(Map.of(
     * "stageVariableOverridesKey", "stageVariableOverrides"))
     * .useStageCache(false)
     * .build())
     * .clientCertificateId("clientCertificateId")
     * .deploymentId("deploymentId")
     * .description("description")
     * .documentationVersion("documentationVersion")
     * .methodSettings(List.of(MethodSettingProperty.builder()
     * .cacheDataEncrypted(false)
     * .cacheTtlInSeconds(123)
     * .cachingEnabled(false)
     * .dataTraceEnabled(false)
     * .httpMethod("httpMethod")
     * .loggingLevel("loggingLevel")
     * .metricsEnabled(false)
     * .resourcePath("resourcePath")
     * .throttlingBurstLimit(123)
     * .throttlingRateLimit(123)
     * .build()))
     * .stageName("stageName")
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .tracingEnabled(false)
     * .variables(Map.of(
     * "variablesKey", "variables"))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-stage.html)
     */
    public inline fun cfnStage(
        scope: Construct,
        id: String,
        block: CfnStageDsl.() -> Unit = {},
    ): CfnStage {
        val builder = CfnStageDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * The `AccessLogSetting` property type specifies settings for logging access in this stage.
     *
     * `AccessLogSetting` is a property of the
     * [AWS::ApiGateway::Stage](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-stage.html)
     * resource.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.apigateway.*;
     * AccessLogSettingProperty accessLogSettingProperty = AccessLogSettingProperty.builder()
     * .destinationArn("destinationArn")
     * .format("format")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-stage-accesslogsetting.html)
     */
    public inline fun cfnStageAccessLogSettingProperty(
        block: CfnStageAccessLogSettingPropertyDsl.() -> Unit = {}
    ): CfnStage.AccessLogSettingProperty {
        val builder = CfnStageAccessLogSettingPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Configuration settings of a canary deployment.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.apigateway.*;
     * CanarySettingProperty canarySettingProperty = CanarySettingProperty.builder()
     * .deploymentId("deploymentId")
     * .percentTraffic(123)
     * .stageVariableOverrides(Map.of(
     * "stageVariableOverridesKey", "stageVariableOverrides"))
     * .useStageCache(false)
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-stage-canarysetting.html)
     */
    public inline fun cfnStageCanarySettingProperty(
        block: CfnStageCanarySettingPropertyDsl.() -> Unit = {}
    ): CfnStage.CanarySettingProperty {
        val builder = CfnStageCanarySettingPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The `MethodSetting` property type configures settings for all methods in a stage.
     *
     * The `MethodSettings` property of the `AWS::ApiGateway::Stage` resource contains a list of
     * `MethodSetting` property types.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.apigateway.*;
     * MethodSettingProperty methodSettingProperty = MethodSettingProperty.builder()
     * .cacheDataEncrypted(false)
     * .cacheTtlInSeconds(123)
     * .cachingEnabled(false)
     * .dataTraceEnabled(false)
     * .httpMethod("httpMethod")
     * .loggingLevel("loggingLevel")
     * .metricsEnabled(false)
     * .resourcePath("resourcePath")
     * .throttlingBurstLimit(123)
     * .throttlingRateLimit(123)
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-stage-methodsetting.html)
     */
    public inline fun cfnStageMethodSettingProperty(
        block: CfnStageMethodSettingPropertyDsl.() -> Unit = {}
    ): CfnStage.MethodSettingProperty {
        val builder = CfnStageMethodSettingPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnStage`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.apigateway.*;
     * CfnStageProps cfnStageProps = CfnStageProps.builder()
     * .restApiId("restApiId")
     * // the properties below are optional
     * .accessLogSetting(AccessLogSettingProperty.builder()
     * .destinationArn("destinationArn")
     * .format("format")
     * .build())
     * .cacheClusterEnabled(false)
     * .cacheClusterSize("cacheClusterSize")
     * .canarySetting(CanarySettingProperty.builder()
     * .deploymentId("deploymentId")
     * .percentTraffic(123)
     * .stageVariableOverrides(Map.of(
     * "stageVariableOverridesKey", "stageVariableOverrides"))
     * .useStageCache(false)
     * .build())
     * .clientCertificateId("clientCertificateId")
     * .deploymentId("deploymentId")
     * .description("description")
     * .documentationVersion("documentationVersion")
     * .methodSettings(List.of(MethodSettingProperty.builder()
     * .cacheDataEncrypted(false)
     * .cacheTtlInSeconds(123)
     * .cachingEnabled(false)
     * .dataTraceEnabled(false)
     * .httpMethod("httpMethod")
     * .loggingLevel("loggingLevel")
     * .metricsEnabled(false)
     * .resourcePath("resourcePath")
     * .throttlingBurstLimit(123)
     * .throttlingRateLimit(123)
     * .build()))
     * .stageName("stageName")
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .tracingEnabled(false)
     * .variables(Map.of(
     * "variablesKey", "variables"))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-stage.html)
     */
    public inline fun cfnStageProps(block: CfnStagePropsDsl.() -> Unit = {}): CfnStageProps {
        val builder = CfnStagePropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The `AWS::ApiGateway::UsagePlan` resource creates a usage plan for deployed APIs.
     *
     * A usage plan sets a target for the throttling and quota limits on individual client API keys.
     * For more information, see
     * [Creating and Using API Usage Plans in Amazon API Gateway](https://docs.aws.amazon.com/apigateway/latest/developerguide/api-gateway-api-usage-plans.html)
     * in the *API Gateway Developer Guide* .
     *
     * In some cases clients can exceed the targets that you set. Don’t rely on usage plans to
     * control costs. Consider using
     * [AWS Budgets](https://docs.aws.amazon.com/cost-management/latest/userguide/budgets-managing-costs.html)
     * to monitor costs and
     * [AWS WAF](https://docs.aws.amazon.com/waf/latest/developerguide/waf-chapter.html) to manage
     * API requests.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.apigateway.*;
     * CfnUsagePlan cfnUsagePlan = CfnUsagePlan.Builder.create(this, "MyCfnUsagePlan")
     * .apiStages(List.of(ApiStageProperty.builder()
     * .apiId("apiId")
     * .stage("stage")
     * .throttle(Map.of(
     * "throttleKey", ThrottleSettingsProperty.builder()
     * .burstLimit(123)
     * .rateLimit(123)
     * .build()))
     * .build()))
     * .description("description")
     * .quota(QuotaSettingsProperty.builder()
     * .limit(123)
     * .offset(123)
     * .period("period")
     * .build())
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .throttle(ThrottleSettingsProperty.builder()
     * .burstLimit(123)
     * .rateLimit(123)
     * .build())
     * .usagePlanName("usagePlanName")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-usageplan.html)
     */
    public inline fun cfnUsagePlan(
        scope: Construct,
        id: String,
        block: CfnUsagePlanDsl.() -> Unit = {},
    ): CfnUsagePlan {
        val builder = CfnUsagePlanDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * API stage name of the associated API stage in a usage plan.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.apigateway.*;
     * ApiStageProperty apiStageProperty = ApiStageProperty.builder()
     * .apiId("apiId")
     * .stage("stage")
     * .throttle(Map.of(
     * "throttleKey", ThrottleSettingsProperty.builder()
     * .burstLimit(123)
     * .rateLimit(123)
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-usageplan-apistage.html)
     */
    public inline fun cfnUsagePlanApiStageProperty(
        block: CfnUsagePlanApiStagePropertyDsl.() -> Unit = {}
    ): CfnUsagePlan.ApiStageProperty {
        val builder = CfnUsagePlanApiStagePropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The `AWS::ApiGateway::UsagePlanKey` resource associates an API key with a usage plan.
     *
     * This association determines which users the usage plan is applied to.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.apigateway.*;
     * CfnUsagePlanKey cfnUsagePlanKey = CfnUsagePlanKey.Builder.create(this, "MyCfnUsagePlanKey")
     * .keyId("keyId")
     * .keyType("keyType")
     * .usagePlanId("usagePlanId")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-usageplankey.html)
     */
    public inline fun cfnUsagePlanKey(
        scope: Construct,
        id: String,
        block: CfnUsagePlanKeyDsl.() -> Unit = {},
    ): CfnUsagePlanKey {
        val builder = CfnUsagePlanKeyDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnUsagePlanKey`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.apigateway.*;
     * CfnUsagePlanKeyProps cfnUsagePlanKeyProps = CfnUsagePlanKeyProps.builder()
     * .keyId("keyId")
     * .keyType("keyType")
     * .usagePlanId("usagePlanId")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-usageplankey.html)
     */
    public inline fun cfnUsagePlanKeyProps(
        block: CfnUsagePlanKeyPropsDsl.() -> Unit = {}
    ): CfnUsagePlanKeyProps {
        val builder = CfnUsagePlanKeyPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnUsagePlan`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.apigateway.*;
     * CfnUsagePlanProps cfnUsagePlanProps = CfnUsagePlanProps.builder()
     * .apiStages(List.of(ApiStageProperty.builder()
     * .apiId("apiId")
     * .stage("stage")
     * .throttle(Map.of(
     * "throttleKey", ThrottleSettingsProperty.builder()
     * .burstLimit(123)
     * .rateLimit(123)
     * .build()))
     * .build()))
     * .description("description")
     * .quota(QuotaSettingsProperty.builder()
     * .limit(123)
     * .offset(123)
     * .period("period")
     * .build())
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .throttle(ThrottleSettingsProperty.builder()
     * .burstLimit(123)
     * .rateLimit(123)
     * .build())
     * .usagePlanName("usagePlanName")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-usageplan.html)
     */
    public inline fun cfnUsagePlanProps(
        block: CfnUsagePlanPropsDsl.() -> Unit = {}
    ): CfnUsagePlanProps {
        val builder = CfnUsagePlanPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * `QuotaSettings` is a property of the
     * [AWS::ApiGateway::UsagePlan](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-usageplan.html)
     * resource that specifies a target for the maximum number of requests users can make to your
     * REST APIs.
     *
     * In some cases clients can exceed the targets that you set. Don’t rely on usage plans to
     * control costs. Consider using
     * [AWS Budgets](https://docs.aws.amazon.com/cost-management/latest/userguide/budgets-managing-costs.html)
     * to monitor costs and
     * [AWS WAF](https://docs.aws.amazon.com/waf/latest/developerguide/waf-chapter.html) to manage
     * API requests.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.apigateway.*;
     * QuotaSettingsProperty quotaSettingsProperty = QuotaSettingsProperty.builder()
     * .limit(123)
     * .offset(123)
     * .period("period")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-usageplan-quotasettings.html)
     */
    public inline fun cfnUsagePlanQuotaSettingsProperty(
        block: CfnUsagePlanQuotaSettingsPropertyDsl.() -> Unit = {}
    ): CfnUsagePlan.QuotaSettingsProperty {
        val builder = CfnUsagePlanQuotaSettingsPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * `ThrottleSettings` is a property of the
     * [AWS::ApiGateway::UsagePlan](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-usageplan.html)
     * resource that specifies the overall request rate (average requests per second) and burst
     * capacity when users call your REST APIs.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.apigateway.*;
     * ThrottleSettingsProperty throttleSettingsProperty = ThrottleSettingsProperty.builder()
     * .burstLimit(123)
     * .rateLimit(123)
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-usageplan-throttlesettings.html)
     */
    public inline fun cfnUsagePlanThrottleSettingsProperty(
        block: CfnUsagePlanThrottleSettingsPropertyDsl.() -> Unit = {}
    ): CfnUsagePlan.ThrottleSettingsProperty {
        val builder = CfnUsagePlanThrottleSettingsPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The `AWS::ApiGateway::VpcLink` resource creates an API Gateway VPC link for a REST API to
     * access resources in an Amazon Virtual Private Cloud (VPC).
     *
     * For more information, see
     * [vpclink:create](https://docs.aws.amazon.com/apigateway/latest/api/API_CreateVpcLink.html) in
     * the `Amazon API Gateway REST API Reference` .
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.apigateway.*;
     * CfnVpcLink cfnVpcLink = CfnVpcLink.Builder.create(this, "MyCfnVpcLink")
     * .name("name")
     * .targetArns(List.of("targetArns"))
     * // the properties below are optional
     * .description("description")
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-vpclink.html)
     */
    public inline fun cfnVpcLink(
        scope: Construct,
        id: String,
        block: CfnVpcLinkDsl.() -> Unit = {},
    ): CfnVpcLink {
        val builder = CfnVpcLinkDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnVpcLink`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.apigateway.*;
     * CfnVpcLinkProps cfnVpcLinkProps = CfnVpcLinkProps.builder()
     * .name("name")
     * .targetArns(List.of("targetArns"))
     * // the properties below are optional
     * .description("description")
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-vpclink.html)
     */
    public inline fun cfnVpcLinkProps(block: CfnVpcLinkPropsDsl.() -> Unit = {}): CfnVpcLinkProps {
        val builder = CfnVpcLinkPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Cognito user pools based custom authorizer.
     *
     * Example:
     * ```
     * Resource books;
     * UserPool userPool = new UserPool(this, "UserPool");
     * CognitoUserPoolsAuthorizer auth = CognitoUserPoolsAuthorizer.Builder.create(this,
     * "booksAuthorizer")
     * .cognitoUserPools(List.of(userPool))
     * .build();
     * books.addMethod("GET", new HttpIntegration("http://amazon.com"), MethodOptions.builder()
     * .authorizer(auth)
     * .authorizationType(AuthorizationType.COGNITO)
     * .build());
     * ```
     */
    public inline fun cognitoUserPoolsAuthorizer(
        scope: Construct,
        id: String,
        block: CognitoUserPoolsAuthorizerDsl.() -> Unit = {},
    ): CognitoUserPoolsAuthorizer {
        val builder = CognitoUserPoolsAuthorizerDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for CognitoUserPoolsAuthorizer.
     *
     * Example:
     * ```
     * Resource books;
     * UserPool userPool = new UserPool(this, "UserPool");
     * CognitoUserPoolsAuthorizer auth = CognitoUserPoolsAuthorizer.Builder.create(this,
     * "booksAuthorizer")
     * .cognitoUserPools(List.of(userPool))
     * .build();
     * books.addMethod("GET", new HttpIntegration("http://amazon.com"), MethodOptions.builder()
     * .authorizer(auth)
     * .authorizationType(AuthorizationType.COGNITO)
     * .build());
     * ```
     */
    public inline fun cognitoUserPoolsAuthorizerProps(
        block: CognitoUserPoolsAuthorizerPropsDsl.() -> Unit = {}
    ): CognitoUserPoolsAuthorizerProps {
        val builder = CognitoUserPoolsAuthorizerPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Example:
     * ```
     * RestApi.Builder.create(this, "api")
     * .defaultCorsPreflightOptions(CorsOptions.builder()
     * .allowOrigins(Cors.ALL_ORIGINS)
     * .allowMethods(Cors.ALL_METHODS)
     * .build())
     * .build();
     * ```
     */
    public inline fun corsOptions(block: CorsOptionsDsl.() -> Unit = {}): CorsOptions {
        val builder = CorsOptionsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * A Deployment of a REST API.
     *
     * An immutable representation of a RestApi resource that can be called by users using Stages. A
     * deployment must be associated with a Stage for it to be callable over the Internet.
     *
     * Normally, you don't need to define deployments manually. The RestApi construct manages a
     * Deployment resource that represents the latest model. It can be accessed through
     * `restApi.latestDeployment` (unless `deploy: false` is set when defining the `RestApi`).
     *
     * If you manually define this resource, you will need to know that since deployments are
     * immutable, as long as the resource's logical ID doesn't change, the deployment will represent
     * the snapshot in time in which the resource was created. This means that if you modify the
     * RestApi model (i.e. add methods or resources), these changes will not be reflected unless a
     * new deployment resource is created.
     *
     * To achieve this behavior, the method `addToLogicalId(data)` can be used to augment the
     * logical ID generated for the deployment resource such that it will include arbitrary data.
     * This is done automatically for the `restApi.latestDeployment` deployment.
     *
     * Furthermore, since a deployment does not reference any of the REST API resources and methods,
     * CloudFormation will likely provision it before these resources are created, which means that
     * it will represent a "half-baked" model. Use the `node.addDependency(dep)` method to
     * circumvent that. This is done automatically for the `restApi.latestDeployment` deployment.
     *
     * Example:
     * ```
     * // production stage
     * LogGroup prodLogGroup = new LogGroup(this, "PrdLogs");
     * RestApi api = RestApi.Builder.create(this, "books")
     * .deployOptions(StageOptions.builder()
     * .accessLogDestination(new LogGroupLogDestination(prodLogGroup))
     * .accessLogFormat(AccessLogFormat.jsonWithStandardFields())
     * .build())
     * .build();
     * Deployment deployment = Deployment.Builder.create(this, "Deployment").api(api).build();
     * // development stage
     * LogGroup devLogGroup = new LogGroup(this, "DevLogs");
     * Stage.Builder.create(this, "dev")
     * .deployment(deployment)
     * .accessLogDestination(new LogGroupLogDestination(devLogGroup))
     * .accessLogFormat(AccessLogFormat.jsonWithStandardFields(JsonWithStandardFieldProps.builder()
     * .caller(false)
     * .httpMethod(true)
     * .ip(true)
     * .protocol(true)
     * .requestTime(true)
     * .resourcePath(true)
     * .responseLength(true)
     * .status(true)
     * .user(true)
     * .build()))
     * .build();
     * ```
     */
    public inline fun deployment(
        scope: Construct,
        id: String,
        block: DeploymentDsl.() -> Unit = {},
    ): Deployment {
        val builder = DeploymentDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Example:
     * ```
     * // production stage
     * LogGroup prodLogGroup = new LogGroup(this, "PrdLogs");
     * RestApi api = RestApi.Builder.create(this, "books")
     * .deployOptions(StageOptions.builder()
     * .accessLogDestination(new LogGroupLogDestination(prodLogGroup))
     * .accessLogFormat(AccessLogFormat.jsonWithStandardFields())
     * .build())
     * .build();
     * Deployment deployment = Deployment.Builder.create(this, "Deployment").api(api).build();
     * // development stage
     * LogGroup devLogGroup = new LogGroup(this, "DevLogs");
     * Stage.Builder.create(this, "dev")
     * .deployment(deployment)
     * .accessLogDestination(new LogGroupLogDestination(devLogGroup))
     * .accessLogFormat(AccessLogFormat.jsonWithStandardFields(JsonWithStandardFieldProps.builder()
     * .caller(false)
     * .httpMethod(true)
     * .ip(true)
     * .protocol(true)
     * .requestTime(true)
     * .resourcePath(true)
     * .responseLength(true)
     * .status(true)
     * .user(true)
     * .build()))
     * .build();
     * ```
     */
    public inline fun deploymentProps(block: DeploymentPropsDsl.() -> Unit = {}): DeploymentProps {
        val builder = DeploymentPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Example:
     * ```
     * RestApi api;
     * IDomainName domainName = DomainName.fromDomainNameAttributes(this, "DomainName",
     * DomainNameAttributes.builder()
     * .domainName("domainName")
     * .domainNameAliasHostedZoneId("domainNameAliasHostedZoneId")
     * .domainNameAliasTarget("domainNameAliasTarget")
     * .build());
     * BasePathMapping.Builder.create(this, "BasePathMapping")
     * .domainName(domainName)
     * .restApi(api)
     * .build();
     * ```
     */
    public inline fun domainName(
        scope: Construct,
        id: String,
        block: DomainNameDsl.() -> Unit = {},
    ): DomainName {
        val builder = DomainNameDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Example:
     * ```
     * RestApi api;
     * IDomainName domainName = DomainName.fromDomainNameAttributes(this, "DomainName",
     * DomainNameAttributes.builder()
     * .domainName("domainName")
     * .domainNameAliasHostedZoneId("domainNameAliasHostedZoneId")
     * .domainNameAliasTarget("domainNameAliasTarget")
     * .build());
     * BasePathMapping.Builder.create(this, "BasePathMapping")
     * .domainName(domainName)
     * .restApi(api)
     * .build();
     * ```
     */
    public inline fun domainNameAttributes(
        block: DomainNameAttributesDsl.() -> Unit = {}
    ): DomainNameAttributes {
        val builder = DomainNameAttributesDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Example:
     * ```
     * Object acmCertificateForExampleCom;
     * RestApi api = RestApi.Builder.create(this, "MyDomain")
     * .domainName(DomainNameOptions.builder()
     * .domainName("example.com")
     * .certificate(acmCertificateForExampleCom)
     * .build())
     * .build();
     * ```
     */
    public inline fun domainNameOptions(
        block: DomainNameOptionsDsl.() -> Unit = {}
    ): DomainNameOptions {
        val builder = DomainNameOptionsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Example:
     * ```
     * Object acmCertificateForExampleCom;
     * RestApi restApi;
     * DomainName.Builder.create(this, "custom-domain")
     * .domainName("example.com")
     * .certificate(acmCertificateForExampleCom)
     * .mapping(restApi)
     * .basePath("orders/v1/api")
     * .build();
     * ```
     */
    public inline fun domainNameProps(block: DomainNamePropsDsl.() -> Unit = {}): DomainNameProps {
        val builder = DomainNamePropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The endpoint configuration of a REST API, including VPCs and endpoint types.
     *
     * EndpointConfiguration is a property of the AWS::ApiGateway::RestApi resource.
     *
     * Example:
     * ```
     * RestApi api = RestApi.Builder.create(this, "api")
     * .endpointConfiguration(EndpointConfiguration.builder()
     * .types(List.of(EndpointType.EDGE))
     * .build())
     * .build();
     * ```
     */
    public inline fun endpointConfiguration(
        block: EndpointConfigurationDsl.() -> Unit = {}
    ): EndpointConfiguration {
        val builder = EndpointConfigurationDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Configure the response received by clients, produced from the API Gateway backend.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.apigateway.*;
     * ResponseType responseType;
     * RestApi restApi;
     * GatewayResponse gatewayResponse = GatewayResponse.Builder.create(this, "MyGatewayResponse")
     * .restApi(restApi)
     * .type(responseType)
     * // the properties below are optional
     * .responseHeaders(Map.of(
     * "responseHeadersKey", "responseHeaders"))
     * .statusCode("statusCode")
     * .templates(Map.of(
     * "templatesKey", "templates"))
     * .build();
     * ```
     */
    public inline fun gatewayResponse(
        scope: Construct,
        id: String,
        block: GatewayResponseDsl.() -> Unit = {},
    ): GatewayResponse {
        val builder = GatewayResponseDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Options to add gateway response.
     *
     * Example:
     * ```
     * RestApi api = new RestApi(this, "books-api");
     * api.addGatewayResponse("test-response", GatewayResponseOptions.builder()
     * .type(ResponseType.ACCESS_DENIED)
     * .statusCode("500")
     * .responseHeaders(Map.of(
     * // Note that values must be enclosed within a pair of single quotes
     * "Access-Control-Allow-Origin", "'test.com'",
     * "test-key", "'test-value'"))
     * .templates(Map.of(
     * "application/json", "{ \"message\": $context.error.messageString, \"statusCode\": \"488\",
     * \"type\": \"$context.error.responseType\" }"))
     * .build());
     * ```
     */
    public inline fun gatewayResponseOptions(
        block: GatewayResponseOptionsDsl.() -> Unit = {}
    ): GatewayResponseOptions {
        val builder = GatewayResponseOptionsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for a new gateway response.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.apigateway.*;
     * ResponseType responseType;
     * RestApi restApi;
     * GatewayResponseProps gatewayResponseProps = GatewayResponseProps.builder()
     * .restApi(restApi)
     * .type(responseType)
     * // the properties below are optional
     * .responseHeaders(Map.of(
     * "responseHeadersKey", "responseHeaders"))
     * .statusCode("statusCode")
     * .templates(Map.of(
     * "templatesKey", "templates"))
     * .build();
     * ```
     */
    public inline fun gatewayResponseProps(
        block: GatewayResponsePropsDsl.() -> Unit = {}
    ): GatewayResponseProps {
        val builder = GatewayResponsePropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * You can integrate an API method with an HTTP endpoint using the HTTP proxy integration or the
     * HTTP custom integration,.
     *
     * With the proxy integration, the setup is simple. You only need to set the HTTP method and the
     * HTTP endpoint URI, according to the backend requirements, if you are not concerned with
     * content encoding or caching.
     *
     * With the custom integration, the setup is more involved. In addition to the proxy integration
     * setup steps, you need to specify how the incoming request data is mapped to the integration
     * request and how the resulting integration response data is mapped to the method response.
     *
     * Example:
     * ```
     * Function authFn;
     * Resource books;
     * RequestAuthorizer auth = RequestAuthorizer.Builder.create(this, "booksAuthorizer")
     * .handler(authFn)
     * .identitySources(List.of(IdentitySource.header("Authorization")))
     * .build();
     * books.addMethod("GET", new HttpIntegration("http://amazon.com"), MethodOptions.builder()
     * .authorizer(auth)
     * .build());
     * ```
     */
    public inline fun httpIntegration(
        url: String,
        block: HttpIntegrationDsl.() -> Unit = {}
    ): HttpIntegration {
        val builder = HttpIntegrationDsl(url)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.*;
     * import software.amazon.awscdk.services.apigateway.*;
     * import software.amazon.awscdk.services.iam.*;
     * Role role;
     * VpcLink vpcLink;
     * HttpIntegrationProps httpIntegrationProps = HttpIntegrationProps.builder()
     * .httpMethod("httpMethod")
     * .options(IntegrationOptions.builder()
     * .cacheKeyParameters(List.of("cacheKeyParameters"))
     * .cacheNamespace("cacheNamespace")
     * .connectionType(ConnectionType.INTERNET)
     * .contentHandling(ContentHandling.CONVERT_TO_BINARY)
     * .credentialsPassthrough(false)
     * .credentialsRole(role)
     * .integrationResponses(List.of(IntegrationResponse.builder()
     * .statusCode("statusCode")
     * // the properties below are optional
     * .contentHandling(ContentHandling.CONVERT_TO_BINARY)
     * .responseParameters(Map.of(
     * "responseParametersKey", "responseParameters"))
     * .responseTemplates(Map.of(
     * "responseTemplatesKey", "responseTemplates"))
     * .selectionPattern("selectionPattern")
     * .build()))
     * .passthroughBehavior(PassthroughBehavior.WHEN_NO_MATCH)
     * .requestParameters(Map.of(
     * "requestParametersKey", "requestParameters"))
     * .requestTemplates(Map.of(
     * "requestTemplatesKey", "requestTemplates"))
     * .timeout(Duration.minutes(30))
     * .vpcLink(vpcLink)
     * .build())
     * .proxy(false)
     * .build();
     * ```
     */
    public inline fun httpIntegrationProps(
        block: HttpIntegrationPropsDsl.() -> Unit = {}
    ): HttpIntegrationProps {
        val builder = HttpIntegrationPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Base class for backend integrations for an API Gateway method.
     *
     * Use one of the concrete classes such as `MockIntegration`, `AwsIntegration`,
     * `LambdaIntegration` or implement on your own by specifying the set of props.
     *
     * Example:
     * ```
     * Resource books;
     * User iamUser;
     * Method getBooks = books.addMethod("GET", new HttpIntegration("http://amazon.com"),
     * MethodOptions.builder()
     * .authorizationType(AuthorizationType.IAM)
     * .build());
     * iamUser.attachInlinePolicy(Policy.Builder.create(this, "AllowBooks")
     * .statements(List.of(
     * PolicyStatement.Builder.create()
     * .actions(List.of("execute-api:Invoke"))
     * .effect(Effect.ALLOW)
     * .resources(List.of(getBooks.getMethodArn()))
     * .build()))
     * .build());
     * ```
     */
    public inline fun integration(block: IntegrationDsl.() -> Unit = {}): Integration {
        val builder = IntegrationDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Result of binding an Integration to a Method.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.*;
     * import software.amazon.awscdk.services.apigateway.*;
     * import software.amazon.awscdk.services.iam.*;
     * Role role;
     * VpcLink vpcLink;
     * IntegrationConfig integrationConfig = IntegrationConfig.builder()
     * .type(IntegrationType.AWS)
     * // the properties below are optional
     * .deploymentToken("deploymentToken")
     * .integrationHttpMethod("integrationHttpMethod")
     * .options(IntegrationOptions.builder()
     * .cacheKeyParameters(List.of("cacheKeyParameters"))
     * .cacheNamespace("cacheNamespace")
     * .connectionType(ConnectionType.INTERNET)
     * .contentHandling(ContentHandling.CONVERT_TO_BINARY)
     * .credentialsPassthrough(false)
     * .credentialsRole(role)
     * .integrationResponses(List.of(IntegrationResponse.builder()
     * .statusCode("statusCode")
     * // the properties below are optional
     * .contentHandling(ContentHandling.CONVERT_TO_BINARY)
     * .responseParameters(Map.of(
     * "responseParametersKey", "responseParameters"))
     * .responseTemplates(Map.of(
     * "responseTemplatesKey", "responseTemplates"))
     * .selectionPattern("selectionPattern")
     * .build()))
     * .passthroughBehavior(PassthroughBehavior.WHEN_NO_MATCH)
     * .requestParameters(Map.of(
     * "requestParametersKey", "requestParameters"))
     * .requestTemplates(Map.of(
     * "requestTemplatesKey", "requestTemplates"))
     * .timeout(Duration.minutes(30))
     * .vpcLink(vpcLink)
     * .build())
     * .uri("uri")
     * .build();
     * ```
     */
    public inline fun integrationConfig(
        block: IntegrationConfigDsl.() -> Unit = {}
    ): IntegrationConfig {
        val builder = IntegrationConfigDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Example:
     * ```
     * import path.*;
     * import software.amazon.awscdk.services.lambda.*;
     * import software.amazon.awscdk.App;
     * import software.amazon.awscdk.Stack;
     * import software.amazon.awscdk.services.apigateway.MockIntegration;
     * import software.amazon.awscdk.services.apigateway.PassthroughBehavior;
     * import software.amazon.awscdk.services.apigateway.RestApi;
     * import software.amazon.awscdk.services.apigateway.RequestAuthorizer;
     * import software.amazon.awscdk.services.apigateway.IdentitySource;
     * // Against the RestApi endpoint from the stack output, run
     * // `curl -s -o /dev/null -w "%{http_code}" &lt;url&gt;` should return 401
     * // `curl -s -o /dev/null -w "%{http_code}" -H 'Authorization: deny' &lt;url&gt;?allow=yes`
     * should return 403
     * // `curl -s -o /dev/null -w "%{http_code}" -H 'Authorization: allow' &lt;url&gt;?allow=yes`
     * should return 200
     * App app = new App();
     * Stack stack = new Stack(app, "RequestAuthorizerInteg");
     * Function authorizerFn = Function.Builder.create(stack, "MyAuthorizerFunction")
     * .runtime(Runtime.NODEJS_LATEST)
     * .handler("index.handler")
     * .code(AssetCode.fromAsset(join(__dirname, "integ.request-authorizer.handler")))
     * .build();
     * RestApi restapi = RestApi.Builder.create(stack, "MyRestApi").cloudWatchRole(true).build();
     * RequestAuthorizer authorizer = RequestAuthorizer.Builder.create(stack, "MyAuthorizer")
     * .handler(authorizerFn)
     * .identitySources(List.of(IdentitySource.header("Authorization"),
     * IdentitySource.queryString("allow")))
     * .build();
     * RequestAuthorizer secondAuthorizer = RequestAuthorizer.Builder.create(stack,
     * "MySecondAuthorizer")
     * .handler(authorizerFn)
     * .identitySources(List.of(IdentitySource.header("Authorization"),
     * IdentitySource.queryString("allow")))
     * .build();
     * restapi.root.addMethod("ANY", MockIntegration.Builder.create()
     * .integrationResponses(List.of(IntegrationResponse.builder().statusCode("200").build()))
     * .passthroughBehavior(PassthroughBehavior.NEVER)
     * .requestTemplates(Map.of(
     * "application/json", "{ \"statusCode\": 200 }"))
     * .build(), MethodOptions.builder()
     * .methodResponses(List.of(MethodResponse.builder().statusCode("200").build()))
     * .authorizer(authorizer)
     * .build());
     * restapi.root.resourceForPath("auth").addMethod("ANY", MockIntegration.Builder.create()
     * .integrationResponses(List.of(IntegrationResponse.builder().statusCode("200").build()))
     * .passthroughBehavior(PassthroughBehavior.NEVER)
     * .requestTemplates(Map.of(
     * "application/json", "{ \"statusCode\": 200 }"))
     * .build(), MethodOptions.builder()
     * .methodResponses(List.of(MethodResponse.builder().statusCode("200").build()))
     * .authorizer(secondAuthorizer)
     * .build());
     * ```
     */
    public inline fun integrationOptions(
        block: IntegrationOptionsDsl.() -> Unit = {}
    ): IntegrationOptions {
        val builder = IntegrationOptionsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Example:
     * ```
     * import software.amazon.awscdk.services.elasticloadbalancingv2.*;
     * Vpc vpc = new Vpc(this, "VPC");
     * NetworkLoadBalancer nlb = NetworkLoadBalancer.Builder.create(this, "NLB")
     * .vpc(vpc)
     * .build();
     * VpcLink link = VpcLink.Builder.create(this, "link")
     * .targets(List.of(nlb))
     * .build();
     * Integration integration = Integration.Builder.create()
     * .type(IntegrationType.HTTP_PROXY)
     * .integrationHttpMethod("ANY")
     * .options(IntegrationOptions.builder()
     * .connectionType(ConnectionType.VPC_LINK)
     * .vpcLink(link)
     * .build())
     * .build();
     * ```
     */
    public inline fun integrationProps(
        block: IntegrationPropsDsl.() -> Unit = {}
    ): IntegrationProps {
        val builder = IntegrationPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.apigateway.*;
     * IntegrationResponse integrationResponse = IntegrationResponse.builder()
     * .statusCode("statusCode")
     * // the properties below are optional
     * .contentHandling(ContentHandling.CONVERT_TO_BINARY)
     * .responseParameters(Map.of(
     * "responseParametersKey", "responseParameters"))
     * .responseTemplates(Map.of(
     * "responseTemplatesKey", "responseTemplates"))
     * .selectionPattern("selectionPattern")
     * .build();
     * ```
     */
    public inline fun integrationResponse(
        block: IntegrationResponseDsl.() -> Unit = {}
    ): IntegrationResponse {
        val builder = IntegrationResponseDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Represents a JSON schema definition of the structure of a REST API model.
     *
     * Copied from npm module jsonschema.
     *
     * Example:
     * ```
     * RestApi api;
     * // We define the JSON Schema for the transformed valid response
     * Model responseModel = api.addModel("ResponseModel", ModelOptions.builder()
     * .contentType("application/json")
     * .modelName("ResponseModel")
     * .schema(JsonSchema.builder()
     * .schema(JsonSchemaVersion.DRAFT4)
     * .title("pollResponse")
     * .type(JsonSchemaType.OBJECT)
     * .properties(Map.of(
     * "state", JsonSchema.builder().type(JsonSchemaType.STRING).build(),
     * "greeting", JsonSchema.builder().type(JsonSchemaType.STRING).build()))
     * .build())
     * .build());
     * // We define the JSON Schema for the transformed error response
     * Model errorResponseModel = api.addModel("ErrorResponseModel", ModelOptions.builder()
     * .contentType("application/json")
     * .modelName("ErrorResponseModel")
     * .schema(JsonSchema.builder()
     * .schema(JsonSchemaVersion.DRAFT4)
     * .title("errorResponse")
     * .type(JsonSchemaType.OBJECT)
     * .properties(Map.of(
     * "state", JsonSchema.builder().type(JsonSchemaType.STRING).build(),
     * "message", JsonSchema.builder().type(JsonSchemaType.STRING).build()))
     * .build())
     * .build());
     * ```
     *
     * [Documentation](https://github.com/tdegrunt/jsonschema)
     */
    public inline fun jsonSchema(block: JsonSchemaDsl.() -> Unit = {}): JsonSchema {
        val builder = JsonSchemaDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for controlling items output in JSON standard format.
     *
     * Example:
     * ```
     * // production stage
     * LogGroup prodLogGroup = new LogGroup(this, "PrdLogs");
     * RestApi api = RestApi.Builder.create(this, "books")
     * .deployOptions(StageOptions.builder()
     * .accessLogDestination(new LogGroupLogDestination(prodLogGroup))
     * .accessLogFormat(AccessLogFormat.jsonWithStandardFields())
     * .build())
     * .build();
     * Deployment deployment = Deployment.Builder.create(this, "Deployment").api(api).build();
     * // development stage
     * LogGroup devLogGroup = new LogGroup(this, "DevLogs");
     * Stage.Builder.create(this, "dev")
     * .deployment(deployment)
     * .accessLogDestination(new LogGroupLogDestination(devLogGroup))
     * .accessLogFormat(AccessLogFormat.jsonWithStandardFields(JsonWithStandardFieldProps.builder()
     * .caller(false)
     * .httpMethod(true)
     * .ip(true)
     * .protocol(true)
     * .requestTime(true)
     * .resourcePath(true)
     * .responseLength(true)
     * .status(true)
     * .user(true)
     * .build()))
     * .build();
     * ```
     */
    public inline fun jsonWithStandardFieldProps(
        block: JsonWithStandardFieldPropsDsl.() -> Unit = {}
    ): JsonWithStandardFieldProps {
        val builder = JsonWithStandardFieldPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Base properties for all lambda authorizers.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.*;
     * import software.amazon.awscdk.services.apigateway.*;
     * import software.amazon.awscdk.services.iam.*;
     * import software.amazon.awscdk.services.lambda.*;
     * Function function_;
     * Role role;
     * LambdaAuthorizerProps lambdaAuthorizerProps = LambdaAuthorizerProps.builder()
     * .handler(function_)
     * // the properties below are optional
     * .assumeRole(role)
     * .authorizerName("authorizerName")
     * .resultsCacheTtl(Duration.minutes(30))
     * .build();
     * ```
     */
    public inline fun lambdaAuthorizerProps(
        block: LambdaAuthorizerPropsDsl.() -> Unit = {}
    ): LambdaAuthorizerProps {
        val builder = LambdaAuthorizerPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Integrates an AWS Lambda function to an API Gateway method.
     *
     * Example:
     * ```
     * Resource resource;
     * Function handler;
     * resource.addMethod("GET", new LambdaIntegration(handler));
     * ```
     */
    public inline fun lambdaIntegration(
        handler: IFunction,
        block: LambdaIntegrationDsl.() -> Unit = {}
    ): LambdaIntegration {
        val builder = LambdaIntegrationDsl(handler)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Example:
     * ```
     * Function backend;
     * LambdaRestApi api = LambdaRestApi.Builder.create(this, "myapi")
     * .handler(backend)
     * .integrationOptions(LambdaIntegrationOptions.builder()
     * .allowTestInvoke(false)
     * .timeout(Duration.seconds(1))
     * .build())
     * .build();
     * ```
     */
    public inline fun lambdaIntegrationOptions(
        block: LambdaIntegrationOptionsDsl.() -> Unit = {}
    ): LambdaIntegrationOptions {
        val builder = LambdaIntegrationOptionsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Defines an API Gateway REST API with AWS Lambda proxy integration.
     *
     * Use the `proxy` property to define a greedy proxy ("{proxy+}") and "ANY" method from the
     * specified path. If not defined, you will need to explicity add resources and methods to the
     * API.
     *
     * Example:
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
    public inline fun lambdaRestApi(
        scope: Construct,
        id: String,
        block: LambdaRestApiDsl.() -> Unit = {},
    ): LambdaRestApi {
        val builder = LambdaRestApiDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Example:
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
    public inline fun lambdaRestApiProps(
        block: LambdaRestApiPropsDsl.() -> Unit = {}
    ): LambdaRestApiProps {
        val builder = LambdaRestApiPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The mTLS authentication configuration for a custom domain name.
     *
     * Example:
     * ```
     * Object acm;
     * DomainName.Builder.create(this, "domain-name")
     * .domainName("example.com")
     * .certificate(acm.Certificate.fromCertificateArn(this, "cert",
     * "arn:aws:acm:us-east-1:1111111:certificate/11-3336f1-44483d-adc7-9cd375c5169d"))
     * .mtls(MTLSConfig.builder()
     * .bucket(new Bucket(this, "bucket"))
     * .key("truststore.pem")
     * .version("version")
     * .build())
     * .build();
     * ```
     */
    public inline fun mTLSConfig(block: MTLSConfigDsl.() -> Unit = {}): MTLSConfig {
        val builder = MTLSConfigDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Example:
     * ```
     * LambdaIntegration integration;
     * RestApi api = new RestApi(this, "hello-api");
     * Resource v1 = api.root.addResource("v1");
     * Resource echo = v1.addResource("echo");
     * Method echoMethod = echo.addMethod("GET", integration,
     * MethodOptions.builder().apiKeyRequired(true).build());
     * UsagePlan plan = api.addUsagePlan("UsagePlan", UsagePlanProps.builder()
     * .name("Easy")
     * .throttle(ThrottleSettings.builder()
     * .rateLimit(10)
     * .burstLimit(2)
     * .build())
     * .build());
     * IApiKey key = api.addApiKey("ApiKey");
     * plan.addApiKey(key);
     * ```
     */
    public inline fun method(
        scope: Construct,
        id: String,
        block: MethodDsl.() -> Unit = {},
    ): Method {
        val builder = MethodDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Example:
     * ```
     * RestApi api = new RestApi(this, "books");
     * Deployment deployment = Deployment.Builder.create(this, "my-deployment").api(api).build();
     * Stage stage = Stage.Builder.create(this, "my-stage")
     * .deployment(deployment)
     * .methodOptions(Map.of(
     * "/ *&#47;*", MethodDeploymentOptions.builder() // This special path applies to all resource
     * paths and all HTTP methods
     * .throttlingRateLimit(100)
     * .throttlingBurstLimit(200).build()))
     * .build();
     * ```
     */
    public inline fun methodDeploymentOptions(
        block: MethodDeploymentOptionsDsl.() -> Unit = {}
    ): MethodDeploymentOptions {
        val builder = MethodDeploymentOptionsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Example:
     * ```
     * RestApi api;
     * Function userLambda;
     * Model userModel = api.addModel("UserModel", ModelOptions.builder()
     * .schema(JsonSchema.builder()
     * .type(JsonSchemaType.OBJECT)
     * .properties(Map.of(
     * "userId", JsonSchema.builder()
     * .type(JsonSchemaType.STRING)
     * .build(),
     * "name", JsonSchema.builder()
     * .type(JsonSchemaType.STRING)
     * .build()))
     * .required(List.of("userId"))
     * .build())
     * .build());
     * api.root.addResource("user").addMethod("POST",
     * new LambdaIntegration(userLambda), MethodOptions.builder()
     * .requestModels(Map.of(
     * "application/json", userModel))
     * .build());
     * ```
     */
    public inline fun methodOptions(block: MethodOptionsDsl.() -> Unit = {}): MethodOptions {
        val builder = MethodOptionsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.apigateway.*;
     * Authorizer authorizer;
     * Integration integration;
     * Model model;
     * RequestValidator requestValidator;
     * Resource resource;
     * MethodProps methodProps = MethodProps.builder()
     * .httpMethod("httpMethod")
     * .resource(resource)
     * // the properties below are optional
     * .integration(integration)
     * .options(MethodOptions.builder()
     * .apiKeyRequired(false)
     * .authorizationScopes(List.of("authorizationScopes"))
     * .authorizationType(AuthorizationType.NONE)
     * .authorizer(authorizer)
     * .methodResponses(List.of(MethodResponse.builder()
     * .statusCode("statusCode")
     * // the properties below are optional
     * .responseModels(Map.of(
     * "responseModelsKey", model))
     * .responseParameters(Map.of(
     * "responseParametersKey", false))
     * .build()))
     * .operationName("operationName")
     * .requestModels(Map.of(
     * "requestModelsKey", model))
     * .requestParameters(Map.of(
     * "requestParametersKey", false))
     * .requestValidator(requestValidator)
     * .requestValidatorOptions(RequestValidatorOptions.builder()
     * .requestValidatorName("requestValidatorName")
     * .validateRequestBody(false)
     * .validateRequestParameters(false)
     * .build())
     * .build())
     * .build();
     * ```
     */
    public inline fun methodProps(block: MethodPropsDsl.() -> Unit = {}): MethodProps {
        val builder = MethodPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.apigateway.*;
     * Model model;
     * MethodResponse methodResponse = MethodResponse.builder()
     * .statusCode("statusCode")
     * // the properties below are optional
     * .responseModels(Map.of(
     * "responseModelsKey", model))
     * .responseParameters(Map.of(
     * "responseParametersKey", false))
     * .build();
     * ```
     */
    public inline fun methodResponse(block: MethodResponseDsl.() -> Unit = {}): MethodResponse {
        val builder = MethodResponseDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * This type of integration lets API Gateway return a response without sending the request
     * further to the backend.
     *
     * This is useful for API testing because it can be used to test the integration set up without
     * incurring charges for using the backend and to enable collaborative development of an API. In
     * collaborative development, a team can isolate their development effort by setting up
     * simulations of API components owned by other teams by using the MOCK integrations. It is also
     * used to return CORS-related headers to ensure that the API method permits CORS access. In
     * fact, the API Gateway console integrates the OPTIONS method to support CORS with a mock
     * integration. Gateway responses are other examples of mock integrations.
     *
     * Example:
     * ```
     * import path.*;
     * import software.amazon.awscdk.services.lambda.*;
     * import software.amazon.awscdk.App;
     * import software.amazon.awscdk.Stack;
     * import software.amazon.awscdk.services.apigateway.MockIntegration;
     * import software.amazon.awscdk.services.apigateway.PassthroughBehavior;
     * import software.amazon.awscdk.services.apigateway.RestApi;
     * import software.amazon.awscdk.services.apigateway.RequestAuthorizer;
     * import software.amazon.awscdk.services.apigateway.IdentitySource;
     * // Against the RestApi endpoint from the stack output, run
     * // `curl -s -o /dev/null -w "%{http_code}" &lt;url&gt;` should return 401
     * // `curl -s -o /dev/null -w "%{http_code}" -H 'Authorization: deny' &lt;url&gt;?allow=yes`
     * should return 403
     * // `curl -s -o /dev/null -w "%{http_code}" -H 'Authorization: allow' &lt;url&gt;?allow=yes`
     * should return 200
     * App app = new App();
     * Stack stack = new Stack(app, "RequestAuthorizerInteg");
     * Function authorizerFn = Function.Builder.create(stack, "MyAuthorizerFunction")
     * .runtime(Runtime.NODEJS_LATEST)
     * .handler("index.handler")
     * .code(AssetCode.fromAsset(join(__dirname, "integ.request-authorizer.handler")))
     * .build();
     * RestApi restapi = RestApi.Builder.create(stack, "MyRestApi").cloudWatchRole(true).build();
     * RequestAuthorizer authorizer = RequestAuthorizer.Builder.create(stack, "MyAuthorizer")
     * .handler(authorizerFn)
     * .identitySources(List.of(IdentitySource.header("Authorization"),
     * IdentitySource.queryString("allow")))
     * .build();
     * RequestAuthorizer secondAuthorizer = RequestAuthorizer.Builder.create(stack,
     * "MySecondAuthorizer")
     * .handler(authorizerFn)
     * .identitySources(List.of(IdentitySource.header("Authorization"),
     * IdentitySource.queryString("allow")))
     * .build();
     * restapi.root.addMethod("ANY", MockIntegration.Builder.create()
     * .integrationResponses(List.of(IntegrationResponse.builder().statusCode("200").build()))
     * .passthroughBehavior(PassthroughBehavior.NEVER)
     * .requestTemplates(Map.of(
     * "application/json", "{ \"statusCode\": 200 }"))
     * .build(), MethodOptions.builder()
     * .methodResponses(List.of(MethodResponse.builder().statusCode("200").build()))
     * .authorizer(authorizer)
     * .build());
     * restapi.root.resourceForPath("auth").addMethod("ANY", MockIntegration.Builder.create()
     * .integrationResponses(List.of(IntegrationResponse.builder().statusCode("200").build()))
     * .passthroughBehavior(PassthroughBehavior.NEVER)
     * .requestTemplates(Map.of(
     * "application/json", "{ \"statusCode\": 200 }"))
     * .build(), MethodOptions.builder()
     * .methodResponses(List.of(MethodResponse.builder().statusCode("200").build()))
     * .authorizer(secondAuthorizer)
     * .build());
     * ```
     */
    public inline fun mockIntegration(block: MockIntegrationDsl.() -> Unit = {}): MockIntegration {
        val builder = MockIntegrationDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Example:
     * ```
     * RestApi api;
     * // We define the JSON Schema for the transformed valid response
     * Model responseModel = api.addModel("ResponseModel", ModelOptions.builder()
     * .contentType("application/json")
     * .modelName("ResponseModel")
     * .schema(JsonSchema.builder()
     * .schema(JsonSchemaVersion.DRAFT4)
     * .title("pollResponse")
     * .type(JsonSchemaType.OBJECT)
     * .properties(Map.of(
     * "state", JsonSchema.builder().type(JsonSchemaType.STRING).build(),
     * "greeting", JsonSchema.builder().type(JsonSchemaType.STRING).build()))
     * .build())
     * .build());
     * // We define the JSON Schema for the transformed error response
     * Model errorResponseModel = api.addModel("ErrorResponseModel", ModelOptions.builder()
     * .contentType("application/json")
     * .modelName("ErrorResponseModel")
     * .schema(JsonSchema.builder()
     * .schema(JsonSchemaVersion.DRAFT4)
     * .title("errorResponse")
     * .type(JsonSchemaType.OBJECT)
     * .properties(Map.of(
     * "state", JsonSchema.builder().type(JsonSchemaType.STRING).build(),
     * "message", JsonSchema.builder().type(JsonSchemaType.STRING).build()))
     * .build())
     * .build());
     * ```
     */
    public inline fun model(
        scope: Construct,
        id: String,
        block: ModelDsl.() -> Unit = {},
    ): Model {
        val builder = ModelDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Example:
     * ```
     * RestApi api;
     * // We define the JSON Schema for the transformed valid response
     * Model responseModel = api.addModel("ResponseModel", ModelOptions.builder()
     * .contentType("application/json")
     * .modelName("ResponseModel")
     * .schema(JsonSchema.builder()
     * .schema(JsonSchemaVersion.DRAFT4)
     * .title("pollResponse")
     * .type(JsonSchemaType.OBJECT)
     * .properties(Map.of(
     * "state", JsonSchema.builder().type(JsonSchemaType.STRING).build(),
     * "greeting", JsonSchema.builder().type(JsonSchemaType.STRING).build()))
     * .build())
     * .build());
     * // We define the JSON Schema for the transformed error response
     * Model errorResponseModel = api.addModel("ErrorResponseModel", ModelOptions.builder()
     * .contentType("application/json")
     * .modelName("ErrorResponseModel")
     * .schema(JsonSchema.builder()
     * .schema(JsonSchemaVersion.DRAFT4)
     * .title("errorResponse")
     * .type(JsonSchemaType.OBJECT)
     * .properties(Map.of(
     * "state", JsonSchema.builder().type(JsonSchemaType.STRING).build(),
     * "message", JsonSchema.builder().type(JsonSchemaType.STRING).build()))
     * .build())
     * .build());
     * ```
     */
    public inline fun modelOptions(block: ModelOptionsDsl.() -> Unit = {}): ModelOptions {
        val builder = ModelOptionsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.apigateway.*;
     * Object default_;
     * Object enum_;
     * JsonSchema jsonSchema_;
     * RestApi restApi;
     * ModelProps modelProps = ModelProps.builder()
     * .restApi(restApi)
     * .schema(JsonSchema.builder()
     * .additionalItems(List.of(jsonSchema_))
     * .additionalProperties(false)
     * .allOf(List.of(jsonSchema_))
     * .anyOf(List.of(jsonSchema_))
     * .contains(jsonSchema_)
     * .default(default_)
     * .definitions(Map.of(
     * "definitionsKey", jsonSchema_))
     * .dependencies(Map.of(
     * "dependenciesKey", List.of("dependencies")))
     * .description("description")
     * .enum(List.of(enum_))
     * .exclusiveMaximum(false)
     * .exclusiveMinimum(false)
     * .format("format")
     * .id("id")
     * .items(jsonSchema_)
     * .maximum(123)
     * .maxItems(123)
     * .maxLength(123)
     * .maxProperties(123)
     * .minimum(123)
     * .minItems(123)
     * .minLength(123)
     * .minProperties(123)
     * .multipleOf(123)
     * .not(jsonSchema_)
     * .oneOf(List.of(jsonSchema_))
     * .pattern("pattern")
     * .patternProperties(Map.of(
     * "patternPropertiesKey", jsonSchema_))
     * .properties(Map.of(
     * "propertiesKey", jsonSchema_))
     * .propertyNames(jsonSchema_)
     * .ref("ref")
     * .required(List.of("required"))
     * .schema(JsonSchemaVersion.DRAFT4)
     * .title("title")
     * .type(JsonSchemaType.NULL)
     * .uniqueItems(false)
     * .build())
     * // the properties below are optional
     * .contentType("contentType")
     * .description("description")
     * .modelName("modelName")
     * .build();
     * ```
     */
    public inline fun modelProps(block: ModelPropsDsl.() -> Unit = {}): ModelProps {
        val builder = ModelPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Defines a {proxy+} greedy resource and an ANY method on a route.
     *
     * Example:
     * ```
     * Resource resource;
     * Function handler;
     * ProxyResource proxy = resource.addProxy(ProxyResourceOptions.builder()
     * .defaultIntegration(new LambdaIntegration(handler))
     * // "false" will require explicitly adding methods on the `proxy` resource
     * .anyMethod(true)
     * .build());
     * ```
     *
     * [Documentation](https://docs.aws.amazon.com/apigateway/latest/developerguide/api-gateway-set-up-simple-proxy.html)
     */
    public inline fun proxyResource(
        scope: Construct,
        id: String,
        block: ProxyResourceDsl.() -> Unit = {},
    ): ProxyResource {
        val builder = ProxyResourceDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Example:
     * ```
     * Resource resource;
     * Function handler;
     * ProxyResource proxy = resource.addProxy(ProxyResourceOptions.builder()
     * .defaultIntegration(new LambdaIntegration(handler))
     * // "false" will require explicitly adding methods on the `proxy` resource
     * .anyMethod(true)
     * .build());
     * ```
     */
    public inline fun proxyResourceOptions(
        block: ProxyResourceOptionsDsl.() -> Unit = {}
    ): ProxyResourceOptions {
        val builder = ProxyResourceOptionsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.*;
     * import software.amazon.awscdk.services.apigateway.*;
     * Authorizer authorizer;
     * Integration integration;
     * Model model;
     * RequestValidator requestValidator;
     * Resource resource;
     * ProxyResourceProps proxyResourceProps = ProxyResourceProps.builder()
     * .parent(resource)
     * // the properties below are optional
     * .anyMethod(false)
     * .defaultCorsPreflightOptions(CorsOptions.builder()
     * .allowOrigins(List.of("allowOrigins"))
     * // the properties below are optional
     * .allowCredentials(false)
     * .allowHeaders(List.of("allowHeaders"))
     * .allowMethods(List.of("allowMethods"))
     * .disableCache(false)
     * .exposeHeaders(List.of("exposeHeaders"))
     * .maxAge(Duration.minutes(30))
     * .statusCode(123)
     * .build())
     * .defaultIntegration(integration)
     * .defaultMethodOptions(MethodOptions.builder()
     * .apiKeyRequired(false)
     * .authorizationScopes(List.of("authorizationScopes"))
     * .authorizationType(AuthorizationType.NONE)
     * .authorizer(authorizer)
     * .methodResponses(List.of(MethodResponse.builder()
     * .statusCode("statusCode")
     * // the properties below are optional
     * .responseModels(Map.of(
     * "responseModelsKey", model))
     * .responseParameters(Map.of(
     * "responseParametersKey", false))
     * .build()))
     * .operationName("operationName")
     * .requestModels(Map.of(
     * "requestModelsKey", model))
     * .requestParameters(Map.of(
     * "requestParametersKey", false))
     * .requestValidator(requestValidator)
     * .requestValidatorOptions(RequestValidatorOptions.builder()
     * .requestValidatorName("requestValidatorName")
     * .validateRequestBody(false)
     * .validateRequestParameters(false)
     * .build())
     * .build())
     * .build();
     * ```
     */
    public inline fun proxyResourceProps(
        block: ProxyResourcePropsDsl.() -> Unit = {}
    ): ProxyResourceProps {
        val builder = ProxyResourcePropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Specifies the maximum number of requests that clients can make to API Gateway APIs.
     *
     * Example:
     * ```
     * RestApi api;
     * RateLimitedApiKey key = RateLimitedApiKey.Builder.create(this, "rate-limited-api-key")
     * .customerId("hello-customer")
     * .stages(List.of(api.getDeploymentStage()))
     * .quota(QuotaSettings.builder()
     * .limit(10000)
     * .period(Period.MONTH)
     * .build())
     * .build();
     * ```
     */
    public inline fun quotaSettings(block: QuotaSettingsDsl.() -> Unit = {}): QuotaSettings {
        val builder = QuotaSettingsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * An API Gateway ApiKey, for which a rate limiting configuration can be specified.
     *
     * Example:
     * ```
     * RestApi api;
     * RateLimitedApiKey key = RateLimitedApiKey.Builder.create(this, "rate-limited-api-key")
     * .customerId("hello-customer")
     * .stages(List.of(api.getDeploymentStage()))
     * .quota(QuotaSettings.builder()
     * .limit(10000)
     * .period(Period.MONTH)
     * .build())
     * .build();
     * ```
     */
    public inline fun rateLimitedApiKey(
        scope: Construct,
        id: String,
        block: RateLimitedApiKeyDsl.() -> Unit = {},
    ): RateLimitedApiKey {
        val builder = RateLimitedApiKeyDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * RateLimitedApiKey properties.
     *
     * Example:
     * ```
     * RestApi api;
     * RateLimitedApiKey key = RateLimitedApiKey.Builder.create(this, "rate-limited-api-key")
     * .customerId("hello-customer")
     * .stages(List.of(api.getDeploymentStage()))
     * .quota(QuotaSettings.builder()
     * .limit(10000)
     * .period(Period.MONTH)
     * .build())
     * .build();
     * ```
     */
    public inline fun rateLimitedApiKeyProps(
        block: RateLimitedApiKeyPropsDsl.() -> Unit = {}
    ): RateLimitedApiKeyProps {
        val builder = RateLimitedApiKeyPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Request-based lambda authorizer that recognizes the caller's identity via request parameters,
     * such as headers, paths, query strings, stage variables, or context variables.
     *
     * Based on the request, authorization is performed by a lambda function.
     *
     * Example:
     * ```
     * Function authFn;
     * Resource books;
     * RequestAuthorizer auth = RequestAuthorizer.Builder.create(this, "booksAuthorizer")
     * .handler(authFn)
     * .identitySources(List.of(IdentitySource.header("Authorization")))
     * .build();
     * books.addMethod("GET", new HttpIntegration("http://amazon.com"), MethodOptions.builder()
     * .authorizer(auth)
     * .build());
     * ```
     */
    public inline fun requestAuthorizer(
        scope: Construct,
        id: String,
        block: RequestAuthorizerDsl.() -> Unit = {},
    ): RequestAuthorizer {
        val builder = RequestAuthorizerDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for RequestAuthorizer.
     *
     * Example:
     * ```
     * Function authFn;
     * Resource books;
     * RequestAuthorizer auth = RequestAuthorizer.Builder.create(this, "booksAuthorizer")
     * .handler(authFn)
     * .identitySources(List.of(IdentitySource.header("Authorization")))
     * .build();
     * books.addMethod("GET", new HttpIntegration("http://amazon.com"), MethodOptions.builder()
     * .authorizer(auth)
     * .build());
     * ```
     */
    public inline fun requestAuthorizerProps(
        block: RequestAuthorizerPropsDsl.() -> Unit = {}
    ): RequestAuthorizerProps {
        val builder = RequestAuthorizerPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Configure what must be included in the `requestContext`.
     *
     * More details can be found at mapping templates documentation.
     *
     * Example:
     * ```
     * StepFunctionsRestApi.Builder.create(this, "StepFunctionsRestApi")
     * .stateMachine(machine)
     * .headers(true)
     * .path(false)
     * .querystring(false)
     * .authorizer(false)
     * .requestContext(RequestContext.builder()
     * .caller(true)
     * .user(true)
     * .build())
     * .build();
     * ```
     *
     * [Documentation](https://docs.aws.amazon.com/apigateway/latest/developerguide/api-gateway-mapping-template-reference.html)
     */
    public inline fun requestContext(block: RequestContextDsl.() -> Unit = {}): RequestContext {
        val builder = RequestContextDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.apigateway.*;
     * RestApi restApi;
     * RequestValidator requestValidator = RequestValidator.Builder.create(this, "MyRequestValidator")
     * .restApi(restApi)
     * // the properties below are optional
     * .requestValidatorName("requestValidatorName")
     * .validateRequestBody(false)
     * .validateRequestParameters(false)
     * .build();
     * ```
     */
    public inline fun requestValidator(
        scope: Construct,
        id: String,
        block: RequestValidatorDsl.() -> Unit = {},
    ): RequestValidator {
        val builder = RequestValidatorDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Example:
     * ```
     * LambdaIntegration integration;
     * Resource resource;
     * Model responseModel;
     * Model errorResponseModel;
     * resource.addMethod("GET", integration, MethodOptions.builder()
     * // We can mark the parameters as required
     * .requestParameters(Map.of(
     * "method.request.querystring.who", true))
     * // we can set request validator options like below
     * .requestValidatorOptions(RequestValidatorOptions.builder()
     * .requestValidatorName("test-validator")
     * .validateRequestBody(true)
     * .validateRequestParameters(false)
     * .build())
     * .methodResponses(List.of(MethodResponse.builder()
     * // Successful response from the integration
     * .statusCode("200")
     * // Define what parameters are allowed or not
     * .responseParameters(Map.of(
     * "method.response.header.Content-Type", true,
     * "method.response.header.Access-Control-Allow-Origin", true,
     * "method.response.header.Access-Control-Allow-Credentials", true))
     * // Validate the schema on the response
     * .responseModels(Map.of(
     * "application/json", responseModel))
     * .build(), MethodResponse.builder()
     * // Same thing for the error responses
     * .statusCode("400")
     * .responseParameters(Map.of(
     * "method.response.header.Content-Type", true,
     * "method.response.header.Access-Control-Allow-Origin", true,
     * "method.response.header.Access-Control-Allow-Credentials", true))
     * .responseModels(Map.of(
     * "application/json", errorResponseModel))
     * .build()))
     * .build());
     * ```
     */
    public inline fun requestValidatorOptions(
        block: RequestValidatorOptionsDsl.() -> Unit = {}
    ): RequestValidatorOptions {
        val builder = RequestValidatorOptionsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.apigateway.*;
     * RestApi restApi;
     * RequestValidatorProps requestValidatorProps = RequestValidatorProps.builder()
     * .restApi(restApi)
     * // the properties below are optional
     * .requestValidatorName("requestValidatorName")
     * .validateRequestBody(false)
     * .validateRequestParameters(false)
     * .build();
     * ```
     */
    public inline fun requestValidatorProps(
        block: RequestValidatorPropsDsl.() -> Unit = {}
    ): RequestValidatorProps {
        val builder = RequestValidatorPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Example:
     * ```
     * LambdaIntegration booksBackend;
     * RestApi api = RestApi.Builder.create(this, "books")
     * .defaultIntegration(booksBackend)
     * .build();
     * Resource books = api.root.addResource("books");
     * books.addMethod("GET"); // integrated with `booksBackend`
     * books.addMethod("POST"); // integrated with `booksBackend`
     * Resource book = books.addResource("{book_id}");
     * book.addMethod("GET");
     * ```
     */
    public inline fun resource(
        scope: Construct,
        id: String,
        block: ResourceDsl.() -> Unit = {},
    ): Resource {
        val builder = ResourceDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Attributes that can be specified when importing a Resource.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.apigateway.*;
     * RestApi restApi;
     * ResourceAttributes resourceAttributes = ResourceAttributes.builder()
     * .path("path")
     * .resourceId("resourceId")
     * .restApi(restApi)
     * .build();
     * ```
     */
    public inline fun resourceAttributes(
        block: ResourceAttributesDsl.() -> Unit = {}
    ): ResourceAttributes {
        val builder = ResourceAttributesDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Example:
     * ```
     * Resource resource;
     * Resource subtree = resource.addResource("subtree", ResourceOptions.builder()
     * .defaultCorsPreflightOptions(CorsOptions.builder()
     * .allowOrigins(List.of("https://amazon.com"))
     * .build())
     * .build());
     * ```
     */
    public inline fun resourceOptions(block: ResourceOptionsDsl.() -> Unit = {}): ResourceOptions {
        val builder = ResourceOptionsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.*;
     * import software.amazon.awscdk.services.apigateway.*;
     * Authorizer authorizer;
     * Integration integration;
     * Model model;
     * RequestValidator requestValidator;
     * Resource resource;
     * ResourceProps resourceProps = ResourceProps.builder()
     * .parent(resource)
     * .pathPart("pathPart")
     * // the properties below are optional
     * .defaultCorsPreflightOptions(CorsOptions.builder()
     * .allowOrigins(List.of("allowOrigins"))
     * // the properties below are optional
     * .allowCredentials(false)
     * .allowHeaders(List.of("allowHeaders"))
     * .allowMethods(List.of("allowMethods"))
     * .disableCache(false)
     * .exposeHeaders(List.of("exposeHeaders"))
     * .maxAge(Duration.minutes(30))
     * .statusCode(123)
     * .build())
     * .defaultIntegration(integration)
     * .defaultMethodOptions(MethodOptions.builder()
     * .apiKeyRequired(false)
     * .authorizationScopes(List.of("authorizationScopes"))
     * .authorizationType(AuthorizationType.NONE)
     * .authorizer(authorizer)
     * .methodResponses(List.of(MethodResponse.builder()
     * .statusCode("statusCode")
     * // the properties below are optional
     * .responseModels(Map.of(
     * "responseModelsKey", model))
     * .responseParameters(Map.of(
     * "responseParametersKey", false))
     * .build()))
     * .operationName("operationName")
     * .requestModels(Map.of(
     * "requestModelsKey", model))
     * .requestParameters(Map.of(
     * "requestParametersKey", false))
     * .requestValidator(requestValidator)
     * .requestValidatorOptions(RequestValidatorOptions.builder()
     * .requestValidatorName("requestValidatorName")
     * .validateRequestBody(false)
     * .validateRequestParameters(false)
     * .build())
     * .build())
     * .build();
     * ```
     */
    public inline fun resourceProps(block: ResourcePropsDsl.() -> Unit = {}): ResourceProps {
        val builder = ResourcePropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Represents a REST API in Amazon API Gateway.
     *
     * Use `addResource` and `addMethod` to configure the API model.
     *
     * By default, the API will automatically be deployed and accessible from a public endpoint.
     *
     * Example:
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
    public inline fun restApi(
        scope: Construct,
        id: String,
        block: RestApiDsl.() -> Unit = {},
    ): RestApi {
        val builder = RestApiDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Attributes that can be specified when importing a RestApi.
     *
     * Example:
     * ```
     * import software.constructs.Construct;
     * import software.amazon.awscdk.App;
     * import software.amazon.awscdk.CfnOutput;
     * import software.amazon.awscdk.NestedStack;
     * import software.amazon.awscdk.NestedStackProps;
     * import software.amazon.awscdk.Stack;
     * import software.amazon.awscdk.services.apigateway.Deployment;
     * import software.amazon.awscdk.services.apigateway.Method;
     * import software.amazon.awscdk.services.apigateway.MockIntegration;
     * import software.amazon.awscdk.services.apigateway.PassthroughBehavior;
     * import software.amazon.awscdk.services.apigateway.RestApi;
     * import software.amazon.awscdk.services.apigateway.Stage;
     * / **
     * * This file showcases how to split up a RestApi's Resources and Methods across nested stacks.
     * *
     * * The root stack 'RootStack' first defines a RestApi.
     * * Two nested stacks BooksStack and PetsStack, create corresponding Resources '/books' and
     * '/pets'.
     * * They are then deployed to a 'prod' Stage via a third nested stack - DeployStack.
     * *
     * * To verify this worked, go to the APIGateway
     * *&#47;
     * public class RootStack extends Stack {
     * public RootStack(Construct scope) {
     * super(scope, "integ-restapi-import-RootStack");
     * RestApi restApi = RestApi.Builder.create(this, "RestApi")
     * .cloudWatchRole(true)
     * .deploy(false)
     * .build();
     * restApi.root.addMethod("ANY");
     * PetsStack petsStack = new PetsStack(this, new ResourceNestedStackProps()
     * .restApiId(restApi.getRestApiId())
     * .rootResourceId(restApi.getRestApiRootResourceId())
     * );
     * BooksStack booksStack = new BooksStack(this, new ResourceNestedStackProps()
     * .restApiId(restApi.getRestApiId())
     * .rootResourceId(restApi.getRestApiRootResourceId())
     * );
     * new DeployStack(this, new DeployStackProps()
     * .restApiId(restApi.getRestApiId())
     * .methods(petsStack.methods.concat(booksStack.getMethods()))
     * );
     * CfnOutput.Builder.create(this, "PetsURL")
     * .value(String.format("https://%s.execute-api.%s.amazonaws.com/prod/pets",
     * restApi.getRestApiId(), this.region))
     * .build();
     * CfnOutput.Builder.create(this, "BooksURL")
     * .value(String.format("https://%s.execute-api.%s.amazonaws.com/prod/books",
     * restApi.getRestApiId(), this.region))
     * .build();
     * }
     * }
     * public class ResourceNestedStackProps extends NestedStackProps {
     * private String restApiId;
     * public String getRestApiId() {
     * return this.restApiId;
     * }
     * public ResourceNestedStackProps restApiId(String restApiId) {
     * this.restApiId = restApiId;
     * return this;
     * }
     * private String rootResourceId;
     * public String getRootResourceId() {
     * return this.rootResourceId;
     * }
     * public ResourceNestedStackProps rootResourceId(String rootResourceId) {
     * this.rootResourceId = rootResourceId;
     * return this;
     * }
     * }
     * public class PetsStack extends NestedStack {
     * public final Method[] methods;
     * public PetsStack(Construct scope, ResourceNestedStackProps props) {
     * super(scope, "integ-restapi-import-PetsStack", props);
     * IRestApi api = RestApi.fromRestApiAttributes(this, "RestApi", RestApiAttributes.builder()
     * .restApiId(props.getRestApiId())
     * .rootResourceId(props.getRootResourceId())
     * .build());
     * Method method = api.root.addResource("pets").addMethod("GET", MockIntegration.Builder.create()
     * .integrationResponses(List.of(IntegrationResponse.builder()
     * .statusCode("200")
     * .build()))
     * .passthroughBehavior(PassthroughBehavior.NEVER)
     * .requestTemplates(Map.of(
     * "application/json", "{ \"statusCode\": 200 }"))
     * .build(), MethodOptions.builder()
     * .methodResponses(List.of(MethodResponse.builder().statusCode("200").build()))
     * .build());
     * this.methods.push(method);
     * }
     * }
     * public class BooksStack extends NestedStack {
     * public final Method[] methods;
     * public BooksStack(Construct scope, ResourceNestedStackProps props) {
     * super(scope, "integ-restapi-import-BooksStack", props);
     * IRestApi api = RestApi.fromRestApiAttributes(this, "RestApi", RestApiAttributes.builder()
     * .restApiId(props.getRestApiId())
     * .rootResourceId(props.getRootResourceId())
     * .build());
     * Method method = api.root.addResource("books").addMethod("GET", MockIntegration.Builder.create()
     * .integrationResponses(List.of(IntegrationResponse.builder()
     * .statusCode("200")
     * .build()))
     * .passthroughBehavior(PassthroughBehavior.NEVER)
     * .requestTemplates(Map.of(
     * "application/json", "{ \"statusCode\": 200 }"))
     * .build(), MethodOptions.builder()
     * .methodResponses(List.of(MethodResponse.builder().statusCode("200").build()))
     * .build());
     * this.methods.push(method);
     * }
     * }
     * public class DeployStackProps extends NestedStackProps {
     * private String restApiId;
     * public String getRestApiId() {
     * return this.restApiId;
     * }
     * public DeployStackProps restApiId(String restApiId) {
     * this.restApiId = restApiId;
     * return this;
     * }
     * private Method[] methods;
     * public Method[] getMethods() {
     * return this.methods;
     * }
     * public DeployStackProps methods(Method[] methods) {
     * this.methods = methods;
     * return this;
     * }
     * }
     * public class DeployStack extends NestedStack {
     * public DeployStack(Construct scope, DeployStackProps props) {
     * super(scope, "integ-restapi-import-DeployStack", props);
     * Deployment deployment = Deployment.Builder.create(this, "Deployment")
     * .api(RestApi.fromRestApiId(this, "RestApi", props.getRestApiId()))
     * .build();
     * if (props.getMethods()) {
     * for (Object method : props.getMethods()) {
     * deployment.node.addDependency(method);
     * }
     * }
     * Stage.Builder.create(this, "Stage").deployment(deployment).build();
     * }
     * }
     * new RootStack(new App());
     * ```
     */
    public inline fun restApiAttributes(
        block: RestApiAttributesDsl.() -> Unit = {}
    ): RestApiAttributes {
        val builder = RestApiAttributesDsl()
        builder.apply(block)
        return builder.build()
    }

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
    public inline fun restApiBaseProps(
        block: RestApiBasePropsDsl.() -> Unit = {}
    ): RestApiBaseProps {
        val builder = RestApiBasePropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Props to create a new instance of RestApi.
     *
     * Example:
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
    public inline fun restApiProps(block: RestApiPropsDsl.() -> Unit = {}): RestApiProps {
        val builder = RestApiPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Integrates an AWS Sagemaker Endpoint to an API Gateway method.
     *
     * Example:
     * ```
     * Resource resource;
     * IEndpoint endpoint;
     * resource.addMethod("POST", new SagemakerIntegration(endpoint));
     * ```
     */
    public inline fun sagemakerIntegration(
        endpoint: IEndpoint,
        block: SagemakerIntegrationDsl.() -> Unit = {}
    ): SagemakerIntegration {
        val builder = SagemakerIntegrationDsl(endpoint)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Options for SageMakerIntegration.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.*;
     * import software.amazon.awscdk.services.apigateway.*;
     * import software.amazon.awscdk.services.iam.*;
     * Role role;
     * VpcLink vpcLink;
     * SagemakerIntegrationOptions sagemakerIntegrationOptions = SagemakerIntegrationOptions.builder()
     * .cacheKeyParameters(List.of("cacheKeyParameters"))
     * .cacheNamespace("cacheNamespace")
     * .connectionType(ConnectionType.INTERNET)
     * .contentHandling(ContentHandling.CONVERT_TO_BINARY)
     * .credentialsPassthrough(false)
     * .credentialsRole(role)
     * .integrationResponses(List.of(IntegrationResponse.builder()
     * .statusCode("statusCode")
     * // the properties below are optional
     * .contentHandling(ContentHandling.CONVERT_TO_BINARY)
     * .responseParameters(Map.of(
     * "responseParametersKey", "responseParameters"))
     * .responseTemplates(Map.of(
     * "responseTemplatesKey", "responseTemplates"))
     * .selectionPattern("selectionPattern")
     * .build()))
     * .passthroughBehavior(PassthroughBehavior.WHEN_NO_MATCH)
     * .requestParameters(Map.of(
     * "requestParametersKey", "requestParameters"))
     * .requestTemplates(Map.of(
     * "requestTemplatesKey", "requestTemplates"))
     * .timeout(Duration.minutes(30))
     * .vpcLink(vpcLink)
     * .build();
     * ```
     */
    public inline fun sagemakerIntegrationOptions(
        block: SagemakerIntegrationOptionsDsl.() -> Unit = {}
    ): SagemakerIntegrationOptions {
        val builder = SagemakerIntegrationOptionsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Represents a REST API in Amazon API Gateway, created with an OpenAPI specification.
     *
     * Some properties normally accessible on
     *
     * Example:
     * ```
     * Integration integration;
     * SpecRestApi api = SpecRestApi.Builder.create(this, "books-api")
     * .apiDefinition(ApiDefinition.fromAsset("path-to-file.json"))
     * .build();
     * Resource booksResource = api.root.addResource("books");
     * booksResource.addMethod("GET", integration);
     * ```
     *
     * @see <a href=" `RestApi` - such as the description - must be declared in the specification.
     *   All Resources and Methods need to be defined as part of the OpenAPI specification file, and
     *   cannot be added via the CDK. By default, the API will automatically be deployed and
     *   accessible from a public endpoint."> `RestApi` - such as the description - must be declared
     *   in the specification. All Resources and Methods need to be defined as part of the OpenAPI
     *   specification file, and cannot be added via the CDK. By default, the API will automatically
     *   be deployed and accessible from a public endpoint.</a>
     */
    public inline fun specRestApi(
        scope: Construct,
        id: String,
        block: SpecRestApiDsl.() -> Unit = {},
    ): SpecRestApi {
        val builder = SpecRestApiDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Props to instantiate a new SpecRestApi.
     *
     * Example:
     * ```
     * Integration integration;
     * SpecRestApi api = SpecRestApi.Builder.create(this, "books-api")
     * .apiDefinition(ApiDefinition.fromAsset("path-to-file.json"))
     * .build();
     * Resource booksResource = api.root.addResource("books");
     * booksResource.addMethod("GET", integration);
     * ```
     */
    public inline fun specRestApiProps(
        block: SpecRestApiPropsDsl.() -> Unit = {}
    ): SpecRestApiProps {
        val builder = SpecRestApiPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Example:
     * ```
     * // production stage
     * LogGroup prodLogGroup = new LogGroup(this, "PrdLogs");
     * RestApi api = RestApi.Builder.create(this, "books")
     * .deployOptions(StageOptions.builder()
     * .accessLogDestination(new LogGroupLogDestination(prodLogGroup))
     * .accessLogFormat(AccessLogFormat.jsonWithStandardFields())
     * .build())
     * .build();
     * Deployment deployment = Deployment.Builder.create(this, "Deployment").api(api).build();
     * // development stage
     * LogGroup devLogGroup = new LogGroup(this, "DevLogs");
     * Stage.Builder.create(this, "dev")
     * .deployment(deployment)
     * .accessLogDestination(new LogGroupLogDestination(devLogGroup))
     * .accessLogFormat(AccessLogFormat.jsonWithStandardFields(JsonWithStandardFieldProps.builder()
     * .caller(false)
     * .httpMethod(true)
     * .ip(true)
     * .protocol(true)
     * .requestTime(true)
     * .resourcePath(true)
     * .responseLength(true)
     * .status(true)
     * .user(true)
     * .build()))
     * .build();
     * ```
     */
    public inline fun stage(
        scope: Construct,
        id: String,
        block: StageDsl.() -> Unit = {},
    ): Stage {
        val builder = StageDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * The attributes of an imported Stage.
     *
     * Example:
     * ```
     * IRestApi restApi;
     * IStage importedStage = Stage.fromStageAttributes(this, "imported-stage",
     * StageAttributes.builder()
     * .stageName("myStageName")
     * .restApi(restApi)
     * .build());
     * importedStage.addApiKey("MyApiKey");
     * ```
     */
    public inline fun stageAttributes(block: StageAttributesDsl.() -> Unit = {}): StageAttributes {
        val builder = StageAttributesDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Example:
     * ```
     * LogGroup logGroup = new LogGroup(this, "ApiGatewayAccessLogs");
     * RestApi api = RestApi.Builder.create(this, "books")
     * .deployOptions(StageOptions.builder()
     * .accessLogDestination(new LogGroupLogDestination(logGroup))
     * .accessLogFormat(AccessLogFormat.clf())
     * .build())
     * .build();
     * ```
     */
    public inline fun stageOptions(block: StageOptionsDsl.() -> Unit = {}): StageOptions {
        val builder = StageOptionsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Example:
     * ```
     * // production stage
     * LogGroup prodLogGroup = new LogGroup(this, "PrdLogs");
     * RestApi api = RestApi.Builder.create(this, "books")
     * .deployOptions(StageOptions.builder()
     * .accessLogDestination(new LogGroupLogDestination(prodLogGroup))
     * .accessLogFormat(AccessLogFormat.jsonWithStandardFields())
     * .build())
     * .build();
     * Deployment deployment = Deployment.Builder.create(this, "Deployment").api(api).build();
     * // development stage
     * LogGroup devLogGroup = new LogGroup(this, "DevLogs");
     * Stage.Builder.create(this, "dev")
     * .deployment(deployment)
     * .accessLogDestination(new LogGroupLogDestination(devLogGroup))
     * .accessLogFormat(AccessLogFormat.jsonWithStandardFields(JsonWithStandardFieldProps.builder()
     * .caller(false)
     * .httpMethod(true)
     * .ip(true)
     * .protocol(true)
     * .requestTime(true)
     * .resourcePath(true)
     * .responseLength(true)
     * .status(true)
     * .user(true)
     * .build()))
     * .build();
     * ```
     */
    public inline fun stageProps(block: StagePropsDsl.() -> Unit = {}): StageProps {
        val builder = StagePropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Options when configuring Step Functions synchronous integration with Rest API.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.*;
     * import software.amazon.awscdk.services.apigateway.*;
     * import software.amazon.awscdk.services.iam.*;
     * Role role;
     * VpcLink vpcLink;
     * StepFunctionsExecutionIntegrationOptions stepFunctionsExecutionIntegrationOptions =
     * StepFunctionsExecutionIntegrationOptions.builder()
     * .authorizer(false)
     * .cacheKeyParameters(List.of("cacheKeyParameters"))
     * .cacheNamespace("cacheNamespace")
     * .connectionType(ConnectionType.INTERNET)
     * .contentHandling(ContentHandling.CONVERT_TO_BINARY)
     * .credentialsPassthrough(false)
     * .credentialsRole(role)
     * .headers(false)
     * .integrationResponses(List.of(IntegrationResponse.builder()
     * .statusCode("statusCode")
     * // the properties below are optional
     * .contentHandling(ContentHandling.CONVERT_TO_BINARY)
     * .responseParameters(Map.of(
     * "responseParametersKey", "responseParameters"))
     * .responseTemplates(Map.of(
     * "responseTemplatesKey", "responseTemplates"))
     * .selectionPattern("selectionPattern")
     * .build()))
     * .passthroughBehavior(PassthroughBehavior.WHEN_NO_MATCH)
     * .path(false)
     * .querystring(false)
     * .requestContext(RequestContext.builder()
     * .accountId(false)
     * .apiId(false)
     * .apiKey(false)
     * .authorizerPrincipalId(false)
     * .caller(false)
     * .cognitoAuthenticationProvider(false)
     * .cognitoAuthenticationType(false)
     * .cognitoIdentityId(false)
     * .cognitoIdentityPoolId(false)
     * .httpMethod(false)
     * .requestId(false)
     * .resourceId(false)
     * .resourcePath(false)
     * .sourceIp(false)
     * .stage(false)
     * .user(false)
     * .userAgent(false)
     * .userArn(false)
     * .build())
     * .requestParameters(Map.of(
     * "requestParametersKey", "requestParameters"))
     * .requestTemplates(Map.of(
     * "requestTemplatesKey", "requestTemplates"))
     * .timeout(Duration.minutes(30))
     * .useDefaultMethodResponses(false)
     * .vpcLink(vpcLink)
     * .build();
     * ```
     */
    public inline fun stepFunctionsExecutionIntegrationOptions(
        block: StepFunctionsExecutionIntegrationOptionsDsl.() -> Unit = {}
    ): StepFunctionsExecutionIntegrationOptions {
        val builder = StepFunctionsExecutionIntegrationOptionsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Defines an API Gateway REST API with a Synchrounous Express State Machine as a proxy
     * integration.
     *
     * Example:
     * ```
     * IStateMachine machine;
     * StepFunctionsRestApi.Builder.create(this, "StepFunctionsRestApi")
     * .stateMachine(machine)
     * .useDefaultMethodResponses(false)
     * .build();
     * ```
     */
    public inline fun stepFunctionsRestApi(
        scope: Construct,
        id: String,
        block: StepFunctionsRestApiDsl.() -> Unit = {},
    ): StepFunctionsRestApi {
        val builder = StepFunctionsRestApiDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for StepFunctionsRestApi.
     *
     * Example:
     * ```
     * IStateMachine machine;
     * StepFunctionsRestApi.Builder.create(this, "StepFunctionsRestApi")
     * .stateMachine(machine)
     * .useDefaultMethodResponses(false)
     * .build();
     * ```
     */
    public inline fun stepFunctionsRestApiProps(
        block: StepFunctionsRestApiPropsDsl.() -> Unit = {}
    ): StepFunctionsRestApiProps {
        val builder = StepFunctionsRestApiPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Container for defining throttling parameters to API stages or methods.
     *
     * Example:
     * ```
     * LambdaIntegration integration;
     * RestApi api = new RestApi(this, "hello-api");
     * Resource v1 = api.root.addResource("v1");
     * Resource echo = v1.addResource("echo");
     * Method echoMethod = echo.addMethod("GET", integration,
     * MethodOptions.builder().apiKeyRequired(true).build());
     * UsagePlan plan = api.addUsagePlan("UsagePlan", UsagePlanProps.builder()
     * .name("Easy")
     * .throttle(ThrottleSettings.builder()
     * .rateLimit(10)
     * .burstLimit(2)
     * .build())
     * .build());
     * IApiKey key = api.addApiKey("ApiKey");
     * plan.addApiKey(key);
     * ```
     */
    public inline fun throttleSettings(
        block: ThrottleSettingsDsl.() -> Unit = {}
    ): ThrottleSettings {
        val builder = ThrottleSettingsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Represents per-method throttling for a resource.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.apigateway.*;
     * Method method;
     * ThrottlingPerMethod throttlingPerMethod = ThrottlingPerMethod.builder()
     * .method(method)
     * .throttle(ThrottleSettings.builder()
     * .burstLimit(123)
     * .rateLimit(123)
     * .build())
     * .build();
     * ```
     */
    public inline fun throttlingPerMethod(
        block: ThrottlingPerMethodDsl.() -> Unit = {}
    ): ThrottlingPerMethod {
        val builder = ThrottlingPerMethodDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Token based lambda authorizer that recognizes the caller's identity as a bearer token, such
     * as a JSON Web Token (JWT) or an OAuth token.
     *
     * Based on the token, authorization is performed by a lambda function.
     *
     * Example:
     * ```
     * Function authFn;
     * Resource books;
     * TokenAuthorizer auth = TokenAuthorizer.Builder.create(this, "booksAuthorizer")
     * .handler(authFn)
     * .build();
     * books.addMethod("GET", new HttpIntegration("http://amazon.com"), MethodOptions.builder()
     * .authorizer(auth)
     * .build());
     * ```
     */
    public inline fun tokenAuthorizer(
        scope: Construct,
        id: String,
        block: TokenAuthorizerDsl.() -> Unit = {},
    ): TokenAuthorizer {
        val builder = TokenAuthorizerDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for TokenAuthorizer.
     *
     * Example:
     * ```
     * Function authFn;
     * Resource books;
     * TokenAuthorizer auth = TokenAuthorizer.Builder.create(this, "booksAuthorizer")
     * .handler(authFn)
     * .build();
     * books.addMethod("GET", new HttpIntegration("http://amazon.com"), MethodOptions.builder()
     * .authorizer(auth)
     * .build());
     * ```
     */
    public inline fun tokenAuthorizerProps(
        block: TokenAuthorizerPropsDsl.() -> Unit = {}
    ): TokenAuthorizerProps {
        val builder = TokenAuthorizerPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Example:
     * ```
     * LambdaIntegration integration;
     * RestApi api = new RestApi(this, "hello-api");
     * Resource v1 = api.root.addResource("v1");
     * Resource echo = v1.addResource("echo");
     * Method echoMethod = echo.addMethod("GET", integration,
     * MethodOptions.builder().apiKeyRequired(true).build());
     * UsagePlan plan = api.addUsagePlan("UsagePlan", UsagePlanProps.builder()
     * .name("Easy")
     * .throttle(ThrottleSettings.builder()
     * .rateLimit(10)
     * .burstLimit(2)
     * .build())
     * .build());
     * IApiKey key = api.addApiKey("ApiKey");
     * plan.addApiKey(key);
     * ```
     */
    public inline fun usagePlan(
        scope: Construct,
        id: String,
        block: UsagePlanDsl.() -> Unit = {},
    ): UsagePlan {
        val builder = UsagePlanDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Represents the API stages that a usage plan applies to.
     *
     * Example:
     * ```
     * UsagePlan plan;
     * RestApi api;
     * Method echoMethod;
     * plan.addApiStage(UsagePlanPerApiStage.builder()
     * .stage(api.getDeploymentStage())
     * .throttle(List.of(ThrottlingPerMethod.builder()
     * .method(echoMethod)
     * .throttle(ThrottleSettings.builder()
     * .rateLimit(10)
     * .burstLimit(2)
     * .build())
     * .build()))
     * .build());
     * ```
     */
    public inline fun usagePlanPerApiStage(
        block: UsagePlanPerApiStageDsl.() -> Unit = {}
    ): UsagePlanPerApiStage {
        val builder = UsagePlanPerApiStageDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Example:
     * ```
     * LambdaIntegration integration;
     * RestApi api = new RestApi(this, "hello-api");
     * Resource v1 = api.root.addResource("v1");
     * Resource echo = v1.addResource("echo");
     * Method echoMethod = echo.addMethod("GET", integration,
     * MethodOptions.builder().apiKeyRequired(true).build());
     * UsagePlan plan = api.addUsagePlan("UsagePlan", UsagePlanProps.builder()
     * .name("Easy")
     * .throttle(ThrottleSettings.builder()
     * .rateLimit(10)
     * .burstLimit(2)
     * .build())
     * .build());
     * IApiKey key = api.addApiKey("ApiKey");
     * plan.addApiKey(key);
     * ```
     */
    public inline fun usagePlanProps(block: UsagePlanPropsDsl.() -> Unit = {}): UsagePlanProps {
        val builder = UsagePlanPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Define a new VPC Link Specifies an API Gateway VPC link for a RestApi to access resources in
     * an Amazon Virtual Private Cloud (VPC).
     *
     * Example:
     * ```
     * import software.amazon.awscdk.services.elasticloadbalancingv2.*;
     * Vpc vpc = new Vpc(this, "VPC");
     * NetworkLoadBalancer nlb = NetworkLoadBalancer.Builder.create(this, "NLB")
     * .vpc(vpc)
     * .build();
     * VpcLink link = VpcLink.Builder.create(this, "link")
     * .targets(List.of(nlb))
     * .build();
     * Integration integration = Integration.Builder.create()
     * .type(IntegrationType.HTTP_PROXY)
     * .integrationHttpMethod("ANY")
     * .options(IntegrationOptions.builder()
     * .connectionType(ConnectionType.VPC_LINK)
     * .vpcLink(link)
     * .build())
     * .build();
     * ```
     */
    public inline fun vpcLink(
        scope: Construct,
        id: String,
        block: VpcLinkDsl.() -> Unit = {},
    ): VpcLink {
        val builder = VpcLinkDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for a VpcLink.
     *
     * Example:
     * ```
     * import software.amazon.awscdk.services.elasticloadbalancingv2.*;
     * Vpc vpc = new Vpc(this, "VPC");
     * NetworkLoadBalancer nlb = NetworkLoadBalancer.Builder.create(this, "NLB")
     * .vpc(vpc)
     * .build();
     * VpcLink link = VpcLink.Builder.create(this, "link")
     * .targets(List.of(nlb))
     * .build();
     * Integration integration = Integration.Builder.create()
     * .type(IntegrationType.HTTP_PROXY)
     * .integrationHttpMethod("ANY")
     * .options(IntegrationOptions.builder()
     * .connectionType(ConnectionType.VPC_LINK)
     * .vpcLink(link)
     * .build())
     * .build();
     * ```
     */
    public inline fun vpcLinkProps(block: VpcLinkPropsDsl.() -> Unit = {}): VpcLinkProps {
        val builder = VpcLinkPropsDsl()
        builder.apply(block)
        return builder.build()
    }
}
