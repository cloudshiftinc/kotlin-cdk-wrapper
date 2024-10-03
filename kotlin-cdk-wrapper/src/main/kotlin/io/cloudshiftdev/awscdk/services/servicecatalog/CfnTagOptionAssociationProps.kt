@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.servicecatalog

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.String
import kotlin.Unit

/**
 * Properties for defining a `CfnTagOptionAssociation`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.servicecatalog.*;
 * CfnTagOptionAssociationProps cfnTagOptionAssociationProps =
 * CfnTagOptionAssociationProps.builder()
 * .resourceId("resourceId")
 * .tagOptionId("tagOptionId")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-tagoptionassociation.html)
 */
public interface CfnTagOptionAssociationProps {
  /**
   * The resource identifier.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-tagoptionassociation.html#cfn-servicecatalog-tagoptionassociation-resourceid)
   */
  public fun resourceId(): String

  /**
   * The TagOption identifier.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-tagoptionassociation.html#cfn-servicecatalog-tagoptionassociation-tagoptionid)
   */
  public fun tagOptionId(): String

  /**
   * A builder for [CfnTagOptionAssociationProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param resourceId The resource identifier. 
     */
    public fun resourceId(resourceId: String)

    /**
     * @param tagOptionId The TagOption identifier. 
     */
    public fun tagOptionId(tagOptionId: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.servicecatalog.CfnTagOptionAssociationProps.Builder =
        software.amazon.awscdk.services.servicecatalog.CfnTagOptionAssociationProps.builder()

    /**
     * @param resourceId The resource identifier. 
     */
    override fun resourceId(resourceId: String) {
      cdkBuilder.resourceId(resourceId)
    }

    /**
     * @param tagOptionId The TagOption identifier. 
     */
    override fun tagOptionId(tagOptionId: String) {
      cdkBuilder.tagOptionId(tagOptionId)
    }

    public fun build(): software.amazon.awscdk.services.servicecatalog.CfnTagOptionAssociationProps
        = cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.servicecatalog.CfnTagOptionAssociationProps,
  ) : CdkObject(cdkObject),
      CfnTagOptionAssociationProps {
    /**
     * The resource identifier.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-tagoptionassociation.html#cfn-servicecatalog-tagoptionassociation-resourceid)
     */
    override fun resourceId(): String = unwrap(this).getResourceId()

    /**
     * The TagOption identifier.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-tagoptionassociation.html#cfn-servicecatalog-tagoptionassociation-tagoptionid)
     */
    override fun tagOptionId(): String = unwrap(this).getTagOptionId()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnTagOptionAssociationProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.servicecatalog.CfnTagOptionAssociationProps):
        CfnTagOptionAssociationProps = CdkObjectWrappers.wrap(cdkObject) as?
        CfnTagOptionAssociationProps ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnTagOptionAssociationProps):
        software.amazon.awscdk.services.servicecatalog.CfnTagOptionAssociationProps = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.servicecatalog.CfnTagOptionAssociationProps
  }
}
