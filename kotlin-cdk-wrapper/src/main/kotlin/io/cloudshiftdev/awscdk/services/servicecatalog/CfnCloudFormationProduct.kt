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
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * Specifies a product.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.servicecatalog.*;
 * Object info;
 * CfnCloudFormationProduct cfnCloudFormationProduct = CfnCloudFormationProduct.Builder.create(this,
 * "MyCfnCloudFormationProduct")
 * .name("name")
 * .owner("owner")
 * // the properties below are optional
 * .acceptLanguage("acceptLanguage")
 * .description("description")
 * .distributor("distributor")
 * .productType("productType")
 * .provisioningArtifactParameters(List.of(ProvisioningArtifactPropertiesProperty.builder()
 * .info(info)
 * // the properties below are optional
 * .description("description")
 * .disableTemplateValidation(false)
 * .name("name")
 * .type("type")
 * .build()))
 * .replaceProvisioningArtifacts(false)
 * .sourceConnection(SourceConnectionProperty.builder()
 * .connectionParameters(ConnectionParametersProperty.builder()
 * .codeStar(CodeStarParametersProperty.builder()
 * .artifactPath("artifactPath")
 * .branch("branch")
 * .connectionArn("connectionArn")
 * .repository("repository")
 * .build())
 * .build())
 * .type("type")
 * .build())
 * .supportDescription("supportDescription")
 * .supportEmail("supportEmail")
 * .supportUrl("supportUrl")
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-cloudformationproduct.html)
 */
