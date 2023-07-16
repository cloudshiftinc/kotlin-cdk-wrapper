@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.ec2

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.String
import software.amazon.awscdk.services.ec2.SystemdConfigFileOptions

@CdkDslMarker
public class SystemdConfigFileOptionsDsl {
  private val cdkBuilder: SystemdConfigFileOptions.Builder = SystemdConfigFileOptions.builder()

  public fun afterNetwork(afterNetwork: Boolean) {
    cdkBuilder.afterNetwork(afterNetwork)
  }

  public fun command(command: String) {
    cdkBuilder.command(command)
  }

  public fun cwd(cwd: String) {
    cdkBuilder.cwd(cwd)
  }

  public fun description(description: String) {
    cdkBuilder.description(description)
  }

  public fun group(group: String) {
    cdkBuilder.group(group)
  }

  public fun keepRunning(keepRunning: Boolean) {
    cdkBuilder.keepRunning(keepRunning)
  }

  public fun user(user: String) {
    cdkBuilder.user(user)
  }

  public fun build(): SystemdConfigFileOptions = cdkBuilder.build()
}
