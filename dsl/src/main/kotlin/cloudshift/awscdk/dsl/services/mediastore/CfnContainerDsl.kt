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

package cloudshift.awscdk.dsl.services.mediastore

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.dsl.CfnTagDsl
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.mediastore.CfnContainer
import software.constructs.Construct
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList

@CdkDslMarker
public class CfnContainerDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnContainer.Builder = CfnContainer.Builder.create(scope, id)

    private val _corsPolicy: MutableList<Any> = mutableListOf()

    private val _tags: MutableList<CfnTag> = mutableListOf()

    public fun accessLoggingEnabled(accessLoggingEnabled: Boolean) {
        cdkBuilder.accessLoggingEnabled(accessLoggingEnabled)
    }

    public fun accessLoggingEnabled(accessLoggingEnabled: IResolvable) {
        cdkBuilder.accessLoggingEnabled(accessLoggingEnabled)
    }

    public fun containerName(containerName: String) {
        cdkBuilder.containerName(containerName)
    }

    public fun corsPolicy(vararg corsPolicy: Any) {
        _corsPolicy.addAll(listOf(*corsPolicy))
    }

    public fun corsPolicy(corsPolicy: Collection<Any>) {
        _corsPolicy.addAll(corsPolicy)
    }

    public fun corsPolicy(corsPolicy: IResolvable) {
        cdkBuilder.corsPolicy(corsPolicy)
    }

    public fun lifecyclePolicy(lifecyclePolicy: String) {
        cdkBuilder.lifecyclePolicy(lifecyclePolicy)
    }

    public fun metricPolicy(metricPolicy: IResolvable) {
        cdkBuilder.metricPolicy(metricPolicy)
    }

    public fun metricPolicy(metricPolicy: CfnContainer.MetricPolicyProperty) {
        cdkBuilder.metricPolicy(metricPolicy)
    }

    public fun policy(policy: String) {
        cdkBuilder.policy(policy)
    }

    public fun tags(tags: CfnTagDsl.() -> Unit) {
        _tags.add(CfnTagDsl().apply(tags).build())
    }

    public fun tags(tags: Collection<CfnTag>) {
        _tags.addAll(tags)
    }

    public fun build(): CfnContainer {
        if (_corsPolicy.isNotEmpty()) cdkBuilder.corsPolicy(_corsPolicy)
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        return cdkBuilder.build()
    }
}
