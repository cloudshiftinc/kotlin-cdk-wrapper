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

package io.cloudshiftdev.awscdkdsl.services.ssm

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.services.ssm.CfnPatchBaseline

/**
 * `PatchSource` is the property type for the `Sources` resource of the
 * [AWS::SSM::PatchBaseline](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-patchbaseline.html)
 * resource.
 *
 * The AWS CloudFormation `AWS::SSM::PatchSource` resource is used to provide information about the
 * patches to use to update target instances, including target operating systems and source
 * repository. Applies to Linux managed nodes only.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.ssm.*;
 * PatchSourceProperty patchSourceProperty = PatchSourceProperty.builder()
 * .configuration("configuration")
 * .name("name")
 * .products(List.of("products"))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssm-patchbaseline-patchsource.html)
 */
@CdkDslMarker
public class CfnPatchBaselinePatchSourcePropertyDsl {
    private val cdkBuilder: CfnPatchBaseline.PatchSourceProperty.Builder =
        CfnPatchBaseline.PatchSourceProperty.builder()

    private val _products: MutableList<String> = mutableListOf()

    /**
     * @param configuration The value of the yum repo configuration. For example:. `[main]`
     *
     * `name=MyCustomRepository`
     *
     * `baseurl=https://my-custom-repository`
     *
     * `enabled=1`
     *
     * For information about other options available for your yum repository configuration, see
     * [dnf.conf(5)](https://docs.aws.amazon.com/https://man7.org/linux/man-pages/man5/dnf.conf.5.html)
     * .
     */
    public fun configuration(configuration: String) {
        cdkBuilder.configuration(configuration)
    }

    /** @param name The name specified to identify the patch source. */
    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    /**
     * @param products The specific operating system versions a patch repository applies to, such as
     *   "Ubuntu16.04", "RedhatEnterpriseLinux7.2" or "Suse12.7". For lists of supported product
     *   values, see
     *   [PatchFilter](https://docs.aws.amazon.com/systems-manager/latest/APIReference/API_PatchFilter.html)
     *   in the *AWS Systems Manager API Reference* .
     */
    public fun products(vararg products: String) {
        _products.addAll(listOf(*products))
    }

    /**
     * @param products The specific operating system versions a patch repository applies to, such as
     *   "Ubuntu16.04", "RedhatEnterpriseLinux7.2" or "Suse12.7". For lists of supported product
     *   values, see
     *   [PatchFilter](https://docs.aws.amazon.com/systems-manager/latest/APIReference/API_PatchFilter.html)
     *   in the *AWS Systems Manager API Reference* .
     */
    public fun products(products: Collection<String>) {
        _products.addAll(products)
    }

    public fun build(): CfnPatchBaseline.PatchSourceProperty {
        if (_products.isNotEmpty()) cdkBuilder.products(_products)
        return cdkBuilder.build()
    }
}
