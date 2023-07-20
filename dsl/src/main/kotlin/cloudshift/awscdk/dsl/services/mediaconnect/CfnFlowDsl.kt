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

package cloudshift.awscdk.dsl.services.mediaconnect

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.mediaconnect.CfnFlow
import software.constructs.Construct
import kotlin.String

@CdkDslMarker
public class CfnFlowDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnFlow.Builder = CfnFlow.Builder.create(scope, id)

    public fun availabilityZone(availabilityZone: String) {
        cdkBuilder.availabilityZone(availabilityZone)
    }

    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    public fun source(source: IResolvable) {
        cdkBuilder.source(source)
    }

    public fun source(source: CfnFlow.SourceProperty) {
        cdkBuilder.source(source)
    }

    public fun sourceFailoverConfig(sourceFailoverConfig: IResolvable) {
        cdkBuilder.sourceFailoverConfig(sourceFailoverConfig)
    }

    public fun sourceFailoverConfig(sourceFailoverConfig: CfnFlow.FailoverConfigProperty) {
        cdkBuilder.sourceFailoverConfig(sourceFailoverConfig)
    }

    public fun build(): CfnFlow = cdkBuilder.build()
}
