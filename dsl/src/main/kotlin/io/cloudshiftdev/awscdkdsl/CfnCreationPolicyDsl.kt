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

package io.cloudshiftdev.awscdkdsl

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.Boolean
import kotlin.Unit
import software.amazon.awscdk.CfnCreationPolicy
import software.amazon.awscdk.CfnResourceAutoScalingCreationPolicy
import software.amazon.awscdk.CfnResourceSignal

/**
 * Associate the CreationPolicy attribute with a resource to prevent its status from reaching create
 * complete until AWS CloudFormation receives a specified number of success signals or the timeout
 * period is exceeded.
 *
 * To signal a resource, you can use the cfn-signal helper script or SignalResource API. AWS
 * CloudFormation publishes valid signals to the stack events so that you track the number of
 * signals sent.
 *
 * The creation policy is invoked only when AWS CloudFormation creates the associated resource.
 * Currently, the only AWS CloudFormation resources that support creation policies are
 * AWS::AutoScaling::AutoScalingGroup, AWS::EC2::Instance, AWS::CloudFormation::WaitCondition and
 * AWS::AppStream::Fleet.
 *
 * Use the CreationPolicy attribute when you want to wait on resource configuration actions before
 * stack creation proceeds. For example, if you install and configure software applications on an
 * EC2 instance, you might want those applications to be running before proceeding. In such cases,
 * you can add a CreationPolicy attribute to the instance, and then send a success signal to the
 * instance after the applications are installed and configured. For a detailed example, see
 * Deploying Applications on Amazon EC2 with AWS CloudFormation.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.*;
 * CfnCreationPolicy cfnCreationPolicy = CfnCreationPolicy.builder()
 * .autoScalingCreationPolicy(CfnResourceAutoScalingCreationPolicy.builder()
 * .minSuccessfulInstancesPercent(123)
 * .build())
 * .resourceSignal(CfnResourceSignal.builder()
 * .count(123)
 * .timeout("timeout")
 * .build())
 * .startFleet(false)
 * .build();
 * ```
 */
@CdkDslMarker
public class CfnCreationPolicyDsl {
    private val cdkBuilder: CfnCreationPolicy.Builder = CfnCreationPolicy.builder()

    /**
     * @param autoScalingCreationPolicy For an Auto Scaling group replacement update, specifies how
     *   many instances must signal success for the update to succeed.
     */
    public fun autoScalingCreationPolicy(
        autoScalingCreationPolicy: CfnResourceAutoScalingCreationPolicyDsl.() -> Unit = {}
    ) {
        val builder = CfnResourceAutoScalingCreationPolicyDsl()
        builder.apply(autoScalingCreationPolicy)
        cdkBuilder.autoScalingCreationPolicy(builder.build())
    }

    /**
     * @param autoScalingCreationPolicy For an Auto Scaling group replacement update, specifies how
     *   many instances must signal success for the update to succeed.
     */
    public fun autoScalingCreationPolicy(
        autoScalingCreationPolicy: CfnResourceAutoScalingCreationPolicy
    ) {
        cdkBuilder.autoScalingCreationPolicy(autoScalingCreationPolicy)
    }

    /**
     * @param resourceSignal When AWS CloudFormation creates the associated resource, configures the
     *   number of required success signals and the length of time that AWS CloudFormation waits for
     *   those signals.
     */
    public fun resourceSignal(resourceSignal: CfnResourceSignalDsl.() -> Unit = {}) {
        val builder = CfnResourceSignalDsl()
        builder.apply(resourceSignal)
        cdkBuilder.resourceSignal(builder.build())
    }

    /**
     * @param resourceSignal When AWS CloudFormation creates the associated resource, configures the
     *   number of required success signals and the length of time that AWS CloudFormation waits for
     *   those signals.
     */
    public fun resourceSignal(resourceSignal: CfnResourceSignal) {
        cdkBuilder.resourceSignal(resourceSignal)
    }

    /**
     * @param startFleet For an AppStream Fleet creation, specifies that the fleet is started after
     *   creation.
     */
    public fun startFleet(startFleet: Boolean) {
        cdkBuilder.startFleet(startFleet)
    }

    public fun build(): CfnCreationPolicy = cdkBuilder.build()
}
