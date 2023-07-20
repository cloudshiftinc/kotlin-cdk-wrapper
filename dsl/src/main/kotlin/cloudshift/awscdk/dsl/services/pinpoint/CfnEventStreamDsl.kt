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

package cloudshift.awscdk.dsl.services.pinpoint

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.pinpoint.CfnEventStream
import software.constructs.Construct
import kotlin.String

@CdkDslMarker
public class CfnEventStreamDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnEventStream.Builder = CfnEventStream.Builder.create(scope, id)

    public fun applicationId(applicationId: String) {
        cdkBuilder.applicationId(applicationId)
    }

    public fun destinationStreamArn(destinationStreamArn: String) {
        cdkBuilder.destinationStreamArn(destinationStreamArn)
    }

    public fun roleArn(roleArn: String) {
        cdkBuilder.roleArn(roleArn)
    }

    public fun build(): CfnEventStream = cdkBuilder.build()
}
