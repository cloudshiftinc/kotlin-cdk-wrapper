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

package cloudshift.awscdk.dsl.services.codecommit

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Unit
import software.amazon.awscdk.services.codecommit.CfnRepository
import software.amazon.awscdk.services.codecommit.CodeConfig

/**
 * Represents the structure to pass into the underlying CfnRepository class.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.codecommit.*;
 * CodeConfig codeConfig = CodeConfig.builder()
 * .code(CodeProperty.builder()
 * .s3(S3Property.builder()
 * .bucket("bucket")
 * .key("key")
 * // the properties below are optional
 * .objectVersion("objectVersion")
 * .build())
 * // the properties below are optional
 * .branchName("branchName")
 * .build())
 * .build();
 * ```
 */
@CdkDslMarker
public class CodeConfigDsl {
    private val cdkBuilder: CodeConfig.Builder = CodeConfig.builder()

    /** @param code represents the underlying code structure. */
    public fun code(code: CfnRepositoryCodePropertyDsl.() -> Unit = {}) {
        val builder = CfnRepositoryCodePropertyDsl()
        builder.apply(code)
        cdkBuilder.code(builder.build())
    }

    /** @param code represents the underlying code structure. */
    public fun code(code: CfnRepository.CodeProperty) {
        cdkBuilder.code(code)
    }

    public fun build(): CodeConfig = cdkBuilder.build()
}
