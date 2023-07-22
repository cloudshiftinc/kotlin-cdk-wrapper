@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.glue

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.Number
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.glue.CfnSchema

@CdkDslMarker
public class CfnSchemaSchemaVersionPropertyDsl {
  private val cdkBuilder: CfnSchema.SchemaVersionProperty.Builder =
      CfnSchema.SchemaVersionProperty.builder()

  /**
   * @param isLatest Indicates if this version is the latest version of the schema.
   */
  public fun isLatest(isLatest: Boolean) {
    cdkBuilder.isLatest(isLatest)
  }

  /**
   * @param isLatest Indicates if this version is the latest version of the schema.
   */
  public fun isLatest(isLatest: IResolvable) {
    cdkBuilder.isLatest(isLatest)
  }

  /**
   * @param versionNumber The version number of the schema.
   */
  public fun versionNumber(versionNumber: Number) {
    cdkBuilder.versionNumber(versionNumber)
  }

  public fun build(): CfnSchema.SchemaVersionProperty = cdkBuilder.build()
}
