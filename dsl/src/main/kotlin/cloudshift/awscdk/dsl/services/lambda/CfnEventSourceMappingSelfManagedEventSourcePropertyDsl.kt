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

package cloudshift.awscdk.dsl.services.lambda

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.lambda.CfnEventSourceMapping

@CdkDslMarker
public class CfnEventSourceMappingSelfManagedEventSourcePropertyDsl {
    private val cdkBuilder: CfnEventSourceMapping.SelfManagedEventSourceProperty.Builder =
        CfnEventSourceMapping.SelfManagedEventSourceProperty.builder()

    public fun endpoints(endpoints: IResolvable) {
        cdkBuilder.endpoints(endpoints)
    }

    public fun endpoints(endpoints: CfnEventSourceMapping.EndpointsProperty) {
        cdkBuilder.endpoints(endpoints)
    }

    public fun build(): CfnEventSourceMapping.SelfManagedEventSourceProperty = cdkBuilder.build()
}
