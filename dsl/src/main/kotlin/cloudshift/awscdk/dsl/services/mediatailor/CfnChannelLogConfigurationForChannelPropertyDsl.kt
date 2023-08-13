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

package cloudshift.awscdk.dsl.services.mediatailor

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.services.mediatailor.CfnChannel

/**
 * The log configuration for the channel.</p>.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.mediatailor.*;
 * LogConfigurationForChannelProperty logConfigurationForChannelProperty =
 * LogConfigurationForChannelProperty.builder()
 * .logTypes(List.of("logTypes"))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediatailor-channel-logconfigurationforchannel.html)
 */
@CdkDslMarker
public class CfnChannelLogConfigurationForChannelPropertyDsl {
    private val cdkBuilder: CfnChannel.LogConfigurationForChannelProperty.Builder =
        CfnChannel.LogConfigurationForChannelProperty.builder()

    private val _logTypes: MutableList<String> = mutableListOf()

    /** @param logTypes The log types.</p>. */
    public fun logTypes(vararg logTypes: String) {
        _logTypes.addAll(listOf(*logTypes))
    }

    /** @param logTypes The log types.</p>. */
    public fun logTypes(logTypes: Collection<String>) {
        _logTypes.addAll(logTypes)
    }

    public fun build(): CfnChannel.LogConfigurationForChannelProperty {
        if (_logTypes.isNotEmpty()) cdkBuilder.logTypes(_logTypes)
        return cdkBuilder.build()
    }
}
