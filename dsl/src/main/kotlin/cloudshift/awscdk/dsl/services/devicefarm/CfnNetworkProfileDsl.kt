@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.devicefarm

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.dsl.CfnTagDsl
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.services.devicefarm.CfnNetworkProfile
import software.constructs.Construct

/**
 * Creates a network profile.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.devicefarm.*;
 * CfnNetworkProfile cfnNetworkProfile = CfnNetworkProfile.Builder.create(this,
 * "MyCfnNetworkProfile")
 * .name("name")
 * .projectArn("projectArn")
 * // the properties below are optional
 * .description("description")
 * .downlinkBandwidthBits(123)
 * .downlinkDelayMs(123)
 * .downlinkJitterMs(123)
 * .downlinkLossPercent(123)
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .uplinkBandwidthBits(123)
 * .uplinkDelayMs(123)
 * .uplinkJitterMs(123)
 * .uplinkLossPercent(123)
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-devicefarm-networkprofile.html)
 */
@CdkDslMarker
public class CfnNetworkProfileDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: CfnNetworkProfile.Builder = CfnNetworkProfile.Builder.create(scope, id)

  private val _tags: MutableList<CfnTag> = mutableListOf()

  /**
   * The description of the network profile.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-devicefarm-networkprofile.html#cfn-devicefarm-networkprofile-description)
   * @param description The description of the network profile. 
   */
  public fun description(description: String) {
    cdkBuilder.description(description)
  }

  /**
   * The data throughput rate in bits per second, as an integer from 0 to 104857600.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-devicefarm-networkprofile.html#cfn-devicefarm-networkprofile-downlinkbandwidthbits)
   * @param downlinkBandwidthBits The data throughput rate in bits per second, as an integer from 0
   * to 104857600. 
   */
  public fun downlinkBandwidthBits(downlinkBandwidthBits: Number) {
    cdkBuilder.downlinkBandwidthBits(downlinkBandwidthBits)
  }

  /**
   * Delay time for all packets to destination in milliseconds as an integer from 0 to 2000.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-devicefarm-networkprofile.html#cfn-devicefarm-networkprofile-downlinkdelayms)
   * @param downlinkDelayMs Delay time for all packets to destination in milliseconds as an integer
   * from 0 to 2000. 
   */
  public fun downlinkDelayMs(downlinkDelayMs: Number) {
    cdkBuilder.downlinkDelayMs(downlinkDelayMs)
  }

  /**
   * Time variation in the delay of received packets in milliseconds as an integer from 0 to 2000.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-devicefarm-networkprofile.html#cfn-devicefarm-networkprofile-downlinkjitterms)
   * @param downlinkJitterMs Time variation in the delay of received packets in milliseconds as an
   * integer from 0 to 2000. 
   */
  public fun downlinkJitterMs(downlinkJitterMs: Number) {
    cdkBuilder.downlinkJitterMs(downlinkJitterMs)
  }

  /**
   * Proportion of received packets that fail to arrive from 0 to 100 percent.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-devicefarm-networkprofile.html#cfn-devicefarm-networkprofile-downlinklosspercent)
   * @param downlinkLossPercent Proportion of received packets that fail to arrive from 0 to 100
   * percent. 
   */
  public fun downlinkLossPercent(downlinkLossPercent: Number) {
    cdkBuilder.downlinkLossPercent(downlinkLossPercent)
  }

  /**
   * The name of the network profile.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-devicefarm-networkprofile.html#cfn-devicefarm-networkprofile-name)
   * @param name The name of the network profile. 
   */
  public fun name(name: String) {
    cdkBuilder.name(name)
  }

  /**
   * The Amazon Resource Name (ARN) of the specified project.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-devicefarm-networkprofile.html#cfn-devicefarm-networkprofile-projectarn)
   * @param projectArn The Amazon Resource Name (ARN) of the specified project. 
   */
  public fun projectArn(projectArn: String) {
    cdkBuilder.projectArn(projectArn)
  }

  /**
   * An array of key-value pairs to apply to this resource.
   *
   * For more information, see
   * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
   * in the *guide* .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-devicefarm-networkprofile.html#cfn-devicefarm-networkprofile-tags)
   * @param tags An array of key-value pairs to apply to this resource. 
   */
  public fun tags(tags: CfnTagDsl.() -> Unit) {
    _tags.add(CfnTagDsl().apply(tags).build())
  }

  /**
   * An array of key-value pairs to apply to this resource.
   *
   * For more information, see
   * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
   * in the *guide* .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-devicefarm-networkprofile.html#cfn-devicefarm-networkprofile-tags)
   * @param tags An array of key-value pairs to apply to this resource. 
   */
  public fun tags(tags: Collection<CfnTag>) {
    _tags.addAll(tags)
  }

  /**
   * The data throughput rate in bits per second, as an integer from 0 to 104857600.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-devicefarm-networkprofile.html#cfn-devicefarm-networkprofile-uplinkbandwidthbits)
   * @param uplinkBandwidthBits The data throughput rate in bits per second, as an integer from 0 to
   * 104857600. 
   */
  public fun uplinkBandwidthBits(uplinkBandwidthBits: Number) {
    cdkBuilder.uplinkBandwidthBits(uplinkBandwidthBits)
  }

  /**
   * Delay time for all packets to destination in milliseconds as an integer from 0 to 2000.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-devicefarm-networkprofile.html#cfn-devicefarm-networkprofile-uplinkdelayms)
   * @param uplinkDelayMs Delay time for all packets to destination in milliseconds as an integer
   * from 0 to 2000. 
   */
  public fun uplinkDelayMs(uplinkDelayMs: Number) {
    cdkBuilder.uplinkDelayMs(uplinkDelayMs)
  }

  /**
   * Time variation in the delay of received packets in milliseconds as an integer from 0 to 2000.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-devicefarm-networkprofile.html#cfn-devicefarm-networkprofile-uplinkjitterms)
   * @param uplinkJitterMs Time variation in the delay of received packets in milliseconds as an
   * integer from 0 to 2000. 
   */
  public fun uplinkJitterMs(uplinkJitterMs: Number) {
    cdkBuilder.uplinkJitterMs(uplinkJitterMs)
  }

  /**
   * Proportion of transmitted packets that fail to arrive from 0 to 100 percent.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-devicefarm-networkprofile.html#cfn-devicefarm-networkprofile-uplinklosspercent)
   * @param uplinkLossPercent Proportion of transmitted packets that fail to arrive from 0 to 100
   * percent. 
   */
  public fun uplinkLossPercent(uplinkLossPercent: Number) {
    cdkBuilder.uplinkLossPercent(uplinkLossPercent)
  }

  public fun build(): CfnNetworkProfile {
    if(_tags.isNotEmpty()) cdkBuilder.tags(_tags)
    return cdkBuilder.build()
  }
}
