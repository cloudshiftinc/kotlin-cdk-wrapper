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
import software.amazon.awscdk.services.resourceexplorer2.CfnDefaultViewAssociation
import software.constructs.Construct
import kotlin.String

@CdkDslMarker
public class CfnDefaultViewAssociationDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnDefaultViewAssociation.Builder =
        CfnDefaultViewAssociation.Builder.create(scope, id)

    public fun viewArn(viewArn: String) {
        cdkBuilder.viewArn(viewArn)
    }

    public fun build(): CfnDefaultViewAssociation = cdkBuilder.build()
}
