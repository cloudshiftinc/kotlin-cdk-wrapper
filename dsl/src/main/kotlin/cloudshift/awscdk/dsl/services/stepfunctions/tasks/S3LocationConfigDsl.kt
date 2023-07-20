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

package cloudshift.awscdk.dsl.services.stepfunctions.tasks

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.stepfunctions.tasks.S3LocationConfig
import kotlin.String

@CdkDslMarker
public class S3LocationConfigDsl {
    private val cdkBuilder: S3LocationConfig.Builder = S3LocationConfig.builder()

    public fun uri(uri: String) {
        cdkBuilder.uri(uri)
    }

    public fun build(): S3LocationConfig = cdkBuilder.build()
}
