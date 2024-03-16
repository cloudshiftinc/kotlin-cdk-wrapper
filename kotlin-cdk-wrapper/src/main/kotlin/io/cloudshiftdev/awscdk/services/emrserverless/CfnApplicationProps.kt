@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.emrserverless

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.Map
import kotlin.jvm.JvmName

/**
 * Properties for defining a `CfnApplication`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.emrserverless.*;
 * ConfigurationObjectProperty configurationObjectProperty_;
 * CfnApplicationProps cfnApplicationProps = CfnApplicationProps.builder()
 * .releaseLabel("releaseLabel")
 * .type("type")
 * // the properties below are optional
 * .architecture("architecture")
 * .autoStartConfiguration(AutoStartConfigurationProperty.builder()
 * .enabled(false)
 * .build())
 * .autoStopConfiguration(AutoStopConfigurationProperty.builder()
 * .enabled(false)
 * .idleTimeoutMinutes(123)
 * .build())
 * .imageConfiguration(ImageConfigurationInputProperty.builder()
 * .imageUri("imageUri")
 * .build())
 * .initialCapacity(List.of(InitialCapacityConfigKeyValuePairProperty.builder()
 * .key("key")
 * .value(InitialCapacityConfigProperty.builder()
 * .workerConfiguration(WorkerConfigurationProperty.builder()
 * .cpu("cpu")
 * .memory("memory")
 * // the properties below are optional
 * .disk("disk")
 * .build())
 * .workerCount(123)
 * .build())
 * .build()))
 * .maximumCapacity(MaximumAllowedResourcesProperty.builder()
 * .cpu("cpu")
 * .memory("memory")
 * // the properties below are optional
 * .disk("disk")
 * .build())
 * .monitoringConfiguration(MonitoringConfigurationProperty.builder()
 * .cloudWatchLoggingConfiguration(CloudWatchLoggingConfigurationProperty.builder()
 * .enabled(false)
 * .encryptionKeyArn("encryptionKeyArn")
 * .logGroupName("logGroupName")
 * .logStreamNamePrefix("logStreamNamePrefix")
 * .logTypeMap(List.of(LogTypeMapKeyValuePairProperty.builder()
 * .key("key")
 * .value(List.of("value"))
 * .build()))
 * .build())
 * .managedPersistenceMonitoringConfiguration(ManagedPersistenceMonitoringConfigurationProperty.builder()
 * .enabled(false)
 * .encryptionKeyArn("encryptionKeyArn")
 * .build())
 * .s3MonitoringConfiguration(S3MonitoringConfigurationProperty.builder()
 * .encryptionKeyArn("encryptionKeyArn")
 * .logUri("logUri")
 * .build())
 * .build())
 * .name("name")
 * .networkConfiguration(NetworkConfigurationProperty.builder()
 * .securityGroupIds(List.of("securityGroupIds"))
 * .subnetIds(List.of("subnetIds"))
 * .build())
 * .runtimeConfiguration(List.of(ConfigurationObjectProperty.builder()
 * .classification("classification")
 * // the properties below are optional
 * .configurations(List.of(configurationObjectProperty_))
 * .properties(Map.of(
 * "propertiesKey", "properties"))
 * .build()))
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .workerTypeSpecifications(Map.of(
 * "workerTypeSpecificationsKey", WorkerTypeSpecificationInputProperty.builder()
 * .imageConfiguration(ImageConfigurationInputProperty.builder()
 * .imageUri("imageUri")
 * .build())
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-emrserverless-application.html)
 */
public interface CfnApplicationProps {
  /**
   * The CPU architecture of an application.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-emrserverless-application.html#cfn-emrserverless-application-architecture)
   */
  public fun architecture(): String? = unwrap(this).getArchitecture()

  /**
   * The configuration for an application to automatically start on job submission.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-emrserverless-application.html#cfn-emrserverless-application-autostartconfiguration)
   */
  public fun autoStartConfiguration(): Any? = unwrap(this).getAutoStartConfiguration()

