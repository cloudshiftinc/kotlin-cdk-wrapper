@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.ec2

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import software.amazon.awscdk.services.ec2.WindowsUserDataOptions

@CdkDslMarker
public class WindowsUserDataOptionsDsl {
  private val cdkBuilder: WindowsUserDataOptions.Builder = WindowsUserDataOptions.builder()

  /**
   * @param persist Set to true to set this userdata to persist through an instance reboot;.
   * allowing
   * it to run on every instance start.
   * By default, UserData is run only once during the first instance launch.
   *
   * For more information, see:
   * https://aws.amazon.com/premiumsupport/knowledge-center/execute-user-data-ec2/
   * https://docs.aws.amazon.com/AWSEC2/latest/WindowsGuide/ec2-windows-user-data.html#user-data-scripts
   */
  public fun persist(persist: Boolean) {
    cdkBuilder.persist(persist)
  }

  public fun build(): WindowsUserDataOptions = cdkBuilder.build()
}
