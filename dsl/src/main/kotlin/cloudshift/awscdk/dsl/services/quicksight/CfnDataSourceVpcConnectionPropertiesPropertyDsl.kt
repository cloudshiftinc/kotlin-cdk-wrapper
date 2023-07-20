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

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.quicksight.CfnDataSource
import kotlin.String

@CdkDslMarker
public class CfnDataSourceVpcConnectionPropertiesPropertyDsl {
    private val cdkBuilder: CfnDataSource.VpcConnectionPropertiesProperty.Builder =
        CfnDataSource.VpcConnectionPropertiesProperty.builder()

    public fun vpcConnectionArn(vpcConnectionArn: String) {
        cdkBuilder.vpcConnectionArn(vpcConnectionArn)
    }

    public fun build(): CfnDataSource.VpcConnectionPropertiesProperty = cdkBuilder.build()
}
