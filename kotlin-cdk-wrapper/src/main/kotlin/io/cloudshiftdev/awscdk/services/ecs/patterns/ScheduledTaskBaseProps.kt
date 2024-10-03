@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ecs.patterns

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import io.cloudshiftdev.awscdk.services.applicationautoscaling.Schedule
import io.cloudshiftdev.awscdk.services.ec2.ISecurityGroup
import io.cloudshiftdev.awscdk.services.ec2.IVpc
import io.cloudshiftdev.awscdk.services.ec2.SubnetSelection
import io.cloudshiftdev.awscdk.services.ecs.ICluster
import io.cloudshiftdev.awscdk.services.ecs.PropagatedTagSource
import io.cloudshiftdev.awscdk.services.events.targets.Tag
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

/**
 * The properties for the base ScheduledEc2Task or ScheduledFargateTask task.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.applicationautoscaling.*;
 * import io.cloudshiftdev.awscdk.services.ec2.*;
 * import io.cloudshiftdev.awscdk.services.ecs.*;
 * import io.cloudshiftdev.awscdk.services.ecs.patterns.*;
 * Cluster cluster;
 * Schedule schedule;
 * SecurityGroup securityGroup;
 * Subnet subnet;
 * SubnetFilter subnetFilter;
 * Vpc vpc;
 * ScheduledTaskBaseProps scheduledTaskBaseProps = ScheduledTaskBaseProps.builder()
 * .schedule(schedule)
 * // the properties below are optional
 * .cluster(cluster)
 * .desiredTaskCount(123)
 * .enabled(false)
 * .propagateTags(PropagatedTagSource.SERVICE)
 * .ruleName("ruleName")
 * .securityGroups(List.of(securityGroup))
 * .subnetSelection(SubnetSelection.builder()
 * .availabilityZones(List.of("availabilityZones"))
 * .onePerAz(false)
 * .subnetFilters(List.of(subnetFilter))
 * .subnetGroupName("subnetGroupName")
 * .subnets(List.of(subnet))
 * .subnetType(SubnetType.PRIVATE_ISOLATED)
 * .build())
 * .tags(List.of(Tag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .vpc(vpc)
 * .build();
 * ```
 */
public interface ScheduledTaskBaseProps {
  /**
   * The name of the cluster that hosts the service.
   *
   * If a cluster is specified, the vpc construct should be omitted. Alternatively, you can omit
   * both cluster and vpc.
   *
   * Default: - create a new cluster; if both cluster and vpc are omitted, a new VPC will be created
   * for you.
   */
  public fun cluster(): ICluster? = unwrap(this).getCluster()?.let(ICluster::wrap)

  /**
   * The desired number of instantiations of the task definition to keep running on the service.
   *
   * Default: 1
   */
  public fun desiredTaskCount(): Number? = unwrap(this).getDesiredTaskCount()

  /**
   * Indicates whether the rule is enabled.
   *
   * Default: true
   */
  public fun enabled(): Boolean? = unwrap(this).getEnabled()

  /**
   * Specifies whether to propagate the tags from the task definition to the task.
   *
   * If no value is specified, the tags are not propagated.
   *
   * Default: - Tags will not be propagated
   */
  public fun propagateTags(): PropagatedTagSource? =
      unwrap(this).getPropagateTags()?.let(PropagatedTagSource::wrap)

  /**
   * A name for the rule.
   *
   * Default: - AWS CloudFormation generates a unique physical ID and uses that ID
   * for the rule name. For more information, see [Name
   * Type](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-name.html).
   */
  public fun ruleName(): String? = unwrap(this).getRuleName()

  /**
   * The schedule or rate (frequency) that determines when CloudWatch Events runs the rule.
   *
   * For more information, see
   * [Schedule Expression Syntax for
   * Rules](https://docs.aws.amazon.com/AmazonCloudWatch/latest/events/ScheduledEvents.html)
   * in the Amazon CloudWatch User Guide.
   */
  public fun schedule(): Schedule

