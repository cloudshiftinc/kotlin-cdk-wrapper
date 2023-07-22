@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.lex

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.lex.CfnBotAlias

/**
 * Settings for logging audio of conversations between Amazon Lex and a user.
 *
 * You specify whether to log audio and the Amazon S3 bucket where the audio file is stored.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.lex.*;
 * AudioLogSettingProperty audioLogSettingProperty = AudioLogSettingProperty.builder()
 * .destination(AudioLogDestinationProperty.builder()
 * .s3Bucket(S3BucketLogDestinationProperty.builder()
 * .logPrefix("logPrefix")
 * .s3BucketArn("s3BucketArn")
 * // the properties below are optional
 * .kmsKeyArn("kmsKeyArn")
 * .build())
 * .build())
 * .enabled(false)
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lex-botalias-audiologsetting.html)
 */
@CdkDslMarker
public class CfnBotAliasAudioLogSettingPropertyDsl {
  private val cdkBuilder: CfnBotAlias.AudioLogSettingProperty.Builder =
      CfnBotAlias.AudioLogSettingProperty.builder()

  /**
   * @param destination The location of audio log files collected when conversation logging is
   * enabled for a bot. 
   */
  public fun destination(destination: IResolvable) {
    cdkBuilder.destination(destination)
  }

  /**
   * @param destination The location of audio log files collected when conversation logging is
   * enabled for a bot. 
   */
  public fun destination(destination: CfnBotAlias.AudioLogDestinationProperty) {
    cdkBuilder.destination(destination)
  }

  /**
   * @param enabled Determines whether audio logging in enabled for the bot. 
   */
  public fun enabled(enabled: Boolean) {
    cdkBuilder.enabled(enabled)
  }

  /**
   * @param enabled Determines whether audio logging in enabled for the bot. 
   */
  public fun enabled(enabled: IResolvable) {
    cdkBuilder.enabled(enabled)
  }

  public fun build(): CfnBotAlias.AudioLogSettingProperty = cdkBuilder.build()
}
