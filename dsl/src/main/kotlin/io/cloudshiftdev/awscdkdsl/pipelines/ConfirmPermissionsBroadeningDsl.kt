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

package io.cloudshiftdev.awscdkdsl.pipelines

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.Stage
import software.amazon.awscdk.pipelines.ConfirmPermissionsBroadening
import software.amazon.awscdk.services.sns.ITopic

/**
 * Pause the pipeline if a deployment would add IAM permissions or Security Group rules.
 *
 * This step is only supported in CodePipeline pipelines.
 *
 * Example:
 * ```
 * CodePipeline pipeline;
 * MyApplicationStage stage = new MyApplicationStage(this, "MyApplication");
 * pipeline.addStage(stage, AddStageOpts.builder()
 * .pre(List.of(
 * ConfirmPermissionsBroadening.Builder.create("Check").stage(stage).build()))
 * .build());
 * ```
 */
@CdkDslMarker
public class ConfirmPermissionsBroadeningDsl(
    id: String,
) {
    private val cdkBuilder: ConfirmPermissionsBroadening.Builder =
        ConfirmPermissionsBroadening.Builder.create(id)

    /**
     * Topic to send notifications when a human needs to give manual confirmation.
     *
     * Default: - no notification
     *
     * @param notificationTopic Topic to send notifications when a human needs to give manual
     *   confirmation.
     */
    public fun notificationTopic(notificationTopic: ITopic) {
        cdkBuilder.notificationTopic(notificationTopic)
    }

    /**
     * The CDK Stage object to check the stacks of.
     *
     * This should be the same Stage object you are passing to `addStage()`.
     *
     * @param stage The CDK Stage object to check the stacks of.
     */
    public fun stage(stage: Stage) {
        cdkBuilder.stage(stage)
    }

    public fun build(): ConfirmPermissionsBroadening = cdkBuilder.build()
}
