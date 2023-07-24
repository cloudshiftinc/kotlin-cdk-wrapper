@file:Suppress("RedundantVisibilityModifier", "RedundantUnitReturnType", "RemoveRedundantQualifierName", "unused", "UnusedImport", "ClassName", "REDUNDANT_PROJECTION", "DEPRECATION")

package cloudshift.awscdk.dsl.pipelines

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.Stage
import software.amazon.awscdk.pipelines.PermissionsBroadeningCheckProps
import software.amazon.awscdk.services.sns.ITopic

/**
 * Properties for a `PermissionsBroadeningCheck`.
 *
 * Example:
 *
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
public class PermissionsBroadeningCheckPropsDsl {
    private val cdkBuilder: PermissionsBroadeningCheckProps.Builder =
        PermissionsBroadeningCheckProps.builder()

    /**
     * @param notificationTopic Topic to send notifications when a human needs to give manual
     * confirmation.
     */
    public fun notificationTopic(notificationTopic: ITopic) {
        cdkBuilder.notificationTopic(notificationTopic)
    }

    /**
     * @param stage The CDK Stage object to check the stacks of.
     * This should be the same Stage object you are passing to `addStage()`.
     */
    public fun stage(stage: Stage) {
        cdkBuilder.stage(stage)
    }

    public fun build(): PermissionsBroadeningCheckProps = cdkBuilder.build()
}
