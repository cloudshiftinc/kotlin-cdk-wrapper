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

@CdkDslMarker
public class CfnChannelHlsCdnSettingsPropertyDsl {
    private val cdkBuilder: CfnChannel.HlsCdnSettingsProperty.Builder =
        CfnChannel.HlsCdnSettingsProperty.builder()

    public fun hlsAkamaiSettings(hlsAkamaiSettings: IResolvable) {
        cdkBuilder.hlsAkamaiSettings(hlsAkamaiSettings)
    }

    public fun hlsAkamaiSettings(hlsAkamaiSettings: CfnChannel.HlsAkamaiSettingsProperty) {
        cdkBuilder.hlsAkamaiSettings(hlsAkamaiSettings)
    }

    public fun hlsBasicPutSettings(hlsBasicPutSettings: IResolvable) {
        cdkBuilder.hlsBasicPutSettings(hlsBasicPutSettings)
    }

    public fun hlsBasicPutSettings(hlsBasicPutSettings: CfnChannel.HlsBasicPutSettingsProperty) {
        cdkBuilder.hlsBasicPutSettings(hlsBasicPutSettings)
    }

    public fun hlsMediaStoreSettings(hlsMediaStoreSettings: IResolvable) {
        cdkBuilder.hlsMediaStoreSettings(hlsMediaStoreSettings)
    }

    public fun hlsMediaStoreSettings(hlsMediaStoreSettings: CfnChannel.HlsMediaStoreSettingsProperty) {
        cdkBuilder.hlsMediaStoreSettings(hlsMediaStoreSettings)
    }

    public fun hlsS3Settings(hlsS3Settings: IResolvable) {
        cdkBuilder.hlsS3Settings(hlsS3Settings)
    }

    public fun hlsS3Settings(hlsS3Settings: CfnChannel.HlsS3SettingsProperty) {
        cdkBuilder.hlsS3Settings(hlsS3Settings)
    }

    public fun hlsWebdavSettings(hlsWebdavSettings: IResolvable) {
        cdkBuilder.hlsWebdavSettings(hlsWebdavSettings)
    }

    public fun hlsWebdavSettings(hlsWebdavSettings: CfnChannel.HlsWebdavSettingsProperty) {
        cdkBuilder.hlsWebdavSettings(hlsWebdavSettings)
    }

    public fun build(): CfnChannel.HlsCdnSettingsProperty = cdkBuilder.build()
}
