@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.dynamodb

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import software.amazon.awscdk.Duration
import software.amazon.awscdk.services.dynamodb.UtilizationScalingProps

/**
 * Properties for enabling DynamoDB utilization tracking.
 *
 * Example:
 *
 * ```
 * Table globalTable = Table.Builder.create(this, "Table")
 * .partitionKey(Attribute.builder().name("id").type(AttributeType.STRING).build())
 * .replicationRegions(List.of("us-east-1", "us-east-2", "us-west-2"))
 * .billingMode(BillingMode.PROVISIONED)
 * .build();
 * globalTable.autoScaleWriteCapacity(EnableScalingProps.builder()
 * .minCapacity(1)
 * .maxCapacity(10)
 * .build()).scaleOnUtilization(UtilizationScalingProps.builder().targetUtilizationPercent(75).build());
 * ```
 */
@CdkDslMarker
public class UtilizationScalingPropsDsl {
  private val cdkBuilder: UtilizationScalingProps.Builder = UtilizationScalingProps.builder()

  /**
   * @param disableScaleIn Indicates whether scale in by the target tracking policy is disabled.
   * If the value is true, scale in is disabled and the target tracking policy
   * won't remove capacity from the scalable resource. Otherwise, scale in is
   * enabled and the target tracking policy can remove capacity from the
   * scalable resource.
   */
  public fun disableScaleIn(disableScaleIn: Boolean) {
    cdkBuilder.disableScaleIn(disableScaleIn)
  }

  /**
   * @param policyName A name for the scaling policy.
   */
  public fun policyName(policyName: String) {
    cdkBuilder.policyName(policyName)
  }

  /**
   * @param scaleInCooldown Period after a scale in activity completes before another scale in
   * activity can start.
   */
  public fun scaleInCooldown(scaleInCooldown: Duration) {
    cdkBuilder.scaleInCooldown(scaleInCooldown)
  }

  /**
   * @param scaleOutCooldown Period after a scale out activity completes before another scale out
   * activity can start.
   */
  public fun scaleOutCooldown(scaleOutCooldown: Duration) {
    cdkBuilder.scaleOutCooldown(scaleOutCooldown)
  }

  /**
   * @param targetUtilizationPercent Target utilization percentage for the attribute. 
   */
  public fun targetUtilizationPercent(targetUtilizationPercent: Number) {
    cdkBuilder.targetUtilizationPercent(targetUtilizationPercent)
  }

  public fun build(): UtilizationScalingProps = cdkBuilder.build()
}
