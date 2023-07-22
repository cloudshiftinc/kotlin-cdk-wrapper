@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.panorama

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.panorama.CfnPackageVersionProps

/**
 * Properties for defining a `CfnPackageVersion`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.panorama.*;
 * CfnPackageVersionProps cfnPackageVersionProps = CfnPackageVersionProps.builder()
 * .packageId("packageId")
 * .packageVersion("packageVersion")
 * .patchVersion("patchVersion")
 * // the properties below are optional
 * .markLatest(false)
 * .ownerAccount("ownerAccount")
 * .updatedLatestPatchVersion("updatedLatestPatchVersion")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-panorama-packageversion.html)
 */
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
