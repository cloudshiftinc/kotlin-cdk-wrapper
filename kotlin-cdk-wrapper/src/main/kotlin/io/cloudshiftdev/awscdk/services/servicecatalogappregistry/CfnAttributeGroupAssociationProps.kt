@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.servicecatalogappregistry

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.String
import kotlin.Unit

/**
 * Properties for defining a `CfnAttributeGroupAssociation`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.servicecatalogappregistry.*;
 * CfnAttributeGroupAssociationProps cfnAttributeGroupAssociationProps =
 * CfnAttributeGroupAssociationProps.builder()
 * .application("application")
 * .attributeGroup("attributeGroup")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalogappregistry-attributegroupassociation.html)
 */
public interface CfnAttributeGroupAssociationProps {
  /**
   * The name or ID of the application.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalogappregistry-attributegroupassociation.html#cfn-servicecatalogappregistry-attributegroupassociation-application)
   */
  public fun application(): String

  /**
   * The name or ID of the attribute group which holds the attributes that describe the application.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalogappregistry-attributegroupassociation.html#cfn-servicecatalogappregistry-attributegroupassociation-attributegroup)
   */
  public fun attributeGroup(): String

  /**
   * A builder for [CfnAttributeGroupAssociationProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param application The name or ID of the application. 
     */
    public fun application(application: String)

    /**
     * @param attributeGroup The name or ID of the attribute group which holds the attributes that
     * describe the application. 
     */
    public fun attributeGroup(attributeGroup: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.servicecatalogappregistry.CfnAttributeGroupAssociationProps.Builder
        =
        software.amazon.awscdk.services.servicecatalogappregistry.CfnAttributeGroupAssociationProps.builder()

    /**
     * @param application The name or ID of the application. 
     */
    override fun application(application: String) {
      cdkBuilder.application(application)
    }

    /**
     * @param attributeGroup The name or ID of the attribute group which holds the attributes that
     * describe the application. 
     */
    override fun attributeGroup(attributeGroup: String) {
      cdkBuilder.attributeGroup(attributeGroup)
    }

    public fun build():
        software.amazon.awscdk.services.servicecatalogappregistry.CfnAttributeGroupAssociationProps
        = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject:
        software.amazon.awscdk.services.servicecatalogappregistry.CfnAttributeGroupAssociationProps,
  ) : CdkObject(cdkObject), CfnAttributeGroupAssociationProps {
    /**
     * The name or ID of the application.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalogappregistry-attributegroupassociation.html#cfn-servicecatalogappregistry-attributegroupassociation-application)
     */
    override fun application(): String = unwrap(this).getApplication()

    /**
     * The name or ID of the attribute group which holds the attributes that describe the
     * application.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalogappregistry-attributegroupassociation.html#cfn-servicecatalogappregistry-attributegroupassociation-attributegroup)
     */
    override fun attributeGroup(): String = unwrap(this).getAttributeGroup()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnAttributeGroupAssociationProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.servicecatalogappregistry.CfnAttributeGroupAssociationProps):
        CfnAttributeGroupAssociationProps = CdkObjectWrappers.wrap(cdkObject) as
        CfnAttributeGroupAssociationProps

    internal fun unwrap(wrapped: CfnAttributeGroupAssociationProps):
        software.amazon.awscdk.services.servicecatalogappregistry.CfnAttributeGroupAssociationProps
        = (wrapped as CdkObject).cdkObject as
        software.amazon.awscdk.services.servicecatalogappregistry.CfnAttributeGroupAssociationProps
  }
}
