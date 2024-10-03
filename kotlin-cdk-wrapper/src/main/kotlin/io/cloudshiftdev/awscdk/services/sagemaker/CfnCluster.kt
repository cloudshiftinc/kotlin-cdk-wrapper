@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.sagemaker

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
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
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * Creates a SageMaker HyperPod cluster.
 *
 * SageMaker HyperPod is a capability of SageMaker for creating and managing persistent clusters for
 * developing large machine learning models, such as large language models (LLMs) and diffusion models.
 * To learn more, see [Amazon SageMaker
 * HyperPod](https://docs.aws.amazon.com/sagemaker/latest/dg/sagemaker-hyperpod.html) in the *Amazon
 * SageMaker Developer Guide* .
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.sagemaker.*;
 * CfnCluster cfnCluster = CfnCluster.Builder.create(this, "MyCfnCluster")
 * .instanceGroups(List.of(ClusterInstanceGroupProperty.builder()
 * .executionRole("executionRole")
 * .instanceCount(123)
 * .instanceGroupName("instanceGroupName")
 * .instanceType("instanceType")
 * .lifeCycleConfig(ClusterLifeCycleConfigProperty.builder()
 * .onCreate("onCreate")
 * .sourceS3Uri("sourceS3Uri")
 * .build())
 * // the properties below are optional
 * .currentCount(123)
 * .instanceStorageConfigs(List.of(ClusterInstanceStorageConfigProperty.builder()
 * .ebsVolumeConfig(ClusterEbsVolumeConfigProperty.builder()
 * .volumeSizeInGb(123)
 * .build())
 * .build()))
 * .onStartDeepHealthChecks(List.of("onStartDeepHealthChecks"))
 * .threadsPerCore(123)
 * .build()))
 * // the properties below are optional
 * .clusterName("clusterName")
 * .nodeRecovery("nodeRecovery")
 * .orchestrator(OrchestratorProperty.builder()
 * .eks(ClusterOrchestratorEksConfigProperty.builder()
 * .clusterArn("clusterArn")
 * .build())
 * .build())
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .vpcConfig(VpcConfigProperty.builder()
 * .securityGroupIds(List.of("securityGroupIds"))
 * .subnets(List.of("subnets"))
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-cluster.html)
 */
public open class CfnCluster(
  cdkObject: software.amazon.awscdk.services.sagemaker.CfnCluster,
) : CfnResource(cdkObject),
    IInspectable,
    ITaggableV2 {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnClusterProps,
  ) :
      this(software.amazon.awscdk.services.sagemaker.CfnCluster(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id, props.let(CfnClusterProps.Companion::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnClusterProps.Builder.() -> Unit,
  ) : this(scope, id, CfnClusterProps(props)
  )

  /**
   * The Amazon Resource Name (ARN) of the SageMaker HyperPod cluster.
   */
  public open fun attrClusterArn(): String = unwrap(this).getAttrClusterArn()

  /**
   * The status of the SageMaker HyperPod cluster.
   */
  public open fun attrClusterStatus(): String = unwrap(this).getAttrClusterStatus()

  /**
   * The time when the SageMaker HyperPod cluster is created.
   */
  public open fun attrCreationTime(): String = unwrap(this).getAttrCreationTime()

  /**
   * The failure message of the SageMaker HyperPod cluster.
   */
  public open fun attrFailureMessage(): String = unwrap(this).getAttrFailureMessage()

  /**
   * Tag Manager which manages the tags for this resource.
   */
  public override fun cdkTagManager(): TagManager =
      unwrap(this).getCdkTagManager().let(TagManager::wrap)

  /**
   * The name of the SageMaker HyperPod cluster.
   */
  public open fun clusterName(): String? = unwrap(this).getClusterName()

  /**
   * The name of the SageMaker HyperPod cluster.
   */
  public open fun clusterName(`value`: String) {
    unwrap(this).setClusterName(`value`)
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
   * The instance groups of the SageMaker HyperPod cluster.
   */
  public open fun instanceGroups(): Any = unwrap(this).getInstanceGroups()

  /**
   * The instance groups of the SageMaker HyperPod cluster.
   */
  public open fun instanceGroups(`value`: IResolvable) {
    unwrap(this).setInstanceGroups(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * The instance groups of the SageMaker HyperPod cluster.
   */
  public open fun instanceGroups(`value`: List<Any>) {
    unwrap(this).setInstanceGroups(`value`.map{CdkObjectWrappers.unwrap(it)})
  }

  /**
   * The instance groups of the SageMaker HyperPod cluster.
   */
  public open fun instanceGroups(vararg `value`: Any): Unit = instanceGroups(`value`.toList())

  /**
   * Specifies whether to enable or disable the automatic node recovery feature of SageMaker
   * HyperPod.
   */
  public open fun nodeRecovery(): String? = unwrap(this).getNodeRecovery()

  /**
   * Specifies whether to enable or disable the automatic node recovery feature of SageMaker
   * HyperPod.
   */
  public open fun nodeRecovery(`value`: String) {
    unwrap(this).setNodeRecovery(`value`)
  }

  /**
   * The orchestrator type for the SageMaker HyperPod cluster.
   */
  public open fun orchestrator(): Any? = unwrap(this).getOrchestrator()

  /**
   * The orchestrator type for the SageMaker HyperPod cluster.
   */
  public open fun orchestrator(`value`: IResolvable) {
    unwrap(this).setOrchestrator(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * The orchestrator type for the SageMaker HyperPod cluster.
   */
  public open fun orchestrator(`value`: OrchestratorProperty) {
    unwrap(this).setOrchestrator(`value`.let(OrchestratorProperty.Companion::unwrap))
  }

  /**
   * The orchestrator type for the SageMaker HyperPod cluster.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("6f1ef9b34ec608e6e98323a36d8fed4d51e48ed699c6884d3d10a1873a5a63c8")
  public open fun orchestrator(`value`: OrchestratorProperty.Builder.() -> Unit): Unit =
      orchestrator(OrchestratorProperty(`value`))

  /**
   * A tag object that consists of a key and an optional value, used to manage metadata for
   * SageMaker AWS resources.
   */
  public open fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * A tag object that consists of a key and an optional value, used to manage metadata for
   * SageMaker AWS resources.
   */
  public open fun tags(`value`: List<CfnTag>) {
    unwrap(this).setTags(`value`.map(CfnTag.Companion::unwrap))
  }

  /**
   * A tag object that consists of a key and an optional value, used to manage metadata for
   * SageMaker AWS resources.
   */
  public open fun tags(vararg `value`: CfnTag): Unit = tags(`value`.toList())

  /**
   * Specifies an Amazon Virtual Private Cloud (VPC) that your SageMaker jobs, hosted models, and
   * compute resources have access to.
   */
  public open fun vpcConfig(): Any? = unwrap(this).getVpcConfig()

  /**
   * Specifies an Amazon Virtual Private Cloud (VPC) that your SageMaker jobs, hosted models, and
   * compute resources have access to.
   */
  public open fun vpcConfig(`value`: IResolvable) {
    unwrap(this).setVpcConfig(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * Specifies an Amazon Virtual Private Cloud (VPC) that your SageMaker jobs, hosted models, and
   * compute resources have access to.
   */
  public open fun vpcConfig(`value`: VpcConfigProperty) {
    unwrap(this).setVpcConfig(`value`.let(VpcConfigProperty.Companion::unwrap))
  }

  /**
   * Specifies an Amazon Virtual Private Cloud (VPC) that your SageMaker jobs, hosted models, and
   * compute resources have access to.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("dca3b18550616ad3839937e6f073d908a4c04440876ee6d11142fa862f8df459")
  public open fun vpcConfig(`value`: VpcConfigProperty.Builder.() -> Unit): Unit =
      vpcConfig(VpcConfigProperty(`value`))

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.sagemaker.CfnCluster].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The name of the SageMaker HyperPod cluster.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-cluster.html#cfn-sagemaker-cluster-clustername)
     * @param clusterName The name of the SageMaker HyperPod cluster. 
     */
    public fun clusterName(clusterName: String)

    /**
     * The instance groups of the SageMaker HyperPod cluster.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-cluster.html#cfn-sagemaker-cluster-instancegroups)
     * @param instanceGroups The instance groups of the SageMaker HyperPod cluster. 
     */
    public fun instanceGroups(instanceGroups: IResolvable)

    /**
     * The instance groups of the SageMaker HyperPod cluster.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-cluster.html#cfn-sagemaker-cluster-instancegroups)
     * @param instanceGroups The instance groups of the SageMaker HyperPod cluster. 
     */
    public fun instanceGroups(instanceGroups: List<Any>)

    /**
     * The instance groups of the SageMaker HyperPod cluster.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-cluster.html#cfn-sagemaker-cluster-instancegroups)
     * @param instanceGroups The instance groups of the SageMaker HyperPod cluster. 
     */
    public fun instanceGroups(vararg instanceGroups: Any)

    /**
     * Specifies whether to enable or disable the automatic node recovery feature of SageMaker
     * HyperPod.
     *
     * Available values are `Automatic` for enabling and `None` for disabling.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-cluster.html#cfn-sagemaker-cluster-noderecovery)
     * @param nodeRecovery Specifies whether to enable or disable the automatic node recovery
     * feature of SageMaker HyperPod. 
     */
    public fun nodeRecovery(nodeRecovery: String)

    /**
     * The orchestrator type for the SageMaker HyperPod cluster.
     *
     * Currently, `'eks'` is the only available option.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-cluster.html#cfn-sagemaker-cluster-orchestrator)
     * @param orchestrator The orchestrator type for the SageMaker HyperPod cluster. 
     */
    public fun orchestrator(orchestrator: IResolvable)

    /**
     * The orchestrator type for the SageMaker HyperPod cluster.
     *
     * Currently, `'eks'` is the only available option.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-cluster.html#cfn-sagemaker-cluster-orchestrator)
     * @param orchestrator The orchestrator type for the SageMaker HyperPod cluster. 
     */
    public fun orchestrator(orchestrator: OrchestratorProperty)

    /**
     * The orchestrator type for the SageMaker HyperPod cluster.
     *
     * Currently, `'eks'` is the only available option.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-cluster.html#cfn-sagemaker-cluster-orchestrator)
     * @param orchestrator The orchestrator type for the SageMaker HyperPod cluster. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("5ac463481bd962dd64bb538b7c4fb013571fc6b00771dbc7d3a10928a8a8ff3d")
    public fun orchestrator(orchestrator: OrchestratorProperty.Builder.() -> Unit)

    /**
     * A tag object that consists of a key and an optional value, used to manage metadata for
     * SageMaker AWS resources.
     *
     * You can add tags to notebook instances, training jobs, hyperparameter tuning jobs, batch
     * transform jobs, models, labeling jobs, work teams, endpoint configurations, and endpoints. For
     * more information on adding tags to SageMaker resources, see
     * [AddTags](https://docs.aws.amazon.com/sagemaker/latest/APIReference/API_AddTags.html) .
     *
     * For more information on adding metadata to your AWS resources with tagging, see [Tagging AWS
     * resources](https://docs.aws.amazon.com/general/latest/gr/aws_tagging.html) . For advice on best
     * practices for managing AWS resources with tagging, see [Tagging Best Practices: Implement an
     * Effective AWS Resource Tagging
     * Strategy](https://docs.aws.amazon.com/https://d1.awsstatic.com/whitepapers/aws-tagging-best-practices.pdf)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-cluster.html#cfn-sagemaker-cluster-tags)
     * @param tags A tag object that consists of a key and an optional value, used to manage
     * metadata for SageMaker AWS resources. 
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * A tag object that consists of a key and an optional value, used to manage metadata for
     * SageMaker AWS resources.
     *
     * You can add tags to notebook instances, training jobs, hyperparameter tuning jobs, batch
     * transform jobs, models, labeling jobs, work teams, endpoint configurations, and endpoints. For
     * more information on adding tags to SageMaker resources, see
     * [AddTags](https://docs.aws.amazon.com/sagemaker/latest/APIReference/API_AddTags.html) .
     *
     * For more information on adding metadata to your AWS resources with tagging, see [Tagging AWS
     * resources](https://docs.aws.amazon.com/general/latest/gr/aws_tagging.html) . For advice on best
     * practices for managing AWS resources with tagging, see [Tagging Best Practices: Implement an
     * Effective AWS Resource Tagging
     * Strategy](https://docs.aws.amazon.com/https://d1.awsstatic.com/whitepapers/aws-tagging-best-practices.pdf)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-cluster.html#cfn-sagemaker-cluster-tags)
     * @param tags A tag object that consists of a key and an optional value, used to manage
     * metadata for SageMaker AWS resources. 
     */
    public fun tags(vararg tags: CfnTag)

    /**
     * Specifies an Amazon Virtual Private Cloud (VPC) that your SageMaker jobs, hosted models, and
     * compute resources have access to.
     *
     * You can control access to and from your resources by configuring a VPC. For more information,
     * see [Give SageMaker Access to Resources in your Amazon
     * VPC](https://docs.aws.amazon.com/sagemaker/latest/dg/infrastructure-give-access.html) .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-cluster.html#cfn-sagemaker-cluster-vpcconfig)
     * @param vpcConfig Specifies an Amazon Virtual Private Cloud (VPC) that your SageMaker jobs,
     * hosted models, and compute resources have access to. 
     */
    public fun vpcConfig(vpcConfig: IResolvable)

    /**
     * Specifies an Amazon Virtual Private Cloud (VPC) that your SageMaker jobs, hosted models, and
     * compute resources have access to.
     *
     * You can control access to and from your resources by configuring a VPC. For more information,
     * see [Give SageMaker Access to Resources in your Amazon
     * VPC](https://docs.aws.amazon.com/sagemaker/latest/dg/infrastructure-give-access.html) .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-cluster.html#cfn-sagemaker-cluster-vpcconfig)
     * @param vpcConfig Specifies an Amazon Virtual Private Cloud (VPC) that your SageMaker jobs,
     * hosted models, and compute resources have access to. 
     */
    public fun vpcConfig(vpcConfig: VpcConfigProperty)

    /**
     * Specifies an Amazon Virtual Private Cloud (VPC) that your SageMaker jobs, hosted models, and
     * compute resources have access to.
     *
     * You can control access to and from your resources by configuring a VPC. For more information,
     * see [Give SageMaker Access to Resources in your Amazon
     * VPC](https://docs.aws.amazon.com/sagemaker/latest/dg/infrastructure-give-access.html) .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-cluster.html#cfn-sagemaker-cluster-vpcconfig)
     * @param vpcConfig Specifies an Amazon Virtual Private Cloud (VPC) that your SageMaker jobs,
     * hosted models, and compute resources have access to. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("2e4b1adac852206cb9dacf52d6c287ca063110b085f9494b772577ddb3079a03")
    public fun vpcConfig(vpcConfig: VpcConfigProperty.Builder.() -> Unit)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.sagemaker.CfnCluster.Builder =
        software.amazon.awscdk.services.sagemaker.CfnCluster.Builder.create(scope, id)

    /**
     * The name of the SageMaker HyperPod cluster.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-cluster.html#cfn-sagemaker-cluster-clustername)
     * @param clusterName The name of the SageMaker HyperPod cluster. 
     */
    override fun clusterName(clusterName: String) {
      cdkBuilder.clusterName(clusterName)
    }

    /**
     * The instance groups of the SageMaker HyperPod cluster.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-cluster.html#cfn-sagemaker-cluster-instancegroups)
     * @param instanceGroups The instance groups of the SageMaker HyperPod cluster. 
     */
    override fun instanceGroups(instanceGroups: IResolvable) {
      cdkBuilder.instanceGroups(instanceGroups.let(IResolvable.Companion::unwrap))
    }

    /**
     * The instance groups of the SageMaker HyperPod cluster.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-cluster.html#cfn-sagemaker-cluster-instancegroups)
     * @param instanceGroups The instance groups of the SageMaker HyperPod cluster. 
     */
    override fun instanceGroups(instanceGroups: List<Any>) {
      cdkBuilder.instanceGroups(instanceGroups.map{CdkObjectWrappers.unwrap(it)})
    }

    /**
     * The instance groups of the SageMaker HyperPod cluster.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-cluster.html#cfn-sagemaker-cluster-instancegroups)
     * @param instanceGroups The instance groups of the SageMaker HyperPod cluster. 
     */
    override fun instanceGroups(vararg instanceGroups: Any): Unit =
        instanceGroups(instanceGroups.toList())

    /**
     * Specifies whether to enable or disable the automatic node recovery feature of SageMaker
     * HyperPod.
     *
     * Available values are `Automatic` for enabling and `None` for disabling.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-cluster.html#cfn-sagemaker-cluster-noderecovery)
     * @param nodeRecovery Specifies whether to enable or disable the automatic node recovery
     * feature of SageMaker HyperPod. 
     */
    override fun nodeRecovery(nodeRecovery: String) {
      cdkBuilder.nodeRecovery(nodeRecovery)
    }

    /**
     * The orchestrator type for the SageMaker HyperPod cluster.
     *
     * Currently, `'eks'` is the only available option.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-cluster.html#cfn-sagemaker-cluster-orchestrator)
     * @param orchestrator The orchestrator type for the SageMaker HyperPod cluster. 
     */
    override fun orchestrator(orchestrator: IResolvable) {
      cdkBuilder.orchestrator(orchestrator.let(IResolvable.Companion::unwrap))
    }

    /**
     * The orchestrator type for the SageMaker HyperPod cluster.
     *
     * Currently, `'eks'` is the only available option.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-cluster.html#cfn-sagemaker-cluster-orchestrator)
     * @param orchestrator The orchestrator type for the SageMaker HyperPod cluster. 
     */
    override fun orchestrator(orchestrator: OrchestratorProperty) {
      cdkBuilder.orchestrator(orchestrator.let(OrchestratorProperty.Companion::unwrap))
    }

    /**
     * The orchestrator type for the SageMaker HyperPod cluster.
     *
     * Currently, `'eks'` is the only available option.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-cluster.html#cfn-sagemaker-cluster-orchestrator)
     * @param orchestrator The orchestrator type for the SageMaker HyperPod cluster. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("5ac463481bd962dd64bb538b7c4fb013571fc6b00771dbc7d3a10928a8a8ff3d")
    override fun orchestrator(orchestrator: OrchestratorProperty.Builder.() -> Unit): Unit =
        orchestrator(OrchestratorProperty(orchestrator))

    /**
     * A tag object that consists of a key and an optional value, used to manage metadata for
     * SageMaker AWS resources.
     *
     * You can add tags to notebook instances, training jobs, hyperparameter tuning jobs, batch
     * transform jobs, models, labeling jobs, work teams, endpoint configurations, and endpoints. For
     * more information on adding tags to SageMaker resources, see
     * [AddTags](https://docs.aws.amazon.com/sagemaker/latest/APIReference/API_AddTags.html) .
     *
     * For more information on adding metadata to your AWS resources with tagging, see [Tagging AWS
     * resources](https://docs.aws.amazon.com/general/latest/gr/aws_tagging.html) . For advice on best
     * practices for managing AWS resources with tagging, see [Tagging Best Practices: Implement an
     * Effective AWS Resource Tagging
     * Strategy](https://docs.aws.amazon.com/https://d1.awsstatic.com/whitepapers/aws-tagging-best-practices.pdf)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-cluster.html#cfn-sagemaker-cluster-tags)
     * @param tags A tag object that consists of a key and an optional value, used to manage
     * metadata for SageMaker AWS resources. 
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag.Companion::unwrap))
    }

    /**
     * A tag object that consists of a key and an optional value, used to manage metadata for
     * SageMaker AWS resources.
     *
     * You can add tags to notebook instances, training jobs, hyperparameter tuning jobs, batch
     * transform jobs, models, labeling jobs, work teams, endpoint configurations, and endpoints. For
     * more information on adding tags to SageMaker resources, see
     * [AddTags](https://docs.aws.amazon.com/sagemaker/latest/APIReference/API_AddTags.html) .
     *
     * For more information on adding metadata to your AWS resources with tagging, see [Tagging AWS
     * resources](https://docs.aws.amazon.com/general/latest/gr/aws_tagging.html) . For advice on best
     * practices for managing AWS resources with tagging, see [Tagging Best Practices: Implement an
     * Effective AWS Resource Tagging
     * Strategy](https://docs.aws.amazon.com/https://d1.awsstatic.com/whitepapers/aws-tagging-best-practices.pdf)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-cluster.html#cfn-sagemaker-cluster-tags)
     * @param tags A tag object that consists of a key and an optional value, used to manage
     * metadata for SageMaker AWS resources. 
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    /**
     * Specifies an Amazon Virtual Private Cloud (VPC) that your SageMaker jobs, hosted models, and
     * compute resources have access to.
     *
     * You can control access to and from your resources by configuring a VPC. For more information,
     * see [Give SageMaker Access to Resources in your Amazon
     * VPC](https://docs.aws.amazon.com/sagemaker/latest/dg/infrastructure-give-access.html) .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-cluster.html#cfn-sagemaker-cluster-vpcconfig)
     * @param vpcConfig Specifies an Amazon Virtual Private Cloud (VPC) that your SageMaker jobs,
     * hosted models, and compute resources have access to. 
     */
    override fun vpcConfig(vpcConfig: IResolvable) {
      cdkBuilder.vpcConfig(vpcConfig.let(IResolvable.Companion::unwrap))
    }

    /**
     * Specifies an Amazon Virtual Private Cloud (VPC) that your SageMaker jobs, hosted models, and
     * compute resources have access to.
     *
     * You can control access to and from your resources by configuring a VPC. For more information,
     * see [Give SageMaker Access to Resources in your Amazon
     * VPC](https://docs.aws.amazon.com/sagemaker/latest/dg/infrastructure-give-access.html) .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-cluster.html#cfn-sagemaker-cluster-vpcconfig)
     * @param vpcConfig Specifies an Amazon Virtual Private Cloud (VPC) that your SageMaker jobs,
     * hosted models, and compute resources have access to. 
     */
    override fun vpcConfig(vpcConfig: VpcConfigProperty) {
      cdkBuilder.vpcConfig(vpcConfig.let(VpcConfigProperty.Companion::unwrap))
    }

    /**
     * Specifies an Amazon Virtual Private Cloud (VPC) that your SageMaker jobs, hosted models, and
     * compute resources have access to.
     *
     * You can control access to and from your resources by configuring a VPC. For more information,
     * see [Give SageMaker Access to Resources in your Amazon
     * VPC](https://docs.aws.amazon.com/sagemaker/latest/dg/infrastructure-give-access.html) .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-cluster.html#cfn-sagemaker-cluster-vpcconfig)
     * @param vpcConfig Specifies an Amazon Virtual Private Cloud (VPC) that your SageMaker jobs,
     * hosted models, and compute resources have access to. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("2e4b1adac852206cb9dacf52d6c287ca063110b085f9494b772577ddb3079a03")
    override fun vpcConfig(vpcConfig: VpcConfigProperty.Builder.() -> Unit): Unit =
        vpcConfig(VpcConfigProperty(vpcConfig))

    public fun build(): software.amazon.awscdk.services.sagemaker.CfnCluster = cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.sagemaker.CfnCluster.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnCluster {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnCluster(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.sagemaker.CfnCluster): CfnCluster =
        CfnCluster(cdkObject)

    internal fun unwrap(wrapped: CfnCluster): software.amazon.awscdk.services.sagemaker.CfnCluster =
        wrapped.cdkObject as software.amazon.awscdk.services.sagemaker.CfnCluster
  }

  /**
   * Defines the configuration for attaching an additional Amazon Elastic Block Store (EBS) volume
   * to each instance of the SageMaker HyperPod cluster instance group.
   *
   * To learn more, see [SageMaker HyperPod release notes: June 20,
   * 2024](https://docs.aws.amazon.com/sagemaker/latest/dg/sagemaker-hyperpod-release-notes.html#sagemaker-hyperpod-release-notes-20240620)
   * .
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.sagemaker.*;
   * ClusterEbsVolumeConfigProperty clusterEbsVolumeConfigProperty =
   * ClusterEbsVolumeConfigProperty.builder()
   * .volumeSizeInGb(123)
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-cluster-clusterebsvolumeconfig.html)
   */
  public interface ClusterEbsVolumeConfigProperty {
    /**
     * The size in gigabytes (GB) of the additional EBS volume to be attached to the instances in
     * the SageMaker HyperPod cluster instance group.
     *
     * The additional EBS volume is attached to each instance within the SageMaker HyperPod cluster
     * instance group and mounted to `/opt/sagemaker` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-cluster-clusterebsvolumeconfig.html#cfn-sagemaker-cluster-clusterebsvolumeconfig-volumesizeingb)
     */
    public fun volumeSizeInGb(): Number? = unwrap(this).getVolumeSizeInGb()

    /**
     * A builder for [ClusterEbsVolumeConfigProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param volumeSizeInGb The size in gigabytes (GB) of the additional EBS volume to be
       * attached to the instances in the SageMaker HyperPod cluster instance group.
       * The additional EBS volume is attached to each instance within the SageMaker HyperPod
       * cluster instance group and mounted to `/opt/sagemaker` .
       */
      public fun volumeSizeInGb(volumeSizeInGb: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.sagemaker.CfnCluster.ClusterEbsVolumeConfigProperty.Builder
          =
          software.amazon.awscdk.services.sagemaker.CfnCluster.ClusterEbsVolumeConfigProperty.builder()

      /**
       * @param volumeSizeInGb The size in gigabytes (GB) of the additional EBS volume to be
       * attached to the instances in the SageMaker HyperPod cluster instance group.
       * The additional EBS volume is attached to each instance within the SageMaker HyperPod
       * cluster instance group and mounted to `/opt/sagemaker` .
       */
      override fun volumeSizeInGb(volumeSizeInGb: Number) {
        cdkBuilder.volumeSizeInGb(volumeSizeInGb)
      }

      public fun build():
          software.amazon.awscdk.services.sagemaker.CfnCluster.ClusterEbsVolumeConfigProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.sagemaker.CfnCluster.ClusterEbsVolumeConfigProperty,
    ) : CdkObject(cdkObject),
        ClusterEbsVolumeConfigProperty {
      /**
       * The size in gigabytes (GB) of the additional EBS volume to be attached to the instances in
       * the SageMaker HyperPod cluster instance group.
       *
       * The additional EBS volume is attached to each instance within the SageMaker HyperPod
       * cluster instance group and mounted to `/opt/sagemaker` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-cluster-clusterebsvolumeconfig.html#cfn-sagemaker-cluster-clusterebsvolumeconfig-volumesizeingb)
       */
      override fun volumeSizeInGb(): Number? = unwrap(this).getVolumeSizeInGb()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): ClusterEbsVolumeConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.sagemaker.CfnCluster.ClusterEbsVolumeConfigProperty):
          ClusterEbsVolumeConfigProperty = CdkObjectWrappers.wrap(cdkObject) as?
          ClusterEbsVolumeConfigProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: ClusterEbsVolumeConfigProperty):
          software.amazon.awscdk.services.sagemaker.CfnCluster.ClusterEbsVolumeConfigProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.sagemaker.CfnCluster.ClusterEbsVolumeConfigProperty
    }
  }

  /**
   * The configuration information of the instance group within the HyperPod cluster.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.sagemaker.*;
   * ClusterInstanceGroupProperty clusterInstanceGroupProperty =
   * ClusterInstanceGroupProperty.builder()
   * .executionRole("executionRole")
   * .instanceCount(123)
   * .instanceGroupName("instanceGroupName")
   * .instanceType("instanceType")
   * .lifeCycleConfig(ClusterLifeCycleConfigProperty.builder()
   * .onCreate("onCreate")
   * .sourceS3Uri("sourceS3Uri")
   * .build())
   * // the properties below are optional
   * .currentCount(123)
   * .instanceStorageConfigs(List.of(ClusterInstanceStorageConfigProperty.builder()
   * .ebsVolumeConfig(ClusterEbsVolumeConfigProperty.builder()
   * .volumeSizeInGb(123)
   * .build())
   * .build()))
   * .onStartDeepHealthChecks(List.of("onStartDeepHealthChecks"))
   * .threadsPerCore(123)
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-cluster-clusterinstancegroup.html)
   */
  public interface ClusterInstanceGroupProperty {
    /**
     * The number of instances that are currently in the instance group of a SageMaker HyperPod
     * cluster.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-cluster-clusterinstancegroup.html#cfn-sagemaker-cluster-clusterinstancegroup-currentcount)
     */
    public fun currentCount(): Number? = unwrap(this).getCurrentCount()

    /**
     * The execution role for the instance group to assume.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-cluster-clusterinstancegroup.html#cfn-sagemaker-cluster-clusterinstancegroup-executionrole)
     */
    public fun executionRole(): String

    /**
     * The number of instances in an instance group of the SageMaker HyperPod cluster.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-cluster-clusterinstancegroup.html#cfn-sagemaker-cluster-clusterinstancegroup-instancecount)
     */
    public fun instanceCount(): Number

    /**
     * The name of the instance group of a SageMaker HyperPod cluster.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-cluster-clusterinstancegroup.html#cfn-sagemaker-cluster-clusterinstancegroup-instancegroupname)
     */
    public fun instanceGroupName(): String

    /**
     * The configurations of additional storage specified to the instance group where the instance
     * (node) is launched.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-cluster-clusterinstancegroup.html#cfn-sagemaker-cluster-clusterinstancegroup-instancestorageconfigs)
     */
    public fun instanceStorageConfigs(): Any? = unwrap(this).getInstanceStorageConfigs()

    /**
     * The instance type of the instance group of a SageMaker HyperPod cluster.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-cluster-clusterinstancegroup.html#cfn-sagemaker-cluster-clusterinstancegroup-instancetype)
     */
    public fun instanceType(): String

    /**
     * The lifecycle configuration for a SageMaker HyperPod cluster.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-cluster-clusterinstancegroup.html#cfn-sagemaker-cluster-clusterinstancegroup-lifecycleconfig)
     */
    public fun lifeCycleConfig(): Any

    /**
     * A flag indicating whether deep health checks should be performed when the HyperPod cluster
     * instance group is created or updated.
     *
     * Deep health checks are comprehensive, invasive tests that validate the health of the
     * underlying hardware and infrastructure components.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-cluster-clusterinstancegroup.html#cfn-sagemaker-cluster-clusterinstancegroup-onstartdeephealthchecks)
     */
    public fun onStartDeepHealthChecks(): List<String> = unwrap(this).getOnStartDeepHealthChecks()
        ?: emptyList()

    /**
     * The number of threads per CPU core you specified under `CreateCluster` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-cluster-clusterinstancegroup.html#cfn-sagemaker-cluster-clusterinstancegroup-threadspercore)
     */
    public fun threadsPerCore(): Number? = unwrap(this).getThreadsPerCore()

    /**
     * A builder for [ClusterInstanceGroupProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param currentCount The number of instances that are currently in the instance group of a
       * SageMaker HyperPod cluster.
       */
      public fun currentCount(currentCount: Number)

      /**
       * @param executionRole The execution role for the instance group to assume. 
       */
      public fun executionRole(executionRole: String)

      /**
       * @param instanceCount The number of instances in an instance group of the SageMaker HyperPod
       * cluster. 
       */
      public fun instanceCount(instanceCount: Number)

      /**
       * @param instanceGroupName The name of the instance group of a SageMaker HyperPod cluster. 
       */
      public fun instanceGroupName(instanceGroupName: String)

      /**
       * @param instanceStorageConfigs The configurations of additional storage specified to the
       * instance group where the instance (node) is launched.
       */
      public fun instanceStorageConfigs(instanceStorageConfigs: IResolvable)

      /**
       * @param instanceStorageConfigs The configurations of additional storage specified to the
       * instance group where the instance (node) is launched.
       */
      public fun instanceStorageConfigs(instanceStorageConfigs: List<Any>)

      /**
       * @param instanceStorageConfigs The configurations of additional storage specified to the
       * instance group where the instance (node) is launched.
       */
      public fun instanceStorageConfigs(vararg instanceStorageConfigs: Any)

      /**
       * @param instanceType The instance type of the instance group of a SageMaker HyperPod
       * cluster. 
       */
      public fun instanceType(instanceType: String)

      /**
       * @param lifeCycleConfig The lifecycle configuration for a SageMaker HyperPod cluster. 
       */
      public fun lifeCycleConfig(lifeCycleConfig: IResolvable)

      /**
       * @param lifeCycleConfig The lifecycle configuration for a SageMaker HyperPod cluster. 
       */
      public fun lifeCycleConfig(lifeCycleConfig: ClusterLifeCycleConfigProperty)

      /**
       * @param lifeCycleConfig The lifecycle configuration for a SageMaker HyperPod cluster. 
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("6e048c3609714dde556d830d8c8a61e46ae0c8cce4be3f17d9b2fa9f41f8f392")
      public fun lifeCycleConfig(lifeCycleConfig: ClusterLifeCycleConfigProperty.Builder.() -> Unit)

      /**
       * @param onStartDeepHealthChecks A flag indicating whether deep health checks should be
       * performed when the HyperPod cluster instance group is created or updated.
       * Deep health checks are comprehensive, invasive tests that validate the health of the
       * underlying hardware and infrastructure components.
       */
      public fun onStartDeepHealthChecks(onStartDeepHealthChecks: List<String>)

      /**
       * @param onStartDeepHealthChecks A flag indicating whether deep health checks should be
       * performed when the HyperPod cluster instance group is created or updated.
       * Deep health checks are comprehensive, invasive tests that validate the health of the
       * underlying hardware and infrastructure components.
       */
      public fun onStartDeepHealthChecks(vararg onStartDeepHealthChecks: String)

      /**
       * @param threadsPerCore The number of threads per CPU core you specified under
       * `CreateCluster` .
       */
      public fun threadsPerCore(threadsPerCore: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.sagemaker.CfnCluster.ClusterInstanceGroupProperty.Builder
          =
          software.amazon.awscdk.services.sagemaker.CfnCluster.ClusterInstanceGroupProperty.builder()

      /**
       * @param currentCount The number of instances that are currently in the instance group of a
       * SageMaker HyperPod cluster.
       */
      override fun currentCount(currentCount: Number) {
        cdkBuilder.currentCount(currentCount)
      }

      /**
       * @param executionRole The execution role for the instance group to assume. 
       */
      override fun executionRole(executionRole: String) {
        cdkBuilder.executionRole(executionRole)
      }

      /**
       * @param instanceCount The number of instances in an instance group of the SageMaker HyperPod
       * cluster. 
       */
      override fun instanceCount(instanceCount: Number) {
        cdkBuilder.instanceCount(instanceCount)
      }

      /**
       * @param instanceGroupName The name of the instance group of a SageMaker HyperPod cluster. 
       */
      override fun instanceGroupName(instanceGroupName: String) {
        cdkBuilder.instanceGroupName(instanceGroupName)
      }

      /**
       * @param instanceStorageConfigs The configurations of additional storage specified to the
       * instance group where the instance (node) is launched.
       */
      override fun instanceStorageConfigs(instanceStorageConfigs: IResolvable) {
        cdkBuilder.instanceStorageConfigs(instanceStorageConfigs.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param instanceStorageConfigs The configurations of additional storage specified to the
       * instance group where the instance (node) is launched.
       */
      override fun instanceStorageConfigs(instanceStorageConfigs: List<Any>) {
        cdkBuilder.instanceStorageConfigs(instanceStorageConfigs.map{CdkObjectWrappers.unwrap(it)})
      }

      /**
       * @param instanceStorageConfigs The configurations of additional storage specified to the
       * instance group where the instance (node) is launched.
       */
      override fun instanceStorageConfigs(vararg instanceStorageConfigs: Any): Unit =
          instanceStorageConfigs(instanceStorageConfigs.toList())

      /**
       * @param instanceType The instance type of the instance group of a SageMaker HyperPod
       * cluster. 
       */
      override fun instanceType(instanceType: String) {
        cdkBuilder.instanceType(instanceType)
      }

      /**
       * @param lifeCycleConfig The lifecycle configuration for a SageMaker HyperPod cluster. 
       */
      override fun lifeCycleConfig(lifeCycleConfig: IResolvable) {
        cdkBuilder.lifeCycleConfig(lifeCycleConfig.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param lifeCycleConfig The lifecycle configuration for a SageMaker HyperPod cluster. 
       */
      override fun lifeCycleConfig(lifeCycleConfig: ClusterLifeCycleConfigProperty) {
        cdkBuilder.lifeCycleConfig(lifeCycleConfig.let(ClusterLifeCycleConfigProperty.Companion::unwrap))
      }

      /**
       * @param lifeCycleConfig The lifecycle configuration for a SageMaker HyperPod cluster. 
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("6e048c3609714dde556d830d8c8a61e46ae0c8cce4be3f17d9b2fa9f41f8f392")
      override
          fun lifeCycleConfig(lifeCycleConfig: ClusterLifeCycleConfigProperty.Builder.() -> Unit):
          Unit = lifeCycleConfig(ClusterLifeCycleConfigProperty(lifeCycleConfig))

      /**
       * @param onStartDeepHealthChecks A flag indicating whether deep health checks should be
       * performed when the HyperPod cluster instance group is created or updated.
       * Deep health checks are comprehensive, invasive tests that validate the health of the
       * underlying hardware and infrastructure components.
       */
      override fun onStartDeepHealthChecks(onStartDeepHealthChecks: List<String>) {
        cdkBuilder.onStartDeepHealthChecks(onStartDeepHealthChecks)
      }

      /**
       * @param onStartDeepHealthChecks A flag indicating whether deep health checks should be
       * performed when the HyperPod cluster instance group is created or updated.
       * Deep health checks are comprehensive, invasive tests that validate the health of the
       * underlying hardware and infrastructure components.
       */
      override fun onStartDeepHealthChecks(vararg onStartDeepHealthChecks: String): Unit =
          onStartDeepHealthChecks(onStartDeepHealthChecks.toList())

      /**
       * @param threadsPerCore The number of threads per CPU core you specified under
       * `CreateCluster` .
       */
      override fun threadsPerCore(threadsPerCore: Number) {
        cdkBuilder.threadsPerCore(threadsPerCore)
      }

      public fun build():
          software.amazon.awscdk.services.sagemaker.CfnCluster.ClusterInstanceGroupProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.sagemaker.CfnCluster.ClusterInstanceGroupProperty,
    ) : CdkObject(cdkObject),
        ClusterInstanceGroupProperty {
      /**
       * The number of instances that are currently in the instance group of a SageMaker HyperPod
       * cluster.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-cluster-clusterinstancegroup.html#cfn-sagemaker-cluster-clusterinstancegroup-currentcount)
       */
      override fun currentCount(): Number? = unwrap(this).getCurrentCount()

      /**
       * The execution role for the instance group to assume.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-cluster-clusterinstancegroup.html#cfn-sagemaker-cluster-clusterinstancegroup-executionrole)
       */
      override fun executionRole(): String = unwrap(this).getExecutionRole()

      /**
       * The number of instances in an instance group of the SageMaker HyperPod cluster.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-cluster-clusterinstancegroup.html#cfn-sagemaker-cluster-clusterinstancegroup-instancecount)
       */
      override fun instanceCount(): Number = unwrap(this).getInstanceCount()

      /**
       * The name of the instance group of a SageMaker HyperPod cluster.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-cluster-clusterinstancegroup.html#cfn-sagemaker-cluster-clusterinstancegroup-instancegroupname)
       */
      override fun instanceGroupName(): String = unwrap(this).getInstanceGroupName()

      /**
       * The configurations of additional storage specified to the instance group where the instance
       * (node) is launched.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-cluster-clusterinstancegroup.html#cfn-sagemaker-cluster-clusterinstancegroup-instancestorageconfigs)
       */
      override fun instanceStorageConfigs(): Any? = unwrap(this).getInstanceStorageConfigs()

      /**
       * The instance type of the instance group of a SageMaker HyperPod cluster.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-cluster-clusterinstancegroup.html#cfn-sagemaker-cluster-clusterinstancegroup-instancetype)
       */
      override fun instanceType(): String = unwrap(this).getInstanceType()

      /**
       * The lifecycle configuration for a SageMaker HyperPod cluster.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-cluster-clusterinstancegroup.html#cfn-sagemaker-cluster-clusterinstancegroup-lifecycleconfig)
       */
      override fun lifeCycleConfig(): Any = unwrap(this).getLifeCycleConfig()

      /**
       * A flag indicating whether deep health checks should be performed when the HyperPod cluster
       * instance group is created or updated.
       *
       * Deep health checks are comprehensive, invasive tests that validate the health of the
       * underlying hardware and infrastructure components.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-cluster-clusterinstancegroup.html#cfn-sagemaker-cluster-clusterinstancegroup-onstartdeephealthchecks)
       */
      override fun onStartDeepHealthChecks(): List<String> =
          unwrap(this).getOnStartDeepHealthChecks() ?: emptyList()

      /**
       * The number of threads per CPU core you specified under `CreateCluster` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-cluster-clusterinstancegroup.html#cfn-sagemaker-cluster-clusterinstancegroup-threadspercore)
       */
      override fun threadsPerCore(): Number? = unwrap(this).getThreadsPerCore()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): ClusterInstanceGroupProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.sagemaker.CfnCluster.ClusterInstanceGroupProperty):
          ClusterInstanceGroupProperty = CdkObjectWrappers.wrap(cdkObject) as?
          ClusterInstanceGroupProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: ClusterInstanceGroupProperty):
          software.amazon.awscdk.services.sagemaker.CfnCluster.ClusterInstanceGroupProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.sagemaker.CfnCluster.ClusterInstanceGroupProperty
    }
  }

  /**
   * Defines the configuration for attaching additional storage to the instances in the SageMaker
   * HyperPod cluster instance group.
   *
   * To learn more, see [SageMaker HyperPod release notes: June 20,
   * 2024](https://docs.aws.amazon.com/sagemaker/latest/dg/sagemaker-hyperpod-release-notes.html#sagemaker-hyperpod-release-notes-20240620)
   * .
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.sagemaker.*;
   * ClusterInstanceStorageConfigProperty clusterInstanceStorageConfigProperty =
   * ClusterInstanceStorageConfigProperty.builder()
   * .ebsVolumeConfig(ClusterEbsVolumeConfigProperty.builder()
   * .volumeSizeInGb(123)
   * .build())
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-cluster-clusterinstancestorageconfig.html)
   */
  public interface ClusterInstanceStorageConfigProperty {
    /**
     * Defines the configuration for attaching additional Amazon Elastic Block Store (EBS) volumes
     * to the instances in the SageMaker HyperPod cluster instance group.
     *
     * The additional EBS volume is attached to each instance within the SageMaker HyperPod cluster
     * instance group and mounted to `/opt/sagemaker` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-cluster-clusterinstancestorageconfig.html#cfn-sagemaker-cluster-clusterinstancestorageconfig-ebsvolumeconfig)
     */
    public fun ebsVolumeConfig(): Any? = unwrap(this).getEbsVolumeConfig()

    /**
     * A builder for [ClusterInstanceStorageConfigProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param ebsVolumeConfig Defines the configuration for attaching additional Amazon Elastic
       * Block Store (EBS) volumes to the instances in the SageMaker HyperPod cluster instance group.
       * The additional EBS volume is attached to each instance within the SageMaker HyperPod
       * cluster instance group and mounted to `/opt/sagemaker` .
       */
      public fun ebsVolumeConfig(ebsVolumeConfig: IResolvable)

      /**
       * @param ebsVolumeConfig Defines the configuration for attaching additional Amazon Elastic
       * Block Store (EBS) volumes to the instances in the SageMaker HyperPod cluster instance group.
       * The additional EBS volume is attached to each instance within the SageMaker HyperPod
       * cluster instance group and mounted to `/opt/sagemaker` .
       */
      public fun ebsVolumeConfig(ebsVolumeConfig: ClusterEbsVolumeConfigProperty)

      /**
       * @param ebsVolumeConfig Defines the configuration for attaching additional Amazon Elastic
       * Block Store (EBS) volumes to the instances in the SageMaker HyperPod cluster instance group.
       * The additional EBS volume is attached to each instance within the SageMaker HyperPod
       * cluster instance group and mounted to `/opt/sagemaker` .
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("b724ca05bd3199b4ba11e27002bc4902a37267f4e6dd50baa64dc5509ec29f0b")
      public fun ebsVolumeConfig(ebsVolumeConfig: ClusterEbsVolumeConfigProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.sagemaker.CfnCluster.ClusterInstanceStorageConfigProperty.Builder
          =
          software.amazon.awscdk.services.sagemaker.CfnCluster.ClusterInstanceStorageConfigProperty.builder()

      /**
       * @param ebsVolumeConfig Defines the configuration for attaching additional Amazon Elastic
       * Block Store (EBS) volumes to the instances in the SageMaker HyperPod cluster instance group.
       * The additional EBS volume is attached to each instance within the SageMaker HyperPod
       * cluster instance group and mounted to `/opt/sagemaker` .
       */
      override fun ebsVolumeConfig(ebsVolumeConfig: IResolvable) {
        cdkBuilder.ebsVolumeConfig(ebsVolumeConfig.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param ebsVolumeConfig Defines the configuration for attaching additional Amazon Elastic
       * Block Store (EBS) volumes to the instances in the SageMaker HyperPod cluster instance group.
       * The additional EBS volume is attached to each instance within the SageMaker HyperPod
       * cluster instance group and mounted to `/opt/sagemaker` .
       */
      override fun ebsVolumeConfig(ebsVolumeConfig: ClusterEbsVolumeConfigProperty) {
        cdkBuilder.ebsVolumeConfig(ebsVolumeConfig.let(ClusterEbsVolumeConfigProperty.Companion::unwrap))
      }

      /**
       * @param ebsVolumeConfig Defines the configuration for attaching additional Amazon Elastic
       * Block Store (EBS) volumes to the instances in the SageMaker HyperPod cluster instance group.
       * The additional EBS volume is attached to each instance within the SageMaker HyperPod
       * cluster instance group and mounted to `/opt/sagemaker` .
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("b724ca05bd3199b4ba11e27002bc4902a37267f4e6dd50baa64dc5509ec29f0b")
      override
          fun ebsVolumeConfig(ebsVolumeConfig: ClusterEbsVolumeConfigProperty.Builder.() -> Unit):
          Unit = ebsVolumeConfig(ClusterEbsVolumeConfigProperty(ebsVolumeConfig))

      public fun build():
          software.amazon.awscdk.services.sagemaker.CfnCluster.ClusterInstanceStorageConfigProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.sagemaker.CfnCluster.ClusterInstanceStorageConfigProperty,
    ) : CdkObject(cdkObject),
        ClusterInstanceStorageConfigProperty {
      /**
       * Defines the configuration for attaching additional Amazon Elastic Block Store (EBS) volumes
       * to the instances in the SageMaker HyperPod cluster instance group.
       *
       * The additional EBS volume is attached to each instance within the SageMaker HyperPod
       * cluster instance group and mounted to `/opt/sagemaker` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-cluster-clusterinstancestorageconfig.html#cfn-sagemaker-cluster-clusterinstancestorageconfig-ebsvolumeconfig)
       */
      override fun ebsVolumeConfig(): Any? = unwrap(this).getEbsVolumeConfig()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          ClusterInstanceStorageConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.sagemaker.CfnCluster.ClusterInstanceStorageConfigProperty):
          ClusterInstanceStorageConfigProperty = CdkObjectWrappers.wrap(cdkObject) as?
          ClusterInstanceStorageConfigProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: ClusterInstanceStorageConfigProperty):
          software.amazon.awscdk.services.sagemaker.CfnCluster.ClusterInstanceStorageConfigProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.sagemaker.CfnCluster.ClusterInstanceStorageConfigProperty
    }
  }

  /**
   * The lifecycle configuration for a SageMaker HyperPod cluster.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.sagemaker.*;
   * ClusterLifeCycleConfigProperty clusterLifeCycleConfigProperty =
   * ClusterLifeCycleConfigProperty.builder()
   * .onCreate("onCreate")
   * .sourceS3Uri("sourceS3Uri")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-cluster-clusterlifecycleconfig.html)
   */
  public interface ClusterLifeCycleConfigProperty {
    /**
     * The file name of the entrypoint script of lifecycle scripts under `SourceS3Uri` .
     *
     * This entrypoint script runs during cluster creation.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-cluster-clusterlifecycleconfig.html#cfn-sagemaker-cluster-clusterlifecycleconfig-oncreate)
     */
    public fun onCreate(): String

    /**
     * An Amazon S3 bucket path where your lifecycle scripts are stored.
     *
     *
     * Make sure that the S3 bucket path starts with `s3://sagemaker-` . The [IAM role for SageMaker
     * HyperPod](https://docs.aws.amazon.com/sagemaker/latest/dg/sagemaker-hyperpod-prerequisites.html#sagemaker-hyperpod-prerequisites-iam-role-for-hyperpod)
     * has the managed
     * [`AmazonSageMakerClusterInstanceRolePolicy`](https://docs.aws.amazon.com/sagemaker/latest/dg/security-iam-awsmanpol-cluster.html)
     * attached, which allows access to S3 buckets with the specific prefix `sagemaker-` .
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-cluster-clusterlifecycleconfig.html#cfn-sagemaker-cluster-clusterlifecycleconfig-sources3uri)
     */
    public fun sourceS3Uri(): String

    /**
     * A builder for [ClusterLifeCycleConfigProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param onCreate The file name of the entrypoint script of lifecycle scripts under
       * `SourceS3Uri` . 
       * This entrypoint script runs during cluster creation.
       */
      public fun onCreate(onCreate: String)

      /**
       * @param sourceS3Uri An Amazon S3 bucket path where your lifecycle scripts are stored. 
       *
       * Make sure that the S3 bucket path starts with `s3://sagemaker-` . The [IAM role for
       * SageMaker
       * HyperPod](https://docs.aws.amazon.com/sagemaker/latest/dg/sagemaker-hyperpod-prerequisites.html#sagemaker-hyperpod-prerequisites-iam-role-for-hyperpod)
       * has the managed
       * [`AmazonSageMakerClusterInstanceRolePolicy`](https://docs.aws.amazon.com/sagemaker/latest/dg/security-iam-awsmanpol-cluster.html)
       * attached, which allows access to S3 buckets with the specific prefix `sagemaker-` .
       */
      public fun sourceS3Uri(sourceS3Uri: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.sagemaker.CfnCluster.ClusterLifeCycleConfigProperty.Builder
          =
          software.amazon.awscdk.services.sagemaker.CfnCluster.ClusterLifeCycleConfigProperty.builder()

      /**
       * @param onCreate The file name of the entrypoint script of lifecycle scripts under
       * `SourceS3Uri` . 
       * This entrypoint script runs during cluster creation.
       */
      override fun onCreate(onCreate: String) {
        cdkBuilder.onCreate(onCreate)
      }

      /**
       * @param sourceS3Uri An Amazon S3 bucket path where your lifecycle scripts are stored. 
       *
       * Make sure that the S3 bucket path starts with `s3://sagemaker-` . The [IAM role for
       * SageMaker
       * HyperPod](https://docs.aws.amazon.com/sagemaker/latest/dg/sagemaker-hyperpod-prerequisites.html#sagemaker-hyperpod-prerequisites-iam-role-for-hyperpod)
       * has the managed
       * [`AmazonSageMakerClusterInstanceRolePolicy`](https://docs.aws.amazon.com/sagemaker/latest/dg/security-iam-awsmanpol-cluster.html)
       * attached, which allows access to S3 buckets with the specific prefix `sagemaker-` .
       */
      override fun sourceS3Uri(sourceS3Uri: String) {
        cdkBuilder.sourceS3Uri(sourceS3Uri)
      }

      public fun build():
          software.amazon.awscdk.services.sagemaker.CfnCluster.ClusterLifeCycleConfigProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.sagemaker.CfnCluster.ClusterLifeCycleConfigProperty,
    ) : CdkObject(cdkObject),
        ClusterLifeCycleConfigProperty {
      /**
       * The file name of the entrypoint script of lifecycle scripts under `SourceS3Uri` .
       *
       * This entrypoint script runs during cluster creation.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-cluster-clusterlifecycleconfig.html#cfn-sagemaker-cluster-clusterlifecycleconfig-oncreate)
       */
      override fun onCreate(): String = unwrap(this).getOnCreate()

      /**
       * An Amazon S3 bucket path where your lifecycle scripts are stored.
       *
       *
       * Make sure that the S3 bucket path starts with `s3://sagemaker-` . The [IAM role for
       * SageMaker
       * HyperPod](https://docs.aws.amazon.com/sagemaker/latest/dg/sagemaker-hyperpod-prerequisites.html#sagemaker-hyperpod-prerequisites-iam-role-for-hyperpod)
       * has the managed
       * [`AmazonSageMakerClusterInstanceRolePolicy`](https://docs.aws.amazon.com/sagemaker/latest/dg/security-iam-awsmanpol-cluster.html)
       * attached, which allows access to S3 buckets with the specific prefix `sagemaker-` .
       *
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-cluster-clusterlifecycleconfig.html#cfn-sagemaker-cluster-clusterlifecycleconfig-sources3uri)
       */
      override fun sourceS3Uri(): String = unwrap(this).getSourceS3Uri()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): ClusterLifeCycleConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.sagemaker.CfnCluster.ClusterLifeCycleConfigProperty):
          ClusterLifeCycleConfigProperty = CdkObjectWrappers.wrap(cdkObject) as?
          ClusterLifeCycleConfigProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: ClusterLifeCycleConfigProperty):
          software.amazon.awscdk.services.sagemaker.CfnCluster.ClusterLifeCycleConfigProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.sagemaker.CfnCluster.ClusterLifeCycleConfigProperty
    }
  }

  /**
   * The configuration for the Amazon EKS cluster that is used as the orchestrator for the SageMaker
   * HyperPod cluster.
   *
   * This includes the Amazon Resource Name (ARN) of the EKS cluster
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.sagemaker.*;
   * ClusterOrchestratorEksConfigProperty clusterOrchestratorEksConfigProperty =
   * ClusterOrchestratorEksConfigProperty.builder()
   * .clusterArn("clusterArn")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-cluster-clusterorchestratoreksconfig.html)
   */
  public interface ClusterOrchestratorEksConfigProperty {
    /**
     * The Amazon Resource Name (ARN) of the SageMaker HyperPod cluster.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-cluster-clusterorchestratoreksconfig.html#cfn-sagemaker-cluster-clusterorchestratoreksconfig-clusterarn)
     */
    public fun clusterArn(): String

    /**
     * A builder for [ClusterOrchestratorEksConfigProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param clusterArn The Amazon Resource Name (ARN) of the SageMaker HyperPod cluster. 
       */
      public fun clusterArn(clusterArn: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.sagemaker.CfnCluster.ClusterOrchestratorEksConfigProperty.Builder
          =
          software.amazon.awscdk.services.sagemaker.CfnCluster.ClusterOrchestratorEksConfigProperty.builder()

      /**
       * @param clusterArn The Amazon Resource Name (ARN) of the SageMaker HyperPod cluster. 
       */
      override fun clusterArn(clusterArn: String) {
        cdkBuilder.clusterArn(clusterArn)
      }

      public fun build():
          software.amazon.awscdk.services.sagemaker.CfnCluster.ClusterOrchestratorEksConfigProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.sagemaker.CfnCluster.ClusterOrchestratorEksConfigProperty,
    ) : CdkObject(cdkObject),
        ClusterOrchestratorEksConfigProperty {
      /**
       * The Amazon Resource Name (ARN) of the SageMaker HyperPod cluster.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-cluster-clusterorchestratoreksconfig.html#cfn-sagemaker-cluster-clusterorchestratoreksconfig-clusterarn)
       */
      override fun clusterArn(): String = unwrap(this).getClusterArn()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          ClusterOrchestratorEksConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.sagemaker.CfnCluster.ClusterOrchestratorEksConfigProperty):
          ClusterOrchestratorEksConfigProperty = CdkObjectWrappers.wrap(cdkObject) as?
          ClusterOrchestratorEksConfigProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: ClusterOrchestratorEksConfigProperty):
          software.amazon.awscdk.services.sagemaker.CfnCluster.ClusterOrchestratorEksConfigProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.sagemaker.CfnCluster.ClusterOrchestratorEksConfigProperty
    }
  }

  /**
   * The orchestrator for a SageMaker HyperPod cluster.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.sagemaker.*;
   * OrchestratorProperty orchestratorProperty = OrchestratorProperty.builder()
   * .eks(ClusterOrchestratorEksConfigProperty.builder()
   * .clusterArn("clusterArn")
   * .build())
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-cluster-orchestrator.html)
   */
  public interface OrchestratorProperty {
    /**
     * The configuration of the Amazon EKS orchestrator cluster for the SageMaker HyperPod cluster.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-cluster-orchestrator.html#cfn-sagemaker-cluster-orchestrator-eks)
     */
    public fun eks(): Any

    /**
     * A builder for [OrchestratorProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param eks The configuration of the Amazon EKS orchestrator cluster for the SageMaker
       * HyperPod cluster. 
       */
      public fun eks(eks: IResolvable)

      /**
       * @param eks The configuration of the Amazon EKS orchestrator cluster for the SageMaker
       * HyperPod cluster. 
       */
      public fun eks(eks: ClusterOrchestratorEksConfigProperty)

      /**
       * @param eks The configuration of the Amazon EKS orchestrator cluster for the SageMaker
       * HyperPod cluster. 
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("151b842be6d8c0d9ffea2f5a23a11770d4d0be3786b78b5b8ecbb196205f8fec")
      public fun eks(eks: ClusterOrchestratorEksConfigProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.sagemaker.CfnCluster.OrchestratorProperty.Builder =
          software.amazon.awscdk.services.sagemaker.CfnCluster.OrchestratorProperty.builder()

      /**
       * @param eks The configuration of the Amazon EKS orchestrator cluster for the SageMaker
       * HyperPod cluster. 
       */
      override fun eks(eks: IResolvable) {
        cdkBuilder.eks(eks.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param eks The configuration of the Amazon EKS orchestrator cluster for the SageMaker
       * HyperPod cluster. 
       */
      override fun eks(eks: ClusterOrchestratorEksConfigProperty) {
        cdkBuilder.eks(eks.let(ClusterOrchestratorEksConfigProperty.Companion::unwrap))
      }

      /**
       * @param eks The configuration of the Amazon EKS orchestrator cluster for the SageMaker
       * HyperPod cluster. 
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("151b842be6d8c0d9ffea2f5a23a11770d4d0be3786b78b5b8ecbb196205f8fec")
      override fun eks(eks: ClusterOrchestratorEksConfigProperty.Builder.() -> Unit): Unit =
          eks(ClusterOrchestratorEksConfigProperty(eks))

      public fun build(): software.amazon.awscdk.services.sagemaker.CfnCluster.OrchestratorProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.sagemaker.CfnCluster.OrchestratorProperty,
    ) : CdkObject(cdkObject),
        OrchestratorProperty {
      /**
       * The configuration of the Amazon EKS orchestrator cluster for the SageMaker HyperPod
       * cluster.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-cluster-orchestrator.html#cfn-sagemaker-cluster-orchestrator-eks)
       */
      override fun eks(): Any = unwrap(this).getEks()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): OrchestratorProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.sagemaker.CfnCluster.OrchestratorProperty):
          OrchestratorProperty = CdkObjectWrappers.wrap(cdkObject) as? OrchestratorProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: OrchestratorProperty):
          software.amazon.awscdk.services.sagemaker.CfnCluster.OrchestratorProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.sagemaker.CfnCluster.OrchestratorProperty
    }
  }

  /**
   * Specifies an Amazon Virtual Private Cloud (VPC) that your SageMaker jobs, hosted models, and
   * compute resources have access to.
   *
   * You can control access to and from your resources by configuring a VPC. For more information,
   * see [Give SageMaker Access to Resources in your Amazon
   * VPC](https://docs.aws.amazon.com/sagemaker/latest/dg/infrastructure-give-access.html) .
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.sagemaker.*;
   * VpcConfigProperty vpcConfigProperty = VpcConfigProperty.builder()
   * .securityGroupIds(List.of("securityGroupIds"))
   * .subnets(List.of("subnets"))
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-cluster-vpcconfig.html)
   */
  public interface VpcConfigProperty {
    /**
     * The VPC security group IDs, in the form `sg-xxxxxxxx` .
     *
     * Specify the security groups for the VPC that is specified in the `Subnets` field.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-cluster-vpcconfig.html#cfn-sagemaker-cluster-vpcconfig-securitygroupids)
     */
    public fun securityGroupIds(): List<String>

    /**
     * The ID of the subnets in the VPC to which you want to connect your training job or model.
     *
     * For information about the availability of specific instance types, see [Supported Instance
     * Types and Availability
     * Zones](https://docs.aws.amazon.com/sagemaker/latest/dg/instance-types-az.html) .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-cluster-vpcconfig.html#cfn-sagemaker-cluster-vpcconfig-subnets)
     */
    public fun subnets(): List<String>

    /**
     * A builder for [VpcConfigProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param securityGroupIds The VPC security group IDs, in the form `sg-xxxxxxxx` . 
       * Specify the security groups for the VPC that is specified in the `Subnets` field.
       */
      public fun securityGroupIds(securityGroupIds: List<String>)

      /**
       * @param securityGroupIds The VPC security group IDs, in the form `sg-xxxxxxxx` . 
       * Specify the security groups for the VPC that is specified in the `Subnets` field.
       */
      public fun securityGroupIds(vararg securityGroupIds: String)

      /**
       * @param subnets The ID of the subnets in the VPC to which you want to connect your training
       * job or model. 
       * For information about the availability of specific instance types, see [Supported Instance
       * Types and Availability
       * Zones](https://docs.aws.amazon.com/sagemaker/latest/dg/instance-types-az.html) .
       */
      public fun subnets(subnets: List<String>)

      /**
       * @param subnets The ID of the subnets in the VPC to which you want to connect your training
       * job or model. 
       * For information about the availability of specific instance types, see [Supported Instance
       * Types and Availability
       * Zones](https://docs.aws.amazon.com/sagemaker/latest/dg/instance-types-az.html) .
       */
      public fun subnets(vararg subnets: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.sagemaker.CfnCluster.VpcConfigProperty.Builder =
          software.amazon.awscdk.services.sagemaker.CfnCluster.VpcConfigProperty.builder()

      /**
       * @param securityGroupIds The VPC security group IDs, in the form `sg-xxxxxxxx` . 
       * Specify the security groups for the VPC that is specified in the `Subnets` field.
       */
      override fun securityGroupIds(securityGroupIds: List<String>) {
        cdkBuilder.securityGroupIds(securityGroupIds)
      }

      /**
       * @param securityGroupIds The VPC security group IDs, in the form `sg-xxxxxxxx` . 
       * Specify the security groups for the VPC that is specified in the `Subnets` field.
       */
      override fun securityGroupIds(vararg securityGroupIds: String): Unit =
          securityGroupIds(securityGroupIds.toList())

      /**
       * @param subnets The ID of the subnets in the VPC to which you want to connect your training
       * job or model. 
       * For information about the availability of specific instance types, see [Supported Instance
       * Types and Availability
       * Zones](https://docs.aws.amazon.com/sagemaker/latest/dg/instance-types-az.html) .
       */
      override fun subnets(subnets: List<String>) {
        cdkBuilder.subnets(subnets)
      }

      /**
       * @param subnets The ID of the subnets in the VPC to which you want to connect your training
       * job or model. 
       * For information about the availability of specific instance types, see [Supported Instance
       * Types and Availability
       * Zones](https://docs.aws.amazon.com/sagemaker/latest/dg/instance-types-az.html) .
       */
      override fun subnets(vararg subnets: String): Unit = subnets(subnets.toList())

      public fun build(): software.amazon.awscdk.services.sagemaker.CfnCluster.VpcConfigProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.sagemaker.CfnCluster.VpcConfigProperty,
    ) : CdkObject(cdkObject),
        VpcConfigProperty {
      /**
       * The VPC security group IDs, in the form `sg-xxxxxxxx` .
       *
       * Specify the security groups for the VPC that is specified in the `Subnets` field.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-cluster-vpcconfig.html#cfn-sagemaker-cluster-vpcconfig-securitygroupids)
       */
      override fun securityGroupIds(): List<String> = unwrap(this).getSecurityGroupIds()

      /**
       * The ID of the subnets in the VPC to which you want to connect your training job or model.
       *
       * For information about the availability of specific instance types, see [Supported Instance
       * Types and Availability
       * Zones](https://docs.aws.amazon.com/sagemaker/latest/dg/instance-types-az.html) .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-cluster-vpcconfig.html#cfn-sagemaker-cluster-vpcconfig-subnets)
       */
      override fun subnets(): List<String> = unwrap(this).getSubnets()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): VpcConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.sagemaker.CfnCluster.VpcConfigProperty):
          VpcConfigProperty = CdkObjectWrappers.wrap(cdkObject) as? VpcConfigProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: VpcConfigProperty):
          software.amazon.awscdk.services.sagemaker.CfnCluster.VpcConfigProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.sagemaker.CfnCluster.VpcConfigProperty
    }
  }
}
