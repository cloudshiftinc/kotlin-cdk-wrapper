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

package io.cloudshiftdev.awscdkdsl.services.guardduty

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.Any
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.guardduty.CfnDetector

/**
 * Information about the configuration of a feature in your account.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.guardduty.*;
 * CFNFeatureConfigurationProperty cFNFeatureConfigurationProperty =
 * CFNFeatureConfigurationProperty.builder()
 * .name("name")
 * .status("status")
 * // the properties below are optional
 * .additionalConfiguration(List.of(CFNFeatureAdditionalConfigurationProperty.builder()
 * .name("name")
 * .status("status")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-guardduty-detector-cfnfeatureconfiguration.html)
 */
@CdkDslMarker
public class CfnDetectorCFNFeatureConfigurationPropertyDsl {
    private val cdkBuilder: CfnDetector.CFNFeatureConfigurationProperty.Builder =
        CfnDetector.CFNFeatureConfigurationProperty.builder()

    private val _additionalConfiguration: MutableList<Any> = mutableListOf()

    /**
     * @param additionalConfiguration Information about the additional configuration of a feature in
     *   your account.
     */
    public fun additionalConfiguration(vararg additionalConfiguration: Any) {
        _additionalConfiguration.addAll(listOf(*additionalConfiguration))
    }

    /**
     * @param additionalConfiguration Information about the additional configuration of a feature in
     *   your account.
     */
    public fun additionalConfiguration(additionalConfiguration: Collection<Any>) {
        _additionalConfiguration.addAll(additionalConfiguration)
    }

    /**
     * @param additionalConfiguration Information about the additional configuration of a feature in
     *   your account.
     */
    public fun additionalConfiguration(additionalConfiguration: IResolvable) {
        cdkBuilder.additionalConfiguration(additionalConfiguration)
    }

    /** @param name Name of the feature. */
    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    /** @param status Status of the feature configuration. */
    public fun status(status: String) {
        cdkBuilder.status(status)
    }

    public fun build(): CfnDetector.CFNFeatureConfigurationProperty {
        if (_additionalConfiguration.isNotEmpty())
            cdkBuilder.additionalConfiguration(_additionalConfiguration)
        return cdkBuilder.build()
    }
}
