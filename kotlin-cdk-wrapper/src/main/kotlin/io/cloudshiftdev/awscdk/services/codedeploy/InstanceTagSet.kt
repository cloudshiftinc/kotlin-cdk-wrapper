@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.codedeploy

import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String
import kotlin.collections.List
import kotlin.collections.Map

/**
 * Represents a set of instance tag groups.
 *
 * An instance will match a set if it matches all of the groups in the set -
 * in other words, sets follow 'and' semantics.
 * You can have a maximum of 3 tag groups inside a set.
 *
 * Example:
 *
 * ```
 * import io.cloudshiftdev.awscdk.services.autoscaling.*;
 * import io.cloudshiftdev.awscdk.services.cloudwatch.*;
 * ServerApplication application;
 * AutoScalingGroup asg;
 * Alarm alarm;
 * ServerDeploymentGroup deploymentGroup = ServerDeploymentGroup.Builder.create(this,
 * "CodeDeployDeploymentGroup")
 * .application(application)
 * .deploymentGroupName("MyDeploymentGroup")
 * .autoScalingGroups(List.of(asg))
 * // adds User Data that installs the CodeDeploy agent on your auto-scaling groups hosts
 * // default: true
 * .installAgent(true)
 * // adds EC2 instances matching tags
 * .ec2InstanceTags(new InstanceTagSet(Map.of(
 * // any instance with tags satisfying
 * // key1=v1 or key1=v2 or key2 (any value) or value v3 (any key)
 * // will match this group
 * "key1", List.of("v1", "v2"),
 * "key2", List.of(),
 * "", List.of("v3"))))
 * // adds on-premise instances matching tags
 * .onPremiseInstanceTags(new InstanceTagSet(Map.of(
 * "key1", List.of("v1", "v2")), Map.of(
 * "key2", List.of("v3"))))
 * // CloudWatch alarms
 * .alarms(List.of(alarm))
 * // whether to ignore failure to fetch the status of alarms from CloudWatch
 * // default: false
 * .ignorePollAlarmsFailure(false)
 * // whether to skip the step of checking CloudWatch alarms during the deployment process
 * // default: false
 * .ignoreAlarmConfiguration(false)
 * // auto-rollback configuration
 * .autoRollback(AutoRollbackConfig.builder()
 * .failedDeployment(true) // default: true
 * .stoppedDeployment(true) // default: false
 * .deploymentInAlarm(true)
 * .build())
 * .build();
 * ```
 */
public open class InstanceTagSet(
  cdkObject: software.amazon.awscdk.services.codedeploy.InstanceTagSet,
) : CdkObject(cdkObject) {
  public constructor(instanceTagGroups: Map<String, List<String>>) :
      this(software.amazon.awscdk.services.codedeploy.InstanceTagSet(instanceTagGroups)
  )

  /**
   *
   */
  public open fun instanceTagGroups(): List<Map<String, List<String>>> =
      unwrap(this).getInstanceTagGroups()

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.codedeploy.InstanceTagSet):
        InstanceTagSet = InstanceTagSet(cdkObject)

    internal fun unwrap(wrapped: InstanceTagSet):
        software.amazon.awscdk.services.codedeploy.InstanceTagSet = wrapped.cdkObject as
        software.amazon.awscdk.services.codedeploy.InstanceTagSet
  }
}
