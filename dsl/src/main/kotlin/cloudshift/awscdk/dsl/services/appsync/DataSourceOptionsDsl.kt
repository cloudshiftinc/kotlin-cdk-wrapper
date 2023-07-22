@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.appsync

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.appsync.DataSourceOptions

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
