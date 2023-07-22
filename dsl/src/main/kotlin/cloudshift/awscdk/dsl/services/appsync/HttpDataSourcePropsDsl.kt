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

  /**
   * @param api The API to attach this data source to. 
   */
  public fun api(api: IGraphqlApi) {
    cdkBuilder.api(api)
  }

  /**
   * @param authorizationConfig The authorization config in case the HTTP endpoint requires
   * authorization.
   */
  public fun authorizationConfig(authorizationConfig: AwsIamConfigDsl.() -> Unit = {}) {
    val builder = AwsIamConfigDsl()
    builder.apply(authorizationConfig)
    cdkBuilder.authorizationConfig(builder.build())
  }

  /**
   * @param authorizationConfig The authorization config in case the HTTP endpoint requires
   * authorization.
   */
  public fun authorizationConfig(authorizationConfig: AwsIamConfig) {
    cdkBuilder.authorizationConfig(authorizationConfig)
  }

  /**
   * @param description the description of the data source.
   */
  public fun description(description: String) {
    cdkBuilder.description(description)
  }

  /**
   * @param endpoint The http endpoint. 
   */
  public fun endpoint(endpoint: String) {
    cdkBuilder.endpoint(endpoint)
  }

  /**
   * @param name The name of the data source.
   */
  public fun name(name: String) {
    cdkBuilder.name(name)
  }

  public fun build(): HttpDataSourceProps = cdkBuilder.build()
}
