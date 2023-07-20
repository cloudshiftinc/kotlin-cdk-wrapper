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

package cloudshift.awscdk.dsl.services.macie

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.macie.CfnAllowList
import kotlin.String

@CdkDslMarker
public class CfnAllowListS3WordsListPropertyDsl {
    private val cdkBuilder: CfnAllowList.S3WordsListProperty.Builder =
        CfnAllowList.S3WordsListProperty.builder()

    public fun bucketName(bucketName: String) {
        cdkBuilder.bucketName(bucketName)
    }

    public fun objectKey(objectKey: String) {
        cdkBuilder.objectKey(objectKey)
    }

    public fun build(): CfnAllowList.S3WordsListProperty = cdkBuilder.build()
}
