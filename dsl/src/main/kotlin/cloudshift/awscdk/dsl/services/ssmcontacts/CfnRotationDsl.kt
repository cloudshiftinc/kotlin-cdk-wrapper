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

package cloudshift.awscdk.dsl.services.ssmcontacts

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.dsl.CfnTagDsl
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.ssmcontacts.CfnRotation
import software.constructs.Construct
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList

@CdkDslMarker
public class CfnRotationDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnRotation.Builder = CfnRotation.Builder.create(scope, id)

    private val _contactIds: MutableList<String> = mutableListOf()

    private val _tags: MutableList<CfnTag> = mutableListOf()

    public fun contactIds(vararg contactIds: String) {
        _contactIds.addAll(listOf(*contactIds))
    }

    public fun contactIds(contactIds: Collection<String>) {
        _contactIds.addAll(contactIds)
    }

    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    public fun recurrence(recurrence: IResolvable) {
        cdkBuilder.recurrence(recurrence)
    }

    public fun recurrence(recurrence: CfnRotation.RecurrenceSettingsProperty) {
        cdkBuilder.recurrence(recurrence)
    }

    public fun startTime(startTime: String) {
        cdkBuilder.startTime(startTime)
    }

    public fun tags(tags: CfnTagDsl.() -> Unit) {
        _tags.add(CfnTagDsl().apply(tags).build())
    }

    public fun tags(tags: Collection<CfnTag>) {
        _tags.addAll(tags)
    }

    public fun timeZoneId(timeZoneId: String) {
        cdkBuilder.timeZoneId(timeZoneId)
    }

    public fun build(): CfnRotation {
        if (_contactIds.isNotEmpty()) cdkBuilder.contactIds(_contactIds)
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        return cdkBuilder.build()
    }
}
