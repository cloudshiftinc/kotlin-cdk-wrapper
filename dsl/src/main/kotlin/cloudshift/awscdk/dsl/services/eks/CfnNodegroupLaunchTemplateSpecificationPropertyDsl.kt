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
import software.amazon.awscdk.services.eks.CfnNodegroup
import kotlin.String

@CdkDslMarker
public class CfnNodegroupLaunchTemplateSpecificationPropertyDsl {
    private val cdkBuilder: CfnNodegroup.LaunchTemplateSpecificationProperty.Builder =
        CfnNodegroup.LaunchTemplateSpecificationProperty.builder()

    public fun id(id: String) {
        cdkBuilder.id(id)
    }

    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    public fun version(version: String) {
        cdkBuilder.version(version)
    }

    public fun build(): CfnNodegroup.LaunchTemplateSpecificationProperty = cdkBuilder.build()
}
