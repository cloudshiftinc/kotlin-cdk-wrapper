@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import software.amazon.awscdk.UniqueResourceNameOptions

@CdkDslMarker
public class UniqueResourceNameOptionsDsl {
  private val cdkBuilder: UniqueResourceNameOptions.Builder = UniqueResourceNameOptions.builder()

  /**
   * @param allowedSpecialCharacters Non-alphanumeric characters allowed in the unique resource
   * name.
   */
  public fun allowedSpecialCharacters(allowedSpecialCharacters: String) {
    cdkBuilder.allowedSpecialCharacters(allowedSpecialCharacters)
  }

  /**
   * @param maxLength The maximum length of the unique resource name.
   */
  public fun maxLength(maxLength: Number) {
    cdkBuilder.maxLength(maxLength)
  }

  /**
   * @param separator The separator used between the path components.
   */
  public fun separator(separator: String) {
    cdkBuilder.separator(separator)
  }

  public fun build(): UniqueResourceNameOptions = cdkBuilder.build()
}
