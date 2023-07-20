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

package cloudshift.awscdk.dsl.services.lookoutmetrics

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.lookoutmetrics.CfnAnomalyDetector
import software.amazon.awscdk.services.lookoutmetrics.CfnAnomalyDetectorProps
import kotlin.Any
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList

@CdkDslMarker
public class CfnAnomalyDetectorPropsDsl {
    private val cdkBuilder: CfnAnomalyDetectorProps.Builder = CfnAnomalyDetectorProps.builder()

    private val _metricSetList: MutableList<Any> = mutableListOf()

    public fun anomalyDetectorConfig(anomalyDetectorConfig: IResolvable) {
        cdkBuilder.anomalyDetectorConfig(anomalyDetectorConfig)
    }

    public fun anomalyDetectorConfig(anomalyDetectorConfig: CfnAnomalyDetector.AnomalyDetectorConfigProperty) {
        cdkBuilder.anomalyDetectorConfig(anomalyDetectorConfig)
    }

    public fun anomalyDetectorDescription(anomalyDetectorDescription: String) {
        cdkBuilder.anomalyDetectorDescription(anomalyDetectorDescription)
    }

    public fun anomalyDetectorName(anomalyDetectorName: String) {
        cdkBuilder.anomalyDetectorName(anomalyDetectorName)
    }

    public fun kmsKeyArn(kmsKeyArn: String) {
        cdkBuilder.kmsKeyArn(kmsKeyArn)
    }

    public fun metricSetList(vararg metricSetList: Any) {
        _metricSetList.addAll(listOf(*metricSetList))
    }

    public fun metricSetList(metricSetList: Collection<Any>) {
        _metricSetList.addAll(metricSetList)
    }

    public fun metricSetList(metricSetList: IResolvable) {
        cdkBuilder.metricSetList(metricSetList)
    }

    public fun build(): CfnAnomalyDetectorProps {
        if (_metricSetList.isNotEmpty()) cdkBuilder.metricSetList(_metricSetList)
        return cdkBuilder.build()
    }
}
