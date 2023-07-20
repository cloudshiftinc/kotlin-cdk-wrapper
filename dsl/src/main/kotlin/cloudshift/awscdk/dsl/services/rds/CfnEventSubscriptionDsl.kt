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

package cloudshift.awscdk.dsl.services.rds

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.dsl.CfnTagDsl
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.rds.CfnEventSubscription
import software.constructs.Construct
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList

@CdkDslMarker
public class CfnEventSubscriptionDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnEventSubscription.Builder = CfnEventSubscription.Builder.create(
        scope,
        id,
    )

    private val _eventCategories: MutableList<String> = mutableListOf()

    private val _sourceIds: MutableList<String> = mutableListOf()

    private val _tags: MutableList<CfnTag> = mutableListOf()

    public fun enabled(enabled: Boolean) {
        cdkBuilder.enabled(enabled)
    }

    public fun enabled(enabled: IResolvable) {
        cdkBuilder.enabled(enabled)
    }

    public fun eventCategories(vararg eventCategories: String) {
        _eventCategories.addAll(listOf(*eventCategories))
    }

    public fun eventCategories(eventCategories: Collection<String>) {
        _eventCategories.addAll(eventCategories)
    }

    public fun snsTopicArn(snsTopicArn: String) {
        cdkBuilder.snsTopicArn(snsTopicArn)
    }

    public fun sourceIds(vararg sourceIds: String) {
        _sourceIds.addAll(listOf(*sourceIds))
    }

    public fun sourceIds(sourceIds: Collection<String>) {
        _sourceIds.addAll(sourceIds)
    }

    public fun sourceType(sourceType: String) {
        cdkBuilder.sourceType(sourceType)
    }

    public fun subscriptionName(subscriptionName: String) {
        cdkBuilder.subscriptionName(subscriptionName)
    }

    public fun tags(tags: CfnTagDsl.() -> Unit) {
        _tags.add(CfnTagDsl().apply(tags).build())
    }

    public fun tags(tags: Collection<CfnTag>) {
        _tags.addAll(tags)
    }

    public fun build(): CfnEventSubscription {
        if (_eventCategories.isNotEmpty()) cdkBuilder.eventCategories(_eventCategories)
        if (_sourceIds.isNotEmpty()) cdkBuilder.sourceIds(_sourceIds)
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        return cdkBuilder.build()
    }
}
