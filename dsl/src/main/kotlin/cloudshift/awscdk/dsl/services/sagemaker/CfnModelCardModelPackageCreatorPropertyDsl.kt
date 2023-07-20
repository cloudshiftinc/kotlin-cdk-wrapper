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

package cloudshift.awscdk.dsl.services.sagemaker

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.sagemaker.CfnModelCard
import kotlin.String

@CdkDslMarker
public class CfnModelCardModelPackageCreatorPropertyDsl {
    private val cdkBuilder: CfnModelCard.ModelPackageCreatorProperty.Builder =
        CfnModelCard.ModelPackageCreatorProperty.builder()

    public fun userProfileName(userProfileName: String) {
        cdkBuilder.userProfileName(userProfileName)
    }

    public fun build(): CfnModelCard.ModelPackageCreatorProperty = cdkBuilder.build()
}
