@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.pipelines

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.pipelines.FileSet
import software.amazon.awscdk.pipelines.FileSetLocation

@CdkDslMarker
public class FileSetLocationDsl {
  private val cdkBuilder: FileSetLocation.Builder = FileSetLocation.builder()

  public fun directory(directory: String) {
    cdkBuilder.directory(directory)
  }

  public fun fileSet(fileSet: FileSet) {
    cdkBuilder.fileSet(fileSet)
  }

  public fun build(): FileSetLocation = cdkBuilder.build()
}
