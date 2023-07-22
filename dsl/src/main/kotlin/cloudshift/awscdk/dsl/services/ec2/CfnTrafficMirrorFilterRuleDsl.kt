@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.ec2

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.ec2.CfnTrafficMirrorFilterRule
import software.constructs.Construct

/**
 * Creates a Traffic Mirror filter rule.
 *
 * A Traffic Mirror rule defines the Traffic Mirror source traffic to mirror.
 *
 * You need the Traffic Mirror filter ID when you create the rule.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.ec2.*;
 * CfnTrafficMirrorFilterRule cfnTrafficMirrorFilterRule =
 * CfnTrafficMirrorFilterRule.Builder.create(this, "MyCfnTrafficMirrorFilterRule")
 * .destinationCidrBlock("destinationCidrBlock")
 * .ruleAction("ruleAction")
 * .ruleNumber(123)
 * .sourceCidrBlock("sourceCidrBlock")
 * .trafficDirection("trafficDirection")
 * .trafficMirrorFilterId("trafficMirrorFilterId")
 * // the properties below are optional
 * .description("description")
 * .destinationPortRange(TrafficMirrorPortRangeProperty.builder()
 * .fromPort(123)
 * .toPort(123)
 * .build())
 * .protocol(123)
 * .sourcePortRange(TrafficMirrorPortRangeProperty.builder()
 * .fromPort(123)
 * .toPort(123)
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-trafficmirrorfilterrule.html)
 */
@CdkDslMarker
public class CfnTrafficMirrorFilterRuleDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: CfnTrafficMirrorFilterRule.Builder =
      CfnTrafficMirrorFilterRule.Builder.create(scope, id)

  /**
   * The description of the Traffic Mirror rule.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-trafficmirrorfilterrule.html#cfn-ec2-trafficmirrorfilterrule-description)
   * @param description The description of the Traffic Mirror rule. 
   */
  public fun description(description: String) {
    cdkBuilder.description(description)
  }

  /**
   * The destination CIDR block to assign to the Traffic Mirror rule.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-trafficmirrorfilterrule.html#cfn-ec2-trafficmirrorfilterrule-destinationcidrblock)
   * @param destinationCidrBlock The destination CIDR block to assign to the Traffic Mirror rule. 
   */
  public fun destinationCidrBlock(destinationCidrBlock: String) {
    cdkBuilder.destinationCidrBlock(destinationCidrBlock)
  }

  /**
   * The destination port range.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-trafficmirrorfilterrule.html#cfn-ec2-trafficmirrorfilterrule-destinationportrange)
   * @param destinationPortRange The destination port range. 
   */
  public fun destinationPortRange(destinationPortRange: IResolvable) {
    cdkBuilder.destinationPortRange(destinationPortRange)
  }

  /**
   * The destination port range.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-trafficmirrorfilterrule.html#cfn-ec2-trafficmirrorfilterrule-destinationportrange)
   * @param destinationPortRange The destination port range. 
   */
  public
      fun destinationPortRange(destinationPortRange: CfnTrafficMirrorFilterRule.TrafficMirrorPortRangeProperty) {
    cdkBuilder.destinationPortRange(destinationPortRange)
  }

  /**
   * The protocol, for example UDP, to assign to the Traffic Mirror rule.
   *
   * For information about the protocol value, see [Protocol
   * Numbers](https://docs.aws.amazon.com/https://www.iana.org/assignments/protocol-numbers/protocol-numbers.xhtml)
   * on the Internet Assigned Numbers Authority (IANA) website.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-trafficmirrorfilterrule.html#cfn-ec2-trafficmirrorfilterrule-protocol)
   * @param protocol The protocol, for example UDP, to assign to the Traffic Mirror rule. 
   */
  public fun protocol(protocol: Number) {
    cdkBuilder.protocol(protocol)
  }

  /**
   * The action to take on the filtered traffic.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-trafficmirrorfilterrule.html#cfn-ec2-trafficmirrorfilterrule-ruleaction)
   * @param ruleAction The action to take on the filtered traffic. 
   */
  public fun ruleAction(ruleAction: String) {
    cdkBuilder.ruleAction(ruleAction)
  }

  /**
   * The number of the Traffic Mirror rule.
   *
   * This number must be unique for each Traffic Mirror rule in a given direction. The rules are
   * processed in ascending order by rule number.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-trafficmirrorfilterrule.html#cfn-ec2-trafficmirrorfilterrule-rulenumber)
   * @param ruleNumber The number of the Traffic Mirror rule. 
   */
  public fun ruleNumber(ruleNumber: Number) {
    cdkBuilder.ruleNumber(ruleNumber)
  }

  /**
   * The source CIDR block to assign to the Traffic Mirror rule.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-trafficmirrorfilterrule.html#cfn-ec2-trafficmirrorfilterrule-sourcecidrblock)
   * @param sourceCidrBlock The source CIDR block to assign to the Traffic Mirror rule. 
   */
  public fun sourceCidrBlock(sourceCidrBlock: String) {
    cdkBuilder.sourceCidrBlock(sourceCidrBlock)
  }

  /**
   * The source port range.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-trafficmirrorfilterrule.html#cfn-ec2-trafficmirrorfilterrule-sourceportrange)
   * @param sourcePortRange The source port range. 
   */
  public fun sourcePortRange(sourcePortRange: IResolvable) {
    cdkBuilder.sourcePortRange(sourcePortRange)
  }

  /**
   * The source port range.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-trafficmirrorfilterrule.html#cfn-ec2-trafficmirrorfilterrule-sourceportrange)
   * @param sourcePortRange The source port range. 
   */
  public
      fun sourcePortRange(sourcePortRange: CfnTrafficMirrorFilterRule.TrafficMirrorPortRangeProperty) {
    cdkBuilder.sourcePortRange(sourcePortRange)
  }

  /**
   * The type of traffic.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-trafficmirrorfilterrule.html#cfn-ec2-trafficmirrorfilterrule-trafficdirection)
   * @param trafficDirection The type of traffic. 
   */
  public fun trafficDirection(trafficDirection: String) {
    cdkBuilder.trafficDirection(trafficDirection)
  }

  /**
   * The ID of the filter that this rule is associated with.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-trafficmirrorfilterrule.html#cfn-ec2-trafficmirrorfilterrule-trafficmirrorfilterid)
   * @param trafficMirrorFilterId The ID of the filter that this rule is associated with. 
   */
  public fun trafficMirrorFilterId(trafficMirrorFilterId: String) {
    cdkBuilder.trafficMirrorFilterId(trafficMirrorFilterId)
  }

  public fun build(): CfnTrafficMirrorFilterRule = cdkBuilder.build()
}
