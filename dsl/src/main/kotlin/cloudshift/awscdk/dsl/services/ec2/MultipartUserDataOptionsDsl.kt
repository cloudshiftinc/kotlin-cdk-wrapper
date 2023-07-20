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

package cloudshift.awscdk.dsl.services.ec2

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.ec2.MultipartUserDataOptions
import kotlin.String

@CdkDslMarker
public class MultipartUserDataOptionsDsl {
    private val cdkBuilder: MultipartUserDataOptions.Builder = MultipartUserDataOptions.builder()

    public fun partsSeparator(partsSeparator: String) {
        cdkBuilder.partsSeparator(partsSeparator)
    }

    public fun build(): MultipartUserDataOptions = cdkBuilder.build()
}
