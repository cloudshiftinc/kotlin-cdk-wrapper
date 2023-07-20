@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.ec2

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import kotlin.Unit
import software.amazon.awscdk.services.ec2.AclIcmp
import software.amazon.awscdk.services.ec2.AclPortRange
import software.amazon.awscdk.services.ec2.AclTrafficConfig

@CdkDslMarker
public class AclTrafficConfigDsl {
  private val cdkBuilder: AclTrafficConfig.Builder = AclTrafficConfig.builder()

  public fun icmp(block: AclIcmpDsl.() -> Unit = {}) {
    val builder = AclIcmpDsl()
    builder.apply(block)
    cdkBuilder.icmp(builder.build())
  }

  public fun icmp(icmp: AclIcmp) {
    cdkBuilder.icmp(icmp)
  }

  public fun portRange(block: AclPortRangeDsl.() -> Unit = {}) {
    val builder = AclPortRangeDsl()
    builder.apply(block)
    cdkBuilder.portRange(builder.build())
  }

  public fun portRange(portRange: AclPortRange) {
    cdkBuilder.portRange(portRange)
  }

  public fun protocol(protocol: Number) {
    cdkBuilder.protocol(protocol)
  }

  public fun build(): AclTrafficConfig = cdkBuilder.build()
}
