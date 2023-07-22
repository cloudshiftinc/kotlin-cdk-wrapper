@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.cloudformation

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.dsl.CfnTagDsl
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.Map
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.cloudformation.CfnStack
import software.constructs.Construct

@CdkDslMarker
public class CfnStackDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: CfnStack.Builder = CfnStack.Builder.create(scope, id)

  private val _notificationArns: MutableList<String> = mutableListOf()

  private val _tags: MutableList<CfnTag> = mutableListOf()

  /**
   * The Amazon Simple Notification Service (Amazon SNS) topic ARNs to publish stack related events.
   *
   * You can find your Amazon SNS topic ARNs using the Amazon SNS console or your Command Line
   * Interface (CLI).
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudformation-stack.html#cfn-cloudformation-stack-notificationarns)
   * @param notificationArns The Amazon Simple Notification Service (Amazon SNS) topic ARNs to
   * publish stack related events. 
   */
  public fun notificationArns(vararg notificationArns: String) {
    _notificationArns.addAll(listOf(*notificationArns))
  }

  /**
   * The Amazon Simple Notification Service (Amazon SNS) topic ARNs to publish stack related events.
   *
   * You can find your Amazon SNS topic ARNs using the Amazon SNS console or your Command Line
   * Interface (CLI).
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudformation-stack.html#cfn-cloudformation-stack-notificationarns)
   * @param notificationArns The Amazon Simple Notification Service (Amazon SNS) topic ARNs to
   * publish stack related events. 
   */
  public fun notificationArns(notificationArns: Collection<String>) {
    _notificationArns.addAll(notificationArns)
  }

  /**
   * The set value pairs that represent the parameters passed to CloudFormation when this nested
   * stack is created.
   *
   * Each parameter has a name corresponding to a parameter defined in the embedded template and a
   * value representing the value that you want to set for the parameter.
   *
   *
   * If you use the `Ref` function to pass a parameter value to a nested stack, comma-delimited list
   * parameters must be of type `String` . In other words, you can't pass values that are of type
   * `CommaDelimitedList` to nested stacks.
   *
   *
   * Conditional. Required if the nested stack requires input parameters.
   *
   * Whether an update causes interruptions depends on the resources that are being updated. An
   * update never causes a nested stack to be replaced.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudformation-stack.html#cfn-cloudformation-stack-parameters)
   * @param parameters The set value pairs that represent the parameters passed to CloudFormation
   * when this nested stack is created. 
   */
  public fun parameters(parameters: Map<String, String>) {
    cdkBuilder.parameters(parameters)
  }

  /**
   * The set value pairs that represent the parameters passed to CloudFormation when this nested
   * stack is created.
   *
   * Each parameter has a name corresponding to a parameter defined in the embedded template and a
   * value representing the value that you want to set for the parameter.
   *
   *
   * If you use the `Ref` function to pass a parameter value to a nested stack, comma-delimited list
   * parameters must be of type `String` . In other words, you can't pass values that are of type
   * `CommaDelimitedList` to nested stacks.
   *
   *
   * Conditional. Required if the nested stack requires input parameters.
   *
   * Whether an update causes interruptions depends on the resources that are being updated. An
   * update never causes a nested stack to be replaced.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudformation-stack.html#cfn-cloudformation-stack-parameters)
   * @param parameters The set value pairs that represent the parameters passed to CloudFormation
   * when this nested stack is created. 
   */
  public fun parameters(parameters: IResolvable) {
    cdkBuilder.parameters(parameters)
  }

  /**
   * Key-value pairs to associate with this stack.
   *
   * AWS CloudFormation also propagates these tags to the resources created in the stack. A maximum
   * number of 50 tags can be specified.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudformation-stack.html#cfn-cloudformation-stack-tags)
   * @param tags Key-value pairs to associate with this stack. 
   */
  public fun tags(tags: CfnTagDsl.() -> Unit) {
    _tags.add(CfnTagDsl().apply(tags).build())
  }

  /**
   * Key-value pairs to associate with this stack.
   *
   * AWS CloudFormation also propagates these tags to the resources created in the stack. A maximum
   * number of 50 tags can be specified.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudformation-stack.html#cfn-cloudformation-stack-tags)
   * @param tags Key-value pairs to associate with this stack. 
   */
  public fun tags(tags: Collection<CfnTag>) {
    _tags.addAll(tags)
  }

  /**
   * Location of file containing the template body.
   *
   * The URL must point to a template (max size: 460,800 bytes) that's located in an Amazon S3
   * bucket. For more information, see [Template
   * anatomy](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/template-anatomy.html) .
   *
   * Whether an update causes interruptions depends on the resources that are being updated. An
   * update never causes a nested stack to be replaced.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudformation-stack.html#cfn-cloudformation-stack-templateurl)
   * @param templateUrl Location of file containing the template body. 
   */
  public fun templateUrl(templateUrl: String) {
    cdkBuilder.templateUrl(templateUrl)
  }

  /**
   * The length of time, in minutes, that CloudFormation waits for the nested stack to reach the
   * `CREATE_COMPLETE` state.
   *
   * The default is no timeout. When CloudFormation detects that the nested stack has reached the
   * `CREATE_COMPLETE` state, it marks the nested stack resource as `CREATE_COMPLETE` in the parent
   * stack and resumes creating the parent stack. If the timeout period expires before the nested stack
   * reaches `CREATE_COMPLETE` , CloudFormation marks the nested stack as failed and rolls back both
   * the nested stack and parent stack.
   *
   * Updates aren't supported.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudformation-stack.html#cfn-cloudformation-stack-timeoutinminutes)
   * @param timeoutInMinutes The length of time, in minutes, that CloudFormation waits for the
   * nested stack to reach the `CREATE_COMPLETE` state. 
   */
  public fun timeoutInMinutes(timeoutInMinutes: Number) {
    cdkBuilder.timeoutInMinutes(timeoutInMinutes)
  }

  public fun build(): CfnStack {
    if(_notificationArns.isNotEmpty()) cdkBuilder.notificationArns(_notificationArns)
    if(_tags.isNotEmpty()) cdkBuilder.tags(_tags)
    return cdkBuilder.build()
  }
}
