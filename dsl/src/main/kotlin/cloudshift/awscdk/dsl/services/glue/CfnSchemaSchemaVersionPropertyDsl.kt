@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.glue

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.Number
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.glue.CfnSchema

/**
 * Specifies the version of a schema.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.glue.*;
 * SchemaVersionProperty schemaVersionProperty = SchemaVersionProperty.builder()
 * .isLatest(false)
 * .versionNumber(123)
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-schema-schemaversion.html)
 */
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
