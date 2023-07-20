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

package cloudshift.awscdk.dsl.services.opsworks

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.opsworks.CfnStack
import kotlin.String

@CdkDslMarker
public class CfnStackRdsDbInstancePropertyDsl {
    private val cdkBuilder: CfnStack.RdsDbInstanceProperty.Builder =
        CfnStack.RdsDbInstanceProperty.builder()

    public fun dbPassword(dbPassword: String) {
        cdkBuilder.dbPassword(dbPassword)
    }

    public fun dbUser(dbUser: String) {
        cdkBuilder.dbUser(dbUser)
    }

    public fun rdsDbInstanceArn(rdsDbInstanceArn: String) {
        cdkBuilder.rdsDbInstanceArn(rdsDbInstanceArn)
    }

    public fun build(): CfnStack.RdsDbInstanceProperty = cdkBuilder.build()
}