  /**
   * The configuration for an application to automatically stop after a certain amount of time being
   * idle.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-emrserverless-application.html#cfn-emrserverless-application-autostopconfiguration)
   */
  public fun autoStopConfiguration(): Any? = unwrap(this).getAutoStopConfiguration()

  /**
   * The image configuration applied to all worker types.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-emrserverless-application.html#cfn-emrserverless-application-imageconfiguration)
   */
  public fun imageConfiguration(): Any? = unwrap(this).getImageConfiguration()

  /**
   * The initial capacity of the application.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-emrserverless-application.html#cfn-emrserverless-application-initialcapacity)
   */
  public fun initialCapacity(): Any? = unwrap(this).getInitialCapacity()

  /**
   * The maximum capacity of the application.
   *
   * This is cumulative across all workers at any given point in time during the lifespan of the
   * application is created. No new resources will be created once any one of the defined limits is
   * hit.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-emrserverless-application.html#cfn-emrserverless-application-maximumcapacity)
   */
  public fun maximumCapacity(): Any? = unwrap(this).getMaximumCapacity()

  /**
   * A configuration specification to be used when provisioning an application.
   *
   * A configuration consists of a classification, properties, and optional nested configurations. A
   * classification refers to an application-specific configuration file. Properties are the settings
   * you want to change in that file.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-emrserverless-application.html#cfn-emrserverless-application-monitoringconfiguration)
   */
  public fun monitoringConfiguration(): Any? = unwrap(this).getMonitoringConfiguration()

  /**
   * The name of the application.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-emrserverless-application.html#cfn-emrserverless-application-name)
   */
  public fun name(): String? = unwrap(this).getName()

  /**
   * The network configuration for customer VPC connectivity for the application.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-emrserverless-application.html#cfn-emrserverless-application-networkconfiguration)
   */
  public fun networkConfiguration(): Any? = unwrap(this).getNetworkConfiguration()

  /**
   * The EMR release associated with the application.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-emrserverless-application.html#cfn-emrserverless-application-releaselabel)
   */
  public fun releaseLabel(): String

  /**
   * The
   * [Configuration](https://docs.aws.amazon.com/emr-serverless/latest/APIReference/API_Configuration.html)
   * specifications of an application. Each configuration consists of a classification and properties.
   * You use this parameter when creating or updating an application. To see the runtimeConfiguration
   * object of an application, run the
   * [GetApplication](https://docs.aws.amazon.com/emr-serverless/latest/APIReference/API_GetApplication.html)
   * API operation.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-emrserverless-application.html#cfn-emrserverless-application-runtimeconfiguration)
   */
  public fun runtimeConfiguration(): Any? = unwrap(this).getRuntimeConfiguration()

  /**
   * The tags assigned to the application.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-emrserverless-application.html#cfn-emrserverless-application-tags)
   */
  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * The type of application, such as Spark or Hive.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-emrserverless-application.html#cfn-emrserverless-application-type)
   */
  public fun type(): String

  /**
   * The specification applied to each worker type.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-emrserverless-application.html#cfn-emrserverless-application-workertypespecifications)
   */
  public fun workerTypeSpecifications(): Any? = unwrap(this).getWorkerTypeSpecifications()

  /**
   * A builder for [CfnApplicationProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param architecture The CPU architecture of an application.
     */
    public fun architecture(architecture: String)

    /**
     * @param autoStartConfiguration The configuration for an application to automatically start on
     * job submission.
     */
    public fun autoStartConfiguration(autoStartConfiguration: IResolvable)

    /**
     * @param autoStartConfiguration The configuration for an application to automatically start on
     * job submission.
     */
    public
        fun autoStartConfiguration(autoStartConfiguration: CfnApplication.AutoStartConfigurationProperty)

