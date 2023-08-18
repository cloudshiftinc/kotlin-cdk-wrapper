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

package io.cloudshiftdev.awscdkdsl.services.servicecatalog

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.servicecatalog.CfnLaunchTemplateConstraintProps

/**
 * Properties for defining a `CfnLaunchTemplateConstraint`.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.servicecatalog.*;
 * CfnLaunchTemplateConstraintProps cfnLaunchTemplateConstraintProps =
 * CfnLaunchTemplateConstraintProps.builder()
 * .portfolioId("portfolioId")
 * .productId("productId")
 * .rules("rules")
 * // the properties below are optional
 * .acceptLanguage("acceptLanguage")
 * .description("description")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-launchtemplateconstraint.html)
 */
@CdkDslMarker
public class CfnLaunchTemplateConstraintPropsDsl {
    private val cdkBuilder: CfnLaunchTemplateConstraintProps.Builder =
        CfnLaunchTemplateConstraintProps.builder()

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

    /** @param rules The constraint rules. */
    public fun rules(rules: String) {
        cdkBuilder.rules(rules)
    }

    public fun build(): CfnLaunchTemplateConstraintProps = cdkBuilder.build()
}
