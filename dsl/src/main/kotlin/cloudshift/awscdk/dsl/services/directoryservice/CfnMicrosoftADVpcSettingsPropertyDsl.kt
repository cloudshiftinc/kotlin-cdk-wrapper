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

  public fun subnetIds(vararg subnetIds: String) {
    _subnetIds.addAll(listOf(*subnetIds))
  }

  public fun subnetIds(subnetIds: Collection<String>) {
    _subnetIds.addAll(subnetIds)
  }

  public fun vpcId(vpcId: String) {
    cdkBuilder.vpcId(vpcId)
  }

  public fun build(): CfnMicrosoftAD.VpcSettingsProperty {
    if(_subnetIds.isNotEmpty()) cdkBuilder.subnetIds(_subnetIds)
    return cdkBuilder.build()
  }
}
