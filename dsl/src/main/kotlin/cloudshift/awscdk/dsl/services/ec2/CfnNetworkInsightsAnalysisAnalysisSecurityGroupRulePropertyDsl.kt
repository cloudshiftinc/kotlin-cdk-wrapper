@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.ec2

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.ec2.CfnNetworkInsightsAnalysis

@CdkDslMarker
public class CfnNetworkInsightsAnalysisAnalysisSecurityGroupRulePropertyDsl {
  private val cdkBuilder: CfnNetworkInsightsAnalysis.AnalysisSecurityGroupRuleProperty.Builder =
      CfnNetworkInsightsAnalysis.AnalysisSecurityGroupRuleProperty.builder()

  public fun cidr(cidr: String) {
    cdkBuilder.cidr(cidr)
  }

  public fun direction(direction: String) {
    cdkBuilder.direction(direction)
  }

  public fun portRange(portRange: IResolvable) {
    cdkBuilder.portRange(portRange)
  }

  public fun portRange(portRange: CfnNetworkInsightsAnalysis.PortRangeProperty) {
    cdkBuilder.portRange(portRange)
  }

  public fun prefixListId(prefixListId: String) {
    cdkBuilder.prefixListId(prefixListId)
  }

  public fun protocol(protocol: String) {
    cdkBuilder.protocol(protocol)
  }

  public fun securityGroupId(securityGroupId: String) {
    cdkBuilder.securityGroupId(securityGroupId)
  }

  public fun build(): CfnNetworkInsightsAnalysis.AnalysisSecurityGroupRuleProperty =
      cdkBuilder.build()
}
