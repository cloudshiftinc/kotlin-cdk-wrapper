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

package cloudshift.awscdk.dsl.services.emr

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.emr.CfnStudioSessionMappingProps
import kotlin.String

@CdkDslMarker
public class CfnStudioSessionMappingPropsDsl {
    private val cdkBuilder: CfnStudioSessionMappingProps.Builder =
        CfnStudioSessionMappingProps.builder()

    public fun identityName(identityName: String) {
        cdkBuilder.identityName(identityName)
    }

    public fun identityType(identityType: String) {
        cdkBuilder.identityType(identityType)
    }

    public fun sessionPolicyArn(sessionPolicyArn: String) {
        cdkBuilder.sessionPolicyArn(sessionPolicyArn)
    }

    public fun studioId(studioId: String) {
        cdkBuilder.studioId(studioId)
    }

    public fun build(): CfnStudioSessionMappingProps = cdkBuilder.build()
}
