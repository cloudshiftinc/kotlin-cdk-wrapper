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
import software.amazon.awscdk.services.stepfunctions.tasks.DataSource
import software.amazon.awscdk.services.stepfunctions.tasks.S3DataSource
import kotlin.Unit

@CdkDslMarker
public class DataSourceDsl {
    private val cdkBuilder: DataSource.Builder = DataSource.builder()

    public fun s3DataSource(block: S3DataSourceDsl.() -> Unit = {}) {
        val builder = S3DataSourceDsl()
        builder.apply(block)
        cdkBuilder.s3DataSource(builder.build())
    }

    public fun s3DataSource(s3DataSource: S3DataSource) {
        cdkBuilder.s3DataSource(s3DataSource)
    }

    public fun build(): DataSource = cdkBuilder.build()
}
