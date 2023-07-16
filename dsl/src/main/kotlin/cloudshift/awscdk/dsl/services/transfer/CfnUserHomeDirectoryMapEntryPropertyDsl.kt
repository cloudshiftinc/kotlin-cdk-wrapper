@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.transfer

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.transfer.CfnUser

@CdkDslMarker
public class CfnUserHomeDirectoryMapEntryPropertyDsl {
  private val cdkBuilder: CfnUser.HomeDirectoryMapEntryProperty.Builder =
      CfnUser.HomeDirectoryMapEntryProperty.builder()

  public fun entry(entry: String) {
    cdkBuilder.entry(entry)
  }

  public fun target(target: String) {
    cdkBuilder.target(target)
  }

  public fun build(): CfnUser.HomeDirectoryMapEntryProperty = cdkBuilder.build()
}
