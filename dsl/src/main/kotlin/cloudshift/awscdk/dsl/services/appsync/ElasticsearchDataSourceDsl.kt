@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.appsync

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Deprecated
import kotlin.String
import software.amazon.awscdk.services.appsync.ElasticsearchDataSource
import software.amazon.awscdk.services.appsync.IGraphqlApi
import software.amazon.awscdk.services.elasticsearch.IDomain
import software.amazon.awscdk.services.iam.IRole
import software.constructs.Construct

@CdkDslMarker
@Deprecated(message = "deprecated in CDK")
public class ElasticsearchDataSourceDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: ElasticsearchDataSource.Builder =
      ElasticsearchDataSource.Builder.create(scope, id)

  public fun api(api: IGraphqlApi) {
    cdkBuilder.api(api)
  }

  public fun description(description: String) {
    cdkBuilder.description(description)
  }

  @Deprecated(message = "deprecated in CDK")
  public fun domain(domain: IDomain) {
    cdkBuilder.domain(domain)
  }

  public fun name(name: String) {
    cdkBuilder.name(name)
  }

  public fun serviceRole(serviceRole: IRole) {
    cdkBuilder.serviceRole(serviceRole)
  }

  public fun build(): ElasticsearchDataSource = cdkBuilder.build()
}
