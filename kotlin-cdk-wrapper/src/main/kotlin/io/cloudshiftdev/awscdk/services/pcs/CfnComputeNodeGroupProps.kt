@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.pcs

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
 * Properties for defining a `CfnComputeNodeGroup`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.pcs.*;
 * CfnComputeNodeGroupProps cfnComputeNodeGroupProps = CfnComputeNodeGroupProps.builder()
 * .clusterId("clusterId")
 * .customLaunchTemplate(CustomLaunchTemplateProperty.builder()
 * .version("version")
 * // the properties below are optional
 * .templateId("templateId")
 * .build())
 * .iamInstanceProfileArn("iamInstanceProfileArn")
 * .instanceConfigs(List.of(InstanceConfigProperty.builder()
 * .instanceType("instanceType")
 * .build()))
 * .scalingConfiguration(ScalingConfigurationProperty.builder()
 * .maxInstanceCount(123)
 * .minInstanceCount(123)
 * .build())
 * .subnetIds(List.of("subnetIds"))
 * // the properties below are optional
 * .amiId("amiId")
 * .name("name")
 * .purchaseOption("purchaseOption")
 * .slurmConfiguration(SlurmConfigurationProperty.builder()
 * .slurmCustomSettings(List.of(SlurmCustomSettingProperty.builder()
 * .parameterName("parameterName")
 * .parameterValue("parameterValue")
 * .build()))
 * .build())
 * .spotOptions(SpotOptionsProperty.builder()
 * .allocationStrategy("allocationStrategy")
 * .build())
 * .tags(Map.of(
 * "tagsKey", "tags"))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pcs-computenodegroup.html)
 */
public interface CfnComputeNodeGroupProps {
  /**
   * The ID of the Amazon Machine Image (AMI) that AWS PCS uses to launch instances.
   *
   * If not provided, AWS PCS uses the AMI ID specified in the custom launch template.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pcs-computenodegroup.html#cfn-pcs-computenodegroup-amiid)
   */
  public fun amiId(): String? = unwrap(this).getAmiId()

  /**
   * The ID of the cluster of the compute node group.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pcs-computenodegroup.html#cfn-pcs-computenodegroup-clusterid)
   */
  public fun clusterId(): String

  /**
   * An Amazon EC2 launch template AWS PCS uses to launch compute nodes.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pcs-computenodegroup.html#cfn-pcs-computenodegroup-customlaunchtemplate)
   */
  public fun customLaunchTemplate(): Any

  /**
   * The Amazon Resource Name (ARN) of the IAM instance profile used to pass an IAM role when
   * launching EC2 instances.
   *
   * The role contained in your instance profile must have pcs:RegisterComputeNodeGroupInstance
   * permissions attached to provision instances correctly.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pcs-computenodegroup.html#cfn-pcs-computenodegroup-iaminstanceprofilearn)
   */
  public fun iamInstanceProfileArn(): String

  /**
   * A list of EC2 instance configurations that AWS PCS can provision in the compute node group.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pcs-computenodegroup.html#cfn-pcs-computenodegroup-instanceconfigs)
   */
  public fun instanceConfigs(): Any

  /**
   * The name that identifies the compute node group.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pcs-computenodegroup.html#cfn-pcs-computenodegroup-name)
   */
  public fun name(): String? = unwrap(this).getName()

  /**
   * Specifies how EC2 instances are purchased on your behalf.
   *
   * AWS PCS supports On-Demand and Spot instances. For more information, see Instance purchasing
   * options in the Amazon Elastic Compute Cloud User Guide. If you don't provide this option, it
   * defaults to On-Demand.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pcs-computenodegroup.html#cfn-pcs-computenodegroup-purchaseoption)
   */
  public fun purchaseOption(): String? = unwrap(this).getPurchaseOption()

  /**
   * Specifies the boundaries of the compute node group auto scaling.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pcs-computenodegroup.html#cfn-pcs-computenodegroup-scalingconfiguration)
   */
  public fun scalingConfiguration(): Any

  /**
   * Additional options related to the Slurm scheduler.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pcs-computenodegroup.html#cfn-pcs-computenodegroup-slurmconfiguration)
   */
  public fun slurmConfiguration(): Any? = unwrap(this).getSlurmConfiguration()

  /**
   * Additional configuration when you specify `SPOT` as the `purchaseOption` .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pcs-computenodegroup.html#cfn-pcs-computenodegroup-spotoptions)
   */
  public fun spotOptions(): Any? = unwrap(this).getSpotOptions()

