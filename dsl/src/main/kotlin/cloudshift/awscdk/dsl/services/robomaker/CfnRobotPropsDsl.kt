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
import software.amazon.awscdk.services.robomaker.CfnRobotProps
import kotlin.String
import kotlin.collections.Map

@CdkDslMarker
public class CfnRobotPropsDsl {
    private val cdkBuilder: CfnRobotProps.Builder = CfnRobotProps.builder()

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

    public fun build(): CfnRobotProps = cdkBuilder.build()
}
