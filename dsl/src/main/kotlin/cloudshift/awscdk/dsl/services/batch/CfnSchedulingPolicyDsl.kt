@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.batch

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.collections.Map
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.batch.CfnSchedulingPolicy
import software.constructs.Construct

@CdkDslMarker
public class CfnSchedulingPolicyDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: CfnSchedulingPolicy.Builder = CfnSchedulingPolicy.Builder.create(scope,
      id)

  /**
   * The fair share policy of the scheduling policy.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-batch-schedulingpolicy.html#cfn-batch-schedulingpolicy-fairsharepolicy)
   * @param fairsharePolicy The fair share policy of the scheduling policy. 
   */
  public fun fairsharePolicy(fairsharePolicy: IResolvable) {
    cdkBuilder.fairsharePolicy(fairsharePolicy)
  }

  /**
   * The fair share policy of the scheduling policy.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-batch-schedulingpolicy.html#cfn-batch-schedulingpolicy-fairsharepolicy)
   * @param fairsharePolicy The fair share policy of the scheduling policy. 
   */
  public fun fairsharePolicy(fairsharePolicy: CfnSchedulingPolicy.FairsharePolicyProperty) {
    cdkBuilder.fairsharePolicy(fairsharePolicy)
  }

  /**
   * The name of the scheduling policy.
   *
   * It can be up to 128 letters long. It can contain uppercase and lowercase letters, numbers,
   * hyphens (-), and underscores (_).
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-batch-schedulingpolicy.html#cfn-batch-schedulingpolicy-name)
   * @param name The name of the scheduling policy. 
   */
  public fun name(name: String) {
    cdkBuilder.name(name)
  }

  /**
   * The tags that you apply to the scheduling policy to help you categorize and organize your
   * resources.
   *
   * Each tag consists of a key and an optional value. For more information, see [Tagging AWS
   * Resources](https://docs.aws.amazon.com/general/latest/gr/aws_tagging.html) in *AWS General
   * Reference* .
   *
   * These tags can be updated or removed using the
   * [TagResource](https://docs.aws.amazon.com/batch/latest/APIReference/API_TagResource.html) and
   * [UntagResource](https://docs.aws.amazon.com/batch/latest/APIReference/API_UntagResource.html) API
   * operations.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-batch-schedulingpolicy.html#cfn-batch-schedulingpolicy-tags)
   * @param tags The tags that you apply to the scheduling policy to help you categorize and
   * organize your resources. 
   */
  public fun tags(tags: Map<String, String>) {
    cdkBuilder.tags(tags)
  }

  public fun build(): CfnSchedulingPolicy = cdkBuilder.build()
}
