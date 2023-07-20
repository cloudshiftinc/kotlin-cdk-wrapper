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
import cloudshift.awscdk.common.MapBuilder
import software.amazon.awscdk.services.codebuild.BuildEnvironmentVariable
import software.amazon.awscdk.services.codebuild.BuildEnvironmentVariableType
import kotlin.Any
import kotlin.Unit

@CdkDslMarker
public class BuildEnvironmentVariableDsl {
    private val cdkBuilder: BuildEnvironmentVariable.Builder = BuildEnvironmentVariable.builder()

    public fun type(type: BuildEnvironmentVariableType) {
        cdkBuilder.type(type)
    }

    public fun `value`(block: MapBuilder.() -> Unit = {}) {
        val builder = MapBuilder()
        builder.apply(block)
        cdkBuilder.`value`(builder.map)
    }

    public fun `value`(`value`: Any) {
        cdkBuilder.`value`(`value`)
    }

    public fun build(): BuildEnvironmentVariable = cdkBuilder.build()
}
