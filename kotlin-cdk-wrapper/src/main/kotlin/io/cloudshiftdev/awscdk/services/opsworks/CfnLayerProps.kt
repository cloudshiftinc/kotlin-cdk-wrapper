@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.opsworks

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.Map
import kotlin.jvm.JvmName

/**
 * Properties for defining a `CfnLayer`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.opsworks.*;
 * Object customJson;
 * CfnLayerProps cfnLayerProps = CfnLayerProps.builder()
 * .autoAssignElasticIps(false)
 * .autoAssignPublicIps(false)
 * .enableAutoHealing(false)
 * .name("name")
 * .shortname("shortname")
 * .stackId("stackId")
 * .type("type")
 * // the properties below are optional
 * .attributes(Map.of(
 * "attributesKey", "attributes"))
 * .customInstanceProfileArn("customInstanceProfileArn")
 * .customJson(customJson)
 * .customRecipes(RecipesProperty.builder()
 * .configure(List.of("configure"))
 * .deploy(List.of("deploy"))
 * .setup(List.of("setup"))
 * .shutdown(List.of("shutdown"))
 * .undeploy(List.of("undeploy"))
 * .build())
 * .customSecurityGroupIds(List.of("customSecurityGroupIds"))
 * .installUpdatesOnBoot(false)
 * .lifecycleEventConfiguration(LifecycleEventConfigurationProperty.builder()
 * .shutdownEventConfiguration(ShutdownEventConfigurationProperty.builder()
 * .delayUntilElbConnectionsDrained(false)
 * .executionTimeout(123)
 * .build())
 * .build())
 * .loadBasedAutoScaling(LoadBasedAutoScalingProperty.builder()
 * .downScaling(AutoScalingThresholdsProperty.builder()
 * .cpuThreshold(123)
 * .ignoreMetricsTime(123)
 * .instanceCount(123)
 * .loadThreshold(123)
 * .memoryThreshold(123)
 * .thresholdsWaitTime(123)
 * .build())
 * .enable(false)
 * .upScaling(AutoScalingThresholdsProperty.builder()
 * .cpuThreshold(123)
 * .ignoreMetricsTime(123)
 * .instanceCount(123)
 * .loadThreshold(123)
 * .memoryThreshold(123)
 * .thresholdsWaitTime(123)
 * .build())
 * .build())
 * .packages(List.of("packages"))
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .useEbsOptimizedInstances(false)
 * .volumeConfigurations(List.of(VolumeConfigurationProperty.builder()
 * .encrypted(false)
 * .iops(123)
 * .mountPoint("mountPoint")
 * .numberOfDisks(123)
 * .raidLevel(123)
 * .size(123)
 * .volumeType("volumeType")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-layer.html)
 */
public interface CfnLayerProps {
  /**
   * One or more user-defined key-value pairs to be added to the stack attributes.
   *
   * To create a cluster layer, set the `EcsClusterArn` attribute to the cluster's ARN.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-layer.html#cfn-opsworks-layer-attributes)
   */
  public fun attributes(): Any? = unwrap(this).getAttributes()

  /**
   * Whether to automatically assign an [Elastic IP
   * address](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/elastic-ip-addresses-eip.html) to the
   * layer's instances. For more information, see [How to Edit a
   * Layer](https://docs.aws.amazon.com/opsworks/latest/userguide/workinglayers-basics-edit.html) .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-layer.html#cfn-opsworks-layer-autoassignelasticips)
   */
  public fun autoAssignElasticIps(): Any

  /**
   * For stacks that are running in a VPC, whether to automatically assign a public IP address to
   * the layer's instances.
   *
   * For more information, see [How to Edit a
   * Layer](https://docs.aws.amazon.com/opsworks/latest/userguide/workinglayers-basics-edit.html) .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-layer.html#cfn-opsworks-layer-autoassignpublicips)
   */
  public fun autoAssignPublicIps(): Any

  /**
   * The ARN of an IAM profile to be used for the layer's EC2 instances.
   *
   * For more information about IAM ARNs, see [Using
   * Identifiers](https://docs.aws.amazon.com/IAM/latest/UserGuide/Using_Identifiers.html) .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-layer.html#cfn-opsworks-layer-custominstanceprofilearn)
   */
  public fun customInstanceProfileArn(): String? = unwrap(this).getCustomInstanceProfileArn()

  /**
   * A JSON-formatted string containing custom stack configuration and deployment attributes to be
   * installed on the layer's instances.
   *
   * For more information, see [Using Custom
   * JSON](https://docs.aws.amazon.com/opsworks/latest/userguide/workingcookbook-json-override.html) .
   * This feature is supported as of version 1.7.42 of the AWS CLI .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-layer.html#cfn-opsworks-layer-customjson)
   */
  public fun customJson(): Any? = unwrap(this).getCustomJson()

