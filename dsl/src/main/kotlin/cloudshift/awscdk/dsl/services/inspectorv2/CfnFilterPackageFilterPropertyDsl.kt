@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.inspectorv2

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.inspectorv2.CfnFilter

@CdkDslMarker
public class CfnFilterPackageFilterPropertyDsl {
  private val cdkBuilder: CfnFilter.PackageFilterProperty.Builder =
      CfnFilter.PackageFilterProperty.builder()

  /**
   * @param architecture An object that contains details on the package architecture type to filter
   * on.
   */
  public fun architecture(architecture: IResolvable) {
    cdkBuilder.architecture(architecture)
  }

  /**
   * @param architecture An object that contains details on the package architecture type to filter
   * on.
   */
  public fun architecture(architecture: CfnFilter.StringFilterProperty) {
    cdkBuilder.architecture(architecture)
  }

  /**
   * @param epoch An object that contains details on the package epoch to filter on.
   */
  public fun epoch(epoch: IResolvable) {
    cdkBuilder.epoch(epoch)
  }

  /**
   * @param epoch An object that contains details on the package epoch to filter on.
   */
  public fun epoch(epoch: CfnFilter.NumberFilterProperty) {
    cdkBuilder.epoch(epoch)
  }

  /**
   * @param name An object that contains details on the name of the package to filter on.
   */
  public fun name(name: IResolvable) {
    cdkBuilder.name(name)
  }

  /**
   * @param name An object that contains details on the name of the package to filter on.
   */
  public fun name(name: CfnFilter.StringFilterProperty) {
    cdkBuilder.name(name)
  }

  /**
   * @param release An object that contains details on the package release to filter on.
   */
  public fun release(release: IResolvable) {
    cdkBuilder.release(release)
  }

  /**
   * @param release An object that contains details on the package release to filter on.
   */
  public fun release(release: CfnFilter.StringFilterProperty) {
    cdkBuilder.release(release)
  }

  /**
   * @param sourceLayerHash An object that contains details on the source layer hash to filter on.
   */
  public fun sourceLayerHash(sourceLayerHash: IResolvable) {
    cdkBuilder.sourceLayerHash(sourceLayerHash)
  }

  /**
   * @param sourceLayerHash An object that contains details on the source layer hash to filter on.
   */
  public fun sourceLayerHash(sourceLayerHash: CfnFilter.StringFilterProperty) {
    cdkBuilder.sourceLayerHash(sourceLayerHash)
  }

  /**
   * @param version The package version to filter on.
   */
  public fun version(version: IResolvable) {
    cdkBuilder.version(version)
  }

  /**
   * @param version The package version to filter on.
   */
  public fun version(version: CfnFilter.StringFilterProperty) {
    cdkBuilder.version(version)
  }

  public fun build(): CfnFilter.PackageFilterProperty = cdkBuilder.build()
}
