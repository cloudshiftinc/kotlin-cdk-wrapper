@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.sagemaker

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.ITaggable
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * Creates a machine learning (ML) project that can contain one or more templates that set up an ML
 * pipeline from training to deploying an approved model.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.sagemaker.*;
 * Object serviceCatalogProvisioningDetails;
 * CfnProject cfnProject = CfnProject.Builder.create(this, "MyCfnProject")
 * .projectName("projectName")
 * // the properties below are optional
 * .projectDescription("projectDescription")
 * .serviceCatalogProvisionedProductDetails(ServiceCatalogProvisionedProductDetailsProperty.builder()
 * .provisionedProductId("provisionedProductId")
 * .provisionedProductStatusMessage("provisionedProductStatusMessage")
 * .build())
 * .serviceCatalogProvisioningDetails(serviceCatalogProvisioningDetails)
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .templateProviderDetails(List.of(TemplateProviderDetailProperty.builder()
 * .cfnTemplateProviderDetail(CfnTemplateProviderDetailProperty.builder()
 * .templateName("templateName")
 * .templateUrl("templateUrl")
 * // the properties below are optional
 * .parameters(List.of(CfnStackParameterProperty.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .roleArn("roleArn")
 * .build())
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-project.html)
 */
public open class CfnProject(
  cdkObject: software.amazon.awscdk.services.sagemaker.CfnProject,
) : CfnResource(cdkObject),
    IInspectable,
    ITaggable {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnProjectProps,
  ) :
      this(software.amazon.awscdk.services.sagemaker.CfnProject(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id, props.let(CfnProjectProps.Companion::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnProjectProps.Builder.() -> Unit,
  ) : this(scope, id, CfnProjectProps(props)
  )

  /**
   * The time that the project was created.
   */
  public open fun attrCreationTime(): String = unwrap(this).getAttrCreationTime()

  /**
   * The Amazon Resource Name (ARN) of the project.
   */
  public open fun attrProjectArn(): String = unwrap(this).getAttrProjectArn()

  /**
   * The ID of the project.
   *
   * This ID is prepended to all entities associated with this project.
   */
  public open fun attrProjectId(): String = unwrap(this).getAttrProjectId()

  /**
   * The status of the project.
   */
  public open fun attrProjectStatus(): String = unwrap(this).getAttrProjectStatus()

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector.Companion::unwrap))
  }

  /**
   * The description of the project.
   */
  public open fun projectDescription(): String? = unwrap(this).getProjectDescription()

  /**
   * The description of the project.
   */
  public open fun projectDescription(`value`: String) {
    unwrap(this).setProjectDescription(`value`)
  }

  /**
   * The name of the project.
   */
  public open fun projectName(): String = unwrap(this).getProjectName()

  /**
   * The name of the project.
   */
  public open fun projectName(`value`: String) {
    unwrap(this).setProjectName(`value`)
  }

  /**
   * Details of a provisioned service catalog product.
   */
  public open fun serviceCatalogProvisionedProductDetails(): Any? =
      unwrap(this).getServiceCatalogProvisionedProductDetails()

  /**
   * Details of a provisioned service catalog product.
   */
  public open fun serviceCatalogProvisionedProductDetails(`value`: IResolvable) {
    unwrap(this).setServiceCatalogProvisionedProductDetails(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * Details of a provisioned service catalog product.
   */
  public open
      fun serviceCatalogProvisionedProductDetails(`value`: ServiceCatalogProvisionedProductDetailsProperty) {
    unwrap(this).setServiceCatalogProvisionedProductDetails(`value`.let(ServiceCatalogProvisionedProductDetailsProperty.Companion::unwrap))
  }

  /**
   * Details of a provisioned service catalog product.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("47d59c327c239c205abe906ffd0689edb9e0e62da9c55219c467d85b98ed1af4")
  public open
      fun serviceCatalogProvisionedProductDetails(`value`: ServiceCatalogProvisionedProductDetailsProperty.Builder.() -> Unit):
      Unit =
      serviceCatalogProvisionedProductDetails(ServiceCatalogProvisionedProductDetailsProperty(`value`))

  /**
   * The product ID and provisioning artifact ID to provision a service catalog.
   */
  public open fun serviceCatalogProvisioningDetails(): Any? =
      unwrap(this).getServiceCatalogProvisioningDetails()

  /**
   * The product ID and provisioning artifact ID to provision a service catalog.
   */
  public open fun serviceCatalogProvisioningDetails(`value`: Any) {
    unwrap(this).setServiceCatalogProvisioningDetails(`value`)
  }

  /**
   * Tag Manager which manages the tags for this resource.
   */
  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  /**
   * A list of key-value pairs to apply to this resource.
   */
  public open fun tagsRaw(): List<CfnTag> = unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?:
      emptyList()

  /**
   * A list of key-value pairs to apply to this resource.
   */
  public open fun tagsRaw(`value`: List<CfnTag>) {
    unwrap(this).setTagsRaw(`value`.map(CfnTag.Companion::unwrap))
  }

  /**
   * A list of key-value pairs to apply to this resource.
   */
  public open fun tagsRaw(vararg `value`: CfnTag): Unit = tagsRaw(`value`.toList())

  /**
   * An array of template providers associated with the project.
   */
  public open fun templateProviderDetails(): Any? = unwrap(this).getTemplateProviderDetails()

  /**
   * An array of template providers associated with the project.
   */
  public open fun templateProviderDetails(`value`: IResolvable) {
    unwrap(this).setTemplateProviderDetails(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * An array of template providers associated with the project.
   */
  public open fun templateProviderDetails(`value`: List<Any>) {
    unwrap(this).setTemplateProviderDetails(`value`.map{CdkObjectWrappers.unwrap(it)})
  }

  /**
   * An array of template providers associated with the project.
   */
  public open fun templateProviderDetails(vararg `value`: Any): Unit =
      templateProviderDetails(`value`.toList())

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.sagemaker.CfnProject].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The description of the project.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-project.html#cfn-sagemaker-project-projectdescription)
     * @param projectDescription The description of the project. 
     */
    public fun projectDescription(projectDescription: String)

    /**
     * The name of the project.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-project.html#cfn-sagemaker-project-projectname)
     * @param projectName The name of the project. 
     */
    public fun projectName(projectName: String)

    /**
     * Details of a provisioned service catalog product.
     *
     * For information about service catalog, see [What is AWS Service
     * Catalog](https://docs.aws.amazon.com/servicecatalog/latest/adminguide/introduction.html) .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-project.html#cfn-sagemaker-project-servicecatalogprovisionedproductdetails)
     * @param serviceCatalogProvisionedProductDetails Details of a provisioned service catalog
     * product. 
     */
    public
        fun serviceCatalogProvisionedProductDetails(serviceCatalogProvisionedProductDetails: IResolvable)

    /**
     * Details of a provisioned service catalog product.
     *
     * For information about service catalog, see [What is AWS Service
     * Catalog](https://docs.aws.amazon.com/servicecatalog/latest/adminguide/introduction.html) .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-project.html#cfn-sagemaker-project-servicecatalogprovisionedproductdetails)
     * @param serviceCatalogProvisionedProductDetails Details of a provisioned service catalog
     * product. 
     */
    public
        fun serviceCatalogProvisionedProductDetails(serviceCatalogProvisionedProductDetails: ServiceCatalogProvisionedProductDetailsProperty)

    /**
     * Details of a provisioned service catalog product.
     *
     * For information about service catalog, see [What is AWS Service
     * Catalog](https://docs.aws.amazon.com/servicecatalog/latest/adminguide/introduction.html) .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-project.html#cfn-sagemaker-project-servicecatalogprovisionedproductdetails)
     * @param serviceCatalogProvisionedProductDetails Details of a provisioned service catalog
     * product. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("40b490351078a78befe44c205e665063d2437f322bd6907d96cdab41adbcf267")
    public
        fun serviceCatalogProvisionedProductDetails(serviceCatalogProvisionedProductDetails: ServiceCatalogProvisionedProductDetailsProperty.Builder.() -> Unit)

    /**
     * The product ID and provisioning artifact ID to provision a service catalog.
     *
     * For information, see [What is AWS Service
     * Catalog](https://docs.aws.amazon.com/servicecatalog/latest/adminguide/introduction.html) .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-project.html#cfn-sagemaker-project-servicecatalogprovisioningdetails)
     * @param serviceCatalogProvisioningDetails The product ID and provisioning artifact ID to
     * provision a service catalog. 
     */
    public fun serviceCatalogProvisioningDetails(serviceCatalogProvisioningDetails: Any)

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
     * @param tags A list of key-value pairs to apply to this resource. 
     */
    public fun tags(tags: List<CfnTag>)

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
     * @param tags A list of key-value pairs to apply to this resource. 
     */
    public fun tags(vararg tags: CfnTag)

    /**
     * An array of template providers associated with the project.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-project.html#cfn-sagemaker-project-templateproviderdetails)
     * @param templateProviderDetails An array of template providers associated with the project. 
     */
    public fun templateProviderDetails(templateProviderDetails: IResolvable)

    /**
     * An array of template providers associated with the project.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-project.html#cfn-sagemaker-project-templateproviderdetails)
     * @param templateProviderDetails An array of template providers associated with the project. 
     */
    public fun templateProviderDetails(templateProviderDetails: List<Any>)

    /**
     * An array of template providers associated with the project.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-project.html#cfn-sagemaker-project-templateproviderdetails)
     * @param templateProviderDetails An array of template providers associated with the project. 
     */
    public fun templateProviderDetails(vararg templateProviderDetails: Any)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.sagemaker.CfnProject.Builder =
        software.amazon.awscdk.services.sagemaker.CfnProject.Builder.create(scope, id)

    /**
     * The description of the project.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-project.html#cfn-sagemaker-project-projectdescription)
     * @param projectDescription The description of the project. 
     */
    override fun projectDescription(projectDescription: String) {
      cdkBuilder.projectDescription(projectDescription)
    }

    /**
     * The name of the project.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-project.html#cfn-sagemaker-project-projectname)
     * @param projectName The name of the project. 
     */
    override fun projectName(projectName: String) {
      cdkBuilder.projectName(projectName)
    }

    /**
     * Details of a provisioned service catalog product.
     *
     * For information about service catalog, see [What is AWS Service
     * Catalog](https://docs.aws.amazon.com/servicecatalog/latest/adminguide/introduction.html) .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-project.html#cfn-sagemaker-project-servicecatalogprovisionedproductdetails)
     * @param serviceCatalogProvisionedProductDetails Details of a provisioned service catalog
     * product. 
     */
    override
        fun serviceCatalogProvisionedProductDetails(serviceCatalogProvisionedProductDetails: IResolvable) {
      cdkBuilder.serviceCatalogProvisionedProductDetails(serviceCatalogProvisionedProductDetails.let(IResolvable.Companion::unwrap))
    }

    /**
     * Details of a provisioned service catalog product.
     *
     * For information about service catalog, see [What is AWS Service
     * Catalog](https://docs.aws.amazon.com/servicecatalog/latest/adminguide/introduction.html) .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-project.html#cfn-sagemaker-project-servicecatalogprovisionedproductdetails)
     * @param serviceCatalogProvisionedProductDetails Details of a provisioned service catalog
     * product. 
     */
    override
        fun serviceCatalogProvisionedProductDetails(serviceCatalogProvisionedProductDetails: ServiceCatalogProvisionedProductDetailsProperty) {
      cdkBuilder.serviceCatalogProvisionedProductDetails(serviceCatalogProvisionedProductDetails.let(ServiceCatalogProvisionedProductDetailsProperty.Companion::unwrap))
    }

    /**
     * Details of a provisioned service catalog product.
     *
     * For information about service catalog, see [What is AWS Service
     * Catalog](https://docs.aws.amazon.com/servicecatalog/latest/adminguide/introduction.html) .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-project.html#cfn-sagemaker-project-servicecatalogprovisionedproductdetails)
     * @param serviceCatalogProvisionedProductDetails Details of a provisioned service catalog
     * product. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("40b490351078a78befe44c205e665063d2437f322bd6907d96cdab41adbcf267")
    override
        fun serviceCatalogProvisionedProductDetails(serviceCatalogProvisionedProductDetails: ServiceCatalogProvisionedProductDetailsProperty.Builder.() -> Unit):
        Unit =
        serviceCatalogProvisionedProductDetails(ServiceCatalogProvisionedProductDetailsProperty(serviceCatalogProvisionedProductDetails))

    /**
     * The product ID and provisioning artifact ID to provision a service catalog.
     *
     * For information, see [What is AWS Service
     * Catalog](https://docs.aws.amazon.com/servicecatalog/latest/adminguide/introduction.html) .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-project.html#cfn-sagemaker-project-servicecatalogprovisioningdetails)
     * @param serviceCatalogProvisioningDetails The product ID and provisioning artifact ID to
     * provision a service catalog. 
     */
    override fun serviceCatalogProvisioningDetails(serviceCatalogProvisioningDetails: Any) {
      cdkBuilder.serviceCatalogProvisioningDetails(serviceCatalogProvisioningDetails)
    }

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
     * @param tags A list of key-value pairs to apply to this resource. 
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag.Companion::unwrap))
    }

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
     * @param tags A list of key-value pairs to apply to this resource. 
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    /**
     * An array of template providers associated with the project.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-project.html#cfn-sagemaker-project-templateproviderdetails)
     * @param templateProviderDetails An array of template providers associated with the project. 
     */
    override fun templateProviderDetails(templateProviderDetails: IResolvable) {
      cdkBuilder.templateProviderDetails(templateProviderDetails.let(IResolvable.Companion::unwrap))
    }

    /**
     * An array of template providers associated with the project.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-project.html#cfn-sagemaker-project-templateproviderdetails)
     * @param templateProviderDetails An array of template providers associated with the project. 
     */
    override fun templateProviderDetails(templateProviderDetails: List<Any>) {
      cdkBuilder.templateProviderDetails(templateProviderDetails.map{CdkObjectWrappers.unwrap(it)})
    }

    /**
     * An array of template providers associated with the project.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-project.html#cfn-sagemaker-project-templateproviderdetails)
     * @param templateProviderDetails An array of template providers associated with the project. 
     */
    override fun templateProviderDetails(vararg templateProviderDetails: Any): Unit =
        templateProviderDetails(templateProviderDetails.toList())

    public fun build(): software.amazon.awscdk.services.sagemaker.CfnProject = cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.sagemaker.CfnProject.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnProject {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnProject(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.sagemaker.CfnProject): CfnProject =
        CfnProject(cdkObject)

    internal fun unwrap(wrapped: CfnProject): software.amazon.awscdk.services.sagemaker.CfnProject =
        wrapped.cdkObject as software.amazon.awscdk.services.sagemaker.CfnProject
  }

  /**
   * A key-value pair representing a parameter used in the CloudFormation stack.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.sagemaker.*;
   * CfnStackParameterProperty cfnStackParameterProperty = CfnStackParameterProperty.builder()
   * .key("key")
   * .value("value")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-project-cfnstackparameter.html)
   */
  public interface CfnStackParameterProperty {
    /**
     * The name of the CloudFormation parameter.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-project-cfnstackparameter.html#cfn-sagemaker-project-cfnstackparameter-key)
     */
    public fun key(): String

    /**
     * The value of the CloudFormation parameter.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-project-cfnstackparameter.html#cfn-sagemaker-project-cfnstackparameter-value)
     */
    public fun `value`(): String

    /**
     * A builder for [CfnStackParameterProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param key The name of the CloudFormation parameter. 
       */
      public fun key(key: String)

      /**
       * @param value The value of the CloudFormation parameter. 
       */
      public fun `value`(`value`: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.sagemaker.CfnProject.CfnStackParameterProperty.Builder =
          software.amazon.awscdk.services.sagemaker.CfnProject.CfnStackParameterProperty.builder()

      /**
       * @param key The name of the CloudFormation parameter. 
       */
      override fun key(key: String) {
        cdkBuilder.key(key)
      }

      /**
       * @param value The value of the CloudFormation parameter. 
       */
      override fun `value`(`value`: String) {
        cdkBuilder.`value`(`value`)
      }

      public fun build():
          software.amazon.awscdk.services.sagemaker.CfnProject.CfnStackParameterProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.sagemaker.CfnProject.CfnStackParameterProperty,
    ) : CdkObject(cdkObject),
        CfnStackParameterProperty {
      /**
       * The name of the CloudFormation parameter.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-project-cfnstackparameter.html#cfn-sagemaker-project-cfnstackparameter-key)
       */
      override fun key(): String = unwrap(this).getKey()

      /**
       * The value of the CloudFormation parameter.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-project-cfnstackparameter.html#cfn-sagemaker-project-cfnstackparameter-value)
       */
      override fun `value`(): String = unwrap(this).getValue()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): CfnStackParameterProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.sagemaker.CfnProject.CfnStackParameterProperty):
          CfnStackParameterProperty = CdkObjectWrappers.wrap(cdkObject) as?
          CfnStackParameterProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: CfnStackParameterProperty):
          software.amazon.awscdk.services.sagemaker.CfnProject.CfnStackParameterProperty = (wrapped
          as CdkObject).cdkObject as
          software.amazon.awscdk.services.sagemaker.CfnProject.CfnStackParameterProperty
    }
  }

  /**
   * Details about a CloudFormation template provider configuration and associated provisioning
   * information.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.sagemaker.*;
   * CfnTemplateProviderDetailProperty cfnTemplateProviderDetailProperty =
   * CfnTemplateProviderDetailProperty.builder()
   * .templateName("templateName")
   * .templateUrl("templateUrl")
   * // the properties below are optional
   * .parameters(List.of(CfnStackParameterProperty.builder()
   * .key("key")
   * .value("value")
   * .build()))
   * .roleArn("roleArn")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-project-cfntemplateproviderdetail.html)
   */
  public interface CfnTemplateProviderDetailProperty {
    /**
     * An array of CloudFormation stack parameters.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-project-cfntemplateproviderdetail.html#cfn-sagemaker-project-cfntemplateproviderdetail-parameters)
     */
    public fun parameters(): Any? = unwrap(this).getParameters()

    /**
     * The IAM role used by CloudFormation to create the stack.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-project-cfntemplateproviderdetail.html#cfn-sagemaker-project-cfntemplateproviderdetail-rolearn)
     */
    public fun roleArn(): String? = unwrap(this).getRoleArn()

    /**
     * The unique identifier of the template within the project.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-project-cfntemplateproviderdetail.html#cfn-sagemaker-project-cfntemplateproviderdetail-templatename)
     */
    public fun templateName(): String

    /**
     * The Amazon S3 URL of the CloudFormation template.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-project-cfntemplateproviderdetail.html#cfn-sagemaker-project-cfntemplateproviderdetail-templateurl)
     */
    public fun templateUrl(): String

    /**
     * A builder for [CfnTemplateProviderDetailProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param parameters An array of CloudFormation stack parameters.
       */
      public fun parameters(parameters: IResolvable)

      /**
       * @param parameters An array of CloudFormation stack parameters.
       */
      public fun parameters(parameters: List<Any>)

      /**
       * @param parameters An array of CloudFormation stack parameters.
       */
      public fun parameters(vararg parameters: Any)

      /**
       * @param roleArn The IAM role used by CloudFormation to create the stack.
       */
      public fun roleArn(roleArn: String)

      /**
       * @param templateName The unique identifier of the template within the project. 
       */
      public fun templateName(templateName: String)

      /**
       * @param templateUrl The Amazon S3 URL of the CloudFormation template. 
       */
      public fun templateUrl(templateUrl: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.sagemaker.CfnProject.CfnTemplateProviderDetailProperty.Builder
          =
          software.amazon.awscdk.services.sagemaker.CfnProject.CfnTemplateProviderDetailProperty.builder()

      /**
       * @param parameters An array of CloudFormation stack parameters.
       */
      override fun parameters(parameters: IResolvable) {
        cdkBuilder.parameters(parameters.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param parameters An array of CloudFormation stack parameters.
       */
      override fun parameters(parameters: List<Any>) {
        cdkBuilder.parameters(parameters.map{CdkObjectWrappers.unwrap(it)})
      }

      /**
       * @param parameters An array of CloudFormation stack parameters.
       */
      override fun parameters(vararg parameters: Any): Unit = parameters(parameters.toList())

      /**
       * @param roleArn The IAM role used by CloudFormation to create the stack.
       */
      override fun roleArn(roleArn: String) {
        cdkBuilder.roleArn(roleArn)
      }

      /**
       * @param templateName The unique identifier of the template within the project. 
       */
      override fun templateName(templateName: String) {
        cdkBuilder.templateName(templateName)
      }

      /**
       * @param templateUrl The Amazon S3 URL of the CloudFormation template. 
       */
      override fun templateUrl(templateUrl: String) {
        cdkBuilder.templateUrl(templateUrl)
      }

      public fun build():
          software.amazon.awscdk.services.sagemaker.CfnProject.CfnTemplateProviderDetailProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.sagemaker.CfnProject.CfnTemplateProviderDetailProperty,
    ) : CdkObject(cdkObject),
        CfnTemplateProviderDetailProperty {
      /**
       * An array of CloudFormation stack parameters.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-project-cfntemplateproviderdetail.html#cfn-sagemaker-project-cfntemplateproviderdetail-parameters)
       */
      override fun parameters(): Any? = unwrap(this).getParameters()

      /**
       * The IAM role used by CloudFormation to create the stack.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-project-cfntemplateproviderdetail.html#cfn-sagemaker-project-cfntemplateproviderdetail-rolearn)
       */
      override fun roleArn(): String? = unwrap(this).getRoleArn()

      /**
       * The unique identifier of the template within the project.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-project-cfntemplateproviderdetail.html#cfn-sagemaker-project-cfntemplateproviderdetail-templatename)
       */
      override fun templateName(): String = unwrap(this).getTemplateName()

      /**
       * The Amazon S3 URL of the CloudFormation template.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-project-cfntemplateproviderdetail.html#cfn-sagemaker-project-cfntemplateproviderdetail-templateurl)
       */
      override fun templateUrl(): String = unwrap(this).getTemplateUrl()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          CfnTemplateProviderDetailProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.sagemaker.CfnProject.CfnTemplateProviderDetailProperty):
          CfnTemplateProviderDetailProperty = CdkObjectWrappers.wrap(cdkObject) as?
          CfnTemplateProviderDetailProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: CfnTemplateProviderDetailProperty):
          software.amazon.awscdk.services.sagemaker.CfnProject.CfnTemplateProviderDetailProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.sagemaker.CfnProject.CfnTemplateProviderDetailProperty
    }
  }

  /**
   * A key value pair used when you provision a project as a service catalog product.
   *
   * For information, see [What is AWS Service
   * Catalog](https://docs.aws.amazon.com/servicecatalog/latest/adminguide/introduction.html) .
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.sagemaker.*;
   * ProvisioningParameterProperty provisioningParameterProperty =
   * ProvisioningParameterProperty.builder()
   * .key("key")
   * .value("value")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-project-provisioningparameter.html)
   */
  public interface ProvisioningParameterProperty {
    /**
     * The key that identifies a provisioning parameter.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-project-provisioningparameter.html#cfn-sagemaker-project-provisioningparameter-key)
     */
    public fun key(): String

    /**
     * The value of the provisioning parameter.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-project-provisioningparameter.html#cfn-sagemaker-project-provisioningparameter-value)
     */
    public fun `value`(): String

    /**
     * A builder for [ProvisioningParameterProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param key The key that identifies a provisioning parameter. 
       */
      public fun key(key: String)

      /**
       * @param value The value of the provisioning parameter. 
       */
      public fun `value`(`value`: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.sagemaker.CfnProject.ProvisioningParameterProperty.Builder
          =
          software.amazon.awscdk.services.sagemaker.CfnProject.ProvisioningParameterProperty.builder()

      /**
       * @param key The key that identifies a provisioning parameter. 
       */
      override fun key(key: String) {
        cdkBuilder.key(key)
      }

      /**
       * @param value The value of the provisioning parameter. 
       */
      override fun `value`(`value`: String) {
        cdkBuilder.`value`(`value`)
      }

      public fun build():
          software.amazon.awscdk.services.sagemaker.CfnProject.ProvisioningParameterProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.sagemaker.CfnProject.ProvisioningParameterProperty,
    ) : CdkObject(cdkObject),
        ProvisioningParameterProperty {
      /**
       * The key that identifies a provisioning parameter.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-project-provisioningparameter.html#cfn-sagemaker-project-provisioningparameter-key)
       */
      override fun key(): String = unwrap(this).getKey()

      /**
       * The value of the provisioning parameter.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-project-provisioningparameter.html#cfn-sagemaker-project-provisioningparameter-value)
       */
      override fun `value`(): String = unwrap(this).getValue()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): ProvisioningParameterProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.sagemaker.CfnProject.ProvisioningParameterProperty):
          ProvisioningParameterProperty = CdkObjectWrappers.wrap(cdkObject) as?
          ProvisioningParameterProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: ProvisioningParameterProperty):
          software.amazon.awscdk.services.sagemaker.CfnProject.ProvisioningParameterProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.sagemaker.CfnProject.ProvisioningParameterProperty
    }
  }

  /**
   * Details of a provisioned service catalog product.
   *
   * For information about service catalog, see [What is AWS Service
   * Catalog](https://docs.aws.amazon.com/servicecatalog/latest/adminguide/introduction.html) .
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.sagemaker.*;
   * ServiceCatalogProvisionedProductDetailsProperty serviceCatalogProvisionedProductDetailsProperty
   * = ServiceCatalogProvisionedProductDetailsProperty.builder()
   * .provisionedProductId("provisionedProductId")
   * .provisionedProductStatusMessage("provisionedProductStatusMessage")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-project-servicecatalogprovisionedproductdetails.html)
   */
  public interface ServiceCatalogProvisionedProductDetailsProperty {
    /**
     * The ID of the provisioned product.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-project-servicecatalogprovisionedproductdetails.html#cfn-sagemaker-project-servicecatalogprovisionedproductdetails-provisionedproductid)
     */
    public fun provisionedProductId(): String? = unwrap(this).getProvisionedProductId()

    /**
     * The current status of the product.
     *
     * * `AVAILABLE` - Stable state, ready to perform any operation. The most recent operation
     * succeeded and completed.
     * * `UNDER_CHANGE` - Transitive state. Operations performed might not have valid results. Wait
     * for an AVAILABLE status before performing operations.
     * * `TAINTED` - Stable state, ready to perform any operation. The stack has completed the
     * requested operation but is not exactly what was requested. For example, a request to update to a
     * new version failed and the stack rolled back to the current version.
     * * `ERROR` - An unexpected error occurred. The provisioned product exists but the stack is not
     * running. For example, CloudFormation received a parameter value that was not valid and could not
     * launch the stack.
     * * `PLAN_IN_PROGRESS` - Transitive state. The plan operations were performed to provision a
     * new product, but resources have not yet been created. After reviewing the list of resources to
     * be created, execute the plan. Wait for an AVAILABLE status before performing operations.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-project-servicecatalogprovisionedproductdetails.html#cfn-sagemaker-project-servicecatalogprovisionedproductdetails-provisionedproductstatusmessage)
     */
    public fun provisionedProductStatusMessage(): String? =
        unwrap(this).getProvisionedProductStatusMessage()

    /**
     * A builder for [ServiceCatalogProvisionedProductDetailsProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param provisionedProductId The ID of the provisioned product.
       */
      public fun provisionedProductId(provisionedProductId: String)

      /**
       * @param provisionedProductStatusMessage The current status of the product.
       * * `AVAILABLE` - Stable state, ready to perform any operation. The most recent operation
       * succeeded and completed.
       * * `UNDER_CHANGE` - Transitive state. Operations performed might not have valid results.
       * Wait for an AVAILABLE status before performing operations.
       * * `TAINTED` - Stable state, ready to perform any operation. The stack has completed the
       * requested operation but is not exactly what was requested. For example, a request to update to
       * a new version failed and the stack rolled back to the current version.
       * * `ERROR` - An unexpected error occurred. The provisioned product exists but the stack is
       * not running. For example, CloudFormation received a parameter value that was not valid and
       * could not launch the stack.
       * * `PLAN_IN_PROGRESS` - Transitive state. The plan operations were performed to provision a
       * new product, but resources have not yet been created. After reviewing the list of resources to
       * be created, execute the plan. Wait for an AVAILABLE status before performing operations.
       */
      public fun provisionedProductStatusMessage(provisionedProductStatusMessage: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.sagemaker.CfnProject.ServiceCatalogProvisionedProductDetailsProperty.Builder
          =
          software.amazon.awscdk.services.sagemaker.CfnProject.ServiceCatalogProvisionedProductDetailsProperty.builder()

      /**
       * @param provisionedProductId The ID of the provisioned product.
       */
      override fun provisionedProductId(provisionedProductId: String) {
        cdkBuilder.provisionedProductId(provisionedProductId)
      }

      /**
       * @param provisionedProductStatusMessage The current status of the product.
       * * `AVAILABLE` - Stable state, ready to perform any operation. The most recent operation
       * succeeded and completed.
       * * `UNDER_CHANGE` - Transitive state. Operations performed might not have valid results.
       * Wait for an AVAILABLE status before performing operations.
       * * `TAINTED` - Stable state, ready to perform any operation. The stack has completed the
       * requested operation but is not exactly what was requested. For example, a request to update to
       * a new version failed and the stack rolled back to the current version.
       * * `ERROR` - An unexpected error occurred. The provisioned product exists but the stack is
       * not running. For example, CloudFormation received a parameter value that was not valid and
       * could not launch the stack.
       * * `PLAN_IN_PROGRESS` - Transitive state. The plan operations were performed to provision a
       * new product, but resources have not yet been created. After reviewing the list of resources to
       * be created, execute the plan. Wait for an AVAILABLE status before performing operations.
       */
      override fun provisionedProductStatusMessage(provisionedProductStatusMessage: String) {
        cdkBuilder.provisionedProductStatusMessage(provisionedProductStatusMessage)
      }

      public fun build():
          software.amazon.awscdk.services.sagemaker.CfnProject.ServiceCatalogProvisionedProductDetailsProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.sagemaker.CfnProject.ServiceCatalogProvisionedProductDetailsProperty,
    ) : CdkObject(cdkObject),
        ServiceCatalogProvisionedProductDetailsProperty {
      /**
       * The ID of the provisioned product.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-project-servicecatalogprovisionedproductdetails.html#cfn-sagemaker-project-servicecatalogprovisionedproductdetails-provisionedproductid)
       */
      override fun provisionedProductId(): String? = unwrap(this).getProvisionedProductId()

      /**
       * The current status of the product.
       *
       * * `AVAILABLE` - Stable state, ready to perform any operation. The most recent operation
       * succeeded and completed.
       * * `UNDER_CHANGE` - Transitive state. Operations performed might not have valid results.
       * Wait for an AVAILABLE status before performing operations.
       * * `TAINTED` - Stable state, ready to perform any operation. The stack has completed the
       * requested operation but is not exactly what was requested. For example, a request to update to
       * a new version failed and the stack rolled back to the current version.
       * * `ERROR` - An unexpected error occurred. The provisioned product exists but the stack is
       * not running. For example, CloudFormation received a parameter value that was not valid and
       * could not launch the stack.
       * * `PLAN_IN_PROGRESS` - Transitive state. The plan operations were performed to provision a
       * new product, but resources have not yet been created. After reviewing the list of resources to
       * be created, execute the plan. Wait for an AVAILABLE status before performing operations.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-project-servicecatalogprovisionedproductdetails.html#cfn-sagemaker-project-servicecatalogprovisionedproductdetails-provisionedproductstatusmessage)
       */
      override fun provisionedProductStatusMessage(): String? =
          unwrap(this).getProvisionedProductStatusMessage()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          ServiceCatalogProvisionedProductDetailsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.sagemaker.CfnProject.ServiceCatalogProvisionedProductDetailsProperty):
          ServiceCatalogProvisionedProductDetailsProperty = CdkObjectWrappers.wrap(cdkObject) as?
          ServiceCatalogProvisionedProductDetailsProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: ServiceCatalogProvisionedProductDetailsProperty):
          software.amazon.awscdk.services.sagemaker.CfnProject.ServiceCatalogProvisionedProductDetailsProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.sagemaker.CfnProject.ServiceCatalogProvisionedProductDetailsProperty
    }
  }

  /**
   * Details that you specify to provision a service catalog product.
   *
   * For information about service catalog, see [What is AWS Service
   * Catalog](https://docs.aws.amazon.com/servicecatalog/latest/adminguide/introduction.html) .
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.sagemaker.*;
   * ServiceCatalogProvisioningDetailsProperty serviceCatalogProvisioningDetailsProperty =
   * ServiceCatalogProvisioningDetailsProperty.builder()
   * .productId("productId")
   * // the properties below are optional
   * .pathId("pathId")
   * .provisioningArtifactId("provisioningArtifactId")
   * .provisioningParameters(List.of(ProvisioningParameterProperty.builder()
   * .key("key")
   * .value("value")
   * .build()))
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-project-servicecatalogprovisioningdetails.html)
   */
  public interface ServiceCatalogProvisioningDetailsProperty {
    /**
     * The path identifier of the product.
     *
     * This value is optional if the product has a default path, and required if the product has
     * more than one path.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-project-servicecatalogprovisioningdetails.html#cfn-sagemaker-project-servicecatalogprovisioningdetails-pathid)
     */
    public fun pathId(): String? = unwrap(this).getPathId()

    /**
     * The ID of the product to provision.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-project-servicecatalogprovisioningdetails.html#cfn-sagemaker-project-servicecatalogprovisioningdetails-productid)
     */
    public fun productId(): String

    /**
     * The ID of the provisioning artifact.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-project-servicecatalogprovisioningdetails.html#cfn-sagemaker-project-servicecatalogprovisioningdetails-provisioningartifactid)
     */
    public fun provisioningArtifactId(): String? = unwrap(this).getProvisioningArtifactId()

    /**
     * A list of key value pairs that you specify when you provision a product.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-project-servicecatalogprovisioningdetails.html#cfn-sagemaker-project-servicecatalogprovisioningdetails-provisioningparameters)
     */
    public fun provisioningParameters(): Any? = unwrap(this).getProvisioningParameters()

    /**
     * A builder for [ServiceCatalogProvisioningDetailsProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param pathId The path identifier of the product.
       * This value is optional if the product has a default path, and required if the product has
       * more than one path.
       */
      public fun pathId(pathId: String)

      /**
       * @param productId The ID of the product to provision. 
       */
      public fun productId(productId: String)

      /**
       * @param provisioningArtifactId The ID of the provisioning artifact.
       */
      public fun provisioningArtifactId(provisioningArtifactId: String)

      /**
       * @param provisioningParameters A list of key value pairs that you specify when you provision
       * a product.
       */
      public fun provisioningParameters(provisioningParameters: IResolvable)

      /**
       * @param provisioningParameters A list of key value pairs that you specify when you provision
       * a product.
       */
      public fun provisioningParameters(provisioningParameters: List<Any>)

      /**
       * @param provisioningParameters A list of key value pairs that you specify when you provision
       * a product.
       */
      public fun provisioningParameters(vararg provisioningParameters: Any)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.sagemaker.CfnProject.ServiceCatalogProvisioningDetailsProperty.Builder
          =
          software.amazon.awscdk.services.sagemaker.CfnProject.ServiceCatalogProvisioningDetailsProperty.builder()

      /**
       * @param pathId The path identifier of the product.
       * This value is optional if the product has a default path, and required if the product has
       * more than one path.
       */
      override fun pathId(pathId: String) {
        cdkBuilder.pathId(pathId)
      }

      /**
       * @param productId The ID of the product to provision. 
       */
      override fun productId(productId: String) {
        cdkBuilder.productId(productId)
      }

      /**
       * @param provisioningArtifactId The ID of the provisioning artifact.
       */
      override fun provisioningArtifactId(provisioningArtifactId: String) {
        cdkBuilder.provisioningArtifactId(provisioningArtifactId)
      }

      /**
       * @param provisioningParameters A list of key value pairs that you specify when you provision
       * a product.
       */
      override fun provisioningParameters(provisioningParameters: IResolvable) {
        cdkBuilder.provisioningParameters(provisioningParameters.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param provisioningParameters A list of key value pairs that you specify when you provision
       * a product.
       */
      override fun provisioningParameters(provisioningParameters: List<Any>) {
        cdkBuilder.provisioningParameters(provisioningParameters.map{CdkObjectWrappers.unwrap(it)})
      }

      /**
       * @param provisioningParameters A list of key value pairs that you specify when you provision
       * a product.
       */
      override fun provisioningParameters(vararg provisioningParameters: Any): Unit =
          provisioningParameters(provisioningParameters.toList())

      public fun build():
          software.amazon.awscdk.services.sagemaker.CfnProject.ServiceCatalogProvisioningDetailsProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.sagemaker.CfnProject.ServiceCatalogProvisioningDetailsProperty,
    ) : CdkObject(cdkObject),
        ServiceCatalogProvisioningDetailsProperty {
      /**
       * The path identifier of the product.
       *
       * This value is optional if the product has a default path, and required if the product has
       * more than one path.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-project-servicecatalogprovisioningdetails.html#cfn-sagemaker-project-servicecatalogprovisioningdetails-pathid)
       */
      override fun pathId(): String? = unwrap(this).getPathId()

      /**
       * The ID of the product to provision.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-project-servicecatalogprovisioningdetails.html#cfn-sagemaker-project-servicecatalogprovisioningdetails-productid)
       */
      override fun productId(): String = unwrap(this).getProductId()

      /**
       * The ID of the provisioning artifact.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-project-servicecatalogprovisioningdetails.html#cfn-sagemaker-project-servicecatalogprovisioningdetails-provisioningartifactid)
       */
      override fun provisioningArtifactId(): String? = unwrap(this).getProvisioningArtifactId()

      /**
       * A list of key value pairs that you specify when you provision a product.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-project-servicecatalogprovisioningdetails.html#cfn-sagemaker-project-servicecatalogprovisioningdetails-provisioningparameters)
       */
      override fun provisioningParameters(): Any? = unwrap(this).getProvisioningParameters()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          ServiceCatalogProvisioningDetailsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.sagemaker.CfnProject.ServiceCatalogProvisioningDetailsProperty):
          ServiceCatalogProvisioningDetailsProperty = CdkObjectWrappers.wrap(cdkObject) as?
          ServiceCatalogProvisioningDetailsProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: ServiceCatalogProvisioningDetailsProperty):
          software.amazon.awscdk.services.sagemaker.CfnProject.ServiceCatalogProvisioningDetailsProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.sagemaker.CfnProject.ServiceCatalogProvisioningDetailsProperty
    }
  }

  /**
   * Details about a template provider configuration and associated provisioning information.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.sagemaker.*;
   * TemplateProviderDetailProperty templateProviderDetailProperty =
   * TemplateProviderDetailProperty.builder()
   * .cfnTemplateProviderDetail(CfnTemplateProviderDetailProperty.builder()
   * .templateName("templateName")
   * .templateUrl("templateUrl")
   * // the properties below are optional
   * .parameters(List.of(CfnStackParameterProperty.builder()
   * .key("key")
   * .value("value")
   * .build()))
   * .roleArn("roleArn")
   * .build())
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-project-templateproviderdetail.html)
   */
  public interface TemplateProviderDetailProperty {
    /**
     * Details about a CloudFormation template provider configuration and associated provisioning
     * information.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-project-templateproviderdetail.html#cfn-sagemaker-project-templateproviderdetail-cfntemplateproviderdetail)
     */
    public fun cfnTemplateProviderDetail(): Any

    /**
     * A builder for [TemplateProviderDetailProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param cfnTemplateProviderDetail Details about a CloudFormation template provider
       * configuration and associated provisioning information. 
       */
      public fun cfnTemplateProviderDetail(cfnTemplateProviderDetail: IResolvable)

      /**
       * @param cfnTemplateProviderDetail Details about a CloudFormation template provider
       * configuration and associated provisioning information. 
       */
      public
          fun cfnTemplateProviderDetail(cfnTemplateProviderDetail: CfnTemplateProviderDetailProperty)

      /**
       * @param cfnTemplateProviderDetail Details about a CloudFormation template provider
       * configuration and associated provisioning information. 
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("c8e0970682d2d2029aea0b9e3db5c44347aecabcced8998a8f3dde76dcf737cb")
      public
          fun cfnTemplateProviderDetail(cfnTemplateProviderDetail: CfnTemplateProviderDetailProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.sagemaker.CfnProject.TemplateProviderDetailProperty.Builder
          =
          software.amazon.awscdk.services.sagemaker.CfnProject.TemplateProviderDetailProperty.builder()

      /**
       * @param cfnTemplateProviderDetail Details about a CloudFormation template provider
       * configuration and associated provisioning information. 
       */
      override fun cfnTemplateProviderDetail(cfnTemplateProviderDetail: IResolvable) {
        cdkBuilder.cfnTemplateProviderDetail(cfnTemplateProviderDetail.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param cfnTemplateProviderDetail Details about a CloudFormation template provider
       * configuration and associated provisioning information. 
       */
      override
          fun cfnTemplateProviderDetail(cfnTemplateProviderDetail: CfnTemplateProviderDetailProperty) {
        cdkBuilder.cfnTemplateProviderDetail(cfnTemplateProviderDetail.let(CfnTemplateProviderDetailProperty.Companion::unwrap))
      }

      /**
       * @param cfnTemplateProviderDetail Details about a CloudFormation template provider
       * configuration and associated provisioning information. 
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("c8e0970682d2d2029aea0b9e3db5c44347aecabcced8998a8f3dde76dcf737cb")
      override
          fun cfnTemplateProviderDetail(cfnTemplateProviderDetail: CfnTemplateProviderDetailProperty.Builder.() -> Unit):
          Unit =
          cfnTemplateProviderDetail(CfnTemplateProviderDetailProperty(cfnTemplateProviderDetail))

      public fun build():
          software.amazon.awscdk.services.sagemaker.CfnProject.TemplateProviderDetailProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.sagemaker.CfnProject.TemplateProviderDetailProperty,
    ) : CdkObject(cdkObject),
        TemplateProviderDetailProperty {
      /**
       * Details about a CloudFormation template provider configuration and associated provisioning
       * information.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-project-templateproviderdetail.html#cfn-sagemaker-project-templateproviderdetail-cfntemplateproviderdetail)
       */
      override fun cfnTemplateProviderDetail(): Any = unwrap(this).getCfnTemplateProviderDetail()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): TemplateProviderDetailProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.sagemaker.CfnProject.TemplateProviderDetailProperty):
          TemplateProviderDetailProperty = CdkObjectWrappers.wrap(cdkObject) as?
          TemplateProviderDetailProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: TemplateProviderDetailProperty):
          software.amazon.awscdk.services.sagemaker.CfnProject.TemplateProviderDetailProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.sagemaker.CfnProject.TemplateProviderDetailProperty
    }
  }
}
