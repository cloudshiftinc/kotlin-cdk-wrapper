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

package cloudshift.awscdk.dsl.services.frauddetector

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.dsl.CfnTagDsl
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.frauddetector.CfnDetector
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList

@CdkDslMarker
public class CfnDetectorRulePropertyDsl {
    private val cdkBuilder: CfnDetector.RuleProperty.Builder = CfnDetector.RuleProperty.builder()

    private val _outcomes: MutableList<Any> = mutableListOf()

    private val _tags: MutableList<CfnTag> = mutableListOf()

    public fun arn(arn: String) {
        cdkBuilder.arn(arn)
    }

    public fun createdTime(createdTime: String) {
        cdkBuilder.createdTime(createdTime)
    }

    public fun description(description: String) {
        cdkBuilder.description(description)
    }

    public fun detectorId(detectorId: String) {
        cdkBuilder.detectorId(detectorId)
    }

    public fun expression(expression: String) {
        cdkBuilder.expression(expression)
    }

    public fun language(language: String) {
        cdkBuilder.language(language)
    }

    public fun lastUpdatedTime(lastUpdatedTime: String) {
        cdkBuilder.lastUpdatedTime(lastUpdatedTime)
    }

    public fun outcomes(vararg outcomes: Any) {
        _outcomes.addAll(listOf(*outcomes))
    }

    public fun outcomes(outcomes: Collection<Any>) {
        _outcomes.addAll(outcomes)
    }

    public fun outcomes(outcomes: IResolvable) {
        cdkBuilder.outcomes(outcomes)
    }

    public fun ruleId(ruleId: String) {
        cdkBuilder.ruleId(ruleId)
    }

    public fun ruleVersion(ruleVersion: String) {
        cdkBuilder.ruleVersion(ruleVersion)
    }

    public fun tags(tags: CfnTagDsl.() -> Unit) {
        _tags.add(CfnTagDsl().apply(tags).build())
    }

    public fun tags(tags: Collection<CfnTag>) {
        _tags.addAll(tags)
    }

    public fun build(): CfnDetector.RuleProperty {
        if (_outcomes.isNotEmpty()) cdkBuilder.outcomes(_outcomes)
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        return cdkBuilder.build()
    }
}
