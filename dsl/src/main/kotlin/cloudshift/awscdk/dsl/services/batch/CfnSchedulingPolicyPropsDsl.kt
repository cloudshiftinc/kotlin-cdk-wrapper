@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.batch

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.collections.Map
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.batch.CfnSchedulingPolicy
import software.amazon.awscdk.services.batch.CfnSchedulingPolicyProps

@CdkDslMarker
public class CfnSchedulingPolicyPropsDsl {
  private val cdkBuilder: CfnSchedulingPolicyProps.Builder = CfnSchedulingPolicyProps.builder()

  /**
   * @param fairsharePolicy The fair share policy of the scheduling policy.
   */
  public fun fairsharePolicy(fairsharePolicy: IResolvable) {
    cdkBuilder.fairsharePolicy(fairsharePolicy)
  }

  /**
   * @param fairsharePolicy The fair share policy of the scheduling policy.
   */
  public fun fairsharePolicy(fairsharePolicy: CfnSchedulingPolicy.FairsharePolicyProperty) {
    cdkBuilder.fairsharePolicy(fairsharePolicy)
  }

  /**
   * @param name The name of the scheduling policy.
   * It can be up to 128 letters long. It can contain uppercase and lowercase letters, numbers,
   * hyphens (-), and underscores (_).
   */
  public fun name(name: String) {
    cdkBuilder.name(name)
  }

  /**
   * @param tags The tags that you apply to the scheduling policy to help you categorize and
   * organize your resources.
   * Each tag consists of a key and an optional value. For more information, see [Tagging AWS
   * Resources](https://docs.aws.amazon.com/general/latest/gr/aws_tagging.html) in *AWS General
   * Reference* .
   *
   * These tags can be updated or removed using the
   * [TagResource](https://docs.aws.amazon.com/batch/latest/APIReference/API_TagResource.html) and
   * [UntagResource](https://docs.aws.amazon.com/batch/latest/APIReference/API_UntagResource.html) API
   * operations.
   */
  public fun tags(tags: Map<String, String>) {
    cdkBuilder.tags(tags)
  }

  public fun build(): CfnSchedulingPolicyProps = cdkBuilder.build()
}
