@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.apprunner

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

/**
 * Properties for defining a `CfnService`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.apprunner.*;
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
 * .sourceDirectory("sourceDirectory")
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
 * .ipAddressType("ipAddressType")
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
public interface CfnServiceProps {
  /**
   * The Amazon Resource Name (ARN) of an App Runner automatic scaling configuration resource that
   * you want to associate with your service.
   *
   * If not provided, App Runner associates the latest revision of a default auto scaling
   * configuration.
   *
   * Specify an ARN with a name and a revision number to associate that revision. For example:
   * `arn:aws:apprunner:us-east-1:123456789012:autoscalingconfiguration/high-availability/3`
   *
   * Specify just the name to associate the latest revision. For example:
   * `arn:aws:apprunner:us-east-1:123456789012:autoscalingconfiguration/high-availability`
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apprunner-service.html#cfn-apprunner-service-autoscalingconfigurationarn)
   */
  public fun autoScalingConfigurationArn(): String? = unwrap(this).getAutoScalingConfigurationArn()

  /**
   * An optional custom encryption key that App Runner uses to encrypt the copy of your source
   * repository that it maintains and your service logs.
   *
   * By default, App Runner uses an AWS managed key .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apprunner-service.html#cfn-apprunner-service-encryptionconfiguration)
   */
  public fun encryptionConfiguration(): Any? = unwrap(this).getEncryptionConfiguration()

  /**
   * The settings for the health check that AWS App Runner performs to monitor the health of the App
   * Runner service.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apprunner-service.html#cfn-apprunner-service-healthcheckconfiguration)
   */
  public fun healthCheckConfiguration(): Any? = unwrap(this).getHealthCheckConfiguration()

  /**
   * The runtime configuration of instances (scaling units) of your service.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apprunner-service.html#cfn-apprunner-service-instanceconfiguration)
   */
  public fun instanceConfiguration(): Any? = unwrap(this).getInstanceConfiguration()

  /**
   * Configuration settings related to network traffic of the web application that the App Runner
   * service runs.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apprunner-service.html#cfn-apprunner-service-networkconfiguration)
   */
  public fun networkConfiguration(): Any? = unwrap(this).getNetworkConfiguration()

  /**
   * The observability configuration of your service.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apprunner-service.html#cfn-apprunner-service-observabilityconfiguration)
   */
  public fun observabilityConfiguration(): Any? = unwrap(this).getObservabilityConfiguration()

  /**
   * A name for the App Runner service.
   *
   * It must be unique across all the running App Runner services in your AWS account in the AWS
   * Region .
   *
   * If you don't specify a name, AWS CloudFormation generates a name for your service.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apprunner-service.html#cfn-apprunner-service-servicename)
   */
  public fun serviceName(): String? = unwrap(this).getServiceName()

  /**
   * The source to deploy to the App Runner service.
   *
   * It can be a code or an image repository.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apprunner-service.html#cfn-apprunner-service-sourceconfiguration)
   */
  public fun sourceConfiguration(): Any

  /**
   * An optional list of metadata items that you can associate with the App Runner service resource.
   *
   * A tag is a key-value pair.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apprunner-service.html#cfn-apprunner-service-tags)
   */
  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * A builder for [CfnServiceProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param autoScalingConfigurationArn The Amazon Resource Name (ARN) of an App Runner automatic
     * scaling configuration resource that you want to associate with your service.
     * If not provided, App Runner associates the latest revision of a default auto scaling
     * configuration.
     *
     * Specify an ARN with a name and a revision number to associate that revision. For example:
     * `arn:aws:apprunner:us-east-1:123456789012:autoscalingconfiguration/high-availability/3`
     *
     * Specify just the name to associate the latest revision. For example:
     * `arn:aws:apprunner:us-east-1:123456789012:autoscalingconfiguration/high-availability`
     */
    public fun autoScalingConfigurationArn(autoScalingConfigurationArn: String)

    /**
     * @param encryptionConfiguration An optional custom encryption key that App Runner uses to
     * encrypt the copy of your source repository that it maintains and your service logs.
     * By default, App Runner uses an AWS managed key .
     */
    public fun encryptionConfiguration(encryptionConfiguration: IResolvable)

    /**
     * @param encryptionConfiguration An optional custom encryption key that App Runner uses to
     * encrypt the copy of your source repository that it maintains and your service logs.
     * By default, App Runner uses an AWS managed key .
     */
    public
        fun encryptionConfiguration(encryptionConfiguration: CfnService.EncryptionConfigurationProperty)

    /**
     * @param encryptionConfiguration An optional custom encryption key that App Runner uses to
     * encrypt the copy of your source repository that it maintains and your service logs.
     * By default, App Runner uses an AWS managed key .
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("ea63b48209c6f49c89a028278e1a828ea9dd11c65bcab8ca75ed1e4e82fe0d5b")
    public
        fun encryptionConfiguration(encryptionConfiguration: CfnService.EncryptionConfigurationProperty.Builder.() -> Unit)

    /**
     * @param healthCheckConfiguration The settings for the health check that AWS App Runner
     * performs to monitor the health of the App Runner service.
     */
    public fun healthCheckConfiguration(healthCheckConfiguration: IResolvable)

    /**
     * @param healthCheckConfiguration The settings for the health check that AWS App Runner
     * performs to monitor the health of the App Runner service.
     */
    public
        fun healthCheckConfiguration(healthCheckConfiguration: CfnService.HealthCheckConfigurationProperty)

    /**
     * @param healthCheckConfiguration The settings for the health check that AWS App Runner
     * performs to monitor the health of the App Runner service.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("8c729b4a0859cc2e637e97493b6202143875d5df1e412bfe0f1bb0947c25a787")
    public
        fun healthCheckConfiguration(healthCheckConfiguration: CfnService.HealthCheckConfigurationProperty.Builder.() -> Unit)

    /**
     * @param instanceConfiguration The runtime configuration of instances (scaling units) of your
     * service.
     */
    public fun instanceConfiguration(instanceConfiguration: IResolvable)

    /**
     * @param instanceConfiguration The runtime configuration of instances (scaling units) of your
     * service.
     */
    public
        fun instanceConfiguration(instanceConfiguration: CfnService.InstanceConfigurationProperty)

    /**
     * @param instanceConfiguration The runtime configuration of instances (scaling units) of your
     * service.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("bf7188751cde7d7668c70bddfe8a94993eaa1af1e678d4dc57b23d216ac4be64")
    public
        fun instanceConfiguration(instanceConfiguration: CfnService.InstanceConfigurationProperty.Builder.() -> Unit)

    /**
     * @param networkConfiguration Configuration settings related to network traffic of the web
     * application that the App Runner service runs.
     */
    public fun networkConfiguration(networkConfiguration: IResolvable)

    /**
     * @param networkConfiguration Configuration settings related to network traffic of the web
     * application that the App Runner service runs.
     */
    public fun networkConfiguration(networkConfiguration: CfnService.NetworkConfigurationProperty)

    /**
     * @param networkConfiguration Configuration settings related to network traffic of the web
     * application that the App Runner service runs.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("b418e47fe08f5290b0f1a068b27337650fb141bd52d38352cecad086c72c1366")
    public
        fun networkConfiguration(networkConfiguration: CfnService.NetworkConfigurationProperty.Builder.() -> Unit)

    /**
     * @param observabilityConfiguration The observability configuration of your service.
     */
    public fun observabilityConfiguration(observabilityConfiguration: IResolvable)

    /**
     * @param observabilityConfiguration The observability configuration of your service.
     */
    public
        fun observabilityConfiguration(observabilityConfiguration: CfnService.ServiceObservabilityConfigurationProperty)

    /**
     * @param observabilityConfiguration The observability configuration of your service.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("3273b9f90fc0c47f878a26bbb7513b8d2b58f35e71c5b830049d9cedff1dc752")
    public
        fun observabilityConfiguration(observabilityConfiguration: CfnService.ServiceObservabilityConfigurationProperty.Builder.() -> Unit)

    /**
     * @param serviceName A name for the App Runner service.
     * It must be unique across all the running App Runner services in your AWS account in the AWS
     * Region .
     *
     * If you don't specify a name, AWS CloudFormation generates a name for your service.
     */
    public fun serviceName(serviceName: String)

    /**
     * @param sourceConfiguration The source to deploy to the App Runner service. 
     * It can be a code or an image repository.
     */
    public fun sourceConfiguration(sourceConfiguration: IResolvable)

    /**
     * @param sourceConfiguration The source to deploy to the App Runner service. 
     * It can be a code or an image repository.
     */
    public fun sourceConfiguration(sourceConfiguration: CfnService.SourceConfigurationProperty)

    /**
     * @param sourceConfiguration The source to deploy to the App Runner service. 
     * It can be a code or an image repository.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("73f41b00a3b85c7ed2a39f1c1226fe1e759ad85ea56b1174bfaadd49a71e5941")
    public
        fun sourceConfiguration(sourceConfiguration: CfnService.SourceConfigurationProperty.Builder.() -> Unit)

    /**
     * @param tags An optional list of metadata items that you can associate with the App Runner
     * service resource.
     * A tag is a key-value pair.
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * @param tags An optional list of metadata items that you can associate with the App Runner
     * service resource.
     * A tag is a key-value pair.
     */
    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.apprunner.CfnServiceProps.Builder =
        software.amazon.awscdk.services.apprunner.CfnServiceProps.builder()

    /**
     * @param autoScalingConfigurationArn The Amazon Resource Name (ARN) of an App Runner automatic
     * scaling configuration resource that you want to associate with your service.
     * If not provided, App Runner associates the latest revision of a default auto scaling
     * configuration.
     *
     * Specify an ARN with a name and a revision number to associate that revision. For example:
     * `arn:aws:apprunner:us-east-1:123456789012:autoscalingconfiguration/high-availability/3`
     *
     * Specify just the name to associate the latest revision. For example:
     * `arn:aws:apprunner:us-east-1:123456789012:autoscalingconfiguration/high-availability`
     */
    override fun autoScalingConfigurationArn(autoScalingConfigurationArn: String) {
      cdkBuilder.autoScalingConfigurationArn(autoScalingConfigurationArn)
    }

    /**
     * @param encryptionConfiguration An optional custom encryption key that App Runner uses to
     * encrypt the copy of your source repository that it maintains and your service logs.
     * By default, App Runner uses an AWS managed key .
     */
    override fun encryptionConfiguration(encryptionConfiguration: IResolvable) {
      cdkBuilder.encryptionConfiguration(encryptionConfiguration.let(IResolvable::unwrap))
    }

    /**
     * @param encryptionConfiguration An optional custom encryption key that App Runner uses to
     * encrypt the copy of your source repository that it maintains and your service logs.
     * By default, App Runner uses an AWS managed key .
     */
    override
        fun encryptionConfiguration(encryptionConfiguration: CfnService.EncryptionConfigurationProperty) {
      cdkBuilder.encryptionConfiguration(encryptionConfiguration.let(CfnService.EncryptionConfigurationProperty::unwrap))
    }

    /**
     * @param encryptionConfiguration An optional custom encryption key that App Runner uses to
     * encrypt the copy of your source repository that it maintains and your service logs.
     * By default, App Runner uses an AWS managed key .
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("ea63b48209c6f49c89a028278e1a828ea9dd11c65bcab8ca75ed1e4e82fe0d5b")
    override
        fun encryptionConfiguration(encryptionConfiguration: CfnService.EncryptionConfigurationProperty.Builder.() -> Unit):
        Unit =
        encryptionConfiguration(CfnService.EncryptionConfigurationProperty(encryptionConfiguration))

    /**
     * @param healthCheckConfiguration The settings for the health check that AWS App Runner
     * performs to monitor the health of the App Runner service.
     */
    override fun healthCheckConfiguration(healthCheckConfiguration: IResolvable) {
      cdkBuilder.healthCheckConfiguration(healthCheckConfiguration.let(IResolvable::unwrap))
    }

    /**
     * @param healthCheckConfiguration The settings for the health check that AWS App Runner
     * performs to monitor the health of the App Runner service.
     */
    override
        fun healthCheckConfiguration(healthCheckConfiguration: CfnService.HealthCheckConfigurationProperty) {
      cdkBuilder.healthCheckConfiguration(healthCheckConfiguration.let(CfnService.HealthCheckConfigurationProperty::unwrap))
    }

    /**
     * @param healthCheckConfiguration The settings for the health check that AWS App Runner
     * performs to monitor the health of the App Runner service.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("8c729b4a0859cc2e637e97493b6202143875d5df1e412bfe0f1bb0947c25a787")
    override
        fun healthCheckConfiguration(healthCheckConfiguration: CfnService.HealthCheckConfigurationProperty.Builder.() -> Unit):
        Unit =
        healthCheckConfiguration(CfnService.HealthCheckConfigurationProperty(healthCheckConfiguration))

    /**
     * @param instanceConfiguration The runtime configuration of instances (scaling units) of your
     * service.
     */
    override fun instanceConfiguration(instanceConfiguration: IResolvable) {
      cdkBuilder.instanceConfiguration(instanceConfiguration.let(IResolvable::unwrap))
    }

    /**
     * @param instanceConfiguration The runtime configuration of instances (scaling units) of your
     * service.
     */
    override
        fun instanceConfiguration(instanceConfiguration: CfnService.InstanceConfigurationProperty) {
      cdkBuilder.instanceConfiguration(instanceConfiguration.let(CfnService.InstanceConfigurationProperty::unwrap))
    }

    /**
     * @param instanceConfiguration The runtime configuration of instances (scaling units) of your
     * service.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("bf7188751cde7d7668c70bddfe8a94993eaa1af1e678d4dc57b23d216ac4be64")
    override
        fun instanceConfiguration(instanceConfiguration: CfnService.InstanceConfigurationProperty.Builder.() -> Unit):
        Unit =
        instanceConfiguration(CfnService.InstanceConfigurationProperty(instanceConfiguration))

    /**
     * @param networkConfiguration Configuration settings related to network traffic of the web
     * application that the App Runner service runs.
     */
    override fun networkConfiguration(networkConfiguration: IResolvable) {
      cdkBuilder.networkConfiguration(networkConfiguration.let(IResolvable::unwrap))
    }

    /**
     * @param networkConfiguration Configuration settings related to network traffic of the web
     * application that the App Runner service runs.
     */
    override
        fun networkConfiguration(networkConfiguration: CfnService.NetworkConfigurationProperty) {
      cdkBuilder.networkConfiguration(networkConfiguration.let(CfnService.NetworkConfigurationProperty::unwrap))
    }

    /**
     * @param networkConfiguration Configuration settings related to network traffic of the web
     * application that the App Runner service runs.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("b418e47fe08f5290b0f1a068b27337650fb141bd52d38352cecad086c72c1366")
    override
        fun networkConfiguration(networkConfiguration: CfnService.NetworkConfigurationProperty.Builder.() -> Unit):
        Unit = networkConfiguration(CfnService.NetworkConfigurationProperty(networkConfiguration))

    /**
     * @param observabilityConfiguration The observability configuration of your service.
     */
    override fun observabilityConfiguration(observabilityConfiguration: IResolvable) {
      cdkBuilder.observabilityConfiguration(observabilityConfiguration.let(IResolvable::unwrap))
    }

    /**
     * @param observabilityConfiguration The observability configuration of your service.
     */
    override
        fun observabilityConfiguration(observabilityConfiguration: CfnService.ServiceObservabilityConfigurationProperty) {
      cdkBuilder.observabilityConfiguration(observabilityConfiguration.let(CfnService.ServiceObservabilityConfigurationProperty::unwrap))
    }

    /**
     * @param observabilityConfiguration The observability configuration of your service.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("3273b9f90fc0c47f878a26bbb7513b8d2b58f35e71c5b830049d9cedff1dc752")
    override
        fun observabilityConfiguration(observabilityConfiguration: CfnService.ServiceObservabilityConfigurationProperty.Builder.() -> Unit):
        Unit =
        observabilityConfiguration(CfnService.ServiceObservabilityConfigurationProperty(observabilityConfiguration))

    /**
     * @param serviceName A name for the App Runner service.
     * It must be unique across all the running App Runner services in your AWS account in the AWS
     * Region .
     *
     * If you don't specify a name, AWS CloudFormation generates a name for your service.
     */
    override fun serviceName(serviceName: String) {
      cdkBuilder.serviceName(serviceName)
    }

    /**
     * @param sourceConfiguration The source to deploy to the App Runner service. 
     * It can be a code or an image repository.
     */
    override fun sourceConfiguration(sourceConfiguration: IResolvable) {
      cdkBuilder.sourceConfiguration(sourceConfiguration.let(IResolvable::unwrap))
    }

    /**
     * @param sourceConfiguration The source to deploy to the App Runner service. 
     * It can be a code or an image repository.
     */
    override fun sourceConfiguration(sourceConfiguration: CfnService.SourceConfigurationProperty) {
      cdkBuilder.sourceConfiguration(sourceConfiguration.let(CfnService.SourceConfigurationProperty::unwrap))
    }

    /**
     * @param sourceConfiguration The source to deploy to the App Runner service. 
     * It can be a code or an image repository.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("73f41b00a3b85c7ed2a39f1c1226fe1e759ad85ea56b1174bfaadd49a71e5941")
    override
        fun sourceConfiguration(sourceConfiguration: CfnService.SourceConfigurationProperty.Builder.() -> Unit):
        Unit = sourceConfiguration(CfnService.SourceConfigurationProperty(sourceConfiguration))

    /**
     * @param tags An optional list of metadata items that you can associate with the App Runner
     * service resource.
     * A tag is a key-value pair.
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    /**
     * @param tags An optional list of metadata items that you can associate with the App Runner
     * service resource.
     * A tag is a key-value pair.
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.apprunner.CfnServiceProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.apprunner.CfnServiceProps,
  ) : CdkObject(cdkObject), CfnServiceProps {
    /**
     * The Amazon Resource Name (ARN) of an App Runner automatic scaling configuration resource that
     * you want to associate with your service.
     *
     * If not provided, App Runner associates the latest revision of a default auto scaling
     * configuration.
     *
     * Specify an ARN with a name and a revision number to associate that revision. For example:
     * `arn:aws:apprunner:us-east-1:123456789012:autoscalingconfiguration/high-availability/3`
     *
     * Specify just the name to associate the latest revision. For example:
     * `arn:aws:apprunner:us-east-1:123456789012:autoscalingconfiguration/high-availability`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apprunner-service.html#cfn-apprunner-service-autoscalingconfigurationarn)
     */
    override fun autoScalingConfigurationArn(): String? =
        unwrap(this).getAutoScalingConfigurationArn()

    /**
     * An optional custom encryption key that App Runner uses to encrypt the copy of your source
     * repository that it maintains and your service logs.
     *
     * By default, App Runner uses an AWS managed key .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apprunner-service.html#cfn-apprunner-service-encryptionconfiguration)
     */
    override fun encryptionConfiguration(): Any? = unwrap(this).getEncryptionConfiguration()

    /**
     * The settings for the health check that AWS App Runner performs to monitor the health of the
     * App Runner service.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apprunner-service.html#cfn-apprunner-service-healthcheckconfiguration)
     */
    override fun healthCheckConfiguration(): Any? = unwrap(this).getHealthCheckConfiguration()

    /**
     * The runtime configuration of instances (scaling units) of your service.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apprunner-service.html#cfn-apprunner-service-instanceconfiguration)
     */
    override fun instanceConfiguration(): Any? = unwrap(this).getInstanceConfiguration()

    /**
     * Configuration settings related to network traffic of the web application that the App Runner
     * service runs.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apprunner-service.html#cfn-apprunner-service-networkconfiguration)
     */
    override fun networkConfiguration(): Any? = unwrap(this).getNetworkConfiguration()

    /**
     * The observability configuration of your service.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apprunner-service.html#cfn-apprunner-service-observabilityconfiguration)
     */
    override fun observabilityConfiguration(): Any? = unwrap(this).getObservabilityConfiguration()

    /**
     * A name for the App Runner service.
     *
     * It must be unique across all the running App Runner services in your AWS account in the AWS
     * Region .
     *
     * If you don't specify a name, AWS CloudFormation generates a name for your service.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apprunner-service.html#cfn-apprunner-service-servicename)
     */
    override fun serviceName(): String? = unwrap(this).getServiceName()

    /**
     * The source to deploy to the App Runner service.
     *
     * It can be a code or an image repository.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apprunner-service.html#cfn-apprunner-service-sourceconfiguration)
     */
    override fun sourceConfiguration(): Any = unwrap(this).getSourceConfiguration()

    /**
     * An optional list of metadata items that you can associate with the App Runner service
     * resource.
     *
     * A tag is a key-value pair.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apprunner-service.html#cfn-apprunner-service-tags)
     */
    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnServiceProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.apprunner.CfnServiceProps):
        CfnServiceProps = CdkObjectWrappers.wrap(cdkObject) as? CfnServiceProps ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnServiceProps):
        software.amazon.awscdk.services.apprunner.CfnServiceProps = (wrapped as CdkObject).cdkObject
        as software.amazon.awscdk.services.apprunner.CfnServiceProps
  }
}
