@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.cloudassembly.schema

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Unit
import software.amazon.awscdk.cloudassembly.schema.CdkCommands
import software.amazon.awscdk.cloudassembly.schema.DeployCommand
import software.amazon.awscdk.cloudassembly.schema.DestroyCommand

@CdkDslMarker
public class CdkCommandsDsl {
  private val cdkBuilder: CdkCommands.Builder = CdkCommands.builder()

  /**
   * @param deploy Options to for the cdk deploy command.
   */
  public fun deploy(deploy: DeployCommandDsl.() -> Unit = {}) {
    val builder = DeployCommandDsl()
    builder.apply(deploy)
    cdkBuilder.deploy(builder.build())
  }

  /**
   * @param deploy Options to for the cdk deploy command.
   */
  public fun deploy(deploy: DeployCommand) {
    cdkBuilder.deploy(deploy)
  }

  /**
   * @param destroy Options to for the cdk destroy command.
   */
  public fun destroy(destroy: DestroyCommandDsl.() -> Unit = {}) {
    val builder = DestroyCommandDsl()
    builder.apply(destroy)
    cdkBuilder.destroy(builder.build())
  }

  /**
   * @param destroy Options to for the cdk destroy command.
   */
  public fun destroy(destroy: DestroyCommand) {
    cdkBuilder.destroy(destroy)
  }

  public fun build(): CdkCommands = cdkBuilder.build()
}
