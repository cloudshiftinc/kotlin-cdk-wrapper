@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.appstream

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.appstream.CfnStack

/**
 * The persistent application settings for users of a stack.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.appstream.*;
 * ApplicationSettingsProperty applicationSettingsProperty = ApplicationSettingsProperty.builder()
 * .enabled(false)
 * // the properties below are optional
 * .settingsGroup("settingsGroup")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appstream-stack-applicationsettings.html)
 */
@CdkDslMarker
public class CfnStackApplicationSettingsPropertyDsl {
  private val cdkBuilder: CfnStack.ApplicationSettingsProperty.Builder =
      CfnStack.ApplicationSettingsProperty.builder()

  /**
   * @param enabled Enables or disables persistent application settings for users during their
   * streaming sessions. 
   */
  public fun enabled(enabled: Boolean) {
    cdkBuilder.enabled(enabled)
  }

  /**
   * @param enabled Enables or disables persistent application settings for users during their
   * streaming sessions. 
   */
  public fun enabled(enabled: IResolvable) {
    cdkBuilder.enabled(enabled)
  }

  /**
   * @param settingsGroup The path prefix for the S3 bucket where users’ persistent application
   * settings are stored.
   * You can allow the same persistent application settings to be used across multiple stacks by
   * specifying the same settings group for each stack.
   */
  public fun settingsGroup(settingsGroup: String) {
    cdkBuilder.settingsGroup(settingsGroup)
  }

  public fun build(): CfnStack.ApplicationSettingsProperty = cdkBuilder.build()
}
