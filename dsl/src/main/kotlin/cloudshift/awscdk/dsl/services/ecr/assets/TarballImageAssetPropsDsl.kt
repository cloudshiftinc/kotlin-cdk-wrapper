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

package cloudshift.awscdk.dsl.services.ecr.assets

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.ecr.assets.TarballImageAssetProps
import kotlin.String

@CdkDslMarker
public class TarballImageAssetPropsDsl {
    private val cdkBuilder: TarballImageAssetProps.Builder = TarballImageAssetProps.builder()

    public fun tarballFile(tarballFile: String) {
        cdkBuilder.tarballFile(tarballFile)
    }

    public fun build(): TarballImageAssetProps = cdkBuilder.build()
}
