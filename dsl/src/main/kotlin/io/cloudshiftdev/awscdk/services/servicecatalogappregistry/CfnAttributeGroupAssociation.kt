package io.cloudshiftdev.awscdk.services.servicecatalogappregistry

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.Unit
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnAttributeGroupAssociation internal constructor(
  internal override val cdkObject:
      software.amazon.awscdk.services.servicecatalogappregistry.CfnAttributeGroupAssociation,
) : CfnResource(cdkObject), IInspectable {
  /**
   * The name or ID of the application.
   */
  public open fun application(): String = unwrap(this).getApplication()

  /**
   * The name or ID of the application.
   */
  public open fun application(`value`: String) {
    unwrap(this).setApplication(`value`)
  }

  /**
   * The Amazon resource name (ARN) of the application that was augmented with attributes.
   */
  public open fun attrApplicationArn(): String = unwrap(this).getAttrApplicationArn()

  /**
   * The Amazon resource name (ARN) of the attribute group which contains the application's new
   * attributes.
   */
  public open fun attrAttributeGroupArn(): String = unwrap(this).getAttrAttributeGroupArn()

  /**
   *
   */
  public open fun attrId(): String = unwrap(this).getAttrId()

  /**
   * The name or ID of the attribute group which holds the attributes that describe the application.
   */
  public open fun attributeGroup(): String = unwrap(this).getAttributeGroup()

  /**
   * The name or ID of the attribute group which holds the attributes that describe the application.
   */
  public open fun attributeGroup(`value`: String) {
    unwrap(this).setAttributeGroup(`value`)
  }

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  /**
   * A fluent builder for
   * [io.cloudshiftdev.awscdk.services.servicecatalogappregistry.CfnAttributeGroupAssociation].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The name or ID of the application.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalogappregistry-attributegroupassociation.html#cfn-servicecatalogappregistry-attributegroupassociation-application)
     * @param application The name or ID of the application. 
     */
    public fun application(application: String)

    /**
     * The name or ID of the attribute group which holds the attributes that describe the
     * application.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalogappregistry-attributegroupassociation.html#cfn-servicecatalogappregistry-attributegroupassociation-attributegroup)
     * @param attributeGroup The name or ID of the attribute group which holds the attributes that
     * describe the application. 
     */
    public fun attributeGroup(attributeGroup: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.servicecatalogappregistry.CfnAttributeGroupAssociation.Builder
        =
        software.amazon.awscdk.services.servicecatalogappregistry.CfnAttributeGroupAssociation.Builder.create(scope,
        id)

    /**
     * The name or ID of the application.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalogappregistry-attributegroupassociation.html#cfn-servicecatalogappregistry-attributegroupassociation-application)
     * @param application The name or ID of the application. 
     */
    override fun application(application: String) {
      cdkBuilder.application(application)
    }

    /**
     * The name or ID of the attribute group which holds the attributes that describe the
     * application.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalogappregistry-attributegroupassociation.html#cfn-servicecatalogappregistry-attributegroupassociation-attributegroup)
     * @param attributeGroup The name or ID of the attribute group which holds the attributes that
     * describe the application. 
     */
    override fun attributeGroup(attributeGroup: String) {
      cdkBuilder.attributeGroup(attributeGroup)
    }

    public fun build():
        software.amazon.awscdk.services.servicecatalogappregistry.CfnAttributeGroupAssociation =
        cdkBuilder.build()
  }

  public companion object {
    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnAttributeGroupAssociation {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnAttributeGroupAssociation(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.servicecatalogappregistry.CfnAttributeGroupAssociation):
        CfnAttributeGroupAssociation = CfnAttributeGroupAssociation(cdkObject)

    internal fun unwrap(wrapped: CfnAttributeGroupAssociation):
        software.amazon.awscdk.services.servicecatalogappregistry.CfnAttributeGroupAssociation =
        wrapped.cdkObject
  }
}
