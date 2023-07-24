@file:Suppress("RedundantVisibilityModifier", "RedundantUnitReturnType", "RemoveRedundantQualifierName", "unused", "UnusedImport", "ClassName", "REDUNDANT_PROJECTION", "DEPRECATION")

package cloudshift.awscdk.dsl.services.servicecatalog

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.dsl.CfnTagDsl
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.servicecatalog.CfnCloudFormationProduct
import software.constructs.Construct
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList

/**
 * Specifies a product.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.servicecatalog.*;
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
@CdkDslMarker
public class CfnCloudFormationProductDsl(
    scope: Construct,
    id: String
) {
    private val cdkBuilder: CfnCloudFormationProduct.Builder =
        CfnCloudFormationProduct.Builder.create(scope, id)

    private val _provisioningArtifactParameters: MutableList<Any> = mutableListOf()

    private val _tags: MutableList<CfnTag> = mutableListOf()

    /**
     * The language code.
     *
     * * `jp` - Japanese
     * * `zh` - Chinese
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-cloudformationproduct.html#cfn-servicecatalog-cloudformationproduct-acceptlanguage)
     * @param acceptLanguage The language code.
     */
    public fun acceptLanguage(acceptLanguage: String) {
        cdkBuilder.acceptLanguage(acceptLanguage)
    }

    /**
     * The description of the product.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-cloudformationproduct.html#cfn-servicecatalog-cloudformationproduct-description)
     * @param description The description of the product.
     */
    public fun description(description: String) {
        cdkBuilder.description(description)
    }

    /**
     * The distributor of the product.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-cloudformationproduct.html#cfn-servicecatalog-cloudformationproduct-distributor)
     * @param distributor The distributor of the product.
     */
    public fun distributor(distributor: String) {
        cdkBuilder.distributor(distributor)
    }

    /**
     * The name of the product.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-cloudformationproduct.html#cfn-servicecatalog-cloudformationproduct-name)
     * @param name The name of the product.
     */
    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    /**
     * The owner of the product.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-cloudformationproduct.html#cfn-servicecatalog-cloudformationproduct-owner)
     * @param owner The owner of the product.
     */
    public fun owner(owner: String) {
        cdkBuilder.owner(owner)
    }

    /**
     * The type of product.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-cloudformationproduct.html#cfn-servicecatalog-cloudformationproduct-producttype)
     * @param productType The type of product.
     */
    public fun productType(productType: String) {
        cdkBuilder.productType(productType)
    }

    /**
     * The configuration of the provisioning artifact (also known as a version).
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-cloudformationproduct.html#cfn-servicecatalog-cloudformationproduct-provisioningartifactparameters)
     * @param provisioningArtifactParameters The configuration of the provisioning artifact (also
     * known as a version).
     */
    public fun provisioningArtifactParameters(vararg provisioningArtifactParameters: Any) {
        _provisioningArtifactParameters.addAll(listOf(*provisioningArtifactParameters))
    }

    /**
     * The configuration of the provisioning artifact (also known as a version).
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-cloudformationproduct.html#cfn-servicecatalog-cloudformationproduct-provisioningartifactparameters)
     * @param provisioningArtifactParameters The configuration of the provisioning artifact (also
     * known as a version).
     */
    public fun provisioningArtifactParameters(provisioningArtifactParameters: Collection<Any>) {
        _provisioningArtifactParameters.addAll(provisioningArtifactParameters)
    }

    /**
     * The configuration of the provisioning artifact (also known as a version).
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-cloudformationproduct.html#cfn-servicecatalog-cloudformationproduct-provisioningartifactparameters)
     * @param provisioningArtifactParameters The configuration of the provisioning artifact (also
     * known as a version).
     */
    public fun provisioningArtifactParameters(provisioningArtifactParameters: IResolvable) {
        cdkBuilder.provisioningArtifactParameters(provisioningArtifactParameters)
    }

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
     * @param replaceProvisioningArtifacts This property is turned off by default.
     */
    public fun replaceProvisioningArtifacts(replaceProvisioningArtifacts: Boolean) {
        cdkBuilder.replaceProvisioningArtifacts(replaceProvisioningArtifacts)
    }

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
     * @param replaceProvisioningArtifacts This property is turned off by default.
     */
    public fun replaceProvisioningArtifacts(replaceProvisioningArtifacts: IResolvable) {
        cdkBuilder.replaceProvisioningArtifacts(replaceProvisioningArtifacts)
    }

    /**
     * A top level `ProductViewDetail` response containing details about the product’s connection.
     *
     * AWS Service Catalog returns this field for the `CreateProduct` , `UpdateProduct` ,
     * `DescribeProductAsAdmin` , and `SearchProductAsAdmin` APIs. This response contains the same fields
     * as the `ConnectionParameters` request, with the addition of the `LastSync` response.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-cloudformationproduct.html#cfn-servicecatalog-cloudformationproduct-sourceconnection)
     * @param sourceConnection A top level `ProductViewDetail` response containing details about the
     * product’s connection.
     */
    public fun sourceConnection(sourceConnection: IResolvable) {
        cdkBuilder.sourceConnection(sourceConnection)
    }

    /**
     * A top level `ProductViewDetail` response containing details about the product’s connection.
     *
     * AWS Service Catalog returns this field for the `CreateProduct` , `UpdateProduct` ,
     * `DescribeProductAsAdmin` , and `SearchProductAsAdmin` APIs. This response contains the same fields
     * as the `ConnectionParameters` request, with the addition of the `LastSync` response.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-cloudformationproduct.html#cfn-servicecatalog-cloudformationproduct-sourceconnection)
     * @param sourceConnection A top level `ProductViewDetail` response containing details about the
     * product’s connection.
     */
    public fun sourceConnection(sourceConnection: CfnCloudFormationProduct.SourceConnectionProperty) {
        cdkBuilder.sourceConnection(sourceConnection)
    }

    /**
     * The support information about the product.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-cloudformationproduct.html#cfn-servicecatalog-cloudformationproduct-supportdescription)
     * @param supportDescription The support information about the product.
     */
    public fun supportDescription(supportDescription: String) {
        cdkBuilder.supportDescription(supportDescription)
    }

    /**
     * The contact email for product support.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-cloudformationproduct.html#cfn-servicecatalog-cloudformationproduct-supportemail)
     * @param supportEmail The contact email for product support.
     */
    public fun supportEmail(supportEmail: String) {
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
    public fun supportUrl(supportUrl: String) {
        cdkBuilder.supportUrl(supportUrl)
    }

    /**
     * One or more tags.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-cloudformationproduct.html#cfn-servicecatalog-cloudformationproduct-tags)
     * @param tags One or more tags.
     */
    public fun tags(tags: CfnTagDsl.() -> Unit) {
        _tags.add(CfnTagDsl().apply(tags).build())
    }

    /**
     * One or more tags.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-cloudformationproduct.html#cfn-servicecatalog-cloudformationproduct-tags)
     * @param tags One or more tags.
     */
    public fun tags(tags: Collection<CfnTag>) {
        _tags.addAll(tags)
    }

    public fun build(): CfnCloudFormationProduct {
        if (_provisioningArtifactParameters.isNotEmpty()) {
            cdkBuilder.provisioningArtifactParameters(_provisioningArtifactParameters)
        }
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        return cdkBuilder.build()
    }
}
