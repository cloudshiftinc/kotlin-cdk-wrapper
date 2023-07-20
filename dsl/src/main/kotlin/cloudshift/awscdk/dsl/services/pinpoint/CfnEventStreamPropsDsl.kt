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
import software.amazon.awscdk.services.pinpoint.CfnEventStreamProps
import kotlin.String

@CdkDslMarker
public class CfnEventStreamPropsDsl {
    private val cdkBuilder: CfnEventStreamProps.Builder = CfnEventStreamProps.builder()

    public fun applicationId(applicationId: String) {
        cdkBuilder.applicationId(applicationId)
    }

    public fun destinationStreamArn(destinationStreamArn: String) {
        cdkBuilder.destinationStreamArn(destinationStreamArn)
    }

    public fun roleArn(roleArn: String) {
        cdkBuilder.roleArn(roleArn)
    }

    public fun build(): CfnEventStreamProps = cdkBuilder.build()
}
