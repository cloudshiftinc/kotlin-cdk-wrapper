@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.panorama

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.panorama.CfnPackageVersionProps

@CdkDslMarker
public class CfnPackageVersionPropsDsl {
  private val cdkBuilder: CfnPackageVersionProps.Builder = CfnPackageVersionProps.builder()

  /**
   * @param markLatest Whether to mark the new version as the latest version.
   */
  public fun markLatest(markLatest: Boolean) {
    cdkBuilder.markLatest(markLatest)
  }

  /**
   * @param markLatest Whether to mark the new version as the latest version.
   */
  public fun markLatest(markLatest: IResolvable) {
    cdkBuilder.markLatest(markLatest)
  }

  /**
   * @param ownerAccount An owner account.
   */
  public fun ownerAccount(ownerAccount: String) {
    cdkBuilder.ownerAccount(ownerAccount)
  }

  /**
   * @param packageId A package ID. 
   */
  public fun packageId(packageId: String) {
    cdkBuilder.packageId(packageId)
  }

  /**
   * @param packageVersion A package version. 
   */
  public fun packageVersion(packageVersion: String) {
    cdkBuilder.packageVersion(packageVersion)
  }

  /**
   * @param patchVersion A patch version. 
   */
  public fun patchVersion(patchVersion: String) {
    cdkBuilder.patchVersion(patchVersion)
  }

  /**
   * @param updatedLatestPatchVersion If the version was marked latest, the new version to maker as
   * latest.
   */
  public fun updatedLatestPatchVersion(updatedLatestPatchVersion: String) {
    cdkBuilder.updatedLatestPatchVersion(updatedLatestPatchVersion)
  }

  public fun build(): CfnPackageVersionProps = cdkBuilder.build()
}
