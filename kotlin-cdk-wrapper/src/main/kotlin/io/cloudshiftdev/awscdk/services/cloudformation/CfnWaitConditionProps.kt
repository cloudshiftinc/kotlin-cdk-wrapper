@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.cloudformation

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Number
import kotlin.String
import kotlin.Unit

/**
 * Properties for defining a `CfnWaitCondition`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.cloudformation.*;
 * CfnWaitConditionProps cfnWaitConditionProps = CfnWaitConditionProps.builder()
 * .count(123)
 * .handle("handle")
 * .timeout("timeout")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudformation-waitcondition.html)
 */
public interface CfnWaitConditionProps {
  /**
   * The number of success signals that CloudFormation must receive before it continues the stack
   * creation process.
   *
   * When the wait condition receives the requisite number of success signals, CloudFormation
   * resumes the creation of the stack. If the wait condition doesn't receive the specified number of
   * success signals before the Timeout period expires, CloudFormation assumes that the wait condition
   * has failed and rolls the stack back.
   *
   * Updates aren't supported.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudformation-waitcondition.html#cfn-cloudformation-waitcondition-count)
   */
  public fun count(): Number? = unwrap(this).getCount()

  /**
   * A reference to the wait condition handle used to signal this wait condition.
   *
   * Use the `Ref` intrinsic function to specify an
   * [`AWS::CloudFormation::WaitConditionHandle`](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-waitconditionhandle.html)
   * resource.
   *
   * Anytime you add a `WaitCondition` resource during a stack update, you must associate the wait
   * condition with a new WaitConditionHandle resource. Don't reuse an old wait condition handle that
   * has already been defined in the template. If you reuse a wait condition handle, the wait condition
   * might evaluate old signals from a previous create or update stack command.
   *
   * Updates aren't supported.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudformation-waitcondition.html#cfn-cloudformation-waitcondition-handle)
   */
  public fun handle(): String? = unwrap(this).getHandle()

  /**
   * The length of time (in seconds) to wait for the number of signals that the `Count` property
   * specifies.
   *
   * `Timeout` is a minimum-bound property, meaning the timeout occurs no sooner than the time you
   * specify, but can occur shortly thereafter. The maximum time that can be specified for this
   * property is 12 hours (43200 seconds).
   *
   * Updates aren't supported.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudformation-waitcondition.html#cfn-cloudformation-waitcondition-timeout)
   */
  public fun timeout(): String? = unwrap(this).getTimeout()

  /**
   * A builder for [CfnWaitConditionProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param count The number of success signals that CloudFormation must receive before it
     * continues the stack creation process.
     * When the wait condition receives the requisite number of success signals, CloudFormation
     * resumes the creation of the stack. If the wait condition doesn't receive the specified number of
     * success signals before the Timeout period expires, CloudFormation assumes that the wait
     * condition has failed and rolls the stack back.
     *
     * Updates aren't supported.
     */
    public fun count(count: Number)

    /**
     * @param handle A reference to the wait condition handle used to signal this wait condition.
     * Use the `Ref` intrinsic function to specify an
     * [`AWS::CloudFormation::WaitConditionHandle`](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-waitconditionhandle.html)
     * resource.
     *
     * Anytime you add a `WaitCondition` resource during a stack update, you must associate the wait
     * condition with a new WaitConditionHandle resource. Don't reuse an old wait condition handle that
     * has already been defined in the template. If you reuse a wait condition handle, the wait
     * condition might evaluate old signals from a previous create or update stack command.
     *
     * Updates aren't supported.
     */
    public fun handle(handle: String)

