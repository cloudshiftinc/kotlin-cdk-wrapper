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

package cloudshift.awscdk.dsl.services.applicationinsights

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.applicationinsights.CfnApplication
import kotlin.Boolean
import kotlin.String

@CdkDslMarker
public class CfnApplicationHANAPrometheusExporterPropertyDsl {
    private val cdkBuilder: CfnApplication.HANAPrometheusExporterProperty.Builder =
        CfnApplication.HANAPrometheusExporterProperty.builder()

    public fun agreeToInstallHanadbClient(agreeToInstallHanadbClient: Boolean) {
        cdkBuilder.agreeToInstallHanadbClient(agreeToInstallHanadbClient)
    }

    public fun agreeToInstallHanadbClient(agreeToInstallHanadbClient: IResolvable) {
        cdkBuilder.agreeToInstallHanadbClient(agreeToInstallHanadbClient)
    }

    public fun hanaPort(hanaPort: String) {
        cdkBuilder.hanaPort(hanaPort)
    }

    public fun hanaSecretName(hanaSecretName: String) {
        cdkBuilder.hanaSecretName(hanaSecretName)
    }

    public fun hanasid(hanasid: String) {
        cdkBuilder.hanasid(hanasid)
    }

    public fun prometheusPort(prometheusPort: String) {
        cdkBuilder.prometheusPort(prometheusPort)
    }

    public fun build(): CfnApplication.HANAPrometheusExporterProperty = cdkBuilder.build()
}
