@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.dlm

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.ITaggable
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

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
 * import io.cloudshiftdev.awscdk.services.dlm.*;
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
public open class CfnLifecyclePolicy internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.dlm.CfnLifecyclePolicy,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  public constructor(scope: CloudshiftdevConstructsConstruct, id: String) :
      this(software.amazon.awscdk.services.dlm.CfnLifecyclePolicy(scope.let(CloudshiftdevConstructsConstruct::unwrap),
      id)
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnLifecyclePolicyProps,
  ) :
      this(software.amazon.awscdk.services.dlm.CfnLifecyclePolicy(scope.let(CloudshiftdevConstructsConstruct::unwrap),
      id, props.let(CfnLifecyclePolicyProps::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnLifecyclePolicyProps.Builder.() -> Unit,
  ) : this(scope, id, CfnLifecyclePolicyProps(props)
  )

  /**
   * The Amazon Resource Name (ARN) of the lifecycle policy.
   */
  public open fun attrArn(): String = unwrap(this).getAttrArn()

  /**
   *
   */
  public open fun attrId(): String = unwrap(this).getAttrId()

  /**
   * *[Default policies only]* Indicates whether the policy should copy tags from the source
   * resource to the snapshot or AMI.
   */
  public open fun copyTags(): Any? = unwrap(this).getCopyTags()

  /**
   * *[Default policies only]* Indicates whether the policy should copy tags from the source
   * resource to the snapshot or AMI.
   */
  public open fun copyTags(`value`: Boolean) {
    unwrap(this).setCopyTags(`value`)
  }

  /**
   * *[Default policies only]* Indicates whether the policy should copy tags from the source
   * resource to the snapshot or AMI.
   */
  public open fun copyTags(`value`: IResolvable) {
    unwrap(this).setCopyTags(`value`.let(IResolvable::unwrap))
  }

  /**
   * *[Default policies only]* Specifies how often the policy should run and create snapshots or
   * AMIs.
   */
  public open fun createInterval(): Number? = unwrap(this).getCreateInterval()

  /**
   * *[Default policies only]* Specifies how often the policy should run and create snapshots or
   * AMIs.
   */
  public open fun createInterval(`value`: Number) {
    unwrap(this).setCreateInterval(`value`)
  }

  /**
   * *[Default policies only]* Specifies destination Regions for snapshot or AMI copies.
   */
  public open fun crossRegionCopyTargets(): Any? = unwrap(this).getCrossRegionCopyTargets()

  /**
   * *[Default policies only]* Specifies destination Regions for snapshot or AMI copies.
   */
  public open fun crossRegionCopyTargets(`value`: Any) {
    unwrap(this).setCrossRegionCopyTargets(`value`)
  }

  /**
   * *[Default policies only]* Specify the type of default policy to create.
   */
  public open fun defaultPolicy(): String? = unwrap(this).getDefaultPolicy()

  /**
   * *[Default policies only]* Specify the type of default policy to create.
   */
  public open fun defaultPolicy(`value`: String) {
    unwrap(this).setDefaultPolicy(`value`)
  }

  /**
   * A description of the lifecycle policy.
   */
  public open fun description(): String? = unwrap(this).getDescription()

  /**
   * A description of the lifecycle policy.
   */
  public open fun description(`value`: String) {
    unwrap(this).setDescription(`value`)
  }

  /**
   * *[Default policies only]* Specifies exclusion parameters for volumes or instances for which you
   * do not want to create snapshots or AMIs.
   */
  public open fun exclusions(): Any? = unwrap(this).getExclusions()

  /**
   * *[Default policies only]* Specifies exclusion parameters for volumes or instances for which you
   * do not want to create snapshots or AMIs.
   */
  public open fun exclusions(`value`: IResolvable) {
    unwrap(this).setExclusions(`value`.let(IResolvable::unwrap))
  }

  /**
   * *[Default policies only]* Specifies exclusion parameters for volumes or instances for which you
   * do not want to create snapshots or AMIs.
   */
  public open fun exclusions(`value`: ExclusionsProperty) {
    unwrap(this).setExclusions(`value`.let(ExclusionsProperty::unwrap))
  }

  /**
   * *[Default policies only]* Specifies exclusion parameters for volumes or instances for which you
   * do not want to create snapshots or AMIs.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("228fc02e5b97990ae25414c79f1039857584d5d1f8f890ad467e3ae1ece0f7cf")
  public open fun exclusions(`value`: ExclusionsProperty.Builder.() -> Unit): Unit =
      exclusions(ExclusionsProperty(`value`))

  /**
   * The Amazon Resource Name (ARN) of the IAM role used to run the operations specified by the
   * lifecycle policy.
   */
  public open fun executionRoleArn(): String? = unwrap(this).getExecutionRoleArn()

  /**
   * The Amazon Resource Name (ARN) of the IAM role used to run the operations specified by the
   * lifecycle policy.
   */
  public open fun executionRoleArn(`value`: String) {
    unwrap(this).setExecutionRoleArn(`value`)
  }

  /**
   * *[Default policies only]* Defines the snapshot or AMI retention behavior for the policy if the
   * source volume or instance is deleted, or if the policy enters the error, disabled, or deleted
   * state.
   */
  public open fun extendDeletion(): Any? = unwrap(this).getExtendDeletion()

  /**
   * *[Default policies only]* Defines the snapshot or AMI retention behavior for the policy if the
   * source volume or instance is deleted, or if the policy enters the error, disabled, or deleted
   * state.
   */
  public open fun extendDeletion(`value`: Boolean) {
    unwrap(this).setExtendDeletion(`value`)
  }

  /**
   * *[Default policies only]* Defines the snapshot or AMI retention behavior for the policy if the
   * source volume or instance is deleted, or if the policy enters the error, disabled, or deleted
   * state.
   */
  public open fun extendDeletion(`value`: IResolvable) {
    unwrap(this).setExtendDeletion(`value`.let(IResolvable::unwrap))
  }

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  /**
   * The configuration details of the lifecycle policy.
   */
  public open fun policyDetails(): Any? = unwrap(this).getPolicyDetails()

  /**
   * The configuration details of the lifecycle policy.
   */
  public open fun policyDetails(`value`: IResolvable) {
    unwrap(this).setPolicyDetails(`value`.let(IResolvable::unwrap))
  }

  /**
   * The configuration details of the lifecycle policy.
   */
  public open fun policyDetails(`value`: PolicyDetailsProperty) {
    unwrap(this).setPolicyDetails(`value`.let(PolicyDetailsProperty::unwrap))
  }

  /**
   * The configuration details of the lifecycle policy.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("128675c943961d271f3fb394ef7023f53a5b1b3096974918ad853370acb0b295")
  public open fun policyDetails(`value`: PolicyDetailsProperty.Builder.() -> Unit): Unit =
      policyDetails(PolicyDetailsProperty(`value`))

  /**
   * *[Default policies only]* Specifies how long the policy should retain snapshots or AMIs before
   * deleting them.
   */
  public open fun retainInterval(): Number? = unwrap(this).getRetainInterval()

  /**
   * *[Default policies only]* Specifies how long the policy should retain snapshots or AMIs before
   * deleting them.
   */
  public open fun retainInterval(`value`: Number) {
    unwrap(this).setRetainInterval(`value`)
  }

  /**
   * The activation state of the lifecycle policy.
   */
  public open fun state(): String? = unwrap(this).getState()

  /**
   * The activation state of the lifecycle policy.
   */
  public open fun state(`value`: String) {
    unwrap(this).setState(`value`)
  }

  /**
   * Tag Manager which manages the tags for this resource.
   */
  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  /**
   * The tags to apply to the lifecycle policy during creation.
   */
  public open fun tagsRaw(): List<CfnTag> = unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?:
      emptyList()

  /**
   * The tags to apply to the lifecycle policy during creation.
   */
  public open fun tagsRaw(`value`: List<CfnTag>) {
    unwrap(this).setTagsRaw(`value`.map(CfnTag::unwrap))
  }

  /**
   * The tags to apply to the lifecycle policy during creation.
   */
  public open fun tagsRaw(vararg `value`: CfnTag): Unit = tagsRaw(`value`.toList())

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.dlm.CfnLifecyclePolicy].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * *[Default policies only]* Indicates whether the policy should copy tags from the source
     * resource to the snapshot or AMI.
     *
     * If you do not specify a value, the default is `false` .
     *
     * Default: false
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dlm-lifecyclepolicy.html#cfn-dlm-lifecyclepolicy-copytags)
     * @param copyTags *[Default policies only]* Indicates whether the policy should copy tags from
     * the source resource to the snapshot or AMI. 
     */
    public fun copyTags(copyTags: Boolean)

    /**
     * *[Default policies only]* Indicates whether the policy should copy tags from the source
     * resource to the snapshot or AMI.
     *
     * If you do not specify a value, the default is `false` .
     *
     * Default: false
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dlm-lifecyclepolicy.html#cfn-dlm-lifecyclepolicy-copytags)
     * @param copyTags *[Default policies only]* Indicates whether the policy should copy tags from
     * the source resource to the snapshot or AMI. 
     */
    public fun copyTags(copyTags: IResolvable)

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
     * @param createInterval *[Default policies only]* Specifies how often the policy should run and
     * create snapshots or AMIs. 
     */
    public fun createInterval(createInterval: Number)

    /**
     * *[Default policies only]* Specifies destination Regions for snapshot or AMI copies.
     *
     * You can specify up to 3 destination Regions. If you do not want to create cross-Region
     * copies, omit this parameter.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dlm-lifecyclepolicy.html#cfn-dlm-lifecyclepolicy-crossregioncopytargets)
     * @param crossRegionCopyTargets *[Default policies only]* Specifies destination Regions for
     * snapshot or AMI copies. 
     */
    public fun crossRegionCopyTargets(crossRegionCopyTargets: Any)

    /**
     * *[Default policies only]* Specify the type of default policy to create.
     *
     * * To create a default policy for EBS snapshots, that creates snapshots of all volumes in the
     * Region that do not have recent backups, specify `VOLUME` .
     * * To create a default policy for EBS-backed AMIs, that creates EBS-backed AMIs from all
     * instances in the Region that do not have recent backups, specify `INSTANCE` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dlm-lifecyclepolicy.html#cfn-dlm-lifecyclepolicy-defaultpolicy)
     * @param defaultPolicy *[Default policies only]* Specify the type of default policy to create. 
     */
    public fun defaultPolicy(defaultPolicy: String)

    /**
     * A description of the lifecycle policy.
     *
     * The characters ^[0-9A-Za-z _-]+$ are supported.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dlm-lifecyclepolicy.html#cfn-dlm-lifecyclepolicy-description)
     * @param description A description of the lifecycle policy. 
     */
    public fun description(description: String)

    /**
     * *[Default policies only]* Specifies exclusion parameters for volumes or instances for which
     * you do not want to create snapshots or AMIs.
     *
     * The policy will not create snapshots or AMIs for target resources that match any of the
     * specified exclusion parameters.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dlm-lifecyclepolicy.html#cfn-dlm-lifecyclepolicy-exclusions)
     * @param exclusions *[Default policies only]* Specifies exclusion parameters for volumes or
     * instances for which you do not want to create snapshots or AMIs. 
     */
    public fun exclusions(exclusions: IResolvable)

    /**
     * *[Default policies only]* Specifies exclusion parameters for volumes or instances for which
     * you do not want to create snapshots or AMIs.
     *
     * The policy will not create snapshots or AMIs for target resources that match any of the
     * specified exclusion parameters.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dlm-lifecyclepolicy.html#cfn-dlm-lifecyclepolicy-exclusions)
     * @param exclusions *[Default policies only]* Specifies exclusion parameters for volumes or
     * instances for which you do not want to create snapshots or AMIs. 
     */
    public fun exclusions(exclusions: ExclusionsProperty)

    /**
     * *[Default policies only]* Specifies exclusion parameters for volumes or instances for which
     * you do not want to create snapshots or AMIs.
     *
     * The policy will not create snapshots or AMIs for target resources that match any of the
     * specified exclusion parameters.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dlm-lifecyclepolicy.html#cfn-dlm-lifecyclepolicy-exclusions)
     * @param exclusions *[Default policies only]* Specifies exclusion parameters for volumes or
     * instances for which you do not want to create snapshots or AMIs. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("417e5709901c173f3458bad230ac75cfff8db50ed3b536d683412a8e62a76d22")
    public fun exclusions(exclusions: ExclusionsProperty.Builder.() -> Unit)

    /**
     * The Amazon Resource Name (ARN) of the IAM role used to run the operations specified by the
     * lifecycle policy.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dlm-lifecyclepolicy.html#cfn-dlm-lifecyclepolicy-executionrolearn)
     * @param executionRoleArn The Amazon Resource Name (ARN) of the IAM role used to run the
     * operations specified by the lifecycle policy. 
     */
    public fun executionRoleArn(executionRoleArn: String)

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
     * @param extendDeletion *[Default policies only]* Defines the snapshot or AMI retention
     * behavior for the policy if the source volume or instance is deleted, or if the policy enters the
     * error, disabled, or deleted state. 
     */
    public fun extendDeletion(extendDeletion: Boolean)

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
     * @param extendDeletion *[Default policies only]* Defines the snapshot or AMI retention
     * behavior for the policy if the source volume or instance is deleted, or if the policy enters the
     * error, disabled, or deleted state. 
     */
    public fun extendDeletion(extendDeletion: IResolvable)

    /**
     * The configuration details of the lifecycle policy.
     *
     *
     * If you create a default policy, you can specify the request parameters either in the request
     * body, or in the PolicyDetails request structure, but not both.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dlm-lifecyclepolicy.html#cfn-dlm-lifecyclepolicy-policydetails)
     * @param policyDetails The configuration details of the lifecycle policy. 
     */
    public fun policyDetails(policyDetails: IResolvable)

    /**
     * The configuration details of the lifecycle policy.
     *
     *
     * If you create a default policy, you can specify the request parameters either in the request
     * body, or in the PolicyDetails request structure, but not both.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dlm-lifecyclepolicy.html#cfn-dlm-lifecyclepolicy-policydetails)
     * @param policyDetails The configuration details of the lifecycle policy. 
     */
    public fun policyDetails(policyDetails: PolicyDetailsProperty)

    /**
     * The configuration details of the lifecycle policy.
     *
     *
     * If you create a default policy, you can specify the request parameters either in the request
     * body, or in the PolicyDetails request structure, but not both.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dlm-lifecyclepolicy.html#cfn-dlm-lifecyclepolicy-policydetails)
     * @param policyDetails The configuration details of the lifecycle policy. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("ddf21f53e23f44a93e1aa8317fd8f4e69e074d10761bd83c4869006ef3c64f76")
    public fun policyDetails(policyDetails: PolicyDetailsProperty.Builder.() -> Unit)

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
     * @param retainInterval *[Default policies only]* Specifies how long the policy should retain
     * snapshots or AMIs before deleting them. 
     */
    public fun retainInterval(retainInterval: Number)

    /**
     * The activation state of the lifecycle policy.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dlm-lifecyclepolicy.html#cfn-dlm-lifecyclepolicy-state)
     * @param state The activation state of the lifecycle policy. 
     */
    public fun state(state: String)

    /**
     * The tags to apply to the lifecycle policy during creation.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dlm-lifecyclepolicy.html#cfn-dlm-lifecyclepolicy-tags)
     * @param tags The tags to apply to the lifecycle policy during creation. 
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * The tags to apply to the lifecycle policy during creation.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dlm-lifecyclepolicy.html#cfn-dlm-lifecyclepolicy-tags)
     * @param tags The tags to apply to the lifecycle policy during creation. 
     */
    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.dlm.CfnLifecyclePolicy.Builder =
        software.amazon.awscdk.services.dlm.CfnLifecyclePolicy.Builder.create(scope, id)

    /**
     * *[Default policies only]* Indicates whether the policy should copy tags from the source
     * resource to the snapshot or AMI.
     *
     * If you do not specify a value, the default is `false` .
     *
     * Default: false
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dlm-lifecyclepolicy.html#cfn-dlm-lifecyclepolicy-copytags)
     * @param copyTags *[Default policies only]* Indicates whether the policy should copy tags from
     * the source resource to the snapshot or AMI. 
     */
    override fun copyTags(copyTags: Boolean) {
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
     * @param copyTags *[Default policies only]* Indicates whether the policy should copy tags from
     * the source resource to the snapshot or AMI. 
     */
    override fun copyTags(copyTags: IResolvable) {
      cdkBuilder.copyTags(copyTags.let(IResolvable::unwrap))
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
     * @param createInterval *[Default policies only]* Specifies how often the policy should run and
     * create snapshots or AMIs. 
     */
    override fun createInterval(createInterval: Number) {
      cdkBuilder.createInterval(createInterval)
    }

    /**
     * *[Default policies only]* Specifies destination Regions for snapshot or AMI copies.
     *
     * You can specify up to 3 destination Regions. If you do not want to create cross-Region
     * copies, omit this parameter.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dlm-lifecyclepolicy.html#cfn-dlm-lifecyclepolicy-crossregioncopytargets)
     * @param crossRegionCopyTargets *[Default policies only]* Specifies destination Regions for
     * snapshot or AMI copies. 
     */
    override fun crossRegionCopyTargets(crossRegionCopyTargets: Any) {
      cdkBuilder.crossRegionCopyTargets(crossRegionCopyTargets)
    }

    /**
     * *[Default policies only]* Specify the type of default policy to create.
     *
     * * To create a default policy for EBS snapshots, that creates snapshots of all volumes in the
     * Region that do not have recent backups, specify `VOLUME` .
     * * To create a default policy for EBS-backed AMIs, that creates EBS-backed AMIs from all
     * instances in the Region that do not have recent backups, specify `INSTANCE` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dlm-lifecyclepolicy.html#cfn-dlm-lifecyclepolicy-defaultpolicy)
     * @param defaultPolicy *[Default policies only]* Specify the type of default policy to create. 
     */
    override fun defaultPolicy(defaultPolicy: String) {
      cdkBuilder.defaultPolicy(defaultPolicy)
    }

    /**
     * A description of the lifecycle policy.
     *
     * The characters ^[0-9A-Za-z _-]+$ are supported.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dlm-lifecyclepolicy.html#cfn-dlm-lifecyclepolicy-description)
     * @param description A description of the lifecycle policy. 
     */
    override fun description(description: String) {
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
     * @param exclusions *[Default policies only]* Specifies exclusion parameters for volumes or
     * instances for which you do not want to create snapshots or AMIs. 
     */
    override fun exclusions(exclusions: IResolvable) {
      cdkBuilder.exclusions(exclusions.let(IResolvable::unwrap))
    }

    /**
     * *[Default policies only]* Specifies exclusion parameters for volumes or instances for which
     * you do not want to create snapshots or AMIs.
     *
     * The policy will not create snapshots or AMIs for target resources that match any of the
     * specified exclusion parameters.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dlm-lifecyclepolicy.html#cfn-dlm-lifecyclepolicy-exclusions)
     * @param exclusions *[Default policies only]* Specifies exclusion parameters for volumes or
     * instances for which you do not want to create snapshots or AMIs. 
     */
    override fun exclusions(exclusions: ExclusionsProperty) {
      cdkBuilder.exclusions(exclusions.let(ExclusionsProperty::unwrap))
    }

    /**
     * *[Default policies only]* Specifies exclusion parameters for volumes or instances for which
     * you do not want to create snapshots or AMIs.
     *
     * The policy will not create snapshots or AMIs for target resources that match any of the
     * specified exclusion parameters.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dlm-lifecyclepolicy.html#cfn-dlm-lifecyclepolicy-exclusions)
     * @param exclusions *[Default policies only]* Specifies exclusion parameters for volumes or
     * instances for which you do not want to create snapshots or AMIs. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("417e5709901c173f3458bad230ac75cfff8db50ed3b536d683412a8e62a76d22")
    override fun exclusions(exclusions: ExclusionsProperty.Builder.() -> Unit): Unit =
        exclusions(ExclusionsProperty(exclusions))

    /**
     * The Amazon Resource Name (ARN) of the IAM role used to run the operations specified by the
     * lifecycle policy.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dlm-lifecyclepolicy.html#cfn-dlm-lifecyclepolicy-executionrolearn)
     * @param executionRoleArn The Amazon Resource Name (ARN) of the IAM role used to run the
     * operations specified by the lifecycle policy. 
     */
    override fun executionRoleArn(executionRoleArn: String) {
      cdkBuilder.executionRoleArn(executionRoleArn)
    }

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
     * @param extendDeletion *[Default policies only]* Defines the snapshot or AMI retention
     * behavior for the policy if the source volume or instance is deleted, or if the policy enters the
     * error, disabled, or deleted state. 
     */
    override fun extendDeletion(extendDeletion: Boolean) {
      cdkBuilder.extendDeletion(extendDeletion)
    }

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
     * @param extendDeletion *[Default policies only]* Defines the snapshot or AMI retention
     * behavior for the policy if the source volume or instance is deleted, or if the policy enters the
     * error, disabled, or deleted state. 
     */
    override fun extendDeletion(extendDeletion: IResolvable) {
      cdkBuilder.extendDeletion(extendDeletion.let(IResolvable::unwrap))
    }

    /**
     * The configuration details of the lifecycle policy.
     *
     *
     * If you create a default policy, you can specify the request parameters either in the request
     * body, or in the PolicyDetails request structure, but not both.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dlm-lifecyclepolicy.html#cfn-dlm-lifecyclepolicy-policydetails)
     * @param policyDetails The configuration details of the lifecycle policy. 
     */
    override fun policyDetails(policyDetails: IResolvable) {
      cdkBuilder.policyDetails(policyDetails.let(IResolvable::unwrap))
    }

    /**
     * The configuration details of the lifecycle policy.
     *
     *
     * If you create a default policy, you can specify the request parameters either in the request
     * body, or in the PolicyDetails request structure, but not both.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dlm-lifecyclepolicy.html#cfn-dlm-lifecyclepolicy-policydetails)
     * @param policyDetails The configuration details of the lifecycle policy. 
     */
    override fun policyDetails(policyDetails: PolicyDetailsProperty) {
      cdkBuilder.policyDetails(policyDetails.let(PolicyDetailsProperty::unwrap))
    }

    /**
     * The configuration details of the lifecycle policy.
     *
     *
     * If you create a default policy, you can specify the request parameters either in the request
     * body, or in the PolicyDetails request structure, but not both.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dlm-lifecyclepolicy.html#cfn-dlm-lifecyclepolicy-policydetails)
     * @param policyDetails The configuration details of the lifecycle policy. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("ddf21f53e23f44a93e1aa8317fd8f4e69e074d10761bd83c4869006ef3c64f76")
    override fun policyDetails(policyDetails: PolicyDetailsProperty.Builder.() -> Unit): Unit =
        policyDetails(PolicyDetailsProperty(policyDetails))

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
     * @param retainInterval *[Default policies only]* Specifies how long the policy should retain
     * snapshots or AMIs before deleting them. 
     */
    override fun retainInterval(retainInterval: Number) {
      cdkBuilder.retainInterval(retainInterval)
    }

    /**
     * The activation state of the lifecycle policy.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dlm-lifecyclepolicy.html#cfn-dlm-lifecyclepolicy-state)
     * @param state The activation state of the lifecycle policy. 
     */
    override fun state(state: String) {
      cdkBuilder.state(state)
    }

    /**
     * The tags to apply to the lifecycle policy during creation.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dlm-lifecyclepolicy.html#cfn-dlm-lifecyclepolicy-tags)
     * @param tags The tags to apply to the lifecycle policy during creation. 
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    /**
     * The tags to apply to the lifecycle policy during creation.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dlm-lifecyclepolicy.html#cfn-dlm-lifecyclepolicy-tags)
     * @param tags The tags to apply to the lifecycle policy during creation. 
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.dlm.CfnLifecyclePolicy = cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.dlm.CfnLifecyclePolicy.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnLifecyclePolicy {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnLifecyclePolicy(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.dlm.CfnLifecyclePolicy):
        CfnLifecyclePolicy = CfnLifecyclePolicy(cdkObject)

    internal fun unwrap(wrapped: CfnLifecyclePolicy):
        software.amazon.awscdk.services.dlm.CfnLifecyclePolicy = wrapped.cdkObject
  }

  /**
   * *[Event-based policies only]* Specifies an action for an event-based policy.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.dlm.*;
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
  public interface ActionProperty {
    /**
     * The rule for copying shared snapshots across Regions.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dlm-lifecyclepolicy-action.html#cfn-dlm-lifecyclepolicy-action-crossregioncopy)
     */
    public fun crossRegionCopy(): Any

    /**
     * A descriptive name for the action.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dlm-lifecyclepolicy-action.html#cfn-dlm-lifecyclepolicy-action-name)
     */
    public fun name(): String

    /**
     * A builder for [ActionProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param crossRegionCopy The rule for copying shared snapshots across Regions. 
       */
      public fun crossRegionCopy(crossRegionCopy: IResolvable)

      /**
       * @param crossRegionCopy The rule for copying shared snapshots across Regions. 
       */
      public fun crossRegionCopy(crossRegionCopy: List<Any>)

      /**
       * @param crossRegionCopy The rule for copying shared snapshots across Regions. 
       */
      public fun crossRegionCopy(vararg crossRegionCopy: Any)

      /**
       * @param name A descriptive name for the action. 
       */
      public fun name(name: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.dlm.CfnLifecyclePolicy.ActionProperty.Builder =
          software.amazon.awscdk.services.dlm.CfnLifecyclePolicy.ActionProperty.builder()

      /**
       * @param crossRegionCopy The rule for copying shared snapshots across Regions. 
       */
      override fun crossRegionCopy(crossRegionCopy: IResolvable) {
        cdkBuilder.crossRegionCopy(crossRegionCopy.let(IResolvable::unwrap))
      }

      /**
       * @param crossRegionCopy The rule for copying shared snapshots across Regions. 
       */
      override fun crossRegionCopy(crossRegionCopy: List<Any>) {
        cdkBuilder.crossRegionCopy(crossRegionCopy)
      }

      /**
       * @param crossRegionCopy The rule for copying shared snapshots across Regions. 
       */
      override fun crossRegionCopy(vararg crossRegionCopy: Any): Unit =
          crossRegionCopy(crossRegionCopy.toList())

      /**
       * @param name A descriptive name for the action. 
       */
      override fun name(name: String) {
        cdkBuilder.name(name)
      }

      public fun build(): software.amazon.awscdk.services.dlm.CfnLifecyclePolicy.ActionProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject: software.amazon.awscdk.services.dlm.CfnLifecyclePolicy.ActionProperty,
    ) : CdkObject(cdkObject), ActionProperty {
      /**
       * The rule for copying shared snapshots across Regions.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dlm-lifecyclepolicy-action.html#cfn-dlm-lifecyclepolicy-action-crossregioncopy)
       */
      override fun crossRegionCopy(): Any = unwrap(this).getCrossRegionCopy()

      /**
       * A descriptive name for the action.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dlm-lifecyclepolicy-action.html#cfn-dlm-lifecyclepolicy-action-name)
       */
      override fun name(): String = unwrap(this).getName()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): ActionProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.dlm.CfnLifecyclePolicy.ActionProperty):
          ActionProperty = CdkObjectWrappers.wrap(cdkObject) as? ActionProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: ActionProperty):
          software.amazon.awscdk.services.dlm.CfnLifecyclePolicy.ActionProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.dlm.CfnLifecyclePolicy.ActionProperty
    }
  }

  /**
   * *[Custom snapshot policies only]* Specifies information about the archive storage tier
   * retention period.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.dlm.*;
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
  public interface ArchiveRetainRuleProperty {
    /**
     * Information about retention period in the Amazon EBS Snapshots Archive.
     *
     * For more information, see [Archive Amazon EBS
     * snapshots](https://docs.aws.amazon.com/AWSEC2/latest/WindowsGuide/snapshot-archive.html) .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dlm-lifecyclepolicy-archiveretainrule.html#cfn-dlm-lifecyclepolicy-archiveretainrule-retentionarchivetier)
     */
    public fun retentionArchiveTier(): Any

    /**
     * A builder for [ArchiveRetainRuleProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param retentionArchiveTier Information about retention period in the Amazon EBS Snapshots
       * Archive. 
       * For more information, see [Archive Amazon EBS
       * snapshots](https://docs.aws.amazon.com/AWSEC2/latest/WindowsGuide/snapshot-archive.html) .
       */
      public fun retentionArchiveTier(retentionArchiveTier: IResolvable)

      /**
       * @param retentionArchiveTier Information about retention period in the Amazon EBS Snapshots
       * Archive. 
       * For more information, see [Archive Amazon EBS
       * snapshots](https://docs.aws.amazon.com/AWSEC2/latest/WindowsGuide/snapshot-archive.html) .
       */
      public fun retentionArchiveTier(retentionArchiveTier: RetentionArchiveTierProperty)

      /**
       * @param retentionArchiveTier Information about retention period in the Amazon EBS Snapshots
       * Archive. 
       * For more information, see [Archive Amazon EBS
       * snapshots](https://docs.aws.amazon.com/AWSEC2/latest/WindowsGuide/snapshot-archive.html) .
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("551dbf48b425648dc22b6154e42ca2745b9d79670853ce1e7d0b5f107735a6d9")
      public
          fun retentionArchiveTier(retentionArchiveTier: RetentionArchiveTierProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.dlm.CfnLifecyclePolicy.ArchiveRetainRuleProperty.Builder =
          software.amazon.awscdk.services.dlm.CfnLifecyclePolicy.ArchiveRetainRuleProperty.builder()

      /**
       * @param retentionArchiveTier Information about retention period in the Amazon EBS Snapshots
       * Archive. 
       * For more information, see [Archive Amazon EBS
       * snapshots](https://docs.aws.amazon.com/AWSEC2/latest/WindowsGuide/snapshot-archive.html) .
       */
      override fun retentionArchiveTier(retentionArchiveTier: IResolvable) {
        cdkBuilder.retentionArchiveTier(retentionArchiveTier.let(IResolvable::unwrap))
      }

      /**
       * @param retentionArchiveTier Information about retention period in the Amazon EBS Snapshots
       * Archive. 
       * For more information, see [Archive Amazon EBS
       * snapshots](https://docs.aws.amazon.com/AWSEC2/latest/WindowsGuide/snapshot-archive.html) .
       */
      override fun retentionArchiveTier(retentionArchiveTier: RetentionArchiveTierProperty) {
        cdkBuilder.retentionArchiveTier(retentionArchiveTier.let(RetentionArchiveTierProperty::unwrap))
      }

      /**
       * @param retentionArchiveTier Information about retention period in the Amazon EBS Snapshots
       * Archive. 
       * For more information, see [Archive Amazon EBS
       * snapshots](https://docs.aws.amazon.com/AWSEC2/latest/WindowsGuide/snapshot-archive.html) .
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("551dbf48b425648dc22b6154e42ca2745b9d79670853ce1e7d0b5f107735a6d9")
      override
          fun retentionArchiveTier(retentionArchiveTier: RetentionArchiveTierProperty.Builder.() -> Unit):
          Unit = retentionArchiveTier(RetentionArchiveTierProperty(retentionArchiveTier))

      public fun build():
          software.amazon.awscdk.services.dlm.CfnLifecyclePolicy.ArchiveRetainRuleProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.dlm.CfnLifecyclePolicy.ArchiveRetainRuleProperty,
    ) : CdkObject(cdkObject), ArchiveRetainRuleProperty {
      /**
       * Information about retention period in the Amazon EBS Snapshots Archive.
       *
       * For more information, see [Archive Amazon EBS
       * snapshots](https://docs.aws.amazon.com/AWSEC2/latest/WindowsGuide/snapshot-archive.html) .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dlm-lifecyclepolicy-archiveretainrule.html#cfn-dlm-lifecyclepolicy-archiveretainrule-retentionarchivetier)
       */
      override fun retentionArchiveTier(): Any = unwrap(this).getRetentionArchiveTier()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): ArchiveRetainRuleProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.dlm.CfnLifecyclePolicy.ArchiveRetainRuleProperty):
          ArchiveRetainRuleProperty = CdkObjectWrappers.wrap(cdkObject) as?
          ArchiveRetainRuleProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: ArchiveRetainRuleProperty):
          software.amazon.awscdk.services.dlm.CfnLifecyclePolicy.ArchiveRetainRuleProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.dlm.CfnLifecyclePolicy.ArchiveRetainRuleProperty
    }
  }

  /**
   * *[Custom snapshot policies only]* Specifies a snapshot archiving rule for a schedule.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.dlm.*;
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
  public interface ArchiveRuleProperty {
    /**
     * Information about the retention period for the snapshot archiving rule.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dlm-lifecyclepolicy-archiverule.html#cfn-dlm-lifecyclepolicy-archiverule-retainrule)
     */
    public fun retainRule(): Any

    /**
     * A builder for [ArchiveRuleProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param retainRule Information about the retention period for the snapshot archiving rule. 
       */
      public fun retainRule(retainRule: IResolvable)

      /**
       * @param retainRule Information about the retention period for the snapshot archiving rule. 
       */
      public fun retainRule(retainRule: ArchiveRetainRuleProperty)

      /**
       * @param retainRule Information about the retention period for the snapshot archiving rule. 
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("22112598039fa0891c015794eab927b32a7c3cace5a3606f9960cb6a144f4b1e")
      public fun retainRule(retainRule: ArchiveRetainRuleProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.dlm.CfnLifecyclePolicy.ArchiveRuleProperty.Builder =
          software.amazon.awscdk.services.dlm.CfnLifecyclePolicy.ArchiveRuleProperty.builder()

      /**
       * @param retainRule Information about the retention period for the snapshot archiving rule. 
       */
      override fun retainRule(retainRule: IResolvable) {
        cdkBuilder.retainRule(retainRule.let(IResolvable::unwrap))
      }

      /**
       * @param retainRule Information about the retention period for the snapshot archiving rule. 
       */
      override fun retainRule(retainRule: ArchiveRetainRuleProperty) {
        cdkBuilder.retainRule(retainRule.let(ArchiveRetainRuleProperty::unwrap))
      }

      /**
       * @param retainRule Information about the retention period for the snapshot archiving rule. 
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("22112598039fa0891c015794eab927b32a7c3cace5a3606f9960cb6a144f4b1e")
      override fun retainRule(retainRule: ArchiveRetainRuleProperty.Builder.() -> Unit): Unit =
          retainRule(ArchiveRetainRuleProperty(retainRule))

      public fun build(): software.amazon.awscdk.services.dlm.CfnLifecyclePolicy.ArchiveRuleProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.dlm.CfnLifecyclePolicy.ArchiveRuleProperty,
    ) : CdkObject(cdkObject), ArchiveRuleProperty {
      /**
       * Information about the retention period for the snapshot archiving rule.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dlm-lifecyclepolicy-archiverule.html#cfn-dlm-lifecyclepolicy-archiverule-retainrule)
       */
      override fun retainRule(): Any = unwrap(this).getRetainRule()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): ArchiveRuleProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.dlm.CfnLifecyclePolicy.ArchiveRuleProperty):
          ArchiveRuleProperty = CdkObjectWrappers.wrap(cdkObject) as? ArchiveRuleProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: ArchiveRuleProperty):
          software.amazon.awscdk.services.dlm.CfnLifecyclePolicy.ArchiveRuleProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.dlm.CfnLifecyclePolicy.ArchiveRuleProperty
    }
  }

  /**
   * *[Custom snapshot and AMI policies only]* Specifies when the policy should create snapshots or
   * AMIs.
   *
   *
   * * You must specify either *CronExpression* , or *Interval* , *IntervalUnit* , and *Times* .
   * * If you need to specify an
   * [ArchiveRule](https://docs.aws.amazon.com/dlm/latest/APIReference/API_ArchiveRule.html) for the
   * schedule, then you must specify a creation frequency of at least 28 days.
   *
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.dlm.*;
   * CreateRuleProperty createRuleProperty = CreateRuleProperty.builder()
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
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dlm-lifecyclepolicy-createrule.html)
   */
  public interface CreateRuleProperty {
    /**
     * The schedule, as a Cron expression.
     *
     * The schedule interval must be between 1 hour and 1 year. For more information, see [Cron
     * expressions](https://docs.aws.amazon.com/AmazonCloudWatch/latest/events/ScheduledEvents.html#CronExpressions)
     * in the *Amazon CloudWatch User Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dlm-lifecyclepolicy-createrule.html#cfn-dlm-lifecyclepolicy-createrule-cronexpression)
     */
    public fun cronExpression(): String? = unwrap(this).getCronExpression()

    /**
     * The interval between snapshots.
     *
     * The supported values are 1, 2, 3, 4, 6, 8, 12, and 24.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dlm-lifecyclepolicy-createrule.html#cfn-dlm-lifecyclepolicy-createrule-interval)
     */
    public fun interval(): Number? = unwrap(this).getInterval()

    /**
     * The interval unit.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dlm-lifecyclepolicy-createrule.html#cfn-dlm-lifecyclepolicy-createrule-intervalunit)
     */
    public fun intervalUnit(): String? = unwrap(this).getIntervalUnit()

    /**
     * *[Custom snapshot policies only]* Specifies the destination for snapshots created by the
     * policy.
     *
     * To create snapshots in the same Region as the source resource, specify `CLOUD` . To create
     * snapshots on the same Outpost as the source resource, specify `OUTPOST_LOCAL` . If you omit this
     * parameter, `CLOUD` is used by default.
     *
     * If the policy targets resources in an AWS Region , then you must create snapshots in the same
     * Region as the source resource. If the policy targets resources on an Outpost, then you can
     * create snapshots on the same Outpost as the source resource, or in the Region of that Outpost.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dlm-lifecyclepolicy-createrule.html#cfn-dlm-lifecyclepolicy-createrule-location)
     */
    public fun location(): String? = unwrap(this).getLocation()

    /**
     * *[Custom snapshot policies that target instances only]* Specifies pre and/or post scripts for
     * a snapshot lifecycle policy that targets instances.
     *
     * This is useful for creating application-consistent snapshots, or for performing specific
     * administrative tasks before or after Amazon Data Lifecycle Manager initiates snapshot creation.
     *
     * For more information, see [Automating application-consistent snapshots with pre and post
     * scripts](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/automate-app-consistent-backups.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dlm-lifecyclepolicy-createrule.html#cfn-dlm-lifecyclepolicy-createrule-scripts)
     */
    public fun scripts(): Any? = unwrap(this).getScripts()

    /**
     * The time, in UTC, to start the operation. The supported format is hh:mm.
     *
     * The operation occurs within a one-hour window following the specified time. If you do not
     * specify a time, Amazon Data Lifecycle Manager selects a time within the next 24 hours.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dlm-lifecyclepolicy-createrule.html#cfn-dlm-lifecyclepolicy-createrule-times)
     */
    public fun times(): List<String> = unwrap(this).getTimes() ?: emptyList()

    /**
     * A builder for [CreateRuleProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param cronExpression The schedule, as a Cron expression.
       * The schedule interval must be between 1 hour and 1 year. For more information, see [Cron
       * expressions](https://docs.aws.amazon.com/AmazonCloudWatch/latest/events/ScheduledEvents.html#CronExpressions)
       * in the *Amazon CloudWatch User Guide* .
       */
      public fun cronExpression(cronExpression: String)

      /**
       * @param interval The interval between snapshots.
       * The supported values are 1, 2, 3, 4, 6, 8, 12, and 24.
       */
      public fun interval(interval: Number)

      /**
       * @param intervalUnit The interval unit.
       */
      public fun intervalUnit(intervalUnit: String)

      /**
       * @param location *[Custom snapshot policies only]* Specifies the destination for snapshots
       * created by the policy.
       * To create snapshots in the same Region as the source resource, specify `CLOUD` . To create
       * snapshots on the same Outpost as the source resource, specify `OUTPOST_LOCAL` . If you omit
       * this parameter, `CLOUD` is used by default.
       *
       * If the policy targets resources in an AWS Region , then you must create snapshots in the
       * same Region as the source resource. If the policy targets resources on an Outpost, then you
       * can create snapshots on the same Outpost as the source resource, or in the Region of that
       * Outpost.
       */
      public fun location(location: String)

      /**
       * @param scripts *[Custom snapshot policies that target instances only]* Specifies pre and/or
       * post scripts for a snapshot lifecycle policy that targets instances.
       * This is useful for creating application-consistent snapshots, or for performing specific
       * administrative tasks before or after Amazon Data Lifecycle Manager initiates snapshot
       * creation.
       *
       * For more information, see [Automating application-consistent snapshots with pre and post
       * scripts](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/automate-app-consistent-backups.html)
       * .
       */
      public fun scripts(scripts: IResolvable)

      /**
       * @param scripts *[Custom snapshot policies that target instances only]* Specifies pre and/or
       * post scripts for a snapshot lifecycle policy that targets instances.
       * This is useful for creating application-consistent snapshots, or for performing specific
       * administrative tasks before or after Amazon Data Lifecycle Manager initiates snapshot
       * creation.
       *
       * For more information, see [Automating application-consistent snapshots with pre and post
       * scripts](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/automate-app-consistent-backups.html)
       * .
       */
      public fun scripts(scripts: List<Any>)

      /**
       * @param scripts *[Custom snapshot policies that target instances only]* Specifies pre and/or
       * post scripts for a snapshot lifecycle policy that targets instances.
       * This is useful for creating application-consistent snapshots, or for performing specific
       * administrative tasks before or after Amazon Data Lifecycle Manager initiates snapshot
       * creation.
       *
       * For more information, see [Automating application-consistent snapshots with pre and post
       * scripts](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/automate-app-consistent-backups.html)
       * .
       */
      public fun scripts(vararg scripts: Any)

      /**
       * @param times The time, in UTC, to start the operation. The supported format is hh:mm.
       * The operation occurs within a one-hour window following the specified time. If you do not
       * specify a time, Amazon Data Lifecycle Manager selects a time within the next 24 hours.
       */
      public fun times(times: List<String>)

      /**
       * @param times The time, in UTC, to start the operation. The supported format is hh:mm.
       * The operation occurs within a one-hour window following the specified time. If you do not
       * specify a time, Amazon Data Lifecycle Manager selects a time within the next 24 hours.
       */
      public fun times(vararg times: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.dlm.CfnLifecyclePolicy.CreateRuleProperty.Builder =
          software.amazon.awscdk.services.dlm.CfnLifecyclePolicy.CreateRuleProperty.builder()

      /**
       * @param cronExpression The schedule, as a Cron expression.
       * The schedule interval must be between 1 hour and 1 year. For more information, see [Cron
       * expressions](https://docs.aws.amazon.com/AmazonCloudWatch/latest/events/ScheduledEvents.html#CronExpressions)
       * in the *Amazon CloudWatch User Guide* .
       */
      override fun cronExpression(cronExpression: String) {
        cdkBuilder.cronExpression(cronExpression)
      }

      /**
       * @param interval The interval between snapshots.
       * The supported values are 1, 2, 3, 4, 6, 8, 12, and 24.
       */
      override fun interval(interval: Number) {
        cdkBuilder.interval(interval)
      }

      /**
       * @param intervalUnit The interval unit.
       */
      override fun intervalUnit(intervalUnit: String) {
        cdkBuilder.intervalUnit(intervalUnit)
      }

      /**
       * @param location *[Custom snapshot policies only]* Specifies the destination for snapshots
       * created by the policy.
       * To create snapshots in the same Region as the source resource, specify `CLOUD` . To create
       * snapshots on the same Outpost as the source resource, specify `OUTPOST_LOCAL` . If you omit
       * this parameter, `CLOUD` is used by default.
       *
       * If the policy targets resources in an AWS Region , then you must create snapshots in the
       * same Region as the source resource. If the policy targets resources on an Outpost, then you
       * can create snapshots on the same Outpost as the source resource, or in the Region of that
       * Outpost.
       */
      override fun location(location: String) {
        cdkBuilder.location(location)
      }

      /**
       * @param scripts *[Custom snapshot policies that target instances only]* Specifies pre and/or
       * post scripts for a snapshot lifecycle policy that targets instances.
       * This is useful for creating application-consistent snapshots, or for performing specific
       * administrative tasks before or after Amazon Data Lifecycle Manager initiates snapshot
       * creation.
       *
       * For more information, see [Automating application-consistent snapshots with pre and post
       * scripts](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/automate-app-consistent-backups.html)
       * .
       */
      override fun scripts(scripts: IResolvable) {
        cdkBuilder.scripts(scripts.let(IResolvable::unwrap))
      }

      /**
       * @param scripts *[Custom snapshot policies that target instances only]* Specifies pre and/or
       * post scripts for a snapshot lifecycle policy that targets instances.
       * This is useful for creating application-consistent snapshots, or for performing specific
       * administrative tasks before or after Amazon Data Lifecycle Manager initiates snapshot
       * creation.
       *
       * For more information, see [Automating application-consistent snapshots with pre and post
       * scripts](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/automate-app-consistent-backups.html)
       * .
       */
      override fun scripts(scripts: List<Any>) {
        cdkBuilder.scripts(scripts)
      }

      /**
       * @param scripts *[Custom snapshot policies that target instances only]* Specifies pre and/or
       * post scripts for a snapshot lifecycle policy that targets instances.
       * This is useful for creating application-consistent snapshots, or for performing specific
       * administrative tasks before or after Amazon Data Lifecycle Manager initiates snapshot
       * creation.
       *
       * For more information, see [Automating application-consistent snapshots with pre and post
       * scripts](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/automate-app-consistent-backups.html)
       * .
       */
      override fun scripts(vararg scripts: Any): Unit = scripts(scripts.toList())

      /**
       * @param times The time, in UTC, to start the operation. The supported format is hh:mm.
       * The operation occurs within a one-hour window following the specified time. If you do not
       * specify a time, Amazon Data Lifecycle Manager selects a time within the next 24 hours.
       */
      override fun times(times: List<String>) {
        cdkBuilder.times(times)
      }

      /**
       * @param times The time, in UTC, to start the operation. The supported format is hh:mm.
       * The operation occurs within a one-hour window following the specified time. If you do not
       * specify a time, Amazon Data Lifecycle Manager selects a time within the next 24 hours.
       */
      override fun times(vararg times: String): Unit = times(times.toList())

      public fun build(): software.amazon.awscdk.services.dlm.CfnLifecyclePolicy.CreateRuleProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.dlm.CfnLifecyclePolicy.CreateRuleProperty,
    ) : CdkObject(cdkObject), CreateRuleProperty {
      /**
       * The schedule, as a Cron expression.
       *
       * The schedule interval must be between 1 hour and 1 year. For more information, see [Cron
       * expressions](https://docs.aws.amazon.com/AmazonCloudWatch/latest/events/ScheduledEvents.html#CronExpressions)
       * in the *Amazon CloudWatch User Guide* .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dlm-lifecyclepolicy-createrule.html#cfn-dlm-lifecyclepolicy-createrule-cronexpression)
       */
      override fun cronExpression(): String? = unwrap(this).getCronExpression()

      /**
       * The interval between snapshots.
       *
       * The supported values are 1, 2, 3, 4, 6, 8, 12, and 24.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dlm-lifecyclepolicy-createrule.html#cfn-dlm-lifecyclepolicy-createrule-interval)
       */
      override fun interval(): Number? = unwrap(this).getInterval()

      /**
       * The interval unit.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dlm-lifecyclepolicy-createrule.html#cfn-dlm-lifecyclepolicy-createrule-intervalunit)
       */
      override fun intervalUnit(): String? = unwrap(this).getIntervalUnit()

      /**
       * *[Custom snapshot policies only]* Specifies the destination for snapshots created by the
       * policy.
       *
       * To create snapshots in the same Region as the source resource, specify `CLOUD` . To create
       * snapshots on the same Outpost as the source resource, specify `OUTPOST_LOCAL` . If you omit
       * this parameter, `CLOUD` is used by default.
       *
       * If the policy targets resources in an AWS Region , then you must create snapshots in the
       * same Region as the source resource. If the policy targets resources on an Outpost, then you
       * can create snapshots on the same Outpost as the source resource, or in the Region of that
       * Outpost.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dlm-lifecyclepolicy-createrule.html#cfn-dlm-lifecyclepolicy-createrule-location)
       */
      override fun location(): String? = unwrap(this).getLocation()

      /**
       * *[Custom snapshot policies that target instances only]* Specifies pre and/or post scripts
       * for a snapshot lifecycle policy that targets instances.
       *
       * This is useful for creating application-consistent snapshots, or for performing specific
       * administrative tasks before or after Amazon Data Lifecycle Manager initiates snapshot
       * creation.
       *
       * For more information, see [Automating application-consistent snapshots with pre and post
       * scripts](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/automate-app-consistent-backups.html)
       * .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dlm-lifecyclepolicy-createrule.html#cfn-dlm-lifecyclepolicy-createrule-scripts)
       */
      override fun scripts(): Any? = unwrap(this).getScripts()

      /**
       * The time, in UTC, to start the operation. The supported format is hh:mm.
       *
       * The operation occurs within a one-hour window following the specified time. If you do not
       * specify a time, Amazon Data Lifecycle Manager selects a time within the next 24 hours.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dlm-lifecyclepolicy-createrule.html#cfn-dlm-lifecyclepolicy-createrule-times)
       */
      override fun times(): List<String> = unwrap(this).getTimes() ?: emptyList()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): CreateRuleProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.dlm.CfnLifecyclePolicy.CreateRuleProperty):
          CreateRuleProperty = CdkObjectWrappers.wrap(cdkObject) as? CreateRuleProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: CreateRuleProperty):
          software.amazon.awscdk.services.dlm.CfnLifecyclePolicy.CreateRuleProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.dlm.CfnLifecyclePolicy.CreateRuleProperty
    }
  }

  /**
   * *[Event-based policies only]* Specifies a cross-Region copy action for event-based policies.
   *
   *
   * To specify a cross-Region copy rule for snapshot and AMI policies, use
   * [CrossRegionCopyRule](https://docs.aws.amazon.com/dlm/latest/APIReference/API_CrossRegionCopyRule.html)
   * .
   *
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.dlm.*;
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
  public interface CrossRegionCopyActionProperty {
    /**
     * The encryption settings for the copied snapshot.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dlm-lifecyclepolicy-crossregioncopyaction.html#cfn-dlm-lifecyclepolicy-crossregioncopyaction-encryptionconfiguration)
     */
    public fun encryptionConfiguration(): Any

    /**
     * Specifies a retention rule for cross-Region snapshot copies created by snapshot or
     * event-based policies, or cross-Region AMI copies created by AMI policies.
     *
     * After the retention period expires, the cross-Region copy is deleted.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dlm-lifecyclepolicy-crossregioncopyaction.html#cfn-dlm-lifecyclepolicy-crossregioncopyaction-retainrule)
     */
    public fun retainRule(): Any? = unwrap(this).getRetainRule()

    /**
     * The target Region.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dlm-lifecyclepolicy-crossregioncopyaction.html#cfn-dlm-lifecyclepolicy-crossregioncopyaction-target)
     */
    public fun target(): String

    /**
     * A builder for [CrossRegionCopyActionProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param encryptionConfiguration The encryption settings for the copied snapshot. 
       */
      public fun encryptionConfiguration(encryptionConfiguration: IResolvable)

      /**
       * @param encryptionConfiguration The encryption settings for the copied snapshot. 
       */
      public fun encryptionConfiguration(encryptionConfiguration: EncryptionConfigurationProperty)

      /**
       * @param encryptionConfiguration The encryption settings for the copied snapshot. 
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("2ec0c4d606144d14816230ec6cb342ec91c9aef5c6720797c2392ea371d6ffb2")
      public
          fun encryptionConfiguration(encryptionConfiguration: EncryptionConfigurationProperty.Builder.() -> Unit)

      /**
       * @param retainRule Specifies a retention rule for cross-Region snapshot copies created by
       * snapshot or event-based policies, or cross-Region AMI copies created by AMI policies.
       * After the retention period expires, the cross-Region copy is deleted.
       */
      public fun retainRule(retainRule: IResolvable)

      /**
       * @param retainRule Specifies a retention rule for cross-Region snapshot copies created by
       * snapshot or event-based policies, or cross-Region AMI copies created by AMI policies.
       * After the retention period expires, the cross-Region copy is deleted.
       */
      public fun retainRule(retainRule: CrossRegionCopyRetainRuleProperty)

      /**
       * @param retainRule Specifies a retention rule for cross-Region snapshot copies created by
       * snapshot or event-based policies, or cross-Region AMI copies created by AMI policies.
       * After the retention period expires, the cross-Region copy is deleted.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("01c511487298cb6a01fe90405edf763c8ef3ed3435b1796e0359f3636ce44851")
      public fun retainRule(retainRule: CrossRegionCopyRetainRuleProperty.Builder.() -> Unit)

      /**
       * @param target The target Region. 
       */
      public fun target(target: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.dlm.CfnLifecyclePolicy.CrossRegionCopyActionProperty.Builder
          =
          software.amazon.awscdk.services.dlm.CfnLifecyclePolicy.CrossRegionCopyActionProperty.builder()

      /**
       * @param encryptionConfiguration The encryption settings for the copied snapshot. 
       */
      override fun encryptionConfiguration(encryptionConfiguration: IResolvable) {
        cdkBuilder.encryptionConfiguration(encryptionConfiguration.let(IResolvable::unwrap))
      }

      /**
       * @param encryptionConfiguration The encryption settings for the copied snapshot. 
       */
      override
          fun encryptionConfiguration(encryptionConfiguration: EncryptionConfigurationProperty) {
        cdkBuilder.encryptionConfiguration(encryptionConfiguration.let(EncryptionConfigurationProperty::unwrap))
      }

      /**
       * @param encryptionConfiguration The encryption settings for the copied snapshot. 
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("2ec0c4d606144d14816230ec6cb342ec91c9aef5c6720797c2392ea371d6ffb2")
      override
          fun encryptionConfiguration(encryptionConfiguration: EncryptionConfigurationProperty.Builder.() -> Unit):
          Unit = encryptionConfiguration(EncryptionConfigurationProperty(encryptionConfiguration))

      /**
       * @param retainRule Specifies a retention rule for cross-Region snapshot copies created by
       * snapshot or event-based policies, or cross-Region AMI copies created by AMI policies.
       * After the retention period expires, the cross-Region copy is deleted.
       */
      override fun retainRule(retainRule: IResolvable) {
        cdkBuilder.retainRule(retainRule.let(IResolvable::unwrap))
      }

      /**
       * @param retainRule Specifies a retention rule for cross-Region snapshot copies created by
       * snapshot or event-based policies, or cross-Region AMI copies created by AMI policies.
       * After the retention period expires, the cross-Region copy is deleted.
       */
      override fun retainRule(retainRule: CrossRegionCopyRetainRuleProperty) {
        cdkBuilder.retainRule(retainRule.let(CrossRegionCopyRetainRuleProperty::unwrap))
      }

      /**
       * @param retainRule Specifies a retention rule for cross-Region snapshot copies created by
       * snapshot or event-based policies, or cross-Region AMI copies created by AMI policies.
       * After the retention period expires, the cross-Region copy is deleted.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("01c511487298cb6a01fe90405edf763c8ef3ed3435b1796e0359f3636ce44851")
      override fun retainRule(retainRule: CrossRegionCopyRetainRuleProperty.Builder.() -> Unit):
          Unit = retainRule(CrossRegionCopyRetainRuleProperty(retainRule))

      /**
       * @param target The target Region. 
       */
      override fun target(target: String) {
        cdkBuilder.target(target)
      }

      public fun build():
          software.amazon.awscdk.services.dlm.CfnLifecyclePolicy.CrossRegionCopyActionProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.dlm.CfnLifecyclePolicy.CrossRegionCopyActionProperty,
    ) : CdkObject(cdkObject), CrossRegionCopyActionProperty {
      /**
       * The encryption settings for the copied snapshot.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dlm-lifecyclepolicy-crossregioncopyaction.html#cfn-dlm-lifecyclepolicy-crossregioncopyaction-encryptionconfiguration)
       */
      override fun encryptionConfiguration(): Any = unwrap(this).getEncryptionConfiguration()

      /**
       * Specifies a retention rule for cross-Region snapshot copies created by snapshot or
       * event-based policies, or cross-Region AMI copies created by AMI policies.
       *
       * After the retention period expires, the cross-Region copy is deleted.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dlm-lifecyclepolicy-crossregioncopyaction.html#cfn-dlm-lifecyclepolicy-crossregioncopyaction-retainrule)
       */
      override fun retainRule(): Any? = unwrap(this).getRetainRule()

      /**
       * The target Region.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dlm-lifecyclepolicy-crossregioncopyaction.html#cfn-dlm-lifecyclepolicy-crossregioncopyaction-target)
       */
      override fun target(): String = unwrap(this).getTarget()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): CrossRegionCopyActionProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.dlm.CfnLifecyclePolicy.CrossRegionCopyActionProperty):
          CrossRegionCopyActionProperty = CdkObjectWrappers.wrap(cdkObject) as?
          CrossRegionCopyActionProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: CrossRegionCopyActionProperty):
          software.amazon.awscdk.services.dlm.CfnLifecyclePolicy.CrossRegionCopyActionProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.dlm.CfnLifecyclePolicy.CrossRegionCopyActionProperty
    }
  }

  /**
   * *[Custom AMI policies only]* Specifies an AMI deprecation rule for cross-Region AMI copies
   * created by an AMI policy.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.dlm.*;
   * CrossRegionCopyDeprecateRuleProperty crossRegionCopyDeprecateRuleProperty =
   * CrossRegionCopyDeprecateRuleProperty.builder()
   * .interval(123)
   * .intervalUnit("intervalUnit")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dlm-lifecyclepolicy-crossregioncopydeprecaterule.html)
   */
  public interface CrossRegionCopyDeprecateRuleProperty {
    /**
     * The period after which to deprecate the cross-Region AMI copies.
     *
     * The period must be less than or equal to the cross-Region AMI copy retention period, and it
     * can't be greater than 10 years. This is equivalent to 120 months, 520 weeks, or 3650 days.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dlm-lifecyclepolicy-crossregioncopydeprecaterule.html#cfn-dlm-lifecyclepolicy-crossregioncopydeprecaterule-interval)
     */
    public fun interval(): Number

    /**
     * The unit of time in which to measure the *Interval* .
     *
     * For example, to deprecate a cross-Region AMI copy after 3 months, specify `Interval=3` and
     * `IntervalUnit=MONTHS` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dlm-lifecyclepolicy-crossregioncopydeprecaterule.html#cfn-dlm-lifecyclepolicy-crossregioncopydeprecaterule-intervalunit)
     */
    public fun intervalUnit(): String

    /**
     * A builder for [CrossRegionCopyDeprecateRuleProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param interval The period after which to deprecate the cross-Region AMI copies. 
       * The period must be less than or equal to the cross-Region AMI copy retention period, and it
       * can't be greater than 10 years. This is equivalent to 120 months, 520 weeks, or 3650 days.
       */
      public fun interval(interval: Number)

      /**
       * @param intervalUnit The unit of time in which to measure the *Interval* . 
       * For example, to deprecate a cross-Region AMI copy after 3 months, specify `Interval=3` and
       * `IntervalUnit=MONTHS` .
       */
      public fun intervalUnit(intervalUnit: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.dlm.CfnLifecyclePolicy.CrossRegionCopyDeprecateRuleProperty.Builder
          =
          software.amazon.awscdk.services.dlm.CfnLifecyclePolicy.CrossRegionCopyDeprecateRuleProperty.builder()

      /**
       * @param interval The period after which to deprecate the cross-Region AMI copies. 
       * The period must be less than or equal to the cross-Region AMI copy retention period, and it
       * can't be greater than 10 years. This is equivalent to 120 months, 520 weeks, or 3650 days.
       */
      override fun interval(interval: Number) {
        cdkBuilder.interval(interval)
      }

      /**
       * @param intervalUnit The unit of time in which to measure the *Interval* . 
       * For example, to deprecate a cross-Region AMI copy after 3 months, specify `Interval=3` and
       * `IntervalUnit=MONTHS` .
       */
      override fun intervalUnit(intervalUnit: String) {
        cdkBuilder.intervalUnit(intervalUnit)
      }

      public fun build():
          software.amazon.awscdk.services.dlm.CfnLifecyclePolicy.CrossRegionCopyDeprecateRuleProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.dlm.CfnLifecyclePolicy.CrossRegionCopyDeprecateRuleProperty,
    ) : CdkObject(cdkObject), CrossRegionCopyDeprecateRuleProperty {
      /**
       * The period after which to deprecate the cross-Region AMI copies.
       *
       * The period must be less than or equal to the cross-Region AMI copy retention period, and it
       * can't be greater than 10 years. This is equivalent to 120 months, 520 weeks, or 3650 days.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dlm-lifecyclepolicy-crossregioncopydeprecaterule.html#cfn-dlm-lifecyclepolicy-crossregioncopydeprecaterule-interval)
       */
      override fun interval(): Number = unwrap(this).getInterval()

      /**
       * The unit of time in which to measure the *Interval* .
       *
       * For example, to deprecate a cross-Region AMI copy after 3 months, specify `Interval=3` and
       * `IntervalUnit=MONTHS` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dlm-lifecyclepolicy-crossregioncopydeprecaterule.html#cfn-dlm-lifecyclepolicy-crossregioncopydeprecaterule-intervalunit)
       */
      override fun intervalUnit(): String = unwrap(this).getIntervalUnit()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          CrossRegionCopyDeprecateRuleProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.dlm.CfnLifecyclePolicy.CrossRegionCopyDeprecateRuleProperty):
          CrossRegionCopyDeprecateRuleProperty = CdkObjectWrappers.wrap(cdkObject) as?
          CrossRegionCopyDeprecateRuleProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: CrossRegionCopyDeprecateRuleProperty):
          software.amazon.awscdk.services.dlm.CfnLifecyclePolicy.CrossRegionCopyDeprecateRuleProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.dlm.CfnLifecyclePolicy.CrossRegionCopyDeprecateRuleProperty
    }
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
   * import io.cloudshiftdev.awscdk.services.dlm.*;
   * CrossRegionCopyRetainRuleProperty crossRegionCopyRetainRuleProperty =
   * CrossRegionCopyRetainRuleProperty.builder()
   * .interval(123)
   * .intervalUnit("intervalUnit")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dlm-lifecyclepolicy-crossregioncopyretainrule.html)
   */
  public interface CrossRegionCopyRetainRuleProperty {
    /**
     * The amount of time to retain a cross-Region snapshot or AMI copy.
     *
     * The maximum is 100 years. This is equivalent to 1200 months, 5200 weeks, or 36500 days.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dlm-lifecyclepolicy-crossregioncopyretainrule.html#cfn-dlm-lifecyclepolicy-crossregioncopyretainrule-interval)
     */
    public fun interval(): Number

    /**
     * The unit of time for time-based retention.
     *
     * For example, to retain a cross-Region copy for 3 months, specify `Interval=3` and
     * `IntervalUnit=MONTHS` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dlm-lifecyclepolicy-crossregioncopyretainrule.html#cfn-dlm-lifecyclepolicy-crossregioncopyretainrule-intervalunit)
     */
    public fun intervalUnit(): String

    /**
     * A builder for [CrossRegionCopyRetainRuleProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param interval The amount of time to retain a cross-Region snapshot or AMI copy. 
       * The maximum is 100 years. This is equivalent to 1200 months, 5200 weeks, or 36500 days.
       */
      public fun interval(interval: Number)

      /**
       * @param intervalUnit The unit of time for time-based retention. 
       * For example, to retain a cross-Region copy for 3 months, specify `Interval=3` and
       * `IntervalUnit=MONTHS` .
       */
      public fun intervalUnit(intervalUnit: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.dlm.CfnLifecyclePolicy.CrossRegionCopyRetainRuleProperty.Builder
          =
          software.amazon.awscdk.services.dlm.CfnLifecyclePolicy.CrossRegionCopyRetainRuleProperty.builder()

      /**
       * @param interval The amount of time to retain a cross-Region snapshot or AMI copy. 
       * The maximum is 100 years. This is equivalent to 1200 months, 5200 weeks, or 36500 days.
       */
      override fun interval(interval: Number) {
        cdkBuilder.interval(interval)
      }

      /**
       * @param intervalUnit The unit of time for time-based retention. 
       * For example, to retain a cross-Region copy for 3 months, specify `Interval=3` and
       * `IntervalUnit=MONTHS` .
       */
      override fun intervalUnit(intervalUnit: String) {
        cdkBuilder.intervalUnit(intervalUnit)
      }

      public fun build():
          software.amazon.awscdk.services.dlm.CfnLifecyclePolicy.CrossRegionCopyRetainRuleProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.dlm.CfnLifecyclePolicy.CrossRegionCopyRetainRuleProperty,
    ) : CdkObject(cdkObject), CrossRegionCopyRetainRuleProperty {
      /**
       * The amount of time to retain a cross-Region snapshot or AMI copy.
       *
       * The maximum is 100 years. This is equivalent to 1200 months, 5200 weeks, or 36500 days.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dlm-lifecyclepolicy-crossregioncopyretainrule.html#cfn-dlm-lifecyclepolicy-crossregioncopyretainrule-interval)
       */
      override fun interval(): Number = unwrap(this).getInterval()

      /**
       * The unit of time for time-based retention.
       *
       * For example, to retain a cross-Region copy for 3 months, specify `Interval=3` and
       * `IntervalUnit=MONTHS` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dlm-lifecyclepolicy-crossregioncopyretainrule.html#cfn-dlm-lifecyclepolicy-crossregioncopyretainrule-intervalunit)
       */
      override fun intervalUnit(): String = unwrap(this).getIntervalUnit()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          CrossRegionCopyRetainRuleProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.dlm.CfnLifecyclePolicy.CrossRegionCopyRetainRuleProperty):
          CrossRegionCopyRetainRuleProperty = CdkObjectWrappers.wrap(cdkObject) as?
          CrossRegionCopyRetainRuleProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: CrossRegionCopyRetainRuleProperty):
          software.amazon.awscdk.services.dlm.CfnLifecyclePolicy.CrossRegionCopyRetainRuleProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.dlm.CfnLifecyclePolicy.CrossRegionCopyRetainRuleProperty
    }
  }

  /**
   * *[Custom snapshot and AMI policies only]* Specifies a cross-Region copy rule for a snapshot and
   * AMI policies.
   *
   *
   * To specify a cross-Region copy action for event-based polices, use
   * [CrossRegionCopyAction](https://docs.aws.amazon.com/dlm/latest/APIReference/API_CrossRegionCopyAction.html)
   * .
   *
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.dlm.*;
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
  public interface CrossRegionCopyRuleProperty {
    /**
     * The Amazon Resource Name (ARN) of the AWS KMS key to use for EBS encryption.
     *
     * If this parameter is not specified, the default KMS key for the account is used.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dlm-lifecyclepolicy-crossregioncopyrule.html#cfn-dlm-lifecyclepolicy-crossregioncopyrule-cmkarn)
     */
    public fun cmkArn(): String? = unwrap(this).getCmkArn()

    /**
     * Indicates whether to copy all user-defined tags from the source snapshot or AMI to the
     * cross-Region copy.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dlm-lifecyclepolicy-crossregioncopyrule.html#cfn-dlm-lifecyclepolicy-crossregioncopyrule-copytags)
     */
    public fun copyTags(): Any? = unwrap(this).getCopyTags()

    /**
     * *[Custom AMI policies only]* The AMI deprecation rule for cross-Region AMI copies created by
     * the rule.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dlm-lifecyclepolicy-crossregioncopyrule.html#cfn-dlm-lifecyclepolicy-crossregioncopyrule-deprecaterule)
     */
    public fun deprecateRule(): Any? = unwrap(this).getDeprecateRule()

    /**
     * To encrypt a copy of an unencrypted snapshot if encryption by default is not enabled, enable
     * encryption using this parameter.
     *
     * Copies of encrypted snapshots are encrypted, even if this parameter is false or if encryption
     * by default is not enabled.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dlm-lifecyclepolicy-crossregioncopyrule.html#cfn-dlm-lifecyclepolicy-crossregioncopyrule-encrypted)
     */
    public fun encrypted(): Any

    /**
     * The retention rule that indicates how long the cross-Region snapshot or AMI copies are to be
     * retained in the destination Region.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dlm-lifecyclepolicy-crossregioncopyrule.html#cfn-dlm-lifecyclepolicy-crossregioncopyrule-retainrule)
     */
    public fun retainRule(): Any? = unwrap(this).getRetainRule()

    /**
     * Use this parameter for snapshot policies only. For AMI policies, use *TargetRegion* instead.
     *
     * *[Custom snapshot policies only]* The target Region or the Amazon Resource Name (ARN) of the
     * target Outpost for the snapshot copies.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dlm-lifecyclepolicy-crossregioncopyrule.html#cfn-dlm-lifecyclepolicy-crossregioncopyrule-target)
     */
    public fun target(): String? = unwrap(this).getTarget()

    /**
     * Use this parameter for AMI policies only.
     *
     * For snapshot policies, use *Target* instead. For snapshot policies created before the
     * *Target* parameter was introduced, this parameter indicates the target Region for snapshot
     * copies.
     *
     * *[Custom AMI policies only]* The target Region or the Amazon Resource Name (ARN) of the
     * target Outpost for the snapshot copies.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dlm-lifecyclepolicy-crossregioncopyrule.html#cfn-dlm-lifecyclepolicy-crossregioncopyrule-targetregion)
     */
    public fun targetRegion(): String? = unwrap(this).getTargetRegion()

    /**
     * A builder for [CrossRegionCopyRuleProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param cmkArn The Amazon Resource Name (ARN) of the AWS KMS key to use for EBS encryption.
       * If this parameter is not specified, the default KMS key for the account is used.
       */
      public fun cmkArn(cmkArn: String)

      /**
       * @param copyTags Indicates whether to copy all user-defined tags from the source snapshot or
       * AMI to the cross-Region copy.
       */
      public fun copyTags(copyTags: Boolean)

      /**
       * @param copyTags Indicates whether to copy all user-defined tags from the source snapshot or
       * AMI to the cross-Region copy.
       */
      public fun copyTags(copyTags: IResolvable)

      /**
       * @param deprecateRule *[Custom AMI policies only]* The AMI deprecation rule for cross-Region
       * AMI copies created by the rule.
       */
      public fun deprecateRule(deprecateRule: IResolvable)

      /**
       * @param deprecateRule *[Custom AMI policies only]* The AMI deprecation rule for cross-Region
       * AMI copies created by the rule.
       */
      public fun deprecateRule(deprecateRule: CrossRegionCopyDeprecateRuleProperty)

      /**
       * @param deprecateRule *[Custom AMI policies only]* The AMI deprecation rule for cross-Region
       * AMI copies created by the rule.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("03e611e77205c99955185e3196c511607f8e5072ade57cabcd9b0cb66b22ae65")
      public
          fun deprecateRule(deprecateRule: CrossRegionCopyDeprecateRuleProperty.Builder.() -> Unit)

      /**
       * @param encrypted To encrypt a copy of an unencrypted snapshot if encryption by default is
       * not enabled, enable encryption using this parameter. 
       * Copies of encrypted snapshots are encrypted, even if this parameter is false or if
       * encryption by default is not enabled.
       */
      public fun encrypted(encrypted: Boolean)

      /**
       * @param encrypted To encrypt a copy of an unencrypted snapshot if encryption by default is
       * not enabled, enable encryption using this parameter. 
       * Copies of encrypted snapshots are encrypted, even if this parameter is false or if
       * encryption by default is not enabled.
       */
      public fun encrypted(encrypted: IResolvable)

      /**
       * @param retainRule The retention rule that indicates how long the cross-Region snapshot or
       * AMI copies are to be retained in the destination Region.
       */
      public fun retainRule(retainRule: IResolvable)

      /**
       * @param retainRule The retention rule that indicates how long the cross-Region snapshot or
       * AMI copies are to be retained in the destination Region.
       */
      public fun retainRule(retainRule: CrossRegionCopyRetainRuleProperty)

      /**
       * @param retainRule The retention rule that indicates how long the cross-Region snapshot or
       * AMI copies are to be retained in the destination Region.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("167e01da92a571d38b2ea00ebe7df6e195e691b240f448676b5a2ca926bbda1d")
      public fun retainRule(retainRule: CrossRegionCopyRetainRuleProperty.Builder.() -> Unit)

      /**
       * @param target Use this parameter for snapshot policies only. For AMI policies, use
       * *TargetRegion* instead.
       * *[Custom snapshot policies only]* The target Region or the Amazon Resource Name (ARN) of
       * the target Outpost for the snapshot copies.
       */
      public fun target(target: String)

      /**
       * @param targetRegion Use this parameter for AMI policies only.
       * For snapshot policies, use *Target* instead. For snapshot policies created before the
       * *Target* parameter was introduced, this parameter indicates the target Region for snapshot
       * copies.
       *
       * *[Custom AMI policies only]* The target Region or the Amazon Resource Name (ARN) of the
       * target Outpost for the snapshot copies.
       */
      public fun targetRegion(targetRegion: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.dlm.CfnLifecyclePolicy.CrossRegionCopyRuleProperty.Builder
          =
          software.amazon.awscdk.services.dlm.CfnLifecyclePolicy.CrossRegionCopyRuleProperty.builder()

      /**
       * @param cmkArn The Amazon Resource Name (ARN) of the AWS KMS key to use for EBS encryption.
       * If this parameter is not specified, the default KMS key for the account is used.
       */
      override fun cmkArn(cmkArn: String) {
        cdkBuilder.cmkArn(cmkArn)
      }

      /**
       * @param copyTags Indicates whether to copy all user-defined tags from the source snapshot or
       * AMI to the cross-Region copy.
       */
      override fun copyTags(copyTags: Boolean) {
        cdkBuilder.copyTags(copyTags)
      }

      /**
       * @param copyTags Indicates whether to copy all user-defined tags from the source snapshot or
       * AMI to the cross-Region copy.
       */
      override fun copyTags(copyTags: IResolvable) {
        cdkBuilder.copyTags(copyTags.let(IResolvable::unwrap))
      }

      /**
       * @param deprecateRule *[Custom AMI policies only]* The AMI deprecation rule for cross-Region
       * AMI copies created by the rule.
       */
      override fun deprecateRule(deprecateRule: IResolvable) {
        cdkBuilder.deprecateRule(deprecateRule.let(IResolvable::unwrap))
      }

      /**
       * @param deprecateRule *[Custom AMI policies only]* The AMI deprecation rule for cross-Region
       * AMI copies created by the rule.
       */
      override fun deprecateRule(deprecateRule: CrossRegionCopyDeprecateRuleProperty) {
        cdkBuilder.deprecateRule(deprecateRule.let(CrossRegionCopyDeprecateRuleProperty::unwrap))
      }

      /**
       * @param deprecateRule *[Custom AMI policies only]* The AMI deprecation rule for cross-Region
       * AMI copies created by the rule.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("03e611e77205c99955185e3196c511607f8e5072ade57cabcd9b0cb66b22ae65")
      override
          fun deprecateRule(deprecateRule: CrossRegionCopyDeprecateRuleProperty.Builder.() -> Unit):
          Unit = deprecateRule(CrossRegionCopyDeprecateRuleProperty(deprecateRule))

      /**
       * @param encrypted To encrypt a copy of an unencrypted snapshot if encryption by default is
       * not enabled, enable encryption using this parameter. 
       * Copies of encrypted snapshots are encrypted, even if this parameter is false or if
       * encryption by default is not enabled.
       */
      override fun encrypted(encrypted: Boolean) {
        cdkBuilder.encrypted(encrypted)
      }

      /**
       * @param encrypted To encrypt a copy of an unencrypted snapshot if encryption by default is
       * not enabled, enable encryption using this parameter. 
       * Copies of encrypted snapshots are encrypted, even if this parameter is false or if
       * encryption by default is not enabled.
       */
      override fun encrypted(encrypted: IResolvable) {
        cdkBuilder.encrypted(encrypted.let(IResolvable::unwrap))
      }

      /**
       * @param retainRule The retention rule that indicates how long the cross-Region snapshot or
       * AMI copies are to be retained in the destination Region.
       */
      override fun retainRule(retainRule: IResolvable) {
        cdkBuilder.retainRule(retainRule.let(IResolvable::unwrap))
      }

      /**
       * @param retainRule The retention rule that indicates how long the cross-Region snapshot or
       * AMI copies are to be retained in the destination Region.
       */
      override fun retainRule(retainRule: CrossRegionCopyRetainRuleProperty) {
        cdkBuilder.retainRule(retainRule.let(CrossRegionCopyRetainRuleProperty::unwrap))
      }

      /**
       * @param retainRule The retention rule that indicates how long the cross-Region snapshot or
       * AMI copies are to be retained in the destination Region.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("167e01da92a571d38b2ea00ebe7df6e195e691b240f448676b5a2ca926bbda1d")
      override fun retainRule(retainRule: CrossRegionCopyRetainRuleProperty.Builder.() -> Unit):
          Unit = retainRule(CrossRegionCopyRetainRuleProperty(retainRule))

      /**
       * @param target Use this parameter for snapshot policies only. For AMI policies, use
       * *TargetRegion* instead.
       * *[Custom snapshot policies only]* The target Region or the Amazon Resource Name (ARN) of
       * the target Outpost for the snapshot copies.
       */
      override fun target(target: String) {
        cdkBuilder.target(target)
      }

      /**
       * @param targetRegion Use this parameter for AMI policies only.
       * For snapshot policies, use *Target* instead. For snapshot policies created before the
       * *Target* parameter was introduced, this parameter indicates the target Region for snapshot
       * copies.
       *
       * *[Custom AMI policies only]* The target Region or the Amazon Resource Name (ARN) of the
       * target Outpost for the snapshot copies.
       */
      override fun targetRegion(targetRegion: String) {
        cdkBuilder.targetRegion(targetRegion)
      }

      public fun build():
          software.amazon.awscdk.services.dlm.CfnLifecyclePolicy.CrossRegionCopyRuleProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.dlm.CfnLifecyclePolicy.CrossRegionCopyRuleProperty,
    ) : CdkObject(cdkObject), CrossRegionCopyRuleProperty {
      /**
       * The Amazon Resource Name (ARN) of the AWS KMS key to use for EBS encryption.
       *
       * If this parameter is not specified, the default KMS key for the account is used.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dlm-lifecyclepolicy-crossregioncopyrule.html#cfn-dlm-lifecyclepolicy-crossregioncopyrule-cmkarn)
       */
      override fun cmkArn(): String? = unwrap(this).getCmkArn()

      /**
       * Indicates whether to copy all user-defined tags from the source snapshot or AMI to the
       * cross-Region copy.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dlm-lifecyclepolicy-crossregioncopyrule.html#cfn-dlm-lifecyclepolicy-crossregioncopyrule-copytags)
       */
      override fun copyTags(): Any? = unwrap(this).getCopyTags()

      /**
       * *[Custom AMI policies only]* The AMI deprecation rule for cross-Region AMI copies created
       * by the rule.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dlm-lifecyclepolicy-crossregioncopyrule.html#cfn-dlm-lifecyclepolicy-crossregioncopyrule-deprecaterule)
       */
      override fun deprecateRule(): Any? = unwrap(this).getDeprecateRule()

      /**
       * To encrypt a copy of an unencrypted snapshot if encryption by default is not enabled,
       * enable encryption using this parameter.
       *
       * Copies of encrypted snapshots are encrypted, even if this parameter is false or if
       * encryption by default is not enabled.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dlm-lifecyclepolicy-crossregioncopyrule.html#cfn-dlm-lifecyclepolicy-crossregioncopyrule-encrypted)
       */
      override fun encrypted(): Any = unwrap(this).getEncrypted()

      /**
       * The retention rule that indicates how long the cross-Region snapshot or AMI copies are to
       * be retained in the destination Region.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dlm-lifecyclepolicy-crossregioncopyrule.html#cfn-dlm-lifecyclepolicy-crossregioncopyrule-retainrule)
       */
      override fun retainRule(): Any? = unwrap(this).getRetainRule()

      /**
       * Use this parameter for snapshot policies only. For AMI policies, use *TargetRegion*
       * instead.
       *
       * *[Custom snapshot policies only]* The target Region or the Amazon Resource Name (ARN) of
       * the target Outpost for the snapshot copies.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dlm-lifecyclepolicy-crossregioncopyrule.html#cfn-dlm-lifecyclepolicy-crossregioncopyrule-target)
       */
      override fun target(): String? = unwrap(this).getTarget()

      /**
       * Use this parameter for AMI policies only.
       *
       * For snapshot policies, use *Target* instead. For snapshot policies created before the
       * *Target* parameter was introduced, this parameter indicates the target Region for snapshot
       * copies.
       *
       * *[Custom AMI policies only]* The target Region or the Amazon Resource Name (ARN) of the
       * target Outpost for the snapshot copies.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dlm-lifecyclepolicy-crossregioncopyrule.html#cfn-dlm-lifecyclepolicy-crossregioncopyrule-targetregion)
       */
      override fun targetRegion(): String? = unwrap(this).getTargetRegion()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): CrossRegionCopyRuleProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.dlm.CfnLifecyclePolicy.CrossRegionCopyRuleProperty):
          CrossRegionCopyRuleProperty = CdkObjectWrappers.wrap(cdkObject) as?
          CrossRegionCopyRuleProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: CrossRegionCopyRuleProperty):
          software.amazon.awscdk.services.dlm.CfnLifecyclePolicy.CrossRegionCopyRuleProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.dlm.CfnLifecyclePolicy.CrossRegionCopyRuleProperty
    }
  }

  /**
   * *[Custom AMI policies only]* Specifies an AMI deprecation rule for AMIs created by an AMI
   * lifecycle policy.
   *
   * For age-based schedules, you must specify *Interval* and *IntervalUnit* . For count-based
   * schedules, you must specify *Count* .
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.dlm.*;
   * DeprecateRuleProperty deprecateRuleProperty = DeprecateRuleProperty.builder()
   * .count(123)
   * .interval(123)
   * .intervalUnit("intervalUnit")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dlm-lifecyclepolicy-deprecaterule.html)
   */
  public interface DeprecateRuleProperty {
    /**
     * If the schedule has a count-based retention rule, this parameter specifies the number of
     * oldest AMIs to deprecate.
     *
     * The count must be less than or equal to the schedule's retention count, and it can't be
     * greater than 1000.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dlm-lifecyclepolicy-deprecaterule.html#cfn-dlm-lifecyclepolicy-deprecaterule-count)
     */
    public fun count(): Number? = unwrap(this).getCount()

    /**
     * If the schedule has an age-based retention rule, this parameter specifies the period after
     * which to deprecate AMIs created by the schedule.
     *
     * The period must be less than or equal to the schedule's retention period, and it can't be
     * greater than 10 years. This is equivalent to 120 months, 520 weeks, or 3650 days.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dlm-lifecyclepolicy-deprecaterule.html#cfn-dlm-lifecyclepolicy-deprecaterule-interval)
     */
    public fun interval(): Number? = unwrap(this).getInterval()

    /**
     * The unit of time in which to measure the *Interval* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dlm-lifecyclepolicy-deprecaterule.html#cfn-dlm-lifecyclepolicy-deprecaterule-intervalunit)
     */
    public fun intervalUnit(): String? = unwrap(this).getIntervalUnit()

    /**
     * A builder for [DeprecateRuleProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param count If the schedule has a count-based retention rule, this parameter specifies the
       * number of oldest AMIs to deprecate.
       * The count must be less than or equal to the schedule's retention count, and it can't be
       * greater than 1000.
       */
      public fun count(count: Number)

      /**
       * @param interval If the schedule has an age-based retention rule, this parameter specifies
       * the period after which to deprecate AMIs created by the schedule.
       * The period must be less than or equal to the schedule's retention period, and it can't be
       * greater than 10 years. This is equivalent to 120 months, 520 weeks, or 3650 days.
       */
      public fun interval(interval: Number)

      /**
       * @param intervalUnit The unit of time in which to measure the *Interval* .
       */
      public fun intervalUnit(intervalUnit: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.dlm.CfnLifecyclePolicy.DeprecateRuleProperty.Builder =
          software.amazon.awscdk.services.dlm.CfnLifecyclePolicy.DeprecateRuleProperty.builder()

      /**
       * @param count If the schedule has a count-based retention rule, this parameter specifies the
       * number of oldest AMIs to deprecate.
       * The count must be less than or equal to the schedule's retention count, and it can't be
       * greater than 1000.
       */
      override fun count(count: Number) {
        cdkBuilder.count(count)
      }

      /**
       * @param interval If the schedule has an age-based retention rule, this parameter specifies
       * the period after which to deprecate AMIs created by the schedule.
       * The period must be less than or equal to the schedule's retention period, and it can't be
       * greater than 10 years. This is equivalent to 120 months, 520 weeks, or 3650 days.
       */
      override fun interval(interval: Number) {
        cdkBuilder.interval(interval)
      }

      /**
       * @param intervalUnit The unit of time in which to measure the *Interval* .
       */
      override fun intervalUnit(intervalUnit: String) {
        cdkBuilder.intervalUnit(intervalUnit)
      }

      public fun build():
          software.amazon.awscdk.services.dlm.CfnLifecyclePolicy.DeprecateRuleProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.dlm.CfnLifecyclePolicy.DeprecateRuleProperty,
    ) : CdkObject(cdkObject), DeprecateRuleProperty {
      /**
       * If the schedule has a count-based retention rule, this parameter specifies the number of
       * oldest AMIs to deprecate.
       *
       * The count must be less than or equal to the schedule's retention count, and it can't be
       * greater than 1000.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dlm-lifecyclepolicy-deprecaterule.html#cfn-dlm-lifecyclepolicy-deprecaterule-count)
       */
      override fun count(): Number? = unwrap(this).getCount()

      /**
       * If the schedule has an age-based retention rule, this parameter specifies the period after
       * which to deprecate AMIs created by the schedule.
       *
       * The period must be less than or equal to the schedule's retention period, and it can't be
       * greater than 10 years. This is equivalent to 120 months, 520 weeks, or 3650 days.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dlm-lifecyclepolicy-deprecaterule.html#cfn-dlm-lifecyclepolicy-deprecaterule-interval)
       */
      override fun interval(): Number? = unwrap(this).getInterval()

      /**
       * The unit of time in which to measure the *Interval* .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dlm-lifecyclepolicy-deprecaterule.html#cfn-dlm-lifecyclepolicy-deprecaterule-intervalunit)
       */
      override fun intervalUnit(): String? = unwrap(this).getIntervalUnit()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): DeprecateRuleProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.dlm.CfnLifecyclePolicy.DeprecateRuleProperty):
          DeprecateRuleProperty = CdkObjectWrappers.wrap(cdkObject) as? DeprecateRuleProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: DeprecateRuleProperty):
          software.amazon.awscdk.services.dlm.CfnLifecyclePolicy.DeprecateRuleProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.dlm.CfnLifecyclePolicy.DeprecateRuleProperty
    }
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
   * import io.cloudshiftdev.awscdk.services.dlm.*;
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
  public interface EncryptionConfigurationProperty {
    /**
     * The Amazon Resource Name (ARN) of the AWS KMS key to use for EBS encryption.
     *
     * If this parameter is not specified, the default KMS key for the account is used.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dlm-lifecyclepolicy-encryptionconfiguration.html#cfn-dlm-lifecyclepolicy-encryptionconfiguration-cmkarn)
     */
    public fun cmkArn(): String? = unwrap(this).getCmkArn()

    /**
     * To encrypt a copy of an unencrypted snapshot when encryption by default is not enabled,
     * enable encryption using this parameter.
     *
     * Copies of encrypted snapshots are encrypted, even if this parameter is false or when
     * encryption by default is not enabled.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dlm-lifecyclepolicy-encryptionconfiguration.html#cfn-dlm-lifecyclepolicy-encryptionconfiguration-encrypted)
     */
    public fun encrypted(): Any

    /**
     * A builder for [EncryptionConfigurationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param cmkArn The Amazon Resource Name (ARN) of the AWS KMS key to use for EBS encryption.
       * If this parameter is not specified, the default KMS key for the account is used.
       */
      public fun cmkArn(cmkArn: String)

      /**
       * @param encrypted To encrypt a copy of an unencrypted snapshot when encryption by default is
       * not enabled, enable encryption using this parameter. 
       * Copies of encrypted snapshots are encrypted, even if this parameter is false or when
       * encryption by default is not enabled.
       */
      public fun encrypted(encrypted: Boolean)

      /**
       * @param encrypted To encrypt a copy of an unencrypted snapshot when encryption by default is
       * not enabled, enable encryption using this parameter. 
       * Copies of encrypted snapshots are encrypted, even if this parameter is false or when
       * encryption by default is not enabled.
       */
      public fun encrypted(encrypted: IResolvable)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.dlm.CfnLifecyclePolicy.EncryptionConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.dlm.CfnLifecyclePolicy.EncryptionConfigurationProperty.builder()

      /**
       * @param cmkArn The Amazon Resource Name (ARN) of the AWS KMS key to use for EBS encryption.
       * If this parameter is not specified, the default KMS key for the account is used.
       */
      override fun cmkArn(cmkArn: String) {
        cdkBuilder.cmkArn(cmkArn)
      }

      /**
       * @param encrypted To encrypt a copy of an unencrypted snapshot when encryption by default is
       * not enabled, enable encryption using this parameter. 
       * Copies of encrypted snapshots are encrypted, even if this parameter is false or when
       * encryption by default is not enabled.
       */
      override fun encrypted(encrypted: Boolean) {
        cdkBuilder.encrypted(encrypted)
      }

      /**
       * @param encrypted To encrypt a copy of an unencrypted snapshot when encryption by default is
       * not enabled, enable encryption using this parameter. 
       * Copies of encrypted snapshots are encrypted, even if this parameter is false or when
       * encryption by default is not enabled.
       */
      override fun encrypted(encrypted: IResolvable) {
        cdkBuilder.encrypted(encrypted.let(IResolvable::unwrap))
      }

      public fun build():
          software.amazon.awscdk.services.dlm.CfnLifecyclePolicy.EncryptionConfigurationProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.dlm.CfnLifecyclePolicy.EncryptionConfigurationProperty,
    ) : CdkObject(cdkObject), EncryptionConfigurationProperty {
      /**
       * The Amazon Resource Name (ARN) of the AWS KMS key to use for EBS encryption.
       *
       * If this parameter is not specified, the default KMS key for the account is used.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dlm-lifecyclepolicy-encryptionconfiguration.html#cfn-dlm-lifecyclepolicy-encryptionconfiguration-cmkarn)
       */
      override fun cmkArn(): String? = unwrap(this).getCmkArn()

      /**
       * To encrypt a copy of an unencrypted snapshot when encryption by default is not enabled,
       * enable encryption using this parameter.
       *
       * Copies of encrypted snapshots are encrypted, even if this parameter is false or when
       * encryption by default is not enabled.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dlm-lifecyclepolicy-encryptionconfiguration.html#cfn-dlm-lifecyclepolicy-encryptionconfiguration-encrypted)
       */
      override fun encrypted(): Any = unwrap(this).getEncrypted()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): EncryptionConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.dlm.CfnLifecyclePolicy.EncryptionConfigurationProperty):
          EncryptionConfigurationProperty = CdkObjectWrappers.wrap(cdkObject) as?
          EncryptionConfigurationProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: EncryptionConfigurationProperty):
          software.amazon.awscdk.services.dlm.CfnLifecyclePolicy.EncryptionConfigurationProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.dlm.CfnLifecyclePolicy.EncryptionConfigurationProperty
    }
  }

  /**
   * *[Event-based policies only]* Specifies an event that activates an event-based policy.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.dlm.*;
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
  public interface EventParametersProperty {
    /**
     * The snapshot description that can trigger the policy.
     *
     * The description pattern is specified using a regular expression. The policy runs only if a
     * snapshot with a description that matches the specified pattern is shared with your account.
     *
     * For example, specifying `^.*Created for policy: policy-1234567890abcdef0.*$` configures the
     * policy to run only if snapshots created by policy `policy-1234567890abcdef0` are shared with
     * your account.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dlm-lifecyclepolicy-eventparameters.html#cfn-dlm-lifecyclepolicy-eventparameters-descriptionregex)
     */
    public fun descriptionRegex(): String? = unwrap(this).getDescriptionRegex()

    /**
     * The type of event.
     *
     * Currently, only snapshot sharing events are supported.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dlm-lifecyclepolicy-eventparameters.html#cfn-dlm-lifecyclepolicy-eventparameters-eventtype)
     */
    public fun eventType(): String

    /**
     * The IDs of the AWS accounts that can trigger policy by sharing snapshots with your account.
     *
     * The policy only runs if one of the specified AWS accounts shares a snapshot with your
     * account.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dlm-lifecyclepolicy-eventparameters.html#cfn-dlm-lifecyclepolicy-eventparameters-snapshotowner)
     */
    public fun snapshotOwner(): List<String>

    /**
     * A builder for [EventParametersProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param descriptionRegex The snapshot description that can trigger the policy.
       * The description pattern is specified using a regular expression. The policy runs only if a
       * snapshot with a description that matches the specified pattern is shared with your account.
       *
       * For example, specifying `^.*Created for policy: policy-1234567890abcdef0.*$` configures the
       * policy to run only if snapshots created by policy `policy-1234567890abcdef0` are shared with
       * your account.
       */
      public fun descriptionRegex(descriptionRegex: String)

      /**
       * @param eventType The type of event. 
       * Currently, only snapshot sharing events are supported.
       */
      public fun eventType(eventType: String)

      /**
       * @param snapshotOwner The IDs of the AWS accounts that can trigger policy by sharing
       * snapshots with your account. 
       * The policy only runs if one of the specified AWS accounts shares a snapshot with your
       * account.
       */
      public fun snapshotOwner(snapshotOwner: List<String>)

      /**
       * @param snapshotOwner The IDs of the AWS accounts that can trigger policy by sharing
       * snapshots with your account. 
       * The policy only runs if one of the specified AWS accounts shares a snapshot with your
       * account.
       */
      public fun snapshotOwner(vararg snapshotOwner: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.dlm.CfnLifecyclePolicy.EventParametersProperty.Builder =
          software.amazon.awscdk.services.dlm.CfnLifecyclePolicy.EventParametersProperty.builder()

      /**
       * @param descriptionRegex The snapshot description that can trigger the policy.
       * The description pattern is specified using a regular expression. The policy runs only if a
       * snapshot with a description that matches the specified pattern is shared with your account.
       *
       * For example, specifying `^.*Created for policy: policy-1234567890abcdef0.*$` configures the
       * policy to run only if snapshots created by policy `policy-1234567890abcdef0` are shared with
       * your account.
       */
      override fun descriptionRegex(descriptionRegex: String) {
        cdkBuilder.descriptionRegex(descriptionRegex)
      }

      /**
       * @param eventType The type of event. 
       * Currently, only snapshot sharing events are supported.
       */
      override fun eventType(eventType: String) {
        cdkBuilder.eventType(eventType)
      }

      /**
       * @param snapshotOwner The IDs of the AWS accounts that can trigger policy by sharing
       * snapshots with your account. 
       * The policy only runs if one of the specified AWS accounts shares a snapshot with your
       * account.
       */
      override fun snapshotOwner(snapshotOwner: List<String>) {
        cdkBuilder.snapshotOwner(snapshotOwner)
      }

      /**
       * @param snapshotOwner The IDs of the AWS accounts that can trigger policy by sharing
       * snapshots with your account. 
       * The policy only runs if one of the specified AWS accounts shares a snapshot with your
       * account.
       */
      override fun snapshotOwner(vararg snapshotOwner: String): Unit =
          snapshotOwner(snapshotOwner.toList())

      public fun build():
          software.amazon.awscdk.services.dlm.CfnLifecyclePolicy.EventParametersProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.dlm.CfnLifecyclePolicy.EventParametersProperty,
    ) : CdkObject(cdkObject), EventParametersProperty {
      /**
       * The snapshot description that can trigger the policy.
       *
       * The description pattern is specified using a regular expression. The policy runs only if a
       * snapshot with a description that matches the specified pattern is shared with your account.
       *
       * For example, specifying `^.*Created for policy: policy-1234567890abcdef0.*$` configures the
       * policy to run only if snapshots created by policy `policy-1234567890abcdef0` are shared with
       * your account.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dlm-lifecyclepolicy-eventparameters.html#cfn-dlm-lifecyclepolicy-eventparameters-descriptionregex)
       */
      override fun descriptionRegex(): String? = unwrap(this).getDescriptionRegex()

      /**
       * The type of event.
       *
       * Currently, only snapshot sharing events are supported.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dlm-lifecyclepolicy-eventparameters.html#cfn-dlm-lifecyclepolicy-eventparameters-eventtype)
       */
      override fun eventType(): String = unwrap(this).getEventType()

      /**
       * The IDs of the AWS accounts that can trigger policy by sharing snapshots with your account.
       *
       * The policy only runs if one of the specified AWS accounts shares a snapshot with your
       * account.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dlm-lifecyclepolicy-eventparameters.html#cfn-dlm-lifecyclepolicy-eventparameters-snapshotowner)
       */
      override fun snapshotOwner(): List<String> = unwrap(this).getSnapshotOwner()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): EventParametersProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.dlm.CfnLifecyclePolicy.EventParametersProperty):
          EventParametersProperty = CdkObjectWrappers.wrap(cdkObject) as? EventParametersProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: EventParametersProperty):
          software.amazon.awscdk.services.dlm.CfnLifecyclePolicy.EventParametersProperty = (wrapped
          as CdkObject).cdkObject as
          software.amazon.awscdk.services.dlm.CfnLifecyclePolicy.EventParametersProperty
    }
  }

  /**
   * *[Event-based policies only]* Specifies an event that activates an event-based policy.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.dlm.*;
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
  public interface EventSourceProperty {
    /**
     * Information about the event.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dlm-lifecyclepolicy-eventsource.html#cfn-dlm-lifecyclepolicy-eventsource-parameters)
     */
    public fun parameters(): Any? = unwrap(this).getParameters()

    /**
     * The source of the event.
     *
     * Currently only managed CloudWatch Events rules are supported.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dlm-lifecyclepolicy-eventsource.html#cfn-dlm-lifecyclepolicy-eventsource-type)
     */
    public fun type(): String

    /**
     * A builder for [EventSourceProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param parameters Information about the event.
       */
      public fun parameters(parameters: IResolvable)

      /**
       * @param parameters Information about the event.
       */
      public fun parameters(parameters: EventParametersProperty)

      /**
       * @param parameters Information about the event.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("ca1a8456c119a6ab5e78a9fe2209d5e66ecc1d392e84cfbb43a437e6349e6d39")
      public fun parameters(parameters: EventParametersProperty.Builder.() -> Unit)

      /**
       * @param type The source of the event. 
       * Currently only managed CloudWatch Events rules are supported.
       */
      public fun type(type: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.dlm.CfnLifecyclePolicy.EventSourceProperty.Builder =
          software.amazon.awscdk.services.dlm.CfnLifecyclePolicy.EventSourceProperty.builder()

      /**
       * @param parameters Information about the event.
       */
      override fun parameters(parameters: IResolvable) {
        cdkBuilder.parameters(parameters.let(IResolvable::unwrap))
      }

      /**
       * @param parameters Information about the event.
       */
      override fun parameters(parameters: EventParametersProperty) {
        cdkBuilder.parameters(parameters.let(EventParametersProperty::unwrap))
      }

      /**
       * @param parameters Information about the event.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("ca1a8456c119a6ab5e78a9fe2209d5e66ecc1d392e84cfbb43a437e6349e6d39")
      override fun parameters(parameters: EventParametersProperty.Builder.() -> Unit): Unit =
          parameters(EventParametersProperty(parameters))

      /**
       * @param type The source of the event. 
       * Currently only managed CloudWatch Events rules are supported.
       */
      override fun type(type: String) {
        cdkBuilder.type(type)
      }

      public fun build(): software.amazon.awscdk.services.dlm.CfnLifecyclePolicy.EventSourceProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.dlm.CfnLifecyclePolicy.EventSourceProperty,
    ) : CdkObject(cdkObject), EventSourceProperty {
      /**
       * Information about the event.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dlm-lifecyclepolicy-eventsource.html#cfn-dlm-lifecyclepolicy-eventsource-parameters)
       */
      override fun parameters(): Any? = unwrap(this).getParameters()

      /**
       * The source of the event.
       *
       * Currently only managed CloudWatch Events rules are supported.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dlm-lifecyclepolicy-eventsource.html#cfn-dlm-lifecyclepolicy-eventsource-type)
       */
      override fun type(): String = unwrap(this).getType()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): EventSourceProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.dlm.CfnLifecyclePolicy.EventSourceProperty):
          EventSourceProperty = CdkObjectWrappers.wrap(cdkObject) as? EventSourceProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: EventSourceProperty):
          software.amazon.awscdk.services.dlm.CfnLifecyclePolicy.EventSourceProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.dlm.CfnLifecyclePolicy.EventSourceProperty
    }
  }

  /**
   * *[Default policies only]* Specifies exclusion parameters for volumes or instances for which you
   * do not want to create snapshots or AMIs.
   *
   * The policy will not create snapshots or AMIs for target resources that match any of the
   * specified exclusion parameters.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.dlm.*;
   * Object excludeTags;
   * Object excludeVolumeTypes;
   * ExclusionsProperty exclusionsProperty = ExclusionsProperty.builder()
   * .excludeBootVolumes(false)
   * .excludeTags(excludeTags)
   * .excludeVolumeTypes(excludeVolumeTypes)
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dlm-lifecyclepolicy-exclusions.html)
   */
  public interface ExclusionsProperty {
    /**
     * *[Default policies for EBS snapshots only]* Indicates whether to exclude volumes that are
     * attached to instances as the boot volume.
     *
     * If you exclude boot volumes, only volumes attached as data (non-boot) volumes will be backed
     * up by the policy. To exclude boot volumes, specify `true` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dlm-lifecyclepolicy-exclusions.html#cfn-dlm-lifecyclepolicy-exclusions-excludebootvolumes)
     */
    public fun excludeBootVolumes(): Any? = unwrap(this).getExcludeBootVolumes()

    /**
     * *[Default policies for EBS-backed AMIs only]* Specifies whether to exclude volumes that have
     * specific tags.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dlm-lifecyclepolicy-exclusions.html#cfn-dlm-lifecyclepolicy-exclusions-excludetags)
     */
    public fun excludeTags(): Any? = unwrap(this).getExcludeTags()

    /**
     * *[Default policies for EBS snapshots only]* Specifies the volume types to exclude.
     *
     * Volumes of the specified types will not be targeted by the policy.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dlm-lifecyclepolicy-exclusions.html#cfn-dlm-lifecyclepolicy-exclusions-excludevolumetypes)
     */
    public fun excludeVolumeTypes(): Any? = unwrap(this).getExcludeVolumeTypes()

    /**
     * A builder for [ExclusionsProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param excludeBootVolumes *[Default policies for EBS snapshots only]* Indicates whether to
       * exclude volumes that are attached to instances as the boot volume.
       * If you exclude boot volumes, only volumes attached as data (non-boot) volumes will be
       * backed up by the policy. To exclude boot volumes, specify `true` .
       */
      public fun excludeBootVolumes(excludeBootVolumes: Boolean)

      /**
       * @param excludeBootVolumes *[Default policies for EBS snapshots only]* Indicates whether to
       * exclude volumes that are attached to instances as the boot volume.
       * If you exclude boot volumes, only volumes attached as data (non-boot) volumes will be
       * backed up by the policy. To exclude boot volumes, specify `true` .
       */
      public fun excludeBootVolumes(excludeBootVolumes: IResolvable)

      /**
       * @param excludeTags *[Default policies for EBS-backed AMIs only]* Specifies whether to
       * exclude volumes that have specific tags.
       */
      public fun excludeTags(excludeTags: Any)

      /**
       * @param excludeVolumeTypes *[Default policies for EBS snapshots only]* Specifies the volume
       * types to exclude.
       * Volumes of the specified types will not be targeted by the policy.
       */
      public fun excludeVolumeTypes(excludeVolumeTypes: Any)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.dlm.CfnLifecyclePolicy.ExclusionsProperty.Builder =
          software.amazon.awscdk.services.dlm.CfnLifecyclePolicy.ExclusionsProperty.builder()

      /**
       * @param excludeBootVolumes *[Default policies for EBS snapshots only]* Indicates whether to
       * exclude volumes that are attached to instances as the boot volume.
       * If you exclude boot volumes, only volumes attached as data (non-boot) volumes will be
       * backed up by the policy. To exclude boot volumes, specify `true` .
       */
      override fun excludeBootVolumes(excludeBootVolumes: Boolean) {
        cdkBuilder.excludeBootVolumes(excludeBootVolumes)
      }

      /**
       * @param excludeBootVolumes *[Default policies for EBS snapshots only]* Indicates whether to
       * exclude volumes that are attached to instances as the boot volume.
       * If you exclude boot volumes, only volumes attached as data (non-boot) volumes will be
       * backed up by the policy. To exclude boot volumes, specify `true` .
       */
      override fun excludeBootVolumes(excludeBootVolumes: IResolvable) {
        cdkBuilder.excludeBootVolumes(excludeBootVolumes.let(IResolvable::unwrap))
      }

      /**
       * @param excludeTags *[Default policies for EBS-backed AMIs only]* Specifies whether to
       * exclude volumes that have specific tags.
       */
      override fun excludeTags(excludeTags: Any) {
        cdkBuilder.excludeTags(excludeTags)
      }

      /**
       * @param excludeVolumeTypes *[Default policies for EBS snapshots only]* Specifies the volume
       * types to exclude.
       * Volumes of the specified types will not be targeted by the policy.
       */
      override fun excludeVolumeTypes(excludeVolumeTypes: Any) {
        cdkBuilder.excludeVolumeTypes(excludeVolumeTypes)
      }

      public fun build(): software.amazon.awscdk.services.dlm.CfnLifecyclePolicy.ExclusionsProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.dlm.CfnLifecyclePolicy.ExclusionsProperty,
    ) : CdkObject(cdkObject), ExclusionsProperty {
      /**
       * *[Default policies for EBS snapshots only]* Indicates whether to exclude volumes that are
       * attached to instances as the boot volume.
       *
       * If you exclude boot volumes, only volumes attached as data (non-boot) volumes will be
       * backed up by the policy. To exclude boot volumes, specify `true` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dlm-lifecyclepolicy-exclusions.html#cfn-dlm-lifecyclepolicy-exclusions-excludebootvolumes)
       */
      override fun excludeBootVolumes(): Any? = unwrap(this).getExcludeBootVolumes()

      /**
       * *[Default policies for EBS-backed AMIs only]* Specifies whether to exclude volumes that
       * have specific tags.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dlm-lifecyclepolicy-exclusions.html#cfn-dlm-lifecyclepolicy-exclusions-excludetags)
       */
      override fun excludeTags(): Any? = unwrap(this).getExcludeTags()

      /**
       * *[Default policies for EBS snapshots only]* Specifies the volume types to exclude.
       *
       * Volumes of the specified types will not be targeted by the policy.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dlm-lifecyclepolicy-exclusions.html#cfn-dlm-lifecyclepolicy-exclusions-excludevolumetypes)
       */
      override fun excludeVolumeTypes(): Any? = unwrap(this).getExcludeVolumeTypes()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): ExclusionsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.dlm.CfnLifecyclePolicy.ExclusionsProperty):
          ExclusionsProperty = CdkObjectWrappers.wrap(cdkObject) as? ExclusionsProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: ExclusionsProperty):
          software.amazon.awscdk.services.dlm.CfnLifecyclePolicy.ExclusionsProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.dlm.CfnLifecyclePolicy.ExclusionsProperty
    }
  }

  /**
   * *[Custom snapshot policies only]* Specifies a rule for enabling fast snapshot restore for
   * snapshots created by snapshot policies.
   *
   * You can enable fast snapshot restore based on either a count or a time interval.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.dlm.*;
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
  public interface FastRestoreRuleProperty {
    /**
     * The Availability Zones in which to enable fast snapshot restore.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dlm-lifecyclepolicy-fastrestorerule.html#cfn-dlm-lifecyclepolicy-fastrestorerule-availabilityzones)
     */
    public fun availabilityZones(): List<String> = unwrap(this).getAvailabilityZones() ?:
        emptyList()

    /**
     * The number of snapshots to be enabled with fast snapshot restore.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dlm-lifecyclepolicy-fastrestorerule.html#cfn-dlm-lifecyclepolicy-fastrestorerule-count)
     */
    public fun count(): Number? = unwrap(this).getCount()

    /**
     * The amount of time to enable fast snapshot restore.
     *
     * The maximum is 100 years. This is equivalent to 1200 months, 5200 weeks, or 36500 days.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dlm-lifecyclepolicy-fastrestorerule.html#cfn-dlm-lifecyclepolicy-fastrestorerule-interval)
     */
    public fun interval(): Number? = unwrap(this).getInterval()

    /**
     * The unit of time for enabling fast snapshot restore.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dlm-lifecyclepolicy-fastrestorerule.html#cfn-dlm-lifecyclepolicy-fastrestorerule-intervalunit)
     */
    public fun intervalUnit(): String? = unwrap(this).getIntervalUnit()

    /**
     * A builder for [FastRestoreRuleProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param availabilityZones The Availability Zones in which to enable fast snapshot restore.
       */
      public fun availabilityZones(availabilityZones: List<String>)

      /**
       * @param availabilityZones The Availability Zones in which to enable fast snapshot restore.
       */
      public fun availabilityZones(vararg availabilityZones: String)

      /**
       * @param count The number of snapshots to be enabled with fast snapshot restore.
       */
      public fun count(count: Number)

      /**
       * @param interval The amount of time to enable fast snapshot restore.
       * The maximum is 100 years. This is equivalent to 1200 months, 5200 weeks, or 36500 days.
       */
      public fun interval(interval: Number)

      /**
       * @param intervalUnit The unit of time for enabling fast snapshot restore.
       */
      public fun intervalUnit(intervalUnit: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.dlm.CfnLifecyclePolicy.FastRestoreRuleProperty.Builder =
          software.amazon.awscdk.services.dlm.CfnLifecyclePolicy.FastRestoreRuleProperty.builder()

      /**
       * @param availabilityZones The Availability Zones in which to enable fast snapshot restore.
       */
      override fun availabilityZones(availabilityZones: List<String>) {
        cdkBuilder.availabilityZones(availabilityZones)
      }

      /**
       * @param availabilityZones The Availability Zones in which to enable fast snapshot restore.
       */
      override fun availabilityZones(vararg availabilityZones: String): Unit =
          availabilityZones(availabilityZones.toList())

      /**
       * @param count The number of snapshots to be enabled with fast snapshot restore.
       */
      override fun count(count: Number) {
        cdkBuilder.count(count)
      }

      /**
       * @param interval The amount of time to enable fast snapshot restore.
       * The maximum is 100 years. This is equivalent to 1200 months, 5200 weeks, or 36500 days.
       */
      override fun interval(interval: Number) {
        cdkBuilder.interval(interval)
      }

      /**
       * @param intervalUnit The unit of time for enabling fast snapshot restore.
       */
      override fun intervalUnit(intervalUnit: String) {
        cdkBuilder.intervalUnit(intervalUnit)
      }

      public fun build():
          software.amazon.awscdk.services.dlm.CfnLifecyclePolicy.FastRestoreRuleProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.dlm.CfnLifecyclePolicy.FastRestoreRuleProperty,
    ) : CdkObject(cdkObject), FastRestoreRuleProperty {
      /**
       * The Availability Zones in which to enable fast snapshot restore.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dlm-lifecyclepolicy-fastrestorerule.html#cfn-dlm-lifecyclepolicy-fastrestorerule-availabilityzones)
       */
      override fun availabilityZones(): List<String> = unwrap(this).getAvailabilityZones() ?:
          emptyList()

      /**
       * The number of snapshots to be enabled with fast snapshot restore.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dlm-lifecyclepolicy-fastrestorerule.html#cfn-dlm-lifecyclepolicy-fastrestorerule-count)
       */
      override fun count(): Number? = unwrap(this).getCount()

      /**
       * The amount of time to enable fast snapshot restore.
       *
       * The maximum is 100 years. This is equivalent to 1200 months, 5200 weeks, or 36500 days.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dlm-lifecyclepolicy-fastrestorerule.html#cfn-dlm-lifecyclepolicy-fastrestorerule-interval)
       */
      override fun interval(): Number? = unwrap(this).getInterval()

      /**
       * The unit of time for enabling fast snapshot restore.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dlm-lifecyclepolicy-fastrestorerule.html#cfn-dlm-lifecyclepolicy-fastrestorerule-intervalunit)
       */
      override fun intervalUnit(): String? = unwrap(this).getIntervalUnit()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): FastRestoreRuleProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.dlm.CfnLifecyclePolicy.FastRestoreRuleProperty):
          FastRestoreRuleProperty = CdkObjectWrappers.wrap(cdkObject) as? FastRestoreRuleProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: FastRestoreRuleProperty):
          software.amazon.awscdk.services.dlm.CfnLifecyclePolicy.FastRestoreRuleProperty = (wrapped
          as CdkObject).cdkObject as
          software.amazon.awscdk.services.dlm.CfnLifecyclePolicy.FastRestoreRuleProperty
    }
  }

  /**
   * *[Custom snapshot and AMI policies only]* Specifies optional parameters for snapshot and AMI
   * policies.
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
   * import io.cloudshiftdev.awscdk.services.dlm.*;
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
  public interface ParametersProperty {
    /**
     * *[Custom snapshot policies that target instances only]* Indicates whether to exclude the root
     * volume from multi-volume snapshot sets.
     *
     * The default is `false` . If you specify `true` , then the root volumes attached to targeted
     * instances will be excluded from the multi-volume snapshot sets created by the policy.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dlm-lifecyclepolicy-parameters.html#cfn-dlm-lifecyclepolicy-parameters-excludebootvolume)
     */
    public fun excludeBootVolume(): Any? = unwrap(this).getExcludeBootVolume()

    /**
     * *[Custom snapshot policies that target instances only]* The tags used to identify data
     * (non-root) volumes to exclude from multi-volume snapshot sets.
     *
     * If you create a snapshot lifecycle policy that targets instances and you specify tags for
     * this parameter, then data volumes with the specified tags that are attached to targeted
     * instances will be excluded from the multi-volume snapshot sets created by the policy.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dlm-lifecyclepolicy-parameters.html#cfn-dlm-lifecyclepolicy-parameters-excludedatavolumetags)
     */
    public fun excludeDataVolumeTags(): Any? = unwrap(this).getExcludeDataVolumeTags()

    /**
     * *[Custom AMI policies only]* Indicates whether targeted instances are rebooted when the
     * lifecycle policy runs.
     *
     * `true` indicates that targeted instances are not rebooted when the policy runs. `false`
     * indicates that target instances are rebooted when the policy runs. The default is `true`
     * (instances are not rebooted).
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dlm-lifecyclepolicy-parameters.html#cfn-dlm-lifecyclepolicy-parameters-noreboot)
     */
    public fun noReboot(): Any? = unwrap(this).getNoReboot()

    /**
     * A builder for [ParametersProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param excludeBootVolume *[Custom snapshot policies that target instances only]* Indicates
       * whether to exclude the root volume from multi-volume snapshot sets.
       * The default is `false` . If you specify `true` , then the root volumes attached to targeted
       * instances will be excluded from the multi-volume snapshot sets created by the policy.
       */
      public fun excludeBootVolume(excludeBootVolume: Boolean)

      /**
       * @param excludeBootVolume *[Custom snapshot policies that target instances only]* Indicates
       * whether to exclude the root volume from multi-volume snapshot sets.
       * The default is `false` . If you specify `true` , then the root volumes attached to targeted
       * instances will be excluded from the multi-volume snapshot sets created by the policy.
       */
      public fun excludeBootVolume(excludeBootVolume: IResolvable)

      /**
       * @param excludeDataVolumeTags *[Custom snapshot policies that target instances only]* The
       * tags used to identify data (non-root) volumes to exclude from multi-volume snapshot sets.
       * If you create a snapshot lifecycle policy that targets instances and you specify tags for
       * this parameter, then data volumes with the specified tags that are attached to targeted
       * instances will be excluded from the multi-volume snapshot sets created by the policy.
       */
      public fun excludeDataVolumeTags(excludeDataVolumeTags: IResolvable)

      /**
       * @param excludeDataVolumeTags *[Custom snapshot policies that target instances only]* The
       * tags used to identify data (non-root) volumes to exclude from multi-volume snapshot sets.
       * If you create a snapshot lifecycle policy that targets instances and you specify tags for
       * this parameter, then data volumes with the specified tags that are attached to targeted
       * instances will be excluded from the multi-volume snapshot sets created by the policy.
       */
      public fun excludeDataVolumeTags(excludeDataVolumeTags: List<Any>)

      /**
       * @param excludeDataVolumeTags *[Custom snapshot policies that target instances only]* The
       * tags used to identify data (non-root) volumes to exclude from multi-volume snapshot sets.
       * If you create a snapshot lifecycle policy that targets instances and you specify tags for
       * this parameter, then data volumes with the specified tags that are attached to targeted
       * instances will be excluded from the multi-volume snapshot sets created by the policy.
       */
      public fun excludeDataVolumeTags(vararg excludeDataVolumeTags: Any)

      /**
       * @param noReboot *[Custom AMI policies only]* Indicates whether targeted instances are
       * rebooted when the lifecycle policy runs.
       * `true` indicates that targeted instances are not rebooted when the policy runs. `false`
       * indicates that target instances are rebooted when the policy runs. The default is `true`
       * (instances are not rebooted).
       */
      public fun noReboot(noReboot: Boolean)

      /**
       * @param noReboot *[Custom AMI policies only]* Indicates whether targeted instances are
       * rebooted when the lifecycle policy runs.
       * `true` indicates that targeted instances are not rebooted when the policy runs. `false`
       * indicates that target instances are rebooted when the policy runs. The default is `true`
       * (instances are not rebooted).
       */
      public fun noReboot(noReboot: IResolvable)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.dlm.CfnLifecyclePolicy.ParametersProperty.Builder =
          software.amazon.awscdk.services.dlm.CfnLifecyclePolicy.ParametersProperty.builder()

      /**
       * @param excludeBootVolume *[Custom snapshot policies that target instances only]* Indicates
       * whether to exclude the root volume from multi-volume snapshot sets.
       * The default is `false` . If you specify `true` , then the root volumes attached to targeted
       * instances will be excluded from the multi-volume snapshot sets created by the policy.
       */
      override fun excludeBootVolume(excludeBootVolume: Boolean) {
        cdkBuilder.excludeBootVolume(excludeBootVolume)
      }

      /**
       * @param excludeBootVolume *[Custom snapshot policies that target instances only]* Indicates
       * whether to exclude the root volume from multi-volume snapshot sets.
       * The default is `false` . If you specify `true` , then the root volumes attached to targeted
       * instances will be excluded from the multi-volume snapshot sets created by the policy.
       */
      override fun excludeBootVolume(excludeBootVolume: IResolvable) {
        cdkBuilder.excludeBootVolume(excludeBootVolume.let(IResolvable::unwrap))
      }

      /**
       * @param excludeDataVolumeTags *[Custom snapshot policies that target instances only]* The
       * tags used to identify data (non-root) volumes to exclude from multi-volume snapshot sets.
       * If you create a snapshot lifecycle policy that targets instances and you specify tags for
       * this parameter, then data volumes with the specified tags that are attached to targeted
       * instances will be excluded from the multi-volume snapshot sets created by the policy.
       */
      override fun excludeDataVolumeTags(excludeDataVolumeTags: IResolvable) {
        cdkBuilder.excludeDataVolumeTags(excludeDataVolumeTags.let(IResolvable::unwrap))
      }

      /**
       * @param excludeDataVolumeTags *[Custom snapshot policies that target instances only]* The
       * tags used to identify data (non-root) volumes to exclude from multi-volume snapshot sets.
       * If you create a snapshot lifecycle policy that targets instances and you specify tags for
       * this parameter, then data volumes with the specified tags that are attached to targeted
       * instances will be excluded from the multi-volume snapshot sets created by the policy.
       */
      override fun excludeDataVolumeTags(excludeDataVolumeTags: List<Any>) {
        cdkBuilder.excludeDataVolumeTags(excludeDataVolumeTags)
      }

      /**
       * @param excludeDataVolumeTags *[Custom snapshot policies that target instances only]* The
       * tags used to identify data (non-root) volumes to exclude from multi-volume snapshot sets.
       * If you create a snapshot lifecycle policy that targets instances and you specify tags for
       * this parameter, then data volumes with the specified tags that are attached to targeted
       * instances will be excluded from the multi-volume snapshot sets created by the policy.
       */
      override fun excludeDataVolumeTags(vararg excludeDataVolumeTags: Any): Unit =
          excludeDataVolumeTags(excludeDataVolumeTags.toList())

      /**
       * @param noReboot *[Custom AMI policies only]* Indicates whether targeted instances are
       * rebooted when the lifecycle policy runs.
       * `true` indicates that targeted instances are not rebooted when the policy runs. `false`
       * indicates that target instances are rebooted when the policy runs. The default is `true`
       * (instances are not rebooted).
       */
      override fun noReboot(noReboot: Boolean) {
        cdkBuilder.noReboot(noReboot)
      }

      /**
       * @param noReboot *[Custom AMI policies only]* Indicates whether targeted instances are
       * rebooted when the lifecycle policy runs.
       * `true` indicates that targeted instances are not rebooted when the policy runs. `false`
       * indicates that target instances are rebooted when the policy runs. The default is `true`
       * (instances are not rebooted).
       */
      override fun noReboot(noReboot: IResolvable) {
        cdkBuilder.noReboot(noReboot.let(IResolvable::unwrap))
      }

      public fun build(): software.amazon.awscdk.services.dlm.CfnLifecyclePolicy.ParametersProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.dlm.CfnLifecyclePolicy.ParametersProperty,
    ) : CdkObject(cdkObject), ParametersProperty {
      /**
       * *[Custom snapshot policies that target instances only]* Indicates whether to exclude the
       * root volume from multi-volume snapshot sets.
       *
       * The default is `false` . If you specify `true` , then the root volumes attached to targeted
       * instances will be excluded from the multi-volume snapshot sets created by the policy.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dlm-lifecyclepolicy-parameters.html#cfn-dlm-lifecyclepolicy-parameters-excludebootvolume)
       */
      override fun excludeBootVolume(): Any? = unwrap(this).getExcludeBootVolume()

      /**
       * *[Custom snapshot policies that target instances only]* The tags used to identify data
       * (non-root) volumes to exclude from multi-volume snapshot sets.
       *
       * If you create a snapshot lifecycle policy that targets instances and you specify tags for
       * this parameter, then data volumes with the specified tags that are attached to targeted
       * instances will be excluded from the multi-volume snapshot sets created by the policy.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dlm-lifecyclepolicy-parameters.html#cfn-dlm-lifecyclepolicy-parameters-excludedatavolumetags)
       */
      override fun excludeDataVolumeTags(): Any? = unwrap(this).getExcludeDataVolumeTags()

      /**
       * *[Custom AMI policies only]* Indicates whether targeted instances are rebooted when the
       * lifecycle policy runs.
       *
       * `true` indicates that targeted instances are not rebooted when the policy runs. `false`
       * indicates that target instances are rebooted when the policy runs. The default is `true`
       * (instances are not rebooted).
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dlm-lifecyclepolicy-parameters.html#cfn-dlm-lifecyclepolicy-parameters-noreboot)
       */
      override fun noReboot(): Any? = unwrap(this).getNoReboot()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): ParametersProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.dlm.CfnLifecyclePolicy.ParametersProperty):
          ParametersProperty = CdkObjectWrappers.wrap(cdkObject) as? ParametersProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: ParametersProperty):
          software.amazon.awscdk.services.dlm.CfnLifecyclePolicy.ParametersProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.dlm.CfnLifecyclePolicy.ParametersProperty
    }
  }

  /**
   * Specifies the configuration of a lifecycle policy.
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
  public interface PolicyDetailsProperty {
    /**
     * *[Event-based policies only]* The actions to be performed when the event-based policy is
     * activated.
     *
     * You can specify only one action per policy.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dlm-lifecyclepolicy-policydetails.html#cfn-dlm-lifecyclepolicy-policydetails-actions)
     */
    public fun actions(): Any? = unwrap(this).getActions()

    /**
     * *[Default policies only]* Indicates whether the policy should copy tags from the source
     * resource to the snapshot or AMI.
     *
     * If you do not specify a value, the default is `false` .
     *
     * Default: false
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dlm-lifecyclepolicy-policydetails.html#cfn-dlm-lifecyclepolicy-policydetails-copytags)
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
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dlm-lifecyclepolicy-policydetails.html#cfn-dlm-lifecyclepolicy-policydetails-createinterval)
     */
    public fun createInterval(): Number? = unwrap(this).getCreateInterval()

    /**
     * *[Default policies only]* Specifies destination Regions for snapshot or AMI copies.
     *
     * You can specify up to 3 destination Regions. If you do not want to create cross-Region
     * copies, omit this parameter.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dlm-lifecyclepolicy-policydetails.html#cfn-dlm-lifecyclepolicy-policydetails-crossregioncopytargets)
     */
    public fun crossRegionCopyTargets(): Any? = unwrap(this).getCrossRegionCopyTargets()

    /**
     * *[Event-based policies only]* The event that activates the event-based policy.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dlm-lifecyclepolicy-policydetails.html#cfn-dlm-lifecyclepolicy-policydetails-eventsource)
     */
    public fun eventSource(): Any? = unwrap(this).getEventSource()

    /**
     * *[Default policies only]* Specifies exclusion parameters for volumes or instances for which
     * you do not want to create snapshots or AMIs.
     *
     * The policy will not create snapshots or AMIs for target resources that match any of the
     * specified exclusion parameters.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dlm-lifecyclepolicy-policydetails.html#cfn-dlm-lifecyclepolicy-policydetails-exclusions)
     */
    public fun exclusions(): Any? = unwrap(this).getExclusions()

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
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dlm-lifecyclepolicy-policydetails.html#cfn-dlm-lifecyclepolicy-policydetails-extenddeletion)
     */
    public fun extendDeletion(): Any? = unwrap(this).getExtendDeletion()

    /**
     * *[Custom snapshot and AMI policies only]* A set of optional parameters for snapshot and AMI
     * lifecycle policies.
     *
     *
     * If you are modifying a policy that was created or previously modified using the Amazon Data
     * Lifecycle Manager console, then you must include this parameter and specify either the default
     * values or the new values that you require. You can't omit this parameter or set its values to
     * null.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dlm-lifecyclepolicy-policydetails.html#cfn-dlm-lifecyclepolicy-policydetails-parameters)
     */
    public fun parameters(): Any? = unwrap(this).getParameters()

    /**
     * The type of policy to create. Specify one of the following:.
     *
     * * `SIMPLIFIED` To create a default policy.
     * * `STANDARD` To create a custom policy.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dlm-lifecyclepolicy-policydetails.html#cfn-dlm-lifecyclepolicy-policydetails-policylanguage)
     */
    public fun policyLanguage(): String? = unwrap(this).getPolicyLanguage()

    /**
     * The type of policy.
     *
     * Specify `EBS_SNAPSHOT_MANAGEMENT` to create a lifecycle policy that manages the lifecycle of
     * Amazon EBS snapshots. Specify `IMAGE_MANAGEMENT` to create a lifecycle policy that manages the
     * lifecycle of EBS-backed AMIs. Specify `EVENT_BASED_POLICY` to create an event-based policy that
     * performs specific actions when a defined event occurs in your AWS account .
     *
     * The default is `EBS_SNAPSHOT_MANAGEMENT` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dlm-lifecyclepolicy-policydetails.html#cfn-dlm-lifecyclepolicy-policydetails-policytype)
     */
    public fun policyType(): String? = unwrap(this).getPolicyType()

    /**
     * *[Custom snapshot and AMI policies only]* The location of the resources to backup.
     *
     * If the source resources are located in an AWS Region , specify `CLOUD` . If the source
     * resources are located on an Outpost in your account, specify `OUTPOST` .
     *
     * If you specify `OUTPOST` , Amazon Data Lifecycle Manager backs up all resources of the
     * specified type with matching target tags across all of the Outposts in your account.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dlm-lifecyclepolicy-policydetails.html#cfn-dlm-lifecyclepolicy-policydetails-resourcelocations)
     */
    public fun resourceLocations(): List<String> = unwrap(this).getResourceLocations() ?:
        emptyList()

    /**
     * *[Default policies only]* Specify the type of default policy to create.
     *
     * * To create a default policy for EBS snapshots, that creates snapshots of all volumes in the
     * Region that do not have recent backups, specify `VOLUME` .
     * * To create a default policy for EBS-backed AMIs, that creates EBS-backed AMIs from all
     * instances in the Region that do not have recent backups, specify `INSTANCE` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dlm-lifecyclepolicy-policydetails.html#cfn-dlm-lifecyclepolicy-policydetails-resourcetype)
     */
    public fun resourceType(): String? = unwrap(this).getResourceType()

    /**
     * *[Custom snapshot policies only]* The target resource type for snapshot and AMI lifecycle
     * policies.
     *
     * Use `VOLUME` to create snapshots of individual volumes or use `INSTANCE` to create
     * multi-volume snapshots from the volumes for an instance.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dlm-lifecyclepolicy-policydetails.html#cfn-dlm-lifecyclepolicy-policydetails-resourcetypes)
     */
    public fun resourceTypes(): List<String> = unwrap(this).getResourceTypes() ?: emptyList()

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
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dlm-lifecyclepolicy-policydetails.html#cfn-dlm-lifecyclepolicy-policydetails-retaininterval)
     */
    public fun retainInterval(): Number? = unwrap(this).getRetainInterval()

    /**
     * *[Custom snapshot and AMI policies only]* The schedules of policy-defined actions for
     * snapshot and AMI lifecycle policies.
     *
     * A policy can have up to four schedules—one mandatory schedule and up to three optional
     * schedules.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dlm-lifecyclepolicy-policydetails.html#cfn-dlm-lifecyclepolicy-policydetails-schedules)
     */
    public fun schedules(): Any? = unwrap(this).getSchedules()

    /**
     * *[Custom snapshot and AMI policies only]* The single tag that identifies targeted resources
     * for this policy.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dlm-lifecyclepolicy-policydetails.html#cfn-dlm-lifecyclepolicy-policydetails-targettags)
     */
    public fun targetTags(): Any? = unwrap(this).getTargetTags()

    /**
     * A builder for [PolicyDetailsProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param actions *[Event-based policies only]* The actions to be performed when the
       * event-based policy is activated.
       * You can specify only one action per policy.
       */
      public fun actions(actions: IResolvable)

      /**
       * @param actions *[Event-based policies only]* The actions to be performed when the
       * event-based policy is activated.
       * You can specify only one action per policy.
       */
      public fun actions(actions: List<Any>)

      /**
       * @param actions *[Event-based policies only]* The actions to be performed when the
       * event-based policy is activated.
       * You can specify only one action per policy.
       */
      public fun actions(vararg actions: Any)

      /**
       * @param copyTags *[Default policies only]* Indicates whether the policy should copy tags
       * from the source resource to the snapshot or AMI.
       * If you do not specify a value, the default is `false` .
       *
       * Default: false
       */
      public fun copyTags(copyTags: Boolean)

      /**
       * @param copyTags *[Default policies only]* Indicates whether the policy should copy tags
       * from the source resource to the snapshot or AMI.
       * If you do not specify a value, the default is `false` .
       *
       * Default: false
       */
      public fun copyTags(copyTags: IResolvable)

      /**
       * @param createInterval *[Default policies only]* Specifies how often the policy should run
       * and create snapshots or AMIs.
       * The creation frequency can range from 1 to 7 days. If you do not specify a value, the
       * default is 1.
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
       * @param eventSource *[Event-based policies only]* The event that activates the event-based
       * policy.
       */
      public fun eventSource(eventSource: IResolvable)

      /**
       * @param eventSource *[Event-based policies only]* The event that activates the event-based
       * policy.
       */
      public fun eventSource(eventSource: EventSourceProperty)

      /**
       * @param eventSource *[Event-based policies only]* The event that activates the event-based
       * policy.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("ba83ec6e9b31ee2c9c1ff3156958ae645319be35d35de2f973f49684befb2366")
      public fun eventSource(eventSource: EventSourceProperty.Builder.() -> Unit)

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
      public fun exclusions(exclusions: ExclusionsProperty)

      /**
       * @param exclusions *[Default policies only]* Specifies exclusion parameters for volumes or
       * instances for which you do not want to create snapshots or AMIs.
       * The policy will not create snapshots or AMIs for target resources that match any of the
       * specified exclusion parameters.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("a23751e6286540ce8214da2c5c32d2b4241adcd6b610e271b7f8c8022ef2e737")
      public fun exclusions(exclusions: ExclusionsProperty.Builder.() -> Unit)

      /**
       * @param extendDeletion *[Default policies only]* Defines the snapshot or AMI retention
       * behavior for the policy if the source volume or instance is deleted, or if the policy enters
       * the error, disabled, or deleted state.
       * By default ( *ExtendDeletion=false* ):
       *
       * * If a source resource is deleted, Amazon Data Lifecycle Manager will continue to delete
       * previously created snapshots or AMIs, up to but not including the last one, based on the
       * specified retention period. If you want Amazon Data Lifecycle Manager to delete all snapshots
       * or AMIs, including the last one, specify `true` .
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
       * behavior for the policy if the source volume or instance is deleted, or if the policy enters
       * the error, disabled, or deleted state.
       * By default ( *ExtendDeletion=false* ):
       *
       * * If a source resource is deleted, Amazon Data Lifecycle Manager will continue to delete
       * previously created snapshots or AMIs, up to but not including the last one, based on the
       * specified retention period. If you want Amazon Data Lifecycle Manager to delete all snapshots
       * or AMIs, including the last one, specify `true` .
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
       * @param parameters *[Custom snapshot and AMI policies only]* A set of optional parameters
       * for snapshot and AMI lifecycle policies.
       *
       * If you are modifying a policy that was created or previously modified using the Amazon Data
       * Lifecycle Manager console, then you must include this parameter and specify either the default
       * values or the new values that you require. You can't omit this parameter or set its values to
       * null.
       */
      public fun parameters(parameters: IResolvable)

      /**
       * @param parameters *[Custom snapshot and AMI policies only]* A set of optional parameters
       * for snapshot and AMI lifecycle policies.
       *
       * If you are modifying a policy that was created or previously modified using the Amazon Data
       * Lifecycle Manager console, then you must include this parameter and specify either the default
       * values or the new values that you require. You can't omit this parameter or set its values to
       * null.
       */
      public fun parameters(parameters: ParametersProperty)

      /**
       * @param parameters *[Custom snapshot and AMI policies only]* A set of optional parameters
       * for snapshot and AMI lifecycle policies.
       *
       * If you are modifying a policy that was created or previously modified using the Amazon Data
       * Lifecycle Manager console, then you must include this parameter and specify either the default
       * values or the new values that you require. You can't omit this parameter or set its values to
       * null.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("6937457773f3f964d1feaeee552709969c224187e8424aedf46a7bdf9a5e6def")
      public fun parameters(parameters: ParametersProperty.Builder.() -> Unit)

      /**
       * @param policyLanguage The type of policy to create. Specify one of the following:.
       * * `SIMPLIFIED` To create a default policy.
       * * `STANDARD` To create a custom policy.
       */
      public fun policyLanguage(policyLanguage: String)

      /**
       * @param policyType The type of policy.
       * Specify `EBS_SNAPSHOT_MANAGEMENT` to create a lifecycle policy that manages the lifecycle
       * of Amazon EBS snapshots. Specify `IMAGE_MANAGEMENT` to create a lifecycle policy that manages
       * the lifecycle of EBS-backed AMIs. Specify `EVENT_BASED_POLICY` to create an event-based policy
       * that performs specific actions when a defined event occurs in your AWS account .
       *
       * The default is `EBS_SNAPSHOT_MANAGEMENT` .
       */
      public fun policyType(policyType: String)

      /**
       * @param resourceLocations *[Custom snapshot and AMI policies only]* The location of the
       * resources to backup.
       * If the source resources are located in an AWS Region , specify `CLOUD` . If the source
       * resources are located on an Outpost in your account, specify `OUTPOST` .
       *
       * If you specify `OUTPOST` , Amazon Data Lifecycle Manager backs up all resources of the
       * specified type with matching target tags across all of the Outposts in your account.
       */
      public fun resourceLocations(resourceLocations: List<String>)

      /**
       * @param resourceLocations *[Custom snapshot and AMI policies only]* The location of the
       * resources to backup.
       * If the source resources are located in an AWS Region , specify `CLOUD` . If the source
       * resources are located on an Outpost in your account, specify `OUTPOST` .
       *
       * If you specify `OUTPOST` , Amazon Data Lifecycle Manager backs up all resources of the
       * specified type with matching target tags across all of the Outposts in your account.
       */
      public fun resourceLocations(vararg resourceLocations: String)

      /**
       * @param resourceType *[Default policies only]* Specify the type of default policy to create.
       * * To create a default policy for EBS snapshots, that creates snapshots of all volumes in
       * the Region that do not have recent backups, specify `VOLUME` .
       * * To create a default policy for EBS-backed AMIs, that creates EBS-backed AMIs from all
       * instances in the Region that do not have recent backups, specify `INSTANCE` .
       */
      public fun resourceType(resourceType: String)

      /**
       * @param resourceTypes *[Custom snapshot policies only]* The target resource type for
       * snapshot and AMI lifecycle policies.
       * Use `VOLUME` to create snapshots of individual volumes or use `INSTANCE` to create
       * multi-volume snapshots from the volumes for an instance.
       */
      public fun resourceTypes(resourceTypes: List<String>)

      /**
       * @param resourceTypes *[Custom snapshot policies only]* The target resource type for
       * snapshot and AMI lifecycle policies.
       * Use `VOLUME` to create snapshots of individual volumes or use `INSTANCE` to create
       * multi-volume snapshots from the volumes for an instance.
       */
      public fun resourceTypes(vararg resourceTypes: String)

      /**
       * @param retainInterval *[Default policies only]* Specifies how long the policy should retain
       * snapshots or AMIs before deleting them.
       * The retention period can range from 2 to 14 days, but it must be greater than the creation
       * frequency to ensure that the policy retains at least 1 snapshot or AMI at any given time. If
       * you do not specify a value, the default is 7.
       *
       * Default: 7
       */
      public fun retainInterval(retainInterval: Number)

      /**
       * @param schedules *[Custom snapshot and AMI policies only]* The schedules of policy-defined
       * actions for snapshot and AMI lifecycle policies.
       * A policy can have up to four schedules—one mandatory schedule and up to three optional
       * schedules.
       */
      public fun schedules(schedules: IResolvable)

      /**
       * @param schedules *[Custom snapshot and AMI policies only]* The schedules of policy-defined
       * actions for snapshot and AMI lifecycle policies.
       * A policy can have up to four schedules—one mandatory schedule and up to three optional
       * schedules.
       */
      public fun schedules(schedules: List<Any>)

      /**
       * @param schedules *[Custom snapshot and AMI policies only]* The schedules of policy-defined
       * actions for snapshot and AMI lifecycle policies.
       * A policy can have up to four schedules—one mandatory schedule and up to three optional
       * schedules.
       */
      public fun schedules(vararg schedules: Any)

      /**
       * @param targetTags *[Custom snapshot and AMI policies only]* The single tag that identifies
       * targeted resources for this policy.
       */
      public fun targetTags(targetTags: IResolvable)

      /**
       * @param targetTags *[Custom snapshot and AMI policies only]* The single tag that identifies
       * targeted resources for this policy.
       */
      public fun targetTags(targetTags: List<Any>)

      /**
       * @param targetTags *[Custom snapshot and AMI policies only]* The single tag that identifies
       * targeted resources for this policy.
       */
      public fun targetTags(vararg targetTags: Any)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.dlm.CfnLifecyclePolicy.PolicyDetailsProperty.Builder =
          software.amazon.awscdk.services.dlm.CfnLifecyclePolicy.PolicyDetailsProperty.builder()

      /**
       * @param actions *[Event-based policies only]* The actions to be performed when the
       * event-based policy is activated.
       * You can specify only one action per policy.
       */
      override fun actions(actions: IResolvable) {
        cdkBuilder.actions(actions.let(IResolvable::unwrap))
      }

      /**
       * @param actions *[Event-based policies only]* The actions to be performed when the
       * event-based policy is activated.
       * You can specify only one action per policy.
       */
      override fun actions(actions: List<Any>) {
        cdkBuilder.actions(actions)
      }

      /**
       * @param actions *[Event-based policies only]* The actions to be performed when the
       * event-based policy is activated.
       * You can specify only one action per policy.
       */
      override fun actions(vararg actions: Any): Unit = actions(actions.toList())

      /**
       * @param copyTags *[Default policies only]* Indicates whether the policy should copy tags
       * from the source resource to the snapshot or AMI.
       * If you do not specify a value, the default is `false` .
       *
       * Default: false
       */
      override fun copyTags(copyTags: Boolean) {
        cdkBuilder.copyTags(copyTags)
      }

      /**
       * @param copyTags *[Default policies only]* Indicates whether the policy should copy tags
       * from the source resource to the snapshot or AMI.
       * If you do not specify a value, the default is `false` .
       *
       * Default: false
       */
      override fun copyTags(copyTags: IResolvable) {
        cdkBuilder.copyTags(copyTags.let(IResolvable::unwrap))
      }

      /**
       * @param createInterval *[Default policies only]* Specifies how often the policy should run
       * and create snapshots or AMIs.
       * The creation frequency can range from 1 to 7 days. If you do not specify a value, the
       * default is 1.
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
       * @param eventSource *[Event-based policies only]* The event that activates the event-based
       * policy.
       */
      override fun eventSource(eventSource: IResolvable) {
        cdkBuilder.eventSource(eventSource.let(IResolvable::unwrap))
      }

      /**
       * @param eventSource *[Event-based policies only]* The event that activates the event-based
       * policy.
       */
      override fun eventSource(eventSource: EventSourceProperty) {
        cdkBuilder.eventSource(eventSource.let(EventSourceProperty::unwrap))
      }

      /**
       * @param eventSource *[Event-based policies only]* The event that activates the event-based
       * policy.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("ba83ec6e9b31ee2c9c1ff3156958ae645319be35d35de2f973f49684befb2366")
      override fun eventSource(eventSource: EventSourceProperty.Builder.() -> Unit): Unit =
          eventSource(EventSourceProperty(eventSource))

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
      override fun exclusions(exclusions: ExclusionsProperty) {
        cdkBuilder.exclusions(exclusions.let(ExclusionsProperty::unwrap))
      }

      /**
       * @param exclusions *[Default policies only]* Specifies exclusion parameters for volumes or
       * instances for which you do not want to create snapshots or AMIs.
       * The policy will not create snapshots or AMIs for target resources that match any of the
       * specified exclusion parameters.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("a23751e6286540ce8214da2c5c32d2b4241adcd6b610e271b7f8c8022ef2e737")
      override fun exclusions(exclusions: ExclusionsProperty.Builder.() -> Unit): Unit =
          exclusions(ExclusionsProperty(exclusions))

      /**
       * @param extendDeletion *[Default policies only]* Defines the snapshot or AMI retention
       * behavior for the policy if the source volume or instance is deleted, or if the policy enters
       * the error, disabled, or deleted state.
       * By default ( *ExtendDeletion=false* ):
       *
       * * If a source resource is deleted, Amazon Data Lifecycle Manager will continue to delete
       * previously created snapshots or AMIs, up to but not including the last one, based on the
       * specified retention period. If you want Amazon Data Lifecycle Manager to delete all snapshots
       * or AMIs, including the last one, specify `true` .
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
       * behavior for the policy if the source volume or instance is deleted, or if the policy enters
       * the error, disabled, or deleted state.
       * By default ( *ExtendDeletion=false* ):
       *
       * * If a source resource is deleted, Amazon Data Lifecycle Manager will continue to delete
       * previously created snapshots or AMIs, up to but not including the last one, based on the
       * specified retention period. If you want Amazon Data Lifecycle Manager to delete all snapshots
       * or AMIs, including the last one, specify `true` .
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
       * @param parameters *[Custom snapshot and AMI policies only]* A set of optional parameters
       * for snapshot and AMI lifecycle policies.
       *
       * If you are modifying a policy that was created or previously modified using the Amazon Data
       * Lifecycle Manager console, then you must include this parameter and specify either the default
       * values or the new values that you require. You can't omit this parameter or set its values to
       * null.
       */
      override fun parameters(parameters: IResolvable) {
        cdkBuilder.parameters(parameters.let(IResolvable::unwrap))
      }

      /**
       * @param parameters *[Custom snapshot and AMI policies only]* A set of optional parameters
       * for snapshot and AMI lifecycle policies.
       *
       * If you are modifying a policy that was created or previously modified using the Amazon Data
       * Lifecycle Manager console, then you must include this parameter and specify either the default
       * values or the new values that you require. You can't omit this parameter or set its values to
       * null.
       */
      override fun parameters(parameters: ParametersProperty) {
        cdkBuilder.parameters(parameters.let(ParametersProperty::unwrap))
      }

      /**
       * @param parameters *[Custom snapshot and AMI policies only]* A set of optional parameters
       * for snapshot and AMI lifecycle policies.
       *
       * If you are modifying a policy that was created or previously modified using the Amazon Data
       * Lifecycle Manager console, then you must include this parameter and specify either the default
       * values or the new values that you require. You can't omit this parameter or set its values to
       * null.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("6937457773f3f964d1feaeee552709969c224187e8424aedf46a7bdf9a5e6def")
      override fun parameters(parameters: ParametersProperty.Builder.() -> Unit): Unit =
          parameters(ParametersProperty(parameters))

      /**
       * @param policyLanguage The type of policy to create. Specify one of the following:.
       * * `SIMPLIFIED` To create a default policy.
       * * `STANDARD` To create a custom policy.
       */
      override fun policyLanguage(policyLanguage: String) {
        cdkBuilder.policyLanguage(policyLanguage)
      }

      /**
       * @param policyType The type of policy.
       * Specify `EBS_SNAPSHOT_MANAGEMENT` to create a lifecycle policy that manages the lifecycle
       * of Amazon EBS snapshots. Specify `IMAGE_MANAGEMENT` to create a lifecycle policy that manages
       * the lifecycle of EBS-backed AMIs. Specify `EVENT_BASED_POLICY` to create an event-based policy
       * that performs specific actions when a defined event occurs in your AWS account .
       *
       * The default is `EBS_SNAPSHOT_MANAGEMENT` .
       */
      override fun policyType(policyType: String) {
        cdkBuilder.policyType(policyType)
      }

      /**
       * @param resourceLocations *[Custom snapshot and AMI policies only]* The location of the
       * resources to backup.
       * If the source resources are located in an AWS Region , specify `CLOUD` . If the source
       * resources are located on an Outpost in your account, specify `OUTPOST` .
       *
       * If you specify `OUTPOST` , Amazon Data Lifecycle Manager backs up all resources of the
       * specified type with matching target tags across all of the Outposts in your account.
       */
      override fun resourceLocations(resourceLocations: List<String>) {
        cdkBuilder.resourceLocations(resourceLocations)
      }

      /**
       * @param resourceLocations *[Custom snapshot and AMI policies only]* The location of the
       * resources to backup.
       * If the source resources are located in an AWS Region , specify `CLOUD` . If the source
       * resources are located on an Outpost in your account, specify `OUTPOST` .
       *
       * If you specify `OUTPOST` , Amazon Data Lifecycle Manager backs up all resources of the
       * specified type with matching target tags across all of the Outposts in your account.
       */
      override fun resourceLocations(vararg resourceLocations: String): Unit =
          resourceLocations(resourceLocations.toList())

      /**
       * @param resourceType *[Default policies only]* Specify the type of default policy to create.
       * * To create a default policy for EBS snapshots, that creates snapshots of all volumes in
       * the Region that do not have recent backups, specify `VOLUME` .
       * * To create a default policy for EBS-backed AMIs, that creates EBS-backed AMIs from all
       * instances in the Region that do not have recent backups, specify `INSTANCE` .
       */
      override fun resourceType(resourceType: String) {
        cdkBuilder.resourceType(resourceType)
      }

      /**
       * @param resourceTypes *[Custom snapshot policies only]* The target resource type for
       * snapshot and AMI lifecycle policies.
       * Use `VOLUME` to create snapshots of individual volumes or use `INSTANCE` to create
       * multi-volume snapshots from the volumes for an instance.
       */
      override fun resourceTypes(resourceTypes: List<String>) {
        cdkBuilder.resourceTypes(resourceTypes)
      }

      /**
       * @param resourceTypes *[Custom snapshot policies only]* The target resource type for
       * snapshot and AMI lifecycle policies.
       * Use `VOLUME` to create snapshots of individual volumes or use `INSTANCE` to create
       * multi-volume snapshots from the volumes for an instance.
       */
      override fun resourceTypes(vararg resourceTypes: String): Unit =
          resourceTypes(resourceTypes.toList())

      /**
       * @param retainInterval *[Default policies only]* Specifies how long the policy should retain
       * snapshots or AMIs before deleting them.
       * The retention period can range from 2 to 14 days, but it must be greater than the creation
       * frequency to ensure that the policy retains at least 1 snapshot or AMI at any given time. If
       * you do not specify a value, the default is 7.
       *
       * Default: 7
       */
      override fun retainInterval(retainInterval: Number) {
        cdkBuilder.retainInterval(retainInterval)
      }

      /**
       * @param schedules *[Custom snapshot and AMI policies only]* The schedules of policy-defined
       * actions for snapshot and AMI lifecycle policies.
       * A policy can have up to four schedules—one mandatory schedule and up to three optional
       * schedules.
       */
      override fun schedules(schedules: IResolvable) {
        cdkBuilder.schedules(schedules.let(IResolvable::unwrap))
      }

      /**
       * @param schedules *[Custom snapshot and AMI policies only]* The schedules of policy-defined
       * actions for snapshot and AMI lifecycle policies.
       * A policy can have up to four schedules—one mandatory schedule and up to three optional
       * schedules.
       */
      override fun schedules(schedules: List<Any>) {
        cdkBuilder.schedules(schedules)
      }

      /**
       * @param schedules *[Custom snapshot and AMI policies only]* The schedules of policy-defined
       * actions for snapshot and AMI lifecycle policies.
       * A policy can have up to four schedules—one mandatory schedule and up to three optional
       * schedules.
       */
      override fun schedules(vararg schedules: Any): Unit = schedules(schedules.toList())

      /**
       * @param targetTags *[Custom snapshot and AMI policies only]* The single tag that identifies
       * targeted resources for this policy.
       */
      override fun targetTags(targetTags: IResolvable) {
        cdkBuilder.targetTags(targetTags.let(IResolvable::unwrap))
      }

      /**
       * @param targetTags *[Custom snapshot and AMI policies only]* The single tag that identifies
       * targeted resources for this policy.
       */
      override fun targetTags(targetTags: List<Any>) {
        cdkBuilder.targetTags(targetTags)
      }

      /**
       * @param targetTags *[Custom snapshot and AMI policies only]* The single tag that identifies
       * targeted resources for this policy.
       */
      override fun targetTags(vararg targetTags: Any): Unit = targetTags(targetTags.toList())

      public fun build():
          software.amazon.awscdk.services.dlm.CfnLifecyclePolicy.PolicyDetailsProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.dlm.CfnLifecyclePolicy.PolicyDetailsProperty,
    ) : CdkObject(cdkObject), PolicyDetailsProperty {
      /**
       * *[Event-based policies only]* The actions to be performed when the event-based policy is
       * activated.
       *
       * You can specify only one action per policy.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dlm-lifecyclepolicy-policydetails.html#cfn-dlm-lifecyclepolicy-policydetails-actions)
       */
      override fun actions(): Any? = unwrap(this).getActions()

      /**
       * *[Default policies only]* Indicates whether the policy should copy tags from the source
       * resource to the snapshot or AMI.
       *
       * If you do not specify a value, the default is `false` .
       *
       * Default: false
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dlm-lifecyclepolicy-policydetails.html#cfn-dlm-lifecyclepolicy-policydetails-copytags)
       */
      override fun copyTags(): Any? = unwrap(this).getCopyTags()

      /**
       * *[Default policies only]* Specifies how often the policy should run and create snapshots or
       * AMIs.
       *
       * The creation frequency can range from 1 to 7 days. If you do not specify a value, the
       * default is 1.
       *
       * Default: 1
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dlm-lifecyclepolicy-policydetails.html#cfn-dlm-lifecyclepolicy-policydetails-createinterval)
       */
      override fun createInterval(): Number? = unwrap(this).getCreateInterval()

      /**
       * *[Default policies only]* Specifies destination Regions for snapshot or AMI copies.
       *
       * You can specify up to 3 destination Regions. If you do not want to create cross-Region
       * copies, omit this parameter.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dlm-lifecyclepolicy-policydetails.html#cfn-dlm-lifecyclepolicy-policydetails-crossregioncopytargets)
       */
      override fun crossRegionCopyTargets(): Any? = unwrap(this).getCrossRegionCopyTargets()

      /**
       * *[Event-based policies only]* The event that activates the event-based policy.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dlm-lifecyclepolicy-policydetails.html#cfn-dlm-lifecyclepolicy-policydetails-eventsource)
       */
      override fun eventSource(): Any? = unwrap(this).getEventSource()

      /**
       * *[Default policies only]* Specifies exclusion parameters for volumes or instances for which
       * you do not want to create snapshots or AMIs.
       *
       * The policy will not create snapshots or AMIs for target resources that match any of the
       * specified exclusion parameters.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dlm-lifecyclepolicy-policydetails.html#cfn-dlm-lifecyclepolicy-policydetails-exclusions)
       */
      override fun exclusions(): Any? = unwrap(this).getExclusions()

      /**
       * *[Default policies only]* Defines the snapshot or AMI retention behavior for the policy if
       * the source volume or instance is deleted, or if the policy enters the error, disabled, or
       * deleted state.
       *
       * By default ( *ExtendDeletion=false* ):
       *
       * * If a source resource is deleted, Amazon Data Lifecycle Manager will continue to delete
       * previously created snapshots or AMIs, up to but not including the last one, based on the
       * specified retention period. If you want Amazon Data Lifecycle Manager to delete all snapshots
       * or AMIs, including the last one, specify `true` .
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
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dlm-lifecyclepolicy-policydetails.html#cfn-dlm-lifecyclepolicy-policydetails-extenddeletion)
       */
      override fun extendDeletion(): Any? = unwrap(this).getExtendDeletion()

      /**
       * *[Custom snapshot and AMI policies only]* A set of optional parameters for snapshot and AMI
       * lifecycle policies.
       *
       *
       * If you are modifying a policy that was created or previously modified using the Amazon Data
       * Lifecycle Manager console, then you must include this parameter and specify either the default
       * values or the new values that you require. You can't omit this parameter or set its values to
       * null.
       *
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dlm-lifecyclepolicy-policydetails.html#cfn-dlm-lifecyclepolicy-policydetails-parameters)
       */
      override fun parameters(): Any? = unwrap(this).getParameters()

      /**
       * The type of policy to create. Specify one of the following:.
       *
       * * `SIMPLIFIED` To create a default policy.
       * * `STANDARD` To create a custom policy.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dlm-lifecyclepolicy-policydetails.html#cfn-dlm-lifecyclepolicy-policydetails-policylanguage)
       */
      override fun policyLanguage(): String? = unwrap(this).getPolicyLanguage()

      /**
       * The type of policy.
       *
       * Specify `EBS_SNAPSHOT_MANAGEMENT` to create a lifecycle policy that manages the lifecycle
       * of Amazon EBS snapshots. Specify `IMAGE_MANAGEMENT` to create a lifecycle policy that manages
       * the lifecycle of EBS-backed AMIs. Specify `EVENT_BASED_POLICY` to create an event-based policy
       * that performs specific actions when a defined event occurs in your AWS account .
       *
       * The default is `EBS_SNAPSHOT_MANAGEMENT` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dlm-lifecyclepolicy-policydetails.html#cfn-dlm-lifecyclepolicy-policydetails-policytype)
       */
      override fun policyType(): String? = unwrap(this).getPolicyType()

      /**
       * *[Custom snapshot and AMI policies only]* The location of the resources to backup.
       *
       * If the source resources are located in an AWS Region , specify `CLOUD` . If the source
       * resources are located on an Outpost in your account, specify `OUTPOST` .
       *
       * If you specify `OUTPOST` , Amazon Data Lifecycle Manager backs up all resources of the
       * specified type with matching target tags across all of the Outposts in your account.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dlm-lifecyclepolicy-policydetails.html#cfn-dlm-lifecyclepolicy-policydetails-resourcelocations)
       */
      override fun resourceLocations(): List<String> = unwrap(this).getResourceLocations() ?:
          emptyList()

      /**
       * *[Default policies only]* Specify the type of default policy to create.
       *
       * * To create a default policy for EBS snapshots, that creates snapshots of all volumes in
       * the Region that do not have recent backups, specify `VOLUME` .
       * * To create a default policy for EBS-backed AMIs, that creates EBS-backed AMIs from all
       * instances in the Region that do not have recent backups, specify `INSTANCE` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dlm-lifecyclepolicy-policydetails.html#cfn-dlm-lifecyclepolicy-policydetails-resourcetype)
       */
      override fun resourceType(): String? = unwrap(this).getResourceType()

      /**
       * *[Custom snapshot policies only]* The target resource type for snapshot and AMI lifecycle
       * policies.
       *
       * Use `VOLUME` to create snapshots of individual volumes or use `INSTANCE` to create
       * multi-volume snapshots from the volumes for an instance.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dlm-lifecyclepolicy-policydetails.html#cfn-dlm-lifecyclepolicy-policydetails-resourcetypes)
       */
      override fun resourceTypes(): List<String> = unwrap(this).getResourceTypes() ?: emptyList()

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
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dlm-lifecyclepolicy-policydetails.html#cfn-dlm-lifecyclepolicy-policydetails-retaininterval)
       */
      override fun retainInterval(): Number? = unwrap(this).getRetainInterval()

      /**
       * *[Custom snapshot and AMI policies only]* The schedules of policy-defined actions for
       * snapshot and AMI lifecycle policies.
       *
       * A policy can have up to four schedules—one mandatory schedule and up to three optional
       * schedules.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dlm-lifecyclepolicy-policydetails.html#cfn-dlm-lifecyclepolicy-policydetails-schedules)
       */
      override fun schedules(): Any? = unwrap(this).getSchedules()

      /**
       * *[Custom snapshot and AMI policies only]* The single tag that identifies targeted resources
       * for this policy.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dlm-lifecyclepolicy-policydetails.html#cfn-dlm-lifecyclepolicy-policydetails-targettags)
       */
      override fun targetTags(): Any? = unwrap(this).getTargetTags()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): PolicyDetailsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.dlm.CfnLifecyclePolicy.PolicyDetailsProperty):
          PolicyDetailsProperty = CdkObjectWrappers.wrap(cdkObject) as? PolicyDetailsProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: PolicyDetailsProperty):
          software.amazon.awscdk.services.dlm.CfnLifecyclePolicy.PolicyDetailsProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.dlm.CfnLifecyclePolicy.PolicyDetailsProperty
    }
  }

  /**
   * *[Custom snapshot and AMI policies only]* Specifies a retention rule for snapshots created by
   * snapshot policies, or for AMIs created by AMI policies.
   *
   *
   * For snapshot policies that have an
   * [ArchiveRule](https://docs.aws.amazon.com/dlm/latest/APIReference/API_ArchiveRule.html) , this
   * retention rule applies to standard tier retention. When the retention threshold is met, snapshots
   * are moved from the standard to the archive tier.
   *
   * For snapshot policies that do not have an *ArchiveRule* , snapshots are permanently deleted
   * when this retention threshold is met.
   *
   *
   * You can retain snapshots based on either a count or a time interval.
   *
   * * *Count-based retention*
   *
   * You must specify *Count* . If you specify an
   * [ArchiveRule](https://docs.aws.amazon.com/dlm/latest/APIReference/API_ArchiveRule.html) for the
   * schedule, then you can specify a retention count of `0` to archive snapshots immediately after
   * creation. If you specify a
   * [FastRestoreRule](https://docs.aws.amazon.com/dlm/latest/APIReference/API_FastRestoreRule.html) ,
   * [ShareRule](https://docs.aws.amazon.com/dlm/latest/APIReference/API_ShareRule.html) , or a
   * [CrossRegionCopyRule](https://docs.aws.amazon.com/dlm/latest/APIReference/API_CrossRegionCopyRule.html)
   * , then you must specify a retention count of `1` or more.
   *
   * * *Age-based retention*
   *
   * You must specify *Interval* and *IntervalUnit* . If you specify an
   * [ArchiveRule](https://docs.aws.amazon.com/dlm/latest/APIReference/API_ArchiveRule.html) for the
   * schedule, then you can specify a retention interval of `0` days to archive snapshots immediately
   * after creation. If you specify a
   * [FastRestoreRule](https://docs.aws.amazon.com/dlm/latest/APIReference/API_FastRestoreRule.html) ,
   * [ShareRule](https://docs.aws.amazon.com/dlm/latest/APIReference/API_ShareRule.html) , or a
   * [CrossRegionCopyRule](https://docs.aws.amazon.com/dlm/latest/APIReference/API_CrossRegionCopyRule.html)
   * , then you must specify a retention interval of `1` day or more.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.dlm.*;
   * RetainRuleProperty retainRuleProperty = RetainRuleProperty.builder()
   * .count(123)
   * .interval(123)
   * .intervalUnit("intervalUnit")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dlm-lifecyclepolicy-retainrule.html)
   */
  public interface RetainRuleProperty {
    /**
     * The number of snapshots to retain for each volume, up to a maximum of 1000.
     *
     * For example if you want to retain a maximum of three snapshots, specify `3` . When the fourth
     * snapshot is created, the oldest retained snapshot is deleted, or it is moved to the archive tier
     * if you have specified an
     * [ArchiveRule](https://docs.aws.amazon.com/dlm/latest/APIReference/API_ArchiveRule.html) .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dlm-lifecyclepolicy-retainrule.html#cfn-dlm-lifecyclepolicy-retainrule-count)
     */
    public fun count(): Number? = unwrap(this).getCount()

    /**
     * The amount of time to retain each snapshot.
     *
     * The maximum is 100 years. This is equivalent to 1200 months, 5200 weeks, or 36500 days.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dlm-lifecyclepolicy-retainrule.html#cfn-dlm-lifecyclepolicy-retainrule-interval)
     */
    public fun interval(): Number? = unwrap(this).getInterval()

    /**
     * The unit of time for time-based retention.
     *
     * For example, to retain snapshots for 3 months, specify `Interval=3` and `IntervalUnit=MONTHS`
     * . Once the snapshot has been retained for 3 months, it is deleted, or it is moved to the archive
     * tier if you have specified an
     * [ArchiveRule](https://docs.aws.amazon.com/dlm/latest/APIReference/API_ArchiveRule.html) .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dlm-lifecyclepolicy-retainrule.html#cfn-dlm-lifecyclepolicy-retainrule-intervalunit)
     */
    public fun intervalUnit(): String? = unwrap(this).getIntervalUnit()

    /**
     * A builder for [RetainRuleProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param count The number of snapshots to retain for each volume, up to a maximum of 1000.
       * For example if you want to retain a maximum of three snapshots, specify `3` . When the
       * fourth snapshot is created, the oldest retained snapshot is deleted, or it is moved to the
       * archive tier if you have specified an
       * [ArchiveRule](https://docs.aws.amazon.com/dlm/latest/APIReference/API_ArchiveRule.html) .
       */
      public fun count(count: Number)

      /**
       * @param interval The amount of time to retain each snapshot.
       * The maximum is 100 years. This is equivalent to 1200 months, 5200 weeks, or 36500 days.
       */
      public fun interval(interval: Number)

      /**
       * @param intervalUnit The unit of time for time-based retention.
       * For example, to retain snapshots for 3 months, specify `Interval=3` and
       * `IntervalUnit=MONTHS` . Once the snapshot has been retained for 3 months, it is deleted, or it
       * is moved to the archive tier if you have specified an
       * [ArchiveRule](https://docs.aws.amazon.com/dlm/latest/APIReference/API_ArchiveRule.html) .
       */
      public fun intervalUnit(intervalUnit: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.dlm.CfnLifecyclePolicy.RetainRuleProperty.Builder =
          software.amazon.awscdk.services.dlm.CfnLifecyclePolicy.RetainRuleProperty.builder()

      /**
       * @param count The number of snapshots to retain for each volume, up to a maximum of 1000.
       * For example if you want to retain a maximum of three snapshots, specify `3` . When the
       * fourth snapshot is created, the oldest retained snapshot is deleted, or it is moved to the
       * archive tier if you have specified an
       * [ArchiveRule](https://docs.aws.amazon.com/dlm/latest/APIReference/API_ArchiveRule.html) .
       */
      override fun count(count: Number) {
        cdkBuilder.count(count)
      }

      /**
       * @param interval The amount of time to retain each snapshot.
       * The maximum is 100 years. This is equivalent to 1200 months, 5200 weeks, or 36500 days.
       */
      override fun interval(interval: Number) {
        cdkBuilder.interval(interval)
      }

      /**
       * @param intervalUnit The unit of time for time-based retention.
       * For example, to retain snapshots for 3 months, specify `Interval=3` and
       * `IntervalUnit=MONTHS` . Once the snapshot has been retained for 3 months, it is deleted, or it
       * is moved to the archive tier if you have specified an
       * [ArchiveRule](https://docs.aws.amazon.com/dlm/latest/APIReference/API_ArchiveRule.html) .
       */
      override fun intervalUnit(intervalUnit: String) {
        cdkBuilder.intervalUnit(intervalUnit)
      }

      public fun build(): software.amazon.awscdk.services.dlm.CfnLifecyclePolicy.RetainRuleProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.dlm.CfnLifecyclePolicy.RetainRuleProperty,
    ) : CdkObject(cdkObject), RetainRuleProperty {
      /**
       * The number of snapshots to retain for each volume, up to a maximum of 1000.
       *
       * For example if you want to retain a maximum of three snapshots, specify `3` . When the
       * fourth snapshot is created, the oldest retained snapshot is deleted, or it is moved to the
       * archive tier if you have specified an
       * [ArchiveRule](https://docs.aws.amazon.com/dlm/latest/APIReference/API_ArchiveRule.html) .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dlm-lifecyclepolicy-retainrule.html#cfn-dlm-lifecyclepolicy-retainrule-count)
       */
      override fun count(): Number? = unwrap(this).getCount()

      /**
       * The amount of time to retain each snapshot.
       *
       * The maximum is 100 years. This is equivalent to 1200 months, 5200 weeks, or 36500 days.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dlm-lifecyclepolicy-retainrule.html#cfn-dlm-lifecyclepolicy-retainrule-interval)
       */
      override fun interval(): Number? = unwrap(this).getInterval()

      /**
       * The unit of time for time-based retention.
       *
       * For example, to retain snapshots for 3 months, specify `Interval=3` and
       * `IntervalUnit=MONTHS` . Once the snapshot has been retained for 3 months, it is deleted, or it
       * is moved to the archive tier if you have specified an
       * [ArchiveRule](https://docs.aws.amazon.com/dlm/latest/APIReference/API_ArchiveRule.html) .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dlm-lifecyclepolicy-retainrule.html#cfn-dlm-lifecyclepolicy-retainrule-intervalunit)
       */
      override fun intervalUnit(): String? = unwrap(this).getIntervalUnit()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): RetainRuleProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.dlm.CfnLifecyclePolicy.RetainRuleProperty):
          RetainRuleProperty = CdkObjectWrappers.wrap(cdkObject) as? RetainRuleProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: RetainRuleProperty):
          software.amazon.awscdk.services.dlm.CfnLifecyclePolicy.RetainRuleProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.dlm.CfnLifecyclePolicy.RetainRuleProperty
    }
  }

  /**
   * *[Custom snapshot policies only]* Describes the retention rule for archived snapshots.
   *
   * Once the archive retention threshold is met, the snapshots are permanently deleted from the
   * archive tier.
   *
   *
   * The archive retention rule must retain snapshots in the archive tier for a minimum of 90 days.
   *
   *
   * For *count-based schedules* , you must specify *Count* . For *age-based schedules* , you must
   * specify *Interval* and *IntervalUnit* .
   *
   * For more information about using snapshot archiving, see [Considerations for snapshot lifecycle
   * policies](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/snapshot-ami-policy.html#dlm-archive)
   * .
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.dlm.*;
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
  public interface RetentionArchiveTierProperty {
    /**
     * The maximum number of snapshots to retain in the archive storage tier for each volume.
     *
     * The count must ensure that each snapshot remains in the archive tier for at least 90 days.
     * For example, if the schedule creates snapshots every 30 days, you must specify a count of 3 or
     * more to ensure that each snapshot is archived for at least 90 days.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dlm-lifecyclepolicy-retentionarchivetier.html#cfn-dlm-lifecyclepolicy-retentionarchivetier-count)
     */
    public fun count(): Number? = unwrap(this).getCount()

    /**
     * Specifies the period of time to retain snapshots in the archive tier.
     *
     * After this period expires, the snapshot is permanently deleted.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dlm-lifecyclepolicy-retentionarchivetier.html#cfn-dlm-lifecyclepolicy-retentionarchivetier-interval)
     */
    public fun interval(): Number? = unwrap(this).getInterval()

    /**
     * The unit of time in which to measure the *Interval* .
     *
     * For example, to retain a snapshots in the archive tier for 6 months, specify `Interval=6` and
     * `IntervalUnit=MONTHS` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dlm-lifecyclepolicy-retentionarchivetier.html#cfn-dlm-lifecyclepolicy-retentionarchivetier-intervalunit)
     */
    public fun intervalUnit(): String? = unwrap(this).getIntervalUnit()

    /**
     * A builder for [RetentionArchiveTierProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param count The maximum number of snapshots to retain in the archive storage tier for each
       * volume.
       * The count must ensure that each snapshot remains in the archive tier for at least 90 days.
       * For example, if the schedule creates snapshots every 30 days, you must specify a count of 3 or
       * more to ensure that each snapshot is archived for at least 90 days.
       */
      public fun count(count: Number)

      /**
       * @param interval Specifies the period of time to retain snapshots in the archive tier.
       * After this period expires, the snapshot is permanently deleted.
       */
      public fun interval(interval: Number)

      /**
       * @param intervalUnit The unit of time in which to measure the *Interval* .
       * For example, to retain a snapshots in the archive tier for 6 months, specify `Interval=6`
       * and `IntervalUnit=MONTHS` .
       */
      public fun intervalUnit(intervalUnit: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.dlm.CfnLifecyclePolicy.RetentionArchiveTierProperty.Builder
          =
          software.amazon.awscdk.services.dlm.CfnLifecyclePolicy.RetentionArchiveTierProperty.builder()

      /**
       * @param count The maximum number of snapshots to retain in the archive storage tier for each
       * volume.
       * The count must ensure that each snapshot remains in the archive tier for at least 90 days.
       * For example, if the schedule creates snapshots every 30 days, you must specify a count of 3 or
       * more to ensure that each snapshot is archived for at least 90 days.
       */
      override fun count(count: Number) {
        cdkBuilder.count(count)
      }

      /**
       * @param interval Specifies the period of time to retain snapshots in the archive tier.
       * After this period expires, the snapshot is permanently deleted.
       */
      override fun interval(interval: Number) {
        cdkBuilder.interval(interval)
      }

      /**
       * @param intervalUnit The unit of time in which to measure the *Interval* .
       * For example, to retain a snapshots in the archive tier for 6 months, specify `Interval=6`
       * and `IntervalUnit=MONTHS` .
       */
      override fun intervalUnit(intervalUnit: String) {
        cdkBuilder.intervalUnit(intervalUnit)
      }

      public fun build():
          software.amazon.awscdk.services.dlm.CfnLifecyclePolicy.RetentionArchiveTierProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.dlm.CfnLifecyclePolicy.RetentionArchiveTierProperty,
    ) : CdkObject(cdkObject), RetentionArchiveTierProperty {
      /**
       * The maximum number of snapshots to retain in the archive storage tier for each volume.
       *
       * The count must ensure that each snapshot remains in the archive tier for at least 90 days.
       * For example, if the schedule creates snapshots every 30 days, you must specify a count of 3 or
       * more to ensure that each snapshot is archived for at least 90 days.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dlm-lifecyclepolicy-retentionarchivetier.html#cfn-dlm-lifecyclepolicy-retentionarchivetier-count)
       */
      override fun count(): Number? = unwrap(this).getCount()

      /**
       * Specifies the period of time to retain snapshots in the archive tier.
       *
       * After this period expires, the snapshot is permanently deleted.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dlm-lifecyclepolicy-retentionarchivetier.html#cfn-dlm-lifecyclepolicy-retentionarchivetier-interval)
       */
      override fun interval(): Number? = unwrap(this).getInterval()

      /**
       * The unit of time in which to measure the *Interval* .
       *
       * For example, to retain a snapshots in the archive tier for 6 months, specify `Interval=6`
       * and `IntervalUnit=MONTHS` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dlm-lifecyclepolicy-retentionarchivetier.html#cfn-dlm-lifecyclepolicy-retentionarchivetier-intervalunit)
       */
      override fun intervalUnit(): String? = unwrap(this).getIntervalUnit()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): RetentionArchiveTierProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.dlm.CfnLifecyclePolicy.RetentionArchiveTierProperty):
          RetentionArchiveTierProperty = CdkObjectWrappers.wrap(cdkObject) as?
          RetentionArchiveTierProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: RetentionArchiveTierProperty):
          software.amazon.awscdk.services.dlm.CfnLifecyclePolicy.RetentionArchiveTierProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.dlm.CfnLifecyclePolicy.RetentionArchiveTierProperty
    }
  }

  /**
   * *[Custom snapshot and AMI policies only]* Specifies a schedule for a snapshot or AMI lifecycle
   * policy.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.dlm.*;
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
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dlm-lifecyclepolicy-schedule.html)
   */
  public interface ScheduleProperty {
    /**
     * *[Custom snapshot policies that target volumes only]* The snapshot archiving rule for the
     * schedule.
     *
     * When you specify an archiving rule, snapshots are automatically moved from the standard tier
     * to the archive tier once the schedule's retention threshold is met. Snapshots are then retained
     * in the archive tier for the archive retention period that you specify.
     *
     * For more information about using snapshot archiving, see [Considerations for snapshot
     * lifecycle
     * policies](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/snapshot-ami-policy.html#dlm-archive)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dlm-lifecyclepolicy-schedule.html#cfn-dlm-lifecyclepolicy-schedule-archiverule)
     */
    public fun archiveRule(): Any? = unwrap(this).getArchiveRule()

    /**
     * Copy all user-defined tags on a source volume to snapshots of the volume created by this
     * policy.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dlm-lifecyclepolicy-schedule.html#cfn-dlm-lifecyclepolicy-schedule-copytags)
     */
    public fun copyTags(): Any? = unwrap(this).getCopyTags()

    /**
     * The creation rule.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dlm-lifecyclepolicy-schedule.html#cfn-dlm-lifecyclepolicy-schedule-createrule)
     */
    public fun createRule(): Any? = unwrap(this).getCreateRule()

    /**
     * Specifies a rule for copying snapshots or AMIs across regions.
     *
     *
     * You can't specify cross-Region copy rules for policies that create snapshots on an Outpost.
     * If the policy creates snapshots in a Region, then snapshots can be copied to up to three Regions
     * or Outposts.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dlm-lifecyclepolicy-schedule.html#cfn-dlm-lifecyclepolicy-schedule-crossregioncopyrules)
     */
    public fun crossRegionCopyRules(): Any? = unwrap(this).getCrossRegionCopyRules()

    /**
     * *[Custom AMI policies only]* The AMI deprecation rule for the schedule.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dlm-lifecyclepolicy-schedule.html#cfn-dlm-lifecyclepolicy-schedule-deprecaterule)
     */
    public fun deprecateRule(): Any? = unwrap(this).getDeprecateRule()

    /**
     * *[Custom snapshot policies only]* The rule for enabling fast snapshot restore.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dlm-lifecyclepolicy-schedule.html#cfn-dlm-lifecyclepolicy-schedule-fastrestorerule)
     */
    public fun fastRestoreRule(): Any? = unwrap(this).getFastRestoreRule()

    /**
     * The name of the schedule.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dlm-lifecyclepolicy-schedule.html#cfn-dlm-lifecyclepolicy-schedule-name)
     */
    public fun name(): String? = unwrap(this).getName()

    /**
     * The retention rule for snapshots or AMIs created by the policy.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dlm-lifecyclepolicy-schedule.html#cfn-dlm-lifecyclepolicy-schedule-retainrule)
     */
    public fun retainRule(): Any? = unwrap(this).getRetainRule()

    /**
     * *[Custom snapshot policies only]* The rule for sharing snapshots with other AWS accounts .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dlm-lifecyclepolicy-schedule.html#cfn-dlm-lifecyclepolicy-schedule-sharerules)
     */
    public fun shareRules(): Any? = unwrap(this).getShareRules()

    /**
     * The tags to apply to policy-created resources.
     *
     * These user-defined tags are in addition to the AWS -added lifecycle tags.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dlm-lifecyclepolicy-schedule.html#cfn-dlm-lifecyclepolicy-schedule-tagstoadd)
     */
    public fun tagsToAdd(): Any? = unwrap(this).getTagsToAdd()

    /**
     * *[AMI policies and snapshot policies that target instances only]* A collection of key/value
     * pairs with values determined dynamically when the policy is executed.
     *
     * Keys may be any valid Amazon EC2 tag key. Values must be in one of the two following formats:
     * `$(instance-id)` or `$(timestamp)` . Variable tags are only valid for EBS Snapshot Management –
     * Instance policies.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dlm-lifecyclepolicy-schedule.html#cfn-dlm-lifecyclepolicy-schedule-variabletags)
     */
    public fun variableTags(): Any? = unwrap(this).getVariableTags()

    /**
     * A builder for [ScheduleProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param archiveRule *[Custom snapshot policies that target volumes only]* The snapshot
       * archiving rule for the schedule.
       * When you specify an archiving rule, snapshots are automatically moved from the standard
       * tier to the archive tier once the schedule's retention threshold is met. Snapshots are then
       * retained in the archive tier for the archive retention period that you specify.
       *
       * For more information about using snapshot archiving, see [Considerations for snapshot
       * lifecycle
       * policies](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/snapshot-ami-policy.html#dlm-archive)
       * .
       */
      public fun archiveRule(archiveRule: IResolvable)

      /**
       * @param archiveRule *[Custom snapshot policies that target volumes only]* The snapshot
       * archiving rule for the schedule.
       * When you specify an archiving rule, snapshots are automatically moved from the standard
       * tier to the archive tier once the schedule's retention threshold is met. Snapshots are then
       * retained in the archive tier for the archive retention period that you specify.
       *
       * For more information about using snapshot archiving, see [Considerations for snapshot
       * lifecycle
       * policies](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/snapshot-ami-policy.html#dlm-archive)
       * .
       */
      public fun archiveRule(archiveRule: ArchiveRuleProperty)

      /**
       * @param archiveRule *[Custom snapshot policies that target volumes only]* The snapshot
       * archiving rule for the schedule.
       * When you specify an archiving rule, snapshots are automatically moved from the standard
       * tier to the archive tier once the schedule's retention threshold is met. Snapshots are then
       * retained in the archive tier for the archive retention period that you specify.
       *
       * For more information about using snapshot archiving, see [Considerations for snapshot
       * lifecycle
       * policies](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/snapshot-ami-policy.html#dlm-archive)
       * .
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("825dead620cc6ea08a641afcd158f0cc401bd80dfd5c87605bacaf652b0ce3a1")
      public fun archiveRule(archiveRule: ArchiveRuleProperty.Builder.() -> Unit)

      /**
       * @param copyTags Copy all user-defined tags on a source volume to snapshots of the volume
       * created by this policy.
       */
      public fun copyTags(copyTags: Boolean)

      /**
       * @param copyTags Copy all user-defined tags on a source volume to snapshots of the volume
       * created by this policy.
       */
      public fun copyTags(copyTags: IResolvable)

      /**
       * @param createRule The creation rule.
       */
      public fun createRule(createRule: IResolvable)

      /**
       * @param createRule The creation rule.
       */
      public fun createRule(createRule: CreateRuleProperty)

      /**
       * @param createRule The creation rule.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("54891bc79136e1c87930dfbd441d43e610d3d82bccfced6e1bdf038d422a97b8")
      public fun createRule(createRule: CreateRuleProperty.Builder.() -> Unit)

      /**
       * @param crossRegionCopyRules Specifies a rule for copying snapshots or AMIs across regions.
       *
       * You can't specify cross-Region copy rules for policies that create snapshots on an Outpost.
       * If the policy creates snapshots in a Region, then snapshots can be copied to up to three
       * Regions or Outposts.
       */
      public fun crossRegionCopyRules(crossRegionCopyRules: IResolvable)

      /**
       * @param crossRegionCopyRules Specifies a rule for copying snapshots or AMIs across regions.
       *
       * You can't specify cross-Region copy rules for policies that create snapshots on an Outpost.
       * If the policy creates snapshots in a Region, then snapshots can be copied to up to three
       * Regions or Outposts.
       */
      public fun crossRegionCopyRules(crossRegionCopyRules: List<Any>)

      /**
       * @param crossRegionCopyRules Specifies a rule for copying snapshots or AMIs across regions.
       *
       * You can't specify cross-Region copy rules for policies that create snapshots on an Outpost.
       * If the policy creates snapshots in a Region, then snapshots can be copied to up to three
       * Regions or Outposts.
       */
      public fun crossRegionCopyRules(vararg crossRegionCopyRules: Any)

      /**
       * @param deprecateRule *[Custom AMI policies only]* The AMI deprecation rule for the
       * schedule.
       */
      public fun deprecateRule(deprecateRule: IResolvable)

      /**
       * @param deprecateRule *[Custom AMI policies only]* The AMI deprecation rule for the
       * schedule.
       */
      public fun deprecateRule(deprecateRule: DeprecateRuleProperty)

      /**
       * @param deprecateRule *[Custom AMI policies only]* The AMI deprecation rule for the
       * schedule.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("fb7a0258a6a743ee09f1b22132dea6f3341e66f8726bb797909b7292faed4270")
      public fun deprecateRule(deprecateRule: DeprecateRuleProperty.Builder.() -> Unit)

      /**
       * @param fastRestoreRule *[Custom snapshot policies only]* The rule for enabling fast
       * snapshot restore.
       */
      public fun fastRestoreRule(fastRestoreRule: IResolvable)

      /**
       * @param fastRestoreRule *[Custom snapshot policies only]* The rule for enabling fast
       * snapshot restore.
       */
      public fun fastRestoreRule(fastRestoreRule: FastRestoreRuleProperty)

      /**
       * @param fastRestoreRule *[Custom snapshot policies only]* The rule for enabling fast
       * snapshot restore.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("e27b9391e7a38b3c973427c0f60208402a121bef2c15bbc3199f4c686769530a")
      public fun fastRestoreRule(fastRestoreRule: FastRestoreRuleProperty.Builder.() -> Unit)

      /**
       * @param name The name of the schedule.
       */
      public fun name(name: String)

      /**
       * @param retainRule The retention rule for snapshots or AMIs created by the policy.
       */
      public fun retainRule(retainRule: IResolvable)

      /**
       * @param retainRule The retention rule for snapshots or AMIs created by the policy.
       */
      public fun retainRule(retainRule: RetainRuleProperty)

      /**
       * @param retainRule The retention rule for snapshots or AMIs created by the policy.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("98893537e56c00100b0f8d465996d0e9a2d0071e41103b84fb051fa0820b0529")
      public fun retainRule(retainRule: RetainRuleProperty.Builder.() -> Unit)

      /**
       * @param shareRules *[Custom snapshot policies only]* The rule for sharing snapshots with
       * other AWS accounts .
       */
      public fun shareRules(shareRules: IResolvable)

      /**
       * @param shareRules *[Custom snapshot policies only]* The rule for sharing snapshots with
       * other AWS accounts .
       */
      public fun shareRules(shareRules: List<Any>)

      /**
       * @param shareRules *[Custom snapshot policies only]* The rule for sharing snapshots with
       * other AWS accounts .
       */
      public fun shareRules(vararg shareRules: Any)

      /**
       * @param tagsToAdd The tags to apply to policy-created resources.
       * These user-defined tags are in addition to the AWS -added lifecycle tags.
       */
      public fun tagsToAdd(tagsToAdd: IResolvable)

      /**
       * @param tagsToAdd The tags to apply to policy-created resources.
       * These user-defined tags are in addition to the AWS -added lifecycle tags.
       */
      public fun tagsToAdd(tagsToAdd: List<Any>)

      /**
       * @param tagsToAdd The tags to apply to policy-created resources.
       * These user-defined tags are in addition to the AWS -added lifecycle tags.
       */
      public fun tagsToAdd(vararg tagsToAdd: Any)

      /**
       * @param variableTags *[AMI policies and snapshot policies that target instances only]* A
       * collection of key/value pairs with values determined dynamically when the policy is executed.
       * Keys may be any valid Amazon EC2 tag key. Values must be in one of the two following
       * formats: `$(instance-id)` or `$(timestamp)` . Variable tags are only valid for EBS Snapshot
       * Management – Instance policies.
       */
      public fun variableTags(variableTags: IResolvable)

      /**
       * @param variableTags *[AMI policies and snapshot policies that target instances only]* A
       * collection of key/value pairs with values determined dynamically when the policy is executed.
       * Keys may be any valid Amazon EC2 tag key. Values must be in one of the two following
       * formats: `$(instance-id)` or `$(timestamp)` . Variable tags are only valid for EBS Snapshot
       * Management – Instance policies.
       */
      public fun variableTags(variableTags: List<Any>)

      /**
       * @param variableTags *[AMI policies and snapshot policies that target instances only]* A
       * collection of key/value pairs with values determined dynamically when the policy is executed.
       * Keys may be any valid Amazon EC2 tag key. Values must be in one of the two following
       * formats: `$(instance-id)` or `$(timestamp)` . Variable tags are only valid for EBS Snapshot
       * Management – Instance policies.
       */
      public fun variableTags(vararg variableTags: Any)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.dlm.CfnLifecyclePolicy.ScheduleProperty.Builder =
          software.amazon.awscdk.services.dlm.CfnLifecyclePolicy.ScheduleProperty.builder()

      /**
       * @param archiveRule *[Custom snapshot policies that target volumes only]* The snapshot
       * archiving rule for the schedule.
       * When you specify an archiving rule, snapshots are automatically moved from the standard
       * tier to the archive tier once the schedule's retention threshold is met. Snapshots are then
       * retained in the archive tier for the archive retention period that you specify.
       *
       * For more information about using snapshot archiving, see [Considerations for snapshot
       * lifecycle
       * policies](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/snapshot-ami-policy.html#dlm-archive)
       * .
       */
      override fun archiveRule(archiveRule: IResolvable) {
        cdkBuilder.archiveRule(archiveRule.let(IResolvable::unwrap))
      }

      /**
       * @param archiveRule *[Custom snapshot policies that target volumes only]* The snapshot
       * archiving rule for the schedule.
       * When you specify an archiving rule, snapshots are automatically moved from the standard
       * tier to the archive tier once the schedule's retention threshold is met. Snapshots are then
       * retained in the archive tier for the archive retention period that you specify.
       *
       * For more information about using snapshot archiving, see [Considerations for snapshot
       * lifecycle
       * policies](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/snapshot-ami-policy.html#dlm-archive)
       * .
       */
      override fun archiveRule(archiveRule: ArchiveRuleProperty) {
        cdkBuilder.archiveRule(archiveRule.let(ArchiveRuleProperty::unwrap))
      }

      /**
       * @param archiveRule *[Custom snapshot policies that target volumes only]* The snapshot
       * archiving rule for the schedule.
       * When you specify an archiving rule, snapshots are automatically moved from the standard
       * tier to the archive tier once the schedule's retention threshold is met. Snapshots are then
       * retained in the archive tier for the archive retention period that you specify.
       *
       * For more information about using snapshot archiving, see [Considerations for snapshot
       * lifecycle
       * policies](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/snapshot-ami-policy.html#dlm-archive)
       * .
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("825dead620cc6ea08a641afcd158f0cc401bd80dfd5c87605bacaf652b0ce3a1")
      override fun archiveRule(archiveRule: ArchiveRuleProperty.Builder.() -> Unit): Unit =
          archiveRule(ArchiveRuleProperty(archiveRule))

      /**
       * @param copyTags Copy all user-defined tags on a source volume to snapshots of the volume
       * created by this policy.
       */
      override fun copyTags(copyTags: Boolean) {
        cdkBuilder.copyTags(copyTags)
      }

      /**
       * @param copyTags Copy all user-defined tags on a source volume to snapshots of the volume
       * created by this policy.
       */
      override fun copyTags(copyTags: IResolvable) {
        cdkBuilder.copyTags(copyTags.let(IResolvable::unwrap))
      }

      /**
       * @param createRule The creation rule.
       */
      override fun createRule(createRule: IResolvable) {
        cdkBuilder.createRule(createRule.let(IResolvable::unwrap))
      }

      /**
       * @param createRule The creation rule.
       */
      override fun createRule(createRule: CreateRuleProperty) {
        cdkBuilder.createRule(createRule.let(CreateRuleProperty::unwrap))
      }

      /**
       * @param createRule The creation rule.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("54891bc79136e1c87930dfbd441d43e610d3d82bccfced6e1bdf038d422a97b8")
      override fun createRule(createRule: CreateRuleProperty.Builder.() -> Unit): Unit =
          createRule(CreateRuleProperty(createRule))

      /**
       * @param crossRegionCopyRules Specifies a rule for copying snapshots or AMIs across regions.
       *
       * You can't specify cross-Region copy rules for policies that create snapshots on an Outpost.
       * If the policy creates snapshots in a Region, then snapshots can be copied to up to three
       * Regions or Outposts.
       */
      override fun crossRegionCopyRules(crossRegionCopyRules: IResolvable) {
        cdkBuilder.crossRegionCopyRules(crossRegionCopyRules.let(IResolvable::unwrap))
      }

      /**
       * @param crossRegionCopyRules Specifies a rule for copying snapshots or AMIs across regions.
       *
       * You can't specify cross-Region copy rules for policies that create snapshots on an Outpost.
       * If the policy creates snapshots in a Region, then snapshots can be copied to up to three
       * Regions or Outposts.
       */
      override fun crossRegionCopyRules(crossRegionCopyRules: List<Any>) {
        cdkBuilder.crossRegionCopyRules(crossRegionCopyRules)
      }

      /**
       * @param crossRegionCopyRules Specifies a rule for copying snapshots or AMIs across regions.
       *
       * You can't specify cross-Region copy rules for policies that create snapshots on an Outpost.
       * If the policy creates snapshots in a Region, then snapshots can be copied to up to three
       * Regions or Outposts.
       */
      override fun crossRegionCopyRules(vararg crossRegionCopyRules: Any): Unit =
          crossRegionCopyRules(crossRegionCopyRules.toList())

      /**
       * @param deprecateRule *[Custom AMI policies only]* The AMI deprecation rule for the
       * schedule.
       */
      override fun deprecateRule(deprecateRule: IResolvable) {
        cdkBuilder.deprecateRule(deprecateRule.let(IResolvable::unwrap))
      }

      /**
       * @param deprecateRule *[Custom AMI policies only]* The AMI deprecation rule for the
       * schedule.
       */
      override fun deprecateRule(deprecateRule: DeprecateRuleProperty) {
        cdkBuilder.deprecateRule(deprecateRule.let(DeprecateRuleProperty::unwrap))
      }

      /**
       * @param deprecateRule *[Custom AMI policies only]* The AMI deprecation rule for the
       * schedule.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("fb7a0258a6a743ee09f1b22132dea6f3341e66f8726bb797909b7292faed4270")
      override fun deprecateRule(deprecateRule: DeprecateRuleProperty.Builder.() -> Unit): Unit =
          deprecateRule(DeprecateRuleProperty(deprecateRule))

      /**
       * @param fastRestoreRule *[Custom snapshot policies only]* The rule for enabling fast
       * snapshot restore.
       */
      override fun fastRestoreRule(fastRestoreRule: IResolvable) {
        cdkBuilder.fastRestoreRule(fastRestoreRule.let(IResolvable::unwrap))
      }

      /**
       * @param fastRestoreRule *[Custom snapshot policies only]* The rule for enabling fast
       * snapshot restore.
       */
      override fun fastRestoreRule(fastRestoreRule: FastRestoreRuleProperty) {
        cdkBuilder.fastRestoreRule(fastRestoreRule.let(FastRestoreRuleProperty::unwrap))
      }

      /**
       * @param fastRestoreRule *[Custom snapshot policies only]* The rule for enabling fast
       * snapshot restore.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("e27b9391e7a38b3c973427c0f60208402a121bef2c15bbc3199f4c686769530a")
      override fun fastRestoreRule(fastRestoreRule: FastRestoreRuleProperty.Builder.() -> Unit):
          Unit = fastRestoreRule(FastRestoreRuleProperty(fastRestoreRule))

      /**
       * @param name The name of the schedule.
       */
      override fun name(name: String) {
        cdkBuilder.name(name)
      }

      /**
       * @param retainRule The retention rule for snapshots or AMIs created by the policy.
       */
      override fun retainRule(retainRule: IResolvable) {
        cdkBuilder.retainRule(retainRule.let(IResolvable::unwrap))
      }

      /**
       * @param retainRule The retention rule for snapshots or AMIs created by the policy.
       */
      override fun retainRule(retainRule: RetainRuleProperty) {
        cdkBuilder.retainRule(retainRule.let(RetainRuleProperty::unwrap))
      }

      /**
       * @param retainRule The retention rule for snapshots or AMIs created by the policy.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("98893537e56c00100b0f8d465996d0e9a2d0071e41103b84fb051fa0820b0529")
      override fun retainRule(retainRule: RetainRuleProperty.Builder.() -> Unit): Unit =
          retainRule(RetainRuleProperty(retainRule))

      /**
       * @param shareRules *[Custom snapshot policies only]* The rule for sharing snapshots with
       * other AWS accounts .
       */
      override fun shareRules(shareRules: IResolvable) {
        cdkBuilder.shareRules(shareRules.let(IResolvable::unwrap))
      }

      /**
       * @param shareRules *[Custom snapshot policies only]* The rule for sharing snapshots with
       * other AWS accounts .
       */
      override fun shareRules(shareRules: List<Any>) {
        cdkBuilder.shareRules(shareRules)
      }

      /**
       * @param shareRules *[Custom snapshot policies only]* The rule for sharing snapshots with
       * other AWS accounts .
       */
      override fun shareRules(vararg shareRules: Any): Unit = shareRules(shareRules.toList())

      /**
       * @param tagsToAdd The tags to apply to policy-created resources.
       * These user-defined tags are in addition to the AWS -added lifecycle tags.
       */
      override fun tagsToAdd(tagsToAdd: IResolvable) {
        cdkBuilder.tagsToAdd(tagsToAdd.let(IResolvable::unwrap))
      }

      /**
       * @param tagsToAdd The tags to apply to policy-created resources.
       * These user-defined tags are in addition to the AWS -added lifecycle tags.
       */
      override fun tagsToAdd(tagsToAdd: List<Any>) {
        cdkBuilder.tagsToAdd(tagsToAdd)
      }

      /**
       * @param tagsToAdd The tags to apply to policy-created resources.
       * These user-defined tags are in addition to the AWS -added lifecycle tags.
       */
      override fun tagsToAdd(vararg tagsToAdd: Any): Unit = tagsToAdd(tagsToAdd.toList())

      /**
       * @param variableTags *[AMI policies and snapshot policies that target instances only]* A
       * collection of key/value pairs with values determined dynamically when the policy is executed.
       * Keys may be any valid Amazon EC2 tag key. Values must be in one of the two following
       * formats: `$(instance-id)` or `$(timestamp)` . Variable tags are only valid for EBS Snapshot
       * Management – Instance policies.
       */
      override fun variableTags(variableTags: IResolvable) {
        cdkBuilder.variableTags(variableTags.let(IResolvable::unwrap))
      }

      /**
       * @param variableTags *[AMI policies and snapshot policies that target instances only]* A
       * collection of key/value pairs with values determined dynamically when the policy is executed.
       * Keys may be any valid Amazon EC2 tag key. Values must be in one of the two following
       * formats: `$(instance-id)` or `$(timestamp)` . Variable tags are only valid for EBS Snapshot
       * Management – Instance policies.
       */
      override fun variableTags(variableTags: List<Any>) {
        cdkBuilder.variableTags(variableTags)
      }

      /**
       * @param variableTags *[AMI policies and snapshot policies that target instances only]* A
       * collection of key/value pairs with values determined dynamically when the policy is executed.
       * Keys may be any valid Amazon EC2 tag key. Values must be in one of the two following
       * formats: `$(instance-id)` or `$(timestamp)` . Variable tags are only valid for EBS Snapshot
       * Management – Instance policies.
       */
      override fun variableTags(vararg variableTags: Any): Unit =
          variableTags(variableTags.toList())

      public fun build(): software.amazon.awscdk.services.dlm.CfnLifecyclePolicy.ScheduleProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.dlm.CfnLifecyclePolicy.ScheduleProperty,
    ) : CdkObject(cdkObject), ScheduleProperty {
      /**
       * *[Custom snapshot policies that target volumes only]* The snapshot archiving rule for the
       * schedule.
       *
       * When you specify an archiving rule, snapshots are automatically moved from the standard
       * tier to the archive tier once the schedule's retention threshold is met. Snapshots are then
       * retained in the archive tier for the archive retention period that you specify.
       *
       * For more information about using snapshot archiving, see [Considerations for snapshot
       * lifecycle
       * policies](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/snapshot-ami-policy.html#dlm-archive)
       * .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dlm-lifecyclepolicy-schedule.html#cfn-dlm-lifecyclepolicy-schedule-archiverule)
       */
      override fun archiveRule(): Any? = unwrap(this).getArchiveRule()

      /**
       * Copy all user-defined tags on a source volume to snapshots of the volume created by this
       * policy.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dlm-lifecyclepolicy-schedule.html#cfn-dlm-lifecyclepolicy-schedule-copytags)
       */
      override fun copyTags(): Any? = unwrap(this).getCopyTags()

      /**
       * The creation rule.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dlm-lifecyclepolicy-schedule.html#cfn-dlm-lifecyclepolicy-schedule-createrule)
       */
      override fun createRule(): Any? = unwrap(this).getCreateRule()

      /**
       * Specifies a rule for copying snapshots or AMIs across regions.
       *
       *
       * You can't specify cross-Region copy rules for policies that create snapshots on an Outpost.
       * If the policy creates snapshots in a Region, then snapshots can be copied to up to three
       * Regions or Outposts.
       *
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dlm-lifecyclepolicy-schedule.html#cfn-dlm-lifecyclepolicy-schedule-crossregioncopyrules)
       */
      override fun crossRegionCopyRules(): Any? = unwrap(this).getCrossRegionCopyRules()

      /**
       * *[Custom AMI policies only]* The AMI deprecation rule for the schedule.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dlm-lifecyclepolicy-schedule.html#cfn-dlm-lifecyclepolicy-schedule-deprecaterule)
       */
      override fun deprecateRule(): Any? = unwrap(this).getDeprecateRule()

      /**
       * *[Custom snapshot policies only]* The rule for enabling fast snapshot restore.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dlm-lifecyclepolicy-schedule.html#cfn-dlm-lifecyclepolicy-schedule-fastrestorerule)
       */
      override fun fastRestoreRule(): Any? = unwrap(this).getFastRestoreRule()

      /**
       * The name of the schedule.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dlm-lifecyclepolicy-schedule.html#cfn-dlm-lifecyclepolicy-schedule-name)
       */
      override fun name(): String? = unwrap(this).getName()

      /**
       * The retention rule for snapshots or AMIs created by the policy.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dlm-lifecyclepolicy-schedule.html#cfn-dlm-lifecyclepolicy-schedule-retainrule)
       */
      override fun retainRule(): Any? = unwrap(this).getRetainRule()

      /**
       * *[Custom snapshot policies only]* The rule for sharing snapshots with other AWS accounts .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dlm-lifecyclepolicy-schedule.html#cfn-dlm-lifecyclepolicy-schedule-sharerules)
       */
      override fun shareRules(): Any? = unwrap(this).getShareRules()

      /**
       * The tags to apply to policy-created resources.
       *
       * These user-defined tags are in addition to the AWS -added lifecycle tags.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dlm-lifecyclepolicy-schedule.html#cfn-dlm-lifecyclepolicy-schedule-tagstoadd)
       */
      override fun tagsToAdd(): Any? = unwrap(this).getTagsToAdd()

      /**
       * *[AMI policies and snapshot policies that target instances only]* A collection of key/value
       * pairs with values determined dynamically when the policy is executed.
       *
       * Keys may be any valid Amazon EC2 tag key. Values must be in one of the two following
       * formats: `$(instance-id)` or `$(timestamp)` . Variable tags are only valid for EBS Snapshot
       * Management – Instance policies.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dlm-lifecyclepolicy-schedule.html#cfn-dlm-lifecyclepolicy-schedule-variabletags)
       */
      override fun variableTags(): Any? = unwrap(this).getVariableTags()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): ScheduleProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.dlm.CfnLifecyclePolicy.ScheduleProperty):
          ScheduleProperty = CdkObjectWrappers.wrap(cdkObject) as? ScheduleProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: ScheduleProperty):
          software.amazon.awscdk.services.dlm.CfnLifecyclePolicy.ScheduleProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.dlm.CfnLifecyclePolicy.ScheduleProperty
    }
  }

  /**
   * *[Custom snapshot policies that target instances only]* Information about pre and/or post
   * scripts for a snapshot lifecycle policy that targets instances.
   *
   * For more information, see [Automating application-consistent snapshots with pre and post
   * scripts](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/automate-app-consistent-backups.html)
   * .
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.dlm.*;
   * ScriptProperty scriptProperty = ScriptProperty.builder()
   * .executeOperationOnScriptFailure(false)
   * .executionHandler("executionHandler")
   * .executionHandlerService("executionHandlerService")
   * .executionTimeout(123)
   * .maximumRetryCount(123)
   * .stages(List.of("stages"))
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dlm-lifecyclepolicy-script.html)
   */
  public interface ScriptProperty {
    /**
     * Indicates whether Amazon Data Lifecycle Manager should default to crash-consistent snapshots
     * if the pre script fails.
     *
     * * To default to crash consistent snapshot if the pre script fails, specify `true` .
     * * To skip the instance for snapshot creation if the pre script fails, specify `false` .
     *
     * This parameter is supported only if you run a pre script. If you run a post script only, omit
     * this parameter.
     *
     * Default: true
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dlm-lifecyclepolicy-script.html#cfn-dlm-lifecyclepolicy-script-executeoperationonscriptfailure)
     */
    public fun executeOperationOnScriptFailure(): Any? =
        unwrap(this).getExecuteOperationOnScriptFailure()

    /**
     * The SSM document that includes the pre and/or post scripts to run.
     *
     * * If you are automating VSS backups, specify `AWS_VSS_BACKUP` . In this case, Amazon Data
     * Lifecycle Manager automatically uses the `AWSEC2-CreateVssSnapshot` SSM document.
     * * If you are automating application-consistent snapshots for SAP HANA workloads, specify
     * `AWSSystemsManagerSAP-CreateDLMSnapshotForSAPHANA` .
     * * If you are using a custom SSM document that you own, specify either the name or ARN of the
     * SSM document. If you are using a custom SSM document that is shared with you, specify the ARN of
     * the SSM document.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dlm-lifecyclepolicy-script.html#cfn-dlm-lifecyclepolicy-script-executionhandler)
     */
    public fun executionHandler(): String? = unwrap(this).getExecutionHandler()

    /**
     * Indicates the service used to execute the pre and/or post scripts.
     *
     * * If you are using custom SSM documents or automating application-consistent snapshots of SAP
     * HANA workloads, specify `AWS_SYSTEMS_MANAGER` .
     * * If you are automating VSS Backups, omit this parameter.
     *
     * Default: AWS_SYSTEMS_MANAGER
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dlm-lifecyclepolicy-script.html#cfn-dlm-lifecyclepolicy-script-executionhandlerservice)
     */
    public fun executionHandlerService(): String? = unwrap(this).getExecutionHandlerService()

    /**
     * Specifies a timeout period, in seconds, after which Amazon Data Lifecycle Manager fails the
     * script run attempt if it has not completed.
     *
     * If a script does not complete within its timeout period, Amazon Data Lifecycle Manager fails
     * the attempt. The timeout period applies to the pre and post scripts individually.
     *
     * If you are automating VSS Backups, omit this parameter.
     *
     * Default: 10
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dlm-lifecyclepolicy-script.html#cfn-dlm-lifecyclepolicy-script-executiontimeout)
     */
    public fun executionTimeout(): Number? = unwrap(this).getExecutionTimeout()

    /**
     * Specifies the number of times Amazon Data Lifecycle Manager should retry scripts that fail.
     *
     * * If the pre script fails, Amazon Data Lifecycle Manager retries the entire snapshot creation
     * process, including running the pre and post scripts.
     * * If the post script fails, Amazon Data Lifecycle Manager retries the post script only; in
     * this case, the pre script will have completed and the snapshot might have been created.
     *
     * If you do not want Amazon Data Lifecycle Manager to retry failed scripts, specify `0` .
     *
     * Default: 0
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dlm-lifecyclepolicy-script.html#cfn-dlm-lifecyclepolicy-script-maximumretrycount)
     */
    public fun maximumRetryCount(): Number? = unwrap(this).getMaximumRetryCount()

    /**
     * Indicate which scripts Amazon Data Lifecycle Manager should run on target instances.
     *
     * Pre scripts run before Amazon Data Lifecycle Manager initiates snapshot creation. Post
     * scripts run after Amazon Data Lifecycle Manager initiates snapshot creation.
     *
     * * To run a pre script only, specify `PRE` . In this case, Amazon Data Lifecycle Manager calls
     * the SSM document with the `pre-script` parameter before initiating snapshot creation.
     * * To run a post script only, specify `POST` . In this case, Amazon Data Lifecycle Manager
     * calls the SSM document with the `post-script` parameter after initiating snapshot creation.
     * * To run both pre and post scripts, specify both `PRE` and `POST` . In this case, Amazon Data
     * Lifecycle Manager calls the SSM document with the `pre-script` parameter before initiating
     * snapshot creation, and then it calls the SSM document again with the `post-script` parameter
     * after initiating snapshot creation.
     *
     * If you are automating VSS Backups, omit this parameter.
     *
     * Default: PRE and POST
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dlm-lifecyclepolicy-script.html#cfn-dlm-lifecyclepolicy-script-stages)
     */
    public fun stages(): List<String> = unwrap(this).getStages() ?: emptyList()

    /**
     * A builder for [ScriptProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param executeOperationOnScriptFailure Indicates whether Amazon Data Lifecycle Manager
       * should default to crash-consistent snapshots if the pre script fails.
       * * To default to crash consistent snapshot if the pre script fails, specify `true` .
       * * To skip the instance for snapshot creation if the pre script fails, specify `false` .
       *
       * This parameter is supported only if you run a pre script. If you run a post script only,
       * omit this parameter.
       *
       * Default: true
       */
      public fun executeOperationOnScriptFailure(executeOperationOnScriptFailure: Boolean)

      /**
       * @param executeOperationOnScriptFailure Indicates whether Amazon Data Lifecycle Manager
       * should default to crash-consistent snapshots if the pre script fails.
       * * To default to crash consistent snapshot if the pre script fails, specify `true` .
       * * To skip the instance for snapshot creation if the pre script fails, specify `false` .
       *
       * This parameter is supported only if you run a pre script. If you run a post script only,
       * omit this parameter.
       *
       * Default: true
       */
      public fun executeOperationOnScriptFailure(executeOperationOnScriptFailure: IResolvable)

      /**
       * @param executionHandler The SSM document that includes the pre and/or post scripts to run.
       * * If you are automating VSS backups, specify `AWS_VSS_BACKUP` . In this case, Amazon Data
       * Lifecycle Manager automatically uses the `AWSEC2-CreateVssSnapshot` SSM document.
       * * If you are automating application-consistent snapshots for SAP HANA workloads, specify
       * `AWSSystemsManagerSAP-CreateDLMSnapshotForSAPHANA` .
       * * If you are using a custom SSM document that you own, specify either the name or ARN of
       * the SSM document. If you are using a custom SSM document that is shared with you, specify the
       * ARN of the SSM document.
       */
      public fun executionHandler(executionHandler: String)

      /**
       * @param executionHandlerService Indicates the service used to execute the pre and/or post
       * scripts.
       * * If you are using custom SSM documents or automating application-consistent snapshots of
       * SAP HANA workloads, specify `AWS_SYSTEMS_MANAGER` .
       * * If you are automating VSS Backups, omit this parameter.
       *
       * Default: AWS_SYSTEMS_MANAGER
       */
      public fun executionHandlerService(executionHandlerService: String)

      /**
       * @param executionTimeout Specifies a timeout period, in seconds, after which Amazon Data
       * Lifecycle Manager fails the script run attempt if it has not completed.
       * If a script does not complete within its timeout period, Amazon Data Lifecycle Manager
       * fails the attempt. The timeout period applies to the pre and post scripts individually.
       *
       * If you are automating VSS Backups, omit this parameter.
       *
       * Default: 10
       */
      public fun executionTimeout(executionTimeout: Number)

      /**
       * @param maximumRetryCount Specifies the number of times Amazon Data Lifecycle Manager should
       * retry scripts that fail.
       * * If the pre script fails, Amazon Data Lifecycle Manager retries the entire snapshot
       * creation process, including running the pre and post scripts.
       * * If the post script fails, Amazon Data Lifecycle Manager retries the post script only; in
       * this case, the pre script will have completed and the snapshot might have been created.
       *
       * If you do not want Amazon Data Lifecycle Manager to retry failed scripts, specify `0` .
       *
       * Default: 0
       */
      public fun maximumRetryCount(maximumRetryCount: Number)

      /**
       * @param stages Indicate which scripts Amazon Data Lifecycle Manager should run on target
       * instances.
       * Pre scripts run before Amazon Data Lifecycle Manager initiates snapshot creation. Post
       * scripts run after Amazon Data Lifecycle Manager initiates snapshot creation.
       *
       * * To run a pre script only, specify `PRE` . In this case, Amazon Data Lifecycle Manager
       * calls the SSM document with the `pre-script` parameter before initiating snapshot creation.
       * * To run a post script only, specify `POST` . In this case, Amazon Data Lifecycle Manager
       * calls the SSM document with the `post-script` parameter after initiating snapshot creation.
       * * To run both pre and post scripts, specify both `PRE` and `POST` . In this case, Amazon
       * Data Lifecycle Manager calls the SSM document with the `pre-script` parameter before
       * initiating snapshot creation, and then it calls the SSM document again with the `post-script`
       * parameter after initiating snapshot creation.
       *
       * If you are automating VSS Backups, omit this parameter.
       *
       * Default: PRE and POST
       */
      public fun stages(stages: List<String>)

      /**
       * @param stages Indicate which scripts Amazon Data Lifecycle Manager should run on target
       * instances.
       * Pre scripts run before Amazon Data Lifecycle Manager initiates snapshot creation. Post
       * scripts run after Amazon Data Lifecycle Manager initiates snapshot creation.
       *
       * * To run a pre script only, specify `PRE` . In this case, Amazon Data Lifecycle Manager
       * calls the SSM document with the `pre-script` parameter before initiating snapshot creation.
       * * To run a post script only, specify `POST` . In this case, Amazon Data Lifecycle Manager
       * calls the SSM document with the `post-script` parameter after initiating snapshot creation.
       * * To run both pre and post scripts, specify both `PRE` and `POST` . In this case, Amazon
       * Data Lifecycle Manager calls the SSM document with the `pre-script` parameter before
       * initiating snapshot creation, and then it calls the SSM document again with the `post-script`
       * parameter after initiating snapshot creation.
       *
       * If you are automating VSS Backups, omit this parameter.
       *
       * Default: PRE and POST
       */
      public fun stages(vararg stages: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.dlm.CfnLifecyclePolicy.ScriptProperty.Builder =
          software.amazon.awscdk.services.dlm.CfnLifecyclePolicy.ScriptProperty.builder()

      /**
       * @param executeOperationOnScriptFailure Indicates whether Amazon Data Lifecycle Manager
       * should default to crash-consistent snapshots if the pre script fails.
       * * To default to crash consistent snapshot if the pre script fails, specify `true` .
       * * To skip the instance for snapshot creation if the pre script fails, specify `false` .
       *
       * This parameter is supported only if you run a pre script. If you run a post script only,
       * omit this parameter.
       *
       * Default: true
       */
      override fun executeOperationOnScriptFailure(executeOperationOnScriptFailure: Boolean) {
        cdkBuilder.executeOperationOnScriptFailure(executeOperationOnScriptFailure)
      }

      /**
       * @param executeOperationOnScriptFailure Indicates whether Amazon Data Lifecycle Manager
       * should default to crash-consistent snapshots if the pre script fails.
       * * To default to crash consistent snapshot if the pre script fails, specify `true` .
       * * To skip the instance for snapshot creation if the pre script fails, specify `false` .
       *
       * This parameter is supported only if you run a pre script. If you run a post script only,
       * omit this parameter.
       *
       * Default: true
       */
      override fun executeOperationOnScriptFailure(executeOperationOnScriptFailure: IResolvable) {
        cdkBuilder.executeOperationOnScriptFailure(executeOperationOnScriptFailure.let(IResolvable::unwrap))
      }

      /**
       * @param executionHandler The SSM document that includes the pre and/or post scripts to run.
       * * If you are automating VSS backups, specify `AWS_VSS_BACKUP` . In this case, Amazon Data
       * Lifecycle Manager automatically uses the `AWSEC2-CreateVssSnapshot` SSM document.
       * * If you are automating application-consistent snapshots for SAP HANA workloads, specify
       * `AWSSystemsManagerSAP-CreateDLMSnapshotForSAPHANA` .
       * * If you are using a custom SSM document that you own, specify either the name or ARN of
       * the SSM document. If you are using a custom SSM document that is shared with you, specify the
       * ARN of the SSM document.
       */
      override fun executionHandler(executionHandler: String) {
        cdkBuilder.executionHandler(executionHandler)
      }

      /**
       * @param executionHandlerService Indicates the service used to execute the pre and/or post
       * scripts.
       * * If you are using custom SSM documents or automating application-consistent snapshots of
       * SAP HANA workloads, specify `AWS_SYSTEMS_MANAGER` .
       * * If you are automating VSS Backups, omit this parameter.
       *
       * Default: AWS_SYSTEMS_MANAGER
       */
      override fun executionHandlerService(executionHandlerService: String) {
        cdkBuilder.executionHandlerService(executionHandlerService)
      }

      /**
       * @param executionTimeout Specifies a timeout period, in seconds, after which Amazon Data
       * Lifecycle Manager fails the script run attempt if it has not completed.
       * If a script does not complete within its timeout period, Amazon Data Lifecycle Manager
       * fails the attempt. The timeout period applies to the pre and post scripts individually.
       *
       * If you are automating VSS Backups, omit this parameter.
       *
       * Default: 10
       */
      override fun executionTimeout(executionTimeout: Number) {
        cdkBuilder.executionTimeout(executionTimeout)
      }

      /**
       * @param maximumRetryCount Specifies the number of times Amazon Data Lifecycle Manager should
       * retry scripts that fail.
       * * If the pre script fails, Amazon Data Lifecycle Manager retries the entire snapshot
       * creation process, including running the pre and post scripts.
       * * If the post script fails, Amazon Data Lifecycle Manager retries the post script only; in
       * this case, the pre script will have completed and the snapshot might have been created.
       *
       * If you do not want Amazon Data Lifecycle Manager to retry failed scripts, specify `0` .
       *
       * Default: 0
       */
      override fun maximumRetryCount(maximumRetryCount: Number) {
        cdkBuilder.maximumRetryCount(maximumRetryCount)
      }

      /**
       * @param stages Indicate which scripts Amazon Data Lifecycle Manager should run on target
       * instances.
       * Pre scripts run before Amazon Data Lifecycle Manager initiates snapshot creation. Post
       * scripts run after Amazon Data Lifecycle Manager initiates snapshot creation.
       *
       * * To run a pre script only, specify `PRE` . In this case, Amazon Data Lifecycle Manager
       * calls the SSM document with the `pre-script` parameter before initiating snapshot creation.
       * * To run a post script only, specify `POST` . In this case, Amazon Data Lifecycle Manager
       * calls the SSM document with the `post-script` parameter after initiating snapshot creation.
       * * To run both pre and post scripts, specify both `PRE` and `POST` . In this case, Amazon
       * Data Lifecycle Manager calls the SSM document with the `pre-script` parameter before
       * initiating snapshot creation, and then it calls the SSM document again with the `post-script`
       * parameter after initiating snapshot creation.
       *
       * If you are automating VSS Backups, omit this parameter.
       *
       * Default: PRE and POST
       */
      override fun stages(stages: List<String>) {
        cdkBuilder.stages(stages)
      }

      /**
       * @param stages Indicate which scripts Amazon Data Lifecycle Manager should run on target
       * instances.
       * Pre scripts run before Amazon Data Lifecycle Manager initiates snapshot creation. Post
       * scripts run after Amazon Data Lifecycle Manager initiates snapshot creation.
       *
       * * To run a pre script only, specify `PRE` . In this case, Amazon Data Lifecycle Manager
       * calls the SSM document with the `pre-script` parameter before initiating snapshot creation.
       * * To run a post script only, specify `POST` . In this case, Amazon Data Lifecycle Manager
       * calls the SSM document with the `post-script` parameter after initiating snapshot creation.
       * * To run both pre and post scripts, specify both `PRE` and `POST` . In this case, Amazon
       * Data Lifecycle Manager calls the SSM document with the `pre-script` parameter before
       * initiating snapshot creation, and then it calls the SSM document again with the `post-script`
       * parameter after initiating snapshot creation.
       *
       * If you are automating VSS Backups, omit this parameter.
       *
       * Default: PRE and POST
       */
      override fun stages(vararg stages: String): Unit = stages(stages.toList())

      public fun build(): software.amazon.awscdk.services.dlm.CfnLifecyclePolicy.ScriptProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject: software.amazon.awscdk.services.dlm.CfnLifecyclePolicy.ScriptProperty,
    ) : CdkObject(cdkObject), ScriptProperty {
      /**
       * Indicates whether Amazon Data Lifecycle Manager should default to crash-consistent
       * snapshots if the pre script fails.
       *
       * * To default to crash consistent snapshot if the pre script fails, specify `true` .
       * * To skip the instance for snapshot creation if the pre script fails, specify `false` .
       *
       * This parameter is supported only if you run a pre script. If you run a post script only,
       * omit this parameter.
       *
       * Default: true
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dlm-lifecyclepolicy-script.html#cfn-dlm-lifecyclepolicy-script-executeoperationonscriptfailure)
       */
      override fun executeOperationOnScriptFailure(): Any? =
          unwrap(this).getExecuteOperationOnScriptFailure()

      /**
       * The SSM document that includes the pre and/or post scripts to run.
       *
       * * If you are automating VSS backups, specify `AWS_VSS_BACKUP` . In this case, Amazon Data
       * Lifecycle Manager automatically uses the `AWSEC2-CreateVssSnapshot` SSM document.
       * * If you are automating application-consistent snapshots for SAP HANA workloads, specify
       * `AWSSystemsManagerSAP-CreateDLMSnapshotForSAPHANA` .
       * * If you are using a custom SSM document that you own, specify either the name or ARN of
       * the SSM document. If you are using a custom SSM document that is shared with you, specify the
       * ARN of the SSM document.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dlm-lifecyclepolicy-script.html#cfn-dlm-lifecyclepolicy-script-executionhandler)
       */
      override fun executionHandler(): String? = unwrap(this).getExecutionHandler()

      /**
       * Indicates the service used to execute the pre and/or post scripts.
       *
       * * If you are using custom SSM documents or automating application-consistent snapshots of
       * SAP HANA workloads, specify `AWS_SYSTEMS_MANAGER` .
       * * If you are automating VSS Backups, omit this parameter.
       *
       * Default: AWS_SYSTEMS_MANAGER
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dlm-lifecyclepolicy-script.html#cfn-dlm-lifecyclepolicy-script-executionhandlerservice)
       */
      override fun executionHandlerService(): String? = unwrap(this).getExecutionHandlerService()

      /**
       * Specifies a timeout period, in seconds, after which Amazon Data Lifecycle Manager fails the
       * script run attempt if it has not completed.
       *
       * If a script does not complete within its timeout period, Amazon Data Lifecycle Manager
       * fails the attempt. The timeout period applies to the pre and post scripts individually.
       *
       * If you are automating VSS Backups, omit this parameter.
       *
       * Default: 10
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dlm-lifecyclepolicy-script.html#cfn-dlm-lifecyclepolicy-script-executiontimeout)
       */
      override fun executionTimeout(): Number? = unwrap(this).getExecutionTimeout()

      /**
       * Specifies the number of times Amazon Data Lifecycle Manager should retry scripts that fail.
       *
       * * If the pre script fails, Amazon Data Lifecycle Manager retries the entire snapshot
       * creation process, including running the pre and post scripts.
       * * If the post script fails, Amazon Data Lifecycle Manager retries the post script only; in
       * this case, the pre script will have completed and the snapshot might have been created.
       *
       * If you do not want Amazon Data Lifecycle Manager to retry failed scripts, specify `0` .
       *
       * Default: 0
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dlm-lifecyclepolicy-script.html#cfn-dlm-lifecyclepolicy-script-maximumretrycount)
       */
      override fun maximumRetryCount(): Number? = unwrap(this).getMaximumRetryCount()

      /**
       * Indicate which scripts Amazon Data Lifecycle Manager should run on target instances.
       *
       * Pre scripts run before Amazon Data Lifecycle Manager initiates snapshot creation. Post
       * scripts run after Amazon Data Lifecycle Manager initiates snapshot creation.
       *
       * * To run a pre script only, specify `PRE` . In this case, Amazon Data Lifecycle Manager
       * calls the SSM document with the `pre-script` parameter before initiating snapshot creation.
       * * To run a post script only, specify `POST` . In this case, Amazon Data Lifecycle Manager
       * calls the SSM document with the `post-script` parameter after initiating snapshot creation.
       * * To run both pre and post scripts, specify both `PRE` and `POST` . In this case, Amazon
       * Data Lifecycle Manager calls the SSM document with the `pre-script` parameter before
       * initiating snapshot creation, and then it calls the SSM document again with the `post-script`
       * parameter after initiating snapshot creation.
       *
       * If you are automating VSS Backups, omit this parameter.
       *
       * Default: PRE and POST
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dlm-lifecyclepolicy-script.html#cfn-dlm-lifecyclepolicy-script-stages)
       */
      override fun stages(): List<String> = unwrap(this).getStages() ?: emptyList()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): ScriptProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.dlm.CfnLifecyclePolicy.ScriptProperty):
          ScriptProperty = CdkObjectWrappers.wrap(cdkObject) as? ScriptProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: ScriptProperty):
          software.amazon.awscdk.services.dlm.CfnLifecyclePolicy.ScriptProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.dlm.CfnLifecyclePolicy.ScriptProperty
    }
  }

  /**
   * *[Custom snapshot policies only]* Specifies a rule for sharing snapshots across AWS accounts .
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.dlm.*;
   * ShareRuleProperty shareRuleProperty = ShareRuleProperty.builder()
   * .targetAccounts(List.of("targetAccounts"))
   * .unshareInterval(123)
   * .unshareIntervalUnit("unshareIntervalUnit")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dlm-lifecyclepolicy-sharerule.html)
   */
  public interface ShareRuleProperty {
    /**
     * The IDs of the AWS accounts with which to share the snapshots.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dlm-lifecyclepolicy-sharerule.html#cfn-dlm-lifecyclepolicy-sharerule-targetaccounts)
     */
    public fun targetAccounts(): List<String> = unwrap(this).getTargetAccounts() ?: emptyList()

    /**
     * The period after which snapshots that are shared with other AWS accounts are automatically
     * unshared.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dlm-lifecyclepolicy-sharerule.html#cfn-dlm-lifecyclepolicy-sharerule-unshareinterval)
     */
    public fun unshareInterval(): Number? = unwrap(this).getUnshareInterval()

    /**
     * The unit of time for the automatic unsharing interval.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dlm-lifecyclepolicy-sharerule.html#cfn-dlm-lifecyclepolicy-sharerule-unshareintervalunit)
     */
    public fun unshareIntervalUnit(): String? = unwrap(this).getUnshareIntervalUnit()

    /**
     * A builder for [ShareRuleProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param targetAccounts The IDs of the AWS accounts with which to share the snapshots.
       */
      public fun targetAccounts(targetAccounts: List<String>)

      /**
       * @param targetAccounts The IDs of the AWS accounts with which to share the snapshots.
       */
      public fun targetAccounts(vararg targetAccounts: String)

      /**
       * @param unshareInterval The period after which snapshots that are shared with other AWS
       * accounts are automatically unshared.
       */
      public fun unshareInterval(unshareInterval: Number)

      /**
       * @param unshareIntervalUnit The unit of time for the automatic unsharing interval.
       */
      public fun unshareIntervalUnit(unshareIntervalUnit: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.dlm.CfnLifecyclePolicy.ShareRuleProperty.Builder =
          software.amazon.awscdk.services.dlm.CfnLifecyclePolicy.ShareRuleProperty.builder()

      /**
       * @param targetAccounts The IDs of the AWS accounts with which to share the snapshots.
       */
      override fun targetAccounts(targetAccounts: List<String>) {
        cdkBuilder.targetAccounts(targetAccounts)
      }

      /**
       * @param targetAccounts The IDs of the AWS accounts with which to share the snapshots.
       */
      override fun targetAccounts(vararg targetAccounts: String): Unit =
          targetAccounts(targetAccounts.toList())

      /**
       * @param unshareInterval The period after which snapshots that are shared with other AWS
       * accounts are automatically unshared.
       */
      override fun unshareInterval(unshareInterval: Number) {
        cdkBuilder.unshareInterval(unshareInterval)
      }

      /**
       * @param unshareIntervalUnit The unit of time for the automatic unsharing interval.
       */
      override fun unshareIntervalUnit(unshareIntervalUnit: String) {
        cdkBuilder.unshareIntervalUnit(unshareIntervalUnit)
      }

      public fun build(): software.amazon.awscdk.services.dlm.CfnLifecyclePolicy.ShareRuleProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.dlm.CfnLifecyclePolicy.ShareRuleProperty,
    ) : CdkObject(cdkObject), ShareRuleProperty {
      /**
       * The IDs of the AWS accounts with which to share the snapshots.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dlm-lifecyclepolicy-sharerule.html#cfn-dlm-lifecyclepolicy-sharerule-targetaccounts)
       */
      override fun targetAccounts(): List<String> = unwrap(this).getTargetAccounts() ?: emptyList()

      /**
       * The period after which snapshots that are shared with other AWS accounts are automatically
       * unshared.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dlm-lifecyclepolicy-sharerule.html#cfn-dlm-lifecyclepolicy-sharerule-unshareinterval)
       */
      override fun unshareInterval(): Number? = unwrap(this).getUnshareInterval()

      /**
       * The unit of time for the automatic unsharing interval.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dlm-lifecyclepolicy-sharerule.html#cfn-dlm-lifecyclepolicy-sharerule-unshareintervalunit)
       */
      override fun unshareIntervalUnit(): String? = unwrap(this).getUnshareIntervalUnit()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): ShareRuleProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.dlm.CfnLifecyclePolicy.ShareRuleProperty):
          ShareRuleProperty = CdkObjectWrappers.wrap(cdkObject) as? ShareRuleProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: ShareRuleProperty):
          software.amazon.awscdk.services.dlm.CfnLifecyclePolicy.ShareRuleProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.dlm.CfnLifecyclePolicy.ShareRuleProperty
    }
  }
}
