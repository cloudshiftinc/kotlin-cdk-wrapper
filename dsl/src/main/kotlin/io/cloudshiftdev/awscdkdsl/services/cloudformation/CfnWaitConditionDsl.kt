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

package io.cloudshiftdev.awscdkdsl.services.cloudformation

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import software.amazon.awscdk.services.cloudformation.CfnWaitCondition
import software.constructs.Construct

/**
 * For Amazon EC2 and Auto Scaling resources, we recommend that you use a `CreationPolicy` attribute
 * instead of wait conditions.
 *
 * Add a CreationPolicy attribute to those resources, and use the cfn-signal helper script to signal
 * when an instance creation process has completed successfully.
 *
 * You can use a wait condition for situations like the following:
 * * To coordinate stack resource creation with configuration actions that are external to the stack
 *   creation.
 * * To track the status of a configuration process.
 *
 * For these situations, we recommend that you associate a
 * [CreationPolicy](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-attribute-creationpolicy.html)
 * attribute with the wait condition so that you don't have to use a wait condition handle. For more
 * information and an example, see
 * [Creating wait conditions in a template](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/using-cfn-waitcondition.html)
 * . If you use a CreationPolicy with a wait condition, don't specify any of the wait condition's
 * properties.
 *
 * If you use the
 * [VPC endpoints](https://docs.aws.amazon.com/vpc/latest/userguide/vpc-endpoints.html) feature,
 * resources in the VPC that respond to wait conditions must have access to CloudFormation ,
 * specific Amazon Simple Storage Service ( Amazon S3 ) buckets. Resources must send wait condition
 * responses to a presigned Amazon S3 URL. If they can't send responses to Amazon S3 ,
 * CloudFormation won't receive a response and the stack operation fails. For more information, see
 * [Setting up VPC endpoints for AWS CloudFormation](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/cfn-vpce-bucketnames.html)
 * .
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.cloudformation.*;
 * CfnWaitCondition cfnWaitCondition = CfnWaitCondition.Builder.create(this, "MyCfnWaitCondition")
 * .count(123)
 * .handle("handle")
 * .timeout("timeout")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudformation-waitcondition.html)
 */
@CdkDslMarker
public class CfnWaitConditionDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnWaitCondition.Builder = CfnWaitCondition.Builder.create(scope, id)

    /**
     * The number of success signals that CloudFormation must receive before it continues the stack
     * creation process.
     *
     * When the wait condition receives the requisite number of success signals, CloudFormation
     * resumes the creation of the stack. If the wait condition doesn't receive the specified number
     * of success signals before the Timeout period expires, CloudFormation assumes that the wait
     * condition has failed and rolls the stack back.
     *
     * Updates aren't supported.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudformation-waitcondition.html#cfn-cloudformation-waitcondition-count)
     *
     * @param count The number of success signals that CloudFormation must receive before it
     *   continues the stack creation process.
     */
    public fun count(count: Number) {
        cdkBuilder.count(count)
    }

    /**
     * A reference to the wait condition handle used to signal this wait condition.
     *
     * Use the `Ref` intrinsic function to specify an
     * [`AWS::CloudFormation::WaitConditionHandle`](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-waitconditionhandle.html)
     * resource.
     *
     * Anytime you add a `WaitCondition` resource during a stack update, you must associate the wait
     * condition with a new WaitConditionHandle resource. Don't reuse an old wait condition handle
     * that has already been defined in the template. If you reuse a wait condition handle, the wait
     * condition might evaluate old signals from a previous create or update stack command.
     *
     * Updates aren't supported.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudformation-waitcondition.html#cfn-cloudformation-waitcondition-handle)
     *
     * @param handle A reference to the wait condition handle used to signal this wait condition.
     */
    public fun handle(handle: String) {
        cdkBuilder.handle(handle)
    }

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
     *
     * @param timeout The length of time (in seconds) to wait for the number of signals that the
     *   `Count` property specifies.
     */
    public fun timeout(timeout: String) {
        cdkBuilder.timeout(timeout)
    }

    public fun build(): CfnWaitCondition = cdkBuilder.build()
}