  /**
   * A `LayerCustomRecipes` object that specifies the layer custom recipes.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-layer.html#cfn-opsworks-layer-customrecipes)
   */
  public fun customRecipes(): Any? = unwrap(this).getCustomRecipes()

  /**
   * An array containing the layer custom security group IDs.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-layer.html#cfn-opsworks-layer-customsecuritygroupids)
   */
  public fun customSecurityGroupIds(): List<String> = unwrap(this).getCustomSecurityGroupIds() ?:
      emptyList()

  /**
   * Whether to disable auto healing for the layer.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-layer.html#cfn-opsworks-layer-enableautohealing)
   */
  public fun enableAutoHealing(): Any

  /**
   * Whether to install operating system and package updates when the instance boots.
   *
   * The default value is `true` . To control when updates are installed, set this value to `false`
   * . You must then update your instances manually by using `CreateDeployment` to run the
   * `update_dependencies` stack command or by manually running `yum` (Amazon Linux) or `apt-get`
   * (Ubuntu) on the instances.
   *
   *
   * To ensure that your instances have the latest security updates, we strongly recommend using the
   * default value of `true` .
   *
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-layer.html#cfn-opsworks-layer-installupdatesonboot)
   */
  public fun installUpdatesOnBoot(): Any? = unwrap(this).getInstallUpdatesOnBoot()

  /**
   * A `LifeCycleEventConfiguration` object that you can use to configure the Shutdown event to
   * specify an execution timeout and enable or disable Elastic Load Balancer connection draining.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-layer.html#cfn-opsworks-layer-lifecycleeventconfiguration)
   */
  public fun lifecycleEventConfiguration(): Any? = unwrap(this).getLifecycleEventConfiguration()

  /**
   * The load-based scaling configuration for the AWS OpsWorks layer.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-layer.html#cfn-opsworks-layer-loadbasedautoscaling)
   */
  public fun loadBasedAutoScaling(): Any? = unwrap(this).getLoadBasedAutoScaling()

  /**
   * The layer name, which is used by the console.
   *
   * Layer names can be a maximum of 32 characters.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-layer.html#cfn-opsworks-layer-name)
   */
  public fun name(): String

  /**
   * An array of `Package` objects that describes the layer packages.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-layer.html#cfn-opsworks-layer-packages)
   */
  public fun packages(): List<String> = unwrap(this).getPackages() ?: emptyList()

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
   */
  public fun shortname(): String

  /**
   * The layer stack ID.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-layer.html#cfn-opsworks-layer-stackid)
   */
  public fun stackId(): String

  /**
   * Specifies one or more sets of tags (key–value pairs) to associate with this AWS OpsWorks layer.
   *
   * Use tags to manage your resources.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-layer.html#cfn-opsworks-layer-tags)
   */
  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * The layer type.
   *
   * A stack cannot have more than one built-in layer of the same type. It can have any number of
   * custom layers. Built-in layers are not available in Chef 12 stacks.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-layer.html#cfn-opsworks-layer-type)
   */
  public fun type(): String

  /**
   * Whether to use Amazon EBS-optimized instances.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-layer.html#cfn-opsworks-layer-useebsoptimizedinstances)
   */
  public fun useEbsOptimizedInstances(): Any? = unwrap(this).getUseEbsOptimizedInstances()

  /**
   * A `VolumeConfigurations` object that describes the layer's Amazon EBS volumes.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-layer.html#cfn-opsworks-layer-volumeconfigurations)
   */
  public fun volumeConfigurations(): Any? = unwrap(this).getVolumeConfigurations()

  /**
   * A builder for [CfnLayerProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param attributes One or more user-defined key-value pairs to be added to the stack
     * attributes.
     * To create a cluster layer, set the `EcsClusterArn` attribute to the cluster's ARN.
     */
    public fun attributes(attributes: IResolvable)

    /**
     * @param attributes One or more user-defined key-value pairs to be added to the stack
     * attributes.
     * To create a cluster layer, set the `EcsClusterArn` attribute to the cluster's ARN.
     */
    public fun attributes(attributes: Map<String, String>)

    /**
     * @param autoAssignElasticIps Whether to automatically assign an [Elastic IP
     * address](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/elastic-ip-addresses-eip.html) to
     * the layer's instances. For more information, see [How to Edit a
     * Layer](https://docs.aws.amazon.com/opsworks/latest/userguide/workinglayers-basics-edit.html) . 
     */
    public fun autoAssignElasticIps(autoAssignElasticIps: Boolean)

