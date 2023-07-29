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

package cloudshift.awscdk.dsl.services.emr

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.Map
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.emr.CfnInstanceGroupConfig

/**
 * `Configurations` is a property of the `AWS::EMR::Cluster` resource that specifies the
 * configuration of applications on an Amazon EMR cluster.
 *
 * Configurations are optional. You can use them to have EMR customize applications and software
 * bundled with Amazon EMR when a cluster is created. A configuration consists of a classification,
 * properties, and optional nested configurations. A classification refers to an
 * application-specific configuration file. Properties are the settings you want to change in that
 * file. For more information, see
 * [Configuring Applications](https://docs.aws.amazon.com/emr/latest/ReleaseGuide/emr-configure-apps.html)
 * .
 *
 * Applies only to Amazon EMR releases 4.0 and later.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.emr.*;
 * ConfigurationProperty configurationProperty_;
 * ConfigurationProperty configurationProperty = ConfigurationProperty.builder()
 * .classification("classification")
 * .configurationProperties(Map.of(
 * "configurationPropertiesKey", "configurationProperties"))
 * .configurations(List.of(configurationProperty_))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-emr-instancegroupconfig-configuration.html)
 */
@CdkDslMarker
public class CfnInstanceGroupConfigConfigurationPropertyDsl {
    private val cdkBuilder: CfnInstanceGroupConfig.ConfigurationProperty.Builder =
        CfnInstanceGroupConfig.ConfigurationProperty.builder()

    private val _configurations: MutableList<Any> = mutableListOf()

    /** @param classification The classification within a configuration. */
    public fun classification(classification: String) {
        cdkBuilder.classification(classification)
    }

    /**
     * @param configurationProperties Within a configuration classification, a set of properties
     *   that represent the settings that you want to change in the configuration file. Duplicates
     *   not allowed.
     */
    public fun configurationProperties(configurationProperties: Map<String, String>) {
        cdkBuilder.configurationProperties(configurationProperties)
    }

    /**
     * @param configurationProperties Within a configuration classification, a set of properties
     *   that represent the settings that you want to change in the configuration file. Duplicates
     *   not allowed.
     */
    public fun configurationProperties(configurationProperties: IResolvable) {
        cdkBuilder.configurationProperties(configurationProperties)
    }

    /**
     * @param configurations A list of additional configurations to apply within a configuration
     *   object.
     */
    public fun configurations(vararg configurations: Any) {
        _configurations.addAll(listOf(*configurations))
    }

    /**
     * @param configurations A list of additional configurations to apply within a configuration
     *   object.
     */
    public fun configurations(configurations: Collection<Any>) {
        _configurations.addAll(configurations)
    }

    /**
     * @param configurations A list of additional configurations to apply within a configuration
     *   object.
     */
    public fun configurations(configurations: IResolvable) {
        cdkBuilder.configurations(configurations)
    }

    public fun build(): CfnInstanceGroupConfig.ConfigurationProperty {
        if (_configurations.isNotEmpty()) cdkBuilder.configurations(_configurations)
        return cdkBuilder.build()
    }
}