    /**
     * @param autoStartConfiguration The configuration for an application to automatically start on
     * job submission.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("2c56e55427ffc6e9c88a76c0c2518dca5cef2cfb032fe06c6248e8db95a4abaa")
    public
        fun autoStartConfiguration(autoStartConfiguration: CfnApplication.AutoStartConfigurationProperty.Builder.() -> Unit)

    /**
     * @param autoStopConfiguration The configuration for an application to automatically stop after
     * a certain amount of time being idle.
     */
    public fun autoStopConfiguration(autoStopConfiguration: IResolvable)

    /**
     * @param autoStopConfiguration The configuration for an application to automatically stop after
     * a certain amount of time being idle.
     */
    public
        fun autoStopConfiguration(autoStopConfiguration: CfnApplication.AutoStopConfigurationProperty)

    /**
     * @param autoStopConfiguration The configuration for an application to automatically stop after
     * a certain amount of time being idle.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("500de897cc0a94d16dfca0ecba731277b538dc74743b3d5fc3facb0a078777c1")
    public
        fun autoStopConfiguration(autoStopConfiguration: CfnApplication.AutoStopConfigurationProperty.Builder.() -> Unit)

    /**
     * @param imageConfiguration The image configuration applied to all worker types.
     */
    public fun imageConfiguration(imageConfiguration: IResolvable)

    /**
     * @param imageConfiguration The image configuration applied to all worker types.
     */
    public
        fun imageConfiguration(imageConfiguration: CfnApplication.ImageConfigurationInputProperty)

    /**
     * @param imageConfiguration The image configuration applied to all worker types.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("acb4744c2049de24c6ffd41fb642b97c83fa2ae1fd542d99699ad72a9c791bd6")
    public
        fun imageConfiguration(imageConfiguration: CfnApplication.ImageConfigurationInputProperty.Builder.() -> Unit)

    /**
     * @param initialCapacity The initial capacity of the application.
     */
    public fun initialCapacity(initialCapacity: IResolvable)

    /**
     * @param initialCapacity The initial capacity of the application.
     */
    public fun initialCapacity(initialCapacity: List<Any>)

    /**
     * @param initialCapacity The initial capacity of the application.
     */
    public fun initialCapacity(vararg initialCapacity: Any)

    /**
     * @param maximumCapacity The maximum capacity of the application.
     * This is cumulative across all workers at any given point in time during the lifespan of the
     * application is created. No new resources will be created once any one of the defined limits is
     * hit.
     */
    public fun maximumCapacity(maximumCapacity: IResolvable)

    /**
     * @param maximumCapacity The maximum capacity of the application.
     * This is cumulative across all workers at any given point in time during the lifespan of the
     * application is created. No new resources will be created once any one of the defined limits is
     * hit.
     */
    public fun maximumCapacity(maximumCapacity: CfnApplication.MaximumAllowedResourcesProperty)

    /**
     * @param maximumCapacity The maximum capacity of the application.
     * This is cumulative across all workers at any given point in time during the lifespan of the
     * application is created. No new resources will be created once any one of the defined limits is
     * hit.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("84ff62a12028d75d395fc0763ba45836088c0bc553ebd77b789c88019a944155")
    public
        fun maximumCapacity(maximumCapacity: CfnApplication.MaximumAllowedResourcesProperty.Builder.() -> Unit)

    /**
     * @param monitoringConfiguration A configuration specification to be used when provisioning an
     * application.
     * A configuration consists of a classification, properties, and optional nested configurations.
     * A classification refers to an application-specific configuration file. Properties are the
     * settings you want to change in that file.
     */
    public fun monitoringConfiguration(monitoringConfiguration: IResolvable)

    /**
     * @param monitoringConfiguration A configuration specification to be used when provisioning an
     * application.
     * A configuration consists of a classification, properties, and optional nested configurations.
     * A classification refers to an application-specific configuration file. Properties are the
     * settings you want to change in that file.
     */
    public
        fun monitoringConfiguration(monitoringConfiguration: CfnApplication.MonitoringConfigurationProperty)

