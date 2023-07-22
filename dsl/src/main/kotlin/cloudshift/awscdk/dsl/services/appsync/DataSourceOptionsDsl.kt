@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.appsync

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.appsync.DataSourceOptions

/**
 * Optional configuration for data sources.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.appsync.*;
 * DataSourceOptions dataSourceOptions = DataSourceOptions.builder()
 * .description("description")
 * .name("name")
 * .build();
 * ```
 */
@CdkDslMarker
public class DataSourceOptionsDsl {
  private val cdkBuilder: DataSourceOptions.Builder = DataSourceOptions.builder()

  /**
   * @param description The description of the data source.
   */
  public fun description(description: String) {
    cdkBuilder.description(description)
  }

  /**
   * @param name The name of the data source, overrides the id given by cdk.
   */
  public fun name(name: String) {
    cdkBuilder.name(name)
  }

  public fun build(): DataSourceOptions = cdkBuilder.build()
}
