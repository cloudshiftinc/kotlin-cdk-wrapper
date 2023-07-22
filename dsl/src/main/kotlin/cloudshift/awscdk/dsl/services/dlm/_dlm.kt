@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.dlm

import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.dlm.CfnLifecyclePolicy
import software.amazon.awscdk.services.dlm.CfnLifecyclePolicyProps
import software.constructs.Construct

public object dlm {
  /**
   * Specifies a lifecycle policy, which is used to automate operations on Amazon EBS resources.
   *
   * The properties are required when you add a lifecycle policy and optional when you update a
   * lifecycle policy.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.dlm.*;
   * CfnLifecyclePolicy cfnLifecyclePolicy = CfnLifecyclePolicy.Builder.create(this,
   * "MyCfnLifecyclePolicy")
   * .description("description")
   * .executionRoleArn("executionRoleArn")
   * .policyDetails(PolicyDetailsProperty.builder()
   * .actions(List.of(ActionProperty.builder()
   * .crossRegionCopy(List.of(CrossRegionCopyActionProperty.builder()
   * .encryptionConfiguration(EncryptionConfigurationProperty.builder()
   * .encrypted(false)
   * // the properties below are optional
   * .cmkArn("cmkArn")
   * .build())
   * .target("target")
   * // the properties below are optional
   * .retainRule(CrossRegionCopyRetainRuleProperty.builder()
   * .interval(123)
   * .intervalUnit("intervalUnit")
   * .build())
   * .build()))
   * .name("name")
   * .build()))
   * .eventSource(EventSourceProperty.builder()
   * .type("type")
   * // the properties below are optional
   * .parameters(EventParametersProperty.builder()
   * .eventType("eventType")
   * .snapshotOwner(List.of("snapshotOwner"))
   * // the properties below are optional
   * .descriptionRegex("descriptionRegex")
   * .build())
   * .build())
   * .parameters(ParametersProperty.builder()
   * .excludeBootVolume(false)
   * .excludeDataVolumeTags(List.of(CfnTag.builder()
   * .key("key")
   * .value("value")
   * .build()))
   * .noReboot(false)
   * .build())
   * .policyType("policyType")
   * .resourceLocations(List.of("resourceLocations"))
   * .resourceTypes(List.of("resourceTypes"))
   * .schedules(List.of(ScheduleProperty.builder()
   * .archiveRule(ArchiveRuleProperty.builder()
   * .retainRule(ArchiveRetainRuleProperty.builder()
   * .retentionArchiveTier(RetentionArchiveTierProperty.builder()
   * .count(123)
   * .interval(123)
   * .intervalUnit("intervalUnit")
   * .build())
   * .build())
   * .build())
   * .copyTags(false)
   * .createRule(CreateRuleProperty.builder()
   * .cronExpression("cronExpression")
   * .interval(123)
   * .intervalUnit("intervalUnit")
   * .location("location")
   * .times(List.of("times"))
   * .build())
   * .crossRegionCopyRules(List.of(CrossRegionCopyRuleProperty.builder()
   * .encrypted(false)
   * // the properties below are optional
   * .cmkArn("cmkArn")
   * .copyTags(false)
   * .deprecateRule(CrossRegionCopyDeprecateRuleProperty.builder()
   * .interval(123)
   * .intervalUnit("intervalUnit")
   * .build())
   * .retainRule(CrossRegionCopyRetainRuleProperty.builder()
   * .interval(123)
   * .intervalUnit("intervalUnit")
   * .build())
   * .target("target")
   * .targetRegion("targetRegion")
   * .build()))
   * .deprecateRule(DeprecateRuleProperty.builder()
   * .count(123)
   * .interval(123)
   * .intervalUnit("intervalUnit")
   * .build())
   * .fastRestoreRule(FastRestoreRuleProperty.builder()
   * .availabilityZones(List.of("availabilityZones"))
   * .count(123)
   * .interval(123)
   * .intervalUnit("intervalUnit")
   * .build())
   * .name("name")
   * .retainRule(RetainRuleProperty.builder()
   * .count(123)
   * .interval(123)
   * .intervalUnit("intervalUnit")
   * .build())
   * .shareRules(List.of(ShareRuleProperty.builder()
   * .targetAccounts(List.of("targetAccounts"))
   * .unshareInterval(123)
   * .unshareIntervalUnit("unshareIntervalUnit")
   * .build()))
   * .tagsToAdd(List.of(CfnTag.builder()
   * .key("key")
   * .value("value")
   * .build()))
   * .variableTags(List.of(CfnTag.builder()
   * .key("key")
   * .value("value")
   * .build()))
   * .build()))
   * .targetTags(List.of(CfnTag.builder()
   * .key("key")
   * .value("value")
   * .build()))
   * .build())
   * .state("state")
   * .tags(List.of(CfnTag.builder()
   * .key("key")
   * .value("value")
   * .build()))
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dlm-lifecyclepolicy.html)
   */
  public inline fun cfnLifecyclePolicy(
    scope: Construct,
    id: String,
    block: CfnLifecyclePolicyDsl.() -> Unit = {},
  ): CfnLifecyclePolicy {
    val builder = CfnLifecyclePolicyDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  /**
   * *[Event-based policies only]* Specifies an action for an event-based policy.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.dlm.*;
   * ActionProperty actionProperty = ActionProperty.builder()
   * .crossRegionCopy(List.of(CrossRegionCopyActionProperty.builder()
   * .encryptionConfiguration(EncryptionConfigurationProperty.builder()
   * .encrypted(false)
   * // the properties below are optional
   * .cmkArn("cmkArn")
   * .build())
   * .target("target")
   * // the properties below are optional
   * .retainRule(CrossRegionCopyRetainRuleProperty.builder()
   * .interval(123)
   * .intervalUnit("intervalUnit")
   * .build())
   * .build()))
   * .name("name")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dlm-lifecyclepolicy-action.html)
   */
  public inline
      fun cfnLifecyclePolicyActionProperty(block: CfnLifecyclePolicyActionPropertyDsl.() -> Unit =
      {}): CfnLifecyclePolicy.ActionProperty {
    val builder = CfnLifecyclePolicyActionPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.dlm.*;
   * ArchiveRetainRuleProperty archiveRetainRuleProperty = ArchiveRetainRuleProperty.builder()
   * .retentionArchiveTier(RetentionArchiveTierProperty.builder()
   * .count(123)
   * .interval(123)
   * .intervalUnit("intervalUnit")
   * .build())
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dlm-lifecyclepolicy-archiveretainrule.html)
   */
  public inline
      fun cfnLifecyclePolicyArchiveRetainRuleProperty(block: CfnLifecyclePolicyArchiveRetainRulePropertyDsl.() -> Unit
      = {}): CfnLifecyclePolicy.ArchiveRetainRuleProperty {
    val builder = CfnLifecyclePolicyArchiveRetainRulePropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.dlm.*;
   * ArchiveRuleProperty archiveRuleProperty = ArchiveRuleProperty.builder()
   * .retainRule(ArchiveRetainRuleProperty.builder()
   * .retentionArchiveTier(RetentionArchiveTierProperty.builder()
   * .count(123)
   * .interval(123)
   * .intervalUnit("intervalUnit")
   * .build())
   * .build())
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dlm-lifecyclepolicy-archiverule.html)
   */
  public inline
      fun cfnLifecyclePolicyArchiveRuleProperty(block: CfnLifecyclePolicyArchiveRulePropertyDsl.() -> Unit
      = {}): CfnLifecyclePolicy.ArchiveRuleProperty {
    val builder = CfnLifecyclePolicyArchiveRulePropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * *[Snapshot and AMI policies only]* Specifies when the policy should create snapshots or AMIs.
   *
   *
   * * You must specify either *CronExpression* , or *Interval* , *IntervalUnit* , and *Times* .
   * * If you need to specify an `ArchiveRule` for the schedule, then you must specify a creation
   * frequency of at least 28 days.
   *
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.dlm.*;
   * CreateRuleProperty createRuleProperty = CreateRuleProperty.builder()
   * .cronExpression("cronExpression")
   * .interval(123)
   * .intervalUnit("intervalUnit")
   * .location("location")
   * .times(List.of("times"))
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dlm-lifecyclepolicy-createrule.html)
   */
  public inline
      fun cfnLifecyclePolicyCreateRuleProperty(block: CfnLifecyclePolicyCreateRulePropertyDsl.() -> Unit
      = {}): CfnLifecyclePolicy.CreateRuleProperty {
    val builder = CfnLifecyclePolicyCreateRulePropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * *[Event-based policies only]* Specifies a cross-Region copy action for event-based policies.
   *
   *
   * To specify a cross-Region copy rule for snapshot and AMI policies, use `CrossRegionCopyRule` .
   *
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.dlm.*;
   * CrossRegionCopyActionProperty crossRegionCopyActionProperty =
   * CrossRegionCopyActionProperty.builder()
   * .encryptionConfiguration(EncryptionConfigurationProperty.builder()
   * .encrypted(false)
   * // the properties below are optional
   * .cmkArn("cmkArn")
   * .build())
   * .target("target")
   * // the properties below are optional
   * .retainRule(CrossRegionCopyRetainRuleProperty.builder()
   * .interval(123)
   * .intervalUnit("intervalUnit")
   * .build())
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dlm-lifecyclepolicy-crossregioncopyaction.html)
   */
  public inline
      fun cfnLifecyclePolicyCrossRegionCopyActionProperty(block: CfnLifecyclePolicyCrossRegionCopyActionPropertyDsl.() -> Unit
      = {}): CfnLifecyclePolicy.CrossRegionCopyActionProperty {
    val builder = CfnLifecyclePolicyCrossRegionCopyActionPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.dlm.*;
   * CrossRegionCopyDeprecateRuleProperty crossRegionCopyDeprecateRuleProperty =
   * CrossRegionCopyDeprecateRuleProperty.builder()
   * .interval(123)
   * .intervalUnit("intervalUnit")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dlm-lifecyclepolicy-crossregioncopydeprecaterule.html)
   */
  public inline
      fun cfnLifecyclePolicyCrossRegionCopyDeprecateRuleProperty(block: CfnLifecyclePolicyCrossRegionCopyDeprecateRulePropertyDsl.() -> Unit
      = {}): CfnLifecyclePolicy.CrossRegionCopyDeprecateRuleProperty {
    val builder = CfnLifecyclePolicyCrossRegionCopyDeprecateRulePropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * Specifies a retention rule for cross-Region snapshot copies created by snapshot or event-based
   * policies, or cross-Region AMI copies created by AMI policies.
   *
   * After the retention period expires, the cross-Region copy is deleted.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.dlm.*;
   * CrossRegionCopyRetainRuleProperty crossRegionCopyRetainRuleProperty =
   * CrossRegionCopyRetainRuleProperty.builder()
   * .interval(123)
   * .intervalUnit("intervalUnit")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dlm-lifecyclepolicy-crossregioncopyretainrule.html)
   */
  public inline
      fun cfnLifecyclePolicyCrossRegionCopyRetainRuleProperty(block: CfnLifecyclePolicyCrossRegionCopyRetainRulePropertyDsl.() -> Unit
      = {}): CfnLifecyclePolicy.CrossRegionCopyRetainRuleProperty {
    val builder = CfnLifecyclePolicyCrossRegionCopyRetainRulePropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * *[Snapshot and AMI policies only]* Specifies a cross-Region copy rule for snapshot and AMI
   * policies.
   *
   *
   * To specify a cross-Region copy action for event-based polices, use `CrossRegionCopyAction` .
   *
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.dlm.*;
   * CrossRegionCopyRuleProperty crossRegionCopyRuleProperty = CrossRegionCopyRuleProperty.builder()
   * .encrypted(false)
   * // the properties below are optional
   * .cmkArn("cmkArn")
   * .copyTags(false)
   * .deprecateRule(CrossRegionCopyDeprecateRuleProperty.builder()
   * .interval(123)
   * .intervalUnit("intervalUnit")
   * .build())
   * .retainRule(CrossRegionCopyRetainRuleProperty.builder()
   * .interval(123)
   * .intervalUnit("intervalUnit")
   * .build())
   * .target("target")
   * .targetRegion("targetRegion")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dlm-lifecyclepolicy-crossregioncopyrule.html)
   */
  public inline
      fun cfnLifecyclePolicyCrossRegionCopyRuleProperty(block: CfnLifecyclePolicyCrossRegionCopyRulePropertyDsl.() -> Unit
      = {}): CfnLifecyclePolicy.CrossRegionCopyRuleProperty {
    val builder = CfnLifecyclePolicyCrossRegionCopyRulePropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.dlm.*;
   * DeprecateRuleProperty deprecateRuleProperty = DeprecateRuleProperty.builder()
   * .count(123)
   * .interval(123)
   * .intervalUnit("intervalUnit")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dlm-lifecyclepolicy-deprecaterule.html)
   */
  public inline
      fun cfnLifecyclePolicyDeprecateRuleProperty(block: CfnLifecyclePolicyDeprecateRulePropertyDsl.() -> Unit
      = {}): CfnLifecyclePolicy.DeprecateRuleProperty {
    val builder = CfnLifecyclePolicyDeprecateRulePropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * *[Event-based policies only]* Specifies the encryption settings for cross-Region snapshot
   * copies created by event-based policies.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.dlm.*;
   * EncryptionConfigurationProperty encryptionConfigurationProperty =
   * EncryptionConfigurationProperty.builder()
   * .encrypted(false)
   * // the properties below are optional
   * .cmkArn("cmkArn")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dlm-lifecyclepolicy-encryptionconfiguration.html)
   */
  public inline
      fun cfnLifecyclePolicyEncryptionConfigurationProperty(block: CfnLifecyclePolicyEncryptionConfigurationPropertyDsl.() -> Unit
      = {}): CfnLifecyclePolicy.EncryptionConfigurationProperty {
    val builder = CfnLifecyclePolicyEncryptionConfigurationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * *[Event-based policies only]* Specifies an event that activates an event-based policy.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.dlm.*;
   * EventParametersProperty eventParametersProperty = EventParametersProperty.builder()
   * .eventType("eventType")
   * .snapshotOwner(List.of("snapshotOwner"))
   * // the properties below are optional
   * .descriptionRegex("descriptionRegex")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dlm-lifecyclepolicy-eventparameters.html)
   */
  public inline
      fun cfnLifecyclePolicyEventParametersProperty(block: CfnLifecyclePolicyEventParametersPropertyDsl.() -> Unit
      = {}): CfnLifecyclePolicy.EventParametersProperty {
    val builder = CfnLifecyclePolicyEventParametersPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * *[Event-based policies only]* Specifies an event that activates an event-based policy.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.dlm.*;
   * EventSourceProperty eventSourceProperty = EventSourceProperty.builder()
   * .type("type")
   * // the properties below are optional
   * .parameters(EventParametersProperty.builder()
   * .eventType("eventType")
   * .snapshotOwner(List.of("snapshotOwner"))
   * // the properties below are optional
   * .descriptionRegex("descriptionRegex")
   * .build())
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dlm-lifecyclepolicy-eventsource.html)
   */
  public inline
      fun cfnLifecyclePolicyEventSourceProperty(block: CfnLifecyclePolicyEventSourcePropertyDsl.() -> Unit
      = {}): CfnLifecyclePolicy.EventSourceProperty {
    val builder = CfnLifecyclePolicyEventSourcePropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * *[Snapshot policies only]* Specifies a rule for enabling fast snapshot restore for snapshots
   * created by snapshot policies.
   *
   * You can enable fast snapshot restore based on either a count or a time interval.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.dlm.*;
   * FastRestoreRuleProperty fastRestoreRuleProperty = FastRestoreRuleProperty.builder()
   * .availabilityZones(List.of("availabilityZones"))
   * .count(123)
   * .interval(123)
   * .intervalUnit("intervalUnit")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dlm-lifecyclepolicy-fastrestorerule.html)
   */
  public inline
      fun cfnLifecyclePolicyFastRestoreRuleProperty(block: CfnLifecyclePolicyFastRestoreRulePropertyDsl.() -> Unit
      = {}): CfnLifecyclePolicy.FastRestoreRuleProperty {
    val builder = CfnLifecyclePolicyFastRestoreRulePropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * *[Snapshot and AMI policies only]* Specifies optional parameters for snapshot and AMI policies.
   *
   * The set of valid parameters depends on the combination of policy type and target resource type.
   *
   * If you choose to exclude boot volumes and you specify tags that consequently exclude all of the
   * additional data volumes attached to an instance, then Amazon Data Lifecycle Manager will not
   * create any snapshots for the affected instance, and it will emit a `SnapshotsCreateFailed` Amazon
   * CloudWatch metric. For more information, see [Monitor your policies using Amazon
   * CloudWatch](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/monitor-dlm-cw-metrics.html) .
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.dlm.*;
   * ParametersProperty parametersProperty = ParametersProperty.builder()
   * .excludeBootVolume(false)
   * .excludeDataVolumeTags(List.of(CfnTag.builder()
   * .key("key")
   * .value("value")
   * .build()))
   * .noReboot(false)
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dlm-lifecyclepolicy-parameters.html)
   */
  public inline
      fun cfnLifecyclePolicyParametersProperty(block: CfnLifecyclePolicyParametersPropertyDsl.() -> Unit
      = {}): CfnLifecyclePolicy.ParametersProperty {
    val builder = CfnLifecyclePolicyParametersPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * *[All policy types]* Specifies the configuration of a lifecycle policy.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.dlm.*;
   * PolicyDetailsProperty policyDetailsProperty = PolicyDetailsProperty.builder()
   * .actions(List.of(ActionProperty.builder()
   * .crossRegionCopy(List.of(CrossRegionCopyActionProperty.builder()
   * .encryptionConfiguration(EncryptionConfigurationProperty.builder()
   * .encrypted(false)
   * // the properties below are optional
   * .cmkArn("cmkArn")
   * .build())
   * .target("target")
   * // the properties below are optional
   * .retainRule(CrossRegionCopyRetainRuleProperty.builder()
   * .interval(123)
   * .intervalUnit("intervalUnit")
   * .build())
   * .build()))
   * .name("name")
   * .build()))
   * .eventSource(EventSourceProperty.builder()
   * .type("type")
   * // the properties below are optional
   * .parameters(EventParametersProperty.builder()
   * .eventType("eventType")
   * .snapshotOwner(List.of("snapshotOwner"))
   * // the properties below are optional
   * .descriptionRegex("descriptionRegex")
   * .build())
   * .build())
   * .parameters(ParametersProperty.builder()
   * .excludeBootVolume(false)
   * .excludeDataVolumeTags(List.of(CfnTag.builder()
   * .key("key")
   * .value("value")
   * .build()))
   * .noReboot(false)
   * .build())
   * .policyType("policyType")
   * .resourceLocations(List.of("resourceLocations"))
   * .resourceTypes(List.of("resourceTypes"))
   * .schedules(List.of(ScheduleProperty.builder()
   * .archiveRule(ArchiveRuleProperty.builder()
   * .retainRule(ArchiveRetainRuleProperty.builder()
   * .retentionArchiveTier(RetentionArchiveTierProperty.builder()
   * .count(123)
   * .interval(123)
   * .intervalUnit("intervalUnit")
   * .build())
   * .build())
   * .build())
   * .copyTags(false)
   * .createRule(CreateRuleProperty.builder()
   * .cronExpression("cronExpression")
   * .interval(123)
   * .intervalUnit("intervalUnit")
   * .location("location")
   * .times(List.of("times"))
   * .build())
   * .crossRegionCopyRules(List.of(CrossRegionCopyRuleProperty.builder()
   * .encrypted(false)
   * // the properties below are optional
   * .cmkArn("cmkArn")
   * .copyTags(false)
   * .deprecateRule(CrossRegionCopyDeprecateRuleProperty.builder()
   * .interval(123)
   * .intervalUnit("intervalUnit")
   * .build())
   * .retainRule(CrossRegionCopyRetainRuleProperty.builder()
   * .interval(123)
   * .intervalUnit("intervalUnit")
   * .build())
   * .target("target")
   * .targetRegion("targetRegion")
   * .build()))
   * .deprecateRule(DeprecateRuleProperty.builder()
   * .count(123)
   * .interval(123)
   * .intervalUnit("intervalUnit")
   * .build())
   * .fastRestoreRule(FastRestoreRuleProperty.builder()
   * .availabilityZones(List.of("availabilityZones"))
   * .count(123)
   * .interval(123)
   * .intervalUnit("intervalUnit")
   * .build())
   * .name("name")
   * .retainRule(RetainRuleProperty.builder()
   * .count(123)
   * .interval(123)
   * .intervalUnit("intervalUnit")
   * .build())
   * .shareRules(List.of(ShareRuleProperty.builder()
   * .targetAccounts(List.of("targetAccounts"))
   * .unshareInterval(123)
   * .unshareIntervalUnit("unshareIntervalUnit")
   * .build()))
   * .tagsToAdd(List.of(CfnTag.builder()
   * .key("key")
   * .value("value")
   * .build()))
   * .variableTags(List.of(CfnTag.builder()
   * .key("key")
   * .value("value")
   * .build()))
   * .build()))
   * .targetTags(List.of(CfnTag.builder()
   * .key("key")
   * .value("value")
   * .build()))
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dlm-lifecyclepolicy-policydetails.html)
   */
  public inline
      fun cfnLifecyclePolicyPolicyDetailsProperty(block: CfnLifecyclePolicyPolicyDetailsPropertyDsl.() -> Unit
      = {}): CfnLifecyclePolicy.PolicyDetailsProperty {
    val builder = CfnLifecyclePolicyPolicyDetailsPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * Properties for defining a `CfnLifecyclePolicy`.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.dlm.*;
   * CfnLifecyclePolicyProps cfnLifecyclePolicyProps = CfnLifecyclePolicyProps.builder()
   * .description("description")
   * .executionRoleArn("executionRoleArn")
   * .policyDetails(PolicyDetailsProperty.builder()
   * .actions(List.of(ActionProperty.builder()
   * .crossRegionCopy(List.of(CrossRegionCopyActionProperty.builder()
   * .encryptionConfiguration(EncryptionConfigurationProperty.builder()
   * .encrypted(false)
   * // the properties below are optional
   * .cmkArn("cmkArn")
   * .build())
   * .target("target")
   * // the properties below are optional
   * .retainRule(CrossRegionCopyRetainRuleProperty.builder()
   * .interval(123)
   * .intervalUnit("intervalUnit")
   * .build())
   * .build()))
   * .name("name")
   * .build()))
   * .eventSource(EventSourceProperty.builder()
   * .type("type")
   * // the properties below are optional
   * .parameters(EventParametersProperty.builder()
   * .eventType("eventType")
   * .snapshotOwner(List.of("snapshotOwner"))
   * // the properties below are optional
   * .descriptionRegex("descriptionRegex")
   * .build())
   * .build())
   * .parameters(ParametersProperty.builder()
   * .excludeBootVolume(false)
   * .excludeDataVolumeTags(List.of(CfnTag.builder()
   * .key("key")
   * .value("value")
   * .build()))
   * .noReboot(false)
   * .build())
   * .policyType("policyType")
   * .resourceLocations(List.of("resourceLocations"))
   * .resourceTypes(List.of("resourceTypes"))
   * .schedules(List.of(ScheduleProperty.builder()
   * .archiveRule(ArchiveRuleProperty.builder()
   * .retainRule(ArchiveRetainRuleProperty.builder()
   * .retentionArchiveTier(RetentionArchiveTierProperty.builder()
   * .count(123)
   * .interval(123)
   * .intervalUnit("intervalUnit")
   * .build())
   * .build())
   * .build())
   * .copyTags(false)
   * .createRule(CreateRuleProperty.builder()
   * .cronExpression("cronExpression")
   * .interval(123)
   * .intervalUnit("intervalUnit")
   * .location("location")
   * .times(List.of("times"))
   * .build())
   * .crossRegionCopyRules(List.of(CrossRegionCopyRuleProperty.builder()
   * .encrypted(false)
   * // the properties below are optional
   * .cmkArn("cmkArn")
   * .copyTags(false)
   * .deprecateRule(CrossRegionCopyDeprecateRuleProperty.builder()
   * .interval(123)
   * .intervalUnit("intervalUnit")
   * .build())
   * .retainRule(CrossRegionCopyRetainRuleProperty.builder()
   * .interval(123)
   * .intervalUnit("intervalUnit")
   * .build())
   * .target("target")
   * .targetRegion("targetRegion")
   * .build()))
   * .deprecateRule(DeprecateRuleProperty.builder()
   * .count(123)
   * .interval(123)
   * .intervalUnit("intervalUnit")
   * .build())
   * .fastRestoreRule(FastRestoreRuleProperty.builder()
   * .availabilityZones(List.of("availabilityZones"))
   * .count(123)
   * .interval(123)
   * .intervalUnit("intervalUnit")
   * .build())
   * .name("name")
   * .retainRule(RetainRuleProperty.builder()
   * .count(123)
   * .interval(123)
   * .intervalUnit("intervalUnit")
   * .build())
   * .shareRules(List.of(ShareRuleProperty.builder()
   * .targetAccounts(List.of("targetAccounts"))
   * .unshareInterval(123)
   * .unshareIntervalUnit("unshareIntervalUnit")
   * .build()))
   * .tagsToAdd(List.of(CfnTag.builder()
   * .key("key")
   * .value("value")
   * .build()))
   * .variableTags(List.of(CfnTag.builder()
   * .key("key")
   * .value("value")
   * .build()))
   * .build()))
   * .targetTags(List.of(CfnTag.builder()
   * .key("key")
   * .value("value")
   * .build()))
   * .build())
   * .state("state")
   * .tags(List.of(CfnTag.builder()
   * .key("key")
   * .value("value")
   * .build()))
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dlm-lifecyclepolicy.html)
   */
  public inline fun cfnLifecyclePolicyProps(block: CfnLifecyclePolicyPropsDsl.() -> Unit = {}):
      CfnLifecyclePolicyProps {
    val builder = CfnLifecyclePolicyPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * *[Snapshot and AMI policies only]* Specifies a retention rule for snapshots created by snapshot
   * policies, or for AMIs created by AMI policies.
   *
   *
   * For snapshot policies that have an `ArchiveRule` , this retention rule applies to standard tier
   * retention. When the retention threshold is met, snapshots are moved from the standard to the
   * archive tier.
   *
   * For snapshot policies that do not have an *ArchiveRule* , snapshots are permanently deleted
   * when this retention threshold is met.
   *
   *
   * You can retain snapshots based on either a count or a time interval.
   *
   * * *Count-based retention*
   *
   * You must specify *Count* . If you specify an `ArchiveRule` for the schedule, then you can
   * specify a retention count of `0` to archive snapshots immediately after creation. If you specify a
   * `FastRestoreRule` , `ShareRule` , or a `CrossRegionCopyRule` , then you must specify a retention
   * count of `1` or more.
   *
   * * *Age-based retention*
   *
   * You must specify *Interval* and *IntervalUnit* . If you specify an `ArchiveRule` for the
   * schedule, then you can specify a retention interval of `0` days to archive snapshots immediately
   * after creation. If you specify a `FastRestoreRule` , `ShareRule` , or a `CrossRegionCopyRule` ,
   * then you must specify a retention interval of `1` day or more.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.dlm.*;
   * RetainRuleProperty retainRuleProperty = RetainRuleProperty.builder()
   * .count(123)
   * .interval(123)
   * .intervalUnit("intervalUnit")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dlm-lifecyclepolicy-retainrule.html)
   */
  public inline
      fun cfnLifecyclePolicyRetainRuleProperty(block: CfnLifecyclePolicyRetainRulePropertyDsl.() -> Unit
      = {}): CfnLifecyclePolicy.RetainRuleProperty {
    val builder = CfnLifecyclePolicyRetainRulePropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.dlm.*;
   * RetentionArchiveTierProperty retentionArchiveTierProperty =
   * RetentionArchiveTierProperty.builder()
   * .count(123)
   * .interval(123)
   * .intervalUnit("intervalUnit")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dlm-lifecyclepolicy-retentionarchivetier.html)
   */
  public inline
      fun cfnLifecyclePolicyRetentionArchiveTierProperty(block: CfnLifecyclePolicyRetentionArchiveTierPropertyDsl.() -> Unit
      = {}): CfnLifecyclePolicy.RetentionArchiveTierProperty {
    val builder = CfnLifecyclePolicyRetentionArchiveTierPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * *[Snapshot and AMI policies only]* Specifies a schedule for a snapshot or AMI lifecycle policy.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.dlm.*;
   * ScheduleProperty scheduleProperty = ScheduleProperty.builder()
   * .archiveRule(ArchiveRuleProperty.builder()
   * .retainRule(ArchiveRetainRuleProperty.builder()
   * .retentionArchiveTier(RetentionArchiveTierProperty.builder()
   * .count(123)
   * .interval(123)
   * .intervalUnit("intervalUnit")
   * .build())
   * .build())
   * .build())
   * .copyTags(false)
   * .createRule(CreateRuleProperty.builder()
   * .cronExpression("cronExpression")
   * .interval(123)
   * .intervalUnit("intervalUnit")
   * .location("location")
   * .times(List.of("times"))
   * .build())
   * .crossRegionCopyRules(List.of(CrossRegionCopyRuleProperty.builder()
   * .encrypted(false)
   * // the properties below are optional
   * .cmkArn("cmkArn")
   * .copyTags(false)
   * .deprecateRule(CrossRegionCopyDeprecateRuleProperty.builder()
   * .interval(123)
   * .intervalUnit("intervalUnit")
   * .build())
   * .retainRule(CrossRegionCopyRetainRuleProperty.builder()
   * .interval(123)
   * .intervalUnit("intervalUnit")
   * .build())
   * .target("target")
   * .targetRegion("targetRegion")
   * .build()))
   * .deprecateRule(DeprecateRuleProperty.builder()
   * .count(123)
   * .interval(123)
   * .intervalUnit("intervalUnit")
   * .build())
   * .fastRestoreRule(FastRestoreRuleProperty.builder()
   * .availabilityZones(List.of("availabilityZones"))
   * .count(123)
   * .interval(123)
   * .intervalUnit("intervalUnit")
   * .build())
   * .name("name")
   * .retainRule(RetainRuleProperty.builder()
   * .count(123)
   * .interval(123)
   * .intervalUnit("intervalUnit")
   * .build())
   * .shareRules(List.of(ShareRuleProperty.builder()
   * .targetAccounts(List.of("targetAccounts"))
   * .unshareInterval(123)
   * .unshareIntervalUnit("unshareIntervalUnit")
   * .build()))
   * .tagsToAdd(List.of(CfnTag.builder()
   * .key("key")
   * .value("value")
   * .build()))
   * .variableTags(List.of(CfnTag.builder()
   * .key("key")
   * .value("value")
   * .build()))
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dlm-lifecyclepolicy-schedule.html)
   */
  public inline
      fun cfnLifecyclePolicyScheduleProperty(block: CfnLifecyclePolicySchedulePropertyDsl.() -> Unit
      = {}): CfnLifecyclePolicy.ScheduleProperty {
    val builder = CfnLifecyclePolicySchedulePropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * *[Snapshot policies only]* Specifies a rule for sharing snapshots across AWS accounts .
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.dlm.*;
   * ShareRuleProperty shareRuleProperty = ShareRuleProperty.builder()
   * .targetAccounts(List.of("targetAccounts"))
   * .unshareInterval(123)
   * .unshareIntervalUnit("unshareIntervalUnit")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dlm-lifecyclepolicy-sharerule.html)
   */
  public inline
      fun cfnLifecyclePolicyShareRuleProperty(block: CfnLifecyclePolicyShareRulePropertyDsl.() -> Unit
      = {}): CfnLifecyclePolicy.ShareRuleProperty {
    val builder = CfnLifecyclePolicyShareRulePropertyDsl()
    builder.apply(block)
    return builder.build()
  }
}
