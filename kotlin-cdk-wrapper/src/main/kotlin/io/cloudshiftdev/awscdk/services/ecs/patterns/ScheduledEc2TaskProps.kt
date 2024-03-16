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
 * The properties for the ScheduledEc2Task task.
 *
 * Example:
 *
 * ```
 * // Instantiate an Amazon EC2 Task to run at a scheduled interval
 * Cluster cluster;
 * ScheduledEc2Task ecsScheduledTask = ScheduledEc2Task.Builder.create(this, "ScheduledTask")
 * .cluster(cluster)
 * .scheduledEc2TaskImageOptions(ScheduledEc2TaskImageOptions.builder()
 * .image(ContainerImage.fromRegistry("amazon/amazon-ecs-sample"))
 * .memoryLimitMiB(256)
 * .environment(Map.of("name", "TRIGGER", "value", "CloudWatch Events"))
 * .build())
 * .schedule(Schedule.expression("rate(1 minute)"))
 * .enabled(true)
 * .ruleName("sample-scheduled-task-rule")
 * .build();
 * ```
 */
public interface ScheduledEc2TaskProps : ScheduledTaskBaseProps {
  /**
   * The properties to define if using an existing TaskDefinition in this construct.
   *
   * ScheduledEc2TaskDefinitionOptions or ScheduledEc2TaskImageOptions must be defined, but not
   * both.
   *
   * Default: none
   */
  public fun scheduledEc2TaskDefinitionOptions(): ScheduledEc2TaskDefinitionOptions? =
      unwrap(this).getScheduledEc2TaskDefinitionOptions()?.let(ScheduledEc2TaskDefinitionOptions::wrap)

  /**
   * The properties to define if the construct is to create a TaskDefinition.
   *
   * ScheduledEc2TaskDefinitionOptions or ScheduledEc2TaskImageOptions must be defined, but not
   * both.
   *
   * Default: none
   */
  public fun scheduledEc2TaskImageOptions(): ScheduledEc2TaskImageOptions? =
      unwrap(this).getScheduledEc2TaskImageOptions()?.let(ScheduledEc2TaskImageOptions::wrap)

  /**
   * A builder for [ScheduledEc2TaskProps]
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
     * @param scheduledEc2TaskDefinitionOptions The properties to define if using an existing
     * TaskDefinition in this construct.
     * ScheduledEc2TaskDefinitionOptions or ScheduledEc2TaskImageOptions must be defined, but not
     * both.
     */
    public
        fun scheduledEc2TaskDefinitionOptions(scheduledEc2TaskDefinitionOptions: ScheduledEc2TaskDefinitionOptions)

    /**
     * @param scheduledEc2TaskDefinitionOptions The properties to define if using an existing
     * TaskDefinition in this construct.
     * ScheduledEc2TaskDefinitionOptions or ScheduledEc2TaskImageOptions must be defined, but not
     * both.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("394df8e1c8ae483a0f581448b4a3cfe8abe46404868e089be0b61895833c7928")
    public
        fun scheduledEc2TaskDefinitionOptions(scheduledEc2TaskDefinitionOptions: ScheduledEc2TaskDefinitionOptions.Builder.() -> Unit)

    /**
     * @param scheduledEc2TaskImageOptions The properties to define if the construct is to create a
     * TaskDefinition.
     * ScheduledEc2TaskDefinitionOptions or ScheduledEc2TaskImageOptions must be defined, but not
     * both.
     */
    public
        fun scheduledEc2TaskImageOptions(scheduledEc2TaskImageOptions: ScheduledEc2TaskImageOptions)

    /**
     * @param scheduledEc2TaskImageOptions The properties to define if the construct is to create a
     * TaskDefinition.
     * ScheduledEc2TaskDefinitionOptions or ScheduledEc2TaskImageOptions must be defined, but not
     * both.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("31667dda61e845f0b3db35e0926c1b8d0b89885624a3af214315a493cbab1775")
    public
        fun scheduledEc2TaskImageOptions(scheduledEc2TaskImageOptions: ScheduledEc2TaskImageOptions.Builder.() -> Unit)

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
    @JvmName("3866c2d7ab96f4b4e2c33b311458bc2a3823ce39c78dc68525fb5f321b885486")
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
        software.amazon.awscdk.services.ecs.patterns.ScheduledEc2TaskProps.Builder =
        software.amazon.awscdk.services.ecs.patterns.ScheduledEc2TaskProps.builder()

    /**
     * @param cluster The name of the cluster that hosts the service.
     * If a cluster is specified, the vpc construct should be omitted. Alternatively, you can omit
     * both cluster and vpc.
     */
    override fun cluster(cluster: ICluster) {
      cdkBuilder.cluster(cluster.let(ICluster::unwrap))
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
      cdkBuilder.propagateTags(propagateTags.let(PropagatedTagSource::unwrap))
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
      cdkBuilder.schedule(schedule.let(Schedule::unwrap))
    }

