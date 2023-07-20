@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION",
)

package cloudshift.awscdk.dsl.services.appsync

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.appsync.CfnGraphQLSchema
import software.constructs.Construct
import kotlin.String

@CdkDslMarker
public class CfnGraphQLSchemaDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnGraphQLSchema.Builder = CfnGraphQLSchema.Builder.create(scope, id)

    public fun apiId(apiId: String) {
        cdkBuilder.apiId(apiId)
    }

    public fun definition(definition: String) {
        cdkBuilder.definition(definition)
    }

    public fun definitionS3Location(definitionS3Location: String) {
        cdkBuilder.definitionS3Location(definitionS3Location)
    }

    public fun build(): CfnGraphQLSchema = cdkBuilder.build()
}
