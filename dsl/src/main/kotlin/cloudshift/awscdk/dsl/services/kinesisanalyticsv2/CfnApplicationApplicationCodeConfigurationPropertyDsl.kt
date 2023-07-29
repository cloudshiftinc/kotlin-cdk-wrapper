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

package cloudshift.awscdk.dsl.services.kinesisanalyticsv2

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.kinesisanalyticsv2.CfnApplication

/**
 * Describes code configuration for an application.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.kinesisanalyticsv2.*;
 * ApplicationCodeConfigurationProperty applicationCodeConfigurationProperty =
 * ApplicationCodeConfigurationProperty.builder()
 * .codeContent(CodeContentProperty.builder()
 * .s3ContentLocation(S3ContentLocationProperty.builder()
 * .bucketArn("bucketArn")
 * .fileKey("fileKey")
 * // the properties below are optional
 * .objectVersion("objectVersion")
 * .build())
 * .textContent("textContent")
 * .zipFileContent("zipFileContent")
 * .build())
 * .codeContentType("codeContentType")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-application-applicationcodeconfiguration.html)
 */
@CdkDslMarker
public class CfnApplicationApplicationCodeConfigurationPropertyDsl {
    private val cdkBuilder: CfnApplication.ApplicationCodeConfigurationProperty.Builder =
        CfnApplication.ApplicationCodeConfigurationProperty.builder()

    /** @param codeContent The location and type of the application code. */
    public fun codeContent(codeContent: IResolvable) {
        cdkBuilder.codeContent(codeContent)
    }

    /** @param codeContent The location and type of the application code. */
    public fun codeContent(codeContent: CfnApplication.CodeContentProperty) {
        cdkBuilder.codeContent(codeContent)
    }

    /** @param codeContentType Specifies whether the code content is in text or zip format. */
    public fun codeContentType(codeContentType: String) {
        cdkBuilder.codeContentType(codeContentType)
    }

    public fun build(): CfnApplication.ApplicationCodeConfigurationProperty = cdkBuilder.build()
}
