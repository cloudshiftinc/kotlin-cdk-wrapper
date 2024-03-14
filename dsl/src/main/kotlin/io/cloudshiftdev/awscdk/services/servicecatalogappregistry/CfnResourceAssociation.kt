package io.cloudshiftdev.awscdk.services.servicecatalogappregistry

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import kotlin.String
import kotlin.Unit
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnResourceAssociation
internal constructor(
    private val cdkObject:
        software.amazon.awscdk.services.servicecatalogappregistry.CfnResourceAssociation,
) : CfnResource(cdkObject), IInspectable {
    /** The name or ID of the application. */
    public open fun application(): String = unwrap(this).getApplication()

    /** The name or ID of the application. */
    public open fun application(`value`: String) {
        unwrap(this).setApplication(`value`)
    }

    /** The Amazon resource name (ARN) that specifies the application. */
    public open fun attrApplicationArn(): String = unwrap(this).getAttrApplicationArn()

    /**  */
    public open fun attrId(): String = unwrap(this).getAttrId()

    /** The Amazon resource name (ARN) that specifies the resource. */
    public open fun attrResourceArn(): String = unwrap(this).getAttrResourceArn()

    /**
     * Examines the CloudFormation resource and discloses attributes.
     *
     * @param inspector tree inspector to collect and process attributes.
     */
    public override fun inspect(inspector: TreeInspector) {
        unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
    }

    /** The name or ID of the resource of which the application will be associated. */
    public open fun resource(): String = unwrap(this).getResource()

    /** The name or ID of the resource of which the application will be associated. */
    public open fun resource(`value`: String) {
        unwrap(this).setResource(`value`)
    }

    /** The type of resource of which the application will be associated. */
    public open fun resourceType(): String = unwrap(this).getResourceType()

    /** The type of resource of which the application will be associated. */
    public open fun resourceType(`value`: String) {
        unwrap(this).setResourceType(`value`)
    }

    /**
     * A fluent builder for
     * [io.cloudshiftdev.awscdk.services.servicecatalogappregistry.CfnResourceAssociation].
     */
    @CdkDslMarker
    public interface Builder {
        /**
         * The name or ID of the application.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalogappregistry-resourceassociation.html#cfn-servicecatalogappregistry-resourceassociation-application)
         *
         * @param application The name or ID of the application.
         */
        public fun application(application: String)

        /**
         * The name or ID of the resource of which the application will be associated.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalogappregistry-resourceassociation.html#cfn-servicecatalogappregistry-resourceassociation-resource)
         *
         * @param resource The name or ID of the resource of which the application will be
         *   associated.
         */
        public fun resource(resource: String)

        /**
         * The type of resource of which the application will be associated.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalogappregistry-resourceassociation.html#cfn-servicecatalogappregistry-resourceassociation-resourcetype)
         *
         * @param resourceType The type of resource of which the application will be associated.
         */
        public fun resourceType(resourceType: String)
    }

    private class BuilderImpl(
        scope: SoftwareConstructsConstruct,
        id: String,
    ) : Builder {
        private val cdkBuilder:
            software.amazon.awscdk.services.servicecatalogappregistry.CfnResourceAssociation.Builder =
            software.amazon.awscdk.services.servicecatalogappregistry.CfnResourceAssociation.Builder
                .create(scope, id)

        /**
         * The name or ID of the application.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalogappregistry-resourceassociation.html#cfn-servicecatalogappregistry-resourceassociation-application)
         *
         * @param application The name or ID of the application.
         */
        override fun application(application: String) {
            cdkBuilder.application(application)
        }

        /**
         * The name or ID of the resource of which the application will be associated.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalogappregistry-resourceassociation.html#cfn-servicecatalogappregistry-resourceassociation-resource)
         *
         * @param resource The name or ID of the resource of which the application will be
         *   associated.
         */
        override fun resource(resource: String) {
            cdkBuilder.resource(resource)
        }

        /**
         * The type of resource of which the application will be associated.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalogappregistry-resourceassociation.html#cfn-servicecatalogappregistry-resourceassociation-resourcetype)
         *
         * @param resourceType The type of resource of which the application will be associated.
         */
        override fun resourceType(resourceType: String) {
            cdkBuilder.resourceType(resourceType)
        }

        public fun build():
            software.amazon.awscdk.services.servicecatalogappregistry.CfnResourceAssociation =
            cdkBuilder.build()
    }

    public companion object {
        init {}

        public operator fun invoke(
            scope: CloudshiftdevConstructsConstruct,
            id: String,
            block: Builder.() -> Unit = {},
        ): CfnResourceAssociation {
            val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
            return CfnResourceAssociation(builderImpl.apply(block).build())
        }

        internal fun wrap(
            cdkObject:
                software.amazon.awscdk.services.servicecatalogappregistry.CfnResourceAssociation
        ): CfnResourceAssociation = CfnResourceAssociation(cdkObject)

        internal fun unwrap(
            wrapped: CfnResourceAssociation
        ): software.amazon.awscdk.services.servicecatalogappregistry.CfnResourceAssociation =
            wrapped.cdkObject
    }
}
