@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.ec2

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import software.amazon.awscdk.services.ec2.CfnNetworkAclEntry

@CdkDslMarker
public class CfnNetworkAclEntryIcmpPropertyDsl {
  private val cdkBuilder: CfnNetworkAclEntry.IcmpProperty.Builder =
      CfnNetworkAclEntry.IcmpProperty.builder()

  public fun code(code: Number) {
    cdkBuilder.code(code)
  }

  public fun type(type: Number) {
    cdkBuilder.type(type)
  }

  public fun build(): CfnNetworkAclEntry.IcmpProperty = cdkBuilder.build()
}