    /**
     * @param autoAssignElasticIps Whether to automatically assign an [Elastic IP
     * address](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/elastic-ip-addresses-eip.html) to
     * the layer's instances. For more information, see [How to Edit a
     * Layer](https://docs.aws.amazon.com/opsworks/latest/userguide/workinglayers-basics-edit.html) . 
     */
    public fun autoAssignElasticIps(autoAssignElasticIps: IResolvable)

    /**
     * @param autoAssignPublicIps For stacks that are running in a VPC, whether to automatically
     * assign a public IP address to the layer's instances. 
     * For more information, see [How to Edit a
     * Layer](https://docs.aws.amazon.com/opsworks/latest/userguide/workinglayers-basics-edit.html) .
     */
    public fun autoAssignPublicIps(autoAssignPublicIps: Boolean)

    /**
     * @param autoAssignPublicIps For stacks that are running in a VPC, whether to automatically
     * assign a public IP address to the layer's instances. 
     * For more information, see [How to Edit a
     * Layer](https://docs.aws.amazon.com/opsworks/latest/userguide/workinglayers-basics-edit.html) .
     */
    public fun autoAssignPublicIps(autoAssignPublicIps: IResolvable)

    /**
     * @param customInstanceProfileArn The ARN of an IAM profile to be used for the layer's EC2
     * instances.
     * For more information about IAM ARNs, see [Using
     * Identifiers](https://docs.aws.amazon.com/IAM/latest/UserGuide/Using_Identifiers.html) .
     */
    public fun customInstanceProfileArn(customInstanceProfileArn: String)

    /**
     * @param customJson A JSON-formatted string containing custom stack configuration and
     * deployment attributes to be installed on the layer's instances.
     * For more information, see [Using Custom
     * JSON](https://docs.aws.amazon.com/opsworks/latest/userguide/workingcookbook-json-override.html)
     * . This feature is supported as of version 1.7.42 of the AWS CLI .
     */
    public fun customJson(customJson: Any)

    /**
     * @param customRecipes A `LayerCustomRecipes` object that specifies the layer custom recipes.
     */
    public fun customRecipes(customRecipes: IResolvable)

    /**
     * @param customRecipes A `LayerCustomRecipes` object that specifies the layer custom recipes.
     */
    public fun customRecipes(customRecipes: CfnLayer.RecipesProperty)

    /**
     * @param customRecipes A `LayerCustomRecipes` object that specifies the layer custom recipes.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("8707f16d32d99548e9a81d45bd59464955c904213deaf82be4f0067b1e1eafb5")
    public fun customRecipes(customRecipes: CfnLayer.RecipesProperty.Builder.() -> Unit)

    /**
     * @param customSecurityGroupIds An array containing the layer custom security group IDs.
     */
    public fun customSecurityGroupIds(customSecurityGroupIds: List<String>)

    /**
     * @param customSecurityGroupIds An array containing the layer custom security group IDs.
     */
    public fun customSecurityGroupIds(vararg customSecurityGroupIds: String)

    /**
     * @param enableAutoHealing Whether to disable auto healing for the layer. 
     */
    public fun enableAutoHealing(enableAutoHealing: Boolean)

    /**
     * @param enableAutoHealing Whether to disable auto healing for the layer. 
     */
    public fun enableAutoHealing(enableAutoHealing: IResolvable)

    /**
     * @param installUpdatesOnBoot Whether to install operating system and package updates when the
     * instance boots.
     * The default value is `true` . To control when updates are installed, set this value to
     * `false` . You must then update your instances manually by using `CreateDeployment` to run the
     * `update_dependencies` stack command or by manually running `yum` (Amazon Linux) or `apt-get`
     * (Ubuntu) on the instances.
     *
     *
     * To ensure that your instances have the latest security updates, we strongly recommend using
     * the default value of `true` .
     */
    public fun installUpdatesOnBoot(installUpdatesOnBoot: Boolean)

    /**
     * @param installUpdatesOnBoot Whether to install operating system and package updates when the
     * instance boots.
     * The default value is `true` . To control when updates are installed, set this value to
     * `false` . You must then update your instances manually by using `CreateDeployment` to run the
     * `update_dependencies` stack command or by manually running `yum` (Amazon Linux) or `apt-get`
     * (Ubuntu) on the instances.
     *
     *
     * To ensure that your instances have the latest security updates, we strongly recommend using
     * the default value of `true` .
     */
    public fun installUpdatesOnBoot(installUpdatesOnBoot: IResolvable)

    /**
     * @param lifecycleEventConfiguration A `LifeCycleEventConfiguration` object that you can use to
     * configure the Shutdown event to specify an execution timeout and enable or disable Elastic Load
     * Balancer connection draining.
     */
    public fun lifecycleEventConfiguration(lifecycleEventConfiguration: IResolvable)