  /**
   * Existing security groups to use for your service.
   *
   * Default: - a new security group will be created.
   */
  public fun securityGroups(): List<ISecurityGroup> =
      unwrap(this).getSecurityGroups()?.map(ISecurityGroup::wrap) ?: emptyList()

  /**
   * In what subnets to place the task's ENIs.
   *
   * (Only applicable in case the TaskDefinition is configured for AwsVpc networking)
   *
   * Default: Private subnets
   */
  public fun subnetSelection(): SubnetSelection? =
      unwrap(this).getSubnetSelection()?.let(SubnetSelection::wrap)

  /**
   * The metadata that you apply to the task to help you categorize and organize them.
   *
   * Each tag consists of a key and an optional value, both of which you define.
   *
   * Default: - No tags are applied to the task
   */
  public fun tags(): List<Tag> = unwrap(this).getTags()?.map(Tag::wrap) ?: emptyList()

  /**
   * The VPC where the container instances will be launched or the elastic network interfaces (ENIs)
   * will be deployed.
   *
   * If a vpc is specified, the cluster construct should be omitted. Alternatively, you can omit
   * both vpc and cluster.
   *
   * Default: - uses the VPC defined in the cluster or creates a new VPC.
   */
  public fun vpc(): IVpc? = unwrap(this).getVpc()?.let(IVpc::wrap)

  /**
   * A builder for [ScheduledTaskBaseProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param cluster The name of the cluster that hosts the service.
     * If a cluster is specified, the vpc construct should be omitted. Alternatively, you can omit
     * both cluster and vpc.
     */
    public fun cluster(cluster: ICluster)

    /**
     * @param desiredTaskCount The desired number of instantiations of the task definition to keep
     * running on the service.
     */
    public fun desiredTaskCount(desiredTaskCount: Number)

    /**
     * @param enabled Indicates whether the rule is enabled.
     */
    public fun enabled(enabled: Boolean)

    /**
     * @param propagateTags Specifies whether to propagate the tags from the task definition to the
     * task.
     * If no value is specified, the tags are not propagated.
     */
    public fun propagateTags(propagateTags: PropagatedTagSource)

    /**
     * @param ruleName A name for the rule.
     */
    public fun ruleName(ruleName: String)

    /**
     * @param schedule The schedule or rate (frequency) that determines when CloudWatch Events runs
     * the rule. 
     * For more information, see
     * [Schedule Expression Syntax for
     * Rules](https://docs.aws.amazon.com/AmazonCloudWatch/latest/events/ScheduledEvents.html)
     * in the Amazon CloudWatch User Guide.
     */
    public fun schedule(schedule: Schedule)

    /**
     * @param securityGroups Existing security groups to use for your service.
     */
    public fun securityGroups(securityGroups: List<ISecurityGroup>)

    /**
     * @param securityGroups Existing security groups to use for your service.
     */
    public fun securityGroups(vararg securityGroups: ISecurityGroup)

    /**
     * @param subnetSelection In what subnets to place the task's ENIs.
     * (Only applicable in case the TaskDefinition is configured for AwsVpc networking)
     */
    public fun subnetSelection(subnetSelection: SubnetSelection)

    /**
     * @param subnetSelection In what subnets to place the task's ENIs.
     * (Only applicable in case the TaskDefinition is configured for AwsVpc networking)
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("b776167e6c6d17a3f3af29a291c51e1c0339732037d63e37642e2870bc4aaddf")
    public fun subnetSelection(subnetSelection: SubnetSelection.Builder.() -> Unit)

    /**
     * @param tags The metadata that you apply to the task to help you categorize and organize them.
     * Each tag consists of a key and an optional value, both of which you define.
     */
    public fun tags(tags: List<Tag>)

    /**
     * @param tags The metadata that you apply to the task to help you categorize and organize them.
     * Each tag consists of a key and an optional value, both of which you define.
     */
    public fun tags(vararg tags: Tag)

