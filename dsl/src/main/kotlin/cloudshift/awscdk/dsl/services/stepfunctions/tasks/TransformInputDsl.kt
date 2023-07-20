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
import software.amazon.awscdk.services.stepfunctions.tasks.CompressionType
import software.amazon.awscdk.services.stepfunctions.tasks.SplitType
import software.amazon.awscdk.services.stepfunctions.tasks.TransformDataSource
import software.amazon.awscdk.services.stepfunctions.tasks.TransformInput
import kotlin.String
import kotlin.Unit

@CdkDslMarker
public class TransformInputDsl {
    private val cdkBuilder: TransformInput.Builder = TransformInput.builder()

    public fun compressionType(compressionType: CompressionType) {
        cdkBuilder.compressionType(compressionType)
    }

    public fun contentType(contentType: String) {
        cdkBuilder.contentType(contentType)
    }

    public fun splitType(splitType: SplitType) {
        cdkBuilder.splitType(splitType)
    }

    public fun transformDataSource(block: TransformDataSourceDsl.() -> Unit = {}) {
        val builder = TransformDataSourceDsl()
        builder.apply(block)
        cdkBuilder.transformDataSource(builder.build())
    }

    public fun transformDataSource(transformDataSource: TransformDataSource) {
        cdkBuilder.transformDataSource(transformDataSource)
    }

    public fun build(): TransformInput = cdkBuilder.build()
}
