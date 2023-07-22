@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.ec2

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.ec2.ExecuteFileOptions

@CdkDslMarker
public class ExecuteFileOptionsDsl {
  private val cdkBuilder: ExecuteFileOptions.Builder = ExecuteFileOptions.builder()

  /**
   * @param arguments The arguments to be passed to the file.
   */
  public fun arguments(arguments: String) {
    cdkBuilder.arguments(arguments)
  }

  /**
   * @param filePath The path to the file. 
   */
  public fun filePath(filePath: String) {
    cdkBuilder.filePath(filePath)
  }

  public fun build(): ExecuteFileOptions = cdkBuilder.build()
}
