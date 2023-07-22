@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.Unit
import software.amazon.awscdk.CfnCreationPolicy
import software.amazon.awscdk.CfnResourceAutoScalingCreationPolicy
import software.amazon.awscdk.CfnResourceSignal

@CdkDslMarker
public class CfnCreationPolicyDsl {
  private val cdkBuilder: CfnCreationPolicy.Builder = CfnCreationPolicy.builder()

  /**
   * @param autoScalingCreationPolicy For an Auto Scaling group replacement update, specifies how
   * many instances must signal success for the update to succeed.
   */
  public
      fun autoScalingCreationPolicy(autoScalingCreationPolicy: CfnResourceAutoScalingCreationPolicyDsl.() -> Unit
      = {}) {
    val builder = CfnResourceAutoScalingCreationPolicyDsl()
    builder.apply(autoScalingCreationPolicy)
    cdkBuilder.autoScalingCreationPolicy(builder.build())
  }

  /**
   * @param autoScalingCreationPolicy For an Auto Scaling group replacement update, specifies how
   * many instances must signal success for the update to succeed.
   */
  public
      fun autoScalingCreationPolicy(autoScalingCreationPolicy: CfnResourceAutoScalingCreationPolicy) {
    cdkBuilder.autoScalingCreationPolicy(autoScalingCreationPolicy)
  }

  /**
   * @param resourceSignal When AWS CloudFormation creates the associated resource, configures the
   * number of required success signals and the length of time that AWS CloudFormation waits for those
   * signals.
   */
  public fun resourceSignal(resourceSignal: CfnResourceSignalDsl.() -> Unit = {}) {
    val builder = CfnResourceSignalDsl()
    builder.apply(resourceSignal)
    cdkBuilder.resourceSignal(builder.build())
  }

  /**
   * @param resourceSignal When AWS CloudFormation creates the associated resource, configures the
   * number of required success signals and the length of time that AWS CloudFormation waits for those
   * signals.
   */
  public fun resourceSignal(resourceSignal: CfnResourceSignal) {
    cdkBuilder.resourceSignal(resourceSignal)
  }

  /**
   * @param startFleet For an AppStream Fleet creation, specifies that the fleet is started after
   * creation.
   */
  public fun startFleet(startFleet: Boolean) {
    cdkBuilder.startFleet(startFleet)
  }

  public fun build(): CfnCreationPolicy = cdkBuilder.build()
}
