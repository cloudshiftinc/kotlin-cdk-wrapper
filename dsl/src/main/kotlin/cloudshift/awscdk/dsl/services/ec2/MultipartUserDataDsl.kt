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

package cloudshift.awscdk.dsl.services.ec2

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.ec2.MultipartUserData
import kotlin.String

@CdkDslMarker
public class MultipartUserDataDsl {
    private val cdkBuilder: MultipartUserData.Builder = MultipartUserData.Builder.create()

    public fun partsSeparator(partsSeparator: String) {
        cdkBuilder.partsSeparator(partsSeparator)
    }

    public fun build(): MultipartUserData = cdkBuilder.build()
}
