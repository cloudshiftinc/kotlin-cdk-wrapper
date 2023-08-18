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

package io.cloudshiftdev.awscdkdsl.services.sam

import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.sam.CfnApi
import software.amazon.awscdk.services.sam.CfnApiProps
import software.amazon.awscdk.services.sam.CfnApplication
import software.amazon.awscdk.services.sam.CfnApplicationProps
import software.amazon.awscdk.services.sam.CfnFunction
import software.amazon.awscdk.services.sam.CfnFunctionProps
import software.amazon.awscdk.services.sam.CfnHttpApi
import software.amazon.awscdk.services.sam.CfnHttpApiProps
import software.amazon.awscdk.services.sam.CfnLayerVersion
import software.amazon.awscdk.services.sam.CfnLayerVersionProps
import software.amazon.awscdk.services.sam.CfnSimpleTable
import software.amazon.awscdk.services.sam.CfnSimpleTableProps
import software.amazon.awscdk.services.sam.CfnStateMachine
import software.amazon.awscdk.services.sam.CfnStateMachineProps
import software.constructs.Construct

public object sam {
    /**
     * Definition of AWS::Serverless::Api.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.sam.*;
     * Object authorizers;
     * Object definitionBody;
     * Object gatewayResponses;
     * Object methodSettings;
     * Object models;
     * CfnApi cfnApi = CfnApi.Builder.create(this, "MyCfnApi")
     * .stageName("stageName")
     * // the properties below are optional
     * .accessLogSetting(AccessLogSettingProperty.builder()
     * .destinationArn("destinationArn")
     * .format("format")
     * .build())
     * .auth(AuthProperty.builder()
     * .addDefaultAuthorizerToCorsPreflight(false)
     * .authorizers(authorizers)
     * .defaultAuthorizer("defaultAuthorizer")
     * .build())
     * .binaryMediaTypes(List.of("binaryMediaTypes"))
     * .cacheClusterEnabled(false)
     * .cacheClusterSize("cacheClusterSize")
     * .canarySetting(CanarySettingProperty.builder()
     * .deploymentId("deploymentId")
     * .percentTraffic(123)
     * .stageVariableOverrides(Map.of(
     * "stageVariableOverridesKey", "stageVariableOverrides"))
     * .useStageCache(false)
     * .build())
     * .cors("cors")
     * .definitionBody(definitionBody)
     * .definitionUri("definitionUri")
     * .description("description")
     * .disableExecuteApiEndpoint(false)
     * .domain(DomainConfigurationProperty.builder()
     * .certificateArn("certificateArn")
     * .domainName("domainName")
     * // the properties below are optional
     * .basePath(List.of("basePath"))
     * .endpointConfiguration("endpointConfiguration")
     * .mutualTlsAuthentication(MutualTlsAuthenticationProperty.builder()
     * .truststoreUri("truststoreUri")
     * .truststoreVersion("truststoreVersion")
     * .build())
     * .ownershipVerificationCertificateArn("ownershipVerificationCertificateArn")
     * .route53(Route53ConfigurationProperty.builder()
     * .distributedDomainName("distributedDomainName")
     * .evaluateTargetHealth(false)
     * .hostedZoneId("hostedZoneId")
     * .hostedZoneName("hostedZoneName")
     * .ipV6(false)
     * .build())
     * .securityPolicy("securityPolicy")
     * .build())
     * .endpointConfiguration("endpointConfiguration")
     * .gatewayResponses(gatewayResponses)
     * .methodSettings(List.of(methodSettings))
     * .minimumCompressionSize(123)
     * .models(models)
     * .name("name")
     * .openApiVersion("openApiVersion")
     * .tags(Map.of(
     * "tagsKey", "tags"))
     * .tracingEnabled(false)
     * .variables(Map.of(
     * "variablesKey", "variables"))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-serverless-api.html)
     */
    public inline fun cfnApi(
        scope: Construct,
        id: String,
        block: CfnApiDsl.() -> Unit = {},
    ): CfnApi {
        val builder = CfnApiDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.sam.*;
     * AccessLogSettingProperty accessLogSettingProperty = AccessLogSettingProperty.builder()
     * .destinationArn("destinationArn")
     * .format("format")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-serverless-api-accesslogsetting.html)
     */
    public inline fun cfnApiAccessLogSettingProperty(
        block: CfnApiAccessLogSettingPropertyDsl.() -> Unit = {}
    ): CfnApi.AccessLogSettingProperty {
        val builder = CfnApiAccessLogSettingPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.sam.*;
     * Object authorizers;
     * AuthProperty authProperty = AuthProperty.builder()
     * .addDefaultAuthorizerToCorsPreflight(false)
     * .authorizers(authorizers)
     * .defaultAuthorizer("defaultAuthorizer")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-serverless-api-auth.html)
     */
    public inline fun cfnApiAuthProperty(
        block: CfnApiAuthPropertyDsl.() -> Unit = {}
    ): CfnApi.AuthProperty {
        val builder = CfnApiAuthPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.sam.*;
     * CanarySettingProperty canarySettingProperty = CanarySettingProperty.builder()
     * .deploymentId("deploymentId")
     * .percentTraffic(123)
     * .stageVariableOverrides(Map.of(
     * "stageVariableOverridesKey", "stageVariableOverrides"))
     * .useStageCache(false)
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-serverless-api-canarysetting.html)
     */
    public inline fun cfnApiCanarySettingProperty(
        block: CfnApiCanarySettingPropertyDsl.() -> Unit = {}
    ): CfnApi.CanarySettingProperty {
        val builder = CfnApiCanarySettingPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.sam.*;
     * CorsConfigurationProperty corsConfigurationProperty = CorsConfigurationProperty.builder()
     * .allowOrigin("allowOrigin")
     * // the properties below are optional
     * .allowCredentials(false)
     * .allowHeaders("allowHeaders")
     * .allowMethods("allowMethods")
     * .maxAge("maxAge")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-serverless-api-corsconfiguration.html)
     */
    public inline fun cfnApiCorsConfigurationProperty(
        block: CfnApiCorsConfigurationPropertyDsl.() -> Unit = {}
    ): CfnApi.CorsConfigurationProperty {
        val builder = CfnApiCorsConfigurationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.sam.*;
     * DomainConfigurationProperty domainConfigurationProperty = DomainConfigurationProperty.builder()
     * .certificateArn("certificateArn")
     * .domainName("domainName")
     * // the properties below are optional
     * .basePath(List.of("basePath"))
     * .endpointConfiguration("endpointConfiguration")
     * .mutualTlsAuthentication(MutualTlsAuthenticationProperty.builder()
     * .truststoreUri("truststoreUri")
     * .truststoreVersion("truststoreVersion")
     * .build())
     * .ownershipVerificationCertificateArn("ownershipVerificationCertificateArn")
     * .route53(Route53ConfigurationProperty.builder()
     * .distributedDomainName("distributedDomainName")
     * .evaluateTargetHealth(false)
     * .hostedZoneId("hostedZoneId")
     * .hostedZoneName("hostedZoneName")
     * .ipV6(false)
     * .build())
     * .securityPolicy("securityPolicy")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-serverless-api-domainconfiguration.html)
     */
    public inline fun cfnApiDomainConfigurationProperty(
        block: CfnApiDomainConfigurationPropertyDsl.() -> Unit = {}
    ): CfnApi.DomainConfigurationProperty {
        val builder = CfnApiDomainConfigurationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.sam.*;
     * EndpointConfigurationProperty endpointConfigurationProperty =
     * EndpointConfigurationProperty.builder()
     * .type("type")
     * .vpcEndpointIds(List.of("vpcEndpointIds"))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-serverless-api-endpointconfiguration.html)
     */
    public inline fun cfnApiEndpointConfigurationProperty(
        block: CfnApiEndpointConfigurationPropertyDsl.() -> Unit = {}
    ): CfnApi.EndpointConfigurationProperty {
        val builder = CfnApiEndpointConfigurationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.sam.*;
     * MutualTlsAuthenticationProperty mutualTlsAuthenticationProperty =
     * MutualTlsAuthenticationProperty.builder()
     * .truststoreUri("truststoreUri")
     * .truststoreVersion("truststoreVersion")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-serverless-api-mutualtlsauthentication.html)
     */
    public inline fun cfnApiMutualTlsAuthenticationProperty(
        block: CfnApiMutualTlsAuthenticationPropertyDsl.() -> Unit = {}
    ): CfnApi.MutualTlsAuthenticationProperty {
        val builder = CfnApiMutualTlsAuthenticationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnApi`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.sam.*;
     * Object authorizers;
     * Object definitionBody;
     * Object gatewayResponses;
     * Object methodSettings;
     * Object models;
     * CfnApiProps cfnApiProps = CfnApiProps.builder()
     * .stageName("stageName")
     * // the properties below are optional
     * .accessLogSetting(AccessLogSettingProperty.builder()
     * .destinationArn("destinationArn")
     * .format("format")
     * .build())
     * .auth(AuthProperty.builder()
     * .addDefaultAuthorizerToCorsPreflight(false)
     * .authorizers(authorizers)
     * .defaultAuthorizer("defaultAuthorizer")
     * .build())
     * .binaryMediaTypes(List.of("binaryMediaTypes"))
     * .cacheClusterEnabled(false)
     * .cacheClusterSize("cacheClusterSize")
     * .canarySetting(CanarySettingProperty.builder()
     * .deploymentId("deploymentId")
     * .percentTraffic(123)
     * .stageVariableOverrides(Map.of(
     * "stageVariableOverridesKey", "stageVariableOverrides"))
     * .useStageCache(false)
     * .build())
     * .cors("cors")
     * .definitionBody(definitionBody)
     * .definitionUri("definitionUri")
     * .description("description")
     * .disableExecuteApiEndpoint(false)
     * .domain(DomainConfigurationProperty.builder()
     * .certificateArn("certificateArn")
     * .domainName("domainName")
     * // the properties below are optional
     * .basePath(List.of("basePath"))
     * .endpointConfiguration("endpointConfiguration")
     * .mutualTlsAuthentication(MutualTlsAuthenticationProperty.builder()
     * .truststoreUri("truststoreUri")
     * .truststoreVersion("truststoreVersion")
     * .build())
     * .ownershipVerificationCertificateArn("ownershipVerificationCertificateArn")
     * .route53(Route53ConfigurationProperty.builder()
     * .distributedDomainName("distributedDomainName")
     * .evaluateTargetHealth(false)
     * .hostedZoneId("hostedZoneId")
     * .hostedZoneName("hostedZoneName")
     * .ipV6(false)
     * .build())
     * .securityPolicy("securityPolicy")
     * .build())
     * .endpointConfiguration("endpointConfiguration")
     * .gatewayResponses(gatewayResponses)
     * .methodSettings(List.of(methodSettings))
     * .minimumCompressionSize(123)
     * .models(models)
     * .name("name")
     * .openApiVersion("openApiVersion")
     * .tags(Map.of(
     * "tagsKey", "tags"))
     * .tracingEnabled(false)
     * .variables(Map.of(
     * "variablesKey", "variables"))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-serverless-api.html)
     */
    public inline fun cfnApiProps(block: CfnApiPropsDsl.() -> Unit = {}): CfnApiProps {
        val builder = CfnApiPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.sam.*;
     * Route53ConfigurationProperty route53ConfigurationProperty =
     * Route53ConfigurationProperty.builder()
     * .distributedDomainName("distributedDomainName")
     * .evaluateTargetHealth(false)
     * .hostedZoneId("hostedZoneId")
     * .hostedZoneName("hostedZoneName")
     * .ipV6(false)
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-serverless-api-route53configuration.html)
     */
    public inline fun cfnApiRoute53ConfigurationProperty(
        block: CfnApiRoute53ConfigurationPropertyDsl.() -> Unit = {}
    ): CfnApi.Route53ConfigurationProperty {
        val builder = CfnApiRoute53ConfigurationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.sam.*;
     * S3LocationProperty s3LocationProperty = S3LocationProperty.builder()
     * .bucket("bucket")
     * .key("key")
     * .version(123)
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-serverless-api-s3location.html)
     */
    public inline fun cfnApiS3LocationProperty(
        block: CfnApiS3LocationPropertyDsl.() -> Unit = {}
    ): CfnApi.S3LocationProperty {
        val builder = CfnApiS3LocationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Definition of AWS::Serverless::Application.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.sam.*;
     * CfnApplication cfnApplication = CfnApplication.Builder.create(this, "MyCfnApplication")
     * .location("location")
     * // the properties below are optional
     * .notificationArns(List.of("notificationArns"))
     * .parameters(Map.of(
     * "parametersKey", "parameters"))
     * .tags(Map.of(
     * "tagsKey", "tags"))
     * .timeoutInMinutes(123)
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-serverless-application.html)
     */
    public inline fun cfnApplication(
        scope: Construct,
        id: String,
        block: CfnApplicationDsl.() -> Unit = {},
    ): CfnApplication {
        val builder = CfnApplicationDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.sam.*;
     * ApplicationLocationProperty applicationLocationProperty = ApplicationLocationProperty.builder()
     * .applicationId("applicationId")
     * .semanticVersion("semanticVersion")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-serverless-application-applicationlocation.html)
     */
    public inline fun cfnApplicationApplicationLocationProperty(
        block: CfnApplicationApplicationLocationPropertyDsl.() -> Unit = {}
    ): CfnApplication.ApplicationLocationProperty {
        val builder = CfnApplicationApplicationLocationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnApplication`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.sam.*;
     * CfnApplicationProps cfnApplicationProps = CfnApplicationProps.builder()
     * .location("location")
     * // the properties below are optional
     * .notificationArns(List.of("notificationArns"))
     * .parameters(Map.of(
     * "parametersKey", "parameters"))
     * .tags(Map.of(
     * "tagsKey", "tags"))
     * .timeoutInMinutes(123)
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-serverless-application.html)
     */
    public inline fun cfnApplicationProps(
        block: CfnApplicationPropsDsl.() -> Unit = {}
    ): CfnApplicationProps {
        val builder = CfnApplicationPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Definition of AWS::Serverless::Function.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.sam.*;
     * Object assumeRolePolicyDocument;
     * CfnFunction cfnFunction = CfnFunction.Builder.create(this, "MyCfnFunction")
     * .architectures(List.of("architectures"))
     * .assumeRolePolicyDocument(assumeRolePolicyDocument)
     * .autoPublishAlias("autoPublishAlias")
     * .autoPublishCodeSha256("autoPublishCodeSha256")
     * .codeSigningConfigArn("codeSigningConfigArn")
     * .codeUri("codeUri")
     * .deadLetterQueue(DeadLetterQueueProperty.builder()
     * .targetArn("targetArn")
     * .type("type")
     * .build())
     * .deploymentPreference(DeploymentPreferenceProperty.builder()
     * .alarms(List.of("alarms"))
     * .enabled(false)
     * .hooks(HooksProperty.builder()
     * .postTraffic("postTraffic")
     * .preTraffic("preTraffic")
     * .build())
     * .role("role")
     * .type("type")
     * .build())
     * .description("description")
     * .environment(FunctionEnvironmentProperty.builder()
     * .variables(Map.of(
     * "variablesKey", "variables"))
     * .build())
     * .eventInvokeConfig(EventInvokeConfigProperty.builder()
     * .destinationConfig(EventInvokeDestinationConfigProperty.builder()
     * .onFailure(DestinationProperty.builder()
     * .destination("destination")
     * // the properties below are optional
     * .type("type")
     * .build())
     * .onSuccess(DestinationProperty.builder()
     * .destination("destination")
     * // the properties below are optional
     * .type("type")
     * .build())
     * .build())
     * .maximumEventAgeInSeconds(123)
     * .maximumRetryAttempts(123)
     * .build())
     * .events(Map.of(
     * "eventsKey", EventSourceProperty.builder()
     * .properties(AlexaSkillEventProperty.builder()
     * .variables(Map.of(
     * "variablesKey", "variables"))
     * .build())
     * .type("type")
     * .build()))
     * .fileSystemConfigs(List.of(FileSystemConfigProperty.builder()
     * .arn("arn")
     * .localMountPath("localMountPath")
     * .build()))
     * .functionName("functionName")
     * .handler("handler")
     * .imageConfig(ImageConfigProperty.builder()
     * .command(List.of("command"))
     * .entryPoint(List.of("entryPoint"))
     * .workingDirectory("workingDirectory")
     * .build())
     * .imageUri("imageUri")
     * .inlineCode("inlineCode")
     * .kmsKeyArn("kmsKeyArn")
     * .layers(List.of("layers"))
     * .memorySize(123)
     * .packageType("packageType")
     * .permissionsBoundary("permissionsBoundary")
     * .policies("policies")
     * .provisionedConcurrencyConfig(ProvisionedConcurrencyConfigProperty.builder()
     * .provisionedConcurrentExecutions("provisionedConcurrentExecutions")
     * .build())
     * .reservedConcurrentExecutions(123)
     * .role("role")
     * .runtime("runtime")
     * .tags(Map.of(
     * "tagsKey", "tags"))
     * .timeout(123)
     * .tracing("tracing")
     * .versionDescription("versionDescription")
     * .vpcConfig(VpcConfigProperty.builder()
     * .securityGroupIds(List.of("securityGroupIds"))
     * .subnetIds(List.of("subnetIds"))
     * .build())
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-serverless-function.html)
     */
    public inline fun cfnFunction(
        scope: Construct,
        id: String,
        block: CfnFunctionDsl.() -> Unit = {},
    ): CfnFunction {
        val builder = CfnFunctionDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.sam.*;
     * AlexaSkillEventProperty alexaSkillEventProperty = AlexaSkillEventProperty.builder()
     * .variables(Map.of(
     * "variablesKey", "variables"))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-serverless-function-alexaskillevent.html)
     */
    public inline fun cfnFunctionAlexaSkillEventProperty(
        block: CfnFunctionAlexaSkillEventPropertyDsl.() -> Unit = {}
    ): CfnFunction.AlexaSkillEventProperty {
        val builder = CfnFunctionAlexaSkillEventPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.sam.*;
     * Object customStatements;
     * ApiEventProperty apiEventProperty = ApiEventProperty.builder()
     * .method("method")
     * .path("path")
     * // the properties below are optional
     * .auth(AuthProperty.builder()
     * .apiKeyRequired(false)
     * .authorizationScopes(List.of("authorizationScopes"))
     * .authorizer("authorizer")
     * .resourcePolicy(AuthResourcePolicyProperty.builder()
     * .awsAccountBlacklist(List.of("awsAccountBlacklist"))
     * .awsAccountWhitelist(List.of("awsAccountWhitelist"))
     * .customStatements(List.of(customStatements))
     * .intrinsicVpcBlacklist(List.of("intrinsicVpcBlacklist"))
     * .intrinsicVpceBlacklist(List.of("intrinsicVpceBlacklist"))
     * .intrinsicVpceWhitelist(List.of("intrinsicVpceWhitelist"))
     * .intrinsicVpcWhitelist(List.of("intrinsicVpcWhitelist"))
     * .ipRangeBlacklist(List.of("ipRangeBlacklist"))
     * .ipRangeWhitelist(List.of("ipRangeWhitelist"))
     * .sourceVpcBlacklist(List.of("sourceVpcBlacklist"))
     * .sourceVpcWhitelist(List.of("sourceVpcWhitelist"))
     * .build())
     * .build())
     * .requestModel(RequestModelProperty.builder()
     * .model("model")
     * // the properties below are optional
     * .required(false)
     * .validateBody(false)
     * .validateParameters(false)
     * .build())
     * .requestParameters(List.of("requestParameters"))
     * .restApiId("restApiId")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-serverless-function-apievent.html)
     */
    public inline fun cfnFunctionApiEventProperty(
        block: CfnFunctionApiEventPropertyDsl.() -> Unit = {}
    ): CfnFunction.ApiEventProperty {
        val builder = CfnFunctionApiEventPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.sam.*;
     * Object customStatements;
     * AuthProperty authProperty = AuthProperty.builder()
     * .apiKeyRequired(false)
     * .authorizationScopes(List.of("authorizationScopes"))
     * .authorizer("authorizer")
     * .resourcePolicy(AuthResourcePolicyProperty.builder()
     * .awsAccountBlacklist(List.of("awsAccountBlacklist"))
     * .awsAccountWhitelist(List.of("awsAccountWhitelist"))
     * .customStatements(List.of(customStatements))
     * .intrinsicVpcBlacklist(List.of("intrinsicVpcBlacklist"))
     * .intrinsicVpceBlacklist(List.of("intrinsicVpceBlacklist"))
     * .intrinsicVpceWhitelist(List.of("intrinsicVpceWhitelist"))
     * .intrinsicVpcWhitelist(List.of("intrinsicVpcWhitelist"))
     * .ipRangeBlacklist(List.of("ipRangeBlacklist"))
     * .ipRangeWhitelist(List.of("ipRangeWhitelist"))
     * .sourceVpcBlacklist(List.of("sourceVpcBlacklist"))
     * .sourceVpcWhitelist(List.of("sourceVpcWhitelist"))
     * .build())
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-serverless-function-auth.html)
     */
    public inline fun cfnFunctionAuthProperty(
        block: CfnFunctionAuthPropertyDsl.() -> Unit = {}
    ): CfnFunction.AuthProperty {
        val builder = CfnFunctionAuthPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.sam.*;
     * Object customStatements;
     * AuthResourcePolicyProperty authResourcePolicyProperty = AuthResourcePolicyProperty.builder()
     * .awsAccountBlacklist(List.of("awsAccountBlacklist"))
     * .awsAccountWhitelist(List.of("awsAccountWhitelist"))
     * .customStatements(List.of(customStatements))
     * .intrinsicVpcBlacklist(List.of("intrinsicVpcBlacklist"))
     * .intrinsicVpceBlacklist(List.of("intrinsicVpceBlacklist"))
     * .intrinsicVpceWhitelist(List.of("intrinsicVpceWhitelist"))
     * .intrinsicVpcWhitelist(List.of("intrinsicVpcWhitelist"))
     * .ipRangeBlacklist(List.of("ipRangeBlacklist"))
     * .ipRangeWhitelist(List.of("ipRangeWhitelist"))
     * .sourceVpcBlacklist(List.of("sourceVpcBlacklist"))
     * .sourceVpcWhitelist(List.of("sourceVpcWhitelist"))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-serverless-function-authresourcepolicy.html)
     */
    public inline fun cfnFunctionAuthResourcePolicyProperty(
        block: CfnFunctionAuthResourcePolicyPropertyDsl.() -> Unit = {}
    ): CfnFunction.AuthResourcePolicyProperty {
        val builder = CfnFunctionAuthResourcePolicyPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.sam.*;
     * BucketSAMPTProperty bucketSAMPTProperty = BucketSAMPTProperty.builder()
     * .bucketName("bucketName")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-serverless-function-bucketsampt.html)
     */
    public inline fun cfnFunctionBucketSAMPTProperty(
        block: CfnFunctionBucketSAMPTPropertyDsl.() -> Unit = {}
    ): CfnFunction.BucketSAMPTProperty {
        val builder = CfnFunctionBucketSAMPTPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.sam.*;
     * Object pattern;
     * CloudWatchEventEventProperty cloudWatchEventEventProperty =
     * CloudWatchEventEventProperty.builder()
     * .pattern(pattern)
     * // the properties below are optional
     * .input("input")
     * .inputPath("inputPath")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-serverless-function-cloudwatcheventevent.html)
     */
    public inline fun cfnFunctionCloudWatchEventEventProperty(
        block: CfnFunctionCloudWatchEventEventPropertyDsl.() -> Unit = {}
    ): CfnFunction.CloudWatchEventEventProperty {
        val builder = CfnFunctionCloudWatchEventEventPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.sam.*;
     * CloudWatchLogsEventProperty cloudWatchLogsEventProperty = CloudWatchLogsEventProperty.builder()
     * .filterPattern("filterPattern")
     * .logGroupName("logGroupName")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-serverless-function-cloudwatchlogsevent.html)
     */
    public inline fun cfnFunctionCloudWatchLogsEventProperty(
        block: CfnFunctionCloudWatchLogsEventPropertyDsl.() -> Unit = {}
    ): CfnFunction.CloudWatchLogsEventProperty {
        val builder = CfnFunctionCloudWatchLogsEventPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.sam.*;
     * CognitoEventProperty cognitoEventProperty = CognitoEventProperty.builder()
     * .trigger("trigger")
     * .userPool("userPool")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-serverless-function-cognitoevent.html)
     */
    public inline fun cfnFunctionCognitoEventProperty(
        block: CfnFunctionCognitoEventPropertyDsl.() -> Unit = {}
    ): CfnFunction.CognitoEventProperty {
        val builder = CfnFunctionCognitoEventPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.sam.*;
     * CollectionSAMPTProperty collectionSAMPTProperty = CollectionSAMPTProperty.builder()
     * .collectionId("collectionId")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-serverless-function-collectionsampt.html)
     */
    public inline fun cfnFunctionCollectionSAMPTProperty(
        block: CfnFunctionCollectionSAMPTPropertyDsl.() -> Unit = {}
    ): CfnFunction.CollectionSAMPTProperty {
        val builder = CfnFunctionCollectionSAMPTPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.sam.*;
     * DeadLetterQueueProperty deadLetterQueueProperty = DeadLetterQueueProperty.builder()
     * .targetArn("targetArn")
     * .type("type")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-serverless-function-deadletterqueue.html)
     */
    public inline fun cfnFunctionDeadLetterQueueProperty(
        block: CfnFunctionDeadLetterQueuePropertyDsl.() -> Unit = {}
    ): CfnFunction.DeadLetterQueueProperty {
        val builder = CfnFunctionDeadLetterQueuePropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.sam.*;
     * DeploymentPreferenceProperty deploymentPreferenceProperty =
     * DeploymentPreferenceProperty.builder()
     * .alarms(List.of("alarms"))
     * .enabled(false)
     * .hooks(HooksProperty.builder()
     * .postTraffic("postTraffic")
     * .preTraffic("preTraffic")
     * .build())
     * .role("role")
     * .type("type")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-serverless-function-deploymentpreference.html)
     */
    public inline fun cfnFunctionDeploymentPreferenceProperty(
        block: CfnFunctionDeploymentPreferencePropertyDsl.() -> Unit = {}
    ): CfnFunction.DeploymentPreferenceProperty {
        val builder = CfnFunctionDeploymentPreferencePropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.sam.*;
     * DestinationConfigProperty destinationConfigProperty = DestinationConfigProperty.builder()
     * .onFailure(DestinationProperty.builder()
     * .destination("destination")
     * // the properties below are optional
     * .type("type")
     * .build())
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-serverless-function-destinationconfig.html)
     */
    public inline fun cfnFunctionDestinationConfigProperty(
        block: CfnFunctionDestinationConfigPropertyDsl.() -> Unit = {}
    ): CfnFunction.DestinationConfigProperty {
        val builder = CfnFunctionDestinationConfigPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.sam.*;
     * DestinationProperty destinationProperty = DestinationProperty.builder()
     * .destination("destination")
     * // the properties below are optional
     * .type("type")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-serverless-function-destination.html)
     */
    public inline fun cfnFunctionDestinationProperty(
        block: CfnFunctionDestinationPropertyDsl.() -> Unit = {}
    ): CfnFunction.DestinationProperty {
        val builder = CfnFunctionDestinationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.sam.*;
     * DomainSAMPTProperty domainSAMPTProperty = DomainSAMPTProperty.builder()
     * .domainName("domainName")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-serverless-function-domainsampt.html)
     */
    public inline fun cfnFunctionDomainSAMPTProperty(
        block: CfnFunctionDomainSAMPTPropertyDsl.() -> Unit = {}
    ): CfnFunction.DomainSAMPTProperty {
        val builder = CfnFunctionDomainSAMPTPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.sam.*;
     * DynamoDBEventProperty dynamoDBEventProperty = DynamoDBEventProperty.builder()
     * .startingPosition("startingPosition")
     * .stream("stream")
     * // the properties below are optional
     * .batchSize(123)
     * .bisectBatchOnFunctionError(false)
     * .destinationConfig(DestinationConfigProperty.builder()
     * .onFailure(DestinationProperty.builder()
     * .destination("destination")
     * // the properties below are optional
     * .type("type")
     * .build())
     * .build())
     * .enabled(false)
     * .maximumBatchingWindowInSeconds(123)
     * .maximumRecordAgeInSeconds(123)
     * .maximumRetryAttempts(123)
     * .parallelizationFactor(123)
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-serverless-function-dynamodbevent.html)
     */
    public inline fun cfnFunctionDynamoDBEventProperty(
        block: CfnFunctionDynamoDBEventPropertyDsl.() -> Unit = {}
    ): CfnFunction.DynamoDBEventProperty {
        val builder = CfnFunctionDynamoDBEventPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.sam.*;
     * EmptySAMPTProperty emptySAMPTProperty = EmptySAMPTProperty.builder().build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-serverless-function-emptysampt.html)
     */
    public inline fun cfnFunctionEmptySAMPTProperty(
        block: CfnFunctionEmptySAMPTPropertyDsl.() -> Unit = {}
    ): CfnFunction.EmptySAMPTProperty {
        val builder = CfnFunctionEmptySAMPTPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.sam.*;
     * Object pattern;
     * EventBridgeRuleEventProperty eventBridgeRuleEventProperty =
     * EventBridgeRuleEventProperty.builder()
     * .pattern(pattern)
     * // the properties below are optional
     * .eventBusName("eventBusName")
     * .input("input")
     * .inputPath("inputPath")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-serverless-function-eventbridgeruleevent.html)
     */
    public inline fun cfnFunctionEventBridgeRuleEventProperty(
        block: CfnFunctionEventBridgeRuleEventPropertyDsl.() -> Unit = {}
    ): CfnFunction.EventBridgeRuleEventProperty {
        val builder = CfnFunctionEventBridgeRuleEventPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.sam.*;
     * EventInvokeConfigProperty eventInvokeConfigProperty = EventInvokeConfigProperty.builder()
     * .destinationConfig(EventInvokeDestinationConfigProperty.builder()
     * .onFailure(DestinationProperty.builder()
     * .destination("destination")
     * // the properties below are optional
     * .type("type")
     * .build())
     * .onSuccess(DestinationProperty.builder()
     * .destination("destination")
     * // the properties below are optional
     * .type("type")
     * .build())
     * .build())
     * .maximumEventAgeInSeconds(123)
     * .maximumRetryAttempts(123)
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-serverless-function-eventinvokeconfig.html)
     */
    public inline fun cfnFunctionEventInvokeConfigProperty(
        block: CfnFunctionEventInvokeConfigPropertyDsl.() -> Unit = {}
    ): CfnFunction.EventInvokeConfigProperty {
        val builder = CfnFunctionEventInvokeConfigPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.sam.*;
     * EventInvokeDestinationConfigProperty eventInvokeDestinationConfigProperty =
     * EventInvokeDestinationConfigProperty.builder()
     * .onFailure(DestinationProperty.builder()
     * .destination("destination")
     * // the properties below are optional
     * .type("type")
     * .build())
     * .onSuccess(DestinationProperty.builder()
     * .destination("destination")
     * // the properties below are optional
     * .type("type")
     * .build())
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-serverless-function-eventinvokedestinationconfig.html)
     */
    public inline fun cfnFunctionEventInvokeDestinationConfigProperty(
        block: CfnFunctionEventInvokeDestinationConfigPropertyDsl.() -> Unit = {}
    ): CfnFunction.EventInvokeDestinationConfigProperty {
        val builder = CfnFunctionEventInvokeDestinationConfigPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.sam.*;
     * EventSourceProperty eventSourceProperty = EventSourceProperty.builder()
     * .properties(AlexaSkillEventProperty.builder()
     * .variables(Map.of(
     * "variablesKey", "variables"))
     * .build())
     * .type("type")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-serverless-function-eventsource.html)
     */
    public inline fun cfnFunctionEventSourceProperty(
        block: CfnFunctionEventSourcePropertyDsl.() -> Unit = {}
    ): CfnFunction.EventSourceProperty {
        val builder = CfnFunctionEventSourcePropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.sam.*;
     * FileSystemConfigProperty fileSystemConfigProperty = FileSystemConfigProperty.builder()
     * .arn("arn")
     * .localMountPath("localMountPath")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-serverless-function-filesystemconfig.html)
     */
    public inline fun cfnFunctionFileSystemConfigProperty(
        block: CfnFunctionFileSystemConfigPropertyDsl.() -> Unit = {}
    ): CfnFunction.FileSystemConfigProperty {
        val builder = CfnFunctionFileSystemConfigPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.sam.*;
     * FunctionEnvironmentProperty functionEnvironmentProperty = FunctionEnvironmentProperty.builder()
     * .variables(Map.of(
     * "variablesKey", "variables"))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-serverless-function-functionenvironment.html)
     */
    public inline fun cfnFunctionFunctionEnvironmentProperty(
        block: CfnFunctionFunctionEnvironmentPropertyDsl.() -> Unit = {}
    ): CfnFunction.FunctionEnvironmentProperty {
        val builder = CfnFunctionFunctionEnvironmentPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.sam.*;
     * FunctionSAMPTProperty functionSAMPTProperty = FunctionSAMPTProperty.builder()
     * .functionName("functionName")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-serverless-function-functionsampt.html)
     */
    public inline fun cfnFunctionFunctionSAMPTProperty(
        block: CfnFunctionFunctionSAMPTPropertyDsl.() -> Unit = {}
    ): CfnFunction.FunctionSAMPTProperty {
        val builder = CfnFunctionFunctionSAMPTPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.sam.*;
     * HooksProperty hooksProperty = HooksProperty.builder()
     * .postTraffic("postTraffic")
     * .preTraffic("preTraffic")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-serverless-function-hooks.html)
     */
    public inline fun cfnFunctionHooksProperty(
        block: CfnFunctionHooksPropertyDsl.() -> Unit = {}
    ): CfnFunction.HooksProperty {
        val builder = CfnFunctionHooksPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.sam.*;
     * HttpApiEventProperty httpApiEventProperty = HttpApiEventProperty.builder()
     * .apiId("apiId")
     * .auth(HttpApiFunctionAuthProperty.builder()
     * .authorizationScopes(List.of("authorizationScopes"))
     * .authorizer("authorizer")
     * .build())
     * .method("method")
     * .path("path")
     * .payloadFormatVersion("payloadFormatVersion")
     * .routeSettings(RouteSettingsProperty.builder()
     * .dataTraceEnabled(false)
     * .detailedMetricsEnabled(false)
     * .loggingLevel("loggingLevel")
     * .throttlingBurstLimit(123)
     * .throttlingRateLimit(123)
     * .build())
     * .timeoutInMillis(123)
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-serverless-function-httpapievent.html)
     */
    public inline fun cfnFunctionHttpApiEventProperty(
        block: CfnFunctionHttpApiEventPropertyDsl.() -> Unit = {}
    ): CfnFunction.HttpApiEventProperty {
        val builder = CfnFunctionHttpApiEventPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.sam.*;
     * HttpApiFunctionAuthProperty httpApiFunctionAuthProperty = HttpApiFunctionAuthProperty.builder()
     * .authorizationScopes(List.of("authorizationScopes"))
     * .authorizer("authorizer")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-serverless-function-httpapifunctionauth.html)
     */
    public inline fun cfnFunctionHttpApiFunctionAuthProperty(
        block: CfnFunctionHttpApiFunctionAuthPropertyDsl.() -> Unit = {}
    ): CfnFunction.HttpApiFunctionAuthProperty {
        val builder = CfnFunctionHttpApiFunctionAuthPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.sam.*;
     * Object statement;
     * IAMPolicyDocumentProperty iAMPolicyDocumentProperty = Map.of(
     * "statement", statement,
     * // the properties below are optional
     * "version", "version");
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-serverless-function-iampolicydocument.html)
     */
    public inline fun cfnFunctionIAMPolicyDocumentProperty(
        block: CfnFunctionIAMPolicyDocumentPropertyDsl.() -> Unit = {}
    ): CfnFunction.IAMPolicyDocumentProperty {
        val builder = CfnFunctionIAMPolicyDocumentPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.sam.*;
     * IdentitySAMPTProperty identitySAMPTProperty = IdentitySAMPTProperty.builder()
     * .identityName("identityName")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-serverless-function-identitysampt.html)
     */
    public inline fun cfnFunctionIdentitySAMPTProperty(
        block: CfnFunctionIdentitySAMPTPropertyDsl.() -> Unit = {}
    ): CfnFunction.IdentitySAMPTProperty {
        val builder = CfnFunctionIdentitySAMPTPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.sam.*;
     * ImageConfigProperty imageConfigProperty = ImageConfigProperty.builder()
     * .command(List.of("command"))
     * .entryPoint(List.of("entryPoint"))
     * .workingDirectory("workingDirectory")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-serverless-function-imageconfig.html)
     */
    public inline fun cfnFunctionImageConfigProperty(
        block: CfnFunctionImageConfigPropertyDsl.() -> Unit = {}
    ): CfnFunction.ImageConfigProperty {
        val builder = CfnFunctionImageConfigPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.sam.*;
     * IoTRuleEventProperty ioTRuleEventProperty = IoTRuleEventProperty.builder()
     * .sql("sql")
     * // the properties below are optional
     * .awsIotSqlVersion("awsIotSqlVersion")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-serverless-function-iotruleevent.html)
     */
    public inline fun cfnFunctionIoTRuleEventProperty(
        block: CfnFunctionIoTRuleEventPropertyDsl.() -> Unit = {}
    ): CfnFunction.IoTRuleEventProperty {
        val builder = CfnFunctionIoTRuleEventPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.sam.*;
     * KeySAMPTProperty keySAMPTProperty = KeySAMPTProperty.builder()
     * .keyId("keyId")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-serverless-function-keysampt.html)
     */
    public inline fun cfnFunctionKeySAMPTProperty(
        block: CfnFunctionKeySAMPTPropertyDsl.() -> Unit = {}
    ): CfnFunction.KeySAMPTProperty {
        val builder = CfnFunctionKeySAMPTPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.sam.*;
     * KinesisEventProperty kinesisEventProperty = KinesisEventProperty.builder()
     * .startingPosition("startingPosition")
     * .stream("stream")
     * // the properties below are optional
     * .batchSize(123)
     * .enabled(false)
     * .functionResponseTypes(List.of("functionResponseTypes"))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-serverless-function-kinesisevent.html)
     */
    public inline fun cfnFunctionKinesisEventProperty(
        block: CfnFunctionKinesisEventPropertyDsl.() -> Unit = {}
    ): CfnFunction.KinesisEventProperty {
        val builder = CfnFunctionKinesisEventPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.sam.*;
     * LogGroupSAMPTProperty logGroupSAMPTProperty = LogGroupSAMPTProperty.builder()
     * .logGroupName("logGroupName")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-serverless-function-loggroupsampt.html)
     */
    public inline fun cfnFunctionLogGroupSAMPTProperty(
        block: CfnFunctionLogGroupSAMPTPropertyDsl.() -> Unit = {}
    ): CfnFunction.LogGroupSAMPTProperty {
        val builder = CfnFunctionLogGroupSAMPTPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.sam.*;
     * ParameterNameSAMPTProperty parameterNameSAMPTProperty = ParameterNameSAMPTProperty.builder()
     * .parameterName("parameterName")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-serverless-function-parameternamesampt.html)
     */
    public inline fun cfnFunctionParameterNameSAMPTProperty(
        block: CfnFunctionParameterNameSAMPTPropertyDsl.() -> Unit = {}
    ): CfnFunction.ParameterNameSAMPTProperty {
        val builder = CfnFunctionParameterNameSAMPTPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnFunction`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.sam.*;
     * Object assumeRolePolicyDocument;
     * CfnFunctionProps cfnFunctionProps = CfnFunctionProps.builder()
     * .architectures(List.of("architectures"))
     * .assumeRolePolicyDocument(assumeRolePolicyDocument)
     * .autoPublishAlias("autoPublishAlias")
     * .autoPublishCodeSha256("autoPublishCodeSha256")
     * .codeSigningConfigArn("codeSigningConfigArn")
     * .codeUri("codeUri")
     * .deadLetterQueue(DeadLetterQueueProperty.builder()
     * .targetArn("targetArn")
     * .type("type")
     * .build())
     * .deploymentPreference(DeploymentPreferenceProperty.builder()
     * .alarms(List.of("alarms"))
     * .enabled(false)
     * .hooks(HooksProperty.builder()
     * .postTraffic("postTraffic")
     * .preTraffic("preTraffic")
     * .build())
     * .role("role")
     * .type("type")
     * .build())
     * .description("description")
     * .environment(FunctionEnvironmentProperty.builder()
     * .variables(Map.of(
     * "variablesKey", "variables"))
     * .build())
     * .eventInvokeConfig(EventInvokeConfigProperty.builder()
     * .destinationConfig(EventInvokeDestinationConfigProperty.builder()
     * .onFailure(DestinationProperty.builder()
     * .destination("destination")
     * // the properties below are optional
     * .type("type")
     * .build())
     * .onSuccess(DestinationProperty.builder()
     * .destination("destination")
     * // the properties below are optional
     * .type("type")
     * .build())
     * .build())
     * .maximumEventAgeInSeconds(123)
     * .maximumRetryAttempts(123)
     * .build())
     * .events(Map.of(
     * "eventsKey", EventSourceProperty.builder()
     * .properties(AlexaSkillEventProperty.builder()
     * .variables(Map.of(
     * "variablesKey", "variables"))
     * .build())
     * .type("type")
     * .build()))
     * .fileSystemConfigs(List.of(FileSystemConfigProperty.builder()
     * .arn("arn")
     * .localMountPath("localMountPath")
     * .build()))
     * .functionName("functionName")
     * .handler("handler")
     * .imageConfig(ImageConfigProperty.builder()
     * .command(List.of("command"))
     * .entryPoint(List.of("entryPoint"))
     * .workingDirectory("workingDirectory")
     * .build())
     * .imageUri("imageUri")
     * .inlineCode("inlineCode")
     * .kmsKeyArn("kmsKeyArn")
     * .layers(List.of("layers"))
     * .memorySize(123)
     * .packageType("packageType")
     * .permissionsBoundary("permissionsBoundary")
     * .policies("policies")
     * .provisionedConcurrencyConfig(ProvisionedConcurrencyConfigProperty.builder()
     * .provisionedConcurrentExecutions("provisionedConcurrentExecutions")
     * .build())
     * .reservedConcurrentExecutions(123)
     * .role("role")
     * .runtime("runtime")
     * .tags(Map.of(
     * "tagsKey", "tags"))
     * .timeout(123)
     * .tracing("tracing")
     * .versionDescription("versionDescription")
     * .vpcConfig(VpcConfigProperty.builder()
     * .securityGroupIds(List.of("securityGroupIds"))
     * .subnetIds(List.of("subnetIds"))
     * .build())
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-serverless-function.html)
     */
    public inline fun cfnFunctionProps(
        block: CfnFunctionPropsDsl.() -> Unit = {}
    ): CfnFunctionProps {
        val builder = CfnFunctionPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.sam.*;
     * ProvisionedConcurrencyConfigProperty provisionedConcurrencyConfigProperty =
     * ProvisionedConcurrencyConfigProperty.builder()
     * .provisionedConcurrentExecutions("provisionedConcurrentExecutions")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-serverless-function-provisionedconcurrencyconfig.html)
     */
    public inline fun cfnFunctionProvisionedConcurrencyConfigProperty(
        block: CfnFunctionProvisionedConcurrencyConfigPropertyDsl.() -> Unit = {}
    ): CfnFunction.ProvisionedConcurrencyConfigProperty {
        val builder = CfnFunctionProvisionedConcurrencyConfigPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.sam.*;
     * QueueSAMPTProperty queueSAMPTProperty = QueueSAMPTProperty.builder()
     * .queueName("queueName")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-serverless-function-queuesampt.html)
     */
    public inline fun cfnFunctionQueueSAMPTProperty(
        block: CfnFunctionQueueSAMPTPropertyDsl.() -> Unit = {}
    ): CfnFunction.QueueSAMPTProperty {
        val builder = CfnFunctionQueueSAMPTPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.sam.*;
     * RequestModelProperty requestModelProperty = RequestModelProperty.builder()
     * .model("model")
     * // the properties below are optional
     * .required(false)
     * .validateBody(false)
     * .validateParameters(false)
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-serverless-function-requestmodel.html)
     */
    public inline fun cfnFunctionRequestModelProperty(
        block: CfnFunctionRequestModelPropertyDsl.() -> Unit = {}
    ): CfnFunction.RequestModelProperty {
        val builder = CfnFunctionRequestModelPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.sam.*;
     * RequestParameterProperty requestParameterProperty = RequestParameterProperty.builder()
     * .caching(false)
     * .required(false)
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-serverless-function-requestparameter.html)
     */
    public inline fun cfnFunctionRequestParameterProperty(
        block: CfnFunctionRequestParameterPropertyDsl.() -> Unit = {}
    ): CfnFunction.RequestParameterProperty {
        val builder = CfnFunctionRequestParameterPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.sam.*;
     * RouteSettingsProperty routeSettingsProperty = RouteSettingsProperty.builder()
     * .dataTraceEnabled(false)
     * .detailedMetricsEnabled(false)
     * .loggingLevel("loggingLevel")
     * .throttlingBurstLimit(123)
     * .throttlingRateLimit(123)
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-serverless-function-routesettings.html)
     */
    public inline fun cfnFunctionRouteSettingsProperty(
        block: CfnFunctionRouteSettingsPropertyDsl.() -> Unit = {}
    ): CfnFunction.RouteSettingsProperty {
        val builder = CfnFunctionRouteSettingsPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.sam.*;
     * S3EventProperty s3EventProperty = S3EventProperty.builder()
     * .bucket("bucket")
     * .events("events")
     * // the properties below are optional
     * .filter(S3NotificationFilterProperty.builder()
     * .s3Key(S3KeyFilterProperty.builder()
     * .rules(List.of(S3KeyFilterRuleProperty.builder()
     * .name("name")
     * .value("value")
     * .build()))
     * .build())
     * .build())
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-serverless-function-s3event.html)
     */
    public inline fun cfnFunctionS3EventProperty(
        block: CfnFunctionS3EventPropertyDsl.() -> Unit = {}
    ): CfnFunction.S3EventProperty {
        val builder = CfnFunctionS3EventPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.sam.*;
     * S3KeyFilterProperty s3KeyFilterProperty = S3KeyFilterProperty.builder()
     * .rules(List.of(S3KeyFilterRuleProperty.builder()
     * .name("name")
     * .value("value")
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-serverless-function-s3keyfilter.html)
     */
    public inline fun cfnFunctionS3KeyFilterProperty(
        block: CfnFunctionS3KeyFilterPropertyDsl.() -> Unit = {}
    ): CfnFunction.S3KeyFilterProperty {
        val builder = CfnFunctionS3KeyFilterPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.sam.*;
     * S3KeyFilterRuleProperty s3KeyFilterRuleProperty = S3KeyFilterRuleProperty.builder()
     * .name("name")
     * .value("value")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-serverless-function-s3keyfilterrule.html)
     */
    public inline fun cfnFunctionS3KeyFilterRuleProperty(
        block: CfnFunctionS3KeyFilterRulePropertyDsl.() -> Unit = {}
    ): CfnFunction.S3KeyFilterRuleProperty {
        val builder = CfnFunctionS3KeyFilterRulePropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.sam.*;
     * S3LocationProperty s3LocationProperty = S3LocationProperty.builder()
     * .bucket("bucket")
     * .key("key")
     * // the properties below are optional
     * .version(123)
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-serverless-function-s3location.html)
     */
    public inline fun cfnFunctionS3LocationProperty(
        block: CfnFunctionS3LocationPropertyDsl.() -> Unit = {}
    ): CfnFunction.S3LocationProperty {
        val builder = CfnFunctionS3LocationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.sam.*;
     * S3NotificationFilterProperty s3NotificationFilterProperty =
     * S3NotificationFilterProperty.builder()
     * .s3Key(S3KeyFilterProperty.builder()
     * .rules(List.of(S3KeyFilterRuleProperty.builder()
     * .name("name")
     * .value("value")
     * .build()))
     * .build())
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-serverless-function-s3notificationfilter.html)
     */
    public inline fun cfnFunctionS3NotificationFilterProperty(
        block: CfnFunctionS3NotificationFilterPropertyDsl.() -> Unit = {}
    ): CfnFunction.S3NotificationFilterProperty {
        val builder = CfnFunctionS3NotificationFilterPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.sam.*;
     * SAMPolicyTemplateProperty sAMPolicyTemplateProperty = SAMPolicyTemplateProperty.builder()
     * .amiDescribePolicy(EmptySAMPTProperty.builder().build())
     * .awsSecretsManagerGetSecretValuePolicy(SecretArnSAMPTProperty.builder()
     * .secretArn("secretArn")
     * .build())
     * .cloudFormationDescribeStacksPolicy(EmptySAMPTProperty.builder().build())
     * .cloudWatchPutMetricPolicy(EmptySAMPTProperty.builder().build())
     * .dynamoDbCrudPolicy(TableSAMPTProperty.builder()
     * .tableName("tableName")
     * .build())
     * .dynamoDbReadPolicy(TableSAMPTProperty.builder()
     * .tableName("tableName")
     * .build())
     * .dynamoDbStreamReadPolicy(TableStreamSAMPTProperty.builder()
     * .streamName("streamName")
     * .tableName("tableName")
     * .build())
     * .dynamoDbWritePolicy(TableSAMPTProperty.builder()
     * .tableName("tableName")
     * .build())
     * .ec2DescribePolicy(EmptySAMPTProperty.builder().build())
     * .elasticsearchHttpPostPolicy(DomainSAMPTProperty.builder()
     * .domainName("domainName")
     * .build())
     * .filterLogEventsPolicy(LogGroupSAMPTProperty.builder()
     * .logGroupName("logGroupName")
     * .build())
     * .kinesisCrudPolicy(StreamSAMPTProperty.builder()
     * .streamName("streamName")
     * .build())
     * .kinesisStreamReadPolicy(StreamSAMPTProperty.builder()
     * .streamName("streamName")
     * .build())
     * .kmsDecryptPolicy(KeySAMPTProperty.builder()
     * .keyId("keyId")
     * .build())
     * .lambdaInvokePolicy(FunctionSAMPTProperty.builder()
     * .functionName("functionName")
     * .build())
     * .rekognitionDetectOnlyPolicy(EmptySAMPTProperty.builder().build())
     * .rekognitionLabelsPolicy(EmptySAMPTProperty.builder().build())
     * .rekognitionNoDataAccessPolicy(CollectionSAMPTProperty.builder()
     * .collectionId("collectionId")
     * .build())
     * .rekognitionReadPolicy(CollectionSAMPTProperty.builder()
     * .collectionId("collectionId")
     * .build())
     * .rekognitionWriteOnlyAccessPolicy(CollectionSAMPTProperty.builder()
     * .collectionId("collectionId")
     * .build())
     * .s3CrudPolicy(BucketSAMPTProperty.builder()
     * .bucketName("bucketName")
     * .build())
     * .s3ReadPolicy(BucketSAMPTProperty.builder()
     * .bucketName("bucketName")
     * .build())
     * .s3WritePolicy(BucketSAMPTProperty.builder()
     * .bucketName("bucketName")
     * .build())
     * .sesBulkTemplatedCrudPolicy(IdentitySAMPTProperty.builder()
     * .identityName("identityName")
     * .build())
     * .sesCrudPolicy(IdentitySAMPTProperty.builder()
     * .identityName("identityName")
     * .build())
     * .sesEmailTemplateCrudPolicy(EmptySAMPTProperty.builder().build())
     * .sesSendBouncePolicy(IdentitySAMPTProperty.builder()
     * .identityName("identityName")
     * .build())
     * .snsCrudPolicy(TopicSAMPTProperty.builder()
     * .topicName("topicName")
     * .build())
     * .snsPublishMessagePolicy(TopicSAMPTProperty.builder()
     * .topicName("topicName")
     * .build())
     * .sqsPollerPolicy(QueueSAMPTProperty.builder()
     * .queueName("queueName")
     * .build())
     * .sqsSendMessagePolicy(QueueSAMPTProperty.builder()
     * .queueName("queueName")
     * .build())
     * .ssmParameterReadPolicy(ParameterNameSAMPTProperty.builder()
     * .parameterName("parameterName")
     * .build())
     * .stepFunctionsExecutionPolicy(StateMachineSAMPTProperty.builder()
     * .stateMachineName("stateMachineName")
     * .build())
     * .vpcAccessPolicy(EmptySAMPTProperty.builder().build())
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-serverless-function-sampolicytemplate.html)
     */
    public inline fun cfnFunctionSAMPolicyTemplateProperty(
        block: CfnFunctionSAMPolicyTemplatePropertyDsl.() -> Unit = {}
    ): CfnFunction.SAMPolicyTemplateProperty {
        val builder = CfnFunctionSAMPolicyTemplatePropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.sam.*;
     * SNSEventProperty sNSEventProperty = SNSEventProperty.builder()
     * .topic("topic")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-serverless-function-snsevent.html)
     */
    public inline fun cfnFunctionSNSEventProperty(
        block: CfnFunctionSNSEventPropertyDsl.() -> Unit = {}
    ): CfnFunction.SNSEventProperty {
        val builder = CfnFunctionSNSEventPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.sam.*;
     * SQSEventProperty sQSEventProperty = SQSEventProperty.builder()
     * .queue("queue")
     * // the properties below are optional
     * .batchSize(123)
     * .enabled(false)
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-serverless-function-sqsevent.html)
     */
    public inline fun cfnFunctionSQSEventProperty(
        block: CfnFunctionSQSEventPropertyDsl.() -> Unit = {}
    ): CfnFunction.SQSEventProperty {
        val builder = CfnFunctionSQSEventPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.sam.*;
     * ScheduleEventProperty scheduleEventProperty = ScheduleEventProperty.builder()
     * .schedule("schedule")
     * // the properties below are optional
     * .description("description")
     * .enabled(false)
     * .input("input")
     * .name("name")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-serverless-function-scheduleevent.html)
     */
    public inline fun cfnFunctionScheduleEventProperty(
        block: CfnFunctionScheduleEventPropertyDsl.() -> Unit = {}
    ): CfnFunction.ScheduleEventProperty {
        val builder = CfnFunctionScheduleEventPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.sam.*;
     * SecretArnSAMPTProperty secretArnSAMPTProperty = SecretArnSAMPTProperty.builder()
     * .secretArn("secretArn")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-serverless-function-secretarnsampt.html)
     */
    public inline fun cfnFunctionSecretArnSAMPTProperty(
        block: CfnFunctionSecretArnSAMPTPropertyDsl.() -> Unit = {}
    ): CfnFunction.SecretArnSAMPTProperty {
        val builder = CfnFunctionSecretArnSAMPTPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.sam.*;
     * StateMachineSAMPTProperty stateMachineSAMPTProperty = StateMachineSAMPTProperty.builder()
     * .stateMachineName("stateMachineName")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-serverless-function-statemachinesampt.html)
     */
    public inline fun cfnFunctionStateMachineSAMPTProperty(
        block: CfnFunctionStateMachineSAMPTPropertyDsl.() -> Unit = {}
    ): CfnFunction.StateMachineSAMPTProperty {
        val builder = CfnFunctionStateMachineSAMPTPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.sam.*;
     * StreamSAMPTProperty streamSAMPTProperty = StreamSAMPTProperty.builder()
     * .streamName("streamName")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-serverless-function-streamsampt.html)
     */
    public inline fun cfnFunctionStreamSAMPTProperty(
        block: CfnFunctionStreamSAMPTPropertyDsl.() -> Unit = {}
    ): CfnFunction.StreamSAMPTProperty {
        val builder = CfnFunctionStreamSAMPTPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.sam.*;
     * TableSAMPTProperty tableSAMPTProperty = TableSAMPTProperty.builder()
     * .tableName("tableName")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-serverless-function-tablesampt.html)
     */
    public inline fun cfnFunctionTableSAMPTProperty(
        block: CfnFunctionTableSAMPTPropertyDsl.() -> Unit = {}
    ): CfnFunction.TableSAMPTProperty {
        val builder = CfnFunctionTableSAMPTPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.sam.*;
     * TableStreamSAMPTProperty tableStreamSAMPTProperty = TableStreamSAMPTProperty.builder()
     * .streamName("streamName")
     * .tableName("tableName")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-serverless-function-tablestreamsampt.html)
     */
    public inline fun cfnFunctionTableStreamSAMPTProperty(
        block: CfnFunctionTableStreamSAMPTPropertyDsl.() -> Unit = {}
    ): CfnFunction.TableStreamSAMPTProperty {
        val builder = CfnFunctionTableStreamSAMPTPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.sam.*;
     * TopicSAMPTProperty topicSAMPTProperty = TopicSAMPTProperty.builder()
     * .topicName("topicName")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-serverless-function-topicsampt.html)
     */
    public inline fun cfnFunctionTopicSAMPTProperty(
        block: CfnFunctionTopicSAMPTPropertyDsl.() -> Unit = {}
    ): CfnFunction.TopicSAMPTProperty {
        val builder = CfnFunctionTopicSAMPTPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.sam.*;
     * VpcConfigProperty vpcConfigProperty = VpcConfigProperty.builder()
     * .securityGroupIds(List.of("securityGroupIds"))
     * .subnetIds(List.of("subnetIds"))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-serverless-function-vpcconfig.html)
     */
    public inline fun cfnFunctionVpcConfigProperty(
        block: CfnFunctionVpcConfigPropertyDsl.() -> Unit = {}
    ): CfnFunction.VpcConfigProperty {
        val builder = CfnFunctionVpcConfigPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Definition of AWS::Serverless::HttpApi.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.sam.*;
     * Object authorizers;
     * Object definitionBody;
     * CfnHttpApi cfnHttpApi = CfnHttpApi.Builder.create(this, "MyCfnHttpApi")
     * .accessLogSetting(AccessLogSettingProperty.builder()
     * .destinationArn("destinationArn")
     * .format("format")
     * .build())
     * .auth(HttpApiAuthProperty.builder()
     * .authorizers(authorizers)
     * .defaultAuthorizer("defaultAuthorizer")
     * .build())
     * .corsConfiguration(false)
     * .defaultRouteSettings(RouteSettingsProperty.builder()
     * .dataTraceEnabled(false)
     * .detailedMetricsEnabled(false)
     * .loggingLevel("loggingLevel")
     * .throttlingBurstLimit(123)
     * .throttlingRateLimit(123)
     * .build())
     * .definitionBody(definitionBody)
     * .definitionUri("definitionUri")
     * .description("description")
     * .disableExecuteApiEndpoint(false)
     * .domain(HttpApiDomainConfigurationProperty.builder()
     * .certificateArn("certificateArn")
     * .domainName("domainName")
     * // the properties below are optional
     * .basePath("basePath")
     * .endpointConfiguration("endpointConfiguration")
     * .mutualTlsAuthentication(MutualTlsAuthenticationProperty.builder()
     * .truststoreUri("truststoreUri")
     * .truststoreVersion(false)
     * .build())
     * .route53(Route53ConfigurationProperty.builder()
     * .distributedDomainName("distributedDomainName")
     * .evaluateTargetHealth(false)
     * .hostedZoneId("hostedZoneId")
     * .hostedZoneName("hostedZoneName")
     * .ipV6(false)
     * .build())
     * .securityPolicy("securityPolicy")
     * .build())
     * .failOnWarnings(false)
     * .routeSettings(RouteSettingsProperty.builder()
     * .dataTraceEnabled(false)
     * .detailedMetricsEnabled(false)
     * .loggingLevel("loggingLevel")
     * .throttlingBurstLimit(123)
     * .throttlingRateLimit(123)
     * .build())
     * .stageName("stageName")
     * .stageVariables(Map.of(
     * "stageVariablesKey", "stageVariables"))
     * .tags(Map.of(
     * "tagsKey", "tags"))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-serverless-httpapi.html)
     */
    public inline fun cfnHttpApi(
        scope: Construct,
        id: String,
        block: CfnHttpApiDsl.() -> Unit = {},
    ): CfnHttpApi {
        val builder = CfnHttpApiDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.sam.*;
     * AccessLogSettingProperty accessLogSettingProperty = AccessLogSettingProperty.builder()
     * .destinationArn("destinationArn")
     * .format("format")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-serverless-httpapi-accesslogsetting.html)
     */
    public inline fun cfnHttpApiAccessLogSettingProperty(
        block: CfnHttpApiAccessLogSettingPropertyDsl.() -> Unit = {}
    ): CfnHttpApi.AccessLogSettingProperty {
        val builder = CfnHttpApiAccessLogSettingPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.sam.*;
     * CorsConfigurationObjectProperty corsConfigurationObjectProperty =
     * CorsConfigurationObjectProperty.builder()
     * .allowCredentials(false)
     * .allowHeaders(List.of("allowHeaders"))
     * .allowMethods(List.of("allowMethods"))
     * .allowOrigins(List.of("allowOrigins"))
     * .exposeHeaders(List.of("exposeHeaders"))
     * .maxAge(123)
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-serverless-httpapi-corsconfigurationobject.html)
     */
    public inline fun cfnHttpApiCorsConfigurationObjectProperty(
        block: CfnHttpApiCorsConfigurationObjectPropertyDsl.() -> Unit = {}
    ): CfnHttpApi.CorsConfigurationObjectProperty {
        val builder = CfnHttpApiCorsConfigurationObjectPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.sam.*;
     * Object authorizers;
     * HttpApiAuthProperty httpApiAuthProperty = HttpApiAuthProperty.builder()
     * .authorizers(authorizers)
     * .defaultAuthorizer("defaultAuthorizer")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-serverless-httpapi-httpapiauth.html)
     */
    public inline fun cfnHttpApiHttpApiAuthProperty(
        block: CfnHttpApiHttpApiAuthPropertyDsl.() -> Unit = {}
    ): CfnHttpApi.HttpApiAuthProperty {
        val builder = CfnHttpApiHttpApiAuthPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.sam.*;
     * HttpApiDomainConfigurationProperty httpApiDomainConfigurationProperty =
     * HttpApiDomainConfigurationProperty.builder()
     * .certificateArn("certificateArn")
     * .domainName("domainName")
     * // the properties below are optional
     * .basePath("basePath")
     * .endpointConfiguration("endpointConfiguration")
     * .mutualTlsAuthentication(MutualTlsAuthenticationProperty.builder()
     * .truststoreUri("truststoreUri")
     * .truststoreVersion(false)
     * .build())
     * .route53(Route53ConfigurationProperty.builder()
     * .distributedDomainName("distributedDomainName")
     * .evaluateTargetHealth(false)
     * .hostedZoneId("hostedZoneId")
     * .hostedZoneName("hostedZoneName")
     * .ipV6(false)
     * .build())
     * .securityPolicy("securityPolicy")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-serverless-httpapi-httpapidomainconfiguration.html)
     */
    public inline fun cfnHttpApiHttpApiDomainConfigurationProperty(
        block: CfnHttpApiHttpApiDomainConfigurationPropertyDsl.() -> Unit = {}
    ): CfnHttpApi.HttpApiDomainConfigurationProperty {
        val builder = CfnHttpApiHttpApiDomainConfigurationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.sam.*;
     * MutualTlsAuthenticationProperty mutualTlsAuthenticationProperty =
     * MutualTlsAuthenticationProperty.builder()
     * .truststoreUri("truststoreUri")
     * .truststoreVersion(false)
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-serverless-httpapi-mutualtlsauthentication.html)
     */
    public inline fun cfnHttpApiMutualTlsAuthenticationProperty(
        block: CfnHttpApiMutualTlsAuthenticationPropertyDsl.() -> Unit = {}
    ): CfnHttpApi.MutualTlsAuthenticationProperty {
        val builder = CfnHttpApiMutualTlsAuthenticationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnHttpApi`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.sam.*;
     * Object authorizers;
     * Object definitionBody;
     * CfnHttpApiProps cfnHttpApiProps = CfnHttpApiProps.builder()
     * .accessLogSetting(AccessLogSettingProperty.builder()
     * .destinationArn("destinationArn")
     * .format("format")
     * .build())
     * .auth(HttpApiAuthProperty.builder()
     * .authorizers(authorizers)
     * .defaultAuthorizer("defaultAuthorizer")
     * .build())
     * .corsConfiguration(false)
     * .defaultRouteSettings(RouteSettingsProperty.builder()
     * .dataTraceEnabled(false)
     * .detailedMetricsEnabled(false)
     * .loggingLevel("loggingLevel")
     * .throttlingBurstLimit(123)
     * .throttlingRateLimit(123)
     * .build())
     * .definitionBody(definitionBody)
     * .definitionUri("definitionUri")
     * .description("description")
     * .disableExecuteApiEndpoint(false)
     * .domain(HttpApiDomainConfigurationProperty.builder()
     * .certificateArn("certificateArn")
     * .domainName("domainName")
     * // the properties below are optional
     * .basePath("basePath")
     * .endpointConfiguration("endpointConfiguration")
     * .mutualTlsAuthentication(MutualTlsAuthenticationProperty.builder()
     * .truststoreUri("truststoreUri")
     * .truststoreVersion(false)
     * .build())
     * .route53(Route53ConfigurationProperty.builder()
     * .distributedDomainName("distributedDomainName")
     * .evaluateTargetHealth(false)
     * .hostedZoneId("hostedZoneId")
     * .hostedZoneName("hostedZoneName")
     * .ipV6(false)
     * .build())
     * .securityPolicy("securityPolicy")
     * .build())
     * .failOnWarnings(false)
     * .routeSettings(RouteSettingsProperty.builder()
     * .dataTraceEnabled(false)
     * .detailedMetricsEnabled(false)
     * .loggingLevel("loggingLevel")
     * .throttlingBurstLimit(123)
     * .throttlingRateLimit(123)
     * .build())
     * .stageName("stageName")
     * .stageVariables(Map.of(
     * "stageVariablesKey", "stageVariables"))
     * .tags(Map.of(
     * "tagsKey", "tags"))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-serverless-httpapi.html)
     */
    public inline fun cfnHttpApiProps(block: CfnHttpApiPropsDsl.() -> Unit = {}): CfnHttpApiProps {
        val builder = CfnHttpApiPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.sam.*;
     * Route53ConfigurationProperty route53ConfigurationProperty =
     * Route53ConfigurationProperty.builder()
     * .distributedDomainName("distributedDomainName")
     * .evaluateTargetHealth(false)
     * .hostedZoneId("hostedZoneId")
     * .hostedZoneName("hostedZoneName")
     * .ipV6(false)
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-serverless-httpapi-route53configuration.html)
     */
    public inline fun cfnHttpApiRoute53ConfigurationProperty(
        block: CfnHttpApiRoute53ConfigurationPropertyDsl.() -> Unit = {}
    ): CfnHttpApi.Route53ConfigurationProperty {
        val builder = CfnHttpApiRoute53ConfigurationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.sam.*;
     * RouteSettingsProperty routeSettingsProperty = RouteSettingsProperty.builder()
     * .dataTraceEnabled(false)
     * .detailedMetricsEnabled(false)
     * .loggingLevel("loggingLevel")
     * .throttlingBurstLimit(123)
     * .throttlingRateLimit(123)
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-serverless-httpapi-routesettings.html)
     */
    public inline fun cfnHttpApiRouteSettingsProperty(
        block: CfnHttpApiRouteSettingsPropertyDsl.() -> Unit = {}
    ): CfnHttpApi.RouteSettingsProperty {
        val builder = CfnHttpApiRouteSettingsPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.sam.*;
     * S3LocationProperty s3LocationProperty = S3LocationProperty.builder()
     * .bucket("bucket")
     * .key("key")
     * .version(123)
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-serverless-httpapi-s3location.html)
     */
    public inline fun cfnHttpApiS3LocationProperty(
        block: CfnHttpApiS3LocationPropertyDsl.() -> Unit = {}
    ): CfnHttpApi.S3LocationProperty {
        val builder = CfnHttpApiS3LocationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Definition of AWS::Serverless::LayerVersion.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.sam.*;
     * CfnLayerVersion cfnLayerVersion = CfnLayerVersion.Builder.create(this, "MyCfnLayerVersion")
     * .compatibleRuntimes(List.of("compatibleRuntimes"))
     * .contentUri("contentUri")
     * .description("description")
     * .layerName("layerName")
     * .licenseInfo("licenseInfo")
     * .retentionPolicy("retentionPolicy")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-serverless-layerversion.html)
     */
    public inline fun cfnLayerVersion(
        scope: Construct,
        id: String,
        block: CfnLayerVersionDsl.() -> Unit = {},
    ): CfnLayerVersion {
        val builder = CfnLayerVersionDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnLayerVersion`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.sam.*;
     * CfnLayerVersionProps cfnLayerVersionProps = CfnLayerVersionProps.builder()
     * .compatibleRuntimes(List.of("compatibleRuntimes"))
     * .contentUri("contentUri")
     * .description("description")
     * .layerName("layerName")
     * .licenseInfo("licenseInfo")
     * .retentionPolicy("retentionPolicy")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-serverless-layerversion.html)
     */
    public inline fun cfnLayerVersionProps(
        block: CfnLayerVersionPropsDsl.() -> Unit = {}
    ): CfnLayerVersionProps {
        val builder = CfnLayerVersionPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.sam.*;
     * S3LocationProperty s3LocationProperty = S3LocationProperty.builder()
     * .bucket("bucket")
     * .key("key")
     * // the properties below are optional
     * .version(123)
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-serverless-layerversion-s3location.html)
     */
    public inline fun cfnLayerVersionS3LocationProperty(
        block: CfnLayerVersionS3LocationPropertyDsl.() -> Unit = {}
    ): CfnLayerVersion.S3LocationProperty {
        val builder = CfnLayerVersionS3LocationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Definition of AWS::Serverless::SimpleTable.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.sam.*;
     * CfnSimpleTable cfnSimpleTable = CfnSimpleTable.Builder.create(this, "MyCfnSimpleTable")
     * .primaryKey(PrimaryKeyProperty.builder()
     * .type("type")
     * // the properties below are optional
     * .name("name")
     * .build())
     * .provisionedThroughput(ProvisionedThroughputProperty.builder()
     * .writeCapacityUnits(123)
     * // the properties below are optional
     * .readCapacityUnits(123)
     * .build())
     * .sseSpecification(SSESpecificationProperty.builder()
     * .sseEnabled(false)
     * .build())
     * .tableName("tableName")
     * .tags(Map.of(
     * "tagsKey", "tags"))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-serverless-simpletable.html)
     */
    public inline fun cfnSimpleTable(
        scope: Construct,
        id: String,
        block: CfnSimpleTableDsl.() -> Unit = {},
    ): CfnSimpleTable {
        val builder = CfnSimpleTableDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.sam.*;
     * PrimaryKeyProperty primaryKeyProperty = PrimaryKeyProperty.builder()
     * .type("type")
     * // the properties below are optional
     * .name("name")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-serverless-simpletable-primarykey.html)
     */
    public inline fun cfnSimpleTablePrimaryKeyProperty(
        block: CfnSimpleTablePrimaryKeyPropertyDsl.() -> Unit = {}
    ): CfnSimpleTable.PrimaryKeyProperty {
        val builder = CfnSimpleTablePrimaryKeyPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnSimpleTable`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.sam.*;
     * CfnSimpleTableProps cfnSimpleTableProps = CfnSimpleTableProps.builder()
     * .primaryKey(PrimaryKeyProperty.builder()
     * .type("type")
     * // the properties below are optional
     * .name("name")
     * .build())
     * .provisionedThroughput(ProvisionedThroughputProperty.builder()
     * .writeCapacityUnits(123)
     * // the properties below are optional
     * .readCapacityUnits(123)
     * .build())
     * .sseSpecification(SSESpecificationProperty.builder()
     * .sseEnabled(false)
     * .build())
     * .tableName("tableName")
     * .tags(Map.of(
     * "tagsKey", "tags"))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-serverless-simpletable.html)
     */
    public inline fun cfnSimpleTableProps(
        block: CfnSimpleTablePropsDsl.() -> Unit = {}
    ): CfnSimpleTableProps {
        val builder = CfnSimpleTablePropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.sam.*;
     * ProvisionedThroughputProperty provisionedThroughputProperty =
     * ProvisionedThroughputProperty.builder()
     * .writeCapacityUnits(123)
     * // the properties below are optional
     * .readCapacityUnits(123)
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-serverless-simpletable-provisionedthroughput.html)
     */
    public inline fun cfnSimpleTableProvisionedThroughputProperty(
        block: CfnSimpleTableProvisionedThroughputPropertyDsl.() -> Unit = {}
    ): CfnSimpleTable.ProvisionedThroughputProperty {
        val builder = CfnSimpleTableProvisionedThroughputPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.sam.*;
     * SSESpecificationProperty sSESpecificationProperty = SSESpecificationProperty.builder()
     * .sseEnabled(false)
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-serverless-simpletable-ssespecification.html)
     */
    public inline fun cfnSimpleTableSSESpecificationProperty(
        block: CfnSimpleTableSSESpecificationPropertyDsl.() -> Unit = {}
    ): CfnSimpleTable.SSESpecificationProperty {
        val builder = CfnSimpleTableSSESpecificationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Definition of AWS::Serverless::StateMachine.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.sam.*;
     * Object definition;
     * CfnStateMachine cfnStateMachine = CfnStateMachine.Builder.create(this, "MyCfnStateMachine")
     * .definition(definition)
     * .definitionSubstitutions(Map.of(
     * "definitionSubstitutionsKey", "definitionSubstitutions"))
     * .definitionUri("definitionUri")
     * .events(Map.of(
     * "eventsKey", EventSourceProperty.builder()
     * .properties(ApiEventProperty.builder()
     * .method("method")
     * .path("path")
     * // the properties below are optional
     * .restApiId("restApiId")
     * .build())
     * .type("type")
     * .build()))
     * .logging(LoggingConfigurationProperty.builder()
     * .destinations(List.of(LogDestinationProperty.builder()
     * .cloudWatchLogsLogGroup(CloudWatchLogsLogGroupProperty.builder()
     * .logGroupArn("logGroupArn")
     * .build())
     * .build()))
     * .includeExecutionData(false)
     * .level("level")
     * .build())
     * .name("name")
     * .permissionsBoundaries("permissionsBoundaries")
     * .policies("policies")
     * .role("role")
     * .tags(Map.of(
     * "tagsKey", "tags"))
     * .tracing(TracingConfigurationProperty.builder()
     * .enabled(false)
     * .build())
     * .type("type")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-serverless-statemachine.html)
     */
    public inline fun cfnStateMachine(
        scope: Construct,
        id: String,
        block: CfnStateMachineDsl.() -> Unit = {},
    ): CfnStateMachine {
        val builder = CfnStateMachineDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.sam.*;
     * ApiEventProperty apiEventProperty = ApiEventProperty.builder()
     * .method("method")
     * .path("path")
     * // the properties below are optional
     * .restApiId("restApiId")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-serverless-statemachine-apievent.html)
     */
    public inline fun cfnStateMachineApiEventProperty(
        block: CfnStateMachineApiEventPropertyDsl.() -> Unit = {}
    ): CfnStateMachine.ApiEventProperty {
        val builder = CfnStateMachineApiEventPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.sam.*;
     * Object pattern;
     * CloudWatchEventEventProperty cloudWatchEventEventProperty =
     * CloudWatchEventEventProperty.builder()
     * .pattern(pattern)
     * // the properties below are optional
     * .eventBusName("eventBusName")
     * .input("input")
     * .inputPath("inputPath")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-serverless-statemachine-cloudwatcheventevent.html)
     */
    public inline fun cfnStateMachineCloudWatchEventEventProperty(
        block: CfnStateMachineCloudWatchEventEventPropertyDsl.() -> Unit = {}
    ): CfnStateMachine.CloudWatchEventEventProperty {
        val builder = CfnStateMachineCloudWatchEventEventPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.sam.*;
     * CloudWatchLogsLogGroupProperty cloudWatchLogsLogGroupProperty =
     * CloudWatchLogsLogGroupProperty.builder()
     * .logGroupArn("logGroupArn")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-serverless-statemachine-cloudwatchlogsloggroup.html)
     */
    public inline fun cfnStateMachineCloudWatchLogsLogGroupProperty(
        block: CfnStateMachineCloudWatchLogsLogGroupPropertyDsl.() -> Unit = {}
    ): CfnStateMachine.CloudWatchLogsLogGroupProperty {
        val builder = CfnStateMachineCloudWatchLogsLogGroupPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.sam.*;
     * Object pattern;
     * EventBridgeRuleEventProperty eventBridgeRuleEventProperty =
     * EventBridgeRuleEventProperty.builder()
     * .pattern(pattern)
     * // the properties below are optional
     * .eventBusName("eventBusName")
     * .input("input")
     * .inputPath("inputPath")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-serverless-statemachine-eventbridgeruleevent.html)
     */
    public inline fun cfnStateMachineEventBridgeRuleEventProperty(
        block: CfnStateMachineEventBridgeRuleEventPropertyDsl.() -> Unit = {}
    ): CfnStateMachine.EventBridgeRuleEventProperty {
        val builder = CfnStateMachineEventBridgeRuleEventPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.sam.*;
     * EventSourceProperty eventSourceProperty = EventSourceProperty.builder()
     * .properties(ApiEventProperty.builder()
     * .method("method")
     * .path("path")
     * // the properties below are optional
     * .restApiId("restApiId")
     * .build())
     * .type("type")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-serverless-statemachine-eventsource.html)
     */
    public inline fun cfnStateMachineEventSourceProperty(
        block: CfnStateMachineEventSourcePropertyDsl.() -> Unit = {}
    ): CfnStateMachine.EventSourceProperty {
        val builder = CfnStateMachineEventSourcePropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.sam.*;
     * FunctionSAMPTProperty functionSAMPTProperty = FunctionSAMPTProperty.builder()
     * .functionName("functionName")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-serverless-statemachine-functionsampt.html)
     */
    public inline fun cfnStateMachineFunctionSAMPTProperty(
        block: CfnStateMachineFunctionSAMPTPropertyDsl.() -> Unit = {}
    ): CfnStateMachine.FunctionSAMPTProperty {
        val builder = CfnStateMachineFunctionSAMPTPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.sam.*;
     * Object statement;
     * IAMPolicyDocumentProperty iAMPolicyDocumentProperty = Map.of(
     * "statement", statement,
     * "version", "version");
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-serverless-statemachine-iampolicydocument.html)
     */
    public inline fun cfnStateMachineIAMPolicyDocumentProperty(
        block: CfnStateMachineIAMPolicyDocumentPropertyDsl.() -> Unit = {}
    ): CfnStateMachine.IAMPolicyDocumentProperty {
        val builder = CfnStateMachineIAMPolicyDocumentPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.sam.*;
     * LogDestinationProperty logDestinationProperty = LogDestinationProperty.builder()
     * .cloudWatchLogsLogGroup(CloudWatchLogsLogGroupProperty.builder()
     * .logGroupArn("logGroupArn")
     * .build())
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-serverless-statemachine-logdestination.html)
     */
    public inline fun cfnStateMachineLogDestinationProperty(
        block: CfnStateMachineLogDestinationPropertyDsl.() -> Unit = {}
    ): CfnStateMachine.LogDestinationProperty {
        val builder = CfnStateMachineLogDestinationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.sam.*;
     * LoggingConfigurationProperty loggingConfigurationProperty =
     * LoggingConfigurationProperty.builder()
     * .destinations(List.of(LogDestinationProperty.builder()
     * .cloudWatchLogsLogGroup(CloudWatchLogsLogGroupProperty.builder()
     * .logGroupArn("logGroupArn")
     * .build())
     * .build()))
     * .includeExecutionData(false)
     * .level("level")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-serverless-statemachine-loggingconfiguration.html)
     */
    public inline fun cfnStateMachineLoggingConfigurationProperty(
        block: CfnStateMachineLoggingConfigurationPropertyDsl.() -> Unit = {}
    ): CfnStateMachine.LoggingConfigurationProperty {
        val builder = CfnStateMachineLoggingConfigurationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnStateMachine`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.sam.*;
     * Object definition;
     * CfnStateMachineProps cfnStateMachineProps = CfnStateMachineProps.builder()
     * .definition(definition)
     * .definitionSubstitutions(Map.of(
     * "definitionSubstitutionsKey", "definitionSubstitutions"))
     * .definitionUri("definitionUri")
     * .events(Map.of(
     * "eventsKey", EventSourceProperty.builder()
     * .properties(ApiEventProperty.builder()
     * .method("method")
     * .path("path")
     * // the properties below are optional
     * .restApiId("restApiId")
     * .build())
     * .type("type")
     * .build()))
     * .logging(LoggingConfigurationProperty.builder()
     * .destinations(List.of(LogDestinationProperty.builder()
     * .cloudWatchLogsLogGroup(CloudWatchLogsLogGroupProperty.builder()
     * .logGroupArn("logGroupArn")
     * .build())
     * .build()))
     * .includeExecutionData(false)
     * .level("level")
     * .build())
     * .name("name")
     * .permissionsBoundaries("permissionsBoundaries")
     * .policies("policies")
     * .role("role")
     * .tags(Map.of(
     * "tagsKey", "tags"))
     * .tracing(TracingConfigurationProperty.builder()
     * .enabled(false)
     * .build())
     * .type("type")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-serverless-statemachine.html)
     */
    public inline fun cfnStateMachineProps(
        block: CfnStateMachinePropsDsl.() -> Unit = {}
    ): CfnStateMachineProps {
        val builder = CfnStateMachinePropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.sam.*;
     * S3LocationProperty s3LocationProperty = S3LocationProperty.builder()
     * .bucket("bucket")
     * .key("key")
     * // the properties below are optional
     * .version(123)
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-serverless-statemachine-s3location.html)
     */
    public inline fun cfnStateMachineS3LocationProperty(
        block: CfnStateMachineS3LocationPropertyDsl.() -> Unit = {}
    ): CfnStateMachine.S3LocationProperty {
        val builder = CfnStateMachineS3LocationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.sam.*;
     * SAMPolicyTemplateProperty sAMPolicyTemplateProperty = SAMPolicyTemplateProperty.builder()
     * .lambdaInvokePolicy(FunctionSAMPTProperty.builder()
     * .functionName("functionName")
     * .build())
     * .stepFunctionsExecutionPolicy(StateMachineSAMPTProperty.builder()
     * .stateMachineName("stateMachineName")
     * .build())
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-serverless-statemachine-sampolicytemplate.html)
     */
    public inline fun cfnStateMachineSAMPolicyTemplateProperty(
        block: CfnStateMachineSAMPolicyTemplatePropertyDsl.() -> Unit = {}
    ): CfnStateMachine.SAMPolicyTemplateProperty {
        val builder = CfnStateMachineSAMPolicyTemplatePropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.sam.*;
     * ScheduleEventProperty scheduleEventProperty = ScheduleEventProperty.builder()
     * .schedule("schedule")
     * // the properties below are optional
     * .input("input")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-serverless-statemachine-scheduleevent.html)
     */
    public inline fun cfnStateMachineScheduleEventProperty(
        block: CfnStateMachineScheduleEventPropertyDsl.() -> Unit = {}
    ): CfnStateMachine.ScheduleEventProperty {
        val builder = CfnStateMachineScheduleEventPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.sam.*;
     * StateMachineSAMPTProperty stateMachineSAMPTProperty = StateMachineSAMPTProperty.builder()
     * .stateMachineName("stateMachineName")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-serverless-statemachine-statemachinesampt.html)
     */
    public inline fun cfnStateMachineStateMachineSAMPTProperty(
        block: CfnStateMachineStateMachineSAMPTPropertyDsl.() -> Unit = {}
    ): CfnStateMachine.StateMachineSAMPTProperty {
        val builder = CfnStateMachineStateMachineSAMPTPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.sam.*;
     * TracingConfigurationProperty tracingConfigurationProperty =
     * TracingConfigurationProperty.builder()
     * .enabled(false)
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-serverless-statemachine-tracingconfiguration.html)
     */
    public inline fun cfnStateMachineTracingConfigurationProperty(
        block: CfnStateMachineTracingConfigurationPropertyDsl.() -> Unit = {}
    ): CfnStateMachine.TracingConfigurationProperty {
        val builder = CfnStateMachineTracingConfigurationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }
}
