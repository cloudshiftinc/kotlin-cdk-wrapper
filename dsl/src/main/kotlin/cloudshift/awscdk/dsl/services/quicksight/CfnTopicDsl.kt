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

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnTopic
import software.constructs.Construct
import kotlin.Any
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList

@CdkDslMarker
public class CfnTopicDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnTopic.Builder = CfnTopic.Builder.create(scope, id)

    private val _dataSets: MutableList<Any> = mutableListOf()

    public fun awsAccountId(awsAccountId: String) {
        cdkBuilder.awsAccountId(awsAccountId)
    }

    public fun dataSets(vararg dataSets: Any) {
        _dataSets.addAll(listOf(*dataSets))
    }

    public fun dataSets(dataSets: Collection<Any>) {
        _dataSets.addAll(dataSets)
    }

    public fun dataSets(dataSets: IResolvable) {
        cdkBuilder.dataSets(dataSets)
    }

    public fun description(description: String) {
        cdkBuilder.description(description)
    }

    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    public fun topicId(topicId: String) {
        cdkBuilder.topicId(topicId)
    }

    public fun build(): CfnTopic {
        if (_dataSets.isNotEmpty()) cdkBuilder.dataSets(_dataSets)
        return cdkBuilder.build()
    }
}
