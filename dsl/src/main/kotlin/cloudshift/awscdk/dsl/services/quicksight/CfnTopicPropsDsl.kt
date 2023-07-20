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
import software.amazon.awscdk.services.quicksight.CfnTopicProps
import kotlin.Any
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList

@CdkDslMarker
public class CfnTopicPropsDsl {
    private val cdkBuilder: CfnTopicProps.Builder = CfnTopicProps.builder()

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

    public fun build(): CfnTopicProps {
        if (_dataSets.isNotEmpty()) cdkBuilder.dataSets(_dataSets)
        return cdkBuilder.build()
    }
}
