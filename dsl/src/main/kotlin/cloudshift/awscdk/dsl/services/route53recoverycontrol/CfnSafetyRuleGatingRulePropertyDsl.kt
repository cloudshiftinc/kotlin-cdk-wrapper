@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.route53recoverycontrol

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.services.route53recoverycontrol.CfnSafetyRule

@CdkDslMarker
public class CfnSafetyRuleGatingRulePropertyDsl {
  private val cdkBuilder: CfnSafetyRule.GatingRuleProperty.Builder =
      CfnSafetyRule.GatingRuleProperty.builder()

  private val _gatingControls: MutableList<String> = mutableListOf()

  private val _targetControls: MutableList<String> = mutableListOf()

  public fun gatingControls(vararg gatingControls: String) {
    _gatingControls.addAll(listOf(*gatingControls))
  }

  public fun gatingControls(gatingControls: Collection<String>) {
    _gatingControls.addAll(gatingControls)
  }

  public fun targetControls(vararg targetControls: String) {
    _targetControls.addAll(listOf(*targetControls))
  }

  public fun targetControls(targetControls: Collection<String>) {
    _targetControls.addAll(targetControls)
  }

  public fun waitPeriodMs(waitPeriodMs: Number) {
    cdkBuilder.waitPeriodMs(waitPeriodMs)
  }

  public fun build(): CfnSafetyRule.GatingRuleProperty {
    if(_gatingControls.isNotEmpty()) cdkBuilder.gatingControls(_gatingControls)
    if(_targetControls.isNotEmpty()) cdkBuilder.targetControls(_targetControls)
    return cdkBuilder.build()
  }
}
