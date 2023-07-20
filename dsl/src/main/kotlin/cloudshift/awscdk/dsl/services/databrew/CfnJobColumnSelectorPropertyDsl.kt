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

package cloudshift.awscdk.dsl.services.databrew

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.databrew.CfnJob
import kotlin.String

@CdkDslMarker
public class CfnJobColumnSelectorPropertyDsl {
    private val cdkBuilder: CfnJob.ColumnSelectorProperty.Builder =
        CfnJob.ColumnSelectorProperty.builder()

    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    public fun regex(regex: String) {
        cdkBuilder.regex(regex)
    }

    public fun build(): CfnJob.ColumnSelectorProperty = cdkBuilder.build()
}
