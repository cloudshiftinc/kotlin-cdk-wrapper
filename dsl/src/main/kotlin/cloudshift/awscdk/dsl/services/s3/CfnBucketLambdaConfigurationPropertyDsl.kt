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

package cloudshift.awscdk.dsl.services.s3

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.s3.CfnBucket
import kotlin.String

@CdkDslMarker
public class CfnBucketLambdaConfigurationPropertyDsl {
    private val cdkBuilder: CfnBucket.LambdaConfigurationProperty.Builder =
        CfnBucket.LambdaConfigurationProperty.builder()

    public fun event(event: String) {
        cdkBuilder.event(event)
    }

    public fun filter(filter: IResolvable) {
        cdkBuilder.filter(filter)
    }

    public fun filter(filter: CfnBucket.NotificationFilterProperty) {
        cdkBuilder.filter(filter)
    }

    public fun function(function: String) {
        cdkBuilder.function(function)
    }

    public fun build(): CfnBucket.LambdaConfigurationProperty = cdkBuilder.build()
}
