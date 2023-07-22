@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.ecs

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.String
import software.amazon.awscdk.services.ecs.FirelensConfigFileType
import software.amazon.awscdk.services.ecs.FirelensOptions

@CdkDslMarker
public class FirelensOptionsDsl {
  private val cdkBuilder: FirelensOptions.Builder = FirelensOptions.builder()

  /**
   * @param configFileType Custom configuration file, s3 or file.
   * Both configFileType and configFileValue must be used together
   * to define a custom configuration source.
   */
  public fun configFileType(configFileType: FirelensConfigFileType) {
    cdkBuilder.configFileType(configFileType)
  }

  /**
   * @param configFileValue Custom configuration file, S3 ARN or a file path Both configFileType and
   * configFileValue must be used together to define a custom configuration source.
   */
  public fun configFileValue(configFileValue: String) {
    cdkBuilder.configFileValue(configFileValue)
  }

  /**
   * @param enableEcsLogMetadata By default, Amazon ECS adds additional fields in your log entries
   * that help identify the source of the logs.
   * You can disable this action by setting enable-ecs-log-metadata to false.
   */
  public fun enableEcsLogMetadata(enableEcsLogMetadata: Boolean) {
    cdkBuilder.enableEcsLogMetadata(enableEcsLogMetadata)
  }

  public fun build(): FirelensOptions = cdkBuilder.build()
}
