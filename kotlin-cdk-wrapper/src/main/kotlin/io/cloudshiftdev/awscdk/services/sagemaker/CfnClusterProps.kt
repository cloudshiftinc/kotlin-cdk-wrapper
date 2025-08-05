@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.sagemaker

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
 * Properties for defining a `CfnCluster`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.sagemaker.*;
 * CfnClusterProps cfnClusterProps = CfnClusterProps.builder()
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
 * .overrideVpcConfig(VpcConfigProperty.builder()
 * .securityGroupIds(List.of("securityGroupIds"))
 * .subnets(List.of("subnets"))
 * .build())
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
public interface CfnClusterProps {
  /**
   * The name of the SageMaker HyperPod cluster.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-cluster.html#cfn-sagemaker-cluster-clustername)
   */
  public fun clusterName(): String? = unwrap(this).getClusterName()

  /**
   * The instance groups of the SageMaker HyperPod cluster.
   *
   * To delete an instance group, remove it from the array.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-cluster.html#cfn-sagemaker-cluster-instancegroups)
   */
  public fun instanceGroups(): Any

  /**
   * Specifies whether to enable or disable the automatic node recovery feature of SageMaker
   * HyperPod.
   *
   * Available values are `Automatic` for enabling and `None` for disabling.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-cluster.html#cfn-sagemaker-cluster-noderecovery)
   */
  public fun nodeRecovery(): String? = unwrap(this).getNodeRecovery()

