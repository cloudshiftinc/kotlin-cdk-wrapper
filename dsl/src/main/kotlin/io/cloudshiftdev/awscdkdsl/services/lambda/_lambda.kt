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

package io.cloudshiftdev.awscdkdsl.services.lambda

import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.ecr.IRepository
import software.amazon.awscdk.services.lambda.AdotInstrumentationConfig
import software.amazon.awscdk.services.lambda.Alias
import software.amazon.awscdk.services.lambda.AliasAttributes
import software.amazon.awscdk.services.lambda.AliasOptions
import software.amazon.awscdk.services.lambda.AliasProps
import software.amazon.awscdk.services.lambda.AssetCode
import software.amazon.awscdk.services.lambda.AssetImageCode
import software.amazon.awscdk.services.lambda.AssetImageCodeProps
import software.amazon.awscdk.services.lambda.AutoScalingOptions
import software.amazon.awscdk.services.lambda.CfnAlias
import software.amazon.awscdk.services.lambda.CfnAliasProps
import software.amazon.awscdk.services.lambda.CfnCodeSigningConfig
import software.amazon.awscdk.services.lambda.CfnCodeSigningConfigProps
import software.amazon.awscdk.services.lambda.CfnEventInvokeConfig
import software.amazon.awscdk.services.lambda.CfnEventInvokeConfigProps
import software.amazon.awscdk.services.lambda.CfnEventSourceMapping
import software.amazon.awscdk.services.lambda.CfnEventSourceMappingProps
import software.amazon.awscdk.services.lambda.CfnFunction
import software.amazon.awscdk.services.lambda.CfnFunctionProps
import software.amazon.awscdk.services.lambda.CfnLayerVersion
import software.amazon.awscdk.services.lambda.CfnLayerVersionPermission
import software.amazon.awscdk.services.lambda.CfnLayerVersionPermissionProps
import software.amazon.awscdk.services.lambda.CfnLayerVersionProps
import software.amazon.awscdk.services.lambda.CfnParametersCode
import software.amazon.awscdk.services.lambda.CfnParametersCodeProps
import software.amazon.awscdk.services.lambda.CfnPermission
import software.amazon.awscdk.services.lambda.CfnPermissionProps
import software.amazon.awscdk.services.lambda.CfnUrl
import software.amazon.awscdk.services.lambda.CfnUrlProps
import software.amazon.awscdk.services.lambda.CfnVersion
import software.amazon.awscdk.services.lambda.CfnVersionProps
import software.amazon.awscdk.services.lambda.CodeConfig
import software.amazon.awscdk.services.lambda.CodeImageConfig
import software.amazon.awscdk.services.lambda.CodeSigningConfig
import software.amazon.awscdk.services.lambda.CodeSigningConfigProps
import software.amazon.awscdk.services.lambda.DestinationConfig
import software.amazon.awscdk.services.lambda.DestinationOptions
import software.amazon.awscdk.services.lambda.DlqDestinationConfig
import software.amazon.awscdk.services.lambda.DockerBuildAssetOptions
import software.amazon.awscdk.services.lambda.DockerImageFunction
import software.amazon.awscdk.services.lambda.DockerImageFunctionProps
import software.amazon.awscdk.services.lambda.EcrImageCode
import software.amazon.awscdk.services.lambda.EcrImageCodeProps
import software.amazon.awscdk.services.lambda.EnvironmentOptions
import software.amazon.awscdk.services.lambda.EventInvokeConfig
import software.amazon.awscdk.services.lambda.EventInvokeConfigOptions
import software.amazon.awscdk.services.lambda.EventInvokeConfigProps
import software.amazon.awscdk.services.lambda.EventSourceMapping
import software.amazon.awscdk.services.lambda.EventSourceMappingOptions
import software.amazon.awscdk.services.lambda.EventSourceMappingProps
import software.amazon.awscdk.services.lambda.FileSystemConfig
import software.amazon.awscdk.services.lambda.Function
import software.amazon.awscdk.services.lambda.FunctionAttributes
import software.amazon.awscdk.services.lambda.FunctionOptions
import software.amazon.awscdk.services.lambda.FunctionProps
import software.amazon.awscdk.services.lambda.FunctionUrl
import software.amazon.awscdk.services.lambda.FunctionUrlCorsOptions
import software.amazon.awscdk.services.lambda.FunctionUrlOptions
import software.amazon.awscdk.services.lambda.FunctionUrlProps
import software.amazon.awscdk.services.lambda.LambdaRuntimeProps
import software.amazon.awscdk.services.lambda.LayerVersion
import software.amazon.awscdk.services.lambda.LayerVersionAttributes
import software.amazon.awscdk.services.lambda.LayerVersionOptions
import software.amazon.awscdk.services.lambda.LayerVersionPermission
import software.amazon.awscdk.services.lambda.LayerVersionProps
import software.amazon.awscdk.services.lambda.LogRetentionRetryOptions
import software.amazon.awscdk.services.lambda.ParamsAndSecretsOptions
import software.amazon.awscdk.services.lambda.Permission
import software.amazon.awscdk.services.lambda.ResourceBindOptions
import software.amazon.awscdk.services.lambda.Runtime
import software.amazon.awscdk.services.lambda.RuntimeFamily
import software.amazon.awscdk.services.lambda.SingletonFunction
import software.amazon.awscdk.services.lambda.SingletonFunctionProps
import software.amazon.awscdk.services.lambda.SourceAccessConfiguration
import software.amazon.awscdk.services.lambda.UtilizationScalingOptions
import software.amazon.awscdk.services.lambda.Version
import software.amazon.awscdk.services.lambda.VersionAttributes
import software.amazon.awscdk.services.lambda.VersionOptions
import software.amazon.awscdk.services.lambda.VersionProps
import software.amazon.awscdk.services.lambda.VersionWeight
import software.constructs.Construct

