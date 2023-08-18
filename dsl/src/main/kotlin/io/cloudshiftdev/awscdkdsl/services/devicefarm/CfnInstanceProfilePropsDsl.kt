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

package io.cloudshiftdev.awscdkdsl.services.devicefarm

import io.cloudshiftdev.awscdkdsl.CfnTagDsl
import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.devicefarm.CfnInstanceProfileProps

/**
 * Properties for defining a `CfnInstanceProfile`.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.devicefarm.*;
 * CfnInstanceProfileProps cfnInstanceProfileProps = CfnInstanceProfileProps.builder()
 * .name("name")
 * // the properties below are optional
 * .description("description")
 * .excludeAppPackagesFromCleanup(List.of("excludeAppPackagesFromCleanup"))
 * .packageCleanup(false)
 * .rebootAfterUse(false)
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-devicefarm-instanceprofile.html)
 */
@CdkDslMarker
public class CfnInstanceProfilePropsDsl {
    private val cdkBuilder: CfnInstanceProfileProps.Builder = CfnInstanceProfileProps.builder()

    private val _excludeAppPackagesFromCleanup: MutableList<String> = mutableListOf()

    private val _tags: MutableList<CfnTag> = mutableListOf()

    /** @param description The description of the instance profile. */
    public fun description(description: String) {
        cdkBuilder.description(description)
    }

    /**
     * @param excludeAppPackagesFromCleanup An array of strings containing the list of app packages
     *   that should not be cleaned up from the device after a test run completes. The list of
     *   packages is considered only if you set `packageCleanup` to `true` .
     */
    public fun excludeAppPackagesFromCleanup(vararg excludeAppPackagesFromCleanup: String) {
        _excludeAppPackagesFromCleanup.addAll(listOf(*excludeAppPackagesFromCleanup))
    }

    /**
     * @param excludeAppPackagesFromCleanup An array of strings containing the list of app packages
     *   that should not be cleaned up from the device after a test run completes. The list of
     *   packages is considered only if you set `packageCleanup` to `true` .
     */
    public fun excludeAppPackagesFromCleanup(excludeAppPackagesFromCleanup: Collection<String>) {
        _excludeAppPackagesFromCleanup.addAll(excludeAppPackagesFromCleanup)
    }

    /** @param name The name of the instance profile. */
    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    /**
     * @param packageCleanup When set to `true` , Device Farm removes app packages after a test run.
     *   The default value is `false` for private devices.
     */
    public fun packageCleanup(packageCleanup: Boolean) {
        cdkBuilder.packageCleanup(packageCleanup)
    }

    /**
     * @param packageCleanup When set to `true` , Device Farm removes app packages after a test run.
     *   The default value is `false` for private devices.
     */
    public fun packageCleanup(packageCleanup: IResolvable) {
        cdkBuilder.packageCleanup(packageCleanup)
    }

    /**
     * @param rebootAfterUse When set to `true` , Device Farm reboots the instance after a test run.
     *   The default value is `true` .
     */
    public fun rebootAfterUse(rebootAfterUse: Boolean) {
        cdkBuilder.rebootAfterUse(rebootAfterUse)
    }

    /**
     * @param rebootAfterUse When set to `true` , Device Farm reboots the instance after a test run.
     *   The default value is `true` .
     */
    public fun rebootAfterUse(rebootAfterUse: IResolvable) {
        cdkBuilder.rebootAfterUse(rebootAfterUse)
    }

    /**
     * @param tags An array of key-value pairs to apply to this resource. For more information, see
     *   [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     *   in the *guide* .
     */
    public fun tags(tags: CfnTagDsl.() -> Unit) {
        _tags.add(CfnTagDsl().apply(tags).build())
    }

    /**
     * @param tags An array of key-value pairs to apply to this resource. For more information, see
     *   [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     *   in the *guide* .
     */
    public fun tags(tags: Collection<CfnTag>) {
        _tags.addAll(tags)
    }

    public fun build(): CfnInstanceProfileProps {
        if (_excludeAppPackagesFromCleanup.isNotEmpty())
            cdkBuilder.excludeAppPackagesFromCleanup(_excludeAppPackagesFromCleanup)
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        return cdkBuilder.build()
    }
}
