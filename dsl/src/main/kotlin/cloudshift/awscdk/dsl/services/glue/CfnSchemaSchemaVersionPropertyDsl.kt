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

  public fun isLatest(isLatest: Boolean) {
    cdkBuilder.isLatest(isLatest)
  }

  public fun isLatest(isLatest: IResolvable) {
    cdkBuilder.isLatest(isLatest)
  }

  public fun versionNumber(versionNumber: Number) {
    cdkBuilder.versionNumber(versionNumber)
  }

  public fun build(): CfnSchema.SchemaVersionProperty = cdkBuilder.build()
}
