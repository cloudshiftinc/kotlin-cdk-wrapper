@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.appsync

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.appsync.AwsIamConfig
import software.amazon.awscdk.services.appsync.HttpDataSourceOptions

@CdkDslMarker
public class HttpDataSourceOptionsDsl {
  private val cdkBuilder: HttpDataSourceOptions.Builder = HttpDataSourceOptions.builder()

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
   * @param description The description of the data source.
   */
  public fun description(description: String) {
    cdkBuilder.description(description)
  }

  /**
   * @param name The name of the data source, overrides the id given by cdk.
   */
  public fun name(name: String) {
    cdkBuilder.name(name)
  }

  public fun build(): HttpDataSourceOptions = cdkBuilder.build()
}
