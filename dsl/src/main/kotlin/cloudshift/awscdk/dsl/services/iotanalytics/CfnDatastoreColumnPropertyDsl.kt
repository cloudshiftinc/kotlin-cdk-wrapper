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
import software.amazon.awscdk.services.iotanalytics.CfnDatastore
import kotlin.String

@CdkDslMarker
public class CfnDatastoreColumnPropertyDsl {
    private val cdkBuilder: CfnDatastore.ColumnProperty.Builder =
        CfnDatastore.ColumnProperty.builder()

    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    public fun type(type: String) {
        cdkBuilder.type(type)
    }

    public fun build(): CfnDatastore.ColumnProperty = cdkBuilder.build()
}
