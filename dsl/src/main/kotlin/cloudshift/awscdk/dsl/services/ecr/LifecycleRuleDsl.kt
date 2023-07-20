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

package cloudshift.awscdk.dsl.services.ecr

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.Duration
import software.amazon.awscdk.services.ecr.LifecycleRule
import software.amazon.awscdk.services.ecr.TagStatus
import kotlin.Number
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList

@CdkDslMarker
public class LifecycleRuleDsl {
    private val cdkBuilder: LifecycleRule.Builder = LifecycleRule.builder()

    private val _tagPrefixList: MutableList<String> = mutableListOf()

    public fun description(description: String) {
        cdkBuilder.description(description)
    }

    public fun maxImageAge(maxImageAge: Duration) {
        cdkBuilder.maxImageAge(maxImageAge)
    }

    public fun maxImageCount(maxImageCount: Number) {
        cdkBuilder.maxImageCount(maxImageCount)
    }

    public fun rulePriority(rulePriority: Number) {
        cdkBuilder.rulePriority(rulePriority)
    }

    public fun tagPrefixList(vararg tagPrefixList: String) {
        _tagPrefixList.addAll(listOf(*tagPrefixList))
    }

    public fun tagPrefixList(tagPrefixList: Collection<String>) {
        _tagPrefixList.addAll(tagPrefixList)
    }

    public fun tagStatus(tagStatus: TagStatus) {
        cdkBuilder.tagStatus(tagStatus)
    }

    public fun build(): LifecycleRule {
        if (_tagPrefixList.isNotEmpty()) cdkBuilder.tagPrefixList(_tagPrefixList)
        return cdkBuilder.build()
    }
}