    /**
     * @param monitoringConfiguration A configuration specification to be used when provisioning an
     * application.
     * A configuration consists of a classification, properties, and optional nested configurations.
     * A classification refers to an application-specific configuration file. Properties are the
     * settings you want to change in that file.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("8dc81f1ffc2da6af1f80f12f17224058b6a286e36ac05b5f737f104823e4f40d")
    public
        fun monitoringConfiguration(monitoringConfiguration: CfnApplication.MonitoringConfigurationProperty.Builder.() -> Unit)

    /**
     * @param name The name of the application.
     */
    public fun name(name: String)

    /**
     * @param networkConfiguration The network configuration for customer VPC connectivity for the
     * application.
     */
    public fun networkConfiguration(networkConfiguration: IResolvable)

    /**
     * @param networkConfiguration The network configuration for customer VPC connectivity for the
     * application.
     */
    public
        fun networkConfiguration(networkConfiguration: CfnApplication.NetworkConfigurationProperty)

    /**
     * @param networkConfiguration The network configuration for customer VPC connectivity for the
     * application.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("be091b832776d5e5dded16980a31d452d52a7d11ec6f094c4e3358f3be7099e9")
    public
        fun networkConfiguration(networkConfiguration: CfnApplication.NetworkConfigurationProperty.Builder.() -> Unit)

    /**
     * @param releaseLabel The EMR release associated with the application. 
     */
    public fun releaseLabel(releaseLabel: String)

    /**
     * @param runtimeConfiguration The
     * [Configuration](https://docs.aws.amazon.com/emr-serverless/latest/APIReference/API_Configuration.html)
     * specifications of an application. Each configuration consists of a classification and
     * properties. You use this parameter when creating or updating an application. To see the
     * runtimeConfiguration object of an application, run the
     * [GetApplication](https://docs.aws.amazon.com/emr-serverless/latest/APIReference/API_GetApplication.html)
     * API operation.
     */
    public fun runtimeConfiguration(runtimeConfiguration: IResolvable)

    /**
     * @param runtimeConfiguration The
     * [Configuration](https://docs.aws.amazon.com/emr-serverless/latest/APIReference/API_Configuration.html)
     * specifications of an application. Each configuration consists of a classification and
     * properties. You use this parameter when creating or updating an application. To see the
     * runtimeConfiguration object of an application, run the
     * [GetApplication](https://docs.aws.amazon.com/emr-serverless/latest/APIReference/API_GetApplication.html)
     * API operation.
     */
    public fun runtimeConfiguration(runtimeConfiguration: List<Any>)

    /**
     * @param runtimeConfiguration The
     * [Configuration](https://docs.aws.amazon.com/emr-serverless/latest/APIReference/API_Configuration.html)
     * specifications of an application. Each configuration consists of a classification and
     * properties. You use this parameter when creating or updating an application. To see the
     * runtimeConfiguration object of an application, run the
     * [GetApplication](https://docs.aws.amazon.com/emr-serverless/latest/APIReference/API_GetApplication.html)
     * API operation.
     */
    public fun runtimeConfiguration(vararg runtimeConfiguration: Any)

    /**
     * @param tags The tags assigned to the application.
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * @param tags The tags assigned to the application.
     */
    public fun tags(vararg tags: CfnTag)

    /**
     * @param type The type of application, such as Spark or Hive. 
     */
    public fun type(type: String)

    /**
     * @param workerTypeSpecifications The specification applied to each worker type.
     */
    public fun workerTypeSpecifications(workerTypeSpecifications: IResolvable)

    /**
     * @param workerTypeSpecifications The specification applied to each worker type.
     */
    public fun workerTypeSpecifications(workerTypeSpecifications: Map<String, Any>)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.emrserverless.CfnApplicationProps.Builder =
        software.amazon.awscdk.services.emrserverless.CfnApplicationProps.builder()

