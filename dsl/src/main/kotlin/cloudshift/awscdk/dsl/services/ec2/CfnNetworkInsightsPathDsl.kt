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

@CdkDslMarker
public class CfnNetworkInsightsPathDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: CfnNetworkInsightsPath.Builder =
      CfnNetworkInsightsPath.Builder.create(scope, id)

  private val _tags: MutableList<CfnTag> = mutableListOf()

  public fun destination(destination: String) {
    cdkBuilder.destination(destination)
  }

  public fun destinationIp(destinationIp: String) {
    cdkBuilder.destinationIp(destinationIp)
  }

  public fun destinationPort(destinationPort: Number) {
    cdkBuilder.destinationPort(destinationPort)
  }

  public fun filterAtDestination(filterAtDestination: IResolvable) {
    cdkBuilder.filterAtDestination(filterAtDestination)
  }

  public fun filterAtDestination(filterAtDestination: CfnNetworkInsightsPath.PathFilterProperty) {
    cdkBuilder.filterAtDestination(filterAtDestination)
  }

  public fun filterAtSource(filterAtSource: IResolvable) {
    cdkBuilder.filterAtSource(filterAtSource)
  }

  public fun filterAtSource(filterAtSource: CfnNetworkInsightsPath.PathFilterProperty) {
    cdkBuilder.filterAtSource(filterAtSource)
  }

  public fun protocol(protocol: String) {
    cdkBuilder.protocol(protocol)
  }

  public fun source(source: String) {
    cdkBuilder.source(source)
  }

  public fun sourceIp(sourceIp: String) {
    cdkBuilder.sourceIp(sourceIp)
  }

  public fun tags(tags: CfnTagDsl.() -> Unit) {
    _tags.add(CfnTagDsl().apply(tags).build())
  }

  public fun tags(tags: Collection<CfnTag>) {
    _tags.addAll(tags)
  }

  public fun build(): CfnNetworkInsightsPath {
    if(_tags.isNotEmpty()) cdkBuilder.tags(_tags)
    return cdkBuilder.build()
  }
}
