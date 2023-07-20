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
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.medialive.CfnChannel
import kotlin.String

@CdkDslMarker
public class CfnChannelStaticKeySettingsPropertyDsl {
    private val cdkBuilder: CfnChannel.StaticKeySettingsProperty.Builder =
        CfnChannel.StaticKeySettingsProperty.builder()

    public fun keyProviderServer(keyProviderServer: IResolvable) {
        cdkBuilder.keyProviderServer(keyProviderServer)
    }

    public fun keyProviderServer(keyProviderServer: CfnChannel.InputLocationProperty) {
        cdkBuilder.keyProviderServer(keyProviderServer)
    }

    public fun staticKeyValue(staticKeyValue: String) {
        cdkBuilder.staticKeyValue(staticKeyValue)
    }

    public fun build(): CfnChannel.StaticKeySettingsProperty = cdkBuilder.build()
}
