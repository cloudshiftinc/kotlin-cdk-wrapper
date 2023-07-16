@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.appsync

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.appsync.CfnDataSource

@CdkDslMarker
public class CfnDataSourceHttpConfigPropertyDsl {
  private val cdkBuilder: CfnDataSource.HttpConfigProperty.Builder =
      CfnDataSource.HttpConfigProperty.builder()

  public fun authorizationConfig(authorizationConfig: IResolvable) {
    cdkBuilder.authorizationConfig(authorizationConfig)
  }

  public fun authorizationConfig(authorizationConfig: CfnDataSource.AuthorizationConfigProperty) {
    cdkBuilder.authorizationConfig(authorizationConfig)
  }

  public fun endpoint(endpoint: String) {
    cdkBuilder.endpoint(endpoint)
  }

  public fun build(): CfnDataSource.HttpConfigProperty = cdkBuilder.build()
}
