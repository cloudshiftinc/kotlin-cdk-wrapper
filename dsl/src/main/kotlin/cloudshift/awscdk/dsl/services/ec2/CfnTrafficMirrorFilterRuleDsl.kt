@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.ec2

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.ec2.CfnTrafficMirrorFilterRule
import software.constructs.Construct

@CdkDslMarker
public class CfnTrafficMirrorFilterRuleDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: CfnTrafficMirrorFilterRule.Builder =
      CfnTrafficMirrorFilterRule.Builder.create(scope, id)

  public fun description(description: String) {
    cdkBuilder.description(description)
  }

  public fun destinationCidrBlock(destinationCidrBlock: String) {
    cdkBuilder.destinationCidrBlock(destinationCidrBlock)
  }

  public fun destinationPortRange(destinationPortRange: IResolvable) {
    cdkBuilder.destinationPortRange(destinationPortRange)
  }

  public
      fun destinationPortRange(destinationPortRange: CfnTrafficMirrorFilterRule.TrafficMirrorPortRangeProperty) {
    cdkBuilder.destinationPortRange(destinationPortRange)
  }

  public fun protocol(protocol: Number) {
    cdkBuilder.protocol(protocol)
  }

  public fun ruleAction(ruleAction: String) {
    cdkBuilder.ruleAction(ruleAction)
  }

  public fun ruleNumber(ruleNumber: Number) {
    cdkBuilder.ruleNumber(ruleNumber)
  }

  public fun sourceCidrBlock(sourceCidrBlock: String) {
    cdkBuilder.sourceCidrBlock(sourceCidrBlock)
  }

  public fun sourcePortRange(sourcePortRange: IResolvable) {
    cdkBuilder.sourcePortRange(sourcePortRange)
  }

  public
      fun sourcePortRange(sourcePortRange: CfnTrafficMirrorFilterRule.TrafficMirrorPortRangeProperty) {
    cdkBuilder.sourcePortRange(sourcePortRange)
  }

  public fun trafficDirection(trafficDirection: String) {
    cdkBuilder.trafficDirection(trafficDirection)
  }

  public fun trafficMirrorFilterId(trafficMirrorFilterId: String) {
    cdkBuilder.trafficMirrorFilterId(trafficMirrorFilterId)
  }

  public fun build(): CfnTrafficMirrorFilterRule = cdkBuilder.build()
}
