@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.ec2

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import software.amazon.awscdk.services.ec2.AclPortRange

@CdkDslMarker
public class AclPortRangeDsl {
  private val cdkBuilder: AclPortRange.Builder = AclPortRange.builder()

  /**
   * @param from The first port in the range.
   * Required if you specify 6 (TCP) or 17 (UDP) for the protocol parameter.
   */
  public fun from(from: Number) {
    cdkBuilder.from(from)
  }

  /**
   * @param to The last port in the range.
   * Required if you specify 6 (TCP) or 17 (UDP) for the protocol parameter.
   */
  public fun to(to: Number) {
    cdkBuilder.to(to)
  }

  public fun build(): AclPortRange = cdkBuilder.build()
}
