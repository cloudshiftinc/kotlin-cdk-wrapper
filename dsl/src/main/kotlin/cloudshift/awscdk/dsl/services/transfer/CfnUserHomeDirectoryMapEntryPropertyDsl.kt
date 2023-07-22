@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.transfer

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.transfer.CfnUser

@CdkDslMarker
public class CfnUserHomeDirectoryMapEntryPropertyDsl {
  private val cdkBuilder: CfnUser.HomeDirectoryMapEntryProperty.Builder =
      CfnUser.HomeDirectoryMapEntryProperty.builder()

  /**
   * @param entry Represents an entry for `HomeDirectoryMappings` . 
   */
  public fun entry(entry: String) {
    cdkBuilder.entry(entry)
  }

  /**
   * @param target Represents the map target that is used in a `HomeDirectorymapEntry` . 
   */
  public fun target(target: String) {
    cdkBuilder.target(target)
  }

  public fun build(): CfnUser.HomeDirectoryMapEntryProperty = cdkBuilder.build()
}
