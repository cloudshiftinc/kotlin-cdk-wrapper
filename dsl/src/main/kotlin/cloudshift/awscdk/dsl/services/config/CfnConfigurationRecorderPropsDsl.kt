@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.config

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.config.CfnConfigurationRecorder
import software.amazon.awscdk.services.config.CfnConfigurationRecorderProps

@CdkDslMarker
public class CfnConfigurationRecorderPropsDsl {
  private val cdkBuilder: CfnConfigurationRecorderProps.Builder =
      CfnConfigurationRecorderProps.builder()

  public fun name(name: String) {
    cdkBuilder.name(name)
  }

  public fun recordingGroup(recordingGroup: IResolvable) {
    cdkBuilder.recordingGroup(recordingGroup)
  }

  public fun recordingGroup(recordingGroup: CfnConfigurationRecorder.RecordingGroupProperty) {
    cdkBuilder.recordingGroup(recordingGroup)
  }

  public fun roleArn(roleArn: String) {
    cdkBuilder.roleArn(roleArn)
  }

  public fun build(): CfnConfigurationRecorderProps = cdkBuilder.build()
}
