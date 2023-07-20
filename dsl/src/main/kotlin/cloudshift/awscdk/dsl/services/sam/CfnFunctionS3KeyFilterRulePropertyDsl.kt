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

package cloudshift.awscdk.dsl.services.sam

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.sam.CfnFunction
import kotlin.String

@CdkDslMarker
public class CfnFunctionS3KeyFilterRulePropertyDsl {
    private val cdkBuilder: CfnFunction.S3KeyFilterRuleProperty.Builder =
        CfnFunction.S3KeyFilterRuleProperty.builder()

    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    public fun `value`(`value`: String) {
        cdkBuilder.`value`(`value`)
    }

    public fun build(): CfnFunction.S3KeyFilterRuleProperty = cdkBuilder.build()
}
