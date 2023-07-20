@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.ec2

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.ec2.CfnPrefixList

@CdkDslMarker
public class CfnPrefixListEntryPropertyDsl {
  private val cdkBuilder: CfnPrefixList.EntryProperty.Builder =
      CfnPrefixList.EntryProperty.builder()

  public fun cidr(cidr: String) {
    cdkBuilder.cidr(cidr)
  }

  public fun description(description: String) {
    cdkBuilder.description(description)
  }

  public fun build(): CfnPrefixList.EntryProperty = cdkBuilder.build()
}
