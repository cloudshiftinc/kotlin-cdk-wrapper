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
import software.amazon.awscdk.services.frauddetector.CfnEventType
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList

@CdkDslMarker
public class CfnEventTypeEventVariablePropertyDsl {
    private val cdkBuilder: CfnEventType.EventVariableProperty.Builder =
        CfnEventType.EventVariableProperty.builder()

    private val _tags: MutableList<CfnTag> = mutableListOf()

    public fun arn(arn: String) {
        cdkBuilder.arn(arn)
    }

    public fun createdTime(createdTime: String) {
        cdkBuilder.createdTime(createdTime)
    }

    public fun dataSource(dataSource: String) {
        cdkBuilder.dataSource(dataSource)
    }

    public fun dataType(dataType: String) {
        cdkBuilder.dataType(dataType)
    }

    public fun defaultValue(defaultValue: String) {
        cdkBuilder.defaultValue(defaultValue)
    }

    public fun description(description: String) {
        cdkBuilder.description(description)
    }

    public fun `inline`(`inline`: Boolean) {
        cdkBuilder.`inline`(`inline`)
    }

    public fun `inline`(`inline`: IResolvable) {
        cdkBuilder.`inline`(`inline`)
    }

    public fun lastUpdatedTime(lastUpdatedTime: String) {
        cdkBuilder.lastUpdatedTime(lastUpdatedTime)
    }

    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    public fun tags(tags: CfnTagDsl.() -> Unit) {
        _tags.add(CfnTagDsl().apply(tags).build())
    }

    public fun tags(tags: Collection<CfnTag>) {
        _tags.addAll(tags)
    }

    public fun variableType(variableType: String) {
        cdkBuilder.variableType(variableType)
    }

    public fun build(): CfnEventType.EventVariableProperty {
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        return cdkBuilder.build()
    }
}