    /**
     * @param lifecycleEventConfiguration A `LifeCycleEventConfiguration` object that you can use to
     * configure the Shutdown event to specify an execution timeout and enable or disable Elastic Load
     * Balancer connection draining.
     */
    public
        fun lifecycleEventConfiguration(lifecycleEventConfiguration: CfnLayer.LifecycleEventConfigurationProperty)

    /**
     * @param lifecycleEventConfiguration A `LifeCycleEventConfiguration` object that you can use to
     * configure the Shutdown event to specify an execution timeout and enable or disable Elastic Load
     * Balancer connection draining.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("e64c6ab13bf1e3a04bbe68447d03393090c04d29343a8e0481d1c34947fb2d1a")
    public
        fun lifecycleEventConfiguration(lifecycleEventConfiguration: CfnLayer.LifecycleEventConfigurationProperty.Builder.() -> Unit)

    /**
     * @param loadBasedAutoScaling The load-based scaling configuration for the AWS OpsWorks layer.
     */
    public fun loadBasedAutoScaling(loadBasedAutoScaling: IResolvable)

    /**
     * @param loadBasedAutoScaling The load-based scaling configuration for the AWS OpsWorks layer.
     */
    public fun loadBasedAutoScaling(loadBasedAutoScaling: CfnLayer.LoadBasedAutoScalingProperty)

    /**
     * @param loadBasedAutoScaling The load-based scaling configuration for the AWS OpsWorks layer.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("d9e5143608c398f23ec77672f5e01d153d428f9024d707a6d8edfba42ed648e6")
    public
        fun loadBasedAutoScaling(loadBasedAutoScaling: CfnLayer.LoadBasedAutoScalingProperty.Builder.() -> Unit)

    /**
     * @param name The layer name, which is used by the console. 
     * Layer names can be a maximum of 32 characters.
     */
    public fun name(name: String)

    /**
     * @param packages An array of `Package` objects that describes the layer packages.
     */
    public fun packages(packages: List<String>)

    /**
     * @param packages An array of `Package` objects that describes the layer packages.
     */
    public fun packages(vararg packages: String)

    /**
     * @param shortname For custom layers only, use this parameter to specify the layer's short
     * name, which is used internally by AWS OpsWorks Stacks and by Chef recipes. 
     * The short name is also used as the name for the directory where your app files are installed.
     * It can have a maximum of 32 characters, which are limited to the alphanumeric characters, '-',
     * '_', and '.'.
     *
     * Built-in layer short names are defined by AWS OpsWorks Stacks. For more information, see the
     * [Layer Reference](https://docs.aws.amazon.com/opsworks/latest/userguide/layers.html) .
     */
    public fun shortname(shortname: String)

    /**
     * @param stackId The layer stack ID. 
     */
    public fun stackId(stackId: String)

    /**
     * @param tags Specifies one or more sets of tags (key–value pairs) to associate with this AWS
     * OpsWorks layer.
     * Use tags to manage your resources.
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * @param tags Specifies one or more sets of tags (key–value pairs) to associate with this AWS
     * OpsWorks layer.
     * Use tags to manage your resources.
     */
    public fun tags(vararg tags: CfnTag)

    /**
     * @param type The layer type. 
     * A stack cannot have more than one built-in layer of the same type. It can have any number of
     * custom layers. Built-in layers are not available in Chef 12 stacks.
     */
    public fun type(type: String)

    /**
     * @param useEbsOptimizedInstances Whether to use Amazon EBS-optimized instances.
     */
    public fun useEbsOptimizedInstances(useEbsOptimizedInstances: Boolean)

    /**
     * @param useEbsOptimizedInstances Whether to use Amazon EBS-optimized instances.
     */
    public fun useEbsOptimizedInstances(useEbsOptimizedInstances: IResolvable)

    /**
     * @param volumeConfigurations A `VolumeConfigurations` object that describes the layer's Amazon
     * EBS volumes.
     */
    public fun volumeConfigurations(volumeConfigurations: IResolvable)

    /**
     * @param volumeConfigurations A `VolumeConfigurations` object that describes the layer's Amazon
     * EBS volumes.
     */
    public fun volumeConfigurations(volumeConfigurations: List<Any>)

    /**
     * @param volumeConfigurations A `VolumeConfigurations` object that describes the layer's Amazon
     * EBS volumes.
     */
    public fun volumeConfigurations(vararg volumeConfigurations: Any)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.opsworks.CfnLayerProps.Builder =
        software.amazon.awscdk.services.opsworks.CfnLayerProps.builder()

