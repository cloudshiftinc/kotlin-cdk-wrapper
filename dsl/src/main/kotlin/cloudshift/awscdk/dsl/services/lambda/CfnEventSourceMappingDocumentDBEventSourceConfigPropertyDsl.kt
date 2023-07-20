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

package cloudshift.awscdk.dsl.services.lambda

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.lambda.CfnEventSourceMapping
import kotlin.String

@CdkDslMarker
public class CfnEventSourceMappingDocumentDBEventSourceConfigPropertyDsl {
    private val cdkBuilder: CfnEventSourceMapping.DocumentDBEventSourceConfigProperty.Builder =
        CfnEventSourceMapping.DocumentDBEventSourceConfigProperty.builder()

    public fun collectionName(collectionName: String) {
        cdkBuilder.collectionName(collectionName)
    }

    public fun databaseName(databaseName: String) {
        cdkBuilder.databaseName(databaseName)
    }

    public fun fullDocument(fullDocument: String) {
        cdkBuilder.fullDocument(fullDocument)
    }

    public fun build(): CfnEventSourceMapping.DocumentDBEventSourceConfigProperty = cdkBuilder.build()
}
