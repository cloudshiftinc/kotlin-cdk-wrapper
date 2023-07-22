@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.ec2

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.collections.Map
import software.amazon.awscdk.services.ec2.GenericLinuxImage
import software.amazon.awscdk.services.ec2.UserData

@CdkDslMarker
public class GenericLinuxImageDsl(
  amiMap: Map<String, String>,
) {
  private val cdkBuilder: GenericLinuxImage.Builder = GenericLinuxImage.Builder.create(amiMap)

  /**
   * Initial user data.
   *
   * Default: - Empty UserData for Linux machines
   *
   * @param userData Initial user data. 
   */
  public fun userData(userData: UserData) {
    cdkBuilder.userData(userData)
  }

  public fun build(): GenericLinuxImage = cdkBuilder.build()
}
