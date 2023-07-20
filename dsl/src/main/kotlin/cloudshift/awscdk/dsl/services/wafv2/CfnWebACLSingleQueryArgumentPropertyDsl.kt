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

package cloudshift.awscdk.dsl.services.wafv2

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.wafv2.CfnWebACL
import kotlin.String

@CdkDslMarker
public class CfnWebACLSingleQueryArgumentPropertyDsl {
    private val cdkBuilder: CfnWebACL.SingleQueryArgumentProperty.Builder =
        CfnWebACL.SingleQueryArgumentProperty.builder()

    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    public fun build(): CfnWebACL.SingleQueryArgumentProperty = cdkBuilder.build()
}
