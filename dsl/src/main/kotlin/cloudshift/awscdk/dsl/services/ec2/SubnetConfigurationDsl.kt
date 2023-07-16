@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.ec2

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import software.amazon.awscdk.services.ec2.SubnetConfiguration
import software.amazon.awscdk.services.ec2.SubnetType

@CdkDslMarker
public class SubnetConfigurationDsl {
  private val cdkBuilder: SubnetConfiguration.Builder = SubnetConfiguration.builder()

  public fun cidrMask(cidrMask: Number) {
    cdkBuilder.cidrMask(cidrMask)
  }

  public fun mapPublicIpOnLaunch(mapPublicIpOnLaunch: Boolean) {
    cdkBuilder.mapPublicIpOnLaunch(mapPublicIpOnLaunch)
  }

  public fun name(name: String) {
    cdkBuilder.name(name)
  }

  public fun reserved(reserved: Boolean) {
    cdkBuilder.reserved(reserved)
  }

  public fun subnetType(subnetType: SubnetType) {
    cdkBuilder.subnetType(subnetType)
  }

  public fun build(): SubnetConfiguration = cdkBuilder.build()
}
