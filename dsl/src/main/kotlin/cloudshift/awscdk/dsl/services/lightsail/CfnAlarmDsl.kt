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

package cloudshift.awscdk.dsl.services.lightsail

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.lightsail.CfnAlarm
import software.constructs.Construct
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList

@CdkDslMarker
public class CfnAlarmDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnAlarm.Builder = CfnAlarm.Builder.create(scope, id)

    private val _contactProtocols: MutableList<String> = mutableListOf()

    private val _notificationTriggers: MutableList<String> = mutableListOf()

    public fun alarmName(alarmName: String) {
        cdkBuilder.alarmName(alarmName)
    }

    public fun comparisonOperator(comparisonOperator: String) {
        cdkBuilder.comparisonOperator(comparisonOperator)
    }

    public fun contactProtocols(vararg contactProtocols: String) {
        _contactProtocols.addAll(listOf(*contactProtocols))
    }

    public fun contactProtocols(contactProtocols: Collection<String>) {
        _contactProtocols.addAll(contactProtocols)
    }

    public fun datapointsToAlarm(datapointsToAlarm: Number) {
        cdkBuilder.datapointsToAlarm(datapointsToAlarm)
    }

    public fun evaluationPeriods(evaluationPeriods: Number) {
        cdkBuilder.evaluationPeriods(evaluationPeriods)
    }

    public fun metricName(metricName: String) {
        cdkBuilder.metricName(metricName)
    }

    public fun monitoredResourceName(monitoredResourceName: String) {
        cdkBuilder.monitoredResourceName(monitoredResourceName)
    }

    public fun notificationEnabled(notificationEnabled: Boolean) {
        cdkBuilder.notificationEnabled(notificationEnabled)
    }

    public fun notificationEnabled(notificationEnabled: IResolvable) {
        cdkBuilder.notificationEnabled(notificationEnabled)
    }

    public fun notificationTriggers(vararg notificationTriggers: String) {
        _notificationTriggers.addAll(listOf(*notificationTriggers))
    }

    public fun notificationTriggers(notificationTriggers: Collection<String>) {
        _notificationTriggers.addAll(notificationTriggers)
    }

    public fun threshold(threshold: Number) {
        cdkBuilder.threshold(threshold)
    }

    public fun treatMissingData(treatMissingData: String) {
        cdkBuilder.treatMissingData(treatMissingData)
    }

    public fun build(): CfnAlarm {
        if (_contactProtocols.isNotEmpty()) cdkBuilder.contactProtocols(_contactProtocols)
        if (_notificationTriggers.isNotEmpty()) cdkBuilder.notificationTriggers(_notificationTriggers)
        return cdkBuilder.build()
    }
}
