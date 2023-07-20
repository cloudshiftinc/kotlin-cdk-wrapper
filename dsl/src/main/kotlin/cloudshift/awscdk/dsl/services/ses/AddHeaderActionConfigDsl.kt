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

package cloudshift.awscdk.dsl.services.ses

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.ses.AddHeaderActionConfig
import kotlin.String

@CdkDslMarker
public class AddHeaderActionConfigDsl {
    private val cdkBuilder: AddHeaderActionConfig.Builder = AddHeaderActionConfig.builder()

    public fun headerName(headerName: String) {
        cdkBuilder.headerName(headerName)
    }

    public fun headerValue(headerValue: String) {
        cdkBuilder.headerValue(headerValue)
    }

    public fun build(): AddHeaderActionConfig = cdkBuilder.build()
}
