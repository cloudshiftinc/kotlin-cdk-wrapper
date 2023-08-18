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
import software.amazon.awscdk.ICfnRuleConditionExpression
import software.amazon.awscdk.services.servicecatalog.TemplateRuleAssertion

/**
 * An assertion within a template rule, defined by intrinsic functions.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.*;
 * import software.amazon.awscdk.services.servicecatalog.*;
 * ICfnRuleConditionExpression cfnRuleConditionExpression;
 * TemplateRuleAssertion templateRuleAssertion = TemplateRuleAssertion.builder()
 * .assert(cfnRuleConditionExpression)
 * // the properties below are optional
 * .description("description")
 * .build();
 * ```
 */
@CdkDslMarker
public class TemplateRuleAssertionDsl {
    private val cdkBuilder: TemplateRuleAssertion.Builder = TemplateRuleAssertion.builder()

    /** @param assertValue The assertion condition. */
    public fun assertValue(assertValue: ICfnRuleConditionExpression) {
        cdkBuilder.assertValue(assertValue)
    }

    /** @param description The description for the asssertion. */
    public fun description(description: String) {
        cdkBuilder.description(description)
    }

    public fun build(): TemplateRuleAssertion = cdkBuilder.build()
}
