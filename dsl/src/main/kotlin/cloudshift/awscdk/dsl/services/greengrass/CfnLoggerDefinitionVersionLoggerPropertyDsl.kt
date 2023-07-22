@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.greengrass

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import software.amazon.awscdk.services.greengrass.CfnLoggerDefinitionVersion

@CdkDslMarker
public class CfnLoggerDefinitionVersionLoggerPropertyDsl {
  private val cdkBuilder: CfnLoggerDefinitionVersion.LoggerProperty.Builder =
      CfnLoggerDefinitionVersion.LoggerProperty.builder()

  /**
   * @param component The source of the log event. 
   * Valid values are `GreengrassSystem` or `Lambda` . When `GreengrassSystem` is used, events from
   * Greengrass system components are logged. When `Lambda` is used, events from user-defined Lambda
   * functions are logged.
   */
  public fun component(component: String) {
    cdkBuilder.component(component)
  }

  /**
   * @param id A descriptive or arbitrary ID for the logger. 
   * This value must be unique within the logger definition version. Maximum length is 128
   * characters with pattern `[a-zA-Z0-9:_-]+` .
   */
  public fun id(id: String) {
    cdkBuilder.id(id)
  }

  /**
   * @param level The log-level threshold. 
   * Log events below this threshold are filtered out and aren't stored. Valid values are `DEBUG` ,
   * `INFO` (recommended), `WARN` , `ERROR` , or `FATAL` .
   */
  public fun level(level: String) {
    cdkBuilder.level(level)
  }

  /**
   * @param space The amount of file space (in KB) to use when writing logs to the local file
   * system.
   * This property does not apply for CloudWatch Logs .
   */
  public fun space(space: Number) {
    cdkBuilder.space(space)
  }

  /**
   * @param type The storage mechanism for log events. 
   * Valid values are `FileSystem` or `AWSCloudWatch` . When `AWSCloudWatch` is used, log events are
   * sent to CloudWatch Logs . When `FileSystem` is used, log events are stored on the local file
   * system.
   */
  public fun type(type: String) {
    cdkBuilder.type(type)
  }

  public fun build(): CfnLoggerDefinitionVersion.LoggerProperty = cdkBuilder.build()
}
