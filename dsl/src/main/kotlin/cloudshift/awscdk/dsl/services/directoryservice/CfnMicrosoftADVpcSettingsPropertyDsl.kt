@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.directoryservice

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.services.directoryservice.CfnMicrosoftAD

@CdkDslMarker
public class CfnMicrosoftADVpcSettingsPropertyDsl {
  private val cdkBuilder: CfnMicrosoftAD.VpcSettingsProperty.Builder =
      CfnMicrosoftAD.VpcSettingsProperty.builder()

  private val _subnetIds: MutableList<String> = mutableListOf()

  /**
   * @param subnetIds The identifiers of the subnets for the directory servers. 
   * The two subnets must be in different Availability Zones. AWS Directory Service specifies a
   * directory server and a DNS server in each of these subnets.
   */
  public fun subnetIds(vararg subnetIds: String) {
    _subnetIds.addAll(listOf(*subnetIds))
  }

  /**
   * @param subnetIds The identifiers of the subnets for the directory servers. 
   * The two subnets must be in different Availability Zones. AWS Directory Service specifies a
   * directory server and a DNS server in each of these subnets.
   */
  public fun subnetIds(subnetIds: Collection<String>) {
    _subnetIds.addAll(subnetIds)
  }

  /**
   * @param vpcId The identifier of the VPC in which to create the directory. 
   */
  public fun vpcId(vpcId: String) {
    cdkBuilder.vpcId(vpcId)
  }

  public fun build(): CfnMicrosoftAD.VpcSettingsProperty {
    if(_subnetIds.isNotEmpty()) cdkBuilder.subnetIds(_subnetIds)
    return cdkBuilder.build()
  }
}
