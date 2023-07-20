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

package cloudshift.awscdk.dsl.services.iot

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.iot.CfnJobTemplate
import kotlin.Number
import kotlin.String

@CdkDslMarker
public class CfnJobTemplateRetryCriteriaPropertyDsl {
    private val cdkBuilder: CfnJobTemplate.RetryCriteriaProperty.Builder =
        CfnJobTemplate.RetryCriteriaProperty.builder()

    public fun failureType(failureType: String) {
        cdkBuilder.failureType(failureType)
    }

    public fun numberOfRetries(numberOfRetries: Number) {
        cdkBuilder.numberOfRetries(numberOfRetries)
    }

    public fun build(): CfnJobTemplate.RetryCriteriaProperty = cdkBuilder.build()
}
