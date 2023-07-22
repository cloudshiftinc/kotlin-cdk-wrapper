@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.sagemaker

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import software.amazon.awscdk.services.sagemaker.CfnEndpoint

/**
 * Specifies the type and size of the endpoint capacity to activate for a blue/green deployment, a
 * rolling deployment, or a rollback strategy.
 *
 * You can specify your batches as either instance count or the overall percentage or your fleet.
 *
 * For a rollback strategy, if you don't specify the fields in this object, or if you set the
 * `Value` to 100%, then SageMaker uses a blue/green rollback strategy and rolls all traffic back to
 * the blue fleet.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.sagemaker.*;
 * CapacitySizeProperty capacitySizeProperty = CapacitySizeProperty.builder()
 * .type("type")
 * .value(123)
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-endpoint-capacitysize.html)
 */
@CdkDslMarker
public class CfnEndpointCapacitySizePropertyDsl {
  private val cdkBuilder: CfnEndpoint.CapacitySizeProperty.Builder =
      CfnEndpoint.CapacitySizeProperty.builder()

  /**
   * @param type Specifies the endpoint capacity type. 
   * * `INSTANCE_COUNT` : The endpoint activates based on the number of instances.
   * * `CAPACITY_PERCENT` : The endpoint activates based on the specified percentage of capacity.
   */
  public fun type(type: String) {
    cdkBuilder.type(type)
  }

  /**
   * @param value Defines the capacity size, either as a number of instances or a capacity
   * percentage. 
   */
  public fun `value`(`value`: Number) {
    cdkBuilder.`value`(`value`)
  }

  public fun build(): CfnEndpoint.CapacitySizeProperty = cdkBuilder.build()
}
