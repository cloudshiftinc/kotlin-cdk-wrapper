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
import software.amazon.awscdk.services.dlm.CfnLifecyclePolicyProps

@CdkDslMarker
public class CfnLifecyclePolicyPropsDsl {
  private val cdkBuilder: CfnLifecyclePolicyProps.Builder = CfnLifecyclePolicyProps.builder()

  private val _tags: MutableList<CfnTag> = mutableListOf()

  /**
   * @param description A description of the lifecycle policy.
   * The characters ^[0-9A-Za-z _-]+$ are supported.
   */
  public fun description(description: String) {
    cdkBuilder.description(description)
  }

  /**
   * @param executionRoleArn The Amazon Resource Name (ARN) of the IAM role used to run the
   * operations specified by the lifecycle policy.
   */
  public fun executionRoleArn(executionRoleArn: String) {
    cdkBuilder.executionRoleArn(executionRoleArn)
  }

  /**
   * @param policyDetails The configuration details of the lifecycle policy.
   */
  public fun policyDetails(policyDetails: IResolvable) {
    cdkBuilder.policyDetails(policyDetails)
  }

  /**
   * @param policyDetails The configuration details of the lifecycle policy.
   */
  public fun policyDetails(policyDetails: CfnLifecyclePolicy.PolicyDetailsProperty) {
    cdkBuilder.policyDetails(policyDetails)
  }

  /**
   * @param state The activation state of the lifecycle policy.
   */
  public fun state(state: String) {
    cdkBuilder.state(state)
  }

  /**
   * @param tags The tags to apply to the lifecycle policy during creation.
   */
  public fun tags(tags: CfnTagDsl.() -> Unit) {
    _tags.add(CfnTagDsl().apply(tags).build())
  }

  /**
   * @param tags The tags to apply to the lifecycle policy during creation.
   */
  public fun tags(tags: Collection<CfnTag>) {
    _tags.addAll(tags)
  }

  public fun build(): CfnLifecyclePolicyProps {
    if(_tags.isNotEmpty()) cdkBuilder.tags(_tags)
    return cdkBuilder.build()
  }
}