  /**
   * The list of subnet IDs where instances are provisioned by the compute node group.
   *
   * The subnets must be in the same VPC as the cluster.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pcs-computenodegroup.html#cfn-pcs-computenodegroup-subnetids)
   */
  public fun subnetIds(): List<String>

  /**
   * 1 or more tags added to the resource.
   *
   * Each tag consists of a tag key and tag value. The tag value is optional and can be an empty
   * string.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pcs-computenodegroup.html#cfn-pcs-computenodegroup-tags)
   */
  public fun tags(): Map<String, String> = unwrap(this).getTags() ?: emptyMap()

  /**
   * A builder for [CfnComputeNodeGroupProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param amiId The ID of the Amazon Machine Image (AMI) that AWS PCS uses to launch instances.
     * If not provided, AWS PCS uses the AMI ID specified in the custom launch template.
     */
    public fun amiId(amiId: String)

    /**
     * @param clusterId The ID of the cluster of the compute node group. 
     */
    public fun clusterId(clusterId: String)

    /**
     * @param customLaunchTemplate An Amazon EC2 launch template AWS PCS uses to launch compute
     * nodes. 
     */
    public fun customLaunchTemplate(customLaunchTemplate: IResolvable)

    /**
     * @param customLaunchTemplate An Amazon EC2 launch template AWS PCS uses to launch compute
     * nodes. 
     */
    public
        fun customLaunchTemplate(customLaunchTemplate: CfnComputeNodeGroup.CustomLaunchTemplateProperty)

    /**
     * @param customLaunchTemplate An Amazon EC2 launch template AWS PCS uses to launch compute
     * nodes. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("15d09eb1911aa07ae516a684ff9c2751ab4b671a2a74c765a89eb7f19eecee20")
    public
        fun customLaunchTemplate(customLaunchTemplate: CfnComputeNodeGroup.CustomLaunchTemplateProperty.Builder.() -> Unit)

    /**
     * @param iamInstanceProfileArn The Amazon Resource Name (ARN) of the IAM instance profile used
     * to pass an IAM role when launching EC2 instances. 
     * The role contained in your instance profile must have pcs:RegisterComputeNodeGroupInstance
     * permissions attached to provision instances correctly.
     */
    public fun iamInstanceProfileArn(iamInstanceProfileArn: String)

    /**
     * @param instanceConfigs A list of EC2 instance configurations that AWS PCS can provision in
     * the compute node group. 
     */
    public fun instanceConfigs(instanceConfigs: IResolvable)

    /**
     * @param instanceConfigs A list of EC2 instance configurations that AWS PCS can provision in
     * the compute node group. 
     */
    public fun instanceConfigs(instanceConfigs: List<Any>)

    /**
     * @param instanceConfigs A list of EC2 instance configurations that AWS PCS can provision in
     * the compute node group. 
     */
    public fun instanceConfigs(vararg instanceConfigs: Any)

    /**
     * @param name The name that identifies the compute node group.
     */
    public fun name(name: String)

    /**
     * @param purchaseOption Specifies how EC2 instances are purchased on your behalf.
     * AWS PCS supports On-Demand and Spot instances. For more information, see Instance purchasing
     * options in the Amazon Elastic Compute Cloud User Guide. If you don't provide this option, it
     * defaults to On-Demand.
     */
    public fun purchaseOption(purchaseOption: String)

    /**
     * @param scalingConfiguration Specifies the boundaries of the compute node group auto scaling. 
     */
    public fun scalingConfiguration(scalingConfiguration: IResolvable)

    /**
     * @param scalingConfiguration Specifies the boundaries of the compute node group auto scaling. 
     */
    public
        fun scalingConfiguration(scalingConfiguration: CfnComputeNodeGroup.ScalingConfigurationProperty)

    /**
     * @param scalingConfiguration Specifies the boundaries of the compute node group auto scaling. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("ce39b692c30d98670973ca99512e6add269b0b50ddad4e3ccc05d63d1dbe8188")
    public
        fun scalingConfiguration(scalingConfiguration: CfnComputeNodeGroup.ScalingConfigurationProperty.Builder.() -> Unit)

    /**
     * @param slurmConfiguration Additional options related to the Slurm scheduler.
     */
    public fun slurmConfiguration(slurmConfiguration: IResolvable)

    /**
     * @param slurmConfiguration Additional options related to the Slurm scheduler.
     */
    public
        fun slurmConfiguration(slurmConfiguration: CfnComputeNodeGroup.SlurmConfigurationProperty)

