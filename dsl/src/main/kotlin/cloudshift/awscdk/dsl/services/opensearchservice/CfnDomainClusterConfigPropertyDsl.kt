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

package cloudshift.awscdk.dsl.services.opensearchservice

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.opensearchservice.CfnDomain
import kotlin.Boolean
import kotlin.Number
import kotlin.String

@CdkDslMarker
public class CfnDomainClusterConfigPropertyDsl {
    private val cdkBuilder: CfnDomain.ClusterConfigProperty.Builder =
        CfnDomain.ClusterConfigProperty.builder()

    public fun dedicatedMasterCount(dedicatedMasterCount: Number) {
        cdkBuilder.dedicatedMasterCount(dedicatedMasterCount)
    }

    public fun dedicatedMasterEnabled(dedicatedMasterEnabled: Boolean) {
        cdkBuilder.dedicatedMasterEnabled(dedicatedMasterEnabled)
    }

    public fun dedicatedMasterEnabled(dedicatedMasterEnabled: IResolvable) {
        cdkBuilder.dedicatedMasterEnabled(dedicatedMasterEnabled)
    }

    public fun dedicatedMasterType(dedicatedMasterType: String) {
        cdkBuilder.dedicatedMasterType(dedicatedMasterType)
    }

    public fun instanceCount(instanceCount: Number) {
        cdkBuilder.instanceCount(instanceCount)
    }

    public fun instanceType(instanceType: String) {
        cdkBuilder.instanceType(instanceType)
    }

    public fun multiAzWithStandbyEnabled(multiAzWithStandbyEnabled: Boolean) {
        cdkBuilder.multiAzWithStandbyEnabled(multiAzWithStandbyEnabled)
    }

    public fun multiAzWithStandbyEnabled(multiAzWithStandbyEnabled: IResolvable) {
        cdkBuilder.multiAzWithStandbyEnabled(multiAzWithStandbyEnabled)
    }

    public fun warmCount(warmCount: Number) {
        cdkBuilder.warmCount(warmCount)
    }

    public fun warmEnabled(warmEnabled: Boolean) {
        cdkBuilder.warmEnabled(warmEnabled)
    }

    public fun warmEnabled(warmEnabled: IResolvable) {
        cdkBuilder.warmEnabled(warmEnabled)
    }

    public fun warmType(warmType: String) {
        cdkBuilder.warmType(warmType)
    }

    public fun zoneAwarenessConfig(zoneAwarenessConfig: IResolvable) {
        cdkBuilder.zoneAwarenessConfig(zoneAwarenessConfig)
    }

    public fun zoneAwarenessConfig(zoneAwarenessConfig: CfnDomain.ZoneAwarenessConfigProperty) {
        cdkBuilder.zoneAwarenessConfig(zoneAwarenessConfig)
    }

    public fun zoneAwarenessEnabled(zoneAwarenessEnabled: Boolean) {
        cdkBuilder.zoneAwarenessEnabled(zoneAwarenessEnabled)
    }

    public fun zoneAwarenessEnabled(zoneAwarenessEnabled: IResolvable) {
        cdkBuilder.zoneAwarenessEnabled(zoneAwarenessEnabled)
    }

    public fun build(): CfnDomain.ClusterConfigProperty = cdkBuilder.build()
}
