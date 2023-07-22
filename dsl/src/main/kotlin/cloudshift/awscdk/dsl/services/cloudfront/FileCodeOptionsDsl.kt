@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.cloudfront

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.cloudfront.FileCodeOptions

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
