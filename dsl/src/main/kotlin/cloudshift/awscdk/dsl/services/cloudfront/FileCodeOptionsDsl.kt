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

package cloudshift.awscdk.dsl.services.cloudfront

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.cloudfront.FileCodeOptions
import kotlin.String

@CdkDslMarker
public class FileCodeOptionsDsl {
    private val cdkBuilder: FileCodeOptions.Builder = FileCodeOptions.builder()

    public fun filePath(filePath: String) {
        cdkBuilder.filePath(filePath)
    }

    public fun build(): FileCodeOptions = cdkBuilder.build()
}
