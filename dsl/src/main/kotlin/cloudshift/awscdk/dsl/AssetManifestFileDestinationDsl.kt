@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.AssetManifestFileDestination
import software.amazon.awscdk.RoleOptions

/**
 * The destination for a file asset, when it is given to the AssetManifestBuilder.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.*;
 * AssetManifestFileDestination assetManifestFileDestination =
 * AssetManifestFileDestination.builder()
 * .bucketName("bucketName")
 * // the properties below are optional
 * .bucketPrefix("bucketPrefix")
 * .role(RoleOptions.builder()
 * .assumeRoleArn("assumeRoleArn")
 * // the properties below are optional
 * .assumeRoleExternalId("assumeRoleExternalId")
 * .build())
 * .build();
 * ```
 */
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
