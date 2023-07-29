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

package cloudshift.awscdk.dsl.services.dlm

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.dlm.CfnLifecyclePolicy

/**
 * *[Snapshot and AMI policies only]* Specifies a schedule for a snapshot or AMI lifecycle policy.
 *
 * Example:
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
@CdkDslMarker
public class CfnLifecyclePolicySchedulePropertyDsl {
    private val cdkBuilder: CfnLifecyclePolicy.ScheduleProperty.Builder =
        CfnLifecyclePolicy.ScheduleProperty.builder()

    private val _crossRegionCopyRules: MutableList<Any> = mutableListOf()

    private val _shareRules: MutableList<Any> = mutableListOf()

    private val _tagsToAdd: MutableList<Any> = mutableListOf()

    private val _variableTags: MutableList<Any> = mutableListOf()

    /** @param archiveRule the value to be set. */
    public fun archiveRule(archiveRule: IResolvable) {
        cdkBuilder.archiveRule(archiveRule)
    }

    /** @param archiveRule the value to be set. */
    public fun archiveRule(archiveRule: CfnLifecyclePolicy.ArchiveRuleProperty) {
        cdkBuilder.archiveRule(archiveRule)
    }

    /**
     * @param copyTags Copy all user-defined tags on a source volume to snapshots of the volume
     *   created by this policy.
     */
    public fun copyTags(copyTags: Boolean) {
        cdkBuilder.copyTags(copyTags)
    }

    /**
     * @param copyTags Copy all user-defined tags on a source volume to snapshots of the volume
     *   created by this policy.
     */
    public fun copyTags(copyTags: IResolvable) {
        cdkBuilder.copyTags(copyTags)
    }

    /** @param createRule The creation rule. */
    public fun createRule(createRule: IResolvable) {
        cdkBuilder.createRule(createRule)
    }

    /** @param createRule The creation rule. */
    public fun createRule(createRule: CfnLifecyclePolicy.CreateRuleProperty) {
        cdkBuilder.createRule(createRule)
    }

    /**
     * @param crossRegionCopyRules Specifies a rule for copying snapshots or AMIs across regions.
     *
     * You can't specify cross-Region copy rules for policies that create snapshots on an Outpost.
     * If the policy creates snapshots in a Region, then snapshots can be copied to up to three
     * Regions or Outposts.
     */
    public fun crossRegionCopyRules(vararg crossRegionCopyRules: Any) {
        _crossRegionCopyRules.addAll(listOf(*crossRegionCopyRules))
    }

    /**
     * @param crossRegionCopyRules Specifies a rule for copying snapshots or AMIs across regions.
     *
     * You can't specify cross-Region copy rules for policies that create snapshots on an Outpost.
     * If the policy creates snapshots in a Region, then snapshots can be copied to up to three
     * Regions or Outposts.
     */
    public fun crossRegionCopyRules(crossRegionCopyRules: Collection<Any>) {
        _crossRegionCopyRules.addAll(crossRegionCopyRules)
    }

    /**
     * @param crossRegionCopyRules Specifies a rule for copying snapshots or AMIs across regions.
     *
     * You can't specify cross-Region copy rules for policies that create snapshots on an Outpost.
     * If the policy creates snapshots in a Region, then snapshots can be copied to up to three
     * Regions or Outposts.
     */
    public fun crossRegionCopyRules(crossRegionCopyRules: IResolvable) {
        cdkBuilder.crossRegionCopyRules(crossRegionCopyRules)
    }

    /** @param deprecateRule the value to be set. */
    public fun deprecateRule(deprecateRule: IResolvable) {
        cdkBuilder.deprecateRule(deprecateRule)
    }

    /** @param deprecateRule the value to be set. */
    public fun deprecateRule(deprecateRule: CfnLifecyclePolicy.DeprecateRuleProperty) {
        cdkBuilder.deprecateRule(deprecateRule)
    }

    /**
     * @param fastRestoreRule *[Snapshot policies only]* The rule for enabling fast snapshot
     *   restore.
     */
    public fun fastRestoreRule(fastRestoreRule: IResolvable) {
        cdkBuilder.fastRestoreRule(fastRestoreRule)
    }

    /**
     * @param fastRestoreRule *[Snapshot policies only]* The rule for enabling fast snapshot
     *   restore.
     */
    public fun fastRestoreRule(fastRestoreRule: CfnLifecyclePolicy.FastRestoreRuleProperty) {
        cdkBuilder.fastRestoreRule(fastRestoreRule)
    }

    /** @param name The name of the schedule. */
    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    /** @param retainRule The retention rule for snapshots or AMIs created by the policy. */
    public fun retainRule(retainRule: IResolvable) {
        cdkBuilder.retainRule(retainRule)
    }

    /** @param retainRule The retention rule for snapshots or AMIs created by the policy. */
    public fun retainRule(retainRule: CfnLifecyclePolicy.RetainRuleProperty) {
        cdkBuilder.retainRule(retainRule)
    }

    /**
     * @param shareRules *[Snapshot policies only]* The rule for sharing snapshots with other AWS
     *   accounts .
     */
    public fun shareRules(vararg shareRules: Any) {
        _shareRules.addAll(listOf(*shareRules))
    }

    /**
     * @param shareRules *[Snapshot policies only]* The rule for sharing snapshots with other AWS
     *   accounts .
     */
    public fun shareRules(shareRules: Collection<Any>) {
        _shareRules.addAll(shareRules)
    }

    /**
     * @param shareRules *[Snapshot policies only]* The rule for sharing snapshots with other AWS
     *   accounts .
     */
    public fun shareRules(shareRules: IResolvable) {
        cdkBuilder.shareRules(shareRules)
    }

    /**
     * @param tagsToAdd The tags to apply to policy-created resources. These user-defined tags are
     *   in addition to the AWS -added lifecycle tags.
     */
    public fun tagsToAdd(vararg tagsToAdd: Any) {
        _tagsToAdd.addAll(listOf(*tagsToAdd))
    }

    /**
     * @param tagsToAdd The tags to apply to policy-created resources. These user-defined tags are
     *   in addition to the AWS -added lifecycle tags.
     */
    public fun tagsToAdd(tagsToAdd: Collection<Any>) {
        _tagsToAdd.addAll(tagsToAdd)
    }

    /**
     * @param tagsToAdd The tags to apply to policy-created resources. These user-defined tags are
     *   in addition to the AWS -added lifecycle tags.
     */
    public fun tagsToAdd(tagsToAdd: IResolvable) {
        cdkBuilder.tagsToAdd(tagsToAdd)
    }

    /**
     * @param variableTags *[AMI policies and snapshot policies that target instances only]* A
     *   collection of key/value pairs with values determined dynamically when the policy is
     *   executed. Keys may be any valid Amazon EC2 tag key. Values must be in one of the two
     *   following formats: `$(instance-id)` or `$(timestamp)` . Variable tags are only valid for
     *   EBS Snapshot Management – Instance policies.
     */
    public fun variableTags(vararg variableTags: Any) {
        _variableTags.addAll(listOf(*variableTags))
    }

    /**
     * @param variableTags *[AMI policies and snapshot policies that target instances only]* A
     *   collection of key/value pairs with values determined dynamically when the policy is
     *   executed. Keys may be any valid Amazon EC2 tag key. Values must be in one of the two
     *   following formats: `$(instance-id)` or `$(timestamp)` . Variable tags are only valid for
     *   EBS Snapshot Management – Instance policies.
     */
    public fun variableTags(variableTags: Collection<Any>) {
        _variableTags.addAll(variableTags)
    }

    /**
     * @param variableTags *[AMI policies and snapshot policies that target instances only]* A
     *   collection of key/value pairs with values determined dynamically when the policy is
     *   executed. Keys may be any valid Amazon EC2 tag key. Values must be in one of the two
     *   following formats: `$(instance-id)` or `$(timestamp)` . Variable tags are only valid for
     *   EBS Snapshot Management – Instance policies.
     */
    public fun variableTags(variableTags: IResolvable) {
        cdkBuilder.variableTags(variableTags)
    }

    public fun build(): CfnLifecyclePolicy.ScheduleProperty {
        if (_crossRegionCopyRules.isNotEmpty())
            cdkBuilder.crossRegionCopyRules(_crossRegionCopyRules)
        if (_shareRules.isNotEmpty()) cdkBuilder.shareRules(_shareRules)
        if (_tagsToAdd.isNotEmpty()) cdkBuilder.tagsToAdd(_tagsToAdd)
        if (_variableTags.isNotEmpty()) cdkBuilder.variableTags(_variableTags)
        return cdkBuilder.build()
    }
}
