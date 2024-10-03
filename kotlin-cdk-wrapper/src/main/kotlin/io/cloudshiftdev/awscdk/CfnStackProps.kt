@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.Map

/**
 * Properties for defining a `CfnStack`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.*;
 * CfnStackProps cfnStackProps = CfnStackProps.builder()
 * .notificationArns(List.of("notificationArns"))
 * .parameters(Map.of(
 * "parametersKey", "parameters"))
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .templateUrl("templateUrl")
 * .timeoutInMinutes(123)
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudformation-stack.html)
 */
public interface CfnStackProps {
  /**
   * The Amazon SNS topic ARNs to publish stack related events.
   *
   * You can find your Amazon SNS topic ARNs using the Amazon SNS console or your Command Line
   * Interface (CLI).
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudformation-stack.html#cfn-cloudformation-stack-notificationarns)
   */
  public fun notificationArns(): List<String> = unwrap(this).getNotificationArns() ?: emptyList()

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
   */
  public fun parameters(): Any? = unwrap(this).getParameters()

  /**
   * Key-value pairs to associate with this stack.
   *
   * CloudFormation also propagates these tags to the resources created in the stack. A maximum
   * number of 50 tags can be specified.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudformation-stack.html#cfn-cloudformation-stack-tags)
   */
  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

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
   */
  public fun templateUrl(): String? = unwrap(this).getTemplateUrl()

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
   */
  public fun timeoutInMinutes(): Number? = unwrap(this).getTimeoutInMinutes()

  /**
   * A builder for [CfnStackProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param notificationArns The Amazon SNS topic ARNs to publish stack related events.
     * You can find your Amazon SNS topic ARNs using the Amazon SNS console or your Command Line
     * Interface (CLI).
     */
    public fun notificationArns(notificationArns: List<String>)

    /**
     * @param notificationArns The Amazon SNS topic ARNs to publish stack related events.
     * You can find your Amazon SNS topic ARNs using the Amazon SNS console or your Command Line
     * Interface (CLI).
     */
    public fun notificationArns(vararg notificationArns: String)

    /**
     * @param parameters The set value pairs that represent the parameters passed to CloudFormation
     * when this nested stack is created.
     * Each parameter has a name corresponding to a parameter defined in the embedded template and a
     * value representing the value that you want to set for the parameter.
     *
     *
     * If you use the `Ref` function to pass a parameter value to a nested stack, comma-delimited
     * list parameters must be of type `String` . In other words, you can't pass values that are of
     * type `CommaDelimitedList` to nested stacks.
     *
     *
     * Conditional. Required if the nested stack requires input parameters.
     *
     * Whether an update causes interruptions depends on the resources that are being updated. An
     * update never causes a nested stack to be replaced.
     */
    public fun parameters(parameters: IResolvable)

    /**
     * @param parameters The set value pairs that represent the parameters passed to CloudFormation
     * when this nested stack is created.
     * Each parameter has a name corresponding to a parameter defined in the embedded template and a
     * value representing the value that you want to set for the parameter.
     *
     *
     * If you use the `Ref` function to pass a parameter value to a nested stack, comma-delimited
     * list parameters must be of type `String` . In other words, you can't pass values that are of
     * type `CommaDelimitedList` to nested stacks.
     *
     *
     * Conditional. Required if the nested stack requires input parameters.
     *
     * Whether an update causes interruptions depends on the resources that are being updated. An
     * update never causes a nested stack to be replaced.
     */
    public fun parameters(parameters: Map<String, String>)

    /**
     * @param tags Key-value pairs to associate with this stack.
     * CloudFormation also propagates these tags to the resources created in the stack. A maximum
     * number of 50 tags can be specified.
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * @param tags Key-value pairs to associate with this stack.
     * CloudFormation also propagates these tags to the resources created in the stack. A maximum
     * number of 50 tags can be specified.
     */
    public fun tags(vararg tags: CfnTag)

