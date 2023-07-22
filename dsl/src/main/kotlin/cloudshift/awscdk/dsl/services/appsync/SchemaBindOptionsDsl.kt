@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.appsync

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.appsync.SchemaBindOptions

/**
 * Used for configuring schema bind behavior.
 *
 * This is intended to prevent breaking changes to implementors of ISchema
 * if needing to add new behavior.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.appsync.*;
 * SchemaBindOptions schemaBindOptions = SchemaBindOptions.builder().build();
 * ```
 */
@CdkDslMarker
public class SchemaBindOptionsDsl {
  private val cdkBuilder: SchemaBindOptions.Builder = SchemaBindOptions.builder()

  public fun build(): SchemaBindOptions = cdkBuilder.build()
}
