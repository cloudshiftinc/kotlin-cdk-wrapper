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

package cloudshift.awscdk.dsl.services.route53

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.route53.CfnRecordSet
import software.amazon.awscdk.services.route53.CfnRecordSetProps
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList

@CdkDslMarker
public class CfnRecordSetPropsDsl {
    private val cdkBuilder: CfnRecordSetProps.Builder = CfnRecordSetProps.builder()

    private val _resourceRecords: MutableList<String> = mutableListOf()

    public fun aliasTarget(aliasTarget: IResolvable) {
        cdkBuilder.aliasTarget(aliasTarget)
    }

    public fun aliasTarget(aliasTarget: CfnRecordSet.AliasTargetProperty) {
        cdkBuilder.aliasTarget(aliasTarget)
    }

    public fun cidrRoutingConfig(cidrRoutingConfig: IResolvable) {
        cdkBuilder.cidrRoutingConfig(cidrRoutingConfig)
    }

    public fun cidrRoutingConfig(cidrRoutingConfig: CfnRecordSet.CidrRoutingConfigProperty) {
        cdkBuilder.cidrRoutingConfig(cidrRoutingConfig)
    }

    public fun comment(comment: String) {
        cdkBuilder.comment(comment)
    }

    public fun failover(failover: String) {
        cdkBuilder.failover(failover)
    }

    public fun geoLocation(geoLocation: IResolvable) {
        cdkBuilder.geoLocation(geoLocation)
    }

    public fun geoLocation(geoLocation: CfnRecordSet.GeoLocationProperty) {
        cdkBuilder.geoLocation(geoLocation)
    }

    public fun healthCheckId(healthCheckId: String) {
        cdkBuilder.healthCheckId(healthCheckId)
    }

    public fun hostedZoneId(hostedZoneId: String) {
        cdkBuilder.hostedZoneId(hostedZoneId)
    }

    public fun hostedZoneName(hostedZoneName: String) {
        cdkBuilder.hostedZoneName(hostedZoneName)
    }

    public fun multiValueAnswer(multiValueAnswer: Boolean) {
        cdkBuilder.multiValueAnswer(multiValueAnswer)
    }

    public fun multiValueAnswer(multiValueAnswer: IResolvable) {
        cdkBuilder.multiValueAnswer(multiValueAnswer)
    }

    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    public fun region(region: String) {
        cdkBuilder.region(region)
    }

    public fun resourceRecords(vararg resourceRecords: String) {
        _resourceRecords.addAll(listOf(*resourceRecords))
    }

    public fun resourceRecords(resourceRecords: Collection<String>) {
        _resourceRecords.addAll(resourceRecords)
    }

    public fun setIdentifier(setIdentifier: String) {
        cdkBuilder.setIdentifier(setIdentifier)
    }

    public fun ttl(ttl: String) {
        cdkBuilder.ttl(ttl)
    }

    public fun type(type: String) {
        cdkBuilder.type(type)
    }

    public fun weight(weight: Number) {
        cdkBuilder.weight(weight)
    }

    public fun build(): CfnRecordSetProps {
        if (_resourceRecords.isNotEmpty()) cdkBuilder.resourceRecords(_resourceRecords)
        return cdkBuilder.build()
    }
}
