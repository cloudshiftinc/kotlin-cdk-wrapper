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

package io.cloudshiftdev.awscdkdsl.services.databrew

import io.cloudshiftdev.awscdkdsl.CfnTagDsl
import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.databrew.CfnRulesetProps

/**
 * Properties for defining a `CfnRuleset`.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.databrew.*;
 * CfnRulesetProps cfnRulesetProps = CfnRulesetProps.builder()
 * .name("name")
 * .rules(List.of(RuleProperty.builder()
 * .checkExpression("checkExpression")
 * .name("name")
 * // the properties below are optional
 * .columnSelectors(List.of(ColumnSelectorProperty.builder()
 * .name("name")
 * .regex("regex")
 * .build()))
 * .disabled(false)
 * .substitutionMap(List.of(SubstitutionValueProperty.builder()
 * .value("value")
 * .valueReference("valueReference")
 * .build()))
 * .threshold(ThresholdProperty.builder()
 * .value(123)
 * // the properties below are optional
 * .type("type")
 * .unit("unit")
 * .build())
 * .build()))
 * .targetArn("targetArn")
 * // the properties below are optional
 * .description("description")
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-databrew-ruleset.html)
 */
@CdkDslMarker
public class CfnRulesetPropsDsl {
    private val cdkBuilder: CfnRulesetProps.Builder = CfnRulesetProps.builder()

    private val _rules: MutableList<Any> = mutableListOf()

    private val _tags: MutableList<CfnTag> = mutableListOf()

    /** @param description The description of the ruleset. */
    public fun description(description: String) {
        cdkBuilder.description(description)
    }

    /** @param name The name of the ruleset. */
    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    /** @param rules Contains metadata about the ruleset. */
    public fun rules(vararg rules: Any) {
        _rules.addAll(listOf(*rules))
    }

    /** @param rules Contains metadata about the ruleset. */
    public fun rules(rules: Collection<Any>) {
        _rules.addAll(rules)
    }

    /** @param rules Contains metadata about the ruleset. */
    public fun rules(rules: IResolvable) {
        cdkBuilder.rules(rules)
    }

    /**
     * @param tags An array of key-value pairs to apply to this resource. For more information, see
     *   [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     *   .
     */
    public fun tags(tags: CfnTagDsl.() -> Unit) {
        _tags.add(CfnTagDsl().apply(tags).build())
    }

    /**
     * @param tags An array of key-value pairs to apply to this resource. For more information, see
     *   [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     *   .
     */
    public fun tags(tags: Collection<CfnTag>) {
        _tags.addAll(tags)
    }

    /**
     * @param targetArn The Amazon Resource Name (ARN) of a resource (dataset) that the ruleset is
     *   associated with.
     */
    public fun targetArn(targetArn: String) {
        cdkBuilder.targetArn(targetArn)
    }

    public fun build(): CfnRulesetProps {
        if (_rules.isNotEmpty()) cdkBuilder.rules(_rules)
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        return cdkBuilder.build()
    }
}
