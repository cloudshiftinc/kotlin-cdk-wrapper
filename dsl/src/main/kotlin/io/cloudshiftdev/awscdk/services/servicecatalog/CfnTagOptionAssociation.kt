package io.cloudshiftdev.awscdk.services.servicecatalog

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.Unit
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnTagOptionAssociation internal constructor(
  internal override val cdkObject:
      software.amazon.awscdk.services.servicecatalog.CfnTagOptionAssociation,
) : CfnResource(cdkObject), IInspectable {
  /**
   *
   */
  public open fun attrId(): String = unwrap(this).getAttrId()

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  /**
   * The resource identifier.
   */
  public open fun resourceId(): String = unwrap(this).getResourceId()

  /**
   * The resource identifier.
   */
  public open fun resourceId(`value`: String) {
    unwrap(this).setResourceId(`value`)
  }

  /**
   * The TagOption identifier.
   */
  public open fun tagOptionId(): String = unwrap(this).getTagOptionId()

  /**
   * The TagOption identifier.
   */
  public open fun tagOptionId(`value`: String) {
    unwrap(this).setTagOptionId(`value`)
  }

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.servicecatalog.CfnTagOptionAssociation].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The resource identifier.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-tagoptionassociation.html#cfn-servicecatalog-tagoptionassociation-resourceid)
     * @param resourceId The resource identifier. 
     */
    public fun resourceId(resourceId: String)

    /**
     * The TagOption identifier.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-tagoptionassociation.html#cfn-servicecatalog-tagoptionassociation-tagoptionid)
     * @param tagOptionId The TagOption identifier. 
     */
    public fun tagOptionId(tagOptionId: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.servicecatalog.CfnTagOptionAssociation.Builder =
        software.amazon.awscdk.services.servicecatalog.CfnTagOptionAssociation.Builder.create(scope,
        id)

    /**
     * The resource identifier.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-tagoptionassociation.html#cfn-servicecatalog-tagoptionassociation-resourceid)
     * @param resourceId The resource identifier. 
     */
    override fun resourceId(resourceId: String) {
      cdkBuilder.resourceId(resourceId)
    }

    /**
     * The TagOption identifier.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-tagoptionassociation.html#cfn-servicecatalog-tagoptionassociation-tagoptionid)
     * @param tagOptionId The TagOption identifier. 
     */
    override fun tagOptionId(tagOptionId: String) {
      cdkBuilder.tagOptionId(tagOptionId)
    }

    public fun build(): software.amazon.awscdk.services.servicecatalog.CfnTagOptionAssociation =
        cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.servicecatalog.CfnTagOptionAssociation.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnTagOptionAssociation {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnTagOptionAssociation(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.servicecatalog.CfnTagOptionAssociation):
        CfnTagOptionAssociation = CfnTagOptionAssociation(cdkObject)

    internal fun unwrap(wrapped: CfnTagOptionAssociation):
        software.amazon.awscdk.services.servicecatalog.CfnTagOptionAssociation = wrapped.cdkObject
  }
}
