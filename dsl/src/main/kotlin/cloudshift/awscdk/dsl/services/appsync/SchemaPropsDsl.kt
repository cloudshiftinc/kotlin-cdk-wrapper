@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.appsync

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.appsync.SchemaProps

@CdkDslMarker
public class SchemaPropsDsl {
  private val cdkBuilder: SchemaProps.Builder = SchemaProps.builder()

  /**
   * @param filePath The file path for the schema. 
   * When this option is
   * configured, then the schema will be generated from an
   * existing file from disk.
   */
  public fun filePath(filePath: String) {
    cdkBuilder.filePath(filePath)
  }

  public fun build(): SchemaProps = cdkBuilder.build()
}
