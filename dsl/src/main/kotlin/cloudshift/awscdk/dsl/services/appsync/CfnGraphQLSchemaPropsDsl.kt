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
import software.amazon.awscdk.services.appsync.CfnGraphQLSchemaProps
import kotlin.String

@CdkDslMarker
public class CfnGraphQLSchemaPropsDsl {
    private val cdkBuilder: CfnGraphQLSchemaProps.Builder = CfnGraphQLSchemaProps.builder()

    public fun apiId(apiId: String) {
        cdkBuilder.apiId(apiId)
    }

    public fun definition(definition: String) {
        cdkBuilder.definition(definition)
    }

    public fun definitionS3Location(definitionS3Location: String) {
        cdkBuilder.definitionS3Location(definitionS3Location)
    }

    public fun build(): CfnGraphQLSchemaProps = cdkBuilder.build()
}
