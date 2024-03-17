@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.apprunner

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.ITaggable
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * Specify an AWS App Runner service by using the `AWS::AppRunner::Service` resource in an AWS
 * CloudFormation template.
 *
 * The `AWS::AppRunner::Service` resource is an AWS App Runner resource type that specifies an App
 * Runner service.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.apprunner.*;
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
public open class CfnService internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.apprunner.CfnService,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  /**
   * The Amazon Resource Name (ARN) of this service.
   */
  public open fun attrServiceArn(): String = unwrap(this).getAttrServiceArn()

  /**
   * An ID that App Runner generated for this service.
   *
   * It's unique within the AWS Region .
   */
  public open fun attrServiceId(): String = unwrap(this).getAttrServiceId()

  /**
   * A subdomain URL that App Runner generated for this service.
   *
   * You can use this URL to access your service web application.
   */
  public open fun attrServiceUrl(): String = unwrap(this).getAttrServiceUrl()

  /**
   * The current state of the App Runner service. These particular values mean the following.
   *
   * * `CREATE_FAILED` – The service failed to create. The failed service isn't usable, and still
   * counts towards your service quota. To troubleshoot this failure, read the failure events and logs,
   * change any parameters that need to be fixed, and rebuild your service using `UpdateService` .
   * * `DELETE_FAILED` – The service failed to delete and can't be successfully recovered. Retry the
   * service deletion call to ensure that all related resources are removed.
   */
  public open fun attrStatus(): String = unwrap(this).getAttrStatus()

  /**
   * The Amazon Resource Name (ARN) of an App Runner automatic scaling configuration resource that
   * you want to associate with your service.
   */
  public open fun autoScalingConfigurationArn(): String? =
      unwrap(this).getAutoScalingConfigurationArn()

  /**
   * The Amazon Resource Name (ARN) of an App Runner automatic scaling configuration resource that
   * you want to associate with your service.
   */
  public open fun autoScalingConfigurationArn(`value`: String) {
    unwrap(this).setAutoScalingConfigurationArn(`value`)
  }

  /**
   * An optional custom encryption key that App Runner uses to encrypt the copy of your source
   * repository that it maintains and your service logs.
   */
  public open fun encryptionConfiguration(): Any? = unwrap(this).getEncryptionConfiguration()

  /**
   * An optional custom encryption key that App Runner uses to encrypt the copy of your source
   * repository that it maintains and your service logs.
   */
  public open fun encryptionConfiguration(`value`: IResolvable) {
    unwrap(this).setEncryptionConfiguration(`value`.let(IResolvable::unwrap))
  }

  /**
   * An optional custom encryption key that App Runner uses to encrypt the copy of your source
   * repository that it maintains and your service logs.
   */
  public open fun encryptionConfiguration(`value`: EncryptionConfigurationProperty) {
    unwrap(this).setEncryptionConfiguration(`value`.let(EncryptionConfigurationProperty::unwrap))
  }

  /**
   * An optional custom encryption key that App Runner uses to encrypt the copy of your source
   * repository that it maintains and your service logs.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("98b91e5756ce40a80d5bc0e4703cad4ab2223a2c40031f2995d027775f6a50a7")
  public open
      fun encryptionConfiguration(`value`: EncryptionConfigurationProperty.Builder.() -> Unit): Unit
      = encryptionConfiguration(EncryptionConfigurationProperty(`value`))

  /**
   * The settings for the health check that AWS App Runner performs to monitor the health of the App
   * Runner service.
   */
  public open fun healthCheckConfiguration(): Any? = unwrap(this).getHealthCheckConfiguration()

  /**
   * The settings for the health check that AWS App Runner performs to monitor the health of the App
   * Runner service.
   */
  public open fun healthCheckConfiguration(`value`: IResolvable) {
    unwrap(this).setHealthCheckConfiguration(`value`.let(IResolvable::unwrap))
  }

  /**
   * The settings for the health check that AWS App Runner performs to monitor the health of the App
   * Runner service.
   */
  public open fun healthCheckConfiguration(`value`: HealthCheckConfigurationProperty) {
    unwrap(this).setHealthCheckConfiguration(`value`.let(HealthCheckConfigurationProperty::unwrap))
  }

  /**
   * The settings for the health check that AWS App Runner performs to monitor the health of the App
   * Runner service.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("3e1f01cf9f303d2c4c34bb69fed0e62c8935d776293113f73d1db67e18d2df7b")
  public open
      fun healthCheckConfiguration(`value`: HealthCheckConfigurationProperty.Builder.() -> Unit):
      Unit = healthCheckConfiguration(HealthCheckConfigurationProperty(`value`))

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  /**
   * The runtime configuration of instances (scaling units) of your service.
   */
  public open fun instanceConfiguration(): Any? = unwrap(this).getInstanceConfiguration()

  /**
   * The runtime configuration of instances (scaling units) of your service.
   */
  public open fun instanceConfiguration(`value`: IResolvable) {
    unwrap(this).setInstanceConfiguration(`value`.let(IResolvable::unwrap))
  }

  /**
   * The runtime configuration of instances (scaling units) of your service.
   */
  public open fun instanceConfiguration(`value`: InstanceConfigurationProperty) {
    unwrap(this).setInstanceConfiguration(`value`.let(InstanceConfigurationProperty::unwrap))
  }

  /**
   * The runtime configuration of instances (scaling units) of your service.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("1b425254fdaf4d2116d2417104df1a4bec5a27985ad0d2e2c69ba42c04fe97b9")
  public open fun instanceConfiguration(`value`: InstanceConfigurationProperty.Builder.() -> Unit):
      Unit = instanceConfiguration(InstanceConfigurationProperty(`value`))

  /**
   * Configuration settings related to network traffic of the web application that the App Runner
   * service runs.
   */
  public open fun networkConfiguration(): Any? = unwrap(this).getNetworkConfiguration()

  /**
   * Configuration settings related to network traffic of the web application that the App Runner
   * service runs.
   */
  public open fun networkConfiguration(`value`: IResolvable) {
    unwrap(this).setNetworkConfiguration(`value`.let(IResolvable::unwrap))
  }

  /**
   * Configuration settings related to network traffic of the web application that the App Runner
   * service runs.
   */
  public open fun networkConfiguration(`value`: NetworkConfigurationProperty) {
    unwrap(this).setNetworkConfiguration(`value`.let(NetworkConfigurationProperty::unwrap))
  }

  /**
   * Configuration settings related to network traffic of the web application that the App Runner
   * service runs.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("75ec6f659f4953aafc4723cb5b9a2e096f3823927e537d908ffb73f0a0a80b73")
  public open fun networkConfiguration(`value`: NetworkConfigurationProperty.Builder.() -> Unit):
      Unit = networkConfiguration(NetworkConfigurationProperty(`value`))

  /**
   * The observability configuration of your service.
   */
  public open fun observabilityConfiguration(): Any? = unwrap(this).getObservabilityConfiguration()

  /**
   * The observability configuration of your service.
   */
  public open fun observabilityConfiguration(`value`: IResolvable) {
    unwrap(this).setObservabilityConfiguration(`value`.let(IResolvable::unwrap))
  }

  /**
   * The observability configuration of your service.
   */
  public open fun observabilityConfiguration(`value`: ServiceObservabilityConfigurationProperty) {
    unwrap(this).setObservabilityConfiguration(`value`.let(ServiceObservabilityConfigurationProperty::unwrap))
  }

  /**
   * The observability configuration of your service.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("bc8cea312fbe5343c218302d22f437142f8c88841188eb3f17fae21c25d3061e")
  public open
      fun observabilityConfiguration(`value`: ServiceObservabilityConfigurationProperty.Builder.() -> Unit):
      Unit = observabilityConfiguration(ServiceObservabilityConfigurationProperty(`value`))

  /**
   * A name for the App Runner service.
   */
  public open fun serviceName(): String? = unwrap(this).getServiceName()

  /**
   * A name for the App Runner service.
   */
  public open fun serviceName(`value`: String) {
    unwrap(this).setServiceName(`value`)
  }

  /**
   * The source to deploy to the App Runner service.
   */
  public open fun sourceConfiguration(): Any = unwrap(this).getSourceConfiguration()

  /**
   * The source to deploy to the App Runner service.
   */
  public open fun sourceConfiguration(`value`: IResolvable) {
    unwrap(this).setSourceConfiguration(`value`.let(IResolvable::unwrap))
  }

  /**
   * The source to deploy to the App Runner service.
   */
  public open fun sourceConfiguration(`value`: SourceConfigurationProperty) {
    unwrap(this).setSourceConfiguration(`value`.let(SourceConfigurationProperty::unwrap))
  }

  /**
   * The source to deploy to the App Runner service.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("be8be8cfc5d8d1969301c427df51fdb2295bccc14ee982d008feb5efced5d92a")
  public open fun sourceConfiguration(`value`: SourceConfigurationProperty.Builder.() -> Unit): Unit
      = sourceConfiguration(SourceConfigurationProperty(`value`))

  /**
   * Tag Manager which manages the tags for this resource.
   */
  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  /**
   * An optional list of metadata items that you can associate with the App Runner service resource.
   */
  public open fun tagsRaw(): List<CfnTag> = unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?:
      emptyList()

  /**
   * An optional list of metadata items that you can associate with the App Runner service resource.
   */
  public open fun tagsRaw(`value`: List<CfnTag>) {
    unwrap(this).setTagsRaw(`value`.map(CfnTag::unwrap))
  }

  /**
   * An optional list of metadata items that you can associate with the App Runner service resource.
   */
  public open fun tagsRaw(vararg `value`: CfnTag): Unit = tagsRaw(`value`.toList())

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.apprunner.CfnService].
   */
  @CdkDslMarker
  public interface Builder {
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
     * @param autoScalingConfigurationArn The Amazon Resource Name (ARN) of an App Runner automatic
     * scaling configuration resource that you want to associate with your service. 
     */
    public fun autoScalingConfigurationArn(autoScalingConfigurationArn: String)

    /**
     * An optional custom encryption key that App Runner uses to encrypt the copy of your source
     * repository that it maintains and your service logs.
     *
     * By default, App Runner uses an AWS managed key .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apprunner-service.html#cfn-apprunner-service-encryptionconfiguration)
     * @param encryptionConfiguration An optional custom encryption key that App Runner uses to
     * encrypt the copy of your source repository that it maintains and your service logs. 
     */
    public fun encryptionConfiguration(encryptionConfiguration: IResolvable)

    /**
     * An optional custom encryption key that App Runner uses to encrypt the copy of your source
     * repository that it maintains and your service logs.
     *
     * By default, App Runner uses an AWS managed key .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apprunner-service.html#cfn-apprunner-service-encryptionconfiguration)
     * @param encryptionConfiguration An optional custom encryption key that App Runner uses to
     * encrypt the copy of your source repository that it maintains and your service logs. 
     */
    public fun encryptionConfiguration(encryptionConfiguration: EncryptionConfigurationProperty)

    /**
     * An optional custom encryption key that App Runner uses to encrypt the copy of your source
     * repository that it maintains and your service logs.
     *
     * By default, App Runner uses an AWS managed key .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apprunner-service.html#cfn-apprunner-service-encryptionconfiguration)
     * @param encryptionConfiguration An optional custom encryption key that App Runner uses to
     * encrypt the copy of your source repository that it maintains and your service logs. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("6498dc7a71a174c57ad39eae3b9c2e6322be2abcb7d9a9a6a26930976fa6e5b8")
    public
        fun encryptionConfiguration(encryptionConfiguration: EncryptionConfigurationProperty.Builder.() -> Unit)

    /**
     * The settings for the health check that AWS App Runner performs to monitor the health of the
     * App Runner service.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apprunner-service.html#cfn-apprunner-service-healthcheckconfiguration)
     * @param healthCheckConfiguration The settings for the health check that AWS App Runner
     * performs to monitor the health of the App Runner service. 
     */
    public fun healthCheckConfiguration(healthCheckConfiguration: IResolvable)

    /**
     * The settings for the health check that AWS App Runner performs to monitor the health of the
     * App Runner service.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apprunner-service.html#cfn-apprunner-service-healthcheckconfiguration)
     * @param healthCheckConfiguration The settings for the health check that AWS App Runner
     * performs to monitor the health of the App Runner service. 
     */
    public fun healthCheckConfiguration(healthCheckConfiguration: HealthCheckConfigurationProperty)

    /**
     * The settings for the health check that AWS App Runner performs to monitor the health of the
     * App Runner service.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apprunner-service.html#cfn-apprunner-service-healthcheckconfiguration)
     * @param healthCheckConfiguration The settings for the health check that AWS App Runner
     * performs to monitor the health of the App Runner service. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("f62a68b137bdd3c7e07a451d4318dfc24514f312ec7f8ff0e901f827c427f855")
    public
        fun healthCheckConfiguration(healthCheckConfiguration: HealthCheckConfigurationProperty.Builder.() -> Unit)

    /**
     * The runtime configuration of instances (scaling units) of your service.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apprunner-service.html#cfn-apprunner-service-instanceconfiguration)
     * @param instanceConfiguration The runtime configuration of instances (scaling units) of your
     * service. 
     */
    public fun instanceConfiguration(instanceConfiguration: IResolvable)

    /**
     * The runtime configuration of instances (scaling units) of your service.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apprunner-service.html#cfn-apprunner-service-instanceconfiguration)
     * @param instanceConfiguration The runtime configuration of instances (scaling units) of your
     * service. 
     */
    public fun instanceConfiguration(instanceConfiguration: InstanceConfigurationProperty)

    /**
     * The runtime configuration of instances (scaling units) of your service.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apprunner-service.html#cfn-apprunner-service-instanceconfiguration)
     * @param instanceConfiguration The runtime configuration of instances (scaling units) of your
     * service. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("c1abd6f08e7082f3902aa808d8829de5df2cbb8d39e8d0fcbeb1fb526632ca27")
    public
        fun instanceConfiguration(instanceConfiguration: InstanceConfigurationProperty.Builder.() -> Unit)

    /**
     * Configuration settings related to network traffic of the web application that the App Runner
     * service runs.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apprunner-service.html#cfn-apprunner-service-networkconfiguration)
     * @param networkConfiguration Configuration settings related to network traffic of the web
     * application that the App Runner service runs. 
     */
    public fun networkConfiguration(networkConfiguration: IResolvable)

    /**
     * Configuration settings related to network traffic of the web application that the App Runner
     * service runs.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apprunner-service.html#cfn-apprunner-service-networkconfiguration)
     * @param networkConfiguration Configuration settings related to network traffic of the web
     * application that the App Runner service runs. 
     */
    public fun networkConfiguration(networkConfiguration: NetworkConfigurationProperty)

    /**
     * Configuration settings related to network traffic of the web application that the App Runner
     * service runs.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apprunner-service.html#cfn-apprunner-service-networkconfiguration)
     * @param networkConfiguration Configuration settings related to network traffic of the web
     * application that the App Runner service runs. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("dd8c38eb6ac3af2147ea5dde6ebf5d1db79f047da5f232cde4afa22c6b4c6512")
    public
        fun networkConfiguration(networkConfiguration: NetworkConfigurationProperty.Builder.() -> Unit)

    /**
     * The observability configuration of your service.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apprunner-service.html#cfn-apprunner-service-observabilityconfiguration)
     * @param observabilityConfiguration The observability configuration of your service. 
     */
    public fun observabilityConfiguration(observabilityConfiguration: IResolvable)

    /**
     * The observability configuration of your service.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apprunner-service.html#cfn-apprunner-service-observabilityconfiguration)
     * @param observabilityConfiguration The observability configuration of your service. 
     */
    public
        fun observabilityConfiguration(observabilityConfiguration: ServiceObservabilityConfigurationProperty)

    /**
     * The observability configuration of your service.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apprunner-service.html#cfn-apprunner-service-observabilityconfiguration)
     * @param observabilityConfiguration The observability configuration of your service. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("27d1d16e2081902ee728d09204f028dd72160207f8aae659443d5763ab9d421d")
    public
        fun observabilityConfiguration(observabilityConfiguration: ServiceObservabilityConfigurationProperty.Builder.() -> Unit)

    /**
     * A name for the App Runner service.
     *
     * It must be unique across all the running App Runner services in your AWS account in the AWS
     * Region .
     *
     * If you don't specify a name, AWS CloudFormation generates a name for your service.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apprunner-service.html#cfn-apprunner-service-servicename)
     * @param serviceName A name for the App Runner service. 
     */
    public fun serviceName(serviceName: String)

    /**
     * The source to deploy to the App Runner service.
     *
     * It can be a code or an image repository.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apprunner-service.html#cfn-apprunner-service-sourceconfiguration)
     * @param sourceConfiguration The source to deploy to the App Runner service. 
     */
    public fun sourceConfiguration(sourceConfiguration: IResolvable)

    /**
     * The source to deploy to the App Runner service.
     *
     * It can be a code or an image repository.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apprunner-service.html#cfn-apprunner-service-sourceconfiguration)
     * @param sourceConfiguration The source to deploy to the App Runner service. 
     */
    public fun sourceConfiguration(sourceConfiguration: SourceConfigurationProperty)

    /**
     * The source to deploy to the App Runner service.
     *
     * It can be a code or an image repository.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apprunner-service.html#cfn-apprunner-service-sourceconfiguration)
     * @param sourceConfiguration The source to deploy to the App Runner service. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("dc962744b16adfa22376e3d1bfc9d1527c09ca3bb1e4fd7a7e3a8fb839ee24ec")
    public
        fun sourceConfiguration(sourceConfiguration: SourceConfigurationProperty.Builder.() -> Unit)

    /**
     * An optional list of metadata items that you can associate with the App Runner service
     * resource.
     *
     * A tag is a key-value pair.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apprunner-service.html#cfn-apprunner-service-tags)
     * @param tags An optional list of metadata items that you can associate with the App Runner
     * service resource. 
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * An optional list of metadata items that you can associate with the App Runner service
     * resource.
     *
     * A tag is a key-value pair.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apprunner-service.html#cfn-apprunner-service-tags)
     * @param tags An optional list of metadata items that you can associate with the App Runner
     * service resource. 
     */
    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.apprunner.CfnService.Builder =
        software.amazon.awscdk.services.apprunner.CfnService.Builder.create(scope, id)

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
     * @param autoScalingConfigurationArn The Amazon Resource Name (ARN) of an App Runner automatic
     * scaling configuration resource that you want to associate with your service. 
     */
    override fun autoScalingConfigurationArn(autoScalingConfigurationArn: String) {
      cdkBuilder.autoScalingConfigurationArn(autoScalingConfigurationArn)
    }

    /**
     * An optional custom encryption key that App Runner uses to encrypt the copy of your source
     * repository that it maintains and your service logs.
     *
     * By default, App Runner uses an AWS managed key .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apprunner-service.html#cfn-apprunner-service-encryptionconfiguration)
     * @param encryptionConfiguration An optional custom encryption key that App Runner uses to
     * encrypt the copy of your source repository that it maintains and your service logs. 
     */
    override fun encryptionConfiguration(encryptionConfiguration: IResolvable) {
      cdkBuilder.encryptionConfiguration(encryptionConfiguration.let(IResolvable::unwrap))
    }

    /**
     * An optional custom encryption key that App Runner uses to encrypt the copy of your source
     * repository that it maintains and your service logs.
     *
     * By default, App Runner uses an AWS managed key .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apprunner-service.html#cfn-apprunner-service-encryptionconfiguration)
     * @param encryptionConfiguration An optional custom encryption key that App Runner uses to
     * encrypt the copy of your source repository that it maintains and your service logs. 
     */
    override fun encryptionConfiguration(encryptionConfiguration: EncryptionConfigurationProperty) {
      cdkBuilder.encryptionConfiguration(encryptionConfiguration.let(EncryptionConfigurationProperty::unwrap))
    }

    /**
     * An optional custom encryption key that App Runner uses to encrypt the copy of your source
     * repository that it maintains and your service logs.
     *
     * By default, App Runner uses an AWS managed key .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apprunner-service.html#cfn-apprunner-service-encryptionconfiguration)
     * @param encryptionConfiguration An optional custom encryption key that App Runner uses to
     * encrypt the copy of your source repository that it maintains and your service logs. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("6498dc7a71a174c57ad39eae3b9c2e6322be2abcb7d9a9a6a26930976fa6e5b8")
    override
        fun encryptionConfiguration(encryptionConfiguration: EncryptionConfigurationProperty.Builder.() -> Unit):
        Unit = encryptionConfiguration(EncryptionConfigurationProperty(encryptionConfiguration))

    /**
     * The settings for the health check that AWS App Runner performs to monitor the health of the
     * App Runner service.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apprunner-service.html#cfn-apprunner-service-healthcheckconfiguration)
     * @param healthCheckConfiguration The settings for the health check that AWS App Runner
     * performs to monitor the health of the App Runner service. 
     */
    override fun healthCheckConfiguration(healthCheckConfiguration: IResolvable) {
      cdkBuilder.healthCheckConfiguration(healthCheckConfiguration.let(IResolvable::unwrap))
    }

    /**
     * The settings for the health check that AWS App Runner performs to monitor the health of the
     * App Runner service.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apprunner-service.html#cfn-apprunner-service-healthcheckconfiguration)
     * @param healthCheckConfiguration The settings for the health check that AWS App Runner
     * performs to monitor the health of the App Runner service. 
     */
    override
        fun healthCheckConfiguration(healthCheckConfiguration: HealthCheckConfigurationProperty) {
      cdkBuilder.healthCheckConfiguration(healthCheckConfiguration.let(HealthCheckConfigurationProperty::unwrap))
    }

    /**
     * The settings for the health check that AWS App Runner performs to monitor the health of the
     * App Runner service.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apprunner-service.html#cfn-apprunner-service-healthcheckconfiguration)
     * @param healthCheckConfiguration The settings for the health check that AWS App Runner
     * performs to monitor the health of the App Runner service. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("f62a68b137bdd3c7e07a451d4318dfc24514f312ec7f8ff0e901f827c427f855")
    override
        fun healthCheckConfiguration(healthCheckConfiguration: HealthCheckConfigurationProperty.Builder.() -> Unit):
        Unit = healthCheckConfiguration(HealthCheckConfigurationProperty(healthCheckConfiguration))

    /**
     * The runtime configuration of instances (scaling units) of your service.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apprunner-service.html#cfn-apprunner-service-instanceconfiguration)
     * @param instanceConfiguration The runtime configuration of instances (scaling units) of your
     * service. 
     */
    override fun instanceConfiguration(instanceConfiguration: IResolvable) {
      cdkBuilder.instanceConfiguration(instanceConfiguration.let(IResolvable::unwrap))
    }

    /**
     * The runtime configuration of instances (scaling units) of your service.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apprunner-service.html#cfn-apprunner-service-instanceconfiguration)
     * @param instanceConfiguration The runtime configuration of instances (scaling units) of your
     * service. 
     */
    override fun instanceConfiguration(instanceConfiguration: InstanceConfigurationProperty) {
      cdkBuilder.instanceConfiguration(instanceConfiguration.let(InstanceConfigurationProperty::unwrap))
    }

    /**
     * The runtime configuration of instances (scaling units) of your service.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apprunner-service.html#cfn-apprunner-service-instanceconfiguration)
     * @param instanceConfiguration The runtime configuration of instances (scaling units) of your
     * service. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("c1abd6f08e7082f3902aa808d8829de5df2cbb8d39e8d0fcbeb1fb526632ca27")
    override
        fun instanceConfiguration(instanceConfiguration: InstanceConfigurationProperty.Builder.() -> Unit):
        Unit = instanceConfiguration(InstanceConfigurationProperty(instanceConfiguration))

    /**
     * Configuration settings related to network traffic of the web application that the App Runner
     * service runs.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apprunner-service.html#cfn-apprunner-service-networkconfiguration)
     * @param networkConfiguration Configuration settings related to network traffic of the web
     * application that the App Runner service runs. 
     */
    override fun networkConfiguration(networkConfiguration: IResolvable) {
      cdkBuilder.networkConfiguration(networkConfiguration.let(IResolvable::unwrap))
    }

    /**
     * Configuration settings related to network traffic of the web application that the App Runner
     * service runs.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apprunner-service.html#cfn-apprunner-service-networkconfiguration)
     * @param networkConfiguration Configuration settings related to network traffic of the web
     * application that the App Runner service runs. 
     */
    override fun networkConfiguration(networkConfiguration: NetworkConfigurationProperty) {
      cdkBuilder.networkConfiguration(networkConfiguration.let(NetworkConfigurationProperty::unwrap))
    }

    /**
     * Configuration settings related to network traffic of the web application that the App Runner
     * service runs.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apprunner-service.html#cfn-apprunner-service-networkconfiguration)
     * @param networkConfiguration Configuration settings related to network traffic of the web
     * application that the App Runner service runs. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("dd8c38eb6ac3af2147ea5dde6ebf5d1db79f047da5f232cde4afa22c6b4c6512")
    override
        fun networkConfiguration(networkConfiguration: NetworkConfigurationProperty.Builder.() -> Unit):
        Unit = networkConfiguration(NetworkConfigurationProperty(networkConfiguration))

    /**
     * The observability configuration of your service.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apprunner-service.html#cfn-apprunner-service-observabilityconfiguration)
     * @param observabilityConfiguration The observability configuration of your service. 
     */
    override fun observabilityConfiguration(observabilityConfiguration: IResolvable) {
      cdkBuilder.observabilityConfiguration(observabilityConfiguration.let(IResolvable::unwrap))
    }

    /**
     * The observability configuration of your service.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apprunner-service.html#cfn-apprunner-service-observabilityconfiguration)
     * @param observabilityConfiguration The observability configuration of your service. 
     */
    override
        fun observabilityConfiguration(observabilityConfiguration: ServiceObservabilityConfigurationProperty) {
      cdkBuilder.observabilityConfiguration(observabilityConfiguration.let(ServiceObservabilityConfigurationProperty::unwrap))
    }

    /**
     * The observability configuration of your service.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apprunner-service.html#cfn-apprunner-service-observabilityconfiguration)
     * @param observabilityConfiguration The observability configuration of your service. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("27d1d16e2081902ee728d09204f028dd72160207f8aae659443d5763ab9d421d")
    override
        fun observabilityConfiguration(observabilityConfiguration: ServiceObservabilityConfigurationProperty.Builder.() -> Unit):
        Unit =
        observabilityConfiguration(ServiceObservabilityConfigurationProperty(observabilityConfiguration))

    /**
     * A name for the App Runner service.
     *
     * It must be unique across all the running App Runner services in your AWS account in the AWS
     * Region .
     *
     * If you don't specify a name, AWS CloudFormation generates a name for your service.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apprunner-service.html#cfn-apprunner-service-servicename)
     * @param serviceName A name for the App Runner service. 
     */
    override fun serviceName(serviceName: String) {
      cdkBuilder.serviceName(serviceName)
    }

    /**
     * The source to deploy to the App Runner service.
     *
     * It can be a code or an image repository.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apprunner-service.html#cfn-apprunner-service-sourceconfiguration)
     * @param sourceConfiguration The source to deploy to the App Runner service. 
     */
    override fun sourceConfiguration(sourceConfiguration: IResolvable) {
      cdkBuilder.sourceConfiguration(sourceConfiguration.let(IResolvable::unwrap))
    }

    /**
     * The source to deploy to the App Runner service.
     *
     * It can be a code or an image repository.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apprunner-service.html#cfn-apprunner-service-sourceconfiguration)
     * @param sourceConfiguration The source to deploy to the App Runner service. 
     */
    override fun sourceConfiguration(sourceConfiguration: SourceConfigurationProperty) {
      cdkBuilder.sourceConfiguration(sourceConfiguration.let(SourceConfigurationProperty::unwrap))
    }

    /**
     * The source to deploy to the App Runner service.
     *
     * It can be a code or an image repository.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apprunner-service.html#cfn-apprunner-service-sourceconfiguration)
     * @param sourceConfiguration The source to deploy to the App Runner service. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("dc962744b16adfa22376e3d1bfc9d1527c09ca3bb1e4fd7a7e3a8fb839ee24ec")
    override
        fun sourceConfiguration(sourceConfiguration: SourceConfigurationProperty.Builder.() -> Unit):
        Unit = sourceConfiguration(SourceConfigurationProperty(sourceConfiguration))

    /**
     * An optional list of metadata items that you can associate with the App Runner service
     * resource.
     *
     * A tag is a key-value pair.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apprunner-service.html#cfn-apprunner-service-tags)
     * @param tags An optional list of metadata items that you can associate with the App Runner
     * service resource. 
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    /**
     * An optional list of metadata items that you can associate with the App Runner service
     * resource.
     *
     * A tag is a key-value pair.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apprunner-service.html#cfn-apprunner-service-tags)
     * @param tags An optional list of metadata items that you can associate with the App Runner
     * service resource. 
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.apprunner.CfnService = cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.apprunner.CfnService.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnService {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnService(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.apprunner.CfnService): CfnService =
        CfnService(cdkObject)

    internal fun unwrap(wrapped: CfnService): software.amazon.awscdk.services.apprunner.CfnService =
        wrapped.cdkObject
  }

  /**
   * Describes configuration settings related to outbound network traffic of an AWS App Runner
   * service.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.apprunner.*;
   * EgressConfigurationProperty egressConfigurationProperty = EgressConfigurationProperty.builder()
   * .egressType("egressType")
   * // the properties below are optional
   * .vpcConnectorArn("vpcConnectorArn")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apprunner-service-egressconfiguration.html)
   */
  public interface EgressConfigurationProperty {
    /**
     * The type of egress configuration.
     *
     * Set to `DEFAULT` for access to resources hosted on public networks.
     *
     * Set to `VPC` to associate your service to a custom VPC specified by `VpcConnectorArn` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apprunner-service-egressconfiguration.html#cfn-apprunner-service-egressconfiguration-egresstype)
     */
    public fun egressType(): String

    /**
     * The Amazon Resource Name (ARN) of the App Runner VPC connector that you want to associate
     * with your App Runner service.
     *
     * Only valid when `EgressType = VPC` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apprunner-service-egressconfiguration.html#cfn-apprunner-service-egressconfiguration-vpcconnectorarn)
     */
    public fun vpcConnectorArn(): String? = unwrap(this).getVpcConnectorArn()

    /**
     * A builder for [EgressConfigurationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param egressType The type of egress configuration. 
       * Set to `DEFAULT` for access to resources hosted on public networks.
       *
       * Set to `VPC` to associate your service to a custom VPC specified by `VpcConnectorArn` .
       */
      public fun egressType(egressType: String)

      /**
       * @param vpcConnectorArn The Amazon Resource Name (ARN) of the App Runner VPC connector that
       * you want to associate with your App Runner service.
       * Only valid when `EgressType = VPC` .
       */
      public fun vpcConnectorArn(vpcConnectorArn: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.apprunner.CfnService.EgressConfigurationProperty.Builder =
          software.amazon.awscdk.services.apprunner.CfnService.EgressConfigurationProperty.builder()

      /**
       * @param egressType The type of egress configuration. 
       * Set to `DEFAULT` for access to resources hosted on public networks.
       *
       * Set to `VPC` to associate your service to a custom VPC specified by `VpcConnectorArn` .
       */
      override fun egressType(egressType: String) {
        cdkBuilder.egressType(egressType)
      }

      /**
       * @param vpcConnectorArn The Amazon Resource Name (ARN) of the App Runner VPC connector that
       * you want to associate with your App Runner service.
       * Only valid when `EgressType = VPC` .
       */
      override fun vpcConnectorArn(vpcConnectorArn: String) {
        cdkBuilder.vpcConnectorArn(vpcConnectorArn)
      }

      public fun build():
          software.amazon.awscdk.services.apprunner.CfnService.EgressConfigurationProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.apprunner.CfnService.EgressConfigurationProperty,
    ) : CdkObject(cdkObject), EgressConfigurationProperty {
      /**
       * The type of egress configuration.
       *
       * Set to `DEFAULT` for access to resources hosted on public networks.
       *
       * Set to `VPC` to associate your service to a custom VPC specified by `VpcConnectorArn` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apprunner-service-egressconfiguration.html#cfn-apprunner-service-egressconfiguration-egresstype)
       */
      override fun egressType(): String = unwrap(this).getEgressType()

      /**
       * The Amazon Resource Name (ARN) of the App Runner VPC connector that you want to associate
       * with your App Runner service.
       *
       * Only valid when `EgressType = VPC` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apprunner-service-egressconfiguration.html#cfn-apprunner-service-egressconfiguration-vpcconnectorarn)
       */
      override fun vpcConnectorArn(): String? = unwrap(this).getVpcConnectorArn()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): EgressConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.apprunner.CfnService.EgressConfigurationProperty):
          EgressConfigurationProperty = CdkObjectWrappers.wrap(cdkObject) as?
          EgressConfigurationProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: EgressConfigurationProperty):
          software.amazon.awscdk.services.apprunner.CfnService.EgressConfigurationProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.apprunner.CfnService.EgressConfigurationProperty
    }
  }

  /**
   * Describes a key-value pair, which is a string-to-string mapping.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.apprunner.*;
   * KeyValuePairProperty keyValuePairProperty = KeyValuePairProperty.builder()
   * .name("name")
   * .value("value")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apprunner-service-keyvaluepair.html)
   */
  public interface KeyValuePairProperty {
    /**
     * The key name string to map to a value.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apprunner-service-keyvaluepair.html#cfn-apprunner-service-keyvaluepair-name)
     */
    public fun name(): String? = unwrap(this).getName()

    /**
     * The value string to which the key name is mapped.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apprunner-service-keyvaluepair.html#cfn-apprunner-service-keyvaluepair-value)
     */
    public fun `value`(): String? = unwrap(this).getValue()

    /**
     * A builder for [KeyValuePairProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param name The key name string to map to a value.
       */
      public fun name(name: String)

      /**
       * @param value The value string to which the key name is mapped.
       */
      public fun `value`(`value`: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.apprunner.CfnService.KeyValuePairProperty.Builder =
          software.amazon.awscdk.services.apprunner.CfnService.KeyValuePairProperty.builder()

      /**
       * @param name The key name string to map to a value.
       */
      override fun name(name: String) {
        cdkBuilder.name(name)
      }

      /**
       * @param value The value string to which the key name is mapped.
       */
      override fun `value`(`value`: String) {
        cdkBuilder.`value`(`value`)
      }

      public fun build(): software.amazon.awscdk.services.apprunner.CfnService.KeyValuePairProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.apprunner.CfnService.KeyValuePairProperty,
    ) : CdkObject(cdkObject), KeyValuePairProperty {
      /**
       * The key name string to map to a value.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apprunner-service-keyvaluepair.html#cfn-apprunner-service-keyvaluepair-name)
       */
      override fun name(): String? = unwrap(this).getName()

      /**
       * The value string to which the key name is mapped.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apprunner-service-keyvaluepair.html#cfn-apprunner-service-keyvaluepair-value)
       */
      override fun `value`(): String? = unwrap(this).getValue()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): KeyValuePairProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.apprunner.CfnService.KeyValuePairProperty):
          KeyValuePairProperty = CdkObjectWrappers.wrap(cdkObject) as? KeyValuePairProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: KeyValuePairProperty):
          software.amazon.awscdk.services.apprunner.CfnService.KeyValuePairProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.apprunner.CfnService.KeyValuePairProperty
    }
  }

  /**
   * Describes a source code repository.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.apprunner.*;
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
   * .sourceDirectory("sourceDirectory")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apprunner-service-coderepository.html)
   */
  public interface CodeRepositoryProperty {
    /**
     * Configuration for building and running the service from a source code repository.
     *
     *
     * `CodeConfiguration` is required only for `CreateService` request.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apprunner-service-coderepository.html#cfn-apprunner-service-coderepository-codeconfiguration)
     */
    public fun codeConfiguration(): Any? = unwrap(this).getCodeConfiguration()

    /**
     * The location of the repository that contains the source code.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apprunner-service-coderepository.html#cfn-apprunner-service-coderepository-repositoryurl)
     */
    public fun repositoryUrl(): String

    /**
     * The version that should be used within the source code repository.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apprunner-service-coderepository.html#cfn-apprunner-service-coderepository-sourcecodeversion)
     */
    public fun sourceCodeVersion(): Any

    /**
     * The path of the directory that stores source code and configuration files.
     *
     * The build and start commands also execute from here. The path is absolute from root and, if
     * not specified, defaults to the repository root.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apprunner-service-coderepository.html#cfn-apprunner-service-coderepository-sourcedirectory)
     */
    public fun sourceDirectory(): String? = unwrap(this).getSourceDirectory()

    /**
     * A builder for [CodeRepositoryProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param codeConfiguration Configuration for building and running the service from a source
       * code repository.
       *
       * `CodeConfiguration` is required only for `CreateService` request.
       */
      public fun codeConfiguration(codeConfiguration: IResolvable)

      /**
       * @param codeConfiguration Configuration for building and running the service from a source
       * code repository.
       *
       * `CodeConfiguration` is required only for `CreateService` request.
       */
      public fun codeConfiguration(codeConfiguration: CodeConfigurationProperty)

      /**
       * @param codeConfiguration Configuration for building and running the service from a source
       * code repository.
       *
       * `CodeConfiguration` is required only for `CreateService` request.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("0c960440565fa14856e944f7527e19099e496dfbf425fca9c114aee146a28bb8")
      public fun codeConfiguration(codeConfiguration: CodeConfigurationProperty.Builder.() -> Unit)

      /**
       * @param repositoryUrl The location of the repository that contains the source code. 
       */
      public fun repositoryUrl(repositoryUrl: String)

      /**
       * @param sourceCodeVersion The version that should be used within the source code repository.
       * 
       */
      public fun sourceCodeVersion(sourceCodeVersion: IResolvable)

      /**
       * @param sourceCodeVersion The version that should be used within the source code repository.
       * 
       */
      public fun sourceCodeVersion(sourceCodeVersion: SourceCodeVersionProperty)

      /**
       * @param sourceCodeVersion The version that should be used within the source code repository.
       * 
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("a11280fe561d2ce9c9bc534329afd076e0d9e81b43d363d4234a98a691185152")
      public fun sourceCodeVersion(sourceCodeVersion: SourceCodeVersionProperty.Builder.() -> Unit)

      /**
       * @param sourceDirectory The path of the directory that stores source code and configuration
       * files.
       * The build and start commands also execute from here. The path is absolute from root and, if
       * not specified, defaults to the repository root.
       */
      public fun sourceDirectory(sourceDirectory: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.apprunner.CfnService.CodeRepositoryProperty.Builder =
          software.amazon.awscdk.services.apprunner.CfnService.CodeRepositoryProperty.builder()

      /**
       * @param codeConfiguration Configuration for building and running the service from a source
       * code repository.
       *
       * `CodeConfiguration` is required only for `CreateService` request.
       */
      override fun codeConfiguration(codeConfiguration: IResolvable) {
        cdkBuilder.codeConfiguration(codeConfiguration.let(IResolvable::unwrap))
      }

      /**
       * @param codeConfiguration Configuration for building and running the service from a source
       * code repository.
       *
       * `CodeConfiguration` is required only for `CreateService` request.
       */
      override fun codeConfiguration(codeConfiguration: CodeConfigurationProperty) {
        cdkBuilder.codeConfiguration(codeConfiguration.let(CodeConfigurationProperty::unwrap))
      }

      /**
       * @param codeConfiguration Configuration for building and running the service from a source
       * code repository.
       *
       * `CodeConfiguration` is required only for `CreateService` request.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("0c960440565fa14856e944f7527e19099e496dfbf425fca9c114aee146a28bb8")
      override
          fun codeConfiguration(codeConfiguration: CodeConfigurationProperty.Builder.() -> Unit):
          Unit = codeConfiguration(CodeConfigurationProperty(codeConfiguration))

      /**
       * @param repositoryUrl The location of the repository that contains the source code. 
       */
      override fun repositoryUrl(repositoryUrl: String) {
        cdkBuilder.repositoryUrl(repositoryUrl)
      }

      /**
       * @param sourceCodeVersion The version that should be used within the source code repository.
       * 
       */
      override fun sourceCodeVersion(sourceCodeVersion: IResolvable) {
        cdkBuilder.sourceCodeVersion(sourceCodeVersion.let(IResolvable::unwrap))
      }

      /**
       * @param sourceCodeVersion The version that should be used within the source code repository.
       * 
       */
      override fun sourceCodeVersion(sourceCodeVersion: SourceCodeVersionProperty) {
        cdkBuilder.sourceCodeVersion(sourceCodeVersion.let(SourceCodeVersionProperty::unwrap))
      }

      /**
       * @param sourceCodeVersion The version that should be used within the source code repository.
       * 
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("a11280fe561d2ce9c9bc534329afd076e0d9e81b43d363d4234a98a691185152")
      override
          fun sourceCodeVersion(sourceCodeVersion: SourceCodeVersionProperty.Builder.() -> Unit):
          Unit = sourceCodeVersion(SourceCodeVersionProperty(sourceCodeVersion))

      /**
       * @param sourceDirectory The path of the directory that stores source code and configuration
       * files.
       * The build and start commands also execute from here. The path is absolute from root and, if
       * not specified, defaults to the repository root.
       */
      override fun sourceDirectory(sourceDirectory: String) {
        cdkBuilder.sourceDirectory(sourceDirectory)
      }

      public fun build():
          software.amazon.awscdk.services.apprunner.CfnService.CodeRepositoryProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.apprunner.CfnService.CodeRepositoryProperty,
    ) : CdkObject(cdkObject), CodeRepositoryProperty {
      /**
       * Configuration for building and running the service from a source code repository.
       *
       *
       * `CodeConfiguration` is required only for `CreateService` request.
       *
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apprunner-service-coderepository.html#cfn-apprunner-service-coderepository-codeconfiguration)
       */
      override fun codeConfiguration(): Any? = unwrap(this).getCodeConfiguration()

      /**
       * The location of the repository that contains the source code.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apprunner-service-coderepository.html#cfn-apprunner-service-coderepository-repositoryurl)
       */
      override fun repositoryUrl(): String = unwrap(this).getRepositoryUrl()

      /**
       * The version that should be used within the source code repository.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apprunner-service-coderepository.html#cfn-apprunner-service-coderepository-sourcecodeversion)
       */
      override fun sourceCodeVersion(): Any = unwrap(this).getSourceCodeVersion()

      /**
       * The path of the directory that stores source code and configuration files.
       *
       * The build and start commands also execute from here. The path is absolute from root and, if
       * not specified, defaults to the repository root.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apprunner-service-coderepository.html#cfn-apprunner-service-coderepository-sourcedirectory)
       */
      override fun sourceDirectory(): String? = unwrap(this).getSourceDirectory()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): CodeRepositoryProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.apprunner.CfnService.CodeRepositoryProperty):
          CodeRepositoryProperty = CdkObjectWrappers.wrap(cdkObject) as? CodeRepositoryProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: CodeRepositoryProperty):
          software.amazon.awscdk.services.apprunner.CfnService.CodeRepositoryProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.apprunner.CfnService.CodeRepositoryProperty
    }
  }

  /**
   * Describes the configuration that AWS App Runner uses to build and run an App Runner service
   * from a source code repository.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.apprunner.*;
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
  public interface CodeConfigurationProperty {
    /**
     * The basic configuration for building and running the App Runner service.
     *
     * Use it to quickly launch an App Runner service without providing a `apprunner.yaml` file in
     * the source code repository (or ignoring the file if it exists).
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apprunner-service-codeconfiguration.html#cfn-apprunner-service-codeconfiguration-codeconfigurationvalues)
     */
    public fun codeConfigurationValues(): Any? = unwrap(this).getCodeConfigurationValues()

    /**
     * The source of the App Runner configuration. Values are interpreted as follows:.
     *
     * * `REPOSITORY` – App Runner reads configuration values from the `apprunner.yaml` file in the
     * source code repository and ignores `CodeConfigurationValues` .
     * * `API` – App Runner uses configuration values provided in `CodeConfigurationValues` and
     * ignores the `apprunner.yaml` file in the source code repository.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apprunner-service-codeconfiguration.html#cfn-apprunner-service-codeconfiguration-configurationsource)
     */
    public fun configurationSource(): String

    /**
     * A builder for [CodeConfigurationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param codeConfigurationValues The basic configuration for building and running the App
       * Runner service.
       * Use it to quickly launch an App Runner service without providing a `apprunner.yaml` file in
       * the source code repository (or ignoring the file if it exists).
       */
      public fun codeConfigurationValues(codeConfigurationValues: IResolvable)

      /**
       * @param codeConfigurationValues The basic configuration for building and running the App
       * Runner service.
       * Use it to quickly launch an App Runner service without providing a `apprunner.yaml` file in
       * the source code repository (or ignoring the file if it exists).
       */
      public fun codeConfigurationValues(codeConfigurationValues: CodeConfigurationValuesProperty)

      /**
       * @param codeConfigurationValues The basic configuration for building and running the App
       * Runner service.
       * Use it to quickly launch an App Runner service without providing a `apprunner.yaml` file in
       * the source code repository (or ignoring the file if it exists).
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("3c42f1eedb0abdc71ecbbfd342f8f06aa8ff7fa1c27900a53c5476cca7e690d4")
      public
          fun codeConfigurationValues(codeConfigurationValues: CodeConfigurationValuesProperty.Builder.() -> Unit)

      /**
       * @param configurationSource The source of the App Runner configuration. Values are
       * interpreted as follows:. 
       * * `REPOSITORY` – App Runner reads configuration values from the `apprunner.yaml` file in
       * the source code repository and ignores `CodeConfigurationValues` .
       * * `API` – App Runner uses configuration values provided in `CodeConfigurationValues` and
       * ignores the `apprunner.yaml` file in the source code repository.
       */
      public fun configurationSource(configurationSource: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.apprunner.CfnService.CodeConfigurationProperty.Builder =
          software.amazon.awscdk.services.apprunner.CfnService.CodeConfigurationProperty.builder()

      /**
       * @param codeConfigurationValues The basic configuration for building and running the App
       * Runner service.
       * Use it to quickly launch an App Runner service without providing a `apprunner.yaml` file in
       * the source code repository (or ignoring the file if it exists).
       */
      override fun codeConfigurationValues(codeConfigurationValues: IResolvable) {
        cdkBuilder.codeConfigurationValues(codeConfigurationValues.let(IResolvable::unwrap))
      }

      /**
       * @param codeConfigurationValues The basic configuration for building and running the App
       * Runner service.
       * Use it to quickly launch an App Runner service without providing a `apprunner.yaml` file in
       * the source code repository (or ignoring the file if it exists).
       */
      override
          fun codeConfigurationValues(codeConfigurationValues: CodeConfigurationValuesProperty) {
        cdkBuilder.codeConfigurationValues(codeConfigurationValues.let(CodeConfigurationValuesProperty::unwrap))
      }

      /**
       * @param codeConfigurationValues The basic configuration for building and running the App
       * Runner service.
       * Use it to quickly launch an App Runner service without providing a `apprunner.yaml` file in
       * the source code repository (or ignoring the file if it exists).
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("3c42f1eedb0abdc71ecbbfd342f8f06aa8ff7fa1c27900a53c5476cca7e690d4")
      override
          fun codeConfigurationValues(codeConfigurationValues: CodeConfigurationValuesProperty.Builder.() -> Unit):
          Unit = codeConfigurationValues(CodeConfigurationValuesProperty(codeConfigurationValues))

      /**
       * @param configurationSource The source of the App Runner configuration. Values are
       * interpreted as follows:. 
       * * `REPOSITORY` – App Runner reads configuration values from the `apprunner.yaml` file in
       * the source code repository and ignores `CodeConfigurationValues` .
       * * `API` – App Runner uses configuration values provided in `CodeConfigurationValues` and
       * ignores the `apprunner.yaml` file in the source code repository.
       */
      override fun configurationSource(configurationSource: String) {
        cdkBuilder.configurationSource(configurationSource)
      }

      public fun build():
          software.amazon.awscdk.services.apprunner.CfnService.CodeConfigurationProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.apprunner.CfnService.CodeConfigurationProperty,
    ) : CdkObject(cdkObject), CodeConfigurationProperty {
      /**
       * The basic configuration for building and running the App Runner service.
       *
       * Use it to quickly launch an App Runner service without providing a `apprunner.yaml` file in
       * the source code repository (or ignoring the file if it exists).
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apprunner-service-codeconfiguration.html#cfn-apprunner-service-codeconfiguration-codeconfigurationvalues)
       */
      override fun codeConfigurationValues(): Any? = unwrap(this).getCodeConfigurationValues()

      /**
       * The source of the App Runner configuration. Values are interpreted as follows:.
       *
       * * `REPOSITORY` – App Runner reads configuration values from the `apprunner.yaml` file in
       * the source code repository and ignores `CodeConfigurationValues` .
       * * `API` – App Runner uses configuration values provided in `CodeConfigurationValues` and
       * ignores the `apprunner.yaml` file in the source code repository.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apprunner-service-codeconfiguration.html#cfn-apprunner-service-codeconfiguration-configurationsource)
       */
      override fun configurationSource(): String = unwrap(this).getConfigurationSource()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): CodeConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.apprunner.CfnService.CodeConfigurationProperty):
          CodeConfigurationProperty = CdkObjectWrappers.wrap(cdkObject) as?
          CodeConfigurationProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: CodeConfigurationProperty):
          software.amazon.awscdk.services.apprunner.CfnService.CodeConfigurationProperty = (wrapped
          as CdkObject).cdkObject as
          software.amazon.awscdk.services.apprunner.CfnService.CodeConfigurationProperty
    }
  }

  /**
   * Describes configuration settings related to network traffic of an AWS App Runner service.
   *
   * Consists of embedded objects for each configurable network feature.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.apprunner.*;
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
   * .ipAddressType("ipAddressType")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apprunner-service-networkconfiguration.html)
   */
  public interface NetworkConfigurationProperty {
    /**
     * Network configuration settings for outbound message traffic.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apprunner-service-networkconfiguration.html#cfn-apprunner-service-networkconfiguration-egressconfiguration)
     */
    public fun egressConfiguration(): Any? = unwrap(this).getEgressConfiguration()

    /**
     * Network configuration settings for inbound message traffic.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apprunner-service-networkconfiguration.html#cfn-apprunner-service-networkconfiguration-ingressconfiguration)
     */
    public fun ingressConfiguration(): Any? = unwrap(this).getIngressConfiguration()

    /**
     * App Runner provides you with the option to choose between *Internet Protocol version 4
     * (IPv4)* and *dual stack* (IPv4 and IPv6) for your incoming public network configuration.
     *
     * This is an optional parameter. If you do not specify an `IpAddressType` , it defaults to
     * select IPv4.
     *
     *
     * Currently, App Runner supports dual stack for only Public endpoint. Only IPv4 is supported
     * for Private endpoint. If you update a service that's using dual-stack Public endpoint to a
     * Private endpoint, your App Runner service will default to support only IPv4 for Private endpoint
     * and fail to receive traffic originating from IPv6 endpoint.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apprunner-service-networkconfiguration.html#cfn-apprunner-service-networkconfiguration-ipaddresstype)
     */
    public fun ipAddressType(): String? = unwrap(this).getIpAddressType()

    /**
     * A builder for [NetworkConfigurationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param egressConfiguration Network configuration settings for outbound message traffic.
       */
      public fun egressConfiguration(egressConfiguration: IResolvable)

      /**
       * @param egressConfiguration Network configuration settings for outbound message traffic.
       */
      public fun egressConfiguration(egressConfiguration: EgressConfigurationProperty)

      /**
       * @param egressConfiguration Network configuration settings for outbound message traffic.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("fbc4db8dd90c63a25c3388567ce4c7f7f89dba05a84fd00996bc034934570ca8")
      public
          fun egressConfiguration(egressConfiguration: EgressConfigurationProperty.Builder.() -> Unit)

      /**
       * @param ingressConfiguration Network configuration settings for inbound message traffic.
       */
      public fun ingressConfiguration(ingressConfiguration: IResolvable)

      /**
       * @param ingressConfiguration Network configuration settings for inbound message traffic.
       */
      public fun ingressConfiguration(ingressConfiguration: IngressConfigurationProperty)

      /**
       * @param ingressConfiguration Network configuration settings for inbound message traffic.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("bc0e7a6417da092d1c97a93c9b80849c6d1cf9ba836ca868306454679bdf4fb3")
      public
          fun ingressConfiguration(ingressConfiguration: IngressConfigurationProperty.Builder.() -> Unit)

      /**
       * @param ipAddressType App Runner provides you with the option to choose between *Internet
       * Protocol version 4 (IPv4)* and *dual stack* (IPv4 and IPv6) for your incoming public network
       * configuration.
       * This is an optional parameter. If you do not specify an `IpAddressType` , it defaults to
       * select IPv4.
       *
       *
       * Currently, App Runner supports dual stack for only Public endpoint. Only IPv4 is supported
       * for Private endpoint. If you update a service that's using dual-stack Public endpoint to a
       * Private endpoint, your App Runner service will default to support only IPv4 for Private
       * endpoint and fail to receive traffic originating from IPv6 endpoint.
       */
      public fun ipAddressType(ipAddressType: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.apprunner.CfnService.NetworkConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.apprunner.CfnService.NetworkConfigurationProperty.builder()

      /**
       * @param egressConfiguration Network configuration settings for outbound message traffic.
       */
      override fun egressConfiguration(egressConfiguration: IResolvable) {
        cdkBuilder.egressConfiguration(egressConfiguration.let(IResolvable::unwrap))
      }

      /**
       * @param egressConfiguration Network configuration settings for outbound message traffic.
       */
      override fun egressConfiguration(egressConfiguration: EgressConfigurationProperty) {
        cdkBuilder.egressConfiguration(egressConfiguration.let(EgressConfigurationProperty::unwrap))
      }

      /**
       * @param egressConfiguration Network configuration settings for outbound message traffic.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("fbc4db8dd90c63a25c3388567ce4c7f7f89dba05a84fd00996bc034934570ca8")
      override
          fun egressConfiguration(egressConfiguration: EgressConfigurationProperty.Builder.() -> Unit):
          Unit = egressConfiguration(EgressConfigurationProperty(egressConfiguration))

      /**
       * @param ingressConfiguration Network configuration settings for inbound message traffic.
       */
      override fun ingressConfiguration(ingressConfiguration: IResolvable) {
        cdkBuilder.ingressConfiguration(ingressConfiguration.let(IResolvable::unwrap))
      }

      /**
       * @param ingressConfiguration Network configuration settings for inbound message traffic.
       */
      override fun ingressConfiguration(ingressConfiguration: IngressConfigurationProperty) {
        cdkBuilder.ingressConfiguration(ingressConfiguration.let(IngressConfigurationProperty::unwrap))
      }

      /**
       * @param ingressConfiguration Network configuration settings for inbound message traffic.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("bc0e7a6417da092d1c97a93c9b80849c6d1cf9ba836ca868306454679bdf4fb3")
      override
          fun ingressConfiguration(ingressConfiguration: IngressConfigurationProperty.Builder.() -> Unit):
          Unit = ingressConfiguration(IngressConfigurationProperty(ingressConfiguration))

      /**
       * @param ipAddressType App Runner provides you with the option to choose between *Internet
       * Protocol version 4 (IPv4)* and *dual stack* (IPv4 and IPv6) for your incoming public network
       * configuration.
       * This is an optional parameter. If you do not specify an `IpAddressType` , it defaults to
       * select IPv4.
       *
       *
       * Currently, App Runner supports dual stack for only Public endpoint. Only IPv4 is supported
       * for Private endpoint. If you update a service that's using dual-stack Public endpoint to a
       * Private endpoint, your App Runner service will default to support only IPv4 for Private
       * endpoint and fail to receive traffic originating from IPv6 endpoint.
       */
      override fun ipAddressType(ipAddressType: String) {
        cdkBuilder.ipAddressType(ipAddressType)
      }

      public fun build():
          software.amazon.awscdk.services.apprunner.CfnService.NetworkConfigurationProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.apprunner.CfnService.NetworkConfigurationProperty,
    ) : CdkObject(cdkObject), NetworkConfigurationProperty {
      /**
       * Network configuration settings for outbound message traffic.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apprunner-service-networkconfiguration.html#cfn-apprunner-service-networkconfiguration-egressconfiguration)
       */
      override fun egressConfiguration(): Any? = unwrap(this).getEgressConfiguration()

      /**
       * Network configuration settings for inbound message traffic.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apprunner-service-networkconfiguration.html#cfn-apprunner-service-networkconfiguration-ingressconfiguration)
       */
      override fun ingressConfiguration(): Any? = unwrap(this).getIngressConfiguration()

      /**
       * App Runner provides you with the option to choose between *Internet Protocol version 4
       * (IPv4)* and *dual stack* (IPv4 and IPv6) for your incoming public network configuration.
       *
       * This is an optional parameter. If you do not specify an `IpAddressType` , it defaults to
       * select IPv4.
       *
       *
       * Currently, App Runner supports dual stack for only Public endpoint. Only IPv4 is supported
       * for Private endpoint. If you update a service that's using dual-stack Public endpoint to a
       * Private endpoint, your App Runner service will default to support only IPv4 for Private
       * endpoint and fail to receive traffic originating from IPv6 endpoint.
       *
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apprunner-service-networkconfiguration.html#cfn-apprunner-service-networkconfiguration-ipaddresstype)
       */
      override fun ipAddressType(): String? = unwrap(this).getIpAddressType()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): NetworkConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.apprunner.CfnService.NetworkConfigurationProperty):
          NetworkConfigurationProperty = CdkObjectWrappers.wrap(cdkObject) as?
          NetworkConfigurationProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: NetworkConfigurationProperty):
          software.amazon.awscdk.services.apprunner.CfnService.NetworkConfigurationProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.apprunner.CfnService.NetworkConfigurationProperty
    }
  }

  /**
   * Describes the observability configuration of an AWS App Runner service.
   *
   * These are additional observability features, like tracing, that you choose to enable. They're
   * configured in a separate resource that you associate with your service.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.apprunner.*;
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
  public interface ServiceObservabilityConfigurationProperty {
    /**
     * The Amazon Resource Name (ARN) of the observability configuration that is associated with the
     * service.
     *
     * Specified only when `ObservabilityEnabled` is `true` .
     *
     * Specify an ARN with a name and a revision number to associate that revision. For example:
     * `arn:aws:apprunner:us-east-1:123456789012:observabilityconfiguration/xray-tracing/3`
     *
     * Specify just the name to associate the latest revision. For example:
     * `arn:aws:apprunner:us-east-1:123456789012:observabilityconfiguration/xray-tracing`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apprunner-service-serviceobservabilityconfiguration.html#cfn-apprunner-service-serviceobservabilityconfiguration-observabilityconfigurationarn)
     */
    public fun observabilityConfigurationArn(): String? =
        unwrap(this).getObservabilityConfigurationArn()

    /**
     * When `true` , an observability configuration resource is associated with the service, and an
     * `ObservabilityConfigurationArn` is specified.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apprunner-service-serviceobservabilityconfiguration.html#cfn-apprunner-service-serviceobservabilityconfiguration-observabilityenabled)
     */
    public fun observabilityEnabled(): Any

    /**
     * A builder for [ServiceObservabilityConfigurationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param observabilityConfigurationArn The Amazon Resource Name (ARN) of the observability
       * configuration that is associated with the service.
       * Specified only when `ObservabilityEnabled` is `true` .
       *
       * Specify an ARN with a name and a revision number to associate that revision. For example:
       * `arn:aws:apprunner:us-east-1:123456789012:observabilityconfiguration/xray-tracing/3`
       *
       * Specify just the name to associate the latest revision. For example:
       * `arn:aws:apprunner:us-east-1:123456789012:observabilityconfiguration/xray-tracing`
       */
      public fun observabilityConfigurationArn(observabilityConfigurationArn: String)

      /**
       * @param observabilityEnabled When `true` , an observability configuration resource is
       * associated with the service, and an `ObservabilityConfigurationArn` is specified. 
       */
      public fun observabilityEnabled(observabilityEnabled: Boolean)

      /**
       * @param observabilityEnabled When `true` , an observability configuration resource is
       * associated with the service, and an `ObservabilityConfigurationArn` is specified. 
       */
      public fun observabilityEnabled(observabilityEnabled: IResolvable)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.apprunner.CfnService.ServiceObservabilityConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.apprunner.CfnService.ServiceObservabilityConfigurationProperty.builder()

      /**
       * @param observabilityConfigurationArn The Amazon Resource Name (ARN) of the observability
       * configuration that is associated with the service.
       * Specified only when `ObservabilityEnabled` is `true` .
       *
       * Specify an ARN with a name and a revision number to associate that revision. For example:
       * `arn:aws:apprunner:us-east-1:123456789012:observabilityconfiguration/xray-tracing/3`
       *
       * Specify just the name to associate the latest revision. For example:
       * `arn:aws:apprunner:us-east-1:123456789012:observabilityconfiguration/xray-tracing`
       */
      override fun observabilityConfigurationArn(observabilityConfigurationArn: String) {
        cdkBuilder.observabilityConfigurationArn(observabilityConfigurationArn)
      }

      /**
       * @param observabilityEnabled When `true` , an observability configuration resource is
       * associated with the service, and an `ObservabilityConfigurationArn` is specified. 
       */
      override fun observabilityEnabled(observabilityEnabled: Boolean) {
        cdkBuilder.observabilityEnabled(observabilityEnabled)
      }

      /**
       * @param observabilityEnabled When `true` , an observability configuration resource is
       * associated with the service, and an `ObservabilityConfigurationArn` is specified. 
       */
      override fun observabilityEnabled(observabilityEnabled: IResolvable) {
        cdkBuilder.observabilityEnabled(observabilityEnabled.let(IResolvable::unwrap))
      }

      public fun build():
          software.amazon.awscdk.services.apprunner.CfnService.ServiceObservabilityConfigurationProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.apprunner.CfnService.ServiceObservabilityConfigurationProperty,
    ) : CdkObject(cdkObject), ServiceObservabilityConfigurationProperty {
      /**
       * The Amazon Resource Name (ARN) of the observability configuration that is associated with
       * the service.
       *
       * Specified only when `ObservabilityEnabled` is `true` .
       *
       * Specify an ARN with a name and a revision number to associate that revision. For example:
       * `arn:aws:apprunner:us-east-1:123456789012:observabilityconfiguration/xray-tracing/3`
       *
       * Specify just the name to associate the latest revision. For example:
       * `arn:aws:apprunner:us-east-1:123456789012:observabilityconfiguration/xray-tracing`
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apprunner-service-serviceobservabilityconfiguration.html#cfn-apprunner-service-serviceobservabilityconfiguration-observabilityconfigurationarn)
       */
      override fun observabilityConfigurationArn(): String? =
          unwrap(this).getObservabilityConfigurationArn()

      /**
       * When `true` , an observability configuration resource is associated with the service, and
       * an `ObservabilityConfigurationArn` is specified.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apprunner-service-serviceobservabilityconfiguration.html#cfn-apprunner-service-serviceobservabilityconfiguration-observabilityenabled)
       */
      override fun observabilityEnabled(): Any = unwrap(this).getObservabilityEnabled()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          ServiceObservabilityConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.apprunner.CfnService.ServiceObservabilityConfigurationProperty):
          ServiceObservabilityConfigurationProperty = CdkObjectWrappers.wrap(cdkObject) as?
          ServiceObservabilityConfigurationProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: ServiceObservabilityConfigurationProperty):
          software.amazon.awscdk.services.apprunner.CfnService.ServiceObservabilityConfigurationProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.apprunner.CfnService.ServiceObservabilityConfigurationProperty
    }
  }

  /**
   * Describes a custom encryption key that AWS App Runner uses to encrypt copies of the source
   * repository and service logs.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.apprunner.*;
   * EncryptionConfigurationProperty encryptionConfigurationProperty =
   * EncryptionConfigurationProperty.builder()
   * .kmsKey("kmsKey")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apprunner-service-encryptionconfiguration.html)
   */
  public interface EncryptionConfigurationProperty {
    /**
     * The ARN of the KMS key that's used for encryption.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apprunner-service-encryptionconfiguration.html#cfn-apprunner-service-encryptionconfiguration-kmskey)
     */
    public fun kmsKey(): String

    /**
     * A builder for [EncryptionConfigurationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param kmsKey The ARN of the KMS key that's used for encryption. 
       */
      public fun kmsKey(kmsKey: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.apprunner.CfnService.EncryptionConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.apprunner.CfnService.EncryptionConfigurationProperty.builder()

      /**
       * @param kmsKey The ARN of the KMS key that's used for encryption. 
       */
      override fun kmsKey(kmsKey: String) {
        cdkBuilder.kmsKey(kmsKey)
      }

      public fun build():
          software.amazon.awscdk.services.apprunner.CfnService.EncryptionConfigurationProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.apprunner.CfnService.EncryptionConfigurationProperty,
    ) : CdkObject(cdkObject), EncryptionConfigurationProperty {
      /**
       * The ARN of the KMS key that's used for encryption.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apprunner-service-encryptionconfiguration.html#cfn-apprunner-service-encryptionconfiguration-kmskey)
       */
      override fun kmsKey(): String = unwrap(this).getKmsKey()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): EncryptionConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.apprunner.CfnService.EncryptionConfigurationProperty):
          EncryptionConfigurationProperty = CdkObjectWrappers.wrap(cdkObject) as?
          EncryptionConfigurationProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: EncryptionConfigurationProperty):
          software.amazon.awscdk.services.apprunner.CfnService.EncryptionConfigurationProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.apprunner.CfnService.EncryptionConfigurationProperty
    }
  }

  /**
   * Describes the configuration that AWS App Runner uses to run an App Runner service using an
   * image pulled from a source image repository.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.apprunner.*;
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
  public interface ImageConfigurationProperty {
    /**
     * The port that your application listens to in the container.
     *
     * Default: `8080`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apprunner-service-imageconfiguration.html#cfn-apprunner-service-imageconfiguration-port)
     */
    public fun port(): String? = unwrap(this).getPort()

    /**
     * An array of key-value pairs representing the secrets and parameters that get referenced to
     * your service as an environment variable.
     *
     * The supported values are either the full Amazon Resource Name (ARN) of the AWS Secrets
     * Manager secret or the full ARN of the parameter in the AWS Systems Manager Parameter Store.
     *
     *
     * * If the AWS Systems Manager Parameter Store parameter exists in the same AWS Region as the
     * service that you're launching, you can use either the full ARN or name of the secret. If the
     * parameter exists in a different Region, then the full ARN must be specified.
     * * Currently, cross account referencing of AWS Systems Manager Parameter Store parameter is
     * not supported.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apprunner-service-imageconfiguration.html#cfn-apprunner-service-imageconfiguration-runtimeenvironmentsecrets)
     */
    public fun runtimeEnvironmentSecrets(): Any? = unwrap(this).getRuntimeEnvironmentSecrets()

    /**
     * Environment variables that are available to your running App Runner service.
     *
     * An array of key-value pairs.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apprunner-service-imageconfiguration.html#cfn-apprunner-service-imageconfiguration-runtimeenvironmentvariables)
     */
    public fun runtimeEnvironmentVariables(): Any? = unwrap(this).getRuntimeEnvironmentVariables()

    /**
     * An optional command that App Runner runs to start the application in the source image.
     *
     * If specified, this command overrides the Docker image’s default start command.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apprunner-service-imageconfiguration.html#cfn-apprunner-service-imageconfiguration-startcommand)
     */
    public fun startCommand(): String? = unwrap(this).getStartCommand()

    /**
     * A builder for [ImageConfigurationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param port The port that your application listens to in the container.
       * Default: `8080`
       */
      public fun port(port: String)

      /**
       * @param runtimeEnvironmentSecrets An array of key-value pairs representing the secrets and
       * parameters that get referenced to your service as an environment variable.
       * The supported values are either the full Amazon Resource Name (ARN) of the AWS Secrets
       * Manager secret or the full ARN of the parameter in the AWS Systems Manager Parameter Store.
       *
       *
       * * If the AWS Systems Manager Parameter Store parameter exists in the same AWS Region as the
       * service that you're launching, you can use either the full ARN or name of the secret. If the
       * parameter exists in a different Region, then the full ARN must be specified.
       * * Currently, cross account referencing of AWS Systems Manager Parameter Store parameter is
       * not supported.
       */
      public fun runtimeEnvironmentSecrets(runtimeEnvironmentSecrets: IResolvable)

      /**
       * @param runtimeEnvironmentSecrets An array of key-value pairs representing the secrets and
       * parameters that get referenced to your service as an environment variable.
       * The supported values are either the full Amazon Resource Name (ARN) of the AWS Secrets
       * Manager secret or the full ARN of the parameter in the AWS Systems Manager Parameter Store.
       *
       *
       * * If the AWS Systems Manager Parameter Store parameter exists in the same AWS Region as the
       * service that you're launching, you can use either the full ARN or name of the secret. If the
       * parameter exists in a different Region, then the full ARN must be specified.
       * * Currently, cross account referencing of AWS Systems Manager Parameter Store parameter is
       * not supported.
       */
      public fun runtimeEnvironmentSecrets(runtimeEnvironmentSecrets: List<Any>)

      /**
       * @param runtimeEnvironmentSecrets An array of key-value pairs representing the secrets and
       * parameters that get referenced to your service as an environment variable.
       * The supported values are either the full Amazon Resource Name (ARN) of the AWS Secrets
       * Manager secret or the full ARN of the parameter in the AWS Systems Manager Parameter Store.
       *
       *
       * * If the AWS Systems Manager Parameter Store parameter exists in the same AWS Region as the
       * service that you're launching, you can use either the full ARN or name of the secret. If the
       * parameter exists in a different Region, then the full ARN must be specified.
       * * Currently, cross account referencing of AWS Systems Manager Parameter Store parameter is
       * not supported.
       */
      public fun runtimeEnvironmentSecrets(vararg runtimeEnvironmentSecrets: Any)

      /**
       * @param runtimeEnvironmentVariables Environment variables that are available to your running
       * App Runner service.
       * An array of key-value pairs.
       */
      public fun runtimeEnvironmentVariables(runtimeEnvironmentVariables: IResolvable)

      /**
       * @param runtimeEnvironmentVariables Environment variables that are available to your running
       * App Runner service.
       * An array of key-value pairs.
       */
      public fun runtimeEnvironmentVariables(runtimeEnvironmentVariables: List<Any>)

      /**
       * @param runtimeEnvironmentVariables Environment variables that are available to your running
       * App Runner service.
       * An array of key-value pairs.
       */
      public fun runtimeEnvironmentVariables(vararg runtimeEnvironmentVariables: Any)

      /**
       * @param startCommand An optional command that App Runner runs to start the application in
       * the source image.
       * If specified, this command overrides the Docker image’s default start command.
       */
      public fun startCommand(startCommand: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.apprunner.CfnService.ImageConfigurationProperty.Builder =
          software.amazon.awscdk.services.apprunner.CfnService.ImageConfigurationProperty.builder()

      /**
       * @param port The port that your application listens to in the container.
       * Default: `8080`
       */
      override fun port(port: String) {
        cdkBuilder.port(port)
      }

      /**
       * @param runtimeEnvironmentSecrets An array of key-value pairs representing the secrets and
       * parameters that get referenced to your service as an environment variable.
       * The supported values are either the full Amazon Resource Name (ARN) of the AWS Secrets
       * Manager secret or the full ARN of the parameter in the AWS Systems Manager Parameter Store.
       *
       *
       * * If the AWS Systems Manager Parameter Store parameter exists in the same AWS Region as the
       * service that you're launching, you can use either the full ARN or name of the secret. If the
       * parameter exists in a different Region, then the full ARN must be specified.
       * * Currently, cross account referencing of AWS Systems Manager Parameter Store parameter is
       * not supported.
       */
      override fun runtimeEnvironmentSecrets(runtimeEnvironmentSecrets: IResolvable) {
        cdkBuilder.runtimeEnvironmentSecrets(runtimeEnvironmentSecrets.let(IResolvable::unwrap))
      }

      /**
       * @param runtimeEnvironmentSecrets An array of key-value pairs representing the secrets and
       * parameters that get referenced to your service as an environment variable.
       * The supported values are either the full Amazon Resource Name (ARN) of the AWS Secrets
       * Manager secret or the full ARN of the parameter in the AWS Systems Manager Parameter Store.
       *
       *
       * * If the AWS Systems Manager Parameter Store parameter exists in the same AWS Region as the
       * service that you're launching, you can use either the full ARN or name of the secret. If the
       * parameter exists in a different Region, then the full ARN must be specified.
       * * Currently, cross account referencing of AWS Systems Manager Parameter Store parameter is
       * not supported.
       */
      override fun runtimeEnvironmentSecrets(runtimeEnvironmentSecrets: List<Any>) {
        cdkBuilder.runtimeEnvironmentSecrets(runtimeEnvironmentSecrets)
      }

      /**
       * @param runtimeEnvironmentSecrets An array of key-value pairs representing the secrets and
       * parameters that get referenced to your service as an environment variable.
       * The supported values are either the full Amazon Resource Name (ARN) of the AWS Secrets
       * Manager secret or the full ARN of the parameter in the AWS Systems Manager Parameter Store.
       *
       *
       * * If the AWS Systems Manager Parameter Store parameter exists in the same AWS Region as the
       * service that you're launching, you can use either the full ARN or name of the secret. If the
       * parameter exists in a different Region, then the full ARN must be specified.
       * * Currently, cross account referencing of AWS Systems Manager Parameter Store parameter is
       * not supported.
       */
      override fun runtimeEnvironmentSecrets(vararg runtimeEnvironmentSecrets: Any): Unit =
          runtimeEnvironmentSecrets(runtimeEnvironmentSecrets.toList())

      /**
       * @param runtimeEnvironmentVariables Environment variables that are available to your running
       * App Runner service.
       * An array of key-value pairs.
       */
      override fun runtimeEnvironmentVariables(runtimeEnvironmentVariables: IResolvable) {
        cdkBuilder.runtimeEnvironmentVariables(runtimeEnvironmentVariables.let(IResolvable::unwrap))
      }

      /**
       * @param runtimeEnvironmentVariables Environment variables that are available to your running
       * App Runner service.
       * An array of key-value pairs.
       */
      override fun runtimeEnvironmentVariables(runtimeEnvironmentVariables: List<Any>) {
        cdkBuilder.runtimeEnvironmentVariables(runtimeEnvironmentVariables)
      }

      /**
       * @param runtimeEnvironmentVariables Environment variables that are available to your running
       * App Runner service.
       * An array of key-value pairs.
       */
      override fun runtimeEnvironmentVariables(vararg runtimeEnvironmentVariables: Any): Unit =
          runtimeEnvironmentVariables(runtimeEnvironmentVariables.toList())

      /**
       * @param startCommand An optional command that App Runner runs to start the application in
       * the source image.
       * If specified, this command overrides the Docker image’s default start command.
       */
      override fun startCommand(startCommand: String) {
        cdkBuilder.startCommand(startCommand)
      }

      public fun build():
          software.amazon.awscdk.services.apprunner.CfnService.ImageConfigurationProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.apprunner.CfnService.ImageConfigurationProperty,
    ) : CdkObject(cdkObject), ImageConfigurationProperty {
      /**
       * The port that your application listens to in the container.
       *
       * Default: `8080`
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apprunner-service-imageconfiguration.html#cfn-apprunner-service-imageconfiguration-port)
       */
      override fun port(): String? = unwrap(this).getPort()

      /**
       * An array of key-value pairs representing the secrets and parameters that get referenced to
       * your service as an environment variable.
       *
       * The supported values are either the full Amazon Resource Name (ARN) of the AWS Secrets
       * Manager secret or the full ARN of the parameter in the AWS Systems Manager Parameter Store.
       *
       *
       * * If the AWS Systems Manager Parameter Store parameter exists in the same AWS Region as the
       * service that you're launching, you can use either the full ARN or name of the secret. If the
       * parameter exists in a different Region, then the full ARN must be specified.
       * * Currently, cross account referencing of AWS Systems Manager Parameter Store parameter is
       * not supported.
       *
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apprunner-service-imageconfiguration.html#cfn-apprunner-service-imageconfiguration-runtimeenvironmentsecrets)
       */
      override fun runtimeEnvironmentSecrets(): Any? = unwrap(this).getRuntimeEnvironmentSecrets()

      /**
       * Environment variables that are available to your running App Runner service.
       *
       * An array of key-value pairs.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apprunner-service-imageconfiguration.html#cfn-apprunner-service-imageconfiguration-runtimeenvironmentvariables)
       */
      override fun runtimeEnvironmentVariables(): Any? =
          unwrap(this).getRuntimeEnvironmentVariables()

      /**
       * An optional command that App Runner runs to start the application in the source image.
       *
       * If specified, this command overrides the Docker image’s default start command.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apprunner-service-imageconfiguration.html#cfn-apprunner-service-imageconfiguration-startcommand)
       */
      override fun startCommand(): String? = unwrap(this).getStartCommand()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): ImageConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.apprunner.CfnService.ImageConfigurationProperty):
          ImageConfigurationProperty = CdkObjectWrappers.wrap(cdkObject) as?
          ImageConfigurationProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: ImageConfigurationProperty):
          software.amazon.awscdk.services.apprunner.CfnService.ImageConfigurationProperty = (wrapped
          as CdkObject).cdkObject as
          software.amazon.awscdk.services.apprunner.CfnService.ImageConfigurationProperty
    }
  }

  /**
   * Describes resources needed to authenticate access to some source repositories.
   *
   * The specific resource depends on the repository provider.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.apprunner.*;
   * AuthenticationConfigurationProperty authenticationConfigurationProperty =
   * AuthenticationConfigurationProperty.builder()
   * .accessRoleArn("accessRoleArn")
   * .connectionArn("connectionArn")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apprunner-service-authenticationconfiguration.html)
   */
  public interface AuthenticationConfigurationProperty {
    /**
     * The Amazon Resource Name (ARN) of the IAM role that grants the App Runner service access to a
     * source repository.
     *
     * It's required for ECR image repositories (but not for ECR Public repositories).
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apprunner-service-authenticationconfiguration.html#cfn-apprunner-service-authenticationconfiguration-accessrolearn)
     */
    public fun accessRoleArn(): String? = unwrap(this).getAccessRoleArn()

    /**
     * The Amazon Resource Name (ARN) of the App Runner connection that enables the App Runner
     * service to connect to a source repository.
     *
     * It's required for GitHub code repositories.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apprunner-service-authenticationconfiguration.html#cfn-apprunner-service-authenticationconfiguration-connectionarn)
     */
    public fun connectionArn(): String? = unwrap(this).getConnectionArn()

    /**
     * A builder for [AuthenticationConfigurationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param accessRoleArn The Amazon Resource Name (ARN) of the IAM role that grants the App
       * Runner service access to a source repository.
       * It's required for ECR image repositories (but not for ECR Public repositories).
       */
      public fun accessRoleArn(accessRoleArn: String)

      /**
       * @param connectionArn The Amazon Resource Name (ARN) of the App Runner connection that
       * enables the App Runner service to connect to a source repository.
       * It's required for GitHub code repositories.
       */
      public fun connectionArn(connectionArn: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.apprunner.CfnService.AuthenticationConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.apprunner.CfnService.AuthenticationConfigurationProperty.builder()

      /**
       * @param accessRoleArn The Amazon Resource Name (ARN) of the IAM role that grants the App
       * Runner service access to a source repository.
       * It's required for ECR image repositories (but not for ECR Public repositories).
       */
      override fun accessRoleArn(accessRoleArn: String) {
        cdkBuilder.accessRoleArn(accessRoleArn)
      }

      /**
       * @param connectionArn The Amazon Resource Name (ARN) of the App Runner connection that
       * enables the App Runner service to connect to a source repository.
       * It's required for GitHub code repositories.
       */
      override fun connectionArn(connectionArn: String) {
        cdkBuilder.connectionArn(connectionArn)
      }

      public fun build():
          software.amazon.awscdk.services.apprunner.CfnService.AuthenticationConfigurationProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.apprunner.CfnService.AuthenticationConfigurationProperty,
    ) : CdkObject(cdkObject), AuthenticationConfigurationProperty {
      /**
       * The Amazon Resource Name (ARN) of the IAM role that grants the App Runner service access to
       * a source repository.
       *
       * It's required for ECR image repositories (but not for ECR Public repositories).
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apprunner-service-authenticationconfiguration.html#cfn-apprunner-service-authenticationconfiguration-accessrolearn)
       */
      override fun accessRoleArn(): String? = unwrap(this).getAccessRoleArn()

      /**
       * The Amazon Resource Name (ARN) of the App Runner connection that enables the App Runner
       * service to connect to a source repository.
       *
       * It's required for GitHub code repositories.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apprunner-service-authenticationconfiguration.html#cfn-apprunner-service-authenticationconfiguration-connectionarn)
       */
      override fun connectionArn(): String? = unwrap(this).getConnectionArn()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          AuthenticationConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.apprunner.CfnService.AuthenticationConfigurationProperty):
          AuthenticationConfigurationProperty = CdkObjectWrappers.wrap(cdkObject) as?
          AuthenticationConfigurationProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: AuthenticationConfigurationProperty):
          software.amazon.awscdk.services.apprunner.CfnService.AuthenticationConfigurationProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.apprunner.CfnService.AuthenticationConfigurationProperty
    }
  }

  /**
   * Describes the basic configuration needed for building and running an AWS App Runner service.
   *
   * This type doesn't support the full set of possible configuration options. Fur full
   * configuration capabilities, use a `apprunner.yaml` file in the source code repository.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.apprunner.*;
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
  public interface CodeConfigurationValuesProperty {
    /**
     * The command App Runner runs to build your application.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apprunner-service-codeconfigurationvalues.html#cfn-apprunner-service-codeconfigurationvalues-buildcommand)
     */
    public fun buildCommand(): String? = unwrap(this).getBuildCommand()

    /**
     * The port that your application listens to in the container.
     *
     * Default: `8080`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apprunner-service-codeconfigurationvalues.html#cfn-apprunner-service-codeconfigurationvalues-port)
     */
    public fun port(): String? = unwrap(this).getPort()

    /**
     * A runtime environment type for building and running an App Runner service.
     *
     * It represents a programming language runtime.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apprunner-service-codeconfigurationvalues.html#cfn-apprunner-service-codeconfigurationvalues-runtime)
     */
    public fun runtime(): String

    /**
     * An array of key-value pairs representing the secrets and parameters that get referenced to
     * your service as an environment variable.
     *
     * The supported values are either the full Amazon Resource Name (ARN) of the AWS Secrets
     * Manager secret or the full ARN of the parameter in the AWS Systems Manager Parameter Store.
     *
     *
     * * If the AWS Systems Manager Parameter Store parameter exists in the same AWS Region as the
     * service that you're launching, you can use either the full ARN or name of the secret. If the
     * parameter exists in a different Region, then the full ARN must be specified.
     * * Currently, cross account referencing of AWS Systems Manager Parameter Store parameter is
     * not supported.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apprunner-service-codeconfigurationvalues.html#cfn-apprunner-service-codeconfigurationvalues-runtimeenvironmentsecrets)
     */
    public fun runtimeEnvironmentSecrets(): Any? = unwrap(this).getRuntimeEnvironmentSecrets()

    /**
     * The environment variables that are available to your running AWS App Runner service.
     *
     * An array of key-value pairs.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apprunner-service-codeconfigurationvalues.html#cfn-apprunner-service-codeconfigurationvalues-runtimeenvironmentvariables)
     */
    public fun runtimeEnvironmentVariables(): Any? = unwrap(this).getRuntimeEnvironmentVariables()

    /**
     * The command App Runner runs to start your application.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apprunner-service-codeconfigurationvalues.html#cfn-apprunner-service-codeconfigurationvalues-startcommand)
     */
    public fun startCommand(): String? = unwrap(this).getStartCommand()

    /**
     * A builder for [CodeConfigurationValuesProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param buildCommand The command App Runner runs to build your application.
       */
      public fun buildCommand(buildCommand: String)

      /**
       * @param port The port that your application listens to in the container.
       * Default: `8080`
       */
      public fun port(port: String)

      /**
       * @param runtime A runtime environment type for building and running an App Runner service. 
       * It represents a programming language runtime.
       */
      public fun runtime(runtime: String)

      /**
       * @param runtimeEnvironmentSecrets An array of key-value pairs representing the secrets and
       * parameters that get referenced to your service as an environment variable.
       * The supported values are either the full Amazon Resource Name (ARN) of the AWS Secrets
       * Manager secret or the full ARN of the parameter in the AWS Systems Manager Parameter Store.
       *
       *
       * * If the AWS Systems Manager Parameter Store parameter exists in the same AWS Region as the
       * service that you're launching, you can use either the full ARN or name of the secret. If the
       * parameter exists in a different Region, then the full ARN must be specified.
       * * Currently, cross account referencing of AWS Systems Manager Parameter Store parameter is
       * not supported.
       */
      public fun runtimeEnvironmentSecrets(runtimeEnvironmentSecrets: IResolvable)

      /**
       * @param runtimeEnvironmentSecrets An array of key-value pairs representing the secrets and
       * parameters that get referenced to your service as an environment variable.
       * The supported values are either the full Amazon Resource Name (ARN) of the AWS Secrets
       * Manager secret or the full ARN of the parameter in the AWS Systems Manager Parameter Store.
       *
       *
       * * If the AWS Systems Manager Parameter Store parameter exists in the same AWS Region as the
       * service that you're launching, you can use either the full ARN or name of the secret. If the
       * parameter exists in a different Region, then the full ARN must be specified.
       * * Currently, cross account referencing of AWS Systems Manager Parameter Store parameter is
       * not supported.
       */
      public fun runtimeEnvironmentSecrets(runtimeEnvironmentSecrets: List<Any>)

      /**
       * @param runtimeEnvironmentSecrets An array of key-value pairs representing the secrets and
       * parameters that get referenced to your service as an environment variable.
       * The supported values are either the full Amazon Resource Name (ARN) of the AWS Secrets
       * Manager secret or the full ARN of the parameter in the AWS Systems Manager Parameter Store.
       *
       *
       * * If the AWS Systems Manager Parameter Store parameter exists in the same AWS Region as the
       * service that you're launching, you can use either the full ARN or name of the secret. If the
       * parameter exists in a different Region, then the full ARN must be specified.
       * * Currently, cross account referencing of AWS Systems Manager Parameter Store parameter is
       * not supported.
       */
      public fun runtimeEnvironmentSecrets(vararg runtimeEnvironmentSecrets: Any)

      /**
       * @param runtimeEnvironmentVariables The environment variables that are available to your
       * running AWS App Runner service.
       * An array of key-value pairs.
       */
      public fun runtimeEnvironmentVariables(runtimeEnvironmentVariables: IResolvable)

      /**
       * @param runtimeEnvironmentVariables The environment variables that are available to your
       * running AWS App Runner service.
       * An array of key-value pairs.
       */
      public fun runtimeEnvironmentVariables(runtimeEnvironmentVariables: List<Any>)

      /**
       * @param runtimeEnvironmentVariables The environment variables that are available to your
       * running AWS App Runner service.
       * An array of key-value pairs.
       */
      public fun runtimeEnvironmentVariables(vararg runtimeEnvironmentVariables: Any)

      /**
       * @param startCommand The command App Runner runs to start your application.
       */
      public fun startCommand(startCommand: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.apprunner.CfnService.CodeConfigurationValuesProperty.Builder
          =
          software.amazon.awscdk.services.apprunner.CfnService.CodeConfigurationValuesProperty.builder()

      /**
       * @param buildCommand The command App Runner runs to build your application.
       */
      override fun buildCommand(buildCommand: String) {
        cdkBuilder.buildCommand(buildCommand)
      }

      /**
       * @param port The port that your application listens to in the container.
       * Default: `8080`
       */
      override fun port(port: String) {
        cdkBuilder.port(port)
      }

      /**
       * @param runtime A runtime environment type for building and running an App Runner service. 
       * It represents a programming language runtime.
       */
      override fun runtime(runtime: String) {
        cdkBuilder.runtime(runtime)
      }

      /**
       * @param runtimeEnvironmentSecrets An array of key-value pairs representing the secrets and
       * parameters that get referenced to your service as an environment variable.
       * The supported values are either the full Amazon Resource Name (ARN) of the AWS Secrets
       * Manager secret or the full ARN of the parameter in the AWS Systems Manager Parameter Store.
       *
       *
       * * If the AWS Systems Manager Parameter Store parameter exists in the same AWS Region as the
       * service that you're launching, you can use either the full ARN or name of the secret. If the
       * parameter exists in a different Region, then the full ARN must be specified.
       * * Currently, cross account referencing of AWS Systems Manager Parameter Store parameter is
       * not supported.
       */
      override fun runtimeEnvironmentSecrets(runtimeEnvironmentSecrets: IResolvable) {
        cdkBuilder.runtimeEnvironmentSecrets(runtimeEnvironmentSecrets.let(IResolvable::unwrap))
      }

      /**
       * @param runtimeEnvironmentSecrets An array of key-value pairs representing the secrets and
       * parameters that get referenced to your service as an environment variable.
       * The supported values are either the full Amazon Resource Name (ARN) of the AWS Secrets
       * Manager secret or the full ARN of the parameter in the AWS Systems Manager Parameter Store.
       *
       *
       * * If the AWS Systems Manager Parameter Store parameter exists in the same AWS Region as the
       * service that you're launching, you can use either the full ARN or name of the secret. If the
       * parameter exists in a different Region, then the full ARN must be specified.
       * * Currently, cross account referencing of AWS Systems Manager Parameter Store parameter is
       * not supported.
       */
      override fun runtimeEnvironmentSecrets(runtimeEnvironmentSecrets: List<Any>) {
        cdkBuilder.runtimeEnvironmentSecrets(runtimeEnvironmentSecrets)
      }

      /**
       * @param runtimeEnvironmentSecrets An array of key-value pairs representing the secrets and
       * parameters that get referenced to your service as an environment variable.
       * The supported values are either the full Amazon Resource Name (ARN) of the AWS Secrets
       * Manager secret or the full ARN of the parameter in the AWS Systems Manager Parameter Store.
       *
       *
       * * If the AWS Systems Manager Parameter Store parameter exists in the same AWS Region as the
       * service that you're launching, you can use either the full ARN or name of the secret. If the
       * parameter exists in a different Region, then the full ARN must be specified.
       * * Currently, cross account referencing of AWS Systems Manager Parameter Store parameter is
       * not supported.
       */
      override fun runtimeEnvironmentSecrets(vararg runtimeEnvironmentSecrets: Any): Unit =
          runtimeEnvironmentSecrets(runtimeEnvironmentSecrets.toList())

      /**
       * @param runtimeEnvironmentVariables The environment variables that are available to your
       * running AWS App Runner service.
       * An array of key-value pairs.
       */
      override fun runtimeEnvironmentVariables(runtimeEnvironmentVariables: IResolvable) {
        cdkBuilder.runtimeEnvironmentVariables(runtimeEnvironmentVariables.let(IResolvable::unwrap))
      }

      /**
       * @param runtimeEnvironmentVariables The environment variables that are available to your
       * running AWS App Runner service.
       * An array of key-value pairs.
       */
      override fun runtimeEnvironmentVariables(runtimeEnvironmentVariables: List<Any>) {
        cdkBuilder.runtimeEnvironmentVariables(runtimeEnvironmentVariables)
      }

      /**
       * @param runtimeEnvironmentVariables The environment variables that are available to your
       * running AWS App Runner service.
       * An array of key-value pairs.
       */
      override fun runtimeEnvironmentVariables(vararg runtimeEnvironmentVariables: Any): Unit =
          runtimeEnvironmentVariables(runtimeEnvironmentVariables.toList())

      /**
       * @param startCommand The command App Runner runs to start your application.
       */
      override fun startCommand(startCommand: String) {
        cdkBuilder.startCommand(startCommand)
      }

      public fun build():
          software.amazon.awscdk.services.apprunner.CfnService.CodeConfigurationValuesProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.apprunner.CfnService.CodeConfigurationValuesProperty,
    ) : CdkObject(cdkObject), CodeConfigurationValuesProperty {
      /**
       * The command App Runner runs to build your application.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apprunner-service-codeconfigurationvalues.html#cfn-apprunner-service-codeconfigurationvalues-buildcommand)
       */
      override fun buildCommand(): String? = unwrap(this).getBuildCommand()

      /**
       * The port that your application listens to in the container.
       *
       * Default: `8080`
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apprunner-service-codeconfigurationvalues.html#cfn-apprunner-service-codeconfigurationvalues-port)
       */
      override fun port(): String? = unwrap(this).getPort()

      /**
       * A runtime environment type for building and running an App Runner service.
       *
       * It represents a programming language runtime.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apprunner-service-codeconfigurationvalues.html#cfn-apprunner-service-codeconfigurationvalues-runtime)
       */
      override fun runtime(): String = unwrap(this).getRuntime()

      /**
       * An array of key-value pairs representing the secrets and parameters that get referenced to
       * your service as an environment variable.
       *
       * The supported values are either the full Amazon Resource Name (ARN) of the AWS Secrets
       * Manager secret or the full ARN of the parameter in the AWS Systems Manager Parameter Store.
       *
       *
       * * If the AWS Systems Manager Parameter Store parameter exists in the same AWS Region as the
       * service that you're launching, you can use either the full ARN or name of the secret. If the
       * parameter exists in a different Region, then the full ARN must be specified.
       * * Currently, cross account referencing of AWS Systems Manager Parameter Store parameter is
       * not supported.
       *
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apprunner-service-codeconfigurationvalues.html#cfn-apprunner-service-codeconfigurationvalues-runtimeenvironmentsecrets)
       */
      override fun runtimeEnvironmentSecrets(): Any? = unwrap(this).getRuntimeEnvironmentSecrets()

      /**
       * The environment variables that are available to your running AWS App Runner service.
       *
       * An array of key-value pairs.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apprunner-service-codeconfigurationvalues.html#cfn-apprunner-service-codeconfigurationvalues-runtimeenvironmentvariables)
       */
      override fun runtimeEnvironmentVariables(): Any? =
          unwrap(this).getRuntimeEnvironmentVariables()

      /**
       * The command App Runner runs to start your application.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apprunner-service-codeconfigurationvalues.html#cfn-apprunner-service-codeconfigurationvalues-startcommand)
       */
      override fun startCommand(): String? = unwrap(this).getStartCommand()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): CodeConfigurationValuesProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.apprunner.CfnService.CodeConfigurationValuesProperty):
          CodeConfigurationValuesProperty = CdkObjectWrappers.wrap(cdkObject) as?
          CodeConfigurationValuesProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: CodeConfigurationValuesProperty):
          software.amazon.awscdk.services.apprunner.CfnService.CodeConfigurationValuesProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.apprunner.CfnService.CodeConfigurationValuesProperty
    }
  }

  /**
   * Describes the settings for the health check that AWS App Runner performs to monitor the health
   * of a service.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.apprunner.*;
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
  public interface HealthCheckConfigurationProperty {
    /**
     * The number of consecutive checks that must succeed before App Runner decides that the service
     * is healthy.
     *
     * Default: `1`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apprunner-service-healthcheckconfiguration.html#cfn-apprunner-service-healthcheckconfiguration-healthythreshold)
     */
    public fun healthyThreshold(): Number? = unwrap(this).getHealthyThreshold()

    /**
     * The time interval, in seconds, between health checks.
     *
     * Default: `5`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apprunner-service-healthcheckconfiguration.html#cfn-apprunner-service-healthcheckconfiguration-interval)
     */
    public fun interval(): Number? = unwrap(this).getInterval()

    /**
     * The URL that health check requests are sent to.
     *
     * `Path` is only applicable when you set `Protocol` to `HTTP` .
     *
     * Default: `"/"`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apprunner-service-healthcheckconfiguration.html#cfn-apprunner-service-healthcheckconfiguration-path)
     */
    public fun path(): String? = unwrap(this).getPath()

    /**
     * The IP protocol that App Runner uses to perform health checks for your service.
     *
     * If you set `Protocol` to `HTTP` , App Runner sends health check requests to the HTTP path
     * specified by `Path` .
     *
     * Default: `TCP`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apprunner-service-healthcheckconfiguration.html#cfn-apprunner-service-healthcheckconfiguration-protocol)
     */
    public fun protocol(): String? = unwrap(this).getProtocol()

    /**
     * The time, in seconds, to wait for a health check response before deciding it failed.
     *
     * Default: `2`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apprunner-service-healthcheckconfiguration.html#cfn-apprunner-service-healthcheckconfiguration-timeout)
     */
    public fun timeout(): Number? = unwrap(this).getTimeout()

    /**
     * The number of consecutive checks that must fail before App Runner decides that the service is
     * unhealthy.
     *
     * Default: `5`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apprunner-service-healthcheckconfiguration.html#cfn-apprunner-service-healthcheckconfiguration-unhealthythreshold)
     */
    public fun unhealthyThreshold(): Number? = unwrap(this).getUnhealthyThreshold()

    /**
     * A builder for [HealthCheckConfigurationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param healthyThreshold The number of consecutive checks that must succeed before App
       * Runner decides that the service is healthy.
       * Default: `1`
       */
      public fun healthyThreshold(healthyThreshold: Number)

      /**
       * @param interval The time interval, in seconds, between health checks.
       * Default: `5`
       */
      public fun interval(interval: Number)

      /**
       * @param path The URL that health check requests are sent to.
       * `Path` is only applicable when you set `Protocol` to `HTTP` .
       *
       * Default: `"/"`
       */
      public fun path(path: String)

      /**
       * @param protocol The IP protocol that App Runner uses to perform health checks for your
       * service.
       * If you set `Protocol` to `HTTP` , App Runner sends health check requests to the HTTP path
       * specified by `Path` .
       *
       * Default: `TCP`
       */
      public fun protocol(protocol: String)

      /**
       * @param timeout The time, in seconds, to wait for a health check response before deciding it
       * failed.
       * Default: `2`
       */
      public fun timeout(timeout: Number)

      /**
       * @param unhealthyThreshold The number of consecutive checks that must fail before App Runner
       * decides that the service is unhealthy.
       * Default: `5`
       */
      public fun unhealthyThreshold(unhealthyThreshold: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.apprunner.CfnService.HealthCheckConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.apprunner.CfnService.HealthCheckConfigurationProperty.builder()

      /**
       * @param healthyThreshold The number of consecutive checks that must succeed before App
       * Runner decides that the service is healthy.
       * Default: `1`
       */
      override fun healthyThreshold(healthyThreshold: Number) {
        cdkBuilder.healthyThreshold(healthyThreshold)
      }

      /**
       * @param interval The time interval, in seconds, between health checks.
       * Default: `5`
       */
      override fun interval(interval: Number) {
        cdkBuilder.interval(interval)
      }

      /**
       * @param path The URL that health check requests are sent to.
       * `Path` is only applicable when you set `Protocol` to `HTTP` .
       *
       * Default: `"/"`
       */
      override fun path(path: String) {
        cdkBuilder.path(path)
      }

      /**
       * @param protocol The IP protocol that App Runner uses to perform health checks for your
       * service.
       * If you set `Protocol` to `HTTP` , App Runner sends health check requests to the HTTP path
       * specified by `Path` .
       *
       * Default: `TCP`
       */
      override fun protocol(protocol: String) {
        cdkBuilder.protocol(protocol)
      }

      /**
       * @param timeout The time, in seconds, to wait for a health check response before deciding it
       * failed.
       * Default: `2`
       */
      override fun timeout(timeout: Number) {
        cdkBuilder.timeout(timeout)
      }

      /**
       * @param unhealthyThreshold The number of consecutive checks that must fail before App Runner
       * decides that the service is unhealthy.
       * Default: `5`
       */
      override fun unhealthyThreshold(unhealthyThreshold: Number) {
        cdkBuilder.unhealthyThreshold(unhealthyThreshold)
      }

      public fun build():
          software.amazon.awscdk.services.apprunner.CfnService.HealthCheckConfigurationProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.apprunner.CfnService.HealthCheckConfigurationProperty,
    ) : CdkObject(cdkObject), HealthCheckConfigurationProperty {
      /**
       * The number of consecutive checks that must succeed before App Runner decides that the
       * service is healthy.
       *
       * Default: `1`
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apprunner-service-healthcheckconfiguration.html#cfn-apprunner-service-healthcheckconfiguration-healthythreshold)
       */
      override fun healthyThreshold(): Number? = unwrap(this).getHealthyThreshold()

      /**
       * The time interval, in seconds, between health checks.
       *
       * Default: `5`
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apprunner-service-healthcheckconfiguration.html#cfn-apprunner-service-healthcheckconfiguration-interval)
       */
      override fun interval(): Number? = unwrap(this).getInterval()

      /**
       * The URL that health check requests are sent to.
       *
       * `Path` is only applicable when you set `Protocol` to `HTTP` .
       *
       * Default: `"/"`
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apprunner-service-healthcheckconfiguration.html#cfn-apprunner-service-healthcheckconfiguration-path)
       */
      override fun path(): String? = unwrap(this).getPath()

      /**
       * The IP protocol that App Runner uses to perform health checks for your service.
       *
       * If you set `Protocol` to `HTTP` , App Runner sends health check requests to the HTTP path
       * specified by `Path` .
       *
       * Default: `TCP`
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apprunner-service-healthcheckconfiguration.html#cfn-apprunner-service-healthcheckconfiguration-protocol)
       */
      override fun protocol(): String? = unwrap(this).getProtocol()

      /**
       * The time, in seconds, to wait for a health check response before deciding it failed.
       *
       * Default: `2`
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apprunner-service-healthcheckconfiguration.html#cfn-apprunner-service-healthcheckconfiguration-timeout)
       */
      override fun timeout(): Number? = unwrap(this).getTimeout()

      /**
       * The number of consecutive checks that must fail before App Runner decides that the service
       * is unhealthy.
       *
       * Default: `5`
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apprunner-service-healthcheckconfiguration.html#cfn-apprunner-service-healthcheckconfiguration-unhealthythreshold)
       */
      override fun unhealthyThreshold(): Number? = unwrap(this).getUnhealthyThreshold()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): HealthCheckConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.apprunner.CfnService.HealthCheckConfigurationProperty):
          HealthCheckConfigurationProperty = CdkObjectWrappers.wrap(cdkObject) as?
          HealthCheckConfigurationProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: HealthCheckConfigurationProperty):
          software.amazon.awscdk.services.apprunner.CfnService.HealthCheckConfigurationProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.apprunner.CfnService.HealthCheckConfigurationProperty
    }
  }

  /**
   * Identifies a version of code that AWS App Runner refers to within a source code repository.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.apprunner.*;
   * SourceCodeVersionProperty sourceCodeVersionProperty = SourceCodeVersionProperty.builder()
   * .type("type")
   * .value("value")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apprunner-service-sourcecodeversion.html)
   */
  public interface SourceCodeVersionProperty {
    /**
     * The type of version identifier.
     *
     * For a git-based repository, branches represent versions.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apprunner-service-sourcecodeversion.html#cfn-apprunner-service-sourcecodeversion-type)
     */
    public fun type(): String

    /**
     * A source code version.
     *
     * For a git-based repository, a branch name maps to a specific version. App Runner uses the
     * most recent commit to the branch.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apprunner-service-sourcecodeversion.html#cfn-apprunner-service-sourcecodeversion-value)
     */
    public fun `value`(): String

    /**
     * A builder for [SourceCodeVersionProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param type The type of version identifier. 
       * For a git-based repository, branches represent versions.
       */
      public fun type(type: String)

      /**
       * @param value A source code version. 
       * For a git-based repository, a branch name maps to a specific version. App Runner uses the
       * most recent commit to the branch.
       */
      public fun `value`(`value`: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.apprunner.CfnService.SourceCodeVersionProperty.Builder =
          software.amazon.awscdk.services.apprunner.CfnService.SourceCodeVersionProperty.builder()

      /**
       * @param type The type of version identifier. 
       * For a git-based repository, branches represent versions.
       */
      override fun type(type: String) {
        cdkBuilder.type(type)
      }

      /**
       * @param value A source code version. 
       * For a git-based repository, a branch name maps to a specific version. App Runner uses the
       * most recent commit to the branch.
       */
      override fun `value`(`value`: String) {
        cdkBuilder.`value`(`value`)
      }

      public fun build():
          software.amazon.awscdk.services.apprunner.CfnService.SourceCodeVersionProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.apprunner.CfnService.SourceCodeVersionProperty,
    ) : CdkObject(cdkObject), SourceCodeVersionProperty {
      /**
       * The type of version identifier.
       *
       * For a git-based repository, branches represent versions.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apprunner-service-sourcecodeversion.html#cfn-apprunner-service-sourcecodeversion-type)
       */
      override fun type(): String = unwrap(this).getType()

      /**
       * A source code version.
       *
       * For a git-based repository, a branch name maps to a specific version. App Runner uses the
       * most recent commit to the branch.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apprunner-service-sourcecodeversion.html#cfn-apprunner-service-sourcecodeversion-value)
       */
      override fun `value`(): String = unwrap(this).getValue()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): SourceCodeVersionProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.apprunner.CfnService.SourceCodeVersionProperty):
          SourceCodeVersionProperty = CdkObjectWrappers.wrap(cdkObject) as?
          SourceCodeVersionProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: SourceCodeVersionProperty):
          software.amazon.awscdk.services.apprunner.CfnService.SourceCodeVersionProperty = (wrapped
          as CdkObject).cdkObject as
          software.amazon.awscdk.services.apprunner.CfnService.SourceCodeVersionProperty
    }
  }

  /**
   * Network configuration settings for inbound network traffic.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.apprunner.*;
   * IngressConfigurationProperty ingressConfigurationProperty =
   * IngressConfigurationProperty.builder()
   * .isPubliclyAccessible(false)
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apprunner-service-ingressconfiguration.html)
   */
  public interface IngressConfigurationProperty {
    /**
     * Specifies whether your App Runner service is publicly accessible.
     *
     * To make the service publicly accessible set it to `True` . To make the service privately
     * accessible, from only within an Amazon VPC set it to `False` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apprunner-service-ingressconfiguration.html#cfn-apprunner-service-ingressconfiguration-ispubliclyaccessible)
     */
    public fun isPubliclyAccessible(): Any

    /**
     * A builder for [IngressConfigurationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param isPubliclyAccessible Specifies whether your App Runner service is publicly
       * accessible. 
       * To make the service publicly accessible set it to `True` . To make the service privately
       * accessible, from only within an Amazon VPC set it to `False` .
       */
      public fun isPubliclyAccessible(isPubliclyAccessible: Boolean)

      /**
       * @param isPubliclyAccessible Specifies whether your App Runner service is publicly
       * accessible. 
       * To make the service publicly accessible set it to `True` . To make the service privately
       * accessible, from only within an Amazon VPC set it to `False` .
       */
      public fun isPubliclyAccessible(isPubliclyAccessible: IResolvable)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.apprunner.CfnService.IngressConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.apprunner.CfnService.IngressConfigurationProperty.builder()

      /**
       * @param isPubliclyAccessible Specifies whether your App Runner service is publicly
       * accessible. 
       * To make the service publicly accessible set it to `True` . To make the service privately
       * accessible, from only within an Amazon VPC set it to `False` .
       */
      override fun isPubliclyAccessible(isPubliclyAccessible: Boolean) {
        cdkBuilder.isPubliclyAccessible(isPubliclyAccessible)
      }

      /**
       * @param isPubliclyAccessible Specifies whether your App Runner service is publicly
       * accessible. 
       * To make the service publicly accessible set it to `True` . To make the service privately
       * accessible, from only within an Amazon VPC set it to `False` .
       */
      override fun isPubliclyAccessible(isPubliclyAccessible: IResolvable) {
        cdkBuilder.isPubliclyAccessible(isPubliclyAccessible.let(IResolvable::unwrap))
      }

      public fun build():
          software.amazon.awscdk.services.apprunner.CfnService.IngressConfigurationProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.apprunner.CfnService.IngressConfigurationProperty,
    ) : CdkObject(cdkObject), IngressConfigurationProperty {
      /**
       * Specifies whether your App Runner service is publicly accessible.
       *
       * To make the service publicly accessible set it to `True` . To make the service privately
       * accessible, from only within an Amazon VPC set it to `False` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apprunner-service-ingressconfiguration.html#cfn-apprunner-service-ingressconfiguration-ispubliclyaccessible)
       */
      override fun isPubliclyAccessible(): Any = unwrap(this).getIsPubliclyAccessible()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): IngressConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.apprunner.CfnService.IngressConfigurationProperty):
          IngressConfigurationProperty = CdkObjectWrappers.wrap(cdkObject) as?
          IngressConfigurationProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: IngressConfigurationProperty):
          software.amazon.awscdk.services.apprunner.CfnService.IngressConfigurationProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.apprunner.CfnService.IngressConfigurationProperty
    }
  }

  /**
   * Describes a source image repository.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.apprunner.*;
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
  public interface ImageRepositoryProperty {
    /**
     * Configuration for running the identified image.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apprunner-service-imagerepository.html#cfn-apprunner-service-imagerepository-imageconfiguration)
     */
    public fun imageConfiguration(): Any? = unwrap(this).getImageConfiguration()

    /**
     * The identifier of an image.
     *
     * For an image in Amazon Elastic Container Registry (Amazon ECR), this is an image name. For
     * the image name format, see [Pulling an
     * image](https://docs.aws.amazon.com/AmazonECR/latest/userguide/docker-pull-ecr-image.html) in the
     * *Amazon ECR User Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apprunner-service-imagerepository.html#cfn-apprunner-service-imagerepository-imageidentifier)
     */
    public fun imageIdentifier(): String

    /**
     * The type of the image repository.
     *
     * This reflects the repository provider and whether the repository is private or public.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apprunner-service-imagerepository.html#cfn-apprunner-service-imagerepository-imagerepositorytype)
     */
    public fun imageRepositoryType(): String

    /**
     * A builder for [ImageRepositoryProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param imageConfiguration Configuration for running the identified image.
       */
      public fun imageConfiguration(imageConfiguration: IResolvable)

      /**
       * @param imageConfiguration Configuration for running the identified image.
       */
      public fun imageConfiguration(imageConfiguration: ImageConfigurationProperty)

      /**
       * @param imageConfiguration Configuration for running the identified image.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("90d6a3be65eee3a6be6da28afa8bc2b0a11a91f2090a2f062c14a88d278eb9d3")
      public
          fun imageConfiguration(imageConfiguration: ImageConfigurationProperty.Builder.() -> Unit)

      /**
       * @param imageIdentifier The identifier of an image. 
       * For an image in Amazon Elastic Container Registry (Amazon ECR), this is an image name. For
       * the image name format, see [Pulling an
       * image](https://docs.aws.amazon.com/AmazonECR/latest/userguide/docker-pull-ecr-image.html) in
       * the *Amazon ECR User Guide* .
       */
      public fun imageIdentifier(imageIdentifier: String)

      /**
       * @param imageRepositoryType The type of the image repository. 
       * This reflects the repository provider and whether the repository is private or public.
       */
      public fun imageRepositoryType(imageRepositoryType: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.apprunner.CfnService.ImageRepositoryProperty.Builder =
          software.amazon.awscdk.services.apprunner.CfnService.ImageRepositoryProperty.builder()

      /**
       * @param imageConfiguration Configuration for running the identified image.
       */
      override fun imageConfiguration(imageConfiguration: IResolvable) {
        cdkBuilder.imageConfiguration(imageConfiguration.let(IResolvable::unwrap))
      }

      /**
       * @param imageConfiguration Configuration for running the identified image.
       */
      override fun imageConfiguration(imageConfiguration: ImageConfigurationProperty) {
        cdkBuilder.imageConfiguration(imageConfiguration.let(ImageConfigurationProperty::unwrap))
      }

      /**
       * @param imageConfiguration Configuration for running the identified image.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("90d6a3be65eee3a6be6da28afa8bc2b0a11a91f2090a2f062c14a88d278eb9d3")
      override
          fun imageConfiguration(imageConfiguration: ImageConfigurationProperty.Builder.() -> Unit):
          Unit = imageConfiguration(ImageConfigurationProperty(imageConfiguration))

      /**
       * @param imageIdentifier The identifier of an image. 
       * For an image in Amazon Elastic Container Registry (Amazon ECR), this is an image name. For
       * the image name format, see [Pulling an
       * image](https://docs.aws.amazon.com/AmazonECR/latest/userguide/docker-pull-ecr-image.html) in
       * the *Amazon ECR User Guide* .
       */
      override fun imageIdentifier(imageIdentifier: String) {
        cdkBuilder.imageIdentifier(imageIdentifier)
      }

      /**
       * @param imageRepositoryType The type of the image repository. 
       * This reflects the repository provider and whether the repository is private or public.
       */
      override fun imageRepositoryType(imageRepositoryType: String) {
        cdkBuilder.imageRepositoryType(imageRepositoryType)
      }

      public fun build():
          software.amazon.awscdk.services.apprunner.CfnService.ImageRepositoryProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.apprunner.CfnService.ImageRepositoryProperty,
    ) : CdkObject(cdkObject), ImageRepositoryProperty {
      /**
       * Configuration for running the identified image.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apprunner-service-imagerepository.html#cfn-apprunner-service-imagerepository-imageconfiguration)
       */
      override fun imageConfiguration(): Any? = unwrap(this).getImageConfiguration()

      /**
       * The identifier of an image.
       *
       * For an image in Amazon Elastic Container Registry (Amazon ECR), this is an image name. For
       * the image name format, see [Pulling an
       * image](https://docs.aws.amazon.com/AmazonECR/latest/userguide/docker-pull-ecr-image.html) in
       * the *Amazon ECR User Guide* .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apprunner-service-imagerepository.html#cfn-apprunner-service-imagerepository-imageidentifier)
       */
      override fun imageIdentifier(): String = unwrap(this).getImageIdentifier()

      /**
       * The type of the image repository.
       *
       * This reflects the repository provider and whether the repository is private or public.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apprunner-service-imagerepository.html#cfn-apprunner-service-imagerepository-imagerepositorytype)
       */
      override fun imageRepositoryType(): String = unwrap(this).getImageRepositoryType()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): ImageRepositoryProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.apprunner.CfnService.ImageRepositoryProperty):
          ImageRepositoryProperty = CdkObjectWrappers.wrap(cdkObject) as? ImageRepositoryProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: ImageRepositoryProperty):
          software.amazon.awscdk.services.apprunner.CfnService.ImageRepositoryProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.apprunner.CfnService.ImageRepositoryProperty
    }
  }

  /**
   * Describes the runtime configuration of an AWS App Runner service instance (scaling unit).
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.apprunner.*;
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
  public interface InstanceConfigurationProperty {
    /**
     * The number of CPU units reserved for each instance of your App Runner service.
     *
     * Default: `1 vCPU`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apprunner-service-instanceconfiguration.html#cfn-apprunner-service-instanceconfiguration-cpu)
     */
    public fun cpu(): String? = unwrap(this).getCpu()

    /**
     * The Amazon Resource Name (ARN) of an IAM role that provides permissions to your App Runner
     * service.
     *
     * These are permissions that your code needs when it calls any AWS APIs.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apprunner-service-instanceconfiguration.html#cfn-apprunner-service-instanceconfiguration-instancerolearn)
     */
    public fun instanceRoleArn(): String? = unwrap(this).getInstanceRoleArn()

    /**
     * The amount of memory, in MB or GB, reserved for each instance of your App Runner service.
     *
     * Default: `2 GB`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apprunner-service-instanceconfiguration.html#cfn-apprunner-service-instanceconfiguration-memory)
     */
    public fun memory(): String? = unwrap(this).getMemory()

    /**
     * A builder for [InstanceConfigurationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param cpu The number of CPU units reserved for each instance of your App Runner service.
       * Default: `1 vCPU`
       */
      public fun cpu(cpu: String)

      /**
       * @param instanceRoleArn The Amazon Resource Name (ARN) of an IAM role that provides
       * permissions to your App Runner service.
       * These are permissions that your code needs when it calls any AWS APIs.
       */
      public fun instanceRoleArn(instanceRoleArn: String)

      /**
       * @param memory The amount of memory, in MB or GB, reserved for each instance of your App
       * Runner service.
       * Default: `2 GB`
       */
      public fun memory(memory: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.apprunner.CfnService.InstanceConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.apprunner.CfnService.InstanceConfigurationProperty.builder()

      /**
       * @param cpu The number of CPU units reserved for each instance of your App Runner service.
       * Default: `1 vCPU`
       */
      override fun cpu(cpu: String) {
        cdkBuilder.cpu(cpu)
      }

      /**
       * @param instanceRoleArn The Amazon Resource Name (ARN) of an IAM role that provides
       * permissions to your App Runner service.
       * These are permissions that your code needs when it calls any AWS APIs.
       */
      override fun instanceRoleArn(instanceRoleArn: String) {
        cdkBuilder.instanceRoleArn(instanceRoleArn)
      }

      /**
       * @param memory The amount of memory, in MB or GB, reserved for each instance of your App
       * Runner service.
       * Default: `2 GB`
       */
      override fun memory(memory: String) {
        cdkBuilder.memory(memory)
      }

      public fun build():
          software.amazon.awscdk.services.apprunner.CfnService.InstanceConfigurationProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.apprunner.CfnService.InstanceConfigurationProperty,
    ) : CdkObject(cdkObject), InstanceConfigurationProperty {
      /**
       * The number of CPU units reserved for each instance of your App Runner service.
       *
       * Default: `1 vCPU`
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apprunner-service-instanceconfiguration.html#cfn-apprunner-service-instanceconfiguration-cpu)
       */
      override fun cpu(): String? = unwrap(this).getCpu()

      /**
       * The Amazon Resource Name (ARN) of an IAM role that provides permissions to your App Runner
       * service.
       *
       * These are permissions that your code needs when it calls any AWS APIs.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apprunner-service-instanceconfiguration.html#cfn-apprunner-service-instanceconfiguration-instancerolearn)
       */
      override fun instanceRoleArn(): String? = unwrap(this).getInstanceRoleArn()

      /**
       * The amount of memory, in MB or GB, reserved for each instance of your App Runner service.
       *
       * Default: `2 GB`
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apprunner-service-instanceconfiguration.html#cfn-apprunner-service-instanceconfiguration-memory)
       */
      override fun memory(): String? = unwrap(this).getMemory()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): InstanceConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.apprunner.CfnService.InstanceConfigurationProperty):
          InstanceConfigurationProperty = CdkObjectWrappers.wrap(cdkObject) as?
          InstanceConfigurationProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: InstanceConfigurationProperty):
          software.amazon.awscdk.services.apprunner.CfnService.InstanceConfigurationProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.apprunner.CfnService.InstanceConfigurationProperty
    }
  }

  /**
   * Describes the source deployed to an AWS App Runner service.
   *
   * It can be a code or an image repository.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.apprunner.*;
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
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apprunner-service-sourceconfiguration.html)
   */
  public interface SourceConfigurationProperty {
    /**
     * Describes the resources that are needed to authenticate access to some source repositories.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apprunner-service-sourceconfiguration.html#cfn-apprunner-service-sourceconfiguration-authenticationconfiguration)
     */
    public fun authenticationConfiguration(): Any? = unwrap(this).getAuthenticationConfiguration()

    /**
     * If `true` , continuous integration from the source repository is enabled for the App Runner
     * service.
     *
     * Each repository change (including any source code commit or new image version) starts a
     * deployment.
     *
     * Default: App Runner sets to `false` for a source image that uses an ECR Public repository or
     * an ECR repository that's in an AWS account other than the one that the service is in. App Runner
     * sets to `true` in all other cases (which currently include a source code repository or a source
     * image using a same-account ECR repository).
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apprunner-service-sourceconfiguration.html#cfn-apprunner-service-sourceconfiguration-autodeploymentsenabled)
     */
    public fun autoDeploymentsEnabled(): Any? = unwrap(this).getAutoDeploymentsEnabled()

    /**
     * The description of a source code repository.
     *
     * You must provide either this member or `ImageRepository` (but not both).
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apprunner-service-sourceconfiguration.html#cfn-apprunner-service-sourceconfiguration-coderepository)
     */
    public fun codeRepository(): Any? = unwrap(this).getCodeRepository()

    /**
     * The description of a source image repository.
     *
     * You must provide either this member or `CodeRepository` (but not both).
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apprunner-service-sourceconfiguration.html#cfn-apprunner-service-sourceconfiguration-imagerepository)
     */
    public fun imageRepository(): Any? = unwrap(this).getImageRepository()

    /**
     * A builder for [SourceConfigurationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param authenticationConfiguration Describes the resources that are needed to authenticate
       * access to some source repositories.
       */
      public fun authenticationConfiguration(authenticationConfiguration: IResolvable)

      /**
       * @param authenticationConfiguration Describes the resources that are needed to authenticate
       * access to some source repositories.
       */
      public
          fun authenticationConfiguration(authenticationConfiguration: AuthenticationConfigurationProperty)

      /**
       * @param authenticationConfiguration Describes the resources that are needed to authenticate
       * access to some source repositories.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("8b4e8d7ae67b928510329223e6db44f4b83151a19c872277c0b1c31a0a802a01")
      public
          fun authenticationConfiguration(authenticationConfiguration: AuthenticationConfigurationProperty.Builder.() -> Unit)

      /**
       * @param autoDeploymentsEnabled If `true` , continuous integration from the source repository
       * is enabled for the App Runner service.
       * Each repository change (including any source code commit or new image version) starts a
       * deployment.
       *
       * Default: App Runner sets to `false` for a source image that uses an ECR Public repository
       * or an ECR repository that's in an AWS account other than the one that the service is in. App
       * Runner sets to `true` in all other cases (which currently include a source code repository or
       * a source image using a same-account ECR repository).
       */
      public fun autoDeploymentsEnabled(autoDeploymentsEnabled: Boolean)

      /**
       * @param autoDeploymentsEnabled If `true` , continuous integration from the source repository
       * is enabled for the App Runner service.
       * Each repository change (including any source code commit or new image version) starts a
       * deployment.
       *
       * Default: App Runner sets to `false` for a source image that uses an ECR Public repository
       * or an ECR repository that's in an AWS account other than the one that the service is in. App
       * Runner sets to `true` in all other cases (which currently include a source code repository or
       * a source image using a same-account ECR repository).
       */
      public fun autoDeploymentsEnabled(autoDeploymentsEnabled: IResolvable)

      /**
       * @param codeRepository The description of a source code repository.
       * You must provide either this member or `ImageRepository` (but not both).
       */
      public fun codeRepository(codeRepository: IResolvable)

      /**
       * @param codeRepository The description of a source code repository.
       * You must provide either this member or `ImageRepository` (but not both).
       */
      public fun codeRepository(codeRepository: CodeRepositoryProperty)

      /**
       * @param codeRepository The description of a source code repository.
       * You must provide either this member or `ImageRepository` (but not both).
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("4b6e601cdd762408eac86c9420a55af5ce88448e3d9abf2069db9b6f957177af")
      public fun codeRepository(codeRepository: CodeRepositoryProperty.Builder.() -> Unit)

      /**
       * @param imageRepository The description of a source image repository.
       * You must provide either this member or `CodeRepository` (but not both).
       */
      public fun imageRepository(imageRepository: IResolvable)

      /**
       * @param imageRepository The description of a source image repository.
       * You must provide either this member or `CodeRepository` (but not both).
       */
      public fun imageRepository(imageRepository: ImageRepositoryProperty)

      /**
       * @param imageRepository The description of a source image repository.
       * You must provide either this member or `CodeRepository` (but not both).
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("ad7463a502823666b37c437aa3a4a5e0156e29964fcdb9e2574540916df3fb31")
      public fun imageRepository(imageRepository: ImageRepositoryProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.apprunner.CfnService.SourceConfigurationProperty.Builder =
          software.amazon.awscdk.services.apprunner.CfnService.SourceConfigurationProperty.builder()

      /**
       * @param authenticationConfiguration Describes the resources that are needed to authenticate
       * access to some source repositories.
       */
      override fun authenticationConfiguration(authenticationConfiguration: IResolvable) {
        cdkBuilder.authenticationConfiguration(authenticationConfiguration.let(IResolvable::unwrap))
      }

      /**
       * @param authenticationConfiguration Describes the resources that are needed to authenticate
       * access to some source repositories.
       */
      override
          fun authenticationConfiguration(authenticationConfiguration: AuthenticationConfigurationProperty) {
        cdkBuilder.authenticationConfiguration(authenticationConfiguration.let(AuthenticationConfigurationProperty::unwrap))
      }

      /**
       * @param authenticationConfiguration Describes the resources that are needed to authenticate
       * access to some source repositories.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("8b4e8d7ae67b928510329223e6db44f4b83151a19c872277c0b1c31a0a802a01")
      override
          fun authenticationConfiguration(authenticationConfiguration: AuthenticationConfigurationProperty.Builder.() -> Unit):
          Unit =
          authenticationConfiguration(AuthenticationConfigurationProperty(authenticationConfiguration))

      /**
       * @param autoDeploymentsEnabled If `true` , continuous integration from the source repository
       * is enabled for the App Runner service.
       * Each repository change (including any source code commit or new image version) starts a
       * deployment.
       *
       * Default: App Runner sets to `false` for a source image that uses an ECR Public repository
       * or an ECR repository that's in an AWS account other than the one that the service is in. App
       * Runner sets to `true` in all other cases (which currently include a source code repository or
       * a source image using a same-account ECR repository).
       */
      override fun autoDeploymentsEnabled(autoDeploymentsEnabled: Boolean) {
        cdkBuilder.autoDeploymentsEnabled(autoDeploymentsEnabled)
      }

      /**
       * @param autoDeploymentsEnabled If `true` , continuous integration from the source repository
       * is enabled for the App Runner service.
       * Each repository change (including any source code commit or new image version) starts a
       * deployment.
       *
       * Default: App Runner sets to `false` for a source image that uses an ECR Public repository
       * or an ECR repository that's in an AWS account other than the one that the service is in. App
       * Runner sets to `true` in all other cases (which currently include a source code repository or
       * a source image using a same-account ECR repository).
       */
      override fun autoDeploymentsEnabled(autoDeploymentsEnabled: IResolvable) {
        cdkBuilder.autoDeploymentsEnabled(autoDeploymentsEnabled.let(IResolvable::unwrap))
      }

      /**
       * @param codeRepository The description of a source code repository.
       * You must provide either this member or `ImageRepository` (but not both).
       */
      override fun codeRepository(codeRepository: IResolvable) {
        cdkBuilder.codeRepository(codeRepository.let(IResolvable::unwrap))
      }

      /**
       * @param codeRepository The description of a source code repository.
       * You must provide either this member or `ImageRepository` (but not both).
       */
      override fun codeRepository(codeRepository: CodeRepositoryProperty) {
        cdkBuilder.codeRepository(codeRepository.let(CodeRepositoryProperty::unwrap))
      }

      /**
       * @param codeRepository The description of a source code repository.
       * You must provide either this member or `ImageRepository` (but not both).
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("4b6e601cdd762408eac86c9420a55af5ce88448e3d9abf2069db9b6f957177af")
      override fun codeRepository(codeRepository: CodeRepositoryProperty.Builder.() -> Unit): Unit =
          codeRepository(CodeRepositoryProperty(codeRepository))

      /**
       * @param imageRepository The description of a source image repository.
       * You must provide either this member or `CodeRepository` (but not both).
       */
      override fun imageRepository(imageRepository: IResolvable) {
        cdkBuilder.imageRepository(imageRepository.let(IResolvable::unwrap))
      }

      /**
       * @param imageRepository The description of a source image repository.
       * You must provide either this member or `CodeRepository` (but not both).
       */
      override fun imageRepository(imageRepository: ImageRepositoryProperty) {
        cdkBuilder.imageRepository(imageRepository.let(ImageRepositoryProperty::unwrap))
      }

      /**
       * @param imageRepository The description of a source image repository.
       * You must provide either this member or `CodeRepository` (but not both).
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("ad7463a502823666b37c437aa3a4a5e0156e29964fcdb9e2574540916df3fb31")
      override fun imageRepository(imageRepository: ImageRepositoryProperty.Builder.() -> Unit):
          Unit = imageRepository(ImageRepositoryProperty(imageRepository))

      public fun build():
          software.amazon.awscdk.services.apprunner.CfnService.SourceConfigurationProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.apprunner.CfnService.SourceConfigurationProperty,
    ) : CdkObject(cdkObject), SourceConfigurationProperty {
      /**
       * Describes the resources that are needed to authenticate access to some source repositories.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apprunner-service-sourceconfiguration.html#cfn-apprunner-service-sourceconfiguration-authenticationconfiguration)
       */
      override fun authenticationConfiguration(): Any? =
          unwrap(this).getAuthenticationConfiguration()

      /**
       * If `true` , continuous integration from the source repository is enabled for the App Runner
       * service.
       *
       * Each repository change (including any source code commit or new image version) starts a
       * deployment.
       *
       * Default: App Runner sets to `false` for a source image that uses an ECR Public repository
       * or an ECR repository that's in an AWS account other than the one that the service is in. App
       * Runner sets to `true` in all other cases (which currently include a source code repository or
       * a source image using a same-account ECR repository).
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apprunner-service-sourceconfiguration.html#cfn-apprunner-service-sourceconfiguration-autodeploymentsenabled)
       */
      override fun autoDeploymentsEnabled(): Any? = unwrap(this).getAutoDeploymentsEnabled()

      /**
       * The description of a source code repository.
       *
       * You must provide either this member or `ImageRepository` (but not both).
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apprunner-service-sourceconfiguration.html#cfn-apprunner-service-sourceconfiguration-coderepository)
       */
      override fun codeRepository(): Any? = unwrap(this).getCodeRepository()

      /**
       * The description of a source image repository.
       *
       * You must provide either this member or `CodeRepository` (but not both).
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apprunner-service-sourceconfiguration.html#cfn-apprunner-service-sourceconfiguration-imagerepository)
       */
      override fun imageRepository(): Any? = unwrap(this).getImageRepository()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): SourceConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.apprunner.CfnService.SourceConfigurationProperty):
          SourceConfigurationProperty = CdkObjectWrappers.wrap(cdkObject) as?
          SourceConfigurationProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: SourceConfigurationProperty):
          software.amazon.awscdk.services.apprunner.CfnService.SourceConfigurationProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.apprunner.CfnService.SourceConfigurationProperty
    }
  }
}
