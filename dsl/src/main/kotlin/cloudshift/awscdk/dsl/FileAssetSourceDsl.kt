@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.FileAssetPackaging
import software.amazon.awscdk.FileAssetSource

@CdkDslMarker
public class FileAssetSourceDsl {
  private val cdkBuilder: FileAssetSource.Builder = FileAssetSource.builder()

  private val _executable: MutableList<String> = mutableListOf()

  /**
   * @param deployTime Whether or not the asset needs to exist beyond deployment time;.
   * i.e.
   * are copied over to a different location and not needed afterwards.
   * Setting this property to true has an impact on the lifecycle of the asset,
   * because we will assume that it is safe to delete after the CloudFormation
   * deployment succeeds.
   *
   * For example, Lambda Function assets are copied over to Lambda during
   * deployment. Therefore, it is not necessary to store the asset in S3, so
   * we consider those deployTime assets.
   */
  public fun deployTime(deployTime: Boolean) {
    cdkBuilder.deployTime(deployTime)
  }

  /**
   * @param executable An external command that will produce the packaged asset.
   * The command should produce the location of a ZIP file on `stdout`.
   */
  public fun executable(vararg executable: String) {
    _executable.addAll(listOf(*executable))
  }

  /**
   * @param executable An external command that will produce the packaged asset.
   * The command should produce the location of a ZIP file on `stdout`.
   */
  public fun executable(executable: Collection<String>) {
    _executable.addAll(executable)
  }

  /**
   * @param fileName The path, relative to the root of the cloud assembly, in which this asset
   * source resides.
   * This can be a path to a file or a directory, depending on the
   * packaging type.
   */
  public fun fileName(fileName: String) {
    cdkBuilder.fileName(fileName)
  }

  /**
   * @param packaging Which type of packaging to perform.
   */
  public fun packaging(packaging: FileAssetPackaging) {
    cdkBuilder.packaging(packaging)
  }

  /**
   * @param sourceHash A hash on the content source. 
   * This hash is used to uniquely identify this
   * asset throughout the system. If this value doesn't change, the asset will
   * not be rebuilt or republished.
   */
  public fun sourceHash(sourceHash: String) {
    cdkBuilder.sourceHash(sourceHash)
  }

  public fun build(): FileAssetSource {
    if(_executable.isNotEmpty()) cdkBuilder.executable(_executable)
    return cdkBuilder.build()
  }
}
