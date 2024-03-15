@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.servicecatalog

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String
import kotlin.Unit

/**
 * Properties for defining a `CfnServiceActionAssociation`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.servicecatalog.*;
 * CfnServiceActionAssociationProps cfnServiceActionAssociationProps =
 * CfnServiceActionAssociationProps.builder()
 * .productId("productId")
 * .provisioningArtifactId("provisioningArtifactId")
 * .serviceActionId("serviceActionId")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-serviceactionassociation.html)
 */
public interface CfnServiceActionAssociationProps {
  /**
   * The product identifier.
   *
   * For example, `prod-abcdzk7xy33qa` .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-serviceactionassociation.html#cfn-servicecatalog-serviceactionassociation-productid)
   */
  public fun productId(): String

  /**
   * The identifier of the provisioning artifact.
   *
   * For example, `pa-4abcdjnxjj6ne` .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-serviceactionassociation.html#cfn-servicecatalog-serviceactionassociation-provisioningartifactid)
   */
  public fun provisioningArtifactId(): String

  /**
   * The self-service action identifier.
   *
   * For example, `act-fs7abcd89wxyz` .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-serviceactionassociation.html#cfn-servicecatalog-serviceactionassociation-serviceactionid)
   */
  public fun serviceActionId(): String

  /**
   * A builder for [CfnServiceActionAssociationProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param productId The product identifier. 
     * For example, `prod-abcdzk7xy33qa` .
     */
    public fun productId(productId: String)

    /**
     * @param provisioningArtifactId The identifier of the provisioning artifact. 
     * For example, `pa-4abcdjnxjj6ne` .
     */
    public fun provisioningArtifactId(provisioningArtifactId: String)

    /**
     * @param serviceActionId The self-service action identifier. 
     * For example, `act-fs7abcd89wxyz` .
     */
    public fun serviceActionId(serviceActionId: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.servicecatalog.CfnServiceActionAssociationProps.Builder =
        software.amazon.awscdk.services.servicecatalog.CfnServiceActionAssociationProps.builder()

    /**
     * @param productId The product identifier. 
     * For example, `prod-abcdzk7xy33qa` .
     */
    override fun productId(productId: String) {
      cdkBuilder.productId(productId)
    }

    /**
     * @param provisioningArtifactId The identifier of the provisioning artifact. 
     * For example, `pa-4abcdjnxjj6ne` .
     */
    override fun provisioningArtifactId(provisioningArtifactId: String) {
      cdkBuilder.provisioningArtifactId(provisioningArtifactId)
    }

    /**
     * @param serviceActionId The self-service action identifier. 
     * For example, `act-fs7abcd89wxyz` .
     */
    override fun serviceActionId(serviceActionId: String) {
      cdkBuilder.serviceActionId(serviceActionId)
    }

    public fun build():
        software.amazon.awscdk.services.servicecatalog.CfnServiceActionAssociationProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject:
        software.amazon.awscdk.services.servicecatalog.CfnServiceActionAssociationProps,
  ) : CdkObject(cdkObject), CfnServiceActionAssociationProps {
    /**
     * The product identifier.
     *
     * For example, `prod-abcdzk7xy33qa` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-serviceactionassociation.html#cfn-servicecatalog-serviceactionassociation-productid)
     */
    override fun productId(): String = unwrap(this).getProductId()

    /**
     * The identifier of the provisioning artifact.
     *
     * For example, `pa-4abcdjnxjj6ne` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-serviceactionassociation.html#cfn-servicecatalog-serviceactionassociation-provisioningartifactid)
     */
    override fun provisioningArtifactId(): String = unwrap(this).getProvisioningArtifactId()

    /**
     * The self-service action identifier.
     *
     * For example, `act-fs7abcd89wxyz` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-serviceactionassociation.html#cfn-servicecatalog-serviceactionassociation-serviceactionid)
     */
    override fun serviceActionId(): String = unwrap(this).getServiceActionId()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnServiceActionAssociationProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.servicecatalog.CfnServiceActionAssociationProps):
        CfnServiceActionAssociationProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnServiceActionAssociationProps):
        software.amazon.awscdk.services.servicecatalog.CfnServiceActionAssociationProps = (wrapped
        as CdkObject).cdkObject as
        software.amazon.awscdk.services.servicecatalog.CfnServiceActionAssociationProps
  }
}
