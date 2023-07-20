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

package cloudshift.awscdk.dsl.services.sam

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.sam.CfnFunction
import kotlin.Number
import kotlin.String

@CdkDslMarker
public class CfnFunctionHttpApiEventPropertyDsl {
    private val cdkBuilder: CfnFunction.HttpApiEventProperty.Builder =
        CfnFunction.HttpApiEventProperty.builder()

    public fun apiId(apiId: String) {
        cdkBuilder.apiId(apiId)
    }

    public fun auth(auth: IResolvable) {
        cdkBuilder.auth(auth)
    }

    public fun auth(auth: CfnFunction.HttpApiFunctionAuthProperty) {
        cdkBuilder.auth(auth)
    }

    public fun method(method: String) {
        cdkBuilder.method(method)
    }

    public fun path(path: String) {
        cdkBuilder.path(path)
    }

    public fun payloadFormatVersion(payloadFormatVersion: String) {
        cdkBuilder.payloadFormatVersion(payloadFormatVersion)
    }

    public fun routeSettings(routeSettings: IResolvable) {
        cdkBuilder.routeSettings(routeSettings)
    }

    public fun routeSettings(routeSettings: CfnFunction.RouteSettingsProperty) {
        cdkBuilder.routeSettings(routeSettings)
    }

    public fun timeoutInMillis(timeoutInMillis: Number) {
        cdkBuilder.timeoutInMillis(timeoutInMillis)
    }

    public fun build(): CfnFunction.HttpApiEventProperty = cdkBuilder.build()
}
