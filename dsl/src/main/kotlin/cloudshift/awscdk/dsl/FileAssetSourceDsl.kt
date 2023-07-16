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

  public fun deployTime(deployTime: Boolean) {
    cdkBuilder.deployTime(deployTime)
  }

  public fun executable(vararg executable: String) {
    _executable.addAll(listOf(*executable))
  }

  public fun executable(executable: Collection<String>) {
    _executable.addAll(executable)
  }

  public fun fileName(fileName: String) {
    cdkBuilder.fileName(fileName)
  }

  public fun packaging(packaging: FileAssetPackaging) {
    cdkBuilder.packaging(packaging)
  }

  public fun sourceHash(sourceHash: String) {
    cdkBuilder.sourceHash(sourceHash)
  }

  public fun build(): FileAssetSource {
    if(_executable.isNotEmpty()) cdkBuilder.executable(_executable)
    return cdkBuilder.build()
  }
}
