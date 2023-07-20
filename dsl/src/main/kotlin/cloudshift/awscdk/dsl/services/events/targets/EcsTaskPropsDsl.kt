@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.events.targets

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.dsl.services.ec2.SubnetSelectionDsl
import kotlin.Boolean
import kotlin.Number
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.Duration
import software.amazon.awscdk.services.ec2.ISecurityGroup
import software.amazon.awscdk.services.ec2.SubnetSelection
import software.amazon.awscdk.services.ecs.FargatePlatformVersion
import software.amazon.awscdk.services.ecs.ICluster
import software.amazon.awscdk.services.ecs.ITaskDefinition
import software.amazon.awscdk.services.ecs.PropagatedTagSource
import software.amazon.awscdk.services.events.targets.ContainerOverride
import software.amazon.awscdk.services.events.targets.EcsTaskProps
import software.amazon.awscdk.services.events.targets.Tag
import software.amazon.awscdk.services.iam.IRole
import software.amazon.awscdk.services.sqs.IQueue

@CdkDslMarker
public class EcsTaskPropsDsl {
  private val cdkBuilder: EcsTaskProps.Builder = EcsTaskProps.builder()

  private val _containerOverrides: MutableList<ContainerOverride> = mutableListOf()

  private val _securityGroups: MutableList<ISecurityGroup> = mutableListOf()

  private val _tags: MutableList<Tag> = mutableListOf()

  public fun assignPublicIp(assignPublicIp: Boolean) {
    cdkBuilder.assignPublicIp(assignPublicIp)
  }

  public fun cluster(cluster: ICluster) {
    cdkBuilder.cluster(cluster)
  }

  public fun containerOverrides(containerOverrides: ContainerOverrideDsl.() -> Unit) {
    _containerOverrides.add(ContainerOverrideDsl().apply(containerOverrides).build())
  }

  public fun containerOverrides(containerOverrides: Collection<ContainerOverride>) {
    _containerOverrides.addAll(containerOverrides)
  }

  public fun deadLetterQueue(deadLetterQueue: IQueue) {
    cdkBuilder.deadLetterQueue(deadLetterQueue)
  }

  public fun enableExecuteCommand(enableExecuteCommand: Boolean) {
    cdkBuilder.enableExecuteCommand(enableExecuteCommand)
  }

  public fun maxEventAge(maxEventAge: Duration) {
    cdkBuilder.maxEventAge(maxEventAge)
  }

  public fun platformVersion(platformVersion: FargatePlatformVersion) {
    cdkBuilder.platformVersion(platformVersion)
  }

  public fun propagateTags(propagateTags: PropagatedTagSource) {
    cdkBuilder.propagateTags(propagateTags)
  }

  public fun retryAttempts(retryAttempts: Number) {
    cdkBuilder.retryAttempts(retryAttempts)
  }

  public fun role(role: IRole) {
    cdkBuilder.role(role)
  }

  public fun securityGroups(vararg securityGroups: ISecurityGroup) {
    _securityGroups.addAll(listOf(*securityGroups))
  }

  public fun securityGroups(securityGroups: Collection<ISecurityGroup>) {
    _securityGroups.addAll(securityGroups)
  }

  public fun subnetSelection(block: SubnetSelectionDsl.() -> Unit = {}) {
    val builder = SubnetSelectionDsl()
    builder.apply(block)
    cdkBuilder.subnetSelection(builder.build())
  }

  public fun subnetSelection(subnetSelection: SubnetSelection) {
    cdkBuilder.subnetSelection(subnetSelection)
  }

  public fun tags(tags: TagDsl.() -> Unit) {
    _tags.add(TagDsl().apply(tags).build())
  }

  public fun tags(tags: Collection<Tag>) {
    _tags.addAll(tags)
  }

  public fun taskCount(taskCount: Number) {
    cdkBuilder.taskCount(taskCount)
  }

  public fun taskDefinition(taskDefinition: ITaskDefinition) {
    cdkBuilder.taskDefinition(taskDefinition)
  }

  public fun build(): EcsTaskProps {
    if(_containerOverrides.isNotEmpty()) cdkBuilder.containerOverrides(_containerOverrides)
    if(_securityGroups.isNotEmpty()) cdkBuilder.securityGroups(_securityGroups)
    if(_tags.isNotEmpty()) cdkBuilder.tags(_tags)
    return cdkBuilder.build()
  }
}
