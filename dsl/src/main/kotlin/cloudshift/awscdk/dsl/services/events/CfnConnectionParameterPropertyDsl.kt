@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.events

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.events.CfnConnection

/**
 * Additional query string parameter for the connection.
 *
 * You can include up to 100 additional query string parameters per request. Each additional
 * parameter counts towards the event payload size, which cannot exceed 64 KB.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.events.*;
 * ParameterProperty parameterProperty = ParameterProperty.builder()
 * .key("key")
 * .value("value")
 * // the properties below are optional
 * .isValueSecret(false)
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-events-connection-parameter.html)
 */
@CdkDslMarker
public class CfnConnectionParameterPropertyDsl {
  private val cdkBuilder: CfnConnection.ParameterProperty.Builder =
      CfnConnection.ParameterProperty.builder()

  /**
   * @param isValueSecret Specifies whether the value is secret.
   */
  public fun isValueSecret(isValueSecret: Boolean) {
    cdkBuilder.isValueSecret(isValueSecret)
  }

  /**
   * @param isValueSecret Specifies whether the value is secret.
   */
  public fun isValueSecret(isValueSecret: IResolvable) {
    cdkBuilder.isValueSecret(isValueSecret)
  }

  /**
   * @param key The key for a query string parameter. 
   */
  public fun key(key: String) {
    cdkBuilder.key(key)
  }

  /**
   * @param value The value associated with the key for the query string parameter. 
   */
  public fun `value`(`value`: String) {
    cdkBuilder.`value`(`value`)
  }

  public fun build(): CfnConnection.ParameterProperty = cdkBuilder.build()
}
