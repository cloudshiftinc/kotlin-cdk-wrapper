@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION",
)

package cloudshift.awscdk.dsl.services.greengrass

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.greengrass.CfnResourceDefinition
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList

@CdkDslMarker
public class CfnResourceDefinitionSecretsManagerSecretResourceDataPropertyDsl {
    private val cdkBuilder: CfnResourceDefinition.SecretsManagerSecretResourceDataProperty.Builder =
        CfnResourceDefinition.SecretsManagerSecretResourceDataProperty.builder()

    private val _additionalStagingLabelsToDownload: MutableList<String> = mutableListOf()

    public fun additionalStagingLabelsToDownload(vararg additionalStagingLabelsToDownload: String) {
        _additionalStagingLabelsToDownload.addAll(listOf(*additionalStagingLabelsToDownload))
    }

    public fun additionalStagingLabelsToDownload(additionalStagingLabelsToDownload: Collection<String>) {
        _additionalStagingLabelsToDownload.addAll(additionalStagingLabelsToDownload)
    }

    public fun arn(arn: String) {
        cdkBuilder.arn(arn)
    }

    public fun build(): CfnResourceDefinition.SecretsManagerSecretResourceDataProperty {
        if (_additionalStagingLabelsToDownload.isNotEmpty()) {
            cdkBuilder.additionalStagingLabelsToDownload(_additionalStagingLabelsToDownload)
        }
        return cdkBuilder.build()
    }
}
