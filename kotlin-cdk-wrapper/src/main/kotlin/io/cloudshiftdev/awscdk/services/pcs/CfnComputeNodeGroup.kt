@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.pcs

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.ITaggableV2
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.Map
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * The `AWS::PCS::ComputeNodeGroup` resource creates an AWS PCS compute node group.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.pcs.*;
 * CfnComputeNodeGroup cfnComputeNodeGroup = CfnComputeNodeGroup.Builder.create(this,
 * "MyCfnComputeNodeGroup")
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
public open class CfnComputeNodeGroup(
  cdkObject: software.amazon.awscdk.services.pcs.CfnComputeNodeGroup,
) : CfnResource(cdkObject),
    IInspectable,
    ITaggableV2 {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnComputeNodeGroupProps,
  ) :
      this(software.amazon.awscdk.services.pcs.CfnComputeNodeGroup(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id, props.let(CfnComputeNodeGroupProps.Companion::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnComputeNodeGroupProps.Builder.() -> Unit,
  ) : this(scope, id, CfnComputeNodeGroupProps(props)
  )

  /**
   * The ID of the Amazon Machine Image (AMI) that AWS PCS uses to launch instances.
   */
  public open fun amiId(): String? = unwrap(this).getAmiId()

  /**
   * The ID of the Amazon Machine Image (AMI) that AWS PCS uses to launch instances.
   */
  public open fun amiId(`value`: String) {
    unwrap(this).setAmiId(`value`)
  }

  /**
   * The unique Amazon Resource Name (ARN) of the compute node group.
   */
  public open fun attrArn(): String = unwrap(this).getAttrArn()

  /**
   * The list of errors that occurred during compute node group provisioning.
   */
  public open fun attrErrorInfo(): IResolvable =
      unwrap(this).getAttrErrorInfo().let(IResolvable::wrap)

  /**
   * The generated unique ID of the compute node group.
   */
  public open fun attrId(): String = unwrap(this).getAttrId()

  /**
   * The provisioning status of the compute node group.
   *
   * The provisioning status doesn't indicate the overall health of the compute node group.
   */
  public open fun attrStatus(): String = unwrap(this).getAttrStatus()

  /**
   * Tag Manager which manages the tags for this resource.
   */
  public override fun cdkTagManager(): TagManager =
      unwrap(this).getCdkTagManager().let(TagManager::wrap)

  /**
   * The ID of the cluster of the compute node group.
   */
  public open fun clusterId(): String = unwrap(this).getClusterId()

  /**
   * The ID of the cluster of the compute node group.
   */
  public open fun clusterId(`value`: String) {
    unwrap(this).setClusterId(`value`)
  }

  /**
   * An Amazon EC2 launch template AWS PCS uses to launch compute nodes.
   */
  public open fun customLaunchTemplate(): Any = unwrap(this).getCustomLaunchTemplate()

  /**
   * An Amazon EC2 launch template AWS PCS uses to launch compute nodes.
   */
  public open fun customLaunchTemplate(`value`: IResolvable) {
    unwrap(this).setCustomLaunchTemplate(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * An Amazon EC2 launch template AWS PCS uses to launch compute nodes.
   */
  public open fun customLaunchTemplate(`value`: CustomLaunchTemplateProperty) {
    unwrap(this).setCustomLaunchTemplate(`value`.let(CustomLaunchTemplateProperty.Companion::unwrap))
  }

  /**
   * An Amazon EC2 launch template AWS PCS uses to launch compute nodes.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("3ba0ddc60ee8351ff138f781f112a85e3ef68453a25ca265fdcf027edb0b8fc3")
  public open fun customLaunchTemplate(`value`: CustomLaunchTemplateProperty.Builder.() -> Unit):
      Unit = customLaunchTemplate(CustomLaunchTemplateProperty(`value`))

  /**
   * The Amazon Resource Name (ARN) of the IAM instance profile used to pass an IAM role when
   * launching EC2 instances.
   */
  public open fun iamInstanceProfileArn(): String = unwrap(this).getIamInstanceProfileArn()

  /**
   * The Amazon Resource Name (ARN) of the IAM instance profile used to pass an IAM role when
   * launching EC2 instances.
   */
  public open fun iamInstanceProfileArn(`value`: String) {
    unwrap(this).setIamInstanceProfileArn(`value`)
  }

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector.Companion::unwrap))
  }

  /**
   * A list of EC2 instance configurations that AWS PCS can provision in the compute node group.
   */
  public open fun instanceConfigs(): Any = unwrap(this).getInstanceConfigs()

  /**
   * A list of EC2 instance configurations that AWS PCS can provision in the compute node group.
   */
  public open fun instanceConfigs(`value`: IResolvable) {
    unwrap(this).setInstanceConfigs(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * A list of EC2 instance configurations that AWS PCS can provision in the compute node group.
   */
  public open fun instanceConfigs(`value`: List<Any>) {
    unwrap(this).setInstanceConfigs(`value`.map{CdkObjectWrappers.unwrap(it)})
  }

  /**
   * A list of EC2 instance configurations that AWS PCS can provision in the compute node group.
   */
  public open fun instanceConfigs(vararg `value`: Any): Unit = instanceConfigs(`value`.toList())

  /**
   * The name that identifies the compute node group.
   */
  public open fun name(): String? = unwrap(this).getName()

  /**
   * The name that identifies the compute node group.
   */
  public open fun name(`value`: String) {
    unwrap(this).setName(`value`)
  }

  /**
   * Specifies how EC2 instances are purchased on your behalf.
   */
  public open fun purchaseOption(): String? = unwrap(this).getPurchaseOption()

  /**
   * Specifies how EC2 instances are purchased on your behalf.
   */
  public open fun purchaseOption(`value`: String) {
    unwrap(this).setPurchaseOption(`value`)
  }

  /**
   * Specifies the boundaries of the compute node group auto scaling.
   */
  public open fun scalingConfiguration(): Any = unwrap(this).getScalingConfiguration()

  /**
   * Specifies the boundaries of the compute node group auto scaling.
   */
  public open fun scalingConfiguration(`value`: IResolvable) {
    unwrap(this).setScalingConfiguration(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * Specifies the boundaries of the compute node group auto scaling.
   */
  public open fun scalingConfiguration(`value`: ScalingConfigurationProperty) {
    unwrap(this).setScalingConfiguration(`value`.let(ScalingConfigurationProperty.Companion::unwrap))
  }

  /**
   * Specifies the boundaries of the compute node group auto scaling.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("3931042a7a10de786428f9a9e82f9b3b3e310181e4eea2603426be464ba85d02")
  public open fun scalingConfiguration(`value`: ScalingConfigurationProperty.Builder.() -> Unit):
      Unit = scalingConfiguration(ScalingConfigurationProperty(`value`))

  /**
   * Additional options related to the Slurm scheduler.
   */
  public open fun slurmConfiguration(): Any? = unwrap(this).getSlurmConfiguration()

  /**
   * Additional options related to the Slurm scheduler.
   */
  public open fun slurmConfiguration(`value`: IResolvable) {
    unwrap(this).setSlurmConfiguration(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * Additional options related to the Slurm scheduler.
   */
  public open fun slurmConfiguration(`value`: SlurmConfigurationProperty) {
    unwrap(this).setSlurmConfiguration(`value`.let(SlurmConfigurationProperty.Companion::unwrap))
  }

  /**
   * Additional options related to the Slurm scheduler.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("5d5ed9d042e785a0063e74d21c50bf1e93a3484d81ef6f88343edf85bf88d4b1")
  public open fun slurmConfiguration(`value`: SlurmConfigurationProperty.Builder.() -> Unit): Unit =
      slurmConfiguration(SlurmConfigurationProperty(`value`))

  /**
   * Additional configuration when you specify `SPOT` as the `purchaseOption` .
   */
  public open fun spotOptions(): Any? = unwrap(this).getSpotOptions()

  /**
   * Additional configuration when you specify `SPOT` as the `purchaseOption` .
   */
  public open fun spotOptions(`value`: IResolvable) {
    unwrap(this).setSpotOptions(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * Additional configuration when you specify `SPOT` as the `purchaseOption` .
   */
  public open fun spotOptions(`value`: SpotOptionsProperty) {
    unwrap(this).setSpotOptions(`value`.let(SpotOptionsProperty.Companion::unwrap))
  }

  /**
   * Additional configuration when you specify `SPOT` as the `purchaseOption` .
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("de53533725c28ca708f23eb4f0161154290ab82dddddfd766620bf161b0d59c1")
  public open fun spotOptions(`value`: SpotOptionsProperty.Builder.() -> Unit): Unit =
      spotOptions(SpotOptionsProperty(`value`))

  /**
   * The list of subnet IDs where instances are provisioned by the compute node group.
   */
  public open fun subnetIds(): List<String> = unwrap(this).getSubnetIds()

  /**
   * The list of subnet IDs where instances are provisioned by the compute node group.
   */
  public open fun subnetIds(`value`: List<String>) {
    unwrap(this).setSubnetIds(`value`)
  }

  /**
   * The list of subnet IDs where instances are provisioned by the compute node group.
   */
  public open fun subnetIds(vararg `value`: String): Unit = subnetIds(`value`.toList())

  /**
   * 1 or more tags added to the resource.
   */
  public open fun tags(): Map<String, String> = unwrap(this).getTags() ?: emptyMap()

  /**
   * 1 or more tags added to the resource.
   */
  public open fun tags(`value`: Map<String, String>) {
    unwrap(this).setTags(`value`)
  }

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.pcs.CfnComputeNodeGroup].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The ID of the Amazon Machine Image (AMI) that AWS PCS uses to launch instances.
     *
     * If not provided, AWS PCS uses the AMI ID specified in the custom launch template.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pcs-computenodegroup.html#cfn-pcs-computenodegroup-amiid)
     * @param amiId The ID of the Amazon Machine Image (AMI) that AWS PCS uses to launch instances. 
     */
    public fun amiId(amiId: String)

    /**
     * The ID of the cluster of the compute node group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pcs-computenodegroup.html#cfn-pcs-computenodegroup-clusterid)
     * @param clusterId The ID of the cluster of the compute node group. 
     */
    public fun clusterId(clusterId: String)

    /**
     * An Amazon EC2 launch template AWS PCS uses to launch compute nodes.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pcs-computenodegroup.html#cfn-pcs-computenodegroup-customlaunchtemplate)
     * @param customLaunchTemplate An Amazon EC2 launch template AWS PCS uses to launch compute
     * nodes. 
     */
    public fun customLaunchTemplate(customLaunchTemplate: IResolvable)

    /**
     * An Amazon EC2 launch template AWS PCS uses to launch compute nodes.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pcs-computenodegroup.html#cfn-pcs-computenodegroup-customlaunchtemplate)
     * @param customLaunchTemplate An Amazon EC2 launch template AWS PCS uses to launch compute
     * nodes. 
     */
    public fun customLaunchTemplate(customLaunchTemplate: CustomLaunchTemplateProperty)

    /**
     * An Amazon EC2 launch template AWS PCS uses to launch compute nodes.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pcs-computenodegroup.html#cfn-pcs-computenodegroup-customlaunchtemplate)
     * @param customLaunchTemplate An Amazon EC2 launch template AWS PCS uses to launch compute
     * nodes. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("f88e4e8714366176b8cb6e3dc50e41a42af493da0bc86c385cbda8018db03463")
    public
        fun customLaunchTemplate(customLaunchTemplate: CustomLaunchTemplateProperty.Builder.() -> Unit)

    /**
     * The Amazon Resource Name (ARN) of the IAM instance profile used to pass an IAM role when
     * launching EC2 instances.
     *
     * The role contained in your instance profile must have pcs:RegisterComputeNodeGroupInstance
     * permissions attached to provision instances correctly.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pcs-computenodegroup.html#cfn-pcs-computenodegroup-iaminstanceprofilearn)
     * @param iamInstanceProfileArn The Amazon Resource Name (ARN) of the IAM instance profile used
     * to pass an IAM role when launching EC2 instances. 
     */
    public fun iamInstanceProfileArn(iamInstanceProfileArn: String)

    /**
     * A list of EC2 instance configurations that AWS PCS can provision in the compute node group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pcs-computenodegroup.html#cfn-pcs-computenodegroup-instanceconfigs)
     * @param instanceConfigs A list of EC2 instance configurations that AWS PCS can provision in
     * the compute node group. 
     */
    public fun instanceConfigs(instanceConfigs: IResolvable)

    /**
     * A list of EC2 instance configurations that AWS PCS can provision in the compute node group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pcs-computenodegroup.html#cfn-pcs-computenodegroup-instanceconfigs)
     * @param instanceConfigs A list of EC2 instance configurations that AWS PCS can provision in
     * the compute node group. 
     */
    public fun instanceConfigs(instanceConfigs: List<Any>)

    /**
     * A list of EC2 instance configurations that AWS PCS can provision in the compute node group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pcs-computenodegroup.html#cfn-pcs-computenodegroup-instanceconfigs)
     * @param instanceConfigs A list of EC2 instance configurations that AWS PCS can provision in
     * the compute node group. 
     */
    public fun instanceConfigs(vararg instanceConfigs: Any)

    /**
     * The name that identifies the compute node group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pcs-computenodegroup.html#cfn-pcs-computenodegroup-name)
     * @param name The name that identifies the compute node group. 
     */
    public fun name(name: String)

    /**
     * Specifies how EC2 instances are purchased on your behalf.
     *
     * AWS PCS supports On-Demand and Spot instances. For more information, see Instance purchasing
     * options in the Amazon Elastic Compute Cloud User Guide. If you don't provide this option, it
     * defaults to On-Demand.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pcs-computenodegroup.html#cfn-pcs-computenodegroup-purchaseoption)
     * @param purchaseOption Specifies how EC2 instances are purchased on your behalf. 
     */
    public fun purchaseOption(purchaseOption: String)

    /**
     * Specifies the boundaries of the compute node group auto scaling.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pcs-computenodegroup.html#cfn-pcs-computenodegroup-scalingconfiguration)
     * @param scalingConfiguration Specifies the boundaries of the compute node group auto scaling. 
     */
    public fun scalingConfiguration(scalingConfiguration: IResolvable)

    /**
     * Specifies the boundaries of the compute node group auto scaling.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pcs-computenodegroup.html#cfn-pcs-computenodegroup-scalingconfiguration)
     * @param scalingConfiguration Specifies the boundaries of the compute node group auto scaling. 
     */
    public fun scalingConfiguration(scalingConfiguration: ScalingConfigurationProperty)

    /**
     * Specifies the boundaries of the compute node group auto scaling.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pcs-computenodegroup.html#cfn-pcs-computenodegroup-scalingconfiguration)
     * @param scalingConfiguration Specifies the boundaries of the compute node group auto scaling. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("0314e41490c15333576911067c24ceb919544a175b6a3a26be5cbbf721114963")
    public
        fun scalingConfiguration(scalingConfiguration: ScalingConfigurationProperty.Builder.() -> Unit)

    /**
     * Additional options related to the Slurm scheduler.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pcs-computenodegroup.html#cfn-pcs-computenodegroup-slurmconfiguration)
     * @param slurmConfiguration Additional options related to the Slurm scheduler. 
     */
    public fun slurmConfiguration(slurmConfiguration: IResolvable)

    /**
     * Additional options related to the Slurm scheduler.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pcs-computenodegroup.html#cfn-pcs-computenodegroup-slurmconfiguration)
     * @param slurmConfiguration Additional options related to the Slurm scheduler. 
     */
    public fun slurmConfiguration(slurmConfiguration: SlurmConfigurationProperty)

    /**
     * Additional options related to the Slurm scheduler.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pcs-computenodegroup.html#cfn-pcs-computenodegroup-slurmconfiguration)
     * @param slurmConfiguration Additional options related to the Slurm scheduler. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("72c58b1e09177d69fe58c341dd041c90bb2bc72d6f0b5173c35a1861c9e3c622")
    public fun slurmConfiguration(slurmConfiguration: SlurmConfigurationProperty.Builder.() -> Unit)

    /**
     * Additional configuration when you specify `SPOT` as the `purchaseOption` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pcs-computenodegroup.html#cfn-pcs-computenodegroup-spotoptions)
     * @param spotOptions Additional configuration when you specify `SPOT` as the `purchaseOption` .
     * 
     */
    public fun spotOptions(spotOptions: IResolvable)

    /**
     * Additional configuration when you specify `SPOT` as the `purchaseOption` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pcs-computenodegroup.html#cfn-pcs-computenodegroup-spotoptions)
     * @param spotOptions Additional configuration when you specify `SPOT` as the `purchaseOption` .
     * 
     */
    public fun spotOptions(spotOptions: SpotOptionsProperty)

    /**
     * Additional configuration when you specify `SPOT` as the `purchaseOption` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pcs-computenodegroup.html#cfn-pcs-computenodegroup-spotoptions)
     * @param spotOptions Additional configuration when you specify `SPOT` as the `purchaseOption` .
     * 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("689c572818ab5da5762211dfe4414460e89ade097b942299a25b69f02b624166")
    public fun spotOptions(spotOptions: SpotOptionsProperty.Builder.() -> Unit)

    /**
     * The list of subnet IDs where instances are provisioned by the compute node group.
     *
     * The subnets must be in the same VPC as the cluster.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pcs-computenodegroup.html#cfn-pcs-computenodegroup-subnetids)
     * @param subnetIds The list of subnet IDs where instances are provisioned by the compute node
     * group. 
     */
    public fun subnetIds(subnetIds: List<String>)

    /**
     * The list of subnet IDs where instances are provisioned by the compute node group.
     *
     * The subnets must be in the same VPC as the cluster.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pcs-computenodegroup.html#cfn-pcs-computenodegroup-subnetids)
     * @param subnetIds The list of subnet IDs where instances are provisioned by the compute node
     * group. 
     */
    public fun subnetIds(vararg subnetIds: String)

    /**
     * 1 or more tags added to the resource.
     *
     * Each tag consists of a tag key and tag value. The tag value is optional and can be an empty
     * string.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pcs-computenodegroup.html#cfn-pcs-computenodegroup-tags)
     * @param tags 1 or more tags added to the resource. 
     */
    public fun tags(tags: Map<String, String>)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.pcs.CfnComputeNodeGroup.Builder =
        software.amazon.awscdk.services.pcs.CfnComputeNodeGroup.Builder.create(scope, id)

    /**
     * The ID of the Amazon Machine Image (AMI) that AWS PCS uses to launch instances.
     *
     * If not provided, AWS PCS uses the AMI ID specified in the custom launch template.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pcs-computenodegroup.html#cfn-pcs-computenodegroup-amiid)
     * @param amiId The ID of the Amazon Machine Image (AMI) that AWS PCS uses to launch instances. 
     */
    override fun amiId(amiId: String) {
      cdkBuilder.amiId(amiId)
    }

    /**
     * The ID of the cluster of the compute node group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pcs-computenodegroup.html#cfn-pcs-computenodegroup-clusterid)
     * @param clusterId The ID of the cluster of the compute node group. 
     */
    override fun clusterId(clusterId: String) {
      cdkBuilder.clusterId(clusterId)
    }

    /**
     * An Amazon EC2 launch template AWS PCS uses to launch compute nodes.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pcs-computenodegroup.html#cfn-pcs-computenodegroup-customlaunchtemplate)
     * @param customLaunchTemplate An Amazon EC2 launch template AWS PCS uses to launch compute
     * nodes. 
     */
    override fun customLaunchTemplate(customLaunchTemplate: IResolvable) {
      cdkBuilder.customLaunchTemplate(customLaunchTemplate.let(IResolvable.Companion::unwrap))
    }

    /**
     * An Amazon EC2 launch template AWS PCS uses to launch compute nodes.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pcs-computenodegroup.html#cfn-pcs-computenodegroup-customlaunchtemplate)
     * @param customLaunchTemplate An Amazon EC2 launch template AWS PCS uses to launch compute
     * nodes. 
     */
    override fun customLaunchTemplate(customLaunchTemplate: CustomLaunchTemplateProperty) {
      cdkBuilder.customLaunchTemplate(customLaunchTemplate.let(CustomLaunchTemplateProperty.Companion::unwrap))
    }

    /**
     * An Amazon EC2 launch template AWS PCS uses to launch compute nodes.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pcs-computenodegroup.html#cfn-pcs-computenodegroup-customlaunchtemplate)
     * @param customLaunchTemplate An Amazon EC2 launch template AWS PCS uses to launch compute
     * nodes. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("f88e4e8714366176b8cb6e3dc50e41a42af493da0bc86c385cbda8018db03463")
    override
        fun customLaunchTemplate(customLaunchTemplate: CustomLaunchTemplateProperty.Builder.() -> Unit):
        Unit = customLaunchTemplate(CustomLaunchTemplateProperty(customLaunchTemplate))

    /**
     * The Amazon Resource Name (ARN) of the IAM instance profile used to pass an IAM role when
     * launching EC2 instances.
     *
     * The role contained in your instance profile must have pcs:RegisterComputeNodeGroupInstance
     * permissions attached to provision instances correctly.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pcs-computenodegroup.html#cfn-pcs-computenodegroup-iaminstanceprofilearn)
     * @param iamInstanceProfileArn The Amazon Resource Name (ARN) of the IAM instance profile used
     * to pass an IAM role when launching EC2 instances. 
     */
    override fun iamInstanceProfileArn(iamInstanceProfileArn: String) {
      cdkBuilder.iamInstanceProfileArn(iamInstanceProfileArn)
    }

    /**
     * A list of EC2 instance configurations that AWS PCS can provision in the compute node group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pcs-computenodegroup.html#cfn-pcs-computenodegroup-instanceconfigs)
     * @param instanceConfigs A list of EC2 instance configurations that AWS PCS can provision in
     * the compute node group. 
     */
    override fun instanceConfigs(instanceConfigs: IResolvable) {
      cdkBuilder.instanceConfigs(instanceConfigs.let(IResolvable.Companion::unwrap))
    }

    /**
     * A list of EC2 instance configurations that AWS PCS can provision in the compute node group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pcs-computenodegroup.html#cfn-pcs-computenodegroup-instanceconfigs)
     * @param instanceConfigs A list of EC2 instance configurations that AWS PCS can provision in
     * the compute node group. 
     */
    override fun instanceConfigs(instanceConfigs: List<Any>) {
      cdkBuilder.instanceConfigs(instanceConfigs.map{CdkObjectWrappers.unwrap(it)})
    }

    /**
     * A list of EC2 instance configurations that AWS PCS can provision in the compute node group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pcs-computenodegroup.html#cfn-pcs-computenodegroup-instanceconfigs)
     * @param instanceConfigs A list of EC2 instance configurations that AWS PCS can provision in
     * the compute node group. 
     */
    override fun instanceConfigs(vararg instanceConfigs: Any): Unit =
        instanceConfigs(instanceConfigs.toList())

    /**
     * The name that identifies the compute node group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pcs-computenodegroup.html#cfn-pcs-computenodegroup-name)
     * @param name The name that identifies the compute node group. 
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * Specifies how EC2 instances are purchased on your behalf.
     *
     * AWS PCS supports On-Demand and Spot instances. For more information, see Instance purchasing
     * options in the Amazon Elastic Compute Cloud User Guide. If you don't provide this option, it
     * defaults to On-Demand.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pcs-computenodegroup.html#cfn-pcs-computenodegroup-purchaseoption)
     * @param purchaseOption Specifies how EC2 instances are purchased on your behalf. 
     */
    override fun purchaseOption(purchaseOption: String) {
      cdkBuilder.purchaseOption(purchaseOption)
    }

    /**
     * Specifies the boundaries of the compute node group auto scaling.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pcs-computenodegroup.html#cfn-pcs-computenodegroup-scalingconfiguration)
     * @param scalingConfiguration Specifies the boundaries of the compute node group auto scaling. 
     */
    override fun scalingConfiguration(scalingConfiguration: IResolvable) {
      cdkBuilder.scalingConfiguration(scalingConfiguration.let(IResolvable.Companion::unwrap))
    }

    /**
     * Specifies the boundaries of the compute node group auto scaling.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pcs-computenodegroup.html#cfn-pcs-computenodegroup-scalingconfiguration)
     * @param scalingConfiguration Specifies the boundaries of the compute node group auto scaling. 
     */
    override fun scalingConfiguration(scalingConfiguration: ScalingConfigurationProperty) {
      cdkBuilder.scalingConfiguration(scalingConfiguration.let(ScalingConfigurationProperty.Companion::unwrap))
    }

    /**
     * Specifies the boundaries of the compute node group auto scaling.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pcs-computenodegroup.html#cfn-pcs-computenodegroup-scalingconfiguration)
     * @param scalingConfiguration Specifies the boundaries of the compute node group auto scaling. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("0314e41490c15333576911067c24ceb919544a175b6a3a26be5cbbf721114963")
    override
        fun scalingConfiguration(scalingConfiguration: ScalingConfigurationProperty.Builder.() -> Unit):
        Unit = scalingConfiguration(ScalingConfigurationProperty(scalingConfiguration))

    /**
     * Additional options related to the Slurm scheduler.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pcs-computenodegroup.html#cfn-pcs-computenodegroup-slurmconfiguration)
     * @param slurmConfiguration Additional options related to the Slurm scheduler. 
     */
    override fun slurmConfiguration(slurmConfiguration: IResolvable) {
      cdkBuilder.slurmConfiguration(slurmConfiguration.let(IResolvable.Companion::unwrap))
    }

    /**
     * Additional options related to the Slurm scheduler.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pcs-computenodegroup.html#cfn-pcs-computenodegroup-slurmconfiguration)
     * @param slurmConfiguration Additional options related to the Slurm scheduler. 
     */
    override fun slurmConfiguration(slurmConfiguration: SlurmConfigurationProperty) {
      cdkBuilder.slurmConfiguration(slurmConfiguration.let(SlurmConfigurationProperty.Companion::unwrap))
    }

    /**
     * Additional options related to the Slurm scheduler.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pcs-computenodegroup.html#cfn-pcs-computenodegroup-slurmconfiguration)
     * @param slurmConfiguration Additional options related to the Slurm scheduler. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("72c58b1e09177d69fe58c341dd041c90bb2bc72d6f0b5173c35a1861c9e3c622")
    override
        fun slurmConfiguration(slurmConfiguration: SlurmConfigurationProperty.Builder.() -> Unit):
        Unit = slurmConfiguration(SlurmConfigurationProperty(slurmConfiguration))

    /**
     * Additional configuration when you specify `SPOT` as the `purchaseOption` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pcs-computenodegroup.html#cfn-pcs-computenodegroup-spotoptions)
     * @param spotOptions Additional configuration when you specify `SPOT` as the `purchaseOption` .
     * 
     */
    override fun spotOptions(spotOptions: IResolvable) {
      cdkBuilder.spotOptions(spotOptions.let(IResolvable.Companion::unwrap))
    }

    /**
     * Additional configuration when you specify `SPOT` as the `purchaseOption` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pcs-computenodegroup.html#cfn-pcs-computenodegroup-spotoptions)
     * @param spotOptions Additional configuration when you specify `SPOT` as the `purchaseOption` .
     * 
     */
    override fun spotOptions(spotOptions: SpotOptionsProperty) {
      cdkBuilder.spotOptions(spotOptions.let(SpotOptionsProperty.Companion::unwrap))
    }

    /**
     * Additional configuration when you specify `SPOT` as the `purchaseOption` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pcs-computenodegroup.html#cfn-pcs-computenodegroup-spotoptions)
     * @param spotOptions Additional configuration when you specify `SPOT` as the `purchaseOption` .
     * 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("689c572818ab5da5762211dfe4414460e89ade097b942299a25b69f02b624166")
    override fun spotOptions(spotOptions: SpotOptionsProperty.Builder.() -> Unit): Unit =
        spotOptions(SpotOptionsProperty(spotOptions))

    /**
     * The list of subnet IDs where instances are provisioned by the compute node group.
     *
     * The subnets must be in the same VPC as the cluster.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pcs-computenodegroup.html#cfn-pcs-computenodegroup-subnetids)
     * @param subnetIds The list of subnet IDs where instances are provisioned by the compute node
     * group. 
     */
    override fun subnetIds(subnetIds: List<String>) {
      cdkBuilder.subnetIds(subnetIds)
    }

    /**
     * The list of subnet IDs where instances are provisioned by the compute node group.
     *
     * The subnets must be in the same VPC as the cluster.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pcs-computenodegroup.html#cfn-pcs-computenodegroup-subnetids)
     * @param subnetIds The list of subnet IDs where instances are provisioned by the compute node
     * group. 
     */
    override fun subnetIds(vararg subnetIds: String): Unit = subnetIds(subnetIds.toList())

    /**
     * 1 or more tags added to the resource.
     *
     * Each tag consists of a tag key and tag value. The tag value is optional and can be an empty
     * string.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pcs-computenodegroup.html#cfn-pcs-computenodegroup-tags)
     * @param tags 1 or more tags added to the resource. 
     */
    override fun tags(tags: Map<String, String>) {
      cdkBuilder.tags(tags)
    }

    public fun build(): software.amazon.awscdk.services.pcs.CfnComputeNodeGroup = cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.pcs.CfnComputeNodeGroup.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnComputeNodeGroup {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnComputeNodeGroup(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.pcs.CfnComputeNodeGroup):
        CfnComputeNodeGroup = CfnComputeNodeGroup(cdkObject)

    internal fun unwrap(wrapped: CfnComputeNodeGroup):
        software.amazon.awscdk.services.pcs.CfnComputeNodeGroup = wrapped.cdkObject as
        software.amazon.awscdk.services.pcs.CfnComputeNodeGroup
  }

  /**
   * An Amazon EC2 launch template AWS PCS uses to launch compute nodes.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.pcs.*;
   * CustomLaunchTemplateProperty customLaunchTemplateProperty =
   * CustomLaunchTemplateProperty.builder()
   * .version("version")
   * // the properties below are optional
   * .templateId("templateId")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pcs-computenodegroup-customlaunchtemplate.html)
   */
  public interface CustomLaunchTemplateProperty {
    /**
     * The ID of the EC2 launch template to use to provision instances.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pcs-computenodegroup-customlaunchtemplate.html#cfn-pcs-computenodegroup-customlaunchtemplate-templateid)
     */
    public fun templateId(): String? = unwrap(this).getTemplateId()

    /**
     * The version of the EC2 launch template to use to provision instances.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pcs-computenodegroup-customlaunchtemplate.html#cfn-pcs-computenodegroup-customlaunchtemplate-version)
     */
    public fun version(): String

    /**
     * A builder for [CustomLaunchTemplateProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param templateId The ID of the EC2 launch template to use to provision instances.
       */
      public fun templateId(templateId: String)

      /**
       * @param version The version of the EC2 launch template to use to provision instances. 
       */
      public fun version(version: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.pcs.CfnComputeNodeGroup.CustomLaunchTemplateProperty.Builder
          =
          software.amazon.awscdk.services.pcs.CfnComputeNodeGroup.CustomLaunchTemplateProperty.builder()

      /**
       * @param templateId The ID of the EC2 launch template to use to provision instances.
       */
      override fun templateId(templateId: String) {
        cdkBuilder.templateId(templateId)
      }

      /**
       * @param version The version of the EC2 launch template to use to provision instances. 
       */
      override fun version(version: String) {
        cdkBuilder.version(version)
      }

      public fun build():
          software.amazon.awscdk.services.pcs.CfnComputeNodeGroup.CustomLaunchTemplateProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.pcs.CfnComputeNodeGroup.CustomLaunchTemplateProperty,
    ) : CdkObject(cdkObject),
        CustomLaunchTemplateProperty {
      /**
       * The ID of the EC2 launch template to use to provision instances.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pcs-computenodegroup-customlaunchtemplate.html#cfn-pcs-computenodegroup-customlaunchtemplate-templateid)
       */
      override fun templateId(): String? = unwrap(this).getTemplateId()

      /**
       * The version of the EC2 launch template to use to provision instances.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pcs-computenodegroup-customlaunchtemplate.html#cfn-pcs-computenodegroup-customlaunchtemplate-version)
       */
      override fun version(): String = unwrap(this).getVersion()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): CustomLaunchTemplateProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.pcs.CfnComputeNodeGroup.CustomLaunchTemplateProperty):
          CustomLaunchTemplateProperty = CdkObjectWrappers.wrap(cdkObject) as?
          CustomLaunchTemplateProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: CustomLaunchTemplateProperty):
          software.amazon.awscdk.services.pcs.CfnComputeNodeGroup.CustomLaunchTemplateProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.pcs.CfnComputeNodeGroup.CustomLaunchTemplateProperty
    }
  }

  /**
   * The list of errors that occurred during compute node group provisioning.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.pcs.*;
   * ErrorInfoProperty errorInfoProperty = ErrorInfoProperty.builder()
   * .code("code")
   * .message("message")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pcs-computenodegroup-errorinfo.html)
   */
  public interface ErrorInfoProperty {
    /**
     * The short-form error code.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pcs-computenodegroup-errorinfo.html#cfn-pcs-computenodegroup-errorinfo-code)
     */
    public fun code(): String? = unwrap(this).getCode()

    /**
     * The detailed error information.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pcs-computenodegroup-errorinfo.html#cfn-pcs-computenodegroup-errorinfo-message)
     */
    public fun message(): String? = unwrap(this).getMessage()

    /**
     * A builder for [ErrorInfoProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param code The short-form error code.
       */
      public fun code(code: String)

      /**
       * @param message The detailed error information.
       */
      public fun message(message: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.pcs.CfnComputeNodeGroup.ErrorInfoProperty.Builder =
          software.amazon.awscdk.services.pcs.CfnComputeNodeGroup.ErrorInfoProperty.builder()

      /**
       * @param code The short-form error code.
       */
      override fun code(code: String) {
        cdkBuilder.code(code)
      }

      /**
       * @param message The detailed error information.
       */
      override fun message(message: String) {
        cdkBuilder.message(message)
      }

      public fun build(): software.amazon.awscdk.services.pcs.CfnComputeNodeGroup.ErrorInfoProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.pcs.CfnComputeNodeGroup.ErrorInfoProperty,
    ) : CdkObject(cdkObject),
        ErrorInfoProperty {
      /**
       * The short-form error code.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pcs-computenodegroup-errorinfo.html#cfn-pcs-computenodegroup-errorinfo-code)
       */
      override fun code(): String? = unwrap(this).getCode()

      /**
       * The detailed error information.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pcs-computenodegroup-errorinfo.html#cfn-pcs-computenodegroup-errorinfo-message)
       */
      override fun message(): String? = unwrap(this).getMessage()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): ErrorInfoProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.pcs.CfnComputeNodeGroup.ErrorInfoProperty):
          ErrorInfoProperty = CdkObjectWrappers.wrap(cdkObject) as? ErrorInfoProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: ErrorInfoProperty):
          software.amazon.awscdk.services.pcs.CfnComputeNodeGroup.ErrorInfoProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.pcs.CfnComputeNodeGroup.ErrorInfoProperty
    }
  }

  /**
   * An EC2 instance configuration AWS PCS uses to launch compute nodes.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.pcs.*;
   * InstanceConfigProperty instanceConfigProperty = InstanceConfigProperty.builder()
   * .instanceType("instanceType")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pcs-computenodegroup-instanceconfig.html)
   */
  public interface InstanceConfigProperty {
    /**
     * The EC2 instance type that AWS PCS can provision in the compute node group.
     *
     * Example: `t2.xlarge`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pcs-computenodegroup-instanceconfig.html#cfn-pcs-computenodegroup-instanceconfig-instancetype)
     */
    public fun instanceType(): String? = unwrap(this).getInstanceType()

    /**
     * A builder for [InstanceConfigProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param instanceType The EC2 instance type that AWS PCS can provision in the compute node
       * group.
       * Example: `t2.xlarge`
       */
      public fun instanceType(instanceType: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.pcs.CfnComputeNodeGroup.InstanceConfigProperty.Builder =
          software.amazon.awscdk.services.pcs.CfnComputeNodeGroup.InstanceConfigProperty.builder()

      /**
       * @param instanceType The EC2 instance type that AWS PCS can provision in the compute node
       * group.
       * Example: `t2.xlarge`
       */
      override fun instanceType(instanceType: String) {
        cdkBuilder.instanceType(instanceType)
      }

      public fun build():
          software.amazon.awscdk.services.pcs.CfnComputeNodeGroup.InstanceConfigProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.pcs.CfnComputeNodeGroup.InstanceConfigProperty,
    ) : CdkObject(cdkObject),
        InstanceConfigProperty {
      /**
       * The EC2 instance type that AWS PCS can provision in the compute node group.
       *
       * Example: `t2.xlarge`
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pcs-computenodegroup-instanceconfig.html#cfn-pcs-computenodegroup-instanceconfig-instancetype)
       */
      override fun instanceType(): String? = unwrap(this).getInstanceType()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): InstanceConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.pcs.CfnComputeNodeGroup.InstanceConfigProperty):
          InstanceConfigProperty = CdkObjectWrappers.wrap(cdkObject) as? InstanceConfigProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: InstanceConfigProperty):
          software.amazon.awscdk.services.pcs.CfnComputeNodeGroup.InstanceConfigProperty = (wrapped
          as CdkObject).cdkObject as
          software.amazon.awscdk.services.pcs.CfnComputeNodeGroup.InstanceConfigProperty
    }
  }

  /**
   * Specifies the boundaries of the compute node group auto scaling.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.pcs.*;
   * ScalingConfigurationProperty scalingConfigurationProperty =
   * ScalingConfigurationProperty.builder()
   * .maxInstanceCount(123)
   * .minInstanceCount(123)
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pcs-computenodegroup-scalingconfiguration.html)
   */
  public interface ScalingConfigurationProperty {
    /**
     * The upper bound of the number of instances allowed in the compute fleet.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pcs-computenodegroup-scalingconfiguration.html#cfn-pcs-computenodegroup-scalingconfiguration-maxinstancecount)
     */
    public fun maxInstanceCount(): Number

    /**
     * The lower bound of the number of instances allowed in the compute fleet.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pcs-computenodegroup-scalingconfiguration.html#cfn-pcs-computenodegroup-scalingconfiguration-mininstancecount)
     */
    public fun minInstanceCount(): Number

    /**
     * A builder for [ScalingConfigurationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param maxInstanceCount The upper bound of the number of instances allowed in the compute
       * fleet. 
       */
      public fun maxInstanceCount(maxInstanceCount: Number)

      /**
       * @param minInstanceCount The lower bound of the number of instances allowed in the compute
       * fleet. 
       */
      public fun minInstanceCount(minInstanceCount: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.pcs.CfnComputeNodeGroup.ScalingConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.pcs.CfnComputeNodeGroup.ScalingConfigurationProperty.builder()

      /**
       * @param maxInstanceCount The upper bound of the number of instances allowed in the compute
       * fleet. 
       */
      override fun maxInstanceCount(maxInstanceCount: Number) {
        cdkBuilder.maxInstanceCount(maxInstanceCount)
      }

      /**
       * @param minInstanceCount The lower bound of the number of instances allowed in the compute
       * fleet. 
       */
      override fun minInstanceCount(minInstanceCount: Number) {
        cdkBuilder.minInstanceCount(minInstanceCount)
      }

      public fun build():
          software.amazon.awscdk.services.pcs.CfnComputeNodeGroup.ScalingConfigurationProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.pcs.CfnComputeNodeGroup.ScalingConfigurationProperty,
    ) : CdkObject(cdkObject),
        ScalingConfigurationProperty {
      /**
       * The upper bound of the number of instances allowed in the compute fleet.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pcs-computenodegroup-scalingconfiguration.html#cfn-pcs-computenodegroup-scalingconfiguration-maxinstancecount)
       */
      override fun maxInstanceCount(): Number = unwrap(this).getMaxInstanceCount()

      /**
       * The lower bound of the number of instances allowed in the compute fleet.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pcs-computenodegroup-scalingconfiguration.html#cfn-pcs-computenodegroup-scalingconfiguration-mininstancecount)
       */
      override fun minInstanceCount(): Number = unwrap(this).getMinInstanceCount()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): ScalingConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.pcs.CfnComputeNodeGroup.ScalingConfigurationProperty):
          ScalingConfigurationProperty = CdkObjectWrappers.wrap(cdkObject) as?
          ScalingConfigurationProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: ScalingConfigurationProperty):
          software.amazon.awscdk.services.pcs.CfnComputeNodeGroup.ScalingConfigurationProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.pcs.CfnComputeNodeGroup.ScalingConfigurationProperty
    }
  }

  /**
   * Additional options related to the Slurm scheduler.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.pcs.*;
   * SlurmConfigurationProperty slurmConfigurationProperty = SlurmConfigurationProperty.builder()
   * .slurmCustomSettings(List.of(SlurmCustomSettingProperty.builder()
   * .parameterName("parameterName")
   * .parameterValue("parameterValue")
   * .build()))
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pcs-computenodegroup-slurmconfiguration.html)
   */
  public interface SlurmConfigurationProperty {
    /**
     * Additional Slurm-specific configuration that directly maps to Slurm settings.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pcs-computenodegroup-slurmconfiguration.html#cfn-pcs-computenodegroup-slurmconfiguration-slurmcustomsettings)
     */
    public fun slurmCustomSettings(): Any? = unwrap(this).getSlurmCustomSettings()

    /**
     * A builder for [SlurmConfigurationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param slurmCustomSettings Additional Slurm-specific configuration that directly maps to
       * Slurm settings.
       */
      public fun slurmCustomSettings(slurmCustomSettings: IResolvable)

      /**
       * @param slurmCustomSettings Additional Slurm-specific configuration that directly maps to
       * Slurm settings.
       */
      public fun slurmCustomSettings(slurmCustomSettings: List<Any>)

      /**
       * @param slurmCustomSettings Additional Slurm-specific configuration that directly maps to
       * Slurm settings.
       */
      public fun slurmCustomSettings(vararg slurmCustomSettings: Any)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.pcs.CfnComputeNodeGroup.SlurmConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.pcs.CfnComputeNodeGroup.SlurmConfigurationProperty.builder()

      /**
       * @param slurmCustomSettings Additional Slurm-specific configuration that directly maps to
       * Slurm settings.
       */
      override fun slurmCustomSettings(slurmCustomSettings: IResolvable) {
        cdkBuilder.slurmCustomSettings(slurmCustomSettings.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param slurmCustomSettings Additional Slurm-specific configuration that directly maps to
       * Slurm settings.
       */
      override fun slurmCustomSettings(slurmCustomSettings: List<Any>) {
        cdkBuilder.slurmCustomSettings(slurmCustomSettings.map{CdkObjectWrappers.unwrap(it)})
      }

      /**
       * @param slurmCustomSettings Additional Slurm-specific configuration that directly maps to
       * Slurm settings.
       */
      override fun slurmCustomSettings(vararg slurmCustomSettings: Any): Unit =
          slurmCustomSettings(slurmCustomSettings.toList())

      public fun build():
          software.amazon.awscdk.services.pcs.CfnComputeNodeGroup.SlurmConfigurationProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.pcs.CfnComputeNodeGroup.SlurmConfigurationProperty,
    ) : CdkObject(cdkObject),
        SlurmConfigurationProperty {
      /**
       * Additional Slurm-specific configuration that directly maps to Slurm settings.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pcs-computenodegroup-slurmconfiguration.html#cfn-pcs-computenodegroup-slurmconfiguration-slurmcustomsettings)
       */
      override fun slurmCustomSettings(): Any? = unwrap(this).getSlurmCustomSettings()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): SlurmConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.pcs.CfnComputeNodeGroup.SlurmConfigurationProperty):
          SlurmConfigurationProperty = CdkObjectWrappers.wrap(cdkObject) as?
          SlurmConfigurationProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: SlurmConfigurationProperty):
          software.amazon.awscdk.services.pcs.CfnComputeNodeGroup.SlurmConfigurationProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.pcs.CfnComputeNodeGroup.SlurmConfigurationProperty
    }
  }

  /**
   * Additional settings that directly map to Slurm settings.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.pcs.*;
   * SlurmCustomSettingProperty slurmCustomSettingProperty = SlurmCustomSettingProperty.builder()
   * .parameterName("parameterName")
   * .parameterValue("parameterValue")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pcs-computenodegroup-slurmcustomsetting.html)
   */
  public interface SlurmCustomSettingProperty {
    /**
     * AWS PCS supports configuration of the following Slurm parameters:.
     *
     * * For *clusters*
     * *
     * [`Prolog`](https://docs.aws.amazon.com/https://slurm.schedmd.com/slurm.conf.html#OPT_Prolog_1)
     * *
     * [`Epilog`](https://docs.aws.amazon.com/https://slurm.schedmd.com/slurm.conf.html#OPT_Epilog_1)
     * *
     * [`SelectTypeParameters`](https://docs.aws.amazon.com/https://slurm.schedmd.com/slurm.conf.html#OPT_SelectTypeParameters)
     * * For *compute node groups*
     * *
     * [`Weight`](https://docs.aws.amazon.com/https://slurm.schedmd.com/slurm.conf.html#OPT_Weight)
     * *
     * [`RealMemory`](https://docs.aws.amazon.com/https://slurm.schedmd.com/slurm.conf.html#OPT_Weight)
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pcs-computenodegroup-slurmcustomsetting.html#cfn-pcs-computenodegroup-slurmcustomsetting-parametername)
     */
    public fun parameterName(): String

    /**
     * The values for the configured Slurm settings.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pcs-computenodegroup-slurmcustomsetting.html#cfn-pcs-computenodegroup-slurmcustomsetting-parametervalue)
     */
    public fun parameterValue(): String

    /**
     * A builder for [SlurmCustomSettingProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param parameterName AWS PCS supports configuration of the following Slurm parameters:. 
       * * For *clusters*
       * *
       * [`Prolog`](https://docs.aws.amazon.com/https://slurm.schedmd.com/slurm.conf.html#OPT_Prolog_1)
       * *
       * [`Epilog`](https://docs.aws.amazon.com/https://slurm.schedmd.com/slurm.conf.html#OPT_Epilog_1)
       * *
       * [`SelectTypeParameters`](https://docs.aws.amazon.com/https://slurm.schedmd.com/slurm.conf.html#OPT_SelectTypeParameters)
       * * For *compute node groups*
       * *
       * [`Weight`](https://docs.aws.amazon.com/https://slurm.schedmd.com/slurm.conf.html#OPT_Weight)
       * *
       * [`RealMemory`](https://docs.aws.amazon.com/https://slurm.schedmd.com/slurm.conf.html#OPT_Weight)
       */
      public fun parameterName(parameterName: String)

      /**
       * @param parameterValue The values for the configured Slurm settings. 
       */
      public fun parameterValue(parameterValue: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.pcs.CfnComputeNodeGroup.SlurmCustomSettingProperty.Builder
          =
          software.amazon.awscdk.services.pcs.CfnComputeNodeGroup.SlurmCustomSettingProperty.builder()

      /**
       * @param parameterName AWS PCS supports configuration of the following Slurm parameters:. 
       * * For *clusters*
       * *
       * [`Prolog`](https://docs.aws.amazon.com/https://slurm.schedmd.com/slurm.conf.html#OPT_Prolog_1)
       * *
       * [`Epilog`](https://docs.aws.amazon.com/https://slurm.schedmd.com/slurm.conf.html#OPT_Epilog_1)
       * *
       * [`SelectTypeParameters`](https://docs.aws.amazon.com/https://slurm.schedmd.com/slurm.conf.html#OPT_SelectTypeParameters)
       * * For *compute node groups*
       * *
       * [`Weight`](https://docs.aws.amazon.com/https://slurm.schedmd.com/slurm.conf.html#OPT_Weight)
       * *
       * [`RealMemory`](https://docs.aws.amazon.com/https://slurm.schedmd.com/slurm.conf.html#OPT_Weight)
       */
      override fun parameterName(parameterName: String) {
        cdkBuilder.parameterName(parameterName)
      }

      /**
       * @param parameterValue The values for the configured Slurm settings. 
       */
      override fun parameterValue(parameterValue: String) {
        cdkBuilder.parameterValue(parameterValue)
      }

      public fun build():
          software.amazon.awscdk.services.pcs.CfnComputeNodeGroup.SlurmCustomSettingProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.pcs.CfnComputeNodeGroup.SlurmCustomSettingProperty,
    ) : CdkObject(cdkObject),
        SlurmCustomSettingProperty {
      /**
       * AWS PCS supports configuration of the following Slurm parameters:.
       *
       * * For *clusters*
       * *
       * [`Prolog`](https://docs.aws.amazon.com/https://slurm.schedmd.com/slurm.conf.html#OPT_Prolog_1)
       * *
       * [`Epilog`](https://docs.aws.amazon.com/https://slurm.schedmd.com/slurm.conf.html#OPT_Epilog_1)
       * *
       * [`SelectTypeParameters`](https://docs.aws.amazon.com/https://slurm.schedmd.com/slurm.conf.html#OPT_SelectTypeParameters)
       * * For *compute node groups*
       * *
       * [`Weight`](https://docs.aws.amazon.com/https://slurm.schedmd.com/slurm.conf.html#OPT_Weight)
       * *
       * [`RealMemory`](https://docs.aws.amazon.com/https://slurm.schedmd.com/slurm.conf.html#OPT_Weight)
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pcs-computenodegroup-slurmcustomsetting.html#cfn-pcs-computenodegroup-slurmcustomsetting-parametername)
       */
      override fun parameterName(): String = unwrap(this).getParameterName()

      /**
       * The values for the configured Slurm settings.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pcs-computenodegroup-slurmcustomsetting.html#cfn-pcs-computenodegroup-slurmcustomsetting-parametervalue)
       */
      override fun parameterValue(): String = unwrap(this).getParameterValue()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): SlurmCustomSettingProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.pcs.CfnComputeNodeGroup.SlurmCustomSettingProperty):
          SlurmCustomSettingProperty = CdkObjectWrappers.wrap(cdkObject) as?
          SlurmCustomSettingProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: SlurmCustomSettingProperty):
          software.amazon.awscdk.services.pcs.CfnComputeNodeGroup.SlurmCustomSettingProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.pcs.CfnComputeNodeGroup.SlurmCustomSettingProperty
    }
  }

  /**
   * Additional configuration when you specify `SPOT` as the `purchaseOption` .
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.pcs.*;
   * SpotOptionsProperty spotOptionsProperty = SpotOptionsProperty.builder()
   * .allocationStrategy("allocationStrategy")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pcs-computenodegroup-spotoptions.html)
   */
  public interface SpotOptionsProperty {
    /**
     * The Amazon EC2 allocation strategy AWS PCS uses to provision EC2 instances.
     *
     * AWS PCS supports lowest price, capacity optimized, and price capacity optimized. If you don't
     * provide this option, it defaults to price capacity optimized.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pcs-computenodegroup-spotoptions.html#cfn-pcs-computenodegroup-spotoptions-allocationstrategy)
     */
    public fun allocationStrategy(): String? = unwrap(this).getAllocationStrategy()

    /**
     * A builder for [SpotOptionsProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param allocationStrategy The Amazon EC2 allocation strategy AWS PCS uses to provision EC2
       * instances.
       * AWS PCS supports lowest price, capacity optimized, and price capacity optimized. If you
       * don't provide this option, it defaults to price capacity optimized.
       */
      public fun allocationStrategy(allocationStrategy: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.pcs.CfnComputeNodeGroup.SpotOptionsProperty.Builder =
          software.amazon.awscdk.services.pcs.CfnComputeNodeGroup.SpotOptionsProperty.builder()

      /**
       * @param allocationStrategy The Amazon EC2 allocation strategy AWS PCS uses to provision EC2
       * instances.
       * AWS PCS supports lowest price, capacity optimized, and price capacity optimized. If you
       * don't provide this option, it defaults to price capacity optimized.
       */
      override fun allocationStrategy(allocationStrategy: String) {
        cdkBuilder.allocationStrategy(allocationStrategy)
      }

      public fun build():
          software.amazon.awscdk.services.pcs.CfnComputeNodeGroup.SpotOptionsProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.pcs.CfnComputeNodeGroup.SpotOptionsProperty,
    ) : CdkObject(cdkObject),
        SpotOptionsProperty {
      /**
       * The Amazon EC2 allocation strategy AWS PCS uses to provision EC2 instances.
       *
       * AWS PCS supports lowest price, capacity optimized, and price capacity optimized. If you
       * don't provide this option, it defaults to price capacity optimized.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pcs-computenodegroup-spotoptions.html#cfn-pcs-computenodegroup-spotoptions-allocationstrategy)
       */
      override fun allocationStrategy(): String? = unwrap(this).getAllocationStrategy()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): SpotOptionsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.pcs.CfnComputeNodeGroup.SpotOptionsProperty):
          SpotOptionsProperty = CdkObjectWrappers.wrap(cdkObject) as? SpotOptionsProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: SpotOptionsProperty):
          software.amazon.awscdk.services.pcs.CfnComputeNodeGroup.SpotOptionsProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.pcs.CfnComputeNodeGroup.SpotOptionsProperty
    }
  }
}
