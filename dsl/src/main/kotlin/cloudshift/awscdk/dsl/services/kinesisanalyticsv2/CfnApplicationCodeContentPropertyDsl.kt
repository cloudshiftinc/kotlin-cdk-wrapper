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

package cloudshift.awscdk.dsl.services.kinesisanalyticsv2

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.kinesisanalyticsv2.CfnApplication
import kotlin.String

@CdkDslMarker
public class CfnApplicationCodeContentPropertyDsl {
    private val cdkBuilder: CfnApplication.CodeContentProperty.Builder =
        CfnApplication.CodeContentProperty.builder()

    public fun s3ContentLocation(s3ContentLocation: IResolvable) {
        cdkBuilder.s3ContentLocation(s3ContentLocation)
    }

    public fun s3ContentLocation(s3ContentLocation: CfnApplication.S3ContentLocationProperty) {
        cdkBuilder.s3ContentLocation(s3ContentLocation)
    }

    public fun textContent(textContent: String) {
        cdkBuilder.textContent(textContent)
    }

    public fun zipFileContent(zipFileContent: String) {
        cdkBuilder.zipFileContent(zipFileContent)
    }

    public fun build(): CfnApplication.CodeContentProperty = cdkBuilder.build()
}
