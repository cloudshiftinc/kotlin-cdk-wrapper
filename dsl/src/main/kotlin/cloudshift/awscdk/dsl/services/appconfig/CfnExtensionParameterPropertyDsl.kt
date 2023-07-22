@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.appconfig

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.appconfig.CfnExtension

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
