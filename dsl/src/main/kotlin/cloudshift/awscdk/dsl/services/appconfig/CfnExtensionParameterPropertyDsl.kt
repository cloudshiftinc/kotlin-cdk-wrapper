@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.appconfig

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.appconfig.CfnExtension

/**
 * A value such as an Amazon Resource Name (ARN) or an Amazon Simple Notification Service topic
 * entered in an extension when invoked.
 *
 * Parameter values are specified in an extension association. For more information about
 * extensions, see [Working with AWS AppConfig
 * extensions](https://docs.aws.amazon.com/appconfig/latest/userguide/working-with-appconfig-extensions.html)
 * in the *AWS AppConfig User Guide* .
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.appconfig.*;
 * ParameterProperty parameterProperty = ParameterProperty.builder()
 * .required(false)
 * // the properties below are optional
 * .description("description")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appconfig-extension-parameter.html)
 */
@CdkDslMarker
public class CfnExtensionParameterPropertyDsl {
  private val cdkBuilder: CfnExtension.ParameterProperty.Builder =
      CfnExtension.ParameterProperty.builder()

  /**
   * @param description Information about the parameter.
   */
  public fun description(description: String) {
    cdkBuilder.description(description)
  }

  /**
   * @param required A parameter value must be specified in the extension association. 
   */
  public fun required(required: Boolean) {
    cdkBuilder.required(required)
  }

  /**
   * @param required A parameter value must be specified in the extension association. 
   */
  public fun required(required: IResolvable) {
    cdkBuilder.required(required)
  }

  public fun build(): CfnExtension.ParameterProperty = cdkBuilder.build()
}
