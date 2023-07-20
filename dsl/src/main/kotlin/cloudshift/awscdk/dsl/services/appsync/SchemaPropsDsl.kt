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
import software.amazon.awscdk.services.appsync.SchemaProps
import kotlin.String

@CdkDslMarker
public class SchemaPropsDsl {
    private val cdkBuilder: SchemaProps.Builder = SchemaProps.builder()

    public fun filePath(filePath: String) {
        cdkBuilder.filePath(filePath)
    }

    public fun build(): SchemaProps = cdkBuilder.build()
}
