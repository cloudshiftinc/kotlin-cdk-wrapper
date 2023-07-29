@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION"
)

package cloudshift.awscdk.dsl.services.appsync

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.appsync.SchemaFile

/**
 * The Schema for a GraphQL Api.
 *
 * If no options are configured, schema will be generated code-first.
 *
 * Example:
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
public class SchemaFileDsl {
    private val cdkBuilder: SchemaFile.Builder = SchemaFile.Builder.create()

    /**
     * The file path for the schema.
     *
     * When this option is configured, then the schema will be generated from an existing file from
     * disk.
     *
     * @param filePath The file path for the schema.
     */
    public fun filePath(filePath: String) {
        cdkBuilder.filePath(filePath)
    }

    public fun build(): SchemaFile = cdkBuilder.build()
}
