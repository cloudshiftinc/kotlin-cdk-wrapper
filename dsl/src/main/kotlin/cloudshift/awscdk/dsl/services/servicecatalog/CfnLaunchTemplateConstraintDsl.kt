@file:Suppress("RedundantVisibilityModifier", "RedundantUnitReturnType", "RemoveRedundantQualifierName", "unused", "UnusedImport", "ClassName", "REDUNDANT_PROJECTION", "DEPRECATION")

package cloudshift.awscdk.dsl.services.servicecatalog

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.servicecatalog.CfnLaunchTemplateConstraint
import software.constructs.Construct
import kotlin.String

/**
 * Specifies a template constraint.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.servicecatalog.*;
 * CfnLaunchTemplateConstraint cfnLaunchTemplateConstraint =
 * CfnLaunchTemplateConstraint.Builder.create(this, "MyCfnLaunchTemplateConstraint")
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
public class CfnLaunchTemplateConstraintDsl(
    scope: Construct,
    id: String
) {
    private val cdkBuilder: CfnLaunchTemplateConstraint.Builder =
        CfnLaunchTemplateConstraint.Builder.create(scope, id)

    /**
     * The language code.
     *
     * * `jp` - Japanese
     * * `zh` - Chinese
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-launchtemplateconstraint.html#cfn-servicecatalog-launchtemplateconstraint-acceptlanguage)
     * @param acceptLanguage The language code.
     */
    public fun acceptLanguage(acceptLanguage: String) {
        cdkBuilder.acceptLanguage(acceptLanguage)
    }

    /**
     * The description of the constraint.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-launchtemplateconstraint.html#cfn-servicecatalog-launchtemplateconstraint-description)
     * @param description The description of the constraint.
     */
    public fun description(description: String) {
        cdkBuilder.description(description)
    }

    /**
     * The portfolio identifier.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-launchtemplateconstraint.html#cfn-servicecatalog-launchtemplateconstraint-portfolioid)
     * @param portfolioId The portfolio identifier.
     */
    public fun portfolioId(portfolioId: String) {
        cdkBuilder.portfolioId(portfolioId)
    }

    /**
     * The product identifier.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-launchtemplateconstraint.html#cfn-servicecatalog-launchtemplateconstraint-productid)
     * @param productId The product identifier.
     */
    public fun productId(productId: String) {
        cdkBuilder.productId(productId)
    }

    /**
     * The constraint rules.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-launchtemplateconstraint.html#cfn-servicecatalog-launchtemplateconstraint-rules)
     * @param rules The constraint rules.
     */
    public fun rules(rules: String) {
        cdkBuilder.rules(rules)
    }

    public fun build(): CfnLaunchTemplateConstraint = cdkBuilder.build()
}
