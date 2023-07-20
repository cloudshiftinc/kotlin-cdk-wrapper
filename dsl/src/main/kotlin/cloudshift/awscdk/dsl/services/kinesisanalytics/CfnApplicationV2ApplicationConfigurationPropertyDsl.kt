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

package cloudshift.awscdk.dsl.services.kinesisanalytics

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2
import kotlin.Any
import kotlin.collections.Collection
import kotlin.collections.MutableList

@CdkDslMarker
public class CfnApplicationV2ApplicationConfigurationPropertyDsl {
    private val cdkBuilder: CfnApplicationV2.ApplicationConfigurationProperty.Builder =
        CfnApplicationV2.ApplicationConfigurationProperty.builder()

    private val _vpcConfigurations: MutableList<Any> = mutableListOf()

    public fun applicationCodeConfiguration(applicationCodeConfiguration: IResolvable) {
        cdkBuilder.applicationCodeConfiguration(applicationCodeConfiguration)
    }

    public fun applicationCodeConfiguration(applicationCodeConfiguration: CfnApplicationV2.ApplicationCodeConfigurationProperty) {
        cdkBuilder.applicationCodeConfiguration(applicationCodeConfiguration)
    }

    public fun applicationSnapshotConfiguration(applicationSnapshotConfiguration: IResolvable) {
        cdkBuilder.applicationSnapshotConfiguration(applicationSnapshotConfiguration)
    }

    public fun applicationSnapshotConfiguration(applicationSnapshotConfiguration: CfnApplicationV2.ApplicationSnapshotConfigurationProperty) {
        cdkBuilder.applicationSnapshotConfiguration(applicationSnapshotConfiguration)
    }

    public fun environmentProperties(environmentProperties: IResolvable) {
        cdkBuilder.environmentProperties(environmentProperties)
    }

    public fun environmentProperties(environmentProperties: CfnApplicationV2.EnvironmentPropertiesProperty) {
        cdkBuilder.environmentProperties(environmentProperties)
    }

    public fun flinkApplicationConfiguration(flinkApplicationConfiguration: IResolvable) {
        cdkBuilder.flinkApplicationConfiguration(flinkApplicationConfiguration)
    }

    public fun flinkApplicationConfiguration(flinkApplicationConfiguration: CfnApplicationV2.FlinkApplicationConfigurationProperty) {
        cdkBuilder.flinkApplicationConfiguration(flinkApplicationConfiguration)
    }

    public fun sqlApplicationConfiguration(sqlApplicationConfiguration: IResolvable) {
        cdkBuilder.sqlApplicationConfiguration(sqlApplicationConfiguration)
    }

    public fun sqlApplicationConfiguration(sqlApplicationConfiguration: CfnApplicationV2.SqlApplicationConfigurationProperty) {
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

    public fun zeppelinApplicationConfiguration(zeppelinApplicationConfiguration: CfnApplicationV2.ZeppelinApplicationConfigurationProperty) {
        cdkBuilder.zeppelinApplicationConfiguration(zeppelinApplicationConfiguration)
    }

    public fun build(): CfnApplicationV2.ApplicationConfigurationProperty {
        if (_vpcConfigurations.isNotEmpty()) cdkBuilder.vpcConfigurations(_vpcConfigurations)
        return cdkBuilder.build()
    }
}
