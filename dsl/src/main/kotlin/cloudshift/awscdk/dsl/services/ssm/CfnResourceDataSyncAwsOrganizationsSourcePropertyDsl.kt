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

package cloudshift.awscdk.dsl.services.ssm

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.ssm.CfnResourceDataSync
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList

@CdkDslMarker
public class CfnResourceDataSyncAwsOrganizationsSourcePropertyDsl {
    private val cdkBuilder: CfnResourceDataSync.AwsOrganizationsSourceProperty.Builder =
        CfnResourceDataSync.AwsOrganizationsSourceProperty.builder()

    private val _organizationalUnits: MutableList<String> = mutableListOf()

    public fun organizationSourceType(organizationSourceType: String) {
        cdkBuilder.organizationSourceType(organizationSourceType)
    }

    public fun organizationalUnits(vararg organizationalUnits: String) {
        _organizationalUnits.addAll(listOf(*organizationalUnits))
    }

    public fun organizationalUnits(organizationalUnits: Collection<String>) {
        _organizationalUnits.addAll(organizationalUnits)
    }

    public fun build(): CfnResourceDataSync.AwsOrganizationsSourceProperty {
        if (_organizationalUnits.isNotEmpty()) cdkBuilder.organizationalUnits(_organizationalUnits)
        return cdkBuilder.build()
    }
}
