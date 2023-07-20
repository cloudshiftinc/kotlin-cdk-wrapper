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

package cloudshift.awscdk.dsl.services.autoscaling

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.autoscaling.CfnAutoScalingGroup
import kotlin.Any
import kotlin.collections.Collection
import kotlin.collections.MutableList

@CdkDslMarker
public class CfnAutoScalingGroupLaunchTemplatePropertyDsl {
    private val cdkBuilder: CfnAutoScalingGroup.LaunchTemplateProperty.Builder =
        CfnAutoScalingGroup.LaunchTemplateProperty.builder()

    private val _overrides: MutableList<Any> = mutableListOf()

    public fun launchTemplateSpecification(launchTemplateSpecification: IResolvable) {
        cdkBuilder.launchTemplateSpecification(launchTemplateSpecification)
    }

    public fun launchTemplateSpecification(launchTemplateSpecification: CfnAutoScalingGroup.LaunchTemplateSpecificationProperty) {
        cdkBuilder.launchTemplateSpecification(launchTemplateSpecification)
    }

    public fun overrides(vararg overrides: Any) {
        _overrides.addAll(listOf(*overrides))
    }

    public fun overrides(overrides: Collection<Any>) {
        _overrides.addAll(overrides)
    }

    public fun overrides(overrides: IResolvable) {
        cdkBuilder.overrides(overrides)
    }

    public fun build(): CfnAutoScalingGroup.LaunchTemplateProperty {
        if (_overrides.isNotEmpty()) cdkBuilder.overrides(_overrides)
        return cdkBuilder.build()
    }
}
