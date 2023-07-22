@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.panorama

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.panorama.CfnPackageVersion
import software.constructs.Construct

/**
 * Registers a package version.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.panorama.*;
 * CfnPackageVersion cfnPackageVersion = CfnPackageVersion.Builder.create(this,
 * "MyCfnPackageVersion")
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
public class CfnPackageVersionDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: CfnPackageVersion.Builder = CfnPackageVersion.Builder.create(scope, id)

  /**
   * Whether to mark the new version as the latest version.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-panorama-packageversion.html#cfn-panorama-packageversion-marklatest)
   * @param markLatest Whether to mark the new version as the latest version. 
   */
  public fun markLatest(markLatest: Boolean) {
    cdkBuilder.markLatest(markLatest)
  }

  /**
   * Whether to mark the new version as the latest version.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-panorama-packageversion.html#cfn-panorama-packageversion-marklatest)
   * @param markLatest Whether to mark the new version as the latest version. 
   */
  public fun markLatest(markLatest: IResolvable) {
    cdkBuilder.markLatest(markLatest)
  }

  /**
   * An owner account.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-panorama-packageversion.html#cfn-panorama-packageversion-owneraccount)
   * @param ownerAccount An owner account. 
   */
  public fun ownerAccount(ownerAccount: String) {
    cdkBuilder.ownerAccount(ownerAccount)
  }

  /**
   * A package ID.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-panorama-packageversion.html#cfn-panorama-packageversion-packageid)
   * @param packageId A package ID. 
   */
  public fun packageId(packageId: String) {
    cdkBuilder.packageId(packageId)
  }

  /**
   * A package version.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-panorama-packageversion.html#cfn-panorama-packageversion-packageversion)
   * @param packageVersion A package version. 
   */
  public fun packageVersion(packageVersion: String) {
    cdkBuilder.packageVersion(packageVersion)
  }

  /**
   * A patch version.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-panorama-packageversion.html#cfn-panorama-packageversion-patchversion)
   * @param patchVersion A patch version. 
   */
  public fun patchVersion(patchVersion: String) {
    cdkBuilder.patchVersion(patchVersion)
  }

  /**
   * If the version was marked latest, the new version to maker as latest.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-panorama-packageversion.html#cfn-panorama-packageversion-updatedlatestpatchversion)
   * @param updatedLatestPatchVersion If the version was marked latest, the new version to maker as
   * latest. 
   */
  public fun updatedLatestPatchVersion(updatedLatestPatchVersion: String) {
    cdkBuilder.updatedLatestPatchVersion(updatedLatestPatchVersion)
  }

  public fun build(): CfnPackageVersion = cdkBuilder.build()
}
