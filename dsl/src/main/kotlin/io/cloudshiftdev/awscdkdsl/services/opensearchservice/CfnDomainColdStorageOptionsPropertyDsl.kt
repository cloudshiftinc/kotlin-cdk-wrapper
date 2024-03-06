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

package io.cloudshiftdev.awscdkdsl.services.opensearchservice

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.Boolean
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.opensearchservice.CfnDomain

/**
 * Container for the parameters required to enable cold storage for an OpenSearch Service domain.
 *
 * For more information, see
 * [Cold storage for Amazon OpenSearch Service](https://docs.aws.amazon.com/opensearch-service/latest/developerguide/cold-storage.html)
 * .
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.opensearchservice.*;
 * ColdStorageOptionsProperty coldStorageOptionsProperty = ColdStorageOptionsProperty.builder()
 * .enabled(false)
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opensearchservice-domain-coldstorageoptions.html)
 */
@CdkDslMarker
public class CfnDomainColdStorageOptionsPropertyDsl {
    private val cdkBuilder: CfnDomain.ColdStorageOptionsProperty.Builder =
        CfnDomain.ColdStorageOptionsProperty.builder()

    /**
     * @param enabled Whether to enable or disable cold storage on the domain. You must enable
     *   UltraWarm storage to enable cold storage.
     */
    public fun enabled(enabled: Boolean) {
        cdkBuilder.enabled(enabled)
    }

    /**
     * @param enabled Whether to enable or disable cold storage on the domain. You must enable
     *   UltraWarm storage to enable cold storage.
     */
    public fun enabled(enabled: IResolvable) {
        cdkBuilder.enabled(enabled)
    }

    public fun build(): CfnDomain.ColdStorageOptionsProperty = cdkBuilder.build()
}
