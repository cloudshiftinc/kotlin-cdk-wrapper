@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.iot

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.iot.CfnResourceSpecificLoggingProps

@CdkDslMarker
public class CfnResourceSpecificLoggingPropsDsl {
  private val cdkBuilder: CfnResourceSpecificLoggingProps.Builder =
      CfnResourceSpecificLoggingProps.builder()

  /**
   * @param logLevel The default log level.Valid Values: `DEBUG | INFO | ERROR | WARN | DISABLED`. 
   */
  public fun logLevel(logLevel: String) {
    cdkBuilder.logLevel(logLevel)
  }

  /**
   * @param targetName The target name. 
   */
  public fun targetName(targetName: String) {
    cdkBuilder.targetName(targetName)
  }

  /**
   * @param targetType The target type. 
   * Valid Values: `DEFAULT | THING_GROUP`
   */
  public fun targetType(targetType: String) {
    cdkBuilder.targetType(targetType)
  }

  public fun build(): CfnResourceSpecificLoggingProps = cdkBuilder.build()
}
