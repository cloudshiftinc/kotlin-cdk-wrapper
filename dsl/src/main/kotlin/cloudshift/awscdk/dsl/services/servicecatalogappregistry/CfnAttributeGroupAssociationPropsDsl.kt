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

package cloudshift.awscdk.dsl.services.servicecatalogappregistry

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.servicecatalogappregistry.CfnAttributeGroupAssociationProps
import kotlin.String

@CdkDslMarker
public class CfnAttributeGroupAssociationPropsDsl {
    private val cdkBuilder: CfnAttributeGroupAssociationProps.Builder =
        CfnAttributeGroupAssociationProps.builder()

    public fun application(application: String) {
        cdkBuilder.application(application)
    }

    public fun attributeGroup(attributeGroup: String) {
        cdkBuilder.attributeGroup(attributeGroup)
    }

    public fun build(): CfnAttributeGroupAssociationProps = cdkBuilder.build()
}
