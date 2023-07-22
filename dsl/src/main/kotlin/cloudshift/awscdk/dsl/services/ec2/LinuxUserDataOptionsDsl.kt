@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.ec2

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.ec2.LinuxUserDataOptions

/**
 * Options when constructing UserData for Linux.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.ec2.*;
 * LinuxUserDataOptions linuxUserDataOptions = LinuxUserDataOptions.builder()
 * .shebang("shebang")
 * .build();
 * ```
 */
@CdkDslMarker
public class LinuxUserDataOptionsDsl {
  private val cdkBuilder: LinuxUserDataOptions.Builder = LinuxUserDataOptions.builder()

  /**
   * @param shebang Shebang for the UserData script.
   */
  public fun shebang(shebang: String) {
    cdkBuilder.shebang(shebang)
  }

  public fun build(): LinuxUserDataOptions = cdkBuilder.build()
}
