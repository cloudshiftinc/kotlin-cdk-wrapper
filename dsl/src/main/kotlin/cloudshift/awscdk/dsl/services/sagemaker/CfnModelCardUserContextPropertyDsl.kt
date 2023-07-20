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
public class CfnModelCardUserContextPropertyDsl {
    private val cdkBuilder: CfnModelCard.UserContextProperty.Builder =
        CfnModelCard.UserContextProperty.builder()

    public fun domainId(domainId: String) {
        cdkBuilder.domainId(domainId)
    }

    public fun userProfileArn(userProfileArn: String) {
        cdkBuilder.userProfileArn(userProfileArn)
    }

    public fun userProfileName(userProfileName: String) {
        cdkBuilder.userProfileName(userProfileName)
    }

    public fun build(): CfnModelCard.UserContextProperty = cdkBuilder.build()
}
