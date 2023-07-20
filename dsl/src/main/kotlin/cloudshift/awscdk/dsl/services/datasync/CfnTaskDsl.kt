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

package cloudshift.awscdk.dsl.services.datasync

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.dsl.CfnTagDsl
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.datasync.CfnTask
import software.constructs.Construct
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList

@CdkDslMarker
public class CfnTaskDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnTask.Builder = CfnTask.Builder.create(scope, id)

    private val _excludes: MutableList<Any> = mutableListOf()

    private val _includes: MutableList<Any> = mutableListOf()

    private val _tags: MutableList<CfnTag> = mutableListOf()

    public fun cloudWatchLogGroupArn(cloudWatchLogGroupArn: String) {
        cdkBuilder.cloudWatchLogGroupArn(cloudWatchLogGroupArn)
    }

    public fun destinationLocationArn(destinationLocationArn: String) {
        cdkBuilder.destinationLocationArn(destinationLocationArn)
    }

    public fun excludes(vararg excludes: Any) {
        _excludes.addAll(listOf(*excludes))
    }

    public fun excludes(excludes: Collection<Any>) {
        _excludes.addAll(excludes)
    }

    public fun excludes(excludes: IResolvable) {
        cdkBuilder.excludes(excludes)
    }

    public fun includes(vararg includes: Any) {
        _includes.addAll(listOf(*includes))
    }

    public fun includes(includes: Collection<Any>) {
        _includes.addAll(includes)
    }

    public fun includes(includes: IResolvable) {
        cdkBuilder.includes(includes)
    }

    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    public fun options(options: IResolvable) {
        cdkBuilder.options(options)
    }

    public fun options(options: CfnTask.OptionsProperty) {
        cdkBuilder.options(options)
    }

    public fun schedule(schedule: IResolvable) {
        cdkBuilder.schedule(schedule)
    }

    public fun schedule(schedule: CfnTask.TaskScheduleProperty) {
        cdkBuilder.schedule(schedule)
    }

    public fun sourceLocationArn(sourceLocationArn: String) {
        cdkBuilder.sourceLocationArn(sourceLocationArn)
    }

    public fun tags(tags: CfnTagDsl.() -> Unit) {
        _tags.add(CfnTagDsl().apply(tags).build())
    }

    public fun tags(tags: Collection<CfnTag>) {
        _tags.addAll(tags)
    }

    public fun build(): CfnTask {
        if (_excludes.isNotEmpty()) cdkBuilder.excludes(_excludes)
        if (_includes.isNotEmpty()) cdkBuilder.includes(_includes)
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        return cdkBuilder.build()
    }
}
