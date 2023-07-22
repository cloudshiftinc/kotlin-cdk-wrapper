@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.appsync

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.appsync.IGraphqlApi
import software.amazon.awscdk.services.appsync.NoneDataSource
import software.constructs.Construct

/**
 * An AppSync dummy datasource.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.appsync.*;
 * GraphqlApi graphqlApi;
 * NoneDataSource noneDataSource = NoneDataSource.Builder.create(this, "MyNoneDataSource")
 * .api(graphqlApi)
 * // the properties below are optional
 * .description("description")
 * .name("name")
 * .build();
 * ```
 */
@CdkDslMarker
public class NoneDataSourceDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: NoneDataSource.Builder = NoneDataSource.Builder.create(scope, id)

  /**
   * The API to attach this data source to.
   *
   * @param api The API to attach this data source to. 
   */
  public fun api(api: IGraphqlApi) {
    cdkBuilder.api(api)
  }

  /**
   * the description of the data source.
   *
   * Default: - None
   *
   * @param description the description of the data source. 
   */
  public fun description(description: String) {
    cdkBuilder.description(description)
  }

  /**
   * The name of the data source.
   *
   * Default: - id of data source
   *
   * @param name The name of the data source. 
   */
  public fun name(name: String) {
    cdkBuilder.name(name)
  }

  public fun build(): NoneDataSource = cdkBuilder.build()
}
