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

package cloudshift.awscdk.dsl.services.servicecatalog

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.servicecatalog.CfnTagOptionAssociationProps
import kotlin.String

@CdkDslMarker
public class CfnTagOptionAssociationPropsDsl {
    private val cdkBuilder: CfnTagOptionAssociationProps.Builder =
        CfnTagOptionAssociationProps.builder()

    public fun resourceId(resourceId: String) {
        cdkBuilder.resourceId(resourceId)
    }

    public fun tagOptionId(tagOptionId: String) {
        cdkBuilder.tagOptionId(tagOptionId)
    }

    public fun build(): CfnTagOptionAssociationProps = cdkBuilder.build()
}
