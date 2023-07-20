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

package cloudshift.awscdk.dsl.services.m2

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.m2.CfnApplication
import kotlin.String

@CdkDslMarker
public class CfnApplicationDefinitionPropertyDsl {
    private val cdkBuilder: CfnApplication.DefinitionProperty.Builder =
        CfnApplication.DefinitionProperty.builder()

    public fun content(content: String) {
        cdkBuilder.content(content)
    }

    public fun s3Location(s3Location: String) {
        cdkBuilder.s3Location(s3Location)
    }

    public fun build(): CfnApplication.DefinitionProperty = cdkBuilder.build()
}
