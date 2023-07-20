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
import software.amazon.awscdk.CfnPublicTypeVersion
import software.constructs.Construct
import kotlin.String

@CdkDslMarker
public class CfnPublicTypeVersionDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnPublicTypeVersion.Builder = CfnPublicTypeVersion.Builder.create(
        scope,
        id,
    )

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

    public fun build(): CfnPublicTypeVersion = cdkBuilder.build()
}
