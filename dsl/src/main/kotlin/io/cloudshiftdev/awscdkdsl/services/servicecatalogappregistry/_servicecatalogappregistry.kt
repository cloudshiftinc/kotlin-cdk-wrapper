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

import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.servicecatalogappregistry.CfnApplication
import software.amazon.awscdk.services.servicecatalogappregistry.CfnApplicationProps
import software.amazon.awscdk.services.servicecatalogappregistry.CfnAttributeGroup
import software.amazon.awscdk.services.servicecatalogappregistry.CfnAttributeGroupAssociation
import software.amazon.awscdk.services.servicecatalogappregistry.CfnAttributeGroupAssociationProps
import software.amazon.awscdk.services.servicecatalogappregistry.CfnAttributeGroupProps
import software.amazon.awscdk.services.servicecatalogappregistry.CfnResourceAssociation
import software.amazon.awscdk.services.servicecatalogappregistry.CfnResourceAssociationProps
import software.constructs.Construct

public object servicecatalogappregistry {
    /**
     * Represents a AWS Service Catalog AppRegistry application that is the top-level node in a
     * hierarchy of related cloud resource abstractions.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.servicecatalogappregistry.*;
     * CfnApplication cfnApplication = CfnApplication.Builder.create(this, "MyCfnApplication")
     * .name("name")
     * // the properties below are optional
     * .description("description")
     * .tags(Map.of(
     * "tagsKey", "tags"))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalogappregistry-application.html)
     */
    public inline fun cfnApplication(
        scope: Construct,
        id: String,
        block: CfnApplicationDsl.() -> Unit = {},
    ): CfnApplication {
        val builder = CfnApplicationDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnApplication`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.servicecatalogappregistry.*;
     * CfnApplicationProps cfnApplicationProps = CfnApplicationProps.builder()
     * .name("name")
     * // the properties below are optional
     * .description("description")
     * .tags(Map.of(
     * "tagsKey", "tags"))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalogappregistry-application.html)
     */
    public inline fun cfnApplicationProps(
        block: CfnApplicationPropsDsl.() -> Unit = {}
    ): CfnApplicationProps {
        val builder = CfnApplicationPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Creates a new attribute group as a container for user-defined attributes.
     *
     * This feature enables users to have full control over their cloud application's metadata in a
     * rich machine-readable format to facilitate integration with automated workflows and
     * third-party tools.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.servicecatalogappregistry.*;
     * Object attributes;
     * CfnAttributeGroup cfnAttributeGroup = CfnAttributeGroup.Builder.create(this,
     * "MyCfnAttributeGroup")
     * .attributes(attributes)
     * .name("name")
     * // the properties below are optional
     * .description("description")
     * .tags(Map.of(
     * "tagsKey", "tags"))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalogappregistry-attributegroup.html)
     */
    public inline fun cfnAttributeGroup(
        scope: Construct,
        id: String,
        block: CfnAttributeGroupDsl.() -> Unit = {},
    ): CfnAttributeGroup {
        val builder = CfnAttributeGroupDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Associates an attribute group with an application to augment the application's metadata with
     * the group's attributes.
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
    public inline fun cfnAttributeGroupAssociation(
        scope: Construct,
        id: String,
        block: CfnAttributeGroupAssociationDsl.() -> Unit = {},
    ): CfnAttributeGroupAssociation {
        val builder = CfnAttributeGroupAssociationDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

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
    public inline fun cfnAttributeGroupAssociationProps(
        block: CfnAttributeGroupAssociationPropsDsl.() -> Unit = {}
    ): CfnAttributeGroupAssociationProps {
        val builder = CfnAttributeGroupAssociationPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnAttributeGroup`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.servicecatalogappregistry.*;
     * Object attributes;
     * CfnAttributeGroupProps cfnAttributeGroupProps = CfnAttributeGroupProps.builder()
     * .attributes(attributes)
     * .name("name")
     * // the properties below are optional
     * .description("description")
     * .tags(Map.of(
     * "tagsKey", "tags"))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalogappregistry-attributegroup.html)
     */
    public inline fun cfnAttributeGroupProps(
        block: CfnAttributeGroupPropsDsl.() -> Unit = {}
    ): CfnAttributeGroupProps {
        val builder = CfnAttributeGroupPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Associates a resource with an application.
     *
     * Both the resource and the application can be specified either by ID or name.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.servicecatalogappregistry.*;
     * CfnResourceAssociation cfnResourceAssociation = CfnResourceAssociation.Builder.create(this,
     * "MyCfnResourceAssociation")
     * .application("application")
     * .resource("resource")
     * .resourceType("resourceType")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalogappregistry-resourceassociation.html)
     */
    public inline fun cfnResourceAssociation(
        scope: Construct,
        id: String,
        block: CfnResourceAssociationDsl.() -> Unit = {},
    ): CfnResourceAssociation {
        val builder = CfnResourceAssociationDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

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
    public inline fun cfnResourceAssociationProps(
        block: CfnResourceAssociationPropsDsl.() -> Unit = {}
    ): CfnResourceAssociationProps {
        val builder = CfnResourceAssociationPropsDsl()
        builder.apply(block)
        return builder.build()
    }
}
