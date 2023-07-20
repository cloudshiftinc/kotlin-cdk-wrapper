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

package cloudshift.awscdk.dsl.services.robomaker

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.robomaker.CfnRobot
import software.constructs.Construct
import kotlin.String
import kotlin.collections.Map

@CdkDslMarker
public class CfnRobotDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnRobot.Builder = CfnRobot.Builder.create(scope, id)

    public fun architecture(architecture: String) {
        cdkBuilder.architecture(architecture)
    }

    public fun fleet(fleet: String) {
        cdkBuilder.fleet(fleet)
    }

    public fun greengrassGroupId(greengrassGroupId: String) {
        cdkBuilder.greengrassGroupId(greengrassGroupId)
    }

    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    public fun tags(tags: Map<String, String>) {
        cdkBuilder.tags(tags)
    }

    public fun build(): CfnRobot = cdkBuilder.build()
}
