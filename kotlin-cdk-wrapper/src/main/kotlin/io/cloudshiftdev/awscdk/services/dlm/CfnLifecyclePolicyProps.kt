@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.dlm

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

/**
 * Properties for defining a `CfnLifecyclePolicy`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.dlm.*;
 * Object crossRegionCopyTargets;
 * Object excludeTags;
 * Object excludeVolumeTypes;
 * CfnLifecyclePolicyProps cfnLifecyclePolicyProps = CfnLifecyclePolicyProps.builder()
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
public interface CfnLifecyclePolicyProps {
  /**
   * *[Default policies only]* Indicates whether the policy should copy tags from the source
   * resource to the snapshot or AMI.
   *
   * If you do not specify a value, the default is `false` .
   *
   * Default: false
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dlm-lifecyclepolicy.html#cfn-dlm-lifecyclepolicy-copytags)
   */
  public fun copyTags(): Any? = unwrap(this).getCopyTags()

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
   */
  public fun createInterval(): Number? = unwrap(this).getCreateInterval()

  /**
   * *[Default policies only]* Specifies destination Regions for snapshot or AMI copies.
   *
   * You can specify up to 3 destination Regions. If you do not want to create cross-Region copies,
   * omit this parameter.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dlm-lifecyclepolicy.html#cfn-dlm-lifecyclepolicy-crossregioncopytargets)
   */
  public fun crossRegionCopyTargets(): Any? = unwrap(this).getCrossRegionCopyTargets()

  /**
   * *[Default policies only]* Specify the type of default policy to create.
   *
   * * To create a default policy for EBS snapshots, that creates snapshots of all volumes in the
   * Region that do not have recent backups, specify `VOLUME` .
   * * To create a default policy for EBS-backed AMIs, that creates EBS-backed AMIs from all
   * instances in the Region that do not have recent backups, specify `INSTANCE` .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dlm-lifecyclepolicy.html#cfn-dlm-lifecyclepolicy-defaultpolicy)
   */
  public fun defaultPolicy(): String? = unwrap(this).getDefaultPolicy()

  /**
   * A description of the lifecycle policy.
   *
   * The characters ^[0-9A-Za-z _-]+$ are supported.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dlm-lifecyclepolicy.html#cfn-dlm-lifecyclepolicy-description)
   */
  public fun description(): String? = unwrap(this).getDescription()

  /**
   * *[Default policies only]* Specifies exclusion parameters for volumes or instances for which you
   * do not want to create snapshots or AMIs.
   *
   * The policy will not create snapshots or AMIs for target resources that match any of the
   * specified exclusion parameters.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dlm-lifecyclepolicy.html#cfn-dlm-lifecyclepolicy-exclusions)
   */
  public fun exclusions(): Any? = unwrap(this).getExclusions()

  /**
   * The Amazon Resource Name (ARN) of the IAM role used to run the operations specified by the
   * lifecycle policy.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dlm-lifecyclepolicy.html#cfn-dlm-lifecyclepolicy-executionrolearn)
   */
  public fun executionRoleArn(): String? = unwrap(this).getExecutionRoleArn()

  /**
   * *[Default policies only]* Defines the snapshot or AMI retention behavior for the policy if the
   * source volume or instance is deleted, or if the policy enters the error, disabled, or deleted
   * state.
   *
   * By default ( *ExtendDeletion=false* ):
   *
   * * If a source resource is deleted, Amazon Data Lifecycle Manager will continue to delete
   * previously created snapshots or AMIs, up to but not including the last one, based on the specified
   * retention period. If you want Amazon Data Lifecycle Manager to delete all snapshots or AMIs,
   * including the last one, specify `true` .
   * * If a policy enters the error, disabled, or deleted state, Amazon Data Lifecycle Manager stops
   * deleting snapshots and AMIs. If you want Amazon Data Lifecycle Manager to continue deleting
   * snapshots or AMIs, including the last one, if the policy enters one of these states, specify
   * `true` .
   *
   * If you enable extended deletion ( *ExtendDeletion=true* ), you override both default behaviors
   * simultaneously.
   *
   * If you do not specify a value, the default is `false` .
   *
   * Default: false
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dlm-lifecyclepolicy.html#cfn-dlm-lifecyclepolicy-extenddeletion)
   */
  public fun extendDeletion(): Any? = unwrap(this).getExtendDeletion()

  /**
   * The configuration details of the lifecycle policy.
   *
   *
   * If you create a default policy, you can specify the request parameters either in the request
   * body, or in the PolicyDetails request structure, but not both.
   *
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dlm-lifecyclepolicy.html#cfn-dlm-lifecyclepolicy-policydetails)
   */
  public fun policyDetails(): Any? = unwrap(this).getPolicyDetails()

  /**
   * *[Default policies only]* Specifies how long the policy should retain snapshots or AMIs before
   * deleting them.
   *
   * The retention period can range from 2 to 14 days, but it must be greater than the creation
   * frequency to ensure that the policy retains at least 1 snapshot or AMI at any given time. If you
   * do not specify a value, the default is 7.
   *
   * Default: 7
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dlm-lifecyclepolicy.html#cfn-dlm-lifecyclepolicy-retaininterval)
   */
  public fun retainInterval(): Number? = unwrap(this).getRetainInterval()

  /**
   * The activation state of the lifecycle policy.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dlm-lifecyclepolicy.html#cfn-dlm-lifecyclepolicy-state)
   */
  public fun state(): String? = unwrap(this).getState()

  /**
   * The tags to apply to the lifecycle policy during creation.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dlm-lifecyclepolicy.html#cfn-dlm-lifecyclepolicy-tags)
   */
  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * A builder for [CfnLifecyclePolicyProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param copyTags *[Default policies only]* Indicates whether the policy should copy tags from
     * the source resource to the snapshot or AMI.
     * If you do not specify a value, the default is `false` .
     *
     * Default: false
     */
    public fun copyTags(copyTags: Boolean)

    /**
     * @param copyTags *[Default policies only]* Indicates whether the policy should copy tags from
     * the source resource to the snapshot or AMI.
     * If you do not specify a value, the default is `false` .
     *
     * Default: false
     */
    public fun copyTags(copyTags: IResolvable)

    /**
     * @param createInterval *[Default policies only]* Specifies how often the policy should run and
     * create snapshots or AMIs.
     * The creation frequency can range from 1 to 7 days. If you do not specify a value, the default
     * is 1.
     *
     * Default: 1
     */
    public fun createInterval(createInterval: Number)

    /**
     * @param crossRegionCopyTargets *[Default policies only]* Specifies destination Regions for
     * snapshot or AMI copies.
     * You can specify up to 3 destination Regions. If you do not want to create cross-Region
     * copies, omit this parameter.
     */
    public fun crossRegionCopyTargets(crossRegionCopyTargets: Any)

    /**
     * @param defaultPolicy *[Default policies only]* Specify the type of default policy to create.
     * * To create a default policy for EBS snapshots, that creates snapshots of all volumes in the
     * Region that do not have recent backups, specify `VOLUME` .
     * * To create a default policy for EBS-backed AMIs, that creates EBS-backed AMIs from all
     * instances in the Region that do not have recent backups, specify `INSTANCE` .
     */
    public fun defaultPolicy(defaultPolicy: String)

    /**
     * @param description A description of the lifecycle policy.
     * The characters ^[0-9A-Za-z _-]+$ are supported.
     */
    public fun description(description: String)

    /**
     * @param exclusions *[Default policies only]* Specifies exclusion parameters for volumes or
     * instances for which you do not want to create snapshots or AMIs.
     * The policy will not create snapshots or AMIs for target resources that match any of the
     * specified exclusion parameters.
     */
    public fun exclusions(exclusions: IResolvable)

    /**
     * @param exclusions *[Default policies only]* Specifies exclusion parameters for volumes or
     * instances for which you do not want to create snapshots or AMIs.
     * The policy will not create snapshots or AMIs for target resources that match any of the
     * specified exclusion parameters.
     */
    public fun exclusions(exclusions: CfnLifecyclePolicy.ExclusionsProperty)

    /**
     * @param exclusions *[Default policies only]* Specifies exclusion parameters for volumes or
     * instances for which you do not want to create snapshots or AMIs.
     * The policy will not create snapshots or AMIs for target resources that match any of the
     * specified exclusion parameters.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("91eb417783a1960b864c154099899d6b138c5d6554ddce6485b9977155f17115")
    public fun exclusions(exclusions: CfnLifecyclePolicy.ExclusionsProperty.Builder.() -> Unit)

    /**
     * @param executionRoleArn The Amazon Resource Name (ARN) of the IAM role used to run the
     * operations specified by the lifecycle policy.
     */
    public fun executionRoleArn(executionRoleArn: String)

    /**
     * @param extendDeletion *[Default policies only]* Defines the snapshot or AMI retention
     * behavior for the policy if the source volume or instance is deleted, or if the policy enters the
     * error, disabled, or deleted state.
     * By default ( *ExtendDeletion=false* ):
     *
     * * If a source resource is deleted, Amazon Data Lifecycle Manager will continue to delete
     * previously created snapshots or AMIs, up to but not including the last one, based on the
     * specified retention period. If you want Amazon Data Lifecycle Manager to delete all snapshots or
     * AMIs, including the last one, specify `true` .
     * * If a policy enters the error, disabled, or deleted state, Amazon Data Lifecycle Manager
     * stops deleting snapshots and AMIs. If you want Amazon Data Lifecycle Manager to continue
     * deleting snapshots or AMIs, including the last one, if the policy enters one of these states,
     * specify `true` .
     *
     * If you enable extended deletion ( *ExtendDeletion=true* ), you override both default
     * behaviors simultaneously.
     *
     * If you do not specify a value, the default is `false` .
     *
     * Default: false
     */
    public fun extendDeletion(extendDeletion: Boolean)

    /**
     * @param extendDeletion *[Default policies only]* Defines the snapshot or AMI retention
     * behavior for the policy if the source volume or instance is deleted, or if the policy enters the
     * error, disabled, or deleted state.
     * By default ( *ExtendDeletion=false* ):
     *
     * * If a source resource is deleted, Amazon Data Lifecycle Manager will continue to delete
     * previously created snapshots or AMIs, up to but not including the last one, based on the
     * specified retention period. If you want Amazon Data Lifecycle Manager to delete all snapshots or
     * AMIs, including the last one, specify `true` .
     * * If a policy enters the error, disabled, or deleted state, Amazon Data Lifecycle Manager
     * stops deleting snapshots and AMIs. If you want Amazon Data Lifecycle Manager to continue
     * deleting snapshots or AMIs, including the last one, if the policy enters one of these states,
     * specify `true` .
     *
     * If you enable extended deletion ( *ExtendDeletion=true* ), you override both default
     * behaviors simultaneously.
     *
     * If you do not specify a value, the default is `false` .
     *
     * Default: false
     */
    public fun extendDeletion(extendDeletion: IResolvable)

    /**
     * @param policyDetails The configuration details of the lifecycle policy.
     *
     * If you create a default policy, you can specify the request parameters either in the request
     * body, or in the PolicyDetails request structure, but not both.
     */
    public fun policyDetails(policyDetails: IResolvable)

    /**
     * @param policyDetails The configuration details of the lifecycle policy.
     *
     * If you create a default policy, you can specify the request parameters either in the request
     * body, or in the PolicyDetails request structure, but not both.
     */
    public fun policyDetails(policyDetails: CfnLifecyclePolicy.PolicyDetailsProperty)

    /**
     * @param policyDetails The configuration details of the lifecycle policy.
     *
     * If you create a default policy, you can specify the request parameters either in the request
     * body, or in the PolicyDetails request structure, but not both.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("5204ac81e405747abb77284012e4de45256ef9506230380e55e19318b7e777e4")
    public
        fun policyDetails(policyDetails: CfnLifecyclePolicy.PolicyDetailsProperty.Builder.() -> Unit)

    /**
     * @param retainInterval *[Default policies only]* Specifies how long the policy should retain
     * snapshots or AMIs before deleting them.
     * The retention period can range from 2 to 14 days, but it must be greater than the creation
     * frequency to ensure that the policy retains at least 1 snapshot or AMI at any given time. If you
     * do not specify a value, the default is 7.
     *
     * Default: 7
     */
    public fun retainInterval(retainInterval: Number)

    /**
     * @param state The activation state of the lifecycle policy.
     */
    public fun state(state: String)

    /**
     * @param tags The tags to apply to the lifecycle policy during creation.
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * @param tags The tags to apply to the lifecycle policy during creation.
     */
    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.dlm.CfnLifecyclePolicyProps.Builder =
        software.amazon.awscdk.services.dlm.CfnLifecyclePolicyProps.builder()

    /**
     * @param copyTags *[Default policies only]* Indicates whether the policy should copy tags from
     * the source resource to the snapshot or AMI.
     * If you do not specify a value, the default is `false` .
     *
     * Default: false
     */
    override fun copyTags(copyTags: Boolean) {
      cdkBuilder.copyTags(copyTags)
    }

    /**
     * @param copyTags *[Default policies only]* Indicates whether the policy should copy tags from
     * the source resource to the snapshot or AMI.
     * If you do not specify a value, the default is `false` .
     *
     * Default: false
     */
    override fun copyTags(copyTags: IResolvable) {
      cdkBuilder.copyTags(copyTags.let(IResolvable::unwrap))
    }

    /**
     * @param createInterval *[Default policies only]* Specifies how often the policy should run and
     * create snapshots or AMIs.
     * The creation frequency can range from 1 to 7 days. If you do not specify a value, the default
     * is 1.
     *
     * Default: 1
     */
    override fun createInterval(createInterval: Number) {
      cdkBuilder.createInterval(createInterval)
    }

    /**
     * @param crossRegionCopyTargets *[Default policies only]* Specifies destination Regions for
     * snapshot or AMI copies.
     * You can specify up to 3 destination Regions. If you do not want to create cross-Region
     * copies, omit this parameter.
     */
    override fun crossRegionCopyTargets(crossRegionCopyTargets: Any) {
      cdkBuilder.crossRegionCopyTargets(crossRegionCopyTargets)
    }

    /**
     * @param defaultPolicy *[Default policies only]* Specify the type of default policy to create.
     * * To create a default policy for EBS snapshots, that creates snapshots of all volumes in the
     * Region that do not have recent backups, specify `VOLUME` .
     * * To create a default policy for EBS-backed AMIs, that creates EBS-backed AMIs from all
     * instances in the Region that do not have recent backups, specify `INSTANCE` .
     */
    override fun defaultPolicy(defaultPolicy: String) {
      cdkBuilder.defaultPolicy(defaultPolicy)
    }

    /**
     * @param description A description of the lifecycle policy.
     * The characters ^[0-9A-Za-z _-]+$ are supported.
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * @param exclusions *[Default policies only]* Specifies exclusion parameters for volumes or
     * instances for which you do not want to create snapshots or AMIs.
     * The policy will not create snapshots or AMIs for target resources that match any of the
     * specified exclusion parameters.
     */
    override fun exclusions(exclusions: IResolvable) {
      cdkBuilder.exclusions(exclusions.let(IResolvable::unwrap))
    }

    /**
     * @param exclusions *[Default policies only]* Specifies exclusion parameters for volumes or
     * instances for which you do not want to create snapshots or AMIs.
     * The policy will not create snapshots or AMIs for target resources that match any of the
     * specified exclusion parameters.
     */
    override fun exclusions(exclusions: CfnLifecyclePolicy.ExclusionsProperty) {
      cdkBuilder.exclusions(exclusions.let(CfnLifecyclePolicy.ExclusionsProperty::unwrap))
    }

    /**
     * @param exclusions *[Default policies only]* Specifies exclusion parameters for volumes or
     * instances for which you do not want to create snapshots or AMIs.
     * The policy will not create snapshots or AMIs for target resources that match any of the
     * specified exclusion parameters.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("91eb417783a1960b864c154099899d6b138c5d6554ddce6485b9977155f17115")
    override fun exclusions(exclusions: CfnLifecyclePolicy.ExclusionsProperty.Builder.() -> Unit):
        Unit = exclusions(CfnLifecyclePolicy.ExclusionsProperty(exclusions))

    /**
     * @param executionRoleArn The Amazon Resource Name (ARN) of the IAM role used to run the
     * operations specified by the lifecycle policy.
     */
    override fun executionRoleArn(executionRoleArn: String) {
      cdkBuilder.executionRoleArn(executionRoleArn)
    }

    /**
     * @param extendDeletion *[Default policies only]* Defines the snapshot or AMI retention
     * behavior for the policy if the source volume or instance is deleted, or if the policy enters the
     * error, disabled, or deleted state.
     * By default ( *ExtendDeletion=false* ):
     *
     * * If a source resource is deleted, Amazon Data Lifecycle Manager will continue to delete
     * previously created snapshots or AMIs, up to but not including the last one, based on the
     * specified retention period. If you want Amazon Data Lifecycle Manager to delete all snapshots or
     * AMIs, including the last one, specify `true` .
     * * If a policy enters the error, disabled, or deleted state, Amazon Data Lifecycle Manager
     * stops deleting snapshots and AMIs. If you want Amazon Data Lifecycle Manager to continue
     * deleting snapshots or AMIs, including the last one, if the policy enters one of these states,
     * specify `true` .
     *
     * If you enable extended deletion ( *ExtendDeletion=true* ), you override both default
     * behaviors simultaneously.
     *
     * If you do not specify a value, the default is `false` .
     *
     * Default: false
     */
    override fun extendDeletion(extendDeletion: Boolean) {
      cdkBuilder.extendDeletion(extendDeletion)
    }

    /**
     * @param extendDeletion *[Default policies only]* Defines the snapshot or AMI retention
     * behavior for the policy if the source volume or instance is deleted, or if the policy enters the
     * error, disabled, or deleted state.
     * By default ( *ExtendDeletion=false* ):
     *
     * * If a source resource is deleted, Amazon Data Lifecycle Manager will continue to delete
     * previously created snapshots or AMIs, up to but not including the last one, based on the
     * specified retention period. If you want Amazon Data Lifecycle Manager to delete all snapshots or
     * AMIs, including the last one, specify `true` .
     * * If a policy enters the error, disabled, or deleted state, Amazon Data Lifecycle Manager
     * stops deleting snapshots and AMIs. If you want Amazon Data Lifecycle Manager to continue
     * deleting snapshots or AMIs, including the last one, if the policy enters one of these states,
     * specify `true` .
     *
     * If you enable extended deletion ( *ExtendDeletion=true* ), you override both default
     * behaviors simultaneously.
     *
     * If you do not specify a value, the default is `false` .
     *
     * Default: false
     */
    override fun extendDeletion(extendDeletion: IResolvable) {
      cdkBuilder.extendDeletion(extendDeletion.let(IResolvable::unwrap))
    }

    /**
     * @param policyDetails The configuration details of the lifecycle policy.
     *
     * If you create a default policy, you can specify the request parameters either in the request
     * body, or in the PolicyDetails request structure, but not both.
     */
    override fun policyDetails(policyDetails: IResolvable) {
      cdkBuilder.policyDetails(policyDetails.let(IResolvable::unwrap))
    }

    /**
     * @param policyDetails The configuration details of the lifecycle policy.
     *
     * If you create a default policy, you can specify the request parameters either in the request
     * body, or in the PolicyDetails request structure, but not both.
     */
    override fun policyDetails(policyDetails: CfnLifecyclePolicy.PolicyDetailsProperty) {
      cdkBuilder.policyDetails(policyDetails.let(CfnLifecyclePolicy.PolicyDetailsProperty::unwrap))
    }

    /**
     * @param policyDetails The configuration details of the lifecycle policy.
     *
     * If you create a default policy, you can specify the request parameters either in the request
     * body, or in the PolicyDetails request structure, but not both.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("5204ac81e405747abb77284012e4de45256ef9506230380e55e19318b7e777e4")
    override
        fun policyDetails(policyDetails: CfnLifecyclePolicy.PolicyDetailsProperty.Builder.() -> Unit):
        Unit = policyDetails(CfnLifecyclePolicy.PolicyDetailsProperty(policyDetails))

    /**
     * @param retainInterval *[Default policies only]* Specifies how long the policy should retain
     * snapshots or AMIs before deleting them.
     * The retention period can range from 2 to 14 days, but it must be greater than the creation
     * frequency to ensure that the policy retains at least 1 snapshot or AMI at any given time. If you
     * do not specify a value, the default is 7.
     *
     * Default: 7
     */
    override fun retainInterval(retainInterval: Number) {
      cdkBuilder.retainInterval(retainInterval)
    }

    /**
     * @param state The activation state of the lifecycle policy.
     */
    override fun state(state: String) {
      cdkBuilder.state(state)
    }

    /**
     * @param tags The tags to apply to the lifecycle policy during creation.
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    /**
     * @param tags The tags to apply to the lifecycle policy during creation.
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.dlm.CfnLifecyclePolicyProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.dlm.CfnLifecyclePolicyProps,
  ) : CdkObject(cdkObject), CfnLifecyclePolicyProps {
    /**
     * *[Default policies only]* Indicates whether the policy should copy tags from the source
     * resource to the snapshot or AMI.
     *
     * If you do not specify a value, the default is `false` .
     *
     * Default: false
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dlm-lifecyclepolicy.html#cfn-dlm-lifecyclepolicy-copytags)
     */
    override fun copyTags(): Any? = unwrap(this).getCopyTags()

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
     */
    override fun createInterval(): Number? = unwrap(this).getCreateInterval()

    /**
     * *[Default policies only]* Specifies destination Regions for snapshot or AMI copies.
     *
     * You can specify up to 3 destination Regions. If you do not want to create cross-Region
     * copies, omit this parameter.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dlm-lifecyclepolicy.html#cfn-dlm-lifecyclepolicy-crossregioncopytargets)
     */
    override fun crossRegionCopyTargets(): Any? = unwrap(this).getCrossRegionCopyTargets()

    /**
     * *[Default policies only]* Specify the type of default policy to create.
     *
     * * To create a default policy for EBS snapshots, that creates snapshots of all volumes in the
     * Region that do not have recent backups, specify `VOLUME` .
     * * To create a default policy for EBS-backed AMIs, that creates EBS-backed AMIs from all
     * instances in the Region that do not have recent backups, specify `INSTANCE` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dlm-lifecyclepolicy.html#cfn-dlm-lifecyclepolicy-defaultpolicy)
     */
    override fun defaultPolicy(): String? = unwrap(this).getDefaultPolicy()

    /**
     * A description of the lifecycle policy.
     *
     * The characters ^[0-9A-Za-z _-]+$ are supported.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dlm-lifecyclepolicy.html#cfn-dlm-lifecyclepolicy-description)
     */
    override fun description(): String? = unwrap(this).getDescription()

    /**
     * *[Default policies only]* Specifies exclusion parameters for volumes or instances for which
     * you do not want to create snapshots or AMIs.
     *
     * The policy will not create snapshots or AMIs for target resources that match any of the
     * specified exclusion parameters.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dlm-lifecyclepolicy.html#cfn-dlm-lifecyclepolicy-exclusions)
     */
    override fun exclusions(): Any? = unwrap(this).getExclusions()

    /**
     * The Amazon Resource Name (ARN) of the IAM role used to run the operations specified by the
     * lifecycle policy.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dlm-lifecyclepolicy.html#cfn-dlm-lifecyclepolicy-executionrolearn)
     */
    override fun executionRoleArn(): String? = unwrap(this).getExecutionRoleArn()

    /**
     * *[Default policies only]* Defines the snapshot or AMI retention behavior for the policy if
     * the source volume or instance is deleted, or if the policy enters the error, disabled, or
     * deleted state.
     *
     * By default ( *ExtendDeletion=false* ):
     *
     * * If a source resource is deleted, Amazon Data Lifecycle Manager will continue to delete
     * previously created snapshots or AMIs, up to but not including the last one, based on the
     * specified retention period. If you want Amazon Data Lifecycle Manager to delete all snapshots or
     * AMIs, including the last one, specify `true` .
     * * If a policy enters the error, disabled, or deleted state, Amazon Data Lifecycle Manager
     * stops deleting snapshots and AMIs. If you want Amazon Data Lifecycle Manager to continue
     * deleting snapshots or AMIs, including the last one, if the policy enters one of these states,
     * specify `true` .
     *
     * If you enable extended deletion ( *ExtendDeletion=true* ), you override both default
     * behaviors simultaneously.
     *
     * If you do not specify a value, the default is `false` .
     *
     * Default: false
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dlm-lifecyclepolicy.html#cfn-dlm-lifecyclepolicy-extenddeletion)
     */
    override fun extendDeletion(): Any? = unwrap(this).getExtendDeletion()

    /**
     * The configuration details of the lifecycle policy.
     *
     *
     * If you create a default policy, you can specify the request parameters either in the request
     * body, or in the PolicyDetails request structure, but not both.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dlm-lifecyclepolicy.html#cfn-dlm-lifecyclepolicy-policydetails)
     */
    override fun policyDetails(): Any? = unwrap(this).getPolicyDetails()

    /**
     * *[Default policies only]* Specifies how long the policy should retain snapshots or AMIs
     * before deleting them.
     *
     * The retention period can range from 2 to 14 days, but it must be greater than the creation
     * frequency to ensure that the policy retains at least 1 snapshot or AMI at any given time. If you
     * do not specify a value, the default is 7.
     *
     * Default: 7
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dlm-lifecyclepolicy.html#cfn-dlm-lifecyclepolicy-retaininterval)
     */
    override fun retainInterval(): Number? = unwrap(this).getRetainInterval()

    /**
     * The activation state of the lifecycle policy.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dlm-lifecyclepolicy.html#cfn-dlm-lifecyclepolicy-state)
     */
    override fun state(): String? = unwrap(this).getState()

    /**
     * The tags to apply to the lifecycle policy during creation.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dlm-lifecyclepolicy.html#cfn-dlm-lifecyclepolicy-tags)
     */
    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnLifecyclePolicyProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.dlm.CfnLifecyclePolicyProps):
        CfnLifecyclePolicyProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnLifecyclePolicyProps):
        software.amazon.awscdk.services.dlm.CfnLifecyclePolicyProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.dlm.CfnLifecyclePolicyProps
  }
}
