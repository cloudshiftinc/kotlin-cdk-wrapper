@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.servicecatalog

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

/**
 * Properties for defining a `CfnCloudFormationProduct`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.servicecatalog.*;
 * Object info;
 * CfnCloudFormationProductProps cfnCloudFormationProductProps =
 * CfnCloudFormationProductProps.builder()
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
public interface CfnCloudFormationProductProps {
  /**
   * The language code.
   *
   * * `jp` - Japanese
   * * `zh` - Chinese
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-cloudformationproduct.html#cfn-servicecatalog-cloudformationproduct-acceptlanguage)
   */
  public fun acceptLanguage(): String? = unwrap(this).getAcceptLanguage()

  /**
   * The description of the product.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-cloudformationproduct.html#cfn-servicecatalog-cloudformationproduct-description)
   */
  public fun description(): String? = unwrap(this).getDescription()

  /**
   * The distributor of the product.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-cloudformationproduct.html#cfn-servicecatalog-cloudformationproduct-distributor)
   */
  public fun distributor(): String? = unwrap(this).getDistributor()

  /**
   * The name of the product.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-cloudformationproduct.html#cfn-servicecatalog-cloudformationproduct-name)
   */
  public fun name(): String

  /**
   * The owner of the product.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-cloudformationproduct.html#cfn-servicecatalog-cloudformationproduct-owner)
   */
  public fun owner(): String

  /**
   * The type of product.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-cloudformationproduct.html#cfn-servicecatalog-cloudformationproduct-producttype)
   */
  public fun productType(): String? = unwrap(this).getProductType()

  /**
   * The configuration of the provisioning artifact (also known as a version).
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-cloudformationproduct.html#cfn-servicecatalog-cloudformationproduct-provisioningartifactparameters)
   */
  public fun provisioningArtifactParameters(): Any? =
      unwrap(this).getProvisioningArtifactParameters()

  /**
   * This property is turned off by default.
   *
   * If turned off, you can update provisioning artifacts or product attributes (such as
   * description, distributor, name, owner, and more) and the associated provisioning artifacts will
   * retain the same unique identifier. Provisioning artifacts are matched within the
   * CloudFormationProduct resource, and only those that have been updated will be changed.
   * Provisioning artifacts are matched by a combinaton of provisioning artifact template URL and name.
   *
   * If turned on, provisioning artifacts will be given a new unique identifier when you update the
   * product or provisioning artifacts.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-cloudformationproduct.html#cfn-servicecatalog-cloudformationproduct-replaceprovisioningartifacts)
   */
  public fun replaceProvisioningArtifacts(): Any? = unwrap(this).getReplaceProvisioningArtifacts()

  /**
   * A top level `ProductViewDetail` response containing details about the product’s connection.
   *
   * AWS Service Catalog returns this field for the `CreateProduct` , `UpdateProduct` ,
   * `DescribeProductAsAdmin` , and `SearchProductAsAdmin` APIs. This response contains the same fields
   * as the `ConnectionParameters` request, with the addition of the `LastSync` response.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-cloudformationproduct.html#cfn-servicecatalog-cloudformationproduct-sourceconnection)
   */
  public fun sourceConnection(): Any? = unwrap(this).getSourceConnection()

  /**
   * The support information about the product.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-cloudformationproduct.html#cfn-servicecatalog-cloudformationproduct-supportdescription)
   */
  public fun supportDescription(): String? = unwrap(this).getSupportDescription()

  /**
   * The contact email for product support.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-cloudformationproduct.html#cfn-servicecatalog-cloudformationproduct-supportemail)
   */
  public fun supportEmail(): String? = unwrap(this).getSupportEmail()

  /**
   * The contact URL for product support.
   *
   * `^https?:\/\//` / is the pattern used to validate SupportUrl.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-cloudformationproduct.html#cfn-servicecatalog-cloudformationproduct-supporturl)
   */
  public fun supportUrl(): String? = unwrap(this).getSupportUrl()

  /**
   * One or more tags.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-cloudformationproduct.html#cfn-servicecatalog-cloudformationproduct-tags)
   */
  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * A builder for [CfnCloudFormationProductProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param acceptLanguage The language code.
     * * `jp` - Japanese
     * * `zh` - Chinese
     */
    public fun acceptLanguage(acceptLanguage: String)

    /**
     * @param description The description of the product.
     */
    public fun description(description: String)

    /**
     * @param distributor The distributor of the product.
     */
    public fun distributor(distributor: String)

    /**
     * @param name The name of the product. 
     */
    public fun name(name: String)

    /**
     * @param owner The owner of the product. 
     */
    public fun owner(owner: String)

    /**
     * @param productType The type of product.
     */
    public fun productType(productType: String)

    /**
     * @param provisioningArtifactParameters The configuration of the provisioning artifact (also
     * known as a version).
     */
    public fun provisioningArtifactParameters(provisioningArtifactParameters: IResolvable)

    /**
     * @param provisioningArtifactParameters The configuration of the provisioning artifact (also
     * known as a version).
     */
    public fun provisioningArtifactParameters(provisioningArtifactParameters: List<Any>)

    /**
     * @param provisioningArtifactParameters The configuration of the provisioning artifact (also
     * known as a version).
     */
    public fun provisioningArtifactParameters(vararg provisioningArtifactParameters: Any)

    /**
     * @param replaceProvisioningArtifacts This property is turned off by default.
     * If turned off, you can update provisioning artifacts or product attributes (such as
     * description, distributor, name, owner, and more) and the associated provisioning artifacts will
     * retain the same unique identifier. Provisioning artifacts are matched within the
     * CloudFormationProduct resource, and only those that have been updated will be changed.
     * Provisioning artifacts are matched by a combinaton of provisioning artifact template URL and
     * name.
     *
     * If turned on, provisioning artifacts will be given a new unique identifier when you update
     * the product or provisioning artifacts.
     */
    public fun replaceProvisioningArtifacts(replaceProvisioningArtifacts: Boolean)

    /**
     * @param replaceProvisioningArtifacts This property is turned off by default.
     * If turned off, you can update provisioning artifacts or product attributes (such as
     * description, distributor, name, owner, and more) and the associated provisioning artifacts will
     * retain the same unique identifier. Provisioning artifacts are matched within the
     * CloudFormationProduct resource, and only those that have been updated will be changed.
     * Provisioning artifacts are matched by a combinaton of provisioning artifact template URL and
     * name.
     *
     * If turned on, provisioning artifacts will be given a new unique identifier when you update
     * the product or provisioning artifacts.
     */
    public fun replaceProvisioningArtifacts(replaceProvisioningArtifacts: IResolvable)

    /**
     * @param sourceConnection A top level `ProductViewDetail` response containing details about the
     * product’s connection.
     * AWS Service Catalog returns this field for the `CreateProduct` , `UpdateProduct` ,
     * `DescribeProductAsAdmin` , and `SearchProductAsAdmin` APIs. This response contains the same
     * fields as the `ConnectionParameters` request, with the addition of the `LastSync` response.
     */
    public fun sourceConnection(sourceConnection: IResolvable)

    /**
     * @param sourceConnection A top level `ProductViewDetail` response containing details about the
     * product’s connection.
     * AWS Service Catalog returns this field for the `CreateProduct` , `UpdateProduct` ,
     * `DescribeProductAsAdmin` , and `SearchProductAsAdmin` APIs. This response contains the same
     * fields as the `ConnectionParameters` request, with the addition of the `LastSync` response.
     */
    public fun sourceConnection(sourceConnection: CfnCloudFormationProduct.SourceConnectionProperty)

    /**
     * @param sourceConnection A top level `ProductViewDetail` response containing details about the
     * product’s connection.
     * AWS Service Catalog returns this field for the `CreateProduct` , `UpdateProduct` ,
     * `DescribeProductAsAdmin` , and `SearchProductAsAdmin` APIs. This response contains the same
     * fields as the `ConnectionParameters` request, with the addition of the `LastSync` response.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("37f02c9cab79199518acbcc04ae6db80e32e3447c5b6ed80783c8f4edcb1c9d6")
    public
        fun sourceConnection(sourceConnection: CfnCloudFormationProduct.SourceConnectionProperty.Builder.() -> Unit)

    /**
     * @param supportDescription The support information about the product.
     */
    public fun supportDescription(supportDescription: String)

    /**
     * @param supportEmail The contact email for product support.
     */
    public fun supportEmail(supportEmail: String)

    /**
     * @param supportUrl The contact URL for product support.
     * `^https?:\/\//` / is the pattern used to validate SupportUrl.
     */
    public fun supportUrl(supportUrl: String)

    /**
     * @param tags One or more tags.
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * @param tags One or more tags.
     */
    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.servicecatalog.CfnCloudFormationProductProps.Builder =
        software.amazon.awscdk.services.servicecatalog.CfnCloudFormationProductProps.builder()

    /**
     * @param acceptLanguage The language code.
     * * `jp` - Japanese
     * * `zh` - Chinese
     */
    override fun acceptLanguage(acceptLanguage: String) {
      cdkBuilder.acceptLanguage(acceptLanguage)
    }

    /**
     * @param description The description of the product.
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * @param distributor The distributor of the product.
     */
    override fun distributor(distributor: String) {
      cdkBuilder.distributor(distributor)
    }

    /**
     * @param name The name of the product. 
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * @param owner The owner of the product. 
     */
    override fun owner(owner: String) {
      cdkBuilder.owner(owner)
    }

    /**
     * @param productType The type of product.
     */
    override fun productType(productType: String) {
      cdkBuilder.productType(productType)
    }

    /**
     * @param provisioningArtifactParameters The configuration of the provisioning artifact (also
     * known as a version).
     */
    override fun provisioningArtifactParameters(provisioningArtifactParameters: IResolvable) {
      cdkBuilder.provisioningArtifactParameters(provisioningArtifactParameters.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param provisioningArtifactParameters The configuration of the provisioning artifact (also
     * known as a version).
     */
    override fun provisioningArtifactParameters(provisioningArtifactParameters: List<Any>) {
      cdkBuilder.provisioningArtifactParameters(provisioningArtifactParameters.map{CdkObjectWrappers.unwrap(it)})
    }

    /**
     * @param provisioningArtifactParameters The configuration of the provisioning artifact (also
     * known as a version).
     */
    override fun provisioningArtifactParameters(vararg provisioningArtifactParameters: Any): Unit =
        provisioningArtifactParameters(provisioningArtifactParameters.toList())

    /**
     * @param replaceProvisioningArtifacts This property is turned off by default.
     * If turned off, you can update provisioning artifacts or product attributes (such as
     * description, distributor, name, owner, and more) and the associated provisioning artifacts will
     * retain the same unique identifier. Provisioning artifacts are matched within the
     * CloudFormationProduct resource, and only those that have been updated will be changed.
     * Provisioning artifacts are matched by a combinaton of provisioning artifact template URL and
     * name.
     *
     * If turned on, provisioning artifacts will be given a new unique identifier when you update
     * the product or provisioning artifacts.
     */
    override fun replaceProvisioningArtifacts(replaceProvisioningArtifacts: Boolean) {
      cdkBuilder.replaceProvisioningArtifacts(replaceProvisioningArtifacts)
    }

    /**
     * @param replaceProvisioningArtifacts This property is turned off by default.
     * If turned off, you can update provisioning artifacts or product attributes (such as
     * description, distributor, name, owner, and more) and the associated provisioning artifacts will
     * retain the same unique identifier. Provisioning artifacts are matched within the
     * CloudFormationProduct resource, and only those that have been updated will be changed.
     * Provisioning artifacts are matched by a combinaton of provisioning artifact template URL and
     * name.
     *
     * If turned on, provisioning artifacts will be given a new unique identifier when you update
     * the product or provisioning artifacts.
     */
    override fun replaceProvisioningArtifacts(replaceProvisioningArtifacts: IResolvable) {
      cdkBuilder.replaceProvisioningArtifacts(replaceProvisioningArtifacts.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param sourceConnection A top level `ProductViewDetail` response containing details about the
     * product’s connection.
     * AWS Service Catalog returns this field for the `CreateProduct` , `UpdateProduct` ,
     * `DescribeProductAsAdmin` , and `SearchProductAsAdmin` APIs. This response contains the same
     * fields as the `ConnectionParameters` request, with the addition of the `LastSync` response.
     */
    override fun sourceConnection(sourceConnection: IResolvable) {
      cdkBuilder.sourceConnection(sourceConnection.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param sourceConnection A top level `ProductViewDetail` response containing details about the
     * product’s connection.
     * AWS Service Catalog returns this field for the `CreateProduct` , `UpdateProduct` ,
     * `DescribeProductAsAdmin` , and `SearchProductAsAdmin` APIs. This response contains the same
     * fields as the `ConnectionParameters` request, with the addition of the `LastSync` response.
     */
    override
        fun sourceConnection(sourceConnection: CfnCloudFormationProduct.SourceConnectionProperty) {
      cdkBuilder.sourceConnection(sourceConnection.let(CfnCloudFormationProduct.SourceConnectionProperty.Companion::unwrap))
    }

    /**
     * @param sourceConnection A top level `ProductViewDetail` response containing details about the
     * product’s connection.
     * AWS Service Catalog returns this field for the `CreateProduct` , `UpdateProduct` ,
     * `DescribeProductAsAdmin` , and `SearchProductAsAdmin` APIs. This response contains the same
     * fields as the `ConnectionParameters` request, with the addition of the `LastSync` response.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("37f02c9cab79199518acbcc04ae6db80e32e3447c5b6ed80783c8f4edcb1c9d6")
    override
        fun sourceConnection(sourceConnection: CfnCloudFormationProduct.SourceConnectionProperty.Builder.() -> Unit):
        Unit = sourceConnection(CfnCloudFormationProduct.SourceConnectionProperty(sourceConnection))

    /**
     * @param supportDescription The support information about the product.
     */
    override fun supportDescription(supportDescription: String) {
      cdkBuilder.supportDescription(supportDescription)
    }

    /**
     * @param supportEmail The contact email for product support.
     */
    override fun supportEmail(supportEmail: String) {
      cdkBuilder.supportEmail(supportEmail)
    }

    /**
     * @param supportUrl The contact URL for product support.
     * `^https?:\/\//` / is the pattern used to validate SupportUrl.
     */
    override fun supportUrl(supportUrl: String) {
      cdkBuilder.supportUrl(supportUrl)
    }

    /**
     * @param tags One or more tags.
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag.Companion::unwrap))
    }

    /**
     * @param tags One or more tags.
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.servicecatalog.CfnCloudFormationProductProps
        = cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.servicecatalog.CfnCloudFormationProductProps,
  ) : CdkObject(cdkObject),
      CfnCloudFormationProductProps {
    /**
     * The language code.
     *
     * * `jp` - Japanese
     * * `zh` - Chinese
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-cloudformationproduct.html#cfn-servicecatalog-cloudformationproduct-acceptlanguage)
     */
    override fun acceptLanguage(): String? = unwrap(this).getAcceptLanguage()

    /**
     * The description of the product.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-cloudformationproduct.html#cfn-servicecatalog-cloudformationproduct-description)
     */
    override fun description(): String? = unwrap(this).getDescription()

    /**
     * The distributor of the product.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-cloudformationproduct.html#cfn-servicecatalog-cloudformationproduct-distributor)
     */
    override fun distributor(): String? = unwrap(this).getDistributor()

    /**
     * The name of the product.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-cloudformationproduct.html#cfn-servicecatalog-cloudformationproduct-name)
     */
    override fun name(): String = unwrap(this).getName()

    /**
     * The owner of the product.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-cloudformationproduct.html#cfn-servicecatalog-cloudformationproduct-owner)
     */
    override fun owner(): String = unwrap(this).getOwner()

    /**
     * The type of product.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-cloudformationproduct.html#cfn-servicecatalog-cloudformationproduct-producttype)
     */
    override fun productType(): String? = unwrap(this).getProductType()

    /**
     * The configuration of the provisioning artifact (also known as a version).
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-cloudformationproduct.html#cfn-servicecatalog-cloudformationproduct-provisioningartifactparameters)
     */
    override fun provisioningArtifactParameters(): Any? =
        unwrap(this).getProvisioningArtifactParameters()

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
     */
    override fun replaceProvisioningArtifacts(): Any? =
        unwrap(this).getReplaceProvisioningArtifacts()

    /**
     * A top level `ProductViewDetail` response containing details about the product’s connection.
     *
     * AWS Service Catalog returns this field for the `CreateProduct` , `UpdateProduct` ,
     * `DescribeProductAsAdmin` , and `SearchProductAsAdmin` APIs. This response contains the same
     * fields as the `ConnectionParameters` request, with the addition of the `LastSync` response.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-cloudformationproduct.html#cfn-servicecatalog-cloudformationproduct-sourceconnection)
     */
    override fun sourceConnection(): Any? = unwrap(this).getSourceConnection()

    /**
     * The support information about the product.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-cloudformationproduct.html#cfn-servicecatalog-cloudformationproduct-supportdescription)
     */
    override fun supportDescription(): String? = unwrap(this).getSupportDescription()

    /**
     * The contact email for product support.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-cloudformationproduct.html#cfn-servicecatalog-cloudformationproduct-supportemail)
     */
    override fun supportEmail(): String? = unwrap(this).getSupportEmail()

    /**
     * The contact URL for product support.
     *
     * `^https?:\/\//` / is the pattern used to validate SupportUrl.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-cloudformationproduct.html#cfn-servicecatalog-cloudformationproduct-supporturl)
     */
    override fun supportUrl(): String? = unwrap(this).getSupportUrl()

    /**
     * One or more tags.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-cloudformationproduct.html#cfn-servicecatalog-cloudformationproduct-tags)
     */
    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnCloudFormationProductProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.servicecatalog.CfnCloudFormationProductProps):
        CfnCloudFormationProductProps = CdkObjectWrappers.wrap(cdkObject) as?
        CfnCloudFormationProductProps ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnCloudFormationProductProps):
        software.amazon.awscdk.services.servicecatalog.CfnCloudFormationProductProps = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.servicecatalog.CfnCloudFormationProductProps
  }
}
