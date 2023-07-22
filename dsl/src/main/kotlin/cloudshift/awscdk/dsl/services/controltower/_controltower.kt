@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.controltower

import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.controltower.CfnEnabledControl
import software.amazon.awscdk.services.controltower.CfnEnabledControlProps
import software.constructs.Construct

public object controltower {
  /**
   * The resource represents an enabled control.
   *
   * It specifies an asynchronous operation that creates AWS resources on the specified
   * organizational unit and the accounts it contains. The resources created will vary according to the
   * control that you specify.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.controltower.*;
   * CfnEnabledControl cfnEnabledControl = CfnEnabledControl.Builder.create(this,
   * "MyCfnEnabledControl")
   * .controlIdentifier("controlIdentifier")
   * .targetIdentifier("targetIdentifier")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-controltower-enabledcontrol.html)
   */
  public inline fun cfnEnabledControl(
    scope: Construct,
    id: String,
    block: CfnEnabledControlDsl.() -> Unit = {},
  ): CfnEnabledControl {
    val builder = CfnEnabledControlDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  /**
   * Properties for defining a `CfnEnabledControl`.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.controltower.*;
   * CfnEnabledControlProps cfnEnabledControlProps = CfnEnabledControlProps.builder()
   * .controlIdentifier("controlIdentifier")
   * .targetIdentifier("targetIdentifier")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-controltower-enabledcontrol.html)
   */
  public inline fun cfnEnabledControlProps(block: CfnEnabledControlPropsDsl.() -> Unit = {}):
      CfnEnabledControlProps {
    val builder = CfnEnabledControlPropsDsl()
    builder.apply(block)
    return builder.build()
  }
}
