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

package cloudshift.awscdk.dsl.services.opensearchservice

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import software.amazon.awscdk.services.opensearchservice.CfnDomain

/**
 * *DEPRECATED* .
 *
 * This setting is only relevant to domains running legacy Elasticsearch OSS versions earlier than
 * 5.3. It does not apply to OpenSearch domains.
 *
 * The automated snapshot configuration for the OpenSearch Service domain indexes.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.opensearchservice.*;
 * SnapshotOptionsProperty snapshotOptionsProperty = SnapshotOptionsProperty.builder()
 * .automatedSnapshotStartHour(123)
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opensearchservice-domain-snapshotoptions.html)
 */
@CdkDslMarker
public class CfnDomainSnapshotOptionsPropertyDsl {
    private val cdkBuilder: CfnDomain.SnapshotOptionsProperty.Builder =
        CfnDomain.SnapshotOptionsProperty.builder()

    /**
     * @param automatedSnapshotStartHour The hour in UTC during which the service takes an automated
     *   daily snapshot of the indexes in the OpenSearch Service domain. For example, if you specify
     *   0, OpenSearch Service takes an automated snapshot everyday between midnight and 1 am. You
     *   can specify a value between 0 and 23.
     */
    public fun automatedSnapshotStartHour(automatedSnapshotStartHour: Number) {
        cdkBuilder.automatedSnapshotStartHour(automatedSnapshotStartHour)
    }

    public fun build(): CfnDomain.SnapshotOptionsProperty = cdkBuilder.build()
}
