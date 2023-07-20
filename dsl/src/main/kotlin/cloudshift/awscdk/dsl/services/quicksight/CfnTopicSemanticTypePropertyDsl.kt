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

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnTopic
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.Map
import kotlin.collections.MutableList

@CdkDslMarker
public class CfnTopicSemanticTypePropertyDsl {
    private val cdkBuilder: CfnTopic.SemanticTypeProperty.Builder =
        CfnTopic.SemanticTypeProperty.builder()

    private val _falseyCellValueSynonyms: MutableList<String> = mutableListOf()

    private val _truthyCellValueSynonyms: MutableList<String> = mutableListOf()

    public fun falseyCellValue(falseyCellValue: String) {
        cdkBuilder.falseyCellValue(falseyCellValue)
    }

    public fun falseyCellValueSynonyms(vararg falseyCellValueSynonyms: String) {
        _falseyCellValueSynonyms.addAll(listOf(*falseyCellValueSynonyms))
    }

    public fun falseyCellValueSynonyms(falseyCellValueSynonyms: Collection<String>) {
        _falseyCellValueSynonyms.addAll(falseyCellValueSynonyms)
    }

    public fun subTypeName(subTypeName: String) {
        cdkBuilder.subTypeName(subTypeName)
    }

    public fun truthyCellValue(truthyCellValue: String) {
        cdkBuilder.truthyCellValue(truthyCellValue)
    }

    public fun truthyCellValueSynonyms(vararg truthyCellValueSynonyms: String) {
        _truthyCellValueSynonyms.addAll(listOf(*truthyCellValueSynonyms))
    }

    public fun truthyCellValueSynonyms(truthyCellValueSynonyms: Collection<String>) {
        _truthyCellValueSynonyms.addAll(truthyCellValueSynonyms)
    }

    public fun typeName(typeName: String) {
        cdkBuilder.typeName(typeName)
    }

    public fun typeParameters(typeParameters: Map<String, String>) {
        cdkBuilder.typeParameters(typeParameters)
    }

    public fun typeParameters(typeParameters: IResolvable) {
        cdkBuilder.typeParameters(typeParameters)
    }

    public fun build(): CfnTopic.SemanticTypeProperty {
        if (_falseyCellValueSynonyms.isNotEmpty()) {
            cdkBuilder.falseyCellValueSynonyms(_falseyCellValueSynonyms)
        }
        if (_truthyCellValueSynonyms.isNotEmpty()) {
            cdkBuilder.truthyCellValueSynonyms(_truthyCellValueSynonyms)
        }
        return cdkBuilder.build()
    }
}
