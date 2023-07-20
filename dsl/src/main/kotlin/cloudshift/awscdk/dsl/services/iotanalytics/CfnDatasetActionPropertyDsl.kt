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

package cloudshift.awscdk.dsl.services.iotanalytics

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.iotanalytics.CfnDataset
import kotlin.String

@CdkDslMarker
public class CfnDatasetActionPropertyDsl {
    private val cdkBuilder: CfnDataset.ActionProperty.Builder = CfnDataset.ActionProperty.builder()

    public fun actionName(actionName: String) {
        cdkBuilder.actionName(actionName)
    }

    public fun containerAction(containerAction: IResolvable) {
        cdkBuilder.containerAction(containerAction)
    }

    public fun containerAction(containerAction: CfnDataset.ContainerActionProperty) {
        cdkBuilder.containerAction(containerAction)
    }

    public fun queryAction(queryAction: IResolvable) {
        cdkBuilder.queryAction(queryAction)
    }

    public fun queryAction(queryAction: CfnDataset.QueryActionProperty) {
        cdkBuilder.queryAction(queryAction)
    }

    public fun build(): CfnDataset.ActionProperty = cdkBuilder.build()
}
