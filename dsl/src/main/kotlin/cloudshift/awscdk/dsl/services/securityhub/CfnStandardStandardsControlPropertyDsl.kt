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

package cloudshift.awscdk.dsl.services.securityhub

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.securityhub.CfnStandard
import kotlin.String

@CdkDslMarker
public class CfnStandardStandardsControlPropertyDsl {
    private val cdkBuilder: CfnStandard.StandardsControlProperty.Builder =
        CfnStandard.StandardsControlProperty.builder()

    public fun reason(reason: String) {
        cdkBuilder.reason(reason)
    }

    public fun standardsControlArn(standardsControlArn: String) {
        cdkBuilder.standardsControlArn(standardsControlArn)
    }

    public fun build(): CfnStandard.StandardsControlProperty = cdkBuilder.build()
}
