@file:Suppress("RedundantVisibilityModifier", "RedundantUnitReturnType", "RemoveRedundantQualifierName", "unused", "UnusedImport", "ClassName", "REDUNDANT_PROJECTION", "DEPRECATION")

package cloudshift.awscdk.dsl.services.servicecatalog

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.servicecatalog.CloudFormationProductProps
import software.amazon.awscdk.services.servicecatalog.CloudFormationProductVersion
import software.amazon.awscdk.services.servicecatalog.MessageLanguage
import software.amazon.awscdk.services.servicecatalog.TagOptions
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList

/**
 * Properties for a Cloudformation Product.
 *
 * Example:
 *
 * ```
 * import software.amazon.awscdk.*;
 * public class S3BucketProduct extends ProductStack {
 * public S3BucketProduct(Construct scope, String id) {
 * super(scope, id);
 * new Bucket(this, "BucketProduct");
 * }
 * }
 * CloudFormationProduct product = CloudFormationProduct.Builder.create(this, "Product")
 * .productName("My Product")
 * .owner("Product Owner")
 * .productVersions(List.of(CloudFormationProductVersion.builder()
 * .productVersionName("v1")
 * .cloudFormationTemplate(CloudFormationTemplate.fromProductStack(new S3BucketProduct(this,
 * "S3BucketProduct")))
 * .build()))
 * .build();
 * ```
 */
@CdkDslMarker
public class CloudFormationProductPropsDsl {
    private val cdkBuilder: CloudFormationProductProps.Builder = CloudFormationProductProps.builder()

    private val _productVersions: MutableList<CloudFormationProductVersion> = mutableListOf()

    /**
     * @param description The description of the product.
     */
    public fun description(description: String) {
        cdkBuilder.description(description)
    }

    /**
     * @param distributor The distributor of the product.
     */
    public fun distributor(distributor: String) {
        cdkBuilder.distributor(distributor)
    }

    /**
     * @param messageLanguage The language code.
     * Controls language for logging and errors.
     */
    public fun messageLanguage(messageLanguage: MessageLanguage) {
        cdkBuilder.messageLanguage(messageLanguage)
    }

    /**
     * @param owner The owner of the product.
     */
    public fun owner(owner: String) {
        cdkBuilder.owner(owner)
    }

    /**
     * @param productName The name of the product.
     */
    public fun productName(productName: String) {
        cdkBuilder.productName(productName)
    }

    /**
     * @param productVersions The configuration of the product version.
     */
    public fun productVersions(productVersions: CloudFormationProductVersionDsl.() -> Unit) {
        _productVersions.add(CloudFormationProductVersionDsl().apply(productVersions).build())
    }

    /**
     * @param productVersions The configuration of the product version.
     */
    public fun productVersions(productVersions: Collection<CloudFormationProductVersion>) {
        _productVersions.addAll(productVersions)
    }

    /**
     * @param replaceProductVersionIds Whether to give provisioning artifacts a new unique identifier
     * when the product attributes or provisioning artifacts is updated.
     */
    public fun replaceProductVersionIds(replaceProductVersionIds: Boolean) {
        cdkBuilder.replaceProductVersionIds(replaceProductVersionIds)
    }

    /**
     * @param supportDescription The support information about the product.
     */
    public fun supportDescription(supportDescription: String) {
        cdkBuilder.supportDescription(supportDescription)
    }

    /**
     * @param supportEmail The contact email for product support.
     */
    public fun supportEmail(supportEmail: String) {
        cdkBuilder.supportEmail(supportEmail)
    }

    /**
     * @param supportUrl The contact URL for product support.
     */
    public fun supportUrl(supportUrl: String) {
        cdkBuilder.supportUrl(supportUrl)
    }

    /**
     * @param tagOptions TagOptions associated directly to a product.
     */
    public fun tagOptions(tagOptions: TagOptions) {
        cdkBuilder.tagOptions(tagOptions)
    }

    public fun build(): CloudFormationProductProps {
        if (_productVersions.isNotEmpty()) cdkBuilder.productVersions(_productVersions)
        return cdkBuilder.build()
    }
}
