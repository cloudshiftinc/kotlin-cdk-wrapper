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

package io.cloudshiftdev.awscdkdsl.services.synthetics

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import io.cloudshiftdev.awscdkdsl.services.s3.LocationDsl
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.s3.Location
import software.amazon.awscdk.services.synthetics.CodeConfig

/**
 * Configuration of the code class.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.synthetics.*;
 * CodeConfig codeConfig = CodeConfig.builder()
 * .inlineCode("inlineCode")
 * .s3Location(Location.builder()
 * .bucketName("bucketName")
 * .objectKey("objectKey")
 * // the properties below are optional
 * .objectVersion("objectVersion")
 * .build())
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

    /** @param s3Location The location of the code in S3 (mutually exclusive with `inlineCode`). */
    public fun s3Location(s3Location: LocationDsl.() -> Unit = {}) {
        val builder = LocationDsl()
        builder.apply(s3Location)
        cdkBuilder.s3Location(builder.build())
    }

    /** @param s3Location The location of the code in S3 (mutually exclusive with `inlineCode`). */
    public fun s3Location(s3Location: Location) {
        cdkBuilder.s3Location(s3Location)
    }

    public fun build(): CodeConfig = cdkBuilder.build()
}
