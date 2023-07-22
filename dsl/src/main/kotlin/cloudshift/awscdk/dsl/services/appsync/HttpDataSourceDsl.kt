@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.appsync

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.appsync.AwsIamConfig
import software.amazon.awscdk.services.appsync.HttpDataSource
import software.amazon.awscdk.services.appsync.IGraphqlApi
import software.constructs.Construct

@CdkDslMarker
public class HttpDataSourceDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: HttpDataSource.Builder = HttpDataSource.Builder.create(scope, id)

  /**
   * The API to attach this data source to.
   *
   * @param api The API to attach this data source to. 
   */
  public fun api(api: IGraphqlApi) {
    cdkBuilder.api(api)
  }

  /**
   * The authorization config in case the HTTP endpoint requires authorization.
   *
   * Default: - none
   *
   * @param authorizationConfig The authorization config in case the HTTP endpoint requires
   * authorization. 
   */
  public fun authorizationConfig(authorizationConfig: AwsIamConfigDsl.() -> Unit = {}) {
    val builder = AwsIamConfigDsl()
    builder.apply(authorizationConfig)
    cdkBuilder.authorizationConfig(builder.build())
  }

  /**
   * The authorization config in case the HTTP endpoint requires authorization.
   *
   * Default: - none
   *
   * @param authorizationConfig The authorization config in case the HTTP endpoint requires
   * authorization. 
   */
  public fun authorizationConfig(authorizationConfig: AwsIamConfig) {
    cdkBuilder.authorizationConfig(authorizationConfig)
  }

  /**
   * the description of the data source.
   *
   * Default: - None
   *
   * @param description the description of the data source. 
   */
  public fun description(description: String) {
    cdkBuilder.description(description)
  }

  /**
   * The http endpoint.
   *
   * @param endpoint The http endpoint. 
   */
  public fun endpoint(endpoint: String) {
    cdkBuilder.endpoint(endpoint)
  }

  /**
   * The name of the data source.
   *
   * Default: - id of data source
   *
   * @param name The name of the data source. 
   */
  public fun name(name: String) {
    cdkBuilder.name(name)
  }

  public fun build(): HttpDataSource = cdkBuilder.build()
}
