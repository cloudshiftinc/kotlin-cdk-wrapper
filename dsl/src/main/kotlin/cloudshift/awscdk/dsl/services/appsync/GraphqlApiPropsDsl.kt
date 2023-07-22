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

/**
 * Properties for an AppSync GraphQL API.
 *
 * Example:
 *
 * ```
 * import software.amazon.awscdk.services.events.*;
 * GraphqlApi api = GraphqlApi.Builder.create(this, "EventBridgeApi")
 * .name("EventBridgeApi")
 * .schema(SchemaFile.fromAsset(join(__dirname, "appsync.eventbridge.graphql")))
 * .build();
 * EventBus bus = EventBus.Builder.create(this, "DestinationEventBus").build();
 * EventBridgeDataSource dataSource = api.addEventBridgeDataSource("NoneDS", bus);
 * dataSource.createResolver("EventResolver", BaseResolverProps.builder()
 * .typeName("Mutation")
 * .fieldName("emitEvent")
 * .requestMappingTemplate(MappingTemplate.fromFile("request.vtl"))
 * .responseMappingTemplate(MappingTemplate.fromFile("response.vtl"))
 * .build());
 * ```
 */
@CdkDslMarker
public class GraphqlApiPropsDsl {
  private val cdkBuilder: GraphqlApiProps.Builder = GraphqlApiProps.builder()

  /**
   * @param authorizationConfig Optional authorization configuration.
   */
  public fun authorizationConfig(authorizationConfig: AuthorizationConfigDsl.() -> Unit = {}) {
    val builder = AuthorizationConfigDsl()
    builder.apply(authorizationConfig)
    cdkBuilder.authorizationConfig(builder.build())
  }

  /**
   * @param authorizationConfig Optional authorization configuration.
   */
  public fun authorizationConfig(authorizationConfig: AuthorizationConfig) {
    cdkBuilder.authorizationConfig(authorizationConfig)
  }

  /**
   * @param domainName The domain name configuration for the GraphQL API.
   * The Route 53 hosted zone and CName DNS record must be configured in addition to this setting to
   * enable custom domain URL
   */
  public fun domainName(domainName: DomainOptionsDsl.() -> Unit = {}) {
    val builder = DomainOptionsDsl()
    builder.apply(domainName)
    cdkBuilder.domainName(builder.build())
  }

  /**
   * @param domainName The domain name configuration for the GraphQL API.
   * The Route 53 hosted zone and CName DNS record must be configured in addition to this setting to
   * enable custom domain URL
   */
  public fun domainName(domainName: DomainOptions) {
    cdkBuilder.domainName(domainName)
  }

  /**
   * @param logConfig Logging configuration for this api.
   */
  public fun logConfig(logConfig: LogConfigDsl.() -> Unit = {}) {
    val builder = LogConfigDsl()
    builder.apply(logConfig)
    cdkBuilder.logConfig(builder.build())
  }

  /**
   * @param logConfig Logging configuration for this api.
   */
  public fun logConfig(logConfig: LogConfig) {
    cdkBuilder.logConfig(logConfig)
  }

  /**
   * @param name the name of the GraphQL API. 
   */
  public fun name(name: String) {
    cdkBuilder.name(name)
  }

  /**
   * @param schema GraphQL schema definition. Specify how you want to define your schema. 
   * Schema.fromFile(filePath: string) allows schema definition through schema.graphql file
   */
  public fun schema(schema: ISchema) {
    cdkBuilder.schema(schema)
  }

  /**
   * @param visibility A value indicating whether the API is accessible from anywhere (GLOBAL) or
   * can only be access from a VPC (PRIVATE).
   */
  public fun visibility(visibility: Visibility) {
    cdkBuilder.visibility(visibility)
  }

  /**
   * @param xrayEnabled A flag indicating whether or not X-Ray tracing is enabled for the GraphQL
   * API.
   */
  public fun xrayEnabled(xrayEnabled: Boolean) {
    cdkBuilder.xrayEnabled(xrayEnabled)
  }

  public fun build(): GraphqlApiProps = cdkBuilder.build()
}
