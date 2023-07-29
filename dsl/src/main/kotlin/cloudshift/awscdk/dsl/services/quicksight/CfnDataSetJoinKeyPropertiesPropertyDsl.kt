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

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnDataSet

/**
 * Properties associated with the columns participating in a join.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.quicksight.*;
 * JoinKeyPropertiesProperty joinKeyPropertiesProperty = JoinKeyPropertiesProperty.builder()
 * .uniqueKey(false)
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-dataset-joinkeyproperties.html)
 */
@CdkDslMarker
public class CfnDataSetJoinKeyPropertiesPropertyDsl {
    private val cdkBuilder: CfnDataSet.JoinKeyPropertiesProperty.Builder =
        CfnDataSet.JoinKeyPropertiesProperty.builder()

    /**
     * @param uniqueKey A value that indicates that a row in a table is uniquely identified by the
     *   columns in a join key. This is used by Amazon QuickSight to optimize query performance.
     */
    public fun uniqueKey(uniqueKey: Boolean) {
        cdkBuilder.uniqueKey(uniqueKey)
    }

    /**
     * @param uniqueKey A value that indicates that a row in a table is uniquely identified by the
     *   columns in a join key. This is used by Amazon QuickSight to optimize query performance.
     */
    public fun uniqueKey(uniqueKey: IResolvable) {
        cdkBuilder.uniqueKey(uniqueKey)
    }

    public fun build(): CfnDataSet.JoinKeyPropertiesProperty = cdkBuilder.build()
}
