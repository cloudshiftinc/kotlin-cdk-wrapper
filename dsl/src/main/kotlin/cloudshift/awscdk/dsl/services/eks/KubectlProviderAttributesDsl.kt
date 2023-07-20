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

package cloudshift.awscdk.dsl.services.eks

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.eks.KubectlProviderAttributes
import software.amazon.awscdk.services.iam.IRole
import kotlin.String

@CdkDslMarker
public class KubectlProviderAttributesDsl {
    private val cdkBuilder: KubectlProviderAttributes.Builder = KubectlProviderAttributes.builder()

    public fun functionArn(functionArn: String) {
        cdkBuilder.functionArn(functionArn)
    }

    public fun handlerRole(handlerRole: IRole) {
        cdkBuilder.handlerRole(handlerRole)
    }

    public fun kubectlRoleArn(kubectlRoleArn: String) {
        cdkBuilder.kubectlRoleArn(kubectlRoleArn)
    }

    public fun build(): KubectlProviderAttributes = cdkBuilder.build()
}
