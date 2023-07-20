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
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnDataSet
import kotlin.Boolean

@CdkDslMarker
public class CfnDataSetJoinKeyPropertiesPropertyDsl {
    private val cdkBuilder: CfnDataSet.JoinKeyPropertiesProperty.Builder =
        CfnDataSet.JoinKeyPropertiesProperty.builder()

    public fun uniqueKey(uniqueKey: Boolean) {
        cdkBuilder.uniqueKey(uniqueKey)
    }

    public fun uniqueKey(uniqueKey: IResolvable) {
        cdkBuilder.uniqueKey(uniqueKey)
    }

    public fun build(): CfnDataSet.JoinKeyPropertiesProperty = cdkBuilder.build()
}
