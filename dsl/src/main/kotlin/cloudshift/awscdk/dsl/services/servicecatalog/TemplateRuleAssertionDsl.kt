@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION",
)

package cloudshift.awscdk.dsl.services.servicecatalog

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.ICfnRuleConditionExpression
import software.amazon.awscdk.services.servicecatalog.TemplateRuleAssertion
import kotlin.String

@CdkDslMarker
public class TemplateRuleAssertionDsl {
    private val cdkBuilder: TemplateRuleAssertion.Builder = TemplateRuleAssertion.builder()

    public fun assertValue(assertValue: ICfnRuleConditionExpression) {
        cdkBuilder.assertValue(assertValue)
    }

    public fun description(description: String) {
        cdkBuilder.description(description)
    }

    public fun build(): TemplateRuleAssertion = cdkBuilder.build()
}
