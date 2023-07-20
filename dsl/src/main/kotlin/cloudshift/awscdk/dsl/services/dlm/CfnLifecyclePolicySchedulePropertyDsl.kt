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

package cloudshift.awscdk.dsl.services.dlm

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.dlm.CfnLifecyclePolicy
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList

@CdkDslMarker
public class CfnLifecyclePolicySchedulePropertyDsl {
    private val cdkBuilder: CfnLifecyclePolicy.ScheduleProperty.Builder =
        CfnLifecyclePolicy.ScheduleProperty.builder()

    private val _crossRegionCopyRules: MutableList<Any> = mutableListOf()

    private val _shareRules: MutableList<Any> = mutableListOf()

    private val _tagsToAdd: MutableList<Any> = mutableListOf()

    private val _variableTags: MutableList<Any> = mutableListOf()

    public fun archiveRule(archiveRule: IResolvable) {
        cdkBuilder.archiveRule(archiveRule)
    }

    public fun archiveRule(archiveRule: CfnLifecyclePolicy.ArchiveRuleProperty) {
        cdkBuilder.archiveRule(archiveRule)
    }

    public fun copyTags(copyTags: Boolean) {
        cdkBuilder.copyTags(copyTags)
    }

    public fun copyTags(copyTags: IResolvable) {
        cdkBuilder.copyTags(copyTags)
    }

    public fun createRule(createRule: IResolvable) {
        cdkBuilder.createRule(createRule)
    }

    public fun createRule(createRule: CfnLifecyclePolicy.CreateRuleProperty) {
        cdkBuilder.createRule(createRule)
    }

    public fun crossRegionCopyRules(vararg crossRegionCopyRules: Any) {
        _crossRegionCopyRules.addAll(listOf(*crossRegionCopyRules))
    }

    public fun crossRegionCopyRules(crossRegionCopyRules: Collection<Any>) {
        _crossRegionCopyRules.addAll(crossRegionCopyRules)
    }

    public fun crossRegionCopyRules(crossRegionCopyRules: IResolvable) {
        cdkBuilder.crossRegionCopyRules(crossRegionCopyRules)
    }

    public fun deprecateRule(deprecateRule: IResolvable) {
        cdkBuilder.deprecateRule(deprecateRule)
    }

    public fun deprecateRule(deprecateRule: CfnLifecyclePolicy.DeprecateRuleProperty) {
        cdkBuilder.deprecateRule(deprecateRule)
    }

    public fun fastRestoreRule(fastRestoreRule: IResolvable) {
        cdkBuilder.fastRestoreRule(fastRestoreRule)
    }

    public fun fastRestoreRule(fastRestoreRule: CfnLifecyclePolicy.FastRestoreRuleProperty) {
        cdkBuilder.fastRestoreRule(fastRestoreRule)
    }

    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    public fun retainRule(retainRule: IResolvable) {
        cdkBuilder.retainRule(retainRule)
    }

    public fun retainRule(retainRule: CfnLifecyclePolicy.RetainRuleProperty) {
        cdkBuilder.retainRule(retainRule)
    }

    public fun shareRules(vararg shareRules: Any) {
        _shareRules.addAll(listOf(*shareRules))
    }

    public fun shareRules(shareRules: Collection<Any>) {
        _shareRules.addAll(shareRules)
    }

    public fun shareRules(shareRules: IResolvable) {
        cdkBuilder.shareRules(shareRules)
    }

    public fun tagsToAdd(vararg tagsToAdd: Any) {
        _tagsToAdd.addAll(listOf(*tagsToAdd))
    }

    public fun tagsToAdd(tagsToAdd: Collection<Any>) {
        _tagsToAdd.addAll(tagsToAdd)
    }

    public fun tagsToAdd(tagsToAdd: IResolvable) {
        cdkBuilder.tagsToAdd(tagsToAdd)
    }

    public fun variableTags(vararg variableTags: Any) {
        _variableTags.addAll(listOf(*variableTags))
    }

    public fun variableTags(variableTags: Collection<Any>) {
        _variableTags.addAll(variableTags)
    }

    public fun variableTags(variableTags: IResolvable) {
        cdkBuilder.variableTags(variableTags)
    }

    public fun build(): CfnLifecyclePolicy.ScheduleProperty {
        if (_crossRegionCopyRules.isNotEmpty()) cdkBuilder.crossRegionCopyRules(_crossRegionCopyRules)
        if (_shareRules.isNotEmpty()) cdkBuilder.shareRules(_shareRules)
        if (_tagsToAdd.isNotEmpty()) cdkBuilder.tagsToAdd(_tagsToAdd)
        if (_variableTags.isNotEmpty()) cdkBuilder.variableTags(_variableTags)
        return cdkBuilder.build()
    }
}
