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
import software.amazon.awscdk.services.appsync.SchemaBindOptions

@CdkDslMarker
public class SchemaBindOptionsDsl {
    private val cdkBuilder: SchemaBindOptions.Builder = SchemaBindOptions.builder()

    public fun build(): SchemaBindOptions = cdkBuilder.build()
}
