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

package cloudshift.awscdk.dsl.services.greengrass

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.greengrass.CfnCoreDefinition

/**
 * A core definition version contains a Greengrass
 * [core](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-coredefinition-core.html)
 * .
 *
 * After you create a core definition version that contains the core you want to deploy, you must
 * add it to your group version. For more information, see
 * [`AWS::Greengrass::Group`](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-greengrass-group.html)
 * .
 *
 * In an AWS CloudFormation template, `CoreDefinitionVersion` is the property type of the
 * `InitialVersion` property in the
 * [`AWS::Greengrass::CoreDefinition`](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-greengrass-coredefinition.html)
 * resource.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.greengrass.*;
 * CoreDefinitionVersionProperty coreDefinitionVersionProperty =
 * CoreDefinitionVersionProperty.builder()
 * .cores(List.of(CoreProperty.builder()
 * .certificateArn("certificateArn")
 * .id("id")
 * .thingArn("thingArn")
 * // the properties below are optional
 * .syncShadow(false)
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-coredefinition-coredefinitionversion.html)
 */
@CdkDslMarker
public class CfnCoreDefinitionCoreDefinitionVersionPropertyDsl {
    private val cdkBuilder: CfnCoreDefinition.CoreDefinitionVersionProperty.Builder =
        CfnCoreDefinition.CoreDefinitionVersionProperty.builder()

    private val _cores: MutableList<Any> = mutableListOf()

    /**
     * @param cores The Greengrass core in this version. Currently, the `Cores` property for a core
     *   definition version can contain only one core.
     */
    public fun cores(vararg cores: Any) {
        _cores.addAll(listOf(*cores))
    }

    /**
     * @param cores The Greengrass core in this version. Currently, the `Cores` property for a core
     *   definition version can contain only one core.
     */
    public fun cores(cores: Collection<Any>) {
        _cores.addAll(cores)
    }

    /**
     * @param cores The Greengrass core in this version. Currently, the `Cores` property for a core
     *   definition version can contain only one core.
     */
    public fun cores(cores: IResolvable) {
        cdkBuilder.cores(cores)
    }

    public fun build(): CfnCoreDefinition.CoreDefinitionVersionProperty {
        if (_cores.isNotEmpty()) cdkBuilder.cores(_cores)
        return cdkBuilder.build()
    }
}
