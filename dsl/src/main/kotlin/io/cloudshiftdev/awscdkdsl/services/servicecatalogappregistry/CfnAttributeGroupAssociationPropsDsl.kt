@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION"
)

package io.cloudshiftdev.awscdkdsl.services.servicecatalogappregistry

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.servicecatalogappregistry.CfnAttributeGroupAssociationProps

/**
 * Properties for defining a `CfnAttributeGroupAssociation`.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.servicecatalogappregistry.*;
 * CfnAttributeGroupAssociationProps cfnAttributeGroupAssociationProps =
 * CfnAttributeGroupAssociationProps.builder()
 * .application("application")
 * .attributeGroup("attributeGroup")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalogappregistry-attributegroupassociation.html)
 */
@CdkDslMarker
public class CfnAttributeGroupAssociationPropsDsl {
    private val cdkBuilder: CfnAttributeGroupAssociationProps.Builder =
        CfnAttributeGroupAssociationProps.builder()

    /** @param application The name or ID of the application. */
    public fun application(application: String) {
        cdkBuilder.application(application)
    }

    /**
     * @param attributeGroup The name or ID of the attribute group that holds the attributes to
     *   describe the application.
     */
    public fun attributeGroup(attributeGroup: String) {
        cdkBuilder.attributeGroup(attributeGroup)
    }

    public fun build(): CfnAttributeGroupAssociationProps = cdkBuilder.build()
}
