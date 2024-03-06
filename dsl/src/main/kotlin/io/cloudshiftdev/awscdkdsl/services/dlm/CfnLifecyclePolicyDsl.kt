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

import io.cloudshiftdev.awscdkdsl.CfnTagDsl
import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import io.cloudshiftdev.awscdkdsl.common.MapBuilder
import kotlin.Any
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.dlm.CfnLifecyclePolicy
import software.constructs.Construct

/**
 * Specifies a lifecycle policy, which is used to automate operations on Amazon EBS resources.
 *
 * The properties are required when you add a lifecycle policy and optional when you update a
 * lifecycle policy.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.dlm.*;
 * Object crossRegionCopyTargets;
 * Object excludeTags;
 * Object excludeVolumeTypes;
 * CfnLifecyclePolicy cfnLifecyclePolicy = CfnLifecyclePolicy.Builder.create(this,
 * "MyCfnLifecyclePolicy")
 * .copyTags(false)
 * .createInterval(123)
 * .crossRegionCopyTargets(crossRegionCopyTargets)
 * .defaultPolicy("defaultPolicy")
 * .description("description")
 * .exclusions(ExclusionsProperty.builder()
 * .excludeBootVolumes(false)
 * .excludeTags(excludeTags)
 * .excludeVolumeTypes(excludeVolumeTypes)
 * .build())
 * .executionRoleArn("executionRoleArn")
 * .extendDeletion(false)
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
 * .build())
 * .retainInterval(123)
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
@CdkDslMarker
public class CfnLifecyclePolicyDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnLifecyclePolicy.Builder =
        CfnLifecyclePolicy.Builder.create(scope, id)

    private val _tags: MutableList<CfnTag> = mutableListOf()

    /**
     * *[Default policies only]* Indicates whether the policy should copy tags from the source
     * resource to the snapshot or AMI.
     *
     * If you do not specify a value, the default is `false` .
     *
     * Default: false
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dlm-lifecyclepolicy.html#cfn-dlm-lifecyclepolicy-copytags)
     *
     * @param copyTags *[Default policies only]* Indicates whether the policy should copy tags from
     *   the source resource to the snapshot or AMI.
     */
    public fun copyTags(copyTags: Boolean) {
        cdkBuilder.copyTags(copyTags)
    }

    /**
     * *[Default policies only]* Indicates whether the policy should copy tags from the source
     * resource to the snapshot or AMI.
     *
     * If you do not specify a value, the default is `false` .
     *
     * Default: false
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dlm-lifecyclepolicy.html#cfn-dlm-lifecyclepolicy-copytags)
     *
     * @param copyTags *[Default policies only]* Indicates whether the policy should copy tags from
     *   the source resource to the snapshot or AMI.
     */
    public fun copyTags(copyTags: IResolvable) {
        cdkBuilder.copyTags(copyTags)
    }

    /**
     * *[Default policies only]* Specifies how often the policy should run and create snapshots or
     * AMIs.
     *
     * The creation frequency can range from 1 to 7 days. If you do not specify a value, the default
     * is 1.
     *
     * Default: 1
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dlm-lifecyclepolicy.html#cfn-dlm-lifecyclepolicy-createinterval)
     *
     * @param createInterval *[Default policies only]* Specifies how often the policy should run and
     *   create snapshots or AMIs.
     */
    public fun createInterval(createInterval: Number) {
        cdkBuilder.createInterval(createInterval)
    }

    /**
     * *[Default policies only]* Specifies destination Regions for snapshot or AMI copies.
     *
     * You can specify up to 3 destination Regions. If you do not want to create cross-Region
     * copies, omit this parameter.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dlm-lifecyclepolicy.html#cfn-dlm-lifecyclepolicy-crossregioncopytargets)
     *
     * @param crossRegionCopyTargets *[Default policies only]* Specifies destination Regions for
     *   snapshot or AMI copies.
     */
    public fun crossRegionCopyTargets(crossRegionCopyTargets: MapBuilder.() -> Unit = {}) {
        val builder = MapBuilder()
        builder.apply(crossRegionCopyTargets)
        cdkBuilder.crossRegionCopyTargets(builder.map)
    }

    /**
     * *[Default policies only]* Specifies destination Regions for snapshot or AMI copies.
     *
     * You can specify up to 3 destination Regions. If you do not want to create cross-Region
     * copies, omit this parameter.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dlm-lifecyclepolicy.html#cfn-dlm-lifecyclepolicy-crossregioncopytargets)
     *
     * @param crossRegionCopyTargets *[Default policies only]* Specifies destination Regions for
     *   snapshot or AMI copies.
     */
    public fun crossRegionCopyTargets(crossRegionCopyTargets: Any) {
        cdkBuilder.crossRegionCopyTargets(crossRegionCopyTargets)
    }

    /**
     * *[Default policies only]* Specify the type of default policy to create.
     * * To create a default policy for EBS snapshots, that creates snapshots of all volumes in the
     *   Region that do not have recent backups, specify `VOLUME` .
     * * To create a default policy for EBS-backed AMIs, that creates EBS-backed AMIs from all
     *   instances in the Region that do not have recent backups, specify `INSTANCE` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dlm-lifecyclepolicy.html#cfn-dlm-lifecyclepolicy-defaultpolicy)
     *
     * @param defaultPolicy *[Default policies only]* Specify the type of default policy to create.
     */
    public fun defaultPolicy(defaultPolicy: String) {
        cdkBuilder.defaultPolicy(defaultPolicy)
    }

    /**
     * A description of the lifecycle policy.
     *
     * The characters ^[0-9A-Za-z _-]+$ are supported.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dlm-lifecyclepolicy.html#cfn-dlm-lifecyclepolicy-description)
     *
     * @param description A description of the lifecycle policy.
     */
    public fun description(description: String) {
        cdkBuilder.description(description)
    }

    /**
     * *[Default policies only]* Specifies exclusion parameters for volumes or instances for which
     * you do not want to create snapshots or AMIs.
     *
     * The policy will not create snapshots or AMIs for target resources that match any of the
     * specified exclusion parameters.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dlm-lifecyclepolicy.html#cfn-dlm-lifecyclepolicy-exclusions)
     *
     * @param exclusions *[Default policies only]* Specifies exclusion parameters for volumes or
     *   instances for which you do not want to create snapshots or AMIs.
     */
    public fun exclusions(exclusions: IResolvable) {
        cdkBuilder.exclusions(exclusions)
    }

    /**
     * *[Default policies only]* Specifies exclusion parameters for volumes or instances for which
     * you do not want to create snapshots or AMIs.
     *
     * The policy will not create snapshots or AMIs for target resources that match any of the
     * specified exclusion parameters.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dlm-lifecyclepolicy.html#cfn-dlm-lifecyclepolicy-exclusions)
     *
     * @param exclusions *[Default policies only]* Specifies exclusion parameters for volumes or
     *   instances for which you do not want to create snapshots or AMIs.
     */
    public fun exclusions(exclusions: CfnLifecyclePolicy.ExclusionsProperty) {
        cdkBuilder.exclusions(exclusions)
    }

    /**
     * The Amazon Resource Name (ARN) of the IAM role used to run the operations specified by the
     * lifecycle policy.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dlm-lifecyclepolicy.html#cfn-dlm-lifecyclepolicy-executionrolearn)
     *
     * @param executionRoleArn The Amazon Resource Name (ARN) of the IAM role used to run the
     *   operations specified by the lifecycle policy.
     */
    public fun executionRoleArn(executionRoleArn: String) {
        cdkBuilder.executionRoleArn(executionRoleArn)
    }

    /**
     * *[Default policies only]* Defines the snapshot or AMI retention behavior for the policy if
     * the source volume or instance is deleted, or if the policy enters the error, disabled, or
     * deleted state.
     *
     * By default ( *ExtendDeletion=false* ):
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
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dlm-lifecyclepolicy.html#cfn-dlm-lifecyclepolicy-extenddeletion)
     *
     * @param extendDeletion *[Default policies only]* Defines the snapshot or AMI retention
     *   behavior for the policy if the source volume or instance is deleted, or if the policy
     *   enters the error, disabled, or deleted state.
     */
    public fun extendDeletion(extendDeletion: Boolean) {
        cdkBuilder.extendDeletion(extendDeletion)
    }

    /**
     * *[Default policies only]* Defines the snapshot or AMI retention behavior for the policy if
     * the source volume or instance is deleted, or if the policy enters the error, disabled, or
     * deleted state.
     *
     * By default ( *ExtendDeletion=false* ):
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
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dlm-lifecyclepolicy.html#cfn-dlm-lifecyclepolicy-extenddeletion)
     *
     * @param extendDeletion *[Default policies only]* Defines the snapshot or AMI retention
     *   behavior for the policy if the source volume or instance is deleted, or if the policy
     *   enters the error, disabled, or deleted state.
     */
    public fun extendDeletion(extendDeletion: IResolvable) {
        cdkBuilder.extendDeletion(extendDeletion)
    }

    /**
     * The configuration details of the lifecycle policy.
     *
     * If you create a default policy, you can specify the request parameters either in the request
     * body, or in the PolicyDetails request structure, but not both.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dlm-lifecyclepolicy.html#cfn-dlm-lifecyclepolicy-policydetails)
     *
     * @param policyDetails The configuration details of the lifecycle policy.
     */
    public fun policyDetails(policyDetails: IResolvable) {
        cdkBuilder.policyDetails(policyDetails)
    }

    /**
     * The configuration details of the lifecycle policy.
     *
     * If you create a default policy, you can specify the request parameters either in the request
     * body, or in the PolicyDetails request structure, but not both.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dlm-lifecyclepolicy.html#cfn-dlm-lifecyclepolicy-policydetails)
     *
     * @param policyDetails The configuration details of the lifecycle policy.
     */
    public fun policyDetails(policyDetails: CfnLifecyclePolicy.PolicyDetailsProperty) {
        cdkBuilder.policyDetails(policyDetails)
    }

    /**
     * *[Default policies only]* Specifies how long the policy should retain snapshots or AMIs
     * before deleting them.
     *
     * The retention period can range from 2 to 14 days, but it must be greater than the creation
     * frequency to ensure that the policy retains at least 1 snapshot or AMI at any given time. If
     * you do not specify a value, the default is 7.
     *
     * Default: 7
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dlm-lifecyclepolicy.html#cfn-dlm-lifecyclepolicy-retaininterval)
     *
     * @param retainInterval *[Default policies only]* Specifies how long the policy should retain
     *   snapshots or AMIs before deleting them.
     */
    public fun retainInterval(retainInterval: Number) {
        cdkBuilder.retainInterval(retainInterval)
    }

    /**
     * The activation state of the lifecycle policy.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dlm-lifecyclepolicy.html#cfn-dlm-lifecyclepolicy-state)
     *
     * @param state The activation state of the lifecycle policy.
     */
    public fun state(state: String) {
        cdkBuilder.state(state)
    }

    /**
     * The tags to apply to the lifecycle policy during creation.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dlm-lifecyclepolicy.html#cfn-dlm-lifecyclepolicy-tags)
     *
     * @param tags The tags to apply to the lifecycle policy during creation.
     */
    public fun tags(tags: CfnTagDsl.() -> Unit) {
        _tags.add(CfnTagDsl().apply(tags).build())
    }

    /**
     * The tags to apply to the lifecycle policy during creation.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dlm-lifecyclepolicy.html#cfn-dlm-lifecyclepolicy-tags)
     *
     * @param tags The tags to apply to the lifecycle policy during creation.
     */
    public fun tags(tags: Collection<CfnTag>) {
        _tags.addAll(tags)
    }

    public fun build(): CfnLifecyclePolicy {
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        return cdkBuilder.build()
    }
}
