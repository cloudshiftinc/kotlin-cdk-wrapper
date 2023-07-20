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

package cloudshift.awscdk.dsl.services.evidently

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.dsl.CfnTagDsl
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.evidently.CfnExperiment
import software.amazon.awscdk.services.evidently.CfnExperimentProps
import kotlin.Any
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList

@CdkDslMarker
public class CfnExperimentPropsDsl {
    private val cdkBuilder: CfnExperimentProps.Builder = CfnExperimentProps.builder()

    private val _metricGoals: MutableList<Any> = mutableListOf()

    private val _tags: MutableList<CfnTag> = mutableListOf()

    private val _treatments: MutableList<Any> = mutableListOf()

    public fun description(description: String) {
        cdkBuilder.description(description)
    }

    public fun metricGoals(vararg metricGoals: Any) {
        _metricGoals.addAll(listOf(*metricGoals))
    }

    public fun metricGoals(metricGoals: Collection<Any>) {
        _metricGoals.addAll(metricGoals)
    }

    public fun metricGoals(metricGoals: IResolvable) {
        cdkBuilder.metricGoals(metricGoals)
    }

    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    public fun onlineAbConfig(onlineAbConfig: IResolvable) {
        cdkBuilder.onlineAbConfig(onlineAbConfig)
    }

    public fun onlineAbConfig(onlineAbConfig: CfnExperiment.OnlineAbConfigObjectProperty) {
        cdkBuilder.onlineAbConfig(onlineAbConfig)
    }

    public fun project(project: String) {
        cdkBuilder.project(project)
    }

    public fun randomizationSalt(randomizationSalt: String) {
        cdkBuilder.randomizationSalt(randomizationSalt)
    }

    public fun removeSegment(removeSegment: Boolean) {
        cdkBuilder.removeSegment(removeSegment)
    }

    public fun removeSegment(removeSegment: IResolvable) {
        cdkBuilder.removeSegment(removeSegment)
    }

    public fun runningStatus(runningStatus: IResolvable) {
        cdkBuilder.runningStatus(runningStatus)
    }

    public fun runningStatus(runningStatus: CfnExperiment.RunningStatusObjectProperty) {
        cdkBuilder.runningStatus(runningStatus)
    }

    public fun samplingRate(samplingRate: Number) {
        cdkBuilder.samplingRate(samplingRate)
    }

    public fun segment(segment: String) {
        cdkBuilder.segment(segment)
    }

    public fun tags(tags: CfnTagDsl.() -> Unit) {
        _tags.add(CfnTagDsl().apply(tags).build())
    }

    public fun tags(tags: Collection<CfnTag>) {
        _tags.addAll(tags)
    }

    public fun treatments(vararg treatments: Any) {
        _treatments.addAll(listOf(*treatments))
    }

    public fun treatments(treatments: Collection<Any>) {
        _treatments.addAll(treatments)
    }

    public fun treatments(treatments: IResolvable) {
        cdkBuilder.treatments(treatments)
    }

    public fun build(): CfnExperimentProps {
        if (_metricGoals.isNotEmpty()) cdkBuilder.metricGoals(_metricGoals)
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        if (_treatments.isNotEmpty()) cdkBuilder.treatments(_treatments)
        return cdkBuilder.build()
    }
}
