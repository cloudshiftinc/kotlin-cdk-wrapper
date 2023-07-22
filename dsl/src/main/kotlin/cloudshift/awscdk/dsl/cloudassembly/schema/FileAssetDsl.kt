@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.cloudassembly.schema

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.Unit
import kotlin.collections.Map
import software.amazon.awscdk.cloudassembly.schema.FileAsset
import software.amazon.awscdk.cloudassembly.schema.FileDestination
import software.amazon.awscdk.cloudassembly.schema.FileSource

@CdkDslMarker
public class FileAssetDsl {
  private val cdkBuilder: FileAsset.Builder = FileAsset.builder()

  /**
   * @param destinations Destinations for this file asset. 
   */
  public fun destinations(destinations: Map<String, FileDestination>) {
    cdkBuilder.destinations(destinations)
  }

  /**
   * @param source Source description for file assets. 
   */
  public fun source(source: FileSourceDsl.() -> Unit = {}) {
    val builder = FileSourceDsl()
    builder.apply(source)
    cdkBuilder.source(builder.build())
  }

  /**
   * @param source Source description for file assets. 
   */
  public fun source(source: FileSource) {
    cdkBuilder.source(source)
  }

  public fun build(): FileAsset = cdkBuilder.build()
}
