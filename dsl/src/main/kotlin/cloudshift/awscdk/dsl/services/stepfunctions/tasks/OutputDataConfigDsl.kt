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
import software.amazon.awscdk.services.kms.IKey
import software.amazon.awscdk.services.stepfunctions.tasks.OutputDataConfig
import software.amazon.awscdk.services.stepfunctions.tasks.S3Location

@CdkDslMarker
public class OutputDataConfigDsl {
    private val cdkBuilder: OutputDataConfig.Builder = OutputDataConfig.builder()

    public fun encryptionKey(encryptionKey: IKey) {
        cdkBuilder.encryptionKey(encryptionKey)
    }

    public fun s3OutputLocation(s3OutputLocation: S3Location) {
        cdkBuilder.s3OutputLocation(s3OutputLocation)
    }

    public fun build(): OutputDataConfig = cdkBuilder.build()
}