    /**
     * @param slurmConfiguration Additional options related to the Slurm scheduler.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("3d471e298912f0a5a84713b571436c0b748ee97fe2cf5b66d94fcac6193cc712")
    public
        fun slurmConfiguration(slurmConfiguration: CfnComputeNodeGroup.SlurmConfigurationProperty.Builder.() -> Unit)

    /**
     * @param spotOptions Additional configuration when you specify `SPOT` as the `purchaseOption` .
     */
    public fun spotOptions(spotOptions: IResolvable)

    /**
     * @param spotOptions Additional configuration when you specify `SPOT` as the `purchaseOption` .
     */
    public fun spotOptions(spotOptions: CfnComputeNodeGroup.SpotOptionsProperty)

    /**
     * @param spotOptions Additional configuration when you specify `SPOT` as the `purchaseOption` .
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("7e5157749a1ea147f5eec1d1770518ab2224a0489c8fb90ea40d07ff6e2ba320")
    public fun spotOptions(spotOptions: CfnComputeNodeGroup.SpotOptionsProperty.Builder.() -> Unit)

    /**
     * @param subnetIds The list of subnet IDs where instances are provisioned by the compute node
     * group. 
     * The subnets must be in the same VPC as the cluster.
     */
    public fun subnetIds(subnetIds: List<String>)

    /**
     * @param subnetIds The list of subnet IDs where instances are provisioned by the compute node
     * group. 
     * The subnets must be in the same VPC as the cluster.
     */
    public fun subnetIds(vararg subnetIds: String)

    /**
     * @param tags 1 or more tags added to the resource.
     * Each tag consists of a tag key and tag value. The tag value is optional and can be an empty
     * string.
     */
    public fun tags(tags: Map<String, String>)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.pcs.CfnComputeNodeGroupProps.Builder =
        software.amazon.awscdk.services.pcs.CfnComputeNodeGroupProps.builder()

    /**
     * @param amiId The ID of the Amazon Machine Image (AMI) that AWS PCS uses to launch instances.
     * If not provided, AWS PCS uses the AMI ID specified in the custom launch template.
     */
    override fun amiId(amiId: String) {
      cdkBuilder.amiId(amiId)
    }

    /**
     * @param clusterId The ID of the cluster of the compute node group. 
     */
    override fun clusterId(clusterId: String) {
      cdkBuilder.clusterId(clusterId)
    }

