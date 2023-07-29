@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION"
)

package cloudshift.awscdk.dsl.services.servicecatalog

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.servicecatalog.CfnResourceUpdateConstraintProps

/**
 * Properties for defining a `CfnResourceUpdateConstraint`.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.servicecatalog.*;
 * CfnResourceUpdateConstraintProps cfnResourceUpdateConstraintProps =
 * CfnResourceUpdateConstraintProps.builder()
 * .portfolioId("portfolioId")
 * .productId("productId")
 * .tagUpdateOnProvisionedProduct("tagUpdateOnProvisionedProduct")
 * // the properties below are optional
 * .acceptLanguage("acceptLanguage")
 * .description("description")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-resourceupdateconstraint.html)
 */
@CdkDslMarker
public class CfnResourceUpdateConstraintPropsDsl {
    private val cdkBuilder: CfnResourceUpdateConstraintProps.Builder =
        CfnResourceUpdateConstraintProps.builder()

    /**
     * @param acceptLanguage The language code.
     * * `jp` - Japanese
     * * `zh` - Chinese
     */
    public fun acceptLanguage(acceptLanguage: String) {
        cdkBuilder.acceptLanguage(acceptLanguage)
    }

    /** @param description The description of the constraint. */
    public fun description(description: String) {
        cdkBuilder.description(description)
    }

    /** @param portfolioId The portfolio identifier. */
    public fun portfolioId(portfolioId: String) {
        cdkBuilder.portfolioId(portfolioId)
    }

    /** @param productId The product identifier. */
    public fun productId(productId: String) {
        cdkBuilder.productId(productId)
    }

    /**
     * @param tagUpdateOnProvisionedProduct If set to `ALLOWED` , lets users change tags in a
     *   [CloudFormationProvisionedProduct](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-cloudformationprovisionedproduct.html)
     *   resource. If set to `NOT_ALLOWED` , prevents users from changing tags in a
     *   [CloudFormationProvisionedProduct](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-cloudformationprovisionedproduct.html)
     *   resource.
     */
    public fun tagUpdateOnProvisionedProduct(tagUpdateOnProvisionedProduct: String) {
        cdkBuilder.tagUpdateOnProvisionedProduct(tagUpdateOnProvisionedProduct)
    }

    public fun build(): CfnResourceUpdateConstraintProps = cdkBuilder.build()
}
