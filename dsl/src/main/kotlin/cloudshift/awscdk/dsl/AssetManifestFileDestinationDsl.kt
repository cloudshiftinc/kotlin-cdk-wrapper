@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.AssetManifestFileDestination
import software.amazon.awscdk.RoleOptions

@CdkDslMarker
public class AssetManifestFileDestinationDsl {
  private val cdkBuilder: AssetManifestFileDestination.Builder =
      AssetManifestFileDestination.builder()

  /**
   * @param bucketName Bucket name where the file asset should be written. 
   */
  public fun bucketName(bucketName: String) {
    cdkBuilder.bucketName(bucketName)
  }

  /**
   * @param bucketPrefix Prefix to prepend to the asset hash.
   */
  public fun bucketPrefix(bucketPrefix: String) {
    cdkBuilder.bucketPrefix(bucketPrefix)
  }

  /**
   * @param role Role to use for uploading.
   */
  public fun role(role: RoleOptionsDsl.() -> Unit = {}) {
    val builder = RoleOptionsDsl()
    builder.apply(role)
    cdkBuilder.role(builder.build())
  }

  /**
   * @param role Role to use for uploading.
   */
  public fun role(role: RoleOptions) {
    cdkBuilder.role(role)
  }

  public fun build(): AssetManifestFileDestination = cdkBuilder.build()
}
