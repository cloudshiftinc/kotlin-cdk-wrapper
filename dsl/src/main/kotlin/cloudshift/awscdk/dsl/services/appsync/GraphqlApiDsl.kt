@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.appsync

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.appsync.AuthorizationConfig
import software.amazon.awscdk.services.appsync.DomainOptions
import software.amazon.awscdk.services.appsync.GraphqlApi
import software.amazon.awscdk.services.appsync.ISchema
import software.amazon.awscdk.services.appsync.LogConfig
import software.amazon.awscdk.services.appsync.Visibility
import software.constructs.Construct

/**
 * An AppSync GraphQL API.
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
public class GraphqlApiDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: GraphqlApi.Builder = GraphqlApi.Builder.create(scope, id)

  /**
   * Optional authorization configuration.
   *
   * Default: - API Key authorization
   *
   * @param authorizationConfig Optional authorization configuration. 
   */
  public fun authorizationConfig(authorizationConfig: AuthorizationConfigDsl.() -> Unit = {}) {
    val builder = AuthorizationConfigDsl()
    builder.apply(authorizationConfig)
    cdkBuilder.authorizationConfig(builder.build())
  }

  /**
   * Optional authorization configuration.
   *
   * Default: - API Key authorization
   *
   * @param authorizationConfig Optional authorization configuration. 
   */
  public fun authorizationConfig(authorizationConfig: AuthorizationConfig) {
    cdkBuilder.authorizationConfig(authorizationConfig)
  }

  /**
   * The domain name configuration for the GraphQL API.
   *
   * The Route 53 hosted zone and CName DNS record must be configured in addition to this setting to
   * enable custom domain URL
   *
   * Default: - no domain name
   *
   * @param domainName The domain name configuration for the GraphQL API. 
   */
  public fun domainName(domainName: DomainOptionsDsl.() -> Unit = {}) {
    val builder = DomainOptionsDsl()
    builder.apply(domainName)
    cdkBuilder.domainName(builder.build())
  }

  /**
   * The domain name configuration for the GraphQL API.
   *
   * The Route 53 hosted zone and CName DNS record must be configured in addition to this setting to
   * enable custom domain URL
   *
   * Default: - no domain name
   *
   * @param domainName The domain name configuration for the GraphQL API. 
   */
  public fun domainName(domainName: DomainOptions) {
    cdkBuilder.domainName(domainName)
  }

  /**
   * Logging configuration for this api.
   *
   * Default: - None
   *
   * @param logConfig Logging configuration for this api. 
   */
  public fun logConfig(logConfig: LogConfigDsl.() -> Unit = {}) {
    val builder = LogConfigDsl()
    builder.apply(logConfig)
    cdkBuilder.logConfig(builder.build())
  }

  /**
   * Logging configuration for this api.
   *
   * Default: - None
   *
   * @param logConfig Logging configuration for this api. 
   */
  public fun logConfig(logConfig: LogConfig) {
    cdkBuilder.logConfig(logConfig)
  }

  /**
   * the name of the GraphQL API.
   *
   * @param name the name of the GraphQL API. 
   */
  public fun name(name: String) {
    cdkBuilder.name(name)
  }

  /**
   * GraphQL schema definition. Specify how you want to define your schema.
   *
   * Schema.fromFile(filePath: string) allows schema definition through schema.graphql file
   *
   * Default: - schema will be generated code-first (i.e. addType, addObjectType, etc.)
   *
   * @param schema GraphQL schema definition. Specify how you want to define your schema. 
   */
  public fun schema(schema: ISchema) {
    cdkBuilder.schema(schema)
  }

  /**
   * A value indicating whether the API is accessible from anywhere (GLOBAL) or can only be access
   * from a VPC (PRIVATE).
   *
   * Default: - GLOBAL
   *
   * @param visibility A value indicating whether the API is accessible from anywhere (GLOBAL) or
   * can only be access from a VPC (PRIVATE). 
   */
  public fun visibility(visibility: Visibility) {
    cdkBuilder.visibility(visibility)
  }

  /**
   * A flag indicating whether or not X-Ray tracing is enabled for the GraphQL API.
   *
   * Default: - false
   *
   * @param xrayEnabled A flag indicating whether or not X-Ray tracing is enabled for the GraphQL
   * API. 
   */
  public fun xrayEnabled(xrayEnabled: Boolean) {
    cdkBuilder.xrayEnabled(xrayEnabled)
  }

  public fun build(): GraphqlApi = cdkBuilder.build()
}
