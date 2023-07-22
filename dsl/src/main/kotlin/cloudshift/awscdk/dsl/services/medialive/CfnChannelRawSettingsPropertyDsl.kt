@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.medialive

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.medialive.CfnChannel

/**
 * The container for WAV audio in the output group.
 *
 * The parent of this entity is ArchiveContainerSettings.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.medialive.*;
 * RawSettingsProperty rawSettingsProperty = RawSettingsProperty.builder().build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-medialive-channel-rawsettings.html)
 */
@CdkDslMarker
public class CfnChannelRawSettingsPropertyDsl {
  private val cdkBuilder: CfnChannel.RawSettingsProperty.Builder =
      CfnChannel.RawSettingsProperty.builder()

  public fun build(): CfnChannel.RawSettingsProperty = cdkBuilder.build()
}
