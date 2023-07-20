@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.appsync

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.appsync.AuthorizationConfig
import software.amazon.awscdk.services.appsync.DomainOptions
import software.amazon.awscdk.services.appsync.GraphqlApiProps
import software.amazon.awscdk.services.appsync.ISchema
import software.amazon.awscdk.services.appsync.LogConfig
import software.amazon.awscdk.services.appsync.Visibility

@CdkDslMarker
public class GraphqlApiPropsDsl {
  private val cdkBuilder: GraphqlApiProps.Builder = GraphqlApiProps.builder()

  public fun authorizationConfig(block: AuthorizationConfigDsl.() -> Unit = {}) {
    val builder = AuthorizationConfigDsl()
    builder.apply(block)
    cdkBuilder.authorizationConfig(builder.build())
  }

  public fun authorizationConfig(authorizationConfig: AuthorizationConfig) {
    cdkBuilder.authorizationConfig(authorizationConfig)
  }

  public fun domainName(block: DomainOptionsDsl.() -> Unit = {}) {
    val builder = DomainOptionsDsl()
    builder.apply(block)
    cdkBuilder.domainName(builder.build())
  }

  public fun domainName(domainName: DomainOptions) {
    cdkBuilder.domainName(domainName)
  }

  public fun logConfig(block: LogConfigDsl.() -> Unit = {}) {
    val builder = LogConfigDsl()
    builder.apply(block)
    cdkBuilder.logConfig(builder.build())
  }

  public fun logConfig(logConfig: LogConfig) {
    cdkBuilder.logConfig(logConfig)
  }

  public fun name(name: String) {
    cdkBuilder.name(name)
  }

  public fun schema(schema: ISchema) {
    cdkBuilder.schema(schema)
  }

  public fun visibility(visibility: Visibility) {
    cdkBuilder.visibility(visibility)
  }

  public fun xrayEnabled(xrayEnabled: Boolean) {
    cdkBuilder.xrayEnabled(xrayEnabled)
  }

  public fun build(): GraphqlApiProps = cdkBuilder.build()
}
