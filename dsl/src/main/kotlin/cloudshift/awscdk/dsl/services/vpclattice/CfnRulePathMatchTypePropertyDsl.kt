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

package cloudshift.awscdk.dsl.services.vpclattice

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.vpclattice.CfnRule
import kotlin.String

@CdkDslMarker
public class CfnRulePathMatchTypePropertyDsl {
    private val cdkBuilder: CfnRule.PathMatchTypeProperty.Builder =
        CfnRule.PathMatchTypeProperty.builder()

    public fun exact(exact: String) {
        cdkBuilder.exact(exact)
    }

    public fun prefix(prefix: String) {
        cdkBuilder.prefix(prefix)
    }

    public fun build(): CfnRule.PathMatchTypeProperty = cdkBuilder.build()
}
