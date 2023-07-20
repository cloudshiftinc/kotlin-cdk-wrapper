@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.cloudassembly.schema

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.cloudassembly.schema.DeployCommand
import software.amazon.awscdk.cloudassembly.schema.DeployOptions

@CdkDslMarker
public class DeployCommandDsl {
  private val cdkBuilder: DeployCommand.Builder = DeployCommand.builder()

  public fun args(block: DeployOptionsDsl.() -> Unit = {}) {
    val builder = DeployOptionsDsl()
    builder.apply(block)
    cdkBuilder.args(builder.build())
  }

  public fun args(args: DeployOptions) {
    cdkBuilder.args(args)
  }

  public fun enabled(enabled: Boolean) {
    cdkBuilder.enabled(enabled)
  }

  public fun expectError(expectError: Boolean) {
    cdkBuilder.expectError(expectError)
  }

  public fun expectedMessage(expectedMessage: String) {
    cdkBuilder.expectedMessage(expectedMessage)
  }

  public fun build(): DeployCommand = cdkBuilder.build()
}
