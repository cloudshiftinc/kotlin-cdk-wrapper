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

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnTemplate

@CdkDslMarker
public class CfnTemplateDonutOptionsPropertyDsl {
    private val cdkBuilder: CfnTemplate.DonutOptionsProperty.Builder =
        CfnTemplate.DonutOptionsProperty.builder()

    public fun arcOptions(arcOptions: IResolvable) {
        cdkBuilder.arcOptions(arcOptions)
    }

    public fun arcOptions(arcOptions: CfnTemplate.ArcOptionsProperty) {
        cdkBuilder.arcOptions(arcOptions)
    }

    public fun donutCenterOptions(donutCenterOptions: IResolvable) {
        cdkBuilder.donutCenterOptions(donutCenterOptions)
    }

    public fun donutCenterOptions(donutCenterOptions: CfnTemplate.DonutCenterOptionsProperty) {
        cdkBuilder.donutCenterOptions(donutCenterOptions)
    }

    public fun build(): CfnTemplate.DonutOptionsProperty = cdkBuilder.build()
}
