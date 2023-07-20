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

package cloudshift.awscdk.dsl.services.wafv2

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.wafv2.CfnRuleGroup
import kotlin.Any
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList

@CdkDslMarker
public class CfnRuleGroupByteMatchStatementPropertyDsl {
    private val cdkBuilder: CfnRuleGroup.ByteMatchStatementProperty.Builder =
        CfnRuleGroup.ByteMatchStatementProperty.builder()

    private val _textTransformations: MutableList<Any> = mutableListOf()

    public fun fieldToMatch(fieldToMatch: IResolvable) {
        cdkBuilder.fieldToMatch(fieldToMatch)
    }

    public fun fieldToMatch(fieldToMatch: CfnRuleGroup.FieldToMatchProperty) {
        cdkBuilder.fieldToMatch(fieldToMatch)
    }

    public fun positionalConstraint(positionalConstraint: String) {
        cdkBuilder.positionalConstraint(positionalConstraint)
    }

    public fun searchString(searchString: String) {
        cdkBuilder.searchString(searchString)
    }

    public fun searchStringBase64(searchStringBase64: String) {
        cdkBuilder.searchStringBase64(searchStringBase64)
    }

    public fun textTransformations(vararg textTransformations: Any) {
        _textTransformations.addAll(listOf(*textTransformations))
    }

    public fun textTransformations(textTransformations: Collection<Any>) {
        _textTransformations.addAll(textTransformations)
    }

    public fun textTransformations(textTransformations: IResolvable) {
        cdkBuilder.textTransformations(textTransformations)
    }

    public fun build(): CfnRuleGroup.ByteMatchStatementProperty {
        if (_textTransformations.isNotEmpty()) cdkBuilder.textTransformations(_textTransformations)
        return cdkBuilder.build()
    }
}
