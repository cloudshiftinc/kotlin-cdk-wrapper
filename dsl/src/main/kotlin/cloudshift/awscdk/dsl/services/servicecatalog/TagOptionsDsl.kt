@file:Suppress("RedundantVisibilityModifier", "RedundantUnitReturnType", "RemoveRedundantQualifierName", "unused", "UnusedImport", "ClassName", "REDUNDANT_PROJECTION", "DEPRECATION")

package cloudshift.awscdk.dsl.services.servicecatalog

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.servicecatalog.TagOptions
import software.constructs.Construct
import kotlin.String
import kotlin.collections.List
import kotlin.collections.Map

/**
 * Defines a set of TagOptions, which are a list of key-value pairs managed in AWS Service Catalog.
 *
 * It is not an AWS tag, but serves as a template for creating an AWS tag based on the TagOption.
 * See https://docs.aws.amazon.com/servicecatalog/latest/adminguide/tagoptions.html
 *
 * Example:
 *
 * ```
 * Portfolio portfolio;
 * CloudFormationProduct product;
 * TagOptions tagOptionsForPortfolio = TagOptions.Builder.create(this, "OrgTagOptions")
 * .allowedValuesForTags(Map.of(
 * "Group", List.of("finance", "engineering", "marketing", "research"),
 * "CostCenter", List.of("01", "02", "03")))
 * .build();
 * portfolio.associateTagOptions(tagOptionsForPortfolio);
 * TagOptions tagOptionsForProduct = TagOptions.Builder.create(this, "ProductTagOptions")
 * .allowedValuesForTags(Map.of(
 * "Environment", List.of("dev", "alpha", "prod")))
 * .build();
 * product.associateTagOptions(tagOptionsForProduct);
 * ```
 */
@CdkDslMarker
public class TagOptionsDsl(
    scope: Construct,
    id: String
) {
    private val cdkBuilder: TagOptions.Builder = TagOptions.Builder.create(scope, id)

    /**
     * The values that are allowed to be set for specific tags.
     *
     * The keys of the map represent the tag keys,
     * and the values of the map are a list of allowed values for that particular tag key.
     *
     * @param allowedValuesForTags The values that are allowed to be set for specific tags.
     */
    public fun allowedValuesForTags(allowedValuesForTags: Map<String, List<String>>) {
        cdkBuilder.allowedValuesForTags(allowedValuesForTags)
    }

    public fun build(): TagOptions = cdkBuilder.build()
}
