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

package cloudshift.awscdk.dsl.services.ec2

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.ec2.CfnEC2Fleet
import kotlin.String

@CdkDslMarker
public class CfnEC2FleetFleetLaunchTemplateSpecificationRequestPropertyDsl {
    private val cdkBuilder: CfnEC2Fleet.FleetLaunchTemplateSpecificationRequestProperty.Builder =
        CfnEC2Fleet.FleetLaunchTemplateSpecificationRequestProperty.builder()

    public fun launchTemplateId(launchTemplateId: String) {
        cdkBuilder.launchTemplateId(launchTemplateId)
    }

    public fun launchTemplateName(launchTemplateName: String) {
        cdkBuilder.launchTemplateName(launchTemplateName)
    }

    public fun version(version: String) {
        cdkBuilder.version(version)
    }

    public fun build(): CfnEC2Fleet.FleetLaunchTemplateSpecificationRequestProperty =
        cdkBuilder.build()
}
