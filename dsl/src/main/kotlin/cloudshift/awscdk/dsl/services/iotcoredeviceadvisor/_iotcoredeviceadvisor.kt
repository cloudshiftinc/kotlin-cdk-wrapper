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

package cloudshift.awscdk.dsl.services.iotcoredeviceadvisor

import software.amazon.awscdk.services.iotcoredeviceadvisor.CfnSuiteDefinition
import software.amazon.awscdk.services.iotcoredeviceadvisor.CfnSuiteDefinitionProps
import software.constructs.Construct
import kotlin.String
import kotlin.Unit

public object iotcoredeviceadvisor {
    public inline fun cfnSuiteDefinition(
        scope: Construct,
        id: String,
        block: CfnSuiteDefinitionDsl.() -> Unit = {},
    ): CfnSuiteDefinition {
        val builder = CfnSuiteDefinitionDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnSuiteDefinitionDeviceUnderTestProperty(
        block: CfnSuiteDefinitionDeviceUnderTestPropertyDsl.() -> Unit =
            {},
    ): CfnSuiteDefinition.DeviceUnderTestProperty {
        val builder = CfnSuiteDefinitionDeviceUnderTestPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnSuiteDefinitionProps(block: CfnSuiteDefinitionPropsDsl.() -> Unit = {}): CfnSuiteDefinitionProps {
        val builder = CfnSuiteDefinitionPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnSuiteDefinitionSuiteDefinitionConfigurationProperty(
        block: CfnSuiteDefinitionSuiteDefinitionConfigurationPropertyDsl.() -> Unit =
            {},
    ): CfnSuiteDefinition.SuiteDefinitionConfigurationProperty {
        val builder = CfnSuiteDefinitionSuiteDefinitionConfigurationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }
}
