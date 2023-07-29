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

package cloudshift.awscdk.dsl.services.wisdom

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.wisdom.CfnKnowledgeBase

/**
 * Configuration information about the external data source.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.wisdom.*;
 * SourceConfigurationProperty sourceConfigurationProperty = SourceConfigurationProperty.builder()
 * .appIntegrations(AppIntegrationsConfigurationProperty.builder()
 * .appIntegrationArn("appIntegrationArn")
 * // the properties below are optional
 * .objectFields(List.of("objectFields"))
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wisdom-knowledgebase-sourceconfiguration.html)
 */
@CdkDslMarker
public class CfnKnowledgeBaseSourceConfigurationPropertyDsl {
    private val cdkBuilder: CfnKnowledgeBase.SourceConfigurationProperty.Builder =
        CfnKnowledgeBase.SourceConfigurationProperty.builder()

    /**
     * @param appIntegrations Configuration information for Amazon AppIntegrations to automatically
     *   ingest content.
     */
    public fun appIntegrations(appIntegrations: IResolvable) {
        cdkBuilder.appIntegrations(appIntegrations)
    }

    /**
     * @param appIntegrations Configuration information for Amazon AppIntegrations to automatically
     *   ingest content.
     */
    public fun appIntegrations(
        appIntegrations: CfnKnowledgeBase.AppIntegrationsConfigurationProperty
    ) {
        cdkBuilder.appIntegrations(appIntegrations)
    }

    public fun build(): CfnKnowledgeBase.SourceConfigurationProperty = cdkBuilder.build()
}
