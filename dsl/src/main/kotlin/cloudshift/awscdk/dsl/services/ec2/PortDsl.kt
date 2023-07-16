@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.ec2

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import software.amazon.awscdk.services.ec2.Port
import software.amazon.awscdk.services.ec2.Protocol

@CdkDslMarker
public class PortDsl {
  private val cdkBuilder: Port.Builder = Port.Builder.create()

  public fun fromPort(fromPort: Number) {
    cdkBuilder.fromPort(fromPort)
  }

  public fun protocol(protocol: Protocol) {
    cdkBuilder.protocol(protocol)
  }

  public fun stringRepresentation(stringRepresentation: String) {
    cdkBuilder.stringRepresentation(stringRepresentation)
  }

  public fun toPort(toPort: Number) {
    cdkBuilder.toPort(toPort)
  }

  public fun build(): Port = cdkBuilder.build()
}