    /**
     * @param templateUrl Location of file containing the template body.
     * The URL must point to a template (max size: 460,800 bytes) that's located in an Amazon S3
     * bucket. For more information, see [Template
     * anatomy](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/template-anatomy.html) .
     *
     * Whether an update causes interruptions depends on the resources that are being updated. An
     * update never causes a nested stack to be replaced.
     */
    public fun templateUrl(templateUrl: String)

    /**
     * @param timeoutInMinutes The length of time, in minutes, that CloudFormation waits for the
     * nested stack to reach the `CREATE_COMPLETE` state.
     * The default is no timeout. When CloudFormation detects that the nested stack has reached the
     * `CREATE_COMPLETE` state, it marks the nested stack resource as `CREATE_COMPLETE` in the parent
     * stack and resumes creating the parent stack. If the timeout period expires before the nested
     * stack reaches `CREATE_COMPLETE` , CloudFormation marks the nested stack as failed and rolls back
     * both the nested stack and parent stack.
     *
     * Updates aren't supported.
     */
    public fun timeoutInMinutes(timeoutInMinutes: Number)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.CfnStackProps.Builder =
        software.amazon.awscdk.CfnStackProps.builder()

    /**
     * @param notificationArns The Amazon SNS topic ARNs to publish stack related events.
     * You can find your Amazon SNS topic ARNs using the Amazon SNS console or your Command Line
     * Interface (CLI).
     */
    override fun notificationArns(notificationArns: List<String>) {
      cdkBuilder.notificationArns(notificationArns)
    }

    /**
     * @param notificationArns The Amazon SNS topic ARNs to publish stack related events.
     * You can find your Amazon SNS topic ARNs using the Amazon SNS console or your Command Line
     * Interface (CLI).
     */
    override fun notificationArns(vararg notificationArns: String): Unit =
        notificationArns(notificationArns.toList())

