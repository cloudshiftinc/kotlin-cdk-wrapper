@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION"
)

package cloudshift.awscdk.dsl.services.sam

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.sam.CfnSimpleTable

/**
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.sam.*;
 * SSESpecificationProperty sSESpecificationProperty = SSESpecificationProperty.builder()
 * .sseEnabled(false)
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-serverless-simpletable-ssespecification.html)
 */
@CdkDslMarker
public class CfnSimpleTableSSESpecificationPropertyDsl {
    private val cdkBuilder: CfnSimpleTable.SSESpecificationProperty.Builder =
        CfnSimpleTable.SSESpecificationProperty.builder()

    /** @param sseEnabled the value to be set. */
    public fun sseEnabled(sseEnabled: Boolean) {
        cdkBuilder.sseEnabled(sseEnabled)
    }

    /** @param sseEnabled the value to be set. */
    public fun sseEnabled(sseEnabled: IResolvable) {
        cdkBuilder.sseEnabled(sseEnabled)
    }

    public fun build(): CfnSimpleTable.SSESpecificationProperty = cdkBuilder.build()
}
