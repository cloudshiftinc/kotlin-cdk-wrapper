@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ecs.patterns

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.services.applicationautoscaling.Schedule
import io.cloudshiftdev.awscdk.services.ec2.ISecurityGroup
import io.cloudshiftdev.awscdk.services.ec2.IVpc
import io.cloudshiftdev.awscdk.services.ec2.SubnetSelection
import io.cloudshiftdev.awscdk.services.ecs.Ec2TaskDefinition
import io.cloudshiftdev.awscdk.services.ecs.ICluster
import io.cloudshiftdev.awscdk.services.ecs.PropagatedTagSource
import io.cloudshiftdev.awscdk.services.events.targets.EcsTask
import io.cloudshiftdev.awscdk.services.events.targets.Tag
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * A scheduled EC2 task that will be initiated off of CloudWatch Events.
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
public open class ScheduledEc2Task internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.ecs.patterns.ScheduledEc2Task,
) : ScheduledTaskBase(cdkObject) {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: ScheduledEc2TaskProps,
  ) :
      this(software.amazon.awscdk.services.ecs.patterns.ScheduledEc2Task(scope.let(CloudshiftdevConstructsConstruct::unwrap),
      id, props.let(ScheduledEc2TaskProps::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: ScheduledEc2TaskProps.Builder.() -> Unit,
  ) : this(scope, id, ScheduledEc2TaskProps(props)
  )

  /**
   * The ECS task in this construct.
   */
  public open fun task(): EcsTask = unwrap(this).getTask().let(EcsTask::wrap)

  /**
   * The EC2 task definition in this construct.
   */
  public open fun taskDefinition(): Ec2TaskDefinition =
      unwrap(this).getTaskDefinition().let(Ec2TaskDefinition::wrap)

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.ecs.patterns.ScheduledEc2Task].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The name of the cluster that hosts the service.
     *
     * If a cluster is specified, the vpc construct should be omitted. Alternatively, you can omit
     * both cluster and vpc.
     *
     * Default: - create a new cluster; if both cluster and vpc are omitted, a new VPC will be
     * created for you.
     *
     * @param cluster The name of the cluster that hosts the service. 
     */
    public fun cluster(cluster: ICluster)

    /**
     * The desired number of instantiations of the task definition to keep running on the service.
     *
     * Default: 1
     *
     * @param desiredTaskCount The desired number of instantiations of the task definition to keep
     * running on the service. 
     */
    public fun desiredTaskCount(desiredTaskCount: Number)

    /**
     * Indicates whether the rule is enabled.
     *
     * Default: true
     *
     * @param enabled Indicates whether the rule is enabled. 
     */
    public fun enabled(enabled: Boolean)

    /**
     * Specifies whether to propagate the tags from the task definition to the task.
     *
     * If no value is specified, the tags are not propagated.
     *
     * Default: - Tags will not be propagated
     *
     * @param propagateTags Specifies whether to propagate the tags from the task definition to the
     * task. 
     */
    public fun propagateTags(propagateTags: PropagatedTagSource)

    /**
     * A name for the rule.
     *
     * Default: - AWS CloudFormation generates a unique physical ID and uses that ID
     * for the rule name. For more information, see [Name
     * Type](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-name.html).
     *
     * @param ruleName A name for the rule. 
     */
    public fun ruleName(ruleName: String)

    /**
     * The schedule or rate (frequency) that determines when CloudWatch Events runs the rule.
     *
     * For more information, see
     * [Schedule Expression Syntax for
     * Rules](https://docs.aws.amazon.com/AmazonCloudWatch/latest/events/ScheduledEvents.html)
     * in the Amazon CloudWatch User Guide.
     *
     * @param schedule The schedule or rate (frequency) that determines when CloudWatch Events runs
     * the rule. 
     */
    public fun schedule(schedule: Schedule)

    /**
     * The properties to define if using an existing TaskDefinition in this construct.
     *
     * ScheduledEc2TaskDefinitionOptions or ScheduledEc2TaskImageOptions must be defined, but not
     * both.
     *
     * Default: none
     *
     * @param scheduledEc2TaskDefinitionOptions The properties to define if using an existing
     * TaskDefinition in this construct. 
     */
    public
        fun scheduledEc2TaskDefinitionOptions(scheduledEc2TaskDefinitionOptions: ScheduledEc2TaskDefinitionOptions)

    /**
     * The properties to define if using an existing TaskDefinition in this construct.
     *
     * ScheduledEc2TaskDefinitionOptions or ScheduledEc2TaskImageOptions must be defined, but not
     * both.
     *
     * Default: none
     *
     * @param scheduledEc2TaskDefinitionOptions The properties to define if using an existing
     * TaskDefinition in this construct. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("19234eeeeaf7c92d99fae6056ff1bdc8334d09f4d97bc9e71c4afbb743f228c1")
    public
        fun scheduledEc2TaskDefinitionOptions(scheduledEc2TaskDefinitionOptions: ScheduledEc2TaskDefinitionOptions.Builder.() -> Unit)

    /**
     * The properties to define if the construct is to create a TaskDefinition.
     *
     * ScheduledEc2TaskDefinitionOptions or ScheduledEc2TaskImageOptions must be defined, but not
     * both.
     *
     * Default: none
     *
     * @param scheduledEc2TaskImageOptions The properties to define if the construct is to create a
     * TaskDefinition. 
     */
    public
        fun scheduledEc2TaskImageOptions(scheduledEc2TaskImageOptions: ScheduledEc2TaskImageOptions)

    /**
     * The properties to define if the construct is to create a TaskDefinition.
     *
     * ScheduledEc2TaskDefinitionOptions or ScheduledEc2TaskImageOptions must be defined, but not
     * both.
     *
     * Default: none
     *
     * @param scheduledEc2TaskImageOptions The properties to define if the construct is to create a
     * TaskDefinition. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("6797958a33bd73206192c65a1051a6979562a3f816de1fa50dd6a37376513cbf")
    public
        fun scheduledEc2TaskImageOptions(scheduledEc2TaskImageOptions: ScheduledEc2TaskImageOptions.Builder.() -> Unit)

    /**
     * Existing security groups to use for your service.
     *
     * Default: - a new security group will be created.
     *
     * @param securityGroups Existing security groups to use for your service. 
     */
    public fun securityGroups(securityGroups: List<ISecurityGroup>)

    /**
     * Existing security groups to use for your service.
     *
     * Default: - a new security group will be created.
     *
     * @param securityGroups Existing security groups to use for your service. 
     */
    public fun securityGroups(vararg securityGroups: ISecurityGroup)

    /**
     * In what subnets to place the task's ENIs.
     *
     * (Only applicable in case the TaskDefinition is configured for AwsVpc networking)
     *
     * Default: Private subnets
     *
     * @param subnetSelection In what subnets to place the task's ENIs. 
     */
    public fun subnetSelection(subnetSelection: SubnetSelection)

    /**
     * In what subnets to place the task's ENIs.
     *
     * (Only applicable in case the TaskDefinition is configured for AwsVpc networking)
     *
     * Default: Private subnets
     *
     * @param subnetSelection In what subnets to place the task's ENIs. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("a6c095d78f456ca3c66fb168570b1caef9e29f550f04efbedb8ac8ca8704675b")
    public fun subnetSelection(subnetSelection: SubnetSelection.Builder.() -> Unit)

    /**
     * The metadata that you apply to the task to help you categorize and organize them.
     *
     * Each tag consists of a key and an optional value, both of which you define.
     *
     * Default: - No tags are applied to the task
     *
     * @param tags The metadata that you apply to the task to help you categorize and organize them.
     * 
     */
    public fun tags(tags: List<Tag>)

    /**
     * The metadata that you apply to the task to help you categorize and organize them.
     *
     * Each tag consists of a key and an optional value, both of which you define.
     *
     * Default: - No tags are applied to the task
     *
     * @param tags The metadata that you apply to the task to help you categorize and organize them.
     * 
     */
    public fun tags(vararg tags: Tag)

    /**
     * The VPC where the container instances will be launched or the elastic network interfaces
     * (ENIs) will be deployed.
     *
     * If a vpc is specified, the cluster construct should be omitted. Alternatively, you can omit
     * both vpc and cluster.
     *
     * Default: - uses the VPC defined in the cluster or creates a new VPC.
     *
     * @param vpc The VPC where the container instances will be launched or the elastic network
     * interfaces (ENIs) will be deployed. 
     */
    public fun vpc(vpc: IVpc)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ecs.patterns.ScheduledEc2Task.Builder =
        software.amazon.awscdk.services.ecs.patterns.ScheduledEc2Task.Builder.create(scope, id)

    /**
     * The name of the cluster that hosts the service.
     *
     * If a cluster is specified, the vpc construct should be omitted. Alternatively, you can omit
     * both cluster and vpc.
     *
     * Default: - create a new cluster; if both cluster and vpc are omitted, a new VPC will be
     * created for you.
     *
     * @param cluster The name of the cluster that hosts the service. 
     */
    override fun cluster(cluster: ICluster) {
      cdkBuilder.cluster(cluster.let(ICluster::unwrap))
    }

    /**
     * The desired number of instantiations of the task definition to keep running on the service.
     *
     * Default: 1
     *
     * @param desiredTaskCount The desired number of instantiations of the task definition to keep
     * running on the service. 
     */
    override fun desiredTaskCount(desiredTaskCount: Number) {
      cdkBuilder.desiredTaskCount(desiredTaskCount)
    }

    /**
     * Indicates whether the rule is enabled.
     *
     * Default: true
     *
     * @param enabled Indicates whether the rule is enabled. 
     */
    override fun enabled(enabled: Boolean) {
      cdkBuilder.enabled(enabled)
    }

    /**
     * Specifies whether to propagate the tags from the task definition to the task.
     *
     * If no value is specified, the tags are not propagated.
     *
     * Default: - Tags will not be propagated
     *
     * @param propagateTags Specifies whether to propagate the tags from the task definition to the
     * task. 
     */
    override fun propagateTags(propagateTags: PropagatedTagSource) {
      cdkBuilder.propagateTags(propagateTags.let(PropagatedTagSource::unwrap))
    }

    /**
     * A name for the rule.
     *
     * Default: - AWS CloudFormation generates a unique physical ID and uses that ID
     * for the rule name. For more information, see [Name
     * Type](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-name.html).
     *
     * @param ruleName A name for the rule. 
     */
    override fun ruleName(ruleName: String) {
      cdkBuilder.ruleName(ruleName)
    }

    /**
     * The schedule or rate (frequency) that determines when CloudWatch Events runs the rule.
     *
     * For more information, see
     * [Schedule Expression Syntax for
     * Rules](https://docs.aws.amazon.com/AmazonCloudWatch/latest/events/ScheduledEvents.html)
     * in the Amazon CloudWatch User Guide.
     *
     * @param schedule The schedule or rate (frequency) that determines when CloudWatch Events runs
     * the rule. 
     */
    override fun schedule(schedule: Schedule) {
      cdkBuilder.schedule(schedule.let(Schedule::unwrap))
    }

    /**
     * The properties to define if using an existing TaskDefinition in this construct.
     *
     * ScheduledEc2TaskDefinitionOptions or ScheduledEc2TaskImageOptions must be defined, but not
     * both.
     *
     * Default: none
     *
     * @param scheduledEc2TaskDefinitionOptions The properties to define if using an existing
     * TaskDefinition in this construct. 
     */
    override
        fun scheduledEc2TaskDefinitionOptions(scheduledEc2TaskDefinitionOptions: ScheduledEc2TaskDefinitionOptions) {
      cdkBuilder.scheduledEc2TaskDefinitionOptions(scheduledEc2TaskDefinitionOptions.let(ScheduledEc2TaskDefinitionOptions::unwrap))
    }

    /**
     * The properties to define if using an existing TaskDefinition in this construct.
     *
     * ScheduledEc2TaskDefinitionOptions or ScheduledEc2TaskImageOptions must be defined, but not
     * both.
     *
     * Default: none
     *
     * @param scheduledEc2TaskDefinitionOptions The properties to define if using an existing
     * TaskDefinition in this construct. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("19234eeeeaf7c92d99fae6056ff1bdc8334d09f4d97bc9e71c4afbb743f228c1")
    override
        fun scheduledEc2TaskDefinitionOptions(scheduledEc2TaskDefinitionOptions: ScheduledEc2TaskDefinitionOptions.Builder.() -> Unit):
        Unit =
        scheduledEc2TaskDefinitionOptions(ScheduledEc2TaskDefinitionOptions(scheduledEc2TaskDefinitionOptions))

    /**
     * The properties to define if the construct is to create a TaskDefinition.
     *
     * ScheduledEc2TaskDefinitionOptions or ScheduledEc2TaskImageOptions must be defined, but not
     * both.
     *
     * Default: none
     *
     * @param scheduledEc2TaskImageOptions The properties to define if the construct is to create a
     * TaskDefinition. 
     */
    override
        fun scheduledEc2TaskImageOptions(scheduledEc2TaskImageOptions: ScheduledEc2TaskImageOptions) {
      cdkBuilder.scheduledEc2TaskImageOptions(scheduledEc2TaskImageOptions.let(ScheduledEc2TaskImageOptions::unwrap))
    }

    /**
     * The properties to define if the construct is to create a TaskDefinition.
     *
     * ScheduledEc2TaskDefinitionOptions or ScheduledEc2TaskImageOptions must be defined, but not
     * both.
     *
     * Default: none
     *
     * @param scheduledEc2TaskImageOptions The properties to define if the construct is to create a
     * TaskDefinition. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("6797958a33bd73206192c65a1051a6979562a3f816de1fa50dd6a37376513cbf")
    override
        fun scheduledEc2TaskImageOptions(scheduledEc2TaskImageOptions: ScheduledEc2TaskImageOptions.Builder.() -> Unit):
        Unit =
        scheduledEc2TaskImageOptions(ScheduledEc2TaskImageOptions(scheduledEc2TaskImageOptions))

    /**
     * Existing security groups to use for your service.
     *
     * Default: - a new security group will be created.
     *
     * @param securityGroups Existing security groups to use for your service. 
     */
    override fun securityGroups(securityGroups: List<ISecurityGroup>) {
      cdkBuilder.securityGroups(securityGroups.map(ISecurityGroup::unwrap))
    }

    /**
     * Existing security groups to use for your service.
     *
     * Default: - a new security group will be created.
     *
     * @param securityGroups Existing security groups to use for your service. 
     */
    override fun securityGroups(vararg securityGroups: ISecurityGroup): Unit =
        securityGroups(securityGroups.toList())

    /**
     * In what subnets to place the task's ENIs.
     *
     * (Only applicable in case the TaskDefinition is configured for AwsVpc networking)
     *
     * Default: Private subnets
     *
     * @param subnetSelection In what subnets to place the task's ENIs. 
     */
    override fun subnetSelection(subnetSelection: SubnetSelection) {
      cdkBuilder.subnetSelection(subnetSelection.let(SubnetSelection::unwrap))
    }

    /**
     * In what subnets to place the task's ENIs.
     *
     * (Only applicable in case the TaskDefinition is configured for AwsVpc networking)
     *
     * Default: Private subnets
     *
     * @param subnetSelection In what subnets to place the task's ENIs. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("a6c095d78f456ca3c66fb168570b1caef9e29f550f04efbedb8ac8ca8704675b")
    override fun subnetSelection(subnetSelection: SubnetSelection.Builder.() -> Unit): Unit =
        subnetSelection(SubnetSelection(subnetSelection))

    /**
     * The metadata that you apply to the task to help you categorize and organize them.
     *
     * Each tag consists of a key and an optional value, both of which you define.
     *
     * Default: - No tags are applied to the task
     *
     * @param tags The metadata that you apply to the task to help you categorize and organize them.
     * 
     */
    override fun tags(tags: List<Tag>) {
      cdkBuilder.tags(tags.map(Tag::unwrap))
    }

    /**
     * The metadata that you apply to the task to help you categorize and organize them.
     *
     * Each tag consists of a key and an optional value, both of which you define.
     *
     * Default: - No tags are applied to the task
     *
     * @param tags The metadata that you apply to the task to help you categorize and organize them.
     * 
     */
    override fun tags(vararg tags: Tag): Unit = tags(tags.toList())

    /**
     * The VPC where the container instances will be launched or the elastic network interfaces
     * (ENIs) will be deployed.
     *
     * If a vpc is specified, the cluster construct should be omitted. Alternatively, you can omit
     * both vpc and cluster.
     *
     * Default: - uses the VPC defined in the cluster or creates a new VPC.
     *
     * @param vpc The VPC where the container instances will be launched or the elastic network
     * interfaces (ENIs) will be deployed. 
     */
    override fun vpc(vpc: IVpc) {
      cdkBuilder.vpc(vpc.let(IVpc::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.ecs.patterns.ScheduledEc2Task =
        cdkBuilder.build()
  }

  public companion object {
    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): ScheduledEc2Task {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return ScheduledEc2Task(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ecs.patterns.ScheduledEc2Task):
        ScheduledEc2Task = ScheduledEc2Task(cdkObject)

    internal fun unwrap(wrapped: ScheduledEc2Task):
        software.amazon.awscdk.services.ecs.patterns.ScheduledEc2Task = wrapped.cdkObject
  }
}
