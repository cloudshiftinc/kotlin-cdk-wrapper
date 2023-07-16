@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.appsync

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.appsync.AwsIamConfig
import software.amazon.awscdk.services.appsync.HttpDataSourceProps
import software.amazon.awscdk.services.appsync.IGraphqlApi

@CdkDslMarker
public class HttpDataSourcePropsDsl {
  private val cdkBuilder: HttpDataSourceProps.Builder = HttpDataSourceProps.builder()

  public fun api(api: IGraphqlApi) {
    cdkBuilder.api(api)
  }

  public fun authorizationConfig(block: AwsIamConfigDsl.() -> Unit = {}) {
    val builder = AwsIamConfigDsl()
    builder.apply(block)
    cdkBuilder.authorizationConfig(builder.build())
  }

  public fun authorizationConfig(authorizationConfig: AwsIamConfig) {
    cdkBuilder.authorizationConfig(authorizationConfig)
  }

  public fun description(description: String) {
    cdkBuilder.description(description)
  }

  public fun endpoint(endpoint: String) {
    cdkBuilder.endpoint(endpoint)
  }

  public fun name(name: String) {
    cdkBuilder.name(name)
  }

  public fun build(): HttpDataSourceProps = cdkBuilder.build()
}
