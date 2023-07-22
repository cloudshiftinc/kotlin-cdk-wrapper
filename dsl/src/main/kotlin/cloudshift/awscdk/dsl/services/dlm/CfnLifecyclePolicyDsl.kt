@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.dlm

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.dsl.CfnTagDsl
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
@CdkDslMarker
public class CfnLifecyclePolicyDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: CfnLifecyclePolicy.Builder = CfnLifecyclePolicy.Builder.create(scope, id)

  private val _tags: MutableList<CfnTag> = mutableListOf()

  /**
   * A description of the lifecycle policy.
   *
   * The characters ^[0-9A-Za-z _-]+$ are supported.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dlm-lifecyclepolicy.html#cfn-dlm-lifecyclepolicy-description)
   * @param description A description of the lifecycle policy. 
   */
  public fun description(description: String) {
    cdkBuilder.description(description)
  }

  /**
   * The Amazon Resource Name (ARN) of the IAM role used to run the operations specified by the
   * lifecycle policy.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dlm-lifecyclepolicy.html#cfn-dlm-lifecyclepolicy-executionrolearn)
   * @param executionRoleArn The Amazon Resource Name (ARN) of the IAM role used to run the
   * operations specified by the lifecycle policy. 
   */
  public fun executionRoleArn(executionRoleArn: String) {
    cdkBuilder.executionRoleArn(executionRoleArn)
  }

  /**
   * The configuration details of the lifecycle policy.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dlm-lifecyclepolicy.html#cfn-dlm-lifecyclepolicy-policydetails)
   * @param policyDetails The configuration details of the lifecycle policy. 
   */
  public fun policyDetails(policyDetails: IResolvable) {
    cdkBuilder.policyDetails(policyDetails)
  }

  /**
   * The configuration details of the lifecycle policy.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dlm-lifecyclepolicy.html#cfn-dlm-lifecyclepolicy-policydetails)
   * @param policyDetails The configuration details of the lifecycle policy. 
   */
  public fun policyDetails(policyDetails: CfnLifecyclePolicy.PolicyDetailsProperty) {
    cdkBuilder.policyDetails(policyDetails)
  }

  /**
   * The activation state of the lifecycle policy.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dlm-lifecyclepolicy.html#cfn-dlm-lifecyclepolicy-state)
   * @param state The activation state of the lifecycle policy. 
   */
  public fun state(state: String) {
    cdkBuilder.state(state)
  }

  /**
   * The tags to apply to the lifecycle policy during creation.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dlm-lifecyclepolicy.html#cfn-dlm-lifecyclepolicy-tags)
   * @param tags The tags to apply to the lifecycle policy during creation. 
   */
  public fun tags(tags: CfnTagDsl.() -> Unit) {
    _tags.add(CfnTagDsl().apply(tags).build())
  }

  /**
   * The tags to apply to the lifecycle policy during creation.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dlm-lifecyclepolicy.html#cfn-dlm-lifecyclepolicy-tags)
   * @param tags The tags to apply to the lifecycle policy during creation. 
   */
  public fun tags(tags: Collection<CfnTag>) {
    _tags.addAll(tags)
  }

  public fun build(): CfnLifecyclePolicy {
    if(_tags.isNotEmpty()) cdkBuilder.tags(_tags)
    return cdkBuilder.build()
  }
}
