@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.cloudfront

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.cloudfront.FileCodeOptions

/**
 * Options when reading the function's code from an external file.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.cloudfront.*;
 * FileCodeOptions fileCodeOptions = FileCodeOptions.builder()
 * .filePath("filePath")
 * .build();
 * ```
 */
@CdkDslMarker
public class FileCodeOptionsDsl {
  private val cdkBuilder: FileCodeOptions.Builder = FileCodeOptions.builder()

  /**
   * @param filePath The path of the file to read the code from. 
   */
  public fun filePath(filePath: String) {
    cdkBuilder.filePath(filePath)
  }

  public fun build(): FileCodeOptions = cdkBuilder.build()
}
