@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.ec2

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.dsl.CfnTagDsl
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.ec2.CfnNetworkInsightsPath
import software.amazon.awscdk.services.ec2.CfnNetworkInsightsPathProps

/**
 * Properties for defining a `CfnNetworkInsightsPath`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.ec2.*;
 * CfnNetworkInsightsPathProps cfnNetworkInsightsPathProps = CfnNetworkInsightsPathProps.builder()
 * .protocol("protocol")
 * .source("source")
 * // the properties below are optional
 * .destination("destination")
 * .destinationIp("destinationIp")
 * .destinationPort(123)
 * .filterAtDestination(PathFilterProperty.builder()
 * .destinationAddress("destinationAddress")
 * .destinationPortRange(FilterPortRangeProperty.builder()
 * .fromPort(123)
 * .toPort(123)
 * .build())
 * .sourceAddress("sourceAddress")
 * .sourcePortRange(FilterPortRangeProperty.builder()
 * .fromPort(123)
 * .toPort(123)
 * .build())
 * .build())
 * .filterAtSource(PathFilterProperty.builder()
 * .destinationAddress("destinationAddress")
 * .destinationPortRange(FilterPortRangeProperty.builder()
 * .fromPort(123)
 * .toPort(123)
 * .build())
 * .sourceAddress("sourceAddress")
 * .sourcePortRange(FilterPortRangeProperty.builder()
 * .fromPort(123)
 * .toPort(123)
 * .build())
 * .build())
 * .sourceIp("sourceIp")
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-networkinsightspath.html)
 */
@CdkDslMarker
public class CfnNetworkInsightsPathPropsDsl {
  private val cdkBuilder: CfnNetworkInsightsPathProps.Builder =
      CfnNetworkInsightsPathProps.builder()

  private val _tags: MutableList<CfnTag> = mutableListOf()

  /**
   * @param destination The ID or ARN of the destination.
   * If the resource is in another account, you must specify an ARN.
   */
  public fun destination(destination: String) {
    cdkBuilder.destination(destination)
  }

  /**
   * @param destinationIp The IP address of the destination.
   */
  public fun destinationIp(destinationIp: String) {
    cdkBuilder.destinationIp(destinationIp)
  }

  /**
   * @param destinationPort The destination port.
   */
  public fun destinationPort(destinationPort: Number) {
    cdkBuilder.destinationPort(destinationPort)
  }

  /**
   * @param filterAtDestination Scopes the analysis to network paths that match specific filters at
   * the destination.
   * If you specify this parameter, you can't specify the parameter for the destination IP address.
   */
  public fun filterAtDestination(filterAtDestination: IResolvable) {
    cdkBuilder.filterAtDestination(filterAtDestination)
  }

  /**
   * @param filterAtDestination Scopes the analysis to network paths that match specific filters at
   * the destination.
   * If you specify this parameter, you can't specify the parameter for the destination IP address.
   */
  public fun filterAtDestination(filterAtDestination: CfnNetworkInsightsPath.PathFilterProperty) {
    cdkBuilder.filterAtDestination(filterAtDestination)
  }

  /**
   * @param filterAtSource Scopes the analysis to network paths that match specific filters at the
   * source.
   * If you specify this parameter, you can't specify the parameters for the source IP address or
   * the destination port.
   */
  public fun filterAtSource(filterAtSource: IResolvable) {
    cdkBuilder.filterAtSource(filterAtSource)
  }

  /**
   * @param filterAtSource Scopes the analysis to network paths that match specific filters at the
   * source.
   * If you specify this parameter, you can't specify the parameters for the source IP address or
   * the destination port.
   */
  public fun filterAtSource(filterAtSource: CfnNetworkInsightsPath.PathFilterProperty) {
    cdkBuilder.filterAtSource(filterAtSource)
  }

  /**
   * @param protocol The protocol. 
   */
  public fun protocol(protocol: String) {
    cdkBuilder.protocol(protocol)
  }

  /**
   * @param source The ID or ARN of the source. 
   * If the resource is in another account, you must specify an ARN.
   */
  public fun source(source: String) {
    cdkBuilder.source(source)
  }

  /**
   * @param sourceIp The IP address of the source.
   */
  public fun sourceIp(sourceIp: String) {
    cdkBuilder.sourceIp(sourceIp)
  }

  /**
   * @param tags The tags to add to the path.
   */
  public fun tags(tags: CfnTagDsl.() -> Unit) {
    _tags.add(CfnTagDsl().apply(tags).build())
  }

  /**
   * @param tags The tags to add to the path.
   */
  public fun tags(tags: Collection<CfnTag>) {
    _tags.addAll(tags)
  }

  public fun build(): CfnNetworkInsightsPathProps {
    if(_tags.isNotEmpty()) cdkBuilder.tags(_tags)
    return cdkBuilder.build()
  }
}
