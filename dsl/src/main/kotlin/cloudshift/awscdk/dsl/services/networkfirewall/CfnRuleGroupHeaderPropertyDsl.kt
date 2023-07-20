@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.networkfirewall

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.networkfirewall.CfnRuleGroup

@CdkDslMarker
public class CfnRuleGroupHeaderPropertyDsl {
  private val cdkBuilder: CfnRuleGroup.HeaderProperty.Builder =
      CfnRuleGroup.HeaderProperty.builder()

  public fun destination(destination: String) {
    cdkBuilder.destination(destination)
  }

  public fun destinationPort(destinationPort: String) {
    cdkBuilder.destinationPort(destinationPort)
  }

  public fun direction(direction: String) {
    cdkBuilder.direction(direction)
  }

  public fun protocol(protocol: String) {
    cdkBuilder.protocol(protocol)
  }

  public fun source(source: String) {
    cdkBuilder.source(source)
  }

  public fun sourcePort(sourcePort: String) {
    cdkBuilder.sourcePort(sourcePort)
  }

  public fun build(): CfnRuleGroup.HeaderProperty = cdkBuilder.build()
}
