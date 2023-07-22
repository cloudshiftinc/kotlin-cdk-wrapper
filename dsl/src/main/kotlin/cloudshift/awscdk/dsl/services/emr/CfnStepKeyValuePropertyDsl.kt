@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.emr

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.emr.CfnStep

/**
 * `KeyValue` is a subproperty of the `HadoopJarStepConfig` property type.
 *
 * `KeyValue` is used to pass parameters to a step.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.emr.*;
 * KeyValueProperty keyValueProperty = KeyValueProperty.builder()
 * .key("key")
 * .value("value")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-emr-step-keyvalue.html)
 */
@CdkDslMarker
public class CfnStepKeyValuePropertyDsl {
  private val cdkBuilder: CfnStep.KeyValueProperty.Builder = CfnStep.KeyValueProperty.builder()

  /**
   * @param key The unique identifier of a key-value pair.
   */
  public fun key(key: String) {
    cdkBuilder.key(key)
  }

  /**
   * @param value The value part of the identified key.
   */
  public fun `value`(`value`: String) {
    cdkBuilder.`value`(`value`)
  }

  public fun build(): CfnStep.KeyValueProperty = cdkBuilder.build()
}
