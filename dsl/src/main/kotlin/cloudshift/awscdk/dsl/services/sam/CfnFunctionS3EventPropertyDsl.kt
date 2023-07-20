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
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.sam.CfnFunction
import kotlin.String

@CdkDslMarker
public class CfnFunctionS3EventPropertyDsl {
    private val cdkBuilder: CfnFunction.S3EventProperty.Builder =
        CfnFunction.S3EventProperty.builder()

    public fun bucket(bucket: String) {
        cdkBuilder.bucket(bucket)
    }

    public fun events(events: String) {
        cdkBuilder.events(events)
    }

    public fun filter(filter: IResolvable) {
        cdkBuilder.filter(filter)
    }

    public fun filter(filter: CfnFunction.S3NotificationFilterProperty) {
        cdkBuilder.filter(filter)
    }

    public fun build(): CfnFunction.S3EventProperty = cdkBuilder.build()
}
