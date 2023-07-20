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

package cloudshift.awscdk.dsl.services.waf

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.waf.CfnSqlInjectionMatchSet
import kotlin.String

@CdkDslMarker
public class CfnSqlInjectionMatchSetFieldToMatchPropertyDsl {
    private val cdkBuilder: CfnSqlInjectionMatchSet.FieldToMatchProperty.Builder =
        CfnSqlInjectionMatchSet.FieldToMatchProperty.builder()

    public fun `data`(`data`: String) {
        cdkBuilder.`data`(`data`)
    }

    public fun type(type: String) {
        cdkBuilder.type(type)
    }

    public fun build(): CfnSqlInjectionMatchSet.FieldToMatchProperty = cdkBuilder.build()
}
