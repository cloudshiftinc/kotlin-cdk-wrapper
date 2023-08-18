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

package io.cloudshiftdev.awscdkdsl.services.apprunner

import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.apprunner.CfnAutoScalingConfiguration
import software.amazon.awscdk.services.apprunner.CfnAutoScalingConfigurationProps
import software.amazon.awscdk.services.apprunner.CfnObservabilityConfiguration
import software.amazon.awscdk.services.apprunner.CfnObservabilityConfigurationProps
import software.amazon.awscdk.services.apprunner.CfnService
import software.amazon.awscdk.services.apprunner.CfnServiceProps
import software.amazon.awscdk.services.apprunner.CfnVpcConnector
import software.amazon.awscdk.services.apprunner.CfnVpcConnectorProps
import software.amazon.awscdk.services.apprunner.CfnVpcIngressConnection
import software.amazon.awscdk.services.apprunner.CfnVpcIngressConnectionProps
import software.constructs.Construct

public object apprunner {
    /**
     * Specify an AWS App Runner Automatic Scaling configuration by using the
     * `AWS::AppRunner::AutoScalingConfiguration` resource in an AWS CloudFormation template.
     *
     * The `AWS::AppRunner::AutoScalingConfiguration` resource is an AWS App Runner resource type
     * that specifies an App Runner automatic scaling configuration.
     *
     * App Runner requires this resource to set non-default auto scaling settings for instances used
     * to process the web requests. You can share an auto scaling configuration across multiple
     * services.
     *
     * Create multiple revisions of a configuration by calling this action multiple times using the
     * same `AutoScalingConfigurationName` . The call returns incremental
     * `AutoScalingConfigurationRevision` values. When you create a service and configure an auto
     * scaling configuration resource, the service uses the latest active revision of the auto
     * scaling configuration by default. You can optionally configure the service to use a specific
     * revision.
     *
     * Configure a higher `MinSize` to increase the spread of your App Runner service over more
     * Availability Zones in the AWS Region . The tradeoff is a higher minimal cost.
     *
     * Configure a lower `MaxSize` to control your cost. The tradeoff is lower responsiveness during
     * peak demand.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.apprunner.*;
     * CfnAutoScalingConfiguration cfnAutoScalingConfiguration =
     * CfnAutoScalingConfiguration.Builder.create(this, "MyCfnAutoScalingConfiguration")
     * .autoScalingConfigurationName("autoScalingConfigurationName")
     * .maxConcurrency(123)
     * .maxSize(123)
     * .minSize(123)
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apprunner-autoscalingconfiguration.html)
     */
    public inline fun cfnAutoScalingConfiguration(
        scope: Construct,
        id: String,
        block: CfnAutoScalingConfigurationDsl.() -> Unit = {},
    ): CfnAutoScalingConfiguration {
        val builder = CfnAutoScalingConfigurationDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnAutoScalingConfiguration`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.apprunner.*;
     * CfnAutoScalingConfigurationProps cfnAutoScalingConfigurationProps =
     * CfnAutoScalingConfigurationProps.builder()
     * .autoScalingConfigurationName("autoScalingConfigurationName")
     * .maxConcurrency(123)
     * .maxSize(123)
     * .minSize(123)
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apprunner-autoscalingconfiguration.html)
     */
    public inline fun cfnAutoScalingConfigurationProps(
        block: CfnAutoScalingConfigurationPropsDsl.() -> Unit = {}
    ): CfnAutoScalingConfigurationProps {
        val builder = CfnAutoScalingConfigurationPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Specify an AWS App Runner observability configuration by using the
     * `AWS::AppRunner::ObservabilityConfiguration` resource in an AWS CloudFormation template.
     *
     * The `AWS::AppRunner::ObservabilityConfiguration` resource is an AWS App Runner resource type
     * that specifies an App Runner observability configuration.
     *
     * App Runner requires this resource when you specify App Runner services and you want to enable
     * non-default observability features. You can share an observability configuration across
     * multiple services.
     *
     * Create multiple revisions of a configuration by specifying this resource multiple times using
     * the same `ObservabilityConfigurationName` . App Runner creates multiple resources with
     * incremental `ObservabilityConfigurationRevision` values. When you specify a service and
     * configure an observability configuration resource, the service uses the latest active
     * revision of the observability configuration by default. You can optionally configure the
     * service to use a specific revision.
     *
     * The observability configuration resource is designed to configure multiple features
     * (currently one feature, tracing). This resource takes optional parameters that describe the
     * configuration of these features (currently one parameter, `TraceConfiguration` ). If you
     * don't specify a feature parameter, App Runner doesn't enable the feature.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.apprunner.*;
     * CfnObservabilityConfiguration cfnObservabilityConfiguration =
     * CfnObservabilityConfiguration.Builder.create(this, "MyCfnObservabilityConfiguration")
     * .observabilityConfigurationName("observabilityConfigurationName")
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .traceConfiguration(TraceConfigurationProperty.builder()
     * .vendor("vendor")
     * .build())
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apprunner-observabilityconfiguration.html)
     */
    public inline fun cfnObservabilityConfiguration(
        scope: Construct,
        id: String,
        block: CfnObservabilityConfigurationDsl.() -> Unit = {},
    ): CfnObservabilityConfiguration {
        val builder = CfnObservabilityConfigurationDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnObservabilityConfiguration`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.apprunner.*;
     * CfnObservabilityConfigurationProps cfnObservabilityConfigurationProps =
     * CfnObservabilityConfigurationProps.builder()
     * .observabilityConfigurationName("observabilityConfigurationName")
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .traceConfiguration(TraceConfigurationProperty.builder()
     * .vendor("vendor")
     * .build())
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apprunner-observabilityconfiguration.html)
     */
    public inline fun cfnObservabilityConfigurationProps(
        block: CfnObservabilityConfigurationPropsDsl.() -> Unit = {}
    ): CfnObservabilityConfigurationProps {
        val builder = CfnObservabilityConfigurationPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Describes the configuration of the tracing feature within an AWS App Runner observability
     * configuration.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.apprunner.*;
     * TraceConfigurationProperty traceConfigurationProperty = TraceConfigurationProperty.builder()
     * .vendor("vendor")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apprunner-observabilityconfiguration-traceconfiguration.html)
     */
    public inline fun cfnObservabilityConfigurationTraceConfigurationProperty(
        block: CfnObservabilityConfigurationTraceConfigurationPropertyDsl.() -> Unit = {}
    ): CfnObservabilityConfiguration.TraceConfigurationProperty {
        val builder = CfnObservabilityConfigurationTraceConfigurationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Specify an AWS App Runner service by using the `AWS::AppRunner::Service` resource in an AWS
     * CloudFormation template.
     *
     * The `AWS::AppRunner::Service` resource is an AWS App Runner resource type that specifies an
     * App Runner service.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.apprunner.*;
     * CfnService cfnService = CfnService.Builder.create(this, "MyCfnService")
     * .sourceConfiguration(SourceConfigurationProperty.builder()
     * .authenticationConfiguration(AuthenticationConfigurationProperty.builder()
     * .accessRoleArn("accessRoleArn")
     * .connectionArn("connectionArn")
     * .build())
     * .autoDeploymentsEnabled(false)
     * .codeRepository(CodeRepositoryProperty.builder()
     * .repositoryUrl("repositoryUrl")
     * .sourceCodeVersion(SourceCodeVersionProperty.builder()
     * .type("type")
     * .value("value")
     * .build())
     * // the properties below are optional
     * .codeConfiguration(CodeConfigurationProperty.builder()
     * .configurationSource("configurationSource")
     * // the properties below are optional
     * .codeConfigurationValues(CodeConfigurationValuesProperty.builder()
     * .runtime("runtime")
     * // the properties below are optional
     * .buildCommand("buildCommand")
     * .port("port")
     * .runtimeEnvironmentSecrets(List.of(KeyValuePairProperty.builder()
     * .name("name")
     * .value("value")
     * .build()))
     * .runtimeEnvironmentVariables(List.of(KeyValuePairProperty.builder()
     * .name("name")
     * .value("value")
     * .build()))
     * .startCommand("startCommand")
     * .build())
     * .build())
     * .build())
     * .imageRepository(ImageRepositoryProperty.builder()
     * .imageIdentifier("imageIdentifier")
     * .imageRepositoryType("imageRepositoryType")
     * // the properties below are optional
     * .imageConfiguration(ImageConfigurationProperty.builder()
     * .port("port")
     * .runtimeEnvironmentSecrets(List.of(KeyValuePairProperty.builder()
     * .name("name")
     * .value("value")
     * .build()))
     * .runtimeEnvironmentVariables(List.of(KeyValuePairProperty.builder()
     * .name("name")
     * .value("value")
     * .build()))
     * .startCommand("startCommand")
     * .build())
     * .build())
     * .build())
     * // the properties below are optional
     * .autoScalingConfigurationArn("autoScalingConfigurationArn")
     * .encryptionConfiguration(EncryptionConfigurationProperty.builder()
     * .kmsKey("kmsKey")
     * .build())
     * .healthCheckConfiguration(HealthCheckConfigurationProperty.builder()
     * .healthyThreshold(123)
     * .interval(123)
     * .path("path")
     * .protocol("protocol")
     * .timeout(123)
     * .unhealthyThreshold(123)
     * .build())
     * .instanceConfiguration(InstanceConfigurationProperty.builder()
     * .cpu("cpu")
     * .instanceRoleArn("instanceRoleArn")
     * .memory("memory")
     * .build())
     * .networkConfiguration(NetworkConfigurationProperty.builder()
     * .egressConfiguration(EgressConfigurationProperty.builder()
     * .egressType("egressType")
     * // the properties below are optional
     * .vpcConnectorArn("vpcConnectorArn")
     * .build())
     * .ingressConfiguration(IngressConfigurationProperty.builder()
     * .isPubliclyAccessible(false)
     * .build())
     * .build())
     * .observabilityConfiguration(ServiceObservabilityConfigurationProperty.builder()
     * .observabilityEnabled(false)
     * // the properties below are optional
     * .observabilityConfigurationArn("observabilityConfigurationArn")
     * .build())
     * .serviceName("serviceName")
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apprunner-service.html)
     */
    public inline fun cfnService(
        scope: Construct,
        id: String,
        block: CfnServiceDsl.() -> Unit = {},
    ): CfnService {
        val builder = CfnServiceDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Describes resources needed to authenticate access to some source repositories.
     *
     * The specific resource depends on the repository provider.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.apprunner.*;
     * AuthenticationConfigurationProperty authenticationConfigurationProperty =
     * AuthenticationConfigurationProperty.builder()
     * .accessRoleArn("accessRoleArn")
     * .connectionArn("connectionArn")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apprunner-service-authenticationconfiguration.html)
     */
    public inline fun cfnServiceAuthenticationConfigurationProperty(
        block: CfnServiceAuthenticationConfigurationPropertyDsl.() -> Unit = {}
    ): CfnService.AuthenticationConfigurationProperty {
        val builder = CfnServiceAuthenticationConfigurationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Describes the configuration that AWS App Runner uses to build and run an App Runner service
     * from a source code repository.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.apprunner.*;
     * CodeConfigurationProperty codeConfigurationProperty = CodeConfigurationProperty.builder()
     * .configurationSource("configurationSource")
     * // the properties below are optional
     * .codeConfigurationValues(CodeConfigurationValuesProperty.builder()
     * .runtime("runtime")
     * // the properties below are optional
     * .buildCommand("buildCommand")
     * .port("port")
     * .runtimeEnvironmentSecrets(List.of(KeyValuePairProperty.builder()
     * .name("name")
     * .value("value")
     * .build()))
     * .runtimeEnvironmentVariables(List.of(KeyValuePairProperty.builder()
     * .name("name")
     * .value("value")
     * .build()))
     * .startCommand("startCommand")
     * .build())
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apprunner-service-codeconfiguration.html)
     */
    public inline fun cfnServiceCodeConfigurationProperty(
        block: CfnServiceCodeConfigurationPropertyDsl.() -> Unit = {}
    ): CfnService.CodeConfigurationProperty {
        val builder = CfnServiceCodeConfigurationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Describes the basic configuration needed for building and running an AWS App Runner service.
     *
     * This type doesn't support the full set of possible configuration options. Fur full
     * configuration capabilities, use a `apprunner.yaml` file in the source code repository.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.apprunner.*;
     * CodeConfigurationValuesProperty codeConfigurationValuesProperty =
     * CodeConfigurationValuesProperty.builder()
     * .runtime("runtime")
     * // the properties below are optional
     * .buildCommand("buildCommand")
     * .port("port")
     * .runtimeEnvironmentSecrets(List.of(KeyValuePairProperty.builder()
     * .name("name")
     * .value("value")
     * .build()))
     * .runtimeEnvironmentVariables(List.of(KeyValuePairProperty.builder()
     * .name("name")
     * .value("value")
     * .build()))
     * .startCommand("startCommand")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apprunner-service-codeconfigurationvalues.html)
     */
    public inline fun cfnServiceCodeConfigurationValuesProperty(
        block: CfnServiceCodeConfigurationValuesPropertyDsl.() -> Unit = {}
    ): CfnService.CodeConfigurationValuesProperty {
        val builder = CfnServiceCodeConfigurationValuesPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Describes a source code repository.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.apprunner.*;
     * CodeRepositoryProperty codeRepositoryProperty = CodeRepositoryProperty.builder()
     * .repositoryUrl("repositoryUrl")
     * .sourceCodeVersion(SourceCodeVersionProperty.builder()
     * .type("type")
     * .value("value")
     * .build())
     * // the properties below are optional
     * .codeConfiguration(CodeConfigurationProperty.builder()
     * .configurationSource("configurationSource")
     * // the properties below are optional
     * .codeConfigurationValues(CodeConfigurationValuesProperty.builder()
     * .runtime("runtime")
     * // the properties below are optional
     * .buildCommand("buildCommand")
     * .port("port")
     * .runtimeEnvironmentSecrets(List.of(KeyValuePairProperty.builder()
     * .name("name")
     * .value("value")
     * .build()))
     * .runtimeEnvironmentVariables(List.of(KeyValuePairProperty.builder()
     * .name("name")
     * .value("value")
     * .build()))
     * .startCommand("startCommand")
     * .build())
     * .build())
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apprunner-service-coderepository.html)
     */
    public inline fun cfnServiceCodeRepositoryProperty(
        block: CfnServiceCodeRepositoryPropertyDsl.() -> Unit = {}
    ): CfnService.CodeRepositoryProperty {
        val builder = CfnServiceCodeRepositoryPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Describes configuration settings related to outbound network traffic of an AWS App Runner
     * service.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.apprunner.*;
     * EgressConfigurationProperty egressConfigurationProperty = EgressConfigurationProperty.builder()
     * .egressType("egressType")
     * // the properties below are optional
     * .vpcConnectorArn("vpcConnectorArn")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apprunner-service-egressconfiguration.html)
     */
    public inline fun cfnServiceEgressConfigurationProperty(
        block: CfnServiceEgressConfigurationPropertyDsl.() -> Unit = {}
    ): CfnService.EgressConfigurationProperty {
        val builder = CfnServiceEgressConfigurationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Describes a custom encryption key that AWS App Runner uses to encrypt copies of the source
     * repository and service logs.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.apprunner.*;
     * EncryptionConfigurationProperty encryptionConfigurationProperty =
     * EncryptionConfigurationProperty.builder()
     * .kmsKey("kmsKey")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apprunner-service-encryptionconfiguration.html)
     */
    public inline fun cfnServiceEncryptionConfigurationProperty(
        block: CfnServiceEncryptionConfigurationPropertyDsl.() -> Unit = {}
    ): CfnService.EncryptionConfigurationProperty {
        val builder = CfnServiceEncryptionConfigurationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Describes the settings for the health check that AWS App Runner performs to monitor the
     * health of a service.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.apprunner.*;
     * HealthCheckConfigurationProperty healthCheckConfigurationProperty =
     * HealthCheckConfigurationProperty.builder()
     * .healthyThreshold(123)
     * .interval(123)
     * .path("path")
     * .protocol("protocol")
     * .timeout(123)
     * .unhealthyThreshold(123)
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apprunner-service-healthcheckconfiguration.html)
     */
    public inline fun cfnServiceHealthCheckConfigurationProperty(
        block: CfnServiceHealthCheckConfigurationPropertyDsl.() -> Unit = {}
    ): CfnService.HealthCheckConfigurationProperty {
        val builder = CfnServiceHealthCheckConfigurationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Describes the configuration that AWS App Runner uses to run an App Runner service using an
     * image pulled from a source image repository.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.apprunner.*;
     * ImageConfigurationProperty imageConfigurationProperty = ImageConfigurationProperty.builder()
     * .port("port")
     * .runtimeEnvironmentSecrets(List.of(KeyValuePairProperty.builder()
     * .name("name")
     * .value("value")
     * .build()))
     * .runtimeEnvironmentVariables(List.of(KeyValuePairProperty.builder()
     * .name("name")
     * .value("value")
     * .build()))
     * .startCommand("startCommand")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apprunner-service-imageconfiguration.html)
     */
    public inline fun cfnServiceImageConfigurationProperty(
        block: CfnServiceImageConfigurationPropertyDsl.() -> Unit = {}
    ): CfnService.ImageConfigurationProperty {
        val builder = CfnServiceImageConfigurationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Describes a source image repository.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.apprunner.*;
     * ImageRepositoryProperty imageRepositoryProperty = ImageRepositoryProperty.builder()
     * .imageIdentifier("imageIdentifier")
     * .imageRepositoryType("imageRepositoryType")
     * // the properties below are optional
     * .imageConfiguration(ImageConfigurationProperty.builder()
     * .port("port")
     * .runtimeEnvironmentSecrets(List.of(KeyValuePairProperty.builder()
     * .name("name")
     * .value("value")
     * .build()))
     * .runtimeEnvironmentVariables(List.of(KeyValuePairProperty.builder()
     * .name("name")
     * .value("value")
     * .build()))
     * .startCommand("startCommand")
     * .build())
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apprunner-service-imagerepository.html)
     */
    public inline fun cfnServiceImageRepositoryProperty(
        block: CfnServiceImageRepositoryPropertyDsl.() -> Unit = {}
    ): CfnService.ImageRepositoryProperty {
        val builder = CfnServiceImageRepositoryPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Network configuration settings for inbound network traffic.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.apprunner.*;
     * IngressConfigurationProperty ingressConfigurationProperty =
     * IngressConfigurationProperty.builder()
     * .isPubliclyAccessible(false)
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apprunner-service-ingressconfiguration.html)
     */
    public inline fun cfnServiceIngressConfigurationProperty(
        block: CfnServiceIngressConfigurationPropertyDsl.() -> Unit = {}
    ): CfnService.IngressConfigurationProperty {
        val builder = CfnServiceIngressConfigurationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Describes the runtime configuration of an AWS App Runner service instance (scaling unit).
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.apprunner.*;
     * InstanceConfigurationProperty instanceConfigurationProperty =
     * InstanceConfigurationProperty.builder()
     * .cpu("cpu")
     * .instanceRoleArn("instanceRoleArn")
     * .memory("memory")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apprunner-service-instanceconfiguration.html)
     */
    public inline fun cfnServiceInstanceConfigurationProperty(
        block: CfnServiceInstanceConfigurationPropertyDsl.() -> Unit = {}
    ): CfnService.InstanceConfigurationProperty {
        val builder = CfnServiceInstanceConfigurationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Describes a key-value pair, which is a string-to-string mapping.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.apprunner.*;
     * KeyValuePairProperty keyValuePairProperty = KeyValuePairProperty.builder()
     * .name("name")
     * .value("value")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apprunner-service-keyvaluepair.html)
     */
    public inline fun cfnServiceKeyValuePairProperty(
        block: CfnServiceKeyValuePairPropertyDsl.() -> Unit = {}
    ): CfnService.KeyValuePairProperty {
        val builder = CfnServiceKeyValuePairPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Describes configuration settings related to network traffic of an AWS App Runner service.
     *
     * Consists of embedded objects for each configurable network feature.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.apprunner.*;
     * NetworkConfigurationProperty networkConfigurationProperty =
     * NetworkConfigurationProperty.builder()
     * .egressConfiguration(EgressConfigurationProperty.builder()
     * .egressType("egressType")
     * // the properties below are optional
     * .vpcConnectorArn("vpcConnectorArn")
     * .build())
     * .ingressConfiguration(IngressConfigurationProperty.builder()
     * .isPubliclyAccessible(false)
     * .build())
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apprunner-service-networkconfiguration.html)
     */
    public inline fun cfnServiceNetworkConfigurationProperty(
        block: CfnServiceNetworkConfigurationPropertyDsl.() -> Unit = {}
    ): CfnService.NetworkConfigurationProperty {
        val builder = CfnServiceNetworkConfigurationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnService`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.apprunner.*;
     * CfnServiceProps cfnServiceProps = CfnServiceProps.builder()
     * .sourceConfiguration(SourceConfigurationProperty.builder()
     * .authenticationConfiguration(AuthenticationConfigurationProperty.builder()
     * .accessRoleArn("accessRoleArn")
     * .connectionArn("connectionArn")
     * .build())
     * .autoDeploymentsEnabled(false)
     * .codeRepository(CodeRepositoryProperty.builder()
     * .repositoryUrl("repositoryUrl")
     * .sourceCodeVersion(SourceCodeVersionProperty.builder()
     * .type("type")
     * .value("value")
     * .build())
     * // the properties below are optional
     * .codeConfiguration(CodeConfigurationProperty.builder()
     * .configurationSource("configurationSource")
     * // the properties below are optional
     * .codeConfigurationValues(CodeConfigurationValuesProperty.builder()
     * .runtime("runtime")
     * // the properties below are optional
     * .buildCommand("buildCommand")
     * .port("port")
     * .runtimeEnvironmentSecrets(List.of(KeyValuePairProperty.builder()
     * .name("name")
     * .value("value")
     * .build()))
     * .runtimeEnvironmentVariables(List.of(KeyValuePairProperty.builder()
     * .name("name")
     * .value("value")
     * .build()))
     * .startCommand("startCommand")
     * .build())
     * .build())
     * .build())
     * .imageRepository(ImageRepositoryProperty.builder()
     * .imageIdentifier("imageIdentifier")
     * .imageRepositoryType("imageRepositoryType")
     * // the properties below are optional
     * .imageConfiguration(ImageConfigurationProperty.builder()
     * .port("port")
     * .runtimeEnvironmentSecrets(List.of(KeyValuePairProperty.builder()
     * .name("name")
     * .value("value")
     * .build()))
     * .runtimeEnvironmentVariables(List.of(KeyValuePairProperty.builder()
     * .name("name")
     * .value("value")
     * .build()))
     * .startCommand("startCommand")
     * .build())
     * .build())
     * .build())
     * // the properties below are optional
     * .autoScalingConfigurationArn("autoScalingConfigurationArn")
     * .encryptionConfiguration(EncryptionConfigurationProperty.builder()
     * .kmsKey("kmsKey")
     * .build())
     * .healthCheckConfiguration(HealthCheckConfigurationProperty.builder()
     * .healthyThreshold(123)
     * .interval(123)
     * .path("path")
     * .protocol("protocol")
     * .timeout(123)
     * .unhealthyThreshold(123)
     * .build())
     * .instanceConfiguration(InstanceConfigurationProperty.builder()
     * .cpu("cpu")
     * .instanceRoleArn("instanceRoleArn")
     * .memory("memory")
     * .build())
     * .networkConfiguration(NetworkConfigurationProperty.builder()
     * .egressConfiguration(EgressConfigurationProperty.builder()
     * .egressType("egressType")
     * // the properties below are optional
     * .vpcConnectorArn("vpcConnectorArn")
     * .build())
     * .ingressConfiguration(IngressConfigurationProperty.builder()
     * .isPubliclyAccessible(false)
     * .build())
     * .build())
     * .observabilityConfiguration(ServiceObservabilityConfigurationProperty.builder()
     * .observabilityEnabled(false)
     * // the properties below are optional
     * .observabilityConfigurationArn("observabilityConfigurationArn")
     * .build())
     * .serviceName("serviceName")
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apprunner-service.html)
     */
    public inline fun cfnServiceProps(block: CfnServicePropsDsl.() -> Unit = {}): CfnServiceProps {
        val builder = CfnServicePropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Describes the observability configuration of an AWS App Runner service.
     *
     * These are additional observability features, like tracing, that you choose to enable. They're
     * configured in a separate resource that you associate with your service.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.apprunner.*;
     * ServiceObservabilityConfigurationProperty serviceObservabilityConfigurationProperty =
     * ServiceObservabilityConfigurationProperty.builder()
     * .observabilityEnabled(false)
     * // the properties below are optional
     * .observabilityConfigurationArn("observabilityConfigurationArn")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apprunner-service-serviceobservabilityconfiguration.html)
     */
    public inline fun cfnServiceServiceObservabilityConfigurationProperty(
        block: CfnServiceServiceObservabilityConfigurationPropertyDsl.() -> Unit = {}
    ): CfnService.ServiceObservabilityConfigurationProperty {
        val builder = CfnServiceServiceObservabilityConfigurationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Identifies a version of code that AWS App Runner refers to within a source code repository.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.apprunner.*;
     * SourceCodeVersionProperty sourceCodeVersionProperty = SourceCodeVersionProperty.builder()
     * .type("type")
     * .value("value")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apprunner-service-sourcecodeversion.html)
     */
    public inline fun cfnServiceSourceCodeVersionProperty(
        block: CfnServiceSourceCodeVersionPropertyDsl.() -> Unit = {}
    ): CfnService.SourceCodeVersionProperty {
        val builder = CfnServiceSourceCodeVersionPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Describes the source deployed to an AWS App Runner service.
     *
     * It can be a code or an image repository.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.apprunner.*;
     * SourceConfigurationProperty sourceConfigurationProperty = SourceConfigurationProperty.builder()
     * .authenticationConfiguration(AuthenticationConfigurationProperty.builder()
     * .accessRoleArn("accessRoleArn")
     * .connectionArn("connectionArn")
     * .build())
     * .autoDeploymentsEnabled(false)
     * .codeRepository(CodeRepositoryProperty.builder()
     * .repositoryUrl("repositoryUrl")
     * .sourceCodeVersion(SourceCodeVersionProperty.builder()
     * .type("type")
     * .value("value")
     * .build())
     * // the properties below are optional
     * .codeConfiguration(CodeConfigurationProperty.builder()
     * .configurationSource("configurationSource")
     * // the properties below are optional
     * .codeConfigurationValues(CodeConfigurationValuesProperty.builder()
     * .runtime("runtime")
     * // the properties below are optional
     * .buildCommand("buildCommand")
     * .port("port")
     * .runtimeEnvironmentSecrets(List.of(KeyValuePairProperty.builder()
     * .name("name")
     * .value("value")
     * .build()))
     * .runtimeEnvironmentVariables(List.of(KeyValuePairProperty.builder()
     * .name("name")
     * .value("value")
     * .build()))
     * .startCommand("startCommand")
     * .build())
     * .build())
     * .build())
     * .imageRepository(ImageRepositoryProperty.builder()
     * .imageIdentifier("imageIdentifier")
     * .imageRepositoryType("imageRepositoryType")
     * // the properties below are optional
     * .imageConfiguration(ImageConfigurationProperty.builder()
     * .port("port")
     * .runtimeEnvironmentSecrets(List.of(KeyValuePairProperty.builder()
     * .name("name")
     * .value("value")
     * .build()))
     * .runtimeEnvironmentVariables(List.of(KeyValuePairProperty.builder()
     * .name("name")
     * .value("value")
     * .build()))
     * .startCommand("startCommand")
     * .build())
     * .build())
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apprunner-service-sourceconfiguration.html)
     */
    public inline fun cfnServiceSourceConfigurationProperty(
        block: CfnServiceSourceConfigurationPropertyDsl.() -> Unit = {}
    ): CfnService.SourceConfigurationProperty {
        val builder = CfnServiceSourceConfigurationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Specify an AWS App Runner VPC connector by using the `AWS::AppRunner::VpcConnector` resource
     * in an AWS CloudFormation template.
     *
     * The `AWS::AppRunner::VpcConnector` resource is an AWS App Runner resource type that specifies
     * an App Runner VPC connector.
     *
     * App Runner requires this resource when you want to associate your App Runner service to a
     * custom Amazon Virtual Private Cloud ( Amazon VPC ).
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.apprunner.*;
     * CfnVpcConnector cfnVpcConnector = CfnVpcConnector.Builder.create(this, "MyCfnVpcConnector")
     * .subnets(List.of("subnets"))
     * // the properties below are optional
     * .securityGroups(List.of("securityGroups"))
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .vpcConnectorName("vpcConnectorName")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apprunner-vpcconnector.html)
     */
    public inline fun cfnVpcConnector(
        scope: Construct,
        id: String,
        block: CfnVpcConnectorDsl.() -> Unit = {},
    ): CfnVpcConnector {
        val builder = CfnVpcConnectorDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnVpcConnector`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.apprunner.*;
     * CfnVpcConnectorProps cfnVpcConnectorProps = CfnVpcConnectorProps.builder()
     * .subnets(List.of("subnets"))
     * // the properties below are optional
     * .securityGroups(List.of("securityGroups"))
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .vpcConnectorName("vpcConnectorName")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apprunner-vpcconnector.html)
     */
    public inline fun cfnVpcConnectorProps(
        block: CfnVpcConnectorPropsDsl.() -> Unit = {}
    ): CfnVpcConnectorProps {
        val builder = CfnVpcConnectorPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Specify an AWS App Runner VPC Ingress Connection by using the
     * `AWS::AppRunner::VpcIngressConnection` resource in an AWS CloudFormation template.
     *
     * The `AWS::AppRunner::VpcIngressConnection` resource is an AWS App Runner resource type that
     * specifies an App Runner VPC Ingress Connection.
     *
     * App Runner requires this resource when you want to associate your App Runner service to an
     * Amazon VPC endpoint.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.apprunner.*;
     * CfnVpcIngressConnection cfnVpcIngressConnection = CfnVpcIngressConnection.Builder.create(this,
     * "MyCfnVpcIngressConnection")
     * .ingressVpcConfiguration(IngressVpcConfigurationProperty.builder()
     * .vpcEndpointId("vpcEndpointId")
     * .vpcId("vpcId")
     * .build())
     * .serviceArn("serviceArn")
     * // the properties below are optional
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .vpcIngressConnectionName("vpcIngressConnectionName")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apprunner-vpcingressconnection.html)
     */
    public inline fun cfnVpcIngressConnection(
        scope: Construct,
        id: String,
        block: CfnVpcIngressConnectionDsl.() -> Unit = {},
    ): CfnVpcIngressConnection {
        val builder = CfnVpcIngressConnectionDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Specifications for the customer’s VPC and related PrivateLink VPC endpoint that are used to
     * associate with the VPC Ingress Connection resource.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.apprunner.*;
     * IngressVpcConfigurationProperty ingressVpcConfigurationProperty =
     * IngressVpcConfigurationProperty.builder()
     * .vpcEndpointId("vpcEndpointId")
     * .vpcId("vpcId")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apprunner-vpcingressconnection-ingressvpcconfiguration.html)
     */
    public inline fun cfnVpcIngressConnectionIngressVpcConfigurationProperty(
        block: CfnVpcIngressConnectionIngressVpcConfigurationPropertyDsl.() -> Unit = {}
    ): CfnVpcIngressConnection.IngressVpcConfigurationProperty {
        val builder = CfnVpcIngressConnectionIngressVpcConfigurationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnVpcIngressConnection`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.apprunner.*;
     * CfnVpcIngressConnectionProps cfnVpcIngressConnectionProps =
     * CfnVpcIngressConnectionProps.builder()
     * .ingressVpcConfiguration(IngressVpcConfigurationProperty.builder()
     * .vpcEndpointId("vpcEndpointId")
     * .vpcId("vpcId")
     * .build())
     * .serviceArn("serviceArn")
     * // the properties below are optional
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .vpcIngressConnectionName("vpcIngressConnectionName")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apprunner-vpcingressconnection.html)
     */
    public inline fun cfnVpcIngressConnectionProps(
        block: CfnVpcIngressConnectionPropsDsl.() -> Unit = {}
    ): CfnVpcIngressConnectionProps {
        val builder = CfnVpcIngressConnectionPropsDsl()
        builder.apply(block)
        return builder.build()
    }
}
