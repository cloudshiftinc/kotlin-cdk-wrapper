@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ecs

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import io.cloudshiftdev.awscdk.services.autoscaling.IAutoScalingGroup
import io.cloudshiftdev.awscdk.services.ec2.ISecurityGroup
import io.cloudshiftdev.awscdk.services.ec2.IVpc
import io.cloudshiftdev.awscdk.services.servicediscovery.INamespace
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

/**
 * The properties to import from the ECS cluster.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.autoscaling.*;
 * import io.cloudshiftdev.awscdk.services.ec2.*;
 * import io.cloudshiftdev.awscdk.services.ecs.*;
 * import io.cloudshiftdev.awscdk.services.kms.*;
 * import io.cloudshiftdev.awscdk.services.logs.*;
 * import io.cloudshiftdev.awscdk.services.s3.*;
 * import io.cloudshiftdev.awscdk.services.servicediscovery.*;
 * AutoScalingGroup autoScalingGroup;
 * Bucket bucket;
 * Key key;
 * LogGroup logGroup;
 * INamespace namespace;
 * SecurityGroup securityGroup;
 * Vpc vpc;
 * ClusterAttributes clusterAttributes = ClusterAttributes.builder()
 * .clusterName("clusterName")
 * .vpc(vpc)
 * // the properties below are optional
 * .autoscalingGroup(autoScalingGroup)
 * .clusterArn("clusterArn")
 * .defaultCloudMapNamespace(namespace)
 * .executeCommandConfiguration(ExecuteCommandConfiguration.builder()
 * .kmsKey(key)
 * .logConfiguration(ExecuteCommandLogConfiguration.builder()
 * .cloudWatchEncryptionEnabled(false)
 * .cloudWatchLogGroup(logGroup)
 * .s3Bucket(bucket)
 * .s3EncryptionEnabled(false)
 * .s3KeyPrefix("s3KeyPrefix")
 * .build())
 * .logging(ExecuteCommandLogging.NONE)
 * .build())
 * .hasEc2Capacity(false)
 * .securityGroups(List.of(securityGroup))
 * .build();
 * ```
 */
public interface ClusterAttributes {
  /**
   * Autoscaling group added to the cluster if capacity is added.
   *
   * Default: - No default autoscaling group
   */
  public fun autoscalingGroup(): IAutoScalingGroup? =
      unwrap(this).getAutoscalingGroup()?.let(IAutoScalingGroup::wrap)

  /**
   * The Amazon Resource Name (ARN) that identifies the cluster.
   *
   * Default: Derived from clusterName
   */
  public fun clusterArn(): String? = unwrap(this).getClusterArn()

  /**
   * The name of the cluster.
   */
  public fun clusterName(): String

  /**
   * The AWS Cloud Map namespace to associate with the cluster.
   *
   * Default: - No default namespace
   */
  public fun defaultCloudMapNamespace(): INamespace? =
      unwrap(this).getDefaultCloudMapNamespace()?.let(INamespace::wrap)

  /**
   * The execute command configuration for the cluster.
   *
   * Default: - none.
   */
  public fun executeCommandConfiguration(): ExecuteCommandConfiguration? =
      unwrap(this).getExecuteCommandConfiguration()?.let(ExecuteCommandConfiguration::wrap)

  /**
   * Specifies whether the cluster has EC2 instance capacity.
   *
   * Default: true
   */
  public fun hasEc2Capacity(): Boolean? = unwrap(this).getHasEc2Capacity()

  /**
   * The security groups associated with the container instances registered to the cluster.
   *
   * Default: - no security groups
   */
  public fun securityGroups(): List<ISecurityGroup> =
      unwrap(this).getSecurityGroups()?.map(ISecurityGroup::wrap) ?: emptyList()

  /**
   * The VPC associated with the cluster.
   */
  public fun vpc(): IVpc

  /**
   * A builder for [ClusterAttributes]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param autoscalingGroup Autoscaling group added to the cluster if capacity is added.
     */
    public fun autoscalingGroup(autoscalingGroup: IAutoScalingGroup)

    /**
     * @param clusterArn The Amazon Resource Name (ARN) that identifies the cluster.
     */
    public fun clusterArn(clusterArn: String)

    /**
     * @param clusterName The name of the cluster. 
     */
    public fun clusterName(clusterName: String)

    /**
     * @param defaultCloudMapNamespace The AWS Cloud Map namespace to associate with the cluster.
     */
    public fun defaultCloudMapNamespace(defaultCloudMapNamespace: INamespace)

    /**
     * @param executeCommandConfiguration The execute command configuration for the cluster.
     */
    public fun executeCommandConfiguration(executeCommandConfiguration: ExecuteCommandConfiguration)

    /**
     * @param executeCommandConfiguration The execute command configuration for the cluster.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("6a88dfe25a9142021f2b4dc760e103f545a1f678448f8b00a7516fa7ca1c5aee")
    public
        fun executeCommandConfiguration(executeCommandConfiguration: ExecuteCommandConfiguration.Builder.() -> Unit)

    /**
     * @param hasEc2Capacity Specifies whether the cluster has EC2 instance capacity.
     */
    public fun hasEc2Capacity(hasEc2Capacity: Boolean)

    /**
     * @param securityGroups The security groups associated with the container instances registered
     * to the cluster.
     */
    public fun securityGroups(securityGroups: List<ISecurityGroup>)

