@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.ecs.patterns

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.dsl.services.ec2.SubnetSelectionDsl
import cloudshift.awscdk.dsl.services.events.targets.TagDsl
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.services.applicationautoscaling.Schedule
import software.amazon.awscdk.services.ec2.ISecurityGroup
import software.amazon.awscdk.services.ec2.IVpc
import software.amazon.awscdk.services.ec2.SubnetSelection
import software.amazon.awscdk.services.ecs.ICluster
import software.amazon.awscdk.services.ecs.PropagatedTagSource
import software.amazon.awscdk.services.ecs.patterns.ScheduledTaskBaseProps
import software.amazon.awscdk.services.events.targets.Tag

/**
 * The properties for the base ScheduledEc2Task or ScheduledFargateTask task.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.applicationautoscaling.*;
 * import software.amazon.awscdk.services.ec2.*;
 * import software.amazon.awscdk.services.ecs.*;
 * import software.amazon.awscdk.services.ecs.patterns.*;
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
@CdkDslMarker
public class ScheduledTaskBasePropsDsl {
  private val cdkBuilder: ScheduledTaskBaseProps.Builder = ScheduledTaskBaseProps.builder()

  private val _securityGroups: MutableList<ISecurityGroup> = mutableListOf()

  private val _tags: MutableList<Tag> = mutableListOf()

  /**
   * @param cluster The name of the cluster that hosts the service.
   * If a cluster is specified, the vpc construct should be omitted. Alternatively, you can omit
   * both cluster and vpc.
   */
  public fun cluster(cluster: ICluster) {
    cdkBuilder.cluster(cluster)
  }

  /**
   * @param desiredTaskCount The desired number of instantiations of the task definition to keep
   * running on the service.
   */
  public fun desiredTaskCount(desiredTaskCount: Number) {
    cdkBuilder.desiredTaskCount(desiredTaskCount)
  }

  /**
   * @param enabled Indicates whether the rule is enabled.
   */
  public fun enabled(enabled: Boolean) {
    cdkBuilder.enabled(enabled)
  }

  /**
   * @param propagateTags Specifies whether to propagate the tags from the task definition to the
   * task.
   * If no value is specified, the tags are not propagated.
   */
  public fun propagateTags(propagateTags: PropagatedTagSource) {
    cdkBuilder.propagateTags(propagateTags)
  }

  /**
   * @param ruleName A name for the rule.
   */
  public fun ruleName(ruleName: String) {
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
  public fun schedule(schedule: Schedule) {
    cdkBuilder.schedule(schedule)
  }

  /**
   * @param securityGroups Existing security groups to use for your service.
   */
  public fun securityGroups(vararg securityGroups: ISecurityGroup) {
    _securityGroups.addAll(listOf(*securityGroups))
  }

  /**
   * @param securityGroups Existing security groups to use for your service.
   */
  public fun securityGroups(securityGroups: Collection<ISecurityGroup>) {
    _securityGroups.addAll(securityGroups)
  }

  /**
   * @param subnetSelection In what subnets to place the task's ENIs.
   * (Only applicable in case the TaskDefinition is configured for AwsVpc networking)
   */
  public fun subnetSelection(subnetSelection: SubnetSelectionDsl.() -> Unit = {}) {
    val builder = SubnetSelectionDsl()
    builder.apply(subnetSelection)
    cdkBuilder.subnetSelection(builder.build())
  }

  /**
   * @param subnetSelection In what subnets to place the task's ENIs.
   * (Only applicable in case the TaskDefinition is configured for AwsVpc networking)
   */
  public fun subnetSelection(subnetSelection: SubnetSelection) {
    cdkBuilder.subnetSelection(subnetSelection)
  }

  /**
   * @param tags The metadata that you apply to the task to help you categorize and organize them.
   * Each tag consists of a key and an optional value, both of which you define.
   */
  public fun tags(tags: TagDsl.() -> Unit) {
    _tags.add(TagDsl().apply(tags).build())
  }

  /**
   * @param tags The metadata that you apply to the task to help you categorize and organize them.
   * Each tag consists of a key and an optional value, both of which you define.
   */
  public fun tags(tags: Collection<Tag>) {
    _tags.addAll(tags)
  }

  /**
   * @param vpc The VPC where the container instances will be launched or the elastic network
   * interfaces (ENIs) will be deployed.
   * If a vpc is specified, the cluster construct should be omitted. Alternatively, you can omit
   * both vpc and cluster.
   */
  public fun vpc(vpc: IVpc) {
    cdkBuilder.vpc(vpc)
  }

  public fun build(): ScheduledTaskBaseProps {
    if(_securityGroups.isNotEmpty()) cdkBuilder.securityGroups(_securityGroups)
    if(_tags.isNotEmpty()) cdkBuilder.tags(_tags)
    return cdkBuilder.build()
  }
}