    /**
     * @param timeout The length of time (in seconds) to wait for the number of signals that the
     * `Count` property specifies.
     * `Timeout` is a minimum-bound property, meaning the timeout occurs no sooner than the time you
     * specify, but can occur shortly thereafter. The maximum time that can be specified for this
     * property is 12 hours (43200 seconds).
     *
     * Updates aren't supported.
     */
    public fun timeout(timeout: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.cloudformation.CfnWaitConditionProps.Builder =
        software.amazon.awscdk.services.cloudformation.CfnWaitConditionProps.builder()

    /**
     * @param count The number of success signals that CloudFormation must receive before it
     * continues the stack creation process.
     * When the wait condition receives the requisite number of success signals, CloudFormation
     * resumes the creation of the stack. If the wait condition doesn't receive the specified number of
     * success signals before the Timeout period expires, CloudFormation assumes that the wait
     * condition has failed and rolls the stack back.
     *
     * Updates aren't supported.
     */
    override fun count(count: Number) {
      cdkBuilder.count(count)
    }

    /**
     * @param handle A reference to the wait condition handle used to signal this wait condition.
     * Use the `Ref` intrinsic function to specify an
     * [`AWS::CloudFormation::WaitConditionHandle`](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-waitconditionhandle.html)
     * resource.
     *
     * Anytime you add a `WaitCondition` resource during a stack update, you must associate the wait
     * condition with a new WaitConditionHandle resource. Don't reuse an old wait condition handle that
     * has already been defined in the template. If you reuse a wait condition handle, the wait
     * condition might evaluate old signals from a previous create or update stack command.
     *
     * Updates aren't supported.
     */
    override fun handle(handle: String) {
      cdkBuilder.handle(handle)
    }

    /**
     * @param timeout The length of time (in seconds) to wait for the number of signals that the
     * `Count` property specifies.
     * `Timeout` is a minimum-bound property, meaning the timeout occurs no sooner than the time you
     * specify, but can occur shortly thereafter. The maximum time that can be specified for this
     * property is 12 hours (43200 seconds).
     *
     * Updates aren't supported.
     */
    override fun timeout(timeout: String) {
      cdkBuilder.timeout(timeout)
    }

    public fun build(): software.amazon.awscdk.services.cloudformation.CfnWaitConditionProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.cloudformation.CfnWaitConditionProps,
  ) : CdkObject(cdkObject), CfnWaitConditionProps {
    /**
     * The number of success signals that CloudFormation must receive before it continues the stack
     * creation process.
     *
     * When the wait condition receives the requisite number of success signals, CloudFormation
     * resumes the creation of the stack. If the wait condition doesn't receive the specified number of
     * success signals before the Timeout period expires, CloudFormation assumes that the wait
     * condition has failed and rolls the stack back.
     *
     * Updates aren't supported.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudformation-waitcondition.html#cfn-cloudformation-waitcondition-count)
     */
    override fun count(): Number? = unwrap(this).getCount()

    /**
     * A reference to the wait condition handle used to signal this wait condition.
     *
     * Use the `Ref` intrinsic function to specify an
     * [`AWS::CloudFormation::WaitConditionHandle`](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-waitconditionhandle.html)
     * resource.
     *
     * Anytime you add a `WaitCondition` resource during a stack update, you must associate the wait
     * condition with a new WaitConditionHandle resource. Don't reuse an old wait condition handle that
     * has already been defined in the template. If you reuse a wait condition handle, the wait
     * condition might evaluate old signals from a previous create or update stack command.
     *
     * Updates aren't supported.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudformation-waitcondition.html#cfn-cloudformation-waitcondition-handle)
     */
    override fun handle(): String? = unwrap(this).getHandle()

    /**
     * The length of time (in seconds) to wait for the number of signals that the `Count` property
     * specifies.
     *
     * `Timeout` is a minimum-bound property, meaning the timeout occurs no sooner than the time you
     * specify, but can occur shortly thereafter. The maximum time that can be specified for this
     * property is 12 hours (43200 seconds).
     *
     * Updates aren't supported.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudformation-waitcondition.html#cfn-cloudformation-waitcondition-timeout)
     */
    override fun timeout(): String? = unwrap(this).getTimeout()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnWaitConditionProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.cloudformation.CfnWaitConditionProps):
        CfnWaitConditionProps = CdkObjectWrappers.wrap(cdkObject) as? CfnWaitConditionProps ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnWaitConditionProps):
        software.amazon.awscdk.services.cloudformation.CfnWaitConditionProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.cloudformation.CfnWaitConditionProps
  }
}
