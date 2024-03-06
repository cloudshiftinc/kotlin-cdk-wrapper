@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION"
)

package io.cloudshiftdev.awscdkdsl.services.dlm

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import io.cloudshiftdev.awscdkdsl.common.MapBuilder
import kotlin.Any
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.dlm.CfnLifecyclePolicy

/**
 * Specifies the configuration of a lifecycle policy.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.dlm.*;
 * Object crossRegionCopyTargets;
 * Object excludeTags;
 * Object excludeVolumeTypes;
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
 * .copyTags(false)
 * .createInterval(123)
 * .crossRegionCopyTargets(crossRegionCopyTargets)
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
 * .exclusions(ExclusionsProperty.builder()
 * .excludeBootVolumes(false)
 * .excludeTags(excludeTags)
 * .excludeVolumeTypes(excludeVolumeTypes)
 * .build())
 * .extendDeletion(false)
 * .parameters(ParametersProperty.builder()
 * .excludeBootVolume(false)
 * .excludeDataVolumeTags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .noReboot(false)
 * .build())
 * .policyLanguage("policyLanguage")
 * .policyType("policyType")
 * .resourceLocations(List.of("resourceLocations"))
 * .resourceType("resourceType")
 * .resourceTypes(List.of("resourceTypes"))
 * .retainInterval(123)
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
 * .scripts(List.of(ScriptProperty.builder()
 * .executeOperationOnScriptFailure(false)
 * .executionHandler("executionHandler")
 * .executionHandlerService("executionHandlerService")
 * .executionTimeout(123)
 * .maximumRetryCount(123)
 * .stages(List.of("stages"))
 * .build()))
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
@CdkDslMarker
public class CfnLifecyclePolicyPolicyDetailsPropertyDsl {
    private val cdkBuilder: CfnLifecyclePolicy.PolicyDetailsProperty.Builder =
        CfnLifecyclePolicy.PolicyDetailsProperty.builder()

    private val _actions: MutableList<Any> = mutableListOf()

    private val _resourceLocations: MutableList<String> = mutableListOf()

    private val _resourceTypes: MutableList<String> = mutableListOf()

    private val _schedules: MutableList<Any> = mutableListOf()

    private val _targetTags: MutableList<Any> = mutableListOf()

    /**
     * @param actions *[Event-based policies only]* The actions to be performed when the event-based
     *   policy is activated. You can specify only one action per policy.
     */
    public fun actions(vararg actions: Any) {
        _actions.addAll(listOf(*actions))
    }

    /**
     * @param actions *[Event-based policies only]* The actions to be performed when the event-based
     *   policy is activated. You can specify only one action per policy.
     */
    public fun actions(actions: Collection<Any>) {
        _actions.addAll(actions)
    }

    /**
     * @param actions *[Event-based policies only]* The actions to be performed when the event-based
     *   policy is activated. You can specify only one action per policy.
     */
    public fun actions(actions: IResolvable) {
        cdkBuilder.actions(actions)
    }

    /**
     * @param copyTags *[Default policies only]* Indicates whether the policy should copy tags from
     *   the source resource to the snapshot or AMI. If you do not specify a value, the default is
     *   `false` .
     *
     * Default: false
     */
    public fun copyTags(copyTags: Boolean) {
        cdkBuilder.copyTags(copyTags)
    }

    /**
     * @param copyTags *[Default policies only]* Indicates whether the policy should copy tags from
     *   the source resource to the snapshot or AMI. If you do not specify a value, the default is
     *   `false` .
     *
     * Default: false
     */
    public fun copyTags(copyTags: IResolvable) {
        cdkBuilder.copyTags(copyTags)
    }

    /**
     * @param createInterval *[Default policies only]* Specifies how often the policy should run and
     *   create snapshots or AMIs. The creation frequency can range from 1 to 7 days. If you do not
     *   specify a value, the default is 1.
     *
     * Default: 1
     */
    public fun createInterval(createInterval: Number) {
        cdkBuilder.createInterval(createInterval)
    }

    /**
     * @param crossRegionCopyTargets *[Default policies only]* Specifies destination Regions for
     *   snapshot or AMI copies. You can specify up to 3 destination Regions. If you do not want to
     *   create cross-Region copies, omit this parameter.
     */
    public fun crossRegionCopyTargets(crossRegionCopyTargets: MapBuilder.() -> Unit = {}) {
        val builder = MapBuilder()
        builder.apply(crossRegionCopyTargets)
        cdkBuilder.crossRegionCopyTargets(builder.map)
    }

    /**
     * @param crossRegionCopyTargets *[Default policies only]* Specifies destination Regions for
     *   snapshot or AMI copies. You can specify up to 3 destination Regions. If you do not want to
     *   create cross-Region copies, omit this parameter.
     */
    public fun crossRegionCopyTargets(crossRegionCopyTargets: Any) {
        cdkBuilder.crossRegionCopyTargets(crossRegionCopyTargets)
    }

    /**
     * @param eventSource *[Event-based policies only]* The event that activates the event-based
     *   policy.
     */
    public fun eventSource(eventSource: IResolvable) {
        cdkBuilder.eventSource(eventSource)
    }

    /**
     * @param eventSource *[Event-based policies only]* The event that activates the event-based
     *   policy.
     */
    public fun eventSource(eventSource: CfnLifecyclePolicy.EventSourceProperty) {
        cdkBuilder.eventSource(eventSource)
    }

    /**
     * @param exclusions *[Default policies only]* Specifies exclusion parameters for volumes or
     *   instances for which you do not want to create snapshots or AMIs. The policy will not create
     *   snapshots or AMIs for target resources that match any of the specified exclusion
     *   parameters.
     */
    public fun exclusions(exclusions: IResolvable) {
        cdkBuilder.exclusions(exclusions)
    }

    /**
     * @param exclusions *[Default policies only]* Specifies exclusion parameters for volumes or
     *   instances for which you do not want to create snapshots or AMIs. The policy will not create
     *   snapshots or AMIs for target resources that match any of the specified exclusion
     *   parameters.
     */
    public fun exclusions(exclusions: CfnLifecyclePolicy.ExclusionsProperty) {
        cdkBuilder.exclusions(exclusions)
    }

    /**
     * @param extendDeletion *[Default policies only]* Defines the snapshot or AMI retention
     *   behavior for the policy if the source volume or instance is deleted, or if the policy
     *   enters the error, disabled, or deleted state. By default ( *ExtendDeletion=false* ):
     * * If a source resource is deleted, Amazon Data Lifecycle Manager will continue to delete
     *   previously created snapshots or AMIs, up to but not including the last one, based on the
     *   specified retention period. If you want Amazon Data Lifecycle Manager to delete all
     *   snapshots or AMIs, including the last one, specify `true` .
     * * If a policy enters the error, disabled, or deleted state, Amazon Data Lifecycle Manager
     *   stops deleting snapshots and AMIs. If you want Amazon Data Lifecycle Manager to continue
     *   deleting snapshots or AMIs, including the last one, if the policy enters one of these
     *   states, specify `true` .
     *
     * If you enable extended deletion ( *ExtendDeletion=true* ), you override both default
     * behaviors simultaneously.
     *
     * If you do not specify a value, the default is `false` .
     *
     * Default: false
     */
    public fun extendDeletion(extendDeletion: Boolean) {
        cdkBuilder.extendDeletion(extendDeletion)
    }

    /**
     * @param extendDeletion *[Default policies only]* Defines the snapshot or AMI retention
     *   behavior for the policy if the source volume or instance is deleted, or if the policy
     *   enters the error, disabled, or deleted state. By default ( *ExtendDeletion=false* ):
     * * If a source resource is deleted, Amazon Data Lifecycle Manager will continue to delete
     *   previously created snapshots or AMIs, up to but not including the last one, based on the
     *   specified retention period. If you want Amazon Data Lifecycle Manager to delete all
     *   snapshots or AMIs, including the last one, specify `true` .
     * * If a policy enters the error, disabled, or deleted state, Amazon Data Lifecycle Manager
     *   stops deleting snapshots and AMIs. If you want Amazon Data Lifecycle Manager to continue
     *   deleting snapshots or AMIs, including the last one, if the policy enters one of these
     *   states, specify `true` .
     *
     * If you enable extended deletion ( *ExtendDeletion=true* ), you override both default
     * behaviors simultaneously.
     *
     * If you do not specify a value, the default is `false` .
     *
     * Default: false
     */
    public fun extendDeletion(extendDeletion: IResolvable) {
        cdkBuilder.extendDeletion(extendDeletion)
    }

    /**
     * @param parameters *[Custom snapshot and AMI policies only]* A set of optional parameters for
     *   snapshot and AMI lifecycle policies.
     *
     * If you are modifying a policy that was created or previously modified using the Amazon Data
     * Lifecycle Manager console, then you must include this parameter and specify either the
     * default values or the new values that you require. You can't omit this parameter or set its
     * values to null.
     */
    public fun parameters(parameters: IResolvable) {
        cdkBuilder.parameters(parameters)
    }

    /**
     * @param parameters *[Custom snapshot and AMI policies only]* A set of optional parameters for
     *   snapshot and AMI lifecycle policies.
     *
     * If you are modifying a policy that was created or previously modified using the Amazon Data
     * Lifecycle Manager console, then you must include this parameter and specify either the
     * default values or the new values that you require. You can't omit this parameter or set its
     * values to null.
     */
    public fun parameters(parameters: CfnLifecyclePolicy.ParametersProperty) {
        cdkBuilder.parameters(parameters)
    }

    /**
     * @param policyLanguage The type of policy to create. Specify one of the following:.
     * * `SIMPLIFIED` To create a default policy.
     * * `STANDARD` To create a custom policy.
     */
    public fun policyLanguage(policyLanguage: String) {
        cdkBuilder.policyLanguage(policyLanguage)
    }

    /**
     * @param policyType The type of policy. Specify `EBS_SNAPSHOT_MANAGEMENT` to create a lifecycle
     *   policy that manages the lifecycle of Amazon EBS snapshots. Specify `IMAGE_MANAGEMENT` to
     *   create a lifecycle policy that manages the lifecycle of EBS-backed AMIs. Specify
     *   `EVENT_BASED_POLICY` to create an event-based policy that performs specific actions when a
     *   defined event occurs in your AWS account .
     *
     * The default is `EBS_SNAPSHOT_MANAGEMENT` .
     */
    public fun policyType(policyType: String) {
        cdkBuilder.policyType(policyType)
    }

    /**
     * @param resourceLocations *[Custom snapshot and AMI policies only]* The location of the
     *   resources to backup. If the source resources are located in an AWS Region , specify `CLOUD`
     *   . If the source resources are located on an Outpost in your account, specify `OUTPOST` .
     *
     * If you specify `OUTPOST` , Amazon Data Lifecycle Manager backs up all resources of the
     * specified type with matching target tags across all of the Outposts in your account.
     */
    public fun resourceLocations(vararg resourceLocations: String) {
        _resourceLocations.addAll(listOf(*resourceLocations))
    }

    /**
     * @param resourceLocations *[Custom snapshot and AMI policies only]* The location of the
     *   resources to backup. If the source resources are located in an AWS Region , specify `CLOUD`
     *   . If the source resources are located on an Outpost in your account, specify `OUTPOST` .
     *
     * If you specify `OUTPOST` , Amazon Data Lifecycle Manager backs up all resources of the
     * specified type with matching target tags across all of the Outposts in your account.
     */
    public fun resourceLocations(resourceLocations: Collection<String>) {
        _resourceLocations.addAll(resourceLocations)
    }

    /**
     * @param resourceType *[Default policies only]* Specify the type of default policy to create.
     * * To create a default policy for EBS snapshots, that creates snapshots of all volumes in the
     *   Region that do not have recent backups, specify `VOLUME` .
     * * To create a default policy for EBS-backed AMIs, that creates EBS-backed AMIs from all
     *   instances in the Region that do not have recent backups, specify `INSTANCE` .
     */
    public fun resourceType(resourceType: String) {
        cdkBuilder.resourceType(resourceType)
    }

    /**
     * @param resourceTypes *[Custom snapshot policies only]* The target resource type for snapshot
     *   and AMI lifecycle policies. Use `VOLUME` to create snapshots of individual volumes or use
     *   `INSTANCE` to create multi-volume snapshots from the volumes for an instance.
     */
    public fun resourceTypes(vararg resourceTypes: String) {
        _resourceTypes.addAll(listOf(*resourceTypes))
    }

    /**
     * @param resourceTypes *[Custom snapshot policies only]* The target resource type for snapshot
     *   and AMI lifecycle policies. Use `VOLUME` to create snapshots of individual volumes or use
     *   `INSTANCE` to create multi-volume snapshots from the volumes for an instance.
     */
    public fun resourceTypes(resourceTypes: Collection<String>) {
        _resourceTypes.addAll(resourceTypes)
    }

    /**
     * @param retainInterval *[Default policies only]* Specifies how long the policy should retain
     *   snapshots or AMIs before deleting them. The retention period can range from 2 to 14 days,
     *   but it must be greater than the creation frequency to ensure that the policy retains at
     *   least 1 snapshot or AMI at any given time. If you do not specify a value, the default is 7.
     *
     * Default: 7
     */
    public fun retainInterval(retainInterval: Number) {
        cdkBuilder.retainInterval(retainInterval)
    }

    /**
     * @param schedules *[Custom snapshot and AMI policies only]* The schedules of policy-defined
     *   actions for snapshot and AMI lifecycle policies. A policy can have up to four schedules—one
     *   mandatory schedule and up to three optional schedules.
     */
    public fun schedules(vararg schedules: Any) {
        _schedules.addAll(listOf(*schedules))
    }

    /**
     * @param schedules *[Custom snapshot and AMI policies only]* The schedules of policy-defined
     *   actions for snapshot and AMI lifecycle policies. A policy can have up to four schedules—one
     *   mandatory schedule and up to three optional schedules.
     */
    public fun schedules(schedules: Collection<Any>) {
        _schedules.addAll(schedules)
    }

    /**
     * @param schedules *[Custom snapshot and AMI policies only]* The schedules of policy-defined
     *   actions for snapshot and AMI lifecycle policies. A policy can have up to four schedules—one
     *   mandatory schedule and up to three optional schedules.
     */
    public fun schedules(schedules: IResolvable) {
        cdkBuilder.schedules(schedules)
    }

    /**
     * @param targetTags *[Custom snapshot and AMI policies only]* The single tag that identifies
     *   targeted resources for this policy.
     */
    public fun targetTags(vararg targetTags: Any) {
        _targetTags.addAll(listOf(*targetTags))
    }

    /**
     * @param targetTags *[Custom snapshot and AMI policies only]* The single tag that identifies
     *   targeted resources for this policy.
     */
    public fun targetTags(targetTags: Collection<Any>) {
        _targetTags.addAll(targetTags)
    }

    /**
     * @param targetTags *[Custom snapshot and AMI policies only]* The single tag that identifies
     *   targeted resources for this policy.
     */
    public fun targetTags(targetTags: IResolvable) {
        cdkBuilder.targetTags(targetTags)
    }

    public fun build(): CfnLifecyclePolicy.PolicyDetailsProperty {
        if (_actions.isNotEmpty()) cdkBuilder.actions(_actions)
        if (_resourceLocations.isNotEmpty()) cdkBuilder.resourceLocations(_resourceLocations)
        if (_resourceTypes.isNotEmpty()) cdkBuilder.resourceTypes(_resourceTypes)
        if (_schedules.isNotEmpty()) cdkBuilder.schedules(_schedules)
        if (_targetTags.isNotEmpty()) cdkBuilder.targetTags(_targetTags)
        return cdkBuilder.build()
    }
}
