@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.iot

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.iot.CfnResourceSpecificLoggingProps

/**
 * Properties for defining a `CfnResourceSpecificLogging`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.iot.*;
 * CfnResourceSpecificLoggingProps cfnResourceSpecificLoggingProps =
 * CfnResourceSpecificLoggingProps.builder()
 * .logLevel("logLevel")
 * .targetName("targetName")
 * .targetType("targetType")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-resourcespecificlogging.html)
 */
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
