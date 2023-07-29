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

package cloudshift.awscdk.dsl.services.synthetics

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.synthetics.CfnCanary

/**
 * Use this structure to input your script code for the canary.
 *
 * This structure contains the Lambda handler with the location where the canary should start
 * running the script. If the script is stored in an S3 bucket, the bucket name, key, and version
 * are also included. If the script is passed into the canary directly, the script code is contained
 * in the value of `Script` .
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.synthetics.*;
 * CodeProperty codeProperty = CodeProperty.builder()
 * .handler("handler")
 * // the properties below are optional
 * .s3Bucket("s3Bucket")
 * .s3Key("s3Key")
 * .s3ObjectVersion("s3ObjectVersion")
 * .script("script")
 * .sourceLocationArn("sourceLocationArn")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-synthetics-canary-code.html)
 */
@CdkDslMarker
public class CfnCanaryCodePropertyDsl {
    private val cdkBuilder: CfnCanary.CodeProperty.Builder = CfnCanary.CodeProperty.builder()

    /**
     * @param handler The entry point to use for the source code when running the canary. For
     *   canaries that use the `syn-python-selenium-1.0` runtime or a `syn-nodejs.puppeteer` runtime
     *   earlier than `syn-nodejs.puppeteer-3.4` , the handler must be specified as `*fileName*
     *   .handler` . For `syn-python-selenium-1.1` , `syn-nodejs.puppeteer-3.4` , and later
     *   runtimes, the handler can be specified as `*fileName* . *functionName*` , or you can
     *   specify a folder where canary scripts reside as `*folder* / *fileName* . *functionName*` .
     */
    public fun handler(handler: String) {
        cdkBuilder.handler(handler)
    }

    /**
     * @param s3Bucket If your canary script is located in S3, specify the bucket name here. The
     *   bucket must already exist.
     */
    public fun s3Bucket(s3Bucket: String) {
        cdkBuilder.s3Bucket(s3Bucket)
    }

    /**
     * @param s3Key The S3 key of your script. For more information, see
     *   [Working with Amazon S3 Objects](https://docs.aws.amazon.com/AmazonS3/latest/dev/UsingObjects.html)
     *   .
     */
    public fun s3Key(s3Key: String) {
        cdkBuilder.s3Key(s3Key)
    }

    /** @param s3ObjectVersion The S3 version ID of your script. */
    public fun s3ObjectVersion(s3ObjectVersion: String) {
        cdkBuilder.s3ObjectVersion(s3ObjectVersion)
    }

    /**
     * @param script If you input your canary script directly into the canary instead of referring
     *   to an S3 location, the value of this parameter is the script in plain text. It can be up to
     *   5 MB.
     */
    public fun script(script: String) {
        cdkBuilder.script(script)
    }

    /**
     * @param sourceLocationArn The ARN of the Lambda layer where Synthetics stores the canary
     *   script code.
     */
    public fun sourceLocationArn(sourceLocationArn: String) {
        cdkBuilder.sourceLocationArn(sourceLocationArn)
    }

    public fun build(): CfnCanary.CodeProperty = cdkBuilder.build()
}
