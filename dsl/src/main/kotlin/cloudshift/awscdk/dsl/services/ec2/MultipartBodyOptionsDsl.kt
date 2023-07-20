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
import software.amazon.awscdk.services.ec2.MultipartBodyOptions
import kotlin.String

@CdkDslMarker
public class MultipartBodyOptionsDsl {
    private val cdkBuilder: MultipartBodyOptions.Builder = MultipartBodyOptions.builder()

    public fun body(body: String) {
        cdkBuilder.body(body)
    }

    public fun contentType(contentType: String) {
        cdkBuilder.contentType(contentType)
    }

    public fun transferEncoding(transferEncoding: String) {
        cdkBuilder.transferEncoding(transferEncoding)
    }

    public fun build(): MultipartBodyOptions = cdkBuilder.build()
}
