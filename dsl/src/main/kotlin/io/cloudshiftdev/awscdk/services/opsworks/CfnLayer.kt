package io.cloudshiftdev.awscdk.services.opsworks

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

public open class CfnLayer internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.opsworks.CfnLayer,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  /**
   *
   */
  public open fun attrId(): String = unwrap(this).getAttrId()

  /**
   * One or more user-defined key-value pairs to be added to the stack attributes.
   */
  public open fun attributes(): Any? = unwrap(this).getAttributes()

  /**
   * One or more user-defined key-value pairs to be added to the stack attributes.
   */
  public open fun attributes(`value`: IResolvable) {
    unwrap(this).setAttributes(`value`.let(IResolvable::unwrap))
  }

  /**
   * One or more user-defined key-value pairs to be added to the stack attributes.
   */
  public open fun attributes(`value`: Map<String, String>) {
    unwrap(this).setAttributes(`value`)
  }

  /**
   * Whether to automatically assign an [Elastic IP
   * address](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/elastic-ip-addresses-eip.html) to the
   * layer's instances. For more information, see [How to Edit a
   * Layer](https://docs.aws.amazon.com/opsworks/latest/userguide/workinglayers-basics-edit.html) .
   */
  public open fun autoAssignElasticIps(): Any = unwrap(this).getAutoAssignElasticIps()

  /**
   * Whether to automatically assign an [Elastic IP
   * address](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/elastic-ip-addresses-eip.html) to the
   * layer's instances. For more information, see [How to Edit a
   * Layer](https://docs.aws.amazon.com/opsworks/latest/userguide/workinglayers-basics-edit.html) .
   */
  public open fun autoAssignElasticIps(`value`: Boolean) {
    unwrap(this).setAutoAssignElasticIps(`value`)
  }

  /**
   * Whether to automatically assign an [Elastic IP
   * address](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/elastic-ip-addresses-eip.html) to the
   * layer's instances. For more information, see [How to Edit a
   * Layer](https://docs.aws.amazon.com/opsworks/latest/userguide/workinglayers-basics-edit.html) .
   */
  public open fun autoAssignElasticIps(`value`: IResolvable) {
    unwrap(this).setAutoAssignElasticIps(`value`.let(IResolvable::unwrap))
  }

  /**
   * For stacks that are running in a VPC, whether to automatically assign a public IP address to
   * the layer's instances.
   */
  public open fun autoAssignPublicIps(): Any = unwrap(this).getAutoAssignPublicIps()

  /**
   * For stacks that are running in a VPC, whether to automatically assign a public IP address to
   * the layer's instances.
   */
  public open fun autoAssignPublicIps(`value`: Boolean) {
    unwrap(this).setAutoAssignPublicIps(`value`)
  }

  /**
   * For stacks that are running in a VPC, whether to automatically assign a public IP address to
   * the layer's instances.
   */
  public open fun autoAssignPublicIps(`value`: IResolvable) {
    unwrap(this).setAutoAssignPublicIps(`value`.let(IResolvable::unwrap))
  }

  /**
   * The ARN of an IAM profile to be used for the layer's EC2 instances.
   */
  public open fun customInstanceProfileArn(): String? = unwrap(this).getCustomInstanceProfileArn()

  /**
   * The ARN of an IAM profile to be used for the layer's EC2 instances.
   */
  public open fun customInstanceProfileArn(`value`: String) {
    unwrap(this).setCustomInstanceProfileArn(`value`)
  }

  /**
   * A JSON-formatted string containing custom stack configuration and deployment attributes to be
   * installed on the layer's instances.
   */
  public open fun customJson(): Any? = unwrap(this).getCustomJson()

  /**
   * A JSON-formatted string containing custom stack configuration and deployment attributes to be
   * installed on the layer's instances.
   */
  public open fun customJson(`value`: Any) {
    unwrap(this).setCustomJson(`value`)
  }

  /**
   * A `LayerCustomRecipes` object that specifies the layer custom recipes.
   */
  public open fun customRecipes(): Any? = unwrap(this).getCustomRecipes()

  /**
   * A `LayerCustomRecipes` object that specifies the layer custom recipes.
   */
  public open fun customRecipes(`value`: IResolvable) {
    unwrap(this).setCustomRecipes(`value`.let(IResolvable::unwrap))
  }

  /**
   * A `LayerCustomRecipes` object that specifies the layer custom recipes.
   */
  public open fun customRecipes(`value`: RecipesProperty) {
    unwrap(this).setCustomRecipes(`value`.let(RecipesProperty::unwrap))
  }

  /**
   * A `LayerCustomRecipes` object that specifies the layer custom recipes.
   */
  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("46eb96de669e8dcbb5f6c92957606bd6939e70d03b609c4b12fbfdd84e48e58c")
  public open fun customRecipes(`value`: RecipesProperty.Builder.() -> Unit): Unit =
      customRecipes(RecipesProperty(`value`))

  /**
   * An array containing the layer custom security group IDs.
   */
  public open fun customSecurityGroupIds(): List<String> = unwrap(this).getCustomSecurityGroupIds()
      ?: emptyList()

  /**
   * An array containing the layer custom security group IDs.
   */
  public open fun customSecurityGroupIds(`value`: List<String>) {
    unwrap(this).setCustomSecurityGroupIds(`value`)
  }

  /**
   * An array containing the layer custom security group IDs.
   */
  public open fun customSecurityGroupIds(vararg `value`: String): Unit =
      customSecurityGroupIds(`value`.toList())

  /**
   * Whether to disable auto healing for the layer.
   */
  public open fun enableAutoHealing(): Any = unwrap(this).getEnableAutoHealing()

  /**
   * Whether to disable auto healing for the layer.
   */
  public open fun enableAutoHealing(`value`: Boolean) {
    unwrap(this).setEnableAutoHealing(`value`)
  }

  /**
   * Whether to disable auto healing for the layer.
   */
  public open fun enableAutoHealing(`value`: IResolvable) {
    unwrap(this).setEnableAutoHealing(`value`.let(IResolvable::unwrap))
  }

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  /**
   * Whether to install operating system and package updates when the instance boots.
   */
  public open fun installUpdatesOnBoot(): Any? = unwrap(this).getInstallUpdatesOnBoot()

  /**
   * Whether to install operating system and package updates when the instance boots.
   */
  public open fun installUpdatesOnBoot(`value`: Boolean) {
    unwrap(this).setInstallUpdatesOnBoot(`value`)
  }

  /**
   * Whether to install operating system and package updates when the instance boots.
   */
  public open fun installUpdatesOnBoot(`value`: IResolvable) {
    unwrap(this).setInstallUpdatesOnBoot(`value`.let(IResolvable::unwrap))
  }

  /**
   * A `LifeCycleEventConfiguration` object that you can use to configure the Shutdown event to
   * specify an execution timeout and enable or disable Elastic Load Balancer connection draining.
   */
  public open fun lifecycleEventConfiguration(): Any? =
      unwrap(this).getLifecycleEventConfiguration()

  /**
   * A `LifeCycleEventConfiguration` object that you can use to configure the Shutdown event to
   * specify an execution timeout and enable or disable Elastic Load Balancer connection draining.
   */
  public open fun lifecycleEventConfiguration(`value`: IResolvable) {
    unwrap(this).setLifecycleEventConfiguration(`value`.let(IResolvable::unwrap))
  }

  /**
   * A `LifeCycleEventConfiguration` object that you can use to configure the Shutdown event to
   * specify an execution timeout and enable or disable Elastic Load Balancer connection draining.
   */
  public open fun lifecycleEventConfiguration(`value`: LifecycleEventConfigurationProperty) {
    unwrap(this).setLifecycleEventConfiguration(`value`.let(LifecycleEventConfigurationProperty::unwrap))
  }

  /**
   * A `LifeCycleEventConfiguration` object that you can use to configure the Shutdown event to
   * specify an execution timeout and enable or disable Elastic Load Balancer connection draining.
   */
  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("075d950d92919d5acca9e9c17184231aabdd84fb31b2a2dc92dd4c4ab2b894c6")
  public open
      fun lifecycleEventConfiguration(`value`: LifecycleEventConfigurationProperty.Builder.() -> Unit):
      Unit = lifecycleEventConfiguration(LifecycleEventConfigurationProperty(`value`))

  /**
   * The load-based scaling configuration for the AWS OpsWorks layer.
   */
  public open fun loadBasedAutoScaling(): Any? = unwrap(this).getLoadBasedAutoScaling()

  /**
   * The load-based scaling configuration for the AWS OpsWorks layer.
   */
  public open fun loadBasedAutoScaling(`value`: IResolvable) {
    unwrap(this).setLoadBasedAutoScaling(`value`.let(IResolvable::unwrap))
  }

  /**
   * The load-based scaling configuration for the AWS OpsWorks layer.
   */
  public open fun loadBasedAutoScaling(`value`: LoadBasedAutoScalingProperty) {
    unwrap(this).setLoadBasedAutoScaling(`value`.let(LoadBasedAutoScalingProperty::unwrap))
  }

  /**
   * The load-based scaling configuration for the AWS OpsWorks layer.
   */
  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("c2cce91339f84d14ead6bb576b157dfdb52ff57a450e50cb78ef2ff06829de7c")
  public open fun loadBasedAutoScaling(`value`: LoadBasedAutoScalingProperty.Builder.() -> Unit):
      Unit = loadBasedAutoScaling(LoadBasedAutoScalingProperty(`value`))

  /**
   * The layer name, which is used by the console.
   */
  public open fun name(): String = unwrap(this).getName()

  /**
   * The layer name, which is used by the console.
   */
  public open fun name(`value`: String) {
    unwrap(this).setName(`value`)
  }

  /**
   * An array of `Package` objects that describes the layer packages.
   */
  public open fun packages(): List<String> = unwrap(this).getPackages() ?: emptyList()

  /**
   * An array of `Package` objects that describes the layer packages.
   */
  public open fun packages(`value`: List<String>) {
    unwrap(this).setPackages(`value`)
  }

  /**
   * An array of `Package` objects that describes the layer packages.
   */
  public open fun packages(vararg `value`: String): Unit = packages(`value`.toList())

  /**
   * For custom layers only, use this parameter to specify the layer's short name, which is used
   * internally by AWS OpsWorks Stacks and by Chef recipes.
   */
  public open fun shortname(): String = unwrap(this).getShortname()

  /**
   * For custom layers only, use this parameter to specify the layer's short name, which is used
   * internally by AWS OpsWorks Stacks and by Chef recipes.
   */
  public open fun shortname(`value`: String) {
    unwrap(this).setShortname(`value`)
  }

  /**
   * The layer stack ID.
   */
  public open fun stackId(): String = unwrap(this).getStackId()

  /**
   * The layer stack ID.
   */
  public open fun stackId(`value`: String) {
    unwrap(this).setStackId(`value`)
  }

  /**
   * Tag Manager which manages the tags for this resource.
   */
  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  /**
   * Specifies one or more sets of tags (key–value pairs) to associate with this AWS OpsWorks layer.
   */
  public open fun tagsRaw(): List<CfnTag> = unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?:
      emptyList()

  /**
   * Specifies one or more sets of tags (key–value pairs) to associate with this AWS OpsWorks layer.
   */
  public open fun tagsRaw(`value`: List<CfnTag>) {
    unwrap(this).setTagsRaw(`value`.map(CfnTag::unwrap))
  }

  /**
   * Specifies one or more sets of tags (key–value pairs) to associate with this AWS OpsWorks layer.
   */
  public open fun tagsRaw(vararg `value`: CfnTag): Unit = tagsRaw(`value`.toList())

  /**
   * The layer type.
   */
  public open fun type(): String = unwrap(this).getType()

  /**
   * The layer type.
   */
  public open fun type(`value`: String) {
    unwrap(this).setType(`value`)
  }

  /**
   * Whether to use Amazon EBS-optimized instances.
   */
  public open fun useEbsOptimizedInstances(): Any? = unwrap(this).getUseEbsOptimizedInstances()

  /**
   * Whether to use Amazon EBS-optimized instances.
   */
  public open fun useEbsOptimizedInstances(`value`: Boolean) {
    unwrap(this).setUseEbsOptimizedInstances(`value`)
  }

  /**
   * Whether to use Amazon EBS-optimized instances.
   */
  public open fun useEbsOptimizedInstances(`value`: IResolvable) {
    unwrap(this).setUseEbsOptimizedInstances(`value`.let(IResolvable::unwrap))
  }

  /**
   * A `VolumeConfigurations` object that describes the layer's Amazon EBS volumes.
   */
  public open fun volumeConfigurations(): Any? = unwrap(this).getVolumeConfigurations()

  /**
   * A `VolumeConfigurations` object that describes the layer's Amazon EBS volumes.
   */
  public open fun volumeConfigurations(`value`: IResolvable) {
    unwrap(this).setVolumeConfigurations(`value`.let(IResolvable::unwrap))
  }

  /**
   * A `VolumeConfigurations` object that describes the layer's Amazon EBS volumes.
   */
  public open fun volumeConfigurations(__idx_ac66f0: List<Any>) {
    unwrap(this).setVolumeConfigurations(__idx_ac66f0)
  }

  /**
   * A `VolumeConfigurations` object that describes the layer's Amazon EBS volumes.
   */
  public open fun volumeConfigurations(vararg __idx_ac66f0: Any): Unit =
      volumeConfigurations(__idx_ac66f0.toList())

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.opsworks.CfnLayer].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * One or more user-defined key-value pairs to be added to the stack attributes.
     *
     * To create a cluster layer, set the `EcsClusterArn` attribute to the cluster's ARN.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-layer.html#cfn-opsworks-layer-attributes)
     * @param attributes One or more user-defined key-value pairs to be added to the stack
     * attributes. 
     */
    public fun attributes(attributes: IResolvable)

    /**
     * One or more user-defined key-value pairs to be added to the stack attributes.
     *
     * To create a cluster layer, set the `EcsClusterArn` attribute to the cluster's ARN.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-layer.html#cfn-opsworks-layer-attributes)
     * @param attributes One or more user-defined key-value pairs to be added to the stack
     * attributes. 
     */
    public fun attributes(attributes: Map<String, String>)

    /**
     * Whether to automatically assign an [Elastic IP
     * address](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/elastic-ip-addresses-eip.html) to
     * the layer's instances. For more information, see [How to Edit a
     * Layer](https://docs.aws.amazon.com/opsworks/latest/userguide/workinglayers-basics-edit.html) .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-layer.html#cfn-opsworks-layer-autoassignelasticips)
     * @param autoAssignElasticIps Whether to automatically assign an [Elastic IP
     * address](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/elastic-ip-addresses-eip.html) to
     * the layer's instances. For more information, see [How to Edit a
     * Layer](https://docs.aws.amazon.com/opsworks/latest/userguide/workinglayers-basics-edit.html) . 
     */
    public fun autoAssignElasticIps(autoAssignElasticIps: Boolean)

    /**
     * Whether to automatically assign an [Elastic IP
     * address](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/elastic-ip-addresses-eip.html) to
     * the layer's instances. For more information, see [How to Edit a
     * Layer](https://docs.aws.amazon.com/opsworks/latest/userguide/workinglayers-basics-edit.html) .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-layer.html#cfn-opsworks-layer-autoassignelasticips)
     * @param autoAssignElasticIps Whether to automatically assign an [Elastic IP
     * address](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/elastic-ip-addresses-eip.html) to
     * the layer's instances. For more information, see [How to Edit a
     * Layer](https://docs.aws.amazon.com/opsworks/latest/userguide/workinglayers-basics-edit.html) . 
     */
    public fun autoAssignElasticIps(autoAssignElasticIps: IResolvable)

    /**
     * For stacks that are running in a VPC, whether to automatically assign a public IP address to
     * the layer's instances.
     *
     * For more information, see [How to Edit a
     * Layer](https://docs.aws.amazon.com/opsworks/latest/userguide/workinglayers-basics-edit.html) .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-layer.html#cfn-opsworks-layer-autoassignpublicips)
     * @param autoAssignPublicIps For stacks that are running in a VPC, whether to automatically
     * assign a public IP address to the layer's instances. 
     */
    public fun autoAssignPublicIps(autoAssignPublicIps: Boolean)

    /**
     * For stacks that are running in a VPC, whether to automatically assign a public IP address to
     * the layer's instances.
     *
     * For more information, see [How to Edit a
     * Layer](https://docs.aws.amazon.com/opsworks/latest/userguide/workinglayers-basics-edit.html) .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-layer.html#cfn-opsworks-layer-autoassignpublicips)
     * @param autoAssignPublicIps For stacks that are running in a VPC, whether to automatically
     * assign a public IP address to the layer's instances. 
     */
    public fun autoAssignPublicIps(autoAssignPublicIps: IResolvable)

    /**
     * The ARN of an IAM profile to be used for the layer's EC2 instances.
     *
     * For more information about IAM ARNs, see [Using
     * Identifiers](https://docs.aws.amazon.com/IAM/latest/UserGuide/Using_Identifiers.html) .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-layer.html#cfn-opsworks-layer-custominstanceprofilearn)
     * @param customInstanceProfileArn The ARN of an IAM profile to be used for the layer's EC2
     * instances. 
     */
    public fun customInstanceProfileArn(customInstanceProfileArn: String)

    /**
     * A JSON-formatted string containing custom stack configuration and deployment attributes to be
     * installed on the layer's instances.
     *
     * For more information, see [Using Custom
     * JSON](https://docs.aws.amazon.com/opsworks/latest/userguide/workingcookbook-json-override.html)
     * . This feature is supported as of version 1.7.42 of the AWS CLI .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-layer.html#cfn-opsworks-layer-customjson)
     * @param customJson A JSON-formatted string containing custom stack configuration and
     * deployment attributes to be installed on the layer's instances. 
     */
    public fun customJson(customJson: Any)

    /**
     * A `LayerCustomRecipes` object that specifies the layer custom recipes.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-layer.html#cfn-opsworks-layer-customrecipes)
     * @param customRecipes A `LayerCustomRecipes` object that specifies the layer custom recipes. 
     */
    public fun customRecipes(customRecipes: IResolvable)

    /**
     * A `LayerCustomRecipes` object that specifies the layer custom recipes.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-layer.html#cfn-opsworks-layer-customrecipes)
     * @param customRecipes A `LayerCustomRecipes` object that specifies the layer custom recipes. 
     */
    public fun customRecipes(customRecipes: RecipesProperty)

    /**
     * A `LayerCustomRecipes` object that specifies the layer custom recipes.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-layer.html#cfn-opsworks-layer-customrecipes)
     * @param customRecipes A `LayerCustomRecipes` object that specifies the layer custom recipes. 
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("83070b06fe28ef87c0df7331304021d0187bbeecda558eae821e7c0f11716b1b")
    public fun customRecipes(customRecipes: RecipesProperty.Builder.() -> Unit)

    /**
     * An array containing the layer custom security group IDs.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-layer.html#cfn-opsworks-layer-customsecuritygroupids)
     * @param customSecurityGroupIds An array containing the layer custom security group IDs. 
     */
    public fun customSecurityGroupIds(customSecurityGroupIds: List<String>)

    /**
     * An array containing the layer custom security group IDs.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-layer.html#cfn-opsworks-layer-customsecuritygroupids)
     * @param customSecurityGroupIds An array containing the layer custom security group IDs. 
     */
    public fun customSecurityGroupIds(vararg customSecurityGroupIds: String)

    /**
     * Whether to disable auto healing for the layer.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-layer.html#cfn-opsworks-layer-enableautohealing)
     * @param enableAutoHealing Whether to disable auto healing for the layer. 
     */
    public fun enableAutoHealing(enableAutoHealing: Boolean)

    /**
     * Whether to disable auto healing for the layer.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-layer.html#cfn-opsworks-layer-enableautohealing)
     * @param enableAutoHealing Whether to disable auto healing for the layer. 
     */
    public fun enableAutoHealing(enableAutoHealing: IResolvable)

    /**
     * Whether to install operating system and package updates when the instance boots.
     *
     * The default value is `true` . To control when updates are installed, set this value to
     * `false` . You must then update your instances manually by using `CreateDeployment` to run the
     * `update_dependencies` stack command or by manually running `yum` (Amazon Linux) or `apt-get`
     * (Ubuntu) on the instances.
     *
     *
     * To ensure that your instances have the latest security updates, we strongly recommend using
     * the default value of `true` .
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-layer.html#cfn-opsworks-layer-installupdatesonboot)
     * @param installUpdatesOnBoot Whether to install operating system and package updates when the
     * instance boots. 
     */
    public fun installUpdatesOnBoot(installUpdatesOnBoot: Boolean)

    /**
     * Whether to install operating system and package updates when the instance boots.
     *
     * The default value is `true` . To control when updates are installed, set this value to
     * `false` . You must then update your instances manually by using `CreateDeployment` to run the
     * `update_dependencies` stack command or by manually running `yum` (Amazon Linux) or `apt-get`
     * (Ubuntu) on the instances.
     *
     *
     * To ensure that your instances have the latest security updates, we strongly recommend using
     * the default value of `true` .
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-layer.html#cfn-opsworks-layer-installupdatesonboot)
     * @param installUpdatesOnBoot Whether to install operating system and package updates when the
     * instance boots. 
     */
    public fun installUpdatesOnBoot(installUpdatesOnBoot: IResolvable)

    /**
     * A `LifeCycleEventConfiguration` object that you can use to configure the Shutdown event to
     * specify an execution timeout and enable or disable Elastic Load Balancer connection draining.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-layer.html#cfn-opsworks-layer-lifecycleeventconfiguration)
     * @param lifecycleEventConfiguration A `LifeCycleEventConfiguration` object that you can use to
     * configure the Shutdown event to specify an execution timeout and enable or disable Elastic Load
     * Balancer connection draining. 
     */
    public fun lifecycleEventConfiguration(lifecycleEventConfiguration: IResolvable)

    /**
     * A `LifeCycleEventConfiguration` object that you can use to configure the Shutdown event to
     * specify an execution timeout and enable or disable Elastic Load Balancer connection draining.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-layer.html#cfn-opsworks-layer-lifecycleeventconfiguration)
     * @param lifecycleEventConfiguration A `LifeCycleEventConfiguration` object that you can use to
     * configure the Shutdown event to specify an execution timeout and enable or disable Elastic Load
     * Balancer connection draining. 
     */
    public
        fun lifecycleEventConfiguration(lifecycleEventConfiguration: LifecycleEventConfigurationProperty)

    /**
     * A `LifeCycleEventConfiguration` object that you can use to configure the Shutdown event to
     * specify an execution timeout and enable or disable Elastic Load Balancer connection draining.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-layer.html#cfn-opsworks-layer-lifecycleeventconfiguration)
     * @param lifecycleEventConfiguration A `LifeCycleEventConfiguration` object that you can use to
     * configure the Shutdown event to specify an execution timeout and enable or disable Elastic Load
     * Balancer connection draining. 
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("e9cfe03c735b50e01df06229337d8df96730c8d22d4711a4fc5002b328edcee4")
    public
        fun lifecycleEventConfiguration(lifecycleEventConfiguration: LifecycleEventConfigurationProperty.Builder.() -> Unit)

    /**
     * The load-based scaling configuration for the AWS OpsWorks layer.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-layer.html#cfn-opsworks-layer-loadbasedautoscaling)
     * @param loadBasedAutoScaling The load-based scaling configuration for the AWS OpsWorks layer. 
     */
    public fun loadBasedAutoScaling(loadBasedAutoScaling: IResolvable)

    /**
     * The load-based scaling configuration for the AWS OpsWorks layer.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-layer.html#cfn-opsworks-layer-loadbasedautoscaling)
     * @param loadBasedAutoScaling The load-based scaling configuration for the AWS OpsWorks layer. 
     */
    public fun loadBasedAutoScaling(loadBasedAutoScaling: LoadBasedAutoScalingProperty)

    /**
     * The load-based scaling configuration for the AWS OpsWorks layer.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-layer.html#cfn-opsworks-layer-loadbasedautoscaling)
     * @param loadBasedAutoScaling The load-based scaling configuration for the AWS OpsWorks layer. 
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("671c26bd97fcf55213bf45b05b04f31b88c41667f1af0a8b21ab011d83bb7a76")
    public
        fun loadBasedAutoScaling(loadBasedAutoScaling: LoadBasedAutoScalingProperty.Builder.() -> Unit)

    /**
     * The layer name, which is used by the console.
     *
     * Layer names can be a maximum of 32 characters.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-layer.html#cfn-opsworks-layer-name)
     * @param name The layer name, which is used by the console. 
     */
    public fun name(name: String)

    /**
     * An array of `Package` objects that describes the layer packages.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-layer.html#cfn-opsworks-layer-packages)
     * @param packages An array of `Package` objects that describes the layer packages. 
     */
    public fun packages(packages: List<String>)

    /**
     * An array of `Package` objects that describes the layer packages.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-layer.html#cfn-opsworks-layer-packages)
     * @param packages An array of `Package` objects that describes the layer packages. 
     */
    public fun packages(vararg packages: String)

    /**
     * For custom layers only, use this parameter to specify the layer's short name, which is used
     * internally by AWS OpsWorks Stacks and by Chef recipes.
     *
     * The short name is also used as the name for the directory where your app files are installed.
     * It can have a maximum of 32 characters, which are limited to the alphanumeric characters, '-',
     * '_', and '.'.
     *
     * Built-in layer short names are defined by AWS OpsWorks Stacks. For more information, see the
     * [Layer Reference](https://docs.aws.amazon.com/opsworks/latest/userguide/layers.html) .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-layer.html#cfn-opsworks-layer-shortname)
     * @param shortname For custom layers only, use this parameter to specify the layer's short
     * name, which is used internally by AWS OpsWorks Stacks and by Chef recipes. 
     */
    public fun shortname(shortname: String)

    /**
     * The layer stack ID.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-layer.html#cfn-opsworks-layer-stackid)
     * @param stackId The layer stack ID. 
     */
    public fun stackId(stackId: String)

    /**
     * Specifies one or more sets of tags (key–value pairs) to associate with this AWS OpsWorks
     * layer.
     *
     * Use tags to manage your resources.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-layer.html#cfn-opsworks-layer-tags)
     * @param tags Specifies one or more sets of tags (key–value pairs) to associate with this AWS
     * OpsWorks layer. 
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * Specifies one or more sets of tags (key–value pairs) to associate with this AWS OpsWorks
     * layer.
     *
     * Use tags to manage your resources.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-layer.html#cfn-opsworks-layer-tags)
     * @param tags Specifies one or more sets of tags (key–value pairs) to associate with this AWS
     * OpsWorks layer. 
     */
    public fun tags(vararg tags: CfnTag)

    /**
     * The layer type.
     *
     * A stack cannot have more than one built-in layer of the same type. It can have any number of
     * custom layers. Built-in layers are not available in Chef 12 stacks.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-layer.html#cfn-opsworks-layer-type)
     * @param type The layer type. 
     */
    public fun type(type: String)

    /**
     * Whether to use Amazon EBS-optimized instances.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-layer.html#cfn-opsworks-layer-useebsoptimizedinstances)
     * @param useEbsOptimizedInstances Whether to use Amazon EBS-optimized instances. 
     */
    public fun useEbsOptimizedInstances(useEbsOptimizedInstances: Boolean)

    /**
     * Whether to use Amazon EBS-optimized instances.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-layer.html#cfn-opsworks-layer-useebsoptimizedinstances)
     * @param useEbsOptimizedInstances Whether to use Amazon EBS-optimized instances. 
     */
    public fun useEbsOptimizedInstances(useEbsOptimizedInstances: IResolvable)

    /**
     * A `VolumeConfigurations` object that describes the layer's Amazon EBS volumes.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-layer.html#cfn-opsworks-layer-volumeconfigurations)
     * @param volumeConfigurations A `VolumeConfigurations` object that describes the layer's Amazon
     * EBS volumes. 
     */
    public fun volumeConfigurations(volumeConfigurations: IResolvable)

    /**
     * A `VolumeConfigurations` object that describes the layer's Amazon EBS volumes.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-layer.html#cfn-opsworks-layer-volumeconfigurations)
     * @param volumeConfigurations A `VolumeConfigurations` object that describes the layer's Amazon
     * EBS volumes. 
     */
    public fun volumeConfigurations(volumeConfigurations: List<Any>)

    /**
     * A `VolumeConfigurations` object that describes the layer's Amazon EBS volumes.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-layer.html#cfn-opsworks-layer-volumeconfigurations)
     * @param volumeConfigurations A `VolumeConfigurations` object that describes the layer's Amazon
     * EBS volumes. 
     */
    public fun volumeConfigurations(vararg volumeConfigurations: Any)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.opsworks.CfnLayer.Builder =
        software.amazon.awscdk.services.opsworks.CfnLayer.Builder.create(scope, id)

    /**
     * One or more user-defined key-value pairs to be added to the stack attributes.
     *
     * To create a cluster layer, set the `EcsClusterArn` attribute to the cluster's ARN.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-layer.html#cfn-opsworks-layer-attributes)
     * @param attributes One or more user-defined key-value pairs to be added to the stack
     * attributes. 
     */
    override fun attributes(attributes: IResolvable) {
      cdkBuilder.attributes(attributes.let(IResolvable::unwrap))
    }

    /**
     * One or more user-defined key-value pairs to be added to the stack attributes.
     *
     * To create a cluster layer, set the `EcsClusterArn` attribute to the cluster's ARN.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-layer.html#cfn-opsworks-layer-attributes)
     * @param attributes One or more user-defined key-value pairs to be added to the stack
     * attributes. 
     */
    override fun attributes(attributes: Map<String, String>) {
      cdkBuilder.attributes(attributes)
    }

    /**
     * Whether to automatically assign an [Elastic IP
     * address](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/elastic-ip-addresses-eip.html) to
     * the layer's instances. For more information, see [How to Edit a
     * Layer](https://docs.aws.amazon.com/opsworks/latest/userguide/workinglayers-basics-edit.html) .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-layer.html#cfn-opsworks-layer-autoassignelasticips)
     * @param autoAssignElasticIps Whether to automatically assign an [Elastic IP
     * address](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/elastic-ip-addresses-eip.html) to
     * the layer's instances. For more information, see [How to Edit a
     * Layer](https://docs.aws.amazon.com/opsworks/latest/userguide/workinglayers-basics-edit.html) . 
     */
    override fun autoAssignElasticIps(autoAssignElasticIps: Boolean) {
      cdkBuilder.autoAssignElasticIps(autoAssignElasticIps)
    }

    /**
     * Whether to automatically assign an [Elastic IP
     * address](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/elastic-ip-addresses-eip.html) to
     * the layer's instances. For more information, see [How to Edit a
     * Layer](https://docs.aws.amazon.com/opsworks/latest/userguide/workinglayers-basics-edit.html) .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-layer.html#cfn-opsworks-layer-autoassignelasticips)
     * @param autoAssignElasticIps Whether to automatically assign an [Elastic IP
     * address](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/elastic-ip-addresses-eip.html) to
     * the layer's instances. For more information, see [How to Edit a
     * Layer](https://docs.aws.amazon.com/opsworks/latest/userguide/workinglayers-basics-edit.html) . 
     */
    override fun autoAssignElasticIps(autoAssignElasticIps: IResolvable) {
      cdkBuilder.autoAssignElasticIps(autoAssignElasticIps.let(IResolvable::unwrap))
    }

    /**
     * For stacks that are running in a VPC, whether to automatically assign a public IP address to
     * the layer's instances.
     *
     * For more information, see [How to Edit a
     * Layer](https://docs.aws.amazon.com/opsworks/latest/userguide/workinglayers-basics-edit.html) .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-layer.html#cfn-opsworks-layer-autoassignpublicips)
     * @param autoAssignPublicIps For stacks that are running in a VPC, whether to automatically
     * assign a public IP address to the layer's instances. 
     */
    override fun autoAssignPublicIps(autoAssignPublicIps: Boolean) {
      cdkBuilder.autoAssignPublicIps(autoAssignPublicIps)
    }

    /**
     * For stacks that are running in a VPC, whether to automatically assign a public IP address to
     * the layer's instances.
     *
     * For more information, see [How to Edit a
     * Layer](https://docs.aws.amazon.com/opsworks/latest/userguide/workinglayers-basics-edit.html) .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-layer.html#cfn-opsworks-layer-autoassignpublicips)
     * @param autoAssignPublicIps For stacks that are running in a VPC, whether to automatically
     * assign a public IP address to the layer's instances. 
     */
    override fun autoAssignPublicIps(autoAssignPublicIps: IResolvable) {
      cdkBuilder.autoAssignPublicIps(autoAssignPublicIps.let(IResolvable::unwrap))
    }

    /**
     * The ARN of an IAM profile to be used for the layer's EC2 instances.
     *
     * For more information about IAM ARNs, see [Using
     * Identifiers](https://docs.aws.amazon.com/IAM/latest/UserGuide/Using_Identifiers.html) .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-layer.html#cfn-opsworks-layer-custominstanceprofilearn)
     * @param customInstanceProfileArn The ARN of an IAM profile to be used for the layer's EC2
     * instances. 
     */
    override fun customInstanceProfileArn(customInstanceProfileArn: String) {
      cdkBuilder.customInstanceProfileArn(customInstanceProfileArn)
    }

    /**
     * A JSON-formatted string containing custom stack configuration and deployment attributes to be
     * installed on the layer's instances.
     *
     * For more information, see [Using Custom
     * JSON](https://docs.aws.amazon.com/opsworks/latest/userguide/workingcookbook-json-override.html)
     * . This feature is supported as of version 1.7.42 of the AWS CLI .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-layer.html#cfn-opsworks-layer-customjson)
     * @param customJson A JSON-formatted string containing custom stack configuration and
     * deployment attributes to be installed on the layer's instances. 
     */
    override fun customJson(customJson: Any) {
      cdkBuilder.customJson(customJson)
    }

    /**
     * A `LayerCustomRecipes` object that specifies the layer custom recipes.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-layer.html#cfn-opsworks-layer-customrecipes)
     * @param customRecipes A `LayerCustomRecipes` object that specifies the layer custom recipes. 
     */
    override fun customRecipes(customRecipes: IResolvable) {
      cdkBuilder.customRecipes(customRecipes.let(IResolvable::unwrap))
    }

    /**
     * A `LayerCustomRecipes` object that specifies the layer custom recipes.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-layer.html#cfn-opsworks-layer-customrecipes)
     * @param customRecipes A `LayerCustomRecipes` object that specifies the layer custom recipes. 
     */
    override fun customRecipes(customRecipes: RecipesProperty) {
      cdkBuilder.customRecipes(customRecipes.let(RecipesProperty::unwrap))
    }

    /**
     * A `LayerCustomRecipes` object that specifies the layer custom recipes.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-layer.html#cfn-opsworks-layer-customrecipes)
     * @param customRecipes A `LayerCustomRecipes` object that specifies the layer custom recipes. 
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("83070b06fe28ef87c0df7331304021d0187bbeecda558eae821e7c0f11716b1b")
    override fun customRecipes(customRecipes: RecipesProperty.Builder.() -> Unit): Unit =
        customRecipes(RecipesProperty(customRecipes))

    /**
     * An array containing the layer custom security group IDs.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-layer.html#cfn-opsworks-layer-customsecuritygroupids)
     * @param customSecurityGroupIds An array containing the layer custom security group IDs. 
     */
    override fun customSecurityGroupIds(customSecurityGroupIds: List<String>) {
      cdkBuilder.customSecurityGroupIds(customSecurityGroupIds)
    }

    /**
     * An array containing the layer custom security group IDs.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-layer.html#cfn-opsworks-layer-customsecuritygroupids)
     * @param customSecurityGroupIds An array containing the layer custom security group IDs. 
     */
    override fun customSecurityGroupIds(vararg customSecurityGroupIds: String): Unit =
        customSecurityGroupIds(customSecurityGroupIds.toList())

    /**
     * Whether to disable auto healing for the layer.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-layer.html#cfn-opsworks-layer-enableautohealing)
     * @param enableAutoHealing Whether to disable auto healing for the layer. 
     */
    override fun enableAutoHealing(enableAutoHealing: Boolean) {
      cdkBuilder.enableAutoHealing(enableAutoHealing)
    }

    /**
     * Whether to disable auto healing for the layer.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-layer.html#cfn-opsworks-layer-enableautohealing)
     * @param enableAutoHealing Whether to disable auto healing for the layer. 
     */
    override fun enableAutoHealing(enableAutoHealing: IResolvable) {
      cdkBuilder.enableAutoHealing(enableAutoHealing.let(IResolvable::unwrap))
    }

    /**
     * Whether to install operating system and package updates when the instance boots.
     *
     * The default value is `true` . To control when updates are installed, set this value to
     * `false` . You must then update your instances manually by using `CreateDeployment` to run the
     * `update_dependencies` stack command or by manually running `yum` (Amazon Linux) or `apt-get`
     * (Ubuntu) on the instances.
     *
     *
     * To ensure that your instances have the latest security updates, we strongly recommend using
     * the default value of `true` .
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-layer.html#cfn-opsworks-layer-installupdatesonboot)
     * @param installUpdatesOnBoot Whether to install operating system and package updates when the
     * instance boots. 
     */
    override fun installUpdatesOnBoot(installUpdatesOnBoot: Boolean) {
      cdkBuilder.installUpdatesOnBoot(installUpdatesOnBoot)
    }

    /**
     * Whether to install operating system and package updates when the instance boots.
     *
     * The default value is `true` . To control when updates are installed, set this value to
     * `false` . You must then update your instances manually by using `CreateDeployment` to run the
     * `update_dependencies` stack command or by manually running `yum` (Amazon Linux) or `apt-get`
     * (Ubuntu) on the instances.
     *
     *
     * To ensure that your instances have the latest security updates, we strongly recommend using
     * the default value of `true` .
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-layer.html#cfn-opsworks-layer-installupdatesonboot)
     * @param installUpdatesOnBoot Whether to install operating system and package updates when the
     * instance boots. 
     */
    override fun installUpdatesOnBoot(installUpdatesOnBoot: IResolvable) {
      cdkBuilder.installUpdatesOnBoot(installUpdatesOnBoot.let(IResolvable::unwrap))
    }

    /**
     * A `LifeCycleEventConfiguration` object that you can use to configure the Shutdown event to
     * specify an execution timeout and enable or disable Elastic Load Balancer connection draining.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-layer.html#cfn-opsworks-layer-lifecycleeventconfiguration)
     * @param lifecycleEventConfiguration A `LifeCycleEventConfiguration` object that you can use to
     * configure the Shutdown event to specify an execution timeout and enable or disable Elastic Load
     * Balancer connection draining. 
     */
    override fun lifecycleEventConfiguration(lifecycleEventConfiguration: IResolvable) {
      cdkBuilder.lifecycleEventConfiguration(lifecycleEventConfiguration.let(IResolvable::unwrap))
    }

    /**
     * A `LifeCycleEventConfiguration` object that you can use to configure the Shutdown event to
     * specify an execution timeout and enable or disable Elastic Load Balancer connection draining.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-layer.html#cfn-opsworks-layer-lifecycleeventconfiguration)
     * @param lifecycleEventConfiguration A `LifeCycleEventConfiguration` object that you can use to
     * configure the Shutdown event to specify an execution timeout and enable or disable Elastic Load
     * Balancer connection draining. 
     */
    override
        fun lifecycleEventConfiguration(lifecycleEventConfiguration: LifecycleEventConfigurationProperty) {
      cdkBuilder.lifecycleEventConfiguration(lifecycleEventConfiguration.let(LifecycleEventConfigurationProperty::unwrap))
    }

    /**
     * A `LifeCycleEventConfiguration` object that you can use to configure the Shutdown event to
     * specify an execution timeout and enable or disable Elastic Load Balancer connection draining.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-layer.html#cfn-opsworks-layer-lifecycleeventconfiguration)
     * @param lifecycleEventConfiguration A `LifeCycleEventConfiguration` object that you can use to
     * configure the Shutdown event to specify an execution timeout and enable or disable Elastic Load
     * Balancer connection draining. 
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("e9cfe03c735b50e01df06229337d8df96730c8d22d4711a4fc5002b328edcee4")
    override
        fun lifecycleEventConfiguration(lifecycleEventConfiguration: LifecycleEventConfigurationProperty.Builder.() -> Unit):
        Unit =
        lifecycleEventConfiguration(LifecycleEventConfigurationProperty(lifecycleEventConfiguration))

    /**
     * The load-based scaling configuration for the AWS OpsWorks layer.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-layer.html#cfn-opsworks-layer-loadbasedautoscaling)
     * @param loadBasedAutoScaling The load-based scaling configuration for the AWS OpsWorks layer. 
     */
    override fun loadBasedAutoScaling(loadBasedAutoScaling: IResolvable) {
      cdkBuilder.loadBasedAutoScaling(loadBasedAutoScaling.let(IResolvable::unwrap))
    }

    /**
     * The load-based scaling configuration for the AWS OpsWorks layer.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-layer.html#cfn-opsworks-layer-loadbasedautoscaling)
     * @param loadBasedAutoScaling The load-based scaling configuration for the AWS OpsWorks layer. 
     */
    override fun loadBasedAutoScaling(loadBasedAutoScaling: LoadBasedAutoScalingProperty) {
      cdkBuilder.loadBasedAutoScaling(loadBasedAutoScaling.let(LoadBasedAutoScalingProperty::unwrap))
    }

    /**
     * The load-based scaling configuration for the AWS OpsWorks layer.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-layer.html#cfn-opsworks-layer-loadbasedautoscaling)
     * @param loadBasedAutoScaling The load-based scaling configuration for the AWS OpsWorks layer. 
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("671c26bd97fcf55213bf45b05b04f31b88c41667f1af0a8b21ab011d83bb7a76")
    override
        fun loadBasedAutoScaling(loadBasedAutoScaling: LoadBasedAutoScalingProperty.Builder.() -> Unit):
        Unit = loadBasedAutoScaling(LoadBasedAutoScalingProperty(loadBasedAutoScaling))

    /**
     * The layer name, which is used by the console.
     *
     * Layer names can be a maximum of 32 characters.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-layer.html#cfn-opsworks-layer-name)
     * @param name The layer name, which is used by the console. 
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * An array of `Package` objects that describes the layer packages.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-layer.html#cfn-opsworks-layer-packages)
     * @param packages An array of `Package` objects that describes the layer packages. 
     */
    override fun packages(packages: List<String>) {
      cdkBuilder.packages(packages)
    }

    /**
     * An array of `Package` objects that describes the layer packages.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-layer.html#cfn-opsworks-layer-packages)
     * @param packages An array of `Package` objects that describes the layer packages. 
     */
    override fun packages(vararg packages: String): Unit = packages(packages.toList())

    /**
     * For custom layers only, use this parameter to specify the layer's short name, which is used
     * internally by AWS OpsWorks Stacks and by Chef recipes.
     *
     * The short name is also used as the name for the directory where your app files are installed.
     * It can have a maximum of 32 characters, which are limited to the alphanumeric characters, '-',
     * '_', and '.'.
     *
     * Built-in layer short names are defined by AWS OpsWorks Stacks. For more information, see the
     * [Layer Reference](https://docs.aws.amazon.com/opsworks/latest/userguide/layers.html) .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-layer.html#cfn-opsworks-layer-shortname)
     * @param shortname For custom layers only, use this parameter to specify the layer's short
     * name, which is used internally by AWS OpsWorks Stacks and by Chef recipes. 
     */
    override fun shortname(shortname: String) {
      cdkBuilder.shortname(shortname)
    }

    /**
     * The layer stack ID.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-layer.html#cfn-opsworks-layer-stackid)
     * @param stackId The layer stack ID. 
     */
    override fun stackId(stackId: String) {
      cdkBuilder.stackId(stackId)
    }

    /**
     * Specifies one or more sets of tags (key–value pairs) to associate with this AWS OpsWorks
     * layer.
     *
     * Use tags to manage your resources.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-layer.html#cfn-opsworks-layer-tags)
     * @param tags Specifies one or more sets of tags (key–value pairs) to associate with this AWS
     * OpsWorks layer. 
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    /**
     * Specifies one or more sets of tags (key–value pairs) to associate with this AWS OpsWorks
     * layer.
     *
     * Use tags to manage your resources.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-layer.html#cfn-opsworks-layer-tags)
     * @param tags Specifies one or more sets of tags (key–value pairs) to associate with this AWS
     * OpsWorks layer. 
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    /**
     * The layer type.
     *
     * A stack cannot have more than one built-in layer of the same type. It can have any number of
     * custom layers. Built-in layers are not available in Chef 12 stacks.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-layer.html#cfn-opsworks-layer-type)
     * @param type The layer type. 
     */
    override fun type(type: String) {
      cdkBuilder.type(type)
    }

    /**
     * Whether to use Amazon EBS-optimized instances.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-layer.html#cfn-opsworks-layer-useebsoptimizedinstances)
     * @param useEbsOptimizedInstances Whether to use Amazon EBS-optimized instances. 
     */
    override fun useEbsOptimizedInstances(useEbsOptimizedInstances: Boolean) {
      cdkBuilder.useEbsOptimizedInstances(useEbsOptimizedInstances)
    }

    /**
     * Whether to use Amazon EBS-optimized instances.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-layer.html#cfn-opsworks-layer-useebsoptimizedinstances)
     * @param useEbsOptimizedInstances Whether to use Amazon EBS-optimized instances. 
     */
    override fun useEbsOptimizedInstances(useEbsOptimizedInstances: IResolvable) {
      cdkBuilder.useEbsOptimizedInstances(useEbsOptimizedInstances.let(IResolvable::unwrap))
    }

    /**
     * A `VolumeConfigurations` object that describes the layer's Amazon EBS volumes.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-layer.html#cfn-opsworks-layer-volumeconfigurations)
     * @param volumeConfigurations A `VolumeConfigurations` object that describes the layer's Amazon
     * EBS volumes. 
     */
    override fun volumeConfigurations(volumeConfigurations: IResolvable) {
      cdkBuilder.volumeConfigurations(volumeConfigurations.let(IResolvable::unwrap))
    }

    /**
     * A `VolumeConfigurations` object that describes the layer's Amazon EBS volumes.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-layer.html#cfn-opsworks-layer-volumeconfigurations)
     * @param volumeConfigurations A `VolumeConfigurations` object that describes the layer's Amazon
     * EBS volumes. 
     */
    override fun volumeConfigurations(volumeConfigurations: List<Any>) {
      cdkBuilder.volumeConfigurations(volumeConfigurations)
    }

    /**
     * A `VolumeConfigurations` object that describes the layer's Amazon EBS volumes.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-layer.html#cfn-opsworks-layer-volumeconfigurations)
     * @param volumeConfigurations A `VolumeConfigurations` object that describes the layer's Amazon
     * EBS volumes. 
     */
    override fun volumeConfigurations(vararg volumeConfigurations: Any): Unit =
        volumeConfigurations(volumeConfigurations.toList())

    public fun build(): software.amazon.awscdk.services.opsworks.CfnLayer = cdkBuilder.build()
  }

  public companion object {
    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnLayer {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnLayer(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.opsworks.CfnLayer): CfnLayer =
        CfnLayer(cdkObject)

    internal fun unwrap(wrapped: CfnLayer): software.amazon.awscdk.services.opsworks.CfnLayer =
        wrapped.cdkObject
  }

  public interface AutoScalingThresholdsProperty {
    /**
     * The CPU utilization threshold, as a percent of the available CPU.
     *
     * A value of -1 disables the threshold.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-layer-autoscalingthresholds.html#cfn-opsworks-layer-autoscalingthresholds-cputhreshold)
     */
    public fun cpuThreshold(): Number? = unwrap(this).getCpuThreshold()

    /**
     * The amount of time (in minutes) after a scaling event occurs that AWS OpsWorks Stacks should
     * ignore metrics and suppress additional scaling events.
     *
     * For example, AWS OpsWorks Stacks adds new instances following an upscaling event but the
     * instances won't start reducing the load until they have been booted and configured. There is no
     * point in raising additional scaling events during that operation, which typically takes several
     * minutes. `IgnoreMetricsTime` allows you to direct AWS OpsWorks Stacks to suppress scaling events
     * long enough to get the new instances online.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-layer-autoscalingthresholds.html#cfn-opsworks-layer-autoscalingthresholds-ignoremetricstime)
     */
    public fun ignoreMetricsTime(): Number? = unwrap(this).getIgnoreMetricsTime()

    /**
     * The number of instances to add or remove when the load exceeds a threshold.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-layer-autoscalingthresholds.html#cfn-opsworks-layer-autoscalingthresholds-instancecount)
     */
    public fun instanceCount(): Number? = unwrap(this).getInstanceCount()

    /**
     * The load threshold.
     *
     * A value of -1 disables the threshold. For more information about how load is computed, see
     * [Load
     * (computing)](https://docs.aws.amazon.com/http://en.wikipedia.org/wiki/Load_%28computing%29) .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-layer-autoscalingthresholds.html#cfn-opsworks-layer-autoscalingthresholds-loadthreshold)
     */
    public fun loadThreshold(): Number? = unwrap(this).getLoadThreshold()

    /**
     * The memory utilization threshold, as a percent of the available memory.
     *
     * A value of -1 disables the threshold.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-layer-autoscalingthresholds.html#cfn-opsworks-layer-autoscalingthresholds-memorythreshold)
     */
    public fun memoryThreshold(): Number? = unwrap(this).getMemoryThreshold()

    /**
     * The amount of time, in minutes, that the load must exceed a threshold before more instances
     * are added or removed.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-layer-autoscalingthresholds.html#cfn-opsworks-layer-autoscalingthresholds-thresholdswaittime)
     */
    public fun thresholdsWaitTime(): Number? = unwrap(this).getThresholdsWaitTime()

    /**
     * A builder for [AutoScalingThresholdsProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param cpuThreshold The CPU utilization threshold, as a percent of the available CPU.
       * A value of -1 disables the threshold.
       */
      public fun cpuThreshold(cpuThreshold: Number)

      /**
       * @param ignoreMetricsTime The amount of time (in minutes) after a scaling event occurs that
       * AWS OpsWorks Stacks should ignore metrics and suppress additional scaling events.
       * For example, AWS OpsWorks Stacks adds new instances following an upscaling event but the
       * instances won't start reducing the load until they have been booted and configured. There is
       * no point in raising additional scaling events during that operation, which typically takes
       * several minutes. `IgnoreMetricsTime` allows you to direct AWS OpsWorks Stacks to suppress
       * scaling events long enough to get the new instances online.
       */
      public fun ignoreMetricsTime(ignoreMetricsTime: Number)

      /**
       * @param instanceCount The number of instances to add or remove when the load exceeds a
       * threshold.
       */
      public fun instanceCount(instanceCount: Number)

      /**
       * @param loadThreshold The load threshold.
       * A value of -1 disables the threshold. For more information about how load is computed, see
       * [Load
       * (computing)](https://docs.aws.amazon.com/http://en.wikipedia.org/wiki/Load_%28computing%29) .
       */
      public fun loadThreshold(loadThreshold: Number)

      /**
       * @param memoryThreshold The memory utilization threshold, as a percent of the available
       * memory.
       * A value of -1 disables the threshold.
       */
      public fun memoryThreshold(memoryThreshold: Number)

      /**
       * @param thresholdsWaitTime The amount of time, in minutes, that the load must exceed a
       * threshold before more instances are added or removed.
       */
      public fun thresholdsWaitTime(thresholdsWaitTime: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.opsworks.CfnLayer.AutoScalingThresholdsProperty.Builder =
          software.amazon.awscdk.services.opsworks.CfnLayer.AutoScalingThresholdsProperty.builder()

      /**
       * @param cpuThreshold The CPU utilization threshold, as a percent of the available CPU.
       * A value of -1 disables the threshold.
       */
      override fun cpuThreshold(cpuThreshold: Number) {
        cdkBuilder.cpuThreshold(cpuThreshold)
      }

      /**
       * @param ignoreMetricsTime The amount of time (in minutes) after a scaling event occurs that
       * AWS OpsWorks Stacks should ignore metrics and suppress additional scaling events.
       * For example, AWS OpsWorks Stacks adds new instances following an upscaling event but the
       * instances won't start reducing the load until they have been booted and configured. There is
       * no point in raising additional scaling events during that operation, which typically takes
       * several minutes. `IgnoreMetricsTime` allows you to direct AWS OpsWorks Stacks to suppress
       * scaling events long enough to get the new instances online.
       */
      override fun ignoreMetricsTime(ignoreMetricsTime: Number) {
        cdkBuilder.ignoreMetricsTime(ignoreMetricsTime)
      }

      /**
       * @param instanceCount The number of instances to add or remove when the load exceeds a
       * threshold.
       */
      override fun instanceCount(instanceCount: Number) {
        cdkBuilder.instanceCount(instanceCount)
      }

      /**
       * @param loadThreshold The load threshold.
       * A value of -1 disables the threshold. For more information about how load is computed, see
       * [Load
       * (computing)](https://docs.aws.amazon.com/http://en.wikipedia.org/wiki/Load_%28computing%29) .
       */
      override fun loadThreshold(loadThreshold: Number) {
        cdkBuilder.loadThreshold(loadThreshold)
      }

      /**
       * @param memoryThreshold The memory utilization threshold, as a percent of the available
       * memory.
       * A value of -1 disables the threshold.
       */
      override fun memoryThreshold(memoryThreshold: Number) {
        cdkBuilder.memoryThreshold(memoryThreshold)
      }

      /**
       * @param thresholdsWaitTime The amount of time, in minutes, that the load must exceed a
       * threshold before more instances are added or removed.
       */
      override fun thresholdsWaitTime(thresholdsWaitTime: Number) {
        cdkBuilder.thresholdsWaitTime(thresholdsWaitTime)
      }

      public fun build():
          software.amazon.awscdk.services.opsworks.CfnLayer.AutoScalingThresholdsProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.opsworks.CfnLayer.AutoScalingThresholdsProperty,
    ) : CdkObject(cdkObject), AutoScalingThresholdsProperty {
      /**
       * The CPU utilization threshold, as a percent of the available CPU.
       *
       * A value of -1 disables the threshold.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-layer-autoscalingthresholds.html#cfn-opsworks-layer-autoscalingthresholds-cputhreshold)
       */
      override fun cpuThreshold(): Number? = unwrap(this).getCpuThreshold()

      /**
       * The amount of time (in minutes) after a scaling event occurs that AWS OpsWorks Stacks
       * should ignore metrics and suppress additional scaling events.
       *
       * For example, AWS OpsWorks Stacks adds new instances following an upscaling event but the
       * instances won't start reducing the load until they have been booted and configured. There is
       * no point in raising additional scaling events during that operation, which typically takes
       * several minutes. `IgnoreMetricsTime` allows you to direct AWS OpsWorks Stacks to suppress
       * scaling events long enough to get the new instances online.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-layer-autoscalingthresholds.html#cfn-opsworks-layer-autoscalingthresholds-ignoremetricstime)
       */
      override fun ignoreMetricsTime(): Number? = unwrap(this).getIgnoreMetricsTime()

      /**
       * The number of instances to add or remove when the load exceeds a threshold.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-layer-autoscalingthresholds.html#cfn-opsworks-layer-autoscalingthresholds-instancecount)
       */
      override fun instanceCount(): Number? = unwrap(this).getInstanceCount()

      /**
       * The load threshold.
       *
       * A value of -1 disables the threshold. For more information about how load is computed, see
       * [Load
       * (computing)](https://docs.aws.amazon.com/http://en.wikipedia.org/wiki/Load_%28computing%29) .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-layer-autoscalingthresholds.html#cfn-opsworks-layer-autoscalingthresholds-loadthreshold)
       */
      override fun loadThreshold(): Number? = unwrap(this).getLoadThreshold()

      /**
       * The memory utilization threshold, as a percent of the available memory.
       *
       * A value of -1 disables the threshold.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-layer-autoscalingthresholds.html#cfn-opsworks-layer-autoscalingthresholds-memorythreshold)
       */
      override fun memoryThreshold(): Number? = unwrap(this).getMemoryThreshold()

      /**
       * The amount of time, in minutes, that the load must exceed a threshold before more instances
       * are added or removed.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-layer-autoscalingthresholds.html#cfn-opsworks-layer-autoscalingthresholds-thresholdswaittime)
       */
      override fun thresholdsWaitTime(): Number? = unwrap(this).getThresholdsWaitTime()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): AutoScalingThresholdsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.opsworks.CfnLayer.AutoScalingThresholdsProperty):
          AutoScalingThresholdsProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: AutoScalingThresholdsProperty):
          software.amazon.awscdk.services.opsworks.CfnLayer.AutoScalingThresholdsProperty = (wrapped
          as CdkObject).cdkObject as
          software.amazon.awscdk.services.opsworks.CfnLayer.AutoScalingThresholdsProperty
    }
  }

  public interface LifecycleEventConfigurationProperty {
    /**
     * The Shutdown event configuration.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-layer-lifecycleeventconfiguration.html#cfn-opsworks-layer-lifecycleeventconfiguration-shutdowneventconfiguration)
     */
    public fun shutdownEventConfiguration(): Any? = unwrap(this).getShutdownEventConfiguration()

    /**
     * A builder for [LifecycleEventConfigurationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param shutdownEventConfiguration The Shutdown event configuration.
       */
      public fun shutdownEventConfiguration(shutdownEventConfiguration: IResolvable)

      /**
       * @param shutdownEventConfiguration The Shutdown event configuration.
       */
      public
          fun shutdownEventConfiguration(shutdownEventConfiguration: ShutdownEventConfigurationProperty)

      /**
       * @param shutdownEventConfiguration The Shutdown event configuration.
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("623d73a9a99a95e14394bdc7c031e0b34a162762be601099054abf7bb03a2646")
      public
          fun shutdownEventConfiguration(shutdownEventConfiguration: ShutdownEventConfigurationProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.opsworks.CfnLayer.LifecycleEventConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.opsworks.CfnLayer.LifecycleEventConfigurationProperty.builder()

      /**
       * @param shutdownEventConfiguration The Shutdown event configuration.
       */
      override fun shutdownEventConfiguration(shutdownEventConfiguration: IResolvable) {
        cdkBuilder.shutdownEventConfiguration(shutdownEventConfiguration.let(IResolvable::unwrap))
      }

      /**
       * @param shutdownEventConfiguration The Shutdown event configuration.
       */
      override
          fun shutdownEventConfiguration(shutdownEventConfiguration: ShutdownEventConfigurationProperty) {
        cdkBuilder.shutdownEventConfiguration(shutdownEventConfiguration.let(ShutdownEventConfigurationProperty::unwrap))
      }

      /**
       * @param shutdownEventConfiguration The Shutdown event configuration.
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("623d73a9a99a95e14394bdc7c031e0b34a162762be601099054abf7bb03a2646")
      override
          fun shutdownEventConfiguration(shutdownEventConfiguration: ShutdownEventConfigurationProperty.Builder.() -> Unit):
          Unit =
          shutdownEventConfiguration(ShutdownEventConfigurationProperty(shutdownEventConfiguration))

      public fun build():
          software.amazon.awscdk.services.opsworks.CfnLayer.LifecycleEventConfigurationProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.opsworks.CfnLayer.LifecycleEventConfigurationProperty,
    ) : CdkObject(cdkObject), LifecycleEventConfigurationProperty {
      /**
       * The Shutdown event configuration.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-layer-lifecycleeventconfiguration.html#cfn-opsworks-layer-lifecycleeventconfiguration-shutdowneventconfiguration)
       */
      override fun shutdownEventConfiguration(): Any? = unwrap(this).getShutdownEventConfiguration()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          LifecycleEventConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.opsworks.CfnLayer.LifecycleEventConfigurationProperty):
          LifecycleEventConfigurationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: LifecycleEventConfigurationProperty):
          software.amazon.awscdk.services.opsworks.CfnLayer.LifecycleEventConfigurationProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.opsworks.CfnLayer.LifecycleEventConfigurationProperty
    }
  }

  public interface RecipesProperty {
    /**
     * An array of custom recipe names to be run following a `configure` event.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-layer-recipes.html#cfn-opsworks-layer-recipes-configure)
     */
    public fun configure(): List<String> = unwrap(this).getConfigure() ?: emptyList()

    /**
     * An array of custom recipe names to be run following a `deploy` event.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-layer-recipes.html#cfn-opsworks-layer-recipes-deploy)
     */
    public fun deploy(): List<String> = unwrap(this).getDeploy() ?: emptyList()

    /**
     * An array of custom recipe names to be run following a `setup` event.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-layer-recipes.html#cfn-opsworks-layer-recipes-setup)
     */
    public fun setup(): List<String> = unwrap(this).getSetup() ?: emptyList()

    /**
     * An array of custom recipe names to be run following a `shutdown` event.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-layer-recipes.html#cfn-opsworks-layer-recipes-shutdown)
     */
    public fun shutdown(): List<String> = unwrap(this).getShutdown() ?: emptyList()

    /**
     * An array of custom recipe names to be run following a `undeploy` event.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-layer-recipes.html#cfn-opsworks-layer-recipes-undeploy)
     */
    public fun undeploy(): List<String> = unwrap(this).getUndeploy() ?: emptyList()

    /**
     * A builder for [RecipesProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param configure An array of custom recipe names to be run following a `configure` event.
       */
      public fun configure(configure: List<String>)

      /**
       * @param configure An array of custom recipe names to be run following a `configure` event.
       */
      public fun configure(vararg configure: String)

      /**
       * @param deploy An array of custom recipe names to be run following a `deploy` event.
       */
      public fun deploy(deploy: List<String>)

      /**
       * @param deploy An array of custom recipe names to be run following a `deploy` event.
       */
      public fun deploy(vararg deploy: String)

      /**
       * @param shutdown An array of custom recipe names to be run following a `shutdown` event.
       */
      public fun shutdown(shutdown: List<String>)

      /**
       * @param shutdown An array of custom recipe names to be run following a `shutdown` event.
       */
      public fun shutdown(vararg shutdown: String)

      /**
       * @param undeploy An array of custom recipe names to be run following a `undeploy` event.
       */
      public fun undeploy(undeploy: List<String>)

      /**
       * @param undeploy An array of custom recipe names to be run following a `undeploy` event.
       */
      public fun undeploy(vararg undeploy: String)

      /**
       * @param setup An array of custom recipe names to be run following a `setup` event.
       */
      public fun up(setup: List<String>)

      /**
       * @param setup An array of custom recipe names to be run following a `setup` event.
       */
      public fun up(vararg setup: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.opsworks.CfnLayer.RecipesProperty.Builder =
          software.amazon.awscdk.services.opsworks.CfnLayer.RecipesProperty.builder()

      /**
       * @param configure An array of custom recipe names to be run following a `configure` event.
       */
      override fun configure(configure: List<String>) {
        cdkBuilder.configure(configure)
      }

      /**
       * @param configure An array of custom recipe names to be run following a `configure` event.
       */
      override fun configure(vararg configure: String): Unit = configure(configure.toList())

      /**
       * @param deploy An array of custom recipe names to be run following a `deploy` event.
       */
      override fun deploy(deploy: List<String>) {
        cdkBuilder.deploy(deploy)
      }

      /**
       * @param deploy An array of custom recipe names to be run following a `deploy` event.
       */
      override fun deploy(vararg deploy: String): Unit = deploy(deploy.toList())

      /**
       * @param shutdown An array of custom recipe names to be run following a `shutdown` event.
       */
      override fun shutdown(shutdown: List<String>) {
        cdkBuilder.shutdown(shutdown)
      }

      /**
       * @param shutdown An array of custom recipe names to be run following a `shutdown` event.
       */
      override fun shutdown(vararg shutdown: String): Unit = shutdown(shutdown.toList())

      /**
       * @param undeploy An array of custom recipe names to be run following a `undeploy` event.
       */
      override fun undeploy(undeploy: List<String>) {
        cdkBuilder.undeploy(undeploy)
      }

      /**
       * @param undeploy An array of custom recipe names to be run following a `undeploy` event.
       */
      override fun undeploy(vararg undeploy: String): Unit = undeploy(undeploy.toList())

      /**
       * @param setup An array of custom recipe names to be run following a `setup` event.
       */
      override fun up(setup: List<String>) {
        cdkBuilder.setup(setup)
      }

      /**
       * @param setup An array of custom recipe names to be run following a `setup` event.
       */
      override fun up(vararg setup: String): Unit = up(setup.toList())

      public fun build(): software.amazon.awscdk.services.opsworks.CfnLayer.RecipesProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject: software.amazon.awscdk.services.opsworks.CfnLayer.RecipesProperty,
    ) : CdkObject(cdkObject), RecipesProperty {
      /**
       * An array of custom recipe names to be run following a `configure` event.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-layer-recipes.html#cfn-opsworks-layer-recipes-configure)
       */
      override fun configure(): List<String> = unwrap(this).getConfigure() ?: emptyList()

      /**
       * An array of custom recipe names to be run following a `deploy` event.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-layer-recipes.html#cfn-opsworks-layer-recipes-deploy)
       */
      override fun deploy(): List<String> = unwrap(this).getDeploy() ?: emptyList()

      /**
       * An array of custom recipe names to be run following a `setup` event.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-layer-recipes.html#cfn-opsworks-layer-recipes-setup)
       */
      override fun setup(): List<String> = unwrap(this).getSetup() ?: emptyList()

      /**
       * An array of custom recipe names to be run following a `shutdown` event.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-layer-recipes.html#cfn-opsworks-layer-recipes-shutdown)
       */
      override fun shutdown(): List<String> = unwrap(this).getShutdown() ?: emptyList()

      /**
       * An array of custom recipe names to be run following a `undeploy` event.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-layer-recipes.html#cfn-opsworks-layer-recipes-undeploy)
       */
      override fun undeploy(): List<String> = unwrap(this).getUndeploy() ?: emptyList()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): RecipesProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.opsworks.CfnLayer.RecipesProperty):
          RecipesProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: RecipesProperty):
          software.amazon.awscdk.services.opsworks.CfnLayer.RecipesProperty = (wrapped as
          CdkObject).cdkObject as software.amazon.awscdk.services.opsworks.CfnLayer.RecipesProperty
    }
  }

  public interface LoadBasedAutoScalingProperty {
    /**
     * An `AutoScalingThresholds` object that describes the downscaling configuration, which defines
     * how and when AWS OpsWorks Stacks reduces the number of instances.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-layer-loadbasedautoscaling.html#cfn-opsworks-layer-loadbasedautoscaling-downscaling)
     */
    public fun downScaling(): Any? = unwrap(this).getDownScaling()

    /**
     * Whether load-based auto scaling is enabled for the layer.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-layer-loadbasedautoscaling.html#cfn-opsworks-layer-loadbasedautoscaling-enable)
     */
    public fun enable(): Any? = unwrap(this).getEnable()

    /**
     * An `AutoScalingThresholds` object that describes the upscaling configuration, which defines
     * how and when AWS OpsWorks Stacks increases the number of instances.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-layer-loadbasedautoscaling.html#cfn-opsworks-layer-loadbasedautoscaling-upscaling)
     */
    public fun upScaling(): Any? = unwrap(this).getUpScaling()

    /**
     * A builder for [LoadBasedAutoScalingProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param downScaling An `AutoScalingThresholds` object that describes the downscaling
       * configuration, which defines how and when AWS OpsWorks Stacks reduces the number of instances.
       */
      public fun downScaling(downScaling: IResolvable)

      /**
       * @param downScaling An `AutoScalingThresholds` object that describes the downscaling
       * configuration, which defines how and when AWS OpsWorks Stacks reduces the number of instances.
       */
      public fun downScaling(downScaling: AutoScalingThresholdsProperty)

      /**
       * @param downScaling An `AutoScalingThresholds` object that describes the downscaling
       * configuration, which defines how and when AWS OpsWorks Stacks reduces the number of instances.
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("f9cda7a5b9775e3f009d9a6d189c785654f2ecd2ae9d640b1d53e089103a9535")
      public fun downScaling(downScaling: AutoScalingThresholdsProperty.Builder.() -> Unit)

      /**
       * @param enable Whether load-based auto scaling is enabled for the layer.
       */
      public fun enable(enable: Boolean)

      /**
       * @param enable Whether load-based auto scaling is enabled for the layer.
       */
      public fun enable(enable: IResolvable)

      /**
       * @param upScaling An `AutoScalingThresholds` object that describes the upscaling
       * configuration, which defines how and when AWS OpsWorks Stacks increases the number of
       * instances.
       */
      public fun upScaling(upScaling: IResolvable)

      /**
       * @param upScaling An `AutoScalingThresholds` object that describes the upscaling
       * configuration, which defines how and when AWS OpsWorks Stacks increases the number of
       * instances.
       */
      public fun upScaling(upScaling: AutoScalingThresholdsProperty)

      /**
       * @param upScaling An `AutoScalingThresholds` object that describes the upscaling
       * configuration, which defines how and when AWS OpsWorks Stacks increases the number of
       * instances.
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("e98bf6335bbca94e6f468a1b112e8bd884eff09cac00c5118212d2e46a79fce4")
      public fun upScaling(upScaling: AutoScalingThresholdsProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.opsworks.CfnLayer.LoadBasedAutoScalingProperty.Builder =
          software.amazon.awscdk.services.opsworks.CfnLayer.LoadBasedAutoScalingProperty.builder()

      /**
       * @param downScaling An `AutoScalingThresholds` object that describes the downscaling
       * configuration, which defines how and when AWS OpsWorks Stacks reduces the number of instances.
       */
      override fun downScaling(downScaling: IResolvable) {
        cdkBuilder.downScaling(downScaling.let(IResolvable::unwrap))
      }

      /**
       * @param downScaling An `AutoScalingThresholds` object that describes the downscaling
       * configuration, which defines how and when AWS OpsWorks Stacks reduces the number of instances.
       */
      override fun downScaling(downScaling: AutoScalingThresholdsProperty) {
        cdkBuilder.downScaling(downScaling.let(AutoScalingThresholdsProperty::unwrap))
      }

      /**
       * @param downScaling An `AutoScalingThresholds` object that describes the downscaling
       * configuration, which defines how and when AWS OpsWorks Stacks reduces the number of instances.
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("f9cda7a5b9775e3f009d9a6d189c785654f2ecd2ae9d640b1d53e089103a9535")
      override fun downScaling(downScaling: AutoScalingThresholdsProperty.Builder.() -> Unit): Unit
          = downScaling(AutoScalingThresholdsProperty(downScaling))

      /**
       * @param enable Whether load-based auto scaling is enabled for the layer.
       */
      override fun enable(enable: Boolean) {
        cdkBuilder.enable(enable)
      }

      /**
       * @param enable Whether load-based auto scaling is enabled for the layer.
       */
      override fun enable(enable: IResolvable) {
        cdkBuilder.enable(enable.let(IResolvable::unwrap))
      }

      /**
       * @param upScaling An `AutoScalingThresholds` object that describes the upscaling
       * configuration, which defines how and when AWS OpsWorks Stacks increases the number of
       * instances.
       */
      override fun upScaling(upScaling: IResolvable) {
        cdkBuilder.upScaling(upScaling.let(IResolvable::unwrap))
      }

      /**
       * @param upScaling An `AutoScalingThresholds` object that describes the upscaling
       * configuration, which defines how and when AWS OpsWorks Stacks increases the number of
       * instances.
       */
      override fun upScaling(upScaling: AutoScalingThresholdsProperty) {
        cdkBuilder.upScaling(upScaling.let(AutoScalingThresholdsProperty::unwrap))
      }

      /**
       * @param upScaling An `AutoScalingThresholds` object that describes the upscaling
       * configuration, which defines how and when AWS OpsWorks Stacks increases the number of
       * instances.
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("e98bf6335bbca94e6f468a1b112e8bd884eff09cac00c5118212d2e46a79fce4")
      override fun upScaling(upScaling: AutoScalingThresholdsProperty.Builder.() -> Unit): Unit =
          upScaling(AutoScalingThresholdsProperty(upScaling))

      public fun build():
          software.amazon.awscdk.services.opsworks.CfnLayer.LoadBasedAutoScalingProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.opsworks.CfnLayer.LoadBasedAutoScalingProperty,
    ) : CdkObject(cdkObject), LoadBasedAutoScalingProperty {
      /**
       * An `AutoScalingThresholds` object that describes the downscaling configuration, which
       * defines how and when AWS OpsWorks Stacks reduces the number of instances.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-layer-loadbasedautoscaling.html#cfn-opsworks-layer-loadbasedautoscaling-downscaling)
       */
      override fun downScaling(): Any? = unwrap(this).getDownScaling()

      /**
       * Whether load-based auto scaling is enabled for the layer.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-layer-loadbasedautoscaling.html#cfn-opsworks-layer-loadbasedautoscaling-enable)
       */
      override fun enable(): Any? = unwrap(this).getEnable()

      /**
       * An `AutoScalingThresholds` object that describes the upscaling configuration, which defines
       * how and when AWS OpsWorks Stacks increases the number of instances.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-layer-loadbasedautoscaling.html#cfn-opsworks-layer-loadbasedautoscaling-upscaling)
       */
      override fun upScaling(): Any? = unwrap(this).getUpScaling()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): LoadBasedAutoScalingProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.opsworks.CfnLayer.LoadBasedAutoScalingProperty):
          LoadBasedAutoScalingProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: LoadBasedAutoScalingProperty):
          software.amazon.awscdk.services.opsworks.CfnLayer.LoadBasedAutoScalingProperty = (wrapped
          as CdkObject).cdkObject as
          software.amazon.awscdk.services.opsworks.CfnLayer.LoadBasedAutoScalingProperty
    }
  }

  public interface VolumeConfigurationProperty {
    /**
     * Specifies whether an Amazon EBS volume is encrypted.
     *
     * For more information, see [Amazon EBS
     * Encryption](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/EBSEncryption.html) .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-layer-volumeconfiguration.html#cfn-opsworks-layer-volumeconfiguration-encrypted)
     */
    public fun encrypted(): Any? = unwrap(this).getEncrypted()

    /**
     * The number of I/O operations per second (IOPS) to provision for the volume.
     *
     * For PIOPS volumes, the IOPS per disk.
     *
     * If you specify `io1` for the volume type, you must specify this property.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-layer-volumeconfiguration.html#cfn-opsworks-layer-volumeconfiguration-iops)
     */
    public fun iops(): Number? = unwrap(this).getIops()

    /**
     * The volume mount point.
     *
     * For example "/dev/sdh".
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-layer-volumeconfiguration.html#cfn-opsworks-layer-volumeconfiguration-mountpoint)
     */
    public fun mountPoint(): String? = unwrap(this).getMountPoint()

    /**
     * The number of disks in the volume.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-layer-volumeconfiguration.html#cfn-opsworks-layer-volumeconfiguration-numberofdisks)
     */
    public fun numberOfDisks(): Number? = unwrap(this).getNumberOfDisks()

    /**
     * The volume [RAID
     * level](https://docs.aws.amazon.com/http://en.wikipedia.org/wiki/Standard_RAID_levels) .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-layer-volumeconfiguration.html#cfn-opsworks-layer-volumeconfiguration-raidlevel)
     */
    public fun raidLevel(): Number? = unwrap(this).getRaidLevel()

    /**
     * The volume size.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-layer-volumeconfiguration.html#cfn-opsworks-layer-volumeconfiguration-size)
     */
    public fun size(): Number? = unwrap(this).getSize()

    /**
     * The volume type. For more information, see [Amazon EBS Volume
     * Types](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/EBSVolumeTypes.html) .
     *
     * * `standard` - Magnetic. Magnetic volumes must have a minimum size of 1 GiB and a maximum
     * size of 1024 GiB.
     * * `io1` - Provisioned IOPS (SSD). PIOPS volumes must have a minimum size of 4 GiB and a
     * maximum size of 16384 GiB.
     * * `gp2` - General Purpose (SSD). General purpose volumes must have a minimum size of 1 GiB
     * and a maximum size of 16384 GiB.
     * * `st1` - Throughput Optimized hard disk drive (HDD). Throughput optimized HDD volumes must
     * have a minimum size of 500 GiB and a maximum size of 16384 GiB.
     * * `sc1` - Cold HDD. Cold HDD volumes must have a minimum size of 500 GiB and a maximum size
     * of 16384 GiB.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-layer-volumeconfiguration.html#cfn-opsworks-layer-volumeconfiguration-volumetype)
     */
    public fun volumeType(): String? = unwrap(this).getVolumeType()

    /**
     * A builder for [VolumeConfigurationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param encrypted Specifies whether an Amazon EBS volume is encrypted.
       * For more information, see [Amazon EBS
       * Encryption](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/EBSEncryption.html) .
       */
      public fun encrypted(encrypted: Boolean)

      /**
       * @param encrypted Specifies whether an Amazon EBS volume is encrypted.
       * For more information, see [Amazon EBS
       * Encryption](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/EBSEncryption.html) .
       */
      public fun encrypted(encrypted: IResolvable)

      /**
       * @param iops The number of I/O operations per second (IOPS) to provision for the volume.
       * For PIOPS volumes, the IOPS per disk.
       *
       * If you specify `io1` for the volume type, you must specify this property.
       */
      public fun iops(iops: Number)

      /**
       * @param mountPoint The volume mount point.
       * For example "/dev/sdh".
       */
      public fun mountPoint(mountPoint: String)

      /**
       * @param numberOfDisks The number of disks in the volume.
       */
      public fun numberOfDisks(numberOfDisks: Number)

      /**
       * @param raidLevel The volume [RAID
       * level](https://docs.aws.amazon.com/http://en.wikipedia.org/wiki/Standard_RAID_levels) .
       */
      public fun raidLevel(raidLevel: Number)

      /**
       * @param size The volume size.
       */
      public fun size(size: Number)

      /**
       * @param volumeType The volume type. For more information, see [Amazon EBS Volume
       * Types](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/EBSVolumeTypes.html) .
       * * `standard` - Magnetic. Magnetic volumes must have a minimum size of 1 GiB and a maximum
       * size of 1024 GiB.
       * * `io1` - Provisioned IOPS (SSD). PIOPS volumes must have a minimum size of 4 GiB and a
       * maximum size of 16384 GiB.
       * * `gp2` - General Purpose (SSD). General purpose volumes must have a minimum size of 1 GiB
       * and a maximum size of 16384 GiB.
       * * `st1` - Throughput Optimized hard disk drive (HDD). Throughput optimized HDD volumes must
       * have a minimum size of 500 GiB and a maximum size of 16384 GiB.
       * * `sc1` - Cold HDD. Cold HDD volumes must have a minimum size of 500 GiB and a maximum size
       * of 16384 GiB.
       */
      public fun volumeType(volumeType: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.opsworks.CfnLayer.VolumeConfigurationProperty.Builder =
          software.amazon.awscdk.services.opsworks.CfnLayer.VolumeConfigurationProperty.builder()

      /**
       * @param encrypted Specifies whether an Amazon EBS volume is encrypted.
       * For more information, see [Amazon EBS
       * Encryption](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/EBSEncryption.html) .
       */
      override fun encrypted(encrypted: Boolean) {
        cdkBuilder.encrypted(encrypted)
      }

      /**
       * @param encrypted Specifies whether an Amazon EBS volume is encrypted.
       * For more information, see [Amazon EBS
       * Encryption](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/EBSEncryption.html) .
       */
      override fun encrypted(encrypted: IResolvable) {
        cdkBuilder.encrypted(encrypted.let(IResolvable::unwrap))
      }

      /**
       * @param iops The number of I/O operations per second (IOPS) to provision for the volume.
       * For PIOPS volumes, the IOPS per disk.
       *
       * If you specify `io1` for the volume type, you must specify this property.
       */
      override fun iops(iops: Number) {
        cdkBuilder.iops(iops)
      }

      /**
       * @param mountPoint The volume mount point.
       * For example "/dev/sdh".
       */
      override fun mountPoint(mountPoint: String) {
        cdkBuilder.mountPoint(mountPoint)
      }

      /**
       * @param numberOfDisks The number of disks in the volume.
       */
      override fun numberOfDisks(numberOfDisks: Number) {
        cdkBuilder.numberOfDisks(numberOfDisks)
      }

      /**
       * @param raidLevel The volume [RAID
       * level](https://docs.aws.amazon.com/http://en.wikipedia.org/wiki/Standard_RAID_levels) .
       */
      override fun raidLevel(raidLevel: Number) {
        cdkBuilder.raidLevel(raidLevel)
      }

      /**
       * @param size The volume size.
       */
      override fun size(size: Number) {
        cdkBuilder.size(size)
      }

      /**
       * @param volumeType The volume type. For more information, see [Amazon EBS Volume
       * Types](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/EBSVolumeTypes.html) .
       * * `standard` - Magnetic. Magnetic volumes must have a minimum size of 1 GiB and a maximum
       * size of 1024 GiB.
       * * `io1` - Provisioned IOPS (SSD). PIOPS volumes must have a minimum size of 4 GiB and a
       * maximum size of 16384 GiB.
       * * `gp2` - General Purpose (SSD). General purpose volumes must have a minimum size of 1 GiB
       * and a maximum size of 16384 GiB.
       * * `st1` - Throughput Optimized hard disk drive (HDD). Throughput optimized HDD volumes must
       * have a minimum size of 500 GiB and a maximum size of 16384 GiB.
       * * `sc1` - Cold HDD. Cold HDD volumes must have a minimum size of 500 GiB and a maximum size
       * of 16384 GiB.
       */
      override fun volumeType(volumeType: String) {
        cdkBuilder.volumeType(volumeType)
      }

      public fun build():
          software.amazon.awscdk.services.opsworks.CfnLayer.VolumeConfigurationProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.opsworks.CfnLayer.VolumeConfigurationProperty,
    ) : CdkObject(cdkObject), VolumeConfigurationProperty {
      /**
       * Specifies whether an Amazon EBS volume is encrypted.
       *
       * For more information, see [Amazon EBS
       * Encryption](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/EBSEncryption.html) .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-layer-volumeconfiguration.html#cfn-opsworks-layer-volumeconfiguration-encrypted)
       */
      override fun encrypted(): Any? = unwrap(this).getEncrypted()

      /**
       * The number of I/O operations per second (IOPS) to provision for the volume.
       *
       * For PIOPS volumes, the IOPS per disk.
       *
       * If you specify `io1` for the volume type, you must specify this property.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-layer-volumeconfiguration.html#cfn-opsworks-layer-volumeconfiguration-iops)
       */
      override fun iops(): Number? = unwrap(this).getIops()

      /**
       * The volume mount point.
       *
       * For example "/dev/sdh".
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-layer-volumeconfiguration.html#cfn-opsworks-layer-volumeconfiguration-mountpoint)
       */
      override fun mountPoint(): String? = unwrap(this).getMountPoint()

      /**
       * The number of disks in the volume.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-layer-volumeconfiguration.html#cfn-opsworks-layer-volumeconfiguration-numberofdisks)
       */
      override fun numberOfDisks(): Number? = unwrap(this).getNumberOfDisks()

      /**
       * The volume [RAID
       * level](https://docs.aws.amazon.com/http://en.wikipedia.org/wiki/Standard_RAID_levels) .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-layer-volumeconfiguration.html#cfn-opsworks-layer-volumeconfiguration-raidlevel)
       */
      override fun raidLevel(): Number? = unwrap(this).getRaidLevel()

      /**
       * The volume size.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-layer-volumeconfiguration.html#cfn-opsworks-layer-volumeconfiguration-size)
       */
      override fun size(): Number? = unwrap(this).getSize()

      /**
       * The volume type. For more information, see [Amazon EBS Volume
       * Types](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/EBSVolumeTypes.html) .
       *
       * * `standard` - Magnetic. Magnetic volumes must have a minimum size of 1 GiB and a maximum
       * size of 1024 GiB.
       * * `io1` - Provisioned IOPS (SSD). PIOPS volumes must have a minimum size of 4 GiB and a
       * maximum size of 16384 GiB.
       * * `gp2` - General Purpose (SSD). General purpose volumes must have a minimum size of 1 GiB
       * and a maximum size of 16384 GiB.
       * * `st1` - Throughput Optimized hard disk drive (HDD). Throughput optimized HDD volumes must
       * have a minimum size of 500 GiB and a maximum size of 16384 GiB.
       * * `sc1` - Cold HDD. Cold HDD volumes must have a minimum size of 500 GiB and a maximum size
       * of 16384 GiB.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-layer-volumeconfiguration.html#cfn-opsworks-layer-volumeconfiguration-volumetype)
       */
      override fun volumeType(): String? = unwrap(this).getVolumeType()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): VolumeConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.opsworks.CfnLayer.VolumeConfigurationProperty):
          VolumeConfigurationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: VolumeConfigurationProperty):
          software.amazon.awscdk.services.opsworks.CfnLayer.VolumeConfigurationProperty = (wrapped
          as CdkObject).cdkObject as
          software.amazon.awscdk.services.opsworks.CfnLayer.VolumeConfigurationProperty
    }
  }

  public interface ShutdownEventConfigurationProperty {
    /**
     * Whether to enable Elastic Load Balancing connection draining.
     *
     * For more information, see [Connection
     * Draining](https://docs.aws.amazon.com/ElasticLoadBalancing/latest/DeveloperGuide/TerminologyandKeyConcepts.html#conn-drain)
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-layer-shutdowneventconfiguration.html#cfn-opsworks-layer-shutdowneventconfiguration-delayuntilelbconnectionsdrained)
     */
    public fun delayUntilElbConnectionsDrained(): Any? =
        unwrap(this).getDelayUntilElbConnectionsDrained()

    /**
     * The time, in seconds, that AWS OpsWorks Stacks waits after triggering a Shutdown event before
     * shutting down an instance.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-layer-shutdowneventconfiguration.html#cfn-opsworks-layer-shutdowneventconfiguration-executiontimeout)
     */
    public fun executionTimeout(): Number? = unwrap(this).getExecutionTimeout()

    /**
     * A builder for [ShutdownEventConfigurationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param delayUntilElbConnectionsDrained Whether to enable Elastic Load Balancing connection
       * draining.
       * For more information, see [Connection
       * Draining](https://docs.aws.amazon.com/ElasticLoadBalancing/latest/DeveloperGuide/TerminologyandKeyConcepts.html#conn-drain)
       */
      public fun delayUntilElbConnectionsDrained(delayUntilElbConnectionsDrained: Boolean)

      /**
       * @param delayUntilElbConnectionsDrained Whether to enable Elastic Load Balancing connection
       * draining.
       * For more information, see [Connection
       * Draining](https://docs.aws.amazon.com/ElasticLoadBalancing/latest/DeveloperGuide/TerminologyandKeyConcepts.html#conn-drain)
       */
      public fun delayUntilElbConnectionsDrained(delayUntilElbConnectionsDrained: IResolvable)

      /**
       * @param executionTimeout The time, in seconds, that AWS OpsWorks Stacks waits after
       * triggering a Shutdown event before shutting down an instance.
       */
      public fun executionTimeout(executionTimeout: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.opsworks.CfnLayer.ShutdownEventConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.opsworks.CfnLayer.ShutdownEventConfigurationProperty.builder()

      /**
       * @param delayUntilElbConnectionsDrained Whether to enable Elastic Load Balancing connection
       * draining.
       * For more information, see [Connection
       * Draining](https://docs.aws.amazon.com/ElasticLoadBalancing/latest/DeveloperGuide/TerminologyandKeyConcepts.html#conn-drain)
       */
      override fun delayUntilElbConnectionsDrained(delayUntilElbConnectionsDrained: Boolean) {
        cdkBuilder.delayUntilElbConnectionsDrained(delayUntilElbConnectionsDrained)
      }

      /**
       * @param delayUntilElbConnectionsDrained Whether to enable Elastic Load Balancing connection
       * draining.
       * For more information, see [Connection
       * Draining](https://docs.aws.amazon.com/ElasticLoadBalancing/latest/DeveloperGuide/TerminologyandKeyConcepts.html#conn-drain)
       */
      override fun delayUntilElbConnectionsDrained(delayUntilElbConnectionsDrained: IResolvable) {
        cdkBuilder.delayUntilElbConnectionsDrained(delayUntilElbConnectionsDrained.let(IResolvable::unwrap))
      }

      /**
       * @param executionTimeout The time, in seconds, that AWS OpsWorks Stacks waits after
       * triggering a Shutdown event before shutting down an instance.
       */
      override fun executionTimeout(executionTimeout: Number) {
        cdkBuilder.executionTimeout(executionTimeout)
      }

      public fun build():
          software.amazon.awscdk.services.opsworks.CfnLayer.ShutdownEventConfigurationProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.opsworks.CfnLayer.ShutdownEventConfigurationProperty,
    ) : CdkObject(cdkObject), ShutdownEventConfigurationProperty {
      /**
       * Whether to enable Elastic Load Balancing connection draining.
       *
       * For more information, see [Connection
       * Draining](https://docs.aws.amazon.com/ElasticLoadBalancing/latest/DeveloperGuide/TerminologyandKeyConcepts.html#conn-drain)
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-layer-shutdowneventconfiguration.html#cfn-opsworks-layer-shutdowneventconfiguration-delayuntilelbconnectionsdrained)
       */
      override fun delayUntilElbConnectionsDrained(): Any? =
          unwrap(this).getDelayUntilElbConnectionsDrained()

      /**
       * The time, in seconds, that AWS OpsWorks Stacks waits after triggering a Shutdown event
       * before shutting down an instance.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-layer-shutdowneventconfiguration.html#cfn-opsworks-layer-shutdowneventconfiguration-executiontimeout)
       */
      override fun executionTimeout(): Number? = unwrap(this).getExecutionTimeout()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          ShutdownEventConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.opsworks.CfnLayer.ShutdownEventConfigurationProperty):
          ShutdownEventConfigurationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ShutdownEventConfigurationProperty):
          software.amazon.awscdk.services.opsworks.CfnLayer.ShutdownEventConfigurationProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.opsworks.CfnLayer.ShutdownEventConfigurationProperty
    }
  }
}