  /**
   * The orchestrator type for the SageMaker HyperPod cluster.
   *
   * Currently, `'eks'` is the only available option.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-cluster.html#cfn-sagemaker-cluster-orchestrator)
   */
  public fun orchestrator(): Any? = unwrap(this).getOrchestrator()

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
   */
  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * Specifies an Amazon Virtual Private Cloud (VPC) that your SageMaker jobs, hosted models, and
   * compute resources have access to.
   *
   * You can control access to and from your resources by configuring a VPC. For more information,
   * see [Give SageMaker Access to Resources in your Amazon
   * VPC](https://docs.aws.amazon.com/sagemaker/latest/dg/infrastructure-give-access.html) .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-cluster.html#cfn-sagemaker-cluster-vpcconfig)
   */
  public fun vpcConfig(): Any? = unwrap(this).getVpcConfig()

  /**
   * A builder for [CfnClusterProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param clusterName The name of the SageMaker HyperPod cluster.
     */
    public fun clusterName(clusterName: String)

    /**
     * @param instanceGroups The instance groups of the SageMaker HyperPod cluster. 
     * To delete an instance group, remove it from the array.
     */
    public fun instanceGroups(instanceGroups: IResolvable)

    /**
     * @param instanceGroups The instance groups of the SageMaker HyperPod cluster. 
     * To delete an instance group, remove it from the array.
     */
    public fun instanceGroups(instanceGroups: List<Any>)

    /**
     * @param instanceGroups The instance groups of the SageMaker HyperPod cluster. 
     * To delete an instance group, remove it from the array.
     */
    public fun instanceGroups(vararg instanceGroups: Any)

    /**
     * @param nodeRecovery Specifies whether to enable or disable the automatic node recovery
     * feature of SageMaker HyperPod.
     * Available values are `Automatic` for enabling and `None` for disabling.
     */
    public fun nodeRecovery(nodeRecovery: String)

    /**
     * @param orchestrator The orchestrator type for the SageMaker HyperPod cluster.
     * Currently, `'eks'` is the only available option.
     */
    public fun orchestrator(orchestrator: IResolvable)

    /**
     * @param orchestrator The orchestrator type for the SageMaker HyperPod cluster.
     * Currently, `'eks'` is the only available option.
     */
    public fun orchestrator(orchestrator: CfnCluster.OrchestratorProperty)

    /**
     * @param orchestrator The orchestrator type for the SageMaker HyperPod cluster.
     * Currently, `'eks'` is the only available option.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("d15e815d2bd9699dc618fb1d8b6acc53a968772895862a9e329987272e01eb82")
    public fun orchestrator(orchestrator: CfnCluster.OrchestratorProperty.Builder.() -> Unit)

    /**
     * @param tags A tag object that consists of a key and an optional value, used to manage
     * metadata for SageMaker AWS resources.
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
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * @param tags A tag object that consists of a key and an optional value, used to manage
     * metadata for SageMaker AWS resources.
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
     */
    public fun tags(vararg tags: CfnTag)

    /**
     * @param vpcConfig Specifies an Amazon Virtual Private Cloud (VPC) that your SageMaker jobs,
     * hosted models, and compute resources have access to.
     * You can control access to and from your resources by configuring a VPC. For more information,
     * see [Give SageMaker Access to Resources in your Amazon
     * VPC](https://docs.aws.amazon.com/sagemaker/latest/dg/infrastructure-give-access.html) .
     */
    public fun vpcConfig(vpcConfig: IResolvable)

    /**
     * @param vpcConfig Specifies an Amazon Virtual Private Cloud (VPC) that your SageMaker jobs,
     * hosted models, and compute resources have access to.
     * You can control access to and from your resources by configuring a VPC. For more information,
     * see [Give SageMaker Access to Resources in your Amazon
     * VPC](https://docs.aws.amazon.com/sagemaker/latest/dg/infrastructure-give-access.html) .
     */
    public fun vpcConfig(vpcConfig: CfnCluster.VpcConfigProperty)

    /**
     * @param vpcConfig Specifies an Amazon Virtual Private Cloud (VPC) that your SageMaker jobs,
     * hosted models, and compute resources have access to.
     * You can control access to and from your resources by configuring a VPC. For more information,
     * see [Give SageMaker Access to Resources in your Amazon
     * VPC](https://docs.aws.amazon.com/sagemaker/latest/dg/infrastructure-give-access.html) .
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("2b3b6f46cc2c25c6215374d61ec8b5c6b2d8ebc71b3a5781cd061618968d05cf")
    public fun vpcConfig(vpcConfig: CfnCluster.VpcConfigProperty.Builder.() -> Unit)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.sagemaker.CfnClusterProps.Builder =
        software.amazon.awscdk.services.sagemaker.CfnClusterProps.builder()

    /**
     * @param clusterName The name of the SageMaker HyperPod cluster.
     */
    override fun clusterName(clusterName: String) {
      cdkBuilder.clusterName(clusterName)
    }

    /**
     * @param instanceGroups The instance groups of the SageMaker HyperPod cluster. 
     * To delete an instance group, remove it from the array.
     */
    override fun instanceGroups(instanceGroups: IResolvable) {
      cdkBuilder.instanceGroups(instanceGroups.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param instanceGroups The instance groups of the SageMaker HyperPod cluster. 
     * To delete an instance group, remove it from the array.
     */
    override fun instanceGroups(instanceGroups: List<Any>) {
      cdkBuilder.instanceGroups(instanceGroups.map{CdkObjectWrappers.unwrap(it)})
    }

    /**
     * @param instanceGroups The instance groups of the SageMaker HyperPod cluster. 
     * To delete an instance group, remove it from the array.
     */
    override fun instanceGroups(vararg instanceGroups: Any): Unit =
        instanceGroups(instanceGroups.toList())

    /**
     * @param nodeRecovery Specifies whether to enable or disable the automatic node recovery
     * feature of SageMaker HyperPod.
     * Available values are `Automatic` for enabling and `None` for disabling.
     */
    override fun nodeRecovery(nodeRecovery: String) {
      cdkBuilder.nodeRecovery(nodeRecovery)
    }

    /**
     * @param orchestrator The orchestrator type for the SageMaker HyperPod cluster.
     * Currently, `'eks'` is the only available option.
     */
    override fun orchestrator(orchestrator: IResolvable) {
      cdkBuilder.orchestrator(orchestrator.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param orchestrator The orchestrator type for the SageMaker HyperPod cluster.
     * Currently, `'eks'` is the only available option.
     */
    override fun orchestrator(orchestrator: CfnCluster.OrchestratorProperty) {
      cdkBuilder.orchestrator(orchestrator.let(CfnCluster.OrchestratorProperty.Companion::unwrap))
    }

    /**
     * @param orchestrator The orchestrator type for the SageMaker HyperPod cluster.
     * Currently, `'eks'` is the only available option.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("d15e815d2bd9699dc618fb1d8b6acc53a968772895862a9e329987272e01eb82")
    override fun orchestrator(orchestrator: CfnCluster.OrchestratorProperty.Builder.() -> Unit):
        Unit = orchestrator(CfnCluster.OrchestratorProperty(orchestrator))

    /**
     * @param tags A tag object that consists of a key and an optional value, used to manage
     * metadata for SageMaker AWS resources.
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
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag.Companion::unwrap))
    }

    /**
     * @param tags A tag object that consists of a key and an optional value, used to manage
     * metadata for SageMaker AWS resources.
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
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    /**
     * @param vpcConfig Specifies an Amazon Virtual Private Cloud (VPC) that your SageMaker jobs,
     * hosted models, and compute resources have access to.
     * You can control access to and from your resources by configuring a VPC. For more information,
     * see [Give SageMaker Access to Resources in your Amazon
     * VPC](https://docs.aws.amazon.com/sagemaker/latest/dg/infrastructure-give-access.html) .
     */
    override fun vpcConfig(vpcConfig: IResolvable) {
      cdkBuilder.vpcConfig(vpcConfig.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param vpcConfig Specifies an Amazon Virtual Private Cloud (VPC) that your SageMaker jobs,
     * hosted models, and compute resources have access to.
     * You can control access to and from your resources by configuring a VPC. For more information,
     * see [Give SageMaker Access to Resources in your Amazon
     * VPC](https://docs.aws.amazon.com/sagemaker/latest/dg/infrastructure-give-access.html) .
     */
    override fun vpcConfig(vpcConfig: CfnCluster.VpcConfigProperty) {
      cdkBuilder.vpcConfig(vpcConfig.let(CfnCluster.VpcConfigProperty.Companion::unwrap))
    }

    /**
     * @param vpcConfig Specifies an Amazon Virtual Private Cloud (VPC) that your SageMaker jobs,
     * hosted models, and compute resources have access to.
     * You can control access to and from your resources by configuring a VPC. For more information,
     * see [Give SageMaker Access to Resources in your Amazon
     * VPC](https://docs.aws.amazon.com/sagemaker/latest/dg/infrastructure-give-access.html) .
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("2b3b6f46cc2c25c6215374d61ec8b5c6b2d8ebc71b3a5781cd061618968d05cf")
    override fun vpcConfig(vpcConfig: CfnCluster.VpcConfigProperty.Builder.() -> Unit): Unit =
        vpcConfig(CfnCluster.VpcConfigProperty(vpcConfig))

    public fun build(): software.amazon.awscdk.services.sagemaker.CfnClusterProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.sagemaker.CfnClusterProps,
  ) : CdkObject(cdkObject),
      CfnClusterProps {
    /**
     * The name of the SageMaker HyperPod cluster.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-cluster.html#cfn-sagemaker-cluster-clustername)
     */
    override fun clusterName(): String? = unwrap(this).getClusterName()

    /**
     * The instance groups of the SageMaker HyperPod cluster.
     *
     * To delete an instance group, remove it from the array.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-cluster.html#cfn-sagemaker-cluster-instancegroups)
     */
    override fun instanceGroups(): Any = unwrap(this).getInstanceGroups()

    /**
     * Specifies whether to enable or disable the automatic node recovery feature of SageMaker
     * HyperPod.
     *
     * Available values are `Automatic` for enabling and `None` for disabling.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-cluster.html#cfn-sagemaker-cluster-noderecovery)
     */
    override fun nodeRecovery(): String? = unwrap(this).getNodeRecovery()

    /**
     * The orchestrator type for the SageMaker HyperPod cluster.
     *
     * Currently, `'eks'` is the only available option.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-cluster.html#cfn-sagemaker-cluster-orchestrator)
     */
    override fun orchestrator(): Any? = unwrap(this).getOrchestrator()

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
     */
    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

    /**
     * Specifies an Amazon Virtual Private Cloud (VPC) that your SageMaker jobs, hosted models, and
     * compute resources have access to.
     *
     * You can control access to and from your resources by configuring a VPC. For more information,
     * see [Give SageMaker Access to Resources in your Amazon
     * VPC](https://docs.aws.amazon.com/sagemaker/latest/dg/infrastructure-give-access.html) .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-cluster.html#cfn-sagemaker-cluster-vpcconfig)
     */
    override fun vpcConfig(): Any? = unwrap(this).getVpcConfig()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnClusterProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.sagemaker.CfnClusterProps):
        CfnClusterProps = CdkObjectWrappers.wrap(cdkObject) as? CfnClusterProps ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnClusterProps):
        software.amazon.awscdk.services.sagemaker.CfnClusterProps = (wrapped as CdkObject).cdkObject
        as software.amazon.awscdk.services.sagemaker.CfnClusterProps
  }
}
