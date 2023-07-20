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

package cloudshift.awscdk.dsl.services.cognito

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.cognito.BaseUrlOptions
import kotlin.Boolean

@CdkDslMarker
public class BaseUrlOptionsDsl {
    private val cdkBuilder: BaseUrlOptions.Builder = BaseUrlOptions.builder()

    public fun fips(fips: Boolean) {
        cdkBuilder.fips(fips)
    }

    public fun build(): BaseUrlOptions = cdkBuilder.build()
}
