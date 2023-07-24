@file:Suppress("RedundantVisibilityModifier", "RedundantUnitReturnType", "RemoveRedundantQualifierName", "unused", "UnusedImport", "ClassName", "REDUNDANT_PROJECTION", "DEPRECATION")

package cloudshift.awscdk.dsl.services.servicecatalog

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.servicecatalog.ProductStack
import software.amazon.awscdk.services.servicecatalog.ProductStackHistoryProps
import kotlin.Boolean
import kotlin.String

/**
 * Properties for a ProductStackHistory.
 *
 * Example:
 *
 * ```
 * public class S3BucketProduct extends ProductStack {
 * public S3BucketProduct(Construct scope, String id) {
 * super(scope, id);
 * new Bucket(this, "BucketProductV2");
 * }
 * }
 * ProductStackHistory productStackHistory = ProductStackHistory.Builder.create(this,
 * "ProductStackHistory")
 * .productStack(new S3BucketProduct(this, "S3BucketProduct"))
 * .currentVersionName("v2")
 * .currentVersionLocked(true)
 * .build();
 * CloudFormationProduct product = CloudFormationProduct.Builder.create(this, "MyFirstProduct")
 * .productName("My Product")
 * .owner("Product Owner")
 * .productVersions(List.of(productStackHistory.currentVersion()))
 * .build();
 * ```
 */
@CdkDslMarker
public class ProductStackHistoryPropsDsl {
    private val cdkBuilder: ProductStackHistoryProps.Builder = ProductStackHistoryProps.builder()

    /**
     * @param currentVersionLocked If this is set to true, the ProductStack will not be overwritten if
     * a snapshot is found for the currentVersionName.
     */
    public fun currentVersionLocked(currentVersionLocked: Boolean) {
        cdkBuilder.currentVersionLocked(currentVersionLocked)
    }

    /**
     * @param currentVersionName The current version name of the ProductStack.
     */
    public fun currentVersionName(currentVersionName: String) {
        cdkBuilder.currentVersionName(currentVersionName)
    }

    /**
     * @param description The description of the product version.
     */
    public fun description(description: String) {
        cdkBuilder.description(description)
    }

    /**
     * @param directory The directory where template snapshots will be stored.
     */
    public fun directory(directory: String) {
        cdkBuilder.directory(directory)
    }

    /**
     * @param productStack The ProductStack whose history will be retained as a snapshot.
     */
    public fun productStack(productStack: ProductStack) {
        cdkBuilder.productStack(productStack)
    }

    /**
     * @param validateTemplate Whether the specified product template will be validated by
     * CloudFormation.
     * If turned off, an invalid template configuration can be stored.
     */
    public fun validateTemplate(validateTemplate: Boolean) {
        cdkBuilder.validateTemplate(validateTemplate)
    }

    public fun build(): ProductStackHistoryProps = cdkBuilder.build()
}
