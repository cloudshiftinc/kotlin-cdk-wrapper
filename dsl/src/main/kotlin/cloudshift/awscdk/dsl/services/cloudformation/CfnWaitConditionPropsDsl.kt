@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION"
)

package cloudshift.awscdk.dsl.services.cloudformation

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import software.amazon.awscdk.services.cloudformation.CfnWaitConditionProps

/**
 * Properties for defining a `CfnWaitCondition`.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.cloudformation.*;
 * CfnWaitConditionProps cfnWaitConditionProps = CfnWaitConditionProps.builder()
 * .count(123)
 * .handle("handle")
 * .timeout("timeout")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudformation-waitcondition.html)
 */
@CdkDslMarker
public class CfnWaitConditionPropsDsl {
    private val cdkBuilder: CfnWaitConditionProps.Builder = CfnWaitConditionProps.builder()

    /**
     * @param count The number of success signals that CloudFormation must receive before it
     *   continues the stack creation process. When the wait condition receives the requisite number
     *   of success signals, CloudFormation resumes the creation of the stack. If the wait condition
     *   doesn't receive the specified number of success signals before the Timeout period expires,
     *   CloudFormation assumes that the wait condition has failed and rolls the stack back.
     *
     * Updates aren't supported.
     */
    public fun count(count: Number) {
        cdkBuilder.count(count)
    }

    /**
     * @param handle A reference to the wait condition handle used to signal this wait condition.
     *   Use the `Ref` intrinsic function to specify an
     *   [`AWS::CloudFormation::WaitConditionHandle`](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-waitconditionhandle.html)
     *   resource.
     *
     * Anytime you add a `WaitCondition` resource during a stack update, you must associate the wait
     * condition with a new WaitConditionHandle resource. Don't reuse an old wait condition handle
     * that has already been defined in the template. If you reuse a wait condition handle, the wait
     * condition might evaluate old signals from a previous create or update stack command.
     *
     * Updates aren't supported.
     */
    public fun handle(handle: String) {
        cdkBuilder.handle(handle)
    }

    /**
     * @param timeout The length of time (in seconds) to wait for the number of signals that the
     *   `Count` property specifies. `Timeout` is a minimum-bound property, meaning the timeout
     *   occurs no sooner than the time you specify, but can occur shortly thereafter. The maximum
     *   time that can be specified for this property is 12 hours (43200 seconds).
     *
     * Updates aren't supported.
     */
    public fun timeout(timeout: String) {
        cdkBuilder.timeout(timeout)
    }

    public fun build(): CfnWaitConditionProps = cdkBuilder.build()
}