    /**
     * @param customLaunchTemplate An Amazon EC2 launch template AWS PCS uses to launch compute
     * nodes. 
     */
    override fun customLaunchTemplate(customLaunchTemplate: IResolvable) {
      cdkBuilder.customLaunchTemplate(customLaunchTemplate.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param customLaunchTemplate An Amazon EC2 launch template AWS PCS uses to launch compute
     * nodes. 
     */
    override
        fun customLaunchTemplate(customLaunchTemplate: CfnComputeNodeGroup.CustomLaunchTemplateProperty) {
      cdkBuilder.customLaunchTemplate(customLaunchTemplate.let(CfnComputeNodeGroup.CustomLaunchTemplateProperty.Companion::unwrap))
    }

    /**
     * @param customLaunchTemplate An Amazon EC2 launch template AWS PCS uses to launch compute
     * nodes. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("15d09eb1911aa07ae516a684ff9c2751ab4b671a2a74c765a89eb7f19eecee20")
    override
        fun customLaunchTemplate(customLaunchTemplate: CfnComputeNodeGroup.CustomLaunchTemplateProperty.Builder.() -> Unit):
        Unit =
        customLaunchTemplate(CfnComputeNodeGroup.CustomLaunchTemplateProperty(customLaunchTemplate))

    /**
     * @param iamInstanceProfileArn The Amazon Resource Name (ARN) of the IAM instance profile used
     * to pass an IAM role when launching EC2 instances. 
     * The role contained in your instance profile must have pcs:RegisterComputeNodeGroupInstance
     * permissions attached to provision instances correctly.
     */
    override fun iamInstanceProfileArn(iamInstanceProfileArn: String) {
      cdkBuilder.iamInstanceProfileArn(iamInstanceProfileArn)
    }

    /**
     * @param instanceConfigs A list of EC2 instance configurations that AWS PCS can provision in
     * the compute node group. 
     */
    override fun instanceConfigs(instanceConfigs: IResolvable) {
      cdkBuilder.instanceConfigs(instanceConfigs.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param instanceConfigs A list of EC2 instance configurations that AWS PCS can provision in
     * the compute node group. 
     */
    override fun instanceConfigs(instanceConfigs: List<Any>) {
      cdkBuilder.instanceConfigs(instanceConfigs.map{CdkObjectWrappers.unwrap(it)})
    }

    /**
     * @param instanceConfigs A list of EC2 instance configurations that AWS PCS can provision in
     * the compute node group. 
     */
    override fun instanceConfigs(vararg instanceConfigs: Any): Unit =
        instanceConfigs(instanceConfigs.toList())

    /**
     * @param name The name that identifies the compute node group.
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * @param purchaseOption Specifies how EC2 instances are purchased on your behalf.
     * AWS PCS supports On-Demand and Spot instances. For more information, see Instance purchasing
     * options in the Amazon Elastic Compute Cloud User Guide. If you don't provide this option, it
     * defaults to On-Demand.
     */
    override fun purchaseOption(purchaseOption: String) {
      cdkBuilder.purchaseOption(purchaseOption)
    }

    /**
     * @param scalingConfiguration Specifies the boundaries of the compute node group auto scaling. 
     */
    override fun scalingConfiguration(scalingConfiguration: IResolvable) {
      cdkBuilder.scalingConfiguration(scalingConfiguration.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param scalingConfiguration Specifies the boundaries of the compute node group auto scaling. 
     */
    override
        fun scalingConfiguration(scalingConfiguration: CfnComputeNodeGroup.ScalingConfigurationProperty) {
      cdkBuilder.scalingConfiguration(scalingConfiguration.let(CfnComputeNodeGroup.ScalingConfigurationProperty.Companion::unwrap))
    }

    /**
     * @param scalingConfiguration Specifies the boundaries of the compute node group auto scaling. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("ce39b692c30d98670973ca99512e6add269b0b50ddad4e3ccc05d63d1dbe8188")
    override
        fun scalingConfiguration(scalingConfiguration: CfnComputeNodeGroup.ScalingConfigurationProperty.Builder.() -> Unit):
        Unit =
        scalingConfiguration(CfnComputeNodeGroup.ScalingConfigurationProperty(scalingConfiguration))

    /**
     * @param slurmConfiguration Additional options related to the Slurm scheduler.
     */
    override fun slurmConfiguration(slurmConfiguration: IResolvable) {
      cdkBuilder.slurmConfiguration(slurmConfiguration.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param slurmConfiguration Additional options related to the Slurm scheduler.
     */
    override
        fun slurmConfiguration(slurmConfiguration: CfnComputeNodeGroup.SlurmConfigurationProperty) {
      cdkBuilder.slurmConfiguration(slurmConfiguration.let(CfnComputeNodeGroup.SlurmConfigurationProperty.Companion::unwrap))
    }

    /**
     * @param slurmConfiguration Additional options related to the Slurm scheduler.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("3d471e298912f0a5a84713b571436c0b748ee97fe2cf5b66d94fcac6193cc712")
    override
        fun slurmConfiguration(slurmConfiguration: CfnComputeNodeGroup.SlurmConfigurationProperty.Builder.() -> Unit):
        Unit =
        slurmConfiguration(CfnComputeNodeGroup.SlurmConfigurationProperty(slurmConfiguration))

    /**
     * @param spotOptions Additional configuration when you specify `SPOT` as the `purchaseOption` .
     */
    override fun spotOptions(spotOptions: IResolvable) {
      cdkBuilder.spotOptions(spotOptions.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param spotOptions Additional configuration when you specify `SPOT` as the `purchaseOption` .
     */
    override fun spotOptions(spotOptions: CfnComputeNodeGroup.SpotOptionsProperty) {
      cdkBuilder.spotOptions(spotOptions.let(CfnComputeNodeGroup.SpotOptionsProperty.Companion::unwrap))
    }

    /**
     * @param spotOptions Additional configuration when you specify `SPOT` as the `purchaseOption` .
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("7e5157749a1ea147f5eec1d1770518ab2224a0489c8fb90ea40d07ff6e2ba320")
    override
        fun spotOptions(spotOptions: CfnComputeNodeGroup.SpotOptionsProperty.Builder.() -> Unit):
        Unit = spotOptions(CfnComputeNodeGroup.SpotOptionsProperty(spotOptions))

    /**
     * @param subnetIds The list of subnet IDs where instances are provisioned by the compute node
     * group. 
     * The subnets must be in the same VPC as the cluster.
     */
    override fun subnetIds(subnetIds: List<String>) {
      cdkBuilder.subnetIds(subnetIds)
    }

    /**
     * @param subnetIds The list of subnet IDs where instances are provisioned by the compute node
     * group. 
     * The subnets must be in the same VPC as the cluster.
     */
    override fun subnetIds(vararg subnetIds: String): Unit = subnetIds(subnetIds.toList())

    /**
     * @param tags 1 or more tags added to the resource.
     * Each tag consists of a tag key and tag value. The tag value is optional and can be an empty
     * string.
     */
    override fun tags(tags: Map<String, String>) {
      cdkBuilder.tags(tags)
    }

    public fun build(): software.amazon.awscdk.services.pcs.CfnComputeNodeGroupProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.pcs.CfnComputeNodeGroupProps,
  ) : CdkObject(cdkObject),
      CfnComputeNodeGroupProps {
    /**
     * The ID of the Amazon Machine Image (AMI) that AWS PCS uses to launch instances.
     *
     * If not provided, AWS PCS uses the AMI ID specified in the custom launch template.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pcs-computenodegroup.html#cfn-pcs-computenodegroup-amiid)
     */
    override fun amiId(): String? = unwrap(this).getAmiId()

    /**
     * The ID of the cluster of the compute node group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pcs-computenodegroup.html#cfn-pcs-computenodegroup-clusterid)
     */
    override fun clusterId(): String = unwrap(this).getClusterId()

    /**
     * An Amazon EC2 launch template AWS PCS uses to launch compute nodes.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pcs-computenodegroup.html#cfn-pcs-computenodegroup-customlaunchtemplate)
     */
    override fun customLaunchTemplate(): Any = unwrap(this).getCustomLaunchTemplate()

    /**
     * The Amazon Resource Name (ARN) of the IAM instance profile used to pass an IAM role when
     * launching EC2 instances.
     *
     * The role contained in your instance profile must have pcs:RegisterComputeNodeGroupInstance
     * permissions attached to provision instances correctly.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pcs-computenodegroup.html#cfn-pcs-computenodegroup-iaminstanceprofilearn)
     */
    override fun iamInstanceProfileArn(): String = unwrap(this).getIamInstanceProfileArn()

    /**
     * A list of EC2 instance configurations that AWS PCS can provision in the compute node group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pcs-computenodegroup.html#cfn-pcs-computenodegroup-instanceconfigs)
     */
    override fun instanceConfigs(): Any = unwrap(this).getInstanceConfigs()

    /**
     * The name that identifies the compute node group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pcs-computenodegroup.html#cfn-pcs-computenodegroup-name)
     */
    override fun name(): String? = unwrap(this).getName()

    /**
     * Specifies how EC2 instances are purchased on your behalf.
     *
     * AWS PCS supports On-Demand and Spot instances. For more information, see Instance purchasing
     * options in the Amazon Elastic Compute Cloud User Guide. If you don't provide this option, it
     * defaults to On-Demand.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pcs-computenodegroup.html#cfn-pcs-computenodegroup-purchaseoption)
     */
    override fun purchaseOption(): String? = unwrap(this).getPurchaseOption()

    /**
     * Specifies the boundaries of the compute node group auto scaling.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pcs-computenodegroup.html#cfn-pcs-computenodegroup-scalingconfiguration)
     */
    override fun scalingConfiguration(): Any = unwrap(this).getScalingConfiguration()

    /**
     * Additional options related to the Slurm scheduler.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pcs-computenodegroup.html#cfn-pcs-computenodegroup-slurmconfiguration)
     */
    override fun slurmConfiguration(): Any? = unwrap(this).getSlurmConfiguration()

    /**
     * Additional configuration when you specify `SPOT` as the `purchaseOption` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pcs-computenodegroup.html#cfn-pcs-computenodegroup-spotoptions)
     */
    override fun spotOptions(): Any? = unwrap(this).getSpotOptions()

    /**
     * The list of subnet IDs where instances are provisioned by the compute node group.
     *
     * The subnets must be in the same VPC as the cluster.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pcs-computenodegroup.html#cfn-pcs-computenodegroup-subnetids)
     */
    override fun subnetIds(): List<String> = unwrap(this).getSubnetIds()

    /**
     * 1 or more tags added to the resource.
     *
     * Each tag consists of a tag key and tag value. The tag value is optional and can be an empty
     * string.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pcs-computenodegroup.html#cfn-pcs-computenodegroup-tags)
     */
    override fun tags(): Map<String, String> = unwrap(this).getTags() ?: emptyMap()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnComputeNodeGroupProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.pcs.CfnComputeNodeGroupProps):
        CfnComputeNodeGroupProps = CdkObjectWrappers.wrap(cdkObject) as? CfnComputeNodeGroupProps ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnComputeNodeGroupProps):
        software.amazon.awscdk.services.pcs.CfnComputeNodeGroupProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.pcs.CfnComputeNodeGroupProps
  }
}
