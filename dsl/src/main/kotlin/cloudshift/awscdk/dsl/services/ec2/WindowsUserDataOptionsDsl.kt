@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.ec2

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import software.amazon.awscdk.services.ec2.WindowsUserDataOptions

@CdkDslMarker
public class WindowsUserDataOptionsDsl {
  private val cdkBuilder: WindowsUserDataOptions.Builder = WindowsUserDataOptions.builder()

  public fun persist(persist: Boolean) {
    cdkBuilder.persist(persist)
  }

  public fun build(): WindowsUserDataOptions = cdkBuilder.build()
}
