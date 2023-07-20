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

package cloudshift.awscdk.dsl.services.mediapackage

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.mediapackage.CfnPackagingConfiguration
import kotlin.Any
import kotlin.Number
import kotlin.collections.Collection
import kotlin.collections.MutableList

@CdkDslMarker
public class CfnPackagingConfigurationMssPackagePropertyDsl {
    private val cdkBuilder: CfnPackagingConfiguration.MssPackageProperty.Builder =
        CfnPackagingConfiguration.MssPackageProperty.builder()

    private val _mssManifests: MutableList<Any> = mutableListOf()

    public fun encryption(encryption: IResolvable) {
        cdkBuilder.encryption(encryption)
    }

    public fun encryption(encryption: CfnPackagingConfiguration.MssEncryptionProperty) {
        cdkBuilder.encryption(encryption)
    }

    public fun mssManifests(vararg mssManifests: Any) {
        _mssManifests.addAll(listOf(*mssManifests))
    }

    public fun mssManifests(mssManifests: Collection<Any>) {
        _mssManifests.addAll(mssManifests)
    }

    public fun mssManifests(mssManifests: IResolvable) {
        cdkBuilder.mssManifests(mssManifests)
    }

    public fun segmentDurationSeconds(segmentDurationSeconds: Number) {
        cdkBuilder.segmentDurationSeconds(segmentDurationSeconds)
    }

    public fun build(): CfnPackagingConfiguration.MssPackageProperty {
        if (_mssManifests.isNotEmpty()) cdkBuilder.mssManifests(_mssManifests)
        return cdkBuilder.build()
    }
}
