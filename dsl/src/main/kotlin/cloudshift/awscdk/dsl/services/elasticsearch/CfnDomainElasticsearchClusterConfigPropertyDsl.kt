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

package cloudshift.awscdk.dsl.services.elasticsearch

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.elasticsearch.CfnDomain
import kotlin.Boolean
import kotlin.Number
import kotlin.String

@CdkDslMarker
public class CfnDomainElasticsearchClusterConfigPropertyDsl {
    private val cdkBuilder: CfnDomain.ElasticsearchClusterConfigProperty.Builder =
        CfnDomain.ElasticsearchClusterConfigProperty.builder()

    public fun coldStorageOptions(coldStorageOptions: IResolvable) {
        cdkBuilder.coldStorageOptions(coldStorageOptions)
    }

    public fun coldStorageOptions(coldStorageOptions: CfnDomain.ColdStorageOptionsProperty) {
        cdkBuilder.coldStorageOptions(coldStorageOptions)
    }

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

    public fun build(): CfnDomain.ElasticsearchClusterConfigProperty = cdkBuilder.build()
}
