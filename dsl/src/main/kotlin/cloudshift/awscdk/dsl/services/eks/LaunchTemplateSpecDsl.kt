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

package cloudshift.awscdk.dsl.services.eks

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.eks.LaunchTemplateSpec
import kotlin.String

@CdkDslMarker
public class LaunchTemplateSpecDsl {
    private val cdkBuilder: LaunchTemplateSpec.Builder = LaunchTemplateSpec.builder()

    public fun id(id: String) {
        cdkBuilder.id(id)
    }

    public fun version(version: String) {
        cdkBuilder.version(version)
    }

    public fun build(): LaunchTemplateSpec = cdkBuilder.build()
}
