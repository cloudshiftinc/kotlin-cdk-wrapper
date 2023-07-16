@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.ec2

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.ec2.UserData
import software.amazon.awscdk.services.ec2.WindowsImage
import software.amazon.awscdk.services.ec2.WindowsVersion

@CdkDslMarker
public class WindowsImageDsl(
  arg0: WindowsVersion,
) {
  private val cdkBuilder: WindowsImage.Builder = WindowsImage.Builder.create(arg0)

  public fun userData(userData: UserData) {
    cdkBuilder.userData(userData)
  }

  public fun build(): WindowsImage = cdkBuilder.build()
}