    /**
     * @param parameters The set value pairs that represent the parameters passed to CloudFormation
     * when this nested stack is created.
     * Each parameter has a name corresponding to a parameter defined in the embedded template and a
     * value representing the value that you want to set for the parameter.
     *
     *
     * If you use the `Ref` function to pass a parameter value to a nested stack, comma-delimited
     * list parameters must be of type `String` . In other words, you can't pass values that are of
     * type `CommaDelimitedList` to nested stacks.
     *
     *
     * Conditional. Required if the nested stack requires input parameters.
     *
     * Whether an update causes interruptions depends on the resources that are being updated. An
     * update never causes a nested stack to be replaced.
     */
    override fun parameters(parameters: IResolvable) {
      cdkBuilder.parameters(parameters.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param parameters The set value pairs that represent the parameters passed to CloudFormation
     * when this nested stack is created.
     * Each parameter has a name corresponding to a parameter defined in the embedded template and a
     * value representing the value that you want to set for the parameter.
     *
     *
     * If you use the `Ref` function to pass a parameter value to a nested stack, comma-delimited
     * list parameters must be of type `String` . In other words, you can't pass values that are of
     * type `CommaDelimitedList` to nested stacks.
     *
     *
     * Conditional. Required if the nested stack requires input parameters.
     *
     * Whether an update causes interruptions depends on the resources that are being updated. An
     * update never causes a nested stack to be replaced.
     */
    override fun parameters(parameters: Map<String, String>) {
      cdkBuilder.parameters(parameters)
    }

    /**
     * @param tags Key-value pairs to associate with this stack.
     * CloudFormation also propagates these tags to the resources created in the stack. A maximum
     * number of 50 tags can be specified.
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag.Companion::unwrap))
    }

    /**
     * @param tags Key-value pairs to associate with this stack.
     * CloudFormation also propagates these tags to the resources created in the stack. A maximum
     * number of 50 tags can be specified.
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    /**
     * @param templateUrl Location of file containing the template body.
     * The URL must point to a template (max size: 460,800 bytes) that's located in an Amazon S3
     * bucket. For more information, see [Template
     * anatomy](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/template-anatomy.html) .
     *
     * Whether an update causes interruptions depends on the resources that are being updated. An
     * update never causes a nested stack to be replaced.
     */
    override fun templateUrl(templateUrl: String) {
      cdkBuilder.templateUrl(templateUrl)
    }

    /**
     * @param timeoutInMinutes The length of time, in minutes, that CloudFormation waits for the
     * nested stack to reach the `CREATE_COMPLETE` state.
     * The default is no timeout. When CloudFormation detects that the nested stack has reached the
     * `CREATE_COMPLETE` state, it marks the nested stack resource as `CREATE_COMPLETE` in the parent
     * stack and resumes creating the parent stack. If the timeout period expires before the nested
     * stack reaches `CREATE_COMPLETE` , CloudFormation marks the nested stack as failed and rolls back
     * both the nested stack and parent stack.
     *
     * Updates aren't supported.
     */
    override fun timeoutInMinutes(timeoutInMinutes: Number) {
      cdkBuilder.timeoutInMinutes(timeoutInMinutes)
    }

    public fun build(): software.amazon.awscdk.CfnStackProps = cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.CfnStackProps,
  ) : CdkObject(cdkObject),
      CfnStackProps {
    /**
     * The Amazon SNS topic ARNs to publish stack related events.
     *
     * You can find your Amazon SNS topic ARNs using the Amazon SNS console or your Command Line
     * Interface (CLI).
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudformation-stack.html#cfn-cloudformation-stack-notificationarns)
     */
    override fun notificationArns(): List<String> = unwrap(this).getNotificationArns() ?:
        emptyList()

    /**
     * The set value pairs that represent the parameters passed to CloudFormation when this nested
     * stack is created.
     *
     * Each parameter has a name corresponding to a parameter defined in the embedded template and a
     * value representing the value that you want to set for the parameter.
     *
     *
     * If you use the `Ref` function to pass a parameter value to a nested stack, comma-delimited
     * list parameters must be of type `String` . In other words, you can't pass values that are of
     * type `CommaDelimitedList` to nested stacks.
     *
     *
     * Conditional. Required if the nested stack requires input parameters.
     *
     * Whether an update causes interruptions depends on the resources that are being updated. An
     * update never causes a nested stack to be replaced.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudformation-stack.html#cfn-cloudformation-stack-parameters)
     */
    override fun parameters(): Any? = unwrap(this).getParameters()

    /**
     * Key-value pairs to associate with this stack.
     *
     * CloudFormation also propagates these tags to the resources created in the stack. A maximum
     * number of 50 tags can be specified.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudformation-stack.html#cfn-cloudformation-stack-tags)
     */
    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

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
     */
    override fun templateUrl(): String? = unwrap(this).getTemplateUrl()

    /**
     * The length of time, in minutes, that CloudFormation waits for the nested stack to reach the
     * `CREATE_COMPLETE` state.
     *
     * The default is no timeout. When CloudFormation detects that the nested stack has reached the
     * `CREATE_COMPLETE` state, it marks the nested stack resource as `CREATE_COMPLETE` in the parent
     * stack and resumes creating the parent stack. If the timeout period expires before the nested
     * stack reaches `CREATE_COMPLETE` , CloudFormation marks the nested stack as failed and rolls back
     * both the nested stack and parent stack.
     *
     * Updates aren't supported.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudformation-stack.html#cfn-cloudformation-stack-timeoutinminutes)
     */
    override fun timeoutInMinutes(): Number? = unwrap(this).getTimeoutInMinutes()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnStackProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.CfnStackProps): CfnStackProps =
        CdkObjectWrappers.wrap(cdkObject) as? CfnStackProps ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnStackProps): software.amazon.awscdk.CfnStackProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.CfnStackProps
  }
}
