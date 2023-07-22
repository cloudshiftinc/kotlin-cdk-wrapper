@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.panorama

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.panorama.CfnPackage

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
