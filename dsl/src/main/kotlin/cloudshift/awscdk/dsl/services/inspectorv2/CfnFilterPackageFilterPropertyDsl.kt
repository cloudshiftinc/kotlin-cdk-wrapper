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

package cloudshift.awscdk.dsl.services.inspectorv2

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.inspectorv2.CfnFilter

@CdkDslMarker
public class CfnFilterPackageFilterPropertyDsl {
    private val cdkBuilder: CfnFilter.PackageFilterProperty.Builder =
        CfnFilter.PackageFilterProperty.builder()

    public fun architecture(architecture: IResolvable) {
        cdkBuilder.architecture(architecture)
    }

    public fun architecture(architecture: CfnFilter.StringFilterProperty) {
        cdkBuilder.architecture(architecture)
    }

    public fun epoch(epoch: IResolvable) {
        cdkBuilder.epoch(epoch)
    }

    public fun epoch(epoch: CfnFilter.NumberFilterProperty) {
        cdkBuilder.epoch(epoch)
    }

    public fun name(name: IResolvable) {
        cdkBuilder.name(name)
    }

    public fun name(name: CfnFilter.StringFilterProperty) {
        cdkBuilder.name(name)
    }

    public fun release(release: IResolvable) {
        cdkBuilder.release(release)
    }

    public fun release(release: CfnFilter.StringFilterProperty) {
        cdkBuilder.release(release)
    }

    public fun sourceLayerHash(sourceLayerHash: IResolvable) {
        cdkBuilder.sourceLayerHash(sourceLayerHash)
    }

    public fun sourceLayerHash(sourceLayerHash: CfnFilter.StringFilterProperty) {
        cdkBuilder.sourceLayerHash(sourceLayerHash)
    }

    public fun version(version: IResolvable) {
        cdkBuilder.version(version)
    }

    public fun version(version: CfnFilter.StringFilterProperty) {
        cdkBuilder.version(version)
    }

    public fun build(): CfnFilter.PackageFilterProperty = cdkBuilder.build()
}
