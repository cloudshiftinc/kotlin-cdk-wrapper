@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.ec2

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.collections.Map
import software.amazon.awscdk.services.ec2.GenericWindowsImage
import software.amazon.awscdk.services.ec2.UserData

/**
 * Construct a Windows machine image from an AMI map.
 *
 * Allows you to create a generic Windows EC2 , manually specify an AMI map.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.ec2.*;
 * UserData userData;
 * GenericWindowsImage genericWindowsImage = GenericWindowsImage.Builder.create(Map.of(
 * "amiMapKey", "amiMap"))
 * .userData(userData)
 * .build();
 * ```
 */
@CdkDslMarker
public class GenericWindowsImageDsl(
  amiMap: Map<String, String>,
) {
  private val cdkBuilder: GenericWindowsImage.Builder = GenericWindowsImage.Builder.create(amiMap)

  /**
   * Initial user data.
   *
   * Default: - Empty UserData for Windows machines
   *
   * @param userData Initial user data. 
   */
  public fun userData(userData: UserData) {
    cdkBuilder.userData(userData)
  }

  public fun build(): GenericWindowsImage = cdkBuilder.build()
}
