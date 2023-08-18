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

package io.cloudshiftdev.awscdkdsl.services.panorama

import io.cloudshiftdev.awscdkdsl.CfnTagDsl
import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.panorama.CfnPackage
import software.constructs.Construct

/**
 * Creates a package and storage location in an Amazon S3 access point.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.panorama.*;
 * CfnPackage cfnPackage = CfnPackage.Builder.create(this, "MyCfnPackage")
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
public class CfnPackageDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnPackage.Builder = CfnPackage.Builder.create(scope, id)

    private val _tags: MutableList<CfnTag> = mutableListOf()

    /**
     * A name for the package.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-panorama-package.html#cfn-panorama-package-packagename)
     *
     * @param packageName A name for the package.
     */
    public fun packageName(packageName: String) {
        cdkBuilder.packageName(packageName)
    }

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-panorama-package.html#cfn-panorama-package-storagelocation)
     *
     * @param storageLocation
     */
    public fun storageLocation(storageLocation: IResolvable) {
        cdkBuilder.storageLocation(storageLocation)
    }

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-panorama-package.html#cfn-panorama-package-storagelocation)
     *
     * @param storageLocation
     */
    public fun storageLocation(storageLocation: CfnPackage.StorageLocationProperty) {
        cdkBuilder.storageLocation(storageLocation)
    }

    /**
     * Tags for the package.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-panorama-package.html#cfn-panorama-package-tags)
     *
     * @param tags Tags for the package.
     */
    public fun tags(tags: CfnTagDsl.() -> Unit) {
        _tags.add(CfnTagDsl().apply(tags).build())
    }

    /**
     * Tags for the package.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-panorama-package.html#cfn-panorama-package-tags)
     *
     * @param tags Tags for the package.
     */
    public fun tags(tags: Collection<CfnTag>) {
        _tags.addAll(tags)
    }

    public fun build(): CfnPackage {
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        return cdkBuilder.build()
    }
}
