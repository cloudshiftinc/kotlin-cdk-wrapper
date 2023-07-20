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

package cloudshift.awscdk.dsl.services.s3

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.s3.VirtualHostedStyleUrlOptions
import kotlin.Boolean

@CdkDslMarker
public class VirtualHostedStyleUrlOptionsDsl {
    private val cdkBuilder: VirtualHostedStyleUrlOptions.Builder =
        VirtualHostedStyleUrlOptions.builder()

    public fun regional(regional: Boolean) {
        cdkBuilder.regional(regional)
    }

    public fun build(): VirtualHostedStyleUrlOptions = cdkBuilder.build()
}
