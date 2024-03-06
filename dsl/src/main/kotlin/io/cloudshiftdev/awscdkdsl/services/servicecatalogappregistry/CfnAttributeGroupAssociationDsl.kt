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
import software.amazon.awscdk.services.servicecatalogappregistry.CfnAttributeGroupAssociation
import software.constructs.Construct

/**
 * Associates an attribute group with an application to augment the application's metadata with the
 * group's attributes.
 *
 * This feature enables applications to be described with user-defined details that are
 * machine-readable, such as third-party integrations.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.servicecatalogappregistry.*;
 * CfnAttributeGroupAssociation cfnAttributeGroupAssociation =
 * CfnAttributeGroupAssociation.Builder.create(this, "MyCfnAttributeGroupAssociation")
 * .application("application")
 * .attributeGroup("attributeGroup")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalogappregistry-attributegroupassociation.html)
 */
@CdkDslMarker
public class CfnAttributeGroupAssociationDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnAttributeGroupAssociation.Builder =
        CfnAttributeGroupAssociation.Builder.create(scope, id)

    /**
     * The name or ID of the application.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalogappregistry-attributegroupassociation.html#cfn-servicecatalogappregistry-attributegroupassociation-application)
     *
     * @param application The name or ID of the application.
     */
    public fun application(application: String) {
        cdkBuilder.application(application)
    }

    /**
     * The name or ID of the attribute group which holds the attributes that describe the
     * application.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalogappregistry-attributegroupassociation.html#cfn-servicecatalogappregistry-attributegroupassociation-attributegroup)
     *
     * @param attributeGroup The name or ID of the attribute group which holds the attributes that
     *   describe the application.
     */
    public fun attributeGroup(attributeGroup: String) {
        cdkBuilder.attributeGroup(attributeGroup)
    }

    public fun build(): CfnAttributeGroupAssociation = cdkBuilder.build()
}
