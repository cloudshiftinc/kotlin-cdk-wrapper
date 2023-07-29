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

package cloudshift.awscdk.dsl.services.dynamodb

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.dynamodb.CfnGlobalTable

/**
 * Represents the settings used to enable or disable Time to Live (TTL) for the specified table.
 *
 * All replicas will have the same time to live configuration.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.dynamodb.*;
 * TimeToLiveSpecificationProperty timeToLiveSpecificationProperty =
 * TimeToLiveSpecificationProperty.builder()
 * .enabled(false)
 * // the properties below are optional
 * .attributeName("attributeName")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dynamodb-globaltable-timetolivespecification.html)
 */
@CdkDslMarker
public class CfnGlobalTableTimeToLiveSpecificationPropertyDsl {
    private val cdkBuilder: CfnGlobalTable.TimeToLiveSpecificationProperty.Builder =
        CfnGlobalTable.TimeToLiveSpecificationProperty.builder()

    /**
     * @param attributeName The name of the attribute used to store the expiration time for items in
     *   the table. Currently, you cannot directly change the attribute name used to evaluate time
     *   to live. In order to do so, you must first disable time to live, and then re-enable it with
     *   the new attribute name. It can take up to one hour for changes to time to live to take
     *   effect. If you attempt to modify time to live within that time window, your stack operation
     *   might be delayed.
     */
    public fun attributeName(attributeName: String) {
        cdkBuilder.attributeName(attributeName)
    }

    /**
     * @param enabled Indicates whether TTL is to be enabled (true) or disabled (false) on the
     *   table.
     */
    public fun enabled(enabled: Boolean) {
        cdkBuilder.enabled(enabled)
    }

    /**
     * @param enabled Indicates whether TTL is to be enabled (true) or disabled (false) on the
     *   table.
     */
    public fun enabled(enabled: IResolvable) {
        cdkBuilder.enabled(enabled)
    }

    public fun build(): CfnGlobalTable.TimeToLiveSpecificationProperty = cdkBuilder.build()
}
