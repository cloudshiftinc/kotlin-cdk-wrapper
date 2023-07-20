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

package cloudshift.awscdk.dsl.services.accessanalyzer

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.dsl.CfnTagDsl
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.accessanalyzer.CfnAnalyzerProps
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList

@CdkDslMarker
public class CfnAnalyzerPropsDsl {
    private val cdkBuilder: CfnAnalyzerProps.Builder = CfnAnalyzerProps.builder()

    private val _archiveRules: MutableList<Any> = mutableListOf()

    private val _tags: MutableList<CfnTag> = mutableListOf()

    public fun analyzerName(analyzerName: String) {
        cdkBuilder.analyzerName(analyzerName)
    }

    public fun archiveRules(vararg archiveRules: Any) {
        _archiveRules.addAll(listOf(*archiveRules))
    }

    public fun archiveRules(archiveRules: Collection<Any>) {
        _archiveRules.addAll(archiveRules)
    }

    public fun archiveRules(archiveRules: IResolvable) {
        cdkBuilder.archiveRules(archiveRules)
    }

    public fun tags(tags: CfnTagDsl.() -> Unit) {
        _tags.add(CfnTagDsl().apply(tags).build())
    }

    public fun tags(tags: Collection<CfnTag>) {
        _tags.addAll(tags)
    }

    public fun type(type: String) {
        cdkBuilder.type(type)
    }

    public fun build(): CfnAnalyzerProps {
        if (_archiveRules.isNotEmpty()) cdkBuilder.archiveRules(_archiveRules)
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        return cdkBuilder.build()
    }
}
