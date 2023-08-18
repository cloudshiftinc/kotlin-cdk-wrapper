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
import software.amazon.awscdk.services.servicecatalogappregistry.CfnResourceAssociationProps

/**
 * Properties for defining a `CfnResourceAssociation`.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.servicecatalogappregistry.*;
 * CfnResourceAssociationProps cfnResourceAssociationProps = CfnResourceAssociationProps.builder()
 * .application("application")
 * .resource("resource")
 * .resourceType("resourceType")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalogappregistry-resourceassociation.html)
 */
@CdkDslMarker
public class CfnResourceAssociationPropsDsl {
    private val cdkBuilder: CfnResourceAssociationProps.Builder =
        CfnResourceAssociationProps.builder()

    /** @param application The name or ID of the application. */
    public fun application(application: String) {
        cdkBuilder.application(application)
    }

    /**
     * @param resource The name or ID of the resource of which the application will be associated.
     */
    public fun resource(resource: String) {
        cdkBuilder.resource(resource)
    }

    /** @param resourceType The type of resource of which the application will be associated. */
    public fun resourceType(resourceType: String) {
        cdkBuilder.resourceType(resourceType)
    }

    public fun build(): CfnResourceAssociationProps = cdkBuilder.build()
}
