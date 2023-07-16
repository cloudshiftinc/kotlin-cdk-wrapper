@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.eventschemas

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.eventschemas.CfnDiscoverer

@CdkDslMarker
public class CfnDiscovererTagsEntryPropertyDsl {
  private val cdkBuilder: CfnDiscoverer.TagsEntryProperty.Builder =
      CfnDiscoverer.TagsEntryProperty.builder()

  public fun key(key: String) {
    cdkBuilder.key(key)
  }

  public fun `value`(`value`: String) {
    cdkBuilder.`value`(`value`)
  }

  public fun build(): CfnDiscoverer.TagsEntryProperty = cdkBuilder.build()
}
