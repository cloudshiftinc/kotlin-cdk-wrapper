package io.cloudshiftdev.awscdk.services.servicecatalogappregistry

import io.cloudshiftdev.awscdk.CdkObject
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.Unit

public interface CfnResourceAssociationProps {
  /**
   * The name or ID of the application.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalogappregistry-resourceassociation.html#cfn-servicecatalogappregistry-resourceassociation-application)
   */
  public fun application(): String

  /**
   * The name or ID of the resource of which the application will be associated.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalogappregistry-resourceassociation.html#cfn-servicecatalogappregistry-resourceassociation-resource)
   */
  public fun resource(): String

  /**
   * The type of resource of which the application will be associated.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalogappregistry-resourceassociation.html#cfn-servicecatalogappregistry-resourceassociation-resourcetype)
   */
  public fun resourceType(): String

  /**
   * A builder for [CfnResourceAssociationProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param application The name or ID of the application. 
     */
    public fun application(application: String)

    /**
     * @param resource The name or ID of the resource of which the application will be associated. 
     */
    public fun resource(resource: String)

    /**
     * @param resourceType The type of resource of which the application will be associated. 
     */
    public fun resourceType(resourceType: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.servicecatalogappregistry.CfnResourceAssociationProps.Builder
        =
        software.amazon.awscdk.services.servicecatalogappregistry.CfnResourceAssociationProps.builder()

    /**
     * @param application The name or ID of the application. 
     */
    override fun application(application: String) {
      cdkBuilder.application(application)
    }

    /**
     * @param resource The name or ID of the resource of which the application will be associated. 
     */
    override fun resource(resource: String) {
      cdkBuilder.resource(resource)
    }

    /**
     * @param resourceType The type of resource of which the application will be associated. 
     */
    override fun resourceType(resourceType: String) {
      cdkBuilder.resourceType(resourceType)
    }

    public fun build():
        software.amazon.awscdk.services.servicecatalogappregistry.CfnResourceAssociationProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject:
        software.amazon.awscdk.services.servicecatalogappregistry.CfnResourceAssociationProps,
  ) : CdkObject(cdkObject), CfnResourceAssociationProps {
    /**
     * The name or ID of the application.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalogappregistry-resourceassociation.html#cfn-servicecatalogappregistry-resourceassociation-application)
     */
    override fun application(): String = unwrap(this).getApplication()

    /**
     * The name or ID of the resource of which the application will be associated.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalogappregistry-resourceassociation.html#cfn-servicecatalogappregistry-resourceassociation-resource)
     */
    override fun resource(): String = unwrap(this).getResource()

    /**
     * The type of resource of which the application will be associated.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalogappregistry-resourceassociation.html#cfn-servicecatalogappregistry-resourceassociation-resourcetype)
     */
    override fun resourceType(): String = unwrap(this).getResourceType()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnResourceAssociationProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.servicecatalogappregistry.CfnResourceAssociationProps):
        CfnResourceAssociationProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnResourceAssociationProps):
        software.amazon.awscdk.services.servicecatalogappregistry.CfnResourceAssociationProps =
        (wrapped as CdkObject).cdkObject as
        software.amazon.awscdk.services.servicecatalogappregistry.CfnResourceAssociationProps
  }
}
