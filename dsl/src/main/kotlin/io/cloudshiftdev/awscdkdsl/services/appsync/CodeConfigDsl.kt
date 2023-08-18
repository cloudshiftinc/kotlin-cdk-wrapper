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

package io.cloudshiftdev.awscdkdsl.services.appsync

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.appsync.CodeConfig

/**
 * Result of binding `Code` into a `Function`.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.appsync.*;
 * CodeConfig codeConfig = CodeConfig.builder()
 * .inlineCode("inlineCode")
 * .s3Location("s3Location")
 * .build();
 * ```
 */
@CdkDslMarker
public class CodeConfigDsl {
    private val cdkBuilder: CodeConfig.Builder = CodeConfig.builder()

    /** @param inlineCode Inline code (mutually exclusive with `s3Location`). */
    public fun inlineCode(inlineCode: String) {
        cdkBuilder.inlineCode(inlineCode)
    }

    /** @param s3Location The location of the code in S3 (mutually exclusive with `inlineCode`. */
    public fun s3Location(s3Location: String) {
        cdkBuilder.s3Location(s3Location)
    }

    public fun build(): CodeConfig = cdkBuilder.build()
}