    /**
     * @param attributes One or more user-defined key-value pairs to be added to the stack
     * attributes.
     * To create a cluster layer, set the `EcsClusterArn` attribute to the cluster's ARN.
     */
    override fun attributes(attributes: IResolvable) {
      cdkBuilder.attributes(attributes.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param attributes One or more user-defined key-value pairs to be added to the stack
     * attributes.
     * To create a cluster layer, set the `EcsClusterArn` attribute to the cluster's ARN.
     */
    override fun attributes(attributes: Map<String, String>) {
      cdkBuilder.attributes(attributes)
    }

    /**
     * @param autoAssignElasticIps Whether to automatically assign an [Elastic IP
     * address](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/elastic-ip-addresses-eip.html) to
     * the layer's instances. For more information, see [How to Edit a
     * Layer](https://docs.aws.amazon.com/opsworks/latest/userguide/workinglayers-basics-edit.html) . 
     */
    override fun autoAssignElasticIps(autoAssignElasticIps: Boolean) {
      cdkBuilder.autoAssignElasticIps(autoAssignElasticIps)
    }

    /**
     * @param autoAssignElasticIps Whether to automatically assign an [Elastic IP
     * address](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/elastic-ip-addresses-eip.html) to
     * the layer's instances. For more information, see [How to Edit a
     * Layer](https://docs.aws.amazon.com/opsworks/latest/userguide/workinglayers-basics-edit.html) . 
     */
    override fun autoAssignElasticIps(autoAssignElasticIps: IResolvable) {
      cdkBuilder.autoAssignElasticIps(autoAssignElasticIps.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param autoAssignPublicIps For stacks that are running in a VPC, whether to automatically
     * assign a public IP address to the layer's instances. 
     * For more information, see [How to Edit a
     * Layer](https://docs.aws.amazon.com/opsworks/latest/userguide/workinglayers-basics-edit.html) .
     */
    override fun autoAssignPublicIps(autoAssignPublicIps: Boolean) {
      cdkBuilder.autoAssignPublicIps(autoAssignPublicIps)
    }

    /**
     * @param autoAssignPublicIps For stacks that are running in a VPC, whether to automatically
     * assign a public IP address to the layer's instances. 
     * For more information, see [How to Edit a
     * Layer](https://docs.aws.amazon.com/opsworks/latest/userguide/workinglayers-basics-edit.html) .
     */
    override fun autoAssignPublicIps(autoAssignPublicIps: IResolvable) {
      cdkBuilder.autoAssignPublicIps(autoAssignPublicIps.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param customInstanceProfileArn The ARN of an IAM profile to be used for the layer's EC2
     * instances.
     * For more information about IAM ARNs, see [Using
     * Identifiers](https://docs.aws.amazon.com/IAM/latest/UserGuide/Using_Identifiers.html) .
     */
    override fun customInstanceProfileArn(customInstanceProfileArn: String) {
      cdkBuilder.customInstanceProfileArn(customInstanceProfileArn)
    }

    /**
     * @param customJson A JSON-formatted string containing custom stack configuration and
     * deployment attributes to be installed on the layer's instances.
     * For more information, see [Using Custom
     * JSON](https://docs.aws.amazon.com/opsworks/latest/userguide/workingcookbook-json-override.html)
     * . This feature is supported as of version 1.7.42 of the AWS CLI .
     */
    override fun customJson(customJson: Any) {
      cdkBuilder.customJson(customJson)
    }

    /**
     * @param customRecipes A `LayerCustomRecipes` object that specifies the layer custom recipes.
     */
    override fun customRecipes(customRecipes: IResolvable) {
      cdkBuilder.customRecipes(customRecipes.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param customRecipes A `LayerCustomRecipes` object that specifies the layer custom recipes.
     */
    override fun customRecipes(customRecipes: CfnLayer.RecipesProperty) {
      cdkBuilder.customRecipes(customRecipes.let(CfnLayer.RecipesProperty.Companion::unwrap))
    }

    /**
     * @param customRecipes A `LayerCustomRecipes` object that specifies the layer custom recipes.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("8707f16d32d99548e9a81d45bd59464955c904213deaf82be4f0067b1e1eafb5")
    override fun customRecipes(customRecipes: CfnLayer.RecipesProperty.Builder.() -> Unit): Unit =
        customRecipes(CfnLayer.RecipesProperty(customRecipes))

    /**
     * @param customSecurityGroupIds An array containing the layer custom security group IDs.
     */
    override fun customSecurityGroupIds(customSecurityGroupIds: List<String>) {
      cdkBuilder.customSecurityGroupIds(customSecurityGroupIds)
    }

    /**
     * @param customSecurityGroupIds An array containing the layer custom security group IDs.
     */
    override fun customSecurityGroupIds(vararg customSecurityGroupIds: String): Unit =
        customSecurityGroupIds(customSecurityGroupIds.toList())

    /**
     * @param enableAutoHealing Whether to disable auto healing for the layer. 
     */
    override fun enableAutoHealing(enableAutoHealing: Boolean) {
      cdkBuilder.enableAutoHealing(enableAutoHealing)
    }

    /**
     * @param enableAutoHealing Whether to disable auto healing for the layer. 
     */
    override fun enableAutoHealing(enableAutoHealing: IResolvable) {
      cdkBuilder.enableAutoHealing(enableAutoHealing.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param installUpdatesOnBoot Whether to install operating system and package updates when the
     * instance boots.
     * The default value is `true` . To control when updates are installed, set this value to
     * `false` . You must then update your instances manually by using `CreateDeployment` to run the
     * `update_dependencies` stack command or by manually running `yum` (Amazon Linux) or `apt-get`
     * (Ubuntu) on the instances.
     *
     *
     * To ensure that your instances have the latest security updates, we strongly recommend using
     * the default value of `true` .
     */
    override fun installUpdatesOnBoot(installUpdatesOnBoot: Boolean) {
      cdkBuilder.installUpdatesOnBoot(installUpdatesOnBoot)
    }

    /**
     * @param installUpdatesOnBoot Whether to install operating system and package updates when the
     * instance boots.
     * The default value is `true` . To control when updates are installed, set this value to
     * `false` . You must then update your instances manually by using `CreateDeployment` to run the
     * `update_dependencies` stack command or by manually running `yum` (Amazon Linux) or `apt-get`
     * (Ubuntu) on the instances.
     *
     *
     * To ensure that your instances have the latest security updates, we strongly recommend using
     * the default value of `true` .
     */
    override fun installUpdatesOnBoot(installUpdatesOnBoot: IResolvable) {
      cdkBuilder.installUpdatesOnBoot(installUpdatesOnBoot.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param lifecycleEventConfiguration A `LifeCycleEventConfiguration` object that you can use to
     * configure the Shutdown event to specify an execution timeout and enable or disable Elastic Load
     * Balancer connection draining.
     */
    override fun lifecycleEventConfiguration(lifecycleEventConfiguration: IResolvable) {
      cdkBuilder.lifecycleEventConfiguration(lifecycleEventConfiguration.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param lifecycleEventConfiguration A `LifeCycleEventConfiguration` object that you can use to
     * configure the Shutdown event to specify an execution timeout and enable or disable Elastic Load
     * Balancer connection draining.
     */
    override
        fun lifecycleEventConfiguration(lifecycleEventConfiguration: CfnLayer.LifecycleEventConfigurationProperty) {
      cdkBuilder.lifecycleEventConfiguration(lifecycleEventConfiguration.let(CfnLayer.LifecycleEventConfigurationProperty.Companion::unwrap))
    }

    /**
     * @param lifecycleEventConfiguration A `LifeCycleEventConfiguration` object that you can use to
     * configure the Shutdown event to specify an execution timeout and enable or disable Elastic Load
     * Balancer connection draining.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("e64c6ab13bf1e3a04bbe68447d03393090c04d29343a8e0481d1c34947fb2d1a")
    override
        fun lifecycleEventConfiguration(lifecycleEventConfiguration: CfnLayer.LifecycleEventConfigurationProperty.Builder.() -> Unit):
        Unit =
        lifecycleEventConfiguration(CfnLayer.LifecycleEventConfigurationProperty(lifecycleEventConfiguration))

    /**
     * @param loadBasedAutoScaling The load-based scaling configuration for the AWS OpsWorks layer.
     */
    override fun loadBasedAutoScaling(loadBasedAutoScaling: IResolvable) {
      cdkBuilder.loadBasedAutoScaling(loadBasedAutoScaling.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param loadBasedAutoScaling The load-based scaling configuration for the AWS OpsWorks layer.
     */
    override fun loadBasedAutoScaling(loadBasedAutoScaling: CfnLayer.LoadBasedAutoScalingProperty) {
      cdkBuilder.loadBasedAutoScaling(loadBasedAutoScaling.let(CfnLayer.LoadBasedAutoScalingProperty.Companion::unwrap))
    }

    /**
     * @param loadBasedAutoScaling The load-based scaling configuration for the AWS OpsWorks layer.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("d9e5143608c398f23ec77672f5e01d153d428f9024d707a6d8edfba42ed648e6")
    override
        fun loadBasedAutoScaling(loadBasedAutoScaling: CfnLayer.LoadBasedAutoScalingProperty.Builder.() -> Unit):
        Unit = loadBasedAutoScaling(CfnLayer.LoadBasedAutoScalingProperty(loadBasedAutoScaling))

    /**
     * @param name The layer name, which is used by the console. 
     * Layer names can be a maximum of 32 characters.
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * @param packages An array of `Package` objects that describes the layer packages.
     */
    override fun packages(packages: List<String>) {
      cdkBuilder.packages(packages)
    }

    /**
     * @param packages An array of `Package` objects that describes the layer packages.
     */
    override fun packages(vararg packages: String): Unit = packages(packages.toList())

    /**
     * @param shortname For custom layers only, use this parameter to specify the layer's short
     * name, which is used internally by AWS OpsWorks Stacks and by Chef recipes. 
     * The short name is also used as the name for the directory where your app files are installed.
     * It can have a maximum of 32 characters, which are limited to the alphanumeric characters, '-',
     * '_', and '.'.
     *
     * Built-in layer short names are defined by AWS OpsWorks Stacks. For more information, see the
     * [Layer Reference](https://docs.aws.amazon.com/opsworks/latest/userguide/layers.html) .
     */
    override fun shortname(shortname: String) {
      cdkBuilder.shortname(shortname)
    }

    /**
     * @param stackId The layer stack ID. 
     */
    override fun stackId(stackId: String) {
      cdkBuilder.stackId(stackId)
    }

    /**
     * @param tags Specifies one or more sets of tags (key–value pairs) to associate with this AWS
     * OpsWorks layer.
     * Use tags to manage your resources.
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag.Companion::unwrap))
    }

    /**
     * @param tags Specifies one or more sets of tags (key–value pairs) to associate with this AWS
     * OpsWorks layer.
     * Use tags to manage your resources.
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    /**
     * @param type The layer type. 
     * A stack cannot have more than one built-in layer of the same type. It can have any number of
     * custom layers. Built-in layers are not available in Chef 12 stacks.
     */
    override fun type(type: String) {
      cdkBuilder.type(type)
    }

    /**
     * @param useEbsOptimizedInstances Whether to use Amazon EBS-optimized instances.
     */
    override fun useEbsOptimizedInstances(useEbsOptimizedInstances: Boolean) {
      cdkBuilder.useEbsOptimizedInstances(useEbsOptimizedInstances)
    }

    /**
     * @param useEbsOptimizedInstances Whether to use Amazon EBS-optimized instances.
     */
    override fun useEbsOptimizedInstances(useEbsOptimizedInstances: IResolvable) {
      cdkBuilder.useEbsOptimizedInstances(useEbsOptimizedInstances.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param volumeConfigurations A `VolumeConfigurations` object that describes the layer's Amazon
     * EBS volumes.
     */
    override fun volumeConfigurations(volumeConfigurations: IResolvable) {
      cdkBuilder.volumeConfigurations(volumeConfigurations.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param volumeConfigurations A `VolumeConfigurations` object that describes the layer's Amazon
     * EBS volumes.
     */
    override fun volumeConfigurations(volumeConfigurations: List<Any>) {
      cdkBuilder.volumeConfigurations(volumeConfigurations.map{CdkObjectWrappers.unwrap(it)})
    }

    /**
     * @param volumeConfigurations A `VolumeConfigurations` object that describes the layer's Amazon
     * EBS volumes.
     */
    override fun volumeConfigurations(vararg volumeConfigurations: Any): Unit =
        volumeConfigurations(volumeConfigurations.toList())

    public fun build(): software.amazon.awscdk.services.opsworks.CfnLayerProps = cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.opsworks.CfnLayerProps,
  ) : CdkObject(cdkObject), CfnLayerProps {
    /**
     * One or more user-defined key-value pairs to be added to the stack attributes.
     *
     * To create a cluster layer, set the `EcsClusterArn` attribute to the cluster's ARN.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-layer.html#cfn-opsworks-layer-attributes)
     */
    override fun attributes(): Any? = unwrap(this).getAttributes()

    /**
     * Whether to automatically assign an [Elastic IP
     * address](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/elastic-ip-addresses-eip.html) to
     * the layer's instances. For more information, see [How to Edit a
     * Layer](https://docs.aws.amazon.com/opsworks/latest/userguide/workinglayers-basics-edit.html) .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-layer.html#cfn-opsworks-layer-autoassignelasticips)
     */
    override fun autoAssignElasticIps(): Any = unwrap(this).getAutoAssignElasticIps()

    /**
     * For stacks that are running in a VPC, whether to automatically assign a public IP address to
     * the layer's instances.
     *
     * For more information, see [How to Edit a
     * Layer](https://docs.aws.amazon.com/opsworks/latest/userguide/workinglayers-basics-edit.html) .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-layer.html#cfn-opsworks-layer-autoassignpublicips)
     */
    override fun autoAssignPublicIps(): Any = unwrap(this).getAutoAssignPublicIps()

    /**
     * The ARN of an IAM profile to be used for the layer's EC2 instances.
     *
     * For more information about IAM ARNs, see [Using
     * Identifiers](https://docs.aws.amazon.com/IAM/latest/UserGuide/Using_Identifiers.html) .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-layer.html#cfn-opsworks-layer-custominstanceprofilearn)
     */
    override fun customInstanceProfileArn(): String? = unwrap(this).getCustomInstanceProfileArn()

    /**
     * A JSON-formatted string containing custom stack configuration and deployment attributes to be
     * installed on the layer's instances.
     *
     * For more information, see [Using Custom
     * JSON](https://docs.aws.amazon.com/opsworks/latest/userguide/workingcookbook-json-override.html)
     * . This feature is supported as of version 1.7.42 of the AWS CLI .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-layer.html#cfn-opsworks-layer-customjson)
     */
    override fun customJson(): Any? = unwrap(this).getCustomJson()

    /**
     * A `LayerCustomRecipes` object that specifies the layer custom recipes.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-layer.html#cfn-opsworks-layer-customrecipes)
     */
    override fun customRecipes(): Any? = unwrap(this).getCustomRecipes()

    /**
     * An array containing the layer custom security group IDs.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-layer.html#cfn-opsworks-layer-customsecuritygroupids)
     */
    override fun customSecurityGroupIds(): List<String> = unwrap(this).getCustomSecurityGroupIds()
        ?: emptyList()

    /**
     * Whether to disable auto healing for the layer.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-layer.html#cfn-opsworks-layer-enableautohealing)
     */
    override fun enableAutoHealing(): Any = unwrap(this).getEnableAutoHealing()

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
     */
    override fun installUpdatesOnBoot(): Any? = unwrap(this).getInstallUpdatesOnBoot()

    /**
     * A `LifeCycleEventConfiguration` object that you can use to configure the Shutdown event to
     * specify an execution timeout and enable or disable Elastic Load Balancer connection draining.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-layer.html#cfn-opsworks-layer-lifecycleeventconfiguration)
     */
    override fun lifecycleEventConfiguration(): Any? = unwrap(this).getLifecycleEventConfiguration()

    /**
     * The load-based scaling configuration for the AWS OpsWorks layer.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-layer.html#cfn-opsworks-layer-loadbasedautoscaling)
     */
    override fun loadBasedAutoScaling(): Any? = unwrap(this).getLoadBasedAutoScaling()

    /**
     * The layer name, which is used by the console.
     *
     * Layer names can be a maximum of 32 characters.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-layer.html#cfn-opsworks-layer-name)
     */
    override fun name(): String = unwrap(this).getName()

    /**
     * An array of `Package` objects that describes the layer packages.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-layer.html#cfn-opsworks-layer-packages)
     */
    override fun packages(): List<String> = unwrap(this).getPackages() ?: emptyList()

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
     */
    override fun shortname(): String = unwrap(this).getShortname()

    /**
     * The layer stack ID.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-layer.html#cfn-opsworks-layer-stackid)
     */
    override fun stackId(): String = unwrap(this).getStackId()

    /**
     * Specifies one or more sets of tags (key–value pairs) to associate with this AWS OpsWorks
     * layer.
     *
     * Use tags to manage your resources.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-layer.html#cfn-opsworks-layer-tags)
     */
    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

    /**
     * The layer type.
     *
     * A stack cannot have more than one built-in layer of the same type. It can have any number of
     * custom layers. Built-in layers are not available in Chef 12 stacks.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-layer.html#cfn-opsworks-layer-type)
     */
    override fun type(): String = unwrap(this).getType()

    /**
     * Whether to use Amazon EBS-optimized instances.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-layer.html#cfn-opsworks-layer-useebsoptimizedinstances)
     */
    override fun useEbsOptimizedInstances(): Any? = unwrap(this).getUseEbsOptimizedInstances()

    /**
     * A `VolumeConfigurations` object that describes the layer's Amazon EBS volumes.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-layer.html#cfn-opsworks-layer-volumeconfigurations)
     */
    override fun volumeConfigurations(): Any? = unwrap(this).getVolumeConfigurations()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnLayerProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.opsworks.CfnLayerProps):
        CfnLayerProps = CdkObjectWrappers.wrap(cdkObject) as? CfnLayerProps ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnLayerProps):
        software.amazon.awscdk.services.opsworks.CfnLayerProps = (wrapped as CdkObject).cdkObject as
        software.amazon.awscdk.services.opsworks.CfnLayerProps
  }
}
