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

package cloudshift.awscdk.dsl.services.codebuild

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.codebuild.CfnProject
import kotlin.String

@CdkDslMarker
public class CfnProjectEnvironmentVariablePropertyDsl {
    private val cdkBuilder: CfnProject.EnvironmentVariableProperty.Builder =
        CfnProject.EnvironmentVariableProperty.builder()

    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    public fun type(type: String) {
        cdkBuilder.type(type)
    }

    public fun `value`(`value`: String) {
        cdkBuilder.`value`(`value`)
    }

    public fun build(): CfnProject.EnvironmentVariableProperty = cdkBuilder.build()
}
