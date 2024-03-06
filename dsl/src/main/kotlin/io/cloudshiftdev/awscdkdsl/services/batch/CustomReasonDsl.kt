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

package io.cloudshiftdev.awscdkdsl.services.batch

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.batch.CustomReason

/**
 * The corresponding Action will only be taken if *all* of the conditions specified here are met.
 *
 * Example:
 * ```
 * EcsJobDefinition jobDefn = EcsJobDefinition.Builder.create(this, "JobDefn")
 * .container(EcsEc2ContainerDefinition.Builder.create(this, "containerDefn")
 * .image(ContainerImage.fromRegistry("public.ecr.aws/amazonlinux/amazonlinux:latest"))
 * .memory(Size.mebibytes(2048))
 * .cpu(256)
 * .build())
 * .retryAttempts(5)
 * .retryStrategies(List.of(RetryStrategy.of(Action.EXIT, Reason.CANNOT_PULL_CONTAINER)))
 * .build();
 * jobDefn.addRetryStrategy(RetryStrategy.of(Action.EXIT, Reason.SPOT_INSTANCE_RECLAIMED));
 * jobDefn.addRetryStrategy(RetryStrategy.of(Action.EXIT, Reason.CANNOT_PULL_CONTAINER));
 * jobDefn.addRetryStrategy(RetryStrategy.of(Action.EXIT, Reason.custom(CustomReason.builder()
 * .onExitCode("40*")
 * .onReason("some reason")
 * .build())));
 * ```
 */
@CdkDslMarker
public class CustomReasonDsl {
    private val cdkBuilder: CustomReason.Builder = CustomReason.builder()

    /**
     * @param onExitCode A glob string that will match on the job exit code. For example, `'40*'`
     *   will match 400, 404, 40123456789012
     */
    public fun onExitCode(onExitCode: String) {
        cdkBuilder.onExitCode(onExitCode)
    }

    /**
     * @param onReason A glob string that will match on the reason returned by the exiting job For
     *   example, `'CannotPullContainerError*'` indicates that container needed to start the job
     *   could not be pulled.
     */
    public fun onReason(onReason: String) {
        cdkBuilder.onReason(onReason)
    }

    /**
     * @param onStatusReason A glob string that will match on the statusReason returned by the
     *   exiting job. For example, `'Host EC2*'` indicates that the spot instance has been
     *   reclaimed.
     */
    public fun onStatusReason(onStatusReason: String) {
        cdkBuilder.onStatusReason(onStatusReason)
    }

    public fun build(): CustomReason = cdkBuilder.build()
}
