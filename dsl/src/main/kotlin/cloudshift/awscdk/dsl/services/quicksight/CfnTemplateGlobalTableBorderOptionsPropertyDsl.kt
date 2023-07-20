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
public class CfnTemplateGlobalTableBorderOptionsPropertyDsl {
    private val cdkBuilder: CfnTemplate.GlobalTableBorderOptionsProperty.Builder =
        CfnTemplate.GlobalTableBorderOptionsProperty.builder()

    public fun sideSpecificBorder(sideSpecificBorder: IResolvable) {
        cdkBuilder.sideSpecificBorder(sideSpecificBorder)
    }

    public fun sideSpecificBorder(sideSpecificBorder: CfnTemplate.TableSideBorderOptionsProperty) {
        cdkBuilder.sideSpecificBorder(sideSpecificBorder)
    }

    public fun uniformBorder(uniformBorder: IResolvable) {
        cdkBuilder.uniformBorder(uniformBorder)
    }

    public fun uniformBorder(uniformBorder: CfnTemplate.TableBorderOptionsProperty) {
        cdkBuilder.uniformBorder(uniformBorder)
    }

    public fun build(): CfnTemplate.GlobalTableBorderOptionsProperty = cdkBuilder.build()
}