    /**
     * @param architecture The CPU architecture of an application.
     */
    override fun architecture(architecture: String) {
      cdkBuilder.architecture(architecture)
    }

    /**
     * @param autoStartConfiguration The configuration for an application to automatically start on
     * job submission.
     */
    override fun autoStartConfiguration(autoStartConfiguration: IResolvable) {
      cdkBuilder.autoStartConfiguration(autoStartConfiguration.let(IResolvable::unwrap))
    }

    /**
     * @param autoStartConfiguration The configuration for an application to automatically start on
     * job submission.
     */
    override
        fun autoStartConfiguration(autoStartConfiguration: CfnApplication.AutoStartConfigurationProperty) {
      cdkBuilder.autoStartConfiguration(autoStartConfiguration.let(CfnApplication.AutoStartConfigurationProperty::unwrap))
    }

    /**
     * @param autoStartConfiguration The configuration for an application to automatically start on
     * job submission.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("2c56e55427ffc6e9c88a76c0c2518dca5cef2cfb032fe06c6248e8db95a4abaa")
    override
        fun autoStartConfiguration(autoStartConfiguration: CfnApplication.AutoStartConfigurationProperty.Builder.() -> Unit):
        Unit =
        autoStartConfiguration(CfnApplication.AutoStartConfigurationProperty(autoStartConfiguration))

    /**
     * @param autoStopConfiguration The configuration for an application to automatically stop after
     * a certain amount of time being idle.
     */
    override fun autoStopConfiguration(autoStopConfiguration: IResolvable) {
      cdkBuilder.autoStopConfiguration(autoStopConfiguration.let(IResolvable::unwrap))
    }

    /**
     * @param autoStopConfiguration The configuration for an application to automatically stop after
     * a certain amount of time being idle.
     */
    override
        fun autoStopConfiguration(autoStopConfiguration: CfnApplication.AutoStopConfigurationProperty) {
      cdkBuilder.autoStopConfiguration(autoStopConfiguration.let(CfnApplication.AutoStopConfigurationProperty::unwrap))
    }

    /**
     * @param autoStopConfiguration The configuration for an application to automatically stop after
     * a certain amount of time being idle.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("500de897cc0a94d16dfca0ecba731277b538dc74743b3d5fc3facb0a078777c1")
    override
        fun autoStopConfiguration(autoStopConfiguration: CfnApplication.AutoStopConfigurationProperty.Builder.() -> Unit):
        Unit =
        autoStopConfiguration(CfnApplication.AutoStopConfigurationProperty(autoStopConfiguration))

    /**
     * @param imageConfiguration The image configuration applied to all worker types.
     */
    override fun imageConfiguration(imageConfiguration: IResolvable) {
      cdkBuilder.imageConfiguration(imageConfiguration.let(IResolvable::unwrap))
    }

    /**
     * @param imageConfiguration The image configuration applied to all worker types.
     */
    override
        fun imageConfiguration(imageConfiguration: CfnApplication.ImageConfigurationInputProperty) {
      cdkBuilder.imageConfiguration(imageConfiguration.let(CfnApplication.ImageConfigurationInputProperty::unwrap))
    }

    /**
     * @param imageConfiguration The image configuration applied to all worker types.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("acb4744c2049de24c6ffd41fb642b97c83fa2ae1fd542d99699ad72a9c791bd6")
    override
        fun imageConfiguration(imageConfiguration: CfnApplication.ImageConfigurationInputProperty.Builder.() -> Unit):
        Unit =
        imageConfiguration(CfnApplication.ImageConfigurationInputProperty(imageConfiguration))

    /**
     * @param initialCapacity The initial capacity of the application.
     */
    override fun initialCapacity(initialCapacity: IResolvable) {
      cdkBuilder.initialCapacity(initialCapacity.let(IResolvable::unwrap))
    }

    /**
     * @param initialCapacity The initial capacity of the application.
     */
    override fun initialCapacity(initialCapacity: List<Any>) {
      cdkBuilder.initialCapacity(initialCapacity)
    }

