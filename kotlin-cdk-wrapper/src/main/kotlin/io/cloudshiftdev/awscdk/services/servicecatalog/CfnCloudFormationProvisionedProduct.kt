@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.servicecatalog

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
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * Provisions the specified product.
 *
 * A provisioned product is a resourced instance of a product. For example, provisioning a product
 * based on a AWS CloudFormation template launches a AWS CloudFormation stack and its underlying
 * resources. You can check the status of this request using
 * [DescribeRecord](https://docs.aws.amazon.com/servicecatalog/latest/dg/API_DescribeRecord.html) .
 *
 * If the request contains a tag key with an empty list of values, there is a tag conflict for that
 * key. Do not include conflicted keys as tags, or this causes the error "Parameter validation failed:
 * Missing required parameter in Tags[ *N* ]: *Value* ".
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.servicecatalog.*;
 * CfnCloudFormationProvisionedProduct cfnCloudFormationProvisionedProduct =
 * CfnCloudFormationProvisionedProduct.Builder.create(this, "MyCfnCloudFormationProvisionedProduct")
 * .acceptLanguage("acceptLanguage")
 * .notificationArns(List.of("notificationArns"))
 * .pathId("pathId")
 * .pathName("pathName")
 * .productId("productId")
 * .productName("productName")
 * .provisionedProductName("provisionedProductName")
 * .provisioningArtifactId("provisioningArtifactId")
 * .provisioningArtifactName("provisioningArtifactName")
 * .provisioningParameters(List.of(ProvisioningParameterProperty.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .provisioningPreferences(ProvisioningPreferencesProperty.builder()
 * .stackSetAccounts(List.of("stackSetAccounts"))
 * .stackSetFailureToleranceCount(123)
 * .stackSetFailureTolerancePercentage(123)
 * .stackSetMaxConcurrencyCount(123)
 * .stackSetMaxConcurrencyPercentage(123)
 * .stackSetOperationType("stackSetOperationType")
 * .stackSetRegions(List.of("stackSetRegions"))
 * .build())
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-cloudformationprovisionedproduct.html)
 */
public open class CfnCloudFormationProvisionedProduct(
  cdkObject: software.amazon.awscdk.services.servicecatalog.CfnCloudFormationProvisionedProduct,
) : CfnResource(cdkObject),
    IInspectable,
    ITaggable {
  public constructor(scope: CloudshiftdevConstructsConstruct, id: String) :
      this(software.amazon.awscdk.services.servicecatalog.CfnCloudFormationProvisionedProduct(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id)
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnCloudFormationProvisionedProductProps,
  ) :
      this(software.amazon.awscdk.services.servicecatalog.CfnCloudFormationProvisionedProduct(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id, props.let(CfnCloudFormationProvisionedProductProps.Companion::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnCloudFormationProvisionedProductProps.Builder.() -> Unit,
  ) : this(scope, id, CfnCloudFormationProvisionedProductProps(props)
  )

  /**
   * The language code.
   */
  public open fun acceptLanguage(): String? = unwrap(this).getAcceptLanguage()

  /**
   * The language code.
   */
  public open fun acceptLanguage(`value`: String) {
    unwrap(this).setAcceptLanguage(`value`)
  }

  /**
   *
   */
  public open fun attrCloudformationStackArn(): String =
      unwrap(this).getAttrCloudformationStackArn()

  /**
   * List of key-value pair outputs.
   */
  public open fun attrOutputs(): IResolvable = unwrap(this).getAttrOutputs().let(IResolvable::wrap)

  /**
   * The ID of the provisioned product.
   */
  public open fun attrProvisionedProductId(): String = unwrap(this).getAttrProvisionedProductId()

  /**
   * The ID of the record, such as `rec-rjeatvy434trk` .
   */
  public open fun attrRecordId(): String = unwrap(this).getAttrRecordId()

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector.Companion::unwrap))
  }

  /**
   * Passed to AWS CloudFormation .
   */
  public open fun notificationArns(): List<String> = unwrap(this).getNotificationArns() ?:
      emptyList()

  /**
   * Passed to AWS CloudFormation .
   */
  public open fun notificationArns(`value`: List<String>) {
    unwrap(this).setNotificationArns(`value`)
  }

  /**
   * Passed to AWS CloudFormation .
   */
  public open fun notificationArns(vararg `value`: String): Unit =
      notificationArns(`value`.toList())

  /**
   * The path identifier of the product.
   */
  public open fun pathId(): String? = unwrap(this).getPathId()

  /**
   * The path identifier of the product.
   */
  public open fun pathId(`value`: String) {
    unwrap(this).setPathId(`value`)
  }

  /**
   * The name of the path.
   */
  public open fun pathName(): String? = unwrap(this).getPathName()

  /**
   * The name of the path.
   */
  public open fun pathName(`value`: String) {
    unwrap(this).setPathName(`value`)
  }

  /**
   * The product identifier.
   */
  public open fun productId(): String? = unwrap(this).getProductId()

  /**
   * The product identifier.
   */
  public open fun productId(`value`: String) {
    unwrap(this).setProductId(`value`)
  }

  /**
   * The name of the Service Catalog product.
   */
  public open fun productName(): String? = unwrap(this).getProductName()

  /**
   * The name of the Service Catalog product.
   */
  public open fun productName(`value`: String) {
    unwrap(this).setProductName(`value`)
  }

  /**
   * A user-friendly name for the provisioned product.
   */
  public open fun provisionedProductName(): String? = unwrap(this).getProvisionedProductName()

  /**
   * A user-friendly name for the provisioned product.
   */
  public open fun provisionedProductName(`value`: String) {
    unwrap(this).setProvisionedProductName(`value`)
  }

  /**
   * The identifier of the provisioning artifact (also known as a version).
   */
  public open fun provisioningArtifactId(): String? = unwrap(this).getProvisioningArtifactId()

  /**
   * The identifier of the provisioning artifact (also known as a version).
   */
  public open fun provisioningArtifactId(`value`: String) {
    unwrap(this).setProvisioningArtifactId(`value`)
  }

  /**
   * The name of the provisioning artifact (also known as a version) for the product.
   */
  public open fun provisioningArtifactName(): String? = unwrap(this).getProvisioningArtifactName()

  /**
   * The name of the provisioning artifact (also known as a version) for the product.
   */
  public open fun provisioningArtifactName(`value`: String) {
    unwrap(this).setProvisioningArtifactName(`value`)
  }

  /**
   * Parameters specified by the administrator that are required for provisioning the product.
   */
  public open fun provisioningParameters(): Any? = unwrap(this).getProvisioningParameters()

  /**
   * Parameters specified by the administrator that are required for provisioning the product.
   */
  public open fun provisioningParameters(`value`: IResolvable) {
    unwrap(this).setProvisioningParameters(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * Parameters specified by the administrator that are required for provisioning the product.
   */
  public open fun provisioningParameters(`value`: List<Any>) {
    unwrap(this).setProvisioningParameters(`value`.map{CdkObjectWrappers.unwrap(it)})
  }

  /**
   * Parameters specified by the administrator that are required for provisioning the product.
   */
  public open fun provisioningParameters(vararg `value`: Any): Unit =
      provisioningParameters(`value`.toList())

  /**
   * StackSet preferences that are required for provisioning the product or updating a provisioned
   * product.
   */
  public open fun provisioningPreferences(): Any? = unwrap(this).getProvisioningPreferences()

  /**
   * StackSet preferences that are required for provisioning the product or updating a provisioned
   * product.
   */
  public open fun provisioningPreferences(`value`: IResolvable) {
    unwrap(this).setProvisioningPreferences(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * StackSet preferences that are required for provisioning the product or updating a provisioned
   * product.
   */
  public open fun provisioningPreferences(`value`: ProvisioningPreferencesProperty) {
    unwrap(this).setProvisioningPreferences(`value`.let(ProvisioningPreferencesProperty.Companion::unwrap))
  }

  /**
   * StackSet preferences that are required for provisioning the product or updating a provisioned
   * product.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("9acaf27f7db779f54053aec0fb0497cf8a20985d8f50aa021a2787e9423728cb")
  public open
      fun provisioningPreferences(`value`: ProvisioningPreferencesProperty.Builder.() -> Unit): Unit
      = provisioningPreferences(ProvisioningPreferencesProperty(`value`))

  /**
   * Tag Manager which manages the tags for this resource.
   */
  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  /**
   * One or more tags.
   */
  public open fun tagsRaw(): List<CfnTag> = unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?:
      emptyList()

  /**
   * One or more tags.
   */
  public open fun tagsRaw(`value`: List<CfnTag>) {
    unwrap(this).setTagsRaw(`value`.map(CfnTag.Companion::unwrap))
  }

  /**
   * One or more tags.
   */
  public open fun tagsRaw(vararg `value`: CfnTag): Unit = tagsRaw(`value`.toList())

  /**
   * A fluent builder for
   * [io.cloudshiftdev.awscdk.services.servicecatalog.CfnCloudFormationProvisionedProduct].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The language code.
     *
     * * `jp` - Japanese
     * * `zh` - Chinese
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-cloudformationprovisionedproduct.html#cfn-servicecatalog-cloudformationprovisionedproduct-acceptlanguage)
     * @param acceptLanguage The language code. 
     */
    public fun acceptLanguage(acceptLanguage: String)

    /**
     * Passed to AWS CloudFormation .
     *
     * The SNS topic ARNs to which to publish stack-related events.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-cloudformationprovisionedproduct.html#cfn-servicecatalog-cloudformationprovisionedproduct-notificationarns)
     * @param notificationArns Passed to AWS CloudFormation . 
     */
    public fun notificationArns(notificationArns: List<String>)

    /**
     * Passed to AWS CloudFormation .
     *
     * The SNS topic ARNs to which to publish stack-related events.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-cloudformationprovisionedproduct.html#cfn-servicecatalog-cloudformationprovisionedproduct-notificationarns)
     * @param notificationArns Passed to AWS CloudFormation . 
     */
    public fun notificationArns(vararg notificationArns: String)

    /**
     * The path identifier of the product.
     *
     * This value is optional if the product has a default path, and required if the product has
     * more than one path. To list the paths for a product, use
     * [ListLaunchPaths](https://docs.aws.amazon.com/servicecatalog/latest/dg/API_ListLaunchPaths.html)
     * .
     *
     *
     * You must provide the name or ID, but not both.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-cloudformationprovisionedproduct.html#cfn-servicecatalog-cloudformationprovisionedproduct-pathid)
     * @param pathId The path identifier of the product. 
     */
    public fun pathId(pathId: String)

    /**
     * The name of the path.
     *
     * This value is optional if the product has a default path, and required if the product has
     * more than one path. To list the paths for a product, use
     * [ListLaunchPaths](https://docs.aws.amazon.com/servicecatalog/latest/dg/API_ListLaunchPaths.html)
     * .
     *
     *
     * You must provide the name or ID, but not both.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-cloudformationprovisionedproduct.html#cfn-servicecatalog-cloudformationprovisionedproduct-pathname)
     * @param pathName The name of the path. 
     */
    public fun pathName(pathName: String)

    /**
     * The product identifier.
     *
     *
     * You must specify either the ID or the name of the product, but not both.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-cloudformationprovisionedproduct.html#cfn-servicecatalog-cloudformationprovisionedproduct-productid)
     * @param productId The product identifier. 
     */
    public fun productId(productId: String)

    /**
     * The name of the Service Catalog product.
     *
     * Each time a stack is created or updated, if `ProductName` is provided it will successfully
     * resolve to `ProductId` as long as only one product exists in the account or Region with that
     * `ProductName` .
     *
     *
     * You must specify either the name or the ID of the product, but not both.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-cloudformationprovisionedproduct.html#cfn-servicecatalog-cloudformationprovisionedproduct-productname)
     * @param productName The name of the Service Catalog product. 
     */
    public fun productName(productName: String)

    /**
     * A user-friendly name for the provisioned product.
     *
     * This value must be unique for the AWS account and cannot be updated after the product is
     * provisioned.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-cloudformationprovisionedproduct.html#cfn-servicecatalog-cloudformationprovisionedproduct-provisionedproductname)
     * @param provisionedProductName A user-friendly name for the provisioned product. 
     */
    public fun provisionedProductName(provisionedProductName: String)

    /**
     * The identifier of the provisioning artifact (also known as a version).
     *
     *
     * You must specify either the ID or the name of the provisioning artifact, but not both.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-cloudformationprovisionedproduct.html#cfn-servicecatalog-cloudformationprovisionedproduct-provisioningartifactid)
     * @param provisioningArtifactId The identifier of the provisioning artifact (also known as a
     * version). 
     */
    public fun provisioningArtifactId(provisioningArtifactId: String)

    /**
     * The name of the provisioning artifact (also known as a version) for the product.
     *
     * This name must be unique for the product.
     *
     *
     * You must specify either the name or the ID of the provisioning artifact, but not both. You
     * must also specify either the name or the ID of the product, but not both.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-cloudformationprovisionedproduct.html#cfn-servicecatalog-cloudformationprovisionedproduct-provisioningartifactname)
     * @param provisioningArtifactName The name of the provisioning artifact (also known as a
     * version) for the product. 
     */
    public fun provisioningArtifactName(provisioningArtifactName: String)

    /**
     * Parameters specified by the administrator that are required for provisioning the product.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-cloudformationprovisionedproduct.html#cfn-servicecatalog-cloudformationprovisionedproduct-provisioningparameters)
     * @param provisioningParameters Parameters specified by the administrator that are required for
     * provisioning the product. 
     */
    public fun provisioningParameters(provisioningParameters: IResolvable)

    /**
     * Parameters specified by the administrator that are required for provisioning the product.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-cloudformationprovisionedproduct.html#cfn-servicecatalog-cloudformationprovisionedproduct-provisioningparameters)
     * @param provisioningParameters Parameters specified by the administrator that are required for
     * provisioning the product. 
     */
    public fun provisioningParameters(provisioningParameters: List<Any>)

    /**
     * Parameters specified by the administrator that are required for provisioning the product.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-cloudformationprovisionedproduct.html#cfn-servicecatalog-cloudformationprovisionedproduct-provisioningparameters)
     * @param provisioningParameters Parameters specified by the administrator that are required for
     * provisioning the product. 
     */
    public fun provisioningParameters(vararg provisioningParameters: Any)

    /**
     * StackSet preferences that are required for provisioning the product or updating a provisioned
     * product.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-cloudformationprovisionedproduct.html#cfn-servicecatalog-cloudformationprovisionedproduct-provisioningpreferences)
     * @param provisioningPreferences StackSet preferences that are required for provisioning the
     * product or updating a provisioned product. 
     */
    public fun provisioningPreferences(provisioningPreferences: IResolvable)

    /**
     * StackSet preferences that are required for provisioning the product or updating a provisioned
     * product.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-cloudformationprovisionedproduct.html#cfn-servicecatalog-cloudformationprovisionedproduct-provisioningpreferences)
     * @param provisioningPreferences StackSet preferences that are required for provisioning the
     * product or updating a provisioned product. 
     */
    public fun provisioningPreferences(provisioningPreferences: ProvisioningPreferencesProperty)

    /**
     * StackSet preferences that are required for provisioning the product or updating a provisioned
     * product.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-cloudformationprovisionedproduct.html#cfn-servicecatalog-cloudformationprovisionedproduct-provisioningpreferences)
     * @param provisioningPreferences StackSet preferences that are required for provisioning the
     * product or updating a provisioned product. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("3c7bfa0d91a2109413d50bab59d017092f8e0720001bd47f7afae9453e5a190b")
    public
        fun provisioningPreferences(provisioningPreferences: ProvisioningPreferencesProperty.Builder.() -> Unit)

    /**
     * One or more tags.
     *
     *
     * Requires the provisioned product to have an
     * [ResourceUpdateConstraint](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-resourceupdateconstraint.html)
     * resource with `TagUpdatesOnProvisionedProduct` set to `ALLOWED` to allow tag updates. If
     * `RESOURCE_UPDATE` constraint is not present, tags updates are ignored.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-cloudformationprovisionedproduct.html#cfn-servicecatalog-cloudformationprovisionedproduct-tags)
     * @param tags One or more tags. 
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * One or more tags.
     *
     *
     * Requires the provisioned product to have an
     * [ResourceUpdateConstraint](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-resourceupdateconstraint.html)
     * resource with `TagUpdatesOnProvisionedProduct` set to `ALLOWED` to allow tag updates. If
     * `RESOURCE_UPDATE` constraint is not present, tags updates are ignored.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-cloudformationprovisionedproduct.html#cfn-servicecatalog-cloudformationprovisionedproduct-tags)
     * @param tags One or more tags. 
     */
    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.servicecatalog.CfnCloudFormationProvisionedProduct.Builder =
        software.amazon.awscdk.services.servicecatalog.CfnCloudFormationProvisionedProduct.Builder.create(scope,
        id)

    /**
     * The language code.
     *
     * * `jp` - Japanese
     * * `zh` - Chinese
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-cloudformationprovisionedproduct.html#cfn-servicecatalog-cloudformationprovisionedproduct-acceptlanguage)
     * @param acceptLanguage The language code. 
     */
    override fun acceptLanguage(acceptLanguage: String) {
      cdkBuilder.acceptLanguage(acceptLanguage)
    }

    /**
     * Passed to AWS CloudFormation .
     *
     * The SNS topic ARNs to which to publish stack-related events.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-cloudformationprovisionedproduct.html#cfn-servicecatalog-cloudformationprovisionedproduct-notificationarns)
     * @param notificationArns Passed to AWS CloudFormation . 
     */
    override fun notificationArns(notificationArns: List<String>) {
      cdkBuilder.notificationArns(notificationArns)
    }

    /**
     * Passed to AWS CloudFormation .
     *
     * The SNS topic ARNs to which to publish stack-related events.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-cloudformationprovisionedproduct.html#cfn-servicecatalog-cloudformationprovisionedproduct-notificationarns)
     * @param notificationArns Passed to AWS CloudFormation . 
     */
    override fun notificationArns(vararg notificationArns: String): Unit =
        notificationArns(notificationArns.toList())

    /**
     * The path identifier of the product.
     *
     * This value is optional if the product has a default path, and required if the product has
     * more than one path. To list the paths for a product, use
     * [ListLaunchPaths](https://docs.aws.amazon.com/servicecatalog/latest/dg/API_ListLaunchPaths.html)
     * .
     *
     *
     * You must provide the name or ID, but not both.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-cloudformationprovisionedproduct.html#cfn-servicecatalog-cloudformationprovisionedproduct-pathid)
     * @param pathId The path identifier of the product. 
     */
    override fun pathId(pathId: String) {
      cdkBuilder.pathId(pathId)
    }

    /**
     * The name of the path.
     *
     * This value is optional if the product has a default path, and required if the product has
     * more than one path. To list the paths for a product, use
     * [ListLaunchPaths](https://docs.aws.amazon.com/servicecatalog/latest/dg/API_ListLaunchPaths.html)
     * .
     *
     *
     * You must provide the name or ID, but not both.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-cloudformationprovisionedproduct.html#cfn-servicecatalog-cloudformationprovisionedproduct-pathname)
     * @param pathName The name of the path. 
     */
    override fun pathName(pathName: String) {
      cdkBuilder.pathName(pathName)
    }

    /**
     * The product identifier.
     *
     *
     * You must specify either the ID or the name of the product, but not both.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-cloudformationprovisionedproduct.html#cfn-servicecatalog-cloudformationprovisionedproduct-productid)
     * @param productId The product identifier. 
     */
    override fun productId(productId: String) {
      cdkBuilder.productId(productId)
    }

    /**
     * The name of the Service Catalog product.
     *
     * Each time a stack is created or updated, if `ProductName` is provided it will successfully
     * resolve to `ProductId` as long as only one product exists in the account or Region with that
     * `ProductName` .
     *
     *
     * You must specify either the name or the ID of the product, but not both.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-cloudformationprovisionedproduct.html#cfn-servicecatalog-cloudformationprovisionedproduct-productname)
     * @param productName The name of the Service Catalog product. 
     */
    override fun productName(productName: String) {
      cdkBuilder.productName(productName)
    }

    /**
     * A user-friendly name for the provisioned product.
     *
     * This value must be unique for the AWS account and cannot be updated after the product is
     * provisioned.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-cloudformationprovisionedproduct.html#cfn-servicecatalog-cloudformationprovisionedproduct-provisionedproductname)
     * @param provisionedProductName A user-friendly name for the provisioned product. 
     */
    override fun provisionedProductName(provisionedProductName: String) {
      cdkBuilder.provisionedProductName(provisionedProductName)
    }

    /**
     * The identifier of the provisioning artifact (also known as a version).
     *
     *
     * You must specify either the ID or the name of the provisioning artifact, but not both.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-cloudformationprovisionedproduct.html#cfn-servicecatalog-cloudformationprovisionedproduct-provisioningartifactid)
     * @param provisioningArtifactId The identifier of the provisioning artifact (also known as a
     * version). 
     */
    override fun provisioningArtifactId(provisioningArtifactId: String) {
      cdkBuilder.provisioningArtifactId(provisioningArtifactId)
    }

    /**
     * The name of the provisioning artifact (also known as a version) for the product.
     *
     * This name must be unique for the product.
     *
     *
     * You must specify either the name or the ID of the provisioning artifact, but not both. You
     * must also specify either the name or the ID of the product, but not both.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-cloudformationprovisionedproduct.html#cfn-servicecatalog-cloudformationprovisionedproduct-provisioningartifactname)
     * @param provisioningArtifactName The name of the provisioning artifact (also known as a
     * version) for the product. 
     */
    override fun provisioningArtifactName(provisioningArtifactName: String) {
      cdkBuilder.provisioningArtifactName(provisioningArtifactName)
    }

    /**
     * Parameters specified by the administrator that are required for provisioning the product.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-cloudformationprovisionedproduct.html#cfn-servicecatalog-cloudformationprovisionedproduct-provisioningparameters)
     * @param provisioningParameters Parameters specified by the administrator that are required for
     * provisioning the product. 
     */
    override fun provisioningParameters(provisioningParameters: IResolvable) {
      cdkBuilder.provisioningParameters(provisioningParameters.let(IResolvable.Companion::unwrap))
    }

    /**
     * Parameters specified by the administrator that are required for provisioning the product.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-cloudformationprovisionedproduct.html#cfn-servicecatalog-cloudformationprovisionedproduct-provisioningparameters)
     * @param provisioningParameters Parameters specified by the administrator that are required for
     * provisioning the product. 
     */
    override fun provisioningParameters(provisioningParameters: List<Any>) {
      cdkBuilder.provisioningParameters(provisioningParameters.map{CdkObjectWrappers.unwrap(it)})
    }

    /**
     * Parameters specified by the administrator that are required for provisioning the product.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-cloudformationprovisionedproduct.html#cfn-servicecatalog-cloudformationprovisionedproduct-provisioningparameters)
     * @param provisioningParameters Parameters specified by the administrator that are required for
     * provisioning the product. 
     */
    override fun provisioningParameters(vararg provisioningParameters: Any): Unit =
        provisioningParameters(provisioningParameters.toList())

    /**
     * StackSet preferences that are required for provisioning the product or updating a provisioned
     * product.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-cloudformationprovisionedproduct.html#cfn-servicecatalog-cloudformationprovisionedproduct-provisioningpreferences)
     * @param provisioningPreferences StackSet preferences that are required for provisioning the
     * product or updating a provisioned product. 
     */
    override fun provisioningPreferences(provisioningPreferences: IResolvable) {
      cdkBuilder.provisioningPreferences(provisioningPreferences.let(IResolvable.Companion::unwrap))
    }

    /**
     * StackSet preferences that are required for provisioning the product or updating a provisioned
     * product.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-cloudformationprovisionedproduct.html#cfn-servicecatalog-cloudformationprovisionedproduct-provisioningpreferences)
     * @param provisioningPreferences StackSet preferences that are required for provisioning the
     * product or updating a provisioned product. 
     */
    override fun provisioningPreferences(provisioningPreferences: ProvisioningPreferencesProperty) {
      cdkBuilder.provisioningPreferences(provisioningPreferences.let(ProvisioningPreferencesProperty.Companion::unwrap))
    }

    /**
     * StackSet preferences that are required for provisioning the product or updating a provisioned
     * product.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-cloudformationprovisionedproduct.html#cfn-servicecatalog-cloudformationprovisionedproduct-provisioningpreferences)
     * @param provisioningPreferences StackSet preferences that are required for provisioning the
     * product or updating a provisioned product. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("3c7bfa0d91a2109413d50bab59d017092f8e0720001bd47f7afae9453e5a190b")
    override
        fun provisioningPreferences(provisioningPreferences: ProvisioningPreferencesProperty.Builder.() -> Unit):
        Unit = provisioningPreferences(ProvisioningPreferencesProperty(provisioningPreferences))

    /**
     * One or more tags.
     *
     *
     * Requires the provisioned product to have an
     * [ResourceUpdateConstraint](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-resourceupdateconstraint.html)
     * resource with `TagUpdatesOnProvisionedProduct` set to `ALLOWED` to allow tag updates. If
     * `RESOURCE_UPDATE` constraint is not present, tags updates are ignored.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-cloudformationprovisionedproduct.html#cfn-servicecatalog-cloudformationprovisionedproduct-tags)
     * @param tags One or more tags. 
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag.Companion::unwrap))
    }

    /**
     * One or more tags.
     *
     *
     * Requires the provisioned product to have an
     * [ResourceUpdateConstraint](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-resourceupdateconstraint.html)
     * resource with `TagUpdatesOnProvisionedProduct` set to `ALLOWED` to allow tag updates. If
     * `RESOURCE_UPDATE` constraint is not present, tags updates are ignored.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-cloudformationprovisionedproduct.html#cfn-servicecatalog-cloudformationprovisionedproduct-tags)
     * @param tags One or more tags. 
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build():
        software.amazon.awscdk.services.servicecatalog.CfnCloudFormationProvisionedProduct =
        cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.servicecatalog.CfnCloudFormationProvisionedProduct.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnCloudFormationProvisionedProduct {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnCloudFormationProvisionedProduct(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.servicecatalog.CfnCloudFormationProvisionedProduct):
        CfnCloudFormationProvisionedProduct = CfnCloudFormationProvisionedProduct(cdkObject)

    internal fun unwrap(wrapped: CfnCloudFormationProvisionedProduct):
        software.amazon.awscdk.services.servicecatalog.CfnCloudFormationProvisionedProduct =
        wrapped.cdkObject as
        software.amazon.awscdk.services.servicecatalog.CfnCloudFormationProvisionedProduct
  }

  /**
   * Information about a parameter used to provision a product.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.servicecatalog.*;
   * ProvisioningParameterProperty provisioningParameterProperty =
   * ProvisioningParameterProperty.builder()
   * .key("key")
   * .value("value")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-servicecatalog-cloudformationprovisionedproduct-provisioningparameter.html)
   */
  public interface ProvisioningParameterProperty {
    /**
     * The parameter key.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-servicecatalog-cloudformationprovisionedproduct-provisioningparameter.html#cfn-servicecatalog-cloudformationprovisionedproduct-provisioningparameter-key)
     */
    public fun key(): String

    /**
     * The parameter value.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-servicecatalog-cloudformationprovisionedproduct-provisioningparameter.html#cfn-servicecatalog-cloudformationprovisionedproduct-provisioningparameter-value)
     */
    public fun `value`(): String

    /**
     * A builder for [ProvisioningParameterProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param key The parameter key. 
       */
      public fun key(key: String)

      /**
       * @param value The parameter value. 
       */
      public fun `value`(`value`: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.servicecatalog.CfnCloudFormationProvisionedProduct.ProvisioningParameterProperty.Builder
          =
          software.amazon.awscdk.services.servicecatalog.CfnCloudFormationProvisionedProduct.ProvisioningParameterProperty.builder()

      /**
       * @param key The parameter key. 
       */
      override fun key(key: String) {
        cdkBuilder.key(key)
      }

      /**
       * @param value The parameter value. 
       */
      override fun `value`(`value`: String) {
        cdkBuilder.`value`(`value`)
      }

      public fun build():
          software.amazon.awscdk.services.servicecatalog.CfnCloudFormationProvisionedProduct.ProvisioningParameterProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.servicecatalog.CfnCloudFormationProvisionedProduct.ProvisioningParameterProperty,
    ) : CdkObject(cdkObject),
        ProvisioningParameterProperty {
      /**
       * The parameter key.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-servicecatalog-cloudformationprovisionedproduct-provisioningparameter.html#cfn-servicecatalog-cloudformationprovisionedproduct-provisioningparameter-key)
       */
      override fun key(): String = unwrap(this).getKey()

      /**
       * The parameter value.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-servicecatalog-cloudformationprovisionedproduct-provisioningparameter.html#cfn-servicecatalog-cloudformationprovisionedproduct-provisioningparameter-value)
       */
      override fun `value`(): String = unwrap(this).getValue()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): ProvisioningParameterProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.servicecatalog.CfnCloudFormationProvisionedProduct.ProvisioningParameterProperty):
          ProvisioningParameterProperty = CdkObjectWrappers.wrap(cdkObject) as?
          ProvisioningParameterProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: ProvisioningParameterProperty):
          software.amazon.awscdk.services.servicecatalog.CfnCloudFormationProvisionedProduct.ProvisioningParameterProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.servicecatalog.CfnCloudFormationProvisionedProduct.ProvisioningParameterProperty
    }
  }

  /**
   * The user-defined preferences that will be applied when updating a provisioned product.
   *
   * Not all preferences are applicable to all provisioned product type
   *
   * One or more AWS accounts that will have access to the provisioned product.
   *
   * Applicable only to a `CFN_STACKSET` provisioned product type.
   *
   * The AWS accounts specified should be within the list of accounts in the `STACKSET` constraint.
   * To get the list of accounts in the `STACKSET` constraint, use the `DescribeProvisioningParameters`
   * operation.
   *
   * If no values are specified, the default value is all accounts from the `STACKSET` constraint.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.servicecatalog.*;
   * ProvisioningPreferencesProperty provisioningPreferencesProperty =
   * ProvisioningPreferencesProperty.builder()
   * .stackSetAccounts(List.of("stackSetAccounts"))
   * .stackSetFailureToleranceCount(123)
   * .stackSetFailureTolerancePercentage(123)
   * .stackSetMaxConcurrencyCount(123)
   * .stackSetMaxConcurrencyPercentage(123)
   * .stackSetOperationType("stackSetOperationType")
   * .stackSetRegions(List.of("stackSetRegions"))
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-servicecatalog-cloudformationprovisionedproduct-provisioningpreferences.html)
   */
  public interface ProvisioningPreferencesProperty {
    /**
     * One or more AWS accounts where the provisioned product will be available.
     *
     * Applicable only to a `CFN_STACKSET` provisioned product type.
     *
     * The specified accounts should be within the list of accounts from the `STACKSET` constraint.
     * To get the list of accounts in the `STACKSET` constraint, use the
     * `DescribeProvisioningParameters` operation.
     *
     * If no values are specified, the default value is all acounts from the `STACKSET` constraint.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-servicecatalog-cloudformationprovisionedproduct-provisioningpreferences.html#cfn-servicecatalog-cloudformationprovisionedproduct-provisioningpreferences-stacksetaccounts)
     */
    public fun stackSetAccounts(): List<String> = unwrap(this).getStackSetAccounts() ?: emptyList()

    /**
     * The number of accounts, per Region, for which this operation can fail before AWS Service
     * Catalog stops the operation in that Region.
     *
     * If the operation is stopped in a Region, AWS Service Catalog doesn't attempt the operation in
     * any subsequent Regions.
     *
     * Applicable only to a `CFN_STACKSET` provisioned product type.
     *
     * Conditional: You must specify either `StackSetFailureToleranceCount` or
     * `StackSetFailureTolerancePercentage` , but not both.
     *
     * The default value is `0` if no value is specified.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-servicecatalog-cloudformationprovisionedproduct-provisioningpreferences.html#cfn-servicecatalog-cloudformationprovisionedproduct-provisioningpreferences-stacksetfailuretolerancecount)
     */
    public fun stackSetFailureToleranceCount(): Number? =
        unwrap(this).getStackSetFailureToleranceCount()

    /**
     * The percentage of accounts, per Region, for which this stack operation can fail before AWS
     * Service Catalog stops the operation in that Region.
     *
     * If the operation is stopped in a Region, AWS Service Catalog doesn't attempt the operation in
     * any subsequent Regions.
     *
     * When calculating the number of accounts based on the specified percentage, AWS Service
     * Catalog rounds down to the next whole number.
     *
     * Applicable only to a `CFN_STACKSET` provisioned product type.
     *
     * Conditional: You must specify either `StackSetFailureToleranceCount` or
     * `StackSetFailureTolerancePercentage` , but not both.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-servicecatalog-cloudformationprovisionedproduct-provisioningpreferences.html#cfn-servicecatalog-cloudformationprovisionedproduct-provisioningpreferences-stacksetfailuretolerancepercentage)
     */
    public fun stackSetFailureTolerancePercentage(): Number? =
        unwrap(this).getStackSetFailureTolerancePercentage()

    /**
     * The maximum number of accounts in which to perform this operation at one time.
     *
     * This is dependent on the value of `StackSetFailureToleranceCount` .
     * `StackSetMaxConcurrentCount` is at most one more than the `StackSetFailureToleranceCount` .
     *
     * Note that this setting lets you specify the maximum for operations. For large deployments,
     * under certain circumstances the actual number of accounts acted upon concurrently may be lower
     * due to service throttling.
     *
     * Applicable only to a `CFN_STACKSET` provisioned product type.
     *
     * Conditional: You must specify either `StackSetMaxConcurrentCount` or
     * `StackSetMaxConcurrentPercentage` , but not both.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-servicecatalog-cloudformationprovisionedproduct-provisioningpreferences.html#cfn-servicecatalog-cloudformationprovisionedproduct-provisioningpreferences-stacksetmaxconcurrencycount)
     */
    public fun stackSetMaxConcurrencyCount(): Number? =
        unwrap(this).getStackSetMaxConcurrencyCount()

    /**
     * The maximum percentage of accounts in which to perform this operation at one time.
     *
     * When calculating the number of accounts based on the specified percentage, AWS Service
     * Catalog rounds down to the next whole number. This is true except in cases where rounding down
     * would result is zero. In this case, AWS Service Catalog sets the number as `1` instead.
     *
     * Note that this setting lets you specify the maximum for operations. For large deployments,
     * under certain circumstances the actual number of accounts acted upon concurrently may be lower
     * due to service throttling.
     *
     * Applicable only to a `CFN_STACKSET` provisioned product type.
     *
     * Conditional: You must specify either `StackSetMaxConcurrentCount` or
     * `StackSetMaxConcurrentPercentage` , but not both.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-servicecatalog-cloudformationprovisionedproduct-provisioningpreferences.html#cfn-servicecatalog-cloudformationprovisionedproduct-provisioningpreferences-stacksetmaxconcurrencypercentage)
     */
    public fun stackSetMaxConcurrencyPercentage(): Number? =
        unwrap(this).getStackSetMaxConcurrencyPercentage()

    /**
     * Determines what action AWS Service Catalog performs to a stack set or a stack instance
     * represented by the provisioned product.
     *
     * The default value is `UPDATE` if nothing is specified.
     *
     * Applicable only to a `CFN_STACKSET` provisioned product type.
     *
     * * **CREATE** - Creates a new stack instance in the stack set represented by the provisioned
     * product. In this case, only new stack instances are created based on accounts and Regions; if
     * new ProductId or ProvisioningArtifactID are passed, they will be ignored.
     * * **UPDATE** - Updates the stack set represented by the provisioned product and also its
     * stack instances.
     * * **DELETE** - Deletes a stack instance in the stack set represented by the provisioned
     * product.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-servicecatalog-cloudformationprovisionedproduct-provisioningpreferences.html#cfn-servicecatalog-cloudformationprovisionedproduct-provisioningpreferences-stacksetoperationtype)
     */
    public fun stackSetOperationType(): String? = unwrap(this).getStackSetOperationType()

    /**
     * One or more AWS Regions where the provisioned product will be available.
     *
     * Applicable only to a `CFN_STACKSET` provisioned product type.
     *
     * The specified Regions should be within the list of Regions from the `STACKSET` constraint. To
     * get the list of Regions in the `STACKSET` constraint, use the `DescribeProvisioningParameters`
     * operation.
     *
     * If no values are specified, the default value is all Regions from the `STACKSET` constraint.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-servicecatalog-cloudformationprovisionedproduct-provisioningpreferences.html#cfn-servicecatalog-cloudformationprovisionedproduct-provisioningpreferences-stacksetregions)
     */
    public fun stackSetRegions(): List<String> = unwrap(this).getStackSetRegions() ?: emptyList()

    /**
     * A builder for [ProvisioningPreferencesProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param stackSetAccounts One or more AWS accounts where the provisioned product will be
       * available.
       * Applicable only to a `CFN_STACKSET` provisioned product type.
       *
       * The specified accounts should be within the list of accounts from the `STACKSET`
       * constraint. To get the list of accounts in the `STACKSET` constraint, use the
       * `DescribeProvisioningParameters` operation.
       *
       * If no values are specified, the default value is all acounts from the `STACKSET`
       * constraint.
       */
      public fun stackSetAccounts(stackSetAccounts: List<String>)

      /**
       * @param stackSetAccounts One or more AWS accounts where the provisioned product will be
       * available.
       * Applicable only to a `CFN_STACKSET` provisioned product type.
       *
       * The specified accounts should be within the list of accounts from the `STACKSET`
       * constraint. To get the list of accounts in the `STACKSET` constraint, use the
       * `DescribeProvisioningParameters` operation.
       *
       * If no values are specified, the default value is all acounts from the `STACKSET`
       * constraint.
       */
      public fun stackSetAccounts(vararg stackSetAccounts: String)

      /**
       * @param stackSetFailureToleranceCount The number of accounts, per Region, for which this
       * operation can fail before AWS Service Catalog stops the operation in that Region.
       * If the operation is stopped in a Region, AWS Service Catalog doesn't attempt the operation
       * in any subsequent Regions.
       *
       * Applicable only to a `CFN_STACKSET` provisioned product type.
       *
       * Conditional: You must specify either `StackSetFailureToleranceCount` or
       * `StackSetFailureTolerancePercentage` , but not both.
       *
       * The default value is `0` if no value is specified.
       */
      public fun stackSetFailureToleranceCount(stackSetFailureToleranceCount: Number)

      /**
       * @param stackSetFailureTolerancePercentage The percentage of accounts, per Region, for which
       * this stack operation can fail before AWS Service Catalog stops the operation in that Region.
       * If the operation is stopped in a Region, AWS Service Catalog doesn't attempt the operation
       * in any subsequent Regions.
       *
       * When calculating the number of accounts based on the specified percentage, AWS Service
       * Catalog rounds down to the next whole number.
       *
       * Applicable only to a `CFN_STACKSET` provisioned product type.
       *
       * Conditional: You must specify either `StackSetFailureToleranceCount` or
       * `StackSetFailureTolerancePercentage` , but not both.
       */
      public fun stackSetFailureTolerancePercentage(stackSetFailureTolerancePercentage: Number)

      /**
       * @param stackSetMaxConcurrencyCount The maximum number of accounts in which to perform this
       * operation at one time.
       * This is dependent on the value of `StackSetFailureToleranceCount` .
       * `StackSetMaxConcurrentCount` is at most one more than the `StackSetFailureToleranceCount` .
       *
       * Note that this setting lets you specify the maximum for operations. For large deployments,
       * under certain circumstances the actual number of accounts acted upon concurrently may be lower
       * due to service throttling.
       *
       * Applicable only to a `CFN_STACKSET` provisioned product type.
       *
       * Conditional: You must specify either `StackSetMaxConcurrentCount` or
       * `StackSetMaxConcurrentPercentage` , but not both.
       */
      public fun stackSetMaxConcurrencyCount(stackSetMaxConcurrencyCount: Number)

      /**
       * @param stackSetMaxConcurrencyPercentage The maximum percentage of accounts in which to
       * perform this operation at one time.
       * When calculating the number of accounts based on the specified percentage, AWS Service
       * Catalog rounds down to the next whole number. This is true except in cases where rounding down
       * would result is zero. In this case, AWS Service Catalog sets the number as `1` instead.
       *
       * Note that this setting lets you specify the maximum for operations. For large deployments,
       * under certain circumstances the actual number of accounts acted upon concurrently may be lower
       * due to service throttling.
       *
       * Applicable only to a `CFN_STACKSET` provisioned product type.
       *
       * Conditional: You must specify either `StackSetMaxConcurrentCount` or
       * `StackSetMaxConcurrentPercentage` , but not both.
       */
      public fun stackSetMaxConcurrencyPercentage(stackSetMaxConcurrencyPercentage: Number)

      /**
       * @param stackSetOperationType Determines what action AWS Service Catalog performs to a stack
       * set or a stack instance represented by the provisioned product.
       * The default value is `UPDATE` if nothing is specified.
       *
       * Applicable only to a `CFN_STACKSET` provisioned product type.
       *
       * * **CREATE** - Creates a new stack instance in the stack set represented by the provisioned
       * product. In this case, only new stack instances are created based on accounts and Regions; if
       * new ProductId or ProvisioningArtifactID are passed, they will be ignored.
       * * **UPDATE** - Updates the stack set represented by the provisioned product and also its
       * stack instances.
       * * **DELETE** - Deletes a stack instance in the stack set represented by the provisioned
       * product.
       */
      public fun stackSetOperationType(stackSetOperationType: String)

      /**
       * @param stackSetRegions One or more AWS Regions where the provisioned product will be
       * available.
       * Applicable only to a `CFN_STACKSET` provisioned product type.
       *
       * The specified Regions should be within the list of Regions from the `STACKSET` constraint.
       * To get the list of Regions in the `STACKSET` constraint, use the
       * `DescribeProvisioningParameters` operation.
       *
       * If no values are specified, the default value is all Regions from the `STACKSET`
       * constraint.
       */
      public fun stackSetRegions(stackSetRegions: List<String>)

      /**
       * @param stackSetRegions One or more AWS Regions where the provisioned product will be
       * available.
       * Applicable only to a `CFN_STACKSET` provisioned product type.
       *
       * The specified Regions should be within the list of Regions from the `STACKSET` constraint.
       * To get the list of Regions in the `STACKSET` constraint, use the
       * `DescribeProvisioningParameters` operation.
       *
       * If no values are specified, the default value is all Regions from the `STACKSET`
       * constraint.
       */
      public fun stackSetRegions(vararg stackSetRegions: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.servicecatalog.CfnCloudFormationProvisionedProduct.ProvisioningPreferencesProperty.Builder
          =
          software.amazon.awscdk.services.servicecatalog.CfnCloudFormationProvisionedProduct.ProvisioningPreferencesProperty.builder()

      /**
       * @param stackSetAccounts One or more AWS accounts where the provisioned product will be
       * available.
       * Applicable only to a `CFN_STACKSET` provisioned product type.
       *
       * The specified accounts should be within the list of accounts from the `STACKSET`
       * constraint. To get the list of accounts in the `STACKSET` constraint, use the
       * `DescribeProvisioningParameters` operation.
       *
       * If no values are specified, the default value is all acounts from the `STACKSET`
       * constraint.
       */
      override fun stackSetAccounts(stackSetAccounts: List<String>) {
        cdkBuilder.stackSetAccounts(stackSetAccounts)
      }

      /**
       * @param stackSetAccounts One or more AWS accounts where the provisioned product will be
       * available.
       * Applicable only to a `CFN_STACKSET` provisioned product type.
       *
       * The specified accounts should be within the list of accounts from the `STACKSET`
       * constraint. To get the list of accounts in the `STACKSET` constraint, use the
       * `DescribeProvisioningParameters` operation.
       *
       * If no values are specified, the default value is all acounts from the `STACKSET`
       * constraint.
       */
      override fun stackSetAccounts(vararg stackSetAccounts: String): Unit =
          stackSetAccounts(stackSetAccounts.toList())

      /**
       * @param stackSetFailureToleranceCount The number of accounts, per Region, for which this
       * operation can fail before AWS Service Catalog stops the operation in that Region.
       * If the operation is stopped in a Region, AWS Service Catalog doesn't attempt the operation
       * in any subsequent Regions.
       *
       * Applicable only to a `CFN_STACKSET` provisioned product type.
       *
       * Conditional: You must specify either `StackSetFailureToleranceCount` or
       * `StackSetFailureTolerancePercentage` , but not both.
       *
       * The default value is `0` if no value is specified.
       */
      override fun stackSetFailureToleranceCount(stackSetFailureToleranceCount: Number) {
        cdkBuilder.stackSetFailureToleranceCount(stackSetFailureToleranceCount)
      }

      /**
       * @param stackSetFailureTolerancePercentage The percentage of accounts, per Region, for which
       * this stack operation can fail before AWS Service Catalog stops the operation in that Region.
       * If the operation is stopped in a Region, AWS Service Catalog doesn't attempt the operation
       * in any subsequent Regions.
       *
       * When calculating the number of accounts based on the specified percentage, AWS Service
       * Catalog rounds down to the next whole number.
       *
       * Applicable only to a `CFN_STACKSET` provisioned product type.
       *
       * Conditional: You must specify either `StackSetFailureToleranceCount` or
       * `StackSetFailureTolerancePercentage` , but not both.
       */
      override fun stackSetFailureTolerancePercentage(stackSetFailureTolerancePercentage: Number) {
        cdkBuilder.stackSetFailureTolerancePercentage(stackSetFailureTolerancePercentage)
      }

      /**
       * @param stackSetMaxConcurrencyCount The maximum number of accounts in which to perform this
       * operation at one time.
       * This is dependent on the value of `StackSetFailureToleranceCount` .
       * `StackSetMaxConcurrentCount` is at most one more than the `StackSetFailureToleranceCount` .
       *
       * Note that this setting lets you specify the maximum for operations. For large deployments,
       * under certain circumstances the actual number of accounts acted upon concurrently may be lower
       * due to service throttling.
       *
       * Applicable only to a `CFN_STACKSET` provisioned product type.
       *
       * Conditional: You must specify either `StackSetMaxConcurrentCount` or
       * `StackSetMaxConcurrentPercentage` , but not both.
       */
      override fun stackSetMaxConcurrencyCount(stackSetMaxConcurrencyCount: Number) {
        cdkBuilder.stackSetMaxConcurrencyCount(stackSetMaxConcurrencyCount)
      }

      /**
       * @param stackSetMaxConcurrencyPercentage The maximum percentage of accounts in which to
       * perform this operation at one time.
       * When calculating the number of accounts based on the specified percentage, AWS Service
       * Catalog rounds down to the next whole number. This is true except in cases where rounding down
       * would result is zero. In this case, AWS Service Catalog sets the number as `1` instead.
       *
       * Note that this setting lets you specify the maximum for operations. For large deployments,
       * under certain circumstances the actual number of accounts acted upon concurrently may be lower
       * due to service throttling.
       *
       * Applicable only to a `CFN_STACKSET` provisioned product type.
       *
       * Conditional: You must specify either `StackSetMaxConcurrentCount` or
       * `StackSetMaxConcurrentPercentage` , but not both.
       */
      override fun stackSetMaxConcurrencyPercentage(stackSetMaxConcurrencyPercentage: Number) {
        cdkBuilder.stackSetMaxConcurrencyPercentage(stackSetMaxConcurrencyPercentage)
      }

      /**
       * @param stackSetOperationType Determines what action AWS Service Catalog performs to a stack
       * set or a stack instance represented by the provisioned product.
       * The default value is `UPDATE` if nothing is specified.
       *
       * Applicable only to a `CFN_STACKSET` provisioned product type.
       *
       * * **CREATE** - Creates a new stack instance in the stack set represented by the provisioned
       * product. In this case, only new stack instances are created based on accounts and Regions; if
       * new ProductId or ProvisioningArtifactID are passed, they will be ignored.
       * * **UPDATE** - Updates the stack set represented by the provisioned product and also its
       * stack instances.
       * * **DELETE** - Deletes a stack instance in the stack set represented by the provisioned
       * product.
       */
      override fun stackSetOperationType(stackSetOperationType: String) {
        cdkBuilder.stackSetOperationType(stackSetOperationType)
      }

      /**
       * @param stackSetRegions One or more AWS Regions where the provisioned product will be
       * available.
       * Applicable only to a `CFN_STACKSET` provisioned product type.
       *
       * The specified Regions should be within the list of Regions from the `STACKSET` constraint.
       * To get the list of Regions in the `STACKSET` constraint, use the
       * `DescribeProvisioningParameters` operation.
       *
       * If no values are specified, the default value is all Regions from the `STACKSET`
       * constraint.
       */
      override fun stackSetRegions(stackSetRegions: List<String>) {
        cdkBuilder.stackSetRegions(stackSetRegions)
      }

      /**
       * @param stackSetRegions One or more AWS Regions where the provisioned product will be
       * available.
       * Applicable only to a `CFN_STACKSET` provisioned product type.
       *
       * The specified Regions should be within the list of Regions from the `STACKSET` constraint.
       * To get the list of Regions in the `STACKSET` constraint, use the
       * `DescribeProvisioningParameters` operation.
       *
       * If no values are specified, the default value is all Regions from the `STACKSET`
       * constraint.
       */
      override fun stackSetRegions(vararg stackSetRegions: String): Unit =
          stackSetRegions(stackSetRegions.toList())

      public fun build():
          software.amazon.awscdk.services.servicecatalog.CfnCloudFormationProvisionedProduct.ProvisioningPreferencesProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.servicecatalog.CfnCloudFormationProvisionedProduct.ProvisioningPreferencesProperty,
    ) : CdkObject(cdkObject),
        ProvisioningPreferencesProperty {
      /**
       * One or more AWS accounts where the provisioned product will be available.
       *
       * Applicable only to a `CFN_STACKSET` provisioned product type.
       *
       * The specified accounts should be within the list of accounts from the `STACKSET`
       * constraint. To get the list of accounts in the `STACKSET` constraint, use the
       * `DescribeProvisioningParameters` operation.
       *
       * If no values are specified, the default value is all acounts from the `STACKSET`
       * constraint.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-servicecatalog-cloudformationprovisionedproduct-provisioningpreferences.html#cfn-servicecatalog-cloudformationprovisionedproduct-provisioningpreferences-stacksetaccounts)
       */
      override fun stackSetAccounts(): List<String> = unwrap(this).getStackSetAccounts() ?:
          emptyList()

      /**
       * The number of accounts, per Region, for which this operation can fail before AWS Service
       * Catalog stops the operation in that Region.
       *
       * If the operation is stopped in a Region, AWS Service Catalog doesn't attempt the operation
       * in any subsequent Regions.
       *
       * Applicable only to a `CFN_STACKSET` provisioned product type.
       *
       * Conditional: You must specify either `StackSetFailureToleranceCount` or
       * `StackSetFailureTolerancePercentage` , but not both.
       *
       * The default value is `0` if no value is specified.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-servicecatalog-cloudformationprovisionedproduct-provisioningpreferences.html#cfn-servicecatalog-cloudformationprovisionedproduct-provisioningpreferences-stacksetfailuretolerancecount)
       */
      override fun stackSetFailureToleranceCount(): Number? =
          unwrap(this).getStackSetFailureToleranceCount()

      /**
       * The percentage of accounts, per Region, for which this stack operation can fail before AWS
       * Service Catalog stops the operation in that Region.
       *
       * If the operation is stopped in a Region, AWS Service Catalog doesn't attempt the operation
       * in any subsequent Regions.
       *
       * When calculating the number of accounts based on the specified percentage, AWS Service
       * Catalog rounds down to the next whole number.
       *
       * Applicable only to a `CFN_STACKSET` provisioned product type.
       *
       * Conditional: You must specify either `StackSetFailureToleranceCount` or
       * `StackSetFailureTolerancePercentage` , but not both.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-servicecatalog-cloudformationprovisionedproduct-provisioningpreferences.html#cfn-servicecatalog-cloudformationprovisionedproduct-provisioningpreferences-stacksetfailuretolerancepercentage)
       */
      override fun stackSetFailureTolerancePercentage(): Number? =
          unwrap(this).getStackSetFailureTolerancePercentage()

      /**
       * The maximum number of accounts in which to perform this operation at one time.
       *
       * This is dependent on the value of `StackSetFailureToleranceCount` .
       * `StackSetMaxConcurrentCount` is at most one more than the `StackSetFailureToleranceCount` .
       *
       * Note that this setting lets you specify the maximum for operations. For large deployments,
       * under certain circumstances the actual number of accounts acted upon concurrently may be lower
       * due to service throttling.
       *
       * Applicable only to a `CFN_STACKSET` provisioned product type.
       *
       * Conditional: You must specify either `StackSetMaxConcurrentCount` or
       * `StackSetMaxConcurrentPercentage` , but not both.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-servicecatalog-cloudformationprovisionedproduct-provisioningpreferences.html#cfn-servicecatalog-cloudformationprovisionedproduct-provisioningpreferences-stacksetmaxconcurrencycount)
       */
      override fun stackSetMaxConcurrencyCount(): Number? =
          unwrap(this).getStackSetMaxConcurrencyCount()

      /**
       * The maximum percentage of accounts in which to perform this operation at one time.
       *
       * When calculating the number of accounts based on the specified percentage, AWS Service
       * Catalog rounds down to the next whole number. This is true except in cases where rounding down
       * would result is zero. In this case, AWS Service Catalog sets the number as `1` instead.
       *
       * Note that this setting lets you specify the maximum for operations. For large deployments,
       * under certain circumstances the actual number of accounts acted upon concurrently may be lower
       * due to service throttling.
       *
       * Applicable only to a `CFN_STACKSET` provisioned product type.
       *
       * Conditional: You must specify either `StackSetMaxConcurrentCount` or
       * `StackSetMaxConcurrentPercentage` , but not both.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-servicecatalog-cloudformationprovisionedproduct-provisioningpreferences.html#cfn-servicecatalog-cloudformationprovisionedproduct-provisioningpreferences-stacksetmaxconcurrencypercentage)
       */
      override fun stackSetMaxConcurrencyPercentage(): Number? =
          unwrap(this).getStackSetMaxConcurrencyPercentage()

      /**
       * Determines what action AWS Service Catalog performs to a stack set or a stack instance
       * represented by the provisioned product.
       *
       * The default value is `UPDATE` if nothing is specified.
       *
       * Applicable only to a `CFN_STACKSET` provisioned product type.
       *
       * * **CREATE** - Creates a new stack instance in the stack set represented by the provisioned
       * product. In this case, only new stack instances are created based on accounts and Regions; if
       * new ProductId or ProvisioningArtifactID are passed, they will be ignored.
       * * **UPDATE** - Updates the stack set represented by the provisioned product and also its
       * stack instances.
       * * **DELETE** - Deletes a stack instance in the stack set represented by the provisioned
       * product.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-servicecatalog-cloudformationprovisionedproduct-provisioningpreferences.html#cfn-servicecatalog-cloudformationprovisionedproduct-provisioningpreferences-stacksetoperationtype)
       */
      override fun stackSetOperationType(): String? = unwrap(this).getStackSetOperationType()

      /**
       * One or more AWS Regions where the provisioned product will be available.
       *
       * Applicable only to a `CFN_STACKSET` provisioned product type.
       *
       * The specified Regions should be within the list of Regions from the `STACKSET` constraint.
       * To get the list of Regions in the `STACKSET` constraint, use the
       * `DescribeProvisioningParameters` operation.
       *
       * If no values are specified, the default value is all Regions from the `STACKSET`
       * constraint.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-servicecatalog-cloudformationprovisionedproduct-provisioningpreferences.html#cfn-servicecatalog-cloudformationprovisionedproduct-provisioningpreferences-stacksetregions)
       */
      override fun stackSetRegions(): List<String> = unwrap(this).getStackSetRegions() ?:
          emptyList()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): ProvisioningPreferencesProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.servicecatalog.CfnCloudFormationProvisionedProduct.ProvisioningPreferencesProperty):
          ProvisioningPreferencesProperty = CdkObjectWrappers.wrap(cdkObject) as?
          ProvisioningPreferencesProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: ProvisioningPreferencesProperty):
          software.amazon.awscdk.services.servicecatalog.CfnCloudFormationProvisionedProduct.ProvisioningPreferencesProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.servicecatalog.CfnCloudFormationProvisionedProduct.ProvisioningPreferencesProperty
    }
  }
}