public object lambda {
    /**
     * Properties for an ADOT instrumentation in Lambda.
     *
     * Example:
     * ```
     * import software.amazon.awscdk.services.lambda.AdotLambdaExecWrapper;
     * import software.amazon.awscdk.services.lambda.AdotLayerVersion;
     * import software.amazon.awscdk.services.lambda.AdotLambdaLayerJavaScriptSdkVersion;
     * Function fn = Function.Builder.create(this, "MyFunction")
     * .runtime(Runtime.NODEJS_18_X)
     * .handler("index.handler")
     * .code(Code.fromInline("exports.handler = function(event, ctx, cb) { return cb(null, \"hi\");
     * }"))
     * .adotInstrumentation(AdotInstrumentationConfig.builder()
     * .layerVersion(AdotLayerVersion.fromJavaScriptSdkLayerVersion(AdotLambdaLayerJavaScriptSdkVersion.LATEST))
     * .execWrapper(AdotLambdaExecWrapper.REGULAR_HANDLER)
     * .build())
     * .build();
     * ```
     */
    public inline fun adotInstrumentationConfig(
        block: AdotInstrumentationConfigDsl.() -> Unit = {}
    ): AdotInstrumentationConfig {
        val builder = AdotInstrumentationConfigDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * A new alias to a particular version of a Lambda function.
     *
     * Example:
     * ```
     * CfnParametersCode lambdaCode = Code.fromCfnParameters();
     * Function func = Function.Builder.create(this, "Lambda")
     * .code(lambdaCode)
     * .handler("index.handler")
     * .runtime(Runtime.NODEJS_14_X)
     * .build();
     * // used to make sure each CDK synthesis produces a different Version
     * Version version = func.getCurrentVersion();
     * Alias alias = Alias.Builder.create(this, "LambdaAlias")
     * .aliasName("Prod")
     * .version(version)
     * .build();
     * LambdaDeploymentGroup.Builder.create(this, "DeploymentGroup")
     * .alias(alias)
     * .deploymentConfig(LambdaDeploymentConfig.LINEAR_10PERCENT_EVERY_1MINUTE)
     * .build();
     * ```
     */
    public inline fun alias(
        scope: Construct,
        id: String,
        block: AliasDsl.() -> Unit = {},
    ): Alias {
        val builder = AliasDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.lambda.*;
     * Version version;
     * AliasAttributes aliasAttributes = AliasAttributes.builder()
     * .aliasName("aliasName")
     * .aliasVersion(version)
     * .build();
     * ```
     */
    public inline fun aliasAttributes(block: AliasAttributesDsl.() -> Unit = {}): AliasAttributes {
        val builder = AliasAttributesDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Options for `lambda.Alias`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.*;
     * import software.amazon.awscdk.services.lambda.*;
     * IDestination destination;
     * Version version;
     * AliasOptions aliasOptions = AliasOptions.builder()
     * .additionalVersions(List.of(VersionWeight.builder()
     * .version(version)
     * .weight(123)
     * .build()))
     * .description("description")
     * .maxEventAge(Duration.minutes(30))
     * .onFailure(destination)
     * .onSuccess(destination)
     * .provisionedConcurrentExecutions(123)
     * .retryAttempts(123)
     * .build();
     * ```
     */
    public inline fun aliasOptions(block: AliasOptionsDsl.() -> Unit = {}): AliasOptions {
        val builder = AliasOptionsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for a new Lambda alias.
     *
     * Example:
     * ```
     * CfnParametersCode lambdaCode = Code.fromCfnParameters();
     * Function func = Function.Builder.create(this, "Lambda")
     * .code(lambdaCode)
     * .handler("index.handler")
     * .runtime(Runtime.NODEJS_14_X)
     * .build();
     * // used to make sure each CDK synthesis produces a different Version
     * Version version = func.getCurrentVersion();
     * Alias alias = Alias.Builder.create(this, "LambdaAlias")
     * .aliasName("Prod")
     * .version(version)
     * .build();
     * LambdaDeploymentGroup.Builder.create(this, "DeploymentGroup")
     * .alias(alias)
     * .deploymentConfig(LambdaDeploymentConfig.LINEAR_10PERCENT_EVERY_1MINUTE)
     * .build();
     * ```
     */
    public inline fun aliasProps(block: AliasPropsDsl.() -> Unit = {}): AliasProps {
        val builder = AliasPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Lambda code from a local directory.
     *
     * Example:
     * ```
     * // Lambda function containing logic that evaluates compliance with the rule.
     * Function evalComplianceFn = Function.Builder.create(this, "CustomFunction")
     * .code(AssetCode.fromInline("exports.handler = (event) =&gt; console.log(event);"))
     * .handler("index.handler")
     * .runtime(Runtime.NODEJS_18_X)
     * .build();
     * // A custom rule that runs on configuration changes of EC2 instances
     * CustomRule customRule = CustomRule.Builder.create(this, "Custom")
     * .configurationChanges(true)
     * .lambdaFunction(evalComplianceFn)
     * .ruleScope(RuleScope.fromResource(ResourceType.EC2_INSTANCE))
     * .build();
     * // A rule to detect stack drifts
     * CloudFormationStackDriftDetectionCheck driftRule = new
     * CloudFormationStackDriftDetectionCheck(this, "Drift");
     * // Topic to which compliance notification events will be published
     * Topic complianceTopic = new Topic(this, "ComplianceTopic");
     * // Send notification on compliance change events
     * driftRule.onComplianceChange("ComplianceChange", OnEventOptions.builder()
     * .target(new SnsTopic(complianceTopic))
     * .build());
     * ```
     */
    public inline fun assetCode(path: String, block: AssetCodeDsl.() -> Unit = {}): AssetCode {
        val builder = AssetCodeDsl(path)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Represents an ECR image that will be constructed from the specified asset and can be bound as
     * Lambda code.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.*;
     * import software.amazon.awscdk.services.ecr.assets.*;
     * import software.amazon.awscdk.services.lambda.*;
     * NetworkMode networkMode;
     * Platform platform;
     * AssetImageCode assetImageCode = AssetImageCode.Builder.create("directory")
     * .assetName("assetName")
     * .buildArgs(Map.of(
     * "buildArgsKey", "buildArgs"))
     * .buildSecrets(Map.of(
     * "buildSecretsKey", "buildSecrets"))
     * .buildSsh("buildSsh")
     * .cacheFrom(List.of(DockerCacheOption.builder()
     * .type("type")
     * // the properties below are optional
     * .params(Map.of(
     * "paramsKey", "params"))
     * .build()))
     * .cacheTo(DockerCacheOption.builder()
     * .type("type")
     * // the properties below are optional
     * .params(Map.of(
     * "paramsKey", "params"))
     * .build())
     * .cmd(List.of("cmd"))
     * .entrypoint(List.of("entrypoint"))
     * .exclude(List.of("exclude"))
     * .extraHash("extraHash")
     * .file("file")
     * .followSymlinks(SymlinkFollowMode.NEVER)
     * .ignoreMode(IgnoreMode.GLOB)
     * .invalidation(DockerImageAssetInvalidationOptions.builder()
     * .buildArgs(false)
     * .buildSecrets(false)
     * .buildSsh(false)
     * .extraHash(false)
     * .file(false)
     * .networkMode(false)
     * .outputs(false)
     * .platform(false)
     * .repositoryName(false)
     * .target(false)
     * .build())
     * .networkMode(networkMode)
     * .outputs(List.of("outputs"))
     * .platform(platform)
     * .target("target")
     * .workingDirectory("workingDirectory")
     * .build();
     * ```
     */
    public inline fun assetImageCode(
        directory: String,
        block: AssetImageCodeDsl.() -> Unit = {}
    ): AssetImageCode {
        val builder = AssetImageCodeDsl(directory)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties to initialize a new AssetImage.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.*;
     * import software.amazon.awscdk.services.ecr.assets.*;
     * import software.amazon.awscdk.services.lambda.*;
     * NetworkMode networkMode;
     * Platform platform;
     * AssetImageCodeProps assetImageCodeProps = AssetImageCodeProps.builder()
     * .assetName("assetName")
     * .buildArgs(Map.of(
     * "buildArgsKey", "buildArgs"))
     * .buildSecrets(Map.of(
     * "buildSecretsKey", "buildSecrets"))
     * .buildSsh("buildSsh")
     * .cacheFrom(List.of(DockerCacheOption.builder()
     * .type("type")
     * // the properties below are optional
     * .params(Map.of(
     * "paramsKey", "params"))
     * .build()))
     * .cacheTo(DockerCacheOption.builder()
     * .type("type")
     * // the properties below are optional
     * .params(Map.of(
     * "paramsKey", "params"))
     * .build())
     * .cmd(List.of("cmd"))
     * .entrypoint(List.of("entrypoint"))
     * .exclude(List.of("exclude"))
     * .extraHash("extraHash")
     * .file("file")
     * .followSymlinks(SymlinkFollowMode.NEVER)
     * .ignoreMode(IgnoreMode.GLOB)
     * .invalidation(DockerImageAssetInvalidationOptions.builder()
     * .buildArgs(false)
     * .buildSecrets(false)
     * .buildSsh(false)
     * .extraHash(false)
     * .file(false)
     * .networkMode(false)
     * .outputs(false)
     * .platform(false)
     * .repositoryName(false)
     * .target(false)
     * .build())
     * .networkMode(networkMode)
     * .outputs(List.of("outputs"))
     * .platform(platform)
     * .target("target")
     * .workingDirectory("workingDirectory")
     * .build();
     * ```
     */
    public inline fun assetImageCodeProps(
        block: AssetImageCodePropsDsl.() -> Unit = {}
    ): AssetImageCodeProps {
        val builder = AssetImageCodePropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for enabling Lambda autoscaling.
     *
     * Example:
     * ```
     * import software.amazon.awscdk.services.autoscaling.*;
     * Function fn;
     * Alias alias = fn.addAlias("prod");
     * // Create AutoScaling target
     * IScalableFunctionAttribute as =
     * alias.addAutoScaling(AutoScalingOptions.builder().maxCapacity(50).build());
     * // Configure Target Tracking
     * as.scaleOnUtilization(UtilizationScalingOptions.builder()
     * .utilizationTarget(0.5)
     * .build());
     * // Configure Scheduled Scaling
     * as.scaleOnSchedule("ScaleUpInTheMorning", ScalingSchedule.builder()
     * .schedule(Schedule.cron(CronOptions.builder().hour("8").minute("0").build()))
     * .minCapacity(20)
     * .build());
     * ```
     */
    public inline fun autoScalingOptions(
        block: AutoScalingOptionsDsl.() -> Unit = {}
    ): AutoScalingOptions {
        val builder = AutoScalingOptionsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The `AWS::Lambda::Alias` resource creates an
     * [alias](https://docs.aws.amazon.com/lambda/latest/dg/configuration-aliases.html) for a Lambda
     * function version. Use aliases to provide clients with a function identifier that you can
     * update to invoke a different version.
     *
     * You can also map an alias to split invocation requests between two versions. Use the
     * `RoutingConfig` parameter to specify a second version and the percentage of invocation
     * requests that it receives.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.lambda.*;
     * CfnAlias cfnAlias = CfnAlias.Builder.create(this, "MyCfnAlias")
     * .functionName("functionName")
     * .functionVersion("functionVersion")
     * .name("name")
     * // the properties below are optional
     * .description("description")
     * .provisionedConcurrencyConfig(ProvisionedConcurrencyConfigurationProperty.builder()
     * .provisionedConcurrentExecutions(123)
     * .build())
     * .routingConfig(AliasRoutingConfigurationProperty.builder()
     * .additionalVersionWeights(List.of(VersionWeightProperty.builder()
     * .functionVersion("functionVersion")
     * .functionWeight(123)
     * .build()))
     * .build())
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-alias.html)
     */
    public inline fun cfnAlias(
        scope: Construct,
        id: String,
        block: CfnAliasDsl.() -> Unit = {},
    ): CfnAlias {
        val builder = CfnAliasDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * The
     * [traffic-shifting](https://docs.aws.amazon.com/lambda/latest/dg/lambda-traffic-shifting-using-aliases.html)
     * configuration of a Lambda function alias.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.lambda.*;
     * AliasRoutingConfigurationProperty aliasRoutingConfigurationProperty =
     * AliasRoutingConfigurationProperty.builder()
     * .additionalVersionWeights(List.of(VersionWeightProperty.builder()
     * .functionVersion("functionVersion")
     * .functionWeight(123)
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lambda-alias-aliasroutingconfiguration.html)
     */
    public inline fun cfnAliasAliasRoutingConfigurationProperty(
        block: CfnAliasAliasRoutingConfigurationPropertyDsl.() -> Unit = {}
    ): CfnAlias.AliasRoutingConfigurationProperty {
        val builder = CfnAliasAliasRoutingConfigurationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnAlias`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.lambda.*;
     * CfnAliasProps cfnAliasProps = CfnAliasProps.builder()
     * .functionName("functionName")
     * .functionVersion("functionVersion")
     * .name("name")
     * // the properties below are optional
     * .description("description")
     * .provisionedConcurrencyConfig(ProvisionedConcurrencyConfigurationProperty.builder()
     * .provisionedConcurrentExecutions(123)
     * .build())
     * .routingConfig(AliasRoutingConfigurationProperty.builder()
     * .additionalVersionWeights(List.of(VersionWeightProperty.builder()
     * .functionVersion("functionVersion")
     * .functionWeight(123)
     * .build()))
     * .build())
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-alias.html)
     */
    public inline fun cfnAliasProps(block: CfnAliasPropsDsl.() -> Unit = {}): CfnAliasProps {
        val builder = CfnAliasPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * A provisioned concurrency configuration for a function's alias.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.lambda.*;
     * ProvisionedConcurrencyConfigurationProperty provisionedConcurrencyConfigurationProperty =
     * ProvisionedConcurrencyConfigurationProperty.builder()
     * .provisionedConcurrentExecutions(123)
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lambda-alias-provisionedconcurrencyconfiguration.html)
     */
    public inline fun cfnAliasProvisionedConcurrencyConfigurationProperty(
        block: CfnAliasProvisionedConcurrencyConfigurationPropertyDsl.() -> Unit = {}
    ): CfnAlias.ProvisionedConcurrencyConfigurationProperty {
        val builder = CfnAliasProvisionedConcurrencyConfigurationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The
     * [traffic-shifting](https://docs.aws.amazon.com/lambda/latest/dg/lambda-traffic-shifting-using-aliases.html)
     * configuration of a Lambda function alias.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.lambda.*;
     * VersionWeightProperty versionWeightProperty = VersionWeightProperty.builder()
     * .functionVersion("functionVersion")
     * .functionWeight(123)
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lambda-alias-versionweight.html)
     */
    public inline fun cfnAliasVersionWeightProperty(
        block: CfnAliasVersionWeightPropertyDsl.() -> Unit = {}
    ): CfnAlias.VersionWeightProperty {
        val builder = CfnAliasVersionWeightPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Details about a
     * [Code signing configuration](https://docs.aws.amazon.com/lambda/latest/dg/configuration-codesigning.html)
     * .
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.lambda.*;
     * CfnCodeSigningConfig cfnCodeSigningConfig = CfnCodeSigningConfig.Builder.create(this,
     * "MyCfnCodeSigningConfig")
     * .allowedPublishers(AllowedPublishersProperty.builder()
     * .signingProfileVersionArns(List.of("signingProfileVersionArns"))
     * .build())
     * // the properties below are optional
     * .codeSigningPolicies(CodeSigningPoliciesProperty.builder()
     * .untrustedArtifactOnDeployment("untrustedArtifactOnDeployment")
     * .build())
     * .description("description")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-codesigningconfig.html)
     */
    public inline fun cfnCodeSigningConfig(
        scope: Construct,
        id: String,
        block: CfnCodeSigningConfigDsl.() -> Unit = {},
    ): CfnCodeSigningConfig {
        val builder = CfnCodeSigningConfigDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * List of signing profiles that can sign a code package.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.lambda.*;
     * AllowedPublishersProperty allowedPublishersProperty = AllowedPublishersProperty.builder()
     * .signingProfileVersionArns(List.of("signingProfileVersionArns"))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lambda-codesigningconfig-allowedpublishers.html)
     */
    public inline fun cfnCodeSigningConfigAllowedPublishersProperty(
        block: CfnCodeSigningConfigAllowedPublishersPropertyDsl.() -> Unit = {}
    ): CfnCodeSigningConfig.AllowedPublishersProperty {
        val builder = CfnCodeSigningConfigAllowedPublishersPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Code signing configuration
     * [policies](https://docs.aws.amazon.com/lambda/latest/dg/configuration-codesigning.html#config-codesigning-policies)
     * specify the validation failure action for signature mismatch or expiry.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.lambda.*;
     * CodeSigningPoliciesProperty codeSigningPoliciesProperty = CodeSigningPoliciesProperty.builder()
     * .untrustedArtifactOnDeployment("untrustedArtifactOnDeployment")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lambda-codesigningconfig-codesigningpolicies.html)
     */
    public inline fun cfnCodeSigningConfigCodeSigningPoliciesProperty(
        block: CfnCodeSigningConfigCodeSigningPoliciesPropertyDsl.() -> Unit = {}
    ): CfnCodeSigningConfig.CodeSigningPoliciesProperty {
        val builder = CfnCodeSigningConfigCodeSigningPoliciesPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnCodeSigningConfig`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.lambda.*;
     * CfnCodeSigningConfigProps cfnCodeSigningConfigProps = CfnCodeSigningConfigProps.builder()
     * .allowedPublishers(AllowedPublishersProperty.builder()
     * .signingProfileVersionArns(List.of("signingProfileVersionArns"))
     * .build())
     * // the properties below are optional
     * .codeSigningPolicies(CodeSigningPoliciesProperty.builder()
     * .untrustedArtifactOnDeployment("untrustedArtifactOnDeployment")
     * .build())
     * .description("description")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-codesigningconfig.html)
     */
    public inline fun cfnCodeSigningConfigProps(
        block: CfnCodeSigningConfigPropsDsl.() -> Unit = {}
    ): CfnCodeSigningConfigProps {
        val builder = CfnCodeSigningConfigPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The `AWS::Lambda::EventInvokeConfig` resource configures options for
     * [asynchronous invocation](https://docs.aws.amazon.com/lambda/latest/dg/invocation-async.html)
     * on a version or an alias.
     *
     * By default, Lambda retries an asynchronous invocation twice if the function returns an error.
     * It retains events in a queue for up to six hours. When an event fails all processing attempts
     * or stays in the asynchronous invocation queue for too long, Lambda discards it.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.lambda.*;
     * CfnEventInvokeConfig cfnEventInvokeConfig = CfnEventInvokeConfig.Builder.create(this,
     * "MyCfnEventInvokeConfig")
     * .functionName("functionName")
     * .qualifier("qualifier")
     * // the properties below are optional
     * .destinationConfig(DestinationConfigProperty.builder()
     * .onFailure(OnFailureProperty.builder()
     * .destination("destination")
     * .build())
     * .onSuccess(OnSuccessProperty.builder()
     * .destination("destination")
     * .build())
     * .build())
     * .maximumEventAgeInSeconds(123)
     * .maximumRetryAttempts(123)
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-eventinvokeconfig.html)
     */
    public inline fun cfnEventInvokeConfig(
        scope: Construct,
        id: String,
        block: CfnEventInvokeConfigDsl.() -> Unit = {},
    ): CfnEventInvokeConfig {
        val builder = CfnEventInvokeConfigDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * A configuration object that specifies the destination of an event after Lambda processes it.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.lambda.*;
     * DestinationConfigProperty destinationConfigProperty = DestinationConfigProperty.builder()
     * .onFailure(OnFailureProperty.builder()
     * .destination("destination")
     * .build())
     * .onSuccess(OnSuccessProperty.builder()
     * .destination("destination")
     * .build())
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lambda-eventinvokeconfig-destinationconfig.html)
     */
    public inline fun cfnEventInvokeConfigDestinationConfigProperty(
        block: CfnEventInvokeConfigDestinationConfigPropertyDsl.() -> Unit = {}
    ): CfnEventInvokeConfig.DestinationConfigProperty {
        val builder = CfnEventInvokeConfigDestinationConfigPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * A destination for events that failed processing.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.lambda.*;
     * OnFailureProperty onFailureProperty = OnFailureProperty.builder()
     * .destination("destination")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lambda-eventinvokeconfig-onfailure.html)
     */
    public inline fun cfnEventInvokeConfigOnFailureProperty(
        block: CfnEventInvokeConfigOnFailurePropertyDsl.() -> Unit = {}
    ): CfnEventInvokeConfig.OnFailureProperty {
        val builder = CfnEventInvokeConfigOnFailurePropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * A destination for events that were processed successfully.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.lambda.*;
     * OnSuccessProperty onSuccessProperty = OnSuccessProperty.builder()
     * .destination("destination")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lambda-eventinvokeconfig-onsuccess.html)
     */
    public inline fun cfnEventInvokeConfigOnSuccessProperty(
        block: CfnEventInvokeConfigOnSuccessPropertyDsl.() -> Unit = {}
    ): CfnEventInvokeConfig.OnSuccessProperty {
        val builder = CfnEventInvokeConfigOnSuccessPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnEventInvokeConfig`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.lambda.*;
     * CfnEventInvokeConfigProps cfnEventInvokeConfigProps = CfnEventInvokeConfigProps.builder()
     * .functionName("functionName")
     * .qualifier("qualifier")
     * // the properties below are optional
     * .destinationConfig(DestinationConfigProperty.builder()
     * .onFailure(OnFailureProperty.builder()
     * .destination("destination")
     * .build())
     * .onSuccess(OnSuccessProperty.builder()
     * .destination("destination")
     * .build())
     * .build())
     * .maximumEventAgeInSeconds(123)
     * .maximumRetryAttempts(123)
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-eventinvokeconfig.html)
     */
    public inline fun cfnEventInvokeConfigProps(
        block: CfnEventInvokeConfigPropsDsl.() -> Unit = {}
    ): CfnEventInvokeConfigProps {
        val builder = CfnEventInvokeConfigPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The `AWS::Lambda::EventSourceMapping` resource creates a mapping between an event source and
     * an AWS Lambda function.
     *
     * Lambda reads items from the event source and triggers the function.
     *
     * For details about each event source type, see the following topics. In particular, each of
     * the topics describes the required and optional parameters for the specific event source.
     * * [Configuring a Dynamo DB stream as an event
     *   source](https://docs.aws.amazon.com/lambda/latest/dg/with-ddb.html#services-dynamodb-eventsourcemapping)
     * * [Configuring a Kinesis stream as an event
     *   source](https://docs.aws.amazon.com/lambda/latest/dg/with-kinesis.html#services-kinesis-eventsourcemapping)
     * * [Configuring an SQS queue as an event
     *   source](https://docs.aws.amazon.com/lambda/latest/dg/with-sqs.html#events-sqs-eventsource)
     * * [Configuring an MQ broker as an event
     *   source](https://docs.aws.amazon.com/lambda/latest/dg/with-mq.html#services-mq-eventsourcemapping)
     * * [Configuring MSK as an event
     *   source](https://docs.aws.amazon.com/lambda/latest/dg/with-msk.html)
     * * [Configuring Self-Managed Apache Kafka as an event
     *   source](https://docs.aws.amazon.com/lambda/latest/dg/kafka-smaa.html)
     * * [Configuring Amazon DocumentDB as an event
     *   source](https://docs.aws.amazon.com/lambda/latest/dg/with-documentdb.html)
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.lambda.*;
     * CfnEventSourceMapping cfnEventSourceMapping = CfnEventSourceMapping.Builder.create(this,
     * "MyCfnEventSourceMapping")
     * .functionName("functionName")
     * // the properties below are optional
     * .amazonManagedKafkaEventSourceConfig(AmazonManagedKafkaEventSourceConfigProperty.builder()
     * .consumerGroupId("consumerGroupId")
     * .build())
     * .batchSize(123)
     * .bisectBatchOnFunctionError(false)
     * .destinationConfig(DestinationConfigProperty.builder()
     * .onFailure(OnFailureProperty.builder()
     * .destination("destination")
     * .build())
     * .build())
     * .documentDbEventSourceConfig(DocumentDBEventSourceConfigProperty.builder()
     * .collectionName("collectionName")
     * .databaseName("databaseName")
     * .fullDocument("fullDocument")
     * .build())
     * .enabled(false)
     * .eventSourceArn("eventSourceArn")
     * .filterCriteria(FilterCriteriaProperty.builder()
     * .filters(List.of(FilterProperty.builder()
     * .pattern("pattern")
     * .build()))
     * .build())
     * .functionResponseTypes(List.of("functionResponseTypes"))
     * .maximumBatchingWindowInSeconds(123)
     * .maximumRecordAgeInSeconds(123)
     * .maximumRetryAttempts(123)
     * .parallelizationFactor(123)
     * .queues(List.of("queues"))
     * .scalingConfig(ScalingConfigProperty.builder()
     * .maximumConcurrency(123)
     * .build())
     * .selfManagedEventSource(SelfManagedEventSourceProperty.builder()
     * .endpoints(EndpointsProperty.builder()
     * .kafkaBootstrapServers(List.of("kafkaBootstrapServers"))
     * .build())
     * .build())
     * .selfManagedKafkaEventSourceConfig(SelfManagedKafkaEventSourceConfigProperty.builder()
     * .consumerGroupId("consumerGroupId")
     * .build())
     * .sourceAccessConfigurations(List.of(SourceAccessConfigurationProperty.builder()
     * .type("type")
     * .uri("uri")
     * .build()))
     * .startingPosition("startingPosition")
     * .startingPositionTimestamp(123)
     * .topics(List.of("topics"))
     * .tumblingWindowInSeconds(123)
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-eventsourcemapping.html)
     */
    public inline fun cfnEventSourceMapping(
        scope: Construct,
        id: String,
        block: CfnEventSourceMappingDsl.() -> Unit = {},
    ): CfnEventSourceMapping {
        val builder = CfnEventSourceMappingDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Specific configuration settings for an Amazon Managed Streaming for Apache Kafka (Amazon MSK)
     * event source.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.lambda.*;
     * AmazonManagedKafkaEventSourceConfigProperty amazonManagedKafkaEventSourceConfigProperty =
     * AmazonManagedKafkaEventSourceConfigProperty.builder()
     * .consumerGroupId("consumerGroupId")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lambda-eventsourcemapping-amazonmanagedkafkaeventsourceconfig.html)
     */
    public inline fun cfnEventSourceMappingAmazonManagedKafkaEventSourceConfigProperty(
        block: CfnEventSourceMappingAmazonManagedKafkaEventSourceConfigPropertyDsl.() -> Unit = {}
    ): CfnEventSourceMapping.AmazonManagedKafkaEventSourceConfigProperty {
        val builder = CfnEventSourceMappingAmazonManagedKafkaEventSourceConfigPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * A configuration object that specifies the destination of an event after Lambda processes it.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.lambda.*;
     * DestinationConfigProperty destinationConfigProperty = DestinationConfigProperty.builder()
     * .onFailure(OnFailureProperty.builder()
     * .destination("destination")
     * .build())
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lambda-eventsourcemapping-destinationconfig.html)
     */
    public inline fun cfnEventSourceMappingDestinationConfigProperty(
        block: CfnEventSourceMappingDestinationConfigPropertyDsl.() -> Unit = {}
    ): CfnEventSourceMapping.DestinationConfigProperty {
        val builder = CfnEventSourceMappingDestinationConfigPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Specific configuration settings for a DocumentDB event source.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.lambda.*;
     * DocumentDBEventSourceConfigProperty documentDBEventSourceConfigProperty =
     * DocumentDBEventSourceConfigProperty.builder()
     * .collectionName("collectionName")
     * .databaseName("databaseName")
     * .fullDocument("fullDocument")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lambda-eventsourcemapping-documentdbeventsourceconfig.html)
     */
    public inline fun cfnEventSourceMappingDocumentDBEventSourceConfigProperty(
        block: CfnEventSourceMappingDocumentDBEventSourceConfigPropertyDsl.() -> Unit = {}
    ): CfnEventSourceMapping.DocumentDBEventSourceConfigProperty {
        val builder = CfnEventSourceMappingDocumentDBEventSourceConfigPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The list of bootstrap servers for your Kafka brokers in the following format:
     * `"KafkaBootstrapServers": ["abc.xyz.com:xxxx","abc2.xyz.com:xxxx"]` .
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.lambda.*;
     * EndpointsProperty endpointsProperty = EndpointsProperty.builder()
     * .kafkaBootstrapServers(List.of("kafkaBootstrapServers"))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lambda-eventsourcemapping-endpoints.html)
     */
    public inline fun cfnEventSourceMappingEndpointsProperty(
        block: CfnEventSourceMappingEndpointsPropertyDsl.() -> Unit = {}
    ): CfnEventSourceMapping.EndpointsProperty {
        val builder = CfnEventSourceMappingEndpointsPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * An object that contains the filters for an event source.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.lambda.*;
     * FilterCriteriaProperty filterCriteriaProperty = FilterCriteriaProperty.builder()
     * .filters(List.of(FilterProperty.builder()
     * .pattern("pattern")
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lambda-eventsourcemapping-filtercriteria.html)
     */
    public inline fun cfnEventSourceMappingFilterCriteriaProperty(
        block: CfnEventSourceMappingFilterCriteriaPropertyDsl.() -> Unit = {}
    ): CfnEventSourceMapping.FilterCriteriaProperty {
        val builder = CfnEventSourceMappingFilterCriteriaPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * A structure within a `FilterCriteria` object that defines an event filtering pattern.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.lambda.*;
     * FilterProperty filterProperty = FilterProperty.builder()
     * .pattern("pattern")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lambda-eventsourcemapping-filter.html)
     */
    public inline fun cfnEventSourceMappingFilterProperty(
        block: CfnEventSourceMappingFilterPropertyDsl.() -> Unit = {}
    ): CfnEventSourceMapping.FilterProperty {
        val builder = CfnEventSourceMappingFilterPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * A destination for events that failed processing.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.lambda.*;
     * OnFailureProperty onFailureProperty = OnFailureProperty.builder()
     * .destination("destination")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lambda-eventsourcemapping-onfailure.html)
     */
    public inline fun cfnEventSourceMappingOnFailureProperty(
        block: CfnEventSourceMappingOnFailurePropertyDsl.() -> Unit = {}
    ): CfnEventSourceMapping.OnFailureProperty {
        val builder = CfnEventSourceMappingOnFailurePropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnEventSourceMapping`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.lambda.*;
     * CfnEventSourceMappingProps cfnEventSourceMappingProps = CfnEventSourceMappingProps.builder()
     * .functionName("functionName")
     * // the properties below are optional
     * .amazonManagedKafkaEventSourceConfig(AmazonManagedKafkaEventSourceConfigProperty.builder()
     * .consumerGroupId("consumerGroupId")
     * .build())
     * .batchSize(123)
     * .bisectBatchOnFunctionError(false)
     * .destinationConfig(DestinationConfigProperty.builder()
     * .onFailure(OnFailureProperty.builder()
     * .destination("destination")
     * .build())
     * .build())
     * .documentDbEventSourceConfig(DocumentDBEventSourceConfigProperty.builder()
     * .collectionName("collectionName")
     * .databaseName("databaseName")
     * .fullDocument("fullDocument")
     * .build())
     * .enabled(false)
     * .eventSourceArn("eventSourceArn")
     * .filterCriteria(FilterCriteriaProperty.builder()
     * .filters(List.of(FilterProperty.builder()
     * .pattern("pattern")
     * .build()))
     * .build())
     * .functionResponseTypes(List.of("functionResponseTypes"))
     * .maximumBatchingWindowInSeconds(123)
     * .maximumRecordAgeInSeconds(123)
     * .maximumRetryAttempts(123)
     * .parallelizationFactor(123)
     * .queues(List.of("queues"))
     * .scalingConfig(ScalingConfigProperty.builder()
     * .maximumConcurrency(123)
     * .build())
     * .selfManagedEventSource(SelfManagedEventSourceProperty.builder()
     * .endpoints(EndpointsProperty.builder()
     * .kafkaBootstrapServers(List.of("kafkaBootstrapServers"))
     * .build())
     * .build())
     * .selfManagedKafkaEventSourceConfig(SelfManagedKafkaEventSourceConfigProperty.builder()
     * .consumerGroupId("consumerGroupId")
     * .build())
     * .sourceAccessConfigurations(List.of(SourceAccessConfigurationProperty.builder()
     * .type("type")
     * .uri("uri")
     * .build()))
     * .startingPosition("startingPosition")
     * .startingPositionTimestamp(123)
     * .topics(List.of("topics"))
     * .tumblingWindowInSeconds(123)
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-eventsourcemapping.html)
     */
    public inline fun cfnEventSourceMappingProps(
        block: CfnEventSourceMappingPropsDsl.() -> Unit = {}
    ): CfnEventSourceMappingProps {
        val builder = CfnEventSourceMappingPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * (Amazon SQS only) The scaling configuration for the event source.
     *
     * To remove the configuration, pass an empty value.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.lambda.*;
     * ScalingConfigProperty scalingConfigProperty = ScalingConfigProperty.builder()
     * .maximumConcurrency(123)
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lambda-eventsourcemapping-scalingconfig.html)
     */
    public inline fun cfnEventSourceMappingScalingConfigProperty(
        block: CfnEventSourceMappingScalingConfigPropertyDsl.() -> Unit = {}
    ): CfnEventSourceMapping.ScalingConfigProperty {
        val builder = CfnEventSourceMappingScalingConfigPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The self-managed Apache Kafka cluster for your event source.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.lambda.*;
     * SelfManagedEventSourceProperty selfManagedEventSourceProperty =
     * SelfManagedEventSourceProperty.builder()
     * .endpoints(EndpointsProperty.builder()
     * .kafkaBootstrapServers(List.of("kafkaBootstrapServers"))
     * .build())
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lambda-eventsourcemapping-selfmanagedeventsource.html)
     */
    public inline fun cfnEventSourceMappingSelfManagedEventSourceProperty(
        block: CfnEventSourceMappingSelfManagedEventSourcePropertyDsl.() -> Unit = {}
    ): CfnEventSourceMapping.SelfManagedEventSourceProperty {
        val builder = CfnEventSourceMappingSelfManagedEventSourcePropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Specific configuration settings for a self-managed Apache Kafka event source.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.lambda.*;
     * SelfManagedKafkaEventSourceConfigProperty selfManagedKafkaEventSourceConfigProperty =
     * SelfManagedKafkaEventSourceConfigProperty.builder()
     * .consumerGroupId("consumerGroupId")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lambda-eventsourcemapping-selfmanagedkafkaeventsourceconfig.html)
     */
    public inline fun cfnEventSourceMappingSelfManagedKafkaEventSourceConfigProperty(
        block: CfnEventSourceMappingSelfManagedKafkaEventSourceConfigPropertyDsl.() -> Unit = {}
    ): CfnEventSourceMapping.SelfManagedKafkaEventSourceConfigProperty {
        val builder = CfnEventSourceMappingSelfManagedKafkaEventSourceConfigPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * An array of the authentication protocol, VPC components, or virtual host to secure and define
     * your event source.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.lambda.*;
     * SourceAccessConfigurationProperty sourceAccessConfigurationProperty =
     * SourceAccessConfigurationProperty.builder()
     * .type("type")
     * .uri("uri")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lambda-eventsourcemapping-sourceaccessconfiguration.html)
     */
    public inline fun cfnEventSourceMappingSourceAccessConfigurationProperty(
        block: CfnEventSourceMappingSourceAccessConfigurationPropertyDsl.() -> Unit = {}
    ): CfnEventSourceMapping.SourceAccessConfigurationProperty {
        val builder = CfnEventSourceMappingSourceAccessConfigurationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The `AWS::Lambda::Function` resource creates a Lambda function.
     *
     * To create a function, you need a
     * [deployment package](https://docs.aws.amazon.com/lambda/latest/dg/gettingstarted-package.html)
     * and an
     * [execution role](https://docs.aws.amazon.com/lambda/latest/dg/lambda-intro-execution-role.html)
     * . The deployment package is a .zip file archive or container image that contains your
     * function code. The execution role grants the function permission to use AWS services, such as
     * Amazon CloudWatch Logs for log streaming and AWS X-Ray for request tracing.
     *
     * You set the package type to `Image` if the deployment package is a
     * [container image](https://docs.aws.amazon.com/lambda/latest/dg/lambda-images.html) . For a
     * container image, the code property must include the URI of a container image in the Amazon
     * ECR registry. You do not need to specify the handler and runtime properties.
     *
     * You set the package type to `Zip` if the deployment package is a
     * [.zip file archive](https://docs.aws.amazon.com/lambda/latest/dg/gettingstarted-package.html#gettingstarted-package-zip)
     * . For a .zip file archive, the code property specifies the location of the .zip file. You
     * must also specify the handler and runtime properties. For a Python example, see
     * [Deploy Python Lambda functions with .zip file archives](https://docs.aws.amazon.com/lambda/latest/dg/python-package.html)
     * .
     *
     * You can use
     * [code signing](https://docs.aws.amazon.com/lambda/latest/dg/configuration-codesigning.html)
     * if your deployment package is a .zip file archive. To enable code signing for this function,
     * specify the ARN of a code-signing configuration. When a user attempts to deploy a code
     * package with `UpdateFunctionCode` , Lambda checks that the code package has a valid signature
     * from a trusted publisher. The code-signing configuration includes a set of signing profiles,
     * which define the trusted publishers for this function.
     *
     * Note that you configure
     * [provisioned concurrency](https://docs.aws.amazon.com/lambda/latest/dg/provisioned-concurrency.html)
     * on a `AWS::Lambda::Version` or a `AWS::Lambda::Alias` .
     *
     * For a complete introduction to Lambda functions, see
     * [What is Lambda?](https://docs.aws.amazon.com/lambda/latest/dg/lambda-welcome.html) in the
     * *Lambda developer guide.*
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.lambda.*;
     * CfnFunction cfnFunction = CfnFunction.Builder.create(this, "MyCfnFunction")
     * .code(CodeProperty.builder()
     * .imageUri("imageUri")
     * .s3Bucket("s3Bucket")
     * .s3Key("s3Key")
     * .s3ObjectVersion("s3ObjectVersion")
     * .zipFile("zipFile")
     * .build())
     * .role("role")
     * // the properties below are optional
     * .architectures(List.of("architectures"))
     * .codeSigningConfigArn("codeSigningConfigArn")
     * .deadLetterConfig(DeadLetterConfigProperty.builder()
     * .targetArn("targetArn")
     * .build())
     * .description("description")
     * .environment(EnvironmentProperty.builder()
     * .variables(Map.of(
     * "variablesKey", "variables"))
     * .build())
     * .ephemeralStorage(EphemeralStorageProperty.builder()
     * .size(123)
     * .build())
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
     * .kmsKeyArn("kmsKeyArn")
     * .layers(List.of("layers"))
     * .memorySize(123)
     * .packageType("packageType")
     * .reservedConcurrentExecutions(123)
     * .runtime("runtime")
     * .runtimeManagementConfig(RuntimeManagementConfigProperty.builder()
     * .updateRuntimeOn("updateRuntimeOn")
     * // the properties below are optional
     * .runtimeVersionArn("runtimeVersionArn")
     * .build())
     * .snapStart(SnapStartProperty.builder()
     * .applyOn("applyOn")
     * .build())
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .timeout(123)
     * .tracingConfig(TracingConfigProperty.builder()
     * .mode("mode")
     * .build())
     * .vpcConfig(VpcConfigProperty.builder()
     * .securityGroupIds(List.of("securityGroupIds"))
     * .subnetIds(List.of("subnetIds"))
     * .build())
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-function.html)
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
     * The
     * [deployment package](https://docs.aws.amazon.com/lambda/latest/dg/gettingstarted-package.html)
     * for a Lambda function. To deploy a function defined as a container image, you specify the
     * location of a container image in the Amazon ECR registry. For a .zip file deployment package,
     * you can specify the location of an object in Amazon S3. For Node.js and Python functions, you
     * can specify the function code inline in the template.
     *
     * Changes to a deployment package in Amazon S3 are not detected automatically during stack
     * updates. To update the function code, change the object key or version in the template.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.lambda.*;
     * CodeProperty codeProperty = CodeProperty.builder()
     * .imageUri("imageUri")
     * .s3Bucket("s3Bucket")
     * .s3Key("s3Key")
     * .s3ObjectVersion("s3ObjectVersion")
     * .zipFile("zipFile")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lambda-function-code.html)
     */
    public inline fun cfnFunctionCodeProperty(
        block: CfnFunctionCodePropertyDsl.() -> Unit = {}
    ): CfnFunction.CodeProperty {
        val builder = CfnFunctionCodePropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The
     * [dead-letter queue](https://docs.aws.amazon.com/lambda/latest/dg/invocation-async.html#dlq)
     * for failed asynchronous invocations.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.lambda.*;
     * DeadLetterConfigProperty deadLetterConfigProperty = DeadLetterConfigProperty.builder()
     * .targetArn("targetArn")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lambda-function-deadletterconfig.html)
     */
    public inline fun cfnFunctionDeadLetterConfigProperty(
        block: CfnFunctionDeadLetterConfigPropertyDsl.() -> Unit = {}
    ): CfnFunction.DeadLetterConfigProperty {
        val builder = CfnFunctionDeadLetterConfigPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * A function's environment variable settings.
     *
     * You can use environment variables to adjust your function's behavior without updating code.
     * An environment variable is a pair of strings that are stored in a function's version-specific
     * configuration.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.lambda.*;
     * EnvironmentProperty environmentProperty = EnvironmentProperty.builder()
     * .variables(Map.of(
     * "variablesKey", "variables"))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lambda-function-environment.html)
     */
    public inline fun cfnFunctionEnvironmentProperty(
        block: CfnFunctionEnvironmentPropertyDsl.() -> Unit = {}
    ): CfnFunction.EnvironmentProperty {
        val builder = CfnFunctionEnvironmentPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The size of the function's `/tmp` directory in MB.
     *
     * The default value is 512, but it can be any whole number between 512 and 10,240 MB.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.lambda.*;
     * EphemeralStorageProperty ephemeralStorageProperty = EphemeralStorageProperty.builder()
     * .size(123)
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lambda-function-ephemeralstorage.html)
     */
    public inline fun cfnFunctionEphemeralStorageProperty(
        block: CfnFunctionEphemeralStoragePropertyDsl.() -> Unit = {}
    ): CfnFunction.EphemeralStorageProperty {
        val builder = CfnFunctionEphemeralStoragePropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Details about the connection between a Lambda function and an
     * [Amazon EFS file system](https://docs.aws.amazon.com/lambda/latest/dg/configuration-filesystem.html)
     * .
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.lambda.*;
     * FileSystemConfigProperty fileSystemConfigProperty = FileSystemConfigProperty.builder()
     * .arn("arn")
     * .localMountPath("localMountPath")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lambda-function-filesystemconfig.html)
     */
    public inline fun cfnFunctionFileSystemConfigProperty(
        block: CfnFunctionFileSystemConfigPropertyDsl.() -> Unit = {}
    ): CfnFunction.FileSystemConfigProperty {
        val builder = CfnFunctionFileSystemConfigPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Configuration values that override the container image Dockerfile settings.
     *
     * For more information, see
     * [Container image settings](https://docs.aws.amazon.com/lambda/latest/dg/images-create.html#images-parms)
     * .
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.lambda.*;
     * ImageConfigProperty imageConfigProperty = ImageConfigProperty.builder()
     * .command(List.of("command"))
     * .entryPoint(List.of("entryPoint"))
     * .workingDirectory("workingDirectory")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lambda-function-imageconfig.html)
     */
    public inline fun cfnFunctionImageConfigProperty(
        block: CfnFunctionImageConfigPropertyDsl.() -> Unit = {}
    ): CfnFunction.ImageConfigProperty {
        val builder = CfnFunctionImageConfigPropertyDsl()
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
     * import software.amazon.awscdk.services.lambda.*;
     * CfnFunctionProps cfnFunctionProps = CfnFunctionProps.builder()
     * .code(CodeProperty.builder()
     * .imageUri("imageUri")
     * .s3Bucket("s3Bucket")
     * .s3Key("s3Key")
     * .s3ObjectVersion("s3ObjectVersion")
     * .zipFile("zipFile")
     * .build())
     * .role("role")
     * // the properties below are optional
     * .architectures(List.of("architectures"))
     * .codeSigningConfigArn("codeSigningConfigArn")
     * .deadLetterConfig(DeadLetterConfigProperty.builder()
     * .targetArn("targetArn")
     * .build())
     * .description("description")
     * .environment(EnvironmentProperty.builder()
     * .variables(Map.of(
     * "variablesKey", "variables"))
     * .build())
     * .ephemeralStorage(EphemeralStorageProperty.builder()
     * .size(123)
     * .build())
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
     * .kmsKeyArn("kmsKeyArn")
     * .layers(List.of("layers"))
     * .memorySize(123)
     * .packageType("packageType")
     * .reservedConcurrentExecutions(123)
     * .runtime("runtime")
     * .runtimeManagementConfig(RuntimeManagementConfigProperty.builder()
     * .updateRuntimeOn("updateRuntimeOn")
     * // the properties below are optional
     * .runtimeVersionArn("runtimeVersionArn")
     * .build())
     * .snapStart(SnapStartProperty.builder()
     * .applyOn("applyOn")
     * .build())
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .timeout(123)
     * .tracingConfig(TracingConfigProperty.builder()
     * .mode("mode")
     * .build())
     * .vpcConfig(VpcConfigProperty.builder()
     * .securityGroupIds(List.of("securityGroupIds"))
     * .subnetIds(List.of("subnetIds"))
     * .build())
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-function.html)
     */
    public inline fun cfnFunctionProps(
        block: CfnFunctionPropsDsl.() -> Unit = {}
    ): CfnFunctionProps {
        val builder = CfnFunctionPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Sets the runtime management configuration for a function's version.
     *
     * For more information, see
     * [Runtime updates](https://docs.aws.amazon.com/lambda/latest/dg/runtimes-update.html) .
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.lambda.*;
     * RuntimeManagementConfigProperty runtimeManagementConfigProperty =
     * RuntimeManagementConfigProperty.builder()
     * .updateRuntimeOn("updateRuntimeOn")
     * // the properties below are optional
     * .runtimeVersionArn("runtimeVersionArn")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lambda-function-runtimemanagementconfig.html)
     */
    public inline fun cfnFunctionRuntimeManagementConfigProperty(
        block: CfnFunctionRuntimeManagementConfigPropertyDsl.() -> Unit = {}
    ): CfnFunction.RuntimeManagementConfigProperty {
        val builder = CfnFunctionRuntimeManagementConfigPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The function's
     * [AWS Lambda SnapStart](https://docs.aws.amazon.com/lambda/latest/dg/snapstart.html) setting.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.lambda.*;
     * SnapStartProperty snapStartProperty = SnapStartProperty.builder()
     * .applyOn("applyOn")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lambda-function-snapstart.html)
     */
    public inline fun cfnFunctionSnapStartProperty(
        block: CfnFunctionSnapStartPropertyDsl.() -> Unit = {}
    ): CfnFunction.SnapStartProperty {
        val builder = CfnFunctionSnapStartPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The function's [SnapStart](https://docs.aws.amazon.com/lambda/latest/dg/snapstart.html)
     * setting.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.lambda.*;
     * SnapStartResponseProperty snapStartResponseProperty = SnapStartResponseProperty.builder()
     * .applyOn("applyOn")
     * .optimizationStatus("optimizationStatus")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lambda-function-snapstartresponse.html)
     */
    public inline fun cfnFunctionSnapStartResponseProperty(
        block: CfnFunctionSnapStartResponsePropertyDsl.() -> Unit = {}
    ): CfnFunction.SnapStartResponseProperty {
        val builder = CfnFunctionSnapStartResponsePropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The function's [AWS X-Ray](https://docs.aws.amazon.com/lambda/latest/dg/services-xray.html)
     * tracing configuration. To sample and record incoming requests, set `Mode` to `Active` .
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.lambda.*;
     * TracingConfigProperty tracingConfigProperty = TracingConfigProperty.builder()
     * .mode("mode")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lambda-function-tracingconfig.html)
     */
    public inline fun cfnFunctionTracingConfigProperty(
        block: CfnFunctionTracingConfigPropertyDsl.() -> Unit = {}
    ): CfnFunction.TracingConfigProperty {
        val builder = CfnFunctionTracingConfigPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The VPC security groups and subnets that are attached to a Lambda function.
     *
     * When you connect a function to a VPC, Lambda creates an elastic network interface for each
     * combination of security group and subnet in the function's VPC configuration. The function
     * can only access resources and the internet through that VPC. For more information, see
     * [VPC Settings](https://docs.aws.amazon.com/lambda/latest/dg/configuration-vpc.html) .
     *
     * When you delete a function, AWS CloudFormation monitors the state of its network interfaces
     * and waits for Lambda to delete them before proceeding. If the VPC is defined in the same
     * stack, the network interfaces need to be deleted by Lambda before AWS CloudFormation can
     * delete the VPC's resources.
     *
     * To monitor network interfaces, AWS CloudFormation needs the `ec2:DescribeNetworkInterfaces`
     * permission. It obtains this from the user or role that modifies the stack. If you don't
     * provide this permission, AWS CloudFormation does not wait for network interfaces to be
     * deleted.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.lambda.*;
     * VpcConfigProperty vpcConfigProperty = VpcConfigProperty.builder()
     * .securityGroupIds(List.of("securityGroupIds"))
     * .subnetIds(List.of("subnetIds"))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lambda-function-vpcconfig.html)
     */
    public inline fun cfnFunctionVpcConfigProperty(
        block: CfnFunctionVpcConfigPropertyDsl.() -> Unit = {}
    ): CfnFunction.VpcConfigProperty {
        val builder = CfnFunctionVpcConfigPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The `AWS::Lambda::LayerVersion` resource creates a
     * [Lambda layer](https://docs.aws.amazon.com/lambda/latest/dg/configuration-layers.html) from a
     * ZIP archive.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.lambda.*;
     * CfnLayerVersion cfnLayerVersion = CfnLayerVersion.Builder.create(this, "MyCfnLayerVersion")
     * .content(ContentProperty.builder()
     * .s3Bucket("s3Bucket")
     * .s3Key("s3Key")
     * // the properties below are optional
     * .s3ObjectVersion("s3ObjectVersion")
     * .build())
     * // the properties below are optional
     * .compatibleArchitectures(List.of("compatibleArchitectures"))
     * .compatibleRuntimes(List.of("compatibleRuntimes"))
     * .description("description")
     * .layerName("layerName")
     * .licenseInfo("licenseInfo")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-layerversion.html)
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
     * A ZIP archive that contains the contents of an
     * [Lambda layer](https://docs.aws.amazon.com/lambda/latest/dg/configuration-layers.html) .
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.lambda.*;
     * ContentProperty contentProperty = ContentProperty.builder()
     * .s3Bucket("s3Bucket")
     * .s3Key("s3Key")
     * // the properties below are optional
     * .s3ObjectVersion("s3ObjectVersion")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lambda-layerversion-content.html)
     */
    public inline fun cfnLayerVersionContentProperty(
        block: CfnLayerVersionContentPropertyDsl.() -> Unit = {}
    ): CfnLayerVersion.ContentProperty {
        val builder = CfnLayerVersionContentPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The `AWS::Lambda::LayerVersionPermission` resource adds permissions to the resource-based
     * policy of a version of an
     * [Lambda layer](https://docs.aws.amazon.com/lambda/latest/dg/configuration-layers.html) . Use
     * this action to grant layer usage permission to other accounts. You can grant permission to a
     * single account, all AWS accounts, or all accounts in an organization.
     *
     * Since the release of the
     * [UpdateReplacePolicy](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-attribute-updatereplacepolicy.html)
     * both `UpdateReplacePolicy` and `DeletionPolicy` are required to protect your
     * Resources/LayerPermissions from deletion.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.lambda.*;
     * CfnLayerVersionPermission cfnLayerVersionPermission =
     * CfnLayerVersionPermission.Builder.create(this, "MyCfnLayerVersionPermission")
     * .action("action")
     * .layerVersionArn("layerVersionArn")
     * .principal("principal")
     * // the properties below are optional
     * .organizationId("organizationId")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-layerversionpermission.html)
     */
    public inline fun cfnLayerVersionPermission(
        scope: Construct,
        id: String,
        block: CfnLayerVersionPermissionDsl.() -> Unit = {},
    ): CfnLayerVersionPermission {
        val builder = CfnLayerVersionPermissionDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnLayerVersionPermission`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.lambda.*;
     * CfnLayerVersionPermissionProps cfnLayerVersionPermissionProps =
     * CfnLayerVersionPermissionProps.builder()
     * .action("action")
     * .layerVersionArn("layerVersionArn")
     * .principal("principal")
     * // the properties below are optional
     * .organizationId("organizationId")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-layerversionpermission.html)
     */
    public inline fun cfnLayerVersionPermissionProps(
        block: CfnLayerVersionPermissionPropsDsl.() -> Unit = {}
    ): CfnLayerVersionPermissionProps {
        val builder = CfnLayerVersionPermissionPropsDsl()
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
     * import software.amazon.awscdk.services.lambda.*;
     * CfnLayerVersionProps cfnLayerVersionProps = CfnLayerVersionProps.builder()
     * .content(ContentProperty.builder()
     * .s3Bucket("s3Bucket")
     * .s3Key("s3Key")
     * // the properties below are optional
     * .s3ObjectVersion("s3ObjectVersion")
     * .build())
     * // the properties below are optional
     * .compatibleArchitectures(List.of("compatibleArchitectures"))
     * .compatibleRuntimes(List.of("compatibleRuntimes"))
     * .description("description")
     * .layerName("layerName")
     * .licenseInfo("licenseInfo")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-layerversion.html)
     */
    public inline fun cfnLayerVersionProps(
        block: CfnLayerVersionPropsDsl.() -> Unit = {}
    ): CfnLayerVersionProps {
        val builder = CfnLayerVersionPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Lambda code defined using 2 CloudFormation parameters.
     *
     * Useful when you don't have access to the code of your Lambda from your CDK code, so you can't
     * use Assets, and you want to deploy the Lambda in a CodePipeline, using CloudFormation
     * Actions - you can fill the parameters using the `#assign` method.
     *
     * Example:
     * ```
     * Stack lambdaStack = new Stack(app, "LambdaStack");
     * CfnParametersCode lambdaCode = Code.fromCfnParameters();
     * Function.Builder.create(lambdaStack, "Lambda")
     * .code(lambdaCode)
     * .handler("index.handler")
     * .runtime(Runtime.NODEJS_14_X)
     * .build();
     * // other resources that your Lambda needs, added to the lambdaStack...
     * Stack pipelineStack = new Stack(app, "PipelineStack");
     * Pipeline pipeline = new Pipeline(pipelineStack, "Pipeline");
     * // add the source code repository containing this code to your Pipeline,
     * // and the source code of the Lambda Function, if they're separate
     * Artifact cdkSourceOutput = new Artifact();
     * CodeCommitSourceAction cdkSourceAction = CodeCommitSourceAction.Builder.create()
     * .repository(Repository.Builder.create(pipelineStack, "CdkCodeRepo")
     * .repositoryName("CdkCodeRepo")
     * .build())
     * .actionName("CdkCode_Source")
     * .output(cdkSourceOutput)
     * .build();
     * Artifact lambdaSourceOutput = new Artifact();
     * CodeCommitSourceAction lambdaSourceAction = CodeCommitSourceAction.Builder.create()
     * .repository(Repository.Builder.create(pipelineStack, "LambdaCodeRepo")
     * .repositoryName("LambdaCodeRepo")
     * .build())
     * .actionName("LambdaCode_Source")
     * .output(lambdaSourceOutput)
     * .build();
     * pipeline.addStage(StageOptions.builder()
     * .stageName("Source")
     * .actions(List.of(cdkSourceAction, lambdaSourceAction))
     * .build());
     * // synthesize the Lambda CDK template, using CodeBuild
     * // the below values are just examples, assuming your CDK code is in TypeScript/JavaScript -
     * // adjust the build environment and/or commands accordingly
     * Project cdkBuildProject = Project.Builder.create(pipelineStack, "CdkBuildProject")
     * .environment(BuildEnvironment.builder()
     * .buildImage(LinuxBuildImage.UBUNTU_14_04_NODEJS_10_1_0)
     * .build())
     * .buildSpec(BuildSpec.fromObject(Map.of(
     * "version", "0.2",
     * "phases", Map.of(
     * "install", Map.of(
     * "commands", "npm install"),
     * "build", Map.of(
     * "commands", List.of("npm run build", "npm run cdk synth LambdaStack -- -o ."))),
     * "artifacts", Map.of(
     * "files", "LambdaStack.template.yaml"))))
     * .build();
     * Artifact cdkBuildOutput = new Artifact();
     * CodeBuildAction cdkBuildAction = CodeBuildAction.Builder.create()
     * .actionName("CDK_Build")
     * .project(cdkBuildProject)
     * .input(cdkSourceOutput)
     * .outputs(List.of(cdkBuildOutput))
     * .build();
     * // build your Lambda code, using CodeBuild
     * // again, this example assumes your Lambda is written in TypeScript/JavaScript -
     * // make sure to adjust the build environment and/or commands if they don't match your specific
     * situation
     * Project lambdaBuildProject = Project.Builder.create(pipelineStack, "LambdaBuildProject")
     * .environment(BuildEnvironment.builder()
     * .buildImage(LinuxBuildImage.UBUNTU_14_04_NODEJS_10_1_0)
     * .build())
     * .buildSpec(BuildSpec.fromObject(Map.of(
     * "version", "0.2",
     * "phases", Map.of(
     * "install", Map.of(
     * "commands", "npm install"),
     * "build", Map.of(
     * "commands", "npm run build")),
     * "artifacts", Map.of(
     * "files", List.of("index.js", "node_modules/ **&#47;*")))))
     * .build();
     * Artifact lambdaBuildOutput = new Artifact();
     * CodeBuildAction lambdaBuildAction = CodeBuildAction.Builder.create()
     * .actionName("Lambda_Build")
     * .project(lambdaBuildProject)
     * .input(lambdaSourceOutput)
     * .outputs(List.of(lambdaBuildOutput))
     * .build();
     * pipeline.addStage(StageOptions.builder()
     * .stageName("Build")
     * .actions(List.of(cdkBuildAction, lambdaBuildAction))
     * .build());
     * // finally, deploy your Lambda Stack
     * pipeline.addStage(StageOptions.builder()
     * .stageName("Deploy")
     * .actions(List.of(
     * CloudFormationCreateUpdateStackAction.Builder.create()
     * .actionName("Lambda_CFN_Deploy")
     * .templatePath(cdkBuildOutput.atPath("LambdaStack.template.yaml"))
     * .stackName("LambdaStackDeployedName")
     * .adminPermissions(true)
     * .parameterOverrides(lambdaCode.assign(lambdaBuildOutput.getS3Location()))
     * .extraInputs(List.of(lambdaBuildOutput))
     * .build()))
     * .build());
     * ```
     */
    public inline fun cfnParametersCode(
        block: CfnParametersCodeDsl.() -> Unit = {}
    ): CfnParametersCode {
        val builder = CfnParametersCodeDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Construction properties for `CfnParametersCode`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.*;
     * import software.amazon.awscdk.services.lambda.*;
     * CfnParameter cfnParameter;
     * CfnParametersCodeProps cfnParametersCodeProps = CfnParametersCodeProps.builder()
     * .bucketNameParam(cfnParameter)
     * .objectKeyParam(cfnParameter)
     * .build();
     * ```
     */
    public inline fun cfnParametersCodeProps(
        block: CfnParametersCodePropsDsl.() -> Unit = {}
    ): CfnParametersCodeProps {
        val builder = CfnParametersCodePropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The `AWS::Lambda::Permission` resource grants an AWS service or another account permission to
     * use a function.
     *
     * You can apply the policy at the function level, or specify a qualifier to restrict access to
     * a single version or alias. If you use a qualifier, the invoker must use the full Amazon
     * Resource Name (ARN) of that version or alias to invoke the function.
     *
     * To grant permission to another account, specify the account ID as the `Principal` . To grant
     * permission to an organization defined in AWS Organizations , specify the organization ID as
     * the `PrincipalOrgID` . For AWS services, the principal is a domain-style identifier defined
     * by the service, like `s3.amazonaws.com` or `sns.amazonaws.com` . For AWS services, you can
     * also specify the ARN of the associated resource as the `SourceArn` . If you grant permission
     * to a service principal without specifying the source, other accounts could potentially
     * configure resources in their account to invoke your Lambda function.
     *
     * If your function has a function URL, you can specify the `FunctionUrlAuthType` parameter.
     * This adds a condition to your permission that only applies when your function URL's
     * `AuthType` matches the specified `FunctionUrlAuthType` . For more information about the
     * `AuthType` parameter, see
     * [Security and auth model for Lambda function URLs](https://docs.aws.amazon.com/lambda/latest/dg/urls-auth.html)
     * .
     *
     * This resource adds a statement to a resource-based permission policy for the function. For
     * more information about function policies, see
     * [Lambda Function Policies](https://docs.aws.amazon.com/lambda/latest/dg/access-control-resource-based.html)
     * .
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.lambda.*;
     * CfnPermission cfnPermission = CfnPermission.Builder.create(this, "MyCfnPermission")
     * .action("action")
     * .functionName("functionName")
     * .principal("principal")
     * // the properties below are optional
     * .eventSourceToken("eventSourceToken")
     * .functionUrlAuthType("functionUrlAuthType")
     * .principalOrgId("principalOrgId")
     * .sourceAccount("sourceAccount")
     * .sourceArn("sourceArn")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-permission.html)
     */
    public inline fun cfnPermission(
        scope: Construct,
        id: String,
        block: CfnPermissionDsl.() -> Unit = {},
    ): CfnPermission {
        val builder = CfnPermissionDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnPermission`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.lambda.*;
     * CfnPermissionProps cfnPermissionProps = CfnPermissionProps.builder()
     * .action("action")
     * .functionName("functionName")
     * .principal("principal")
     * // the properties below are optional
     * .eventSourceToken("eventSourceToken")
     * .functionUrlAuthType("functionUrlAuthType")
     * .principalOrgId("principalOrgId")
     * .sourceAccount("sourceAccount")
     * .sourceArn("sourceArn")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-permission.html)
     */
    public inline fun cfnPermissionProps(
        block: CfnPermissionPropsDsl.() -> Unit = {}
    ): CfnPermissionProps {
        val builder = CfnPermissionPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The `AWS::Lambda::Url` resource creates a function URL with the specified configuration
     * parameters.
     *
     * A [function URL](https://docs.aws.amazon.com/lambda/latest/dg/lambda-urls.html) is a
     * dedicated HTTP(S) endpoint that you can use to invoke your function.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.lambda.*;
     * CfnUrl cfnUrl = CfnUrl.Builder.create(this, "MyCfnUrl")
     * .authType("authType")
     * .targetFunctionArn("targetFunctionArn")
     * // the properties below are optional
     * .cors(CorsProperty.builder()
     * .allowCredentials(false)
     * .allowHeaders(List.of("allowHeaders"))
     * .allowMethods(List.of("allowMethods"))
     * .allowOrigins(List.of("allowOrigins"))
     * .exposeHeaders(List.of("exposeHeaders"))
     * .maxAge(123)
     * .build())
     * .invokeMode("invokeMode")
     * .qualifier("qualifier")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-url.html)
     */
    public inline fun cfnUrl(
        scope: Construct,
        id: String,
        block: CfnUrlDsl.() -> Unit = {},
    ): CfnUrl {
        val builder = CfnUrlDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * The
     * [Cross-Origin Resource Sharing (CORS)](https://docs.aws.amazon.com/https://developer.mozilla.org/en-US/docs/Web/HTTP/CORS)
     * settings for your function URL. Use CORS to grant access to your function URL from any
     * origin. You can also use CORS to control access for specific HTTP headers and methods in
     * requests to your function URL.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.lambda.*;
     * CorsProperty corsProperty = CorsProperty.builder()
     * .allowCredentials(false)
     * .allowHeaders(List.of("allowHeaders"))
     * .allowMethods(List.of("allowMethods"))
     * .allowOrigins(List.of("allowOrigins"))
     * .exposeHeaders(List.of("exposeHeaders"))
     * .maxAge(123)
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lambda-url-cors.html)
     */
    public inline fun cfnUrlCorsProperty(
        block: CfnUrlCorsPropertyDsl.() -> Unit = {}
    ): CfnUrl.CorsProperty {
        val builder = CfnUrlCorsPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnUrl`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.lambda.*;
     * CfnUrlProps cfnUrlProps = CfnUrlProps.builder()
     * .authType("authType")
     * .targetFunctionArn("targetFunctionArn")
     * // the properties below are optional
     * .cors(CorsProperty.builder()
     * .allowCredentials(false)
     * .allowHeaders(List.of("allowHeaders"))
     * .allowMethods(List.of("allowMethods"))
     * .allowOrigins(List.of("allowOrigins"))
     * .exposeHeaders(List.of("exposeHeaders"))
     * .maxAge(123)
     * .build())
     * .invokeMode("invokeMode")
     * .qualifier("qualifier")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-url.html)
     */
    public inline fun cfnUrlProps(block: CfnUrlPropsDsl.() -> Unit = {}): CfnUrlProps {
        val builder = CfnUrlPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The `AWS::Lambda::Version` resource creates a
     * [version](https://docs.aws.amazon.com/lambda/latest/dg/versioning-aliases.html) from the
     * current code and configuration of a function. Use versions to create a snapshot of your
     * function code and configuration that doesn't change.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.lambda.*;
     * CfnVersion cfnVersion = CfnVersion.Builder.create(this, "MyCfnVersion")
     * .functionName("functionName")
     * // the properties below are optional
     * .codeSha256("codeSha256")
     * .description("description")
     * .provisionedConcurrencyConfig(ProvisionedConcurrencyConfigurationProperty.builder()
     * .provisionedConcurrentExecutions(123)
     * .build())
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-version.html)
     */
    public inline fun cfnVersion(
        scope: Construct,
        id: String,
        block: CfnVersionDsl.() -> Unit = {},
    ): CfnVersion {
        val builder = CfnVersionDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnVersion`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.lambda.*;
     * CfnVersionProps cfnVersionProps = CfnVersionProps.builder()
     * .functionName("functionName")
     * // the properties below are optional
     * .codeSha256("codeSha256")
     * .description("description")
     * .provisionedConcurrencyConfig(ProvisionedConcurrencyConfigurationProperty.builder()
     * .provisionedConcurrentExecutions(123)
     * .build())
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-version.html)
     */
    public inline fun cfnVersionProps(block: CfnVersionPropsDsl.() -> Unit = {}): CfnVersionProps {
        val builder = CfnVersionPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * A
     * [provisioned concurrency](https://docs.aws.amazon.com/lambda/latest/dg/configuration-concurrency.html)
     * configuration for a function's version.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.lambda.*;
     * ProvisionedConcurrencyConfigurationProperty provisionedConcurrencyConfigurationProperty =
     * ProvisionedConcurrencyConfigurationProperty.builder()
     * .provisionedConcurrentExecutions(123)
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lambda-version-provisionedconcurrencyconfiguration.html)
     */
    public inline fun cfnVersionProvisionedConcurrencyConfigurationProperty(
        block: CfnVersionProvisionedConcurrencyConfigurationPropertyDsl.() -> Unit = {}
    ): CfnVersion.ProvisionedConcurrencyConfigurationProperty {
        val builder = CfnVersionProvisionedConcurrencyConfigurationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Result of binding `Code` into a `Function`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.lambda.*;
     * CodeConfig codeConfig = CodeConfig.builder()
     * .image(CodeImageConfig.builder()
     * .imageUri("imageUri")
     * // the properties below are optional
     * .cmd(List.of("cmd"))
     * .entrypoint(List.of("entrypoint"))
     * .workingDirectory("workingDirectory")
     * .build())
     * .inlineCode("inlineCode")
     * .s3Location(Location.builder()
     * .bucketName("bucketName")
     * .objectKey("objectKey")
     * // the properties below are optional
     * .objectVersion("objectVersion")
     * .build())
     * .build();
     * ```
     */
    public inline fun codeConfig(block: CodeConfigDsl.() -> Unit = {}): CodeConfig {
        val builder = CodeConfigDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Result of the bind when an ECR image is used.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.lambda.*;
     * CodeImageConfig codeImageConfig = CodeImageConfig.builder()
     * .imageUri("imageUri")
     * // the properties below are optional
     * .cmd(List.of("cmd"))
     * .entrypoint(List.of("entrypoint"))
     * .workingDirectory("workingDirectory")
     * .build();
     * ```
     */
    public inline fun codeImageConfig(block: CodeImageConfigDsl.() -> Unit = {}): CodeImageConfig {
        val builder = CodeImageConfigDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Defines a Code Signing Config.
     *
     * Example:
     * ```
     * import software.amazon.awscdk.services.signer.*;
     * SigningProfile signingProfile = SigningProfile.Builder.create(this, "SigningProfile")
     * .platform(Platform.AWS_LAMBDA_SHA384_ECDSA)
     * .build();
     * CodeSigningConfig codeSigningConfig = CodeSigningConfig.Builder.create(this,
     * "CodeSigningConfig")
     * .signingProfiles(List.of(signingProfile))
     * .build();
     * Function.Builder.create(this, "Function")
     * .codeSigningConfig(codeSigningConfig)
     * .runtime(Runtime.NODEJS_18_X)
     * .handler("index.handler")
     * .code(Code.fromAsset(join(__dirname, "lambda-handler")))
     * .build();
     * ```
     */
    public inline fun codeSigningConfig(
        scope: Construct,
        id: String,
        block: CodeSigningConfigDsl.() -> Unit = {},
    ): CodeSigningConfig {
        val builder = CodeSigningConfigDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Construction properties for a Code Signing Config object.
     *
     * Example:
     * ```
     * import software.amazon.awscdk.services.signer.*;
     * SigningProfile signingProfile = SigningProfile.Builder.create(this, "SigningProfile")
     * .platform(Platform.AWS_LAMBDA_SHA384_ECDSA)
     * .build();
     * CodeSigningConfig codeSigningConfig = CodeSigningConfig.Builder.create(this,
     * "CodeSigningConfig")
     * .signingProfiles(List.of(signingProfile))
     * .build();
     * Function.Builder.create(this, "Function")
     * .codeSigningConfig(codeSigningConfig)
     * .runtime(Runtime.NODEJS_18_X)
     * .handler("index.handler")
     * .code(Code.fromAsset(join(__dirname, "lambda-handler")))
     * .build();
     * ```
     */
    public inline fun codeSigningConfigProps(
        block: CodeSigningConfigPropsDsl.() -> Unit = {}
    ): CodeSigningConfigProps {
        val builder = CodeSigningConfigPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * A destination configuration.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.lambda.*;
     * DestinationConfig destinationConfig = DestinationConfig.builder()
     * .destination("destination")
     * .build();
     * ```
     */
    public inline fun destinationConfig(
        block: DestinationConfigDsl.() -> Unit = {}
    ): DestinationConfig {
        val builder = DestinationConfigDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Options when binding a destination to a function.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.lambda.*;
     * DestinationOptions destinationOptions = DestinationOptions.builder()
     * .type(DestinationType.FAILURE)
     * .build();
     * ```
     */
    public inline fun destinationOptions(
        block: DestinationOptionsDsl.() -> Unit = {}
    ): DestinationOptions {
        val builder = DestinationOptionsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * A destination configuration.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.lambda.*;
     * DlqDestinationConfig dlqDestinationConfig = DlqDestinationConfig.builder()
     * .destination("destination")
     * .build();
     * ```
     */
    public inline fun dlqDestinationConfig(
        block: DlqDestinationConfigDsl.() -> Unit = {}
    ): DlqDestinationConfig {
        val builder = DlqDestinationConfigDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Options when creating an asset from a Docker build.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.lambda.*;
     * DockerBuildAssetOptions dockerBuildAssetOptions = DockerBuildAssetOptions.builder()
     * .buildArgs(Map.of(
     * "buildArgsKey", "buildArgs"))
     * .file("file")
     * .imagePath("imagePath")
     * .outputPath("outputPath")
     * .platform("platform")
     * .targetStage("targetStage")
     * .build();
     * ```
     */
    public inline fun dockerBuildAssetOptions(
        block: DockerBuildAssetOptionsDsl.() -> Unit = {}
    ): DockerBuildAssetOptions {
        val builder = DockerBuildAssetOptionsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Create a lambda function where the handler is a docker image.
     *
     * Example:
     * ```
     * DockerImageFunction.Builder.create(this, "AssetFunction")
     * .code(DockerImageCode.fromImageAsset(join(__dirname, "docker-handler")))
     * .build();
     * ```
     */
    public inline fun dockerImageFunction(
        scope: Construct,
        id: String,
        block: DockerImageFunctionDsl.() -> Unit = {},
    ): DockerImageFunction {
        val builder = DockerImageFunctionDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties to configure a new DockerImageFunction construct.
     *
     * Example:
     * ```
     * DockerImageFunction.Builder.create(this, "AssetFunction")
     * .code(DockerImageCode.fromImageAsset(join(__dirname, "docker-handler")))
     * .build();
     * ```
     */
    public inline fun dockerImageFunctionProps(
        block: DockerImageFunctionPropsDsl.() -> Unit = {}
    ): DockerImageFunctionProps {
        val builder = DockerImageFunctionPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Represents a Docker image in ECR that can be bound as Lambda Code.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.ecr.*;
     * import software.amazon.awscdk.services.lambda.*;
     * Repository repository;
     * EcrImageCode ecrImageCode = EcrImageCode.Builder.create(repository)
     * .cmd(List.of("cmd"))
     * .entrypoint(List.of("entrypoint"))
     * .tag("tag")
     * .tagOrDigest("tagOrDigest")
     * .workingDirectory("workingDirectory")
     * .build();
     * ```
     */
    public inline fun ecrImageCode(
        repository: IRepository,
        block: EcrImageCodeDsl.() -> Unit = {}
    ): EcrImageCode {
        val builder = EcrImageCodeDsl(repository)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties to initialize a new EcrImageCode.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.lambda.*;
     * EcrImageCodeProps ecrImageCodeProps = EcrImageCodeProps.builder()
     * .cmd(List.of("cmd"))
     * .entrypoint(List.of("entrypoint"))
     * .tag("tag")
     * .tagOrDigest("tagOrDigest")
     * .workingDirectory("workingDirectory")
     * .build();
     * ```
     */
    public inline fun ecrImageCodeProps(
        block: EcrImageCodePropsDsl.() -> Unit = {}
    ): EcrImageCodeProps {
        val builder = EcrImageCodePropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Environment variables options.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.lambda.*;
     * EnvironmentOptions environmentOptions = EnvironmentOptions.builder()
     * .removeInEdge(false)
     * .build();
     * ```
     */
    public inline fun environmentOptions(
        block: EnvironmentOptionsDsl.() -> Unit = {}
    ): EnvironmentOptions {
        val builder = EnvironmentOptionsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Configure options for asynchronous invocation on a version or an alias.
     *
     * By default, Lambda retries an asynchronous invocation twice if the function returns an error.
     * It retains events in a queue for up to six hours. When an event fails all processing attempts
     * or stays in the asynchronous invocation queue for too long, Lambda discards it.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.*;
     * import software.amazon.awscdk.services.lambda.*;
     * IDestination destination;
     * Function function_;
     * EventInvokeConfig eventInvokeConfig = EventInvokeConfig.Builder.create(this,
     * "MyEventInvokeConfig")
     * .function(function_)
     * // the properties below are optional
     * .maxEventAge(Duration.minutes(30))
     * .onFailure(destination)
     * .onSuccess(destination)
     * .qualifier("qualifier")
     * .retryAttempts(123)
     * .build();
     * ```
     */
    public inline fun eventInvokeConfig(
        scope: Construct,
        id: String,
        block: EventInvokeConfigDsl.() -> Unit = {},
    ): EventInvokeConfig {
        val builder = EventInvokeConfigDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Options to add an EventInvokeConfig to a function.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.*;
     * import software.amazon.awscdk.services.lambda.*;
     * IDestination destination;
     * EventInvokeConfigOptions eventInvokeConfigOptions = EventInvokeConfigOptions.builder()
     * .maxEventAge(Duration.minutes(30))
     * .onFailure(destination)
     * .onSuccess(destination)
     * .retryAttempts(123)
     * .build();
     * ```
     */
    public inline fun eventInvokeConfigOptions(
        block: EventInvokeConfigOptionsDsl.() -> Unit = {}
    ): EventInvokeConfigOptions {
        val builder = EventInvokeConfigOptionsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for an EventInvokeConfig.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.*;
     * import software.amazon.awscdk.services.lambda.*;
     * IDestination destination;
     * Function function_;
     * EventInvokeConfigProps eventInvokeConfigProps = EventInvokeConfigProps.builder()
     * .function(function_)
     * // the properties below are optional
     * .maxEventAge(Duration.minutes(30))
     * .onFailure(destination)
     * .onSuccess(destination)
     * .qualifier("qualifier")
     * .retryAttempts(123)
     * .build();
     * ```
     */
    public inline fun eventInvokeConfigProps(
        block: EventInvokeConfigPropsDsl.() -> Unit = {}
    ): EventInvokeConfigProps {
        val builder = EventInvokeConfigPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Defines a Lambda EventSourceMapping resource.
     *
     * Usually, you won't need to define the mapping yourself. This will usually be done by event
     * sources. For example, to add an SQS event source to a function:
     *
     * import { SqsEventSource } from 'aws-cdk-lib/aws-lambda-event-sources';
     * lambda.addEventSource(new SqsEventSource(sqs));
     *
     * The `SqsEventSource` class will automatically create the mapping, and will also modify the
     * Lambda's execution role so it can consume messages from the queue.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.*;
     * import software.amazon.awscdk.services.lambda.*;
     * IEventSourceDlq eventSourceDlq;
     * Object filters;
     * Function function_;
     * SourceAccessConfigurationType sourceAccessConfigurationType;
     * EventSourceMapping eventSourceMapping = EventSourceMapping.Builder.create(this,
     * "MyEventSourceMapping")
     * .target(function_)
     * // the properties below are optional
     * .batchSize(123)
     * .bisectBatchOnError(false)
     * .enabled(false)
     * .eventSourceArn("eventSourceArn")
     * .filters(List.of(Map.of(
     * "filtersKey", filters)))
     * .kafkaBootstrapServers(List.of("kafkaBootstrapServers"))
     * .kafkaConsumerGroupId("kafkaConsumerGroupId")
     * .kafkaTopic("kafkaTopic")
     * .maxBatchingWindow(Duration.minutes(30))
     * .maxConcurrency(123)
     * .maxRecordAge(Duration.minutes(30))
     * .onFailure(eventSourceDlq)
     * .parallelizationFactor(123)
     * .reportBatchItemFailures(false)
     * .retryAttempts(123)
     * .sourceAccessConfigurations(List.of(SourceAccessConfiguration.builder()
     * .type(sourceAccessConfigurationType)
     * .uri("uri")
     * .build()))
     * .startingPosition(StartingPosition.TRIM_HORIZON)
     * .startingPositionTimestamp(123)
     * .tumblingWindow(Duration.minutes(30))
     * .build();
     * ```
     */
    public inline fun eventSourceMapping(
        scope: Construct,
        id: String,
        block: EventSourceMappingDsl.() -> Unit = {},
    ): EventSourceMapping {
        val builder = EventSourceMappingDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.*;
     * import software.amazon.awscdk.services.lambda.*;
     * IEventSourceDlq eventSourceDlq;
     * Object filters;
     * SourceAccessConfigurationType sourceAccessConfigurationType;
     * EventSourceMappingOptions eventSourceMappingOptions = EventSourceMappingOptions.builder()
     * .batchSize(123)
     * .bisectBatchOnError(false)
     * .enabled(false)
     * .eventSourceArn("eventSourceArn")
     * .filters(List.of(Map.of(
     * "filtersKey", filters)))
     * .kafkaBootstrapServers(List.of("kafkaBootstrapServers"))
     * .kafkaConsumerGroupId("kafkaConsumerGroupId")
     * .kafkaTopic("kafkaTopic")
     * .maxBatchingWindow(Duration.minutes(30))
     * .maxConcurrency(123)
     * .maxRecordAge(Duration.minutes(30))
     * .onFailure(eventSourceDlq)
     * .parallelizationFactor(123)
     * .reportBatchItemFailures(false)
     * .retryAttempts(123)
     * .sourceAccessConfigurations(List.of(SourceAccessConfiguration.builder()
     * .type(sourceAccessConfigurationType)
     * .uri("uri")
     * .build()))
     * .startingPosition(StartingPosition.TRIM_HORIZON)
     * .startingPositionTimestamp(123)
     * .tumblingWindow(Duration.minutes(30))
     * .build();
     * ```
     */
    public inline fun eventSourceMappingOptions(
        block: EventSourceMappingOptionsDsl.() -> Unit = {}
    ): EventSourceMappingOptions {
        val builder = EventSourceMappingOptionsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for declaring a new event source mapping.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.*;
     * import software.amazon.awscdk.services.lambda.*;
     * IEventSourceDlq eventSourceDlq;
     * Object filters;
     * Function function_;
     * SourceAccessConfigurationType sourceAccessConfigurationType;
     * EventSourceMappingProps eventSourceMappingProps = EventSourceMappingProps.builder()
     * .target(function_)
     * // the properties below are optional
     * .batchSize(123)
     * .bisectBatchOnError(false)
     * .enabled(false)
     * .eventSourceArn("eventSourceArn")
     * .filters(List.of(Map.of(
     * "filtersKey", filters)))
     * .kafkaBootstrapServers(List.of("kafkaBootstrapServers"))
     * .kafkaConsumerGroupId("kafkaConsumerGroupId")
     * .kafkaTopic("kafkaTopic")
     * .maxBatchingWindow(Duration.minutes(30))
     * .maxConcurrency(123)
     * .maxRecordAge(Duration.minutes(30))
     * .onFailure(eventSourceDlq)
     * .parallelizationFactor(123)
     * .reportBatchItemFailures(false)
     * .retryAttempts(123)
     * .sourceAccessConfigurations(List.of(SourceAccessConfiguration.builder()
     * .type(sourceAccessConfigurationType)
     * .uri("uri")
     * .build()))
     * .startingPosition(StartingPosition.TRIM_HORIZON)
     * .startingPositionTimestamp(123)
     * .tumblingWindow(Duration.minutes(30))
     * .build();
     * ```
     */
    public inline fun eventSourceMappingProps(
        block: EventSourceMappingPropsDsl.() -> Unit = {}
    ): EventSourceMappingProps {
        val builder = EventSourceMappingPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * FileSystem configurations for the Lambda function.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.ec2.*;
     * import software.amazon.awscdk.services.iam.*;
     * import software.amazon.awscdk.services.lambda.*;
     * import software.constructs.*;
     * Connections connections;
     * IDependable dependable;
     * PolicyStatement policyStatement;
     * FileSystemConfig fileSystemConfig = FileSystemConfig.builder()
     * .arn("arn")
     * .localMountPath("localMountPath")
     * // the properties below are optional
     * .connections(connections)
     * .dependency(List.of(dependable))
     * .policies(List.of(policyStatement))
     * .build();
     * ```
     */
    public inline fun fileSystemConfig(
        block: FileSystemConfigDsl.() -> Unit = {}
    ): FileSystemConfig {
        val builder = FileSystemConfigDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Deploys a file from inside the construct library as a function.
     *
     * The supplied file is subject to the 4096 bytes limit of being embedded in a CloudFormation
     * template.
     *
     * The construct includes an associated role with the lambda.
     *
     * This construct does not yet reproduce all features from the underlying resource library.
     *
     * Example:
     * ```
     * import software.amazon.awscdk.services.signer.*;
     * SigningProfile signingProfile = SigningProfile.Builder.create(this, "SigningProfile")
     * .platform(Platform.AWS_LAMBDA_SHA384_ECDSA)
     * .build();
     * CodeSigningConfig codeSigningConfig = CodeSigningConfig.Builder.create(this,
     * "CodeSigningConfig")
     * .signingProfiles(List.of(signingProfile))
     * .build();
     * Function.Builder.create(this, "Function")
     * .codeSigningConfig(codeSigningConfig)
     * .runtime(Runtime.NODEJS_18_X)
     * .handler("index.handler")
     * .code(Code.fromAsset(join(__dirname, "lambda-handler")))
     * .build();
     * ```
     */
    public inline fun function(
        scope: Construct,
        id: String,
        block: FunctionDsl.() -> Unit = {},
    ): Function {
        val builder = FunctionDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Represents a Lambda function defined outside of this stack.
     *
     * Example:
     * ```
     * IFunction fn = Function.fromFunctionAttributes(this, "Function", FunctionAttributes.builder()
     * .functionArn("arn:aws:lambda:us-east-1:123456789012:function:MyFn")
     * // The following are optional properties for specific use cases and should be used with
     * caution:
     * // Use Case: imported function is in the same account as the stack. This tells the CDK that it
     * // can modify the function's permissions.
     * .sameEnvironment(true)
     * // Use Case: imported function is in a different account and user commits to ensuring that the
     * // imported function has the correct permissions outside the CDK.
     * .skipPermissions(true)
     * .build());
     * ```
     */
    public inline fun functionAttributes(
        block: FunctionAttributesDsl.() -> Unit = {}
    ): FunctionAttributes {
        val builder = FunctionAttributesDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Non runtime options.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.*;
     * import software.amazon.awscdk.services.codeguruprofiler.*;
     * import software.amazon.awscdk.services.ec2.*;
     * import software.amazon.awscdk.services.iam.*;
     * import software.amazon.awscdk.services.kms.*;
     * import software.amazon.awscdk.services.lambda.*;
     * import software.amazon.awscdk.services.logs.*;
     * import software.amazon.awscdk.services.sns.*;
     * import software.amazon.awscdk.services.sqs.*;
     * AdotLayerVersion adotLayerVersion;
     * Architecture architecture;
     * CodeSigningConfig codeSigningConfig;
     * IDestination destination;
     * IEventSource eventSource;
     * FileSystem fileSystem;
     * Key key;
     * LambdaInsightsVersion lambdaInsightsVersion;
     * LayerVersion layerVersion;
     * ParamsAndSecretsLayerVersion paramsAndSecretsLayerVersion;
     * PolicyStatement policyStatement;
     * ProfilingGroup profilingGroup;
     * Queue queue;
     * Role role;
     * RuntimeManagementMode runtimeManagementMode;
     * SecurityGroup securityGroup;
     * Size size;
     * Subnet subnet;
     * SubnetFilter subnetFilter;
     * Topic topic;
     * Vpc vpc;
     * FunctionOptions functionOptions = FunctionOptions.builder()
     * .adotInstrumentation(AdotInstrumentationConfig.builder()
     * .execWrapper(AdotLambdaExecWrapper.REGULAR_HANDLER)
     * .layerVersion(adotLayerVersion)
     * .build())
     * .allowAllOutbound(false)
     * .allowPublicSubnet(false)
     * .architecture(architecture)
     * .codeSigningConfig(codeSigningConfig)
     * .currentVersionOptions(VersionOptions.builder()
     * .codeSha256("codeSha256")
     * .description("description")
     * .maxEventAge(Duration.minutes(30))
     * .onFailure(destination)
     * .onSuccess(destination)
     * .provisionedConcurrentExecutions(123)
     * .removalPolicy(RemovalPolicy.DESTROY)
     * .retryAttempts(123)
     * .build())
     * .deadLetterQueue(queue)
     * .deadLetterQueueEnabled(false)
     * .deadLetterTopic(topic)
     * .description("description")
     * .environment(Map.of(
     * "environmentKey", "environment"))
     * .environmentEncryption(key)
     * .ephemeralStorageSize(size)
     * .events(List.of(eventSource))
     * .filesystem(fileSystem)
     * .functionName("functionName")
     * .initialPolicy(List.of(policyStatement))
     * .insightsVersion(lambdaInsightsVersion)
     * .layers(List.of(layerVersion))
     * .logRetention(RetentionDays.ONE_DAY)
     * .logRetentionRetryOptions(LogRetentionRetryOptions.builder()
     * .base(Duration.minutes(30))
     * .maxRetries(123)
     * .build())
     * .logRetentionRole(role)
     * .maxEventAge(Duration.minutes(30))
     * .memorySize(123)
     * .onFailure(destination)
     * .onSuccess(destination)
     * .paramsAndSecrets(paramsAndSecretsLayerVersion)
     * .profiling(false)
     * .profilingGroup(profilingGroup)
     * .reservedConcurrentExecutions(123)
     * .retryAttempts(123)
     * .role(role)
     * .runtimeManagementMode(runtimeManagementMode)
     * .securityGroups(List.of(securityGroup))
     * .timeout(Duration.minutes(30))
     * .tracing(Tracing.ACTIVE)
     * .vpc(vpc)
     * .vpcSubnets(SubnetSelection.builder()
     * .availabilityZones(List.of("availabilityZones"))
     * .onePerAz(false)
     * .subnetFilters(List.of(subnetFilter))
     * .subnetGroupName("subnetGroupName")
     * .subnets(List.of(subnet))
     * .subnetType(SubnetType.PRIVATE_ISOLATED)
     * .build())
     * .build();
     * ```
     */
    public inline fun functionOptions(block: FunctionOptionsDsl.() -> Unit = {}): FunctionOptions {
        val builder = FunctionOptionsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Example:
     * ```
     * import software.amazon.awscdk.services.lambda.*;
     * Function fn = Function.Builder.create(this, "MyFunc")
     * .runtime(Runtime.NODEJS_14_X)
     * .handler("index.handler")
     * .code(Code.fromInline("exports.handler = handler.toString()"))
     * .build();
     * Rule rule = Rule.Builder.create(this, "rule")
     * .eventPattern(EventPattern.builder()
     * .source(List.of("aws.ec2"))
     * .build())
     * .build();
     * Queue queue = new Queue(this, "Queue");
     * rule.addTarget(LambdaFunction.Builder.create(fn)
     * .deadLetterQueue(queue) // Optional: add a dead letter queue
     * .maxEventAge(Duration.hours(2)) // Optional: set the maxEventAge retry policy
     * .retryAttempts(2)
     * .build());
     * ```
     */
    public inline fun functionProps(block: FunctionPropsDsl.() -> Unit = {}): FunctionProps {
        val builder = FunctionPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Defines a Lambda function url.
     *
     * Example:
     * ```
     * // Can be a Function or an Alias
     * Function fn;
     * Role myRole;
     * FunctionUrl fnUrl = fn.addFunctionUrl();
     * fnUrl.grantInvokeUrl(myRole);
     * CfnOutput.Builder.create(this, "TheUrl")
     * // The .url attributes will return the unique Function URL
     * .value(fnUrl.getUrl())
     * .build();
     * ```
     */
    public inline fun functionUrl(
        scope: Construct,
        id: String,
        block: FunctionUrlDsl.() -> Unit = {},
    ): FunctionUrl {
        val builder = FunctionUrlDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Specifies a cross-origin access property for a function URL.
     *
     * Example:
     * ```
     * Function fn;
     * fn.addFunctionUrl(FunctionUrlOptions.builder()
     * .authType(FunctionUrlAuthType.NONE)
     * .cors(FunctionUrlCorsOptions.builder()
     * // Allow this to be called from websites on https://example.com.
     * // Can also be ['*'] to allow all domain.
     * .allowedOrigins(List.of("https://example.com"))
     * .build())
     * .build());
     * ```
     */
    public inline fun functionUrlCorsOptions(
        block: FunctionUrlCorsOptionsDsl.() -> Unit = {}
    ): FunctionUrlCorsOptions {
        val builder = FunctionUrlCorsOptionsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Options to add a url to a Lambda function.
     *
     * Example:
     * ```
     * Function fn;
     * fn.addFunctionUrl(FunctionUrlOptions.builder()
     * .authType(FunctionUrlAuthType.NONE)
     * .invokeMode(InvokeMode.RESPONSE_STREAM)
     * .build());
     * ```
     */
    public inline fun functionUrlOptions(
        block: FunctionUrlOptionsDsl.() -> Unit = {}
    ): FunctionUrlOptions {
        val builder = FunctionUrlOptionsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for a FunctionUrl.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.*;
     * import software.amazon.awscdk.services.lambda.*;
     * Function function_;
     * FunctionUrlProps functionUrlProps = FunctionUrlProps.builder()
     * .function(function_)
     * // the properties below are optional
     * .authType(FunctionUrlAuthType.AWS_IAM)
     * .cors(FunctionUrlCorsOptions.builder()
     * .allowCredentials(false)
     * .allowedHeaders(List.of("allowedHeaders"))
     * .allowedMethods(List.of(HttpMethod.GET))
     * .allowedOrigins(List.of("allowedOrigins"))
     * .exposedHeaders(List.of("exposedHeaders"))
     * .maxAge(Duration.minutes(30))
     * .build())
     * .invokeMode(InvokeMode.BUFFERED)
     * .build();
     * ```
     */
    public inline fun functionUrlProps(
        block: FunctionUrlPropsDsl.() -> Unit = {}
    ): FunctionUrlProps {
        val builder = FunctionUrlPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.lambda.*;
     * LambdaRuntimeProps lambdaRuntimeProps = LambdaRuntimeProps.builder()
     * .bundlingDockerImage("bundlingDockerImage")
     * .supportsCodeGuruProfiling(false)
     * .supportsInlineCode(false)
     * .build();
     * ```
     */
    public inline fun lambdaRuntimeProps(
        block: LambdaRuntimePropsDsl.() -> Unit = {}
    ): LambdaRuntimeProps {
        val builder = LambdaRuntimePropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Defines a new Lambda Layer version.
     *
     * Example:
     * ```
     * LayerVersion.Builder.create(this, "MyLayer")
     * .removalPolicy(RemovalPolicy.RETAIN)
     * .code(Code.fromAsset(join(__dirname, "lambda-handler")))
     * .compatibleArchitectures(List.of(Architecture.X86_64, Architecture.ARM_64))
     * .build();
     * ```
     */
    public inline fun layerVersion(
        scope: Construct,
        id: String,
        block: LayerVersionDsl.() -> Unit = {},
    ): LayerVersion {
        val builder = LayerVersionDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties necessary to import a LayerVersion.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.lambda.*;
     * Runtime runtime;
     * LayerVersionAttributes layerVersionAttributes = LayerVersionAttributes.builder()
     * .layerVersionArn("layerVersionArn")
     * // the properties below are optional
     * .compatibleRuntimes(List.of(runtime))
     * .build();
     * ```
     */
    public inline fun layerVersionAttributes(
        block: LayerVersionAttributesDsl.() -> Unit = {}
    ): LayerVersionAttributes {
        val builder = LayerVersionAttributesDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Non runtime options.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.*;
     * import software.amazon.awscdk.services.lambda.*;
     * LayerVersionOptions layerVersionOptions = LayerVersionOptions.builder()
     * .description("description")
     * .layerVersionName("layerVersionName")
     * .license("license")
     * .removalPolicy(RemovalPolicy.DESTROY)
     * .build();
     * ```
     */
    public inline fun layerVersionOptions(
        block: LayerVersionOptionsDsl.() -> Unit = {}
    ): LayerVersionOptions {
        val builder = LayerVersionOptionsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Identification of an account (or organization) that is allowed to access a Lambda Layer
     * Version.
     *
     * Example:
     * ```
     * LayerVersion layer = LayerVersion.Builder.create(stack, "MyLayer")
     * .code(Code.fromAsset(join(__dirname, "layer-code")))
     * .compatibleRuntimes(List.of(Runtime.NODEJS_14_X))
     * .license("Apache-2.0")
     * .description("A layer to test the L2 construct")
     * .build();
     * // To grant usage by other AWS accounts
     * layer.addPermission("remote-account-grant",
     * LayerVersionPermission.builder().accountId(awsAccountId).build());
     * // To grant usage to all accounts in some AWS Ogranization
     * // layer.grantUsage({ accountId: '*', organizationId });
     * // To grant usage to all accounts in some AWS Ogranization
     * // layer.grantUsage({ accountId: '*', organizationId });
     * Function.Builder.create(stack, "MyLayeredLambda")
     * .code(new InlineCode("foo"))
     * .handler("index.handler")
     * .runtime(Runtime.NODEJS_14_X)
     * .layers(List.of(layer))
     * .build();
     * ```
     */
    public inline fun layerVersionPermission(
        block: LayerVersionPermissionDsl.() -> Unit = {}
    ): LayerVersionPermission {
        val builder = LayerVersionPermissionDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Example:
     * ```
     * LayerVersion.Builder.create(this, "MyLayer")
     * .removalPolicy(RemovalPolicy.RETAIN)
     * .code(Code.fromAsset(join(__dirname, "lambda-handler")))
     * .compatibleArchitectures(List.of(Architecture.X86_64, Architecture.ARM_64))
     * .build();
     * ```
     */
    public inline fun layerVersionProps(
        block: LayerVersionPropsDsl.() -> Unit = {}
    ): LayerVersionProps {
        val builder = LayerVersionPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Retry options for all AWS API calls.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.*;
     * import software.amazon.awscdk.services.lambda.*;
     * LogRetentionRetryOptions logRetentionRetryOptions = LogRetentionRetryOptions.builder()
     * .base(Duration.minutes(30))
     * .maxRetries(123)
     * .build();
     * ```
     */
    public inline fun logRetentionRetryOptions(
        block: LogRetentionRetryOptionsDsl.() -> Unit = {}
    ): LogRetentionRetryOptions {
        val builder = LogRetentionRetryOptionsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Parameters and Secrets Extension configuration options.
     *
     * Example:
     * ```
     * import software.amazon.awscdk.services.secretsmanager.*;
     * import software.amazon.awscdk.services.ssm.*;
     * Secret secret = new Secret(this, "Secret");
     * StringParameter parameter = StringParameter.Builder.create(this, "Parameter")
     * .parameterName("mySsmParameterName")
     * .stringValue("mySsmParameterValue")
     * .build();
     * ParamsAndSecretsLayerVersion paramsAndSecrets =
     * ParamsAndSecretsLayerVersion.fromVersion(ParamsAndSecretsVersions.V1_0_103,
     * ParamsAndSecretsOptions.builder()
     * .cacheSize(500)
     * .logLevel(ParamsAndSecretsLogLevel.DEBUG)
     * .build());
     * Function lambdaFunction = Function.Builder.create(this, "MyFunction")
     * .runtime(Runtime.NODEJS_18_X)
     * .handler("index.handler")
     * .architecture(Architecture.ARM_64)
     * .code(Code.fromAsset(join(__dirname, "lambda-handler")))
     * .paramsAndSecrets(paramsAndSecrets)
     * .build();
     * secret.grantRead(lambdaFunction);
     * parameter.grantRead(lambdaFunction);
     * ```
     */
    public inline fun paramsAndSecretsOptions(
        block: ParamsAndSecretsOptionsDsl.() -> Unit = {}
    ): ParamsAndSecretsOptions {
        val builder = ParamsAndSecretsOptionsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Represents a permission statement that can be added to a Lambda function's resource policy
     * via the `addPermission()` method.
     *
     * Example:
     * ```
     * // Grant permissions to a service
     * Function fn;
     * ServicePrincipal principal = new ServicePrincipal("my-service");
     * fn.grantInvoke(principal);
     * // Equivalent to:
     * fn.addPermission("my-service Invocation", Permission.builder()
     * .principal(principal)
     * .build());
     * ```
     */
    public inline fun permission(block: PermissionDsl.() -> Unit = {}): Permission {
        val builder = PermissionDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.lambda.*;
     * ResourceBindOptions resourceBindOptions = ResourceBindOptions.builder()
     * .resourceProperty("resourceProperty")
     * .build();
     * ```
     */
    public inline fun resourceBindOptions(
        block: ResourceBindOptionsDsl.() -> Unit = {}
    ): ResourceBindOptions {
        val builder = ResourceBindOptionsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Lambda function runtime environment.
     *
     * If you need to use a runtime name that doesn't exist as a static member, you can instantiate
     * a `Runtime` object, e.g: `new Runtime('nodejs99.99')`.
     *
     * Example:
     * ```
     * import software.amazon.awscdk.services.signer.*;
     * SigningProfile signingProfile = SigningProfile.Builder.create(this, "SigningProfile")
     * .platform(Platform.AWS_LAMBDA_SHA384_ECDSA)
     * .build();
     * CodeSigningConfig codeSigningConfig = CodeSigningConfig.Builder.create(this,
     * "CodeSigningConfig")
     * .signingProfiles(List.of(signingProfile))
     * .build();
     * Function.Builder.create(this, "Function")
     * .codeSigningConfig(codeSigningConfig)
     * .runtime(Runtime.NODEJS_18_X)
     * .handler("index.handler")
     * .code(Code.fromAsset(join(__dirname, "lambda-handler")))
     * .build();
     * ```
     */
    public inline fun runtime(
        name: String,
        family: RuntimeFamily,
        block: RuntimeDsl.() -> Unit = {},
    ): Runtime {
        val builder = RuntimeDsl(name, family)
        builder.apply(block)
        return builder.build()
    }

    /**
     * A Lambda that will only ever be added to a stack once.
     *
     * This construct is a way to guarantee that the lambda function will be guaranteed to be part
     * of the stack, once and only once, irrespective of how many times the construct is declared to
     * be part of the stack. This is guaranteed as long as the `uuid` property and the optional
     * `lambdaPurpose` property stay the same whenever they're declared into the stack.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.*;
     * import software.amazon.awscdk.services.codeguruprofiler.*;
     * import software.amazon.awscdk.services.ec2.*;
     * import software.amazon.awscdk.services.iam.*;
     * import software.amazon.awscdk.services.kms.*;
     * import software.amazon.awscdk.services.lambda.*;
     * import software.amazon.awscdk.services.logs.*;
     * import software.amazon.awscdk.services.sns.*;
     * import software.amazon.awscdk.services.sqs.*;
     * AdotLayerVersion adotLayerVersion;
     * Architecture architecture;
     * Code code;
     * CodeSigningConfig codeSigningConfig;
     * IDestination destination;
     * IEventSource eventSource;
     * FileSystem fileSystem;
     * Key key;
     * LambdaInsightsVersion lambdaInsightsVersion;
     * LayerVersion layerVersion;
     * ParamsAndSecretsLayerVersion paramsAndSecretsLayerVersion;
     * PolicyStatement policyStatement;
     * ProfilingGroup profilingGroup;
     * Queue queue;
     * Role role;
     * Runtime runtime;
     * RuntimeManagementMode runtimeManagementMode;
     * SecurityGroup securityGroup;
     * Size size;
     * Subnet subnet;
     * SubnetFilter subnetFilter;
     * Topic topic;
     * Vpc vpc;
     * SingletonFunction singletonFunction = SingletonFunction.Builder.create(this,
     * "MySingletonFunction")
     * .code(code)
     * .handler("handler")
     * .runtime(runtime)
     * .uuid("uuid")
     * // the properties below are optional
     * .adotInstrumentation(AdotInstrumentationConfig.builder()
     * .execWrapper(AdotLambdaExecWrapper.REGULAR_HANDLER)
     * .layerVersion(adotLayerVersion)
     * .build())
     * .allowAllOutbound(false)
     * .allowPublicSubnet(false)
     * .architecture(architecture)
     * .codeSigningConfig(codeSigningConfig)
     * .currentVersionOptions(VersionOptions.builder()
     * .codeSha256("codeSha256")
     * .description("description")
     * .maxEventAge(Duration.minutes(30))
     * .onFailure(destination)
     * .onSuccess(destination)
     * .provisionedConcurrentExecutions(123)
     * .removalPolicy(RemovalPolicy.DESTROY)
     * .retryAttempts(123)
     * .build())
     * .deadLetterQueue(queue)
     * .deadLetterQueueEnabled(false)
     * .deadLetterTopic(topic)
     * .description("description")
     * .environment(Map.of(
     * "environmentKey", "environment"))
     * .environmentEncryption(key)
     * .ephemeralStorageSize(size)
     * .events(List.of(eventSource))
     * .filesystem(fileSystem)
     * .functionName("functionName")
     * .initialPolicy(List.of(policyStatement))
     * .insightsVersion(lambdaInsightsVersion)
     * .lambdaPurpose("lambdaPurpose")
     * .layers(List.of(layerVersion))
     * .logRetention(RetentionDays.ONE_DAY)
     * .logRetentionRetryOptions(LogRetentionRetryOptions.builder()
     * .base(Duration.minutes(30))
     * .maxRetries(123)
     * .build())
     * .logRetentionRole(role)
     * .maxEventAge(Duration.minutes(30))
     * .memorySize(123)
     * .onFailure(destination)
     * .onSuccess(destination)
     * .paramsAndSecrets(paramsAndSecretsLayerVersion)
     * .profiling(false)
     * .profilingGroup(profilingGroup)
     * .reservedConcurrentExecutions(123)
     * .retryAttempts(123)
     * .role(role)
     * .runtimeManagementMode(runtimeManagementMode)
     * .securityGroups(List.of(securityGroup))
     * .timeout(Duration.minutes(30))
     * .tracing(Tracing.ACTIVE)
     * .vpc(vpc)
     * .vpcSubnets(SubnetSelection.builder()
     * .availabilityZones(List.of("availabilityZones"))
     * .onePerAz(false)
     * .subnetFilters(List.of(subnetFilter))
     * .subnetGroupName("subnetGroupName")
     * .subnets(List.of(subnet))
     * .subnetType(SubnetType.PRIVATE_ISOLATED)
     * .build())
     * .build();
     * ```
     */
    public inline fun singletonFunction(
        scope: Construct,
        id: String,
        block: SingletonFunctionDsl.() -> Unit = {},
    ): SingletonFunction {
        val builder = SingletonFunctionDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for a newly created singleton Lambda.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.*;
     * import software.amazon.awscdk.services.codeguruprofiler.*;
     * import software.amazon.awscdk.services.ec2.*;
     * import software.amazon.awscdk.services.iam.*;
     * import software.amazon.awscdk.services.kms.*;
     * import software.amazon.awscdk.services.lambda.*;
     * import software.amazon.awscdk.services.logs.*;
     * import software.amazon.awscdk.services.sns.*;
     * import software.amazon.awscdk.services.sqs.*;
     * AdotLayerVersion adotLayerVersion;
     * Architecture architecture;
     * Code code;
     * CodeSigningConfig codeSigningConfig;
     * IDestination destination;
     * IEventSource eventSource;
     * FileSystem fileSystem;
     * Key key;
     * LambdaInsightsVersion lambdaInsightsVersion;
     * LayerVersion layerVersion;
     * ParamsAndSecretsLayerVersion paramsAndSecretsLayerVersion;
     * PolicyStatement policyStatement;
     * ProfilingGroup profilingGroup;
     * Queue queue;
     * Role role;
     * Runtime runtime;
     * RuntimeManagementMode runtimeManagementMode;
     * SecurityGroup securityGroup;
     * Size size;
     * Subnet subnet;
     * SubnetFilter subnetFilter;
     * Topic topic;
     * Vpc vpc;
     * SingletonFunctionProps singletonFunctionProps = SingletonFunctionProps.builder()
     * .code(code)
     * .handler("handler")
     * .runtime(runtime)
     * .uuid("uuid")
     * // the properties below are optional
     * .adotInstrumentation(AdotInstrumentationConfig.builder()
     * .execWrapper(AdotLambdaExecWrapper.REGULAR_HANDLER)
     * .layerVersion(adotLayerVersion)
     * .build())
     * .allowAllOutbound(false)
     * .allowPublicSubnet(false)
     * .architecture(architecture)
     * .codeSigningConfig(codeSigningConfig)
     * .currentVersionOptions(VersionOptions.builder()
     * .codeSha256("codeSha256")
     * .description("description")
     * .maxEventAge(Duration.minutes(30))
     * .onFailure(destination)
     * .onSuccess(destination)
     * .provisionedConcurrentExecutions(123)
     * .removalPolicy(RemovalPolicy.DESTROY)
     * .retryAttempts(123)
     * .build())
     * .deadLetterQueue(queue)
     * .deadLetterQueueEnabled(false)
     * .deadLetterTopic(topic)
     * .description("description")
     * .environment(Map.of(
     * "environmentKey", "environment"))
     * .environmentEncryption(key)
     * .ephemeralStorageSize(size)
     * .events(List.of(eventSource))
     * .filesystem(fileSystem)
     * .functionName("functionName")
     * .initialPolicy(List.of(policyStatement))
     * .insightsVersion(lambdaInsightsVersion)
     * .lambdaPurpose("lambdaPurpose")
     * .layers(List.of(layerVersion))
     * .logRetention(RetentionDays.ONE_DAY)
     * .logRetentionRetryOptions(LogRetentionRetryOptions.builder()
     * .base(Duration.minutes(30))
     * .maxRetries(123)
     * .build())
     * .logRetentionRole(role)
     * .maxEventAge(Duration.minutes(30))
     * .memorySize(123)
     * .onFailure(destination)
     * .onSuccess(destination)
     * .paramsAndSecrets(paramsAndSecretsLayerVersion)
     * .profiling(false)
     * .profilingGroup(profilingGroup)
     * .reservedConcurrentExecutions(123)
     * .retryAttempts(123)
     * .role(role)
     * .runtimeManagementMode(runtimeManagementMode)
     * .securityGroups(List.of(securityGroup))
     * .timeout(Duration.minutes(30))
     * .tracing(Tracing.ACTIVE)
     * .vpc(vpc)
     * .vpcSubnets(SubnetSelection.builder()
     * .availabilityZones(List.of("availabilityZones"))
     * .onePerAz(false)
     * .subnetFilters(List.of(subnetFilter))
     * .subnetGroupName("subnetGroupName")
     * .subnets(List.of(subnet))
     * .subnetType(SubnetType.PRIVATE_ISOLATED)
     * .build())
     * .build();
     * ```
     */
    public inline fun singletonFunctionProps(
        block: SingletonFunctionPropsDsl.() -> Unit = {}
    ): SingletonFunctionProps {
        val builder = SingletonFunctionPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Specific settings like the authentication protocol or the VPC components to secure access to
     * your event source.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.lambda.*;
     * SourceAccessConfigurationType sourceAccessConfigurationType;
     * SourceAccessConfiguration sourceAccessConfiguration = SourceAccessConfiguration.builder()
     * .type(sourceAccessConfigurationType)
     * .uri("uri")
     * .build();
     * ```
     */
    public inline fun sourceAccessConfiguration(
        block: SourceAccessConfigurationDsl.() -> Unit = {}
    ): SourceAccessConfiguration {
        val builder = SourceAccessConfigurationDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Options for enabling Lambda utilization tracking.
     *
     * Example:
     * ```
     * import software.amazon.awscdk.services.autoscaling.*;
     * Function fn;
     * Alias alias = fn.addAlias("prod");
     * // Create AutoScaling target
     * IScalableFunctionAttribute as =
     * alias.addAutoScaling(AutoScalingOptions.builder().maxCapacity(50).build());
     * // Configure Target Tracking
     * as.scaleOnUtilization(UtilizationScalingOptions.builder()
     * .utilizationTarget(0.5)
     * .build());
     * // Configure Scheduled Scaling
     * as.scaleOnSchedule("ScaleUpInTheMorning", ScalingSchedule.builder()
     * .schedule(Schedule.cron(CronOptions.builder().hour("8").minute("0").build()))
     * .minCapacity(20)
     * .build());
     * ```
     */
    public inline fun utilizationScalingOptions(
        block: UtilizationScalingOptionsDsl.() -> Unit = {}
    ): UtilizationScalingOptions {
        val builder = UtilizationScalingOptionsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Tag the current state of a Function with a Version number.
     *
     * Avoid using this resource directly. If you need a Version object, use
     * `function.currentVersion` instead. That will add a Version object to your template, and make
     * sure the Version is invalidated whenever the Function object changes. If you use the
     * `Version` resource directly, you are responsible for making sure it is invalidated (by
     * changing its logical ID) whenever necessary.
     *
     * Version resources can then be used in `Alias` resources to refer to a particular deployment
     * of a Lambda.
     *
     * If you want to ensure that you're associating the right version with the right deployment,
     * specify the `codeSha256` property while creating the `Version.
     *
     * Example:
     * ```
     * CfnParametersCode lambdaCode = Code.fromCfnParameters();
     * Function func = Function.Builder.create(this, "Lambda")
     * .code(lambdaCode)
     * .handler("index.handler")
     * .runtime(Runtime.NODEJS_14_X)
     * .build();
     * // used to make sure each CDK synthesis produces a different Version
     * Version version = func.getCurrentVersion();
     * Alias alias = Alias.Builder.create(this, "LambdaAlias")
     * .aliasName("Prod")
     * .version(version)
     * .build();
     * LambdaDeploymentGroup.Builder.create(this, "DeploymentGroup")
     * .alias(alias)
     * .deploymentConfig(LambdaDeploymentConfig.LINEAR_10PERCENT_EVERY_1MINUTE)
     * .build();
     * ```
     */
    public inline fun version(
        scope: Construct,
        id: String,
        block: VersionDsl.() -> Unit = {},
    ): Version {
        val builder = VersionDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.lambda.*;
     * Function function_;
     * VersionAttributes versionAttributes = VersionAttributes.builder()
     * .lambda(function_)
     * .version("version")
     * .build();
     * ```
     */
    public inline fun versionAttributes(
        block: VersionAttributesDsl.() -> Unit = {}
    ): VersionAttributes {
        val builder = VersionAttributesDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Options for `lambda.Version`.
     *
     * Example:
     * ```
     * Function fn = Function.Builder.create(this, "MyFunction")
     * .currentVersionOptions(VersionOptions.builder()
     * .removalPolicy(RemovalPolicy.RETAIN) // retain old versions
     * .retryAttempts(1)
     * .build())
     * .runtime(Runtime.NODEJS_18_X)
     * .handler("index.handler")
     * .code(Code.fromAsset(join(__dirname, "lambda-handler")))
     * .build();
     * fn.addAlias("live");
     * ```
     */
    public inline fun versionOptions(block: VersionOptionsDsl.() -> Unit = {}): VersionOptions {
        val builder = VersionOptionsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for a new Lambda version.
     *
     * Example:
     * ```
     * Function fn;
     * Version version = Version.Builder.create(this, "MyVersion")
     * .lambda(fn)
     * .build();
     * ```
     */
    public inline fun versionProps(block: VersionPropsDsl.() -> Unit = {}): VersionProps {
        val builder = VersionPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * A version/weight pair for routing traffic to Lambda functions.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.lambda.*;
     * Version version;
     * VersionWeight versionWeight = VersionWeight.builder()
     * .version(version)
     * .weight(123)
     * .build();
     * ```
     */
    public inline fun versionWeight(block: VersionWeightDsl.() -> Unit = {}): VersionWeight {
        val builder = VersionWeightDsl()
        builder.apply(block)
        return builder.build()
    }
}
