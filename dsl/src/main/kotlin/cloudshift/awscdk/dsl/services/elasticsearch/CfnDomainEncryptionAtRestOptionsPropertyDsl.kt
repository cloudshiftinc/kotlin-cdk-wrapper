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

package cloudshift.awscdk.dsl.services.elasticsearch

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.elasticsearch.CfnDomain

/**
 * Whether the domain should encrypt data at rest, and if so, the AWS Key Management Service key to
 * use.
 *
 * The `AWS::Elasticsearch::Domain` resource is being replaced by the
 * [AWS::OpenSearchService::Domain](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opensearchservice-domain.html)
 * resource. While the legacy Elasticsearch resource and options are still supported, we recommend
 * modifying your existing Cloudformation templates to use the new OpenSearch Service resource,
 * which supports both OpenSearch and Elasticsearch. For more information about the service rename,
 * see
 * [New resource types](https://docs.aws.amazon.com/opensearch-service/latest/developerguide/rename.html#rename-resource)
 * in the *Amazon OpenSearch Service Developer Guide* .
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.elasticsearch.*;
 * EncryptionAtRestOptionsProperty encryptionAtRestOptionsProperty =
 * EncryptionAtRestOptionsProperty.builder()
 * .enabled(false)
 * .kmsKeyId("kmsKeyId")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticsearch-domain-encryptionatrestoptions.html)
 */
@CdkDslMarker
public class CfnDomainEncryptionAtRestOptionsPropertyDsl {
    private val cdkBuilder: CfnDomain.EncryptionAtRestOptionsProperty.Builder =
        CfnDomain.EncryptionAtRestOptionsProperty.builder()

    /** @param enabled Specify `true` to enable encryption at rest. */
    public fun enabled(enabled: Boolean) {
        cdkBuilder.enabled(enabled)
    }

    /** @param enabled Specify `true` to enable encryption at rest. */
    public fun enabled(enabled: IResolvable) {
        cdkBuilder.enabled(enabled)
    }

    /**
     * @param kmsKeyId The KMS key ID. Takes the form `1a2a3a4-1a2a-3a4a-5a6a-1a2a3a4a5a6a` .
     *   Required if you enable encryption at rest.
     */
    public fun kmsKeyId(kmsKeyId: String) {
        cdkBuilder.kmsKeyId(kmsKeyId)
    }

    public fun build(): CfnDomain.EncryptionAtRestOptionsProperty = cdkBuilder.build()
}
