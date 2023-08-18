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

package io.cloudshiftdev.awscdkdsl.services.appstream

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.appstream.CfnAppBlock

/**
 * The details of the script.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.appstream.*;
 * ScriptDetailsProperty scriptDetailsProperty = ScriptDetailsProperty.builder()
 * .executablePath("executablePath")
 * .scriptS3Location(S3LocationProperty.builder()
 * .s3Bucket("s3Bucket")
 * // the properties below are optional
 * .s3Key("s3Key")
 * .build())
 * .timeoutInSeconds(123)
 * // the properties below are optional
 * .executableParameters("executableParameters")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appstream-appblock-scriptdetails.html)
 */
@CdkDslMarker
public class CfnAppBlockScriptDetailsPropertyDsl {
    private val cdkBuilder: CfnAppBlock.ScriptDetailsProperty.Builder =
        CfnAppBlock.ScriptDetailsProperty.builder()

    /** @param executableParameters The parameters used in the run path for the script. */
    public fun executableParameters(executableParameters: String) {
        cdkBuilder.executableParameters(executableParameters)
    }

    /** @param executablePath The run path for the script. */
    public fun executablePath(executablePath: String) {
        cdkBuilder.executablePath(executablePath)
    }

    /** @param scriptS3Location The S3 object location of the script. */
    public fun scriptS3Location(scriptS3Location: IResolvable) {
        cdkBuilder.scriptS3Location(scriptS3Location)
    }

    /** @param scriptS3Location The S3 object location of the script. */
    public fun scriptS3Location(scriptS3Location: CfnAppBlock.S3LocationProperty) {
        cdkBuilder.scriptS3Location(scriptS3Location)
    }

    /** @param timeoutInSeconds The run timeout, in seconds, for the script. */
    public fun timeoutInSeconds(timeoutInSeconds: Number) {
        cdkBuilder.timeoutInSeconds(timeoutInSeconds)
    }

    public fun build(): CfnAppBlock.ScriptDetailsProperty = cdkBuilder.build()
}
