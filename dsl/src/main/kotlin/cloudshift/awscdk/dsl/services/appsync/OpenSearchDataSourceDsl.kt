@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.appsync

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.appsync.IGraphqlApi
import software.amazon.awscdk.services.appsync.OpenSearchDataSource
import software.amazon.awscdk.services.iam.IRole
import software.amazon.awscdk.services.opensearchservice.IDomain
import software.constructs.Construct

@CdkDslMarker
public class OpenSearchDataSourceDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: OpenSearchDataSource.Builder = OpenSearchDataSource.Builder.create(scope,
      id)

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

  public fun build(): OpenSearchDataSource = cdkBuilder.build()
}
