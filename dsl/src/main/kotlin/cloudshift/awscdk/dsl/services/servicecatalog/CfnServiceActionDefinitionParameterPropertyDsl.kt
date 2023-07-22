@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.servicecatalog

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.servicecatalog.CfnServiceAction

/**
 * The list of parameters in JSON format.
 *
 * For example: `[{\"Name\":\"InstanceId\",\"Type\":\"TARGET\"}] or
 * [{\"Name\":\"InstanceId\",\"Type\":\"TEXT_VALUE\"}]` .
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.servicecatalog.*;
 * DefinitionParameterProperty definitionParameterProperty = DefinitionParameterProperty.builder()
 * .key("key")
 * .value("value")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-servicecatalog-serviceaction-definitionparameter.html)
 */
@CdkDslMarker
public class CfnServiceActionDefinitionParameterPropertyDsl {
  private val cdkBuilder: CfnServiceAction.DefinitionParameterProperty.Builder =
      CfnServiceAction.DefinitionParameterProperty.builder()

  /**
   * @param key The parameter key. 
   */
  public fun key(key: String) {
    cdkBuilder.key(key)
  }

  /**
   * @param value The value of the parameter. 
   */
  public fun `value`(`value`: String) {
    cdkBuilder.`value`(`value`)
  }

  public fun build(): CfnServiceAction.DefinitionParameterProperty = cdkBuilder.build()
}
