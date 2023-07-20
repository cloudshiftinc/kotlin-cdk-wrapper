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

package cloudshift.awscdk.dsl.services.ivschat

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.ivschat.CfnRoom
import kotlin.String

@CdkDslMarker
public class CfnRoomMessageReviewHandlerPropertyDsl {
    private val cdkBuilder: CfnRoom.MessageReviewHandlerProperty.Builder =
        CfnRoom.MessageReviewHandlerProperty.builder()

    public fun fallbackResult(fallbackResult: String) {
        cdkBuilder.fallbackResult(fallbackResult)
    }

    public fun uri(uri: String) {
        cdkBuilder.uri(uri)
    }

    public fun build(): CfnRoom.MessageReviewHandlerProperty = cdkBuilder.build()
}