    /**
     * @param scheduledEc2TaskDefinitionOptions The properties to define if using an existing
     * TaskDefinition in this construct.
     * ScheduledEc2TaskDefinitionOptions or ScheduledEc2TaskImageOptions must be defined, but not
     * both.
     */
    override
        fun scheduledEc2TaskDefinitionOptions(scheduledEc2TaskDefinitionOptions: ScheduledEc2TaskDefinitionOptions) {
      cdkBuilder.scheduledEc2TaskDefinitionOptions(scheduledEc2TaskDefinitionOptions.let(ScheduledEc2TaskDefinitionOptions::unwrap))
    }

    /**
     * @param scheduledEc2TaskDefinitionOptions The properties to define if using an existing
     * TaskDefinition in this construct.
     * ScheduledEc2TaskDefinitionOptions or ScheduledEc2TaskImageOptions must be defined, but not
     * both.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("394df8e1c8ae483a0f581448b4a3cfe8abe46404868e089be0b61895833c7928")
    override
        fun scheduledEc2TaskDefinitionOptions(scheduledEc2TaskDefinitionOptions: ScheduledEc2TaskDefinitionOptions.Builder.() -> Unit):
        Unit =
        scheduledEc2TaskDefinitionOptions(ScheduledEc2TaskDefinitionOptions(scheduledEc2TaskDefinitionOptions))

    /**
     * @param scheduledEc2TaskImageOptions The properties to define if the construct is to create a
     * TaskDefinition.
     * ScheduledEc2TaskDefinitionOptions or ScheduledEc2TaskImageOptions must be defined, but not
     * both.
     */
    override
        fun scheduledEc2TaskImageOptions(scheduledEc2TaskImageOptions: ScheduledEc2TaskImageOptions) {
      cdkBuilder.scheduledEc2TaskImageOptions(scheduledEc2TaskImageOptions.let(ScheduledEc2TaskImageOptions::unwrap))
    }

    /**
     * @param scheduledEc2TaskImageOptions The properties to define if the construct is to create a
     * TaskDefinition.
     * ScheduledEc2TaskDefinitionOptions or ScheduledEc2TaskImageOptions must be defined, but not
     * both.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("31667dda61e845f0b3db35e0926c1b8d0b89885624a3af214315a493cbab1775")
    override
        fun scheduledEc2TaskImageOptions(scheduledEc2TaskImageOptions: ScheduledEc2TaskImageOptions.Builder.() -> Unit):
        Unit =
        scheduledEc2TaskImageOptions(ScheduledEc2TaskImageOptions(scheduledEc2TaskImageOptions))

    /**
     * @param securityGroups Existing security groups to use for your service.
     */
    override fun securityGroups(securityGroups: List<ISecurityGroup>) {
      cdkBuilder.securityGroups(securityGroups.map(ISecurityGroup::unwrap))
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
      cdkBuilder.subnetSelection(subnetSelection.let(SubnetSelection::unwrap))
    }

    /**
     * @param subnetSelection In what subnets to place the task's ENIs.
     * (Only applicable in case the TaskDefinition is configured for AwsVpc networking)
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("3866c2d7ab96f4b4e2c33b311458bc2a3823ce39c78dc68525fb5f321b885486")
    override fun subnetSelection(subnetSelection: SubnetSelection.Builder.() -> Unit): Unit =
        subnetSelection(SubnetSelection(subnetSelection))

    /**
     * @param tags The metadata that you apply to the task to help you categorize and organize them.
     * Each tag consists of a key and an optional value, both of which you define.
     */
    override fun tags(tags: List<Tag>) {
      cdkBuilder.tags(tags.map(Tag::unwrap))
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
      cdkBuilder.vpc(vpc.let(IVpc::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.ecs.patterns.ScheduledEc2TaskProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.ecs.patterns.ScheduledEc2TaskProps,
  ) : CdkObject(cdkObject), ScheduledEc2TaskProps {
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
     * The properties to define if using an existing TaskDefinition in this construct.
     *
     * ScheduledEc2TaskDefinitionOptions or ScheduledEc2TaskImageOptions must be defined, but not
     * both.
     *
     * Default: none
     */
    override fun scheduledEc2TaskDefinitionOptions(): ScheduledEc2TaskDefinitionOptions? =
        unwrap(this).getScheduledEc2TaskDefinitionOptions()?.let(ScheduledEc2TaskDefinitionOptions::wrap)

    /**
     * The properties to define if the construct is to create a TaskDefinition.
     *
     * ScheduledEc2TaskDefinitionOptions or ScheduledEc2TaskImageOptions must be defined, but not
     * both.
     *
     * Default: none
     */
    override fun scheduledEc2TaskImageOptions(): ScheduledEc2TaskImageOptions? =
        unwrap(this).getScheduledEc2TaskImageOptions()?.let(ScheduledEc2TaskImageOptions::wrap)

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
    public operator fun invoke(block: Builder.() -> Unit = {}): ScheduledEc2TaskProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.ecs.patterns.ScheduledEc2TaskProps):
        ScheduledEc2TaskProps = CdkObjectWrappers.wrap(cdkObject) as ScheduledEc2TaskProps

    internal fun unwrap(wrapped: ScheduledEc2TaskProps):
        software.amazon.awscdk.services.ecs.patterns.ScheduledEc2TaskProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.ecs.patterns.ScheduledEc2TaskProps
  }
}
