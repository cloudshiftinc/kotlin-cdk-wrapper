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

package cloudshift.awscdk.dsl.services.panorama

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.dsl.CfnTagDsl
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.panorama.CfnPackage
import software.amazon.awscdk.services.panorama.CfnPackageProps

/**
 * Properties for defining a `CfnPackage`.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.panorama.*;
 * CfnPackageProps cfnPackageProps = CfnPackageProps.builder()
 * .packageName("packageName")
 * // the properties below are optional
 * .storageLocation(StorageLocationProperty.builder()
 * .binaryPrefixLocation("binaryPrefixLocation")
 * .bucket("bucket")
 * .generatedPrefixLocation("generatedPrefixLocation")
 * .manifestPrefixLocation("manifestPrefixLocation")
 * .repoPrefixLocation("repoPrefixLocation")
 * .build())
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-panorama-package.html)
 */
@CdkDslMarker
public class CfnPackagePropsDsl {
    private val cdkBuilder: CfnPackageProps.Builder = CfnPackageProps.builder()

    private val _tags: MutableList<CfnTag> = mutableListOf()

    /** @param packageName A name for the package. */
    public fun packageName(packageName: String) {
        cdkBuilder.packageName(packageName)
    }

    /** @param storageLocation the value to be set. */
    public fun storageLocation(storageLocation: IResolvable) {
        cdkBuilder.storageLocation(storageLocation)
    }

    /** @param storageLocation the value to be set. */
    public fun storageLocation(storageLocation: CfnPackage.StorageLocationProperty) {
        cdkBuilder.storageLocation(storageLocation)
    }

    /** @param tags Tags for the package. */
    public fun tags(tags: CfnTagDsl.() -> Unit) {
        _tags.add(CfnTagDsl().apply(tags).build())
    }

    /** @param tags Tags for the package. */
    public fun tags(tags: Collection<CfnTag>) {
        _tags.addAll(tags)
    }

    public fun build(): CfnPackageProps {
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        return cdkBuilder.build()
    }
}
