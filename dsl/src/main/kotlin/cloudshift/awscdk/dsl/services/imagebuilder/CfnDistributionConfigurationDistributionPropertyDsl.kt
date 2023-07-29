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
import cloudshift.awscdk.common.MapBuilder
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.imagebuilder.CfnDistributionConfiguration

/**
 * The distribution configuration distribution defines the settings for a specific Region in the
 * Distribution Configuration.
 *
 * You must specify whether the distribution is for an AMI or a container image. To do so, include
 * exactly one of the following data types for your distribution:
 * * amiDistributionConfiguration
 * * containerDistributionConfiguration
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.imagebuilder.*;
 * Object amiDistributionConfiguration;
 * Object containerDistributionConfiguration;
 * DistributionProperty distributionProperty = DistributionProperty.builder()
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
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-imagebuilder-distributionconfiguration-distribution.html)
 */
@CdkDslMarker
public class CfnDistributionConfigurationDistributionPropertyDsl {
    private val cdkBuilder: CfnDistributionConfiguration.DistributionProperty.Builder =
        CfnDistributionConfiguration.DistributionProperty.builder()

    private val _fastLaunchConfigurations: MutableList<Any> = mutableListOf()

    private val _launchTemplateConfigurations: MutableList<Any> = mutableListOf()

    private val _licenseConfigurationArns: MutableList<String> = mutableListOf()

    /**
     * @param amiDistributionConfiguration The specific AMI settings, such as launch permissions and
     *   AMI tags. For details, see example schema below.
     */
    public fun amiDistributionConfiguration(
        amiDistributionConfiguration: MapBuilder.() -> Unit = {}
    ) {
        val builder = MapBuilder()
        builder.apply(amiDistributionConfiguration)
        cdkBuilder.amiDistributionConfiguration(builder.map)
    }

    /**
     * @param amiDistributionConfiguration The specific AMI settings, such as launch permissions and
     *   AMI tags. For details, see example schema below.
     */
    public fun amiDistributionConfiguration(amiDistributionConfiguration: Any) {
        cdkBuilder.amiDistributionConfiguration(amiDistributionConfiguration)
    }

    /**
     * @param containerDistributionConfiguration Container distribution settings for encryption,
     *   licensing, and sharing in a specific Region. For details, see example schema below.
     */
    public fun containerDistributionConfiguration(
        containerDistributionConfiguration: MapBuilder.() -> Unit = {}
    ) {
        val builder = MapBuilder()
        builder.apply(containerDistributionConfiguration)
        cdkBuilder.containerDistributionConfiguration(builder.map)
    }

    /**
     * @param containerDistributionConfiguration Container distribution settings for encryption,
     *   licensing, and sharing in a specific Region. For details, see example schema below.
     */
    public fun containerDistributionConfiguration(containerDistributionConfiguration: Any) {
        cdkBuilder.containerDistributionConfiguration(containerDistributionConfiguration)
    }

    /**
     * @param fastLaunchConfigurations The Windows faster-launching configurations to use for AMI
     *   distribution.
     */
    public fun fastLaunchConfigurations(vararg fastLaunchConfigurations: Any) {
        _fastLaunchConfigurations.addAll(listOf(*fastLaunchConfigurations))
    }

    /**
     * @param fastLaunchConfigurations The Windows faster-launching configurations to use for AMI
     *   distribution.
     */
    public fun fastLaunchConfigurations(fastLaunchConfigurations: Collection<Any>) {
        _fastLaunchConfigurations.addAll(fastLaunchConfigurations)
    }

    /**
     * @param fastLaunchConfigurations The Windows faster-launching configurations to use for AMI
     *   distribution.
     */
    public fun fastLaunchConfigurations(fastLaunchConfigurations: IResolvable) {
        cdkBuilder.fastLaunchConfigurations(fastLaunchConfigurations)
    }

    /**
     * @param launchTemplateConfigurations A group of launchTemplateConfiguration settings that
     *   apply to image distribution for specified accounts.
     */
    public fun launchTemplateConfigurations(vararg launchTemplateConfigurations: Any) {
        _launchTemplateConfigurations.addAll(listOf(*launchTemplateConfigurations))
    }

    /**
     * @param launchTemplateConfigurations A group of launchTemplateConfiguration settings that
     *   apply to image distribution for specified accounts.
     */
    public fun launchTemplateConfigurations(launchTemplateConfigurations: Collection<Any>) {
        _launchTemplateConfigurations.addAll(launchTemplateConfigurations)
    }

    /**
     * @param launchTemplateConfigurations A group of launchTemplateConfiguration settings that
     *   apply to image distribution for specified accounts.
     */
    public fun launchTemplateConfigurations(launchTemplateConfigurations: IResolvable) {
        cdkBuilder.launchTemplateConfigurations(launchTemplateConfigurations)
    }

    /**
     * @param licenseConfigurationArns The License Manager Configuration to associate with the AMI
     *   in the specified Region. For more information, see the
     *   [LicenseConfiguration API](https://docs.aws.amazon.com/license-manager/latest/APIReference/API_LicenseConfiguration.html)
     *   .
     */
    public fun licenseConfigurationArns(vararg licenseConfigurationArns: String) {
        _licenseConfigurationArns.addAll(listOf(*licenseConfigurationArns))
    }

    /**
     * @param licenseConfigurationArns The License Manager Configuration to associate with the AMI
     *   in the specified Region. For more information, see the
     *   [LicenseConfiguration API](https://docs.aws.amazon.com/license-manager/latest/APIReference/API_LicenseConfiguration.html)
     *   .
     */
    public fun licenseConfigurationArns(licenseConfigurationArns: Collection<String>) {
        _licenseConfigurationArns.addAll(licenseConfigurationArns)
    }

    /**
     * @param region The target Region for the Distribution Configuration. For example, `eu-west-1`
     *   .
     */
    public fun region(region: String) {
        cdkBuilder.region(region)
    }

    public fun build(): CfnDistributionConfiguration.DistributionProperty {
        if (_fastLaunchConfigurations.isNotEmpty())
            cdkBuilder.fastLaunchConfigurations(_fastLaunchConfigurations)
        if (_launchTemplateConfigurations.isNotEmpty())
            cdkBuilder.launchTemplateConfigurations(_launchTemplateConfigurations)
        if (_licenseConfigurationArns.isNotEmpty())
            cdkBuilder.licenseConfigurationArns(_licenseConfigurationArns)
        return cdkBuilder.build()
    }
}
