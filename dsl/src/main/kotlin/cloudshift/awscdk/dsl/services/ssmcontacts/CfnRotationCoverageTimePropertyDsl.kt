@file:Suppress("RedundantVisibilityModifier", "RedundantUnitReturnType", "RemoveRedundantQualifierName", "unused", "UnusedImport", "ClassName", "REDUNDANT_PROJECTION", "DEPRECATION")

package cloudshift.awscdk.dsl.services.ssmcontacts

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.ssmcontacts.CfnRotation
import kotlin.String

/**
 * Information about when an on-call shift begins and ends.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.ssmcontacts.*;
 * CoverageTimeProperty coverageTimeProperty = CoverageTimeProperty.builder()
 * .endTime("endTime")
 * .startTime("startTime")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssmcontacts-rotation-coveragetime.html)
 */
@CdkDslMarker
public class CfnRotationCoverageTimePropertyDsl {
    private val cdkBuilder: CfnRotation.CoverageTimeProperty.Builder =
        CfnRotation.CoverageTimeProperty.builder()

    /**
     * @param endTime Information about when an on-call rotation shift ends.
     */
    public fun endTime(endTime: String) {
        cdkBuilder.endTime(endTime)
    }

    /**
     * @param startTime Information about when an on-call rotation shift begins.
     */
    public fun startTime(startTime: String) {
        cdkBuilder.startTime(startTime)
    }

    public fun build(): CfnRotation.CoverageTimeProperty = cdkBuilder.build()
}
