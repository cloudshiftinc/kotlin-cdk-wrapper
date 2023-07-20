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

package cloudshift.awscdk.dsl.services.rds

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.rds.CfnOptionGroup
import kotlin.Any
import kotlin.Number
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList

@CdkDslMarker
public class CfnOptionGroupOptionConfigurationPropertyDsl {
    private val cdkBuilder: CfnOptionGroup.OptionConfigurationProperty.Builder =
        CfnOptionGroup.OptionConfigurationProperty.builder()

    private val _dbSecurityGroupMemberships: MutableList<String> = mutableListOf()

    private val _optionSettings: MutableList<Any> = mutableListOf()

    private val _vpcSecurityGroupMemberships: MutableList<String> = mutableListOf()

    public fun dbSecurityGroupMemberships(vararg dbSecurityGroupMemberships: String) {
        _dbSecurityGroupMemberships.addAll(listOf(*dbSecurityGroupMemberships))
    }

    public fun dbSecurityGroupMemberships(dbSecurityGroupMemberships: Collection<String>) {
        _dbSecurityGroupMemberships.addAll(dbSecurityGroupMemberships)
    }

    public fun optionName(optionName: String) {
        cdkBuilder.optionName(optionName)
    }

    public fun optionSettings(vararg optionSettings: Any) {
        _optionSettings.addAll(listOf(*optionSettings))
    }

    public fun optionSettings(optionSettings: Collection<Any>) {
        _optionSettings.addAll(optionSettings)
    }

    public fun optionSettings(optionSettings: IResolvable) {
        cdkBuilder.optionSettings(optionSettings)
    }

    public fun optionVersion(optionVersion: String) {
        cdkBuilder.optionVersion(optionVersion)
    }

    public fun port(port: Number) {
        cdkBuilder.port(port)
    }

    public fun vpcSecurityGroupMemberships(vararg vpcSecurityGroupMemberships: String) {
        _vpcSecurityGroupMemberships.addAll(listOf(*vpcSecurityGroupMemberships))
    }

    public fun vpcSecurityGroupMemberships(vpcSecurityGroupMemberships: Collection<String>) {
        _vpcSecurityGroupMemberships.addAll(vpcSecurityGroupMemberships)
    }

    public fun build(): CfnOptionGroup.OptionConfigurationProperty {
        if (_dbSecurityGroupMemberships.isNotEmpty()) {
            cdkBuilder.dbSecurityGroupMemberships(_dbSecurityGroupMemberships)
        }
        if (_optionSettings.isNotEmpty()) cdkBuilder.optionSettings(_optionSettings)
        if (_vpcSecurityGroupMemberships.isNotEmpty()) {
            cdkBuilder.vpcSecurityGroupMemberships(_vpcSecurityGroupMemberships)
        }
        return cdkBuilder.build()
    }
}
