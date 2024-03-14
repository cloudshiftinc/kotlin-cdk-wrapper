package io.cloudshiftdev.awscdk.services.emrserverless

import io.cloudshiftdev.awscdk.CdkObject
import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.ITaggable
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.Map
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnApplication internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.emrserverless.CfnApplication,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  /**
   * The CPU architecture of an application.
   */
  public open fun architecture(): String? = unwrap(this).getArchitecture()

  /**
   * The CPU architecture of an application.
   */
  public open fun architecture(`value`: String) {
    unwrap(this).setArchitecture(`value`)
  }

  /**
   * The ID of the application, such as `ab4rp1abcs8xz47n3x0example` .
   */
  public open fun attrApplicationId(): String = unwrap(this).getAttrApplicationId()

  /**
   * The Amazon Resource Name (ARN) of the project.
   */
  public open fun attrArn(): String = unwrap(this).getAttrArn()

  /**
   * The configuration for an application to automatically start on job submission.
   */
  public open fun autoStartConfiguration(): Any? = unwrap(this).getAutoStartConfiguration()

  /**
   * The configuration for an application to automatically start on job submission.
   */
  public open fun autoStartConfiguration(`value`: IResolvable) {
    unwrap(this).setAutoStartConfiguration(`value`.let(IResolvable::unwrap))
  }

  /**
   * The configuration for an application to automatically start on job submission.
   */
  public open fun autoStartConfiguration(`value`: AutoStartConfigurationProperty) {
    unwrap(this).setAutoStartConfiguration(`value`.let(AutoStartConfigurationProperty::unwrap))
  }

  /**
   * The configuration for an application to automatically start on job submission.
   */
  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("1e21bbbe9504800f0ad9d478ca7adecaa67cbd310f134888df90fe168905b2f2")
  public open
      fun autoStartConfiguration(`value`: AutoStartConfigurationProperty.Builder.() -> Unit): Unit =
      autoStartConfiguration(AutoStartConfigurationProperty(`value`))

  /**
   * The configuration for an application to automatically stop after a certain amount of time being
   * idle.
   */
  public open fun autoStopConfiguration(): Any? = unwrap(this).getAutoStopConfiguration()

  /**
   * The configuration for an application to automatically stop after a certain amount of time being
   * idle.
   */
  public open fun autoStopConfiguration(`value`: IResolvable) {
    unwrap(this).setAutoStopConfiguration(`value`.let(IResolvable::unwrap))
  }

  /**
   * The configuration for an application to automatically stop after a certain amount of time being
   * idle.
   */
  public open fun autoStopConfiguration(`value`: AutoStopConfigurationProperty) {
    unwrap(this).setAutoStopConfiguration(`value`.let(AutoStopConfigurationProperty::unwrap))
  }

  /**
   * The configuration for an application to automatically stop after a certain amount of time being
   * idle.
   */
  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("ea4e5defa32ba28ac648747a6c25c971b88fcc98750fd1f70a7fa799513da492")
  public open fun autoStopConfiguration(`value`: AutoStopConfigurationProperty.Builder.() -> Unit):
      Unit = autoStopConfiguration(AutoStopConfigurationProperty(`value`))

  /**
   * The image configuration applied to all worker types.
   */
  public open fun imageConfiguration(): Any? = unwrap(this).getImageConfiguration()

  /**
   * The image configuration applied to all worker types.
   */
  public open fun imageConfiguration(`value`: IResolvable) {
    unwrap(this).setImageConfiguration(`value`.let(IResolvable::unwrap))
  }

  /**
   * The image configuration applied to all worker types.
   */
  public open fun imageConfiguration(`value`: ImageConfigurationInputProperty) {
    unwrap(this).setImageConfiguration(`value`.let(ImageConfigurationInputProperty::unwrap))
  }

  /**
   * The image configuration applied to all worker types.
   */
  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("7f2f899ff947c6b52866fbd1291aeae8591b98d1704bef9a0928152ee3e89f14")
  public open fun imageConfiguration(`value`: ImageConfigurationInputProperty.Builder.() -> Unit):
      Unit = imageConfiguration(ImageConfigurationInputProperty(`value`))

  /**
   * The initial capacity of the application.
   */
  public open fun initialCapacity(): Any? = unwrap(this).getInitialCapacity()

  /**
   * The initial capacity of the application.
   */
  public open fun initialCapacity(`value`: IResolvable) {
    unwrap(this).setInitialCapacity(`value`.let(IResolvable::unwrap))
  }

  /**
   * The initial capacity of the application.
   */
  public open fun initialCapacity(__idx_ac66f0: List<Any>) {
    unwrap(this).setInitialCapacity(__idx_ac66f0)
  }

  /**
   * The initial capacity of the application.
   */
  public open fun initialCapacity(vararg __idx_ac66f0: Any): Unit =
      initialCapacity(__idx_ac66f0.toList())

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  /**
   * The maximum capacity of the application.
   */
  public open fun maximumCapacity(): Any? = unwrap(this).getMaximumCapacity()

  /**
   * The maximum capacity of the application.
   */
  public open fun maximumCapacity(`value`: IResolvable) {
    unwrap(this).setMaximumCapacity(`value`.let(IResolvable::unwrap))
  }

  /**
   * The maximum capacity of the application.
   */
  public open fun maximumCapacity(`value`: MaximumAllowedResourcesProperty) {
    unwrap(this).setMaximumCapacity(`value`.let(MaximumAllowedResourcesProperty::unwrap))
  }

  /**
   * The maximum capacity of the application.
   */
  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("dc4b1f9d213822ea68014557fac85442ea2aaf5a53ae71034d82252cd0b2fc32")
  public open fun maximumCapacity(`value`: MaximumAllowedResourcesProperty.Builder.() -> Unit): Unit
      = maximumCapacity(MaximumAllowedResourcesProperty(`value`))

  /**
   * A configuration specification to be used when provisioning an application.
   */
  public open fun monitoringConfiguration(): Any? = unwrap(this).getMonitoringConfiguration()

  /**
   * A configuration specification to be used when provisioning an application.
   */
  public open fun monitoringConfiguration(`value`: IResolvable) {
    unwrap(this).setMonitoringConfiguration(`value`.let(IResolvable::unwrap))
  }

  /**
   * A configuration specification to be used when provisioning an application.
   */
  public open fun monitoringConfiguration(`value`: MonitoringConfigurationProperty) {
    unwrap(this).setMonitoringConfiguration(`value`.let(MonitoringConfigurationProperty::unwrap))
  }

  /**
   * A configuration specification to be used when provisioning an application.
   */
  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("c39356bc0b1fa81077db85b0c7c39c0829552e93ffe5172168c20f97681816b0")
  public open
      fun monitoringConfiguration(`value`: MonitoringConfigurationProperty.Builder.() -> Unit): Unit
      = monitoringConfiguration(MonitoringConfigurationProperty(`value`))

  /**
   * The name of the application.
   */
  public open fun name(): String? = unwrap(this).getName()

  /**
   * The name of the application.
   */
  public open fun name(`value`: String) {
    unwrap(this).setName(`value`)
  }

  /**
   * The network configuration for customer VPC connectivity for the application.
   */
  public open fun networkConfiguration(): Any? = unwrap(this).getNetworkConfiguration()

  /**
   * The network configuration for customer VPC connectivity for the application.
   */
  public open fun networkConfiguration(`value`: IResolvable) {
    unwrap(this).setNetworkConfiguration(`value`.let(IResolvable::unwrap))
  }

  /**
   * The network configuration for customer VPC connectivity for the application.
   */
  public open fun networkConfiguration(`value`: NetworkConfigurationProperty) {
    unwrap(this).setNetworkConfiguration(`value`.let(NetworkConfigurationProperty::unwrap))
  }

  /**
   * The network configuration for customer VPC connectivity for the application.
   */
  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("4c51ef35782b79b7f35abc161d840555211ee03a6e0100e7503fad8607d3961a")
  public open fun networkConfiguration(`value`: NetworkConfigurationProperty.Builder.() -> Unit):
      Unit = networkConfiguration(NetworkConfigurationProperty(`value`))

  /**
   * The EMR release associated with the application.
   */
  public open fun releaseLabel(): String = unwrap(this).getReleaseLabel()

  /**
   * The EMR release associated with the application.
   */
  public open fun releaseLabel(`value`: String) {
    unwrap(this).setReleaseLabel(`value`)
  }

  /**
   * The
   * [Configuration](https://docs.aws.amazon.com/emr-serverless/latest/APIReference/API_Configuration.html)
   * specifications of an application. Each configuration consists of a classification and properties.
   * You use this parameter when creating or updating an application. To see the runtimeConfiguration
   * object of an application, run the
   * [GetApplication](https://docs.aws.amazon.com/emr-serverless/latest/APIReference/API_GetApplication.html)
   * API operation.
   */
  public open fun runtimeConfiguration(): Any? = unwrap(this).getRuntimeConfiguration()

  /**
   * The
   * [Configuration](https://docs.aws.amazon.com/emr-serverless/latest/APIReference/API_Configuration.html)
   * specifications of an application. Each configuration consists of a classification and properties.
   * You use this parameter when creating or updating an application. To see the runtimeConfiguration
   * object of an application, run the
   * [GetApplication](https://docs.aws.amazon.com/emr-serverless/latest/APIReference/API_GetApplication.html)
   * API operation.
   */
  public open fun runtimeConfiguration(`value`: IResolvable) {
    unwrap(this).setRuntimeConfiguration(`value`.let(IResolvable::unwrap))
  }

  /**
   * The
   * [Configuration](https://docs.aws.amazon.com/emr-serverless/latest/APIReference/API_Configuration.html)
   * specifications of an application. Each configuration consists of a classification and properties.
   * You use this parameter when creating or updating an application. To see the runtimeConfiguration
   * object of an application, run the
   * [GetApplication](https://docs.aws.amazon.com/emr-serverless/latest/APIReference/API_GetApplication.html)
   * API operation.
   */
  public open fun runtimeConfiguration(__idx_ac66f0: List<Any>) {
    unwrap(this).setRuntimeConfiguration(__idx_ac66f0)
  }

  /**
   * The
   * [Configuration](https://docs.aws.amazon.com/emr-serverless/latest/APIReference/API_Configuration.html)
   * specifications of an application. Each configuration consists of a classification and properties.
   * You use this parameter when creating or updating an application. To see the runtimeConfiguration
   * object of an application, run the
   * [GetApplication](https://docs.aws.amazon.com/emr-serverless/latest/APIReference/API_GetApplication.html)
   * API operation.
   */
  public open fun runtimeConfiguration(vararg __idx_ac66f0: Any): Unit =
      runtimeConfiguration(__idx_ac66f0.toList())

  /**
   * Tag Manager which manages the tags for this resource.
   */
  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  /**
   * The tags assigned to the application.
   */
  public open fun tagsRaw(): List<CfnTag> = unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?:
      emptyList()

  /**
   * The tags assigned to the application.
   */
  public open fun tagsRaw(`value`: List<CfnTag>) {
    unwrap(this).setTagsRaw(`value`.map(CfnTag::unwrap))
  }

  /**
   * The tags assigned to the application.
   */
  public open fun tagsRaw(vararg `value`: CfnTag): Unit = tagsRaw(`value`.toList())

  /**
   * The type of application, such as Spark or Hive.
   */
  public open fun type(): String = unwrap(this).getType()

  /**
   * The type of application, such as Spark or Hive.
   */
  public open fun type(`value`: String) {
    unwrap(this).setType(`value`)
  }

  /**
   * The specification applied to each worker type.
   */
  public open fun workerTypeSpecifications(): Any? = unwrap(this).getWorkerTypeSpecifications()

  /**
   * The specification applied to each worker type.
   */
  public open fun workerTypeSpecifications(`value`: IResolvable) {
    unwrap(this).setWorkerTypeSpecifications(`value`.let(IResolvable::unwrap))
  }

  /**
   * The specification applied to each worker type.
   */
  public open fun workerTypeSpecifications(__item_ac66f0: Map<String, Any>) {
    unwrap(this).setWorkerTypeSpecifications(__item_ac66f0)
  }

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.emrserverless.CfnApplication].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The CPU architecture of an application.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-emrserverless-application.html#cfn-emrserverless-application-architecture)
     * @param architecture The CPU architecture of an application. 
     */
    public fun architecture(architecture: String)

    /**
     * The configuration for an application to automatically start on job submission.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-emrserverless-application.html#cfn-emrserverless-application-autostartconfiguration)
     * @param autoStartConfiguration The configuration for an application to automatically start on
     * job submission. 
     */
    public fun autoStartConfiguration(autoStartConfiguration: IResolvable)

    /**
     * The configuration for an application to automatically start on job submission.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-emrserverless-application.html#cfn-emrserverless-application-autostartconfiguration)
     * @param autoStartConfiguration The configuration for an application to automatically start on
     * job submission. 
     */
    public fun autoStartConfiguration(autoStartConfiguration: AutoStartConfigurationProperty)

    /**
     * The configuration for an application to automatically start on job submission.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-emrserverless-application.html#cfn-emrserverless-application-autostartconfiguration)
     * @param autoStartConfiguration The configuration for an application to automatically start on
     * job submission. 
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("18fdb9afac26c4dbe15046dee5d150bce42e1254f86f6b615e4b758d23c1a7b5")
    public
        fun autoStartConfiguration(autoStartConfiguration: AutoStartConfigurationProperty.Builder.() -> Unit)

    /**
     * The configuration for an application to automatically stop after a certain amount of time
     * being idle.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-emrserverless-application.html#cfn-emrserverless-application-autostopconfiguration)
     * @param autoStopConfiguration The configuration for an application to automatically stop after
     * a certain amount of time being idle. 
     */
    public fun autoStopConfiguration(autoStopConfiguration: IResolvable)

    /**
     * The configuration for an application to automatically stop after a certain amount of time
     * being idle.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-emrserverless-application.html#cfn-emrserverless-application-autostopconfiguration)
     * @param autoStopConfiguration The configuration for an application to automatically stop after
     * a certain amount of time being idle. 
     */
    public fun autoStopConfiguration(autoStopConfiguration: AutoStopConfigurationProperty)

    /**
     * The configuration for an application to automatically stop after a certain amount of time
     * being idle.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-emrserverless-application.html#cfn-emrserverless-application-autostopconfiguration)
     * @param autoStopConfiguration The configuration for an application to automatically stop after
     * a certain amount of time being idle. 
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("7d640017ae5c55847f0b88c39709b93ad9217e264081c45ad93a0f20c4adc60a")
    public
        fun autoStopConfiguration(autoStopConfiguration: AutoStopConfigurationProperty.Builder.() -> Unit)

    /**
     * The image configuration applied to all worker types.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-emrserverless-application.html#cfn-emrserverless-application-imageconfiguration)
     * @param imageConfiguration The image configuration applied to all worker types. 
     */
    public fun imageConfiguration(imageConfiguration: IResolvable)

    /**
     * The image configuration applied to all worker types.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-emrserverless-application.html#cfn-emrserverless-application-imageconfiguration)
     * @param imageConfiguration The image configuration applied to all worker types. 
     */
    public fun imageConfiguration(imageConfiguration: ImageConfigurationInputProperty)

    /**
     * The image configuration applied to all worker types.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-emrserverless-application.html#cfn-emrserverless-application-imageconfiguration)
     * @param imageConfiguration The image configuration applied to all worker types. 
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("135c9a0f8dac4390742ce2e8e7fbaa6e44a3c55e3f426f6e57acf418b5a62d29")
    public
        fun imageConfiguration(imageConfiguration: ImageConfigurationInputProperty.Builder.() -> Unit)

    /**
     * The initial capacity of the application.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-emrserverless-application.html#cfn-emrserverless-application-initialcapacity)
     * @param initialCapacity The initial capacity of the application. 
     */
    public fun initialCapacity(initialCapacity: IResolvable)

    /**
     * The initial capacity of the application.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-emrserverless-application.html#cfn-emrserverless-application-initialcapacity)
     * @param initialCapacity The initial capacity of the application. 
     */
    public fun initialCapacity(initialCapacity: List<Any>)

    /**
     * The initial capacity of the application.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-emrserverless-application.html#cfn-emrserverless-application-initialcapacity)
     * @param initialCapacity The initial capacity of the application. 
     */
    public fun initialCapacity(vararg initialCapacity: Any)

    /**
     * The maximum capacity of the application.
     *
     * This is cumulative across all workers at any given point in time during the lifespan of the
     * application is created. No new resources will be created once any one of the defined limits is
     * hit.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-emrserverless-application.html#cfn-emrserverless-application-maximumcapacity)
     * @param maximumCapacity The maximum capacity of the application. 
     */
    public fun maximumCapacity(maximumCapacity: IResolvable)

    /**
     * The maximum capacity of the application.
     *
     * This is cumulative across all workers at any given point in time during the lifespan of the
     * application is created. No new resources will be created once any one of the defined limits is
     * hit.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-emrserverless-application.html#cfn-emrserverless-application-maximumcapacity)
     * @param maximumCapacity The maximum capacity of the application. 
     */
    public fun maximumCapacity(maximumCapacity: MaximumAllowedResourcesProperty)

    /**
     * The maximum capacity of the application.
     *
     * This is cumulative across all workers at any given point in time during the lifespan of the
     * application is created. No new resources will be created once any one of the defined limits is
     * hit.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-emrserverless-application.html#cfn-emrserverless-application-maximumcapacity)
     * @param maximumCapacity The maximum capacity of the application. 
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("3e5ff91bb8b13d7563d79d4ffb7db188e847e9c8b505d2e9303080b8b7bd0c88")
    public fun maximumCapacity(maximumCapacity: MaximumAllowedResourcesProperty.Builder.() -> Unit)

    /**
     * A configuration specification to be used when provisioning an application.
     *
     * A configuration consists of a classification, properties, and optional nested configurations.
     * A classification refers to an application-specific configuration file. Properties are the
     * settings you want to change in that file.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-emrserverless-application.html#cfn-emrserverless-application-monitoringconfiguration)
     * @param monitoringConfiguration A configuration specification to be used when provisioning an
     * application. 
     */
    public fun monitoringConfiguration(monitoringConfiguration: IResolvable)

    /**
     * A configuration specification to be used when provisioning an application.
     *
     * A configuration consists of a classification, properties, and optional nested configurations.
     * A classification refers to an application-specific configuration file. Properties are the
     * settings you want to change in that file.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-emrserverless-application.html#cfn-emrserverless-application-monitoringconfiguration)
     * @param monitoringConfiguration A configuration specification to be used when provisioning an
     * application. 
     */
    public fun monitoringConfiguration(monitoringConfiguration: MonitoringConfigurationProperty)

    /**
     * A configuration specification to be used when provisioning an application.
     *
     * A configuration consists of a classification, properties, and optional nested configurations.
     * A classification refers to an application-specific configuration file. Properties are the
     * settings you want to change in that file.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-emrserverless-application.html#cfn-emrserverless-application-monitoringconfiguration)
     * @param monitoringConfiguration A configuration specification to be used when provisioning an
     * application. 
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("242a10a764ade48a2bb8514baeb9e403cb10ce3537b62d75d6f04c94a7067ebb")
    public
        fun monitoringConfiguration(monitoringConfiguration: MonitoringConfigurationProperty.Builder.() -> Unit)

    /**
     * The name of the application.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-emrserverless-application.html#cfn-emrserverless-application-name)
     * @param name The name of the application. 
     */
    public fun name(name: String)

    /**
     * The network configuration for customer VPC connectivity for the application.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-emrserverless-application.html#cfn-emrserverless-application-networkconfiguration)
     * @param networkConfiguration The network configuration for customer VPC connectivity for the
     * application. 
     */
    public fun networkConfiguration(networkConfiguration: IResolvable)

    /**
     * The network configuration for customer VPC connectivity for the application.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-emrserverless-application.html#cfn-emrserverless-application-networkconfiguration)
     * @param networkConfiguration The network configuration for customer VPC connectivity for the
     * application. 
     */
    public fun networkConfiguration(networkConfiguration: NetworkConfigurationProperty)

    /**
     * The network configuration for customer VPC connectivity for the application.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-emrserverless-application.html#cfn-emrserverless-application-networkconfiguration)
     * @param networkConfiguration The network configuration for customer VPC connectivity for the
     * application. 
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("c009b63a19f1c75027791ae63828a9cb2a1fb2218e90e5f53b109f77c0728f1d")
    public
        fun networkConfiguration(networkConfiguration: NetworkConfigurationProperty.Builder.() -> Unit)

    /**
     * The EMR release associated with the application.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-emrserverless-application.html#cfn-emrserverless-application-releaselabel)
     * @param releaseLabel The EMR release associated with the application. 
     */
    public fun releaseLabel(releaseLabel: String)

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
     * The
     * [Configuration](https://docs.aws.amazon.com/emr-serverless/latest/APIReference/API_Configuration.html)
     * specifications of an application. Each configuration consists of a classification and
     * properties. You use this parameter when creating or updating an application. To see the
     * runtimeConfiguration object of an application, run the
     * [GetApplication](https://docs.aws.amazon.com/emr-serverless/latest/APIReference/API_GetApplication.html)
     * API operation.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-emrserverless-application.html#cfn-emrserverless-application-runtimeconfiguration)
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
     * The
     * [Configuration](https://docs.aws.amazon.com/emr-serverless/latest/APIReference/API_Configuration.html)
     * specifications of an application. Each configuration consists of a classification and
     * properties. You use this parameter when creating or updating an application. To see the
     * runtimeConfiguration object of an application, run the
     * [GetApplication](https://docs.aws.amazon.com/emr-serverless/latest/APIReference/API_GetApplication.html)
     * API operation.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-emrserverless-application.html#cfn-emrserverless-application-runtimeconfiguration)
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
     * The tags assigned to the application.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-emrserverless-application.html#cfn-emrserverless-application-tags)
     * @param tags The tags assigned to the application. 
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * The tags assigned to the application.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-emrserverless-application.html#cfn-emrserverless-application-tags)
     * @param tags The tags assigned to the application. 
     */
    public fun tags(vararg tags: CfnTag)

    /**
     * The type of application, such as Spark or Hive.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-emrserverless-application.html#cfn-emrserverless-application-type)
     * @param type The type of application, such as Spark or Hive. 
     */
    public fun type(type: String)

    /**
     * The specification applied to each worker type.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-emrserverless-application.html#cfn-emrserverless-application-workertypespecifications)
     * @param workerTypeSpecifications The specification applied to each worker type. 
     */
    public fun workerTypeSpecifications(workerTypeSpecifications: IResolvable)

    /**
     * The specification applied to each worker type.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-emrserverless-application.html#cfn-emrserverless-application-workertypespecifications)
     * @param workerTypeSpecifications The specification applied to each worker type. 
     */
    public fun workerTypeSpecifications(workerTypeSpecifications: Map<String, Any>)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.emrserverless.CfnApplication.Builder =
        software.amazon.awscdk.services.emrserverless.CfnApplication.Builder.create(scope, id)

    /**
     * The CPU architecture of an application.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-emrserverless-application.html#cfn-emrserverless-application-architecture)
     * @param architecture The CPU architecture of an application. 
     */
    override fun architecture(architecture: String) {
      cdkBuilder.architecture(architecture)
    }

    /**
     * The configuration for an application to automatically start on job submission.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-emrserverless-application.html#cfn-emrserverless-application-autostartconfiguration)
     * @param autoStartConfiguration The configuration for an application to automatically start on
     * job submission. 
     */
    override fun autoStartConfiguration(autoStartConfiguration: IResolvable) {
      cdkBuilder.autoStartConfiguration(autoStartConfiguration.let(IResolvable::unwrap))
    }

    /**
     * The configuration for an application to automatically start on job submission.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-emrserverless-application.html#cfn-emrserverless-application-autostartconfiguration)
     * @param autoStartConfiguration The configuration for an application to automatically start on
     * job submission. 
     */
    override fun autoStartConfiguration(autoStartConfiguration: AutoStartConfigurationProperty) {
      cdkBuilder.autoStartConfiguration(autoStartConfiguration.let(AutoStartConfigurationProperty::unwrap))
    }

    /**
     * The configuration for an application to automatically start on job submission.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-emrserverless-application.html#cfn-emrserverless-application-autostartconfiguration)
     * @param autoStartConfiguration The configuration for an application to automatically start on
     * job submission. 
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("18fdb9afac26c4dbe15046dee5d150bce42e1254f86f6b615e4b758d23c1a7b5")
    override
        fun autoStartConfiguration(autoStartConfiguration: AutoStartConfigurationProperty.Builder.() -> Unit):
        Unit = autoStartConfiguration(AutoStartConfigurationProperty(autoStartConfiguration))

    /**
     * The configuration for an application to automatically stop after a certain amount of time
     * being idle.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-emrserverless-application.html#cfn-emrserverless-application-autostopconfiguration)
     * @param autoStopConfiguration The configuration for an application to automatically stop after
     * a certain amount of time being idle. 
     */
    override fun autoStopConfiguration(autoStopConfiguration: IResolvable) {
      cdkBuilder.autoStopConfiguration(autoStopConfiguration.let(IResolvable::unwrap))
    }

    /**
     * The configuration for an application to automatically stop after a certain amount of time
     * being idle.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-emrserverless-application.html#cfn-emrserverless-application-autostopconfiguration)
     * @param autoStopConfiguration The configuration for an application to automatically stop after
     * a certain amount of time being idle. 
     */
    override fun autoStopConfiguration(autoStopConfiguration: AutoStopConfigurationProperty) {
      cdkBuilder.autoStopConfiguration(autoStopConfiguration.let(AutoStopConfigurationProperty::unwrap))
    }

    /**
     * The configuration for an application to automatically stop after a certain amount of time
     * being idle.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-emrserverless-application.html#cfn-emrserverless-application-autostopconfiguration)
     * @param autoStopConfiguration The configuration for an application to automatically stop after
     * a certain amount of time being idle. 
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("7d640017ae5c55847f0b88c39709b93ad9217e264081c45ad93a0f20c4adc60a")
    override
        fun autoStopConfiguration(autoStopConfiguration: AutoStopConfigurationProperty.Builder.() -> Unit):
        Unit = autoStopConfiguration(AutoStopConfigurationProperty(autoStopConfiguration))

    /**
     * The image configuration applied to all worker types.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-emrserverless-application.html#cfn-emrserverless-application-imageconfiguration)
     * @param imageConfiguration The image configuration applied to all worker types. 
     */
    override fun imageConfiguration(imageConfiguration: IResolvable) {
      cdkBuilder.imageConfiguration(imageConfiguration.let(IResolvable::unwrap))
    }

    /**
     * The image configuration applied to all worker types.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-emrserverless-application.html#cfn-emrserverless-application-imageconfiguration)
     * @param imageConfiguration The image configuration applied to all worker types. 
     */
    override fun imageConfiguration(imageConfiguration: ImageConfigurationInputProperty) {
      cdkBuilder.imageConfiguration(imageConfiguration.let(ImageConfigurationInputProperty::unwrap))
    }

    /**
     * The image configuration applied to all worker types.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-emrserverless-application.html#cfn-emrserverless-application-imageconfiguration)
     * @param imageConfiguration The image configuration applied to all worker types. 
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("135c9a0f8dac4390742ce2e8e7fbaa6e44a3c55e3f426f6e57acf418b5a62d29")
    override
        fun imageConfiguration(imageConfiguration: ImageConfigurationInputProperty.Builder.() -> Unit):
        Unit = imageConfiguration(ImageConfigurationInputProperty(imageConfiguration))

    /**
     * The initial capacity of the application.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-emrserverless-application.html#cfn-emrserverless-application-initialcapacity)
     * @param initialCapacity The initial capacity of the application. 
     */
    override fun initialCapacity(initialCapacity: IResolvable) {
      cdkBuilder.initialCapacity(initialCapacity.let(IResolvable::unwrap))
    }

    /**
     * The initial capacity of the application.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-emrserverless-application.html#cfn-emrserverless-application-initialcapacity)
     * @param initialCapacity The initial capacity of the application. 
     */
    override fun initialCapacity(initialCapacity: List<Any>) {
      cdkBuilder.initialCapacity(initialCapacity)
    }

    /**
     * The initial capacity of the application.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-emrserverless-application.html#cfn-emrserverless-application-initialcapacity)
     * @param initialCapacity The initial capacity of the application. 
     */
    override fun initialCapacity(vararg initialCapacity: Any): Unit =
        initialCapacity(initialCapacity.toList())

    /**
     * The maximum capacity of the application.
     *
     * This is cumulative across all workers at any given point in time during the lifespan of the
     * application is created. No new resources will be created once any one of the defined limits is
     * hit.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-emrserverless-application.html#cfn-emrserverless-application-maximumcapacity)
     * @param maximumCapacity The maximum capacity of the application. 
     */
    override fun maximumCapacity(maximumCapacity: IResolvable) {
      cdkBuilder.maximumCapacity(maximumCapacity.let(IResolvable::unwrap))
    }

    /**
     * The maximum capacity of the application.
     *
     * This is cumulative across all workers at any given point in time during the lifespan of the
     * application is created. No new resources will be created once any one of the defined limits is
     * hit.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-emrserverless-application.html#cfn-emrserverless-application-maximumcapacity)
     * @param maximumCapacity The maximum capacity of the application. 
     */
    override fun maximumCapacity(maximumCapacity: MaximumAllowedResourcesProperty) {
      cdkBuilder.maximumCapacity(maximumCapacity.let(MaximumAllowedResourcesProperty::unwrap))
    }

    /**
     * The maximum capacity of the application.
     *
     * This is cumulative across all workers at any given point in time during the lifespan of the
     * application is created. No new resources will be created once any one of the defined limits is
     * hit.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-emrserverless-application.html#cfn-emrserverless-application-maximumcapacity)
     * @param maximumCapacity The maximum capacity of the application. 
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("3e5ff91bb8b13d7563d79d4ffb7db188e847e9c8b505d2e9303080b8b7bd0c88")
    override
        fun maximumCapacity(maximumCapacity: MaximumAllowedResourcesProperty.Builder.() -> Unit):
        Unit = maximumCapacity(MaximumAllowedResourcesProperty(maximumCapacity))

    /**
     * A configuration specification to be used when provisioning an application.
     *
     * A configuration consists of a classification, properties, and optional nested configurations.
     * A classification refers to an application-specific configuration file. Properties are the
     * settings you want to change in that file.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-emrserverless-application.html#cfn-emrserverless-application-monitoringconfiguration)
     * @param monitoringConfiguration A configuration specification to be used when provisioning an
     * application. 
     */
    override fun monitoringConfiguration(monitoringConfiguration: IResolvable) {
      cdkBuilder.monitoringConfiguration(monitoringConfiguration.let(IResolvable::unwrap))
    }

    /**
     * A configuration specification to be used when provisioning an application.
     *
     * A configuration consists of a classification, properties, and optional nested configurations.
     * A classification refers to an application-specific configuration file. Properties are the
     * settings you want to change in that file.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-emrserverless-application.html#cfn-emrserverless-application-monitoringconfiguration)
     * @param monitoringConfiguration A configuration specification to be used when provisioning an
     * application. 
     */
    override fun monitoringConfiguration(monitoringConfiguration: MonitoringConfigurationProperty) {
      cdkBuilder.monitoringConfiguration(monitoringConfiguration.let(MonitoringConfigurationProperty::unwrap))
    }

    /**
     * A configuration specification to be used when provisioning an application.
     *
     * A configuration consists of a classification, properties, and optional nested configurations.
     * A classification refers to an application-specific configuration file. Properties are the
     * settings you want to change in that file.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-emrserverless-application.html#cfn-emrserverless-application-monitoringconfiguration)
     * @param monitoringConfiguration A configuration specification to be used when provisioning an
     * application. 
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("242a10a764ade48a2bb8514baeb9e403cb10ce3537b62d75d6f04c94a7067ebb")
    override
        fun monitoringConfiguration(monitoringConfiguration: MonitoringConfigurationProperty.Builder.() -> Unit):
        Unit = monitoringConfiguration(MonitoringConfigurationProperty(monitoringConfiguration))

    /**
     * The name of the application.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-emrserverless-application.html#cfn-emrserverless-application-name)
     * @param name The name of the application. 
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * The network configuration for customer VPC connectivity for the application.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-emrserverless-application.html#cfn-emrserverless-application-networkconfiguration)
     * @param networkConfiguration The network configuration for customer VPC connectivity for the
     * application. 
     */
    override fun networkConfiguration(networkConfiguration: IResolvable) {
      cdkBuilder.networkConfiguration(networkConfiguration.let(IResolvable::unwrap))
    }

    /**
     * The network configuration for customer VPC connectivity for the application.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-emrserverless-application.html#cfn-emrserverless-application-networkconfiguration)
     * @param networkConfiguration The network configuration for customer VPC connectivity for the
     * application. 
     */
    override fun networkConfiguration(networkConfiguration: NetworkConfigurationProperty) {
      cdkBuilder.networkConfiguration(networkConfiguration.let(NetworkConfigurationProperty::unwrap))
    }

    /**
     * The network configuration for customer VPC connectivity for the application.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-emrserverless-application.html#cfn-emrserverless-application-networkconfiguration)
     * @param networkConfiguration The network configuration for customer VPC connectivity for the
     * application. 
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("c009b63a19f1c75027791ae63828a9cb2a1fb2218e90e5f53b109f77c0728f1d")
    override
        fun networkConfiguration(networkConfiguration: NetworkConfigurationProperty.Builder.() -> Unit):
        Unit = networkConfiguration(NetworkConfigurationProperty(networkConfiguration))

    /**
     * The EMR release associated with the application.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-emrserverless-application.html#cfn-emrserverless-application-releaselabel)
     * @param releaseLabel The EMR release associated with the application. 
     */
    override fun releaseLabel(releaseLabel: String) {
      cdkBuilder.releaseLabel(releaseLabel)
    }

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
     * The
     * [Configuration](https://docs.aws.amazon.com/emr-serverless/latest/APIReference/API_Configuration.html)
     * specifications of an application. Each configuration consists of a classification and
     * properties. You use this parameter when creating or updating an application. To see the
     * runtimeConfiguration object of an application, run the
     * [GetApplication](https://docs.aws.amazon.com/emr-serverless/latest/APIReference/API_GetApplication.html)
     * API operation.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-emrserverless-application.html#cfn-emrserverless-application-runtimeconfiguration)
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
     * The
     * [Configuration](https://docs.aws.amazon.com/emr-serverless/latest/APIReference/API_Configuration.html)
     * specifications of an application. Each configuration consists of a classification and
     * properties. You use this parameter when creating or updating an application. To see the
     * runtimeConfiguration object of an application, run the
     * [GetApplication](https://docs.aws.amazon.com/emr-serverless/latest/APIReference/API_GetApplication.html)
     * API operation.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-emrserverless-application.html#cfn-emrserverless-application-runtimeconfiguration)
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
     * The tags assigned to the application.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-emrserverless-application.html#cfn-emrserverless-application-tags)
     * @param tags The tags assigned to the application. 
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    /**
     * The tags assigned to the application.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-emrserverless-application.html#cfn-emrserverless-application-tags)
     * @param tags The tags assigned to the application. 
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    /**
     * The type of application, such as Spark or Hive.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-emrserverless-application.html#cfn-emrserverless-application-type)
     * @param type The type of application, such as Spark or Hive. 
     */
    override fun type(type: String) {
      cdkBuilder.type(type)
    }

    /**
     * The specification applied to each worker type.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-emrserverless-application.html#cfn-emrserverless-application-workertypespecifications)
     * @param workerTypeSpecifications The specification applied to each worker type. 
     */
    override fun workerTypeSpecifications(workerTypeSpecifications: IResolvable) {
      cdkBuilder.workerTypeSpecifications(workerTypeSpecifications.let(IResolvable::unwrap))
    }

    /**
     * The specification applied to each worker type.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-emrserverless-application.html#cfn-emrserverless-application-workertypespecifications)
     * @param workerTypeSpecifications The specification applied to each worker type. 
     */
    override fun workerTypeSpecifications(workerTypeSpecifications: Map<String, Any>) {
      cdkBuilder.workerTypeSpecifications(workerTypeSpecifications)
    }

    public fun build(): software.amazon.awscdk.services.emrserverless.CfnApplication =
        cdkBuilder.build()
  }

  public companion object {
    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnApplication {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnApplication(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.emrserverless.CfnApplication):
        CfnApplication = CfnApplication(cdkObject)

    internal fun unwrap(wrapped: CfnApplication):
        software.amazon.awscdk.services.emrserverless.CfnApplication = wrapped.cdkObject
  }

  public interface AutoStopConfigurationProperty {
    /**
     * If set to true, the Application will automatically stop after being idle.
     *
     * Defaults to true.
     *
     * Default: - true
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-emrserverless-application-autostopconfiguration.html#cfn-emrserverless-application-autostopconfiguration-enabled)
     */
    public fun enabled(): Any? = unwrap(this).getEnabled()

    /**
     * The amount of time [in minutes] to wait before auto stopping the Application when idle.
     *
     * Defaults to 15 minutes.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-emrserverless-application-autostopconfiguration.html#cfn-emrserverless-application-autostopconfiguration-idletimeoutminutes)
     */
    public fun idleTimeoutMinutes(): Number? = unwrap(this).getIdleTimeoutMinutes()

    /**
     * A builder for [AutoStopConfigurationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param enabled If set to true, the Application will automatically stop after being idle.
       * Defaults to true.
       */
      public fun enabled(enabled: Boolean)

      /**
       * @param enabled If set to true, the Application will automatically stop after being idle.
       * Defaults to true.
       */
      public fun enabled(enabled: IResolvable)

      /**
       * @param idleTimeoutMinutes The amount of time [in minutes] to wait before auto stopping the
       * Application when idle.
       * Defaults to 15 minutes.
       */
      public fun idleTimeoutMinutes(idleTimeoutMinutes: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.emrserverless.CfnApplication.AutoStopConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.emrserverless.CfnApplication.AutoStopConfigurationProperty.builder()

      /**
       * @param enabled If set to true, the Application will automatically stop after being idle.
       * Defaults to true.
       */
      override fun enabled(enabled: Boolean) {
        cdkBuilder.enabled(enabled)
      }

      /**
       * @param enabled If set to true, the Application will automatically stop after being idle.
       * Defaults to true.
       */
      override fun enabled(enabled: IResolvable) {
        cdkBuilder.enabled(enabled.let(IResolvable::unwrap))
      }

      /**
       * @param idleTimeoutMinutes The amount of time [in minutes] to wait before auto stopping the
       * Application when idle.
       * Defaults to 15 minutes.
       */
      override fun idleTimeoutMinutes(idleTimeoutMinutes: Number) {
        cdkBuilder.idleTimeoutMinutes(idleTimeoutMinutes)
      }

      public fun build():
          software.amazon.awscdk.services.emrserverless.CfnApplication.AutoStopConfigurationProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.emrserverless.CfnApplication.AutoStopConfigurationProperty,
    ) : CdkObject(cdkObject), AutoStopConfigurationProperty {
      /**
       * If set to true, the Application will automatically stop after being idle.
       *
       * Defaults to true.
       *
       * Default: - true
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-emrserverless-application-autostopconfiguration.html#cfn-emrserverless-application-autostopconfiguration-enabled)
       */
      override fun enabled(): Any? = unwrap(this).getEnabled()

      /**
       * The amount of time [in minutes] to wait before auto stopping the Application when idle.
       *
       * Defaults to 15 minutes.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-emrserverless-application-autostopconfiguration.html#cfn-emrserverless-application-autostopconfiguration-idletimeoutminutes)
       */
      override fun idleTimeoutMinutes(): Number? = unwrap(this).getIdleTimeoutMinutes()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): AutoStopConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.emrserverless.CfnApplication.AutoStopConfigurationProperty):
          AutoStopConfigurationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: AutoStopConfigurationProperty):
          software.amazon.awscdk.services.emrserverless.CfnApplication.AutoStopConfigurationProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.emrserverless.CfnApplication.AutoStopConfigurationProperty
    }
  }

  public interface MonitoringConfigurationProperty {
    /**
     * The Amazon CloudWatch configuration for monitoring logs.
     *
     * You can configure your jobs to send log information to CloudWatch .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-emrserverless-application-monitoringconfiguration.html#cfn-emrserverless-application-monitoringconfiguration-cloudwatchloggingconfiguration)
     */
    public fun cloudWatchLoggingConfiguration(): Any? =
        unwrap(this).getCloudWatchLoggingConfiguration()

    /**
     * The managed log persistence configuration for a job run.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-emrserverless-application-monitoringconfiguration.html#cfn-emrserverless-application-monitoringconfiguration-managedpersistencemonitoringconfiguration)
     */
    public fun managedPersistenceMonitoringConfiguration(): Any? =
        unwrap(this).getManagedPersistenceMonitoringConfiguration()

    /**
     * The Amazon S3 configuration for monitoring log publishing.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-emrserverless-application-monitoringconfiguration.html#cfn-emrserverless-application-monitoringconfiguration-s3monitoringconfiguration)
     */
    public fun s3MonitoringConfiguration(): Any? = unwrap(this).getS3MonitoringConfiguration()

    /**
     * A builder for [MonitoringConfigurationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param cloudWatchLoggingConfiguration The Amazon CloudWatch configuration for monitoring
       * logs.
       * You can configure your jobs to send log information to CloudWatch .
       */
      public fun cloudWatchLoggingConfiguration(cloudWatchLoggingConfiguration: IResolvable)

      /**
       * @param cloudWatchLoggingConfiguration The Amazon CloudWatch configuration for monitoring
       * logs.
       * You can configure your jobs to send log information to CloudWatch .
       */
      public
          fun cloudWatchLoggingConfiguration(cloudWatchLoggingConfiguration: CloudWatchLoggingConfigurationProperty)

      /**
       * @param cloudWatchLoggingConfiguration The Amazon CloudWatch configuration for monitoring
       * logs.
       * You can configure your jobs to send log information to CloudWatch .
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("ad1153ab61aa5057aecd5d7cafa7e097b24d047ba2769ca788886319ec68472f")
      public
          fun cloudWatchLoggingConfiguration(cloudWatchLoggingConfiguration: CloudWatchLoggingConfigurationProperty.Builder.() -> Unit)

      /**
       * @param managedPersistenceMonitoringConfiguration The managed log persistence configuration
       * for a job run.
       */
      public
          fun managedPersistenceMonitoringConfiguration(managedPersistenceMonitoringConfiguration: IResolvable)

      /**
       * @param managedPersistenceMonitoringConfiguration The managed log persistence configuration
       * for a job run.
       */
      public
          fun managedPersistenceMonitoringConfiguration(managedPersistenceMonitoringConfiguration: ManagedPersistenceMonitoringConfigurationProperty)

      /**
       * @param managedPersistenceMonitoringConfiguration The managed log persistence configuration
       * for a job run.
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("bf88f1af2e44e51488e14d43737bb7f0119c63c83cdbc1fccbd5493652d82ad4")
      public
          fun managedPersistenceMonitoringConfiguration(managedPersistenceMonitoringConfiguration: ManagedPersistenceMonitoringConfigurationProperty.Builder.() -> Unit)

      /**
       * @param s3MonitoringConfiguration The Amazon S3 configuration for monitoring log publishing.
       */
      public fun s3MonitoringConfiguration(s3MonitoringConfiguration: IResolvable)

      /**
       * @param s3MonitoringConfiguration The Amazon S3 configuration for monitoring log publishing.
       */
      public
          fun s3MonitoringConfiguration(s3MonitoringConfiguration: S3MonitoringConfigurationProperty)

      /**
       * @param s3MonitoringConfiguration The Amazon S3 configuration for monitoring log publishing.
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("51e2ce2ff6b1aa9a20811f234f00a3bfd3472a639d524b2a3c765f488d3ab36b")
      public
          fun s3MonitoringConfiguration(s3MonitoringConfiguration: S3MonitoringConfigurationProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.emrserverless.CfnApplication.MonitoringConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.emrserverless.CfnApplication.MonitoringConfigurationProperty.builder()

      /**
       * @param cloudWatchLoggingConfiguration The Amazon CloudWatch configuration for monitoring
       * logs.
       * You can configure your jobs to send log information to CloudWatch .
       */
      override fun cloudWatchLoggingConfiguration(cloudWatchLoggingConfiguration: IResolvable) {
        cdkBuilder.cloudWatchLoggingConfiguration(cloudWatchLoggingConfiguration.let(IResolvable::unwrap))
      }

      /**
       * @param cloudWatchLoggingConfiguration The Amazon CloudWatch configuration for monitoring
       * logs.
       * You can configure your jobs to send log information to CloudWatch .
       */
      override
          fun cloudWatchLoggingConfiguration(cloudWatchLoggingConfiguration: CloudWatchLoggingConfigurationProperty) {
        cdkBuilder.cloudWatchLoggingConfiguration(cloudWatchLoggingConfiguration.let(CloudWatchLoggingConfigurationProperty::unwrap))
      }

      /**
       * @param cloudWatchLoggingConfiguration The Amazon CloudWatch configuration for monitoring
       * logs.
       * You can configure your jobs to send log information to CloudWatch .
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("ad1153ab61aa5057aecd5d7cafa7e097b24d047ba2769ca788886319ec68472f")
      override
          fun cloudWatchLoggingConfiguration(cloudWatchLoggingConfiguration: CloudWatchLoggingConfigurationProperty.Builder.() -> Unit):
          Unit =
          cloudWatchLoggingConfiguration(CloudWatchLoggingConfigurationProperty(cloudWatchLoggingConfiguration))

      /**
       * @param managedPersistenceMonitoringConfiguration The managed log persistence configuration
       * for a job run.
       */
      override
          fun managedPersistenceMonitoringConfiguration(managedPersistenceMonitoringConfiguration: IResolvable) {
        cdkBuilder.managedPersistenceMonitoringConfiguration(managedPersistenceMonitoringConfiguration.let(IResolvable::unwrap))
      }

      /**
       * @param managedPersistenceMonitoringConfiguration The managed log persistence configuration
       * for a job run.
       */
      override
          fun managedPersistenceMonitoringConfiguration(managedPersistenceMonitoringConfiguration: ManagedPersistenceMonitoringConfigurationProperty) {
        cdkBuilder.managedPersistenceMonitoringConfiguration(managedPersistenceMonitoringConfiguration.let(ManagedPersistenceMonitoringConfigurationProperty::unwrap))
      }

      /**
       * @param managedPersistenceMonitoringConfiguration The managed log persistence configuration
       * for a job run.
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("bf88f1af2e44e51488e14d43737bb7f0119c63c83cdbc1fccbd5493652d82ad4")
      override
          fun managedPersistenceMonitoringConfiguration(managedPersistenceMonitoringConfiguration: ManagedPersistenceMonitoringConfigurationProperty.Builder.() -> Unit):
          Unit =
          managedPersistenceMonitoringConfiguration(ManagedPersistenceMonitoringConfigurationProperty(managedPersistenceMonitoringConfiguration))

      /**
       * @param s3MonitoringConfiguration The Amazon S3 configuration for monitoring log publishing.
       */
      override fun s3MonitoringConfiguration(s3MonitoringConfiguration: IResolvable) {
        cdkBuilder.s3MonitoringConfiguration(s3MonitoringConfiguration.let(IResolvable::unwrap))
      }

      /**
       * @param s3MonitoringConfiguration The Amazon S3 configuration for monitoring log publishing.
       */
      override
          fun s3MonitoringConfiguration(s3MonitoringConfiguration: S3MonitoringConfigurationProperty) {
        cdkBuilder.s3MonitoringConfiguration(s3MonitoringConfiguration.let(S3MonitoringConfigurationProperty::unwrap))
      }

      /**
       * @param s3MonitoringConfiguration The Amazon S3 configuration for monitoring log publishing.
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("51e2ce2ff6b1aa9a20811f234f00a3bfd3472a639d524b2a3c765f488d3ab36b")
      override
          fun s3MonitoringConfiguration(s3MonitoringConfiguration: S3MonitoringConfigurationProperty.Builder.() -> Unit):
          Unit =
          s3MonitoringConfiguration(S3MonitoringConfigurationProperty(s3MonitoringConfiguration))

      public fun build():
          software.amazon.awscdk.services.emrserverless.CfnApplication.MonitoringConfigurationProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.emrserverless.CfnApplication.MonitoringConfigurationProperty,
    ) : CdkObject(cdkObject), MonitoringConfigurationProperty {
      /**
       * The Amazon CloudWatch configuration for monitoring logs.
       *
       * You can configure your jobs to send log information to CloudWatch .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-emrserverless-application-monitoringconfiguration.html#cfn-emrserverless-application-monitoringconfiguration-cloudwatchloggingconfiguration)
       */
      override fun cloudWatchLoggingConfiguration(): Any? =
          unwrap(this).getCloudWatchLoggingConfiguration()

      /**
       * The managed log persistence configuration for a job run.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-emrserverless-application-monitoringconfiguration.html#cfn-emrserverless-application-monitoringconfiguration-managedpersistencemonitoringconfiguration)
       */
      override fun managedPersistenceMonitoringConfiguration(): Any? =
          unwrap(this).getManagedPersistenceMonitoringConfiguration()

      /**
       * The Amazon S3 configuration for monitoring log publishing.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-emrserverless-application-monitoringconfiguration.html#cfn-emrserverless-application-monitoringconfiguration-s3monitoringconfiguration)
       */
      override fun s3MonitoringConfiguration(): Any? = unwrap(this).getS3MonitoringConfiguration()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): MonitoringConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.emrserverless.CfnApplication.MonitoringConfigurationProperty):
          MonitoringConfigurationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: MonitoringConfigurationProperty):
          software.amazon.awscdk.services.emrserverless.CfnApplication.MonitoringConfigurationProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.emrserverless.CfnApplication.MonitoringConfigurationProperty
    }
  }

  public interface MaximumAllowedResourcesProperty {
    /**
     * The maximum allowed CPU for an application.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-emrserverless-application-maximumallowedresources.html#cfn-emrserverless-application-maximumallowedresources-cpu)
     */
    public fun cpu(): String

    /**
     * The maximum allowed disk for an application.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-emrserverless-application-maximumallowedresources.html#cfn-emrserverless-application-maximumallowedresources-disk)
     */
    public fun disk(): String? = unwrap(this).getDisk()

    /**
     * The maximum allowed resources for an application.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-emrserverless-application-maximumallowedresources.html#cfn-emrserverless-application-maximumallowedresources-memory)
     */
    public fun memory(): String

    /**
     * A builder for [MaximumAllowedResourcesProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param cpu The maximum allowed CPU for an application. 
       */
      public fun cpu(cpu: String)

      /**
       * @param disk The maximum allowed disk for an application.
       */
      public fun disk(disk: String)

      /**
       * @param memory The maximum allowed resources for an application. 
       */
      public fun memory(memory: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.emrserverless.CfnApplication.MaximumAllowedResourcesProperty.Builder
          =
          software.amazon.awscdk.services.emrserverless.CfnApplication.MaximumAllowedResourcesProperty.builder()

      /**
       * @param cpu The maximum allowed CPU for an application. 
       */
      override fun cpu(cpu: String) {
        cdkBuilder.cpu(cpu)
      }

      /**
       * @param disk The maximum allowed disk for an application.
       */
      override fun disk(disk: String) {
        cdkBuilder.disk(disk)
      }

      /**
       * @param memory The maximum allowed resources for an application. 
       */
      override fun memory(memory: String) {
        cdkBuilder.memory(memory)
      }

      public fun build():
          software.amazon.awscdk.services.emrserverless.CfnApplication.MaximumAllowedResourcesProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.emrserverless.CfnApplication.MaximumAllowedResourcesProperty,
    ) : CdkObject(cdkObject), MaximumAllowedResourcesProperty {
      /**
       * The maximum allowed CPU for an application.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-emrserverless-application-maximumallowedresources.html#cfn-emrserverless-application-maximumallowedresources-cpu)
       */
      override fun cpu(): String = unwrap(this).getCpu()

      /**
       * The maximum allowed disk for an application.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-emrserverless-application-maximumallowedresources.html#cfn-emrserverless-application-maximumallowedresources-disk)
       */
      override fun disk(): String? = unwrap(this).getDisk()

      /**
       * The maximum allowed resources for an application.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-emrserverless-application-maximumallowedresources.html#cfn-emrserverless-application-maximumallowedresources-memory)
       */
      override fun memory(): String = unwrap(this).getMemory()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): MaximumAllowedResourcesProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.emrserverless.CfnApplication.MaximumAllowedResourcesProperty):
          MaximumAllowedResourcesProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: MaximumAllowedResourcesProperty):
          software.amazon.awscdk.services.emrserverless.CfnApplication.MaximumAllowedResourcesProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.emrserverless.CfnApplication.MaximumAllowedResourcesProperty
    }
  }

  public interface CloudWatchLoggingConfigurationProperty {
    /**
     * Enables CloudWatch logging.
     *
     * Default: - false
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-emrserverless-application-cloudwatchloggingconfiguration.html#cfn-emrserverless-application-cloudwatchloggingconfiguration-enabled)
     */
    public fun enabled(): Any? = unwrap(this).getEnabled()

    /**
     * The AWS Key Management Service (KMS) key ARN to encrypt the logs that you store in CloudWatch
     * Logs .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-emrserverless-application-cloudwatchloggingconfiguration.html#cfn-emrserverless-application-cloudwatchloggingconfiguration-encryptionkeyarn)
     */
    public fun encryptionKeyArn(): String? = unwrap(this).getEncryptionKeyArn()

    /**
     * The name of the log group in Amazon CloudWatch Logs where you want to publish your logs.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-emrserverless-application-cloudwatchloggingconfiguration.html#cfn-emrserverless-application-cloudwatchloggingconfiguration-loggroupname)
     */
    public fun logGroupName(): String? = unwrap(this).getLogGroupName()

    /**
     * Prefix for the CloudWatch log stream name.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-emrserverless-application-cloudwatchloggingconfiguration.html#cfn-emrserverless-application-cloudwatchloggingconfiguration-logstreamnameprefix)
     */
    public fun logStreamNamePrefix(): String? = unwrap(this).getLogStreamNamePrefix()

    /**
     * The specific log-streams which need to be uploaded to CloudWatch.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-emrserverless-application-cloudwatchloggingconfiguration.html#cfn-emrserverless-application-cloudwatchloggingconfiguration-logtypemap)
     */
    public fun logTypeMap(): Any? = unwrap(this).getLogTypeMap()

    /**
     * A builder for [CloudWatchLoggingConfigurationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param enabled Enables CloudWatch logging.
       */
      public fun enabled(enabled: Boolean)

      /**
       * @param enabled Enables CloudWatch logging.
       */
      public fun enabled(enabled: IResolvable)

      /**
       * @param encryptionKeyArn The AWS Key Management Service (KMS) key ARN to encrypt the logs
       * that you store in CloudWatch Logs .
       */
      public fun encryptionKeyArn(encryptionKeyArn: String)

      /**
       * @param logGroupName The name of the log group in Amazon CloudWatch Logs where you want to
       * publish your logs.
       */
      public fun logGroupName(logGroupName: String)

      /**
       * @param logStreamNamePrefix Prefix for the CloudWatch log stream name.
       */
      public fun logStreamNamePrefix(logStreamNamePrefix: String)

      /**
       * @param logTypeMap The specific log-streams which need to be uploaded to CloudWatch.
       */
      public fun logTypeMap(logTypeMap: IResolvable)

      /**
       * @param logTypeMap The specific log-streams which need to be uploaded to CloudWatch.
       */
      public fun logTypeMap(logTypeMap: List<Any>)

      /**
       * @param logTypeMap The specific log-streams which need to be uploaded to CloudWatch.
       */
      public fun logTypeMap(vararg logTypeMap: Any)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.emrserverless.CfnApplication.CloudWatchLoggingConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.emrserverless.CfnApplication.CloudWatchLoggingConfigurationProperty.builder()

      /**
       * @param enabled Enables CloudWatch logging.
       */
      override fun enabled(enabled: Boolean) {
        cdkBuilder.enabled(enabled)
      }

      /**
       * @param enabled Enables CloudWatch logging.
       */
      override fun enabled(enabled: IResolvable) {
        cdkBuilder.enabled(enabled.let(IResolvable::unwrap))
      }

      /**
       * @param encryptionKeyArn The AWS Key Management Service (KMS) key ARN to encrypt the logs
       * that you store in CloudWatch Logs .
       */
      override fun encryptionKeyArn(encryptionKeyArn: String) {
        cdkBuilder.encryptionKeyArn(encryptionKeyArn)
      }

      /**
       * @param logGroupName The name of the log group in Amazon CloudWatch Logs where you want to
       * publish your logs.
       */
      override fun logGroupName(logGroupName: String) {
        cdkBuilder.logGroupName(logGroupName)
      }

      /**
       * @param logStreamNamePrefix Prefix for the CloudWatch log stream name.
       */
      override fun logStreamNamePrefix(logStreamNamePrefix: String) {
        cdkBuilder.logStreamNamePrefix(logStreamNamePrefix)
      }

      /**
       * @param logTypeMap The specific log-streams which need to be uploaded to CloudWatch.
       */
      override fun logTypeMap(logTypeMap: IResolvable) {
        cdkBuilder.logTypeMap(logTypeMap.let(IResolvable::unwrap))
      }

      /**
       * @param logTypeMap The specific log-streams which need to be uploaded to CloudWatch.
       */
      override fun logTypeMap(logTypeMap: List<Any>) {
        cdkBuilder.logTypeMap(logTypeMap)
      }

      /**
       * @param logTypeMap The specific log-streams which need to be uploaded to CloudWatch.
       */
      override fun logTypeMap(vararg logTypeMap: Any): Unit = logTypeMap(logTypeMap.toList())

      public fun build():
          software.amazon.awscdk.services.emrserverless.CfnApplication.CloudWatchLoggingConfigurationProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.emrserverless.CfnApplication.CloudWatchLoggingConfigurationProperty,
    ) : CdkObject(cdkObject), CloudWatchLoggingConfigurationProperty {
      /**
       * Enables CloudWatch logging.
       *
       * Default: - false
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-emrserverless-application-cloudwatchloggingconfiguration.html#cfn-emrserverless-application-cloudwatchloggingconfiguration-enabled)
       */
      override fun enabled(): Any? = unwrap(this).getEnabled()

      /**
       * The AWS Key Management Service (KMS) key ARN to encrypt the logs that you store in
       * CloudWatch Logs .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-emrserverless-application-cloudwatchloggingconfiguration.html#cfn-emrserverless-application-cloudwatchloggingconfiguration-encryptionkeyarn)
       */
      override fun encryptionKeyArn(): String? = unwrap(this).getEncryptionKeyArn()

      /**
       * The name of the log group in Amazon CloudWatch Logs where you want to publish your logs.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-emrserverless-application-cloudwatchloggingconfiguration.html#cfn-emrserverless-application-cloudwatchloggingconfiguration-loggroupname)
       */
      override fun logGroupName(): String? = unwrap(this).getLogGroupName()

      /**
       * Prefix for the CloudWatch log stream name.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-emrserverless-application-cloudwatchloggingconfiguration.html#cfn-emrserverless-application-cloudwatchloggingconfiguration-logstreamnameprefix)
       */
      override fun logStreamNamePrefix(): String? = unwrap(this).getLogStreamNamePrefix()

      /**
       * The specific log-streams which need to be uploaded to CloudWatch.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-emrserverless-application-cloudwatchloggingconfiguration.html#cfn-emrserverless-application-cloudwatchloggingconfiguration-logtypemap)
       */
      override fun logTypeMap(): Any? = unwrap(this).getLogTypeMap()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          CloudWatchLoggingConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.emrserverless.CfnApplication.CloudWatchLoggingConfigurationProperty):
          CloudWatchLoggingConfigurationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: CloudWatchLoggingConfigurationProperty):
          software.amazon.awscdk.services.emrserverless.CfnApplication.CloudWatchLoggingConfigurationProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.emrserverless.CfnApplication.CloudWatchLoggingConfigurationProperty
    }
  }

  public interface NetworkConfigurationProperty {
    /**
     * The array of security group Ids for customer VPC connectivity.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-emrserverless-application-networkconfiguration.html#cfn-emrserverless-application-networkconfiguration-securitygroupids)
     */
    public fun securityGroupIds(): List<String> = unwrap(this).getSecurityGroupIds() ?: emptyList()

    /**
     * The array of subnet Ids for customer VPC connectivity.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-emrserverless-application-networkconfiguration.html#cfn-emrserverless-application-networkconfiguration-subnetids)
     */
    public fun subnetIds(): List<String> = unwrap(this).getSubnetIds() ?: emptyList()

    /**
     * A builder for [NetworkConfigurationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param securityGroupIds The array of security group Ids for customer VPC connectivity.
       */
      public fun securityGroupIds(securityGroupIds: List<String>)

      /**
       * @param securityGroupIds The array of security group Ids for customer VPC connectivity.
       */
      public fun securityGroupIds(vararg securityGroupIds: String)

      /**
       * @param subnetIds The array of subnet Ids for customer VPC connectivity.
       */
      public fun subnetIds(subnetIds: List<String>)

      /**
       * @param subnetIds The array of subnet Ids for customer VPC connectivity.
       */
      public fun subnetIds(vararg subnetIds: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.emrserverless.CfnApplication.NetworkConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.emrserverless.CfnApplication.NetworkConfigurationProperty.builder()

      /**
       * @param securityGroupIds The array of security group Ids for customer VPC connectivity.
       */
      override fun securityGroupIds(securityGroupIds: List<String>) {
        cdkBuilder.securityGroupIds(securityGroupIds)
      }

      /**
       * @param securityGroupIds The array of security group Ids for customer VPC connectivity.
       */
      override fun securityGroupIds(vararg securityGroupIds: String): Unit =
          securityGroupIds(securityGroupIds.toList())

      /**
       * @param subnetIds The array of subnet Ids for customer VPC connectivity.
       */
      override fun subnetIds(subnetIds: List<String>) {
        cdkBuilder.subnetIds(subnetIds)
      }

      /**
       * @param subnetIds The array of subnet Ids for customer VPC connectivity.
       */
      override fun subnetIds(vararg subnetIds: String): Unit = subnetIds(subnetIds.toList())

      public fun build():
          software.amazon.awscdk.services.emrserverless.CfnApplication.NetworkConfigurationProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.emrserverless.CfnApplication.NetworkConfigurationProperty,
    ) : CdkObject(cdkObject), NetworkConfigurationProperty {
      /**
       * The array of security group Ids for customer VPC connectivity.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-emrserverless-application-networkconfiguration.html#cfn-emrserverless-application-networkconfiguration-securitygroupids)
       */
      override fun securityGroupIds(): List<String> = unwrap(this).getSecurityGroupIds() ?:
          emptyList()

      /**
       * The array of subnet Ids for customer VPC connectivity.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-emrserverless-application-networkconfiguration.html#cfn-emrserverless-application-networkconfiguration-subnetids)
       */
      override fun subnetIds(): List<String> = unwrap(this).getSubnetIds() ?: emptyList()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): NetworkConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.emrserverless.CfnApplication.NetworkConfigurationProperty):
          NetworkConfigurationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: NetworkConfigurationProperty):
          software.amazon.awscdk.services.emrserverless.CfnApplication.NetworkConfigurationProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.emrserverless.CfnApplication.NetworkConfigurationProperty
    }
  }

  public interface ConfigurationObjectProperty {
    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-emrserverless-application-configurationobject.html#cfn-emrserverless-application-configurationobject-classification)
     */
    public fun classification(): String

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-emrserverless-application-configurationobject.html#cfn-emrserverless-application-configurationobject-configurations)
     */
    public fun configurations(): Any? = unwrap(this).getConfigurations()

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-emrserverless-application-configurationobject.html#cfn-emrserverless-application-configurationobject-properties)
     */
    public fun properties(): Any? = unwrap(this).getProperties()

    /**
     * A builder for [ConfigurationObjectProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param classification the value to be set. 
       */
      public fun classification(classification: String)

      /**
       * @param configurations the value to be set.
       */
      public fun configurations(configurations: IResolvable)

      /**
       * @param configurations the value to be set.
       */
      public fun configurations(configurations: List<Any>)

      /**
       * @param configurations the value to be set.
       */
      public fun configurations(vararg configurations: Any)

      /**
       * @param properties the value to be set.
       */
      public fun properties(properties: IResolvable)

      /**
       * @param properties the value to be set.
       */
      public fun properties(properties: Map<String, String>)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.emrserverless.CfnApplication.ConfigurationObjectProperty.Builder
          =
          software.amazon.awscdk.services.emrserverless.CfnApplication.ConfigurationObjectProperty.builder()

      /**
       * @param classification the value to be set. 
       */
      override fun classification(classification: String) {
        cdkBuilder.classification(classification)
      }

      /**
       * @param configurations the value to be set.
       */
      override fun configurations(configurations: IResolvable) {
        cdkBuilder.configurations(configurations.let(IResolvable::unwrap))
      }

      /**
       * @param configurations the value to be set.
       */
      override fun configurations(configurations: List<Any>) {
        cdkBuilder.configurations(configurations)
      }

      /**
       * @param configurations the value to be set.
       */
      override fun configurations(vararg configurations: Any): Unit =
          configurations(configurations.toList())

      /**
       * @param properties the value to be set.
       */
      override fun properties(properties: IResolvable) {
        cdkBuilder.properties(properties.let(IResolvable::unwrap))
      }

      /**
       * @param properties the value to be set.
       */
      override fun properties(properties: Map<String, String>) {
        cdkBuilder.properties(properties)
      }

      public fun build():
          software.amazon.awscdk.services.emrserverless.CfnApplication.ConfigurationObjectProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.emrserverless.CfnApplication.ConfigurationObjectProperty,
    ) : CdkObject(cdkObject), ConfigurationObjectProperty {
      /**
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-emrserverless-application-configurationobject.html#cfn-emrserverless-application-configurationobject-classification)
       */
      override fun classification(): String = unwrap(this).getClassification()

      /**
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-emrserverless-application-configurationobject.html#cfn-emrserverless-application-configurationobject-configurations)
       */
      override fun configurations(): Any? = unwrap(this).getConfigurations()

      /**
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-emrserverless-application-configurationobject.html#cfn-emrserverless-application-configurationobject-properties)
       */
      override fun properties(): Any? = unwrap(this).getProperties()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): ConfigurationObjectProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.emrserverless.CfnApplication.ConfigurationObjectProperty):
          ConfigurationObjectProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ConfigurationObjectProperty):
          software.amazon.awscdk.services.emrserverless.CfnApplication.ConfigurationObjectProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.emrserverless.CfnApplication.ConfigurationObjectProperty
    }
  }

  public interface WorkerConfigurationProperty {
    /**
     * Per worker CPU resource.
     *
     * vCPU is the only supported unit and specifying vCPU is optional.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-emrserverless-application-workerconfiguration.html#cfn-emrserverless-application-workerconfiguration-cpu)
     */
    public fun cpu(): String

    /**
     * Per worker Disk resource.
     *
     * GB is the only supported unit and specifying GB is optional
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-emrserverless-application-workerconfiguration.html#cfn-emrserverless-application-workerconfiguration-disk)
     */
    public fun disk(): String? = unwrap(this).getDisk()

    /**
     * Per worker memory resource.
     *
     * GB is the only supported unit and specifying GB is optional.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-emrserverless-application-workerconfiguration.html#cfn-emrserverless-application-workerconfiguration-memory)
     */
    public fun memory(): String

    /**
     * A builder for [WorkerConfigurationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param cpu Per worker CPU resource. 
       * vCPU is the only supported unit and specifying vCPU is optional.
       */
      public fun cpu(cpu: String)

      /**
       * @param disk Per worker Disk resource.
       * GB is the only supported unit and specifying GB is optional
       */
      public fun disk(disk: String)

      /**
       * @param memory Per worker memory resource. 
       * GB is the only supported unit and specifying GB is optional.
       */
      public fun memory(memory: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.emrserverless.CfnApplication.WorkerConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.emrserverless.CfnApplication.WorkerConfigurationProperty.builder()

      /**
       * @param cpu Per worker CPU resource. 
       * vCPU is the only supported unit and specifying vCPU is optional.
       */
      override fun cpu(cpu: String) {
        cdkBuilder.cpu(cpu)
      }

      /**
       * @param disk Per worker Disk resource.
       * GB is the only supported unit and specifying GB is optional
       */
      override fun disk(disk: String) {
        cdkBuilder.disk(disk)
      }

      /**
       * @param memory Per worker memory resource. 
       * GB is the only supported unit and specifying GB is optional.
       */
      override fun memory(memory: String) {
        cdkBuilder.memory(memory)
      }

      public fun build():
          software.amazon.awscdk.services.emrserverless.CfnApplication.WorkerConfigurationProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.emrserverless.CfnApplication.WorkerConfigurationProperty,
    ) : CdkObject(cdkObject), WorkerConfigurationProperty {
      /**
       * Per worker CPU resource.
       *
       * vCPU is the only supported unit and specifying vCPU is optional.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-emrserverless-application-workerconfiguration.html#cfn-emrserverless-application-workerconfiguration-cpu)
       */
      override fun cpu(): String = unwrap(this).getCpu()

      /**
       * Per worker Disk resource.
       *
       * GB is the only supported unit and specifying GB is optional
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-emrserverless-application-workerconfiguration.html#cfn-emrserverless-application-workerconfiguration-disk)
       */
      override fun disk(): String? = unwrap(this).getDisk()

      /**
       * Per worker memory resource.
       *
       * GB is the only supported unit and specifying GB is optional.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-emrserverless-application-workerconfiguration.html#cfn-emrserverless-application-workerconfiguration-memory)
       */
      override fun memory(): String = unwrap(this).getMemory()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): WorkerConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.emrserverless.CfnApplication.WorkerConfigurationProperty):
          WorkerConfigurationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: WorkerConfigurationProperty):
          software.amazon.awscdk.services.emrserverless.CfnApplication.WorkerConfigurationProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.emrserverless.CfnApplication.WorkerConfigurationProperty
    }
  }

  public interface ImageConfigurationInputProperty {
    /**
     * The URI of an image in the Amazon ECR registry.
     *
     * This field is required when you create a new application. If you leave this field blank in an
     * update, Amazon EMR will remove the image configuration.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-emrserverless-application-imageconfigurationinput.html#cfn-emrserverless-application-imageconfigurationinput-imageuri)
     */
    public fun imageUri(): String? = unwrap(this).getImageUri()

    /**
     * A builder for [ImageConfigurationInputProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param imageUri The URI of an image in the Amazon ECR registry.
       * This field is required when you create a new application. If you leave this field blank in
       * an update, Amazon EMR will remove the image configuration.
       */
      public fun imageUri(imageUri: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.emrserverless.CfnApplication.ImageConfigurationInputProperty.Builder
          =
          software.amazon.awscdk.services.emrserverless.CfnApplication.ImageConfigurationInputProperty.builder()

      /**
       * @param imageUri The URI of an image in the Amazon ECR registry.
       * This field is required when you create a new application. If you leave this field blank in
       * an update, Amazon EMR will remove the image configuration.
       */
      override fun imageUri(imageUri: String) {
        cdkBuilder.imageUri(imageUri)
      }

      public fun build():
          software.amazon.awscdk.services.emrserverless.CfnApplication.ImageConfigurationInputProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.emrserverless.CfnApplication.ImageConfigurationInputProperty,
    ) : CdkObject(cdkObject), ImageConfigurationInputProperty {
      /**
       * The URI of an image in the Amazon ECR registry.
       *
       * This field is required when you create a new application. If you leave this field blank in
       * an update, Amazon EMR will remove the image configuration.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-emrserverless-application-imageconfigurationinput.html#cfn-emrserverless-application-imageconfigurationinput-imageuri)
       */
      override fun imageUri(): String? = unwrap(this).getImageUri()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): ImageConfigurationInputProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.emrserverless.CfnApplication.ImageConfigurationInputProperty):
          ImageConfigurationInputProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ImageConfigurationInputProperty):
          software.amazon.awscdk.services.emrserverless.CfnApplication.ImageConfigurationInputProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.emrserverless.CfnApplication.ImageConfigurationInputProperty
    }
  }

  public interface InitialCapacityConfigKeyValuePairProperty {
    /**
     * Worker type for an analytics framework.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-emrserverless-application-initialcapacityconfigkeyvaluepair.html#cfn-emrserverless-application-initialcapacityconfigkeyvaluepair-key)
     */
    public fun key(): String

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-emrserverless-application-initialcapacityconfigkeyvaluepair.html#cfn-emrserverless-application-initialcapacityconfigkeyvaluepair-value)
     */
    public fun `value`(): Any

    /**
     * A builder for [InitialCapacityConfigKeyValuePairProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param key Worker type for an analytics framework. 
       */
      public fun key(key: String)

      /**
       * @param value the value to be set. 
       */
      public fun `value`(`value`: IResolvable)

      /**
       * @param value the value to be set. 
       */
      public fun `value`(`value`: InitialCapacityConfigProperty)

      /**
       * @param value the value to be set. 
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("1b966ae256b45ece3e93a3e47a1920499c7fa2b401640cb73b25823a42111ae9")
      public fun `value`(`value`: InitialCapacityConfigProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.emrserverless.CfnApplication.InitialCapacityConfigKeyValuePairProperty.Builder
          =
          software.amazon.awscdk.services.emrserverless.CfnApplication.InitialCapacityConfigKeyValuePairProperty.builder()

      /**
       * @param key Worker type for an analytics framework. 
       */
      override fun key(key: String) {
        cdkBuilder.key(key)
      }

      /**
       * @param value the value to be set. 
       */
      override fun `value`(`value`: IResolvable) {
        cdkBuilder.`value`(`value`.let(IResolvable::unwrap))
      }

      /**
       * @param value the value to be set. 
       */
      override fun `value`(`value`: InitialCapacityConfigProperty) {
        cdkBuilder.`value`(`value`.let(InitialCapacityConfigProperty::unwrap))
      }

      /**
       * @param value the value to be set. 
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("1b966ae256b45ece3e93a3e47a1920499c7fa2b401640cb73b25823a42111ae9")
      override fun `value`(`value`: InitialCapacityConfigProperty.Builder.() -> Unit): Unit =
          `value`(InitialCapacityConfigProperty(`value`))

      public fun build():
          software.amazon.awscdk.services.emrserverless.CfnApplication.InitialCapacityConfigKeyValuePairProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.emrserverless.CfnApplication.InitialCapacityConfigKeyValuePairProperty,
    ) : CdkObject(cdkObject), InitialCapacityConfigKeyValuePairProperty {
      /**
       * Worker type for an analytics framework.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-emrserverless-application-initialcapacityconfigkeyvaluepair.html#cfn-emrserverless-application-initialcapacityconfigkeyvaluepair-key)
       */
      override fun key(): String = unwrap(this).getKey()

      /**
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-emrserverless-application-initialcapacityconfigkeyvaluepair.html#cfn-emrserverless-application-initialcapacityconfigkeyvaluepair-value)
       */
      override fun `value`(): Any = unwrap(this).getValue()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          InitialCapacityConfigKeyValuePairProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.emrserverless.CfnApplication.InitialCapacityConfigKeyValuePairProperty):
          InitialCapacityConfigKeyValuePairProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: InitialCapacityConfigKeyValuePairProperty):
          software.amazon.awscdk.services.emrserverless.CfnApplication.InitialCapacityConfigKeyValuePairProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.emrserverless.CfnApplication.InitialCapacityConfigKeyValuePairProperty
    }
  }

  public interface InitialCapacityConfigProperty {
    /**
     * The resource configuration of the initial capacity configuration.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-emrserverless-application-initialcapacityconfig.html#cfn-emrserverless-application-initialcapacityconfig-workerconfiguration)
     */
    public fun workerConfiguration(): Any

    /**
     * The number of workers in the initial capacity configuration.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-emrserverless-application-initialcapacityconfig.html#cfn-emrserverless-application-initialcapacityconfig-workercount)
     */
    public fun workerCount(): Number

    /**
     * A builder for [InitialCapacityConfigProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param workerConfiguration The resource configuration of the initial capacity
       * configuration. 
       */
      public fun workerConfiguration(workerConfiguration: IResolvable)

      /**
       * @param workerConfiguration The resource configuration of the initial capacity
       * configuration. 
       */
      public fun workerConfiguration(workerConfiguration: WorkerConfigurationProperty)

      /**
       * @param workerConfiguration The resource configuration of the initial capacity
       * configuration. 
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("1191fb6c21246b6632678432607689a3e8e09fd368cce0ffc797efa1c110db8b")
      public
          fun workerConfiguration(workerConfiguration: WorkerConfigurationProperty.Builder.() -> Unit)

      /**
       * @param workerCount The number of workers in the initial capacity configuration. 
       */
      public fun workerCount(workerCount: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.emrserverless.CfnApplication.InitialCapacityConfigProperty.Builder
          =
          software.amazon.awscdk.services.emrserverless.CfnApplication.InitialCapacityConfigProperty.builder()

      /**
       * @param workerConfiguration The resource configuration of the initial capacity
       * configuration. 
       */
      override fun workerConfiguration(workerConfiguration: IResolvable) {
        cdkBuilder.workerConfiguration(workerConfiguration.let(IResolvable::unwrap))
      }

      /**
       * @param workerConfiguration The resource configuration of the initial capacity
       * configuration. 
       */
      override fun workerConfiguration(workerConfiguration: WorkerConfigurationProperty) {
        cdkBuilder.workerConfiguration(workerConfiguration.let(WorkerConfigurationProperty::unwrap))
      }

      /**
       * @param workerConfiguration The resource configuration of the initial capacity
       * configuration. 
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("1191fb6c21246b6632678432607689a3e8e09fd368cce0ffc797efa1c110db8b")
      override
          fun workerConfiguration(workerConfiguration: WorkerConfigurationProperty.Builder.() -> Unit):
          Unit = workerConfiguration(WorkerConfigurationProperty(workerConfiguration))

      /**
       * @param workerCount The number of workers in the initial capacity configuration. 
       */
      override fun workerCount(workerCount: Number) {
        cdkBuilder.workerCount(workerCount)
      }

      public fun build():
          software.amazon.awscdk.services.emrserverless.CfnApplication.InitialCapacityConfigProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.emrserverless.CfnApplication.InitialCapacityConfigProperty,
    ) : CdkObject(cdkObject), InitialCapacityConfigProperty {
      /**
       * The resource configuration of the initial capacity configuration.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-emrserverless-application-initialcapacityconfig.html#cfn-emrserverless-application-initialcapacityconfig-workerconfiguration)
       */
      override fun workerConfiguration(): Any = unwrap(this).getWorkerConfiguration()

      /**
       * The number of workers in the initial capacity configuration.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-emrserverless-application-initialcapacityconfig.html#cfn-emrserverless-application-initialcapacityconfig-workercount)
       */
      override fun workerCount(): Number = unwrap(this).getWorkerCount()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): InitialCapacityConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.emrserverless.CfnApplication.InitialCapacityConfigProperty):
          InitialCapacityConfigProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: InitialCapacityConfigProperty):
          software.amazon.awscdk.services.emrserverless.CfnApplication.InitialCapacityConfigProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.emrserverless.CfnApplication.InitialCapacityConfigProperty
    }
  }

  public interface S3MonitoringConfigurationProperty {
    /**
     * The KMS key ARN to encrypt the logs published to the given Amazon S3 destination.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-emrserverless-application-s3monitoringconfiguration.html#cfn-emrserverless-application-s3monitoringconfiguration-encryptionkeyarn)
     */
    public fun encryptionKeyArn(): String? = unwrap(this).getEncryptionKeyArn()

    /**
     * The Amazon S3 destination URI for log publishing.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-emrserverless-application-s3monitoringconfiguration.html#cfn-emrserverless-application-s3monitoringconfiguration-loguri)
     */
    public fun logUri(): String? = unwrap(this).getLogUri()

    /**
     * A builder for [S3MonitoringConfigurationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param encryptionKeyArn The KMS key ARN to encrypt the logs published to the given Amazon
       * S3 destination.
       */
      public fun encryptionKeyArn(encryptionKeyArn: String)

      /**
       * @param logUri The Amazon S3 destination URI for log publishing.
       */
      public fun logUri(logUri: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.emrserverless.CfnApplication.S3MonitoringConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.emrserverless.CfnApplication.S3MonitoringConfigurationProperty.builder()

      /**
       * @param encryptionKeyArn The KMS key ARN to encrypt the logs published to the given Amazon
       * S3 destination.
       */
      override fun encryptionKeyArn(encryptionKeyArn: String) {
        cdkBuilder.encryptionKeyArn(encryptionKeyArn)
      }

      /**
       * @param logUri The Amazon S3 destination URI for log publishing.
       */
      override fun logUri(logUri: String) {
        cdkBuilder.logUri(logUri)
      }

      public fun build():
          software.amazon.awscdk.services.emrserverless.CfnApplication.S3MonitoringConfigurationProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.emrserverless.CfnApplication.S3MonitoringConfigurationProperty,
    ) : CdkObject(cdkObject), S3MonitoringConfigurationProperty {
      /**
       * The KMS key ARN to encrypt the logs published to the given Amazon S3 destination.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-emrserverless-application-s3monitoringconfiguration.html#cfn-emrserverless-application-s3monitoringconfiguration-encryptionkeyarn)
       */
      override fun encryptionKeyArn(): String? = unwrap(this).getEncryptionKeyArn()

      /**
       * The Amazon S3 destination URI for log publishing.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-emrserverless-application-s3monitoringconfiguration.html#cfn-emrserverless-application-s3monitoringconfiguration-loguri)
       */
      override fun logUri(): String? = unwrap(this).getLogUri()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          S3MonitoringConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.emrserverless.CfnApplication.S3MonitoringConfigurationProperty):
          S3MonitoringConfigurationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: S3MonitoringConfigurationProperty):
          software.amazon.awscdk.services.emrserverless.CfnApplication.S3MonitoringConfigurationProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.emrserverless.CfnApplication.S3MonitoringConfigurationProperty
    }
  }

  public interface WorkerTypeSpecificationInputProperty {
    /**
     * The image configuration for a worker type.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-emrserverless-application-workertypespecificationinput.html#cfn-emrserverless-application-workertypespecificationinput-imageconfiguration)
     */
    public fun imageConfiguration(): Any? = unwrap(this).getImageConfiguration()

    /**
     * A builder for [WorkerTypeSpecificationInputProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param imageConfiguration The image configuration for a worker type.
       */
      public fun imageConfiguration(imageConfiguration: IResolvable)

      /**
       * @param imageConfiguration The image configuration for a worker type.
       */
      public fun imageConfiguration(imageConfiguration: ImageConfigurationInputProperty)

      /**
       * @param imageConfiguration The image configuration for a worker type.
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("dbfe53c6500fcc361b32ac969288665449377160edc69d9c75529b54801c000d")
      public
          fun imageConfiguration(imageConfiguration: ImageConfigurationInputProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.emrserverless.CfnApplication.WorkerTypeSpecificationInputProperty.Builder
          =
          software.amazon.awscdk.services.emrserverless.CfnApplication.WorkerTypeSpecificationInputProperty.builder()

      /**
       * @param imageConfiguration The image configuration for a worker type.
       */
      override fun imageConfiguration(imageConfiguration: IResolvable) {
        cdkBuilder.imageConfiguration(imageConfiguration.let(IResolvable::unwrap))
      }

      /**
       * @param imageConfiguration The image configuration for a worker type.
       */
      override fun imageConfiguration(imageConfiguration: ImageConfigurationInputProperty) {
        cdkBuilder.imageConfiguration(imageConfiguration.let(ImageConfigurationInputProperty::unwrap))
      }

      /**
       * @param imageConfiguration The image configuration for a worker type.
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("dbfe53c6500fcc361b32ac969288665449377160edc69d9c75529b54801c000d")
      override
          fun imageConfiguration(imageConfiguration: ImageConfigurationInputProperty.Builder.() -> Unit):
          Unit = imageConfiguration(ImageConfigurationInputProperty(imageConfiguration))

      public fun build():
          software.amazon.awscdk.services.emrserverless.CfnApplication.WorkerTypeSpecificationInputProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.emrserverless.CfnApplication.WorkerTypeSpecificationInputProperty,
    ) : CdkObject(cdkObject), WorkerTypeSpecificationInputProperty {
      /**
       * The image configuration for a worker type.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-emrserverless-application-workertypespecificationinput.html#cfn-emrserverless-application-workertypespecificationinput-imageconfiguration)
       */
      override fun imageConfiguration(): Any? = unwrap(this).getImageConfiguration()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          WorkerTypeSpecificationInputProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.emrserverless.CfnApplication.WorkerTypeSpecificationInputProperty):
          WorkerTypeSpecificationInputProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: WorkerTypeSpecificationInputProperty):
          software.amazon.awscdk.services.emrserverless.CfnApplication.WorkerTypeSpecificationInputProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.emrserverless.CfnApplication.WorkerTypeSpecificationInputProperty
    }
  }

  public interface AutoStartConfigurationProperty {
    /**
     * If set to true, the Application will automatically start.
     *
     * Defaults to true.
     *
     * Default: - true
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-emrserverless-application-autostartconfiguration.html#cfn-emrserverless-application-autostartconfiguration-enabled)
     */
    public fun enabled(): Any? = unwrap(this).getEnabled()

    /**
     * A builder for [AutoStartConfigurationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param enabled If set to true, the Application will automatically start.
       * Defaults to true.
       */
      public fun enabled(enabled: Boolean)

      /**
       * @param enabled If set to true, the Application will automatically start.
       * Defaults to true.
       */
      public fun enabled(enabled: IResolvable)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.emrserverless.CfnApplication.AutoStartConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.emrserverless.CfnApplication.AutoStartConfigurationProperty.builder()

      /**
       * @param enabled If set to true, the Application will automatically start.
       * Defaults to true.
       */
      override fun enabled(enabled: Boolean) {
        cdkBuilder.enabled(enabled)
      }

      /**
       * @param enabled If set to true, the Application will automatically start.
       * Defaults to true.
       */
      override fun enabled(enabled: IResolvable) {
        cdkBuilder.enabled(enabled.let(IResolvable::unwrap))
      }

      public fun build():
          software.amazon.awscdk.services.emrserverless.CfnApplication.AutoStartConfigurationProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.emrserverless.CfnApplication.AutoStartConfigurationProperty,
    ) : CdkObject(cdkObject), AutoStartConfigurationProperty {
      /**
       * If set to true, the Application will automatically start.
       *
       * Defaults to true.
       *
       * Default: - true
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-emrserverless-application-autostartconfiguration.html#cfn-emrserverless-application-autostartconfiguration-enabled)
       */
      override fun enabled(): Any? = unwrap(this).getEnabled()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): AutoStartConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.emrserverless.CfnApplication.AutoStartConfigurationProperty):
          AutoStartConfigurationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: AutoStartConfigurationProperty):
          software.amazon.awscdk.services.emrserverless.CfnApplication.AutoStartConfigurationProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.emrserverless.CfnApplication.AutoStartConfigurationProperty
    }
  }

  public interface ManagedPersistenceMonitoringConfigurationProperty {
    /**
     * Enables managed logging and defaults to true.
     *
     * If set to false, managed logging will be turned off.
     *
     * Default: - true
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-emrserverless-application-managedpersistencemonitoringconfiguration.html#cfn-emrserverless-application-managedpersistencemonitoringconfiguration-enabled)
     */
    public fun enabled(): Any? = unwrap(this).getEnabled()

    /**
     * The KMS key ARN to encrypt the logs stored in managed log persistence.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-emrserverless-application-managedpersistencemonitoringconfiguration.html#cfn-emrserverless-application-managedpersistencemonitoringconfiguration-encryptionkeyarn)
     */
    public fun encryptionKeyArn(): String? = unwrap(this).getEncryptionKeyArn()

    /**
     * A builder for [ManagedPersistenceMonitoringConfigurationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param enabled Enables managed logging and defaults to true.
       * If set to false, managed logging will be turned off.
       */
      public fun enabled(enabled: Boolean)

      /**
       * @param enabled Enables managed logging and defaults to true.
       * If set to false, managed logging will be turned off.
       */
      public fun enabled(enabled: IResolvable)

      /**
       * @param encryptionKeyArn The KMS key ARN to encrypt the logs stored in managed log
       * persistence.
       */
      public fun encryptionKeyArn(encryptionKeyArn: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.emrserverless.CfnApplication.ManagedPersistenceMonitoringConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.emrserverless.CfnApplication.ManagedPersistenceMonitoringConfigurationProperty.builder()

      /**
       * @param enabled Enables managed logging and defaults to true.
       * If set to false, managed logging will be turned off.
       */
      override fun enabled(enabled: Boolean) {
        cdkBuilder.enabled(enabled)
      }

      /**
       * @param enabled Enables managed logging and defaults to true.
       * If set to false, managed logging will be turned off.
       */
      override fun enabled(enabled: IResolvable) {
        cdkBuilder.enabled(enabled.let(IResolvable::unwrap))
      }

      /**
       * @param encryptionKeyArn The KMS key ARN to encrypt the logs stored in managed log
       * persistence.
       */
      override fun encryptionKeyArn(encryptionKeyArn: String) {
        cdkBuilder.encryptionKeyArn(encryptionKeyArn)
      }

      public fun build():
          software.amazon.awscdk.services.emrserverless.CfnApplication.ManagedPersistenceMonitoringConfigurationProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.emrserverless.CfnApplication.ManagedPersistenceMonitoringConfigurationProperty,
    ) : CdkObject(cdkObject), ManagedPersistenceMonitoringConfigurationProperty {
      /**
       * Enables managed logging and defaults to true.
       *
       * If set to false, managed logging will be turned off.
       *
       * Default: - true
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-emrserverless-application-managedpersistencemonitoringconfiguration.html#cfn-emrserverless-application-managedpersistencemonitoringconfiguration-enabled)
       */
      override fun enabled(): Any? = unwrap(this).getEnabled()

      /**
       * The KMS key ARN to encrypt the logs stored in managed log persistence.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-emrserverless-application-managedpersistencemonitoringconfiguration.html#cfn-emrserverless-application-managedpersistencemonitoringconfiguration-encryptionkeyarn)
       */
      override fun encryptionKeyArn(): String? = unwrap(this).getEncryptionKeyArn()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          ManagedPersistenceMonitoringConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.emrserverless.CfnApplication.ManagedPersistenceMonitoringConfigurationProperty):
          ManagedPersistenceMonitoringConfigurationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ManagedPersistenceMonitoringConfigurationProperty):
          software.amazon.awscdk.services.emrserverless.CfnApplication.ManagedPersistenceMonitoringConfigurationProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.emrserverless.CfnApplication.ManagedPersistenceMonitoringConfigurationProperty
    }
  }

  public interface LogTypeMapKeyValuePairProperty {
    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-emrserverless-application-logtypemapkeyvaluepair.html#cfn-emrserverless-application-logtypemapkeyvaluepair-key)
     */
    public fun key(): String

    /**
     * List of Applicable values: [STDOUT, STDERR, HIVE_LOG, TEZ_AM, SYSTEM_LOGS].
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-emrserverless-application-logtypemapkeyvaluepair.html#cfn-emrserverless-application-logtypemapkeyvaluepair-value)
     */
    public fun `value`(): List<String>

    /**
     * A builder for [LogTypeMapKeyValuePairProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param key the value to be set. 
       */
      public fun key(key: String)

      /**
       * @param value List of Applicable values: [STDOUT, STDERR, HIVE_LOG, TEZ_AM, SYSTEM_LOGS]. 
       */
      public fun `value`(`value`: List<String>)

      /**
       * @param value List of Applicable values: [STDOUT, STDERR, HIVE_LOG, TEZ_AM, SYSTEM_LOGS]. 
       */
      public fun `value`(vararg `value`: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.emrserverless.CfnApplication.LogTypeMapKeyValuePairProperty.Builder
          =
          software.amazon.awscdk.services.emrserverless.CfnApplication.LogTypeMapKeyValuePairProperty.builder()

      /**
       * @param key the value to be set. 
       */
      override fun key(key: String) {
        cdkBuilder.key(key)
      }

      /**
       * @param value List of Applicable values: [STDOUT, STDERR, HIVE_LOG, TEZ_AM, SYSTEM_LOGS]. 
       */
      override fun `value`(`value`: List<String>) {
        cdkBuilder.`value`(`value`)
      }

      /**
       * @param value List of Applicable values: [STDOUT, STDERR, HIVE_LOG, TEZ_AM, SYSTEM_LOGS]. 
       */
      override fun `value`(vararg `value`: String): Unit = `value`(`value`.toList())

      public fun build():
          software.amazon.awscdk.services.emrserverless.CfnApplication.LogTypeMapKeyValuePairProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.emrserverless.CfnApplication.LogTypeMapKeyValuePairProperty,
    ) : CdkObject(cdkObject), LogTypeMapKeyValuePairProperty {
      /**
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-emrserverless-application-logtypemapkeyvaluepair.html#cfn-emrserverless-application-logtypemapkeyvaluepair-key)
       */
      override fun key(): String = unwrap(this).getKey()

      /**
       * List of Applicable values: [STDOUT, STDERR, HIVE_LOG, TEZ_AM, SYSTEM_LOGS].
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-emrserverless-application-logtypemapkeyvaluepair.html#cfn-emrserverless-application-logtypemapkeyvaluepair-value)
       */
      override fun `value`(): List<String> = unwrap(this).getValue()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): LogTypeMapKeyValuePairProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.emrserverless.CfnApplication.LogTypeMapKeyValuePairProperty):
          LogTypeMapKeyValuePairProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: LogTypeMapKeyValuePairProperty):
          software.amazon.awscdk.services.emrserverless.CfnApplication.LogTypeMapKeyValuePairProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.emrserverless.CfnApplication.LogTypeMapKeyValuePairProperty
    }
  }
}
