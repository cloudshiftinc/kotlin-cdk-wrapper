@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.pipes

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.pipes.CfnPipe

@CdkDslMarker
public class CfnPipeBatchEnvironmentVariablePropertyDsl {
  private val cdkBuilder: CfnPipe.BatchEnvironmentVariableProperty.Builder =
      CfnPipe.BatchEnvironmentVariableProperty.builder()

  /**
   * @param name The name of the key-value pair.
   * For environment variables, this is the name of the environment variable.
   */
  public fun name(name: String) {
    cdkBuilder.name(name)
  }

  /**
   * @param value The value of the key-value pair.
   * For environment variables, this is the value of the environment variable.
   */
  public fun `value`(`value`: String) {
    cdkBuilder.`value`(`value`)
  }

  public fun build(): CfnPipe.BatchEnvironmentVariableProperty = cdkBuilder.build()
}
