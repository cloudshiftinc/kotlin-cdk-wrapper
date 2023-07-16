@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.appsync

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.appsync.BackedDataSourceProps
import software.amazon.awscdk.services.appsync.IGraphqlApi
import software.amazon.awscdk.services.iam.IRole

@CdkDslMarker
public class BackedDataSourcePropsDsl {
  private val cdkBuilder: BackedDataSourceProps.Builder = BackedDataSourceProps.builder()

  public fun api(api: IGraphqlApi) {
    cdkBuilder.api(api)
  }

  public fun description(description: String) {
    cdkBuilder.description(description)
  }

  public fun name(name: String) {
    cdkBuilder.name(name)
  }

  public fun serviceRole(serviceRole: IRole) {
    cdkBuilder.serviceRole(serviceRole)
  }

  public fun build(): BackedDataSourceProps = cdkBuilder.build()
}
