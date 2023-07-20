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

package cloudshift.awscdk.dsl.services.dynamodb

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.dynamodb.CfnTable
import kotlin.String

@CdkDslMarker
public class CfnTableImportSourceSpecificationPropertyDsl {
    private val cdkBuilder: CfnTable.ImportSourceSpecificationProperty.Builder =
        CfnTable.ImportSourceSpecificationProperty.builder()

    public fun inputCompressionType(inputCompressionType: String) {
        cdkBuilder.inputCompressionType(inputCompressionType)
    }

    public fun inputFormat(inputFormat: String) {
        cdkBuilder.inputFormat(inputFormat)
    }

    public fun inputFormatOptions(inputFormatOptions: IResolvable) {
        cdkBuilder.inputFormatOptions(inputFormatOptions)
    }

    public fun inputFormatOptions(inputFormatOptions: CfnTable.InputFormatOptionsProperty) {
        cdkBuilder.inputFormatOptions(inputFormatOptions)
    }

    public fun s3BucketSource(s3BucketSource: IResolvable) {
        cdkBuilder.s3BucketSource(s3BucketSource)
    }

    public fun s3BucketSource(s3BucketSource: CfnTable.S3BucketSourceProperty) {
        cdkBuilder.s3BucketSource(s3BucketSource)
    }

    public fun build(): CfnTable.ImportSourceSpecificationProperty = cdkBuilder.build()
}
