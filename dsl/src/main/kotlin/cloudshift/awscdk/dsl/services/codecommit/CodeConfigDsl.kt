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

package cloudshift.awscdk.dsl.services.codecommit

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.codecommit.CfnRepository
import software.amazon.awscdk.services.codecommit.CodeConfig
import kotlin.Unit

@CdkDslMarker
public class CodeConfigDsl {
    private val cdkBuilder: CodeConfig.Builder = CodeConfig.builder()

    public fun code(block: CfnRepositoryCodePropertyDsl.() -> Unit = {}) {
        val builder = CfnRepositoryCodePropertyDsl()
        builder.apply(block)
        cdkBuilder.code(builder.build())
    }

    public fun code(code: CfnRepository.CodeProperty) {
        cdkBuilder.code(code)
    }

    public fun build(): CodeConfig = cdkBuilder.build()
}
