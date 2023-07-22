@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import software.amazon.awscdk.ResolveChangeContextOptions

@CdkDslMarker
public class ResolveChangeContextOptionsDsl {
  private val cdkBuilder: ResolveChangeContextOptions.Builder =
      ResolveChangeContextOptions.builder()

  /**
   * @param allowIntrinsicKeys Change the 'allowIntrinsicKeys' option.
   */
  public fun allowIntrinsicKeys(allowIntrinsicKeys: Boolean) {
    cdkBuilder.allowIntrinsicKeys(allowIntrinsicKeys)
  }

  /**
   * @param removeEmpty Whether to remove undefined elements from arrays and objects when resolving.
   */
  public fun removeEmpty(removeEmpty: Boolean) {
    cdkBuilder.removeEmpty(removeEmpty)
  }

  public fun build(): ResolveChangeContextOptions = cdkBuilder.build()
}
