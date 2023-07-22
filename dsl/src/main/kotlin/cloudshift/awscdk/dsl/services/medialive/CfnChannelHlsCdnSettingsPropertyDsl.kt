@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.medialive

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.medialive.CfnChannel

@CdkDslMarker
public class CfnChannelHlsCdnSettingsPropertyDsl {
  private val cdkBuilder: CfnChannel.HlsCdnSettingsProperty.Builder =
      CfnChannel.HlsCdnSettingsProperty.builder()

  /**
   * @param hlsAkamaiSettings Sets up Akamai as the downstream system for the HLS output group.
   */
  public fun hlsAkamaiSettings(hlsAkamaiSettings: IResolvable) {
    cdkBuilder.hlsAkamaiSettings(hlsAkamaiSettings)
  }

  /**
   * @param hlsAkamaiSettings Sets up Akamai as the downstream system for the HLS output group.
   */
  public fun hlsAkamaiSettings(hlsAkamaiSettings: CfnChannel.HlsAkamaiSettingsProperty) {
    cdkBuilder.hlsAkamaiSettings(hlsAkamaiSettings)
  }

  /**
   * @param hlsBasicPutSettings The settings for Basic Put for the HLS output.
   */
  public fun hlsBasicPutSettings(hlsBasicPutSettings: IResolvable) {
    cdkBuilder.hlsBasicPutSettings(hlsBasicPutSettings)
  }

  /**
   * @param hlsBasicPutSettings The settings for Basic Put for the HLS output.
   */
  public fun hlsBasicPutSettings(hlsBasicPutSettings: CfnChannel.HlsBasicPutSettingsProperty) {
    cdkBuilder.hlsBasicPutSettings(hlsBasicPutSettings)
  }

  /**
   * @param hlsMediaStoreSettings Sets up MediaStore as the destination for the HLS output.
   */
  public fun hlsMediaStoreSettings(hlsMediaStoreSettings: IResolvable) {
    cdkBuilder.hlsMediaStoreSettings(hlsMediaStoreSettings)
  }

  /**
   * @param hlsMediaStoreSettings Sets up MediaStore as the destination for the HLS output.
   */
  public
      fun hlsMediaStoreSettings(hlsMediaStoreSettings: CfnChannel.HlsMediaStoreSettingsProperty) {
    cdkBuilder.hlsMediaStoreSettings(hlsMediaStoreSettings)
  }

  /**
   * @param hlsS3Settings Sets up Amazon S3 as the destination for this HLS output.
   */
  public fun hlsS3Settings(hlsS3Settings: IResolvable) {
    cdkBuilder.hlsS3Settings(hlsS3Settings)
  }

  /**
   * @param hlsS3Settings Sets up Amazon S3 as the destination for this HLS output.
   */
  public fun hlsS3Settings(hlsS3Settings: CfnChannel.HlsS3SettingsProperty) {
    cdkBuilder.hlsS3Settings(hlsS3Settings)
  }

  /**
   * @param hlsWebdavSettings The settings for Web VTT captions in the HLS output group.
   * The parent of this entity is HlsGroupSettings.
   */
  public fun hlsWebdavSettings(hlsWebdavSettings: IResolvable) {
    cdkBuilder.hlsWebdavSettings(hlsWebdavSettings)
  }

  /**
   * @param hlsWebdavSettings The settings for Web VTT captions in the HLS output group.
   * The parent of this entity is HlsGroupSettings.
   */
  public fun hlsWebdavSettings(hlsWebdavSettings: CfnChannel.HlsWebdavSettingsProperty) {
    cdkBuilder.hlsWebdavSettings(hlsWebdavSettings)
  }

  public fun build(): CfnChannel.HlsCdnSettingsProperty = cdkBuilder.build()
}
