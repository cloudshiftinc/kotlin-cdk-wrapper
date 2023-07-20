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

package cloudshift.awscdk.dsl.services.appstream

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.appstream.CfnAppBlock
import kotlin.Number
import kotlin.String

@CdkDslMarker
public class CfnAppBlockScriptDetailsPropertyDsl {
    private val cdkBuilder: CfnAppBlock.ScriptDetailsProperty.Builder =
        CfnAppBlock.ScriptDetailsProperty.builder()

    public fun executableParameters(executableParameters: String) {
        cdkBuilder.executableParameters(executableParameters)
    }

    public fun executablePath(executablePath: String) {
        cdkBuilder.executablePath(executablePath)
    }

    public fun scriptS3Location(scriptS3Location: IResolvable) {
        cdkBuilder.scriptS3Location(scriptS3Location)
    }

    public fun scriptS3Location(scriptS3Location: CfnAppBlock.S3LocationProperty) {
        cdkBuilder.scriptS3Location(scriptS3Location)
    }

    public fun timeoutInSeconds(timeoutInSeconds: Number) {
        cdkBuilder.timeoutInSeconds(timeoutInSeconds)
    }

    public fun build(): CfnAppBlock.ScriptDetailsProperty = cdkBuilder.build()
}
