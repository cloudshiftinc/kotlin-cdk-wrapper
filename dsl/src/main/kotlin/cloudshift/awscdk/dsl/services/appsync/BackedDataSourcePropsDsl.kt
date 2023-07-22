@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.appsync

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.appsync.BackedDataSourceProps
import software.amazon.awscdk.services.appsync.IGraphqlApi
import software.amazon.awscdk.services.iam.IRole

/**
 * properties for an AppSync datasource backed by a resource.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.appsync.*;
 * import software.amazon.awscdk.services.iam.*;
 * GraphqlApi graphqlApi;
 * Role role;
 * BackedDataSourceProps backedDataSourceProps = BackedDataSourceProps.builder()
 * .api(graphqlApi)
 * // the properties below are optional
 * .description("description")
 * .name("name")
 * .serviceRole(role)
 * .build();
 * ```
 */
@CdkDslMarker
public class BackedDataSourcePropsDsl {
  private val cdkBuilder: BackedDataSourceProps.Builder = BackedDataSourceProps.builder()

  /**
   * @param api The API to attach this data source to. 
   */
  public fun api(api: IGraphqlApi) {
    cdkBuilder.api(api)
  }

  /**
   * @param description the description of the data source.
   */
  public fun description(description: String) {
    cdkBuilder.description(description)
  }

  /**
   * @param name The name of the data source.
   */
  public fun name(name: String) {
    cdkBuilder.name(name)
  }

  /**
   * @param serviceRole The IAM service role to be assumed by AppSync to interact with the data
   * source.
   */
  public fun serviceRole(serviceRole: IRole) {
    cdkBuilder.serviceRole(serviceRole)
  }

  public fun build(): BackedDataSourceProps = cdkBuilder.build()
}
