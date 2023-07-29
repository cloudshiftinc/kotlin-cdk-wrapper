@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION"
)

package cloudshift.awscdk.dsl.services.mediapackage

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.Number
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.mediapackage.CfnPackagingConfiguration

/**
 * Parameters for a packaging configuration that uses Microsoft Smooth Streaming (MSS) packaging.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.mediapackage.*;
 * MssPackageProperty mssPackageProperty = MssPackageProperty.builder()
 * .mssManifests(List.of(MssManifestProperty.builder()
 * .manifestName("manifestName")
 * .streamSelection(StreamSelectionProperty.builder()
 * .maxVideoBitsPerSecond(123)
 * .minVideoBitsPerSecond(123)
 * .streamOrder("streamOrder")
 * .build())
 * .build()))
 * // the properties below are optional
 * .encryption(MssEncryptionProperty.builder()
 * .spekeKeyProvider(SpekeKeyProviderProperty.builder()
 * .roleArn("roleArn")
 * .systemIds(List.of("systemIds"))
 * .url("url")
 * // the properties below are optional
 * .encryptionContractConfiguration(EncryptionContractConfigurationProperty.builder()
 * .presetSpeke20Audio("presetSpeke20Audio")
 * .presetSpeke20Video("presetSpeke20Video")
 * .build())
 * .build())
 * .build())
 * .segmentDurationSeconds(123)
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediapackage-packagingconfiguration-msspackage.html)
 */
@CdkDslMarker
public class CfnPackagingConfigurationMssPackagePropertyDsl {
    private val cdkBuilder: CfnPackagingConfiguration.MssPackageProperty.Builder =
        CfnPackagingConfiguration.MssPackageProperty.builder()

    private val _mssManifests: MutableList<Any> = mutableListOf()

    /** @param encryption Parameters for encrypting content. */
    public fun encryption(encryption: IResolvable) {
        cdkBuilder.encryption(encryption)
    }

    /** @param encryption Parameters for encrypting content. */
    public fun encryption(encryption: CfnPackagingConfiguration.MssEncryptionProperty) {
        cdkBuilder.encryption(encryption)
    }

    /**
     * @param mssManifests A list of Microsoft Smooth manifest configurations that are available
     *   from this endpoint.
     */
    public fun mssManifests(vararg mssManifests: Any) {
        _mssManifests.addAll(listOf(*mssManifests))
    }

    /**
     * @param mssManifests A list of Microsoft Smooth manifest configurations that are available
     *   from this endpoint.
     */
    public fun mssManifests(mssManifests: Collection<Any>) {
        _mssManifests.addAll(mssManifests)
    }

    /**
     * @param mssManifests A list of Microsoft Smooth manifest configurations that are available
     *   from this endpoint.
     */
    public fun mssManifests(mssManifests: IResolvable) {
        cdkBuilder.mssManifests(mssManifests)
    }

    /**
     * @param segmentDurationSeconds Duration (in seconds) of each fragment. Actual fragments are
     *   rounded to the nearest multiple of the source fragment duration.
     */
    public fun segmentDurationSeconds(segmentDurationSeconds: Number) {
        cdkBuilder.segmentDurationSeconds(segmentDurationSeconds)
    }

    public fun build(): CfnPackagingConfiguration.MssPackageProperty {
        if (_mssManifests.isNotEmpty()) cdkBuilder.mssManifests(_mssManifests)
        return cdkBuilder.build()
    }
}
