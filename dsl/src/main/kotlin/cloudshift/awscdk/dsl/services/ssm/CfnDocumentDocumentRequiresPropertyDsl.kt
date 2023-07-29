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

package cloudshift.awscdk.dsl.services.ssm

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.ssm.CfnDocument

/**
 * An SSM document required by the current document.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.ssm.*;
 * DocumentRequiresProperty documentRequiresProperty = DocumentRequiresProperty.builder()
 * .name("name")
 * .version("version")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssm-document-documentrequires.html)
 */
@CdkDslMarker
public class CfnDocumentDocumentRequiresPropertyDsl {
    private val cdkBuilder: CfnDocument.DocumentRequiresProperty.Builder =
        CfnDocument.DocumentRequiresProperty.builder()

    /**
     * @param name The name of the required SSM document. The name can be an Amazon Resource Name
     *   (ARN).
     */
    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    /** @param version The document version required by the current document. */
    public fun version(version: String) {
        cdkBuilder.version(version)
    }

    public fun build(): CfnDocument.DocumentRequiresProperty = cdkBuilder.build()
}
