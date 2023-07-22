@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.panorama

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.panorama.CfnPackage

/**
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.panorama.*;
 * StorageLocationProperty storageLocationProperty = StorageLocationProperty.builder()
 * .binaryPrefixLocation("binaryPrefixLocation")
 * .bucket("bucket")
 * .generatedPrefixLocation("generatedPrefixLocation")
 * .manifestPrefixLocation("manifestPrefixLocation")
 * .repoPrefixLocation("repoPrefixLocation")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-panorama-package-storagelocation.html)
 */
@CdkDslMarker
public class CfnPackageStorageLocationPropertyDsl {
  private val cdkBuilder: CfnPackage.StorageLocationProperty.Builder =
      CfnPackage.StorageLocationProperty.builder()

  /**
   * @param binaryPrefixLocation the value to be set.
   */
  public fun binaryPrefixLocation(binaryPrefixLocation: String) {
    cdkBuilder.binaryPrefixLocation(binaryPrefixLocation)
  }

  /**
   * @param bucket the value to be set.
   */
  public fun bucket(bucket: String) {
    cdkBuilder.bucket(bucket)
  }

  /**
   * @param generatedPrefixLocation the value to be set.
   */
  public fun generatedPrefixLocation(generatedPrefixLocation: String) {
    cdkBuilder.generatedPrefixLocation(generatedPrefixLocation)
  }

  /**
   * @param manifestPrefixLocation the value to be set.
   */
  public fun manifestPrefixLocation(manifestPrefixLocation: String) {
    cdkBuilder.manifestPrefixLocation(manifestPrefixLocation)
  }

  /**
   * @param repoPrefixLocation the value to be set.
   */
  public fun repoPrefixLocation(repoPrefixLocation: String) {
    cdkBuilder.repoPrefixLocation(repoPrefixLocation)
  }

  public fun build(): CfnPackage.StorageLocationProperty = cdkBuilder.build()
}
