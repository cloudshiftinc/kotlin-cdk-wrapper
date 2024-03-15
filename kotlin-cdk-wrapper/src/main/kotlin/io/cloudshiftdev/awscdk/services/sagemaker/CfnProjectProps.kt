@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.sagemaker

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

/**
 * Properties for defining a `CfnProject`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.sagemaker.*;
 * Object serviceCatalogProvisioningDetails;
 * CfnProjectProps cfnProjectProps = CfnProjectProps.builder()
 * .projectName("projectName")
 * .serviceCatalogProvisioningDetails(serviceCatalogProvisioningDetails)
 * // the properties below are optional
 * .projectDescription("projectDescription")
 * .serviceCatalogProvisionedProductDetails(ServiceCatalogProvisionedProductDetailsProperty.builder()
 * .provisionedProductId("provisionedProductId")
 * .provisionedProductStatusMessage("provisionedProductStatusMessage")
 * .build())
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-project.html)
 */
public interface CfnProjectProps {
  /**
   * The description of the project.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-project.html#cfn-sagemaker-project-projectdescription)
   */
  public fun projectDescription(): String? = unwrap(this).getProjectDescription()

  /**
   * The name of the project.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-project.html#cfn-sagemaker-project-projectname)
   */
  public fun projectName(): String

  /**
   * Details of a provisioned service catalog product.
   *
   * For information about service catalog, see [What is AWS Service
   * Catalog](https://docs.aws.amazon.com/servicecatalog/latest/adminguide/introduction.html) .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-project.html#cfn-sagemaker-project-servicecatalogprovisionedproductdetails)
   */
  public fun serviceCatalogProvisionedProductDetails(): Any? =
      unwrap(this).getServiceCatalogProvisionedProductDetails()

  /**
   * The product ID and provisioning artifact ID to provision a service catalog.
   *
   * For information, see [What is AWS Service
   * Catalog](https://docs.aws.amazon.com/servicecatalog/latest/adminguide/introduction.html) .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-project.html#cfn-sagemaker-project-servicecatalogprovisioningdetails)
   */
  public fun serviceCatalogProvisioningDetails(): Any

