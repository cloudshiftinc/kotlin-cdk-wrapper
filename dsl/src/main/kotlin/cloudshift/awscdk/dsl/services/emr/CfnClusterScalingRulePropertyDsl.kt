@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.emr

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.emr.CfnCluster

@CdkDslMarker
public class CfnClusterScalingRulePropertyDsl {
  private val cdkBuilder: CfnCluster.ScalingRuleProperty.Builder =
      CfnCluster.ScalingRuleProperty.builder()

  /**
   * @param action The conditions that trigger an automatic scaling activity. 
   */
  public fun action(action: IResolvable) {
    cdkBuilder.action(action)
  }

  /**
   * @param action The conditions that trigger an automatic scaling activity. 
   */
  public fun action(action: CfnCluster.ScalingActionProperty) {
    cdkBuilder.action(action)
  }

  /**
   * @param description A friendly, more verbose description of the automatic scaling rule.
   */
  public fun description(description: String) {
    cdkBuilder.description(description)
  }

  /**
   * @param name The name used to identify an automatic scaling rule. 
   * Rule names must be unique within a scaling policy.
   */
  public fun name(name: String) {
    cdkBuilder.name(name)
  }

  /**
   * @param trigger The CloudWatch alarm definition that determines when automatic scaling activity
   * is triggered. 
   */
  public fun trigger(trigger: IResolvable) {
    cdkBuilder.trigger(trigger)
  }

  /**
   * @param trigger The CloudWatch alarm definition that determines when automatic scaling activity
   * is triggered. 
   */
  public fun trigger(trigger: CfnCluster.ScalingTriggerProperty) {
    cdkBuilder.trigger(trigger)
  }

  public fun build(): CfnCluster.ScalingRuleProperty = cdkBuilder.build()
}
