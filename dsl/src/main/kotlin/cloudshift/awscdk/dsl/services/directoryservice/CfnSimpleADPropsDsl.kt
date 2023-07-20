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

package cloudshift.awscdk.dsl.services.directoryservice

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.directoryservice.CfnSimpleAD
import software.amazon.awscdk.services.directoryservice.CfnSimpleADProps
import kotlin.Boolean
import kotlin.String

@CdkDslMarker
public class CfnSimpleADPropsDsl {
    private val cdkBuilder: CfnSimpleADProps.Builder = CfnSimpleADProps.builder()

    public fun createAlias(createAlias: Boolean) {
        cdkBuilder.createAlias(createAlias)
    }

    public fun createAlias(createAlias: IResolvable) {
        cdkBuilder.createAlias(createAlias)
    }

    public fun description(description: String) {
        cdkBuilder.description(description)
    }

    public fun enableSso(enableSso: Boolean) {
        cdkBuilder.enableSso(enableSso)
    }

    public fun enableSso(enableSso: IResolvable) {
        cdkBuilder.enableSso(enableSso)
    }

    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    public fun password(password: String) {
        cdkBuilder.password(password)
    }

    public fun shortName(shortName: String) {
        cdkBuilder.shortName(shortName)
    }

    public fun size(size: String) {
        cdkBuilder.size(size)
    }

    public fun vpcSettings(vpcSettings: IResolvable) {
        cdkBuilder.vpcSettings(vpcSettings)
    }

    public fun vpcSettings(vpcSettings: CfnSimpleAD.VpcSettingsProperty) {
        cdkBuilder.vpcSettings(vpcSettings)
    }

    public fun build(): CfnSimpleADProps = cdkBuilder.build()
}
