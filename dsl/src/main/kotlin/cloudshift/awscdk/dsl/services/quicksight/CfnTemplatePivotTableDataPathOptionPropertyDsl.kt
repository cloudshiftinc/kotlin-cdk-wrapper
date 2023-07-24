@file:Suppress("RedundantVisibilityModifier", "RedundantUnitReturnType", "RemoveRedundantQualifierName", "unused", "UnusedImport", "ClassName", "REDUNDANT_PROJECTION", "DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnTemplate
import kotlin.Any
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList

/**
 * The data path options for the pivot table field options.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.quicksight.*;
 * PivotTableDataPathOptionProperty pivotTableDataPathOptionProperty =
 * PivotTableDataPathOptionProperty.builder()
 * .dataPathList(List.of(DataPathValueProperty.builder()
 * .fieldId("fieldId")
 * .fieldValue("fieldValue")
 * .build()))
 * // the properties below are optional
 * .width("width")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-template-pivottabledatapathoption.html)
 */
@CdkDslMarker
public class CfnTemplatePivotTableDataPathOptionPropertyDsl {
    private val cdkBuilder: CfnTemplate.PivotTableDataPathOptionProperty.Builder =
        CfnTemplate.PivotTableDataPathOptionProperty.builder()

    private val _dataPathList: MutableList<Any> = mutableListOf()

    /**
     * @param dataPathList The list of data path values for the data path options.
     */
    public fun dataPathList(vararg dataPathList: Any) {
        _dataPathList.addAll(listOf(*dataPathList))
    }

    /**
     * @param dataPathList The list of data path values for the data path options.
     */
    public fun dataPathList(dataPathList: Collection<Any>) {
        _dataPathList.addAll(dataPathList)
    }

    /**
     * @param dataPathList The list of data path values for the data path options.
     */
    public fun dataPathList(dataPathList: IResolvable) {
        cdkBuilder.dataPathList(dataPathList)
    }

    /**
     * @param width The width of the data path option.
     */
    public fun width(width: String) {
        cdkBuilder.width(width)
    }

    public fun build(): CfnTemplate.PivotTableDataPathOptionProperty {
        if (_dataPathList.isNotEmpty()) cdkBuilder.dataPathList(_dataPathList)
        return cdkBuilder.build()
    }
}
