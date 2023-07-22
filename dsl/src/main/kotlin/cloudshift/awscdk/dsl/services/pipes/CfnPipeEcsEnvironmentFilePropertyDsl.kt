@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.pipes

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.pipes.CfnPipe

@CdkDslMarker
public class CfnPipeEcsEnvironmentFilePropertyDsl {
  private val cdkBuilder: CfnPipe.EcsEnvironmentFileProperty.Builder =
      CfnPipe.EcsEnvironmentFileProperty.builder()

  /**
   * @param type The file type to use. 
   * The only supported value is `s3` .
   */
  public fun type(type: String) {
    cdkBuilder.type(type)
  }

  /**
   * @param value The Amazon Resource Name (ARN) of the Amazon S3 object containing the environment
   * variable file. 
   */
  public fun `value`(`value`: String) {
    cdkBuilder.`value`(`value`)
  }

  public fun build(): CfnPipe.EcsEnvironmentFileProperty = cdkBuilder.build()
}
