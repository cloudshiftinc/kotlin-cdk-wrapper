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

package cloudshift.awscdk.dsl

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.CfnPublicTypeVersionProps
import kotlin.String

@CdkDslMarker
public class CfnPublicTypeVersionPropsDsl {
    private val cdkBuilder: CfnPublicTypeVersionProps.Builder = CfnPublicTypeVersionProps.builder()

    public fun arn(arn: String) {
        cdkBuilder.arn(arn)
    }

    public fun logDeliveryBucket(logDeliveryBucket: String) {
        cdkBuilder.logDeliveryBucket(logDeliveryBucket)
    }

    public fun publicVersionNumber(publicVersionNumber: String) {
        cdkBuilder.publicVersionNumber(publicVersionNumber)
    }

    public fun type(type: String) {
        cdkBuilder.type(type)
    }

    public fun typeName(typeName: String) {
        cdkBuilder.typeName(typeName)
    }

    public fun build(): CfnPublicTypeVersionProps = cdkBuilder.build()
}
