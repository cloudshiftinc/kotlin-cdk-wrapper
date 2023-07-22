@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.ec2

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.ec2.UserData
import software.amazon.awscdk.services.ec2.WindowsImage
import software.amazon.awscdk.services.ec2.WindowsVersion

/**
 * Select the latest version of the indicated Windows version.
 *
 * This Machine Image automatically updates to the latest version on every
 * deployment. Be aware this will cause your instances to be replaced when a
 * new version of the image becomes available. Do not store stateful information
 * on the instance if you are using this image.
 *
 * The AMI ID is selected using the values published to the SSM parameter store.
 *
 * https://aws.amazon.com/blogs/mt/query-for-the-latest-windows-ami-using-systems-manager-parameter-store/
 *
 * Example:
 *
 * ```
 * // Pick a Windows edition to use
 * WindowsImage windows = new WindowsImage(WindowsVersion.WINDOWS_SERVER_2019_ENGLISH_FULL_BASE);
 * // Pick the right Amazon Linux edition. All arguments shown are optional
 * // and will default to these values when omitted.
 * AmazonLinuxImage amznLinux = AmazonLinuxImage.Builder.create()
 * .generation(AmazonLinuxGeneration.AMAZON_LINUX)
 * .edition(AmazonLinuxEdition.STANDARD)
 * .virtualization(AmazonLinuxVirt.HVM)
 * .storage(AmazonLinuxStorage.GENERAL_PURPOSE)
 * .build();
 * // For other custom (Linux) images, instantiate a `GenericLinuxImage` with
 * // a map giving the AMI to in for each region:
 * GenericLinuxImage linux = new GenericLinuxImage(Map.of(
 * "us-east-1", "ami-97785bed",
 * "eu-west-1", "ami-12345678"));
 * ```
 */
@CdkDslMarker
public class WindowsImageDsl(
  version: WindowsVersion,
) {
  private val cdkBuilder: WindowsImage.Builder = WindowsImage.Builder.create(version)

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

  public fun build(): WindowsImage = cdkBuilder.build()
}