    /**
     * @param initialCapacity The initial capacity of the application.
     */
    override fun initialCapacity(vararg initialCapacity: Any): Unit =
        initialCapacity(initialCapacity.toList())

    /**
     * @param maximumCapacity The maximum capacity of the application.
     * This is cumulative across all workers at any given point in time during the lifespan of the
     * application is created. No new resources will be created once any one of the defined limits is
     * hit.
     */
    override fun maximumCapacity(maximumCapacity: IResolvable) {
      cdkBuilder.maximumCapacity(maximumCapacity.let(IResolvable::unwrap))
    }

    /**
     * @param maximumCapacity The maximum capacity of the application.
     * This is cumulative across all workers at any given point in time during the lifespan of the
     * application is created. No new resources will be created once any one of the defined limits is
     * hit.
     */
    override fun maximumCapacity(maximumCapacity: CfnApplication.MaximumAllowedResourcesProperty) {
      cdkBuilder.maximumCapacity(maximumCapacity.let(CfnApplication.MaximumAllowedResourcesProperty::unwrap))
    }

    /**
     * @param maximumCapacity The maximum capacity of the application.
     * This is cumulative across all workers at any given point in time during the lifespan of the
     * application is created. No new resources will be created once any one of the defined limits is
     * hit.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("84ff62a12028d75d395fc0763ba45836088c0bc553ebd77b789c88019a944155")
    override
        fun maximumCapacity(maximumCapacity: CfnApplication.MaximumAllowedResourcesProperty.Builder.() -> Unit):
        Unit = maximumCapacity(CfnApplication.MaximumAllowedResourcesProperty(maximumCapacity))

    /**
     * @param monitoringConfiguration A configuration specification to be used when provisioning an
     * application.
     * A configuration consists of a classification, properties, and optional nested configurations.
     * A classification refers to an application-specific configuration file. Properties are the
     * settings you want to change in that file.
     */
    override fun monitoringConfiguration(monitoringConfiguration: IResolvable) {
      cdkBuilder.monitoringConfiguration(monitoringConfiguration.let(IResolvable::unwrap))
    }

    /**
     * @param monitoringConfiguration A configuration specification to be used when provisioning an
     * application.
     * A configuration consists of a classification, properties, and optional nested configurations.
     * A classification refers to an application-specific configuration file. Properties are the
     * settings you want to change in that file.
     */
    override
        fun monitoringConfiguration(monitoringConfiguration: CfnApplication.MonitoringConfigurationProperty) {
      cdkBuilder.monitoringConfiguration(monitoringConfiguration.let(CfnApplication.MonitoringConfigurationProperty::unwrap))
    }

    /**
     * @param monitoringConfiguration A configuration specification to be used when provisioning an
     * application.
     * A configuration consists of a classification, properties, and optional nested configurations.
     * A classification refers to an application-specific configuration file. Properties are the
     * settings you want to change in that file.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("8dc81f1ffc2da6af1f80f12f17224058b6a286e36ac05b5f737f104823e4f40d")
    override
        fun monitoringConfiguration(monitoringConfiguration: CfnApplication.MonitoringConfigurationProperty.Builder.() -> Unit):
        Unit =
        monitoringConfiguration(CfnApplication.MonitoringConfigurationProperty(monitoringConfiguration))

    /**
     * @param name The name of the application.
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * @param networkConfiguration The network configuration for customer VPC connectivity for the
     * application.
     */
    override fun networkConfiguration(networkConfiguration: IResolvable) {
      cdkBuilder.networkConfiguration(networkConfiguration.let(IResolvable::unwrap))
    }

    /**
     * @param networkConfiguration The network configuration for customer VPC connectivity for the
     * application.
     */
    override
        fun networkConfiguration(networkConfiguration: CfnApplication.NetworkConfigurationProperty) {
      cdkBuilder.networkConfiguration(networkConfiguration.let(CfnApplication.NetworkConfigurationProperty::unwrap))
    }

