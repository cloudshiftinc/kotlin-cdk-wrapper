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
import software.amazon.awscdk.services.stepfunctions.tasks.AssembleWith
import software.amazon.awscdk.services.stepfunctions.tasks.TransformOutput
import kotlin.String

@CdkDslMarker
public class TransformOutputDsl {
    private val cdkBuilder: TransformOutput.Builder = TransformOutput.builder()

    public fun accept(accept: String) {
        cdkBuilder.accept(accept)
    }

    public fun assembleWith(assembleWith: AssembleWith) {
        cdkBuilder.assembleWith(assembleWith)
    }

    public fun encryptionKey(encryptionKey: IKey) {
        cdkBuilder.encryptionKey(encryptionKey)
    }

    public fun s3OutputPath(s3OutputPath: String) {
        cdkBuilder.s3OutputPath(s3OutputPath)
    }

    public fun build(): TransformOutput = cdkBuilder.build()
}
