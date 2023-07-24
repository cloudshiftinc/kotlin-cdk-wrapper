@file:Suppress("RedundantVisibilityModifier", "RedundantUnitReturnType", "RemoveRedundantQualifierName", "unused", "UnusedImport", "ClassName", "REDUNDANT_PROJECTION", "DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.quicksight.CfnTopic
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList

/**
 * A structure that represents the cell value synonym.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.quicksight.*;
 * CellValueSynonymProperty cellValueSynonymProperty = CellValueSynonymProperty.builder()
 * .cellValue("cellValue")
 * .synonyms(List.of("synonyms"))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-topic-cellvaluesynonym.html)
 */
@CdkDslMarker
public class CfnTopicCellValueSynonymPropertyDsl {
    private val cdkBuilder: CfnTopic.CellValueSynonymProperty.Builder =
        CfnTopic.CellValueSynonymProperty.builder()

    private val _synonyms: MutableList<String> = mutableListOf()

    /**
     * @param cellValue The cell value.
     */
    public fun cellValue(cellValue: String) {
        cdkBuilder.cellValue(cellValue)
    }

    /**
     * @param synonyms Other names or aliases for the cell value.
     */
    public fun synonyms(vararg synonyms: String) {
        _synonyms.addAll(listOf(*synonyms))
    }

    /**
     * @param synonyms Other names or aliases for the cell value.
     */
    public fun synonyms(synonyms: Collection<String>) {
        _synonyms.addAll(synonyms)
    }

    public fun build(): CfnTopic.CellValueSynonymProperty {
        if (_synonyms.isNotEmpty()) cdkBuilder.synonyms(_synonyms)
        return cdkBuilder.build()
    }
}
