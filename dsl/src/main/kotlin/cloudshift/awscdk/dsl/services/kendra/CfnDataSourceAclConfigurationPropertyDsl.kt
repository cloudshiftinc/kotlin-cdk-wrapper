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

package cloudshift.awscdk.dsl.services.kendra

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.kendra.CfnDataSource
import kotlin.String

@CdkDslMarker
public class CfnDataSourceAclConfigurationPropertyDsl {
    private val cdkBuilder: CfnDataSource.AclConfigurationProperty.Builder =
        CfnDataSource.AclConfigurationProperty.builder()

    public fun allowedGroupsColumnName(allowedGroupsColumnName: String) {
        cdkBuilder.allowedGroupsColumnName(allowedGroupsColumnName)
    }

    public fun build(): CfnDataSource.AclConfigurationProperty = cdkBuilder.build()
}
