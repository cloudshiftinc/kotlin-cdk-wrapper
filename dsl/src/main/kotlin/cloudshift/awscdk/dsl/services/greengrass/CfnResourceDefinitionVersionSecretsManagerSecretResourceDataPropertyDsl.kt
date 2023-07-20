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
import software.amazon.awscdk.services.greengrass.CfnResourceDefinitionVersion
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList

@CdkDslMarker
public class CfnResourceDefinitionVersionSecretsManagerSecretResourceDataPropertyDsl {
    private val cdkBuilder:
        CfnResourceDefinitionVersion.SecretsManagerSecretResourceDataProperty.Builder =
        CfnResourceDefinitionVersion.SecretsManagerSecretResourceDataProperty.builder()

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

    public fun build(): CfnResourceDefinitionVersion.SecretsManagerSecretResourceDataProperty {
        if (_additionalStagingLabelsToDownload.isNotEmpty()) {
            cdkBuilder.additionalStagingLabelsToDownload(_additionalStagingLabelsToDownload)
        }
        return cdkBuilder.build()
    }
}
