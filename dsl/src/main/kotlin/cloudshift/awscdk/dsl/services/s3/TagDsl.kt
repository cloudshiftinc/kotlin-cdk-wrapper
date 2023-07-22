@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.s3

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.s3.Tag

/**
 * Tag.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.s3.*;
 * Tag tag = Tag.builder()
 * .key("key")
 * .value("value")
 * .build();
 * ```
 */
@CdkDslMarker
public class TagDsl {
  private val cdkBuilder: Tag.Builder = Tag.builder()

  /**
   * @param key key to e tagged. 
   */
  public fun key(key: String) {
    cdkBuilder.key(key)
  }

  /**
   * @param value additional value. 
   */
  public fun `value`(`value`: String) {
    cdkBuilder.`value`(`value`)
  }

  public fun build(): Tag = cdkBuilder.build()
}
