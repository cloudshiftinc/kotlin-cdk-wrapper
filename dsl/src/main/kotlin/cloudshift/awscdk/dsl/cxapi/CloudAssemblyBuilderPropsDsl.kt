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

package cloudshift.awscdk.dsl.cxapi

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.cxapi.CloudAssemblyBuilder
import software.amazon.awscdk.cxapi.CloudAssemblyBuilderProps
import kotlin.String

@CdkDslMarker
public class CloudAssemblyBuilderPropsDsl {
    private val cdkBuilder: CloudAssemblyBuilderProps.Builder = CloudAssemblyBuilderProps.builder()

    public fun assetOutdir(assetOutdir: String) {
        cdkBuilder.assetOutdir(assetOutdir)
    }

    public fun parentBuilder(parentBuilder: CloudAssemblyBuilder) {
        cdkBuilder.parentBuilder(parentBuilder)
    }

    public fun build(): CloudAssemblyBuilderProps = cdkBuilder.build()
}