public open class CfnCloudFormationProduct(
  cdkObject: software.amazon.awscdk.services.servicecatalog.CfnCloudFormationProduct,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnCloudFormationProductProps,
  ) :
      this(software.amazon.awscdk.services.servicecatalog.CfnCloudFormationProduct(scope.let(CloudshiftdevConstructsConstruct::unwrap),
      id, props.let(CfnCloudFormationProductProps::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnCloudFormationProductProps.Builder.() -> Unit,
  ) : this(scope, id, CfnCloudFormationProductProps(props)
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
  public open fun attrId(): String = unwrap(this).getAttrId()

  /**
   * The name of the product.
   */
  public open fun attrProductName(): String = unwrap(this).getAttrProductName()

  /**
   * The IDs of the provisioning artifacts.
   */
  public open fun attrProvisioningArtifactIds(): String =
      unwrap(this).getAttrProvisioningArtifactIds()

  /**
   * The names of the provisioning artifacts.
   */
  public open fun attrProvisioningArtifactNames(): String =
      unwrap(this).getAttrProvisioningArtifactNames()

  /**
   * The description of the product.
   */
  public open fun description(): String? = unwrap(this).getDescription()

  /**
   * The description of the product.
   */
  public open fun description(`value`: String) {
    unwrap(this).setDescription(`value`)
  }

  /**
   * The distributor of the product.
   */
  public open fun distributor(): String? = unwrap(this).getDistributor()

  /**
   * The distributor of the product.
   */
  public open fun distributor(`value`: String) {
    unwrap(this).setDistributor(`value`)
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
   * The name of the product.
   */
  public open fun name(): String = unwrap(this).getName()

  /**
   * The name of the product.
   */
  public open fun name(`value`: String) {
    unwrap(this).setName(`value`)
  }

  /**
   * The owner of the product.
   */
  public open fun owner(): String = unwrap(this).getOwner()

  /**
   * The owner of the product.
   */
  public open fun owner(`value`: String) {
    unwrap(this).setOwner(`value`)
  }

  /**
   * The type of product.
   */
  public open fun productType(): String? = unwrap(this).getProductType()

  /**
   * The type of product.
   */
  public open fun productType(`value`: String) {
    unwrap(this).setProductType(`value`)
  }

  /**
   * The configuration of the provisioning artifact (also known as a version).
   */
  public open fun provisioningArtifactParameters(): Any? =
      unwrap(this).getProvisioningArtifactParameters()

  /**
   * The configuration of the provisioning artifact (also known as a version).
   */
  public open fun provisioningArtifactParameters(`value`: IResolvable) {
    unwrap(this).setProvisioningArtifactParameters(`value`.let(IResolvable::unwrap))
  }

  /**
   * The configuration of the provisioning artifact (also known as a version).
   */
  public open fun provisioningArtifactParameters(`value`: List<Any>) {
    unwrap(this).setProvisioningArtifactParameters(`value`.map{CdkObjectWrappers.unwrap(it)})
  }

  /**
   * The configuration of the provisioning artifact (also known as a version).
   */
  public open fun provisioningArtifactParameters(vararg `value`: Any): Unit =
      provisioningArtifactParameters(`value`.toList())

  /**
   * This property is turned off by default.
   */
  public open fun replaceProvisioningArtifacts(): Any? =
      unwrap(this).getReplaceProvisioningArtifacts()

  /**
   * This property is turned off by default.
   */
  public open fun replaceProvisioningArtifacts(`value`: Boolean) {
    unwrap(this).setReplaceProvisioningArtifacts(`value`)
  }

  /**
   * This property is turned off by default.
   */
  public open fun replaceProvisioningArtifacts(`value`: IResolvable) {
    unwrap(this).setReplaceProvisioningArtifacts(`value`.let(IResolvable::unwrap))
  }

  /**
   * A top level `ProductViewDetail` response containing details about the product’s connection.
   */
  public open fun sourceConnection(): Any? = unwrap(this).getSourceConnection()

  /**
   * A top level `ProductViewDetail` response containing details about the product’s connection.
   */
  public open fun sourceConnection(`value`: IResolvable) {
    unwrap(this).setSourceConnection(`value`.let(IResolvable::unwrap))
  }

  /**
   * A top level `ProductViewDetail` response containing details about the product’s connection.
   */
  public open fun sourceConnection(`value`: SourceConnectionProperty) {
    unwrap(this).setSourceConnection(`value`.let(SourceConnectionProperty::unwrap))
  }

  /**
   * A top level `ProductViewDetail` response containing details about the product’s connection.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("15c39e804a8b7060fe32e2eb9a717a8fb7f145cb56fc3abf1af3630d0f675186")
  public open fun sourceConnection(`value`: SourceConnectionProperty.Builder.() -> Unit): Unit =
      sourceConnection(SourceConnectionProperty(`value`))

  /**
   * The support information about the product.
   */
  public open fun supportDescription(): String? = unwrap(this).getSupportDescription()

  /**
   * The support information about the product.
   */
  public open fun supportDescription(`value`: String) {
    unwrap(this).setSupportDescription(`value`)
  }

  /**
   * The contact email for product support.
   */
  public open fun supportEmail(): String? = unwrap(this).getSupportEmail()

  /**
   * The contact email for product support.
   */
  public open fun supportEmail(`value`: String) {
    unwrap(this).setSupportEmail(`value`)
  }

  /**
   * The contact URL for product support.
   */
  public open fun supportUrl(): String? = unwrap(this).getSupportUrl()

  /**
   * The contact URL for product support.
   */
  public open fun supportUrl(`value`: String) {
    unwrap(this).setSupportUrl(`value`)
  }

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
    unwrap(this).setTagsRaw(`value`.map(CfnTag::unwrap))
  }

  /**
   * One or more tags.
   */
  public open fun tagsRaw(vararg `value`: CfnTag): Unit = tagsRaw(`value`.toList())

  /**
   * A fluent builder for
   * [io.cloudshiftdev.awscdk.services.servicecatalog.CfnCloudFormationProduct].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The language code.
     *
     * * `jp` - Japanese
     * * `zh` - Chinese
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-cloudformationproduct.html#cfn-servicecatalog-cloudformationproduct-acceptlanguage)
     * @param acceptLanguage The language code. 
     */
    public fun acceptLanguage(acceptLanguage: String)

    /**
     * The description of the product.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-cloudformationproduct.html#cfn-servicecatalog-cloudformationproduct-description)
     * @param description The description of the product. 
     */
    public fun description(description: String)

    /**
     * The distributor of the product.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-cloudformationproduct.html#cfn-servicecatalog-cloudformationproduct-distributor)
     * @param distributor The distributor of the product. 
     */
    public fun distributor(distributor: String)

    /**
     * The name of the product.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-cloudformationproduct.html#cfn-servicecatalog-cloudformationproduct-name)
     * @param name The name of the product. 
     */
    public fun name(name: String)

    /**
     * The owner of the product.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-cloudformationproduct.html#cfn-servicecatalog-cloudformationproduct-owner)
     * @param owner The owner of the product. 
     */
    public fun owner(owner: String)

    /**
     * The type of product.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-cloudformationproduct.html#cfn-servicecatalog-cloudformationproduct-producttype)
     * @param productType The type of product. 
     */
    public fun productType(productType: String)

    /**
     * The configuration of the provisioning artifact (also known as a version).
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-cloudformationproduct.html#cfn-servicecatalog-cloudformationproduct-provisioningartifactparameters)
     * @param provisioningArtifactParameters The configuration of the provisioning artifact (also
     * known as a version). 
     */
    public fun provisioningArtifactParameters(provisioningArtifactParameters: IResolvable)

    /**
     * The configuration of the provisioning artifact (also known as a version).
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-cloudformationproduct.html#cfn-servicecatalog-cloudformationproduct-provisioningartifactparameters)
     * @param provisioningArtifactParameters The configuration of the provisioning artifact (also
     * known as a version). 
     */
    public fun provisioningArtifactParameters(provisioningArtifactParameters: List<Any>)

    /**
     * The configuration of the provisioning artifact (also known as a version).
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-cloudformationproduct.html#cfn-servicecatalog-cloudformationproduct-provisioningartifactparameters)
     * @param provisioningArtifactParameters The configuration of the provisioning artifact (also
     * known as a version). 
     */
    public fun provisioningArtifactParameters(vararg provisioningArtifactParameters: Any)

    /**
     * This property is turned off by default.
     *
     * If turned off, you can update provisioning artifacts or product attributes (such as
     * description, distributor, name, owner, and more) and the associated provisioning artifacts will
     * retain the same unique identifier. Provisioning artifacts are matched within the
     * CloudFormationProduct resource, and only those that have been updated will be changed.
     * Provisioning artifacts are matched by a combinaton of provisioning artifact template URL and
     * name.
     *
     * If turned on, provisioning artifacts will be given a new unique identifier when you update
     * the product or provisioning artifacts.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-cloudformationproduct.html#cfn-servicecatalog-cloudformationproduct-replaceprovisioningartifacts)
     * @param replaceProvisioningArtifacts This property is turned off by default. 
     */
    public fun replaceProvisioningArtifacts(replaceProvisioningArtifacts: Boolean)

    /**
     * This property is turned off by default.
     *
     * If turned off, you can update provisioning artifacts or product attributes (such as
     * description, distributor, name, owner, and more) and the associated provisioning artifacts will
     * retain the same unique identifier. Provisioning artifacts are matched within the
     * CloudFormationProduct resource, and only those that have been updated will be changed.
     * Provisioning artifacts are matched by a combinaton of provisioning artifact template URL and
     * name.
     *
     * If turned on, provisioning artifacts will be given a new unique identifier when you update
     * the product or provisioning artifacts.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-cloudformationproduct.html#cfn-servicecatalog-cloudformationproduct-replaceprovisioningartifacts)
     * @param replaceProvisioningArtifacts This property is turned off by default. 
     */
    public fun replaceProvisioningArtifacts(replaceProvisioningArtifacts: IResolvable)

    /**
     * A top level `ProductViewDetail` response containing details about the product’s connection.
     *
     * AWS Service Catalog returns this field for the `CreateProduct` , `UpdateProduct` ,
     * `DescribeProductAsAdmin` , and `SearchProductAsAdmin` APIs. This response contains the same
     * fields as the `ConnectionParameters` request, with the addition of the `LastSync` response.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-cloudformationproduct.html#cfn-servicecatalog-cloudformationproduct-sourceconnection)
     * @param sourceConnection A top level `ProductViewDetail` response containing details about the
     * product’s connection. 
     */
    public fun sourceConnection(sourceConnection: IResolvable)

    /**
     * A top level `ProductViewDetail` response containing details about the product’s connection.
     *
     * AWS Service Catalog returns this field for the `CreateProduct` , `UpdateProduct` ,
     * `DescribeProductAsAdmin` , and `SearchProductAsAdmin` APIs. This response contains the same
     * fields as the `ConnectionParameters` request, with the addition of the `LastSync` response.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-cloudformationproduct.html#cfn-servicecatalog-cloudformationproduct-sourceconnection)
     * @param sourceConnection A top level `ProductViewDetail` response containing details about the
     * product’s connection. 
     */
    public fun sourceConnection(sourceConnection: SourceConnectionProperty)

    /**
     * A top level `ProductViewDetail` response containing details about the product’s connection.
     *
     * AWS Service Catalog returns this field for the `CreateProduct` , `UpdateProduct` ,
     * `DescribeProductAsAdmin` , and `SearchProductAsAdmin` APIs. This response contains the same
     * fields as the `ConnectionParameters` request, with the addition of the `LastSync` response.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-cloudformationproduct.html#cfn-servicecatalog-cloudformationproduct-sourceconnection)
     * @param sourceConnection A top level `ProductViewDetail` response containing details about the
     * product’s connection. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("f6cff10ddcf3be0f1cd49992c4b0f8bb297910e7d596f39cfdab4e7c43de6b5f")
    public fun sourceConnection(sourceConnection: SourceConnectionProperty.Builder.() -> Unit)

    /**
     * The support information about the product.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-cloudformationproduct.html#cfn-servicecatalog-cloudformationproduct-supportdescription)
     * @param supportDescription The support information about the product. 
     */
    public fun supportDescription(supportDescription: String)

    /**
     * The contact email for product support.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-cloudformationproduct.html#cfn-servicecatalog-cloudformationproduct-supportemail)
     * @param supportEmail The contact email for product support. 
     */
    public fun supportEmail(supportEmail: String)

    /**
     * The contact URL for product support.
     *
     * `^https?:\/\//` / is the pattern used to validate SupportUrl.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-cloudformationproduct.html#cfn-servicecatalog-cloudformationproduct-supporturl)
     * @param supportUrl The contact URL for product support. 
     */
    public fun supportUrl(supportUrl: String)

    /**
     * One or more tags.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-cloudformationproduct.html#cfn-servicecatalog-cloudformationproduct-tags)
     * @param tags One or more tags. 
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * One or more tags.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-cloudformationproduct.html#cfn-servicecatalog-cloudformationproduct-tags)
     * @param tags One or more tags. 
     */
    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.servicecatalog.CfnCloudFormationProduct.Builder =
        software.amazon.awscdk.services.servicecatalog.CfnCloudFormationProduct.Builder.create(scope,
        id)

    /**
     * The language code.
     *
     * * `jp` - Japanese
     * * `zh` - Chinese
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-cloudformationproduct.html#cfn-servicecatalog-cloudformationproduct-acceptlanguage)
     * @param acceptLanguage The language code. 
     */
    override fun acceptLanguage(acceptLanguage: String) {
      cdkBuilder.acceptLanguage(acceptLanguage)
    }

    /**
     * The description of the product.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-cloudformationproduct.html#cfn-servicecatalog-cloudformationproduct-description)
     * @param description The description of the product. 
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * The distributor of the product.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-cloudformationproduct.html#cfn-servicecatalog-cloudformationproduct-distributor)
     * @param distributor The distributor of the product. 
     */
    override fun distributor(distributor: String) {
      cdkBuilder.distributor(distributor)
    }

    /**
     * The name of the product.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-cloudformationproduct.html#cfn-servicecatalog-cloudformationproduct-name)
     * @param name The name of the product. 
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * The owner of the product.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-cloudformationproduct.html#cfn-servicecatalog-cloudformationproduct-owner)
     * @param owner The owner of the product. 
     */
    override fun owner(owner: String) {
      cdkBuilder.owner(owner)
    }

    /**
     * The type of product.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-cloudformationproduct.html#cfn-servicecatalog-cloudformationproduct-producttype)
     * @param productType The type of product. 
     */
    override fun productType(productType: String) {
      cdkBuilder.productType(productType)
    }

    /**
     * The configuration of the provisioning artifact (also known as a version).
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-cloudformationproduct.html#cfn-servicecatalog-cloudformationproduct-provisioningartifactparameters)
     * @param provisioningArtifactParameters The configuration of the provisioning artifact (also
     * known as a version). 
     */
    override fun provisioningArtifactParameters(provisioningArtifactParameters: IResolvable) {
      cdkBuilder.provisioningArtifactParameters(provisioningArtifactParameters.let(IResolvable::unwrap))
    }

    /**
     * The configuration of the provisioning artifact (also known as a version).
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-cloudformationproduct.html#cfn-servicecatalog-cloudformationproduct-provisioningartifactparameters)
     * @param provisioningArtifactParameters The configuration of the provisioning artifact (also
     * known as a version). 
     */
    override fun provisioningArtifactParameters(provisioningArtifactParameters: List<Any>) {
      cdkBuilder.provisioningArtifactParameters(provisioningArtifactParameters.map{CdkObjectWrappers.unwrap(it)})
    }

    /**
     * The configuration of the provisioning artifact (also known as a version).
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-cloudformationproduct.html#cfn-servicecatalog-cloudformationproduct-provisioningartifactparameters)
     * @param provisioningArtifactParameters The configuration of the provisioning artifact (also
     * known as a version). 
     */
    override fun provisioningArtifactParameters(vararg provisioningArtifactParameters: Any): Unit =
        provisioningArtifactParameters(provisioningArtifactParameters.toList())

    /**
     * This property is turned off by default.
     *
     * If turned off, you can update provisioning artifacts or product attributes (such as
     * description, distributor, name, owner, and more) and the associated provisioning artifacts will
     * retain the same unique identifier. Provisioning artifacts are matched within the
     * CloudFormationProduct resource, and only those that have been updated will be changed.
     * Provisioning artifacts are matched by a combinaton of provisioning artifact template URL and
     * name.
     *
     * If turned on, provisioning artifacts will be given a new unique identifier when you update
     * the product or provisioning artifacts.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-cloudformationproduct.html#cfn-servicecatalog-cloudformationproduct-replaceprovisioningartifacts)
     * @param replaceProvisioningArtifacts This property is turned off by default. 
     */
    override fun replaceProvisioningArtifacts(replaceProvisioningArtifacts: Boolean) {
      cdkBuilder.replaceProvisioningArtifacts(replaceProvisioningArtifacts)
    }

    /**
     * This property is turned off by default.
     *
     * If turned off, you can update provisioning artifacts or product attributes (such as
     * description, distributor, name, owner, and more) and the associated provisioning artifacts will
     * retain the same unique identifier. Provisioning artifacts are matched within the
     * CloudFormationProduct resource, and only those that have been updated will be changed.
     * Provisioning artifacts are matched by a combinaton of provisioning artifact template URL and
     * name.
     *
     * If turned on, provisioning artifacts will be given a new unique identifier when you update
     * the product or provisioning artifacts.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-cloudformationproduct.html#cfn-servicecatalog-cloudformationproduct-replaceprovisioningartifacts)
     * @param replaceProvisioningArtifacts This property is turned off by default. 
     */
    override fun replaceProvisioningArtifacts(replaceProvisioningArtifacts: IResolvable) {
      cdkBuilder.replaceProvisioningArtifacts(replaceProvisioningArtifacts.let(IResolvable::unwrap))
    }

    /**
     * A top level `ProductViewDetail` response containing details about the product’s connection.
     *
     * AWS Service Catalog returns this field for the `CreateProduct` , `UpdateProduct` ,
     * `DescribeProductAsAdmin` , and `SearchProductAsAdmin` APIs. This response contains the same
     * fields as the `ConnectionParameters` request, with the addition of the `LastSync` response.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-cloudformationproduct.html#cfn-servicecatalog-cloudformationproduct-sourceconnection)
     * @param sourceConnection A top level `ProductViewDetail` response containing details about the
     * product’s connection. 
     */
    override fun sourceConnection(sourceConnection: IResolvable) {
      cdkBuilder.sourceConnection(sourceConnection.let(IResolvable::unwrap))
    }

    /**
     * A top level `ProductViewDetail` response containing details about the product’s connection.
     *
     * AWS Service Catalog returns this field for the `CreateProduct` , `UpdateProduct` ,
     * `DescribeProductAsAdmin` , and `SearchProductAsAdmin` APIs. This response contains the same
     * fields as the `ConnectionParameters` request, with the addition of the `LastSync` response.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-cloudformationproduct.html#cfn-servicecatalog-cloudformationproduct-sourceconnection)
     * @param sourceConnection A top level `ProductViewDetail` response containing details about the
     * product’s connection. 
     */
    override fun sourceConnection(sourceConnection: SourceConnectionProperty) {
      cdkBuilder.sourceConnection(sourceConnection.let(SourceConnectionProperty::unwrap))
    }

    /**
     * A top level `ProductViewDetail` response containing details about the product’s connection.
     *
     * AWS Service Catalog returns this field for the `CreateProduct` , `UpdateProduct` ,
     * `DescribeProductAsAdmin` , and `SearchProductAsAdmin` APIs. This response contains the same
     * fields as the `ConnectionParameters` request, with the addition of the `LastSync` response.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-cloudformationproduct.html#cfn-servicecatalog-cloudformationproduct-sourceconnection)
     * @param sourceConnection A top level `ProductViewDetail` response containing details about the
     * product’s connection. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("f6cff10ddcf3be0f1cd49992c4b0f8bb297910e7d596f39cfdab4e7c43de6b5f")
    override fun sourceConnection(sourceConnection: SourceConnectionProperty.Builder.() -> Unit):
        Unit = sourceConnection(SourceConnectionProperty(sourceConnection))

    /**
     * The support information about the product.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-cloudformationproduct.html#cfn-servicecatalog-cloudformationproduct-supportdescription)
     * @param supportDescription The support information about the product. 
     */
    override fun supportDescription(supportDescription: String) {
      cdkBuilder.supportDescription(supportDescription)
    }

    /**
     * The contact email for product support.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-cloudformationproduct.html#cfn-servicecatalog-cloudformationproduct-supportemail)
     * @param supportEmail The contact email for product support. 
     */
    override fun supportEmail(supportEmail: String) {
      cdkBuilder.supportEmail(supportEmail)
    }

    /**
     * The contact URL for product support.
     *
     * `^https?:\/\//` / is the pattern used to validate SupportUrl.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-cloudformationproduct.html#cfn-servicecatalog-cloudformationproduct-supporturl)
     * @param supportUrl The contact URL for product support. 
     */
    override fun supportUrl(supportUrl: String) {
      cdkBuilder.supportUrl(supportUrl)
    }

    /**
     * One or more tags.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-cloudformationproduct.html#cfn-servicecatalog-cloudformationproduct-tags)
     * @param tags One or more tags. 
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    /**
     * One or more tags.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-cloudformationproduct.html#cfn-servicecatalog-cloudformationproduct-tags)
     * @param tags One or more tags. 
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.servicecatalog.CfnCloudFormationProduct =
        cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.servicecatalog.CfnCloudFormationProduct.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnCloudFormationProduct {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnCloudFormationProduct(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.servicecatalog.CfnCloudFormationProduct):
        CfnCloudFormationProduct = CfnCloudFormationProduct(cdkObject)

    internal fun unwrap(wrapped: CfnCloudFormationProduct):
        software.amazon.awscdk.services.servicecatalog.CfnCloudFormationProduct = wrapped.cdkObject
        as software.amazon.awscdk.services.servicecatalog.CfnCloudFormationProduct
  }

  /**
   * The subtype containing details about the Codestar connection `Type` .
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.servicecatalog.*;
   * CodeStarParametersProperty codeStarParametersProperty = CodeStarParametersProperty.builder()
   * .artifactPath("artifactPath")
   * .branch("branch")
   * .connectionArn("connectionArn")
   * .repository("repository")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-servicecatalog-cloudformationproduct-codestarparameters.html)
   */
  public interface CodeStarParametersProperty {
    /**
     * The absolute path wehre the artifact resides within the repo and branch, formatted as
     * "folder/file.json.".
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-servicecatalog-cloudformationproduct-codestarparameters.html#cfn-servicecatalog-cloudformationproduct-codestarparameters-artifactpath)
     */
    public fun artifactPath(): String

    /**
     * The specific branch where the artifact resides.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-servicecatalog-cloudformationproduct-codestarparameters.html#cfn-servicecatalog-cloudformationproduct-codestarparameters-branch)
     */
    public fun branch(): String

    /**
     * The CodeStar ARN, which is the connection between AWS Service Catalog and the external
     * repository.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-servicecatalog-cloudformationproduct-codestarparameters.html#cfn-servicecatalog-cloudformationproduct-codestarparameters-connectionarn)
     */
    public fun connectionArn(): String

    /**
     * The specific repository where the product’s artifact-to-be-synced resides, formatted as
     * "Account/Repo.".
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-servicecatalog-cloudformationproduct-codestarparameters.html#cfn-servicecatalog-cloudformationproduct-codestarparameters-repository)
     */
    public fun repository(): String

    /**
     * A builder for [CodeStarParametersProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param artifactPath The absolute path wehre the artifact resides within the repo and
       * branch, formatted as "folder/file.json.". 
       */
      public fun artifactPath(artifactPath: String)

      /**
       * @param branch The specific branch where the artifact resides. 
       */
      public fun branch(branch: String)

      /**
       * @param connectionArn The CodeStar ARN, which is the connection between AWS Service Catalog
       * and the external repository. 
       */
      public fun connectionArn(connectionArn: String)

      /**
       * @param repository The specific repository where the product’s artifact-to-be-synced
       * resides, formatted as "Account/Repo.". 
       */
      public fun repository(repository: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.servicecatalog.CfnCloudFormationProduct.CodeStarParametersProperty.Builder
          =
          software.amazon.awscdk.services.servicecatalog.CfnCloudFormationProduct.CodeStarParametersProperty.builder()

      /**
       * @param artifactPath The absolute path wehre the artifact resides within the repo and
       * branch, formatted as "folder/file.json.". 
       */
      override fun artifactPath(artifactPath: String) {
        cdkBuilder.artifactPath(artifactPath)
      }

      /**
       * @param branch The specific branch where the artifact resides. 
       */
      override fun branch(branch: String) {
        cdkBuilder.branch(branch)
      }

      /**
       * @param connectionArn The CodeStar ARN, which is the connection between AWS Service Catalog
       * and the external repository. 
       */
      override fun connectionArn(connectionArn: String) {
        cdkBuilder.connectionArn(connectionArn)
      }

      /**
       * @param repository The specific repository where the product’s artifact-to-be-synced
       * resides, formatted as "Account/Repo.". 
       */
      override fun repository(repository: String) {
        cdkBuilder.repository(repository)
      }

      public fun build():
          software.amazon.awscdk.services.servicecatalog.CfnCloudFormationProduct.CodeStarParametersProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.servicecatalog.CfnCloudFormationProduct.CodeStarParametersProperty,
    ) : CdkObject(cdkObject), CodeStarParametersProperty {
      /**
       * The absolute path wehre the artifact resides within the repo and branch, formatted as
       * "folder/file.json.".
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-servicecatalog-cloudformationproduct-codestarparameters.html#cfn-servicecatalog-cloudformationproduct-codestarparameters-artifactpath)
       */
      override fun artifactPath(): String = unwrap(this).getArtifactPath()

      /**
       * The specific branch where the artifact resides.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-servicecatalog-cloudformationproduct-codestarparameters.html#cfn-servicecatalog-cloudformationproduct-codestarparameters-branch)
       */
      override fun branch(): String = unwrap(this).getBranch()

      /**
       * The CodeStar ARN, which is the connection between AWS Service Catalog and the external
       * repository.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-servicecatalog-cloudformationproduct-codestarparameters.html#cfn-servicecatalog-cloudformationproduct-codestarparameters-connectionarn)
       */
      override fun connectionArn(): String = unwrap(this).getConnectionArn()

      /**
       * The specific repository where the product’s artifact-to-be-synced resides, formatted as
       * "Account/Repo.".
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-servicecatalog-cloudformationproduct-codestarparameters.html#cfn-servicecatalog-cloudformationproduct-codestarparameters-repository)
       */
      override fun repository(): String = unwrap(this).getRepository()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): CodeStarParametersProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.servicecatalog.CfnCloudFormationProduct.CodeStarParametersProperty):
          CodeStarParametersProperty = CdkObjectWrappers.wrap(cdkObject) as?
          CodeStarParametersProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: CodeStarParametersProperty):
          software.amazon.awscdk.services.servicecatalog.CfnCloudFormationProduct.CodeStarParametersProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.servicecatalog.CfnCloudFormationProduct.CodeStarParametersProperty
    }
  }

  /**
   * Provides connection details.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.servicecatalog.*;
   * ConnectionParametersProperty connectionParametersProperty =
   * ConnectionParametersProperty.builder()
   * .codeStar(CodeStarParametersProperty.builder()
   * .artifactPath("artifactPath")
   * .branch("branch")
   * .connectionArn("connectionArn")
   * .repository("repository")
   * .build())
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-servicecatalog-cloudformationproduct-connectionparameters.html)
   */
  public interface ConnectionParametersProperty {
    /**
     * Provides `ConnectionType` details.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-servicecatalog-cloudformationproduct-connectionparameters.html#cfn-servicecatalog-cloudformationproduct-connectionparameters-codestar)
     */
    public fun codeStar(): Any? = unwrap(this).getCodeStar()

    /**
     * A builder for [ConnectionParametersProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param codeStar Provides `ConnectionType` details.
       */
      public fun codeStar(codeStar: IResolvable)

      /**
       * @param codeStar Provides `ConnectionType` details.
       */
      public fun codeStar(codeStar: CodeStarParametersProperty)

      /**
       * @param codeStar Provides `ConnectionType` details.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("4535c19f9c126f48c42ff0a7c4dd97d57374d914f7acd5c03106fed30edddd8b")
      public fun codeStar(codeStar: CodeStarParametersProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.servicecatalog.CfnCloudFormationProduct.ConnectionParametersProperty.Builder
          =
          software.amazon.awscdk.services.servicecatalog.CfnCloudFormationProduct.ConnectionParametersProperty.builder()

      /**
       * @param codeStar Provides `ConnectionType` details.
       */
      override fun codeStar(codeStar: IResolvable) {
        cdkBuilder.codeStar(codeStar.let(IResolvable::unwrap))
      }

      /**
       * @param codeStar Provides `ConnectionType` details.
       */
      override fun codeStar(codeStar: CodeStarParametersProperty) {
        cdkBuilder.codeStar(codeStar.let(CodeStarParametersProperty::unwrap))
      }

      /**
       * @param codeStar Provides `ConnectionType` details.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("4535c19f9c126f48c42ff0a7c4dd97d57374d914f7acd5c03106fed30edddd8b")
      override fun codeStar(codeStar: CodeStarParametersProperty.Builder.() -> Unit): Unit =
          codeStar(CodeStarParametersProperty(codeStar))

      public fun build():
          software.amazon.awscdk.services.servicecatalog.CfnCloudFormationProduct.ConnectionParametersProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.servicecatalog.CfnCloudFormationProduct.ConnectionParametersProperty,
    ) : CdkObject(cdkObject), ConnectionParametersProperty {
      /**
       * Provides `ConnectionType` details.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-servicecatalog-cloudformationproduct-connectionparameters.html#cfn-servicecatalog-cloudformationproduct-connectionparameters-codestar)
       */
      override fun codeStar(): Any? = unwrap(this).getCodeStar()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): ConnectionParametersProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.servicecatalog.CfnCloudFormationProduct.ConnectionParametersProperty):
          ConnectionParametersProperty = CdkObjectWrappers.wrap(cdkObject) as?
          ConnectionParametersProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: ConnectionParametersProperty):
          software.amazon.awscdk.services.servicecatalog.CfnCloudFormationProduct.ConnectionParametersProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.servicecatalog.CfnCloudFormationProduct.ConnectionParametersProperty
    }
  }

  /**
   * Information about a provisioning artifact (also known as a version) for a product.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.servicecatalog.*;
   * Object info;
   * ProvisioningArtifactPropertiesProperty provisioningArtifactPropertiesProperty =
   * ProvisioningArtifactPropertiesProperty.builder()
   * .info(info)
   * // the properties below are optional
   * .description("description")
   * .disableTemplateValidation(false)
   * .name("name")
   * .type("type")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-servicecatalog-cloudformationproduct-provisioningartifactproperties.html)
   */
  public interface ProvisioningArtifactPropertiesProperty {
    /**
     * The description of the provisioning artifact, including how it differs from the previous
     * provisioning artifact.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-servicecatalog-cloudformationproduct-provisioningartifactproperties.html#cfn-servicecatalog-cloudformationproduct-provisioningartifactproperties-description)
     */
    public fun description(): String? = unwrap(this).getDescription()

    /**
     * If set to true, AWS Service Catalog stops validating the specified provisioning artifact even
     * if it is invalid.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-servicecatalog-cloudformationproduct-provisioningartifactproperties.html#cfn-servicecatalog-cloudformationproduct-provisioningartifactproperties-disabletemplatevalidation)
     */
    public fun disableTemplateValidation(): Any? = unwrap(this).getDisableTemplateValidation()

    /**
     * Specify the template source with one of the following options, but not both.
     *
     * Keys accepted: [ `LoadTemplateFromURL` , `ImportFromPhysicalId` ]
     *
     * The URL of the AWS CloudFormation template in Amazon S3 in JSON format. Specify the URL in
     * JSON format as follows:
     *
     * `"LoadTemplateFromURL": "https://s3.amazonaws.com/cf-templates-ozkq9d3hgiq2-us-east-1/..."`
     *
     * `ImportFromPhysicalId` : The physical id of the resource that contains the template.
     * Currently only supports AWS CloudFormation stack arn. Specify the physical id in JSON format as
     * follows: `ImportFromPhysicalId:
     * “arn:aws:cloudformation:[us-east-1]:[accountId]:stack/[StackName]/[resourceId]`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-servicecatalog-cloudformationproduct-provisioningartifactproperties.html#cfn-servicecatalog-cloudformationproduct-provisioningartifactproperties-info)
     */
    public fun info(): Any

    /**
     * The name of the provisioning artifact (for example, v1 v2beta).
     *
     * No spaces are allowed.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-servicecatalog-cloudformationproduct-provisioningartifactproperties.html#cfn-servicecatalog-cloudformationproduct-provisioningartifactproperties-name)
     */
    public fun name(): String? = unwrap(this).getName()

    /**
     * The type of provisioning artifact.
     *
     * * `CLOUD_FORMATION_TEMPLATE` - AWS CloudFormation template
     * * `TERRAFORM_OPEN_SOURCE` - Terraform Open Source configuration file
     * * `TERRAFORM_CLOUD` - Terraform Cloud configuration file
     * * `EXTERNAL` - External configuration file
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-servicecatalog-cloudformationproduct-provisioningartifactproperties.html#cfn-servicecatalog-cloudformationproduct-provisioningartifactproperties-type)
     */
    public fun type(): String? = unwrap(this).getType()

    /**
     * A builder for [ProvisioningArtifactPropertiesProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param description The description of the provisioning artifact, including how it differs
       * from the previous provisioning artifact.
       */
      public fun description(description: String)

      /**
       * @param disableTemplateValidation If set to true, AWS Service Catalog stops validating the
       * specified provisioning artifact even if it is invalid.
       */
      public fun disableTemplateValidation(disableTemplateValidation: Boolean)

      /**
       * @param disableTemplateValidation If set to true, AWS Service Catalog stops validating the
       * specified provisioning artifact even if it is invalid.
       */
      public fun disableTemplateValidation(disableTemplateValidation: IResolvable)

      /**
       * @param info Specify the template source with one of the following options, but not both. 
       * Keys accepted: [ `LoadTemplateFromURL` , `ImportFromPhysicalId` ]
       *
       * The URL of the AWS CloudFormation template in Amazon S3 in JSON format. Specify the URL in
       * JSON format as follows:
       *
       * `"LoadTemplateFromURL": "https://s3.amazonaws.com/cf-templates-ozkq9d3hgiq2-us-east-1/..."`
       *
       * `ImportFromPhysicalId` : The physical id of the resource that contains the template.
       * Currently only supports AWS CloudFormation stack arn. Specify the physical id in JSON format
       * as follows: `ImportFromPhysicalId:
       * “arn:aws:cloudformation:[us-east-1]:[accountId]:stack/[StackName]/[resourceId]`
       */
      public fun info(info: Any)

      /**
       * @param name The name of the provisioning artifact (for example, v1 v2beta).
       * No spaces are allowed.
       */
      public fun name(name: String)

      /**
       * @param type The type of provisioning artifact.
       * * `CLOUD_FORMATION_TEMPLATE` - AWS CloudFormation template
       * * `TERRAFORM_OPEN_SOURCE` - Terraform Open Source configuration file
       * * `TERRAFORM_CLOUD` - Terraform Cloud configuration file
       * * `EXTERNAL` - External configuration file
       */
      public fun type(type: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.servicecatalog.CfnCloudFormationProduct.ProvisioningArtifactPropertiesProperty.Builder
          =
          software.amazon.awscdk.services.servicecatalog.CfnCloudFormationProduct.ProvisioningArtifactPropertiesProperty.builder()

      /**
       * @param description The description of the provisioning artifact, including how it differs
       * from the previous provisioning artifact.
       */
      override fun description(description: String) {
        cdkBuilder.description(description)
      }

      /**
       * @param disableTemplateValidation If set to true, AWS Service Catalog stops validating the
       * specified provisioning artifact even if it is invalid.
       */
      override fun disableTemplateValidation(disableTemplateValidation: Boolean) {
        cdkBuilder.disableTemplateValidation(disableTemplateValidation)
      }

      /**
       * @param disableTemplateValidation If set to true, AWS Service Catalog stops validating the
       * specified provisioning artifact even if it is invalid.
       */
      override fun disableTemplateValidation(disableTemplateValidation: IResolvable) {
        cdkBuilder.disableTemplateValidation(disableTemplateValidation.let(IResolvable::unwrap))
      }

      /**
       * @param info Specify the template source with one of the following options, but not both. 
       * Keys accepted: [ `LoadTemplateFromURL` , `ImportFromPhysicalId` ]
       *
       * The URL of the AWS CloudFormation template in Amazon S3 in JSON format. Specify the URL in
       * JSON format as follows:
       *
       * `"LoadTemplateFromURL": "https://s3.amazonaws.com/cf-templates-ozkq9d3hgiq2-us-east-1/..."`
       *
       * `ImportFromPhysicalId` : The physical id of the resource that contains the template.
       * Currently only supports AWS CloudFormation stack arn. Specify the physical id in JSON format
       * as follows: `ImportFromPhysicalId:
       * “arn:aws:cloudformation:[us-east-1]:[accountId]:stack/[StackName]/[resourceId]`
       */
      override fun info(info: Any) {
        cdkBuilder.info(info)
      }

      /**
       * @param name The name of the provisioning artifact (for example, v1 v2beta).
       * No spaces are allowed.
       */
      override fun name(name: String) {
        cdkBuilder.name(name)
      }

      /**
       * @param type The type of provisioning artifact.
       * * `CLOUD_FORMATION_TEMPLATE` - AWS CloudFormation template
       * * `TERRAFORM_OPEN_SOURCE` - Terraform Open Source configuration file
       * * `TERRAFORM_CLOUD` - Terraform Cloud configuration file
       * * `EXTERNAL` - External configuration file
       */
      override fun type(type: String) {
        cdkBuilder.type(type)
      }

      public fun build():
          software.amazon.awscdk.services.servicecatalog.CfnCloudFormationProduct.ProvisioningArtifactPropertiesProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.servicecatalog.CfnCloudFormationProduct.ProvisioningArtifactPropertiesProperty,
    ) : CdkObject(cdkObject), ProvisioningArtifactPropertiesProperty {
      /**
       * The description of the provisioning artifact, including how it differs from the previous
       * provisioning artifact.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-servicecatalog-cloudformationproduct-provisioningartifactproperties.html#cfn-servicecatalog-cloudformationproduct-provisioningartifactproperties-description)
       */
      override fun description(): String? = unwrap(this).getDescription()

      /**
       * If set to true, AWS Service Catalog stops validating the specified provisioning artifact
       * even if it is invalid.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-servicecatalog-cloudformationproduct-provisioningartifactproperties.html#cfn-servicecatalog-cloudformationproduct-provisioningartifactproperties-disabletemplatevalidation)
       */
      override fun disableTemplateValidation(): Any? = unwrap(this).getDisableTemplateValidation()

      /**
       * Specify the template source with one of the following options, but not both.
       *
       * Keys accepted: [ `LoadTemplateFromURL` , `ImportFromPhysicalId` ]
       *
       * The URL of the AWS CloudFormation template in Amazon S3 in JSON format. Specify the URL in
       * JSON format as follows:
       *
       * `"LoadTemplateFromURL": "https://s3.amazonaws.com/cf-templates-ozkq9d3hgiq2-us-east-1/..."`
       *
       * `ImportFromPhysicalId` : The physical id of the resource that contains the template.
       * Currently only supports AWS CloudFormation stack arn. Specify the physical id in JSON format
       * as follows: `ImportFromPhysicalId:
       * “arn:aws:cloudformation:[us-east-1]:[accountId]:stack/[StackName]/[resourceId]`
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-servicecatalog-cloudformationproduct-provisioningartifactproperties.html#cfn-servicecatalog-cloudformationproduct-provisioningartifactproperties-info)
       */
      override fun info(): Any = unwrap(this).getInfo()

      /**
       * The name of the provisioning artifact (for example, v1 v2beta).
       *
       * No spaces are allowed.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-servicecatalog-cloudformationproduct-provisioningartifactproperties.html#cfn-servicecatalog-cloudformationproduct-provisioningartifactproperties-name)
       */
      override fun name(): String? = unwrap(this).getName()

      /**
       * The type of provisioning artifact.
       *
       * * `CLOUD_FORMATION_TEMPLATE` - AWS CloudFormation template
       * * `TERRAFORM_OPEN_SOURCE` - Terraform Open Source configuration file
       * * `TERRAFORM_CLOUD` - Terraform Cloud configuration file
       * * `EXTERNAL` - External configuration file
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-servicecatalog-cloudformationproduct-provisioningartifactproperties.html#cfn-servicecatalog-cloudformationproduct-provisioningartifactproperties-type)
       */
      override fun type(): String? = unwrap(this).getType()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          ProvisioningArtifactPropertiesProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.servicecatalog.CfnCloudFormationProduct.ProvisioningArtifactPropertiesProperty):
          ProvisioningArtifactPropertiesProperty = CdkObjectWrappers.wrap(cdkObject) as?
          ProvisioningArtifactPropertiesProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: ProvisioningArtifactPropertiesProperty):
          software.amazon.awscdk.services.servicecatalog.CfnCloudFormationProduct.ProvisioningArtifactPropertiesProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.servicecatalog.CfnCloudFormationProduct.ProvisioningArtifactPropertiesProperty
    }
  }

  /**
   * A top level `ProductViewDetail` response containing details about the product’s connection.
   *
   * AWS Service Catalog returns this field for the `CreateProduct` , `UpdateProduct` ,
   * `DescribeProductAsAdmin` , and `SearchProductAsAdmin` APIs. This response contains the same fields
   * as the `ConnectionParameters` request, with the addition of the `LastSync` response.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.servicecatalog.*;
   * SourceConnectionProperty sourceConnectionProperty = SourceConnectionProperty.builder()
   * .connectionParameters(ConnectionParametersProperty.builder()
   * .codeStar(CodeStarParametersProperty.builder()
   * .artifactPath("artifactPath")
   * .branch("branch")
   * .connectionArn("connectionArn")
   * .repository("repository")
   * .build())
   * .build())
   * .type("type")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-servicecatalog-cloudformationproduct-sourceconnection.html)
   */
  public interface SourceConnectionProperty {
    /**
     * The connection details based on the connection `Type` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-servicecatalog-cloudformationproduct-sourceconnection.html#cfn-servicecatalog-cloudformationproduct-sourceconnection-connectionparameters)
     */
    public fun connectionParameters(): Any

    /**
     * The only supported `SourceConnection` type is Codestar.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-servicecatalog-cloudformationproduct-sourceconnection.html#cfn-servicecatalog-cloudformationproduct-sourceconnection-type)
     */
    public fun type(): String

    /**
     * A builder for [SourceConnectionProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param connectionParameters The connection details based on the connection `Type` . 
       */
      public fun connectionParameters(connectionParameters: IResolvable)

      /**
       * @param connectionParameters The connection details based on the connection `Type` . 
       */
      public fun connectionParameters(connectionParameters: ConnectionParametersProperty)

      /**
       * @param connectionParameters The connection details based on the connection `Type` . 
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("91e8b9c506db905bed859bcb46d9e4023c14486820356214116cac00209d0817")
      public
          fun connectionParameters(connectionParameters: ConnectionParametersProperty.Builder.() -> Unit)

      /**
       * @param type The only supported `SourceConnection` type is Codestar. 
       */
      public fun type(type: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.servicecatalog.CfnCloudFormationProduct.SourceConnectionProperty.Builder
          =
          software.amazon.awscdk.services.servicecatalog.CfnCloudFormationProduct.SourceConnectionProperty.builder()

      /**
       * @param connectionParameters The connection details based on the connection `Type` . 
       */
      override fun connectionParameters(connectionParameters: IResolvable) {
        cdkBuilder.connectionParameters(connectionParameters.let(IResolvable::unwrap))
      }

      /**
       * @param connectionParameters The connection details based on the connection `Type` . 
       */
      override fun connectionParameters(connectionParameters: ConnectionParametersProperty) {
        cdkBuilder.connectionParameters(connectionParameters.let(ConnectionParametersProperty::unwrap))
      }

      /**
       * @param connectionParameters The connection details based on the connection `Type` . 
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("91e8b9c506db905bed859bcb46d9e4023c14486820356214116cac00209d0817")
      override
          fun connectionParameters(connectionParameters: ConnectionParametersProperty.Builder.() -> Unit):
          Unit = connectionParameters(ConnectionParametersProperty(connectionParameters))

      /**
       * @param type The only supported `SourceConnection` type is Codestar. 
       */
      override fun type(type: String) {
        cdkBuilder.type(type)
      }

      public fun build():
          software.amazon.awscdk.services.servicecatalog.CfnCloudFormationProduct.SourceConnectionProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.servicecatalog.CfnCloudFormationProduct.SourceConnectionProperty,
    ) : CdkObject(cdkObject), SourceConnectionProperty {
      /**
       * The connection details based on the connection `Type` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-servicecatalog-cloudformationproduct-sourceconnection.html#cfn-servicecatalog-cloudformationproduct-sourceconnection-connectionparameters)
       */
      override fun connectionParameters(): Any = unwrap(this).getConnectionParameters()

      /**
       * The only supported `SourceConnection` type is Codestar.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-servicecatalog-cloudformationproduct-sourceconnection.html#cfn-servicecatalog-cloudformationproduct-sourceconnection-type)
       */
      override fun type(): String = unwrap(this).getType()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): SourceConnectionProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.servicecatalog.CfnCloudFormationProduct.SourceConnectionProperty):
          SourceConnectionProperty = CdkObjectWrappers.wrap(cdkObject) as? SourceConnectionProperty
          ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: SourceConnectionProperty):
          software.amazon.awscdk.services.servicecatalog.CfnCloudFormationProduct.SourceConnectionProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.servicecatalog.CfnCloudFormationProduct.SourceConnectionProperty
    }
  }
}
