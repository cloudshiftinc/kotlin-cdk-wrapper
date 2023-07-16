@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.ec2

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import software.amazon.awscdk.services.ec2.ConnectionRule

@CdkDslMarker
public class ConnectionRuleDsl {
  private val cdkBuilder: ConnectionRule.Builder = ConnectionRule.builder()

  public fun description(description: String) {
    cdkBuilder.description(description)
  }

  public fun fromPort(fromPort: Number) {
    cdkBuilder.fromPort(fromPort)
  }

  public fun protocol(protocol: String) {
    cdkBuilder.protocol(protocol)
  }

  public fun toPort(toPort: Number) {
    cdkBuilder.toPort(toPort)
  }

  public fun build(): ConnectionRule = cdkBuilder.build()
}
