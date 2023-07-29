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

package cloudshift.awscdk.dsl.services.imagebuilder

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.Map
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.imagebuilder.CfnDistributionConfigurationProps

/**
 * Properties for defining a `CfnDistributionConfiguration`.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.imagebuilder.*;
 * Object amiDistributionConfiguration;
 * Object containerDistributionConfiguration;
 * CfnDistributionConfigurationProps cfnDistributionConfigurationProps =
 * CfnDistributionConfigurationProps.builder()
 * .distributions(List.of(DistributionProperty.builder()
 * .region("region")
 * // the properties below are optional
 * .amiDistributionConfiguration(amiDistributionConfiguration)
 * .containerDistributionConfiguration(containerDistributionConfiguration)
 * .fastLaunchConfigurations(List.of(FastLaunchConfigurationProperty.builder()
 * .accountId("accountId")
 * .enabled(false)
 * .launchTemplate(FastLaunchLaunchTemplateSpecificationProperty.builder()
 * .launchTemplateId("launchTemplateId")
 * .launchTemplateName("launchTemplateName")
 * .launchTemplateVersion("launchTemplateVersion")
 * .build())
 * .maxParallelLaunches(123)
 * .snapshotConfiguration(FastLaunchSnapshotConfigurationProperty.builder()
 * .targetResourceCount(123)
 * .build())
 * .build()))
 * .launchTemplateConfigurations(List.of(LaunchTemplateConfigurationProperty.builder()
 * .accountId("accountId")
 * .launchTemplateId("launchTemplateId")
 * .setDefaultVersion(false)
 * .build()))
 * .licenseConfigurationArns(List.of("licenseConfigurationArns"))
 * .build()))
 * .name("name")
 * // the properties below are optional
 * .description("description")
 * .tags(Map.of(
 * "tagsKey", "tags"))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-imagebuilder-distributionconfiguration.html)
 */
@CdkDslMarker
public class CfnDistributionConfigurationPropsDsl {
    private val cdkBuilder: CfnDistributionConfigurationProps.Builder =
        CfnDistributionConfigurationProps.builder()

    private val _distributions: MutableList<Any> = mutableListOf()

    /** @param description The description of this distribution configuration. */
    public fun description(description: String) {
        cdkBuilder.description(description)
    }

    /**
     * @param distributions The distributions of this distribution configuration formatted as an
     *   array of Distribution objects.
     */
    public fun distributions(vararg distributions: Any) {
        _distributions.addAll(listOf(*distributions))
    }

    /**
     * @param distributions The distributions of this distribution configuration formatted as an
     *   array of Distribution objects.
     */
    public fun distributions(distributions: Collection<Any>) {
        _distributions.addAll(distributions)
    }

    /**
     * @param distributions The distributions of this distribution configuration formatted as an
     *   array of Distribution objects.
     */
    public fun distributions(distributions: IResolvable) {
        cdkBuilder.distributions(distributions)
    }

    /** @param name The name of this distribution configuration. */
    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    /** @param tags The tags of this distribution configuration. */
    public fun tags(tags: Map<String, String>) {
        cdkBuilder.tags(tags)
    }

    public fun build(): CfnDistributionConfigurationProps {
        if (_distributions.isNotEmpty()) cdkBuilder.distributions(_distributions)
        return cdkBuilder.build()
    }
}
