@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.CfnWaitConditionHandle
import software.constructs.Construct

/**
 * For Amazon EC2 and Auto Scaling resources, we recommend that you use a `CreationPolicy` attribute
 * instead of wait conditions.
 *
 * Add a `CreationPolicy` attribute to those resources, and use the cfn-signal helper script to
 * signal when an instance creation process has completed successfully.
 *
 *
 * For more information, see [Deploying applications on Amazon EC2 with AWS
 * CloudFormation](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/deploying.applications.html)
 * .
 *
 *
 * The `AWS::CloudFormation::WaitConditionHandle` type has no properties. When you reference the
 * `WaitConditionHandle` resource by using the `Ref` function, AWS CloudFormation returns a presigned
 * URL. You pass this URL to applications or scripts that are running on your Amazon EC2 instances to
 * send signals to that URL. An associated `AWS::CloudFormation::WaitCondition` resource checks the URL
 * for the required number of success signals or for a failure signal.
 *
 *
 * Anytime you add a `WaitCondition` resource during a stack update or update a resource with a wait
 * condition, you must associate the wait condition with a new `WaitConditionHandle` resource. Don't
 * reuse an old wait condition handle that has already been defined in the template. If you reuse a
 * wait condition handle, the wait condition might evaluate old signals from a previous create or
 * update stack command. &gt; Updates aren't supported for this resource.
 *
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.*;
 * CfnWaitConditionHandle cfnWaitConditionHandle = CfnWaitConditionHandle.Builder.create(this,
 * "MyCfnWaitConditionHandle").build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudformation-waitconditionhandle.html)
 */
@CdkDslMarker
public class CfnWaitConditionHandleDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: CfnWaitConditionHandle.Builder =
      CfnWaitConditionHandle.Builder.create(scope, id)

  public fun build(): CfnWaitConditionHandle = cdkBuilder.build()
}
