@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION"
)

package io.cloudshiftdev.awscdkdsl.services.medialive

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.medialive.CfnChannel

/**
 * The static key settings.
 *
 * The parent of this entity is KeyProviderSettings.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.medialive.*;
 * StaticKeySettingsProperty staticKeySettingsProperty = StaticKeySettingsProperty.builder()
 * .keyProviderServer(InputLocationProperty.builder()
 * .passwordParam("passwordParam")
 * .uri("uri")
 * .username("username")
 * .build())
 * .staticKeyValue("staticKeyValue")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-medialive-channel-statickeysettings.html)
 */
@CdkDslMarker
public class CfnChannelStaticKeySettingsPropertyDsl {
    private val cdkBuilder: CfnChannel.StaticKeySettingsProperty.Builder =
        CfnChannel.StaticKeySettingsProperty.builder()

    /**
     * @param keyProviderServer The URL of the license server that is used for protecting content.
     */
    public fun keyProviderServer(keyProviderServer: IResolvable) {
        cdkBuilder.keyProviderServer(keyProviderServer)
    }

    /**
     * @param keyProviderServer The URL of the license server that is used for protecting content.
     */
    public fun keyProviderServer(keyProviderServer: CfnChannel.InputLocationProperty) {
        cdkBuilder.keyProviderServer(keyProviderServer)
    }

    /** @param staticKeyValue The static key value as a 32 character hexadecimal string. */
    public fun staticKeyValue(staticKeyValue: String) {
        cdkBuilder.staticKeyValue(staticKeyValue)
    }

    public fun build(): CfnChannel.StaticKeySettingsProperty = cdkBuilder.build()
}
