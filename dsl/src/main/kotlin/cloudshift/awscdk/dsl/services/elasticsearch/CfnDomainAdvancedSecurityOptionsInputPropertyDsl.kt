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
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.elasticsearch.CfnDomain

/**
 * Specifies options for fine-grained access control.
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
 * AdvancedSecurityOptionsInputProperty advancedSecurityOptionsInputProperty =
 * AdvancedSecurityOptionsInputProperty.builder()
 * .anonymousAuthEnabled(false)
 * .enabled(false)
 * .internalUserDatabaseEnabled(false)
 * .masterUserOptions(MasterUserOptionsProperty.builder()
 * .masterUserArn("masterUserArn")
 * .masterUserName("masterUserName")
 * .masterUserPassword("masterUserPassword")
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticsearch-domain-advancedsecurityoptionsinput.html)
 */
@CdkDslMarker
public class CfnDomainAdvancedSecurityOptionsInputPropertyDsl {
    private val cdkBuilder: CfnDomain.AdvancedSecurityOptionsInputProperty.Builder =
        CfnDomain.AdvancedSecurityOptionsInputProperty.builder()

    /** @param anonymousAuthEnabled the value to be set. */
    public fun anonymousAuthEnabled(anonymousAuthEnabled: Boolean) {
        cdkBuilder.anonymousAuthEnabled(anonymousAuthEnabled)
    }

    /** @param anonymousAuthEnabled the value to be set. */
    public fun anonymousAuthEnabled(anonymousAuthEnabled: IResolvable) {
        cdkBuilder.anonymousAuthEnabled(anonymousAuthEnabled)
    }

    /**
     * @param enabled True to enable fine-grained access control. You must also enable encryption of
     *   data at rest and node-to-node encryption.
     */
    public fun enabled(enabled: Boolean) {
        cdkBuilder.enabled(enabled)
    }

    /**
     * @param enabled True to enable fine-grained access control. You must also enable encryption of
     *   data at rest and node-to-node encryption.
     */
    public fun enabled(enabled: IResolvable) {
        cdkBuilder.enabled(enabled)
    }

    /** @param internalUserDatabaseEnabled True to enable the internal user database. */
    public fun internalUserDatabaseEnabled(internalUserDatabaseEnabled: Boolean) {
        cdkBuilder.internalUserDatabaseEnabled(internalUserDatabaseEnabled)
    }

    /** @param internalUserDatabaseEnabled True to enable the internal user database. */
    public fun internalUserDatabaseEnabled(internalUserDatabaseEnabled: IResolvable) {
        cdkBuilder.internalUserDatabaseEnabled(internalUserDatabaseEnabled)
    }

    /** @param masterUserOptions Specifies information about the master user. */
    public fun masterUserOptions(masterUserOptions: IResolvable) {
        cdkBuilder.masterUserOptions(masterUserOptions)
    }

    /** @param masterUserOptions Specifies information about the master user. */
    public fun masterUserOptions(masterUserOptions: CfnDomain.MasterUserOptionsProperty) {
        cdkBuilder.masterUserOptions(masterUserOptions)
    }

    public fun build(): CfnDomain.AdvancedSecurityOptionsInputProperty = cdkBuilder.build()
}
