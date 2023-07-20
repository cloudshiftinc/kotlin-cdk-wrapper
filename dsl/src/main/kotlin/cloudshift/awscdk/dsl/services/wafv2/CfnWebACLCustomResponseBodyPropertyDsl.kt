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
public class CfnWebACLCustomResponseBodyPropertyDsl {
    private val cdkBuilder: CfnWebACL.CustomResponseBodyProperty.Builder =
        CfnWebACL.CustomResponseBodyProperty.builder()

    public fun content(content: String) {
        cdkBuilder.content(content)
    }

    public fun contentType(contentType: String) {
        cdkBuilder.contentType(contentType)
    }

    public fun build(): CfnWebACL.CustomResponseBodyProperty = cdkBuilder.build()
}
