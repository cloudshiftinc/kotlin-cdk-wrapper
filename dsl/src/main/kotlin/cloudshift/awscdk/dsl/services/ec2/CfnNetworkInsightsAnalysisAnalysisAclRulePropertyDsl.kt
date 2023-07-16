@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.ec2

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.ec2.CfnNetworkInsightsAnalysis

@CdkDslMarker
public class CfnNetworkInsightsAnalysisAnalysisAclRulePropertyDsl {
  private val cdkBuilder: CfnNetworkInsightsAnalysis.AnalysisAclRuleProperty.Builder =
      CfnNetworkInsightsAnalysis.AnalysisAclRuleProperty.builder()

  public fun cidr(cidr: String) {
    cdkBuilder.cidr(cidr)
  }

  public fun egress(egress: Boolean) {
    cdkBuilder.egress(egress)
  }

  public fun egress(egress: IResolvable) {
    cdkBuilder.egress(egress)
  }

  public fun portRange(portRange: IResolvable) {
    cdkBuilder.portRange(portRange)
  }

  public fun portRange(portRange: CfnNetworkInsightsAnalysis.PortRangeProperty) {
    cdkBuilder.portRange(portRange)
  }

  public fun protocol(protocol: String) {
    cdkBuilder.protocol(protocol)
  }

  public fun ruleAction(ruleAction: String) {
    cdkBuilder.ruleAction(ruleAction)
  }

  public fun ruleNumber(ruleNumber: Number) {
    cdkBuilder.ruleNumber(ruleNumber)
  }

  public fun build(): CfnNetworkInsightsAnalysis.AnalysisAclRuleProperty = cdkBuilder.build()
}
