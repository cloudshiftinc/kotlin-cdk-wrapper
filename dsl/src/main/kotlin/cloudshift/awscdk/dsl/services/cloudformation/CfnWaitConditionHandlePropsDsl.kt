@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.cloudformation

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.cloudformation.CfnWaitConditionHandleProps

/**
 * Properties for defining a `CfnWaitConditionHandle`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.cloudformation.*;
 * CfnWaitConditionHandleProps cfnWaitConditionHandleProps =
 * CfnWaitConditionHandleProps.builder().build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudformation-waitconditionhandle.html)
 */
@CdkDslMarker
public class CfnWaitConditionHandlePropsDsl {
  private val cdkBuilder: CfnWaitConditionHandleProps.Builder =
      CfnWaitConditionHandleProps.builder()

  public fun build(): CfnWaitConditionHandleProps = cdkBuilder.build()
}
