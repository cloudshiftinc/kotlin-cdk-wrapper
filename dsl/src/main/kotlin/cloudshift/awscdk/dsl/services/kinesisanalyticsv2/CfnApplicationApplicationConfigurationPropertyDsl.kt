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

package cloudshift.awscdk.dsl.services.kinesisanalyticsv2

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.kinesisanalyticsv2.CfnApplication
import kotlin.Any
import kotlin.collections.Collection
import kotlin.collections.MutableList

@CdkDslMarker
public class CfnApplicationApplicationConfigurationPropertyDsl {
    private val cdkBuilder: CfnApplication.ApplicationConfigurationProperty.Builder =
        CfnApplication.ApplicationConfigurationProperty.builder()

    private val _vpcConfigurations: MutableList<Any> = mutableListOf()

    public fun applicationCodeConfiguration(applicationCodeConfiguration: IResolvable) {
        cdkBuilder.applicationCodeConfiguration(applicationCodeConfiguration)
    }

    public fun applicationCodeConfiguration(applicationCodeConfiguration: CfnApplication.ApplicationCodeConfigurationProperty) {
        cdkBuilder.applicationCodeConfiguration(applicationCodeConfiguration)
    }

    public fun applicationSnapshotConfiguration(applicationSnapshotConfiguration: IResolvable) {
        cdkBuilder.applicationSnapshotConfiguration(applicationSnapshotConfiguration)
    }

    public fun applicationSnapshotConfiguration(applicationSnapshotConfiguration: CfnApplication.ApplicationSnapshotConfigurationProperty) {
        cdkBuilder.applicationSnapshotConfiguration(applicationSnapshotConfiguration)
    }

    public fun environmentProperties(environmentProperties: IResolvable) {
        cdkBuilder.environmentProperties(environmentProperties)
    }

    public fun environmentProperties(environmentProperties: CfnApplication.EnvironmentPropertiesProperty) {
        cdkBuilder.environmentProperties(environmentProperties)
    }

    public fun flinkApplicationConfiguration(flinkApplicationConfiguration: IResolvable) {
        cdkBuilder.flinkApplicationConfiguration(flinkApplicationConfiguration)
    }

    public fun flinkApplicationConfiguration(flinkApplicationConfiguration: CfnApplication.FlinkApplicationConfigurationProperty) {
        cdkBuilder.flinkApplicationConfiguration(flinkApplicationConfiguration)
    }

    public fun sqlApplicationConfiguration(sqlApplicationConfiguration: IResolvable) {
        cdkBuilder.sqlApplicationConfiguration(sqlApplicationConfiguration)
    }

    public fun sqlApplicationConfiguration(sqlApplicationConfiguration: CfnApplication.SqlApplicationConfigurationProperty) {
        cdkBuilder.sqlApplicationConfiguration(sqlApplicationConfiguration)
    }

    public fun vpcConfigurations(vararg vpcConfigurations: Any) {
        _vpcConfigurations.addAll(listOf(*vpcConfigurations))
    }

    public fun vpcConfigurations(vpcConfigurations: Collection<Any>) {
        _vpcConfigurations.addAll(vpcConfigurations)
    }

    public fun vpcConfigurations(vpcConfigurations: IResolvable) {
        cdkBuilder.vpcConfigurations(vpcConfigurations)
    }

    public fun zeppelinApplicationConfiguration(zeppelinApplicationConfiguration: IResolvable) {
        cdkBuilder.zeppelinApplicationConfiguration(zeppelinApplicationConfiguration)
    }

    public fun zeppelinApplicationConfiguration(zeppelinApplicationConfiguration: CfnApplication.ZeppelinApplicationConfigurationProperty) {
        cdkBuilder.zeppelinApplicationConfiguration(zeppelinApplicationConfiguration)
    }

    public fun build(): CfnApplication.ApplicationConfigurationProperty {
        if (_vpcConfigurations.isNotEmpty()) cdkBuilder.vpcConfigurations(_vpcConfigurations)
        return cdkBuilder.build()
    }
}
