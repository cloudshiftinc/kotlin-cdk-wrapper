@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION",
)

package cloudshift.awscdk.dsl.pipelines

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.Stage
import software.amazon.awscdk.pipelines.PermissionsBroadeningCheckProps
import software.amazon.awscdk.services.sns.ITopic

@CdkDslMarker
public class PermissionsBroadeningCheckPropsDsl {
    private val cdkBuilder: PermissionsBroadeningCheckProps.Builder =
        PermissionsBroadeningCheckProps.builder()

    public fun notificationTopic(notificationTopic: ITopic) {
        cdkBuilder.notificationTopic(notificationTopic)
    }

    public fun stage(stage: Stage) {
        cdkBuilder.stage(stage)
    }

    public fun build(): PermissionsBroadeningCheckProps = cdkBuilder.build()
}
