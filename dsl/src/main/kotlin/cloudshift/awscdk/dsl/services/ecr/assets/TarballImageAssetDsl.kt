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
import software.amazon.awscdk.services.ecr.assets.TarballImageAsset
import software.constructs.Construct
import kotlin.String

@CdkDslMarker
public class TarballImageAssetDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: TarballImageAsset.Builder = TarballImageAsset.Builder.create(scope, id)

    public fun tarballFile(tarballFile: String) {
        cdkBuilder.tarballFile(tarballFile)
    }

    public fun build(): TarballImageAsset = cdkBuilder.build()
}
