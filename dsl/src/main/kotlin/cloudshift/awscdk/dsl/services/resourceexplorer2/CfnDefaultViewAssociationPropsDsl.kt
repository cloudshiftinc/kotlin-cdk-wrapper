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

package cloudshift.awscdk.dsl.services.resourceexplorer2

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.resourceexplorer2.CfnDefaultViewAssociationProps
import kotlin.String

@CdkDslMarker
public class CfnDefaultViewAssociationPropsDsl {
    private val cdkBuilder: CfnDefaultViewAssociationProps.Builder =
        CfnDefaultViewAssociationProps.builder()

    public fun viewArn(viewArn: String) {
        cdkBuilder.viewArn(viewArn)
    }

    public fun build(): CfnDefaultViewAssociationProps = cdkBuilder.build()
}
