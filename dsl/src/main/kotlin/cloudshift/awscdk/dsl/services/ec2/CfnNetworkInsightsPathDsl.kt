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
import software.constructs.Construct

/**
 * Specifies a path to analyze for reachability.
 *
 * VPC Reachability Analyzer enables you to analyze and debug network reachability between two
 * resources in your virtual private cloud (VPC). For more information, see the [Reachability Analyzer
 * User Guide](https://docs.aws.amazon.com/vpc/latest/reachability/what-is-reachability-analyzer.html)
 * .
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.ec2.*;
 * CfnNetworkInsightsPath cfnNetworkInsightsPath = CfnNetworkInsightsPath.Builder.create(this,
 * "MyCfnNetworkInsightsPath")
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
public class CfnNetworkInsightsPathDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: CfnNetworkInsightsPath.Builder =
      CfnNetworkInsightsPath.Builder.create(scope, id)

  private val _tags: MutableList<CfnTag> = mutableListOf()

  /**
   * The ID or ARN of the destination.
   *
   * If the resource is in another account, you must specify an ARN.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-networkinsightspath.html#cfn-ec2-networkinsightspath-destination)
   * @param destination The ID or ARN of the destination. 
   */
  public fun destination(destination: String) {
    cdkBuilder.destination(destination)
  }

  /**
   * The IP address of the destination.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-networkinsightspath.html#cfn-ec2-networkinsightspath-destinationip)
   * @param destinationIp The IP address of the destination. 
   */
  public fun destinationIp(destinationIp: String) {
    cdkBuilder.destinationIp(destinationIp)
  }

  /**
   * The destination port.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-networkinsightspath.html#cfn-ec2-networkinsightspath-destinationport)
   * @param destinationPort The destination port. 
   */
  public fun destinationPort(destinationPort: Number) {
    cdkBuilder.destinationPort(destinationPort)
  }

  /**
   * Scopes the analysis to network paths that match specific filters at the destination.
   *
   * If you specify this parameter, you can't specify the parameter for the destination IP address.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-networkinsightspath.html#cfn-ec2-networkinsightspath-filteratdestination)
   * @param filterAtDestination Scopes the analysis to network paths that match specific filters at
   * the destination. 
   */
  public fun filterAtDestination(filterAtDestination: IResolvable) {
    cdkBuilder.filterAtDestination(filterAtDestination)
  }

  /**
   * Scopes the analysis to network paths that match specific filters at the destination.
   *
   * If you specify this parameter, you can't specify the parameter for the destination IP address.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-networkinsightspath.html#cfn-ec2-networkinsightspath-filteratdestination)
   * @param filterAtDestination Scopes the analysis to network paths that match specific filters at
   * the destination. 
   */
  public fun filterAtDestination(filterAtDestination: CfnNetworkInsightsPath.PathFilterProperty) {
    cdkBuilder.filterAtDestination(filterAtDestination)
  }

  /**
   * Scopes the analysis to network paths that match specific filters at the source.
   *
   * If you specify this parameter, you can't specify the parameters for the source IP address or
   * the destination port.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-networkinsightspath.html#cfn-ec2-networkinsightspath-filteratsource)
   * @param filterAtSource Scopes the analysis to network paths that match specific filters at the
   * source. 
   */
  public fun filterAtSource(filterAtSource: IResolvable) {
    cdkBuilder.filterAtSource(filterAtSource)
  }

  /**
   * Scopes the analysis to network paths that match specific filters at the source.
   *
   * If you specify this parameter, you can't specify the parameters for the source IP address or
   * the destination port.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-networkinsightspath.html#cfn-ec2-networkinsightspath-filteratsource)
   * @param filterAtSource Scopes the analysis to network paths that match specific filters at the
   * source. 
   */
  public fun filterAtSource(filterAtSource: CfnNetworkInsightsPath.PathFilterProperty) {
    cdkBuilder.filterAtSource(filterAtSource)
  }

  /**
   * The protocol.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-networkinsightspath.html#cfn-ec2-networkinsightspath-protocol)
   * @param protocol The protocol. 
   */
  public fun protocol(protocol: String) {
    cdkBuilder.protocol(protocol)
  }

  /**
   * The ID or ARN of the source.
   *
   * If the resource is in another account, you must specify an ARN.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-networkinsightspath.html#cfn-ec2-networkinsightspath-source)
   * @param source The ID or ARN of the source. 
   */
  public fun source(source: String) {
    cdkBuilder.source(source)
  }

  /**
   * The IP address of the source.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-networkinsightspath.html#cfn-ec2-networkinsightspath-sourceip)
   * @param sourceIp The IP address of the source. 
   */
  public fun sourceIp(sourceIp: String) {
    cdkBuilder.sourceIp(sourceIp)
  }

  /**
   * The tags to add to the path.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-networkinsightspath.html#cfn-ec2-networkinsightspath-tags)
   * @param tags The tags to add to the path. 
   */
  public fun tags(tags: CfnTagDsl.() -> Unit) {
    _tags.add(CfnTagDsl().apply(tags).build())
  }

  /**
   * The tags to add to the path.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-networkinsightspath.html#cfn-ec2-networkinsightspath-tags)
   * @param tags The tags to add to the path. 
   */
  public fun tags(tags: Collection<CfnTag>) {
    _tags.addAll(tags)
  }

  public fun build(): CfnNetworkInsightsPath {
    if(_tags.isNotEmpty()) cdkBuilder.tags(_tags)
    return cdkBuilder.build()
  }
}
