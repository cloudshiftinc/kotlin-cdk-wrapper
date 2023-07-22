@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.events.targets

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.events.targets.Tag

@CdkDslMarker
public class TagDsl {
  private val cdkBuilder: Tag.Builder = Tag.builder()

  /**
   * @param key Key is the name of the tag. 
   */
  public fun key(key: String) {
    cdkBuilder.key(key)
  }

  /**
   * @param value Value is the metadata contents of the tag. 
   */
  public fun `value`(`value`: String) {
    cdkBuilder.`value`(`value`)
  }

  public fun build(): Tag = cdkBuilder.build()
}
