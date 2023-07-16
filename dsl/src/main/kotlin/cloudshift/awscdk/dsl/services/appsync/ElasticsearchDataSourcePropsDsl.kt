@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.appsync

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.appsync.ElasticsearchDataSourceProps
import software.amazon.awscdk.services.appsync.IGraphqlApi
import software.amazon.awscdk.services.elasticsearch.IDomain
import software.amazon.awscdk.services.iam.IRole

@CdkDslMarker
public class ElasticsearchDataSourcePropsDsl {
  private val cdkBuilder: ElasticsearchDataSourceProps.Builder =
      ElasticsearchDataSourceProps.builder()

  public fun api(api: IGraphqlApi) {
    cdkBuilder.api(api)
  }

  public fun description(description: String) {
    cdkBuilder.description(description)
  }

  public fun domain(domain: IDomain) {
    cdkBuilder.domain(domain)
  }

  public fun name(name: String) {
    cdkBuilder.name(name)
  }

  public fun serviceRole(serviceRole: IRole) {
    cdkBuilder.serviceRole(serviceRole)
  }

  public fun build(): ElasticsearchDataSourceProps = cdkBuilder.build()
}
