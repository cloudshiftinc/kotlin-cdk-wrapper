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

package cloudshift.awscdk.dsl.services.medialive

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.medialive.CfnChannel
import kotlin.String

@CdkDslMarker
public class CfnChannelInputLocationPropertyDsl {
    private val cdkBuilder: CfnChannel.InputLocationProperty.Builder =
        CfnChannel.InputLocationProperty.builder()

    public fun passwordParam(passwordParam: String) {
        cdkBuilder.passwordParam(passwordParam)
    }

    public fun uri(uri: String) {
        cdkBuilder.uri(uri)
    }

    public fun username(username: String) {
        cdkBuilder.username(username)
    }

    public fun build(): CfnChannel.InputLocationProperty = cdkBuilder.build()
}
