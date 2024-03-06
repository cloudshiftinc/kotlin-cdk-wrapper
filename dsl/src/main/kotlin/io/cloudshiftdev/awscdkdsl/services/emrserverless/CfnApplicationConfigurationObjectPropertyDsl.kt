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

package io.cloudshiftdev.awscdkdsl.services.emrserverless

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.Any
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.Map
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.emrserverless.CfnApplication

/**
 * Configuration for a JobRun.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.emrserverless.*;
 * ConfigurationObjectProperty configurationObjectProperty_;
 * ConfigurationObjectProperty configurationObjectProperty = ConfigurationObjectProperty.builder()
 * .classification("classification")
 * // the properties below are optional
 * .configurations(List.of(configurationObjectProperty_))
 * .properties(Map.of(
 * "propertiesKey", "properties"))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-emrserverless-application-configurationobject.html)
 */
@CdkDslMarker
public class CfnApplicationConfigurationObjectPropertyDsl {
    private val cdkBuilder: CfnApplication.ConfigurationObjectProperty.Builder =
        CfnApplication.ConfigurationObjectProperty.builder()

    private val _configurations: MutableList<Any> = mutableListOf()

    /** @param classification the value to be set. */
    public fun classification(classification: String) {
        cdkBuilder.classification(classification)
    }

    /** @param configurations the value to be set. */
    public fun configurations(vararg configurations: Any) {
        _configurations.addAll(listOf(*configurations))
    }

    /** @param configurations the value to be set. */
    public fun configurations(configurations: Collection<Any>) {
        _configurations.addAll(configurations)
    }

    /** @param configurations the value to be set. */
    public fun configurations(configurations: IResolvable) {
        cdkBuilder.configurations(configurations)
    }

    /** @param properties the value to be set. */
    public fun properties(properties: Map<String, String>) {
        cdkBuilder.properties(properties)
    }

    /** @param properties the value to be set. */
    public fun properties(properties: IResolvable) {
        cdkBuilder.properties(properties)
    }

    public fun build(): CfnApplication.ConfigurationObjectProperty {
        if (_configurations.isNotEmpty()) cdkBuilder.configurations(_configurations)
        return cdkBuilder.build()
    }
}
