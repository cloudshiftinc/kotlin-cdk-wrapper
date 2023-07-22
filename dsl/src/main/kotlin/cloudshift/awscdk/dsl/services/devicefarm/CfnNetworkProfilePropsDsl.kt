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
import software.amazon.awscdk.services.devicefarm.CfnNetworkProfileProps

/**
 * Properties for defining a `CfnNetworkProfile`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.devicefarm.*;
 * CfnNetworkProfileProps cfnNetworkProfileProps = CfnNetworkProfileProps.builder()
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
public class CfnNetworkProfilePropsDsl {
  private val cdkBuilder: CfnNetworkProfileProps.Builder = CfnNetworkProfileProps.builder()

  private val _tags: MutableList<CfnTag> = mutableListOf()

  /**
   * @param description The description of the network profile.
   */
  public fun description(description: String) {
    cdkBuilder.description(description)
  }

  /**
   * @param downlinkBandwidthBits The data throughput rate in bits per second, as an integer from 0
   * to 104857600.
   */
  public fun downlinkBandwidthBits(downlinkBandwidthBits: Number) {
    cdkBuilder.downlinkBandwidthBits(downlinkBandwidthBits)
  }

  /**
   * @param downlinkDelayMs Delay time for all packets to destination in milliseconds as an integer
   * from 0 to 2000.
   */
  public fun downlinkDelayMs(downlinkDelayMs: Number) {
    cdkBuilder.downlinkDelayMs(downlinkDelayMs)
  }

  /**
   * @param downlinkJitterMs Time variation in the delay of received packets in milliseconds as an
   * integer from 0 to 2000.
   */
  public fun downlinkJitterMs(downlinkJitterMs: Number) {
    cdkBuilder.downlinkJitterMs(downlinkJitterMs)
  }

  /**
   * @param downlinkLossPercent Proportion of received packets that fail to arrive from 0 to 100
   * percent.
   */
  public fun downlinkLossPercent(downlinkLossPercent: Number) {
    cdkBuilder.downlinkLossPercent(downlinkLossPercent)
  }

  /**
   * @param name The name of the network profile. 
   */
  public fun name(name: String) {
    cdkBuilder.name(name)
  }

  /**
   * @param projectArn The Amazon Resource Name (ARN) of the specified project. 
   */
  public fun projectArn(projectArn: String) {
    cdkBuilder.projectArn(projectArn)
  }

  /**
   * @param tags An array of key-value pairs to apply to this resource.
   * For more information, see
   * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
   * in the *guide* .
   */
  public fun tags(tags: CfnTagDsl.() -> Unit) {
    _tags.add(CfnTagDsl().apply(tags).build())
  }

  /**
   * @param tags An array of key-value pairs to apply to this resource.
   * For more information, see
   * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
   * in the *guide* .
   */
  public fun tags(tags: Collection<CfnTag>) {
    _tags.addAll(tags)
  }

  /**
   * @param uplinkBandwidthBits The data throughput rate in bits per second, as an integer from 0 to
   * 104857600.
   */
  public fun uplinkBandwidthBits(uplinkBandwidthBits: Number) {
    cdkBuilder.uplinkBandwidthBits(uplinkBandwidthBits)
  }

  /**
   * @param uplinkDelayMs Delay time for all packets to destination in milliseconds as an integer
   * from 0 to 2000.
   */
  public fun uplinkDelayMs(uplinkDelayMs: Number) {
    cdkBuilder.uplinkDelayMs(uplinkDelayMs)
  }

  /**
   * @param uplinkJitterMs Time variation in the delay of received packets in milliseconds as an
   * integer from 0 to 2000.
   */
  public fun uplinkJitterMs(uplinkJitterMs: Number) {
    cdkBuilder.uplinkJitterMs(uplinkJitterMs)
  }

  /**
   * @param uplinkLossPercent Proportion of transmitted packets that fail to arrive from 0 to 100
   * percent.
   */
  public fun uplinkLossPercent(uplinkLossPercent: Number) {
    cdkBuilder.uplinkLossPercent(uplinkLossPercent)
  }

  public fun build(): CfnNetworkProfileProps {
    if(_tags.isNotEmpty()) cdkBuilder.tags(_tags)
    return cdkBuilder.build()
  }
}
