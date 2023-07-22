@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.appsync

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.appsync.IGraphqlApi
import software.amazon.awscdk.services.appsync.OpenSearchDataSourceProps
import software.amazon.awscdk.services.iam.IRole
import software.amazon.awscdk.services.opensearchservice.IDomain

/**
 * Properties for the OpenSearch Data Source.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.appsync.*;
 * import software.amazon.awscdk.services.iam.*;
 * import software.amazon.awscdk.services.opensearchservice.*;
 * Domain domain;
 * GraphqlApi graphqlApi;
 * Role role;
 * OpenSearchDataSourceProps openSearchDataSourceProps = OpenSearchDataSourceProps.builder()
 * .api(graphqlApi)
 * .domain(domain)
 * // the properties below are optional
 * .description("description")
 * .name("name")
 * .serviceRole(role)
 * .build();
 * ```
 */
@CdkDslMarker
public class OpenSearchDataSourcePropsDsl {
  private val cdkBuilder: OpenSearchDataSourceProps.Builder = OpenSearchDataSourceProps.builder()

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
   * @param domain The OpenSearch domain containing the endpoint for the data source. 
   */
  public fun domain(domain: IDomain) {
    cdkBuilder.domain(domain)
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

  public fun build(): OpenSearchDataSourceProps = cdkBuilder.build()
}
