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

package cloudshift.awscdk.dsl.services.waf.regional

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.waf.regional.CfnWebACL
import kotlin.String

@CdkDslMarker
public class CfnWebACLActionPropertyDsl {
    private val cdkBuilder: CfnWebACL.ActionProperty.Builder = CfnWebACL.ActionProperty.builder()

    public fun type(type: String) {
        cdkBuilder.type(type)
    }

    public fun build(): CfnWebACL.ActionProperty = cdkBuilder.build()
}
