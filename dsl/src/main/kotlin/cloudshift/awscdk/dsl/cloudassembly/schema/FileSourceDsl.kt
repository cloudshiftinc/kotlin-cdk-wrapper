@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.cloudassembly.schema

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.cloudassembly.schema.FileAssetPackaging
import software.amazon.awscdk.cloudassembly.schema.FileSource

@CdkDslMarker
public class FileSourceDsl {
  private val cdkBuilder: FileSource.Builder = FileSource.builder()

  private val _executable: MutableList<String> = mutableListOf()

  public fun executable(vararg executable: String) {
    _executable.addAll(listOf(*executable))
  }

  public fun executable(executable: Collection<String>) {
    _executable.addAll(executable)
  }

  public fun packaging(packaging: FileAssetPackaging) {
    cdkBuilder.packaging(packaging)
  }

  public fun path(path: String) {
    cdkBuilder.path(path)
  }

  public fun build(): FileSource {
    if(_executable.isNotEmpty()) cdkBuilder.executable(_executable)
    return cdkBuilder.build()
  }
}
