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