    /**
     * @param networkConfiguration The network configuration for customer VPC connectivity for the
     * application.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("be091b832776d5e5dded16980a31d452d52a7d11ec6f094c4e3358f3be7099e9")
    override
        fun networkConfiguration(networkConfiguration: CfnApplication.NetworkConfigurationProperty.Builder.() -> Unit):
        Unit =
        networkConfiguration(CfnApplication.NetworkConfigurationProperty(networkConfiguration))

    /**
     * @param releaseLabel The EMR release associated with the application. 
     */
    override fun releaseLabel(releaseLabel: String) {
      cdkBuilder.releaseLabel(releaseLabel)
    }

    /**
     * @param runtimeConfiguration The
     * [Configuration](https://docs.aws.amazon.com/emr-serverless/latest/APIReference/API_Configuration.html)
     * specifications of an application. Each configuration consists of a classification and
     * properties. You use this parameter when creating or updating an application. To see the
     * runtimeConfiguration object of an application, run the
     * [GetApplication](https://docs.aws.amazon.com/emr-serverless/latest/APIReference/API_GetApplication.html)
     * API operation.
     */
    override fun runtimeConfiguration(runtimeConfiguration: IResolvable) {
      cdkBuilder.runtimeConfiguration(runtimeConfiguration.let(IResolvable::unwrap))
    }

    /**
     * @param runtimeConfiguration The
     * [Configuration](https://docs.aws.amazon.com/emr-serverless/latest/APIReference/API_Configuration.html)
     * specifications of an application. Each configuration consists of a classification and
     * properties. You use this parameter when creating or updating an application. To see the
     * runtimeConfiguration object of an application, run the
     * [GetApplication](https://docs.aws.amazon.com/emr-serverless/latest/APIReference/API_GetApplication.html)
     * API operation.
     */
    override fun runtimeConfiguration(runtimeConfiguration: List<Any>) {
      cdkBuilder.runtimeConfiguration(runtimeConfiguration)
    }

    /**
     * @param runtimeConfiguration The
     * [Configuration](https://docs.aws.amazon.com/emr-serverless/latest/APIReference/API_Configuration.html)
     * specifications of an application. Each configuration consists of a classification and
     * properties. You use this parameter when creating or updating an application. To see the
     * runtimeConfiguration object of an application, run the
     * [GetApplication](https://docs.aws.amazon.com/emr-serverless/latest/APIReference/API_GetApplication.html)
     * API operation.
     */
    override fun runtimeConfiguration(vararg runtimeConfiguration: Any): Unit =
        runtimeConfiguration(runtimeConfiguration.toList())

    /**
     * @param tags The tags assigned to the application.
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    /**
     * @param tags The tags assigned to the application.
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    /**
     * @param type The type of application, such as Spark or Hive. 
     */
    override fun type(type: String) {
      cdkBuilder.type(type)
    }

    /**
     * @param workerTypeSpecifications The specification applied to each worker type.
     */
    override fun workerTypeSpecifications(workerTypeSpecifications: IResolvable) {
      cdkBuilder.workerTypeSpecifications(workerTypeSpecifications.let(IResolvable::unwrap))
    }

    /**
     * @param workerTypeSpecifications The specification applied to each worker type.
     */
    override fun workerTypeSpecifications(workerTypeSpecifications: Map<String, Any>) {
      cdkBuilder.workerTypeSpecifications(workerTypeSpecifications)
    }

