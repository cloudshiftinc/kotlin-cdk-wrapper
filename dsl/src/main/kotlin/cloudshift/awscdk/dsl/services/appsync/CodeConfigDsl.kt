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

package cloudshift.awscdk.dsl.services.appsync

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.appsync.CodeConfig
import kotlin.String

@CdkDslMarker
public class CodeConfigDsl {
    private val cdkBuilder: CodeConfig.Builder = CodeConfig.builder()

    public fun inlineCode(inlineCode: String) {
        cdkBuilder.inlineCode(inlineCode)
    }

    public fun s3Location(s3Location: String) {
        cdkBuilder.s3Location(s3Location)
    }

    public fun build(): CodeConfig = cdkBuilder.build()
}