    /**
     * @param vpc The VPC where the container instances will be launched or the elastic network
     * interfaces (ENIs) will be deployed.
     * If a vpc is specified, the cluster construct should be omitted. Alternatively, you can omit
     * both vpc and cluster.
     */
    public fun vpc(vpc: IVpc)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.ecs.patterns.ScheduledTaskBaseProps.Builder =
        software.amazon.awscdk.services.ecs.patterns.ScheduledTaskBaseProps.builder()

    /**
     * @param cluster The name of the cluster that hosts the service.
     * If a cluster is specified, the vpc construct should be omitted. Alternatively, you can omit
     * both cluster and vpc.
     */
    override fun cluster(cluster: ICluster) {
      cdkBuilder.cluster(cluster.let(ICluster.Companion::unwrap))
    }

    /**
     * @param desiredTaskCount The desired number of instantiations of the task definition to keep
     * running on the service.
     */
    override fun desiredTaskCount(desiredTaskCount: Number) {
      cdkBuilder.desiredTaskCount(desiredTaskCount)
    }

    /**
     * @param enabled Indicates whether the rule is enabled.
     */
    override fun enabled(enabled: Boolean) {
      cdkBuilder.enabled(enabled)
    }

    /**
     * @param propagateTags Specifies whether to propagate the tags from the task definition to the
     * task.
     * If no value is specified, the tags are not propagated.
     */
    override fun propagateTags(propagateTags: PropagatedTagSource) {
      cdkBuilder.propagateTags(propagateTags.let(PropagatedTagSource.Companion::unwrap))
    }

    /**
     * @param ruleName A name for the rule.
     */
    override fun ruleName(ruleName: String) {
      cdkBuilder.ruleName(ruleName)
    }

    /**
     * @param schedule The schedule or rate (frequency) that determines when CloudWatch Events runs
     * the rule. 
     * For more information, see
     * [Schedule Expression Syntax for
     * Rules](https://docs.aws.amazon.com/AmazonCloudWatch/latest/events/ScheduledEvents.html)
     * in the Amazon CloudWatch User Guide.
     */
    override fun schedule(schedule: Schedule) {
      cdkBuilder.schedule(schedule.let(Schedule.Companion::unwrap))
    }

    /**
     * @param securityGroups Existing security groups to use for your service.
     */
    override fun securityGroups(securityGroups: List<ISecurityGroup>) {
      cdkBuilder.securityGroups(securityGroups.map(ISecurityGroup.Companion::unwrap))
    }

    /**
     * @param securityGroups Existing security groups to use for your service.
     */
    override fun securityGroups(vararg securityGroups: ISecurityGroup): Unit =
        securityGroups(securityGroups.toList())

    /**
     * @param subnetSelection In what subnets to place the task's ENIs.
     * (Only applicable in case the TaskDefinition is configured for AwsVpc networking)
     */
    override fun subnetSelection(subnetSelection: SubnetSelection) {
      cdkBuilder.subnetSelection(subnetSelection.let(SubnetSelection.Companion::unwrap))
    }

    /**
     * @param subnetSelection In what subnets to place the task's ENIs.
     * (Only applicable in case the TaskDefinition is configured for AwsVpc networking)
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("b776167e6c6d17a3f3af29a291c51e1c0339732037d63e37642e2870bc4aaddf")
    override fun subnetSelection(subnetSelection: SubnetSelection.Builder.() -> Unit): Unit =
        subnetSelection(SubnetSelection(subnetSelection))

    /**
     * @param tags The metadata that you apply to the task to help you categorize and organize them.
     * Each tag consists of a key and an optional value, both of which you define.
     */
    override fun tags(tags: List<Tag>) {
      cdkBuilder.tags(tags.map(Tag.Companion::unwrap))
    }

    /**
     * @param tags The metadata that you apply to the task to help you categorize and organize them.
     * Each tag consists of a key and an optional value, both of which you define.
     */
    override fun tags(vararg tags: Tag): Unit = tags(tags.toList())