    /**
     * @param securityGroups The security groups associated with the container instances registered
     * to the cluster.
     */
    public fun securityGroups(vararg securityGroups: ISecurityGroup)

    /**
     * @param vpc The VPC associated with the cluster. 
     */
    public fun vpc(vpc: IVpc)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ecs.ClusterAttributes.Builder =
        software.amazon.awscdk.services.ecs.ClusterAttributes.builder()

    /**
     * @param autoscalingGroup Autoscaling group added to the cluster if capacity is added.
     */
    override fun autoscalingGroup(autoscalingGroup: IAutoScalingGroup) {
      cdkBuilder.autoscalingGroup(autoscalingGroup.let(IAutoScalingGroup::unwrap))
    }

    /**
     * @param clusterArn The Amazon Resource Name (ARN) that identifies the cluster.
     */
    override fun clusterArn(clusterArn: String) {
      cdkBuilder.clusterArn(clusterArn)
    }

    /**
     * @param clusterName The name of the cluster. 
     */
    override fun clusterName(clusterName: String) {
      cdkBuilder.clusterName(clusterName)
    }

    /**
     * @param defaultCloudMapNamespace The AWS Cloud Map namespace to associate with the cluster.
     */
    override fun defaultCloudMapNamespace(defaultCloudMapNamespace: INamespace) {
      cdkBuilder.defaultCloudMapNamespace(defaultCloudMapNamespace.let(INamespace::unwrap))
    }

    /**
     * @param executeCommandConfiguration The execute command configuration for the cluster.
     */
    override
        fun executeCommandConfiguration(executeCommandConfiguration: ExecuteCommandConfiguration) {
      cdkBuilder.executeCommandConfiguration(executeCommandConfiguration.let(ExecuteCommandConfiguration::unwrap))
    }

    /**
     * @param executeCommandConfiguration The execute command configuration for the cluster.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("6a88dfe25a9142021f2b4dc760e103f545a1f678448f8b00a7516fa7ca1c5aee")
    override
        fun executeCommandConfiguration(executeCommandConfiguration: ExecuteCommandConfiguration.Builder.() -> Unit):
        Unit = executeCommandConfiguration(ExecuteCommandConfiguration(executeCommandConfiguration))

    /**
     * @param hasEc2Capacity Specifies whether the cluster has EC2 instance capacity.
     */
    override fun hasEc2Capacity(hasEc2Capacity: Boolean) {
      cdkBuilder.hasEc2Capacity(hasEc2Capacity)
    }

    /**
     * @param securityGroups The security groups associated with the container instances registered
     * to the cluster.
     */
    override fun securityGroups(securityGroups: List<ISecurityGroup>) {
      cdkBuilder.securityGroups(securityGroups.map(ISecurityGroup::unwrap))
    }

    /**
     * @param securityGroups The security groups associated with the container instances registered
     * to the cluster.
     */
    override fun securityGroups(vararg securityGroups: ISecurityGroup): Unit =
        securityGroups(securityGroups.toList())

    /**
     * @param vpc The VPC associated with the cluster. 
     */
    override fun vpc(vpc: IVpc) {
      cdkBuilder.vpc(vpc.let(IVpc::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.ecs.ClusterAttributes = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.ecs.ClusterAttributes,
  ) : CdkObject(cdkObject), ClusterAttributes {
    /**
     * Autoscaling group added to the cluster if capacity is added.
     *
     * Default: - No default autoscaling group
     */
    override fun autoscalingGroup(): IAutoScalingGroup? =
        unwrap(this).getAutoscalingGroup()?.let(IAutoScalingGroup::wrap)

    /**
     * The Amazon Resource Name (ARN) that identifies the cluster.
     *
     * Default: Derived from clusterName
     */
    override fun clusterArn(): String? = unwrap(this).getClusterArn()

    /**
     * The name of the cluster.
     */
    override fun clusterName(): String = unwrap(this).getClusterName()

    /**
     * The AWS Cloud Map namespace to associate with the cluster.
     *
     * Default: - No default namespace
     */
    override fun defaultCloudMapNamespace(): INamespace? =
        unwrap(this).getDefaultCloudMapNamespace()?.let(INamespace::wrap)

    /**
     * The execute command configuration for the cluster.
     *
     * Default: - none.
     */
    override fun executeCommandConfiguration(): ExecuteCommandConfiguration? =
        unwrap(this).getExecuteCommandConfiguration()?.let(ExecuteCommandConfiguration::wrap)

    /**
     * Specifies whether the cluster has EC2 instance capacity.
     *
     * Default: true
     */
    override fun hasEc2Capacity(): Boolean? = unwrap(this).getHasEc2Capacity()

    /**
     * The security groups associated with the container instances registered to the cluster.
     *
     * Default: - no security groups
     */
    override fun securityGroups(): List<ISecurityGroup> =
        unwrap(this).getSecurityGroups()?.map(ISecurityGroup::wrap) ?: emptyList()

    /**
     * The VPC associated with the cluster.
     */
    override fun vpc(): IVpc = unwrap(this).getVpc().let(IVpc::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): ClusterAttributes {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ecs.ClusterAttributes):
        ClusterAttributes = CdkObjectWrappers.wrap(cdkObject) as? ClusterAttributes ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: ClusterAttributes):
        software.amazon.awscdk.services.ecs.ClusterAttributes = (wrapped as CdkObject).cdkObject as
        software.amazon.awscdk.services.ecs.ClusterAttributes
  }
}
