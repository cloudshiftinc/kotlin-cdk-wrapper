@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.ec2

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.ec2.GenericLinuxImageProps
import software.amazon.awscdk.services.ec2.UserData

@CdkDslMarker
public class GenericLinuxImagePropsDsl {
  private val cdkBuilder: GenericLinuxImageProps.Builder = GenericLinuxImageProps.builder()

  /**
   * @param userData Initial user data.
   */
  public fun userData(userData: UserData) {
    cdkBuilder.userData(userData)
  }

  public fun build(): GenericLinuxImageProps = cdkBuilder.build()
}