  /**
   * A list of key-value pairs to apply to this resource.
   *
   * For more information, see [Resource
   * Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
   * and [Using Cost Allocation
   * Tags](https://docs.aws.amazon.com/awsaccountbilling/latest/aboutv2/cost-alloc-tags.html#allocation-what)
   * in the *AWS Billing and Cost Management User Guide* .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-project.html#cfn-sagemaker-project-tags)
   */
  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * A builder for [CfnProjectProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param projectDescription The description of the project.
     */
    public fun projectDescription(projectDescription: String)

    /**
     * @param projectName The name of the project. 
     */
    public fun projectName(projectName: String)

    /**
     * @param serviceCatalogProvisionedProductDetails Details of a provisioned service catalog
     * product.
     * For information about service catalog, see [What is AWS Service
     * Catalog](https://docs.aws.amazon.com/servicecatalog/latest/adminguide/introduction.html) .
     */
    public
        fun serviceCatalogProvisionedProductDetails(serviceCatalogProvisionedProductDetails: IResolvable)

    /**
     * @param serviceCatalogProvisionedProductDetails Details of a provisioned service catalog
     * product.
     * For information about service catalog, see [What is AWS Service
     * Catalog](https://docs.aws.amazon.com/servicecatalog/latest/adminguide/introduction.html) .
     */
    public
        fun serviceCatalogProvisionedProductDetails(serviceCatalogProvisionedProductDetails: CfnProject.ServiceCatalogProvisionedProductDetailsProperty)

    /**
     * @param serviceCatalogProvisionedProductDetails Details of a provisioned service catalog
     * product.
     * For information about service catalog, see [What is AWS Service
     * Catalog](https://docs.aws.amazon.com/servicecatalog/latest/adminguide/introduction.html) .
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("624c627b17da2c99bdd42645d860291508bc1e9d9f5ab29799000cfbd963acb4")
    public
        fun serviceCatalogProvisionedProductDetails(serviceCatalogProvisionedProductDetails: CfnProject.ServiceCatalogProvisionedProductDetailsProperty.Builder.() -> Unit)

    /**
     * @param serviceCatalogProvisioningDetails The product ID and provisioning artifact ID to
     * provision a service catalog. 
     * For information, see [What is AWS Service
     * Catalog](https://docs.aws.amazon.com/servicecatalog/latest/adminguide/introduction.html) .
     */
    public fun serviceCatalogProvisioningDetails(serviceCatalogProvisioningDetails: Any)

    /**
     * @param tags A list of key-value pairs to apply to this resource.
     * For more information, see [Resource
     * Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     * and [Using Cost Allocation
     * Tags](https://docs.aws.amazon.com/awsaccountbilling/latest/aboutv2/cost-alloc-tags.html#allocation-what)
     * in the *AWS Billing and Cost Management User Guide* .
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * @param tags A list of key-value pairs to apply to this resource.
     * For more information, see [Resource
     * Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     * and [Using Cost Allocation
     * Tags](https://docs.aws.amazon.com/awsaccountbilling/latest/aboutv2/cost-alloc-tags.html#allocation-what)
     * in the *AWS Billing and Cost Management User Guide* .
     */
    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.sagemaker.CfnProjectProps.Builder =
        software.amazon.awscdk.services.sagemaker.CfnProjectProps.builder()

    /**
     * @param projectDescription The description of the project.
     */
    override fun projectDescription(projectDescription: String) {
      cdkBuilder.projectDescription(projectDescription)
    }

    /**
     * @param projectName The name of the project. 
     */
    override fun projectName(projectName: String) {
      cdkBuilder.projectName(projectName)
    }

    /**
     * @param serviceCatalogProvisionedProductDetails Details of a provisioned service catalog
     * product.
     * For information about service catalog, see [What is AWS Service
     * Catalog](https://docs.aws.amazon.com/servicecatalog/latest/adminguide/introduction.html) .
     */
    override
        fun serviceCatalogProvisionedProductDetails(serviceCatalogProvisionedProductDetails: IResolvable) {
      cdkBuilder.serviceCatalogProvisionedProductDetails(serviceCatalogProvisionedProductDetails.let(IResolvable::unwrap))
    }

    /**
     * @param serviceCatalogProvisionedProductDetails Details of a provisioned service catalog
     * product.
     * For information about service catalog, see [What is AWS Service
     * Catalog](https://docs.aws.amazon.com/servicecatalog/latest/adminguide/introduction.html) .
     */
    override
        fun serviceCatalogProvisionedProductDetails(serviceCatalogProvisionedProductDetails: CfnProject.ServiceCatalogProvisionedProductDetailsProperty) {
      cdkBuilder.serviceCatalogProvisionedProductDetails(serviceCatalogProvisionedProductDetails.let(CfnProject.ServiceCatalogProvisionedProductDetailsProperty::unwrap))
    }

    /**
     * @param serviceCatalogProvisionedProductDetails Details of a provisioned service catalog
     * product.
     * For information about service catalog, see [What is AWS Service
     * Catalog](https://docs.aws.amazon.com/servicecatalog/latest/adminguide/introduction.html) .
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("624c627b17da2c99bdd42645d860291508bc1e9d9f5ab29799000cfbd963acb4")
    override
        fun serviceCatalogProvisionedProductDetails(serviceCatalogProvisionedProductDetails: CfnProject.ServiceCatalogProvisionedProductDetailsProperty.Builder.() -> Unit):
        Unit =
        serviceCatalogProvisionedProductDetails(CfnProject.ServiceCatalogProvisionedProductDetailsProperty(serviceCatalogProvisionedProductDetails))

    /**
     * @param serviceCatalogProvisioningDetails The product ID and provisioning artifact ID to
     * provision a service catalog. 
     * For information, see [What is AWS Service
     * Catalog](https://docs.aws.amazon.com/servicecatalog/latest/adminguide/introduction.html) .
     */
    override fun serviceCatalogProvisioningDetails(serviceCatalogProvisioningDetails: Any) {
      cdkBuilder.serviceCatalogProvisioningDetails(serviceCatalogProvisioningDetails)
    }

    /**
     * @param tags A list of key-value pairs to apply to this resource.
     * For more information, see [Resource
     * Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     * and [Using Cost Allocation
     * Tags](https://docs.aws.amazon.com/awsaccountbilling/latest/aboutv2/cost-alloc-tags.html#allocation-what)
     * in the *AWS Billing and Cost Management User Guide* .
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    /**
     * @param tags A list of key-value pairs to apply to this resource.
     * For more information, see [Resource
     * Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     * and [Using Cost Allocation
     * Tags](https://docs.aws.amazon.com/awsaccountbilling/latest/aboutv2/cost-alloc-tags.html#allocation-what)
     * in the *AWS Billing and Cost Management User Guide* .
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.sagemaker.CfnProjectProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.sagemaker.CfnProjectProps,
  ) : CdkObject(cdkObject), CfnProjectProps {
    /**
     * The description of the project.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-project.html#cfn-sagemaker-project-projectdescription)
     */
    override fun projectDescription(): String? = unwrap(this).getProjectDescription()

    /**
     * The name of the project.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-project.html#cfn-sagemaker-project-projectname)
     */
    override fun projectName(): String = unwrap(this).getProjectName()

    /**
     * Details of a provisioned service catalog product.
     *
     * For information about service catalog, see [What is AWS Service
     * Catalog](https://docs.aws.amazon.com/servicecatalog/latest/adminguide/introduction.html) .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-project.html#cfn-sagemaker-project-servicecatalogprovisionedproductdetails)
     */
    override fun serviceCatalogProvisionedProductDetails(): Any? =
        unwrap(this).getServiceCatalogProvisionedProductDetails()

    /**
     * The product ID and provisioning artifact ID to provision a service catalog.
     *
     * For information, see [What is AWS Service
     * Catalog](https://docs.aws.amazon.com/servicecatalog/latest/adminguide/introduction.html) .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-project.html#cfn-sagemaker-project-servicecatalogprovisioningdetails)
     */
    override fun serviceCatalogProvisioningDetails(): Any =
        unwrap(this).getServiceCatalogProvisioningDetails()

    /**
     * A list of key-value pairs to apply to this resource.
     *
     * For more information, see [Resource
     * Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     * and [Using Cost Allocation
     * Tags](https://docs.aws.amazon.com/awsaccountbilling/latest/aboutv2/cost-alloc-tags.html#allocation-what)
     * in the *AWS Billing and Cost Management User Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-project.html#cfn-sagemaker-project-tags)
     */
    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnProjectProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.sagemaker.CfnProjectProps):
        CfnProjectProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnProjectProps):
        software.amazon.awscdk.services.sagemaker.CfnProjectProps = (wrapped as CdkObject).cdkObject
        as software.amazon.awscdk.services.sagemaker.CfnProjectProps
  }
}
