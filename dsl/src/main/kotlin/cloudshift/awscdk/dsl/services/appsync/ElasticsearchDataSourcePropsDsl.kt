@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.appsync

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Deprecated
import kotlin.String
import software.amazon.awscdk.services.appsync.ElasticsearchDataSourceProps
import software.amazon.awscdk.services.appsync.IGraphqlApi
import software.amazon.awscdk.services.elasticsearch.IDomain
import software.amazon.awscdk.services.iam.IRole

@CdkDslMarker
@Deprecated(message = "deprecated in CDK")
public class ElasticsearchDataSourcePropsDsl {
  private val cdkBuilder: ElasticsearchDataSourceProps.Builder =
      ElasticsearchDataSourceProps.builder()

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
   * @param domain The elasticsearch domain containing the endpoint for the data source. 
   */
  @Deprecated(message = "deprecated in CDK")
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

  public fun build(): ElasticsearchDataSourceProps = cdkBuilder.build()
}