    /**
     * @param vpc The VPC where the container instances will be launched or the elastic network
     * interfaces (ENIs) will be deployed.
     * If a vpc is specified, the cluster construct should be omitted. Alternatively, you can omit
     * both vpc and cluster.
     */
    override fun vpc(vpc: IVpc) {
      cdkBuilder.vpc(vpc.let(IVpc.Companion::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.ecs.patterns.ScheduledTaskBaseProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.ecs.patterns.ScheduledTaskBaseProps,
  ) : CdkObject(cdkObject),
      ScheduledTaskBaseProps {
    /**
     * The name of the cluster that hosts the service.
     *
     * If a cluster is specified, the vpc construct should be omitted. Alternatively, you can omit
     * both cluster and vpc.
     *
     * Default: - create a new cluster; if both cluster and vpc are omitted, a new VPC will be
     * created for you.
     */
    override fun cluster(): ICluster? = unwrap(this).getCluster()?.let(ICluster::wrap)

    /**
     * The desired number of instantiations of the task definition to keep running on the service.
     *
     * Default: 1
     */
    override fun desiredTaskCount(): Number? = unwrap(this).getDesiredTaskCount()

    /**
     * Indicates whether the rule is enabled.
     *
     * Default: true
     */
    override fun enabled(): Boolean? = unwrap(this).getEnabled()

    /**
     * Specifies whether to propagate the tags from the task definition to the task.
     *
     * If no value is specified, the tags are not propagated.
     *
     * Default: - Tags will not be propagated
     */
    override fun propagateTags(): PropagatedTagSource? =
        unwrap(this).getPropagateTags()?.let(PropagatedTagSource::wrap)

    /**
     * A name for the rule.
     *
     * Default: - AWS CloudFormation generates a unique physical ID and uses that ID
     * for the rule name. For more information, see [Name
     * Type](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-name.html).
     */
    override fun ruleName(): String? = unwrap(this).getRuleName()

    /**
     * The schedule or rate (frequency) that determines when CloudWatch Events runs the rule.
     *
     * For more information, see
     * [Schedule Expression Syntax for
     * Rules](https://docs.aws.amazon.com/AmazonCloudWatch/latest/events/ScheduledEvents.html)
     * in the Amazon CloudWatch User Guide.
     */
    override fun schedule(): Schedule = unwrap(this).getSchedule().let(Schedule::wrap)

    /**
     * Existing security groups to use for your service.
     *
     * Default: - a new security group will be created.
     */
    override fun securityGroups(): List<ISecurityGroup> =
        unwrap(this).getSecurityGroups()?.map(ISecurityGroup::wrap) ?: emptyList()

    /**
     * In what subnets to place the task's ENIs.
     *
     * (Only applicable in case the TaskDefinition is configured for AwsVpc networking)
     *
     * Default: Private subnets
     */
    override fun subnetSelection(): SubnetSelection? =
        unwrap(this).getSubnetSelection()?.let(SubnetSelection::wrap)

    /**
     * The metadata that you apply to the task to help you categorize and organize them.
     *
     * Each tag consists of a key and an optional value, both of which you define.
     *
     * Default: - No tags are applied to the task
     */
    override fun tags(): List<Tag> = unwrap(this).getTags()?.map(Tag::wrap) ?: emptyList()

    /**
     * The VPC where the container instances will be launched or the elastic network interfaces
     * (ENIs) will be deployed.
     *
     * If a vpc is specified, the cluster construct should be omitted. Alternatively, you can omit
     * both vpc and cluster.
     *
     * Default: - uses the VPC defined in the cluster or creates a new VPC.
     */
    override fun vpc(): IVpc? = unwrap(this).getVpc()?.let(IVpc::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): ScheduledTaskBaseProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.ecs.patterns.ScheduledTaskBaseProps):
        ScheduledTaskBaseProps = CdkObjectWrappers.wrap(cdkObject) as? ScheduledTaskBaseProps ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: ScheduledTaskBaseProps):
        software.amazon.awscdk.services.ecs.patterns.ScheduledTaskBaseProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.ecs.patterns.ScheduledTaskBaseProps
  }
}