    public fun build(): software.amazon.awscdk.services.emrserverless.CfnApplicationProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.emrserverless.CfnApplicationProps,
  ) : CdkObject(cdkObject), CfnApplicationProps {
    /**
     * The CPU architecture of an application.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-emrserverless-application.html#cfn-emrserverless-application-architecture)
     */
    override fun architecture(): String? = unwrap(this).getArchitecture()

    /**
     * The configuration for an application to automatically start on job submission.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-emrserverless-application.html#cfn-emrserverless-application-autostartconfiguration)
     */
    override fun autoStartConfiguration(): Any? = unwrap(this).getAutoStartConfiguration()

    /**
     * The configuration for an application to automatically stop after a certain amount of time
     * being idle.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-emrserverless-application.html#cfn-emrserverless-application-autostopconfiguration)
     */
    override fun autoStopConfiguration(): Any? = unwrap(this).getAutoStopConfiguration()

    /**
     * The image configuration applied to all worker types.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-emrserverless-application.html#cfn-emrserverless-application-imageconfiguration)
     */
    override fun imageConfiguration(): Any? = unwrap(this).getImageConfiguration()

    /**
     * The initial capacity of the application.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-emrserverless-application.html#cfn-emrserverless-application-initialcapacity)
     */
    override fun initialCapacity(): Any? = unwrap(this).getInitialCapacity()

    /**
     * The maximum capacity of the application.
     *
     * This is cumulative across all workers at any given point in time during the lifespan of the
     * application is created. No new resources will be created once any one of the defined limits is
     * hit.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-emrserverless-application.html#cfn-emrserverless-application-maximumcapacity)
     */
    override fun maximumCapacity(): Any? = unwrap(this).getMaximumCapacity()

    /**
     * A configuration specification to be used when provisioning an application.
     *
     * A configuration consists of a classification, properties, and optional nested configurations.
     * A classification refers to an application-specific configuration file. Properties are the
     * settings you want to change in that file.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-emrserverless-application.html#cfn-emrserverless-application-monitoringconfiguration)
     */
    override fun monitoringConfiguration(): Any? = unwrap(this).getMonitoringConfiguration()

    /**
     * The name of the application.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-emrserverless-application.html#cfn-emrserverless-application-name)
     */
    override fun name(): String? = unwrap(this).getName()

    /**
     * The network configuration for customer VPC connectivity for the application.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-emrserverless-application.html#cfn-emrserverless-application-networkconfiguration)
     */
    override fun networkConfiguration(): Any? = unwrap(this).getNetworkConfiguration()

    /**
     * The EMR release associated with the application.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-emrserverless-application.html#cfn-emrserverless-application-releaselabel)
     */
    override fun releaseLabel(): String = unwrap(this).getReleaseLabel()

    /**
     * The
     * [Configuration](https://docs.aws.amazon.com/emr-serverless/latest/APIReference/API_Configuration.html)
     * specifications of an application. Each configuration consists of a classification and
     * properties. You use this parameter when creating or updating an application. To see the
     * runtimeConfiguration object of an application, run the
     * [GetApplication](https://docs.aws.amazon.com/emr-serverless/latest/APIReference/API_GetApplication.html)
     * API operation.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-emrserverless-application.html#cfn-emrserverless-application-runtimeconfiguration)
     */
    override fun runtimeConfiguration(): Any? = unwrap(this).getRuntimeConfiguration()

    /**
     * The tags assigned to the application.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-emrserverless-application.html#cfn-emrserverless-application-tags)
     */
    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

    /**
     * The type of application, such as Spark or Hive.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-emrserverless-application.html#cfn-emrserverless-application-type)
     */
    override fun type(): String = unwrap(this).getType()

    /**
     * The specification applied to each worker type.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-emrserverless-application.html#cfn-emrserverless-application-workertypespecifications)
     */
    override fun workerTypeSpecifications(): Any? = unwrap(this).getWorkerTypeSpecifications()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnApplicationProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.emrserverless.CfnApplicationProps):
        CfnApplicationProps = CdkObjectWrappers.wrap(cdkObject) as CfnApplicationProps

    internal fun unwrap(wrapped: CfnApplicationProps):
        software.amazon.awscdk.services.emrserverless.CfnApplicationProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.emrserverless.CfnApplicationProps
  }
}
