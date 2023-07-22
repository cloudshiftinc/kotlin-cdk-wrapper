@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.ec2

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import software.amazon.awscdk.services.ec2.PortProps
import software.amazon.awscdk.services.ec2.Protocol

@CdkDslMarker
public class PortPropsDsl {
  private val cdkBuilder: PortProps.Builder = PortProps.builder()

  /**
   * @param fromPort The starting port for the range.
   */
  public fun fromPort(fromPort: Number) {
    cdkBuilder.fromPort(fromPort)
  }

  /**
   * @param protocol The protocol for the range. 
   */
  public fun protocol(protocol: Protocol) {
    cdkBuilder.protocol(protocol)
  }

  /**
   * @param stringRepresentation String representation for this object. 
   */
  public fun stringRepresentation(stringRepresentation: String) {
    cdkBuilder.stringRepresentation(stringRepresentation)
  }

  /**
   * @param toPort The ending port for the range.
   */
  public fun toPort(toPort: Number) {
    cdkBuilder.toPort(toPort)
  }

  public fun build(): PortProps = cdkBuilder.build()
}
